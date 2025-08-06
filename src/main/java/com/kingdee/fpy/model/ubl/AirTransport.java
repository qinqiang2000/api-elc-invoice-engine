
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
 * Air Transport. Details
 * <p>
 * A class to identify a specific aircraft used for transportation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "AircraftID"
})
@Generated("jsonschema2pojo")
public class AirTransport {

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
     * Air Transport. Aircraft Identifier. Identifier
     * <p>
     * An identifer for a specific aircraft.
     * (Required)
     * 
     */
    @JsonProperty("AircraftID")
    @JsonPropertyDescription("An identifer for a specific aircraft.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> aircraftID = new ArrayList<IdentifierType>();

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

    public AirTransport withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Air Transport. Aircraft Identifier. Identifier
     * <p>
     * An identifer for a specific aircraft.
     * (Required)
     * 
     */
    @JsonProperty("AircraftID")
    public List<IdentifierType> getAircraftID() {
        return aircraftID;
    }

    /**
     * Air Transport. Aircraft Identifier. Identifier
     * <p>
     * An identifer for a specific aircraft.
     * (Required)
     * 
     */
    @JsonProperty("AircraftID")
    public void setAircraftID(List<IdentifierType> aircraftID) {
        this.aircraftID = aircraftID;
    }

    public AirTransport withAircraftID(List<IdentifierType> aircraftID) {
        this.aircraftID = aircraftID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirTransport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("aircraftID");
        sb.append('=');
        sb.append(((this.aircraftID == null)?"<null>":this.aircraftID));
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
        result = ((result* 31)+((this.aircraftID == null)? 0 :this.aircraftID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirTransport) == false) {
            return false;
        }
        AirTransport rhs = ((AirTransport) other);
        return (((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.aircraftID == rhs.aircraftID)||((this.aircraftID!= null)&&this.aircraftID.equals(rhs.aircraftID))));
    }

}
