
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
 * Customer Party. Details
 * <p>
 * A class to describe a customer party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "CustomerAssignedAccountID",
    "SupplierAssignedAccountID",
    "AdditionalAccountID",
    "Party",
    "DeliveryContact",
    "AccountingContact",
    "BuyerContact"
})
@Generated("jsonschema2pojo")
public class CustomerParty {

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
     * Customer Party. Customer Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by the customer itself.
     * 
     */
    @JsonProperty("CustomerAssignedAccountID")
    @JsonPropertyDescription("An identifier for the customer's account, assigned by the customer itself.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> customerAssignedAccountID = new ArrayList<IdentifierType>();
    /**
     * Customer Party. Supplier Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by the supplier.
     * 
     */
    @JsonProperty("SupplierAssignedAccountID")
    @JsonPropertyDescription("An identifier for the customer's account, assigned by the supplier.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> supplierAssignedAccountID = new ArrayList<IdentifierType>();
    /**
     * Customer Party. Additional_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by a third party.
     * 
     */
    @JsonProperty("AdditionalAccountID")
    @JsonPropertyDescription("An identifier for the customer's account, assigned by a third party.")
    @Size(min = 1)
    @Valid
    private List<IdentifierType> additionalAccountID = new ArrayList<IdentifierType>();
    /**
     * Customer Party. Party
     * <p>
     * The customer party itself.
     * 
     */
    @JsonProperty("Party")
    @JsonPropertyDescription("The customer party itself.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> party = new ArrayList<Party>();
    /**
     * Customer Party. Delivery_ Contact. Contact
     * <p>
     * A customer contact for deliveries.
     * 
     */
    @JsonProperty("DeliveryContact")
    @JsonPropertyDescription("A customer contact for deliveries.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> deliveryContact = new ArrayList<Contact>();
    /**
     * Customer Party. Accounting_ Contact. Contact
     * <p>
     * A customer contact for accounting.
     * 
     */
    @JsonProperty("AccountingContact")
    @JsonPropertyDescription("A customer contact for accounting.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> accountingContact = new ArrayList<Contact>();
    /**
     * Customer Party. Buyer_ Contact. Contact
     * <p>
     * A customer contact for purchasing.
     * 
     */
    @JsonProperty("BuyerContact")
    @JsonPropertyDescription("A customer contact for purchasing.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> buyerContact = new ArrayList<Contact>();

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

    public CustomerParty withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Customer Party. Customer Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by the customer itself.
     * 
     */
    @JsonProperty("CustomerAssignedAccountID")
    public List<IdentifierType> getCustomerAssignedAccountID() {
        return customerAssignedAccountID;
    }

    /**
     * Customer Party. Customer Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by the customer itself.
     * 
     */
    @JsonProperty("CustomerAssignedAccountID")
    public void setCustomerAssignedAccountID(List<IdentifierType> customerAssignedAccountID) {
        this.customerAssignedAccountID = customerAssignedAccountID;
    }

    public CustomerParty withCustomerAssignedAccountID(List<IdentifierType> customerAssignedAccountID) {
        this.customerAssignedAccountID = customerAssignedAccountID;
        return this;
    }

    /**
     * Customer Party. Supplier Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by the supplier.
     * 
     */
    @JsonProperty("SupplierAssignedAccountID")
    public List<IdentifierType> getSupplierAssignedAccountID() {
        return supplierAssignedAccountID;
    }

    /**
     * Customer Party. Supplier Assigned_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by the supplier.
     * 
     */
    @JsonProperty("SupplierAssignedAccountID")
    public void setSupplierAssignedAccountID(List<IdentifierType> supplierAssignedAccountID) {
        this.supplierAssignedAccountID = supplierAssignedAccountID;
    }

    public CustomerParty withSupplierAssignedAccountID(List<IdentifierType> supplierAssignedAccountID) {
        this.supplierAssignedAccountID = supplierAssignedAccountID;
        return this;
    }

    /**
     * Customer Party. Additional_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by a third party.
     * 
     */
    @JsonProperty("AdditionalAccountID")
    public List<IdentifierType> getAdditionalAccountID() {
        return additionalAccountID;
    }

    /**
     * Customer Party. Additional_ Account Identifier. Identifier
     * <p>
     * An identifier for the customer's account, assigned by a third party.
     * 
     */
    @JsonProperty("AdditionalAccountID")
    public void setAdditionalAccountID(List<IdentifierType> additionalAccountID) {
        this.additionalAccountID = additionalAccountID;
    }

    public CustomerParty withAdditionalAccountID(List<IdentifierType> additionalAccountID) {
        this.additionalAccountID = additionalAccountID;
        return this;
    }

    /**
     * Customer Party. Party
     * <p>
     * The customer party itself.
     * 
     */
    @JsonProperty("Party")
    public List<Party> getParty() {
        return party;
    }

    /**
     * Customer Party. Party
     * <p>
     * The customer party itself.
     * 
     */
    @JsonProperty("Party")
    public void setParty(List<Party> party) {
        this.party = party;
    }

    public CustomerParty withParty(List<Party> party) {
        this.party = party;
        return this;
    }

    /**
     * Customer Party. Delivery_ Contact. Contact
     * <p>
     * A customer contact for deliveries.
     * 
     */
    @JsonProperty("DeliveryContact")
    public List<Contact> getDeliveryContact() {
        return deliveryContact;
    }

    /**
     * Customer Party. Delivery_ Contact. Contact
     * <p>
     * A customer contact for deliveries.
     * 
     */
    @JsonProperty("DeliveryContact")
    public void setDeliveryContact(List<Contact> deliveryContact) {
        this.deliveryContact = deliveryContact;
    }

    public CustomerParty withDeliveryContact(List<Contact> deliveryContact) {
        this.deliveryContact = deliveryContact;
        return this;
    }

    /**
     * Customer Party. Accounting_ Contact. Contact
     * <p>
     * A customer contact for accounting.
     * 
     */
    @JsonProperty("AccountingContact")
    public List<Contact> getAccountingContact() {
        return accountingContact;
    }

    /**
     * Customer Party. Accounting_ Contact. Contact
     * <p>
     * A customer contact for accounting.
     * 
     */
    @JsonProperty("AccountingContact")
    public void setAccountingContact(List<Contact> accountingContact) {
        this.accountingContact = accountingContact;
    }

    public CustomerParty withAccountingContact(List<Contact> accountingContact) {
        this.accountingContact = accountingContact;
        return this;
    }

    /**
     * Customer Party. Buyer_ Contact. Contact
     * <p>
     * A customer contact for purchasing.
     * 
     */
    @JsonProperty("BuyerContact")
    public List<Contact> getBuyerContact() {
        return buyerContact;
    }

    /**
     * Customer Party. Buyer_ Contact. Contact
     * <p>
     * A customer contact for purchasing.
     * 
     */
    @JsonProperty("BuyerContact")
    public void setBuyerContact(List<Contact> buyerContact) {
        this.buyerContact = buyerContact;
    }

    public CustomerParty withBuyerContact(List<Contact> buyerContact) {
        this.buyerContact = buyerContact;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomerParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("customerAssignedAccountID");
        sb.append('=');
        sb.append(((this.customerAssignedAccountID == null)?"<null>":this.customerAssignedAccountID));
        sb.append(',');
        sb.append("supplierAssignedAccountID");
        sb.append('=');
        sb.append(((this.supplierAssignedAccountID == null)?"<null>":this.supplierAssignedAccountID));
        sb.append(',');
        sb.append("additionalAccountID");
        sb.append('=');
        sb.append(((this.additionalAccountID == null)?"<null>":this.additionalAccountID));
        sb.append(',');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?"<null>":this.party));
        sb.append(',');
        sb.append("deliveryContact");
        sb.append('=');
        sb.append(((this.deliveryContact == null)?"<null>":this.deliveryContact));
        sb.append(',');
        sb.append("accountingContact");
        sb.append('=');
        sb.append(((this.accountingContact == null)?"<null>":this.accountingContact));
        sb.append(',');
        sb.append("buyerContact");
        sb.append('=');
        sb.append(((this.buyerContact == null)?"<null>":this.buyerContact));
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
        result = ((result* 31)+((this.additionalAccountID == null)? 0 :this.additionalAccountID.hashCode()));
        result = ((result* 31)+((this.supplierAssignedAccountID == null)? 0 :this.supplierAssignedAccountID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.deliveryContact == null)? 0 :this.deliveryContact.hashCode()));
        result = ((result* 31)+((this.accountingContact == null)? 0 :this.accountingContact.hashCode()));
        result = ((result* 31)+((this.customerAssignedAccountID == null)? 0 :this.customerAssignedAccountID.hashCode()));
        result = ((result* 31)+((this.party == null)? 0 :this.party.hashCode()));
        result = ((result* 31)+((this.buyerContact == null)? 0 :this.buyerContact.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerParty) == false) {
            return false;
        }
        CustomerParty rhs = ((CustomerParty) other);
        return (((((((((this.additionalAccountID == rhs.additionalAccountID)||((this.additionalAccountID!= null)&&this.additionalAccountID.equals(rhs.additionalAccountID)))&&((this.supplierAssignedAccountID == rhs.supplierAssignedAccountID)||((this.supplierAssignedAccountID!= null)&&this.supplierAssignedAccountID.equals(rhs.supplierAssignedAccountID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.deliveryContact == rhs.deliveryContact)||((this.deliveryContact!= null)&&this.deliveryContact.equals(rhs.deliveryContact))))&&((this.accountingContact == rhs.accountingContact)||((this.accountingContact!= null)&&this.accountingContact.equals(rhs.accountingContact))))&&((this.customerAssignedAccountID == rhs.customerAssignedAccountID)||((this.customerAssignedAccountID!= null)&&this.customerAssignedAccountID.equals(rhs.customerAssignedAccountID))))&&((this.party == rhs.party)||((this.party!= null)&&this.party.equals(rhs.party))))&&((this.buyerContact == rhs.buyerContact)||((this.buyerContact!= null)&&this.buyerContact.equals(rhs.buyerContact))));
    }

}
