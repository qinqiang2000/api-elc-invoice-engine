
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
 * Transport Equipment Seal. Details
 * <p>
 * A class to describe a device (a transport equipment seal) for securing the doors of a shipping container.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "SealIssuerTypeCode",
    "Condition",
    "SealStatusCode",
    "SealingPartyType"
})
@Generated("jsonschema2pojo")
public class TransportEquipmentSeal {

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
     * Transport Equipment Seal. Identifier
     * <p>
     * An identifier for this transport equipment seal.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this transport equipment seal.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Transport Equipment Seal. Seal Issuer Type Code. Code
     * <p>
     * A code signifying the type of party that issues and is responsible for this transport equipment seal.
     * 
     */
    @JsonProperty("SealIssuerTypeCode")
    @JsonPropertyDescription("A code signifying the type of party that issues and is responsible for this transport equipment seal.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> sealIssuerTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment Seal. Condition. Text
     * <p>
     * The condition of this transport equipment seal.
     * 
     */
    @JsonProperty("Condition")
    @JsonPropertyDescription("The condition of this transport equipment seal.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> condition = new ArrayList<TextType>();
    /**
     * Transport Equipment Seal. Seal Status Code. Code
     * <p>
     * A code signifying the condition of this transport equipment seal.
     * 
     */
    @JsonProperty("SealStatusCode")
    @JsonPropertyDescription("A code signifying the condition of this transport equipment seal.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> sealStatusCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment Seal. Sealing Party Type. Text
     * <p>
     * The role of the sealing party.
     * 
     */
    @JsonProperty("SealingPartyType")
    @JsonPropertyDescription("The role of the sealing party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> sealingPartyType = new ArrayList<TextType>();

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

    public TransportEquipmentSeal withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transport Equipment Seal. Identifier
     * <p>
     * An identifier for this transport equipment seal.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Transport Equipment Seal. Identifier
     * <p>
     * An identifier for this transport equipment seal.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TransportEquipmentSeal withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Transport Equipment Seal. Seal Issuer Type Code. Code
     * <p>
     * A code signifying the type of party that issues and is responsible for this transport equipment seal.
     * 
     */
    @JsonProperty("SealIssuerTypeCode")
    public List<CodeType> getSealIssuerTypeCode() {
        return sealIssuerTypeCode;
    }

    /**
     * Transport Equipment Seal. Seal Issuer Type Code. Code
     * <p>
     * A code signifying the type of party that issues and is responsible for this transport equipment seal.
     * 
     */
    @JsonProperty("SealIssuerTypeCode")
    public void setSealIssuerTypeCode(List<CodeType> sealIssuerTypeCode) {
        this.sealIssuerTypeCode = sealIssuerTypeCode;
    }

    public TransportEquipmentSeal withSealIssuerTypeCode(List<CodeType> sealIssuerTypeCode) {
        this.sealIssuerTypeCode = sealIssuerTypeCode;
        return this;
    }

    /**
     * Transport Equipment Seal. Condition. Text
     * <p>
     * The condition of this transport equipment seal.
     * 
     */
    @JsonProperty("Condition")
    public List<TextType> getCondition() {
        return condition;
    }

    /**
     * Transport Equipment Seal. Condition. Text
     * <p>
     * The condition of this transport equipment seal.
     * 
     */
    @JsonProperty("Condition")
    public void setCondition(List<TextType> condition) {
        this.condition = condition;
    }

    public TransportEquipmentSeal withCondition(List<TextType> condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Transport Equipment Seal. Seal Status Code. Code
     * <p>
     * A code signifying the condition of this transport equipment seal.
     * 
     */
    @JsonProperty("SealStatusCode")
    public List<CodeType> getSealStatusCode() {
        return sealStatusCode;
    }

    /**
     * Transport Equipment Seal. Seal Status Code. Code
     * <p>
     * A code signifying the condition of this transport equipment seal.
     * 
     */
    @JsonProperty("SealStatusCode")
    public void setSealStatusCode(List<CodeType> sealStatusCode) {
        this.sealStatusCode = sealStatusCode;
    }

    public TransportEquipmentSeal withSealStatusCode(List<CodeType> sealStatusCode) {
        this.sealStatusCode = sealStatusCode;
        return this;
    }

    /**
     * Transport Equipment Seal. Sealing Party Type. Text
     * <p>
     * The role of the sealing party.
     * 
     */
    @JsonProperty("SealingPartyType")
    public List<TextType> getSealingPartyType() {
        return sealingPartyType;
    }

    /**
     * Transport Equipment Seal. Sealing Party Type. Text
     * <p>
     * The role of the sealing party.
     * 
     */
    @JsonProperty("SealingPartyType")
    public void setSealingPartyType(List<TextType> sealingPartyType) {
        this.sealingPartyType = sealingPartyType;
    }

    public TransportEquipmentSeal withSealingPartyType(List<TextType> sealingPartyType) {
        this.sealingPartyType = sealingPartyType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportEquipmentSeal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sealIssuerTypeCode");
        sb.append('=');
        sb.append(((this.sealIssuerTypeCode == null)?"<null>":this.sealIssuerTypeCode));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("sealStatusCode");
        sb.append('=');
        sb.append(((this.sealStatusCode == null)?"<null>":this.sealStatusCode));
        sb.append(',');
        sb.append("sealingPartyType");
        sb.append('=');
        sb.append(((this.sealingPartyType == null)?"<null>":this.sealingPartyType));
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
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.sealIssuerTypeCode == null)? 0 :this.sealIssuerTypeCode.hashCode()));
        result = ((result* 31)+((this.sealStatusCode == null)? 0 :this.sealStatusCode.hashCode()));
        result = ((result* 31)+((this.sealingPartyType == null)? 0 :this.sealingPartyType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportEquipmentSeal) == false) {
            return false;
        }
        TransportEquipmentSeal rhs = ((TransportEquipmentSeal) other);
        return (((((((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition)))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.sealIssuerTypeCode == rhs.sealIssuerTypeCode)||((this.sealIssuerTypeCode!= null)&&this.sealIssuerTypeCode.equals(rhs.sealIssuerTypeCode))))&&((this.sealStatusCode == rhs.sealStatusCode)||((this.sealStatusCode!= null)&&this.sealStatusCode.equals(rhs.sealStatusCode))))&&((this.sealingPartyType == rhs.sealingPartyType)||((this.sealingPartyType!= null)&&this.sealingPartyType.equals(rhs.sealingPartyType))));
    }

}
