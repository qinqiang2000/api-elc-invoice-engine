
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
 * Allowance Charge. Details
 * <p>
 * A class to describe information about a charge or discount as applied to a price component.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ChargeIndicator",
    "AllowanceChargeReasonCode",
    "AllowanceChargeReason",
    "MultiplierFactorNumeric",
    "PrepaidIndicator",
    "SequenceNumeric",
    "Amount",
    "BaseAmount",
    "AccountingCostCode",
    "AccountingCost",
    "PerUnitAmount",
    "TaxCategory",
    "TaxTotal",
    "PaymentMeans"
})
@Generated("jsonschema2pojo")
public class AllowanceCharge {

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
     * Allowance Charge. Identifier
     * <p>
     * An identifier for this allowance or charge.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this allowance or charge.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Allowance Charge. Charge_ Indicator. Indicator
     * <p>
     * An indicator that this AllowanceCharge describes a charge (true) or a discount (false).
     * (Required)
     * 
     */
    @JsonProperty("ChargeIndicator")
    @JsonPropertyDescription("An indicator that this AllowanceCharge describes a charge (true) or a discount (false).")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IndicatorType> chargeIndicator = new ArrayList<IndicatorType>();
    /**
     * Allowance Charge. Allowance Charge Reason Code. Code
     * <p>
     * A mutually agreed code signifying the reason for this allowance or charge.
     * 
     */
    @JsonProperty("AllowanceChargeReasonCode")
    @JsonPropertyDescription("A mutually agreed code signifying the reason for this allowance or charge.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> allowanceChargeReasonCode = new ArrayList<CodeType>();
    /**
     * Allowance Charge. Allowance Charge_ Reason. Text
     * <p>
     * The reason for this allowance or charge.
     * 
     */
    @JsonProperty("AllowanceChargeReason")
    @JsonPropertyDescription("The reason for this allowance or charge.")
    @Size(min = 1)
    @Valid
    private List<TextType> allowanceChargeReason = new ArrayList<TextType>();
    /**
     * Allowance Charge. Multiplier_ Factor. Numeric
     * <p>
     * A number by which the base amount is multiplied to calculate the actual amount of this allowance or charge.
     * 
     */
    @JsonProperty("MultiplierFactorNumeric")
    @JsonPropertyDescription("A number by which the base amount is multiplied to calculate the actual amount of this allowance or charge.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> multiplierFactorNumeric = new ArrayList<NumericType>();
    /**
     * Allowance Charge. Prepaid_ Indicator. Indicator
     * <p>
     * An indicator that this allowance or charge is prepaid (true) or not (false).
     * 
     */
    @JsonProperty("PrepaidIndicator")
    @JsonPropertyDescription("An indicator that this allowance or charge is prepaid (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> prepaidIndicator = new ArrayList<IndicatorType>();
    /**
     * Allowance Charge. Sequence. Numeric
     * <p>
     * A number indicating the order of this allowance or charge in the sequence of calculations applied when there are multiple allowances or charges.
     * 
     */
    @JsonProperty("SequenceNumeric")
    @JsonPropertyDescription("A number indicating the order of this allowance or charge in the sequence of calculations applied when there are multiple allowances or charges.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> sequenceNumeric = new ArrayList<NumericType>();
    /**
     * Allowance Charge. Amount
     * <p>
     * The monetary amount of this allowance or charge to be applied.
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    @JsonPropertyDescription("The monetary amount of this allowance or charge to be applied.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> amount = new ArrayList<AmountType>();
    /**
     * Allowance Charge. Base_ Amount. Amount
     * <p>
     * The monetary amount to which the multiplier factor is applied in calculating the amount of this allowance or charge.
     * 
     */
    @JsonProperty("BaseAmount")
    @JsonPropertyDescription("The monetary amount to which the multiplier factor is applied in calculating the amount of this allowance or charge.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> baseAmount = new ArrayList<AmountType>();
    /**
     * Allowance Charge. Accounting Cost Code. Code
     * <p>
     * The accounting cost centre used by the buyer to account for this allowance or charge, expressed as a code.
     * 
     */
    @JsonProperty("AccountingCostCode")
    @JsonPropertyDescription("The accounting cost centre used by the buyer to account for this allowance or charge, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> accountingCostCode = new ArrayList<CodeType>();
    /**
     * Allowance Charge. Accounting Cost. Text
     * <p>
     * The accounting cost centre used by the buyer to account for this allowance or charge, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    @JsonPropertyDescription("The accounting cost centre used by the buyer to account for this allowance or charge, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> accountingCost = new ArrayList<TextType>();
    /**
     * Allowance Charge. Per Unit_ Amount. Amount
     * <p>
     * The allowance or charge per item; the total allowance or charge is calculated by multiplying the per unit amount by the quantity of items, either at the level of the individual transaction line or for the total number of items in the document, depending on the context in which it appears.
     * 
     */
    @JsonProperty("PerUnitAmount")
    @JsonPropertyDescription("The allowance or charge per item; the total allowance or charge is calculated by multiplying the per unit amount by the quantity of items, either at the level of the individual transaction line or for the total number of items in the document, depending on the context in which it appears.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> perUnitAmount = new ArrayList<AmountType>();
    /**
     * Allowance Charge. Tax Category
     * <p>
     * A tax category applicable to this allowance or charge.
     * 
     */
    @JsonProperty("TaxCategory")
    @JsonPropertyDescription("A tax category applicable to this allowance or charge.")
    @Size(min = 1)
    @Valid
    private List<TaxCategory> taxCategory = new ArrayList<TaxCategory>();
    /**
     * Allowance Charge. Tax Total
     * <p>
     * The total of all the taxes applicable to this allowance or charge.
     * 
     */
    @JsonProperty("TaxTotal")
    @JsonPropertyDescription("The total of all the taxes applicable to this allowance or charge.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TaxTotal> taxTotal = new ArrayList<TaxTotal>();
    /**
     * Allowance Charge. Payment Means
     * <p>
     * A means of payment for this allowance or charge.
     * 
     */
    @JsonProperty("PaymentMeans")
    @JsonPropertyDescription("A means of payment for this allowance or charge.")
    @Size(min = 1)
    @Valid
    private List<PaymentMeans> paymentMeans = new ArrayList<PaymentMeans>();

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

    public AllowanceCharge withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Allowance Charge. Identifier
     * <p>
     * An identifier for this allowance or charge.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Allowance Charge. Identifier
     * <p>
     * An identifier for this allowance or charge.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public AllowanceCharge withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Allowance Charge. Charge_ Indicator. Indicator
     * <p>
     * An indicator that this AllowanceCharge describes a charge (true) or a discount (false).
     * (Required)
     * 
     */
    @JsonProperty("ChargeIndicator")
    public List<IndicatorType> getChargeIndicator() {
        return chargeIndicator;
    }

    /**
     * Allowance Charge. Charge_ Indicator. Indicator
     * <p>
     * An indicator that this AllowanceCharge describes a charge (true) or a discount (false).
     * (Required)
     * 
     */
    @JsonProperty("ChargeIndicator")
    public void setChargeIndicator(List<IndicatorType> chargeIndicator) {
        this.chargeIndicator = chargeIndicator;
    }

    public AllowanceCharge withChargeIndicator(List<IndicatorType> chargeIndicator) {
        this.chargeIndicator = chargeIndicator;
        return this;
    }

    /**
     * Allowance Charge. Allowance Charge Reason Code. Code
     * <p>
     * A mutually agreed code signifying the reason for this allowance or charge.
     * 
     */
    @JsonProperty("AllowanceChargeReasonCode")
    public List<CodeType> getAllowanceChargeReasonCode() {
        return allowanceChargeReasonCode;
    }

    /**
     * Allowance Charge. Allowance Charge Reason Code. Code
     * <p>
     * A mutually agreed code signifying the reason for this allowance or charge.
     * 
     */
    @JsonProperty("AllowanceChargeReasonCode")
    public void setAllowanceChargeReasonCode(List<CodeType> allowanceChargeReasonCode) {
        this.allowanceChargeReasonCode = allowanceChargeReasonCode;
    }

    public AllowanceCharge withAllowanceChargeReasonCode(List<CodeType> allowanceChargeReasonCode) {
        this.allowanceChargeReasonCode = allowanceChargeReasonCode;
        return this;
    }

    /**
     * Allowance Charge. Allowance Charge_ Reason. Text
     * <p>
     * The reason for this allowance or charge.
     * 
     */
    @JsonProperty("AllowanceChargeReason")
    public List<TextType> getAllowanceChargeReason() {
        return allowanceChargeReason;
    }

    /**
     * Allowance Charge. Allowance Charge_ Reason. Text
     * <p>
     * The reason for this allowance or charge.
     * 
     */
    @JsonProperty("AllowanceChargeReason")
    public void setAllowanceChargeReason(List<TextType> allowanceChargeReason) {
        this.allowanceChargeReason = allowanceChargeReason;
    }

    public AllowanceCharge withAllowanceChargeReason(List<TextType> allowanceChargeReason) {
        this.allowanceChargeReason = allowanceChargeReason;
        return this;
    }

    /**
     * Allowance Charge. Multiplier_ Factor. Numeric
     * <p>
     * A number by which the base amount is multiplied to calculate the actual amount of this allowance or charge.
     * 
     */
    @JsonProperty("MultiplierFactorNumeric")
    public List<NumericType> getMultiplierFactorNumeric() {
        return multiplierFactorNumeric;
    }

    /**
     * Allowance Charge. Multiplier_ Factor. Numeric
     * <p>
     * A number by which the base amount is multiplied to calculate the actual amount of this allowance or charge.
     * 
     */
    @JsonProperty("MultiplierFactorNumeric")
    public void setMultiplierFactorNumeric(List<NumericType> multiplierFactorNumeric) {
        this.multiplierFactorNumeric = multiplierFactorNumeric;
    }

    public AllowanceCharge withMultiplierFactorNumeric(List<NumericType> multiplierFactorNumeric) {
        this.multiplierFactorNumeric = multiplierFactorNumeric;
        return this;
    }

    /**
     * Allowance Charge. Prepaid_ Indicator. Indicator
     * <p>
     * An indicator that this allowance or charge is prepaid (true) or not (false).
     * 
     */
    @JsonProperty("PrepaidIndicator")
    public List<IndicatorType> getPrepaidIndicator() {
        return prepaidIndicator;
    }

    /**
     * Allowance Charge. Prepaid_ Indicator. Indicator
     * <p>
     * An indicator that this allowance or charge is prepaid (true) or not (false).
     * 
     */
    @JsonProperty("PrepaidIndicator")
    public void setPrepaidIndicator(List<IndicatorType> prepaidIndicator) {
        this.prepaidIndicator = prepaidIndicator;
    }

    public AllowanceCharge withPrepaidIndicator(List<IndicatorType> prepaidIndicator) {
        this.prepaidIndicator = prepaidIndicator;
        return this;
    }

    /**
     * Allowance Charge. Sequence. Numeric
     * <p>
     * A number indicating the order of this allowance or charge in the sequence of calculations applied when there are multiple allowances or charges.
     * 
     */
    @JsonProperty("SequenceNumeric")
    public List<NumericType> getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Allowance Charge. Sequence. Numeric
     * <p>
     * A number indicating the order of this allowance or charge in the sequence of calculations applied when there are multiple allowances or charges.
     * 
     */
    @JsonProperty("SequenceNumeric")
    public void setSequenceNumeric(List<NumericType> sequenceNumeric) {
        this.sequenceNumeric = sequenceNumeric;
    }

    public AllowanceCharge withSequenceNumeric(List<NumericType> sequenceNumeric) {
        this.sequenceNumeric = sequenceNumeric;
        return this;
    }

    /**
     * Allowance Charge. Amount
     * <p>
     * The monetary amount of this allowance or charge to be applied.
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    public List<AmountType> getAmount() {
        return amount;
    }

    /**
     * Allowance Charge. Amount
     * <p>
     * The monetary amount of this allowance or charge to be applied.
     * (Required)
     * 
     */
    @JsonProperty("Amount")
    public void setAmount(List<AmountType> amount) {
        this.amount = amount;
    }

    public AllowanceCharge withAmount(List<AmountType> amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Allowance Charge. Base_ Amount. Amount
     * <p>
     * The monetary amount to which the multiplier factor is applied in calculating the amount of this allowance or charge.
     * 
     */
    @JsonProperty("BaseAmount")
    public List<AmountType> getBaseAmount() {
        return baseAmount;
    }

    /**
     * Allowance Charge. Base_ Amount. Amount
     * <p>
     * The monetary amount to which the multiplier factor is applied in calculating the amount of this allowance or charge.
     * 
     */
    @JsonProperty("BaseAmount")
    public void setBaseAmount(List<AmountType> baseAmount) {
        this.baseAmount = baseAmount;
    }

    public AllowanceCharge withBaseAmount(List<AmountType> baseAmount) {
        this.baseAmount = baseAmount;
        return this;
    }

    /**
     * Allowance Charge. Accounting Cost Code. Code
     * <p>
     * The accounting cost centre used by the buyer to account for this allowance or charge, expressed as a code.
     * 
     */
    @JsonProperty("AccountingCostCode")
    public List<CodeType> getAccountingCostCode() {
        return accountingCostCode;
    }

    /**
     * Allowance Charge. Accounting Cost Code. Code
     * <p>
     * The accounting cost centre used by the buyer to account for this allowance or charge, expressed as a code.
     * 
     */
    @JsonProperty("AccountingCostCode")
    public void setAccountingCostCode(List<CodeType> accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
    }

    public AllowanceCharge withAccountingCostCode(List<CodeType> accountingCostCode) {
        this.accountingCostCode = accountingCostCode;
        return this;
    }

    /**
     * Allowance Charge. Accounting Cost. Text
     * <p>
     * The accounting cost centre used by the buyer to account for this allowance or charge, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    public List<TextType> getAccountingCost() {
        return accountingCost;
    }

    /**
     * Allowance Charge. Accounting Cost. Text
     * <p>
     * The accounting cost centre used by the buyer to account for this allowance or charge, expressed as text.
     * 
     */
    @JsonProperty("AccountingCost")
    public void setAccountingCost(List<TextType> accountingCost) {
        this.accountingCost = accountingCost;
    }

    public AllowanceCharge withAccountingCost(List<TextType> accountingCost) {
        this.accountingCost = accountingCost;
        return this;
    }

    /**
     * Allowance Charge. Per Unit_ Amount. Amount
     * <p>
     * The allowance or charge per item; the total allowance or charge is calculated by multiplying the per unit amount by the quantity of items, either at the level of the individual transaction line or for the total number of items in the document, depending on the context in which it appears.
     * 
     */
    @JsonProperty("PerUnitAmount")
    public List<AmountType> getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Allowance Charge. Per Unit_ Amount. Amount
     * <p>
     * The allowance or charge per item; the total allowance or charge is calculated by multiplying the per unit amount by the quantity of items, either at the level of the individual transaction line or for the total number of items in the document, depending on the context in which it appears.
     * 
     */
    @JsonProperty("PerUnitAmount")
    public void setPerUnitAmount(List<AmountType> perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
    }

    public AllowanceCharge withPerUnitAmount(List<AmountType> perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
        return this;
    }

    /**
     * Allowance Charge. Tax Category
     * <p>
     * A tax category applicable to this allowance or charge.
     * 
     */
    @JsonProperty("TaxCategory")
    public List<TaxCategory> getTaxCategory() {
        return taxCategory;
    }

    /**
     * Allowance Charge. Tax Category
     * <p>
     * A tax category applicable to this allowance or charge.
     * 
     */
    @JsonProperty("TaxCategory")
    public void setTaxCategory(List<TaxCategory> taxCategory) {
        this.taxCategory = taxCategory;
    }

    public AllowanceCharge withTaxCategory(List<TaxCategory> taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     * Allowance Charge. Tax Total
     * <p>
     * The total of all the taxes applicable to this allowance or charge.
     * 
     */
    @JsonProperty("TaxTotal")
    public List<TaxTotal> getTaxTotal() {
        return taxTotal;
    }

    /**
     * Allowance Charge. Tax Total
     * <p>
     * The total of all the taxes applicable to this allowance or charge.
     * 
     */
    @JsonProperty("TaxTotal")
    public void setTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
    }

    public AllowanceCharge withTaxTotal(List<TaxTotal> taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Allowance Charge. Payment Means
     * <p>
     * A means of payment for this allowance or charge.
     * 
     */
    @JsonProperty("PaymentMeans")
    public List<PaymentMeans> getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Allowance Charge. Payment Means
     * <p>
     * A means of payment for this allowance or charge.
     * 
     */
    @JsonProperty("PaymentMeans")
    public void setPaymentMeans(List<PaymentMeans> paymentMeans) {
        this.paymentMeans = paymentMeans;
    }

    public AllowanceCharge withPaymentMeans(List<PaymentMeans> paymentMeans) {
        this.paymentMeans = paymentMeans;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AllowanceCharge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("chargeIndicator");
        sb.append('=');
        sb.append(((this.chargeIndicator == null)?"<null>":this.chargeIndicator));
        sb.append(',');
        sb.append("allowanceChargeReasonCode");
        sb.append('=');
        sb.append(((this.allowanceChargeReasonCode == null)?"<null>":this.allowanceChargeReasonCode));
        sb.append(',');
        sb.append("allowanceChargeReason");
        sb.append('=');
        sb.append(((this.allowanceChargeReason == null)?"<null>":this.allowanceChargeReason));
        sb.append(',');
        sb.append("multiplierFactorNumeric");
        sb.append('=');
        sb.append(((this.multiplierFactorNumeric == null)?"<null>":this.multiplierFactorNumeric));
        sb.append(',');
        sb.append("prepaidIndicator");
        sb.append('=');
        sb.append(((this.prepaidIndicator == null)?"<null>":this.prepaidIndicator));
        sb.append(',');
        sb.append("sequenceNumeric");
        sb.append('=');
        sb.append(((this.sequenceNumeric == null)?"<null>":this.sequenceNumeric));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("baseAmount");
        sb.append('=');
        sb.append(((this.baseAmount == null)?"<null>":this.baseAmount));
        sb.append(',');
        sb.append("accountingCostCode");
        sb.append('=');
        sb.append(((this.accountingCostCode == null)?"<null>":this.accountingCostCode));
        sb.append(',');
        sb.append("accountingCost");
        sb.append('=');
        sb.append(((this.accountingCost == null)?"<null>":this.accountingCost));
        sb.append(',');
        sb.append("perUnitAmount");
        sb.append('=');
        sb.append(((this.perUnitAmount == null)?"<null>":this.perUnitAmount));
        sb.append(',');
        sb.append("taxCategory");
        sb.append('=');
        sb.append(((this.taxCategory == null)?"<null>":this.taxCategory));
        sb.append(',');
        sb.append("taxTotal");
        sb.append('=');
        sb.append(((this.taxTotal == null)?"<null>":this.taxTotal));
        sb.append(',');
        sb.append("paymentMeans");
        sb.append('=');
        sb.append(((this.paymentMeans == null)?"<null>":this.paymentMeans));
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
        result = ((result* 31)+((this.perUnitAmount == null)? 0 :this.perUnitAmount.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.accountingCost == null)? 0 :this.accountingCost.hashCode()));
        result = ((result* 31)+((this.sequenceNumeric == null)? 0 :this.sequenceNumeric.hashCode()));
        result = ((result* 31)+((this.taxTotal == null)? 0 :this.taxTotal.hashCode()));
        result = ((result* 31)+((this.prepaidIndicator == null)? 0 :this.prepaidIndicator.hashCode()));
        result = ((result* 31)+((this.baseAmount == null)? 0 :this.baseAmount.hashCode()));
        result = ((result* 31)+((this.chargeIndicator == null)? 0 :this.chargeIndicator.hashCode()));
        result = ((result* 31)+((this.allowanceChargeReasonCode == null)? 0 :this.allowanceChargeReasonCode.hashCode()));
        result = ((result* 31)+((this.taxCategory == null)? 0 :this.taxCategory.hashCode()));
        result = ((result* 31)+((this.allowanceChargeReason == null)? 0 :this.allowanceChargeReason.hashCode()));
        result = ((result* 31)+((this.paymentMeans == null)? 0 :this.paymentMeans.hashCode()));
        result = ((result* 31)+((this.multiplierFactorNumeric == null)? 0 :this.multiplierFactorNumeric.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.accountingCostCode == null)? 0 :this.accountingCostCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AllowanceCharge) == false) {
            return false;
        }
        AllowanceCharge rhs = ((AllowanceCharge) other);
        return (((((((((((((((((this.perUnitAmount == rhs.perUnitAmount)||((this.perUnitAmount!= null)&&this.perUnitAmount.equals(rhs.perUnitAmount)))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.accountingCost == rhs.accountingCost)||((this.accountingCost!= null)&&this.accountingCost.equals(rhs.accountingCost))))&&((this.sequenceNumeric == rhs.sequenceNumeric)||((this.sequenceNumeric!= null)&&this.sequenceNumeric.equals(rhs.sequenceNumeric))))&&((this.taxTotal == rhs.taxTotal)||((this.taxTotal!= null)&&this.taxTotal.equals(rhs.taxTotal))))&&((this.prepaidIndicator == rhs.prepaidIndicator)||((this.prepaidIndicator!= null)&&this.prepaidIndicator.equals(rhs.prepaidIndicator))))&&((this.baseAmount == rhs.baseAmount)||((this.baseAmount!= null)&&this.baseAmount.equals(rhs.baseAmount))))&&((this.chargeIndicator == rhs.chargeIndicator)||((this.chargeIndicator!= null)&&this.chargeIndicator.equals(rhs.chargeIndicator))))&&((this.allowanceChargeReasonCode == rhs.allowanceChargeReasonCode)||((this.allowanceChargeReasonCode!= null)&&this.allowanceChargeReasonCode.equals(rhs.allowanceChargeReasonCode))))&&((this.taxCategory == rhs.taxCategory)||((this.taxCategory!= null)&&this.taxCategory.equals(rhs.taxCategory))))&&((this.allowanceChargeReason == rhs.allowanceChargeReason)||((this.allowanceChargeReason!= null)&&this.allowanceChargeReason.equals(rhs.allowanceChargeReason))))&&((this.paymentMeans == rhs.paymentMeans)||((this.paymentMeans!= null)&&this.paymentMeans.equals(rhs.paymentMeans))))&&((this.multiplierFactorNumeric == rhs.multiplierFactorNumeric)||((this.multiplierFactorNumeric!= null)&&this.multiplierFactorNumeric.equals(rhs.multiplierFactorNumeric))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.accountingCostCode == rhs.accountingCostCode)||((this.accountingCostCode!= null)&&this.accountingCostCode.equals(rhs.accountingCostCode))));
    }

}
