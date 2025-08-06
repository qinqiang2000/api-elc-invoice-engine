
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
 * Party Tax Scheme. Details
 * <p>
 * A class to describe a taxation scheme applying to a party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "RegistrationName",
    "CompanyID",
    "TaxLevelCode",
    "ExemptionReasonCode",
    "ExemptionReason",
    "RegistrationAddress",
    "TaxScheme"
})
@Generated("jsonschema2pojo")
public class PartyTaxScheme {

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
     * Party Tax Scheme. Registration_ Name. Name
     * <p>
     * The name of the party as registered with the relevant fiscal authority.
     * 
     */
    @JsonProperty("RegistrationName")
    @JsonPropertyDescription("The name of the party as registered with the relevant fiscal authority.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> registrationName = new ArrayList<TextType>();
    /**
     * Party Tax Scheme. Company Identifier. Identifier
     * <p>
     * An identifier for the party assigned for tax purposes by the taxation authority.
     * 
     */
    @JsonProperty("CompanyID")
    @JsonPropertyDescription("An identifier for the party assigned for tax purposes by the taxation authority.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> companyID = new ArrayList<IdentifierType>();
    /**
     * Party Tax Scheme. Tax Level Code. Code
     * <p>
     * A code signifying the tax level applicable to the party within this taxation scheme.
     * 
     */
    @JsonProperty("TaxLevelCode")
    @JsonPropertyDescription("A code signifying the tax level applicable to the party within this taxation scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> taxLevelCode = new ArrayList<CodeType>();
    /**
     * Party Tax Scheme. Exemption Reason Code. Code
     * <p>
     * A reason for the party's exemption from tax, expressed as a code.
     * 
     */
    @JsonProperty("ExemptionReasonCode")
    @JsonPropertyDescription("A reason for the party's exemption from tax, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> exemptionReasonCode = new ArrayList<CodeType>();
    /**
     * Party Tax Scheme. Exemption_ Reason. Text
     * <p>
     * A reason for the party's exemption from tax, expressed as text.
     * 
     */
    @JsonProperty("ExemptionReason")
    @JsonPropertyDescription("A reason for the party's exemption from tax, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> exemptionReason = new ArrayList<TextType>();
    /**
     * Party Tax Scheme. Registration_ Address. Address
     * <p>
     * The address of the party as registered for tax purposes.
     * 
     */
    @JsonProperty("RegistrationAddress")
    @JsonPropertyDescription("The address of the party as registered for tax purposes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> registrationAddress = new ArrayList<Address>();
    /**
     * Party Tax Scheme. Tax Scheme
     * <p>
     * The taxation scheme applicable to the party.
     * (Required)
     * 
     */
    @JsonProperty("TaxScheme")
    @JsonPropertyDescription("The taxation scheme applicable to the party.")
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

    public PartyTaxScheme withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Party Tax Scheme. Registration_ Name. Name
     * <p>
     * The name of the party as registered with the relevant fiscal authority.
     * 
     */
    @JsonProperty("RegistrationName")
    public List<TextType> getRegistrationName() {
        return registrationName;
    }

    /**
     * Party Tax Scheme. Registration_ Name. Name
     * <p>
     * The name of the party as registered with the relevant fiscal authority.
     * 
     */
    @JsonProperty("RegistrationName")
    public void setRegistrationName(List<TextType> registrationName) {
        this.registrationName = registrationName;
    }

    public PartyTaxScheme withRegistrationName(List<TextType> registrationName) {
        this.registrationName = registrationName;
        return this;
    }

    /**
     * Party Tax Scheme. Company Identifier. Identifier
     * <p>
     * An identifier for the party assigned for tax purposes by the taxation authority.
     * 
     */
    @JsonProperty("CompanyID")
    public List<IdentifierType> getCompanyID() {
        return companyID;
    }

    /**
     * Party Tax Scheme. Company Identifier. Identifier
     * <p>
     * An identifier for the party assigned for tax purposes by the taxation authority.
     * 
     */
    @JsonProperty("CompanyID")
    public void setCompanyID(List<IdentifierType> companyID) {
        this.companyID = companyID;
    }

    public PartyTaxScheme withCompanyID(List<IdentifierType> companyID) {
        this.companyID = companyID;
        return this;
    }

    /**
     * Party Tax Scheme. Tax Level Code. Code
     * <p>
     * A code signifying the tax level applicable to the party within this taxation scheme.
     * 
     */
    @JsonProperty("TaxLevelCode")
    public List<CodeType> getTaxLevelCode() {
        return taxLevelCode;
    }

    /**
     * Party Tax Scheme. Tax Level Code. Code
     * <p>
     * A code signifying the tax level applicable to the party within this taxation scheme.
     * 
     */
    @JsonProperty("TaxLevelCode")
    public void setTaxLevelCode(List<CodeType> taxLevelCode) {
        this.taxLevelCode = taxLevelCode;
    }

    public PartyTaxScheme withTaxLevelCode(List<CodeType> taxLevelCode) {
        this.taxLevelCode = taxLevelCode;
        return this;
    }

    /**
     * Party Tax Scheme. Exemption Reason Code. Code
     * <p>
     * A reason for the party's exemption from tax, expressed as a code.
     * 
     */
    @JsonProperty("ExemptionReasonCode")
    public List<CodeType> getExemptionReasonCode() {
        return exemptionReasonCode;
    }

    /**
     * Party Tax Scheme. Exemption Reason Code. Code
     * <p>
     * A reason for the party's exemption from tax, expressed as a code.
     * 
     */
    @JsonProperty("ExemptionReasonCode")
    public void setExemptionReasonCode(List<CodeType> exemptionReasonCode) {
        this.exemptionReasonCode = exemptionReasonCode;
    }

    public PartyTaxScheme withExemptionReasonCode(List<CodeType> exemptionReasonCode) {
        this.exemptionReasonCode = exemptionReasonCode;
        return this;
    }

    /**
     * Party Tax Scheme. Exemption_ Reason. Text
     * <p>
     * A reason for the party's exemption from tax, expressed as text.
     * 
     */
    @JsonProperty("ExemptionReason")
    public List<TextType> getExemptionReason() {
        return exemptionReason;
    }

    /**
     * Party Tax Scheme. Exemption_ Reason. Text
     * <p>
     * A reason for the party's exemption from tax, expressed as text.
     * 
     */
    @JsonProperty("ExemptionReason")
    public void setExemptionReason(List<TextType> exemptionReason) {
        this.exemptionReason = exemptionReason;
    }

    public PartyTaxScheme withExemptionReason(List<TextType> exemptionReason) {
        this.exemptionReason = exemptionReason;
        return this;
    }

    /**
     * Party Tax Scheme. Registration_ Address. Address
     * <p>
     * The address of the party as registered for tax purposes.
     * 
     */
    @JsonProperty("RegistrationAddress")
    public List<Address> getRegistrationAddress() {
        return registrationAddress;
    }

    /**
     * Party Tax Scheme. Registration_ Address. Address
     * <p>
     * The address of the party as registered for tax purposes.
     * 
     */
    @JsonProperty("RegistrationAddress")
    public void setRegistrationAddress(List<Address> registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public PartyTaxScheme withRegistrationAddress(List<Address> registrationAddress) {
        this.registrationAddress = registrationAddress;
        return this;
    }

    /**
     * Party Tax Scheme. Tax Scheme
     * <p>
     * The taxation scheme applicable to the party.
     * (Required)
     * 
     */
    @JsonProperty("TaxScheme")
    public List<TaxScheme> getTaxScheme() {
        return taxScheme;
    }

    /**
     * Party Tax Scheme. Tax Scheme
     * <p>
     * The taxation scheme applicable to the party.
     * (Required)
     * 
     */
    @JsonProperty("TaxScheme")
    public void setTaxScheme(List<TaxScheme> taxScheme) {
        this.taxScheme = taxScheme;
    }

    public PartyTaxScheme withTaxScheme(List<TaxScheme> taxScheme) {
        this.taxScheme = taxScheme;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartyTaxScheme.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("registrationName");
        sb.append('=');
        sb.append(((this.registrationName == null)?"<null>":this.registrationName));
        sb.append(',');
        sb.append("companyID");
        sb.append('=');
        sb.append(((this.companyID == null)?"<null>":this.companyID));
        sb.append(',');
        sb.append("taxLevelCode");
        sb.append('=');
        sb.append(((this.taxLevelCode == null)?"<null>":this.taxLevelCode));
        sb.append(',');
        sb.append("exemptionReasonCode");
        sb.append('=');
        sb.append(((this.exemptionReasonCode == null)?"<null>":this.exemptionReasonCode));
        sb.append(',');
        sb.append("exemptionReason");
        sb.append('=');
        sb.append(((this.exemptionReason == null)?"<null>":this.exemptionReason));
        sb.append(',');
        sb.append("registrationAddress");
        sb.append('=');
        sb.append(((this.registrationAddress == null)?"<null>":this.registrationAddress));
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
        result = ((result* 31)+((this.taxLevelCode == null)? 0 :this.taxLevelCode.hashCode()));
        result = ((result* 31)+((this.exemptionReason == null)? 0 :this.exemptionReason.hashCode()));
        result = ((result* 31)+((this.companyID == null)? 0 :this.companyID.hashCode()));
        result = ((result* 31)+((this.exemptionReasonCode == null)? 0 :this.exemptionReasonCode.hashCode()));
        result = ((result* 31)+((this.taxScheme == null)? 0 :this.taxScheme.hashCode()));
        result = ((result* 31)+((this.registrationName == null)? 0 :this.registrationName.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.registrationAddress == null)? 0 :this.registrationAddress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartyTaxScheme) == false) {
            return false;
        }
        PartyTaxScheme rhs = ((PartyTaxScheme) other);
        return (((((((((this.taxLevelCode == rhs.taxLevelCode)||((this.taxLevelCode!= null)&&this.taxLevelCode.equals(rhs.taxLevelCode)))&&((this.exemptionReason == rhs.exemptionReason)||((this.exemptionReason!= null)&&this.exemptionReason.equals(rhs.exemptionReason))))&&((this.companyID == rhs.companyID)||((this.companyID!= null)&&this.companyID.equals(rhs.companyID))))&&((this.exemptionReasonCode == rhs.exemptionReasonCode)||((this.exemptionReasonCode!= null)&&this.exemptionReasonCode.equals(rhs.exemptionReasonCode))))&&((this.taxScheme == rhs.taxScheme)||((this.taxScheme!= null)&&this.taxScheme.equals(rhs.taxScheme))))&&((this.registrationName == rhs.registrationName)||((this.registrationName!= null)&&this.registrationName.equals(rhs.registrationName))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.registrationAddress == rhs.registrationAddress)||((this.registrationAddress!= null)&&this.registrationAddress.equals(rhs.registrationAddress))));
    }

}
