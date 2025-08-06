
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
 * Price List. Details
 * <p>
 * A class to describe a price list.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "StatusCode",
    "ValidityPeriod",
    "PreviousPriceList"
})
@Generated("jsonschema2pojo")
public class PriceList {

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
     * Price List. Identifier
     * <p>
     * An identifier for this price list.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this price list.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Price List. Status Code. Code
     * <p>
     * A code signifying whether this price list is an original, copy, revision, or cancellation.
     * 
     */
    @JsonProperty("StatusCode")
    @JsonPropertyDescription("A code signifying whether this price list is an original, copy, revision, or cancellation.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> statusCode = new ArrayList<CodeType>();
    /**
     * Price List. Validity_ Period. Period
     * <p>
     * A period during which this price list is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    @JsonPropertyDescription("A period during which this price list is valid.")
    @Size(min = 1)
    @Valid
    private List<Period> validityPeriod = new ArrayList<Period>();
    /**
     * Price List. Previous_ Price List. Price List
     * <p>
     * The previous price list.
     * 
     */
    @JsonProperty("PreviousPriceList")
    @JsonPropertyDescription("The previous price list.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PriceList> previousPriceList = new ArrayList<PriceList>();

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

    public PriceList withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Price List. Identifier
     * <p>
     * An identifier for this price list.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Price List. Identifier
     * <p>
     * An identifier for this price list.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public PriceList withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Price List. Status Code. Code
     * <p>
     * A code signifying whether this price list is an original, copy, revision, or cancellation.
     * 
     */
    @JsonProperty("StatusCode")
    public List<CodeType> getStatusCode() {
        return statusCode;
    }

    /**
     * Price List. Status Code. Code
     * <p>
     * A code signifying whether this price list is an original, copy, revision, or cancellation.
     * 
     */
    @JsonProperty("StatusCode")
    public void setStatusCode(List<CodeType> statusCode) {
        this.statusCode = statusCode;
    }

    public PriceList withStatusCode(List<CodeType> statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Price List. Validity_ Period. Period
     * <p>
     * A period during which this price list is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public List<Period> getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Price List. Validity_ Period. Period
     * <p>
     * A period during which this price list is valid.
     * 
     */
    @JsonProperty("ValidityPeriod")
    public void setValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public PriceList withValidityPeriod(List<Period> validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Price List. Previous_ Price List. Price List
     * <p>
     * The previous price list.
     * 
     */
    @JsonProperty("PreviousPriceList")
    public List<PriceList> getPreviousPriceList() {
        return previousPriceList;
    }

    /**
     * Price List. Previous_ Price List. Price List
     * <p>
     * The previous price list.
     * 
     */
    @JsonProperty("PreviousPriceList")
    public void setPreviousPriceList(List<PriceList> previousPriceList) {
        this.previousPriceList = previousPriceList;
    }

    public PriceList withPreviousPriceList(List<PriceList> previousPriceList) {
        this.previousPriceList = previousPriceList;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PriceList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("statusCode");
        sb.append('=');
        sb.append(((this.statusCode == null)?"<null>":this.statusCode));
        sb.append(',');
        sb.append("validityPeriod");
        sb.append('=');
        sb.append(((this.validityPeriod == null)?"<null>":this.validityPeriod));
        sb.append(',');
        sb.append("previousPriceList");
        sb.append('=');
        sb.append(((this.previousPriceList == null)?"<null>":this.previousPriceList));
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
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.validityPeriod == null)? 0 :this.validityPeriod.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.previousPriceList == null)? 0 :this.previousPriceList.hashCode()));
        result = ((result* 31)+((this.statusCode == null)? 0 :this.statusCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PriceList) == false) {
            return false;
        }
        PriceList rhs = ((PriceList) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.validityPeriod == rhs.validityPeriod)||((this.validityPeriod!= null)&&this.validityPeriod.equals(rhs.validityPeriod))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.previousPriceList == rhs.previousPriceList)||((this.previousPriceList!= null)&&this.previousPriceList.equals(rhs.previousPriceList))))&&((this.statusCode == rhs.statusCode)||((this.statusCode!= null)&&this.statusCode.equals(rhs.statusCode))));
    }

}
