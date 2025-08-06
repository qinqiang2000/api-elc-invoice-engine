
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
 * Payment Means. Details
 * <p>
 * A class to describe a means of payment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "PaymentMeansCode",
    "PaymentDueDate",
    "PaymentChannelCode",
    "InstructionID",
    "InstructionNote",
    "PaymentID",
    "CardAccount",
    "PayerFinancialAccount",
    "PayeeFinancialAccount",
    "CreditAccount",
    "PaymentMandate",
    "TradeFinancing"
})
@Generated("jsonschema2pojo")
public class PaymentMeans {

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
     * Payment Means. Identifier
     * <p>
     * An identifier for this means of payment.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Payment Means. Payment Means Code. Code
     * <p>
     * A code signifying the type of this means of payment.
     * (Required)
     * 
     */
    @JsonProperty("PaymentMeansCode")
    @JsonPropertyDescription("A code signifying the type of this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> paymentMeansCode = new ArrayList<CodeType>();
    /**
     * Payment Means. Payment Due Date. Date
     * <p>
     * The date on which payment is due for this means of payment.
     * 
     */
    @JsonProperty("PaymentDueDate")
    @JsonPropertyDescription("The date on which payment is due for this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> paymentDueDate = new ArrayList<DateType>();
    /**
     * Payment Means. Payment Channel Code. Code
     * <p>
     * A code signifying the payment channel for this means of payment.
     * 
     */
    @JsonProperty("PaymentChannelCode")
    @JsonPropertyDescription("A code signifying the payment channel for this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> paymentChannelCode = new ArrayList<CodeType>();
    /**
     * Payment Means. Instruction Identifier. Identifier
     * <p>
     * An identifier for the payment instruction.
     * 
     */
    @JsonProperty("InstructionID")
    @JsonPropertyDescription("An identifier for the payment instruction.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> instructionID = new ArrayList<IdentifierType>();
    /**
     * Payment Means. Instruction_ Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("InstructionNote")
    @JsonPropertyDescription("Free-form text conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> instructionNote = new ArrayList<TextType>();
    /**
     * Payment Means. Payment Identifier. Identifier
     * <p>
     * An identifier for a payment made using this means of payment.
     * 
     */
    @JsonProperty("PaymentID")
    @JsonPropertyDescription("An identifier for a payment made using this means of payment.")
    @Size(min = 1)
    @Valid
    private List<IdentifierType> paymentID = new ArrayList<IdentifierType>();
    /**
     * Payment Means. Card Account
     * <p>
     * A credit card, debit card, or charge card account that constitutes this means of payment.
     * 
     */
    @JsonProperty("CardAccount")
    @JsonPropertyDescription("A credit card, debit card, or charge card account that constitutes this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CardAccount> cardAccount = new ArrayList<CardAccount>();
    /**
     * Payment Means. Payer_ Financial Account. Financial Account
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
     * Payment Means. Payee_ Financial Account. Financial Account
     * <p>
     * The payee's financial account.
     * 
     */
    @JsonProperty("PayeeFinancialAccount")
    @JsonPropertyDescription("The payee's financial account.")
    @Size(min = 1, max = 1)
    @Valid
    private List<FinancialAccount> payeeFinancialAccount = new ArrayList<FinancialAccount>();
    /**
     * Payment Means. Credit Account
     * <p>
     * A credit account associated with this means of payment.
     * 
     */
    @JsonProperty("CreditAccount")
    @JsonPropertyDescription("A credit account associated with this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CreditAccount> creditAccount = new ArrayList<CreditAccount>();
    /**
     * Payment Means. Payment Mandate
     * <p>
     * The payment mandate associated with this means of payment.
     * 
     */
    @JsonProperty("PaymentMandate")
    @JsonPropertyDescription("The payment mandate associated with this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PaymentMandate> paymentMandate = new ArrayList<PaymentMandate>();
    /**
     * Payment Means. Trade Financing
     * <p>
     * A trade finance agreement applicable to this means of payment.
     * 
     */
    @JsonProperty("TradeFinancing")
    @JsonPropertyDescription("A trade finance agreement applicable to this means of payment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TradeFinancing> tradeFinancing = new ArrayList<TradeFinancing>();

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

    public PaymentMeans withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Payment Means. Identifier
     * <p>
     * An identifier for this means of payment.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Payment Means. Identifier
     * <p>
     * An identifier for this means of payment.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public PaymentMeans withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Payment Means. Payment Means Code. Code
     * <p>
     * A code signifying the type of this means of payment.
     * (Required)
     * 
     */
    @JsonProperty("PaymentMeansCode")
    public List<CodeType> getPaymentMeansCode() {
        return paymentMeansCode;
    }

    /**
     * Payment Means. Payment Means Code. Code
     * <p>
     * A code signifying the type of this means of payment.
     * (Required)
     * 
     */
    @JsonProperty("PaymentMeansCode")
    public void setPaymentMeansCode(List<CodeType> paymentMeansCode) {
        this.paymentMeansCode = paymentMeansCode;
    }

    public PaymentMeans withPaymentMeansCode(List<CodeType> paymentMeansCode) {
        this.paymentMeansCode = paymentMeansCode;
        return this;
    }

    /**
     * Payment Means. Payment Due Date. Date
     * <p>
     * The date on which payment is due for this means of payment.
     * 
     */
    @JsonProperty("PaymentDueDate")
    public List<DateType> getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Payment Means. Payment Due Date. Date
     * <p>
     * The date on which payment is due for this means of payment.
     * 
     */
    @JsonProperty("PaymentDueDate")
    public void setPaymentDueDate(List<DateType> paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public PaymentMeans withPaymentDueDate(List<DateType> paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
        return this;
    }

    /**
     * Payment Means. Payment Channel Code. Code
     * <p>
     * A code signifying the payment channel for this means of payment.
     * 
     */
    @JsonProperty("PaymentChannelCode")
    public List<CodeType> getPaymentChannelCode() {
        return paymentChannelCode;
    }

    /**
     * Payment Means. Payment Channel Code. Code
     * <p>
     * A code signifying the payment channel for this means of payment.
     * 
     */
    @JsonProperty("PaymentChannelCode")
    public void setPaymentChannelCode(List<CodeType> paymentChannelCode) {
        this.paymentChannelCode = paymentChannelCode;
    }

    public PaymentMeans withPaymentChannelCode(List<CodeType> paymentChannelCode) {
        this.paymentChannelCode = paymentChannelCode;
        return this;
    }

    /**
     * Payment Means. Instruction Identifier. Identifier
     * <p>
     * An identifier for the payment instruction.
     * 
     */
    @JsonProperty("InstructionID")
    public List<IdentifierType> getInstructionID() {
        return instructionID;
    }

    /**
     * Payment Means. Instruction Identifier. Identifier
     * <p>
     * An identifier for the payment instruction.
     * 
     */
    @JsonProperty("InstructionID")
    public void setInstructionID(List<IdentifierType> instructionID) {
        this.instructionID = instructionID;
    }

    public PaymentMeans withInstructionID(List<IdentifierType> instructionID) {
        this.instructionID = instructionID;
        return this;
    }

    /**
     * Payment Means. Instruction_ Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("InstructionNote")
    public List<TextType> getInstructionNote() {
        return instructionNote;
    }

    /**
     * Payment Means. Instruction_ Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("InstructionNote")
    public void setInstructionNote(List<TextType> instructionNote) {
        this.instructionNote = instructionNote;
    }

    public PaymentMeans withInstructionNote(List<TextType> instructionNote) {
        this.instructionNote = instructionNote;
        return this;
    }

    /**
     * Payment Means. Payment Identifier. Identifier
     * <p>
     * An identifier for a payment made using this means of payment.
     * 
     */
    @JsonProperty("PaymentID")
    public List<IdentifierType> getPaymentID() {
        return paymentID;
    }

    /**
     * Payment Means. Payment Identifier. Identifier
     * <p>
     * An identifier for a payment made using this means of payment.
     * 
     */
    @JsonProperty("PaymentID")
    public void setPaymentID(List<IdentifierType> paymentID) {
        this.paymentID = paymentID;
    }

    public PaymentMeans withPaymentID(List<IdentifierType> paymentID) {
        this.paymentID = paymentID;
        return this;
    }

    /**
     * Payment Means. Card Account
     * <p>
     * A credit card, debit card, or charge card account that constitutes this means of payment.
     * 
     */
    @JsonProperty("CardAccount")
    public List<CardAccount> getCardAccount() {
        return cardAccount;
    }

    /**
     * Payment Means. Card Account
     * <p>
     * A credit card, debit card, or charge card account that constitutes this means of payment.
     * 
     */
    @JsonProperty("CardAccount")
    public void setCardAccount(List<CardAccount> cardAccount) {
        this.cardAccount = cardAccount;
    }

    public PaymentMeans withCardAccount(List<CardAccount> cardAccount) {
        this.cardAccount = cardAccount;
        return this;
    }

    /**
     * Payment Means. Payer_ Financial Account. Financial Account
     * <p>
     * The payer's financial account.
     * 
     */
    @JsonProperty("PayerFinancialAccount")
    public List<FinancialAccount> getPayerFinancialAccount() {
        return payerFinancialAccount;
    }

    /**
     * Payment Means. Payer_ Financial Account. Financial Account
     * <p>
     * The payer's financial account.
     * 
     */
    @JsonProperty("PayerFinancialAccount")
    public void setPayerFinancialAccount(List<FinancialAccount> payerFinancialAccount) {
        this.payerFinancialAccount = payerFinancialAccount;
    }

    public PaymentMeans withPayerFinancialAccount(List<FinancialAccount> payerFinancialAccount) {
        this.payerFinancialAccount = payerFinancialAccount;
        return this;
    }

    /**
     * Payment Means. Payee_ Financial Account. Financial Account
     * <p>
     * The payee's financial account.
     * 
     */
    @JsonProperty("PayeeFinancialAccount")
    public List<FinancialAccount> getPayeeFinancialAccount() {
        return payeeFinancialAccount;
    }

    /**
     * Payment Means. Payee_ Financial Account. Financial Account
     * <p>
     * The payee's financial account.
     * 
     */
    @JsonProperty("PayeeFinancialAccount")
    public void setPayeeFinancialAccount(List<FinancialAccount> payeeFinancialAccount) {
        this.payeeFinancialAccount = payeeFinancialAccount;
    }

    public PaymentMeans withPayeeFinancialAccount(List<FinancialAccount> payeeFinancialAccount) {
        this.payeeFinancialAccount = payeeFinancialAccount;
        return this;
    }

    /**
     * Payment Means. Credit Account
     * <p>
     * A credit account associated with this means of payment.
     * 
     */
    @JsonProperty("CreditAccount")
    public List<CreditAccount> getCreditAccount() {
        return creditAccount;
    }

    /**
     * Payment Means. Credit Account
     * <p>
     * A credit account associated with this means of payment.
     * 
     */
    @JsonProperty("CreditAccount")
    public void setCreditAccount(List<CreditAccount> creditAccount) {
        this.creditAccount = creditAccount;
    }

    public PaymentMeans withCreditAccount(List<CreditAccount> creditAccount) {
        this.creditAccount = creditAccount;
        return this;
    }

    /**
     * Payment Means. Payment Mandate
     * <p>
     * The payment mandate associated with this means of payment.
     * 
     */
    @JsonProperty("PaymentMandate")
    public List<PaymentMandate> getPaymentMandate() {
        return paymentMandate;
    }

    /**
     * Payment Means. Payment Mandate
     * <p>
     * The payment mandate associated with this means of payment.
     * 
     */
    @JsonProperty("PaymentMandate")
    public void setPaymentMandate(List<PaymentMandate> paymentMandate) {
        this.paymentMandate = paymentMandate;
    }

    public PaymentMeans withPaymentMandate(List<PaymentMandate> paymentMandate) {
        this.paymentMandate = paymentMandate;
        return this;
    }

    /**
     * Payment Means. Trade Financing
     * <p>
     * A trade finance agreement applicable to this means of payment.
     * 
     */
    @JsonProperty("TradeFinancing")
    public List<TradeFinancing> getTradeFinancing() {
        return tradeFinancing;
    }

    /**
     * Payment Means. Trade Financing
     * <p>
     * A trade finance agreement applicable to this means of payment.
     * 
     */
    @JsonProperty("TradeFinancing")
    public void setTradeFinancing(List<TradeFinancing> tradeFinancing) {
        this.tradeFinancing = tradeFinancing;
    }

    public PaymentMeans withTradeFinancing(List<TradeFinancing> tradeFinancing) {
        this.tradeFinancing = tradeFinancing;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentMeans.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("paymentMeansCode");
        sb.append('=');
        sb.append(((this.paymentMeansCode == null)?"<null>":this.paymentMeansCode));
        sb.append(',');
        sb.append("paymentDueDate");
        sb.append('=');
        sb.append(((this.paymentDueDate == null)?"<null>":this.paymentDueDate));
        sb.append(',');
        sb.append("paymentChannelCode");
        sb.append('=');
        sb.append(((this.paymentChannelCode == null)?"<null>":this.paymentChannelCode));
        sb.append(',');
        sb.append("instructionID");
        sb.append('=');
        sb.append(((this.instructionID == null)?"<null>":this.instructionID));
        sb.append(',');
        sb.append("instructionNote");
        sb.append('=');
        sb.append(((this.instructionNote == null)?"<null>":this.instructionNote));
        sb.append(',');
        sb.append("paymentID");
        sb.append('=');
        sb.append(((this.paymentID == null)?"<null>":this.paymentID));
        sb.append(',');
        sb.append("cardAccount");
        sb.append('=');
        sb.append(((this.cardAccount == null)?"<null>":this.cardAccount));
        sb.append(',');
        sb.append("payerFinancialAccount");
        sb.append('=');
        sb.append(((this.payerFinancialAccount == null)?"<null>":this.payerFinancialAccount));
        sb.append(',');
        sb.append("payeeFinancialAccount");
        sb.append('=');
        sb.append(((this.payeeFinancialAccount == null)?"<null>":this.payeeFinancialAccount));
        sb.append(',');
        sb.append("creditAccount");
        sb.append('=');
        sb.append(((this.creditAccount == null)?"<null>":this.creditAccount));
        sb.append(',');
        sb.append("paymentMandate");
        sb.append('=');
        sb.append(((this.paymentMandate == null)?"<null>":this.paymentMandate));
        sb.append(',');
        sb.append("tradeFinancing");
        sb.append('=');
        sb.append(((this.tradeFinancing == null)?"<null>":this.tradeFinancing));
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
        result = ((result* 31)+((this.creditAccount == null)? 0 :this.creditAccount.hashCode()));
        result = ((result* 31)+((this.payeeFinancialAccount == null)? 0 :this.payeeFinancialAccount.hashCode()));
        result = ((result* 31)+((this.tradeFinancing == null)? 0 :this.tradeFinancing.hashCode()));
        result = ((result* 31)+((this.paymentDueDate == null)? 0 :this.paymentDueDate.hashCode()));
        result = ((result* 31)+((this.paymentMeansCode == null)? 0 :this.paymentMeansCode.hashCode()));
        result = ((result* 31)+((this.payerFinancialAccount == null)? 0 :this.payerFinancialAccount.hashCode()));
        result = ((result* 31)+((this.paymentMandate == null)? 0 :this.paymentMandate.hashCode()));
        result = ((result* 31)+((this.paymentID == null)? 0 :this.paymentID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.paymentChannelCode == null)? 0 :this.paymentChannelCode.hashCode()));
        result = ((result* 31)+((this.instructionID == null)? 0 :this.instructionID.hashCode()));
        result = ((result* 31)+((this.instructionNote == null)? 0 :this.instructionNote.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.cardAccount == null)? 0 :this.cardAccount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentMeans) == false) {
            return false;
        }
        PaymentMeans rhs = ((PaymentMeans) other);
        return (((((((((((((((this.creditAccount == rhs.creditAccount)||((this.creditAccount!= null)&&this.creditAccount.equals(rhs.creditAccount)))&&((this.payeeFinancialAccount == rhs.payeeFinancialAccount)||((this.payeeFinancialAccount!= null)&&this.payeeFinancialAccount.equals(rhs.payeeFinancialAccount))))&&((this.tradeFinancing == rhs.tradeFinancing)||((this.tradeFinancing!= null)&&this.tradeFinancing.equals(rhs.tradeFinancing))))&&((this.paymentDueDate == rhs.paymentDueDate)||((this.paymentDueDate!= null)&&this.paymentDueDate.equals(rhs.paymentDueDate))))&&((this.paymentMeansCode == rhs.paymentMeansCode)||((this.paymentMeansCode!= null)&&this.paymentMeansCode.equals(rhs.paymentMeansCode))))&&((this.payerFinancialAccount == rhs.payerFinancialAccount)||((this.payerFinancialAccount!= null)&&this.payerFinancialAccount.equals(rhs.payerFinancialAccount))))&&((this.paymentMandate == rhs.paymentMandate)||((this.paymentMandate!= null)&&this.paymentMandate.equals(rhs.paymentMandate))))&&((this.paymentID == rhs.paymentID)||((this.paymentID!= null)&&this.paymentID.equals(rhs.paymentID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.paymentChannelCode == rhs.paymentChannelCode)||((this.paymentChannelCode!= null)&&this.paymentChannelCode.equals(rhs.paymentChannelCode))))&&((this.instructionID == rhs.instructionID)||((this.instructionID!= null)&&this.instructionID.equals(rhs.instructionID))))&&((this.instructionNote == rhs.instructionNote)||((this.instructionNote!= null)&&this.instructionNote.equals(rhs.instructionNote))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.cardAccount == rhs.cardAccount)||((this.cardAccount!= null)&&this.cardAccount.equals(rhs.cardAccount))));
    }

}
