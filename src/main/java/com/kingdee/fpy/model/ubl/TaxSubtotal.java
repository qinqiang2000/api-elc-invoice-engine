
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
 * Tax Subtotal. Details
 * <p>
 * A class to define the subtotal for a particular tax category within a particular taxation scheme, such as standard rate within VAT.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "TaxableAmount",
    "TaxAmount",
    "CalculationSequenceNumeric",
    "TransactionCurrencyTaxAmount",
    "Percent",
    "BaseUnitMeasure",
    "PerUnitAmount",
    "TierRange",
    "TierRatePercent",
    "TaxCategory"
})
@Generated("jsonschema2pojo")
public class TaxSubtotal {

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
     * Tax Subtotal. Taxable_ Amount. Amount
     * <p>
     * The net amount to which the tax percent (rate) is applied to calculate the tax amount.
     * 
     */
    @JsonProperty("TaxableAmount")
    @JsonPropertyDescription("The net amount to which the tax percent (rate) is applied to calculate the tax amount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> taxableAmount = new ArrayList<AmountType>();
    /**
     * Tax Subtotal. Tax Amount. Amount
     * <p>
     * The amount of this tax subtotal.
     * (Required)
     * 
     */
    @JsonProperty("TaxAmount")
    @JsonPropertyDescription("The amount of this tax subtotal.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> taxAmount = new ArrayList<AmountType>();
    /**
     * Tax Subtotal. Calculation Sequence. Numeric
     * <p>
     * The number of this tax subtotal in the sequence of subtotals corresponding to the order in which multiple taxes are applied. If all taxes are applied to the same taxable amount (i.e., their order of application is inconsequential), then CalculationSequenceNumeric is 1 for all tax subtotals applied to a given amount.
     * 
     */
    @JsonProperty("CalculationSequenceNumeric")
    @JsonPropertyDescription("The number of this tax subtotal in the sequence of subtotals corresponding to the order in which multiple taxes are applied. If all taxes are applied to the same taxable amount (i.e., their order of application is inconsequential), then CalculationSequenceNumeric is 1 for all tax subtotals applied to a given amount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> calculationSequenceNumeric = new ArrayList<NumericType>();
    /**
     * Tax Subtotal. Transaction Currency_ Tax Amount. Amount
     * <p>
     * The amount of this tax subtotal, expressed in the currency used for invoicing.
     * 
     */
    @JsonProperty("TransactionCurrencyTaxAmount")
    @JsonPropertyDescription("The amount of this tax subtotal, expressed in the currency used for invoicing.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> transactionCurrencyTaxAmount = new ArrayList<AmountType>();
    /**
     * Tax Subtotal. Percent
     * <p>
     * The tax rate of the tax category applied to this tax subtotal, expressed as a percentage.
     * 
     */
    @JsonProperty("Percent")
    @JsonPropertyDescription("The tax rate of the tax category applied to this tax subtotal, expressed as a percentage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> percent = new ArrayList<NumericType>();
    /**
     * Tax Subtotal. Base Unit Measure. Measure
     * <p>
     * The unit of measure on which the tax calculation is based
     * 
     */
    @JsonProperty("BaseUnitMeasure")
    @JsonPropertyDescription("The unit of measure on which the tax calculation is based")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> baseUnitMeasure = new ArrayList<MeasureType>();
    /**
     * Tax Subtotal. Per Unit_ Amount. Amount
     * <p>
     * Where a tax is applied at a certain rate per unit, the rate per unit applied.
     * 
     */
    @JsonProperty("PerUnitAmount")
    @JsonPropertyDescription("Where a tax is applied at a certain rate per unit, the rate per unit applied.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> perUnitAmount = new ArrayList<AmountType>();
    /**
     * Tax Subtotal. Tier Range. Text
     * <p>
     * Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax subtotal.
     * 
     */
    @JsonProperty("TierRange")
    @JsonPropertyDescription("Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax subtotal.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> tierRange = new ArrayList<TextType>();
    /**
     * Tax Subtotal. Tier Rate. Percent
     * <p>
     * Where a tax is tiered, the tax rate that applies within a specified range of taxable amounts for this tax subtotal.
     * 
     */
    @JsonProperty("TierRatePercent")
    @JsonPropertyDescription("Where a tax is tiered, the tax rate that applies within a specified range of taxable amounts for this tax subtotal.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> tierRatePercent = new ArrayList<NumericType>();
    /**
     * Tax Subtotal. Tax Category
     * <p>
     * The tax category applicable to this subtotal.
     * (Required)
     * 
     */
    @JsonProperty("TaxCategory")
    @JsonPropertyDescription("The tax category applicable to this subtotal.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<TaxCategory> taxCategory = new ArrayList<TaxCategory>();

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

    public TaxSubtotal withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Tax Subtotal. Taxable_ Amount. Amount
     * <p>
     * The net amount to which the tax percent (rate) is applied to calculate the tax amount.
     * 
     */
    @JsonProperty("TaxableAmount")
    public List<AmountType> getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Tax Subtotal. Taxable_ Amount. Amount
     * <p>
     * The net amount to which the tax percent (rate) is applied to calculate the tax amount.
     * 
     */
    @JsonProperty("TaxableAmount")
    public void setTaxableAmount(List<AmountType> taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public TaxSubtotal withTaxableAmount(List<AmountType> taxableAmount) {
        this.taxableAmount = taxableAmount;
        return this;
    }

    /**
     * Tax Subtotal. Tax Amount. Amount
     * <p>
     * The amount of this tax subtotal.
     * (Required)
     * 
     */
    @JsonProperty("TaxAmount")
    public List<AmountType> getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax Subtotal. Tax Amount. Amount
     * <p>
     * The amount of this tax subtotal.
     * (Required)
     * 
     */
    @JsonProperty("TaxAmount")
    public void setTaxAmount(List<AmountType> taxAmount) {
        this.taxAmount = taxAmount;
    }

    public TaxSubtotal withTaxAmount(List<AmountType> taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Tax Subtotal. Calculation Sequence. Numeric
     * <p>
     * The number of this tax subtotal in the sequence of subtotals corresponding to the order in which multiple taxes are applied. If all taxes are applied to the same taxable amount (i.e., their order of application is inconsequential), then CalculationSequenceNumeric is 1 for all tax subtotals applied to a given amount.
     * 
     */
    @JsonProperty("CalculationSequenceNumeric")
    public List<NumericType> getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    /**
     * Tax Subtotal. Calculation Sequence. Numeric
     * <p>
     * The number of this tax subtotal in the sequence of subtotals corresponding to the order in which multiple taxes are applied. If all taxes are applied to the same taxable amount (i.e., their order of application is inconsequential), then CalculationSequenceNumeric is 1 for all tax subtotals applied to a given amount.
     * 
     */
    @JsonProperty("CalculationSequenceNumeric")
    public void setCalculationSequenceNumeric(List<NumericType> calculationSequenceNumeric) {
        this.calculationSequenceNumeric = calculationSequenceNumeric;
    }

    public TaxSubtotal withCalculationSequenceNumeric(List<NumericType> calculationSequenceNumeric) {
        this.calculationSequenceNumeric = calculationSequenceNumeric;
        return this;
    }

    /**
     * Tax Subtotal. Transaction Currency_ Tax Amount. Amount
     * <p>
     * The amount of this tax subtotal, expressed in the currency used for invoicing.
     * 
     */
    @JsonProperty("TransactionCurrencyTaxAmount")
    public List<AmountType> getTransactionCurrencyTaxAmount() {
        return transactionCurrencyTaxAmount;
    }

    /**
     * Tax Subtotal. Transaction Currency_ Tax Amount. Amount
     * <p>
     * The amount of this tax subtotal, expressed in the currency used for invoicing.
     * 
     */
    @JsonProperty("TransactionCurrencyTaxAmount")
    public void setTransactionCurrencyTaxAmount(List<AmountType> transactionCurrencyTaxAmount) {
        this.transactionCurrencyTaxAmount = transactionCurrencyTaxAmount;
    }

    public TaxSubtotal withTransactionCurrencyTaxAmount(List<AmountType> transactionCurrencyTaxAmount) {
        this.transactionCurrencyTaxAmount = transactionCurrencyTaxAmount;
        return this;
    }

    /**
     * Tax Subtotal. Percent
     * <p>
     * The tax rate of the tax category applied to this tax subtotal, expressed as a percentage.
     * 
     */
    @JsonProperty("Percent")
    public List<NumericType> getPercent() {
        return percent;
    }

    /**
     * Tax Subtotal. Percent
     * <p>
     * The tax rate of the tax category applied to this tax subtotal, expressed as a percentage.
     * 
     */
    @JsonProperty("Percent")
    public void setPercent(List<NumericType> percent) {
        this.percent = percent;
    }

    public TaxSubtotal withPercent(List<NumericType> percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Tax Subtotal. Base Unit Measure. Measure
     * <p>
     * The unit of measure on which the tax calculation is based
     * 
     */
    @JsonProperty("BaseUnitMeasure")
    public List<MeasureType> getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * Tax Subtotal. Base Unit Measure. Measure
     * <p>
     * The unit of measure on which the tax calculation is based
     * 
     */
    @JsonProperty("BaseUnitMeasure")
    public void setBaseUnitMeasure(List<MeasureType> baseUnitMeasure) {
        this.baseUnitMeasure = baseUnitMeasure;
    }

    public TaxSubtotal withBaseUnitMeasure(List<MeasureType> baseUnitMeasure) {
        this.baseUnitMeasure = baseUnitMeasure;
        return this;
    }

    /**
     * Tax Subtotal. Per Unit_ Amount. Amount
     * <p>
     * Where a tax is applied at a certain rate per unit, the rate per unit applied.
     * 
     */
    @JsonProperty("PerUnitAmount")
    public List<AmountType> getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Tax Subtotal. Per Unit_ Amount. Amount
     * <p>
     * Where a tax is applied at a certain rate per unit, the rate per unit applied.
     * 
     */
    @JsonProperty("PerUnitAmount")
    public void setPerUnitAmount(List<AmountType> perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
    }

    public TaxSubtotal withPerUnitAmount(List<AmountType> perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
        return this;
    }

    /**
     * Tax Subtotal. Tier Range. Text
     * <p>
     * Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax subtotal.
     * 
     */
    @JsonProperty("TierRange")
    public List<TextType> getTierRange() {
        return tierRange;
    }

    /**
     * Tax Subtotal. Tier Range. Text
     * <p>
     * Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax subtotal.
     * 
     */
    @JsonProperty("TierRange")
    public void setTierRange(List<TextType> tierRange) {
        this.tierRange = tierRange;
    }

    public TaxSubtotal withTierRange(List<TextType> tierRange) {
        this.tierRange = tierRange;
        return this;
    }

    /**
     * Tax Subtotal. Tier Rate. Percent
     * <p>
     * Where a tax is tiered, the tax rate that applies within a specified range of taxable amounts for this tax subtotal.
     * 
     */
    @JsonProperty("TierRatePercent")
    public List<NumericType> getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * Tax Subtotal. Tier Rate. Percent
     * <p>
     * Where a tax is tiered, the tax rate that applies within a specified range of taxable amounts for this tax subtotal.
     * 
     */
    @JsonProperty("TierRatePercent")
    public void setTierRatePercent(List<NumericType> tierRatePercent) {
        this.tierRatePercent = tierRatePercent;
    }

    public TaxSubtotal withTierRatePercent(List<NumericType> tierRatePercent) {
        this.tierRatePercent = tierRatePercent;
        return this;
    }

    /**
     * Tax Subtotal. Tax Category
     * <p>
     * The tax category applicable to this subtotal.
     * (Required)
     * 
     */
    @JsonProperty("TaxCategory")
    public List<TaxCategory> getTaxCategory() {
        return taxCategory;
    }

    /**
     * Tax Subtotal. Tax Category
     * <p>
     * The tax category applicable to this subtotal.
     * (Required)
     * 
     */
    @JsonProperty("TaxCategory")
    public void setTaxCategory(List<TaxCategory> taxCategory) {
        this.taxCategory = taxCategory;
    }

    public TaxSubtotal withTaxCategory(List<TaxCategory> taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxSubtotal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("taxableAmount");
        sb.append('=');
        sb.append(((this.taxableAmount == null)?"<null>":this.taxableAmount));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("calculationSequenceNumeric");
        sb.append('=');
        sb.append(((this.calculationSequenceNumeric == null)?"<null>":this.calculationSequenceNumeric));
        sb.append(',');
        sb.append("transactionCurrencyTaxAmount");
        sb.append('=');
        sb.append(((this.transactionCurrencyTaxAmount == null)?"<null>":this.transactionCurrencyTaxAmount));
        sb.append(',');
        sb.append("percent");
        sb.append('=');
        sb.append(((this.percent == null)?"<null>":this.percent));
        sb.append(',');
        sb.append("baseUnitMeasure");
        sb.append('=');
        sb.append(((this.baseUnitMeasure == null)?"<null>":this.baseUnitMeasure));
        sb.append(',');
        sb.append("perUnitAmount");
        sb.append('=');
        sb.append(((this.perUnitAmount == null)?"<null>":this.perUnitAmount));
        sb.append(',');
        sb.append("tierRange");
        sb.append('=');
        sb.append(((this.tierRange == null)?"<null>":this.tierRange));
        sb.append(',');
        sb.append("tierRatePercent");
        sb.append('=');
        sb.append(((this.tierRatePercent == null)?"<null>":this.tierRatePercent));
        sb.append(',');
        sb.append("taxCategory");
        sb.append('=');
        sb.append(((this.taxCategory == null)?"<null>":this.taxCategory));
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
        result = ((result* 31)+((this.calculationSequenceNumeric == null)? 0 :this.calculationSequenceNumeric.hashCode()));
        result = ((result* 31)+((this.taxableAmount == null)? 0 :this.taxableAmount.hashCode()));
        result = ((result* 31)+((this.baseUnitMeasure == null)? 0 :this.baseUnitMeasure.hashCode()));
        result = ((result* 31)+((this.perUnitAmount == null)? 0 :this.perUnitAmount.hashCode()));
        result = ((result* 31)+((this.transactionCurrencyTaxAmount == null)? 0 :this.transactionCurrencyTaxAmount.hashCode()));
        result = ((result* 31)+((this.tierRatePercent == null)? 0 :this.tierRatePercent.hashCode()));
        result = ((result* 31)+((this.tierRange == null)? 0 :this.tierRange.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        result = ((result* 31)+((this.taxCategory == null)? 0 :this.taxCategory.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxSubtotal) == false) {
            return false;
        }
        TaxSubtotal rhs = ((TaxSubtotal) other);
        return ((((((((((((this.calculationSequenceNumeric == rhs.calculationSequenceNumeric)||((this.calculationSequenceNumeric!= null)&&this.calculationSequenceNumeric.equals(rhs.calculationSequenceNumeric)))&&((this.taxableAmount == rhs.taxableAmount)||((this.taxableAmount!= null)&&this.taxableAmount.equals(rhs.taxableAmount))))&&((this.baseUnitMeasure == rhs.baseUnitMeasure)||((this.baseUnitMeasure!= null)&&this.baseUnitMeasure.equals(rhs.baseUnitMeasure))))&&((this.perUnitAmount == rhs.perUnitAmount)||((this.perUnitAmount!= null)&&this.perUnitAmount.equals(rhs.perUnitAmount))))&&((this.transactionCurrencyTaxAmount == rhs.transactionCurrencyTaxAmount)||((this.transactionCurrencyTaxAmount!= null)&&this.transactionCurrencyTaxAmount.equals(rhs.transactionCurrencyTaxAmount))))&&((this.tierRatePercent == rhs.tierRatePercent)||((this.tierRatePercent!= null)&&this.tierRatePercent.equals(rhs.tierRatePercent))))&&((this.tierRange == rhs.tierRange)||((this.tierRange!= null)&&this.tierRange.equals(rhs.tierRange))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))))&&((this.taxCategory == rhs.taxCategory)||((this.taxCategory!= null)&&this.taxCategory.equals(rhs.taxCategory))));
    }

}
