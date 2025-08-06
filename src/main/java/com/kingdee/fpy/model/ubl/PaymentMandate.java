
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
 * Payment Mandate. Details
 * <p>
 * A class to describe a payment mandate.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "MandateTypeCode",
    "MaximumPaymentInstructionsNumeric",
    "MaximumPaidAmount",
    "SignatureID",
    "PayerParty",
    "PayerFinancialAccount",
    "ValidityPeriod",
    "PaymentReversalPeriod",
    "Clause"
})
@Generated("jsonschema2pojo")
public class PaymentMandate {

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
     * Payment Mandate. Identifier
     * <p>
     * An identifier for this payment mandate.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this payment mandate.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Payment Mandate. Mandate Type Code. Code
     * <p>
     * A code signifying the type of this payment mandate.
     * 
     */
    @JsonProperty("MandateTypeCode")
    @JsonPropertyDescription("A code signifying the type of this payment mandate.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> mandateTypeCode = new ArrayList<CodeType>();
    /**
     * Payment Mandate. Maximum Payment Instructions. Numeric
     * <p>
     * The number of maximum payment instructions allowed within the validity period.
     * 
     */
    @JsonProperty("MaximumPaymentInstructionsNumeric")
    @JsonPropertyDescription("The number of maximum payment instructions allowed within the validity period.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> maximumPaymentInstructionsNumeric = new ArrayList<NumericType>();
    /**
     * Payment Mandate. Maximum_ Paid Amount. Amount
     * <p>
     * The maximum amount to be paid within a single instruction.
     * 
     */
    @JsonProperty("MaximumPaidAmount")
    @JsonPropertyDescription("The maximum amount to be paid within a single instruction.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> maximumPaidAmount = new ArrayList<AmountType>();
    /**
     * Payment Mandate. Signature Identifier. Identifier
     * <p>
     * An identifier for a signature applied by a signatory party.
     * 
     */
    @JsonProperty("SignatureID")
    @JsonPropertyDescription("An identifier for a signature applied by a signatory party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> signatureID = new ArrayList<IdentifierType>();
    /**
     * Payment Mandate. Payer_ Party. Party
     * <p>
     * The payer party (if different from the debtor).
     * 
     */
    @JsonProperty("PayerParty")
    @JsonPropertyDescription("The payer party (if different from the debtor).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> payerParty = new ArrayList<Party>();
    /**
     * Payment Mandate. Payer_ Financial Account. Financial Account
     * <p>
     * The payer's financial account.
     * 
     */
    @JsonProperty("PayerFinancialAccount")
    @JsonPropertyDescription("The payer's financial account.")
    @Size(min = 1, max = 1)
    @Valid
    private List<FinancialAccount> payerFinancialAccount = new ArrayList<FinancialAccount>();
    /**
     * Payment Mandate. Validity_ Period. Period
     * <p>
     * The period during which this mandate is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("The period during which this mandate is valid.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();
    /**
     * Payment Mandate. Payment Reversal_ Period. Period
     * <p>
     * The period of the reverse payment.
     * 
     */
    @JsonProperty("PaymentReversalPeriod")
    @JsonPropertyDescription("The period of the reverse payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> paymentReversalPeriod = new ArrayList<Period>();
    /**
     * Payment Mandate. Clause
     * <p>
     * A clause applicable to this payment mandate.
     * 
     */
    @JsonProperty("Clause")
    @JsonPropertyDescription("A clause applicable to this payment mandate.")
    @Size(min = 1)
    @Valid
    private List<Clause> clause = new ArrayList<Clause>();

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

    public PaymentMandate withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Payment Mandate. Identifier
     * <p>
     * An identifier for this payment mandate.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Payment Mandate. Identifier
     * <p>
     * An identifier for this payment mandate.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public PaymentMandate withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Payment Mandate. Mandate Type Code. Code
     * <p>
     * A code signifying the type of this payment mandate.
     * 
     */
    @JsonProperty("MandateTypeCode")
    public List<CodeType> getMandateTypeCode() {
        return mandateTypeCode;
    }

    /**
     * Payment Mandate. Mandate Type Code. Code
     * <p>
     * A code signifying the type of this payment mandate.
     * 
     */
    @JsonProperty("MandateTypeCode")
    public void setMandateTypeCode(List<CodeType> mandateTypeCode) {
        this.mandateTypeCode = mandateTypeCode;
    }

    public PaymentMandate withMandateTypeCode(List<CodeType> mandateTypeCode) {
        this.mandateTypeCode = mandateTypeCode;
        return this;
    }

    /**
     * Payment Mandate. Maximum Payment Instructions. Numeric
     * <p>
     * The number of maximum payment instructions allowed within the validity period.
     * 
     */
    @JsonProperty("MaximumPaymentInstructionsNumeric")
    public List<NumericType> getMaximumPaymentInstructionsNumeric() {
        return maximumPaymentInstructionsNumeric;
    }

    /**
     * Payment Mandate. Maximum Payment Instructions. Numeric
     * <p>
     * The number of maximum payment instructions allowed within the validity period.
     * 
     */
    @JsonProperty("MaximumPaymentInstructionsNumeric")
    public void setMaximumPaymentInstructionsNumeric(List<NumericType> maximumPaymentInstructionsNumeric) {
        this.maximumPaymentInstructionsNumeric = maximumPaymentInstructionsNumeric;
    }

    public PaymentMandate withMaximumPaymentInstructionsNumeric(List<NumericType> maximumPaymentInstructionsNumeric) {
        this.maximumPaymentInstructionsNumeric = maximumPaymentInstructionsNumeric;
        return this;
    }

    /**
     * Payment Mandate. Maximum_ Paid Amount. Amount
     * <p>
     * The maximum amount to be paid within a single instruction.
     * 
     */
    @JsonProperty("MaximumPaidAmount")
    public List<AmountType> getMaximumPaidAmount() {
        return maximumPaidAmount;
    }

    /**
     * Payment Mandate. Maximum_ Paid Amount. Amount
     * <p>
     * The maximum amount to be paid within a single instruction.
     * 
     */
    @JsonProperty("MaximumPaidAmount")
    public void setMaximumPaidAmount(List<AmountType> maximumPaidAmount) {
        this.maximumPaidAmount = maximumPaidAmount;
    }

    public PaymentMandate withMaximumPaidAmount(List<AmountType> maximumPaidAmount) {
        this.maximumPaidAmount = maximumPaidAmount;
        return this;
    }

    /**
     * Payment Mandate. Signature Identifier. Identifier
     * <p>
     * An identifier for a signature applied by a signatory party.
     * 
     */
    @JsonProperty("SignatureID")
    public List<IdentifierType> getSignatureID() {
        return signatureID;
    }

    /**
     * Payment Mandate. Signature Identifier. Identifier
     * <p>
     * An identifier for a signature applied by a signatory party.
     * 
     */
    @JsonProperty("SignatureID")
    public void setSignatureID(List<IdentifierType> signatureID) {
        this.signatureID = signatureID;
    }

    public PaymentMandate withSignatureID(List<IdentifierType> signatureID) {
        this.signatureID = signatureID;
        return this;
    }

    /**
     * Payment Mandate. Payer_ Party. Party
     * <p>
     * The payer party (if different from the debtor).
     * 
     */
    @JsonProperty("PayerParty")
    public List<Party> getPayerParty() {
        return payerParty;
    }

    /**
     * Payment Mandate. Payer_ Party. Party
     * <p>
     * The payer party (if different from the debtor).
     * 
     */
    @JsonProperty("PayerParty")
    public void setPayerParty(List<Party> payerParty) {
        this.payerParty = payerParty;
    }

    public PaymentMandate withPayerParty(List<Party> payerParty) {
        this.payerParty = payerParty;
        return this;
    }

    /**
     * Payment Mandate. Payer_ Financial Account. Financial Account
     * <p>
     * The payer's financial account.
     * 
     */
    @JsonProperty("PayerFinancialAccount")
    public List<FinancialAccount> getPayerFinancialAccount() {
        return payerFinancialAccount;
    }

    /**
     * Payment Mandate. Payer_ Financial Account. Financial Account
     * <p>
     * The payer's financial account.
     * 
     */
    @JsonProperty("PayerFinancialAccount")
    public void setPayerFinancialAccount(List<FinancialAccount> payerFinancialAccount) {
        this.payerFinancialAccount = payerFinancialAccount;
    }

    public PaymentMandate withPayerFinancialAccount(List<FinancialAccount> payerFinancialAccount) {
        this.payerFinancialAccount = payerFinancialAccount;
        return this;
    }

    /**
     * Payment Mandate. Validity_ Period. Period
     * <p>
     * The period during which this mandate is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Payment Mandate. Validity_ Period. Period
     * <p>
     * The period during which this mandate is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public PaymentMandate withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Payment Mandate. Payment Reversal_ Period. Period
     * <p>
     * The period of the reverse payment.
     * 
     */
    @JsonProperty("PaymentReversalPeriod")
    public List<Period> getPaymentReversalPeriod() {
        return paymentReversalPeriod;
    }

    /**
     * Payment Mandate. Payment Reversal_ Period. Period
     * <p>
     * The period of the reverse payment.
     * 
     */
    @JsonProperty("PaymentReversalPeriod")
    public void setPaymentReversalPeriod(List<Period> paymentReversalPeriod) {
        this.paymentReversalPeriod = paymentReversalPeriod;
    }

    public PaymentMandate withPaymentReversalPeriod(List<Period> paymentReversalPeriod) {
        this.paymentReversalPeriod = paymentReversalPeriod;
        return this;
    }

    /**
     * Payment Mandate. Clause
     * <p>
     * A clause applicable to this payment mandate.
     * 
     */
    @JsonProperty("Clause")
    public List<Clause> getClause() {
        return clause;
    }

    /**
     * Payment Mandate. Clause
     * <p>
     * A clause applicable to this payment mandate.
     * 
     */
    @JsonProperty("Clause")
    public void setClause(List<Clause> clause) {
        this.clause = clause;
    }

    public PaymentMandate withClause(List<Clause> clause) {
        this.clause = clause;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentMandate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mandateTypeCode");
        sb.append('=');
        sb.append(((this.mandateTypeCode == null)?"<null>":this.mandateTypeCode));
        sb.append(',');
        sb.append("maximumPaymentInstructionsNumeric");
        sb.append('=');
        sb.append(((this.maximumPaymentInstructionsNumeric == null)?"<null>":this.maximumPaymentInstructionsNumeric));
        sb.append(',');
        sb.append("maximumPaidAmount");
        sb.append('=');
        sb.append(((this.maximumPaidAmount == null)?"<null>":this.maximumPaidAmount));
        sb.append(',');
        sb.append("signatureID");
        sb.append('=');
        sb.append(((this.signatureID == null)?"<null>":this.signatureID));
        sb.append(',');
        sb.append("payerParty");
        sb.append('=');
        sb.append(((this.payerParty == null)?"<null>":this.payerParty));
        sb.append(',');
        sb.append("payerFinancialAccount");
        sb.append('=');
        sb.append(((this.payerFinancialAccount == null)?"<null>":this.payerFinancialAccount));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("paymentReversalPeriod");
        sb.append('=');
        sb.append(((this.paymentReversalPeriod == null)?"<null>":this.paymentReversalPeriod));
        sb.append(',');
        sb.append("clause");
        sb.append('=');
        sb.append(((this.clause == null)?"<null>":this.clause));
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
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.clause == null)? 0 :this.clause.hashCode()));
        result = ((result* 31)+((this.payerParty == null)? 0 :this.payerParty.hashCode()));
        result = ((result* 31)+((this.paymentReversalPeriod == null)? 0 :this.paymentReversalPeriod.hashCode()));
        result = ((result* 31)+((this.maximumPaymentInstructionsNumeric == null)? 0 :this.maximumPaymentInstructionsNumeric.hashCode()));
        result = ((result* 31)+((this.payerFinancialAccount == null)? 0 :this.payerFinancialAccount.hashCode()));
        result = ((result* 31)+((this.mandateTypeCode == null)? 0 :this.mandateTypeCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.signatureID == null)? 0 :this.signatureID.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.maximumPaidAmount == null)? 0 :this.maximumPaidAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentMandate) == false) {
            return false;
        }
        PaymentMandate rhs = ((PaymentMandate) other);
        return ((((((((((((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod)))&&((this.clause == rhs.clause)||((this.clause!= null)&&this.clause.equals(rhs.clause))))&&((this.payerParty == rhs.payerParty)||((this.payerParty!= null)&&this.payerParty.equals(rhs.payerParty))))&&((this.paymentReversalPeriod == rhs.paymentReversalPeriod)||((this.paymentReversalPeriod!= null)&&this.paymentReversalPeriod.equals(rhs.paymentReversalPeriod))))&&((this.maximumPaymentInstructionsNumeric == rhs.maximumPaymentInstructionsNumeric)||((this.maximumPaymentInstructionsNumeric!= null)&&this.maximumPaymentInstructionsNumeric.equals(rhs.maximumPaymentInstructionsNumeric))))&&((this.payerFinancialAccount == rhs.payerFinancialAccount)||((this.payerFinancialAccount!= null)&&this.payerFinancialAccount.equals(rhs.payerFinancialAccount))))&&((this.mandateTypeCode == rhs.mandateTypeCode)||((this.mandateTypeCode!= null)&&this.mandateTypeCode.equals(rhs.mandateTypeCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.signatureID == rhs.signatureID)||((this.signatureID!= null)&&this.signatureID.equals(rhs.signatureID))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.maximumPaidAmount == rhs.maximumPaidAmount)||((this.maximumPaidAmount!= null)&&this.maximumPaidAmount.equals(rhs.maximumPaidAmount))));
    }

}
