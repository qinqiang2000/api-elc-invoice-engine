
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
 * Service Provider Party. Details
 * <p>
 * A class to describe a party contracting to provide services, such as transportation, finance, etc.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ServiceTypeCode",
    "ServiceType",
    "Party",
    "SellerContact"
})
@Generated("jsonschema2pojo")
public class ServiceProviderParty {

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
     * Service Provider Party. Identifier
     * <p>
     * An identifier for this service provider.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this service provider.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Service Provider Party. Service Type Code. Code
     * <p>
     * The type of service provided, expressed as a code.
     * 
     */
    @JsonProperty("ServiceTypeCode")
    @JsonPropertyDescription("The type of service provided, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> serviceTypeCode = new ArrayList<CodeType>();
    /**
     * Service Provider Party. Service Type. Text
     * <p>
     * The type of service provided, expressed as text.
     * 
     */
    @JsonProperty("ServiceType")
    @JsonPropertyDescription("The type of service provided, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> serviceType = new ArrayList<TextType>();
    /**
     * Service Provider Party. Party
     * <p>
     * The party providing the service.
     * (Required)
     * 
     */
    @JsonProperty("Party")
    @JsonPropertyDescription("The party providing the service.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Party> party = new ArrayList<Party>();
    /**
     * Service Provider Party. Seller_ Contact. Contact
     * <p>
     * The contact for the service provider.
     * 
     */
    @JsonProperty("SellerContact")
    @JsonPropertyDescription("The contact for the service provider.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> sellerContact = new ArrayList<Contact>();

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

    public ServiceProviderParty withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Service Provider Party. Identifier
     * <p>
     * An identifier for this service provider.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Service Provider Party. Identifier
     * <p>
     * An identifier for this service provider.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ServiceProviderParty withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Service Provider Party. Service Type Code. Code
     * <p>
     * The type of service provided, expressed as a code.
     * 
     */
    @JsonProperty("ServiceTypeCode")
    public List<CodeType> getServiceTypeCode() {
        return serviceTypeCode;
    }

    /**
     * Service Provider Party. Service Type Code. Code
     * <p>
     * The type of service provided, expressed as a code.
     * 
     */
    @JsonProperty("ServiceTypeCode")
    public void setServiceTypeCode(List<CodeType> serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public ServiceProviderParty withServiceTypeCode(List<CodeType> serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * Service Provider Party. Service Type. Text
     * <p>
     * The type of service provided, expressed as text.
     * 
     */
    @JsonProperty("ServiceType")
    public List<TextType> getServiceType() {
        return serviceType;
    }

    /**
     * Service Provider Party. Service Type. Text
     * <p>
     * The type of service provided, expressed as text.
     * 
     */
    @JsonProperty("ServiceType")
    public void setServiceType(List<TextType> serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceProviderParty withServiceType(List<TextType> serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Service Provider Party. Party
     * <p>
     * The party providing the service.
     * (Required)
     * 
     */
    @JsonProperty("Party")
    public List<Party> getParty() {
        return party;
    }

    /**
     * Service Provider Party. Party
     * <p>
     * The party providing the service.
     * (Required)
     * 
     */
    @JsonProperty("Party")
    public void setParty(List<Party> party) {
        this.party = party;
    }

    public ServiceProviderParty withParty(List<Party> party) {
        this.party = party;
        return this;
    }

    /**
     * Service Provider Party. Seller_ Contact. Contact
     * <p>
     * The contact for the service provider.
     * 
     */
    @JsonProperty("SellerContact")
    public List<Contact> getSellerContact() {
        return sellerContact;
    }

    /**
     * Service Provider Party. Seller_ Contact. Contact
     * <p>
     * The contact for the service provider.
     * 
     */
    @JsonProperty("SellerContact")
    public void setSellerContact(List<Contact> sellerContact) {
        this.sellerContact = sellerContact;
    }

    public ServiceProviderParty withSellerContact(List<Contact> sellerContact) {
        this.sellerContact = sellerContact;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceProviderParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("serviceTypeCode");
        sb.append('=');
        sb.append(((this.serviceTypeCode == null)?"<null>":this.serviceTypeCode));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?"<null>":this.party));
        sb.append(',');
        sb.append("sellerContact");
        sb.append('=');
        sb.append(((this.sellerContact == null)?"<null>":this.sellerContact));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.party == null)? 0 :this.party.hashCode()));
        result = ((result* 31)+((this.serviceTypeCode == null)? 0 :this.serviceTypeCode.hashCode()));
        result = ((result* 31)+((this.sellerContact == null)? 0 :this.sellerContact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceProviderParty) == false) {
            return false;
        }
        ServiceProviderParty rhs = ((ServiceProviderParty) other);
        return (((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.party == rhs.party)||((this.party!= null)&&this.party.equals(rhs.party))))&&((this.serviceTypeCode == rhs.serviceTypeCode)||((this.serviceTypeCode!= null)&&this.serviceTypeCode.equals(rhs.serviceTypeCode))))&&((this.sellerContact == rhs.sellerContact)||((this.sellerContact!= null)&&this.sellerContact.equals(rhs.sellerContact))));
    }

}
