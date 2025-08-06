
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
 * Road Transport. Details
 * <p>
 * A class for identifying a vehicle used for road transport.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LicensePlateID"
})
@Generated("jsonschema2pojo")
public class RoadTransport {

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
     * Road Transport. License Plate Identifier. Identifier
     * <p>
     * The license plate identifier of this vehicle.
     * (Required)
     * 
     */
    @JsonProperty("LicensePlateID")
    @JsonPropertyDescription("The license plate identifier of this vehicle.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> licensePlateID = new ArrayList<IdentifierType>();

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

    public RoadTransport withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Road Transport. License Plate Identifier. Identifier
     * <p>
     * The license plate identifier of this vehicle.
     * (Required)
     * 
     */
    @JsonProperty("LicensePlateID")
    public List<IdentifierType> getLicensePlateID() {
        return licensePlateID;
    }

    /**
     * Road Transport. License Plate Identifier. Identifier
     * <p>
     * The license plate identifier of this vehicle.
     * (Required)
     * 
     */
    @JsonProperty("LicensePlateID")
    public void setLicensePlateID(List<IdentifierType> licensePlateID) {
        this.licensePlateID = licensePlateID;
    }

    public RoadTransport withLicensePlateID(List<IdentifierType> licensePlateID) {
        this.licensePlateID = licensePlateID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoadTransport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("licensePlateID");
        sb.append('=');
        sb.append(((this.licensePlateID == null)?"<null>":this.licensePlateID));
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
        result = ((result* 31)+((this.licensePlateID == null)? 0 :this.licensePlateID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoadTransport) == false) {
            return false;
        }
        RoadTransport rhs = ((RoadTransport) other);
        return (((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.licensePlateID == rhs.licensePlateID)||((this.licensePlateID!= null)&&this.licensePlateID.equals(rhs.licensePlateID))));
    }

}
