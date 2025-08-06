
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
 * Customs Declaration. Details
 * <p>
 * A class describing identifiers or references relating to customs procedures.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "IssuerParty"
})
@Generated("jsonschema2pojo")
public class CustomsDeclaration {

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
     * Customs Declaration. Identifier
     * <p>
     * An identifier associated with customs related procedures.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier associated with customs related procedures.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Customs Declaration. Issuer_ Party. Party
     * <p>
     * Describes the party issuing the customs declaration.
     * 
     */
    @JsonProperty("IssuerParty")
    @JsonPropertyDescription("Describes the party issuing the customs declaration.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> issuerParty = new ArrayList<Party>();

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

    public CustomsDeclaration withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Customs Declaration. Identifier
     * <p>
     * An identifier associated with customs related procedures.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Customs Declaration. Identifier
     * <p>
     * An identifier associated with customs related procedures.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public CustomsDeclaration withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Customs Declaration. Issuer_ Party. Party
     * <p>
     * Describes the party issuing the customs declaration.
     * 
     */
    @JsonProperty("IssuerParty")
    public List<Party> getIssuerParty() {
        return issuerParty;
    }

    /**
     * Customs Declaration. Issuer_ Party. Party
     * <p>
     * Describes the party issuing the customs declaration.
     * 
     */
    @JsonProperty("IssuerParty")
    public void setIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
    }

    public CustomsDeclaration withIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomsDeclaration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("issuerParty");
        sb.append('=');
        sb.append(((this.issuerParty == null)?"<null>":this.issuerParty));
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
        result = ((result* 31)+((this.issuerParty == null)? 0 :this.issuerParty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomsDeclaration) == false) {
            return false;
        }
        CustomsDeclaration rhs = ((CustomsDeclaration) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.issuerParty == rhs.issuerParty)||((this.issuerParty!= null)&&this.issuerParty.equals(rhs.issuerParty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
