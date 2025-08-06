
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
 * Environmental Emission. Details
 * <p>
 * A class to describe an environmental emission.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "EnvironmentalEmissionTypeCode",
    "ValueMeasure",
    "Description",
    "EmissionCalculationMethod"
})
@Generated("jsonschema2pojo")
public class EnvironmentalEmission {

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
     * Environmental Emission. Environmental Emission Type Code. Code
     * <p>
     * A code specifying the type of environmental emission.
     * (Required)
     * 
     */
    @JsonProperty("EnvironmentalEmissionTypeCode")
    @JsonPropertyDescription("A code specifying the type of environmental emission.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> environmentalEmissionTypeCode = new ArrayList<CodeType>();
    /**
     * Environmental Emission. Value. Measure
     * <p>
     * A value measurement for the environmental emission.
     * (Required)
     * 
     */
    @JsonProperty("ValueMeasure")
    @JsonPropertyDescription("A value measurement for the environmental emission.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<MeasureType> valueMeasure = new ArrayList<MeasureType>();
    /**
     * Environmental Emission. Description. Text
     * <p>
     * Text describing this environmental emission.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this environmental emission.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Environmental Emission. Emission Calculation Method
     * <p>
     * A method used to calculate the amount of this emission.
     * 
     */
    @JsonProperty("EmissionCalculationMethod")
    @JsonPropertyDescription("A method used to calculate the amount of this emission.")
    @Size(min = 1)
    @Valid
    private List<EmissionCalculationMethod> emissionCalculationMethod = new ArrayList<EmissionCalculationMethod>();

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

    public EnvironmentalEmission withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Environmental Emission. Environmental Emission Type Code. Code
     * <p>
     * A code specifying the type of environmental emission.
     * (Required)
     * 
     */
    @JsonProperty("EnvironmentalEmissionTypeCode")
    public List<CodeType> getEnvironmentalEmissionTypeCode() {
        return environmentalEmissionTypeCode;
    }

    /**
     * Environmental Emission. Environmental Emission Type Code. Code
     * <p>
     * A code specifying the type of environmental emission.
     * (Required)
     * 
     */
    @JsonProperty("EnvironmentalEmissionTypeCode")
    public void setEnvironmentalEmissionTypeCode(List<CodeType> environmentalEmissionTypeCode) {
        this.environmentalEmissionTypeCode = environmentalEmissionTypeCode;
    }

    public EnvironmentalEmission withEnvironmentalEmissionTypeCode(List<CodeType> environmentalEmissionTypeCode) {
        this.environmentalEmissionTypeCode = environmentalEmissionTypeCode;
        return this;
    }

    /**
     * Environmental Emission. Value. Measure
     * <p>
     * A value measurement for the environmental emission.
     * (Required)
     * 
     */
    @JsonProperty("ValueMeasure")
    public List<MeasureType> getValueMeasure() {
        return valueMeasure;
    }

    /**
     * Environmental Emission. Value. Measure
     * <p>
     * A value measurement for the environmental emission.
     * (Required)
     * 
     */
    @JsonProperty("ValueMeasure")
    public void setValueMeasure(List<MeasureType> valueMeasure) {
        this.valueMeasure = valueMeasure;
    }

    public EnvironmentalEmission withValueMeasure(List<MeasureType> valueMeasure) {
        this.valueMeasure = valueMeasure;
        return this;
    }

    /**
     * Environmental Emission. Description. Text
     * <p>
     * Text describing this environmental emission.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Environmental Emission. Description. Text
     * <p>
     * Text describing this environmental emission.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public EnvironmentalEmission withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Environmental Emission. Emission Calculation Method
     * <p>
     * A method used to calculate the amount of this emission.
     * 
     */
    @JsonProperty("EmissionCalculationMethod")
    public List<EmissionCalculationMethod> getEmissionCalculationMethod() {
        return emissionCalculationMethod;
    }

    /**
     * Environmental Emission. Emission Calculation Method
     * <p>
     * A method used to calculate the amount of this emission.
     * 
     */
    @JsonProperty("EmissionCalculationMethod")
    public void setEmissionCalculationMethod(List<EmissionCalculationMethod> emissionCalculationMethod) {
        this.emissionCalculationMethod = emissionCalculationMethod;
    }

    public EnvironmentalEmission withEmissionCalculationMethod(List<EmissionCalculationMethod> emissionCalculationMethod) {
        this.emissionCalculationMethod = emissionCalculationMethod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnvironmentalEmission.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("environmentalEmissionTypeCode");
        sb.append('=');
        sb.append(((this.environmentalEmissionTypeCode == null)?"<null>":this.environmentalEmissionTypeCode));
        sb.append(',');
        sb.append("valueMeasure");
        sb.append('=');
        sb.append(((this.valueMeasure == null)?"<null>":this.valueMeasure));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("emissionCalculationMethod");
        sb.append('=');
        sb.append(((this.emissionCalculationMethod == null)?"<null>":this.emissionCalculationMethod));
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
        result = ((result* 31)+((this.environmentalEmissionTypeCode == null)? 0 :this.environmentalEmissionTypeCode.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.emissionCalculationMethod == null)? 0 :this.emissionCalculationMethod.hashCode()));
        result = ((result* 31)+((this.valueMeasure == null)? 0 :this.valueMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvironmentalEmission) == false) {
            return false;
        }
        EnvironmentalEmission rhs = ((EnvironmentalEmission) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.environmentalEmissionTypeCode == rhs.environmentalEmissionTypeCode)||((this.environmentalEmissionTypeCode!= null)&&this.environmentalEmissionTypeCode.equals(rhs.environmentalEmissionTypeCode))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.emissionCalculationMethod == rhs.emissionCalculationMethod)||((this.emissionCalculationMethod!= null)&&this.emissionCalculationMethod.equals(rhs.emissionCalculationMethod))))&&((this.valueMeasure == rhs.valueMeasure)||((this.valueMeasure!= null)&&this.valueMeasure.equals(rhs.valueMeasure))));
    }

}
