
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
 * Credit Account. Details
 * <p>
 * A class to identify a credit account for sales on account.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "AccountID"
})
@Generated("jsonschema2pojo")
public class CreditAccount {

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
     * Credit Account. Account Identifier. Identifier
     * <p>
     * An identifier for this credit account.
     * (Required)
     * 
     */
    @JsonProperty("AccountID")
    @JsonPropertyDescription("An identifier for this credit account.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> accountID = new ArrayList<IdentifierType>();

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

    public CreditAccount withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Credit Account. Account Identifier. Identifier
     * <p>
     * An identifier for this credit account.
     * (Required)
     * 
     */
    @JsonProperty("AccountID")
    public List<IdentifierType> getAccountID() {
        return accountID;
    }

    /**
     * Credit Account. Account Identifier. Identifier
     * <p>
     * An identifier for this credit account.
     * (Required)
     * 
     */
    @JsonProperty("AccountID")
    public void setAccountID(List<IdentifierType> accountID) {
        this.accountID = accountID;
    }

    public CreditAccount withAccountID(List<IdentifierType> accountID) {
        this.accountID = accountID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreditAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("accountID");
        sb.append('=');
        sb.append(((this.accountID == null)?"<null>":this.accountID));
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
        result = ((result* 31)+((this.accountID == null)? 0 :this.accountID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreditAccount) == false) {
            return false;
        }
        CreditAccount rhs = ((CreditAccount) other);
        return (((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.accountID == rhs.accountID)||((this.accountID!= null)&&this.accountID.equals(rhs.accountID))));
    }

}
