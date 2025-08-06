
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
 * Condition. Details
 * <p>
 * A class to define a measurable condition of an object.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "AttributeID",
    "Measure",
    "Description",
    "MinimumMeasure",
    "MaximumMeasure"
})
@Generated("jsonschema2pojo")
public class Condition {

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
     * Condition. Attribute Identifier. Identifier
     * <p>
     * An identifier for the attribute that applies to the condition.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    @JsonPropertyDescription("An identifier for the attribute that applies to the condition.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> attributeID = new ArrayList<IdentifierType>();
    /**
     * Condition. Measure
     * <p>
     * The measurement value.
     * 
     */
    @JsonProperty("Measure")
    @JsonPropertyDescription("The measurement value.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> measure = new ArrayList<MeasureType>();
    /**
     * Condition. Description. Text
     * <p>
     * Text describing the attribute that applies to the condition.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing the attribute that applies to the condition.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Condition. Minimum_ Measure. Measure
     * <p>
     * The minimum value in a range of measurement for this condition.
     * 
     */
    @JsonProperty("MinimumMeasure")
    @JsonPropertyDescription("The minimum value in a range of measurement for this condition.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> minimumMeasure = new ArrayList<MeasureType>();
    /**
     * Condition. Maximum_ Measure. Measure
     * <p>
     * The maximum value in a range of measurement for this condition.
     * 
     */
    @JsonProperty("MaximumMeasure")
    @JsonPropertyDescription("The maximum value in a range of measurement for this condition.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> maximumMeasure = new ArrayList<MeasureType>();

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

    public Condition withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Condition. Attribute Identifier. Identifier
     * <p>
     * An identifier for the attribute that applies to the condition.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    public List<IdentifierType> getAttributeID() {
        return attributeID;
    }

    /**
     * Condition. Attribute Identifier. Identifier
     * <p>
     * An identifier for the attribute that applies to the condition.
     * (Required)
     * 
     */
    @JsonProperty("AttributeID")
    public void setAttributeID(List<IdentifierType> attributeID) {
        this.attributeID = attributeID;
    }

    public Condition withAttributeID(List<IdentifierType> attributeID) {
        this.attributeID = attributeID;
        return this;
    }

    /**
     * Condition. Measure
     * <p>
     * The measurement value.
     * 
     */
    @JsonProperty("Measure")
    public List<MeasureType> getMeasure() {
        return measure;
    }

    /**
     * Condition. Measure
     * <p>
     * The measurement value.
     * 
     */
    @JsonProperty("Measure")
    public void setMeasure(List<MeasureType> measure) {
        this.measure = measure;
    }

    public Condition withMeasure(List<MeasureType> measure) {
        this.measure = measure;
        return this;
    }

    /**
     * Condition. Description. Text
     * <p>
     * Text describing the attribute that applies to the condition.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Condition. Description. Text
     * <p>
     * Text describing the attribute that applies to the condition.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public Condition withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Condition. Minimum_ Measure. Measure
     * <p>
     * The minimum value in a range of measurement for this condition.
     * 
     */
    @JsonProperty("MinimumMeasure")
    public List<MeasureType> getMinimumMeasure() {
        return minimumMeasure;
    }

    /**
     * Condition. Minimum_ Measure. Measure
     * <p>
     * The minimum value in a range of measurement for this condition.
     * 
     */
    @JsonProperty("MinimumMeasure")
    public void setMinimumMeasure(List<MeasureType> minimumMeasure) {
        this.minimumMeasure = minimumMeasure;
    }

    public Condition withMinimumMeasure(List<MeasureType> minimumMeasure) {
        this.minimumMeasure = minimumMeasure;
        return this;
    }

    /**
     * Condition. Maximum_ Measure. Measure
     * <p>
     * The maximum value in a range of measurement for this condition.
     * 
     */
    @JsonProperty("MaximumMeasure")
    public List<MeasureType> getMaximumMeasure() {
        return maximumMeasure;
    }

    /**
     * Condition. Maximum_ Measure. Measure
     * <p>
     * The maximum value in a range of measurement for this condition.
     * 
     */
    @JsonProperty("MaximumMeasure")
    public void setMaximumMeasure(List<MeasureType> maximumMeasure) {
        this.maximumMeasure = maximumMeasure;
    }

    public Condition withMaximumMeasure(List<MeasureType> maximumMeasure) {
        this.maximumMeasure = maximumMeasure;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Condition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("minimumMeasure");
        sb.append('=');
        sb.append(((this.minimumMeasure == null)?"<null>":this.minimumMeasure));
        sb.append(',');
        sb.append("maximumMeasure");
        sb.append('=');
        sb.append(((this.maximumMeasure == null)?"<null>":this.maximumMeasure));
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
        result = ((result* 31)+((this.attributeID == null)? 0 :this.attributeID.hashCode()));
        result = ((result* 31)+((this.minimumMeasure == null)? 0 :this.minimumMeasure.hashCode()));
        result = ((result* 31)+((this.measure == null)? 0 :this.measure.hashCode()));
        result = ((result* 31)+((this.maximumMeasure == null)? 0 :this.maximumMeasure.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Condition) == false) {
            return false;
        }
        Condition rhs = ((Condition) other);
        return (((((((this.attributeID == rhs.attributeID)||((this.attributeID!= null)&&this.attributeID.equals(rhs.attributeID)))&&((this.minimumMeasure == rhs.minimumMeasure)||((this.minimumMeasure!= null)&&this.minimumMeasure.equals(rhs.minimumMeasure))))&&((this.measure == rhs.measure)||((this.measure!= null)&&this.measure.equals(rhs.measure))))&&((this.maximumMeasure == rhs.maximumMeasure)||((this.maximumMeasure!= null)&&this.maximumMeasure.equals(rhs.maximumMeasure))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))));
    }

}
