
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
 * Party. Details
 * <p>
 * A class to describe an organization, sub-organization, or individual fulfilling a role in a business process.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "MarkCareIndicator",
    "MarkAttentionIndicator",
    "WebsiteURI",
    "LogoReferenceID",
    "EndpointID",
    "IndustryClassificationCode",
    "PartyIdentification",
    "PartyName",
    "Language",
    "PostalAddress",
    "PhysicalLocation",
    "PartyTaxScheme",
    "PartyLegalEntity",
    "Contact",
    "Person",
    "AgentParty",
    "ServiceProviderParty",
    "PowerOfAttorney",
    "FinancialAccount"
})
@Generated("jsonschema2pojo")
public class Party {

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
     * Party. Mark Care_ Indicator. Indicator
     * <p>
     * An indicator that this party is "care of" (c/o) (true) or not (false).
     * 
     */
    @JsonProperty("MarkCareIndicator")
    @JsonPropertyDescription("An indicator that this party is \"care of\" (c/o) (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> markCareIndicator = new ArrayList<IndicatorType>();
    /**
     * Party. Mark Attention_ Indicator. Indicator
     * <p>
     * An indicator that this party is "for the attention of" (FAO) (true) or not (false).
     * 
     */
    @JsonProperty("MarkAttentionIndicator")
    @JsonPropertyDescription("An indicator that this party is \"for the attention of\" (FAO) (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> markAttentionIndicator = new ArrayList<IndicatorType>();
    /**
     * Party. Website_ URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) that identifies this party's web site; i.e., the web site's Uniform Resource Locator (URL).
     * 
     */
    @JsonProperty("WebsiteURI")
    @JsonPropertyDescription("The Uniform Resource Identifier (URI) that identifies this party's web site; i.e., the web site's Uniform Resource Locator (URL).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> websiteURI = new ArrayList<IdentifierType>();
    /**
     * Party. Logo Reference. Identifier
     * <p>
     * An identifier for this party's logo.
     * 
     */
    @JsonProperty("LogoReferenceID")
    @JsonPropertyDescription("An identifier for this party's logo.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> logoReferenceID = new ArrayList<IdentifierType>();
    /**
     * Party. Endpoint Identifier. Identifier
     * <p>
     * An identifier for the end point of the routing service (e.g., EAN Location Number, GLN).
     * 
     */
    @JsonProperty("EndpointID")
    @JsonPropertyDescription("An identifier for the end point of the routing service (e.g., EAN Location Number, GLN).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> endpointID = new ArrayList<IdentifierType>();
    /**
     * Party. Industry Classification Code. Code
     * <p>
     * This party's Industry Classification Code.
     * 
     */
    @JsonProperty("IndustryClassificationCode")
    @JsonPropertyDescription("This party's Industry Classification Code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> industryClassificationCode = new ArrayList<CodeType>();
    /**
     * Party. Party Identification
     * <p>
     * An identifier for this party.
     * 
     */
    @JsonProperty("PartyIdentification")
    @JsonPropertyDescription("An identifier for this party.")
    @Size(min = 1)
    @Valid
    private List<PartyIdentification> partyIdentification = new ArrayList<PartyIdentification>();
    /**
     * Party. Party Name
     * <p>
     * A name for this party.
     * 
     */
    @JsonProperty("PartyName")
    @JsonPropertyDescription("A name for this party.")
    @Size(min = 1)
    @Valid
    private List<PartyName> partyName = new ArrayList<PartyName>();
    /**
     * Party. Language
     * <p>
     * The language associated with this party.
     * 
     */
    @JsonProperty("Language")
    @JsonPropertyDescription("The language associated with this party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Language> language = new ArrayList<Language>();
    /**
     * Party. Postal_ Address. Address
     * <p>
     * The party's postal address.
     * 
     */
    @JsonProperty("PostalAddress")
    @JsonPropertyDescription("The party's postal address.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> postalAddress = new ArrayList<Address>();
    /**
     * Party. Physical_ Location. Location
     * <p>
     * The physical location of this party.
     * 
     */
    @JsonProperty("PhysicalLocation")
    @JsonPropertyDescription("The physical location of this party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> physicalLocation = new ArrayList<Location>();
    /**
     * Party. Party Tax Scheme
     * <p>
     * A tax scheme applying to this party.
     * 
     */
    @JsonProperty("PartyTaxScheme")
    @JsonPropertyDescription("A tax scheme applying to this party.")
    @Size(min = 1)
    @Valid
    private List<PartyTaxScheme> partyTaxScheme = new ArrayList<PartyTaxScheme>();
    /**
     * Party. Party Legal Entity
     * <p>
     * A description of this party as a legal entity.
     * 
     */
    @JsonProperty("PartyLegalEntity")
    @JsonPropertyDescription("A description of this party as a legal entity.")
    @Size(min = 1)
    @Valid
    private List<PartyLegalEntity> partyLegalEntity = new ArrayList<PartyLegalEntity>();
    /**
     * Party. Contact
     * <p>
     * The primary contact for this party.
     * 
     */
    @JsonProperty("Contact")
    @JsonPropertyDescription("The primary contact for this party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> contact = new ArrayList<Contact>();
    /**
     * Party. Person
     * <p>
     * A person associated with this party.
     * 
     */
    @JsonProperty("Person")
    @JsonPropertyDescription("A person associated with this party.")
    @Size(min = 1)
    @Valid
    private List<Person> person = new ArrayList<Person>();
    /**
     * Party. Agent_ Party. Party
     * <p>
     * A party who acts as an agent for this party.
     * 
     */
    @JsonProperty("AgentParty")
    @JsonPropertyDescription("A party who acts as an agent for this party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> agentParty = new ArrayList<Party>();
    /**
     * Party. Service Provider Party
     * <p>
     * A party providing a service to this party.
     * 
     */
    @JsonProperty("ServiceProviderParty")
    @JsonPropertyDescription("A party providing a service to this party.")
    @Size(min = 1)
    @Valid
    private List<ServiceProviderParty> serviceProviderParty = new ArrayList<ServiceProviderParty>();
    /**
     * Party. Power Of Attorney
     * <p>
     * A power of attorney associated with this party.
     * 
     */
    @JsonProperty("PowerOfAttorney")
    @JsonPropertyDescription("A power of attorney associated with this party.")
    @Size(min = 1)
    @Valid
    private List<PowerOfAttorney> powerOfAttorney = new ArrayList<PowerOfAttorney>();
    /**
     * Party. Financial Account
     * <p>
     * The financial account associated with this party.
     * 
     */
    @JsonProperty("FinancialAccount")
    @JsonPropertyDescription("The financial account associated with this party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<FinancialAccount> financialAccount = new ArrayList<FinancialAccount>();

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

    public Party withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Party. Mark Care_ Indicator. Indicator
     * <p>
     * An indicator that this party is "care of" (c/o) (true) or not (false).
     * 
     */
    @JsonProperty("MarkCareIndicator")
    public List<IndicatorType> getMarkCareIndicator() {
        return markCareIndicator;
    }

    /**
     * Party. Mark Care_ Indicator. Indicator
     * <p>
     * An indicator that this party is "care of" (c/o) (true) or not (false).
     * 
     */
    @JsonProperty("MarkCareIndicator")
    public void setMarkCareIndicator(List<IndicatorType> markCareIndicator) {
        this.markCareIndicator = markCareIndicator;
    }

    public Party withMarkCareIndicator(List<IndicatorType> markCareIndicator) {
        this.markCareIndicator = markCareIndicator;
        return this;
    }

    /**
     * Party. Mark Attention_ Indicator. Indicator
     * <p>
     * An indicator that this party is "for the attention of" (FAO) (true) or not (false).
     * 
     */
    @JsonProperty("MarkAttentionIndicator")
    public List<IndicatorType> getMarkAttentionIndicator() {
        return markAttentionIndicator;
    }

    /**
     * Party. Mark Attention_ Indicator. Indicator
     * <p>
     * An indicator that this party is "for the attention of" (FAO) (true) or not (false).
     * 
     */
    @JsonProperty("MarkAttentionIndicator")
    public void setMarkAttentionIndicator(List<IndicatorType> markAttentionIndicator) {
        this.markAttentionIndicator = markAttentionIndicator;
    }

    public Party withMarkAttentionIndicator(List<IndicatorType> markAttentionIndicator) {
        this.markAttentionIndicator = markAttentionIndicator;
        return this;
    }

    /**
     * Party. Website_ URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) that identifies this party's web site; i.e., the web site's Uniform Resource Locator (URL).
     * 
     */
    @JsonProperty("WebsiteURI")
    public List<IdentifierType> getWebsiteURI() {
        return websiteURI;
    }

    /**
     * Party. Website_ URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) that identifies this party's web site; i.e., the web site's Uniform Resource Locator (URL).
     * 
     */
    @JsonProperty("WebsiteURI")
    public void setWebsiteURI(List<IdentifierType> websiteURI) {
        this.websiteURI = websiteURI;
    }

    public Party withWebsiteURI(List<IdentifierType> websiteURI) {
        this.websiteURI = websiteURI;
        return this;
    }

    /**
     * Party. Logo Reference. Identifier
     * <p>
     * An identifier for this party's logo.
     * 
     */
    @JsonProperty("LogoReferenceID")
    public List<IdentifierType> getLogoReferenceID() {
        return logoReferenceID;
    }

    /**
     * Party. Logo Reference. Identifier
     * <p>
     * An identifier for this party's logo.
     * 
     */
    @JsonProperty("LogoReferenceID")
    public void setLogoReferenceID(List<IdentifierType> logoReferenceID) {
        this.logoReferenceID = logoReferenceID;
    }

    public Party withLogoReferenceID(List<IdentifierType> logoReferenceID) {
        this.logoReferenceID = logoReferenceID;
        return this;
    }

    /**
     * Party. Endpoint Identifier. Identifier
     * <p>
     * An identifier for the end point of the routing service (e.g., EAN Location Number, GLN).
     * 
     */
    @JsonProperty("EndpointID")
    public List<IdentifierType> getEndpointID() {
        return endpointID;
    }

    /**
     * Party. Endpoint Identifier. Identifier
     * <p>
     * An identifier for the end point of the routing service (e.g., EAN Location Number, GLN).
     * 
     */
    @JsonProperty("EndpointID")
    public void setEndpointID(List<IdentifierType> endpointID) {
        this.endpointID = endpointID;
    }

    public Party withEndpointID(List<IdentifierType> endpointID) {
        this.endpointID = endpointID;
        return this;
    }

    /**
     * Party. Industry Classification Code. Code
     * <p>
     * This party's Industry Classification Code.
     * 
     */
    @JsonProperty("IndustryClassificationCode")
    public List<CodeType> getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    /**
     * Party. Industry Classification Code. Code
     * <p>
     * This party's Industry Classification Code.
     * 
     */
    @JsonProperty("IndustryClassificationCode")
    public void setIndustryClassificationCode(List<CodeType> industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode;
    }

    public Party withIndustryClassificationCode(List<CodeType> industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode;
        return this;
    }

    /**
     * Party. Party Identification
     * <p>
     * An identifier for this party.
     * 
     */
    @JsonProperty("PartyIdentification")
    public List<PartyIdentification> getPartyIdentification() {
        return partyIdentification;
    }

    /**
     * Party. Party Identification
     * <p>
     * An identifier for this party.
     * 
     */
    @JsonProperty("PartyIdentification")
    public void setPartyIdentification(List<PartyIdentification> partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public Party withPartyIdentification(List<PartyIdentification> partyIdentification) {
        this.partyIdentification = partyIdentification;
        return this;
    }

    /**
     * Party. Party Name
     * <p>
     * A name for this party.
     * 
     */
    @JsonProperty("PartyName")
    public List<PartyName> getPartyName() {
        return partyName;
    }

    /**
     * Party. Party Name
     * <p>
     * A name for this party.
     * 
     */
    @JsonProperty("PartyName")
    public void setPartyName(List<PartyName> partyName) {
        this.partyName = partyName;
    }

    public Party withPartyName(List<PartyName> partyName) {
        this.partyName = partyName;
        return this;
    }

    /**
     * Party. Language
     * <p>
     * The language associated with this party.
     * 
     */
    @JsonProperty("Language")
    public List<Language> getLanguage() {
        return language;
    }

    /**
     * Party. Language
     * <p>
     * The language associated with this party.
     * 
     */
    @JsonProperty("Language")
    public void setLanguage(List<Language> language) {
        this.language = language;
    }

    public Party withLanguage(List<Language> language) {
        this.language = language;
        return this;
    }

    /**
     * Party. Postal_ Address. Address
     * <p>
     * The party's postal address.
     * 
     */
    @JsonProperty("PostalAddress")
    public List<Address> getPostalAddress() {
        return postalAddress;
    }

    /**
     * Party. Postal_ Address. Address
     * <p>
     * The party's postal address.
     * 
     */
    @JsonProperty("PostalAddress")
    public void setPostalAddress(List<Address> postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Party withPostalAddress(List<Address> postalAddress) {
        this.postalAddress = postalAddress;
        return this;
    }

    /**
     * Party. Physical_ Location. Location
     * <p>
     * The physical location of this party.
     * 
     */
    @JsonProperty("PhysicalLocation")
    public List<Location> getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Party. Physical_ Location. Location
     * <p>
     * The physical location of this party.
     * 
     */
    @JsonProperty("PhysicalLocation")
    public void setPhysicalLocation(List<Location> physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public Party withPhysicalLocation(List<Location> physicalLocation) {
        this.physicalLocation = physicalLocation;
        return this;
    }

    /**
     * Party. Party Tax Scheme
     * <p>
     * A tax scheme applying to this party.
     * 
     */
    @JsonProperty("PartyTaxScheme")
    public List<PartyTaxScheme> getPartyTaxScheme() {
        return partyTaxScheme;
    }

    /**
     * Party. Party Tax Scheme
     * <p>
     * A tax scheme applying to this party.
     * 
     */
    @JsonProperty("PartyTaxScheme")
    public void setPartyTaxScheme(List<PartyTaxScheme> partyTaxScheme) {
        this.partyTaxScheme = partyTaxScheme;
    }

    public Party withPartyTaxScheme(List<PartyTaxScheme> partyTaxScheme) {
        this.partyTaxScheme = partyTaxScheme;
        return this;
    }

    /**
     * Party. Party Legal Entity
     * <p>
     * A description of this party as a legal entity.
     * 
     */
    @JsonProperty("PartyLegalEntity")
    public List<PartyLegalEntity> getPartyLegalEntity() {
        return partyLegalEntity;
    }

    /**
     * Party. Party Legal Entity
     * <p>
     * A description of this party as a legal entity.
     * 
     */
    @JsonProperty("PartyLegalEntity")
    public void setPartyLegalEntity(List<PartyLegalEntity> partyLegalEntity) {
        this.partyLegalEntity = partyLegalEntity;
    }

    public Party withPartyLegalEntity(List<PartyLegalEntity> partyLegalEntity) {
        this.partyLegalEntity = partyLegalEntity;
        return this;
    }

    /**
     * Party. Contact
     * <p>
     * The primary contact for this party.
     * 
     */
    @JsonProperty("Contact")
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * Party. Contact
     * <p>
     * The primary contact for this party.
     * 
     */
    @JsonProperty("Contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Party withContact(List<Contact> contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Party. Person
     * <p>
     * A person associated with this party.
     * 
     */
    @JsonProperty("Person")
    public List<Person> getPerson() {
        return person;
    }

    /**
     * Party. Person
     * <p>
     * A person associated with this party.
     * 
     */
    @JsonProperty("Person")
    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public Party withPerson(List<Person> person) {
        this.person = person;
        return this;
    }

    /**
     * Party. Agent_ Party. Party
     * <p>
     * A party who acts as an agent for this party.
     * 
     */
    @JsonProperty("AgentParty")
    public List<Party> getAgentParty() {
        return agentParty;
    }

    /**
     * Party. Agent_ Party. Party
     * <p>
     * A party who acts as an agent for this party.
     * 
     */
    @JsonProperty("AgentParty")
    public void setAgentParty(List<Party> agentParty) {
        this.agentParty = agentParty;
    }

    public Party withAgentParty(List<Party> agentParty) {
        this.agentParty = agentParty;
        return this;
    }

    /**
     * Party. Service Provider Party
     * <p>
     * A party providing a service to this party.
     * 
     */
    @JsonProperty("ServiceProviderParty")
    public List<ServiceProviderParty> getServiceProviderParty() {
        return serviceProviderParty;
    }

    /**
     * Party. Service Provider Party
     * <p>
     * A party providing a service to this party.
     * 
     */
    @JsonProperty("ServiceProviderParty")
    public void setServiceProviderParty(List<ServiceProviderParty> serviceProviderParty) {
        this.serviceProviderParty = serviceProviderParty;
    }

    public Party withServiceProviderParty(List<ServiceProviderParty> serviceProviderParty) {
        this.serviceProviderParty = serviceProviderParty;
        return this;
    }

    /**
     * Party. Power Of Attorney
     * <p>
     * A power of attorney associated with this party.
     * 
     */
    @JsonProperty("PowerOfAttorney")
    public List<PowerOfAttorney> getPowerOfAttorney() {
        return powerOfAttorney;
    }

    /**
     * Party. Power Of Attorney
     * <p>
     * A power of attorney associated with this party.
     * 
     */
    @JsonProperty("PowerOfAttorney")
    public void setPowerOfAttorney(List<PowerOfAttorney> powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney;
    }

    public Party withPowerOfAttorney(List<PowerOfAttorney> powerOfAttorney) {
        this.powerOfAttorney = powerOfAttorney;
        return this;
    }

    /**
     * Party. Financial Account
     * <p>
     * The financial account associated with this party.
     * 
     */
    @JsonProperty("FinancialAccount")
    public List<FinancialAccount> getFinancialAccount() {
        return financialAccount;
    }

    /**
     * Party. Financial Account
     * <p>
     * The financial account associated with this party.
     * 
     */
    @JsonProperty("FinancialAccount")
    public void setFinancialAccount(List<FinancialAccount> financialAccount) {
        this.financialAccount = financialAccount;
    }

    public Party withFinancialAccount(List<FinancialAccount> financialAccount) {
        this.financialAccount = financialAccount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Party.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("markCareIndicator");
        sb.append('=');
        sb.append(((this.markCareIndicator == null)?"<null>":this.markCareIndicator));
        sb.append(',');
        sb.append("markAttentionIndicator");
        sb.append('=');
        sb.append(((this.markAttentionIndicator == null)?"<null>":this.markAttentionIndicator));
        sb.append(',');
        sb.append("websiteURI");
        sb.append('=');
        sb.append(((this.websiteURI == null)?"<null>":this.websiteURI));
        sb.append(',');
        sb.append("logoReferenceID");
        sb.append('=');
        sb.append(((this.logoReferenceID == null)?"<null>":this.logoReferenceID));
        sb.append(',');
        sb.append("endpointID");
        sb.append('=');
        sb.append(((this.endpointID == null)?"<null>":this.endpointID));
        sb.append(',');
        sb.append("industryClassificationCode");
        sb.append('=');
        sb.append(((this.industryClassificationCode == null)?"<null>":this.industryClassificationCode));
        sb.append(',');
        sb.append("partyIdentification");
        sb.append('=');
        sb.append(((this.partyIdentification == null)?"<null>":this.partyIdentification));
        sb.append(',');
        sb.append("partyName");
        sb.append('=');
        sb.append(((this.partyName == null)?"<null>":this.partyName));
        sb.append(',');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("postalAddress");
        sb.append('=');
        sb.append(((this.postalAddress == null)?"<null>":this.postalAddress));
        sb.append(',');
        sb.append("physicalLocation");
        sb.append('=');
        sb.append(((this.physicalLocation == null)?"<null>":this.physicalLocation));
        sb.append(',');
        sb.append("partyTaxScheme");
        sb.append('=');
        sb.append(((this.partyTaxScheme == null)?"<null>":this.partyTaxScheme));
        sb.append(',');
        sb.append("partyLegalEntity");
        sb.append('=');
        sb.append(((this.partyLegalEntity == null)?"<null>":this.partyLegalEntity));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("agentParty");
        sb.append('=');
        sb.append(((this.agentParty == null)?"<null>":this.agentParty));
        sb.append(',');
        sb.append("serviceProviderParty");
        sb.append('=');
        sb.append(((this.serviceProviderParty == null)?"<null>":this.serviceProviderParty));
        sb.append(',');
        sb.append("powerOfAttorney");
        sb.append('=');
        sb.append(((this.powerOfAttorney == null)?"<null>":this.powerOfAttorney));
        sb.append(',');
        sb.append("financialAccount");
        sb.append('=');
        sb.append(((this.financialAccount == null)?"<null>":this.financialAccount));
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
        result = ((result* 31)+((this.markAttentionIndicator == null)? 0 :this.markAttentionIndicator.hashCode()));
        result = ((result* 31)+((this.physicalLocation == null)? 0 :this.physicalLocation.hashCode()));
        result = ((result* 31)+((this.endpointID == null)? 0 :this.endpointID.hashCode()));
        result = ((result* 31)+((this.serviceProviderParty == null)? 0 :this.serviceProviderParty.hashCode()));
        result = ((result* 31)+((this.agentParty == null)? 0 :this.agentParty.hashCode()));
        result = ((result* 31)+((this.financialAccount == null)? 0 :this.financialAccount.hashCode()));
        result = ((result* 31)+((this.language == null)? 0 :this.language.hashCode()));
        result = ((result* 31)+((this.websiteURI == null)? 0 :this.websiteURI.hashCode()));
        result = ((result* 31)+((this.logoReferenceID == null)? 0 :this.logoReferenceID.hashCode()));
        result = ((result* 31)+((this.postalAddress == null)? 0 :this.postalAddress.hashCode()));
        result = ((result* 31)+((this.partyTaxScheme == null)? 0 :this.partyTaxScheme.hashCode()));
        result = ((result* 31)+((this.powerOfAttorney == null)? 0 :this.powerOfAttorney.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.partyName == null)? 0 :this.partyName.hashCode()));
        result = ((result* 31)+((this.partyIdentification == null)? 0 :this.partyIdentification.hashCode()));
        result = ((result* 31)+((this.industryClassificationCode == null)? 0 :this.industryClassificationCode.hashCode()));
        result = ((result* 31)+((this.partyLegalEntity == null)? 0 :this.partyLegalEntity.hashCode()));
        result = ((result* 31)+((this.markCareIndicator == null)? 0 :this.markCareIndicator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Party) == false) {
            return false;
        }
        Party rhs = ((Party) other);
        return (((((((((((((((((((((this.markAttentionIndicator == rhs.markAttentionIndicator)||((this.markAttentionIndicator!= null)&&this.markAttentionIndicator.equals(rhs.markAttentionIndicator)))&&((this.physicalLocation == rhs.physicalLocation)||((this.physicalLocation!= null)&&this.physicalLocation.equals(rhs.physicalLocation))))&&((this.endpointID == rhs.endpointID)||((this.endpointID!= null)&&this.endpointID.equals(rhs.endpointID))))&&((this.serviceProviderParty == rhs.serviceProviderParty)||((this.serviceProviderParty!= null)&&this.serviceProviderParty.equals(rhs.serviceProviderParty))))&&((this.agentParty == rhs.agentParty)||((this.agentParty!= null)&&this.agentParty.equals(rhs.agentParty))))&&((this.financialAccount == rhs.financialAccount)||((this.financialAccount!= null)&&this.financialAccount.equals(rhs.financialAccount))))&&((this.language == rhs.language)||((this.language!= null)&&this.language.equals(rhs.language))))&&((this.websiteURI == rhs.websiteURI)||((this.websiteURI!= null)&&this.websiteURI.equals(rhs.websiteURI))))&&((this.logoReferenceID == rhs.logoReferenceID)||((this.logoReferenceID!= null)&&this.logoReferenceID.equals(rhs.logoReferenceID))))&&((this.postalAddress == rhs.postalAddress)||((this.postalAddress!= null)&&this.postalAddress.equals(rhs.postalAddress))))&&((this.partyTaxScheme == rhs.partyTaxScheme)||((this.partyTaxScheme!= null)&&this.partyTaxScheme.equals(rhs.partyTaxScheme))))&&((this.powerOfAttorney == rhs.powerOfAttorney)||((this.powerOfAttorney!= null)&&this.powerOfAttorney.equals(rhs.powerOfAttorney))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.partyName == rhs.partyName)||((this.partyName!= null)&&this.partyName.equals(rhs.partyName))))&&((this.partyIdentification == rhs.partyIdentification)||((this.partyIdentification!= null)&&this.partyIdentification.equals(rhs.partyIdentification))))&&((this.industryClassificationCode == rhs.industryClassificationCode)||((this.industryClassificationCode!= null)&&this.industryClassificationCode.equals(rhs.industryClassificationCode))))&&((this.partyLegalEntity == rhs.partyLegalEntity)||((this.partyLegalEntity!= null)&&this.partyLegalEntity.equals(rhs.partyLegalEntity))))&&((this.markCareIndicator == rhs.markCareIndicator)||((this.markCareIndicator!= null)&&this.markCareIndicator.equals(rhs.markCareIndicator))));
    }

}
