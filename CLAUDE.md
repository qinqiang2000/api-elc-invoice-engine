# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Development Commands

This is a Maven-based Spring Boot project targeting Java 8. Use the following commands:

```bash
# Build the project
mvn clean compile

# Run tests
mvn test

# Run specific test
mvn test -Dtest=ClassName

# Package the application
mvn clean package

# Run the application (main class: com.kingdee.fpy.ApiInvoiceXmlApplication)
mvn spring-boot:run

# Run with local profile (H2 in-memory database for testing)
SPRING_PROFILES_ACTIVE=local mvn spring-boot:run

# Run packaged application
java -jar target/api-invoice-xml-0.0.1-SNAPSHOT.jar --server.port=8081

# Run with specific profile
java -jar target/api-invoice-xml-0.0.1-SNAPSHOT.jar --spring.profiles.active=local
```

## High-Level Architecture

### Core Business Domain
This is an **Invoice XML API system** designed around a next-generation, rule-driven invoice architecture. The system focuses on:

- **XML-first approach**: Uses KDUBL (UBL-based) format as the core data standard
- **Metadata-driven XML generation**: Dynamic XML building from database metadata
- **JEXL rule engine**: Production rule execution using JEXL (Java Expression Language) 
- **AI-powered rule generation**: LLM-based automatic JEXL rule generation with validation and auto-repair
- **Invoice lifecycle management**: From invoice tasks to final invoice generation and delivery

### Key Components

#### 1. Data Layer (`src/main/java/com/kingdee/fpy/model/`)
- **Invoice entities**: `Invoice`, `InvoiceLine`, `InvoiceRequest`, `InvoiceTask`  
- **Rule management**: `InvoiceRules`, `RuleLog`, `RuleSubscription`
- **Configuration**: `InvoiceFieldConfig`, `FieldMetadata`, `ElementMetadata`
- **UBL models**: Complete UBL 2.1 invoice structure in `model/ubl/`

#### 2. Service Layer (`src/main/java/com/kingdee/fpy/service/`)
- **XmlBuildService**: Core XML generation from JSON data using element metadata
- **Rule execution**:
  - `JexlExecutionService`: Production JEXL-based rule execution with database functions
  - Note: CEL and SpEL services are experimental/testing only
- **AI rule generation** (`src/main/java/com/kingdee/fpy/ai/`):
  - `LlmRuleGenerationService`: AI-powered JEXL rule generation with validation
  - `JexlValidationService`: JEXL syntax compilation and validation
  - `OpenAiLlmClient`: LLM integration with detailed logging
- **Business services**: `InvoiceService`, `InvoiceRulesService`, etc.

#### 3. Configuration Management (`src/main/java/com/kingdee/fpy/config/`)
- **Database**: Multi-datasource configuration (read/write splitting)
- **Interceptors**: SQL printing, response handling
- **AI configuration**: LLM client settings, model configuration

#### 4. Controllers (`src/main/java/com/kingdee/fpy/controller/`)
- RESTful APIs for invoice CRUD operations
- Rule management endpoints
- AI rule generation endpoint (`/api/ai/rules/jexl/generate`)
- Expression testing endpoints (JEXL production)

### Architecture Patterns

1. **Metadata-Driven Design**: XML structure is defined in `ElementMetadata` table, enabling dynamic XML generation without code changes

2. **Rule Engine Integration**: JEXL is the production rule engine for business logic execution. Includes AI-powered rule generation with automatic validation and repair.

3. **UBL Compliance**: Full UBL 2.1 invoice model implementation for international standards compliance

4. **Multi-tenant Ready**: Tenant-aware services and data isolation

5. **AI-Assisted Development**: LLM integration for automatic JEXL rule generation with built-in syntax validation and failure recovery

## Key Technologies

- **Spring Boot 2.3.6** with Java 8
- **MyBatis** for ORM with read/write splitting
- **MySQL** with Druid connection pooling  
- **DOM4J** for XML processing
- **JEXL (Java Expression Language)** for production rule execution
- **UBL 2.1** invoice standard implementation
- **AI Integration**: OpenAI/DeepSeek for automatic rule generation
- **H2 Database** for local testing

