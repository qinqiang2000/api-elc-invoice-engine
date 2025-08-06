
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
 * Tax Total. Details
 * <p>
 * A class to describe the total tax for a particular taxation scheme.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "TaxAmount",
    "RoundingAmount",
    "TaxEvidenceIndicator",
    "TaxIncludedIndicator",
    "TaxSubtotal"
})
@Generated("jsonschema2pojo")
public class TaxTotal {

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
     * Tax Total. Tax Amount. Amount
     * <p>
     * The total tax amount for a particular taxation scheme, e.g., VAT; the sum of the tax subtotals for each tax category within the taxation scheme.
     * (Required)
     * 
     */
    @JsonProperty("TaxAmount")
    @JsonPropertyDescription("The total tax amount for a particular taxation scheme, e.g., VAT; the sum of the tax subtotals for each tax category within the taxation scheme.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<AmountType> taxAmount = new ArrayList<AmountType>();
    /**
     * Tax Total. Rounding Amount. Amount
     * <p>
     * The rounding amount (positive or negative) added to the calculated tax total to produce the rounded TaxAmount.
     * 
     */
    @JsonProperty("RoundingAmount")
    @JsonPropertyDescription("The rounding amount (positive or negative) added to the calculated tax total to produce the rounded TaxAmount.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> roundingAmount = new ArrayList<AmountType>();
    /**
     * Tax Total. Tax Evidence_ Indicator. Indicator
     * <p>
     * An indicator that this total is recognized as legal evidence for taxation purposes (true) or not (false).
     * 
     */
    @JsonProperty("TaxEvidenceIndicator")
    @JsonPropertyDescription("An indicator that this total is recognized as legal evidence for taxation purposes (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> taxEvidenceIndicator = new ArrayList<IndicatorType>();
    /**
     * Tax Total. Tax Included_ Indicator. Indicator
     * <p>
     * An indicator that tax is included in the calculation (true) or not (false).
     * 
     */
    @JsonProperty("TaxIncludedIndicator")
    @JsonPropertyDescription("An indicator that tax is included in the calculation (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> taxIncludedIndicator = new ArrayList<IndicatorType>();
    /**
     * Tax Total. Tax Subtotal
     * <p>
     * One of the subtotals the sum of which equals the total tax amount for a particular taxation scheme.
     * 
     */
    @JsonProperty("TaxSubtotal")
    @JsonPropertyDescription("One of the subtotals the sum of which equals the total tax amount for a particular taxation scheme.")
    @Size(min = 1)
    @Valid
    private List<TaxSubtotal> taxSubtotal = new ArrayList<TaxSubtotal>();

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

    public TaxTotal withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Tax Total. Tax Amount. Amount
     * <p>
     * The total tax amount for a particular taxation scheme, e.g., VAT; the sum of the tax subtotals for each tax category within the taxation scheme.
     * (Required)
     * 
     */
    @JsonProperty("TaxAmount")
    public List<AmountType> getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax Total. Tax Amount. Amount
     * <p>
     * The total tax amount for a particular taxation scheme, e.g., VAT; the sum of the tax subtotals for each tax category within the taxation scheme.
     * (Required)
     * 
     */
    @JsonProperty("TaxAmount")
    public void setTaxAmount(List<AmountType> taxAmount) {
        this.taxAmount = taxAmount;
    }

    public TaxTotal withTaxAmount(List<AmountType> taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Tax Total. Rounding Amount. Amount
     * <p>
     * The rounding amount (positive or negative) added to the calculated tax total to produce the rounded TaxAmount.
     * 
     */
    @JsonProperty("RoundingAmount")
    public List<AmountType> getRoundingAmount() {
        return roundingAmount;
    }

    /**
     * Tax Total. Rounding Amount. Amount
     * <p>
     * The rounding amount (positive or negative) added to the calculated tax total to produce the rounded TaxAmount.
     * 
     */
    @JsonProperty("RoundingAmount")
    public void setRoundingAmount(List<AmountType> roundingAmount) {
        this.roundingAmount = roundingAmount;
    }

    public TaxTotal withRoundingAmount(List<AmountType> roundingAmount) {
        this.roundingAmount = roundingAmount;
        return this;
    }

    /**
     * Tax Total. Tax Evidence_ Indicator. Indicator
     * <p>
     * An indicator that this total is recognized as legal evidence for taxation purposes (true) or not (false).
     * 
     */
    @JsonProperty("TaxEvidenceIndicator")
    public List<IndicatorType> getTaxEvidenceIndicator() {
        return taxEvidenceIndicator;
    }

    /**
     * Tax Total. Tax Evidence_ Indicator. Indicator
     * <p>
     * An indicator that this total is recognized as legal evidence for taxation purposes (true) or not (false).
     * 
     */
    @JsonProperty("TaxEvidenceIndicator")
    public void setTaxEvidenceIndicator(List<IndicatorType> taxEvidenceIndicator) {
        this.taxEvidenceIndicator = taxEvidenceIndicator;
    }

    public TaxTotal withTaxEvidenceIndicator(List<IndicatorType> taxEvidenceIndicator) {
        this.taxEvidenceIndicator = taxEvidenceIndicator;
        return this;
    }

    /**
     * Tax Total. Tax Included_ Indicator. Indicator
     * <p>
     * An indicator that tax is included in the calculation (true) or not (false).
     * 
     */
    @JsonProperty("TaxIncludedIndicator")
    public List<IndicatorType> getTaxIncludedIndicator() {
        return taxIncludedIndicator;
    }

    /**
     * Tax Total. Tax Included_ Indicator. Indicator
     * <p>
     * An indicator that tax is included in the calculation (true) or not (false).
     * 
     */
    @JsonProperty("TaxIncludedIndicator")
    public void setTaxIncludedIndicator(List<IndicatorType> taxIncludedIndicator) {
        this.taxIncludedIndicator = taxIncludedIndicator;
    }

    public TaxTotal withTaxIncludedIndicator(List<IndicatorType> taxIncludedIndicator) {
        this.taxIncludedIndicator = taxIncludedIndicator;
        return this;
    }

    /**
     * Tax Total. Tax Subtotal
     * <p>
     * One of the subtotals the sum of which equals the total tax amount for a particular taxation scheme.
     * 
     */
    @JsonProperty("TaxSubtotal")
    public List<TaxSubtotal> getTaxSubtotal() {
        return taxSubtotal;
    }

    /**
     * Tax Total. Tax Subtotal
     * <p>
     * One of the subtotals the sum of which equals the total tax amount for a particular taxation scheme.
     * 
     */
    @JsonProperty("TaxSubtotal")
    public void setTaxSubtotal(List<TaxSubtotal> taxSubtotal) {
        this.taxSubtotal = taxSubtotal;
    }

    public TaxTotal withTaxSubtotal(List<TaxSubtotal> taxSubtotal) {
        this.taxSubtotal = taxSubtotal;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxTotal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("taxAmount");
        sb.append('=');
        sb.append(((this.taxAmount == null)?"<null>":this.taxAmount));
        sb.append(',');
        sb.append("roundingAmount");
        sb.append('=');
        sb.append(((this.roundingAmount == null)?"<null>":this.roundingAmount));
        sb.append(',');
        sb.append("taxEvidenceIndicator");
        sb.append('=');
        sb.append(((this.taxEvidenceIndicator == null)?"<null>":this.taxEvidenceIndicator));
        sb.append(',');
        sb.append("taxIncludedIndicator");
        sb.append('=');
        sb.append(((this.taxIncludedIndicator == null)?"<null>":this.taxIncludedIndicator));
        sb.append(',');
        sb.append("taxSubtotal");
        sb.append('=');
        sb.append(((this.taxSubtotal == null)?"<null>":this.taxSubtotal));
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
        result = ((result* 31)+((this.roundingAmount == null)? 0 :this.roundingAmount.hashCode()));
        result = ((result* 31)+((this.taxEvidenceIndicator == null)? 0 :this.taxEvidenceIndicator.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.taxIncludedIndicator == null)? 0 :this.taxIncludedIndicator.hashCode()));
        result = ((result* 31)+((this.taxSubtotal == null)? 0 :this.taxSubtotal.hashCode()));
        result = ((result* 31)+((this.taxAmount == null)? 0 :this.taxAmount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxTotal) == false) {
            return false;
        }
        TaxTotal rhs = ((TaxTotal) other);
        return (((((((this.roundingAmount == rhs.roundingAmount)||((this.roundingAmount!= null)&&this.roundingAmount.equals(rhs.roundingAmount)))&&((this.taxEvidenceIndicator == rhs.taxEvidenceIndicator)||((this.taxEvidenceIndicator!= null)&&this.taxEvidenceIndicator.equals(rhs.taxEvidenceIndicator))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.taxIncludedIndicator == rhs.taxIncludedIndicator)||((this.taxIncludedIndicator!= null)&&this.taxIncludedIndicator.equals(rhs.taxIncludedIndicator))))&&((this.taxSubtotal == rhs.taxSubtotal)||((this.taxSubtotal!= null)&&this.taxSubtotal.equals(rhs.taxSubtotal))))&&((this.taxAmount == rhs.taxAmount)||((this.taxAmount!= null)&&this.taxAmount.equals(rhs.taxAmount))));
    }

}
