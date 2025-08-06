
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
 * Monetary Total. Details
 * <p>
 * A class to define a monetary total.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LineExtensionAmount",
    "TaxExclusiveAmount",
    "TaxInclusiveAmount",
    "AllowanceTotalAmount",
    "ChargeTotalAmount",
    "PrepaidAmount",
    "PayableRoundingAmount",
    "PayableAmount",
    "PayableAlternativeAmount"
})
@Generated("jsonschema2pojo")
public class MonetaryTotal {

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
     * Monetary Total. Line Extension Amount. Amount
     * <p>
     * The monetary amount of an extended transaction line, net of tax and settlement discounts, but inclusive of any applicable rounding amount.
     * 
     */
    @JsonProperty("LineExtensionAmount")
    @JsonPropertyDescription("The monetary amount of an extended transaction line, net of tax and settlement discounts, but inclusive of any applicable rounding amount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> lineExtensionAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Tax Exclusive Amount. Amount
     * <p>
     * The monetary amount of an extended transaction line, exclusive of taxes.
     * 
     */
    @JsonProperty("TaxExclusiveAmount")
    @JsonPropertyDescription("The monetary amount of an extended transaction line, exclusive of taxes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> taxExclusiveAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Tax Inclusive Amount. Amount
     * <p>
     * The monetary amount including taxes; the sum of payable amount and prepaid amount.
     * 
     */
    @JsonProperty("TaxInclusiveAmount")
    @JsonPropertyDescription("The monetary amount including taxes; the sum of payable amount and prepaid amount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> taxInclusiveAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Allowance_ Total Amount. Amount
     * <p>
     * The total monetary amount of all allowances.
     * 
     */
    @JsonProperty("AllowanceTotalAmount")
    @JsonPropertyDescription("The total monetary amount of all allowances.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> allowanceTotalAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Charge_ Total Amount. Amount
     * <p>
     * The total monetary amount of all charges.
     * 
     */
    @JsonProperty("ChargeTotalAmount")
    @JsonPropertyDescription("The total monetary amount of all charges.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> chargeTotalAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Prepaid Amount. Amount
     * <p>
     * The total prepaid monetary amount.
     * 
     */
    @JsonProperty("PrepaidAmount")
    @JsonPropertyDescription("The total prepaid monetary amount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> prepaidAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Payable_ Rounding Amount. Amount
     * <p>
     * The rounding amount (positive or negative) added to produce the line extension amount.
     * 
     */
    @JsonProperty("PayableRoundingAmount")
    @JsonPropertyDescription("The rounding amount (positive or negative) added to produce the line extension amount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> payableRoundingAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Payable_ Amount. Amount
     * <p>
     * The amount of the monetary total to be paid.
     * (Required)
     * 
     */
    @JsonProperty("PayableAmount")
    @JsonPropertyDescription("The amount of the monetary total to be paid.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> payableAmount = new ArrayList<AmountType>();
    /**
     * Monetary Total. Payable_ Alternative Amount. Amount
     * <p>
     * The amount of the monetary total to be paid, expressed in an alternative currency.
     * 
     */
    @JsonProperty("PayableAlternativeAmount")
    @JsonPropertyDescription("The amount of the monetary total to be paid, expressed in an alternative currency.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> payableAlternativeAmount = new ArrayList<AmountType>();

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

    public MonetaryTotal withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Monetary Total. Line Extension Amount. Amount
     * <p>
     * The monetary amount of an extended transaction line, net of tax and settlement discounts, but inclusive of any applicable rounding amount.
     * 
     */
    @JsonProperty("LineExtensionAmount")
    public List<AmountType> getLineExtensionAmount() {
        return lineExtensionAmount;
    }

    /**
     * Monetary Total. Line Extension Amount. Amount
     * <p>
     * The monetary amount of an extended transaction line, net of tax and settlement discounts, but inclusive of any applicable rounding amount.
     * 
     */
    @JsonProperty("LineExtensionAmount")
    public void setLineExtensionAmount(List<AmountType> lineExtensionAmount) {
        this.lineExtensionAmount = lineExtensionAmount;
    }

    public MonetaryTotal withLineExtensionAmount(List<AmountType> lineExtensionAmount) {
        this.lineExtensionAmount = lineExtensionAmount;
        return this;
    }

    /**
     * Monetary Total. Tax Exclusive Amount. Amount
     * <p>
     * The monetary amount of an extended transaction line, exclusive of taxes.
     * 
     */
    @JsonProperty("TaxExclusiveAmount")
    public List<AmountType> getTaxExclusiveAmount() {
        return taxExclusiveAmount;
    }

    /**
     * Monetary Total. Tax Exclusive Amount. Amount
     * <p>
     * The monetary amount of an extended transaction line, exclusive of taxes.
     * 
     */
    @JsonProperty("TaxExclusiveAmount")
    public void setTaxExclusiveAmount(List<AmountType> taxExclusiveAmount) {
        this.taxExclusiveAmount = taxExclusiveAmount;
    }

    public MonetaryTotal withTaxExclusiveAmount(List<AmountType> taxExclusiveAmount) {
        this.taxExclusiveAmount = taxExclusiveAmount;
        return this;
    }

    /**
     * Monetary Total. Tax Inclusive Amount. Amount
     * <p>
     * The monetary amount including taxes; the sum of payable amount and prepaid amount.
     * 
     */
    @JsonProperty("TaxInclusiveAmount")
    public List<AmountType> getTaxInclusiveAmount() {
        return taxInclusiveAmount;
    }

    /**
     * Monetary Total. Tax Inclusive Amount. Amount
     * <p>
     * The monetary amount including taxes; the sum of payable amount and prepaid amount.
     * 
     */
    @JsonProperty("TaxInclusiveAmount")
    public void setTaxInclusiveAmount(List<AmountType> taxInclusiveAmount) {
        this.taxInclusiveAmount = taxInclusiveAmount;
    }

    public MonetaryTotal withTaxInclusiveAmount(List<AmountType> taxInclusiveAmount) {
        this.taxInclusiveAmount = taxInclusiveAmount;
        return this;
    }

    /**
     * Monetary Total. Allowance_ Total Amount. Amount
     * <p>
     * The total monetary amount of all allowances.
     * 
     */
    @JsonProperty("AllowanceTotalAmount")
    public List<AmountType> getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    /**
     * Monetary Total. Allowance_ Total Amount. Amount
     * <p>
     * The total monetary amount of all allowances.
     * 
     */
    @JsonProperty("AllowanceTotalAmount")
    public void setAllowanceTotalAmount(List<AmountType> allowanceTotalAmount) {
        this.allowanceTotalAmount = allowanceTotalAmount;
    }

    public MonetaryTotal withAllowanceTotalAmount(List<AmountType> allowanceTotalAmount) {
        this.allowanceTotalAmount = allowanceTotalAmount;
        return this;
    }

    /**
     * Monetary Total. Charge_ Total Amount. Amount
     * <p>
     * The total monetary amount of all charges.
     * 
     */
    @JsonProperty("ChargeTotalAmount")
    public List<AmountType> getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    /**
     * Monetary Total. Charge_ Total Amount. Amount
     * <p>
     * The total monetary amount of all charges.
     * 
     */
    @JsonProperty("ChargeTotalAmount")
    public void setChargeTotalAmount(List<AmountType> chargeTotalAmount) {
        this.chargeTotalAmount = chargeTotalAmount;
    }

    public MonetaryTotal withChargeTotalAmount(List<AmountType> chargeTotalAmount) {
        this.chargeTotalAmount = chargeTotalAmount;
        return this;
    }

    /**
     * Monetary Total. Prepaid Amount. Amount
     * <p>
     * The total prepaid monetary amount.
     * 
     */
    @JsonProperty("PrepaidAmount")
    public List<AmountType> getPrepaidAmount() {
        return prepaidAmount;
    }

    /**
     * Monetary Total. Prepaid Amount. Amount
     * <p>
     * The total prepaid monetary amount.
     * 
     */
    @JsonProperty("PrepaidAmount")
    public void setPrepaidAmount(List<AmountType> prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
    }

    public MonetaryTotal withPrepaidAmount(List<AmountType> prepaidAmount) {
        this.prepaidAmount = prepaidAmount;
        return this;
    }

    /**
     * Monetary Total. Payable_ Rounding Amount. Amount
     * <p>
     * The rounding amount (positive or negative) added to produce the line extension amount.
     * 
     */
    @JsonProperty("PayableRoundingAmount")
    public List<AmountType> getPayableRoundingAmount() {
        return payableRoundingAmount;
    }

    /**
     * Monetary Total. Payable_ Rounding Amount. Amount
     * <p>
     * The rounding amount (positive or negative) added to produce the line extension amount.
     * 
     */
    @JsonProperty("PayableRoundingAmount")
    public void setPayableRoundingAmount(List<AmountType> payableRoundingAmount) {
        this.payableRoundingAmount = payableRoundingAmount;
    }

    public MonetaryTotal withPayableRoundingAmount(List<AmountType> payableRoundingAmount) {
        this.payableRoundingAmount = payableRoundingAmount;
        return this;
    }

    /**
     * Monetary Total. Payable_ Amount. Amount
     * <p>
     * The amount of the monetary total to be paid.
     * (Required)
     * 
     */
    @JsonProperty("PayableAmount")
    public List<AmountType> getPayableAmount() {
        return payableAmount;
    }

    /**
     * Monetary Total. Payable_ Amount. Amount
     * <p>
     * The amount of the monetary total to be paid.
     * (Required)
     * 
     */
    @JsonProperty("PayableAmount")
    public void setPayableAmount(List<AmountType> payableAmount) {
        this.payableAmount = payableAmount;
    }

    public MonetaryTotal withPayableAmount(List<AmountType> payableAmount) {
        this.payableAmount = payableAmount;
        return this;
    }

    /**
     * Monetary Total. Payable_ Alternative Amount. Amount
     * <p>
     * The amount of the monetary total to be paid, expressed in an alternative currency.
     * 
     */
    @JsonProperty("PayableAlternativeAmount")
    public List<AmountType> getPayableAlternativeAmount() {
        return payableAlternativeAmount;
    }

    /**
     * Monetary Total. Payable_ Alternative Amount. Amount
     * <p>
     * The amount of the monetary total to be paid, expressed in an alternative currency.
     * 
     */
    @JsonProperty("PayableAlternativeAmount")
    public void setPayableAlternativeAmount(List<AmountType> payableAlternativeAmount) {
        this.payableAlternativeAmount = payableAlternativeAmount;
    }

    public MonetaryTotal withPayableAlternativeAmount(List<AmountType> payableAlternativeAmount) {
        this.payableAlternativeAmount = payableAlternativeAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MonetaryTotal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("lineExtensionAmount");
        sb.append('=');
        sb.append(((this.lineExtensionAmount == null)?"<null>":this.lineExtensionAmount));
        sb.append(',');
        sb.append("taxExclusiveAmount");
        sb.append('=');
        sb.append(((this.taxExclusiveAmount == null)?"<null>":this.taxExclusiveAmount));
        sb.append(',');
        sb.append("taxInclusiveAmount");
        sb.append('=');
        sb.append(((this.taxInclusiveAmount == null)?"<null>":this.taxInclusiveAmount));
        sb.append(',');
        sb.append("allowanceTotalAmount");
        sb.append('=');
        sb.append(((this.allowanceTotalAmount == null)?"<null>":this.allowanceTotalAmount));
        sb.append(',');
        sb.append("chargeTotalAmount");
        sb.append('=');
        sb.append(((this.chargeTotalAmount == null)?"<null>":this.chargeTotalAmount));
        sb.append(',');
        sb.append("prepaidAmount");
        sb.append('=');
        sb.append(((this.prepaidAmount == null)?"<null>":this.prepaidAmount));
        sb.append(',');
        sb.append("payableRoundingAmount");
        sb.append('=');
        sb.append(((this.payableRoundingAmount == null)?"<null>":this.payableRoundingAmount));
        sb.append(',');
        sb.append("payableAmount");
        sb.append('=');
        sb.append(((this.payableAmount == null)?"<null>":this.payableAmount));
        sb.append(',');
        sb.append("payableAlternativeAmount");
        sb.append('=');
        sb.append(((this.payableAlternativeAmount == null)?"<null>":this.payableAlternativeAmount));
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
        result = ((result* 31)+((this.lineExtensionAmount == null)? 0 :this.lineExtensionAmount.hashCode()));
        result = ((result* 31)+((this.prepaidAmount == null)? 0 :this.prepaidAmount.hashCode()));
        result = ((result* 31)+((this.chargeTotalAmount == null)? 0 :this.chargeTotalAmount.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.taxExclusiveAmount == null)? 0 :this.taxExclusiveAmount.hashCode()));
        result = ((result* 31)+((this.allowanceTotalAmount == null)? 0 :this.allowanceTotalAmount.hashCode()));
        result = ((result* 31)+((this.taxInclusiveAmount == null)? 0 :this.taxInclusiveAmount.hashCode()));
        result = ((result* 31)+((this.payableAmount == null)? 0 :this.payableAmount.hashCode()));
        result = ((result* 31)+((this.payableRoundingAmount == null)? 0 :this.payableRoundingAmount.hashCode()));
        result = ((result* 31)+((this.payableAlternativeAmount == null)? 0 :this.payableAlternativeAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MonetaryTotal) == false) {
            return false;
        }
        MonetaryTotal rhs = ((MonetaryTotal) other);
        return (((((((((((this.lineExtensionAmount == rhs.lineExtensionAmount)||((this.lineExtensionAmount!= null)&&this.lineExtensionAmount.equals(rhs.lineExtensionAmount)))&&((this.prepaidAmount == rhs.prepaidAmount)||((this.prepaidAmount!= null)&&this.prepaidAmount.equals(rhs.prepaidAmount))))&&((this.chargeTotalAmount == rhs.chargeTotalAmount)||((this.chargeTotalAmount!= null)&&this.chargeTotalAmount.equals(rhs.chargeTotalAmount))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.taxExclusiveAmount == rhs.taxExclusiveAmount)||((this.taxExclusiveAmount!= null)&&this.taxExclusiveAmount.equals(rhs.taxExclusiveAmount))))&&((this.allowanceTotalAmount == rhs.allowanceTotalAmount)||((this.allowanceTotalAmount!= null)&&this.allowanceTotalAmount.equals(rhs.allowanceTotalAmount))))&&((this.taxInclusiveAmount == rhs.taxInclusiveAmount)||((this.taxInclusiveAmount!= null)&&this.taxInclusiveAmount.equals(rhs.taxInclusiveAmount))))&&((this.payableAmount == rhs.payableAmount)||((this.payableAmount!= null)&&this.payableAmount.equals(rhs.payableAmount))))&&((this.payableRoundingAmount == rhs.payableRoundingAmount)||((this.payableRoundingAmount!= null)&&this.payableRoundingAmount.equals(rhs.payableRoundingAmount))))&&((this.payableAlternativeAmount == rhs.payableAlternativeAmount)||((this.payableAlternativeAmount!= null)&&this.payableAlternativeAmount.equals(rhs.payableAlternativeAmount))));
    }

}
