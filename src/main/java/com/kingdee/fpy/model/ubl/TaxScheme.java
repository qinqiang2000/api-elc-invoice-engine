
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
 * Tax Scheme. Details
 * <p>
 * A class to describe a taxation scheme (e.g., VAT, State tax, County tax).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "TaxTypeCode",
    "CurrencyCode",
    "JurisdictionRegionAddress"
})
@Generated("jsonschema2pojo")
public class TaxScheme {

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
     * Tax Scheme. Identifier
     * <p>
     * An identifier for this taxation scheme.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this taxation scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Tax Scheme. Name
     * <p>
     * The name of this taxation scheme.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this taxation scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Tax Scheme. Tax Type Code. Code
     * <p>
     * A code signifying the type of tax.
     * 
     */
    @JsonProperty("TaxTypeCode")
    @JsonPropertyDescription("A code signifying the type of tax.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> taxTypeCode = new ArrayList<CodeType>();
    /**
     * Tax Scheme. Currency Code. Code
     * <p>
     * A code signifying the currency in which the tax is collected and reported.
     * 
     */
    @JsonProperty("CurrencyCode")
    @JsonPropertyDescription("A code signifying the currency in which the tax is collected and reported.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> currencyCode = new ArrayList<CodeType>();
    /**
     * Tax Scheme. Jurisdiction Region_ Address. Address
     * <p>
     * A geographic area in which this taxation scheme applies.
     * 
     */
    @JsonProperty("JurisdictionRegionAddress")
    @JsonPropertyDescription("A geographic area in which this taxation scheme applies.")
    @Size(min = 1)
    @Valid
    private List<Address> jurisdictionRegionAddress = new ArrayList<Address>();

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

    public TaxScheme withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Tax Scheme. Identifier
     * <p>
     * An identifier for this taxation scheme.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Tax Scheme. Identifier
     * <p>
     * An identifier for this taxation scheme.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TaxScheme withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Tax Scheme. Name
     * <p>
     * The name of this taxation scheme.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Tax Scheme. Name
     * <p>
     * The name of this taxation scheme.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public TaxScheme withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Tax Scheme. Tax Type Code. Code
     * <p>
     * A code signifying the type of tax.
     * 
     */
    @JsonProperty("TaxTypeCode")
    public List<CodeType> getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Tax Scheme. Tax Type Code. Code
     * <p>
     * A code signifying the type of tax.
     * 
     */
    @JsonProperty("TaxTypeCode")
    public void setTaxTypeCode(List<CodeType> taxTypeCode) {
        this.taxTypeCode = taxTypeCode;
    }

    public TaxScheme withTaxTypeCode(List<CodeType> taxTypeCode) {
        this.taxTypeCode = taxTypeCode;
        return this;
    }

    /**
     * Tax Scheme. Currency Code. Code
     * <p>
     * A code signifying the currency in which the tax is collected and reported.
     * 
     */
    @JsonProperty("CurrencyCode")
    public List<CodeType> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Tax Scheme. Currency Code. Code
     * <p>
     * A code signifying the currency in which the tax is collected and reported.
     * 
     */
    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(List<CodeType> currencyCode) {
        this.currencyCode = currencyCode;
    }

    public TaxScheme withCurrencyCode(List<CodeType> currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Tax Scheme. Jurisdiction Region_ Address. Address
     * <p>
     * A geographic area in which this taxation scheme applies.
     * 
     */
    @JsonProperty("JurisdictionRegionAddress")
    public List<Address> getJurisdictionRegionAddress() {
        return jurisdictionRegionAddress;
    }

    /**
     * Tax Scheme. Jurisdiction Region_ Address. Address
     * <p>
     * A geographic area in which this taxation scheme applies.
     * 
     */
    @JsonProperty("JurisdictionRegionAddress")
    public void setJurisdictionRegionAddress(List<Address> jurisdictionRegionAddress) {
        this.jurisdictionRegionAddress = jurisdictionRegionAddress;
    }

    public TaxScheme withJurisdictionRegionAddress(List<Address> jurisdictionRegionAddress) {
        this.jurisdictionRegionAddress = jurisdictionRegionAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaxScheme.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("taxTypeCode");
        sb.append('=');
        sb.append(((this.taxTypeCode == null)?"<null>":this.taxTypeCode));
        sb.append(',');
        sb.append("currencyCode");
        sb.append('=');
        sb.append(((this.currencyCode == null)?"<null>":this.currencyCode));
        sb.append(',');
        sb.append("jurisdictionRegionAddress");
        sb.append('=');
        sb.append(((this.jurisdictionRegionAddress == null)?"<null>":this.jurisdictionRegionAddress));
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
        result = ((result* 31)+((this.jurisdictionRegionAddress == null)? 0 :this.jurisdictionRegionAddress.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.taxTypeCode == null)? 0 :this.taxTypeCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.currencyCode == null)? 0 :this.currencyCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxScheme) == false) {
            return false;
        }
        TaxScheme rhs = ((TaxScheme) other);
        return (((((((this.jurisdictionRegionAddress == rhs.jurisdictionRegionAddress)||((this.jurisdictionRegionAddress!= null)&&this.jurisdictionRegionAddress.equals(rhs.jurisdictionRegionAddress)))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.taxTypeCode == rhs.taxTypeCode)||((this.taxTypeCode!= null)&&this.taxTypeCode.equals(rhs.taxTypeCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.currencyCode == rhs.currencyCode)||((this.currencyCode!= null)&&this.currencyCode.equals(rhs.currencyCode))));
    }

}
