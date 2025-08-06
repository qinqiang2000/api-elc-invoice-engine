
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Invoice. Details
 * <p>
 * A document used to request payment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "UBLVersionID",
    "CustomizationID",
    "ProfileID",
    "ProfileExecutionID",
    "ID",
    "CopyIndicator",
    "UUID",
    "IssueDate",
    "IssueTime",
    "DueDate",
    "InvoiceTypeCode",
    "Note",
    "TaxPointDate",
    "DocumentCurrencyCode",
    "TaxCurrencyCode",
    "PricingCurrencyCode",
    "PaymentCurrencyCode",
    "PaymentAlternativeCurrencyCode",
    "AccountingCostCode",
    "AccountingCost",
    "LineCountNumeric",
    "BuyerReference",
    "InvoicePeriod",
    "OrderReference",
    "BillingReference",
    "DespatchDocumentReference",
    "ReceiptDocumentReference",
    "StatementDocumentReference",
    "OriginatorDocumentReference",
    "ContractDocumentReference",
    "AdditionalDocumentReference",
    "ProjectReference",
    "Signature",
    "AccountingSupplierParty",
    "AccountingCustomerParty",
    "PayeeParty",
    "BuyerCustomerParty",
    "SellerSupplierParty",
    "TaxRepresentativeParty",
    "Delivery",
    "DeliveryTerms",
    "PaymentMeans",
    "PaymentTerms",
    "PrepaidPayment",
    "AllowanceCharge",
    "TaxExchangeRate",
    "PricingExchangeRate",
    "PaymentExchangeRate",
    "PaymentAlternativeExchangeRate",
    "TaxTotal",
    "WithholdingTaxTotal",
    "LegalMonetaryTotal",
    "InvoiceLine"
})
@Generated("jsonschema2pojo")
public class Invoice {

