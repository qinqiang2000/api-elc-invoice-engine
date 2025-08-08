# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Development Commands

This is a Maven-based Spring Boot project targeting Java 8. Use the following commands:

```bash
# Build the project
mvn clean compile

# Run tests
mvn test

# Package the application
mvn clean package

# Run the application (main class: com.kingdee.fpy.ApiInvoiceXmlApplication)
mvn spring-boot:run

# Run with specific profile
java -jar target/api-invoice-xml-0.0.1-SNAPSHOT.jar --server.port=8081
```

## High-Level Architecture

### Core Business Domain
This is an **Invoice XML API system** designed around a next-generation, rule-driven invoice architecture. The system focuses on:

- **XML-first approach**: Uses KDUBL (UBL-based) format as the core data standard
- **Metadata-driven XML generation**: Dynamic XML building from database metadata
- **JEXL rule engine**: Production rule execution using JEXL (Java Expression Language)
- **Invoice lifecycle management**: From invoice tasks to final invoice generation and delivery

### Key Components

#### 1. Data Layer (`src/main/java/com/kingdee/fpy/model/`)
- **Invoice entities**: `Invoice`, `InvoiceLine`, `InvoiceRequest`, `InvoiceTask`  
- **Rule management**: `InvoiceRules`, `RuleLog`, `RuleSubscription`
- **Configuration**: `InvoiceFieldConfig`, `FieldMetadata`, `ElementMetadata`
- **UBL models**: Complete UBL 2.1 invoice structure in `model/ubl/`

#### 2. Service Layer (`src/main/java/com/kingdee/fpy/service/`)
- **XmlBuildService**: Core XML generation from JSON data using element metadata
- **Rule engines**:
  - `JexlExecutionService`: Production JEXL-based rule execution
  - `cel/CelValidationService`: CEL testing (experimental)
  - `cel/DataCompletionService`: Field completion testing (experimental)
- **Business services**: `InvoiceService`, `InvoiceRulesService`, etc.

#### 3. Configuration Management (`src/main/java/com/kingdee/fpy/config/`)
- **Database**: Multi-datasource configuration (read/write splitting)
- **Interceptors**: SQL printing, response handling
- **Expression parsers**: SpEL parser bean configuration

#### 4. Controllers (`src/main/java/com/kingdee/fpy/controller/`)
- RESTful APIs for invoice CRUD operations
- Rule management endpoints
- Expression testing endpoints (JEXL production, CEL/SpEL experimental)

### Architecture Patterns

1. **Metadata-Driven Design**: XML structure is defined in `ElementMetadata` table, enabling dynamic XML generation without code changes

2. **Rule Engine Integration**: JEXL is the production rule engine for business logic execution. CEL and SpEL are experimental/testing implementations.

3. **UBL Compliance**: Full UBL 2.1 invoice model implementation for international standards compliance

4. **Multi-tenant Ready**: Tenant-aware services and data isolation

## Key Technologies

- **Spring Boot 2.3.6** with Java 8
- **MyBatis** for ORM with read/write splitting
- **MySQL** with Druid connection pooling  
- **DOM4J** for XML processing
- **JEXL (Java Expression Language)** for production rule execution
- **UBL 2.1** invoice standard implementation

## Database Schema

The system uses these key tables (see `src/main/resources/db/` for schema):
- Invoice entities: `invoice`, `invoice_line`, `invoice_request` 
- Metadata: `element_metadata`, `field_metadata`
- Rules: `invoice_rules`, `rule_log`, `rule_subscription`
- Configuration: `invoice_field_config`

## Important Notes

- Server runs on port **8081** by default
- Database uses read/write splitting with Druid connection pools
- XML generation is metadata-driven - modify `ElementMetadata` to change XML structure
- Rule expressions use JEXL in production. CEL and SpEL implementations are experimental/testing only
- UBL compliance files are in `src/main/resources/rules/kdubl/` and schema files in `src/main/resources/schema/`