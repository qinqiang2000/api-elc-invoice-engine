
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
 * Branch. Details
 * <p>
 * A class to describe a branch or a division of an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "FinancialInstitution",
    "Address"
})
@Generated("jsonschema2pojo")
public class Branch {

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
     * Branch. Identifier
     * <p>
     * An identifier for this branch or division of an organization.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this branch or division of an organization.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Branch. Name
     * <p>
     * The name of this branch or division of an organization.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this branch or division of an organization.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Branch. Financial Institution
     * <p>
     * The financial institution that this branch belongs to (if applicable).
     * 
     */
    @JsonProperty("FinancialInstitution")
    @JsonPropertyDescription("The financial institution that this branch belongs to (if applicable).")
    @Size(min = 1, max = 1)
    @Valid
    private List<FinancialInstitution> financialInstitution = new ArrayList<FinancialInstitution>();
    /**
     * Branch. Address
     * <p>
     * The address of this branch or division.
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("The address of this branch or division.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> address = new ArrayList<Address>();

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

    public Branch withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Branch. Identifier
     * <p>
     * An identifier for this branch or division of an organization.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Branch. Identifier
     * <p>
     * An identifier for this branch or division of an organization.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Branch withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Branch. Name
     * <p>
     * The name of this branch or division of an organization.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Branch. Name
     * <p>
     * The name of this branch or division of an organization.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public Branch withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Branch. Financial Institution
     * <p>
     * The financial institution that this branch belongs to (if applicable).
     * 
     */
    @JsonProperty("FinancialInstitution")
    public List<FinancialInstitution> getFinancialInstitution() {
        return financialInstitution;
    }

    /**
     * Branch. Financial Institution
     * <p>
     * The financial institution that this branch belongs to (if applicable).
     * 
     */
    @JsonProperty("FinancialInstitution")
    public void setFinancialInstitution(List<FinancialInstitution> financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public Branch withFinancialInstitution(List<FinancialInstitution> financialInstitution) {
        this.financialInstitution = financialInstitution;
        return this;
    }

    /**
     * Branch. Address
     * <p>
     * The address of this branch or division.
     * 
     */
    @JsonProperty("Address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Branch. Address
     * <p>
     * The address of this branch or division.
     * 
     */
    @JsonProperty("Address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Branch withAddress(List<Address> address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Branch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("financialInstitution");
        sb.append('=');
        sb.append(((this.financialInstitution == null)?"<null>":this.financialInstitution));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.financialInstitution == null)? 0 :this.financialInstitution.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Branch) == false) {
            return false;
        }
        Branch rhs = ((Branch) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.financialInstitution == rhs.financialInstitution)||((this.financialInstitution!= null)&&this.financialInstitution.equals(rhs.financialInstitution))));
    }

}
