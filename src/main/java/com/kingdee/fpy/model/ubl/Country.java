
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
 * Country. Details
 * <p>
 * A class to describe a country.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "IdentificationCode",
    "Name"
})
@Generated("jsonschema2pojo")
public class Country {

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
     * Country. Identification Code. Code
     * <p>
     * A code signifying this country.
     * 
     */
    @JsonProperty("IdentificationCode")
    @JsonPropertyDescription("A code signifying this country.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> identificationCode = new ArrayList<CodeType>();
    /**
     * Country. Name
     * <p>
     * The name of this country.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this country.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();

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

    public Country withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Country. Identification Code. Code
     * <p>
     * A code signifying this country.
     * 
     */
    @JsonProperty("IdentificationCode")
    public List<CodeType> getIdentificationCode() {
        return identificationCode;
    }

    /**
     * Country. Identification Code. Code
     * <p>
     * A code signifying this country.
     * 
     */
    @JsonProperty("IdentificationCode")
    public void setIdentificationCode(List<CodeType> identificationCode) {
        this.identificationCode = identificationCode;
    }

    public Country withIdentificationCode(List<CodeType> identificationCode) {
        this.identificationCode = identificationCode;
        return this;
    }

    /**
     * Country. Name
     * <p>
     * The name of this country.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Country. Name
     * <p>
     * The name of this country.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public Country withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Country.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("identificationCode");
        sb.append('=');
        sb.append(((this.identificationCode == null)?"<null>":this.identificationCode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.identificationCode == null)? 0 :this.identificationCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Country) == false) {
            return false;
        }
        Country rhs = ((Country) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.identificationCode == rhs.identificationCode)||((this.identificationCode!= null)&&this.identificationCode.equals(rhs.identificationCode))));
    }

}