    /**
     * UBLExtensions
     * <p>
     * An optional set of extensions to the committee model
     * 
     */
    @JsonProperty("UBLExtensions")
    @JsonPropertyDescription("An optional set of extensions to the committee model")
    @Size(min = 1, max = 1)
    @Valid
    private List<UBLExtensions> uBLExtensions = new ArrayList<UBLExtensions>();
    /**
     * Invoice. UBL Version Identifier. Identifier
     * <p>
     * Identifies the earliest version of the UBL 2 schema for this document type that defines all of the elements that might be encountered in the current instance.
     * 
     */
    @JsonProperty("UBLVersionID")
    @JsonPropertyDescription("Identifies the earliest version of the UBL 2 schema for this document type that defines all of the elements that might be encountered in the current instance.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uBLVersionID = new ArrayList<IdentifierType>();
    /**
     * Invoice. Customization Identifier. Identifier
     * <p>
     * Identifies a user-defined customization of UBL for a specific use.
     * 
     */
    @JsonProperty("CustomizationID")
    @JsonPropertyDescription("Identifies a user-defined customization of UBL for a specific use.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> customizationID = new ArrayList<IdentifierType>();
    /**
     * Invoice. Profile Identifier. Identifier
     * <p>
     * Identifies a user-defined profile of the customization of UBL being used.
     * 
     */
    @JsonProperty("ProfileID")
    @JsonPropertyDescription("Identifies a user-defined profile of the customization of UBL being used.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> profileID = new ArrayList<IdentifierType>();
    /**
     * Invoice. Profile Execution Identifier. Identifier
     * <p>
     * Identifies an instance of executing a profile, to associate all transactions in a collaboration.
     * 
     */
    @JsonProperty("ProfileExecutionID")
    @JsonPropertyDescription("Identifies an instance of executing a profile, to associate all transactions in a collaboration.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> profileExecutionID = new ArrayList<IdentifierType>();
    /**
     * Invoice. Identifier
     * <p>
     * An identifier for this document, assigned by the sender.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this document, assigned by the sender.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Invoice. Copy_ Indicator. Indicator
     * <p>
     * Indicates whether this document is a copy (true) or not (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    @JsonPropertyDescription("Indicates whether this document is a copy (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> copyIndicator = new ArrayList<IndicatorType>();
    /**
     * Invoice. UUID. Identifier
     * <p>
     * A universally unique identifier for an instance of this document.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for an instance of this document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Invoice. Issue Date. Date
     * <p>
     * The date, assigned by the sender, on which this document was issued.
     * (Required)
     * 
     */
    @JsonProperty("IssueDate")
    @JsonPropertyDescription("The date, assigned by the sender, on which this document was issued.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<DateType> issueDate = new ArrayList<DateType>();
    /**
     * Invoice. Issue Time. Time
     * <p>
     * The time, assigned by the sender, at which this document was issued.
     * 
     */
    @JsonProperty("IssueTime")
    @JsonPropertyDescription("The time, assigned by the sender, at which this document was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> issueTime = new ArrayList<TimeType>();
    /**
     * Invoice. Due Date. Date
     * <p>
     * The date on which Invoice is due.
     * 
     */
    @JsonProperty("DueDate")
    @JsonPropertyDescription("The date on which Invoice is due.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> dueDate = new ArrayList<DateType>();
    /**
     * Invoice. Invoice Type Code. Code
     * <p>
     * A code signifying the type of the Invoice.
     * 
     */
    @JsonProperty("InvoiceTypeCode")
    @JsonPropertyDescription("A code signifying the type of the Invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> invoiceTypeCode = new ArrayList<CodeType>();
    /**
     * Invoice. Note. Text
     * <p>
     * Free-form text pertinent to this document, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Free-form text pertinent to this document, conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> note = new ArrayList<TextType>();
    /**
     * Invoice. Tax Point Date. Date
     * <p>
     * The date of the Invoice, used to indicate the point at which tax becomes applicable.
     * 
     */
    @JsonProperty("TaxPointDate")
    @JsonPropertyDescription("The date of the Invoice, used to indicate the point at which tax becomes applicable.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> taxPointDate = new ArrayList<DateType>();
    /**
     * Invoice. Document_ Currency Code. Code
     * <p>
     * A code signifying the default currency for this document.
     * 
     */
    @JsonProperty("DocumentCurrencyCode")
    @JsonPropertyDescription("A code signifying the default currency for this document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> documentCurrencyCode = new ArrayList<CodeType>();
    /**
     * Invoice. Tax_ Currency Code. Code
     * <p>
     * A code signifying the currency used for tax amounts in the Invoice.
     * 
     */
    @JsonProperty("TaxCurrencyCode")
    @JsonPropertyDescription("A code signifying the currency used for tax amounts in the Invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> taxCurrencyCode = new ArrayList<CodeType>();
    /**
     * Invoice. Pricing_ Currency Code. Code
     * <p>
     * A code signifying the currency used for prices in the Invoice.
     * 
     */
    @JsonProperty("PricingCurrencyCode")
    @JsonPropertyDescription("A code signifying the currency used for prices in the Invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> pricingCurrencyCode = new ArrayList<CodeType>();
    /**
     * Invoice. Payment_ Currency Code. Code
     * <p>
     * A code signifying the currency used for payment in the Invoice.
     * 
     */
    @JsonProperty("PaymentCurrencyCode")
    @JsonPropertyDescription("A code signifying the currency used for payment in the Invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> paymentCurrencyCode = new ArrayList<CodeType>();
    /**
     * Invoice. Payment Alternative_ Currency Code. Code
     * <p>
     * A code signifying the alternative currency used for payment in the Invoice.
     * 
     */
    @JsonProperty("PaymentAlternativeCurrencyCode")
    @JsonPropertyDescription("A code signifying the alternative currency used for payment in the Invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> paymentAlternativeCurrencyCode = new ArrayList<CodeType>();
    /**
     * Invoice. Accounting Cost Code. Code
     * <p>
     * The buyer's accounting code, applied to the Invoice as a whole.
     * 
     */
    @JsonProperty("AccountingCostCode")
    @JsonPropertyDescription("The buyer's accounting code, applied to the Invoice as a whole.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> accountingCostCode = new ArrayList<CodeType>();
    /**
     * Invoice. Accounting Cost. Text
     * <p>
     * The buyer's accounting code, applied to the Invoice as a whole, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    @JsonPropertyDescription("The buyer's accounting code, applied to the Invoice as a whole, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> accountingCost = new ArrayList<TextType>();
    /**
     * Invoice. Line Count. Numeric
     * <p>
     * The number of lines in the document.
     * 
     */
    @JsonProperty("LineCountNumeric")
    @JsonPropertyDescription("The number of lines in the document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> lineCountNumeric = new ArrayList<NumericType>();
    /**
     * Invoice. Buyer_ Reference. Text
     * <p>
     * A reference provided by the buyer used for internal routing of the document.
     * 
     */
    @JsonProperty("BuyerReference")
    @JsonPropertyDescription("A reference provided by the buyer used for internal routing of the document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> buyerReference = new ArrayList<TextType>();
    /**
     * Invoice. Invoice_ Period. Period
     * <p>
     * A period to which the Invoice applies.
     * 
     */
    @JsonProperty("InvoicePeriod")
    @JsonPropertyDescription("A period to which the Invoice applies.")
    @Size(min = 1)
    @Valid
    private List<Period> invoicePeriod = new ArrayList<Period>();
    /**
     * Invoice. Order Reference
     * <p>
     * A reference to the Order with which this Invoice is associated.
     * 
     */
    @JsonProperty("OrderReference")
    @JsonPropertyDescription("A reference to the Order with which this Invoice is associated.")
    @Size(min = 1, max = 1)
    @Valid
    private List<OrderReference> orderReference = new ArrayList<OrderReference>();
    /**
     * Invoice. Billing Reference
     * <p>
     * A reference to a billing document associated with this document.
     * 
     */
    @JsonProperty("BillingReference")
    @JsonPropertyDescription("A reference to a billing document associated with this document.")
    @Size(min = 1)
    @Valid
    private List<BillingReference> billingReference = new ArrayList<BillingReference>();
    /**
     * Invoice. Despatch_ Document Reference. Document Reference
     * <p>
     * A reference to a Despatch Advice associated with this document.
     * 
     */
    @JsonProperty("DespatchDocumentReference")
    @JsonPropertyDescription("A reference to a Despatch Advice associated with this document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> despatchDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice. Receipt_ Document Reference. Document Reference
     * <p>
     * A reference to a Receipt Advice associated with this document.
     * 
     */
    @JsonProperty("ReceiptDocumentReference")
    @JsonPropertyDescription("A reference to a Receipt Advice associated with this document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> receiptDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice. Statement_ Document Reference. Document Reference
     * <p>
     * A reference to a Statement associated with this document.
     * 
     */
    @JsonProperty("StatementDocumentReference")
    @JsonPropertyDescription("A reference to a Statement associated with this document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> statementDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice. Originator_ Document Reference. Document Reference
     * <p>
     * A reference to an originator document associated with this document.
     * 
     */
    @JsonProperty("OriginatorDocumentReference")
    @JsonPropertyDescription("A reference to an originator document associated with this document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> originatorDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract associated with this document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    @JsonPropertyDescription("A reference to a contract associated with this document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> contractDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice. Additional_ Document Reference. Document Reference
     * <p>
     * A reference to an additional document associated with this document.
     * 
     */
    @JsonProperty("AdditionalDocumentReference")
    @JsonPropertyDescription("A reference to an additional document associated with this document.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> additionalDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice. Project Reference
     * <p>
     * Information about a project.
     * 
     */
    @JsonProperty("ProjectReference")
    @JsonPropertyDescription("Information about a project.")
    @Size(min = 1)
    @Valid
    private List<ProjectReference> projectReference = new ArrayList<ProjectReference>();
    /**
     * Invoice. Signature
     * <p>
     * A signature applied to this document.
     * 
     */
    @JsonProperty("Signature")
    @JsonPropertyDescription("A signature applied to this document.")
    @Size(min = 1)
    @Valid
    private List<Signature> signature = new ArrayList<Signature>();
    /**
     * Invoice. Accounting_ Supplier Party. Supplier Party
     * <p>
     * The accounting supplier party.
     * (Required)
     * 
     */
    @JsonProperty("AccountingSupplierParty")
    @JsonPropertyDescription("The accounting supplier party.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<SupplierParty> accountingSupplierParty = new ArrayList<SupplierParty>();
    /**
     * Invoice. Accounting_ Customer Party. Customer Party
     * <p>
     * The accounting customer party.
     * (Required)
     * 
     */
    @JsonProperty("AccountingCustomerParty")
    @JsonPropertyDescription("The accounting customer party.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CustomerParty> accountingCustomerParty = new ArrayList<CustomerParty>();
    /**
     * Invoice. Payee_ Party. Party
     * <p>
     * The payee.
     * 
     */
    @JsonProperty("PayeeParty")
    @JsonPropertyDescription("The payee.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> payeeParty = new ArrayList<Party>();
    /**
     * Invoice. Buyer_ Customer Party. Customer Party
     * <p>
     * The buyer.
     * 
     */
    @JsonProperty("BuyerCustomerParty")
    @JsonPropertyDescription("The buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CustomerParty> buyerCustomerParty = new ArrayList<CustomerParty>();
    /**
     * Invoice. Seller_ Supplier Party. Supplier Party
     * <p>
     * The seller.
     * 
     */
    @JsonProperty("SellerSupplierParty")
    @JsonPropertyDescription("The seller.")
    @Size(min = 1, max = 1)
    @Valid
    private List<SupplierParty> sellerSupplierParty = new ArrayList<SupplierParty>();
    /**
     * Invoice. Tax Representative_ Party. Party
     * <p>
     * The tax representative.
     * 
     */
    @JsonProperty("TaxRepresentativeParty")
    @JsonPropertyDescription("The tax representative.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> taxRepresentativeParty = new ArrayList<Party>();
    /**
     * Invoice. Delivery
     * <p>
     * A delivery associated with this document.
     * 
     */
    @JsonProperty("Delivery")
    @JsonPropertyDescription("A delivery associated with this document.")
    @Size(min = 1)
    @Valid
    private List<Delivery> delivery = new ArrayList<Delivery>();
    /**
     * Invoice. Delivery Terms
     * <p>
     * A set of delivery terms associated with this document.
     * 
     */
    @JsonProperty("DeliveryTerms")
    @JsonPropertyDescription("A set of delivery terms associated with this document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DeliveryTerms> deliveryTerms = new ArrayList<DeliveryTerms>();
    /**
     * Invoice. Payment Means
     * <p>
     * Expected means of payment.
     * 
     */
    @JsonProperty("PaymentMeans")
    @JsonPropertyDescription("Expected means of payment.")
    @Size(min = 1)
    @Valid
    private List<PaymentMeans> paymentMeans = new ArrayList<PaymentMeans>();
    /**
     * Invoice. Payment Terms
     * <p>
     * A set of payment terms associated with this document.
     * 
     */
    @JsonProperty("PaymentTerms")
    @JsonPropertyDescription("A set of payment terms associated with this document.")
    @Size(min = 1)
    @Valid
    private List<PaymentTerms> paymentTerms = new ArrayList<PaymentTerms>();
    /**
     * Invoice. Prepaid_ Payment. Payment
     * <p>
     * A prepaid payment.
     * 
     */
    @JsonProperty("PrepaidPayment")
    @JsonPropertyDescription("A prepaid payment.")
    @Size(min = 1)
    @Valid
    private List<Payment> prepaidPayment = new ArrayList<Payment>();
    /**
     * Invoice. Allowance Charge
     * <p>
     * A discount or charge that applies to a price component.
     * 
     */
    @JsonProperty("AllowanceCharge")
    @JsonPropertyDescription("A discount or charge that applies to a price component.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> allowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Invoice. Tax_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the tax currency.
     * 
     */
    @JsonProperty("TaxExchangeRate")
    @JsonPropertyDescription("The exchange rate between the document currency and the tax currency.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExchangeRate> taxExchangeRate = new ArrayList<ExchangeRate>();
    /**
     * Invoice. Pricing_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the pricing currency.
     * 
     */
    @JsonProperty("PricingExchangeRate")
    @JsonPropertyDescription("The exchange rate between the document currency and the pricing currency.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExchangeRate> pricingExchangeRate = new ArrayList<ExchangeRate>();
    /**
     * Invoice. Payment_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the payment currency.
     * 
     */
    @JsonProperty("PaymentExchangeRate")
    @JsonPropertyDescription("The exchange rate between the document currency and the payment currency.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExchangeRate> paymentExchangeRate = new ArrayList<ExchangeRate>();
    /**
     * Invoice. Payment Alternative_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the payment alternative currency.
     * 
     */
    @JsonProperty("PaymentAlternativeExchangeRate")
    @JsonPropertyDescription("The exchange rate between the document currency and the payment alternative currency.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExchangeRate> paymentAlternativeExchangeRate = new ArrayList<ExchangeRate>();
    /**
     * Invoice. Tax Total
     * <p>
     * The total amount of a specific type of tax.
     * 
     */
    @JsonProperty("TaxTotal")
    @JsonPropertyDescription("The total amount of a specific type of tax.")
    @Size(min = 1)
    @Valid
    private List<TaxTotal> taxTotal = new ArrayList<TaxTotal>();
    /**
     * Invoice. Withholding_ Tax Total. Tax Total
     * <p>
     * The total withholding tax.
     * 
     */
    @JsonProperty("WithholdingTaxTotal")
    @JsonPropertyDescription("The total withholding tax.")
    @Size(min = 1)
    @Valid
    private List<TaxTotal> withholdingTaxTotal = new ArrayList<TaxTotal>();
    /**
     * Invoice. Legal_ Monetary Total. Monetary Total
     * <p>
     * The total amount payable on the Invoice, including Allowances, Charges, and Taxes.
     * (Required)
     * 
     */
    @JsonProperty("LegalMonetaryTotal")
    @JsonPropertyDescription("The total amount payable on the Invoice, including Allowances, Charges, and Taxes.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<MonetaryTotal> legalMonetaryTotal = new ArrayList<MonetaryTotal>();
    /**
     * Invoice. Invoice Line
     * <p>
     * A line describing an invoice item.
     * (Required)
     * 
     */
    @JsonProperty("InvoiceLine")
    @JsonPropertyDescription("A line describing an invoice item.")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<InvoiceLine> invoiceLine = new ArrayList<InvoiceLine>();

    /**
     * UBLExtensions
     * <p>
     * An optional set of extensions to the committee model
     * 
     */
    @JsonProperty("UBLExtensions")
    public List<UBLExtensions> getUBLExtensions() {
        return uBLExtensions;
    }

    /**
     * UBLExtensions
     * <p>
     * An optional set of extensions to the committee model
     * 
     */
    @JsonProperty("UBLExtensions")
    public void setUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
    }

    public Invoice withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Invoice. UBL Version Identifier. Identifier
     * <p>
     * Identifies the earliest version of the UBL 2 schema for this document type that defines all of the elements that might be encountered in the current instance.
     * 
     */
    @JsonProperty("UBLVersionID")
    public List<IdentifierType> getUBLVersionID() {
        return uBLVersionID;
    }

    /**
     * Invoice. UBL Version Identifier. Identifier
     * <p>
     * Identifies the earliest version of the UBL 2 schema for this document type that defines all of the elements that might be encountered in the current instance.
     * 
     */
    @JsonProperty("UBLVersionID")
    public void setUBLVersionID(List<IdentifierType> uBLVersionID) {
        this.uBLVersionID = uBLVersionID;
    }

    public Invoice withUBLVersionID(List<IdentifierType> uBLVersionID) {
        this.uBLVersionID = uBLVersionID;
        return this;
    }

    /**
     * Invoice. Customization Identifier. Identifier
     * <p>
     * Identifies a user-defined customization of UBL for a specific use.
     * 
     */
    @JsonProperty("CustomizationID")
    public List<IdentifierType> getCustomizationID() {
        return customizationID;
    }

    /**
     * Invoice. Customization Identifier. Identifier
     * <p>
     * Identifies a user-defined customization of UBL for a specific use.
     * 
     */
    @JsonProperty("CustomizationID")
    public void setCustomizationID(List<IdentifierType> customizationID) {
        this.customizationID = customizationID;
    }

    public Invoice withCustomizationID(List<IdentifierType> customizationID) {
        this.customizationID = customizationID;
        return this;
    }

    /**
     * Invoice. Profile Identifier. Identifier
     * <p>
     * Identifies a user-defined profile of the customization of UBL being used.
     * 
     */
    @JsonProperty("ProfileID")
    public List<IdentifierType> getProfileID() {
        return profileID;
    }

    /**
     * Invoice. Profile Identifier. Identifier
     * <p>
     * Identifies a user-defined profile of the customization of UBL being used.
     * 
     */
    @JsonProperty("ProfileID")
    public void setProfileID(List<IdentifierType> profileID) {
        this.profileID = profileID;
    }

    public Invoice withProfileID(List<IdentifierType> profileID) {
        this.profileID = profileID;
        return this;
    }

    /**
     * Invoice. Profile Execution Identifier. Identifier
     * <p>
     * Identifies an instance of executing a profile, to associate all transactions in a collaboration.
     * 
     */
    @JsonProperty("ProfileExecutionID")
    public List<IdentifierType> getProfileExecutionID() {
        return profileExecutionID;
    }

    /**
     * Invoice. Profile Execution Identifier. Identifier
     * <p>
     * Identifies an instance of executing a profile, to associate all transactions in a collaboration.
     * 
     */
    @JsonProperty("ProfileExecutionID")
    public void setProfileExecutionID(List<IdentifierType> profileExecutionID) {
        this.profileExecutionID = profileExecutionID;
    }

    public Invoice withProfileExecutionID(List<IdentifierType> profileExecutionID) {
        this.profileExecutionID = profileExecutionID;
        return this;
    }

    /**
     * Invoice. Identifier
     * <p>
     * An identifier for this document, assigned by the sender.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Invoice. Identifier
     * <p>
     * An identifier for this document, assigned by the sender.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Invoice withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Invoice. Copy_ Indicator. Indicator
     * <p>
     * Indicates whether this document is a copy (true) or not (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    public List<IndicatorType> getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Invoice. Copy_ Indicator. Indicator
     * <p>
     * Indicates whether this document is a copy (true) or not (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    public void setCopyIndicator(List<IndicatorType> copyIndicator) {
        this.copyIndicator = copyIndicator;
    }

    public Invoice withCopyIndicator(List<IndicatorType> copyIndicator) {
        this.copyIndicator = copyIndicator;
        return this;
    }

    /**
     * Invoice. UUID. Identifier
     * <p>
     * A universally unique identifier for an instance of this document.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Invoice. UUID. Identifier
     * <p>
     * A universally unique identifier for an instance of this document.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public Invoice withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Invoice. Issue Date. Date
     * <p>
     * The date, assigned by the sender, on which this document was issued.
     * (Required)
     * 
     */
    @JsonProperty("IssueDate")
    public List<DateType> getIssueDate() {
        return issueDate;
    }

    /**
     * Invoice. Issue Date. Date
     * <p>
     * The date, assigned by the sender, on which this document was issued.
     * (Required)
     * 
     */
    @JsonProperty("IssueDate")
    public void setIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
    }

    public Invoice withIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Invoice. Issue Time. Time
     * <p>
     * The time, assigned by the sender, at which this document was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public List<TimeType> getIssueTime() {
        return issueTime;
    }

    /**
     * Invoice. Issue Time. Time
     * <p>
     * The time, assigned by the sender, at which this document was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public void setIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
    }

    public Invoice withIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    /**
     * Invoice. Due Date. Date
     * <p>
     * The date on which Invoice is due.
     * 
     */
    @JsonProperty("DueDate")
    public List<DateType> getDueDate() {
        return dueDate;
    }

    /**
     * Invoice. Due Date. Date
     * <p>
     * The date on which Invoice is due.
     * 
     */
    @JsonProperty("DueDate")
    public void setDueDate(List<DateType> dueDate) {
        this.dueDate = dueDate;
    }

    public Invoice withDueDate(List<DateType> dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Invoice. Invoice Type Code. Code
     * <p>
     * A code signifying the type of the Invoice.
     * 
     */
    @JsonProperty("InvoiceTypeCode")
    public List<CodeType> getInvoiceTypeCode() {
        return invoiceTypeCode;
    }

    /**
     * Invoice. Invoice Type Code. Code
     * <p>
     * A code signifying the type of the Invoice.
     * 
     */
    @JsonProperty("InvoiceTypeCode")
    public void setInvoiceTypeCode(List<CodeType> invoiceTypeCode) {
        this.invoiceTypeCode = invoiceTypeCode;
    }

    public Invoice withInvoiceTypeCode(List<CodeType> invoiceTypeCode) {
        this.invoiceTypeCode = invoiceTypeCode;
        return this;
    }

    /**
     * Invoice. Note. Text
     * <p>
     * Free-form text pertinent to this document, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Invoice. Note. Text
     * <p>
     * Free-form text pertinent to this document, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public Invoice withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Invoice. Tax Point Date. Date
     * <p>
     * The date of the Invoice, used to indicate the point at which tax becomes applicable.
     * 
     */
    @JsonProperty("TaxPointDate")
    public List<DateType> getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Invoice. Tax Point Date. Date
     * <p>
     * The date of the Invoice, used to indicate the point at which tax becomes applicable.
     * 
     */
    @JsonProperty("TaxPointDate")
    public void setTaxPointDate(List<DateType> taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public Invoice withTaxPointDate(List<DateType> taxPointDate) {
        this.taxPointDate = taxPointDate;
        return this;
    }

    /**
     * Invoice. Document_ Currency Code. Code
     * <p>
     * A code signifying the default currency for this document.
     * 
     */
    @JsonProperty("DocumentCurrencyCode")
    public List<CodeType> getDocumentCurrencyCode() {
        return documentCurrencyCode;
    }

    /**
     * Invoice. Document_ Currency Code. Code
     * <p>
     * A code signifying the default currency for this document.
     * 
     */
    @JsonProperty("DocumentCurrencyCode")
    public void setDocumentCurrencyCode(List<CodeType> documentCurrencyCode) {
        this.documentCurrencyCode = documentCurrencyCode;
    }

    public Invoice withDocumentCurrencyCode(List<CodeType> documentCurrencyCode) {
        this.documentCurrencyCode = documentCurrencyCode;
        return this;
    }

    /**
     * Invoice. Tax_ Currency Code. Code
     * <p>
     * A code signifying the currency used for tax amounts in the Invoice.
     * 
     */
    @JsonProperty("TaxCurrencyCode")
    public List<CodeType> getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Invoice. Tax_ Currency Code. Code
     * <p>
     * A code signifying the currency used for tax amounts in the Invoice.
     * 
     */
    @JsonProperty("TaxCurrencyCode")
    public void setTaxCurrencyCode(List<CodeType> taxCurrencyCode) {
        this.taxCurrencyCode = taxCurrencyCode;
    }

    public Invoice withTaxCurrencyCode(List<CodeType> taxCurrencyCode) {
        this.taxCurrencyCode = taxCurrencyCode;
        return this;
    }

    /**
     * Invoice. Pricing_ Currency Code. Code
     * <p>
     * A code signifying the currency used for prices in the Invoice.
     * 
     */
    @JsonProperty("PricingCurrencyCode")
    public List<CodeType> getPricingCurrencyCode() {
        return pricingCurrencyCode;
    }

    /**
     * Invoice. Pricing_ Currency Code. Code
     * <p>
     * A code signifying the currency used for prices in the Invoice.
     * 
     */
    @JsonProperty("PricingCurrencyCode")
    public void setPricingCurrencyCode(List<CodeType> pricingCurrencyCode) {
        this.pricingCurrencyCode = pricingCurrencyCode;
    }

    public Invoice withPricingCurrencyCode(List<CodeType> pricingCurrencyCode) {
        this.pricingCurrencyCode = pricingCurrencyCode;
        return this;
    }

    /**
     * Invoice. Payment_ Currency Code. Code
     * <p>
     * A code signifying the currency used for payment in the Invoice.
     * 
     */
    @JsonProperty("PaymentCurrencyCode")
    public List<CodeType> getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /**
     * Invoice. Payment_ Currency Code. Code
     * <p>
     * A code signifying the currency used for payment in the Invoice.
     * 
     */
    @JsonProperty("PaymentCurrencyCode")
    public void setPaymentCurrencyCode(List<CodeType> paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
    }

    public Invoice withPaymentCurrencyCode(List<CodeType> paymentCurrencyCode) {
        this.paymentCurrencyCode = paymentCurrencyCode;
        return this;
    }

    /**
     * Invoice. Payment Alternative_ Currency Code. Code
     * <p>
     * A code signifying the alternative currency used for payment in the Invoice.
     * 
     */
    @JsonProperty("PaymentAlternativeCurrencyCode")
    public List<CodeType> getPaymentAlternativeCurrencyCode() {
        return paymentAlternativeCurrencyCode;
    }

    /**
     * Invoice. Payment Alternative_ Currency Code. Code
     * <p>
     * A code signifying the alternative currency used for payment in the Invoice.
     * 
     */
    @JsonProperty("PaymentAlternativeCurrencyCode")
    public void setPaymentAlternativeCurrencyCode(List<CodeType> paymentAlternativeCurrencyCode) {
        this.paymentAlternativeCurrencyCode = paymentAlternativeCurrencyCode;
    }

    public Invoice withPaymentAlternativeCurrencyCode(List<CodeType> paymentAlternativeCurrencyCode) {
        this.paymentAlternativeCurrencyCode = paymentAlternativeCurrencyCode;
        return this;
    }

    /**
     * Invoice. Accounting Cost Code. Code
     * <p>
     * The buyer's accounting code, applied to the Invoice as a whole.
     * 
     */
    @JsonProperty("AccountingCostCode")
    public List<CodeType> getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Invoice. Accounting Cost Code. Code
     * <p>
     * The buyer's accounting code, applied to the Invoice as a whole.
     * 
     */
    @JsonProperty("AccountingCostCode")
    public void setAccountingCostCode(List<CodeType> accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
    }

    public Invoice withAccountingCostCode(List<CodeType> accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
        return this;
    }

    /**
     * Invoice. Accounting Cost. Text
     * <p>
     * The buyer's accounting code, applied to the Invoice as a whole, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    public List<TextType> getAccountingCost() {
        return accountingCost;
    }

    /**
     * Invoice. Accounting Cost. Text
     * <p>
     * The buyer's accounting code, applied to the Invoice as a whole, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    public void setAccountingCost(List<TextType> accountingCost) {
        this.accountingCost = accountingCost;
    }

    public Invoice withAccountingCost(List<TextType> accountingCost) {
        this.accountingCost = accountingCost;
        return this;
    }

    /**
     * Invoice. Line Count. Numeric
     * <p>
     * The number of lines in the document.
     * 
     */
    @JsonProperty("LineCountNumeric")
    public List<NumericType> getLineCountNumeric() {
        return lineCountNumeric;
    }

    /**
     * Invoice. Line Count. Numeric
     * <p>
     * The number of lines in the document.
     * 
     */
    @JsonProperty("LineCountNumeric")
    public void setLineCountNumeric(List<NumericType> lineCountNumeric) {
        this.lineCountNumeric = lineCountNumeric;
    }

    public Invoice withLineCountNumeric(List<NumericType> lineCountNumeric) {
        this.lineCountNumeric = lineCountNumeric;
        return this;
    }

    /**
     * Invoice. Buyer_ Reference. Text
     * <p>
     * A reference provided by the buyer used for internal routing of the document.
     * 
     */
    @JsonProperty("BuyerReference")
    public List<TextType> getBuyerReference() {
        return buyerReference;
    }

    /**
     * Invoice. Buyer_ Reference. Text
     * <p>
     * A reference provided by the buyer used for internal routing of the document.
     * 
     */
    @JsonProperty("BuyerReference")
    public void setBuyerReference(List<TextType> buyerReference) {
        this.buyerReference = buyerReference;
    }

    public Invoice withBuyerReference(List<TextType> buyerReference) {
        this.buyerReference = buyerReference;
        return this;
    }

    /**
     * Invoice. Invoice_ Period. Period
     * <p>
     * A period to which the Invoice applies.
     * 
     */
    @JsonProperty("InvoicePeriod")
    public List<Period> getInvoicePeriod() {
        return invoicePeriod;
    }

    /**
     * Invoice. Invoice_ Period. Period
     * <p>
     * A period to which the Invoice applies.
     * 
     */
    @JsonProperty("InvoicePeriod")
    public void setInvoicePeriod(List<Period> invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
    }

    public Invoice withInvoicePeriod(List<Period> invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
        return this;
    }

    /**
     * Invoice. Order Reference
     * <p>
     * A reference to the Order with which this Invoice is associated.
     * 
     */
    @JsonProperty("OrderReference")
    public List<OrderReference> getOrderReference() {
        return orderReference;
    }

    /**
     * Invoice. Order Reference
     * <p>
     * A reference to the Order with which this Invoice is associated.
     * 
     */
    @JsonProperty("OrderReference")
    public void setOrderReference(List<OrderReference> orderReference) {
        this.orderReference = orderReference;
    }

    public Invoice withOrderReference(List<OrderReference> orderReference) {
        this.orderReference = orderReference;
        return this;
    }

    /**
     * Invoice. Billing Reference
     * <p>
     * A reference to a billing document associated with this document.
     * 
     */
    @JsonProperty("BillingReference")
    public List<BillingReference> getBillingReference() {
        return billingReference;
    }

    /**
     * Invoice. Billing Reference
     * <p>
     * A reference to a billing document associated with this document.
     * 
     */
    @JsonProperty("BillingReference")
    public void setBillingReference(List<BillingReference> billingReference) {
        this.billingReference = billingReference;
    }

    public Invoice withBillingReference(List<BillingReference> billingReference) {
        this.billingReference = billingReference;
        return this;
    }

    /**
     * Invoice. Despatch_ Document Reference. Document Reference
     * <p>
     * A reference to a Despatch Advice associated with this document.
     * 
     */
    @JsonProperty("DespatchDocumentReference")
    public List<DocumentReference> getDespatchDocumentReference() {
        return despatchDocumentReference;
    }

    /**
     * Invoice. Despatch_ Document Reference. Document Reference
     * <p>
     * A reference to a Despatch Advice associated with this document.
     * 
     */
    @JsonProperty("DespatchDocumentReference")
    public void setDespatchDocumentReference(List<DocumentReference> despatchDocumentReference) {
        this.despatchDocumentReference = despatchDocumentReference;
    }

    public Invoice withDespatchDocumentReference(List<DocumentReference> despatchDocumentReference) {
        this.despatchDocumentReference = despatchDocumentReference;
        return this;
    }

    /**
     * Invoice. Receipt_ Document Reference. Document Reference
     * <p>
     * A reference to a Receipt Advice associated with this document.
     * 
     */
    @JsonProperty("ReceiptDocumentReference")
    public List<DocumentReference> getReceiptDocumentReference() {
        return receiptDocumentReference;
    }

    /**
     * Invoice. Receipt_ Document Reference. Document Reference
     * <p>
     * A reference to a Receipt Advice associated with this document.
     * 
     */
    @JsonProperty("ReceiptDocumentReference")
    public void setReceiptDocumentReference(List<DocumentReference> receiptDocumentReference) {
        this.receiptDocumentReference = receiptDocumentReference;
    }

    public Invoice withReceiptDocumentReference(List<DocumentReference> receiptDocumentReference) {
        this.receiptDocumentReference = receiptDocumentReference;
        return this;
    }

    /**
     * Invoice. Statement_ Document Reference. Document Reference
     * <p>
     * A reference to a Statement associated with this document.
     * 
     */
    @JsonProperty("StatementDocumentReference")
    public List<DocumentReference> getStatementDocumentReference() {
        return statementDocumentReference;
    }

    /**
     * Invoice. Statement_ Document Reference. Document Reference
     * <p>
     * A reference to a Statement associated with this document.
     * 
     */
    @JsonProperty("StatementDocumentReference")
    public void setStatementDocumentReference(List<DocumentReference> statementDocumentReference) {
        this.statementDocumentReference = statementDocumentReference;
    }

    public Invoice withStatementDocumentReference(List<DocumentReference> statementDocumentReference) {
        this.statementDocumentReference = statementDocumentReference;
        return this;
    }

    /**
     * Invoice. Originator_ Document Reference. Document Reference
     * <p>
     * A reference to an originator document associated with this document.
     * 
     */
    @JsonProperty("OriginatorDocumentReference")
    public List<DocumentReference> getOriginatorDocumentReference() {
        return originatorDocumentReference;
    }

    /**
     * Invoice. Originator_ Document Reference. Document Reference
     * <p>
     * A reference to an originator document associated with this document.
     * 
     */
    @JsonProperty("OriginatorDocumentReference")
    public void setOriginatorDocumentReference(List<DocumentReference> originatorDocumentReference) {
        this.originatorDocumentReference = originatorDocumentReference;
    }

    public Invoice withOriginatorDocumentReference(List<DocumentReference> originatorDocumentReference) {
        this.originatorDocumentReference = originatorDocumentReference;
        return this;
    }

    /**
     * Invoice. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract associated with this document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    public List<DocumentReference> getContractDocumentReference() {
        return contractDocumentReference;
    }

    /**
     * Invoice. Contract_ Document Reference. Document Reference
     * <p>
     * A reference to a contract associated with this document.
     * 
     */
    @JsonProperty("ContractDocumentReference")
    public void setContractDocumentReference(List<DocumentReference> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
    }

    public Invoice withContractDocumentReference(List<DocumentReference> contractDocumentReference) {
        this.contractDocumentReference = contractDocumentReference;
        return this;
    }

    /**
     * Invoice. Additional_ Document Reference. Document Reference
     * <p>
     * A reference to an additional document associated with this document.
     * 
     */
    @JsonProperty("AdditionalDocumentReference")
    public List<DocumentReference> getAdditionalDocumentReference() {
        return additionalDocumentReference;
    }

    /**
     * Invoice. Additional_ Document Reference. Document Reference
     * <p>
     * A reference to an additional document associated with this document.
     * 
     */
    @JsonProperty("AdditionalDocumentReference")
    public void setAdditionalDocumentReference(List<DocumentReference> additionalDocumentReference) {
        this.additionalDocumentReference = additionalDocumentReference;
    }

    public Invoice withAdditionalDocumentReference(List<DocumentReference> additionalDocumentReference) {
        this.additionalDocumentReference = additionalDocumentReference;
        return this;
    }

    /**
     * Invoice. Project Reference
     * <p>
     * Information about a project.
     * 
     */
    @JsonProperty("ProjectReference")
    public List<ProjectReference> getProjectReference() {
        return projectReference;
    }

    /**
     * Invoice. Project Reference
     * <p>
     * Information about a project.
     * 
     */
    @JsonProperty("ProjectReference")
    public void setProjectReference(List<ProjectReference> projectReference) {
        this.projectReference = projectReference;
    }

    public Invoice withProjectReference(List<ProjectReference> projectReference) {
        this.projectReference = projectReference;
        return this;
    }

    /**
     * Invoice. Signature
     * <p>
     * A signature applied to this document.
     * 
     */
    @JsonProperty("Signature")
    public List<Signature> getSignature() {
        return signature;
    }

    /**
     * Invoice. Signature
     * <p>
     * A signature applied to this document.
     * 
     */
    @JsonProperty("Signature")
    public void setSignature(List<Signature> signature) {
        this.signature = signature;
    }

    public Invoice withSignature(List<Signature> signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Invoice. Accounting_ Supplier Party. Supplier Party
     * <p>
     * The accounting supplier party.
     * (Required)
     * 
     */
    @JsonProperty("AccountingSupplierParty")
    public List<SupplierParty> getAccountingSupplierParty() {
        return accountingSupplierParty;
    }

    /**
     * Invoice. Accounting_ Supplier Party. Supplier Party
     * <p>
     * The accounting supplier party.
     * (Required)
     * 
     */
    @JsonProperty("AccountingSupplierParty")
    public void setAccountingSupplierParty(List<SupplierParty> accountingSupplierParty) {
        this.accountingSupplierParty = accountingSupplierParty;
    }

    public Invoice withAccountingSupplierParty(List<SupplierParty> accountingSupplierParty) {
        this.accountingSupplierParty = accountingSupplierParty;
        return this;
    }

    /**
     * Invoice. Accounting_ Customer Party. Customer Party
     * <p>
     * The accounting customer party.
     * (Required)
     * 
     */
    @JsonProperty("AccountingCustomerParty")
    public List<CustomerParty> getAccountingCustomerParty() {
        return accountingCustomerParty;
    }

    /**
     * Invoice. Accounting_ Customer Party. Customer Party
     * <p>
     * The accounting customer party.
     * (Required)
     * 
     */
    @JsonProperty("AccountingCustomerParty")
    public void setAccountingCustomerParty(List<CustomerParty> accountingCustomerParty) {
        this.accountingCustomerParty = accountingCustomerParty;
    }

    public Invoice withAccountingCustomerParty(List<CustomerParty> accountingCustomerParty) {
        this.accountingCustomerParty = accountingCustomerParty;
        return this;
    }

    /**
     * Invoice. Payee_ Party. Party
     * <p>
     * The payee.
     * 
     */
    @JsonProperty("PayeeParty")
    public List<Party> getPayeeParty() {
        return payeeParty;
    }

    /**
     * Invoice. Payee_ Party. Party
     * <p>
     * The payee.
     * 
     */
    @JsonProperty("PayeeParty")
    public void setPayeeParty(List<Party> payeeParty) {
        this.payeeParty = payeeParty;
    }

    public Invoice withPayeeParty(List<Party> payeeParty) {
        this.payeeParty = payeeParty;
        return this;
    }

    /**
     * Invoice. Buyer_ Customer Party. Customer Party
     * <p>
     * The buyer.
     * 
     */
    @JsonProperty("BuyerCustomerParty")
    public List<CustomerParty> getBuyerCustomerParty() {
        return buyerCustomerParty;
    }

    /**
     * Invoice. Buyer_ Customer Party. Customer Party
     * <p>
     * The buyer.
     * 
     */
    @JsonProperty("BuyerCustomerParty")
    public void setBuyerCustomerParty(List<CustomerParty> buyerCustomerParty) {
        this.buyerCustomerParty = buyerCustomerParty;
    }

    public Invoice withBuyerCustomerParty(List<CustomerParty> buyerCustomerParty) {
        this.buyerCustomerParty = buyerCustomerParty;
        return this;
    }

    /**
     * Invoice. Seller_ Supplier Party. Supplier Party
     * <p>
     * The seller.
     * 
     */
    @JsonProperty("SellerSupplierParty")
    public List<SupplierParty> getSellerSupplierParty() {
        return sellerSupplierParty;
    }

    /**
     * Invoice. Seller_ Supplier Party. Supplier Party
     * <p>
     * The seller.
     * 
     */
    @JsonProperty("SellerSupplierParty")
    public void setSellerSupplierParty(List<SupplierParty> sellerSupplierParty) {
        this.sellerSupplierParty = sellerSupplierParty;
    }

    public Invoice withSellerSupplierParty(List<SupplierParty> sellerSupplierParty) {
        this.sellerSupplierParty = sellerSupplierParty;
        return this;
    }

    /**
     * Invoice. Tax Representative_ Party. Party
     * <p>
     * The tax representative.
     * 
     */
    @JsonProperty("TaxRepresentativeParty")
    public List<Party> getTaxRepresentativeParty() {
        return taxRepresentativeParty;
    }

    /**
     * Invoice. Tax Representative_ Party. Party
     * <p>
     * The tax representative.
     * 
     */
    @JsonProperty("TaxRepresentativeParty")
    public void setTaxRepresentativeParty(List<Party> taxRepresentativeParty) {
        this.taxRepresentativeParty = taxRepresentativeParty;
    }

    public Invoice withTaxRepresentativeParty(List<Party> taxRepresentativeParty) {
        this.taxRepresentativeParty = taxRepresentativeParty;
        return this;
    }

    /**
     * Invoice. Delivery
     * <p>
     * A delivery associated with this document.
     * 
     */
    @JsonProperty("Delivery")
    public List<Delivery> getDelivery() {
        return delivery;
    }

    /**
     * Invoice. Delivery
     * <p>
     * A delivery associated with this document.
     * 
     */
    @JsonProperty("Delivery")
    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public Invoice withDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Invoice. Delivery Terms
     * <p>
     * A set of delivery terms associated with this document.
     * 
     */
    @JsonProperty("DeliveryTerms")
    public List<DeliveryTerms> getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Invoice. Delivery Terms
     * <p>
     * A set of delivery terms associated with this document.
     * 
     */
    @JsonProperty("DeliveryTerms")
    public void setDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public Invoice withDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }

    /**
     * Invoice. Payment Means
     * <p>
     * Expected means of payment.
     * 
     */
    @JsonProperty("PaymentMeans")
    public List<PaymentMeans> getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Invoice. Payment Means
     * <p>
     * Expected means of payment.
     * 
     */
    @JsonProperty("PaymentMeans")
    public void setPaymentMeans(List<PaymentMeans> paymentMeans) {
        this.paymentMeans = paymentMeans;
    }

    public Invoice withPaymentMeans(List<PaymentMeans> paymentMeans) {
        this.paymentMeans = paymentMeans;
        return this;
    }

    /**
     * Invoice. Payment Terms
     * <p>
     * A set of payment terms associated with this document.
     * 
     */
    @JsonProperty("PaymentTerms")
    public List<PaymentTerms> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Invoice. Payment Terms
     * <p>
     * A set of payment terms associated with this document.
     * 
     */
    @JsonProperty("PaymentTerms")
    public void setPaymentTerms(List<PaymentTerms> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Invoice withPaymentTerms(List<PaymentTerms> paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    /**
     * Invoice. Prepaid_ Payment. Payment
     * <p>
     * A prepaid payment.
     * 
     */
    @JsonProperty("PrepaidPayment")
    public List<Payment> getPrepaidPayment() {
        return prepaidPayment;
    }

    /**
     * Invoice. Prepaid_ Payment. Payment
     * <p>
     * A prepaid payment.
     * 
     */
    @JsonProperty("PrepaidPayment")
    public void setPrepaidPayment(List<Payment> prepaidPayment) {
        this.prepaidPayment = prepaidPayment;
    }

    public Invoice withPrepaidPayment(List<Payment> prepaidPayment) {
        this.prepaidPayment = prepaidPayment;
        return this;
    }

    /**
     * Invoice. Allowance Charge
     * <p>
     * A discount or charge that applies to a price component.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public List<AllowanceCharge> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Invoice. Allowance Charge
     * <p>
     * A discount or charge that applies to a price component.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public Invoice withAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
        return this;
    }

    /**
     * Invoice. Tax_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the tax currency.
     * 
     */
    @JsonProperty("TaxExchangeRate")
    public List<ExchangeRate> getTaxExchangeRate() {
        return taxExchangeRate;
    }

    /**
     * Invoice. Tax_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the tax currency.
     * 
     */
    @JsonProperty("TaxExchangeRate")
    public void setTaxExchangeRate(List<ExchangeRate> taxExchangeRate) {
        this.taxExchangeRate = taxExchangeRate;
    }

    public Invoice withTaxExchangeRate(List<ExchangeRate> taxExchangeRate) {
        this.taxExchangeRate = taxExchangeRate;
        return this;
    }

    /**
     * Invoice. Pricing_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the pricing currency.
     * 
     */
    @JsonProperty("PricingExchangeRate")
    public List<ExchangeRate> getPricingExchangeRate() {
        return pricingExchangeRate;
    }

    /**
     * Invoice. Pricing_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the pricing currency.
     * 
     */
    @JsonProperty("PricingExchangeRate")
    public void setPricingExchangeRate(List<ExchangeRate> pricingExchangeRate) {
        this.pricingExchangeRate = pricingExchangeRate;
    }

    public Invoice withPricingExchangeRate(List<ExchangeRate> pricingExchangeRate) {
        this.pricingExchangeRate = pricingExchangeRate;
        return this;
    }

    /**
     * Invoice. Payment_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the payment currency.
     * 
     */
    @JsonProperty("PaymentExchangeRate")
    public List<ExchangeRate> getPaymentExchangeRate() {
        return paymentExchangeRate;
    }

    /**
     * Invoice. Payment_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the payment currency.
     * 
     */
    @JsonProperty("PaymentExchangeRate")
    public void setPaymentExchangeRate(List<ExchangeRate> paymentExchangeRate) {
        this.paymentExchangeRate = paymentExchangeRate;
    }

    public Invoice withPaymentExchangeRate(List<ExchangeRate> paymentExchangeRate) {
        this.paymentExchangeRate = paymentExchangeRate;
        return this;
    }

    /**
     * Invoice. Payment Alternative_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the payment alternative currency.
     * 
     */
    @JsonProperty("PaymentAlternativeExchangeRate")
    public List<ExchangeRate> getPaymentAlternativeExchangeRate() {
        return paymentAlternativeExchangeRate;
    }

    /**
     * Invoice. Payment Alternative_ Exchange Rate. Exchange Rate
     * <p>
     * The exchange rate between the document currency and the payment alternative currency.
     * 
     */
    @JsonProperty("PaymentAlternativeExchangeRate")
    public void setPaymentAlternativeExchangeRate(List<ExchangeRate> paymentAlternativeExchangeRate) {
        this.paymentAlternativeExchangeRate = paymentAlternativeExchangeRate;
    }

    public Invoice withPaymentAlternativeExchangeRate(List<ExchangeRate> paymentAlternativeExchangeRate) {
        this.paymentAlternativeExchangeRate = paymentAlternativeExchangeRate;
        return this;
    }

    /**
     * Invoice. Tax Total
     * <p>
     * The total amount of a specific type of tax.
     * 
     */
    @JsonProperty("TaxTotal")
    public List<TaxTotal> getTaxTotal() {
        return taxTotal;
    }

    /**
     * Invoice. Tax Total
     * <p>
     * The total amount of a specific type of tax.
     * 
     */
    @JsonProperty("TaxTotal")
    public void setTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Invoice withTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Invoice. Withholding_ Tax Total. Tax Total
     * <p>
     * The total withholding tax.
     * 
     */
    @JsonProperty("WithholdingTaxTotal")
    public List<TaxTotal> getWithholdingTaxTotal() {
        return withholdingTaxTotal;
    }

    /**
     * Invoice. Withholding_ Tax Total. Tax Total
     * <p>
     * The total withholding tax.
     * 
     */
    @JsonProperty("WithholdingTaxTotal")
    public void setWithholdingTaxTotal(List<TaxTotal> withholdingTaxTotal) {
        this.withholdingTaxTotal = withholdingTaxTotal;
    }

    public Invoice withWithholdingTaxTotal(List<TaxTotal> withholdingTaxTotal) {
        this.withholdingTaxTotal = withholdingTaxTotal;
        return this;
    }

    /**
     * Invoice. Legal_ Monetary Total. Monetary Total
     * <p>
     * The total amount payable on the Invoice, including Allowances, Charges, and Taxes.
     * (Required)
     * 
     */
    @JsonProperty("LegalMonetaryTotal")
    public List<MonetaryTotal> getLegalMonetaryTotal() {
        return legalMonetaryTotal;
    }

    /**
     * Invoice. Legal_ Monetary Total. Monetary Total
     * <p>
     * The total amount payable on the Invoice, including Allowances, Charges, and Taxes.
     * (Required)
     * 
     */
    @JsonProperty("LegalMonetaryTotal")
    public void setLegalMonetaryTotal(List<MonetaryTotal> legalMonetaryTotal) {
        this.legalMonetaryTotal = legalMonetaryTotal;
    }

    public Invoice withLegalMonetaryTotal(List<MonetaryTotal> legalMonetaryTotal) {
        this.legalMonetaryTotal = legalMonetaryTotal;
        return this;
    }

    /**
     * Invoice. Invoice Line
     * <p>
     * A line describing an invoice item.
     * (Required)
     * 
     */
    @JsonProperty("InvoiceLine")
    public List<InvoiceLine> getInvoiceLine() {
        return invoiceLine;
    }

    /**
     * Invoice. Invoice Line
     * <p>
     * A line describing an invoice item.
     * (Required)
     * 
     */
    @JsonProperty("InvoiceLine")
    public void setInvoiceLine(List<InvoiceLine> invoiceLine) {
        this.invoiceLine = invoiceLine;
    }

    public Invoice withInvoiceLine(List<InvoiceLine> invoiceLine) {
        this.invoiceLine = invoiceLine;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Invoice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("uBLVersionID");
        sb.append('=');
        sb.append(((this.uBLVersionID == null)?"<null>":this.uBLVersionID));
        sb.append(',');
        sb.append("customizationID");
        sb.append('=');
        sb.append(((this.customizationID == null)?"<null>":this.customizationID));
        sb.append(',');
        sb.append("profileID");
        sb.append('=');
        sb.append(((this.profileID == null)?"<null>":this.profileID));
        sb.append(',');
        sb.append("profileExecutionID");
        sb.append('=');
        sb.append(((this.profileExecutionID == null)?"<null>":this.profileExecutionID));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("copyIndicator");
        sb.append('=');
        sb.append(((this.copyIndicator == null)?"<null>":this.copyIndicator));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("issueTime");
        sb.append('=');
        sb.append(((this.issueTime == null)?"<null>":this.issueTime));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("invoiceTypeCode");
        sb.append('=');
        sb.append(((this.invoiceTypeCode == null)?"<null>":this.invoiceTypeCode));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("taxPointDate");
        sb.append('=');
        sb.append(((this.taxPointDate == null)?"<null>":this.taxPointDate));
        sb.append(',');
        sb.append("documentCurrencyCode");
        sb.append('=');
        sb.append(((this.documentCurrencyCode == null)?"<null>":this.documentCurrencyCode));
        sb.append(',');
        sb.append("taxCurrencyCode");
        sb.append('=');
        sb.append(((this.taxCurrencyCode == null)?"<null>":this.taxCurrencyCode));
        sb.append(',');
        sb.append("pricingCurrencyCode");
        sb.append('=');
        sb.append(((this.pricingCurrencyCode == null)?"<null>":this.pricingCurrencyCode));
        sb.append(',');
        sb.append("paymentCurrencyCode");
        sb.append('=');
        sb.append(((this.paymentCurrencyCode == null)?"<null>":this.paymentCurrencyCode));
        sb.append(',');
        sb.append("paymentAlternativeCurrencyCode");
        sb.append('=');
        sb.append(((this.paymentAlternativeCurrencyCode == null)?"<null>":this.paymentAlternativeCurrencyCode));
        sb.append(',');
        sb.append("accountingCostCode");
        sb.append('=');
        sb.append(((this.accountingCostCode == null)?"<null>":this.accountingCostCode));
        sb.append(',');
        sb.append("accountingCost");
        sb.append('=');
        sb.append(((this.accountingCost == null)?"<null>":this.accountingCost));
        sb.append(',');
        sb.append("lineCountNumeric");
        sb.append('=');
        sb.append(((this.lineCountNumeric == null)?"<null>":this.lineCountNumeric));
        sb.append(',');
        sb.append("buyerReference");
        sb.append('=');
        sb.append(((this.buyerReference == null)?"<null>":this.buyerReference));
        sb.append(',');
        sb.append("invoicePeriod");
        sb.append('=');
        sb.append(((this.invoicePeriod == null)?"<null>":this.invoicePeriod));
        sb.append(',');
        sb.append("orderReference");
        sb.append('=');
        sb.append(((this.orderReference == null)?"<null>":this.orderReference));
        sb.append(',');
        sb.append("billingReference");
        sb.append('=');
        sb.append(((this.billingReference == null)?"<null>":this.billingReference));
        sb.append(',');
        sb.append("despatchDocumentReference");
        sb.append('=');
        sb.append(((this.despatchDocumentReference == null)?"<null>":this.despatchDocumentReference));
        sb.append(',');
        sb.append("receiptDocumentReference");
        sb.append('=');
        sb.append(((this.receiptDocumentReference == null)?"<null>":this.receiptDocumentReference));
        sb.append(',');
        sb.append("statementDocumentReference");
        sb.append('=');
        sb.append(((this.statementDocumentReference == null)?"<null>":this.statementDocumentReference));
        sb.append(',');
        sb.append("originatorDocumentReference");
        sb.append('=');
        sb.append(((this.originatorDocumentReference == null)?"<null>":this.originatorDocumentReference));
        sb.append(',');
        sb.append("contractDocumentReference");
        sb.append('=');
        sb.append(((this.contractDocumentReference == null)?"<null>":this.contractDocumentReference));
        sb.append(',');
        sb.append("additionalDocumentReference");
        sb.append('=');
        sb.append(((this.additionalDocumentReference == null)?"<null>":this.additionalDocumentReference));
        sb.append(',');
        sb.append("projectReference");
        sb.append('=');
        sb.append(((this.projectReference == null)?"<null>":this.projectReference));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
        sb.append(',');
        sb.append("accountingSupplierParty");
        sb.append('=');
        sb.append(((this.accountingSupplierParty == null)?"<null>":this.accountingSupplierParty));
        sb.append(',');
        sb.append("accountingCustomerParty");
        sb.append('=');
        sb.append(((this.accountingCustomerParty == null)?"<null>":this.accountingCustomerParty));
        sb.append(',');
        sb.append("payeeParty");
        sb.append('=');
        sb.append(((this.payeeParty == null)?"<null>":this.payeeParty));
        sb.append(',');
        sb.append("buyerCustomerParty");
        sb.append('=');
        sb.append(((this.buyerCustomerParty == null)?"<null>":this.buyerCustomerParty));
        sb.append(',');
        sb.append("sellerSupplierParty");
        sb.append('=');
        sb.append(((this.sellerSupplierParty == null)?"<null>":this.sellerSupplierParty));
        sb.append(',');
        sb.append("taxRepresentativeParty");
        sb.append('=');
        sb.append(((this.taxRepresentativeParty == null)?"<null>":this.taxRepresentativeParty));
        sb.append(',');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("deliveryTerms");
        sb.append('=');
        sb.append(((this.deliveryTerms == null)?"<null>":this.deliveryTerms));
        sb.append(',');
        sb.append("paymentMeans");
        sb.append('=');
        sb.append(((this.paymentMeans == null)?"<null>":this.paymentMeans));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("prepaidPayment");
        sb.append('=');
        sb.append(((this.prepaidPayment == null)?"<null>":this.prepaidPayment));
        sb.append(',');
        sb.append("allowanceCharge");
        sb.append('=');
        sb.append(((this.allowanceCharge == null)?"<null>":this.allowanceCharge));
        sb.append(',');
        sb.append("taxExchangeRate");
        sb.append('=');
        sb.append(((this.taxExchangeRate == null)?"<null>":this.taxExchangeRate));
        sb.append(',');
        sb.append("pricingExchangeRate");
        sb.append('=');
        sb.append(((this.pricingExchangeRate == null)?"<null>":this.pricingExchangeRate));
        sb.append(',');
        sb.append("paymentExchangeRate");
        sb.append('=');
        sb.append(((this.paymentExchangeRate == null)?"<null>":this.paymentExchangeRate));
        sb.append(',');
        sb.append("paymentAlternativeExchangeRate");
        sb.append('=');
        sb.append(((this.paymentAlternativeExchangeRate == null)?"<null>":this.paymentAlternativeExchangeRate));
        sb.append(',');
        sb.append("taxTotal");
        sb.append('=');
        sb.append(((this.taxTotal == null)?"<null>":this.taxTotal));
        sb.append(',');
        sb.append("withholdingTaxTotal");
        sb.append('=');
        sb.append(((this.withholdingTaxTotal == null)?"<null>":this.withholdingTaxTotal));
        sb.append(',');
        sb.append("legalMonetaryTotal");
        sb.append('=');
        sb.append(((this.legalMonetaryTotal == null)?"<null>":this.legalMonetaryTotal));
        sb.append(',');
        sb.append("invoiceLine");
        sb.append('=');
        sb.append(((this.invoiceLine == null)?"<null>":this.invoiceLine));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.contractDocumentReference == null)? 0 :this.contractDocumentReference.hashCode()));
        result = ((result* 31)+((this.accountingCost == null)? 0 :this.accountingCost.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.taxTotal == null)? 0 :this.taxTotal.hashCode()));
        result = ((result* 31)+((this.buyerCustomerParty == null)? 0 :this.buyerCustomerParty.hashCode()));
        result = ((result* 31)+((this.taxExchangeRate == null)? 0 :this.taxExchangeRate.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.profileExecutionID == null)? 0 :this.profileExecutionID.hashCode()));
        result = ((result* 31)+((this.pricingExchangeRate == null)? 0 :this.pricingExchangeRate.hashCode()));
        result = ((result* 31)+((this.sellerSupplierParty == null)? 0 :this.sellerSupplierParty.hashCode()));
        result = ((result* 31)+((this.profileID == null)? 0 :this.profileID.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.paymentAlternativeCurrencyCode == null)? 0 :this.paymentAlternativeCurrencyCode.hashCode()));
        result = ((result* 31)+((this.accountingCostCode == null)? 0 :this.accountingCostCode.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        result = ((result* 31)+((this.despatchDocumentReference == null)? 0 :this.despatchDocumentReference.hashCode()));
        result = ((result* 31)+((this.customizationID == null)? 0 :this.customizationID.hashCode()));
        result = ((result* 31)+((this.accountingCustomerParty == null)? 0 :this.accountingCustomerParty.hashCode()));
        result = ((result* 31)+((this.prepaidPayment == null)? 0 :this.prepaidPayment.hashCode()));
        result = ((result* 31)+((this.buyerReference == null)? 0 :this.buyerReference.hashCode()));
        result = ((result* 31)+((this.statementDocumentReference == null)? 0 :this.statementDocumentReference.hashCode()));
        result = ((result* 31)+((this.receiptDocumentReference == null)? 0 :this.receiptDocumentReference.hashCode()));
        result = ((result* 31)+((this.uBLVersionID == null)? 0 :this.uBLVersionID.hashCode()));
        result = ((result* 31)+((this.paymentMeans == null)? 0 :this.paymentMeans.hashCode()));
        result = ((result* 31)+((this.billingReference == null)? 0 :this.billingReference.hashCode()));
        result = ((result* 31)+((this.lineCountNumeric == null)? 0 :this.lineCountNumeric.hashCode()));
        result = ((result* 31)+((this.orderReference == null)? 0 :this.orderReference.hashCode()));
        result = ((result* 31)+((this.paymentExchangeRate == null)? 0 :this.paymentExchangeRate.hashCode()));
        result = ((result* 31)+((this.additionalDocumentReference == null)? 0 :this.additionalDocumentReference.hashCode()));
        result = ((result* 31)+((this.projectReference == null)? 0 :this.projectReference.hashCode()));
        result = ((result* 31)+((this.payeeParty == null)? 0 :this.payeeParty.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.issueTime == null)? 0 :this.issueTime.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.taxPointDate == null)? 0 :this.taxPointDate.hashCode()));
        result = ((result* 31)+((this.pricingCurrencyCode == null)? 0 :this.pricingCurrencyCode.hashCode()));
        result = ((result* 31)+((this.originatorDocumentReference == null)? 0 :this.originatorDocumentReference.hashCode()));
        result = ((result* 31)+((this.invoicePeriod == null)? 0 :this.invoicePeriod.hashCode()));
        result = ((result* 31)+((this.invoiceLine == null)? 0 :this.invoiceLine.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.accountingSupplierParty == null)? 0 :this.accountingSupplierParty.hashCode()));
        result = ((result* 31)+((this.allowanceCharge == null)? 0 :this.allowanceCharge.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.copyIndicator == null)? 0 :this.copyIndicator.hashCode()));
        result = ((result* 31)+((this.deliveryTerms == null)? 0 :this.deliveryTerms.hashCode()));
        result = ((result* 31)+((this.taxCurrencyCode == null)? 0 :this.taxCurrencyCode.hashCode()));
        result = ((result* 31)+((this.paymentCurrencyCode == null)? 0 :this.paymentCurrencyCode.hashCode()));
        result = ((result* 31)+((this.withholdingTaxTotal == null)? 0 :this.withholdingTaxTotal.hashCode()));
        result = ((result* 31)+((this.documentCurrencyCode == null)? 0 :this.documentCurrencyCode.hashCode()));
        result = ((result* 31)+((this.taxRepresentativeParty == null)? 0 :this.taxRepresentativeParty.hashCode()));
        result = ((result* 31)+((this.legalMonetaryTotal == null)? 0 :this.legalMonetaryTotal.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.invoiceTypeCode == null)? 0 :this.invoiceTypeCode.hashCode()));
        result = ((result* 31)+((this.paymentAlternativeExchangeRate == null)? 0 :this.paymentAlternativeExchangeRate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Invoice) == false) {
            return false;
        }
        Invoice rhs = ((Invoice) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((this.contractDocumentReference == rhs.contractDocumentReference)||((this.contractDocumentReference!= null)&&this.contractDocumentReference.equals(rhs.contractDocumentReference)))&&((this.accountingCost == rhs.accountingCost)||((this.accountingCost!= null)&&this.accountingCost.equals(rhs.accountingCost))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.taxTotal == rhs.taxTotal)||((this.taxTotal!= null)&&this.taxTotal.equals(rhs.taxTotal))))&&((this.buyerCustomerParty == rhs.buyerCustomerParty)||((this.buyerCustomerParty!= null)&&this.buyerCustomerParty.equals(rhs.buyerCustomerParty))))&&((this.taxExchangeRate == rhs.taxExchangeRate)||((this.taxExchangeRate!= null)&&this.taxExchangeRate.equals(rhs.taxExchangeRate))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.profileExecutionID == rhs.profileExecutionID)||((this.profileExecutionID!= null)&&this.profileExecutionID.equals(rhs.profileExecutionID))))&&((this.pricingExchangeRate == rhs.pricingExchangeRate)||((this.pricingExchangeRate!= null)&&this.pricingExchangeRate.equals(rhs.pricingExchangeRate))))&&((this.sellerSupplierParty == rhs.sellerSupplierParty)||((this.sellerSupplierParty!= null)&&this.sellerSupplierParty.equals(rhs.sellerSupplierParty))))&&((this.profileID == rhs.profileID)||((this.profileID!= null)&&this.profileID.equals(rhs.profileID))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.paymentAlternativeCurrencyCode == rhs.paymentAlternativeCurrencyCode)||((this.paymentAlternativeCurrencyCode!= null)&&this.paymentAlternativeCurrencyCode.equals(rhs.paymentAlternativeCurrencyCode))))&&((this.accountingCostCode == rhs.accountingCostCode)||((this.accountingCostCode!= null)&&this.accountingCostCode.equals(rhs.accountingCostCode))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))))&&((this.despatchDocumentReference == rhs.despatchDocumentReference)||((this.despatchDocumentReference!= null)&&this.despatchDocumentReference.equals(rhs.despatchDocumentReference))))&&((this.customizationID == rhs.customizationID)||((this.customizationID!= null)&&this.customizationID.equals(rhs.customizationID))))&&((this.accountingCustomerParty == rhs.accountingCustomerParty)||((this.accountingCustomerParty!= null)&&this.accountingCustomerParty.equals(rhs.accountingCustomerParty))))&&((this.prepaidPayment == rhs.prepaidPayment)||((this.prepaidPayment!= null)&&this.prepaidPayment.equals(rhs.prepaidPayment))))&&((this.buyerReference == rhs.buyerReference)||((this.buyerReference!= null)&&this.buyerReference.equals(rhs.buyerReference))))&&((this.statementDocumentReference == rhs.statementDocumentReference)||((this.statementDocumentReference!= null)&&this.statementDocumentReference.equals(rhs.statementDocumentReference))))&&((this.receiptDocumentReference == rhs.receiptDocumentReference)||((this.receiptDocumentReference!= null)&&this.receiptDocumentReference.equals(rhs.receiptDocumentReference))))&&((this.uBLVersionID == rhs.uBLVersionID)||((this.uBLVersionID!= null)&&this.uBLVersionID.equals(rhs.uBLVersionID))))&&((this.paymentMeans == rhs.paymentMeans)||((this.paymentMeans!= null)&&this.paymentMeans.equals(rhs.paymentMeans))))&&((this.billingReference == rhs.billingReference)||((this.billingReference!= null)&&this.billingReference.equals(rhs.billingReference))))&&((this.lineCountNumeric == rhs.lineCountNumeric)||((this.lineCountNumeric!= null)&&this.lineCountNumeric.equals(rhs.lineCountNumeric))))&&((this.orderReference == rhs.orderReference)||((this.orderReference!= null)&&this.orderReference.equals(rhs.orderReference))))&&((this.paymentExchangeRate == rhs.paymentExchangeRate)||((this.paymentExchangeRate!= null)&&this.paymentExchangeRate.equals(rhs.paymentExchangeRate))))&&((this.additionalDocumentReference == rhs.additionalDocumentReference)||((this.additionalDocumentReference!= null)&&this.additionalDocumentReference.equals(rhs.additionalDocumentReference))))&&((this.projectReference == rhs.projectReference)||((this.projectReference!= null)&&this.projectReference.equals(rhs.projectReference))))&&((this.payeeParty == rhs.payeeParty)||((this.payeeParty!= null)&&this.payeeParty.equals(rhs.payeeParty))))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.issueTime == rhs.issueTime)||((this.issueTime!= null)&&this.issueTime.equals(rhs.issueTime))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.taxPointDate == rhs.taxPointDate)||((this.taxPointDate!= null)&&this.taxPointDate.equals(rhs.taxPointDate))))&&((this.pricingCurrencyCode == rhs.pricingCurrencyCode)||((this.pricingCurrencyCode!= null)&&this.pricingCurrencyCode.equals(rhs.pricingCurrencyCode))))&&((this.originatorDocumentReference == rhs.originatorDocumentReference)||((this.originatorDocumentReference!= null)&&this.originatorDocumentReference.equals(rhs.originatorDocumentReference))))&&((this.invoicePeriod == rhs.invoicePeriod)||((this.invoicePeriod!= null)&&this.invoicePeriod.equals(rhs.invoicePeriod))))&&((this.invoiceLine == rhs.invoiceLine)||((this.invoiceLine!= null)&&this.invoiceLine.equals(rhs.invoiceLine))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.accountingSupplierParty == rhs.accountingSupplierParty)||((this.accountingSupplierParty!= null)&&this.accountingSupplierParty.equals(rhs.accountingSupplierParty))))&&((this.allowanceCharge == rhs.allowanceCharge)||((this.allowanceCharge!= null)&&this.allowanceCharge.equals(rhs.allowanceCharge))))&&((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery))))&&((this.copyIndicator == rhs.copyIndicator)||((this.copyIndicator!= null)&&this.copyIndicator.equals(rhs.copyIndicator))))&&((this.deliveryTerms == rhs.deliveryTerms)||((this.deliveryTerms!= null)&&this.deliveryTerms.equals(rhs.deliveryTerms))))&&((this.taxCurrencyCode == rhs.taxCurrencyCode)||((this.taxCurrencyCode!= null)&&this.taxCurrencyCode.equals(rhs.taxCurrencyCode))))&&((this.paymentCurrencyCode == rhs.paymentCurrencyCode)||((this.paymentCurrencyCode!= null)&&this.paymentCurrencyCode.equals(rhs.paymentCurrencyCode))))&&((this.withholdingTaxTotal == rhs.withholdingTaxTotal)||((this.withholdingTaxTotal!= null)&&this.withholdingTaxTotal.equals(rhs.withholdingTaxTotal))))&&((this.documentCurrencyCode == rhs.documentCurrencyCode)||((this.documentCurrencyCode!= null)&&this.documentCurrencyCode.equals(rhs.documentCurrencyCode))))&&((this.taxRepresentativeParty == rhs.taxRepresentativeParty)||((this.taxRepresentativeParty!= null)&&this.taxRepresentativeParty.equals(rhs.taxRepresentativeParty))))&&((this.legalMonetaryTotal == rhs.legalMonetaryTotal)||((this.legalMonetaryTotal!= null)&&this.legalMonetaryTotal.equals(rhs.legalMonetaryTotal))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.invoiceTypeCode == rhs.invoiceTypeCode)||((this.invoiceTypeCode!= null)&&this.invoiceTypeCode.equals(rhs.invoiceTypeCode))))&&((this.paymentAlternativeExchangeRate == rhs.paymentAlternativeExchangeRate)||((this.paymentAlternativeExchangeRate!= null)&&this.paymentAlternativeExchangeRate.equals(rhs.paymentAlternativeExchangeRate))));
    }

}
