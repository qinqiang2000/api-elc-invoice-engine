
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
 * Invoice Line. Details
 * <p>
 * A class to define a line in an Invoice.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "UUID",
    "Note",
    "InvoicedQuantity",
    "LineExtensionAmount",
    "TaxPointDate",
    "AccountingCostCode",
    "AccountingCost",
    "PaymentPurposeCode",
    "FreeOfChargeIndicator",
    "InvoicePeriod",
    "OrderLineReference",
    "DespatchLineReference",
    "ReceiptLineReference",
    "BillingReference",
    "DocumentReference",
    "PricingReference",
    "OriginatorParty",
    "Delivery",
    "PaymentTerms",
    "AllowanceCharge",
    "TaxTotal",
    "WithholdingTaxTotal",
    "Item",
    "Price",
    "DeliveryTerms",
    "SubInvoiceLine",
    "ItemPriceExtension"
})
@Generated("jsonschema2pojo")
public class InvoiceLine {

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
     * Invoice Line. Identifier
     * <p>
     * An identifier for this invoice line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Invoice Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this invoice line.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Invoice Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Free-form text conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> note = new ArrayList<TextType>();
    /**
     * Invoice Line. Invoiced_ Quantity. Quantity
     * <p>
     * The quantity (of items) on this invoice line.
     * 
     */
    @JsonProperty("InvoicedQuantity")
    @JsonPropertyDescription("The quantity (of items) on this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> invoicedQuantity = new ArrayList<QuantityType>();
    /**
     * Invoice Line. Line Extension Amount. Amount
     * <p>
     * The total amount for this invoice line, including allowance charges but net of taxes.
     * (Required)
     * 
     */
    @JsonProperty("LineExtensionAmount")
    @JsonPropertyDescription("The total amount for this invoice line, including allowance charges but net of taxes.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> lineExtensionAmount = new ArrayList<AmountType>();
    /**
     * Invoice Line. Tax Point Date. Date
     * <p>
     * The date of this invoice line, used to indicate the point at which tax becomes applicable.
     * 
     */
    @JsonProperty("TaxPointDate")
    @JsonPropertyDescription("The date of this invoice line, used to indicate the point at which tax becomes applicable.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> taxPointDate = new ArrayList<DateType>();
    /**
     * Invoice Line. Accounting Cost Code. Code
     * <p>
     * The buyer's accounting cost centre for this invoice line, expressed as a code.
     * 
     */
    @JsonProperty("AccountingCostCode")
    @JsonPropertyDescription("The buyer's accounting cost centre for this invoice line, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> accountingCostCode = new ArrayList<CodeType>();
    /**
     * Invoice Line. Accounting Cost. Text
     * <p>
     * The buyer's accounting cost centre for this invoice line, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    @JsonPropertyDescription("The buyer's accounting cost centre for this invoice line, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> accountingCost = new ArrayList<TextType>();
    /**
     * Invoice Line. Payment Purpose Code. Code
     * <p>
     * A code signifying the business purpose for this payment.
     * 
     */
    @JsonProperty("PaymentPurposeCode")
    @JsonPropertyDescription("A code signifying the business purpose for this payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> paymentPurposeCode = new ArrayList<CodeType>();
    /**
     * Invoice Line. Free Of Charge_ Indicator. Indicator
     * <p>
     * An indicator that this invoice line is free of charge (true) or not (false). The default is false.
     * 
     */
    @JsonProperty("FreeOfChargeIndicator")
    @JsonPropertyDescription("An indicator that this invoice line is free of charge (true) or not (false). The default is false.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> freeOfChargeIndicator = new ArrayList<IndicatorType>();
    /**
     * Invoice Line. Invoice_ Period. Period
     * <p>
     * An invoice period to which this invoice line applies.
     * 
     */
    @JsonProperty("InvoicePeriod")
    @JsonPropertyDescription("An invoice period to which this invoice line applies.")
    @Size(min = 1)
    @Valid
    private List<Period> invoicePeriod = new ArrayList<Period>();
    /**
     * Invoice Line. Order Line Reference
     * <p>
     * A reference to an order line associated with this invoice line.
     * 
     */
    @JsonProperty("OrderLineReference")
    @JsonPropertyDescription("A reference to an order line associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<OrderLineReference> orderLineReference = new ArrayList<OrderLineReference>();
    /**
     * Invoice Line. Despatch_ Line Reference. Line Reference
     * <p>
     * A reference to a despatch line associated with this invoice line.
     * 
     */
    @JsonProperty("DespatchLineReference")
    @JsonPropertyDescription("A reference to a despatch line associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<LineReference> despatchLineReference = new ArrayList<LineReference>();
    /**
     * Invoice Line. Receipt_ Line Reference. Line Reference
     * <p>
     * A reference to a receipt line associated with this invoice line.
     * 
     */
    @JsonProperty("ReceiptLineReference")
    @JsonPropertyDescription("A reference to a receipt line associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<LineReference> receiptLineReference = new ArrayList<LineReference>();
    /**
     * Invoice Line. Billing Reference
     * <p>
     * A reference to a billing document associated with this invoice line.
     * 
     */
    @JsonProperty("BillingReference")
    @JsonPropertyDescription("A reference to a billing document associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<BillingReference> billingReference = new ArrayList<BillingReference>();
    /**
     * Invoice Line. Document Reference
     * <p>
     * A reference to a document associated with this invoice line.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A reference to a document associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> documentReference = new ArrayList<DocumentReference>();
    /**
     * Invoice Line. Pricing Reference
     * <p>
     * A reference to pricing and item location information associated with this invoice line.
     * 
     */
    @JsonProperty("PricingReference")
    @JsonPropertyDescription("A reference to pricing and item location information associated with this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PricingReference> pricingReference = new ArrayList<PricingReference>();
    /**
     * Invoice Line. Originator_ Party. Party
     * <p>
     * The party who originated the Order to which the Invoice is related.
     * 
     */
    @JsonProperty("OriginatorParty")
    @JsonPropertyDescription("The party who originated the Order to which the Invoice is related.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> originatorParty = new ArrayList<Party>();
    /**
     * Invoice Line. Delivery
     * <p>
     * A delivery associated with this invoice line.
     * 
     */
    @JsonProperty("Delivery")
    @JsonPropertyDescription("A delivery associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<Delivery> delivery = new ArrayList<Delivery>();
    /**
     * Invoice Line. Payment Terms
     * <p>
     * A specification of payment terms associated with this invoice line.
     * 
     */
    @JsonProperty("PaymentTerms")
    @JsonPropertyDescription("A specification of payment terms associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<PaymentTerms> paymentTerms = new ArrayList<PaymentTerms>();
    /**
     * Invoice Line. Allowance Charge
     * <p>
     * An allowance or charge associated with this invoice line.
     * 
     */
    @JsonProperty("AllowanceCharge")
    @JsonPropertyDescription("An allowance or charge associated with this invoice line.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> allowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Invoice Line. Tax Total
     * <p>
     * A total amount of taxes of a particular kind applicable to this invoice line.
     * 
     */
    @JsonProperty("TaxTotal")
    @JsonPropertyDescription("A total amount of taxes of a particular kind applicable to this invoice line.")
    @Size(min = 1)
    @Valid
    private List<TaxTotal> taxTotal = new ArrayList<TaxTotal>();
    /**
     * Invoice Line. Withholding_ Tax Total. Tax Total
     * <p>
     * A reference to a TaxTotal class describing the amount that has been withhold by the authorities, e.g. if the creditor is in dept because of non paid taxes.
     * 
     */
    @JsonProperty("WithholdingTaxTotal")
    @JsonPropertyDescription("A reference to a TaxTotal class describing the amount that has been withhold by the authorities, e.g. if the creditor is in dept because of non paid taxes.")
    @Size(min = 1)
    @Valid
    private List<TaxTotal> withholdingTaxTotal = new ArrayList<TaxTotal>();
    /**
     * Invoice Line. Item
     * <p>
     * The item associated with this invoice line.
     * (Required)
     * 
     */
    @JsonProperty("Item")
    @JsonPropertyDescription("The item associated with this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Item> item = new ArrayList<Item>();
    /**
     * Invoice Line. Price
     * <p>
     * The price of the item associated with this invoice line.
     * 
     */
    @JsonProperty("Price")
    @JsonPropertyDescription("The price of the item associated with this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Price> price = new ArrayList<Price>();
    /**
     * Invoice Line. Delivery Terms
     * <p>
     * Terms and conditions of the delivery associated with this invoice line.
     * 
     */
    @JsonProperty("DeliveryTerms")
    @JsonPropertyDescription("Terms and conditions of the delivery associated with this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DeliveryTerms> deliveryTerms = new ArrayList<DeliveryTerms>();
    /**
     * Invoice Line. Sub_ Invoice Line. Invoice Line
     * <p>
     * An invoice line subsidiary to this invoice line.
     * 
     */
    @JsonProperty("SubInvoiceLine")
    @JsonPropertyDescription("An invoice line subsidiary to this invoice line.")
    @Size(min = 1)
    @Valid
    private List<InvoiceLine> subInvoiceLine = new ArrayList<InvoiceLine>();
    /**
     * Invoice Line. Item_ Price Extension. Price Extension
     * <p>
     * The price extension, calculated by multiplying the price per unit by the quantity of items on this invoice line.
     * 
     */
    @JsonProperty("ItemPriceExtension")
    @JsonPropertyDescription("The price extension, calculated by multiplying the price per unit by the quantity of items on this invoice line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PriceExtension> itemPriceExtension = new ArrayList<PriceExtension>();

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

    public InvoiceLine withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Invoice Line. Identifier
     * <p>
     * An identifier for this invoice line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Invoice Line. Identifier
     * <p>
     * An identifier for this invoice line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public InvoiceLine withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Invoice Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this invoice line.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Invoice Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this invoice line.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public InvoiceLine withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Invoice Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Invoice Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public InvoiceLine withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Invoice Line. Invoiced_ Quantity. Quantity
     * <p>
     * The quantity (of items) on this invoice line.
     * 
     */
    @JsonProperty("InvoicedQuantity")
    public List<QuantityType> getInvoicedQuantity() {
        return invoicedQuantity;
    }

    /**
     * Invoice Line. Invoiced_ Quantity. Quantity
     * <p>
     * The quantity (of items) on this invoice line.
     * 
     */
    @JsonProperty("InvoicedQuantity")
    public void setInvoicedQuantity(List<QuantityType> invoicedQuantity) {
        this.invoicedQuantity = invoicedQuantity;
    }

    public InvoiceLine withInvoicedQuantity(List<QuantityType> invoicedQuantity) {
        this.invoicedQuantity = invoicedQuantity;
        return this;
    }

    /**
     * Invoice Line. Line Extension Amount. Amount
     * <p>
     * The total amount for this invoice line, including allowance charges but net of taxes.
     * (Required)
     * 
     */
    @JsonProperty("LineExtensionAmount")
    public List<AmountType> getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Invoice Line. Line Extension Amount. Amount
     * <p>
     * The total amount for this invoice line, including allowance charges but net of taxes.
     * (Required)
     * 
     */
    @JsonProperty("LineExtensionAmount")
    public void setLineExtensionAmount(List<AmountType> lineExtensionAmount) {
        this.lineExtensionAmount = lineExtensionAmount;
    }

    public InvoiceLine withLineExtensionAmount(List<AmountType> lineExtensionAmount) {
        this.lineExtensionAmount = lineExtensionAmount;
        return this;
    }

    /**
     * Invoice Line. Tax Point Date. Date
     * <p>
     * The date of this invoice line, used to indicate the point at which tax becomes applicable.
     * 
     */
    @JsonProperty("TaxPointDate")
    public List<DateType> getTaxPointDate() {
        return taxPointDate;
    }

    /**
     * Invoice Line. Tax Point Date. Date
     * <p>
     * The date of this invoice line, used to indicate the point at which tax becomes applicable.
     * 
     */
    @JsonProperty("TaxPointDate")
    public void setTaxPointDate(List<DateType> taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public InvoiceLine withTaxPointDate(List<DateType> taxPointDate) {
        this.taxPointDate = taxPointDate;
        return this;
    }

    /**
     * Invoice Line. Accounting Cost Code. Code
     * <p>
     * The buyer's accounting cost centre for this invoice line, expressed as a code.
     * 
     */
    @JsonProperty("AccountingCostCode")
    public List<CodeType> getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Invoice Line. Accounting Cost Code. Code
     * <p>
     * The buyer's accounting cost centre for this invoice line, expressed as a code.
     * 
     */
    @JsonProperty("AccountingCostCode")
    public void setAccountingCostCode(List<CodeType> accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
    }

    public InvoiceLine withAccountingCostCode(List<CodeType> accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
        return this;
    }

    /**
     * Invoice Line. Accounting Cost. Text
     * <p>
     * The buyer's accounting cost centre for this invoice line, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    public List<TextType> getAccountingCost() {
        return accountingCost;
    }

    /**
     * Invoice Line. Accounting Cost. Text
     * <p>
     * The buyer's accounting cost centre for this invoice line, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    public void setAccountingCost(List<TextType> accountingCost) {
        this.accountingCost = accountingCost;
    }

    public InvoiceLine withAccountingCost(List<TextType> accountingCost) {
        this.accountingCost = accountingCost;
        return this;
    }

    /**
     * Invoice Line. Payment Purpose Code. Code
     * <p>
     * A code signifying the business purpose for this payment.
     * 
     */
    @JsonProperty("PaymentPurposeCode")
    public List<CodeType> getPaymentPurposeCode() {
        return paymentPurposeCode;
    }

    /**
     * Invoice Line. Payment Purpose Code. Code
     * <p>
     * A code signifying the business purpose for this payment.
     * 
     */
    @JsonProperty("PaymentPurposeCode")
    public void setPaymentPurposeCode(List<CodeType> paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
    }

    public InvoiceLine withPaymentPurposeCode(List<CodeType> paymentPurposeCode) {
        this.paymentPurposeCode = paymentPurposeCode;
        return this;
    }

    /**
     * Invoice Line. Free Of Charge_ Indicator. Indicator
     * <p>
     * An indicator that this invoice line is free of charge (true) or not (false). The default is false.
     * 
     */
    @JsonProperty("FreeOfChargeIndicator")
    public List<IndicatorType> getFreeOfChargeIndicator() {
        return freeOfChargeIndicator;
    }

    /**
     * Invoice Line. Free Of Charge_ Indicator. Indicator
     * <p>
     * An indicator that this invoice line is free of charge (true) or not (false). The default is false.
     * 
     */
    @JsonProperty("FreeOfChargeIndicator")
    public void setFreeOfChargeIndicator(List<IndicatorType> freeOfChargeIndicator) {
        this.freeOfChargeIndicator = freeOfChargeIndicator;
    }

    public InvoiceLine withFreeOfChargeIndicator(List<IndicatorType> freeOfChargeIndicator) {
        this.freeOfChargeIndicator = freeOfChargeIndicator;
        return this;
    }

    /**
     * Invoice Line. Invoice_ Period. Period
     * <p>
     * An invoice period to which this invoice line applies.
     * 
     */
    @JsonProperty("InvoicePeriod")
    public List<Period> getInvoicePeriod() {
        return invoicePeriod;
    }

    /**
     * Invoice Line. Invoice_ Period. Period
     * <p>
     * An invoice period to which this invoice line applies.
     * 
     */
    @JsonProperty("InvoicePeriod")
    public void setInvoicePeriod(List<Period> invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
    }

    public InvoiceLine withInvoicePeriod(List<Period> invoicePeriod) {
        this.invoicePeriod = invoicePeriod;
        return this;
    }

    /**
     * Invoice Line. Order Line Reference
     * <p>
     * A reference to an order line associated with this invoice line.
     * 
     */
    @JsonProperty("OrderLineReference")
    public List<OrderLineReference> getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * Invoice Line. Order Line Reference
     * <p>
     * A reference to an order line associated with this invoice line.
     * 
     */
    @JsonProperty("OrderLineReference")
    public void setOrderLineReference(List<OrderLineReference> orderLineReference) {
        this.orderLineReference = orderLineReference;
    }

    public InvoiceLine withOrderLineReference(List<OrderLineReference> orderLineReference) {
        this.orderLineReference = orderLineReference;
        return this;
    }

    /**
     * Invoice Line. Despatch_ Line Reference. Line Reference
     * <p>
     * A reference to a despatch line associated with this invoice line.
     * 
     */
    @JsonProperty("DespatchLineReference")
    public List<LineReference> getDespatchLineReference() {
        return despatchLineReference;
    }

    /**
     * Invoice Line. Despatch_ Line Reference. Line Reference
     * <p>
     * A reference to a despatch line associated with this invoice line.
     * 
     */
    @JsonProperty("DespatchLineReference")
    public void setDespatchLineReference(List<LineReference> despatchLineReference) {
        this.despatchLineReference = despatchLineReference;
    }

    public InvoiceLine withDespatchLineReference(List<LineReference> despatchLineReference) {
        this.despatchLineReference = despatchLineReference;
        return this;
    }

    /**
     * Invoice Line. Receipt_ Line Reference. Line Reference
     * <p>
     * A reference to a receipt line associated with this invoice line.
     * 
     */
    @JsonProperty("ReceiptLineReference")
    public List<LineReference> getReceiptLineReference() {
        return receiptLineReference;
    }

    /**
     * Invoice Line. Receipt_ Line Reference. Line Reference
     * <p>
     * A reference to a receipt line associated with this invoice line.
     * 
     */
    @JsonProperty("ReceiptLineReference")
    public void setReceiptLineReference(List<LineReference> receiptLineReference) {
        this.receiptLineReference = receiptLineReference;
    }

    public InvoiceLine withReceiptLineReference(List<LineReference> receiptLineReference) {
        this.receiptLineReference = receiptLineReference;
        return this;
    }

    /**
     * Invoice Line. Billing Reference
     * <p>
     * A reference to a billing document associated with this invoice line.
     * 
     */
    @JsonProperty("BillingReference")
    public List<BillingReference> getBillingReference() {
        return billingReference;
    }

    /**
     * Invoice Line. Billing Reference
     * <p>
     * A reference to a billing document associated with this invoice line.
     * 
     */
    @JsonProperty("BillingReference")
    public void setBillingReference(List<BillingReference> billingReference) {
        this.billingReference = billingReference;
    }

    public InvoiceLine withBillingReference(List<BillingReference> billingReference) {
        this.billingReference = billingReference;
        return this;
    }

    /**
     * Invoice Line. Document Reference
     * <p>
     * A reference to a document associated with this invoice line.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Invoice Line. Document Reference
     * <p>
     * A reference to a document associated with this invoice line.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public InvoiceLine withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    /**
     * Invoice Line. Pricing Reference
     * <p>
     * A reference to pricing and item location information associated with this invoice line.
     * 
     */
    @JsonProperty("PricingReference")
    public List<PricingReference> getPricingReference() {
        return pricingReference;
    }

    /**
     * Invoice Line. Pricing Reference
     * <p>
     * A reference to pricing and item location information associated with this invoice line.
     * 
     */
    @JsonProperty("PricingReference")
    public void setPricingReference(List<PricingReference> pricingReference) {
        this.pricingReference = pricingReference;
    }

    public InvoiceLine withPricingReference(List<PricingReference> pricingReference) {
        this.pricingReference = pricingReference;
        return this;
    }

    /**
     * Invoice Line. Originator_ Party. Party
     * <p>
     * The party who originated the Order to which the Invoice is related.
     * 
     */
    @JsonProperty("OriginatorParty")
    public List<Party> getOriginatorParty() {
        return originatorParty;
    }

    /**
     * Invoice Line. Originator_ Party. Party
     * <p>
     * The party who originated the Order to which the Invoice is related.
     * 
     */
    @JsonProperty("OriginatorParty")
    public void setOriginatorParty(List<Party> originatorParty) {
        this.originatorParty = originatorParty;
    }

    public InvoiceLine withOriginatorParty(List<Party> originatorParty) {
        this.originatorParty = originatorParty;
        return this;
    }

    /**
     * Invoice Line. Delivery
     * <p>
     * A delivery associated with this invoice line.
     * 
     */
    @JsonProperty("Delivery")
    public List<Delivery> getDelivery() {
        return delivery;
    }

    /**
     * Invoice Line. Delivery
     * <p>
     * A delivery associated with this invoice line.
     * 
     */
    @JsonProperty("Delivery")
    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public InvoiceLine withDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Invoice Line. Payment Terms
     * <p>
     * A specification of payment terms associated with this invoice line.
     * 
     */
    @JsonProperty("PaymentTerms")
    public List<PaymentTerms> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Invoice Line. Payment Terms
     * <p>
     * A specification of payment terms associated with this invoice line.
     * 
     */
    @JsonProperty("PaymentTerms")
    public void setPaymentTerms(List<PaymentTerms> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public InvoiceLine withPaymentTerms(List<PaymentTerms> paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    /**
     * Invoice Line. Allowance Charge
     * <p>
     * An allowance or charge associated with this invoice line.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public List<AllowanceCharge> getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Invoice Line. Allowance Charge
     * <p>
     * An allowance or charge associated with this invoice line.
     * 
     */
    @JsonProperty("AllowanceCharge")
    public void setAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
    }

    public InvoiceLine withAllowanceCharge(List<AllowanceCharge> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
        return this;
    }

    /**
     * Invoice Line. Tax Total
     * <p>
     * A total amount of taxes of a particular kind applicable to this invoice line.
     * 
     */
    @JsonProperty("TaxTotal")
    public List<TaxTotal> getTaxTotal() {
        return taxTotal;
    }

    /**
     * Invoice Line. Tax Total
     * <p>
     * A total amount of taxes of a particular kind applicable to this invoice line.
     * 
     */
    @JsonProperty("TaxTotal")
    public void setTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
    }

    public InvoiceLine withTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Invoice Line. Withholding_ Tax Total. Tax Total
     * <p>
     * A reference to a TaxTotal class describing the amount that has been withhold by the authorities, e.g. if the creditor is in dept because of non paid taxes.
     * 
     */
    @JsonProperty("WithholdingTaxTotal")
    public List<TaxTotal> getWithholdingTaxTotal() {
        return withholdingTaxTotal;
    }

    /**
     * Invoice Line. Withholding_ Tax Total. Tax Total
     * <p>
     * A reference to a TaxTotal class describing the amount that has been withhold by the authorities, e.g. if the creditor is in dept because of non paid taxes.
     * 
     */
    @JsonProperty("WithholdingTaxTotal")
    public void setWithholdingTaxTotal(List<TaxTotal> withholdingTaxTotal) {
        this.withholdingTaxTotal = withholdingTaxTotal;
    }

    public InvoiceLine withWithholdingTaxTotal(List<TaxTotal> withholdingTaxTotal) {
        this.withholdingTaxTotal = withholdingTaxTotal;
        return this;
    }

    /**
     * Invoice Line. Item
     * <p>
     * The item associated with this invoice line.
     * (Required)
     * 
     */
    @JsonProperty("Item")
    public List<Item> getItem() {
        return item;
    }

    /**
     * Invoice Line. Item
     * <p>
     * The item associated with this invoice line.
     * (Required)
     * 
     */
    @JsonProperty("Item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    public InvoiceLine withItem(List<Item> item) {
        this.item = item;
        return this;
    }

    /**
     * Invoice Line. Price
     * <p>
     * The price of the item associated with this invoice line.
     * 
     */
    @JsonProperty("Price")
    public List<Price> getPrice() {
        return price;
    }

    /**
     * Invoice Line. Price
     * <p>
     * The price of the item associated with this invoice line.
     * 
     */
    @JsonProperty("Price")
    public void setPrice(List<Price> price) {
        this.price = price;
    }

    public InvoiceLine withPrice(List<Price> price) {
        this.price = price;
        return this;
    }

    /**
     * Invoice Line. Delivery Terms
     * <p>
     * Terms and conditions of the delivery associated with this invoice line.
     * 
     */
    @JsonProperty("DeliveryTerms")
    public List<DeliveryTerms> getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Invoice Line. Delivery Terms
     * <p>
     * Terms and conditions of the delivery associated with this invoice line.
     * 
     */
    @JsonProperty("DeliveryTerms")
    public void setDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public InvoiceLine withDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }

    /**
     * Invoice Line. Sub_ Invoice Line. Invoice Line
     * <p>
     * An invoice line subsidiary to this invoice line.
     * 
     */
    @JsonProperty("SubInvoiceLine")
    public List<InvoiceLine> getSubInvoiceLine() {
        return subInvoiceLine;
    }

    /**
     * Invoice Line. Sub_ Invoice Line. Invoice Line
     * <p>
     * An invoice line subsidiary to this invoice line.
     * 
     */
    @JsonProperty("SubInvoiceLine")
    public void setSubInvoiceLine(List<InvoiceLine> subInvoiceLine) {
        this.subInvoiceLine = subInvoiceLine;
    }

    public InvoiceLine withSubInvoiceLine(List<InvoiceLine> subInvoiceLine) {
        this.subInvoiceLine = subInvoiceLine;
        return this;
    }

    /**
     * Invoice Line. Item_ Price Extension. Price Extension
     * <p>
     * The price extension, calculated by multiplying the price per unit by the quantity of items on this invoice line.
     * 
     */
    @JsonProperty("ItemPriceExtension")
    public List<PriceExtension> getItemPriceExtension() {
        return itemPriceExtension;
    }

    /**
     * Invoice Line. Item_ Price Extension. Price Extension
     * <p>
     * The price extension, calculated by multiplying the price per unit by the quantity of items on this invoice line.
     * 
     */
    @JsonProperty("ItemPriceExtension")
    public void setItemPriceExtension(List<PriceExtension> itemPriceExtension) {
        this.itemPriceExtension = itemPriceExtension;
    }

    public InvoiceLine withItemPriceExtension(List<PriceExtension> itemPriceExtension) {
        this.itemPriceExtension = itemPriceExtension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("invoicedQuantity");
        sb.append('=');
        sb.append(((this.invoicedQuantity == null)?"<null>":this.invoicedQuantity));
        sb.append(',');
        sb.append("lineExtensionAmount");
        sb.append('=');
        sb.append(((this.lineExtensionAmount == null)?"<null>":this.lineExtensionAmount));
        sb.append(',');
        sb.append("taxPointDate");
        sb.append('=');
        sb.append(((this.taxPointDate == null)?"<null>":this.taxPointDate));
        sb.append(',');
        sb.append("accountingCostCode");
        sb.append('=');
        sb.append(((this.accountingCostCode == null)?"<null>":this.accountingCostCode));
        sb.append(',');
        sb.append("accountingCost");
        sb.append('=');
        sb.append(((this.accountingCost == null)?"<null>":this.accountingCost));
        sb.append(',');
        sb.append("paymentPurposeCode");
        sb.append('=');
        sb.append(((this.paymentPurposeCode == null)?"<null>":this.paymentPurposeCode));
        sb.append(',');
        sb.append("freeOfChargeIndicator");
        sb.append('=');
        sb.append(((this.freeOfChargeIndicator == null)?"<null>":this.freeOfChargeIndicator));
        sb.append(',');
        sb.append("invoicePeriod");
        sb.append('=');
        sb.append(((this.invoicePeriod == null)?"<null>":this.invoicePeriod));
        sb.append(',');
        sb.append("orderLineReference");
        sb.append('=');
        sb.append(((this.orderLineReference == null)?"<null>":this.orderLineReference));
        sb.append(',');
        sb.append("despatchLineReference");
        sb.append('=');
        sb.append(((this.despatchLineReference == null)?"<null>":this.despatchLineReference));
        sb.append(',');
        sb.append("receiptLineReference");
        sb.append('=');
        sb.append(((this.receiptLineReference == null)?"<null>":this.receiptLineReference));
        sb.append(',');
        sb.append("billingReference");
        sb.append('=');
        sb.append(((this.billingReference == null)?"<null>":this.billingReference));
        sb.append(',');
        sb.append("documentReference");
        sb.append('=');
        sb.append(((this.documentReference == null)?"<null>":this.documentReference));
        sb.append(',');
        sb.append("pricingReference");
        sb.append('=');
        sb.append(((this.pricingReference == null)?"<null>":this.pricingReference));
        sb.append(',');
        sb.append("originatorParty");
        sb.append('=');
        sb.append(((this.originatorParty == null)?"<null>":this.originatorParty));
        sb.append(',');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("allowanceCharge");
        sb.append('=');
        sb.append(((this.allowanceCharge == null)?"<null>":this.allowanceCharge));
        sb.append(',');
        sb.append("taxTotal");
        sb.append('=');
        sb.append(((this.taxTotal == null)?"<null>":this.taxTotal));
        sb.append(',');
        sb.append("withholdingTaxTotal");
        sb.append('=');
        sb.append(((this.withholdingTaxTotal == null)?"<null>":this.withholdingTaxTotal));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("deliveryTerms");
        sb.append('=');
        sb.append(((this.deliveryTerms == null)?"<null>":this.deliveryTerms));
        sb.append(',');
        sb.append("subInvoiceLine");
        sb.append('=');
        sb.append(((this.subInvoiceLine == null)?"<null>":this.subInvoiceLine));
        sb.append(',');
        sb.append("itemPriceExtension");
        sb.append('=');
        sb.append(((this.itemPriceExtension == null)?"<null>":this.itemPriceExtension));
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
        result = ((result* 31)+((this.pricingReference == null)? 0 :this.pricingReference.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.accountingCost == null)? 0 :this.accountingCost.hashCode()));
        result = ((result* 31)+((this.freeOfChargeIndicator == null)? 0 :this.freeOfChargeIndicator.hashCode()));
        result = ((result* 31)+((this.receiptLineReference == null)? 0 :this.receiptLineReference.hashCode()));
        result = ((result* 31)+((this.taxTotal == null)? 0 :this.taxTotal.hashCode()));
        result = ((result* 31)+((this.orderLineReference == null)? 0 :this.orderLineReference.hashCode()));
        result = ((result* 31)+((this.taxPointDate == null)? 0 :this.taxPointDate.hashCode()));
        result = ((result* 31)+((this.itemPriceExtension == null)? 0 :this.itemPriceExtension.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.despatchLineReference == null)? 0 :this.despatchLineReference.hashCode()));
        result = ((result* 31)+((this.invoicePeriod == null)? 0 :this.invoicePeriod.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.accountingCostCode == null)? 0 :this.accountingCostCode.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        result = ((result* 31)+((this.allowanceCharge == null)? 0 :this.allowanceCharge.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.deliveryTerms == null)? 0 :this.deliveryTerms.hashCode()));
        result = ((result* 31)+((this.paymentPurposeCode == null)? 0 :this.paymentPurposeCode.hashCode()));
        result = ((result* 31)+((this.subInvoiceLine == null)? 0 :this.subInvoiceLine.hashCode()));
        result = ((result* 31)+((this.originatorParty == null)? 0 :this.originatorParty.hashCode()));
        result = ((result* 31)+((this.withholdingTaxTotal == null)? 0 :this.withholdingTaxTotal.hashCode()));
        result = ((result* 31)+((this.invoicedQuantity == null)? 0 :this.invoicedQuantity.hashCode()));
        result = ((result* 31)+((this.lineExtensionAmount == null)? 0 :this.lineExtensionAmount.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.billingReference == null)? 0 :this.billingReference.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InvoiceLine) == false) {
            return false;
        }
        InvoiceLine rhs = ((InvoiceLine) other);
        return ((((((((((((((((((((((((((((((this.pricingReference == rhs.pricingReference)||((this.pricingReference!= null)&&this.pricingReference.equals(rhs.pricingReference)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.accountingCost == rhs.accountingCost)||((this.accountingCost!= null)&&this.accountingCost.equals(rhs.accountingCost))))&&((this.freeOfChargeIndicator == rhs.freeOfChargeIndicator)||((this.freeOfChargeIndicator!= null)&&this.freeOfChargeIndicator.equals(rhs.freeOfChargeIndicator))))&&((this.receiptLineReference == rhs.receiptLineReference)||((this.receiptLineReference!= null)&&this.receiptLineReference.equals(rhs.receiptLineReference))))&&((this.taxTotal == rhs.taxTotal)||((this.taxTotal!= null)&&this.taxTotal.equals(rhs.taxTotal))))&&((this.orderLineReference == rhs.orderLineReference)||((this.orderLineReference!= null)&&this.orderLineReference.equals(rhs.orderLineReference))))&&((this.taxPointDate == rhs.taxPointDate)||((this.taxPointDate!= null)&&this.taxPointDate.equals(rhs.taxPointDate))))&&((this.itemPriceExtension == rhs.itemPriceExtension)||((this.itemPriceExtension!= null)&&this.itemPriceExtension.equals(rhs.itemPriceExtension))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.despatchLineReference == rhs.despatchLineReference)||((this.despatchLineReference!= null)&&this.despatchLineReference.equals(rhs.despatchLineReference))))&&((this.invoicePeriod == rhs.invoicePeriod)||((this.invoicePeriod!= null)&&this.invoicePeriod.equals(rhs.invoicePeriod))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.accountingCostCode == rhs.accountingCostCode)||((this.accountingCostCode!= null)&&this.accountingCostCode.equals(rhs.accountingCostCode))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))))&&((this.allowanceCharge == rhs.allowanceCharge)||((this.allowanceCharge!= null)&&this.allowanceCharge.equals(rhs.allowanceCharge))))&&((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.deliveryTerms == rhs.deliveryTerms)||((this.deliveryTerms!= null)&&this.deliveryTerms.equals(rhs.deliveryTerms))))&&((this.paymentPurposeCode == rhs.paymentPurposeCode)||((this.paymentPurposeCode!= null)&&this.paymentPurposeCode.equals(rhs.paymentPurposeCode))))&&((this.subInvoiceLine == rhs.subInvoiceLine)||((this.subInvoiceLine!= null)&&this.subInvoiceLine.equals(rhs.subInvoiceLine))))&&((this.originatorParty == rhs.originatorParty)||((this.originatorParty!= null)&&this.originatorParty.equals(rhs.originatorParty))))&&((this.withholdingTaxTotal == rhs.withholdingTaxTotal)||((this.withholdingTaxTotal!= null)&&this.withholdingTaxTotal.equals(rhs.withholdingTaxTotal))))&&((this.invoicedQuantity == rhs.invoicedQuantity)||((this.invoicedQuantity!= null)&&this.invoicedQuantity.equals(rhs.invoicedQuantity))))&&((this.lineExtensionAmount == rhs.lineExtensionAmount)||((this.lineExtensionAmount!= null)&&this.lineExtensionAmount.equals(rhs.lineExtensionAmount))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.billingReference == rhs.billingReference)||((this.billingReference!= null)&&this.billingReference.equals(rhs.billingReference))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))));
    }

}
