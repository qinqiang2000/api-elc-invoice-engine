
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
 * Stowage. Details
 * <p>
 * A class to describe a location on board a means of transport where specified goods or transport equipment have been stowed or are to be stowed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LocationID",
    "Location",
    "MeasurementDimension"
})
@Generated("jsonschema2pojo")
public class Stowage {

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
     * Stowage. Location Identifier. Identifier
     * <p>
     * An identifier for the location.
     * 
     */
    @JsonProperty("LocationID")
    @JsonPropertyDescription("An identifier for the location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> locationID = new ArrayList<IdentifierType>();
    /**
     * Stowage. Location. Text
     * <p>
     * Text describing the location.
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("Text describing the location.")
    @Size(min = 1)
    @Valid
    private List<TextType> location = new ArrayList<TextType>();
    /**
     * Stowage. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this stowage.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of this stowage.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();

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

    public Stowage withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Stowage. Location Identifier. Identifier
     * <p>
     * An identifier for the location.
     * 
     */
    @JsonProperty("LocationID")
    public List<IdentifierType> getLocationID() {
        return locationID;
    }

    /**
     * Stowage. Location Identifier. Identifier
     * <p>
     * An identifier for the location.
     * 
     */
    @JsonProperty("LocationID")
    public void setLocationID(List<IdentifierType> locationID) {
        this.locationID = locationID;
    }

    public Stowage withLocationID(List<IdentifierType> locationID) {
        this.locationID = locationID;
        return this;
    }

    /**
     * Stowage. Location. Text
     * <p>
     * Text describing the location.
     * 
     */
    @JsonProperty("Location")
    public List<TextType> getLocation() {
        return location;
    }

    /**
     * Stowage. Location. Text
     * <p>
     * Text describing the location.
     * 
     */
    @JsonProperty("Location")
    public void setLocation(List<TextType> location) {
        this.location = location;
    }

    public Stowage withLocation(List<TextType> location) {
        this.location = location;
        return this;
    }

    /**
     * Stowage. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this stowage.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Stowage. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this stowage.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public Stowage withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stowage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("locationID");
        sb.append('=');
        sb.append(((this.locationID == null)?"<null>":this.locationID));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
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
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        result = ((result* 31)+((this.locationID == null)? 0 :this.locationID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stowage) == false) {
            return false;
        }
        Stowage rhs = ((Stowage) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))))&&((this.locationID == rhs.locationID)||((this.locationID!= null)&&this.locationID.equals(rhs.locationID))));
    }

}