## Database Schema

The system uses these key tables (see `src/main/resources/db/` and `src/test/resources/schema-h2.sql` for schema):
- Invoice entities: `invoice`, `invoice_line`, `invoice_request` 
- Metadata: `t_element_metadata`, `field_metadata`
- Rules: `invoice_rules`, `rule_log`, `rule_subscription`
- Configuration: `invoice_field_config`

## Development Profiles

### Default Profile (Remote MySQL)
- Uses `application.properties` with remote MySQL database
- Read/write splitting configured with Druid connection pools
- Requires database connection to jump-test.piaozone.com

### Local Profile (H2 In-Memory)
- Uses `application-local.properties` with H2 in-memory database
- Automatically creates tables and sample data
- Perfect for local development and testing without external dependencies
- Schema: `src/test/resources/schema-h2.sql`
- Sample data: `src/test/resources/data-h2.sql`

## AI Rule Generation

The system includes AI-powered JEXL rule generation capabilities:

### Configuration
- Default LLM: `gpt-5-mini` (configurable via `llm.model`)
- Alternative: DeepSeek (OpenAI-compatible)
- API Key: Set via environment variable `OPENAI_API_KEY` or `llm.api-key` property

### Key Features
- Automatic JEXL syntax validation and compilation
- Auto-repair on validation failures (configurable retries)
- Database function integration (`db` namespace for safe queries)
- Optional rule persistence to database

### API Endpoint
```
POST /api/ai/rules/jexl/generate
```

For detailed AI module documentation, see `docs/ai-rule-generation-zh.md`

## JEXL Development Best Practices

### Static Method Calling Issue & Solution

**Common Problem**: JEXL expressions fail when calling static methods like `Double.parseDouble()`.

**Root Cause**: JEXL requires Java classes to be explicitly exposed in the execution context before their static methods can be called. Without this, expressions like `Double.parseDouble("13.0")` will fail with "undefined variable" errors.

**Solution**: The `JexlExecutionService.createJexlContext()` method exposes the following classes:
```java
context.set("Double", Double.class);    // Enables Double.parseDouble()
context.set("Integer", Integer.class);  // Enables Integer.parseInt()  
context.set("Long", Long.class);        // Enables Long.parseLong()
context.set("Float", Float.class);      // Enables Float.parseFloat()
```

### Recommended Patterns

#### ✅ Correct Static Method Usage
```jexl
// Use static methods with exposed classes
Double.parseDouble(taxRate)
Integer.parseInt(count)
Math.max(a, b)
```

#### ❌ Deprecated/Problematic Patterns  
```jexl
// Don't use deprecated constructors
new java.lang.Double(taxRate)  // Works but deprecated since Java 9

// Don't use lowercase namespace (won't work)
double.parseDouble(taxRate)  // Fails - 'double' not exposed
```

#### Type-Safe Number Conversion
```jexl
// Handle both Number and String types safely
(x instanceof java.lang.Number && x.doubleValue() > 0) ||
(x instanceof java.lang.String && x.matches('\\d+(\\.\\d+)?') && Double.parseDouble(x) > 0)
```

### Database Integration
- Use `db.query(tableName, column, conditions)` for single field queries
- Always capture DB results in variables to avoid repeated queries
- Database queries return String values that may need type conversion

### Key Reminders
- All static method calls require the class to be exposed in JEXL context
- Use `Double.parseDouble()` not `double.parseDouble()`  
- Validate string format before numeric conversion to prevent `NumberFormatException`
- Constructor calls (`new ClassName()`) work without context exposure but may be deprecated

## Important Notes

- Server runs on port **8081** by default
- Database uses read/write splitting with Druid connection pools
- XML generation is metadata-driven - modify `ElementMetadata` to change XML structure
- Rule expressions use JEXL in production. CEL and SpEL implementations are experimental/testing only
- UBL compliance files are in `src/main/resources/rules/kdubl/` and schema files in `src/main/resources/schema/`
- AI rule generation supports both OpenAI and DeepSeek models
- Use local profile for development without external database dependencies