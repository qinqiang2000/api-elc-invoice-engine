
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
 * Trading Terms. Details
 * <p>
 * A class for describing the terms of a trade agreement.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "Information",
    "Reference",
    "ApplicableAddress"
})
@Generated("jsonschema2pojo")
public class TradingTerms {

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
     * Trading Terms. Information. Text
     * <p>
     * Text describing the terms of a trade agreement.
     * 
     */
    @JsonProperty("Information")
    @JsonPropertyDescription("Text describing the terms of a trade agreement.")
    @Size(min = 1)
    @Valid
    private List<TextType> information = new ArrayList<TextType>();
    /**
     * Trading Terms. Reference. Text
     * <p>
     * A reference quoting the basis of the terms
     * 
     */
    @JsonProperty("Reference")
    @JsonPropertyDescription("A reference quoting the basis of the terms")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> reference = new ArrayList<TextType>();
    /**
     * Trading Terms. Applicable_ Address. Address
     * <p>
     * The address at which these trading terms apply.
     * 
     */
    @JsonProperty("ApplicableAddress")
    @JsonPropertyDescription("The address at which these trading terms apply.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> applicableAddress = new ArrayList<Address>();

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

    public TradingTerms withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Trading Terms. Information. Text
     * <p>
     * Text describing the terms of a trade agreement.
     * 
     */
    @JsonProperty("Information")
    public List<TextType> getInformation() {
        return information;
    }

    /**
     * Trading Terms. Information. Text
     * <p>
     * Text describing the terms of a trade agreement.
     * 
     */
    @JsonProperty("Information")
    public void setInformation(List<TextType> information) {
        this.information = information;
    }

    public TradingTerms withInformation(List<TextType> information) {
        this.information = information;
        return this;
    }

    /**
     * Trading Terms. Reference. Text
     * <p>
     * A reference quoting the basis of the terms
     * 
     */
    @JsonProperty("Reference")
    public List<TextType> getReference() {
        return reference;
    }

    /**
     * Trading Terms. Reference. Text
     * <p>
     * A reference quoting the basis of the terms
     * 
     */
    @JsonProperty("Reference")
    public void setReference(List<TextType> reference) {
        this.reference = reference;
    }

    public TradingTerms withReference(List<TextType> reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Trading Terms. Applicable_ Address. Address
     * <p>
     * The address at which these trading terms apply.
     * 
     */
    @JsonProperty("ApplicableAddress")
    public List<Address> getApplicableAddress() {
        return applicableAddress;
    }

    /**
     * Trading Terms. Applicable_ Address. Address
     * <p>
     * The address at which these trading terms apply.
     * 
     */
    @JsonProperty("ApplicableAddress")
    public void setApplicableAddress(List<Address> applicableAddress) {
        this.applicableAddress = applicableAddress;
    }

    public TradingTerms withApplicableAddress(List<Address> applicableAddress) {
        this.applicableAddress = applicableAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradingTerms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("information");
        sb.append('=');
        sb.append(((this.information == null)?"<null>":this.information));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("applicableAddress");
        sb.append('=');
        sb.append(((this.applicableAddress == null)?"<null>":this.applicableAddress));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.information == null)? 0 :this.information.hashCode()));
        result = ((result* 31)+((this.applicableAddress == null)? 0 :this.applicableAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradingTerms) == false) {
            return false;
        }
        TradingTerms rhs = ((TradingTerms) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.information == rhs.information)||((this.information!= null)&&this.information.equals(rhs.information))))&&((this.applicableAddress == rhs.applicableAddress)||((this.applicableAddress!= null)&&this.applicableAddress.equals(rhs.applicableAddress))));
    }

}
