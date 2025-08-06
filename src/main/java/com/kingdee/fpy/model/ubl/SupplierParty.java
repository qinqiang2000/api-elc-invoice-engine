
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
 * Supplier Party. Details
 * <p>
 * A class to describe a supplier party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "CustomerAssignedAccountID",
    "AdditionalAccountID",
    "DataSendingCapability",
    "Party",
    "DespatchContact",
    "AccountingContact",
    "SellerContact"
})
@Generated("jsonschema2pojo")
public class SupplierParty {

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
     * Supplier Party. Customer Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for this supplier party, assigned by the customer.
     * 
     */
    @JsonProperty("CustomerAssignedAccountID")
    @JsonPropertyDescription("An identifier for this supplier party, assigned by the customer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> customerAssignedAccountID = new ArrayList<IdentifierType>();
    /**
     * Supplier Party. Additional_ Account Identifier. Identifier
     * <p>
     * An additional identifier for this supplier party.
     * 
     */
    @JsonProperty("AdditionalAccountID")
    @JsonPropertyDescription("An additional identifier for this supplier party.")
    @Size(min = 1)
    @Valid
    private List<IdentifierType> additionalAccountID = new ArrayList<IdentifierType>();
    /**
     * Supplier Party. Data Sending Capability. Text
     * <p>
     * Text describing the supplier's ability to send invoice data via a purchase card provider (e.g., VISA, MasterCard, American Express).
     * 
     */
    @JsonProperty("DataSendingCapability")
    @JsonPropertyDescription("Text describing the supplier's ability to send invoice data via a purchase card provider (e.g., VISA, MasterCard, American Express).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> dataSendingCapability = new ArrayList<TextType>();
    /**
     * Supplier Party. Party
     * <p>
     * The supplier party itself.
     * 
     */
    @JsonProperty("Party")
    @JsonPropertyDescription("The supplier party itself.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> party = new ArrayList<Party>();
    /**
     * Supplier Party. Despatch_ Contact. Contact
     * <p>
     * A contact at this supplier party for despatches (pickups).
     * 
     */
    @JsonProperty("DespatchContact")
    @JsonPropertyDescription("A contact at this supplier party for despatches (pickups).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> despatchContact = new ArrayList<Contact>();
    /**
     * Supplier Party. Accounting_ Contact. Contact
     * <p>
     * A contact at this supplier party for accounting.
     * 
     */
    @JsonProperty("AccountingContact")
    @JsonPropertyDescription("A contact at this supplier party for accounting.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> accountingContact = new ArrayList<Contact>();
    /**
     * Supplier Party. Seller_ Contact. Contact
     * <p>
     * The primary contact for this supplier party.
     * 
     */
    @JsonProperty("SellerContact")
    @JsonPropertyDescription("The primary contact for this supplier party.")
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

    public SupplierParty withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Supplier Party. Customer Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for this supplier party, assigned by the customer.
     * 
     */
    @JsonProperty("CustomerAssignedAccountID")
    public List<IdentifierType> getCustomerAssignedAccountID() {
        return customerAssignedAccountID;
    }

    /**
     * Supplier Party. Customer Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for this supplier party, assigned by the customer.
     * 
     */
    @JsonProperty("CustomerAssignedAccountID")
    public void setCustomerAssignedAccountID(List<IdentifierType> customerAssignedAccountID) {
        this.customerAssignedAccountID = customerAssignedAccountID;
    }

    public SupplierParty withCustomerAssignedAccountID(List<IdentifierType> customerAssignedAccountID) {
        this.customerAssignedAccountID = customerAssignedAccountID;
        return this;
    }

    /**
     * Supplier Party. Additional_ Account Identifier. Identifier
     * <p>
     * An additional identifier for this supplier party.
     * 
     */
    @JsonProperty("AdditionalAccountID")
    public List<IdentifierType> getAdditionalAccountID() {
        return additionalAccountID;
    }

    /**
     * Supplier Party. Additional_ Account Identifier. Identifier
     * <p>
     * An additional identifier for this supplier party.
     * 
     */
    @JsonProperty("AdditionalAccountID")
    public void setAdditionalAccountID(List<IdentifierType> additionalAccountID) {
        this.additionalAccountID = additionalAccountID;
    }

    public SupplierParty withAdditionalAccountID(List<IdentifierType> additionalAccountID) {
        this.additionalAccountID = additionalAccountID;
        return this;
    }

    /**
     * Supplier Party. Data Sending Capability. Text
     * <p>
     * Text describing the supplier's ability to send invoice data via a purchase card provider (e.g., VISA, MasterCard, American Express).
     * 
     */
    @JsonProperty("DataSendingCapability")
    public List<TextType> getDataSendingCapability() {
        return dataSendingCapability;
    }

    /**
     * Supplier Party. Data Sending Capability. Text
     * <p>
     * Text describing the supplier's ability to send invoice data via a purchase card provider (e.g., VISA, MasterCard, American Express).
     * 
     */
    @JsonProperty("DataSendingCapability")
    public void setDataSendingCapability(List<TextType> dataSendingCapability) {
        this.dataSendingCapability = dataSendingCapability;
    }

    public SupplierParty withDataSendingCapability(List<TextType> dataSendingCapability) {
        this.dataSendingCapability = dataSendingCapability;
        return this;
    }

    /**
     * Supplier Party. Party
     * <p>
     * The supplier party itself.
     * 
     */
    @JsonProperty("Party")
    public List<Party> getParty() {
        return party;
    }

    /**
     * Supplier Party. Party
     * <p>
     * The supplier party itself.
     * 
     */
    @JsonProperty("Party")
    public void setParty(List<Party> party) {
        this.party = party;
    }

    public SupplierParty withParty(List<Party> party) {
        this.party = party;
        return this;
    }

    /**
     * Supplier Party. Despatch_ Contact. Contact
     * <p>
     * A contact at this supplier party for despatches (pickups).
     * 
     */
    @JsonProperty("DespatchContact")
    public List<Contact> getDespatchContact() {
        return despatchContact;
    }

    /**
     * Supplier Party. Despatch_ Contact. Contact
     * <p>
     * A contact at this supplier party for despatches (pickups).
     * 
     */
    @JsonProperty("DespatchContact")
    public void setDespatchContact(List<Contact> despatchContact) {
        this.despatchContact = despatchContact;
    }

    public SupplierParty withDespatchContact(List<Contact> despatchContact) {
        this.despatchContact = despatchContact;
        return this;
    }

    /**
     * Supplier Party. Accounting_ Contact. Contact
     * <p>
     * A contact at this supplier party for accounting.
     * 
     */
    @JsonProperty("AccountingContact")
    public List<Contact> getAccountingContact() {
        return accountingContact;
    }

    /**
     * Supplier Party. Accounting_ Contact. Contact
     * <p>
     * A contact at this supplier party for accounting.
     * 
     */
    @JsonProperty("AccountingContact")
    public void setAccountingContact(List<Contact> accountingContact) {
        this.accountingContact = accountingContact;
    }

    public SupplierParty withAccountingContact(List<Contact> accountingContact) {
        this.accountingContact = accountingContact;
        return this;
    }

    /**
     * Supplier Party. Seller_ Contact. Contact
     * <p>
     * The primary contact for this supplier party.
     * 
     */
    @JsonProperty("SellerContact")
    public List<Contact> getSellerContact() {
        return sellerContact;
    }

    /**
     * Supplier Party. Seller_ Contact. Contact
     * <p>
     * The primary contact for this supplier party.
     * 
     */
    @JsonProperty("SellerContact")
    public void setSellerContact(List<Contact> sellerContact) {
        this.sellerContact = sellerContact;
    }

    public SupplierParty withSellerContact(List<Contact> sellerContact) {
        this.sellerContact = sellerContact;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupplierParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("customerAssignedAccountID");
        sb.append('=');
        sb.append(((this.customerAssignedAccountID == null)?"<null>":this.customerAssignedAccountID));
        sb.append(',');
        sb.append("additionalAccountID");
        sb.append('=');
        sb.append(((this.additionalAccountID == null)?"<null>":this.additionalAccountID));
        sb.append(',');
        sb.append("dataSendingCapability");
        sb.append('=');
        sb.append(((this.dataSendingCapability == null)?"<null>":this.dataSendingCapability));
        sb.append(',');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?"<null>":this.party));
        sb.append(',');
        sb.append("despatchContact");
        sb.append('=');
        sb.append(((this.despatchContact == null)?"<null>":this.despatchContact));
        sb.append(',');
        sb.append("accountingContact");
        sb.append('=');
        sb.append(((this.accountingContact == null)?"<null>":this.accountingContact));
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
        result = ((result* 31)+((this.despatchContact == null)? 0 :this.despatchContact.hashCode()));
        result = ((result* 31)+((this.dataSendingCapability == null)? 0 :this.dataSendingCapability.hashCode()));
        result = ((result* 31)+((this.additionalAccountID == null)? 0 :this.additionalAccountID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.accountingContact == null)? 0 :this.accountingContact.hashCode()));
        result = ((result* 31)+((this.customerAssignedAccountID == null)? 0 :this.customerAssignedAccountID.hashCode()));
        result = ((result* 31)+((this.party == null)? 0 :this.party.hashCode()));
        result = ((result* 31)+((this.sellerContact == null)? 0 :this.sellerContact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupplierParty) == false) {
            return false;
        }
        SupplierParty rhs = ((SupplierParty) other);
        return (((((((((this.despatchContact == rhs.despatchContact)||((this.despatchContact!= null)&&this.despatchContact.equals(rhs.despatchContact)))&&((this.dataSendingCapability == rhs.dataSendingCapability)||((this.dataSendingCapability!= null)&&this.dataSendingCapability.equals(rhs.dataSendingCapability))))&&((this.additionalAccountID == rhs.additionalAccountID)||((this.additionalAccountID!= null)&&this.additionalAccountID.equals(rhs.additionalAccountID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.accountingContact == rhs.accountingContact)||((this.accountingContact!= null)&&this.accountingContact.equals(rhs.accountingContact))))&&((this.customerAssignedAccountID == rhs.customerAssignedAccountID)||((this.customerAssignedAccountID!= null)&&this.customerAssignedAccountID.equals(rhs.customerAssignedAccountID))))&&((this.party == rhs.party)||((this.party!= null)&&this.party.equals(rhs.party))))&&((this.sellerContact == rhs.sellerContact)||((this.sellerContact!= null)&&this.sellerContact.equals(rhs.sellerContact))));
    }

}
