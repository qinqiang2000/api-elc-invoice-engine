
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
 * Corporate Registration Scheme. Details
 * <p>
 * A class to describe a scheme for corporate registration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "CorporateRegistrationTypeCode",
    "JurisdictionRegionAddress"
})
@Generated("jsonschema2pojo")
public class CorporateRegistrationScheme {

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
     * Corporate Registration Scheme. Identifier
     * <p>
     * An identifier for this registration scheme.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this registration scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Corporate Registration Scheme. Name
     * <p>
     * The name of this registration scheme.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this registration scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Corporate Registration Scheme. Corporate Registration Type Code. Code
     * <p>
     * A code signifying the type of this registration scheme.
     * 
     */
    @JsonProperty("CorporateRegistrationTypeCode")
    @JsonPropertyDescription("A code signifying the type of this registration scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> corporateRegistrationTypeCode = new ArrayList<CodeType>();
    /**
     * Corporate Registration Scheme. Jurisdiction Region_ Address. Address
     * <p>
     * A geographic area in which this registration scheme applies.
     * 
     */
    @JsonProperty("JurisdictionRegionAddress")
    @JsonPropertyDescription("A geographic area in which this registration scheme applies.")
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

    public CorporateRegistrationScheme withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Corporate Registration Scheme. Identifier
     * <p>
     * An identifier for this registration scheme.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Corporate Registration Scheme. Identifier
     * <p>
     * An identifier for this registration scheme.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public CorporateRegistrationScheme withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Corporate Registration Scheme. Name
     * <p>
     * The name of this registration scheme.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Corporate Registration Scheme. Name
     * <p>
     * The name of this registration scheme.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public CorporateRegistrationScheme withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Corporate Registration Scheme. Corporate Registration Type Code. Code
     * <p>
     * A code signifying the type of this registration scheme.
     * 
     */
    @JsonProperty("CorporateRegistrationTypeCode")
    public List<CodeType> getCorporateRegistrationTypeCode() {
        return corporateRegistrationTypeCode;
    }

    /**
     * Corporate Registration Scheme. Corporate Registration Type Code. Code
     * <p>
     * A code signifying the type of this registration scheme.
     * 
     */
    @JsonProperty("CorporateRegistrationTypeCode")
    public void setCorporateRegistrationTypeCode(List<CodeType> corporateRegistrationTypeCode) {
        this.corporateRegistrationTypeCode = corporateRegistrationTypeCode;
    }

    public CorporateRegistrationScheme withCorporateRegistrationTypeCode(List<CodeType> corporateRegistrationTypeCode) {
        this.corporateRegistrationTypeCode = corporateRegistrationTypeCode;
        return this;
    }

    /**
     * Corporate Registration Scheme. Jurisdiction Region_ Address. Address
     * <p>
     * A geographic area in which this registration scheme applies.
     * 
     */
    @JsonProperty("JurisdictionRegionAddress")
    public List<Address> getJurisdictionRegionAddress() {
        return jurisdictionRegionAddress;
    }

    /**
     * Corporate Registration Scheme. Jurisdiction Region_ Address. Address
     * <p>
     * A geographic area in which this registration scheme applies.
     * 
     */
    @JsonProperty("JurisdictionRegionAddress")
    public void setJurisdictionRegionAddress(List<Address> jurisdictionRegionAddress) {
        this.jurisdictionRegionAddress = jurisdictionRegionAddress;
    }

    public CorporateRegistrationScheme withJurisdictionRegionAddress(List<Address> jurisdictionRegionAddress) {
        this.jurisdictionRegionAddress = jurisdictionRegionAddress;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CorporateRegistrationScheme.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("corporateRegistrationTypeCode");
        sb.append('=');
        sb.append(((this.corporateRegistrationTypeCode == null)?"<null>":this.corporateRegistrationTypeCode));
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
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.corporateRegistrationTypeCode == null)? 0 :this.corporateRegistrationTypeCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.jurisdictionRegionAddress == null)? 0 :this.jurisdictionRegionAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CorporateRegistrationScheme) == false) {
            return false;
        }
        CorporateRegistrationScheme rhs = ((CorporateRegistrationScheme) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.corporateRegistrationTypeCode == rhs.corporateRegistrationTypeCode)||((this.corporateRegistrationTypeCode!= null)&&this.corporateRegistrationTypeCode.equals(rhs.corporateRegistrationTypeCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.jurisdictionRegionAddress == rhs.jurisdictionRegionAddress)||((this.jurisdictionRegionAddress!= null)&&this.jurisdictionRegionAddress.equals(rhs.jurisdictionRegionAddress))));
    }

}
