
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
 * Physical Attribute. Details
 * <p>
 * A class to describe a physical attribute.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "AttributeID",
    "PositionCode",
    "DescriptionCode",
    "Description"
})
@Generated("jsonschema2pojo")
public class PhysicalAttribute {

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
     * Physical Attribute. Attribute Identifier. Identifier
     * <p>
     * An identifier for this physical attribute.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    @JsonPropertyDescription("An identifier for this physical attribute.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> attributeID = new ArrayList<IdentifierType>();
    /**
     * Physical Attribute. Position Code. Code
     * <p>
     * A code signifying the position of this physical attribute.
     * 
     */
    @JsonProperty("PositionCode")
    @JsonPropertyDescription("A code signifying the position of this physical attribute.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> positionCode = new ArrayList<CodeType>();
    /**
     * Physical Attribute. Description Code. Code
     * <p>
     * A description of the physical attribute, expressed as a code.
     * 
     */
    @JsonProperty("DescriptionCode")
    @JsonPropertyDescription("A description of the physical attribute, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> descriptionCode = new ArrayList<CodeType>();
    /**
     * Physical Attribute. Description. Text
     * <p>
     * A description of the physical attribute, expressed as text.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("A description of the physical attribute, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();

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

    public PhysicalAttribute withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Physical Attribute. Attribute Identifier. Identifier
     * <p>
     * An identifier for this physical attribute.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    public List<IdentifierType> getAttributeID() {
        return attributeID;
    }

    /**
     * Physical Attribute. Attribute Identifier. Identifier
     * <p>
     * An identifier for this physical attribute.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    public void setAttributeID(List<IdentifierType> attributeID) {
        this.attributeID = attributeID;
    }

    public PhysicalAttribute withAttributeID(List<IdentifierType> attributeID) {
        this.attributeID = attributeID;
        return this;
    }

    /**
     * Physical Attribute. Position Code. Code
     * <p>
     * A code signifying the position of this physical attribute.
     * 
     */
    @JsonProperty("PositionCode")
    public List<CodeType> getPositionCode() {
        return positionCode;
    }

    /**
     * Physical Attribute. Position Code. Code
     * <p>
     * A code signifying the position of this physical attribute.
     * 
     */
    @JsonProperty("PositionCode")
    public void setPositionCode(List<CodeType> positionCode) {
        this.positionCode = positionCode;
    }

    public PhysicalAttribute withPositionCode(List<CodeType> positionCode) {
        this.positionCode = positionCode;
        return this;
    }

    /**
     * Physical Attribute. Description Code. Code
     * <p>
     * A description of the physical attribute, expressed as a code.
     * 
     */
    @JsonProperty("DescriptionCode")
    public List<CodeType> getDescriptionCode() {
        return descriptionCode;
    }

    /**
     * Physical Attribute. Description Code. Code
     * <p>
     * A description of the physical attribute, expressed as a code.
     * 
     */
    @JsonProperty("DescriptionCode")
    public void setDescriptionCode(List<CodeType> descriptionCode) {
        this.descriptionCode = descriptionCode;
    }

    public PhysicalAttribute withDescriptionCode(List<CodeType> descriptionCode) {
        this.descriptionCode = descriptionCode;
        return this;
    }

    /**
     * Physical Attribute. Description. Text
     * <p>
     * A description of the physical attribute, expressed as text.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Physical Attribute. Description. Text
     * <p>
     * A description of the physical attribute, expressed as text.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public PhysicalAttribute withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhysicalAttribute.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("attributeID");
        sb.append('=');
        sb.append(((this.attributeID == null)?"<null>":this.attributeID));
        sb.append(',');
        sb.append("positionCode");
        sb.append('=');
        sb.append(((this.positionCode == null)?"<null>":this.positionCode));
        sb.append(',');
        sb.append("descriptionCode");
        sb.append('=');
        sb.append(((this.descriptionCode == null)?"<null>":this.descriptionCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.attributeID == null)? 0 :this.attributeID.hashCode()));
        result = ((result* 31)+((this.positionCode == null)? 0 :this.positionCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.descriptionCode == null)? 0 :this.descriptionCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhysicalAttribute) == false) {
            return false;
        }
        PhysicalAttribute rhs = ((PhysicalAttribute) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.attributeID == rhs.attributeID)||((this.attributeID!= null)&&this.attributeID.equals(rhs.attributeID))))&&((this.positionCode == rhs.positionCode)||((this.positionCode!= null)&&this.positionCode.equals(rhs.positionCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.descriptionCode == rhs.descriptionCode)||((this.descriptionCode!= null)&&this.descriptionCode.equals(rhs.descriptionCode))));
    }

}
