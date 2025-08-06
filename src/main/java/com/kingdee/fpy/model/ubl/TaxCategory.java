
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
 * Tax Category. Details
 * <p>
 * A class to describe one of the tax categories within a taxation scheme (e.g., High Rate VAT, Low Rate VAT).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "Percent",
    "BaseUnitMeasure",
    "PerUnitAmount",
    "TaxExemptionReasonCode",
    "TaxExemptionReason",
    "TierRange",
    "TierRatePercent",
    "TaxScheme"
})
@Generated("jsonschema2pojo")
public class TaxCategory {

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
     * Tax Category. Identifier
     * <p>
     * An identifier for this tax category.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this tax category.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Tax Category. Name
     * <p>
     * The name of this tax category.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this tax category.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Tax Category. Percent
     * <p>
     * The tax rate for this category, expressed as a percentage.
     * 
     */
    @JsonProperty("Percent")
    @JsonPropertyDescription("The tax rate for this category, expressed as a percentage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> percent = new ArrayList<NumericType>();
    /**
     * Tax Category. Base Unit Measure. Measure
     * <p>
     * A Unit of Measures used as the basic for the tax calculation applied at a certain rate per unit.
     * 
     */
    @JsonProperty("BaseUnitMeasure")
    @JsonPropertyDescription("A Unit of Measures used as the basic for the tax calculation applied at a certain rate per unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> baseUnitMeasure = new ArrayList<MeasureType>();
    /**
     * Tax Category. Per Unit_ Amount. Amount
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
     * Tax Category. Tax Exemption Reason Code. Code
     * <p>
     * The reason for tax being exempted, expressed as a code.
     * 
     */
    @JsonProperty("TaxExemptionReasonCode")
    @JsonPropertyDescription("The reason for tax being exempted, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> taxExemptionReasonCode = new ArrayList<CodeType>();
    /**
     * Tax Category. Tax Exemption Reason. Text
     * <p>
     * The reason for tax being exempted, expressed as text.
     * 
     */
    @JsonProperty("TaxExemptionReason")
    @JsonPropertyDescription("The reason for tax being exempted, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> taxExemptionReason = new ArrayList<TextType>();
    /**
     * Tax Category. Tier Range. Text
     * <p>
     * Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax category.
     * 
     */
    @JsonProperty("TierRange")
    @JsonPropertyDescription("Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax category.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> tierRange = new ArrayList<TextType>();
    /**
     * Tax Category. Tier Rate. Percent
     * <p>
     * Where a tax is tiered, the tax rate that applies within the specified range of taxable amounts for this tax category.
     * 
     */
    @JsonProperty("TierRatePercent")
    @JsonPropertyDescription("Where a tax is tiered, the tax rate that applies within the specified range of taxable amounts for this tax category.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> tierRatePercent = new ArrayList<NumericType>();
    /**
     * Tax Category. Tax Scheme
     * <p>
     * The taxation scheme within which this tax category is defined.
     * (Required)
     * 
     */
    @JsonProperty("TaxScheme")
    @JsonPropertyDescription("The taxation scheme within which this tax category is defined.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<TaxScheme> taxScheme = new ArrayList<TaxScheme>();

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

    public TaxCategory withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Tax Category. Identifier
     * <p>
     * An identifier for this tax category.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Tax Category. Identifier
     * <p>
     * An identifier for this tax category.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TaxCategory withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Tax Category. Name
     * <p>
     * The name of this tax category.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Tax Category. Name
     * <p>
     * The name of this tax category.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public TaxCategory withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Tax Category. Percent
     * <p>
     * The tax rate for this category, expressed as a percentage.
     * 
     */
    @JsonProperty("Percent")
    public List<NumericType> getPercent() {
        return percent;
    }

    /**
     * Tax Category. Percent
     * <p>
     * The tax rate for this category, expressed as a percentage.
     * 
     */
    @JsonProperty("Percent")
    public void setPercent(List<NumericType> percent) {
        this.percent = percent;
    }

    public TaxCategory withPercent(List<NumericType> percent) {
        this.percent = percent;
        return this;
    }

    /**
     * Tax Category. Base Unit Measure. Measure
     * <p>
     * A Unit of Measures used as the basic for the tax calculation applied at a certain rate per unit.
     * 
     */
    @JsonProperty("BaseUnitMeasure")
    public List<MeasureType> getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * Tax Category. Base Unit Measure. Measure
     * <p>
     * A Unit of Measures used as the basic for the tax calculation applied at a certain rate per unit.
     * 
     */
    @JsonProperty("BaseUnitMeasure")
    public void setBaseUnitMeasure(List<MeasureType> baseUnitMeasure) {
        this.baseUnitMeasure = baseUnitMeasure;
    }

    public TaxCategory withBaseUnitMeasure(List<MeasureType> baseUnitMeasure) {
        this.baseUnitMeasure = baseUnitMeasure;
        return this;
    }

    /**
     * Tax Category. Per Unit_ Amount. Amount
     * <p>
     * Where a tax is applied at a certain rate per unit, the rate per unit applied.
     * 
     */
    @JsonProperty("PerUnitAmount")
    public List<AmountType> getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Tax Category. Per Unit_ Amount. Amount
     * <p>
     * Where a tax is applied at a certain rate per unit, the rate per unit applied.
     * 
     */
    @JsonProperty("PerUnitAmount")
    public void setPerUnitAmount(List<AmountType> perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
    }

    public TaxCategory withPerUnitAmount(List<AmountType> perUnitAmount) {
        this.perUnitAmount = perUnitAmount;
        return this;
    }

    /**
     * Tax Category. Tax Exemption Reason Code. Code
     * <p>
     * The reason for tax being exempted, expressed as a code.
     * 
     */
    @JsonProperty("TaxExemptionReasonCode")
    public List<CodeType> getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * Tax Category. Tax Exemption Reason Code. Code
     * <p>
     * The reason for tax being exempted, expressed as a code.
     * 
     */
    @JsonProperty("TaxExemptionReasonCode")
    public void setTaxExemptionReasonCode(List<CodeType> taxExemptionReasonCode) {
        this.taxExemptionReasonCode = taxExemptionReasonCode;
    }

    public TaxCategory withTaxExemptionReasonCode(List<CodeType> taxExemptionReasonCode) {
        this.taxExemptionReasonCode = taxExemptionReasonCode;
        return this;
    }

    /**
     * Tax Category. Tax Exemption Reason. Text
     * <p>
     * The reason for tax being exempted, expressed as text.
     * 
     */
    @JsonProperty("TaxExemptionReason")
    public List<TextType> getTaxExemptionReason() {
        return taxExemptionReason;
    }

    /**
     * Tax Category. Tax Exemption Reason. Text
     * <p>
     * The reason for tax being exempted, expressed as text.
     * 
     */
    @JsonProperty("TaxExemptionReason")
    public void setTaxExemptionReason(List<TextType> taxExemptionReason) {
        this.taxExemptionReason = taxExemptionReason;
    }

    public TaxCategory withTaxExemptionReason(List<TextType> taxExemptionReason) {
        this.taxExemptionReason = taxExemptionReason;
        return this;
    }

    /**
     * Tax Category. Tier Range. Text
     * <p>
     * Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax category.
     * 
     */
    @JsonProperty("TierRange")
    public List<TextType> getTierRange() {
        return tierRange;
    }

    /**
     * Tax Category. Tier Range. Text
     * <p>
     * Where a tax is tiered, the range of taxable amounts that determines the rate of tax applicable to this tax category.
     * 
     */
    @JsonProperty("TierRange")
    public void setTierRange(List<TextType> tierRange) {
        this.tierRange = tierRange;
    }

    public TaxCategory withTierRange(List<TextType> tierRange) {
        this.tierRange = tierRange;
        return this;
    }

    /**
     * Tax Category. Tier Rate. Percent
     * <p>
     * Where a tax is tiered, the tax rate that applies within the specified range of taxable amounts for this tax category.
     * 
     */
    @JsonProperty("TierRatePercent")
    public List<NumericType> getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * Tax Category. Tier Rate. Percent
     * <p>
     * Where a tax is tiered, the tax rate that applies within the specified range of taxable amounts for this tax category.
     * 
     */
    @JsonProperty("TierRatePercent")
    public void setTierRatePercent(List<NumericType> tierRatePercent) {
        this.tierRatePercent = tierRatePercent;
    }

    public TaxCategory withTierRatePercent(List<NumericType> tierRatePercent) {
        this.tierRatePercent = tierRatePercent;
        return this;
    }

    /**
     * Tax Category. Tax Scheme
     * <p>
     * The taxation scheme within which this tax category is defined.
     * (Required)
     * 
     */
    @JsonProperty("TaxScheme")
    public List<TaxScheme> getTaxScheme() {
        return taxScheme;
    }

    /**
     * Tax Category. Tax Scheme
     * <p>
     * The taxation scheme within which this tax category is defined.
     * (Required)
     * 
     */
    @JsonProperty("TaxScheme")
    public void setTaxScheme(List<TaxScheme> taxScheme) {
        this.taxScheme = taxScheme;
    }

    public TaxCategory withTaxScheme(List<TaxScheme> taxScheme) {
        this.taxScheme = taxScheme;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxCategory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        sb.append("taxExemptionReasonCode");
        sb.append('=');
        sb.append(((this.taxExemptionReasonCode == null)?"<null>":this.taxExemptionReasonCode));
        sb.append(',');
        sb.append("taxExemptionReason");
        sb.append('=');
        sb.append(((this.taxExemptionReason == null)?"<null>":this.taxExemptionReason));
        sb.append(',');
        sb.append("tierRange");
        sb.append('=');
        sb.append(((this.tierRange == null)?"<null>":this.tierRange));
        sb.append(',');
        sb.append("tierRatePercent");
        sb.append('=');
        sb.append(((this.tierRatePercent == null)?"<null>":this.tierRatePercent));
        sb.append(',');
        sb.append("taxScheme");
        sb.append('=');
        sb.append(((this.taxScheme == null)?"<null>":this.taxScheme));
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
        result = ((result* 31)+((this.baseUnitMeasure == null)? 0 :this.baseUnitMeasure.hashCode()));
        result = ((result* 31)+((this.perUnitAmount == null)? 0 :this.perUnitAmount.hashCode()));
        result = ((result* 31)+((this.taxExemptionReasonCode == null)? 0 :this.taxExemptionReasonCode.hashCode()));
        result = ((result* 31)+((this.tierRatePercent == null)? 0 :this.tierRatePercent.hashCode()));
        result = ((result* 31)+((this.taxScheme == null)? 0 :this.taxScheme.hashCode()));
        result = ((result* 31)+((this.tierRange == null)? 0 :this.tierRange.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.taxExemptionReason == null)? 0 :this.taxExemptionReason.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.percent == null)? 0 :this.percent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxCategory) == false) {
            return false;
        }
        TaxCategory rhs = ((TaxCategory) other);
        return ((((((((((((this.baseUnitMeasure == rhs.baseUnitMeasure)||((this.baseUnitMeasure!= null)&&this.baseUnitMeasure.equals(rhs.baseUnitMeasure)))&&((this.perUnitAmount == rhs.perUnitAmount)||((this.perUnitAmount!= null)&&this.perUnitAmount.equals(rhs.perUnitAmount))))&&((this.taxExemptionReasonCode == rhs.taxExemptionReasonCode)||((this.taxExemptionReasonCode!= null)&&this.taxExemptionReasonCode.equals(rhs.taxExemptionReasonCode))))&&((this.tierRatePercent == rhs.tierRatePercent)||((this.tierRatePercent!= null)&&this.tierRatePercent.equals(rhs.tierRatePercent))))&&((this.taxScheme == rhs.taxScheme)||((this.taxScheme!= null)&&this.taxScheme.equals(rhs.taxScheme))))&&((this.tierRange == rhs.tierRange)||((this.tierRange!= null)&&this.tierRange.equals(rhs.tierRange))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.taxExemptionReason == rhs.taxExemptionReason)||((this.taxExemptionReason!= null)&&this.taxExemptionReason.equals(rhs.taxExemptionReason))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.percent == rhs.percent)||((this.percent!= null)&&this.percent.equals(rhs.percent))));
    }

}
