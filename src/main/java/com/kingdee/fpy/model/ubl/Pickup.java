
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
 * Pickup. Details
 * <p>
 * A class to describe a pickup for delivery.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ActualPickupDate",
    "ActualPickupTime",
    "EarliestPickupDate",
    "EarliestPickupTime",
    "LatestPickupDate",
    "LatestPickupTime",
    "PickupLocation",
    "PickupParty"
})
@Generated("jsonschema2pojo")
public class Pickup {

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
     * Pickup. Identifier
     * <p>
     * An identifier for this pickup.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this pickup.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Pickup. Actual_ Pickup Date. Date
     * <p>
     * The actual pickup date.
     * 
     */
    @JsonProperty("ActualPickupDate")
    @JsonPropertyDescription("The actual pickup date.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> actualPickupDate = new ArrayList<DateType>();
    /**
     * Pickup. Actual_ Pickup Time. Time
     * <p>
     * The actual pickup time.
     * 
     */
    @JsonProperty("ActualPickupTime")
    @JsonPropertyDescription("The actual pickup time.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> actualPickupTime = new ArrayList<TimeType>();
    /**
     * Pickup. Earliest_ Pickup Date. Date
     * <p>
     * The earliest pickup date.
     * 
     */
    @JsonProperty("EarliestPickupDate")
    @JsonPropertyDescription("The earliest pickup date.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> earliestPickupDate = new ArrayList<DateType>();
    /**
     * Pickup. Earliest_ Pickup Time. Time
     * <p>
     * The earliest pickup time.
     * 
     */
    @JsonProperty("EarliestPickupTime")
    @JsonPropertyDescription("The earliest pickup time.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> earliestPickupTime = new ArrayList<TimeType>();
    /**
     * Pickup. Latest_ Pickup Date. Date
     * <p>
     * The latest pickup date.
     * 
     */
    @JsonProperty("LatestPickupDate")
    @JsonPropertyDescription("The latest pickup date.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> latestPickupDate = new ArrayList<DateType>();
    /**
     * Pickup. Latest_ Pickup Time. Time
     * <p>
     * The latest pickup time.
     * 
     */
    @JsonProperty("LatestPickupTime")
    @JsonPropertyDescription("The latest pickup time.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> latestPickupTime = new ArrayList<TimeType>();
    /**
     * Pickup. Pickup_ Location. Location
     * <p>
     * The pickup location.
     * 
     */
    @JsonProperty("PickupLocation")
    @JsonPropertyDescription("The pickup location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> pickupLocation = new ArrayList<Location>();
    /**
     * Pickup. Pickup_ Party. Party
     * <p>
     * The party responsible for picking up a delivery.
     * 
     */
    @JsonProperty("PickupParty")
    @JsonPropertyDescription("The party responsible for picking up a delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> pickupParty = new ArrayList<Party>();

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

    public Pickup withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Pickup. Identifier
     * <p>
     * An identifier for this pickup.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Pickup. Identifier
     * <p>
     * An identifier for this pickup.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Pickup withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Pickup. Actual_ Pickup Date. Date
     * <p>
     * The actual pickup date.
     * 
     */
    @JsonProperty("ActualPickupDate")
    public List<DateType> getActualPickupDate() {
        return actualPickupDate;
    }

    /**
     * Pickup. Actual_ Pickup Date. Date
     * <p>
     * The actual pickup date.
     * 
     */
    @JsonProperty("ActualPickupDate")
    public void setActualPickupDate(List<DateType> actualPickupDate) {
        this.actualPickupDate = actualPickupDate;
    }

    public Pickup withActualPickupDate(List<DateType> actualPickupDate) {
        this.actualPickupDate = actualPickupDate;
        return this;
    }

    /**
     * Pickup. Actual_ Pickup Time. Time
     * <p>
     * The actual pickup time.
     * 
     */
    @JsonProperty("ActualPickupTime")
    public List<TimeType> getActualPickupTime() {
        return actualPickupTime;
    }

    /**
     * Pickup. Actual_ Pickup Time. Time
     * <p>
     * The actual pickup time.
     * 
     */
    @JsonProperty("ActualPickupTime")
    public void setActualPickupTime(List<TimeType> actualPickupTime) {
        this.actualPickupTime = actualPickupTime;
    }

    public Pickup withActualPickupTime(List<TimeType> actualPickupTime) {
        this.actualPickupTime = actualPickupTime;
        return this;
    }

    /**
     * Pickup. Earliest_ Pickup Date. Date
     * <p>
     * The earliest pickup date.
     * 
     */
    @JsonProperty("EarliestPickupDate")
    public List<DateType> getEarliestPickupDate() {
        return earliestPickupDate;
    }

    /**
     * Pickup. Earliest_ Pickup Date. Date
     * <p>
     * The earliest pickup date.
     * 
     */
    @JsonProperty("EarliestPickupDate")
    public void setEarliestPickupDate(List<DateType> earliestPickupDate) {
        this.earliestPickupDate = earliestPickupDate;
    }

    public Pickup withEarliestPickupDate(List<DateType> earliestPickupDate) {
        this.earliestPickupDate = earliestPickupDate;
        return this;
    }

    /**
     * Pickup. Earliest_ Pickup Time. Time
     * <p>
     * The earliest pickup time.
     * 
     */
    @JsonProperty("EarliestPickupTime")
    public List<TimeType> getEarliestPickupTime() {
        return earliestPickupTime;
    }

    /**
     * Pickup. Earliest_ Pickup Time. Time
     * <p>
     * The earliest pickup time.
     * 
     */
    @JsonProperty("EarliestPickupTime")
    public void setEarliestPickupTime(List<TimeType> earliestPickupTime) {
        this.earliestPickupTime = earliestPickupTime;
    }

    public Pickup withEarliestPickupTime(List<TimeType> earliestPickupTime) {
        this.earliestPickupTime = earliestPickupTime;
        return this;
    }

    /**
     * Pickup. Latest_ Pickup Date. Date
     * <p>
     * The latest pickup date.
     * 
     */
    @JsonProperty("LatestPickupDate")
    public List<DateType> getLatestPickupDate() {
        return latestPickupDate;
    }

    /**
     * Pickup. Latest_ Pickup Date. Date
     * <p>
     * The latest pickup date.
     * 
     */
    @JsonProperty("LatestPickupDate")
    public void setLatestPickupDate(List<DateType> latestPickupDate) {
        this.latestPickupDate = latestPickupDate;
    }

    public Pickup withLatestPickupDate(List<DateType> latestPickupDate) {
        this.latestPickupDate = latestPickupDate;
        return this;
    }

    /**
     * Pickup. Latest_ Pickup Time. Time
     * <p>
     * The latest pickup time.
     * 
     */
    @JsonProperty("LatestPickupTime")
    public List<TimeType> getLatestPickupTime() {
        return latestPickupTime;
    }

    /**
     * Pickup. Latest_ Pickup Time. Time
     * <p>
     * The latest pickup time.
     * 
     */
    @JsonProperty("LatestPickupTime")
    public void setLatestPickupTime(List<TimeType> latestPickupTime) {
        this.latestPickupTime = latestPickupTime;
    }

    public Pickup withLatestPickupTime(List<TimeType> latestPickupTime) {
        this.latestPickupTime = latestPickupTime;
        return this;
    }

    /**
     * Pickup. Pickup_ Location. Location
     * <p>
     * The pickup location.
     * 
     */
    @JsonProperty("PickupLocation")
    public List<Location> getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Pickup. Pickup_ Location. Location
     * <p>
     * The pickup location.
     * 
     */
    @JsonProperty("PickupLocation")
    public void setPickupLocation(List<Location> pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public Pickup withPickupLocation(List<Location> pickupLocation) {
        this.pickupLocation = pickupLocation;
        return this;
    }

    /**
     * Pickup. Pickup_ Party. Party
     * <p>
     * The party responsible for picking up a delivery.
     * 
     */
    @JsonProperty("PickupParty")
    public List<Party> getPickupParty() {
        return pickupParty;
    }

    /**
     * Pickup. Pickup_ Party. Party
     * <p>
     * The party responsible for picking up a delivery.
     * 
     */
    @JsonProperty("PickupParty")
    public void setPickupParty(List<Party> pickupParty) {
        this.pickupParty = pickupParty;
    }

    public Pickup withPickupParty(List<Party> pickupParty) {
        this.pickupParty = pickupParty;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pickup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actualPickupDate");
        sb.append('=');
        sb.append(((this.actualPickupDate == null)?"<null>":this.actualPickupDate));
        sb.append(',');
        sb.append("actualPickupTime");
        sb.append('=');
        sb.append(((this.actualPickupTime == null)?"<null>":this.actualPickupTime));
        sb.append(',');
        sb.append("earliestPickupDate");
        sb.append('=');
        sb.append(((this.earliestPickupDate == null)?"<null>":this.earliestPickupDate));
        sb.append(',');
        sb.append("earliestPickupTime");
        sb.append('=');
        sb.append(((this.earliestPickupTime == null)?"<null>":this.earliestPickupTime));
        sb.append(',');
        sb.append("latestPickupDate");
        sb.append('=');
        sb.append(((this.latestPickupDate == null)?"<null>":this.latestPickupDate));
        sb.append(',');
        sb.append("latestPickupTime");
        sb.append('=');
        sb.append(((this.latestPickupTime == null)?"<null>":this.latestPickupTime));
        sb.append(',');
        sb.append("pickupLocation");
        sb.append('=');
        sb.append(((this.pickupLocation == null)?"<null>":this.pickupLocation));
        sb.append(',');
        sb.append("pickupParty");
        sb.append('=');
        sb.append(((this.pickupParty == null)?"<null>":this.pickupParty));
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
        result = ((result* 31)+((this.latestPickupDate == null)? 0 :this.latestPickupDate.hashCode()));
        result = ((result* 31)+((this.earliestPickupDate == null)? 0 :this.earliestPickupDate.hashCode()));
        result = ((result* 31)+((this.pickupParty == null)? 0 :this.pickupParty.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.actualPickupDate == null)? 0 :this.actualPickupDate.hashCode()));
        result = ((result* 31)+((this.earliestPickupTime == null)? 0 :this.earliestPickupTime.hashCode()));
        result = ((result* 31)+((this.latestPickupTime == null)? 0 :this.latestPickupTime.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.pickupLocation == null)? 0 :this.pickupLocation.hashCode()));
        result = ((result* 31)+((this.actualPickupTime == null)? 0 :this.actualPickupTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pickup) == false) {
            return false;
        }
        Pickup rhs = ((Pickup) other);
        return (((((((((((this.latestPickupDate == rhs.latestPickupDate)||((this.latestPickupDate!= null)&&this.latestPickupDate.equals(rhs.latestPickupDate)))&&((this.earliestPickupDate == rhs.earliestPickupDate)||((this.earliestPickupDate!= null)&&this.earliestPickupDate.equals(rhs.earliestPickupDate))))&&((this.pickupParty == rhs.pickupParty)||((this.pickupParty!= null)&&this.pickupParty.equals(rhs.pickupParty))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.actualPickupDate == rhs.actualPickupDate)||((this.actualPickupDate!= null)&&this.actualPickupDate.equals(rhs.actualPickupDate))))&&((this.earliestPickupTime == rhs.earliestPickupTime)||((this.earliestPickupTime!= null)&&this.earliestPickupTime.equals(rhs.earliestPickupTime))))&&((this.latestPickupTime == rhs.latestPickupTime)||((this.latestPickupTime!= null)&&this.latestPickupTime.equals(rhs.latestPickupTime))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.pickupLocation == rhs.pickupLocation)||((this.pickupLocation!= null)&&this.pickupLocation.equals(rhs.pickupLocation))))&&((this.actualPickupTime == rhs.actualPickupTime)||((this.actualPickupTime!= null)&&this.actualPickupTime.equals(rhs.actualPickupTime))));
    }

}
