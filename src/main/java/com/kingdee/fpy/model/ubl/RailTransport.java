
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
 * Rail Transport. Details
 * <p>
 * A class defining details about a train wagon used as a means of transport.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "TrainID",
    "RailCarID"
})
@Generated("jsonschema2pojo")
public class RailTransport {

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
     * Rail Transport. Train Identifier. Identifier
     * <p>
     * An identifier for the train used as the means of transport.
     * (Required)
     * 
     */
    @JsonProperty("TrainID")
    @JsonPropertyDescription("An identifier for the train used as the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> trainID = new ArrayList<IdentifierType>();
    /**
     * Rail Transport. Rail Car Identifier. Identifier
     * <p>
     * An identifier for the rail car on the train used as the means of transport.
     * 
     */
    @JsonProperty("RailCarID")
    @JsonPropertyDescription("An identifier for the rail car on the train used as the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> railCarID = new ArrayList<IdentifierType>();

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

    public RailTransport withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Rail Transport. Train Identifier. Identifier
     * <p>
     * An identifier for the train used as the means of transport.
     * (Required)
     * 
     */
    @JsonProperty("TrainID")
    public List<IdentifierType> getTrainID() {
        return trainID;
    }

    /**
     * Rail Transport. Train Identifier. Identifier
     * <p>
     * An identifier for the train used as the means of transport.
     * (Required)
     * 
     */
    @JsonProperty("TrainID")
    public void setTrainID(List<IdentifierType> trainID) {
        this.trainID = trainID;
    }

    public RailTransport withTrainID(List<IdentifierType> trainID) {
        this.trainID = trainID;
        return this;
    }

    /**
     * Rail Transport. Rail Car Identifier. Identifier
     * <p>
     * An identifier for the rail car on the train used as the means of transport.
     * 
     */
    @JsonProperty("RailCarID")
    public List<IdentifierType> getRailCarID() {
        return railCarID;
    }

    /**
     * Rail Transport. Rail Car Identifier. Identifier
     * <p>
     * An identifier for the rail car on the train used as the means of transport.
     * 
     */
    @JsonProperty("RailCarID")
    public void setRailCarID(List<IdentifierType> railCarID) {
        this.railCarID = railCarID;
    }

    public RailTransport withRailCarID(List<IdentifierType> railCarID) {
        this.railCarID = railCarID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RailTransport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("trainID");
        sb.append('=');
        sb.append(((this.trainID == null)?"<null>":this.trainID));
        sb.append(',');
        sb.append("railCarID");
        sb.append('=');
        sb.append(((this.railCarID == null)?"<null>":this.railCarID));
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
        result = ((result* 31)+((this.trainID == null)? 0 :this.trainID.hashCode()));
        result = ((result* 31)+((this.railCarID == null)? 0 :this.railCarID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RailTransport) == false) {
            return false;
        }
        RailTransport rhs = ((RailTransport) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.trainID == rhs.trainID)||((this.trainID!= null)&&this.trainID.equals(rhs.trainID))))&&((this.railCarID == rhs.railCarID)||((this.railCarID!= null)&&this.railCarID.equals(rhs.railCarID))));
    }

}
