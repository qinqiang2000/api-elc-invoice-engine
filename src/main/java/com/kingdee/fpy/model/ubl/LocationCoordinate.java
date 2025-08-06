
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
 * Location Coordinate. Details
 * <p>
 * A class for defining a set of geographical coordinates (apparently misnamed).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "CoordinateSystemCode",
    "LatitudeDegreesMeasure",
    "LatitudeMinutesMeasure",
    "LatitudeDirectionCode",
    "LongitudeDegreesMeasure",
    "LongitudeMinutesMeasure",
    "LongitudeDirectionCode",
    "AltitudeMeasure"
})
@Generated("jsonschema2pojo")
public class LocationCoordinate {

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
     * Location Coordinate. Coordinate System Code. Code
     * <p>
     * A code signifying the location system used.
     * 
     */
    @JsonProperty("CoordinateSystemCode")
    @JsonPropertyDescription("A code signifying the location system used.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> coordinateSystemCode = new ArrayList<CodeType>();
    /**
     * Location Coordinate. Latitude_ Degrees. Measure
     * <p>
     * The degree component of a latitude measured in degrees and minutes.
     * 
     */
    @JsonProperty("LatitudeDegreesMeasure")
    @JsonPropertyDescription("The degree component of a latitude measured in degrees and minutes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> latitudeDegreesMeasure = new ArrayList<MeasureType>();
    /**
     * Location Coordinate. Latitude_ Minutes. Measure
     * <p>
     * The minutes component of a latitude measured in degrees and minutes (modulo 60).
     * 
     */
    @JsonProperty("LatitudeMinutesMeasure")
    @JsonPropertyDescription("The minutes component of a latitude measured in degrees and minutes (modulo 60).")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> latitudeMinutesMeasure = new ArrayList<MeasureType>();
    /**
     * Location Coordinate. Latitude Direction Code. Code
     * <p>
     * A code signifying the direction of latitude measurement from the equator (north or south).
     * 
     */
    @JsonProperty("LatitudeDirectionCode")
    @JsonPropertyDescription("A code signifying the direction of latitude measurement from the equator (north or south).")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> latitudeDirectionCode = new ArrayList<CodeType>();
    /**
     * Location Coordinate. Longitude_ Degrees. Measure
     * <p>
     * The degree component of a longitude measured in degrees and minutes.
     * 
     */
    @JsonProperty("LongitudeDegreesMeasure")
    @JsonPropertyDescription("The degree component of a longitude measured in degrees and minutes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> longitudeDegreesMeasure = new ArrayList<MeasureType>();
    /**
     * Location Coordinate. Longitude_ Minutes. Measure
     * <p>
     * The minutes component of a longitude measured in degrees and minutes (modulo 60).
     * 
     */
    @JsonProperty("LongitudeMinutesMeasure")
    @JsonPropertyDescription("The minutes component of a longitude measured in degrees and minutes (modulo 60).")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> longitudeMinutesMeasure = new ArrayList<MeasureType>();
    /**
     * Location Coordinate. Longitude Direction Code. Code
     * <p>
     * A code signifying the direction of longitude measurement from the prime meridian (east or west).
     * 
     */
    @JsonProperty("LongitudeDirectionCode")
    @JsonPropertyDescription("A code signifying the direction of longitude measurement from the prime meridian (east or west).")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> longitudeDirectionCode = new ArrayList<CodeType>();
    /**
     * Location Coordinate. Altitude. Measure
     * <p>
     * The altitude of the location.
     * 
     */
    @JsonProperty("AltitudeMeasure")
    @JsonPropertyDescription("The altitude of the location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> altitudeMeasure = new ArrayList<MeasureType>();

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

    public LocationCoordinate withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Location Coordinate. Coordinate System Code. Code
     * <p>
     * A code signifying the location system used.
     * 
     */
    @JsonProperty("CoordinateSystemCode")
    public List<CodeType> getCoordinateSystemCode() {
        return coordinateSystemCode;
    }

    /**
     * Location Coordinate. Coordinate System Code. Code
     * <p>
     * A code signifying the location system used.
     * 
     */
    @JsonProperty("CoordinateSystemCode")
    public void setCoordinateSystemCode(List<CodeType> coordinateSystemCode) {
        this.coordinateSystemCode = coordinateSystemCode;
    }

    public LocationCoordinate withCoordinateSystemCode(List<CodeType> coordinateSystemCode) {
        this.coordinateSystemCode = coordinateSystemCode;
        return this;
    }

    /**
     * Location Coordinate. Latitude_ Degrees. Measure
     * <p>
     * The degree component of a latitude measured in degrees and minutes.
     * 
     */
    @JsonProperty("LatitudeDegreesMeasure")
    public List<MeasureType> getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    /**
     * Location Coordinate. Latitude_ Degrees. Measure
     * <p>
     * The degree component of a latitude measured in degrees and minutes.
     * 
     */
    @JsonProperty("LatitudeDegreesMeasure")
    public void setLatitudeDegreesMeasure(List<MeasureType> latitudeDegreesMeasure) {
        this.latitudeDegreesMeasure = latitudeDegreesMeasure;
    }

    public LocationCoordinate withLatitudeDegreesMeasure(List<MeasureType> latitudeDegreesMeasure) {
        this.latitudeDegreesMeasure = latitudeDegreesMeasure;
        return this;
    }

    /**
     * Location Coordinate. Latitude_ Minutes. Measure
     * <p>
     * The minutes component of a latitude measured in degrees and minutes (modulo 60).
     * 
     */
    @JsonProperty("LatitudeMinutesMeasure")
    public List<MeasureType> getLatitudeMinutesMeasure() {
        return latitudeMinutesMeasure;
    }

    /**
     * Location Coordinate. Latitude_ Minutes. Measure
     * <p>
     * The minutes component of a latitude measured in degrees and minutes (modulo 60).
     * 
     */
    @JsonProperty("LatitudeMinutesMeasure")
    public void setLatitudeMinutesMeasure(List<MeasureType> latitudeMinutesMeasure) {
        this.latitudeMinutesMeasure = latitudeMinutesMeasure;
    }

    public LocationCoordinate withLatitudeMinutesMeasure(List<MeasureType> latitudeMinutesMeasure) {
        this.latitudeMinutesMeasure = latitudeMinutesMeasure;
        return this;
    }

    /**
     * Location Coordinate. Latitude Direction Code. Code
     * <p>
     * A code signifying the direction of latitude measurement from the equator (north or south).
     * 
     */
    @JsonProperty("LatitudeDirectionCode")
    public List<CodeType> getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    /**
     * Location Coordinate. Latitude Direction Code. Code
     * <p>
     * A code signifying the direction of latitude measurement from the equator (north or south).
     * 
     */
    @JsonProperty("LatitudeDirectionCode")
    public void setLatitudeDirectionCode(List<CodeType> latitudeDirectionCode) {
        this.latitudeDirectionCode = latitudeDirectionCode;
    }

    public LocationCoordinate withLatitudeDirectionCode(List<CodeType> latitudeDirectionCode) {
        this.latitudeDirectionCode = latitudeDirectionCode;
        return this;
    }

    /**
     * Location Coordinate. Longitude_ Degrees. Measure
     * <p>
     * The degree component of a longitude measured in degrees and minutes.
     * 
     */
    @JsonProperty("LongitudeDegreesMeasure")
    public List<MeasureType> getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    /**
     * Location Coordinate. Longitude_ Degrees. Measure
     * <p>
     * The degree component of a longitude measured in degrees and minutes.
     * 
     */
    @JsonProperty("LongitudeDegreesMeasure")
    public void setLongitudeDegreesMeasure(List<MeasureType> longitudeDegreesMeasure) {
        this.longitudeDegreesMeasure = longitudeDegreesMeasure;
    }

    public LocationCoordinate withLongitudeDegreesMeasure(List<MeasureType> longitudeDegreesMeasure) {
        this.longitudeDegreesMeasure = longitudeDegreesMeasure;
        return this;
    }

    /**
     * Location Coordinate. Longitude_ Minutes. Measure
     * <p>
     * The minutes component of a longitude measured in degrees and minutes (modulo 60).
     * 
     */
    @JsonProperty("LongitudeMinutesMeasure")
    public List<MeasureType> getLongitudeMinutesMeasure() {
        return longitudeMinutesMeasure;
    }

    /**
     * Location Coordinate. Longitude_ Minutes. Measure
     * <p>
     * The minutes component of a longitude measured in degrees and minutes (modulo 60).
     * 
     */
    @JsonProperty("LongitudeMinutesMeasure")
    public void setLongitudeMinutesMeasure(List<MeasureType> longitudeMinutesMeasure) {
        this.longitudeMinutesMeasure = longitudeMinutesMeasure;
    }

    public LocationCoordinate withLongitudeMinutesMeasure(List<MeasureType> longitudeMinutesMeasure) {
        this.longitudeMinutesMeasure = longitudeMinutesMeasure;
        return this;
    }

    /**
     * Location Coordinate. Longitude Direction Code. Code
     * <p>
     * A code signifying the direction of longitude measurement from the prime meridian (east or west).
     * 
     */
    @JsonProperty("LongitudeDirectionCode")
    public List<CodeType> getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    /**
     * Location Coordinate. Longitude Direction Code. Code
     * <p>
     * A code signifying the direction of longitude measurement from the prime meridian (east or west).
     * 
     */
    @JsonProperty("LongitudeDirectionCode")
    public void setLongitudeDirectionCode(List<CodeType> longitudeDirectionCode) {
        this.longitudeDirectionCode = longitudeDirectionCode;
    }

    public LocationCoordinate withLongitudeDirectionCode(List<CodeType> longitudeDirectionCode) {
        this.longitudeDirectionCode = longitudeDirectionCode;
        return this;
    }

    /**
     * Location Coordinate. Altitude. Measure
     * <p>
     * The altitude of the location.
     * 
     */
    @JsonProperty("AltitudeMeasure")
    public List<MeasureType> getAltitudeMeasure() {
        return altitudeMeasure;
    }

    /**
     * Location Coordinate. Altitude. Measure
     * <p>
     * The altitude of the location.
     * 
     */
    @JsonProperty("AltitudeMeasure")
    public void setAltitudeMeasure(List<MeasureType> altitudeMeasure) {
        this.altitudeMeasure = altitudeMeasure;
    }

    public LocationCoordinate withAltitudeMeasure(List<MeasureType> altitudeMeasure) {
        this.altitudeMeasure = altitudeMeasure;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationCoordinate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("coordinateSystemCode");
        sb.append('=');
        sb.append(((this.coordinateSystemCode == null)?"<null>":this.coordinateSystemCode));
        sb.append(',');
        sb.append("latitudeDegreesMeasure");
        sb.append('=');
        sb.append(((this.latitudeDegreesMeasure == null)?"<null>":this.latitudeDegreesMeasure));
        sb.append(',');
        sb.append("latitudeMinutesMeasure");
        sb.append('=');
        sb.append(((this.latitudeMinutesMeasure == null)?"<null>":this.latitudeMinutesMeasure));
        sb.append(',');
        sb.append("latitudeDirectionCode");
        sb.append('=');
        sb.append(((this.latitudeDirectionCode == null)?"<null>":this.latitudeDirectionCode));
        sb.append(',');
        sb.append("longitudeDegreesMeasure");
        sb.append('=');
        sb.append(((this.longitudeDegreesMeasure == null)?"<null>":this.longitudeDegreesMeasure));
        sb.append(',');
        sb.append("longitudeMinutesMeasure");
        sb.append('=');
        sb.append(((this.longitudeMinutesMeasure == null)?"<null>":this.longitudeMinutesMeasure));
        sb.append(',');
        sb.append("longitudeDirectionCode");
        sb.append('=');
        sb.append(((this.longitudeDirectionCode == null)?"<null>":this.longitudeDirectionCode));
        sb.append(',');
        sb.append("altitudeMeasure");
        sb.append('=');
        sb.append(((this.altitudeMeasure == null)?"<null>":this.altitudeMeasure));
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
        result = ((result* 31)+((this.latitudeDegreesMeasure == null)? 0 :this.latitudeDegreesMeasure.hashCode()));
        result = ((result* 31)+((this.longitudeMinutesMeasure == null)? 0 :this.longitudeMinutesMeasure.hashCode()));
        result = ((result* 31)+((this.altitudeMeasure == null)? 0 :this.altitudeMeasure.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.coordinateSystemCode == null)? 0 :this.coordinateSystemCode.hashCode()));
        result = ((result* 31)+((this.latitudeMinutesMeasure == null)? 0 :this.latitudeMinutesMeasure.hashCode()));
        result = ((result* 31)+((this.longitudeDirectionCode == null)? 0 :this.longitudeDirectionCode.hashCode()));
        result = ((result* 31)+((this.longitudeDegreesMeasure == null)? 0 :this.longitudeDegreesMeasure.hashCode()));
        result = ((result* 31)+((this.latitudeDirectionCode == null)? 0 :this.latitudeDirectionCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationCoordinate) == false) {
            return false;
        }
        LocationCoordinate rhs = ((LocationCoordinate) other);
        return ((((((((((this.latitudeDegreesMeasure == rhs.latitudeDegreesMeasure)||((this.latitudeDegreesMeasure!= null)&&this.latitudeDegreesMeasure.equals(rhs.latitudeDegreesMeasure)))&&((this.longitudeMinutesMeasure == rhs.longitudeMinutesMeasure)||((this.longitudeMinutesMeasure!= null)&&this.longitudeMinutesMeasure.equals(rhs.longitudeMinutesMeasure))))&&((this.altitudeMeasure == rhs.altitudeMeasure)||((this.altitudeMeasure!= null)&&this.altitudeMeasure.equals(rhs.altitudeMeasure))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.coordinateSystemCode == rhs.coordinateSystemCode)||((this.coordinateSystemCode!= null)&&this.coordinateSystemCode.equals(rhs.coordinateSystemCode))))&&((this.latitudeMinutesMeasure == rhs.latitudeMinutesMeasure)||((this.latitudeMinutesMeasure!= null)&&this.latitudeMinutesMeasure.equals(rhs.latitudeMinutesMeasure))))&&((this.longitudeDirectionCode == rhs.longitudeDirectionCode)||((this.longitudeDirectionCode!= null)&&this.longitudeDirectionCode.equals(rhs.longitudeDirectionCode))))&&((this.longitudeDegreesMeasure == rhs.longitudeDegreesMeasure)||((this.longitudeDegreesMeasure!= null)&&this.longitudeDegreesMeasure.equals(rhs.longitudeDegreesMeasure))))&&((this.latitudeDirectionCode == rhs.latitudeDirectionCode)||((this.latitudeDirectionCode!= null)&&this.latitudeDirectionCode.equals(rhs.latitudeDirectionCode))));
    }

}
