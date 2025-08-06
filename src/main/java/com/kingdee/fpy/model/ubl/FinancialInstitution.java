
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
 * Financial Institution. Details
 * <p>
 * A class to describe a financial institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "Address"
})
@Generated("jsonschema2pojo")
public class FinancialInstitution {

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
     * Financial Institution. Identifier
     * <p>
     * An identifier for this financial institution. It is recommended that the ISO 9362 Bank Identification Code (BIC) be used as the ID.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this financial institution. It is recommended that the ISO 9362 Bank Identification Code (BIC) be used as the ID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Financial Institution. Name
     * <p>
     * The name of this financial institution.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this financial institution.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Financial Institution. Address
     * <p>
     * The address of this financial institution.
     * 
     */
    @JsonProperty("Address")
    @JsonPropertyDescription("The address of this financial institution.")
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

    public FinancialInstitution withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Financial Institution. Identifier
     * <p>
     * An identifier for this financial institution. It is recommended that the ISO 9362 Bank Identification Code (BIC) be used as the ID.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Financial Institution. Identifier
     * <p>
     * An identifier for this financial institution. It is recommended that the ISO 9362 Bank Identification Code (BIC) be used as the ID.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public FinancialInstitution withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Financial Institution. Name
     * <p>
     * The name of this financial institution.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Financial Institution. Name
     * <p>
     * The name of this financial institution.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public FinancialInstitution withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Financial Institution. Address
     * <p>
     * The address of this financial institution.
     * 
     */
    @JsonProperty("Address")
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Financial Institution. Address
     * <p>
     * The address of this financial institution.
     * 
     */
    @JsonProperty("Address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public FinancialInstitution withAddress(List<Address> address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinancialInstitution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinancialInstitution) == false) {
            return false;
        }
        FinancialInstitution rhs = ((FinancialInstitution) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))));
    }

}
