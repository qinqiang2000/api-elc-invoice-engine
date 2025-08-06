
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
 * Temperature. Details
 * <p>
 * A class to describe a measurement of temperature.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "AttributeID",
    "Measure",
    "Description"
})
@Generated("jsonschema2pojo")
public class Temperature {

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
     * Temperature. Attribute Identifier. Identifier
     * <p>
     * An identifier for this temperature measurement.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    @JsonPropertyDescription("An identifier for this temperature measurement.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> attributeID = new ArrayList<IdentifierType>();
    /**
     * Temperature. Measure
     * <p>
     * The value of this temperature measurement.
     * (Required)
     * 
     */
    @JsonProperty("Measure")
    @JsonPropertyDescription("The value of this temperature measurement.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<MeasureType> measure = new ArrayList<MeasureType>();
    /**
     * Temperature. Description. Text
     * <p>
     * Text describing this temperature measurement.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this temperature measurement.")
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

    public Temperature withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Temperature. Attribute Identifier. Identifier
     * <p>
     * An identifier for this temperature measurement.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    public List<IdentifierType> getAttributeID() {
        return attributeID;
    }

    /**
     * Temperature. Attribute Identifier. Identifier
     * <p>
     * An identifier for this temperature measurement.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    public void setAttributeID(List<IdentifierType> attributeID) {
        this.attributeID = attributeID;
    }

    public Temperature withAttributeID(List<IdentifierType> attributeID) {
        this.attributeID = attributeID;
        return this;
    }

    /**
     * Temperature. Measure
     * <p>
     * The value of this temperature measurement.
     * (Required)
     * 
     */
    @JsonProperty("Measure")
    public List<MeasureType> getMeasure() {
        return measure;
    }

    /**
     * Temperature. Measure
     * <p>
     * The value of this temperature measurement.
     * (Required)
     * 
     */
    @JsonProperty("Measure")
    public void setMeasure(List<MeasureType> measure) {
        this.measure = measure;
    }

    public Temperature withMeasure(List<MeasureType> measure) {
        this.measure = measure;
        return this;
    }

    /**
     * Temperature. Description. Text
     * <p>
     * Text describing this temperature measurement.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Temperature. Description. Text
     * <p>
     * Text describing this temperature measurement.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Temperature withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Temperature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("attributeID");
        sb.append('=');
        sb.append(((this.attributeID == null)?"<null>":this.attributeID));
        sb.append(',');
        sb.append("measure");
        sb.append('=');
        sb.append(((this.measure == null)?"<null>":this.measure));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Temperature) == false) {
            return false;
        }
        Temperature rhs = ((Temperature) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.attributeID == rhs.attributeID)||((this.attributeID!= null)&&this.attributeID.equals(rhs.attributeID))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))));
    }

}
