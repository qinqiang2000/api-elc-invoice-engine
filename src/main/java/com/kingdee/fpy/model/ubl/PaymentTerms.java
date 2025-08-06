
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Size;


/**
 * Payment Terms. Details
 * <p>
 * A class to describe a set of payment terms.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "PaymentMeansID",
    "PrepaidPaymentReferenceID",
    "Note",
    "ReferenceEventCode",
    "SettlementDiscountPercent",
    "PenaltySurchargePercent",
    "PaymentPercent",
    "Amount",
    "SettlementDiscountAmount",
    "PenaltyAmount",
    "PaymentTermsDetailsURI",
    "PaymentDueDate",
    "InstallmentDueDate",
    "InvoicingPartyReference",
    "SettlementPeriod",
    "PenaltyPeriod",
    "ExchangeRate",
    "ValidityPeriod"
})
@Generated("jsonschema2pojo")
public class PaymentTerms {

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
     * Payment Terms. Identifier
     * <p>
     * An identifier for this set of payment terms.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this set of payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Payment Terms. Payment Means Identifier. Identifier
     * <p>
     * An identifier for a means of payment associated with these payment terms.
     * 
     */
    @JsonProperty("PaymentMeansID")
    @JsonPropertyDescription("An identifier for a means of payment associated with these payment terms.")
    @Size(min = 1)
    @Valid
    private List<IdentifierType> paymentMeansID = new ArrayList<IdentifierType>();
    /**
     * Payment Terms. Prepaid Payment Reference Identifier. Identifier
     * <p>
     * An identifier for a reference to a prepaid payment.
     * 
     */
    @JsonProperty("PrepaidPaymentReferenceID")
    @JsonPropertyDescription("An identifier for a reference to a prepaid payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> prepaidPaymentReferenceID = new ArrayList<IdentifierType>();
    /**
     * Payment Terms. Note. Text
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
     * Payment Terms. Reference_ Event Code. Code
     * <p>
     * A code signifying the event during which these terms are offered.
     * 
     */
    @JsonProperty("ReferenceEventCode")
    @JsonPropertyDescription("A code signifying the event during which these terms are offered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> referenceEventCode = new ArrayList<CodeType>();
    /**
     * Payment Terms. Settlement_ Discount Percent. Percent
     * <p>
     * The percentage for the settlement discount that is offered for payment under these payment terms.
     * 
     */
    @JsonProperty("SettlementDiscountPercent")
    @JsonPropertyDescription("The percentage for the settlement discount that is offered for payment under these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> settlementDiscountPercent = new ArrayList<NumericType>();
    /**
     * Payment Terms. Penalty_ Surcharge Percent. Percent
     * <p>
     * The penalty for payment after the settlement period, expressed as a percentage of the payment.
     * 
     */
    @JsonProperty("PenaltySurchargePercent")
    @JsonPropertyDescription("The penalty for payment after the settlement period, expressed as a percentage of the payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> penaltySurchargePercent = new ArrayList<NumericType>();
    /**
     * Payment Terms. Payment Percent. Percent
     * <p>
     * The part of a payment, expressed as a percent, relevant for these payment terms.
     * 
     */
    @JsonProperty("PaymentPercent")
    @JsonPropertyDescription("The part of a payment, expressed as a percent, relevant for these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> paymentPercent = new ArrayList<NumericType>();
    /**
     * Payment Terms. Amount
     * <p>
     * The monetary amount covered by these payment terms.
     * 
     */
    @JsonProperty("Amount")
    @JsonPropertyDescription("The monetary amount covered by these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> amount = new ArrayList<AmountType>();
    /**
     * Payment Terms. Settlement_ Discount Amount. Amount
     * <p>
     * The amount of a settlement discount offered for payment under these payment terms.
     * 
     */
    @JsonProperty("SettlementDiscountAmount")
    @JsonPropertyDescription("The amount of a settlement discount offered for payment under these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> settlementDiscountAmount = new ArrayList<AmountType>();
    /**
     * Payment Terms. Penalty_ Amount. Amount
     * <p>
     * The monetary amount of the penalty for payment after the settlement period.
     * 
     */
    @JsonProperty("PenaltyAmount")
    @JsonPropertyDescription("The monetary amount of the penalty for payment after the settlement period.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> penaltyAmount = new ArrayList<AmountType>();
    /**
     * Payment Terms. Payment Terms Details URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing additional details regarding these payment terms.
     * 
     */
    @JsonProperty("PaymentTermsDetailsURI")
    @JsonPropertyDescription("The Uniform Resource Identifier (URI) of a document providing additional details regarding these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> paymentTermsDetailsURI = new ArrayList<IdentifierType>();
    /**
     * Payment Terms. Payment Due Date. Date
     * <p>
     * The due date for these payment terms.
     * 
     */
    @JsonProperty("PaymentDueDate")
    @JsonPropertyDescription("The due date for these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> paymentDueDate = new ArrayList<DateType>();
    /**
     * Payment Terms. Installment Due Date. Date
     * <p>
     * The due date for an installment payment for these payment terms.
     * 
     */
    @JsonProperty("InstallmentDueDate")
    @JsonPropertyDescription("The due date for an installment payment for these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> installmentDueDate = new ArrayList<DateType>();
    /**
     * Payment Terms. Invoicing Party_ Reference. Text
     * <p>
     * A reference to the payment terms used by the invoicing party. This may have been requested of the payer by the payee to accompany its remittance.
     * 
     */
    @JsonProperty("InvoicingPartyReference")
    @JsonPropertyDescription("A reference to the payment terms used by the invoicing party. This may have been requested of the payer by the payee to accompany its remittance.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> invoicingPartyReference = new ArrayList<TextType>();
    /**
     * Payment Terms. Settlement_ Period. Period
     * <p>
     * The period during which settlement may occur.
     * 
     */
    @JsonProperty("SettlementPeriod")
    @JsonPropertyDescription("The period during which settlement may occur.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> settlementPeriod = new ArrayList<Period>();
    /**
     * Payment Terms. Penalty_ Period. Period
     * <p>
     * The period during which penalties may apply.
     * 
     */
    @JsonProperty("PenaltyPeriod")
    @JsonPropertyDescription("The period during which penalties may apply.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> penaltyPeriod = new ArrayList<Period>();
    /**
     * Payment Terms. Exchange Rate
     * <p>
     * The currency exchange rate for purposes of these payment terms.
     * 
     */
    @JsonProperty("ExchangeRate")
    @JsonPropertyDescription("The currency exchange rate for purposes of these payment terms.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExchangeRate> exchangeRate = new ArrayList<ExchangeRate>();
    /**
     * Payment Terms. Validity_ Period. Period
     * <p>
     * The period during which these payment terms are valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("The period during which these payment terms are valid.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();

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

    public PaymentTerms withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Payment Terms. Identifier
     * <p>
     * An identifier for this set of payment terms.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Payment Terms. Identifier
     * <p>
     * An identifier for this set of payment terms.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public PaymentTerms withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Payment Terms. Payment Means Identifier. Identifier
     * <p>
     * An identifier for a means of payment associated with these payment terms.
     * 
     */
    @JsonProperty("PaymentMeansID")
    public List<IdentifierType> getPaymentMeansID() {
        return paymentMeansID;
    }

    /**
     * Payment Terms. Payment Means Identifier. Identifier
     * <p>
     * An identifier for a means of payment associated with these payment terms.
     * 
     */
    @JsonProperty("PaymentMeansID")
    public void setPaymentMeansID(List<IdentifierType> paymentMeansID) {
        this.paymentMeansID = paymentMeansID;
    }

    public PaymentTerms withPaymentMeansID(List<IdentifierType> paymentMeansID) {
        this.paymentMeansID = paymentMeansID;
        return this;
    }

    /**
     * Payment Terms. Prepaid Payment Reference Identifier. Identifier
     * <p>
     * An identifier for a reference to a prepaid payment.
     * 
     */
    @JsonProperty("PrepaidPaymentReferenceID")
    public List<IdentifierType> getPrepaidPaymentReferenceID() {
        return prepaidPaymentReferenceID;
    }

    /**
     * Payment Terms. Prepaid Payment Reference Identifier. Identifier
     * <p>
     * An identifier for a reference to a prepaid payment.
     * 
     */
    @JsonProperty("PrepaidPaymentReferenceID")
    public void setPrepaidPaymentReferenceID(List<IdentifierType> prepaidPaymentReferenceID) {
        this.prepaidPaymentReferenceID = prepaidPaymentReferenceID;
    }

    public PaymentTerms withPrepaidPaymentReferenceID(List<IdentifierType> prepaidPaymentReferenceID) {
        this.prepaidPaymentReferenceID = prepaidPaymentReferenceID;
        return this;
    }

    /**
     * Payment Terms. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Payment Terms. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public PaymentTerms withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Payment Terms. Reference_ Event Code. Code
     * <p>
     * A code signifying the event during which these terms are offered.
     * 
     */
    @JsonProperty("ReferenceEventCode")
    public List<CodeType> getReferenceEventCode() {
        return referenceEventCode;
    }

    /**
     * Payment Terms. Reference_ Event Code. Code
     * <p>
     * A code signifying the event during which these terms are offered.
     * 
     */
    @JsonProperty("ReferenceEventCode")
    public void setReferenceEventCode(List<CodeType> referenceEventCode) {
        this.referenceEventCode = referenceEventCode;
    }

    public PaymentTerms withReferenceEventCode(List<CodeType> referenceEventCode) {
        this.referenceEventCode = referenceEventCode;
        return this;
    }

    /**
     * Payment Terms. Settlement_ Discount Percent. Percent
     * <p>
     * The percentage for the settlement discount that is offered for payment under these payment terms.
     * 
     */
    @JsonProperty("SettlementDiscountPercent")
    public List<NumericType> getSettlementDiscountPercent() {
        return settlementDiscountPercent;
    }

    /**
     * Payment Terms. Settlement_ Discount Percent. Percent
     * <p>
     * The percentage for the settlement discount that is offered for payment under these payment terms.
     * 
     */
    @JsonProperty("SettlementDiscountPercent")
    public void setSettlementDiscountPercent(List<NumericType> settlementDiscountPercent) {
        this.settlementDiscountPercent = settlementDiscountPercent;
    }

    public PaymentTerms withSettlementDiscountPercent(List<NumericType> settlementDiscountPercent) {
        this.settlementDiscountPercent = settlementDiscountPercent;
        return this;
    }

    /**
     * Payment Terms. Penalty_ Surcharge Percent. Percent
     * <p>
     * The penalty for payment after the settlement period, expressed as a percentage of the payment.
     * 
     */
    @JsonProperty("PenaltySurchargePercent")
    public List<NumericType> getPenaltySurchargePercent() {
        return penaltySurchargePercent;
    }

    /**
     * Payment Terms. Penalty_ Surcharge Percent. Percent
     * <p>
     * The penalty for payment after the settlement period, expressed as a percentage of the payment.
     * 
     */
    @JsonProperty("PenaltySurchargePercent")
    public void setPenaltySurchargePercent(List<NumericType> penaltySurchargePercent) {
        this.penaltySurchargePercent = penaltySurchargePercent;
    }

    public PaymentTerms withPenaltySurchargePercent(List<NumericType> penaltySurchargePercent) {
        this.penaltySurchargePercent = penaltySurchargePercent;
        return this;
    }

    /**
     * Payment Terms. Payment Percent. Percent
     * <p>
     * The part of a payment, expressed as a percent, relevant for these payment terms.
     * 
     */
    @JsonProperty("PaymentPercent")
    public List<NumericType> getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Payment Terms. Payment Percent. Percent
     * <p>
     * The part of a payment, expressed as a percent, relevant for these payment terms.
     * 
     */
    @JsonProperty("PaymentPercent")
    public void setPaymentPercent(List<NumericType> paymentPercent) {
        this.paymentPercent = paymentPercent;
    }

    public PaymentTerms withPaymentPercent(List<NumericType> paymentPercent) {
        this.paymentPercent = paymentPercent;
        return this;
    }

    /**
     * Payment Terms. Amount
     * <p>
     * The monetary amount covered by these payment terms.
     * 
     */
    @JsonProperty("Amount")
    public List<AmountType> getAmount() {
        return amount;
    }

    /**
     * Payment Terms. Amount
     * <p>
     * The monetary amount covered by these payment terms.
     * 
     */
    @JsonProperty("Amount")
    public void setAmount(List<AmountType> amount) {
        this.amount = amount;
    }

    public PaymentTerms withAmount(List<AmountType> amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Payment Terms. Settlement_ Discount Amount. Amount
     * <p>
     * The amount of a settlement discount offered for payment under these payment terms.
     * 
     */
    @JsonProperty("SettlementDiscountAmount")
    public List<AmountType> getSettlementDiscountAmount() {
        return settlementDiscountAmount;
    }

    /**
     * Payment Terms. Settlement_ Discount Amount. Amount
     * <p>
     * The amount of a settlement discount offered for payment under these payment terms.
     * 
     */
    @JsonProperty("SettlementDiscountAmount")
    public void setSettlementDiscountAmount(List<AmountType> settlementDiscountAmount) {
        this.settlementDiscountAmount = settlementDiscountAmount;
    }

    public PaymentTerms withSettlementDiscountAmount(List<AmountType> settlementDiscountAmount) {
        this.settlementDiscountAmount = settlementDiscountAmount;
        return this;
    }

    /**
     * Payment Terms. Penalty_ Amount. Amount
     * <p>
     * The monetary amount of the penalty for payment after the settlement period.
     * 
     */
    @JsonProperty("PenaltyAmount")
    public List<AmountType> getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Payment Terms. Penalty_ Amount. Amount
     * <p>
     * The monetary amount of the penalty for payment after the settlement period.
     * 
     */
    @JsonProperty("PenaltyAmount")
    public void setPenaltyAmount(List<AmountType> penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public PaymentTerms withPenaltyAmount(List<AmountType> penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
        return this;
    }

    /**
     * Payment Terms. Payment Terms Details URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing additional details regarding these payment terms.
     * 
     */
    @JsonProperty("PaymentTermsDetailsURI")
    public List<IdentifierType> getPaymentTermsDetailsURI() {
        return paymentTermsDetailsURI;
    }

    /**
     * Payment Terms. Payment Terms Details URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing additional details regarding these payment terms.
     * 
     */
    @JsonProperty("PaymentTermsDetailsURI")
    public void setPaymentTermsDetailsURI(List<IdentifierType> paymentTermsDetailsURI) {
        this.paymentTermsDetailsURI = paymentTermsDetailsURI;
    }

    public PaymentTerms withPaymentTermsDetailsURI(List<IdentifierType> paymentTermsDetailsURI) {
        this.paymentTermsDetailsURI = paymentTermsDetailsURI;
        return this;
    }

    /**
     * Payment Terms. Payment Due Date. Date
     * <p>
     * The due date for these payment terms.
     * 
     */
    @JsonProperty("PaymentDueDate")
    public List<DateType> getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Payment Terms. Payment Due Date. Date
     * <p>
     * The due date for these payment terms.
     * 
     */
    @JsonProperty("PaymentDueDate")
    public void setPaymentDueDate(List<DateType> paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public PaymentTerms withPaymentDueDate(List<DateType> paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
        return this;
    }

    /**
     * Payment Terms. Installment Due Date. Date
     * <p>
     * The due date for an installment payment for these payment terms.
     * 
     */
    @JsonProperty("InstallmentDueDate")
    public List<DateType> getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Payment Terms. Installment Due Date. Date
     * <p>
     * The due date for an installment payment for these payment terms.
     * 
     */
    @JsonProperty("InstallmentDueDate")
    public void setInstallmentDueDate(List<DateType> installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    public PaymentTerms withInstallmentDueDate(List<DateType> installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
        return this;
    }

    /**
     * Payment Terms. Invoicing Party_ Reference. Text
     * <p>
     * A reference to the payment terms used by the invoicing party. This may have been requested of the payer by the payee to accompany its remittance.
     * 
     */
    @JsonProperty("InvoicingPartyReference")
    public List<TextType> getInvoicingPartyReference() {
        return invoicingPartyReference;
    }

    /**
     * Payment Terms. Invoicing Party_ Reference. Text
     * <p>
     * A reference to the payment terms used by the invoicing party. This may have been requested of the payer by the payee to accompany its remittance.
     * 
     */
    @JsonProperty("InvoicingPartyReference")
    public void setInvoicingPartyReference(List<TextType> invoicingPartyReference) {
        this.invoicingPartyReference = invoicingPartyReference;
    }

    public PaymentTerms withInvoicingPartyReference(List<TextType> invoicingPartyReference) {
        this.invoicingPartyReference = invoicingPartyReference;
        return this;
    }

    /**
     * Payment Terms. Settlement_ Period. Period
     * <p>
     * The period during which settlement may occur.
     * 
     */
    @JsonProperty("SettlementPeriod")
    public List<Period> getSettlementPeriod() {
        return settlementPeriod;
    }

    /**
     * Payment Terms. Settlement_ Period. Period
     * <p>
     * The period during which settlement may occur.
     * 
     */
    @JsonProperty("SettlementPeriod")
    public void setSettlementPeriod(List<Period> settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public PaymentTerms withSettlementPeriod(List<Period> settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
        return this;
    }

    /**
     * Payment Terms. Penalty_ Period. Period
     * <p>
     * The period during which penalties may apply.
     * 
     */
    @JsonProperty("PenaltyPeriod")
    public List<Period> getPenaltyPeriod() {
        return penaltyPeriod;
    }

    /**
     * Payment Terms. Penalty_ Period. Period
     * <p>
     * The period during which penalties may apply.
     * 
     */
    @JsonProperty("PenaltyPeriod")
    public void setPenaltyPeriod(List<Period> penaltyPeriod) {
        this.penaltyPeriod = penaltyPeriod;
    }

    public PaymentTerms withPenaltyPeriod(List<Period> penaltyPeriod) {
        this.penaltyPeriod = penaltyPeriod;
        return this;
    }

    /**
     * Payment Terms. Exchange Rate
     * <p>
     * The currency exchange rate for purposes of these payment terms.
     * 
     */
    @JsonProperty("ExchangeRate")
    public List<ExchangeRate> getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Payment Terms. Exchange Rate
     * <p>
     * The currency exchange rate for purposes of these payment terms.
     * 
     */
    @JsonProperty("ExchangeRate")
    public void setExchangeRate(List<ExchangeRate> exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public PaymentTerms withExchangeRate(List<ExchangeRate> exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    /**
     * Payment Terms. Validity_ Period. Period
     * <p>
     * The period during which these payment terms are valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Payment Terms. Validity_ Period. Period
     * <p>
     * The period during which these payment terms are valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public PaymentTerms withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentTerms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("paymentMeansID");
        sb.append('=');
        sb.append(((this.paymentMeansID == null)?"<null>":this.paymentMeansID));
        sb.append(',');
        sb.append("prepaidPaymentReferenceID");
        sb.append('=');
        sb.append(((this.prepaidPaymentReferenceID == null)?"<null>":this.prepaidPaymentReferenceID));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("referenceEventCode");
        sb.append('=');
        sb.append(((this.referenceEventCode == null)?"<null>":this.referenceEventCode));
        sb.append(',');
        sb.append("settlementDiscountPercent");
        sb.append('=');
        sb.append(((this.settlementDiscountPercent == null)?"<null>":this.settlementDiscountPercent));
        sb.append(',');
        sb.append("penaltySurchargePercent");
        sb.append('=');
        sb.append(((this.penaltySurchargePercent == null)?"<null>":this.penaltySurchargePercent));
        sb.append(',');
        sb.append("paymentPercent");
        sb.append('=');
        sb.append(((this.paymentPercent == null)?"<null>":this.paymentPercent));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("settlementDiscountAmount");
        sb.append('=');
        sb.append(((this.settlementDiscountAmount == null)?"<null>":this.settlementDiscountAmount));
        sb.append(',');
        sb.append("penaltyAmount");
        sb.append('=');
        sb.append(((this.penaltyAmount == null)?"<null>":this.penaltyAmount));
        sb.append(',');
        sb.append("paymentTermsDetailsURI");
        sb.append('=');
        sb.append(((this.paymentTermsDetailsURI == null)?"<null>":this.paymentTermsDetailsURI));
        sb.append(',');
        sb.append("paymentDueDate");
        sb.append('=');
        sb.append(((this.paymentDueDate == null)?"<null>":this.paymentDueDate));
        sb.append(',');
        sb.append("installmentDueDate");
        sb.append('=');
        sb.append(((this.installmentDueDate == null)?"<null>":this.installmentDueDate));
        sb.append(',');
        sb.append("invoicingPartyReference");
        sb.append('=');
        sb.append(((this.invoicingPartyReference == null)?"<null>":this.invoicingPartyReference));
        sb.append(',');
        sb.append("settlementPeriod");
        sb.append('=');
        sb.append(((this.settlementPeriod == null)?"<null>":this.settlementPeriod));
        sb.append(',');
        sb.append("penaltyPeriod");
        sb.append('=');
        sb.append(((this.penaltyPeriod == null)?"<null>":this.penaltyPeriod));
        sb.append(',');
        sb.append("exchangeRate");
        sb.append('=');
        sb.append(((this.exchangeRate == null)?"<null>":this.exchangeRate));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.settlementPeriod == null)? 0 :this.settlementPeriod.hashCode()));
        result = ((result* 31)+((this.penaltyPeriod == null)? 0 :this.penaltyPeriod.hashCode()));
        result = ((result* 31)+((this.paymentPercent == null)? 0 :this.paymentPercent.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.paymentMeansID == null)? 0 :this.paymentMeansID.hashCode()));
        result = ((result* 31)+((this.paymentDueDate == null)? 0 :this.paymentDueDate.hashCode()));
        result = ((result* 31)+((this.invoicingPartyReference == null)? 0 :this.invoicingPartyReference.hashCode()));
        result = ((result* 31)+((this.prepaidPaymentReferenceID == null)? 0 :this.prepaidPaymentReferenceID.hashCode()));
        result = ((result* 31)+((this.referenceEventCode == null)? 0 :this.referenceEventCode.hashCode()));
        result = ((result* 31)+((this.exchangeRate == null)? 0 :this.exchangeRate.hashCode()));
        result = ((result* 31)+((this.settlementDiscountPercent == null)? 0 :this.settlementDiscountPercent.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.installmentDueDate == null)? 0 :this.installmentDueDate.hashCode()));
        result = ((result* 31)+((this.penaltySurchargePercent == null)? 0 :this.penaltySurchargePercent.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.penaltyAmount == null)? 0 :this.penaltyAmount.hashCode()));
        result = ((result* 31)+((this.settlementDiscountAmount == null)? 0 :this.settlementDiscountAmount.hashCode()));
        result = ((result* 31)+((this.paymentTermsDetailsURI == null)? 0 :this.paymentTermsDetailsURI.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentTerms) == false) {
            return false;
        }
        PaymentTerms rhs = ((PaymentTerms) other);
        return (((((((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.settlementPeriod == rhs.settlementPeriod)||((this.settlementPeriod!= null)&&this.settlementPeriod.equals(rhs.settlementPeriod))))&&((this.penaltyPeriod == rhs.penaltyPeriod)||((this.penaltyPeriod!= null)&&this.penaltyPeriod.equals(rhs.penaltyPeriod))))&&((this.paymentPercent == rhs.paymentPercent)||((this.paymentPercent!= null)&&this.paymentPercent.equals(rhs.paymentPercent))))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.paymentMeansID == rhs.paymentMeansID)||((this.paymentMeansID!= null)&&this.paymentMeansID.equals(rhs.paymentMeansID))))&&((this.paymentDueDate == rhs.paymentDueDate)||((this.paymentDueDate!= null)&&this.paymentDueDate.equals(rhs.paymentDueDate))))&&((this.invoicingPartyReference == rhs.invoicingPartyReference)||((this.invoicingPartyReference!= null)&&this.invoicingPartyReference.equals(rhs.invoicingPartyReference))))&&((this.prepaidPaymentReferenceID == rhs.prepaidPaymentReferenceID)||((this.prepaidPaymentReferenceID!= null)&&this.prepaidPaymentReferenceID.equals(rhs.prepaidPaymentReferenceID))))&&((this.referenceEventCode == rhs.referenceEventCode)||((this.referenceEventCode!= null)&&this.referenceEventCode.equals(rhs.referenceEventCode))))&&((this.exchangeRate == rhs.exchangeRate)||((this.exchangeRate!= null)&&this.exchangeRate.equals(rhs.exchangeRate))))&&((this.settlementDiscountPercent == rhs.settlementDiscountPercent)||((this.settlementDiscountPercent!= null)&&this.settlementDiscountPercent.equals(rhs.settlementDiscountPercent))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.installmentDueDate == rhs.installmentDueDate)||((this.installmentDueDate!= null)&&this.installmentDueDate.equals(rhs.installmentDueDate))))&&((this.penaltySurchargePercent == rhs.penaltySurchargePercent)||((this.penaltySurchargePercent!= null)&&this.penaltySurchargePercent.equals(rhs.penaltySurchargePercent))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.penaltyAmount == rhs.penaltyAmount)||((this.penaltyAmount!= null)&&this.penaltyAmount.equals(rhs.penaltyAmount))))&&((this.settlementDiscountAmount == rhs.settlementDiscountAmount)||((this.settlementDiscountAmount!= null)&&this.settlementDiscountAmount.equals(rhs.settlementDiscountAmount))))&&((this.paymentTermsDetailsURI == rhs.paymentTermsDetailsURI)||((this.paymentTermsDetailsURI!= null)&&this.paymentTermsDetailsURI.equals(rhs.paymentTermsDetailsURI))));
    }

}
