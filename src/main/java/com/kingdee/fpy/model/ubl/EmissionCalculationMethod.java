
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
 * Emission Calculation Method. Details
 * <p>
 * A class to define how an environmental emission is calculated.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "CalculationMethodCode",
    "FullnessIndicationCode",
    "MeasurementFromLocation",
    "MeasurementToLocation"
})
@Generated("jsonschema2pojo")
public class EmissionCalculationMethod {

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
     * Emission Calculation Method. Calculation Method Code. Code
     * <p>
     * A code signifying the method used to calculate the emission.
     * 
     */
    @JsonProperty("CalculationMethodCode")
    @JsonPropertyDescription("A code signifying the method used to calculate the emission.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> calculationMethodCode = new ArrayList<CodeType>();
    /**
     * Emission Calculation Method. Fullness Indication Code. Code
     * <p>
     * A code signifying whether a piece of transport equipment is full, partially full, or empty. This indication is used as a parameter when calculating the environmental emission.
     * 
     */
    @JsonProperty("FullnessIndicationCode")
    @JsonPropertyDescription("A code signifying whether a piece of transport equipment is full, partially full, or empty. This indication is used as a parameter when calculating the environmental emission.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> fullnessIndicationCode = new ArrayList<CodeType>();
    /**
     * Emission Calculation Method. Measurement From_ Location. Location
     * <p>
     * A start location from which an environmental emission is calculated.
     * 
     */
    @JsonProperty("MeasurementFromLocation")
    @JsonPropertyDescription("A start location from which an environmental emission is calculated.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> measurementFromLocation = new ArrayList<Location>();
    /**
     * Emission Calculation Method. Measurement To_ Location. Location
     * <p>
     * An end location to which an environmental emission is calculated.
     * 
     */
    @JsonProperty("MeasurementToLocation")
    @JsonPropertyDescription("An end location to which an environmental emission is calculated.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> measurementToLocation = new ArrayList<Location>();

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

    public EmissionCalculationMethod withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Emission Calculation Method. Calculation Method Code. Code
     * <p>
     * A code signifying the method used to calculate the emission.
     * 
     */
    @JsonProperty("CalculationMethodCode")
    public List<CodeType> getCalculationMethodCode() {
        return calculationMethodCode;
    }

    /**
     * Emission Calculation Method. Calculation Method Code. Code
     * <p>
     * A code signifying the method used to calculate the emission.
     * 
     */
    @JsonProperty("CalculationMethodCode")
    public void setCalculationMethodCode(List<CodeType> calculationMethodCode) {
        this.calculationMethodCode = calculationMethodCode;
    }

    public EmissionCalculationMethod withCalculationMethodCode(List<CodeType> calculationMethodCode) {
        this.calculationMethodCode = calculationMethodCode;
        return this;
    }

    /**
     * Emission Calculation Method. Fullness Indication Code. Code
     * <p>
     * A code signifying whether a piece of transport equipment is full, partially full, or empty. This indication is used as a parameter when calculating the environmental emission.
     * 
     */
    @JsonProperty("FullnessIndicationCode")
    public List<CodeType> getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Emission Calculation Method. Fullness Indication Code. Code
     * <p>
     * A code signifying whether a piece of transport equipment is full, partially full, or empty. This indication is used as a parameter when calculating the environmental emission.
     * 
     */
    @JsonProperty("FullnessIndicationCode")
    public void setFullnessIndicationCode(List<CodeType> fullnessIndicationCode) {
        this.fullnessIndicationCode = fullnessIndicationCode;
    }

    public EmissionCalculationMethod withFullnessIndicationCode(List<CodeType> fullnessIndicationCode) {
        this.fullnessIndicationCode = fullnessIndicationCode;
        return this;
    }

    /**
     * Emission Calculation Method. Measurement From_ Location. Location
     * <p>
     * A start location from which an environmental emission is calculated.
     * 
     */
    @JsonProperty("MeasurementFromLocation")
    public List<Location> getMeasurementFromLocation() {
        return measurementFromLocation;
    }

    /**
     * Emission Calculation Method. Measurement From_ Location. Location
     * <p>
     * A start location from which an environmental emission is calculated.
     * 
     */
    @JsonProperty("MeasurementFromLocation")
    public void setMeasurementFromLocation(List<Location> measurementFromLocation) {
        this.measurementFromLocation = measurementFromLocation;
    }

    public EmissionCalculationMethod withMeasurementFromLocation(List<Location> measurementFromLocation) {
        this.measurementFromLocation = measurementFromLocation;
        return this;
    }

    /**
     * Emission Calculation Method. Measurement To_ Location. Location
     * <p>
     * An end location to which an environmental emission is calculated.
     * 
     */
    @JsonProperty("MeasurementToLocation")
    public List<Location> getMeasurementToLocation() {
        return measurementToLocation;
    }

    /**
     * Emission Calculation Method. Measurement To_ Location. Location
     * <p>
     * An end location to which an environmental emission is calculated.
     * 
     */
    @JsonProperty("MeasurementToLocation")
    public void setMeasurementToLocation(List<Location> measurementToLocation) {
        this.measurementToLocation = measurementToLocation;
    }

    public EmissionCalculationMethod withMeasurementToLocation(List<Location> measurementToLocation) {
        this.measurementToLocation = measurementToLocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmissionCalculationMethod.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("calculationMethodCode");
        sb.append('=');
        sb.append(((this.calculationMethodCode == null)?"<null>":this.calculationMethodCode));
        sb.append(',');
        sb.append("fullnessIndicationCode");
        sb.append('=');
        sb.append(((this.fullnessIndicationCode == null)?"<null>":this.fullnessIndicationCode));
        sb.append(',');
        sb.append("measurementFromLocation");
        sb.append('=');
        sb.append(((this.measurementFromLocation == null)?"<null>":this.measurementFromLocation));
        sb.append(',');
        sb.append("measurementToLocation");
        sb.append('=');
        sb.append(((this.measurementToLocation == null)?"<null>":this.measurementToLocation));
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
        result = ((result* 31)+((this.calculationMethodCode == null)? 0 :this.calculationMethodCode.hashCode()));
        result = ((result* 31)+((this.measurementFromLocation == null)? 0 :this.measurementFromLocation.hashCode()));
        result = ((result* 31)+((this.fullnessIndicationCode == null)? 0 :this.fullnessIndicationCode.hashCode()));
        result = ((result* 31)+((this.measurementToLocation == null)? 0 :this.measurementToLocation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmissionCalculationMethod) == false) {
            return false;
        }
        EmissionCalculationMethod rhs = ((EmissionCalculationMethod) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.calculationMethodCode == rhs.calculationMethodCode)||((this.calculationMethodCode!= null)&&this.calculationMethodCode.equals(rhs.calculationMethodCode))))&&((this.measurementFromLocation == rhs.measurementFromLocation)||((this.measurementFromLocation!= null)&&this.measurementFromLocation.equals(rhs.measurementFromLocation))))&&((this.fullnessIndicationCode == rhs.fullnessIndicationCode)||((this.fullnessIndicationCode!= null)&&this.fullnessIndicationCode.equals(rhs.fullnessIndicationCode))))&&((this.measurementToLocation == rhs.measurementToLocation)||((this.measurementToLocation!= null)&&this.measurementToLocation.equals(rhs.measurementToLocation))));
    }

}
