
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
 * Despatch. Details
 * <p>
 * A class to describe the despatching of goods (their pickup for delivery).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "RequestedDespatchDate",
    "RequestedDespatchTime",
    "EstimatedDespatchDate",
    "EstimatedDespatchTime",
    "ActualDespatchDate",
    "ActualDespatchTime",
    "GuaranteedDespatchDate",
    "GuaranteedDespatchTime",
    "ReleaseID",
    "Instructions",
    "DespatchAddress",
    "DespatchLocation",
    "DespatchParty",
    "CarrierParty",
    "NotifyParty",
    "Contact",
    "EstimatedDespatchPeriod",
    "RequestedDespatchPeriod"
})
@Generated("jsonschema2pojo")
public class Despatch {

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
     * Despatch. Identifier
     * <p>
     * An identifier for this despatch event.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this despatch event.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Despatch. Requested_ Despatch Date. Date
     * <p>
     * The despatch (pickup) date requested, normally by the buyer.
     * 
     */
    @JsonProperty("RequestedDespatchDate")
    @JsonPropertyDescription("The despatch (pickup) date requested, normally by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> requestedDespatchDate = new ArrayList<DateType>();
    /**
     * Despatch. Requested_ Despatch Time. Time
     * <p>
     * The despatch (pickup) time requested, normally by the buyer.
     * 
     */
    @JsonProperty("RequestedDespatchTime")
    @JsonPropertyDescription("The despatch (pickup) time requested, normally by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> requestedDespatchTime = new ArrayList<TimeType>();
    /**
     * Despatch. Estimated_ Despatch Date. Date
     * <p>
     * The estimated despatch (pickup) date.
     * 
     */
    @JsonProperty("EstimatedDespatchDate")
    @JsonPropertyDescription("The estimated despatch (pickup) date.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> estimatedDespatchDate = new ArrayList<DateType>();
    /**
     * Despatch. Estimated_ Despatch Time. Time
     * <p>
     * The estimated despatch (pickup) time.
     * 
     */
    @JsonProperty("EstimatedDespatchTime")
    @JsonPropertyDescription("The estimated despatch (pickup) time.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> estimatedDespatchTime = new ArrayList<TimeType>();
    /**
     * Despatch. Actual_ Despatch Date. Date
     * <p>
     * The actual despatch (pickup) date.
     * 
     */
    @JsonProperty("ActualDespatchDate")
    @JsonPropertyDescription("The actual despatch (pickup) date.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> actualDespatchDate = new ArrayList<DateType>();
    /**
     * Despatch. Actual_ Despatch Time. Time
     * <p>
     * The actual despatch (pickup) time.
     * 
     */
    @JsonProperty("ActualDespatchTime")
    @JsonPropertyDescription("The actual despatch (pickup) time.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> actualDespatchTime = new ArrayList<TimeType>();
    /**
     * Despatch. Guaranteed_ Despatch Date. Date
     * <p>
     * The date guaranteed for the despatch (pickup).
     * 
     */
    @JsonProperty("GuaranteedDespatchDate")
    @JsonPropertyDescription("The date guaranteed for the despatch (pickup).")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> guaranteedDespatchDate = new ArrayList<DateType>();
    /**
     * Despatch. Guaranteed_ Despatch Time. Time
     * <p>
     * The time guaranteed for the despatch (pickup).
     * 
     */
    @JsonProperty("GuaranteedDespatchTime")
    @JsonPropertyDescription("The time guaranteed for the despatch (pickup).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> guaranteedDespatchTime = new ArrayList<TimeType>();
    /**
     * Despatch. Release. Identifier
     * <p>
     * An identifier for the release of the despatch used as security control or cargo control (pick-up).
     * 
     */
    @JsonProperty("ReleaseID")
    @JsonPropertyDescription("An identifier for the release of the despatch used as security control or cargo control (pick-up).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> releaseID = new ArrayList<IdentifierType>();
    /**
     * Despatch. Instructions. Text
     * <p>
     * Text describing any special instructions applying to the despatch (pickup).
     * 
     */
    @JsonProperty("Instructions")
    @JsonPropertyDescription("Text describing any special instructions applying to the despatch (pickup).")
    @Size(min = 1)
    @Valid
    private List<TextType> instructions = new ArrayList<TextType>();
    /**
     * Despatch. Despatch_ Address. Address
     * <p>
     * The address of the despatch (pickup).
     * 
     */
    @JsonProperty("DespatchAddress")
    @JsonPropertyDescription("The address of the despatch (pickup).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> despatchAddress = new ArrayList<Address>();
    /**
     * Despatch. Despatch_ Location. Location
     * <p>
     * The location of the despatch (pickup).
     * 
     */
    @JsonProperty("DespatchLocation")
    @JsonPropertyDescription("The location of the despatch (pickup).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> despatchLocation = new ArrayList<Location>();
    /**
     * Despatch. Despatch_ Party. Party
     * <p>
     * The party despatching the goods.
     * 
     */
    @JsonProperty("DespatchParty")
    @JsonPropertyDescription("The party despatching the goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> despatchParty = new ArrayList<Party>();
    /**
     * Despatch. Carrier_ Party. Party
     * <p>
     * The party carrying the goods.
     * 
     */
    @JsonProperty("CarrierParty")
    @JsonPropertyDescription("The party carrying the goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> carrierParty = new ArrayList<Party>();
    /**
     * Despatch. Notify_ Party. Party
     * <p>
     * A party to be notified of this despatch (pickup).
     * 
     */
    @JsonProperty("NotifyParty")
    @JsonPropertyDescription("A party to be notified of this despatch (pickup).")
    @Size(min = 1)
    @Valid
    private List<Party> notifyParty = new ArrayList<Party>();
    /**
     * Despatch. Contact
     * <p>
     * The primary contact for this despatch (pickup).
     * 
     */
    @JsonProperty("Contact")
    @JsonPropertyDescription("The primary contact for this despatch (pickup).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contact> contact = new ArrayList<Contact>();
    /**
     * Despatch. Estimated Despatch_ Period. Period
     * <p>
     * The period estimated for the despatch (pickup) of goods.
     * 
     */
    @JsonProperty("EstimatedDespatchPeriod")
    @JsonPropertyDescription("The period estimated for the despatch (pickup) of goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> estimatedDespatchPeriod = new ArrayList<Period>();
    /**
     * Despatch. Requested Despatch_ Period. Period
     * <p>
     * The period requested for the despatch (pickup) of goods.
     * 
     */
    @JsonProperty("RequestedDespatchPeriod")
    @JsonPropertyDescription("The period requested for the despatch (pickup) of goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> requestedDespatchPeriod = new ArrayList<Period>();

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

    public Despatch withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Despatch. Identifier
     * <p>
     * An identifier for this despatch event.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Despatch. Identifier
     * <p>
     * An identifier for this despatch event.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Despatch withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Despatch. Requested_ Despatch Date. Date
     * <p>
     * The despatch (pickup) date requested, normally by the buyer.
     * 
     */
    @JsonProperty("RequestedDespatchDate")
    public List<DateType> getRequestedDespatchDate() {
        return requestedDespatchDate;
    }

    /**
     * Despatch. Requested_ Despatch Date. Date
     * <p>
     * The despatch (pickup) date requested, normally by the buyer.
     * 
     */
    @JsonProperty("RequestedDespatchDate")
    public void setRequestedDespatchDate(List<DateType> requestedDespatchDate) {
        this.requestedDespatchDate = requestedDespatchDate;
    }

    public Despatch withRequestedDespatchDate(List<DateType> requestedDespatchDate) {
        this.requestedDespatchDate = requestedDespatchDate;
        return this;
    }

    /**
     * Despatch. Requested_ Despatch Time. Time
     * <p>
     * The despatch (pickup) time requested, normally by the buyer.
     * 
     */
    @JsonProperty("RequestedDespatchTime")
    public List<TimeType> getRequestedDespatchTime() {
        return requestedDespatchTime;
    }

    /**
     * Despatch. Requested_ Despatch Time. Time
     * <p>
     * The despatch (pickup) time requested, normally by the buyer.
     * 
     */
    @JsonProperty("RequestedDespatchTime")
    public void setRequestedDespatchTime(List<TimeType> requestedDespatchTime) {
        this.requestedDespatchTime = requestedDespatchTime;
    }

    public Despatch withRequestedDespatchTime(List<TimeType> requestedDespatchTime) {
        this.requestedDespatchTime = requestedDespatchTime;
        return this;
    }

    /**
     * Despatch. Estimated_ Despatch Date. Date
     * <p>
     * The estimated despatch (pickup) date.
     * 
     */
    @JsonProperty("EstimatedDespatchDate")
    public List<DateType> getEstimatedDespatchDate() {
        return estimatedDespatchDate;
    }

    /**
     * Despatch. Estimated_ Despatch Date. Date
     * <p>
     * The estimated despatch (pickup) date.
     * 
     */
    @JsonProperty("EstimatedDespatchDate")
    public void setEstimatedDespatchDate(List<DateType> estimatedDespatchDate) {
        this.estimatedDespatchDate = estimatedDespatchDate;
    }

    public Despatch withEstimatedDespatchDate(List<DateType> estimatedDespatchDate) {
        this.estimatedDespatchDate = estimatedDespatchDate;
        return this;
    }

    /**
     * Despatch. Estimated_ Despatch Time. Time
     * <p>
     * The estimated despatch (pickup) time.
     * 
     */
    @JsonProperty("EstimatedDespatchTime")
    public List<TimeType> getEstimatedDespatchTime() {
        return estimatedDespatchTime;
    }

    /**
     * Despatch. Estimated_ Despatch Time. Time
     * <p>
     * The estimated despatch (pickup) time.
     * 
     */
    @JsonProperty("EstimatedDespatchTime")
    public void setEstimatedDespatchTime(List<TimeType> estimatedDespatchTime) {
        this.estimatedDespatchTime = estimatedDespatchTime;
    }

    public Despatch withEstimatedDespatchTime(List<TimeType> estimatedDespatchTime) {
        this.estimatedDespatchTime = estimatedDespatchTime;
        return this;
    }

    /**
     * Despatch. Actual_ Despatch Date. Date
     * <p>
     * The actual despatch (pickup) date.
     * 
     */
    @JsonProperty("ActualDespatchDate")
    public List<DateType> getActualDespatchDate() {
        return actualDespatchDate;
    }

    /**
     * Despatch. Actual_ Despatch Date. Date
     * <p>
     * The actual despatch (pickup) date.
     * 
     */
    @JsonProperty("ActualDespatchDate")
    public void setActualDespatchDate(List<DateType> actualDespatchDate) {
        this.actualDespatchDate = actualDespatchDate;
    }

    public Despatch withActualDespatchDate(List<DateType> actualDespatchDate) {
        this.actualDespatchDate = actualDespatchDate;
        return this;
    }

    /**
     * Despatch. Actual_ Despatch Time. Time
     * <p>
     * The actual despatch (pickup) time.
     * 
     */
    @JsonProperty("ActualDespatchTime")
    public List<TimeType> getActualDespatchTime() {
        return actualDespatchTime;
    }

    /**
     * Despatch. Actual_ Despatch Time. Time
     * <p>
     * The actual despatch (pickup) time.
     * 
     */
    @JsonProperty("ActualDespatchTime")
    public void setActualDespatchTime(List<TimeType> actualDespatchTime) {
        this.actualDespatchTime = actualDespatchTime;
    }

    public Despatch withActualDespatchTime(List<TimeType> actualDespatchTime) {
        this.actualDespatchTime = actualDespatchTime;
        return this;
    }

    /**
     * Despatch. Guaranteed_ Despatch Date. Date
     * <p>
     * The date guaranteed for the despatch (pickup).
     * 
     */
    @JsonProperty("GuaranteedDespatchDate")
    public List<DateType> getGuaranteedDespatchDate() {
        return guaranteedDespatchDate;
    }

    /**
     * Despatch. Guaranteed_ Despatch Date. Date
     * <p>
     * The date guaranteed for the despatch (pickup).
     * 
     */
    @JsonProperty("GuaranteedDespatchDate")
    public void setGuaranteedDespatchDate(List<DateType> guaranteedDespatchDate) {
        this.guaranteedDespatchDate = guaranteedDespatchDate;
    }

    public Despatch withGuaranteedDespatchDate(List<DateType> guaranteedDespatchDate) {
        this.guaranteedDespatchDate = guaranteedDespatchDate;
        return this;
    }

    /**
     * Despatch. Guaranteed_ Despatch Time. Time
     * <p>
     * The time guaranteed for the despatch (pickup).
     * 
     */
    @JsonProperty("GuaranteedDespatchTime")
    public List<TimeType> getGuaranteedDespatchTime() {
        return guaranteedDespatchTime;
    }

    /**
     * Despatch. Guaranteed_ Despatch Time. Time
     * <p>
     * The time guaranteed for the despatch (pickup).
     * 
     */
    @JsonProperty("GuaranteedDespatchTime")
    public void setGuaranteedDespatchTime(List<TimeType> guaranteedDespatchTime) {
        this.guaranteedDespatchTime = guaranteedDespatchTime;
    }

    public Despatch withGuaranteedDespatchTime(List<TimeType> guaranteedDespatchTime) {
        this.guaranteedDespatchTime = guaranteedDespatchTime;
        return this;
    }

    /**
     * Despatch. Release. Identifier
     * <p>
     * An identifier for the release of the despatch used as security control or cargo control (pick-up).
     * 
     */
    @JsonProperty("ReleaseID")
    public List<IdentifierType> getReleaseID() {
        return releaseID;
    }

    /**
     * Despatch. Release. Identifier
     * <p>
     * An identifier for the release of the despatch used as security control or cargo control (pick-up).
     * 
     */
    @JsonProperty("ReleaseID")
    public void setReleaseID(List<IdentifierType> releaseID) {
        this.releaseID = releaseID;
    }

    public Despatch withReleaseID(List<IdentifierType> releaseID) {
        this.releaseID = releaseID;
        return this;
    }

    /**
     * Despatch. Instructions. Text
     * <p>
     * Text describing any special instructions applying to the despatch (pickup).
     * 
     */
    @JsonProperty("Instructions")
    public List<TextType> getInstructions() {
        return instructions;
    }

    /**
     * Despatch. Instructions. Text
     * <p>
     * Text describing any special instructions applying to the despatch (pickup).
     * 
     */
    @JsonProperty("Instructions")
    public void setInstructions(List<TextType> instructions) {
        this.instructions = instructions;
    }

    public Despatch withInstructions(List<TextType> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Despatch. Despatch_ Address. Address
     * <p>
     * The address of the despatch (pickup).
     * 
     */
    @JsonProperty("DespatchAddress")
    public List<Address> getDespatchAddress() {
        return despatchAddress;
    }

    /**
     * Despatch. Despatch_ Address. Address
     * <p>
     * The address of the despatch (pickup).
     * 
     */
    @JsonProperty("DespatchAddress")
    public void setDespatchAddress(List<Address> despatchAddress) {
        this.despatchAddress = despatchAddress;
    }

    public Despatch withDespatchAddress(List<Address> despatchAddress) {
        this.despatchAddress = despatchAddress;
        return this;
    }

    /**
     * Despatch. Despatch_ Location. Location
     * <p>
     * The location of the despatch (pickup).
     * 
     */
    @JsonProperty("DespatchLocation")
    public List<Location> getDespatchLocation() {
        return despatchLocation;
    }

    /**
     * Despatch. Despatch_ Location. Location
     * <p>
     * The location of the despatch (pickup).
     * 
     */
    @JsonProperty("DespatchLocation")
    public void setDespatchLocation(List<Location> despatchLocation) {
        this.despatchLocation = despatchLocation;
    }

    public Despatch withDespatchLocation(List<Location> despatchLocation) {
        this.despatchLocation = despatchLocation;
        return this;
    }

    /**
     * Despatch. Despatch_ Party. Party
     * <p>
     * The party despatching the goods.
     * 
     */
    @JsonProperty("DespatchParty")
    public List<Party> getDespatchParty() {
        return despatchParty;
    }

    /**
     * Despatch. Despatch_ Party. Party
     * <p>
     * The party despatching the goods.
     * 
     */
    @JsonProperty("DespatchParty")
    public void setDespatchParty(List<Party> despatchParty) {
        this.despatchParty = despatchParty;
    }

    public Despatch withDespatchParty(List<Party> despatchParty) {
        this.despatchParty = despatchParty;
        return this;
    }

    /**
     * Despatch. Carrier_ Party. Party
     * <p>
     * The party carrying the goods.
     * 
     */
    @JsonProperty("CarrierParty")
    public List<Party> getCarrierParty() {
        return carrierParty;
    }

    /**
     * Despatch. Carrier_ Party. Party
     * <p>
     * The party carrying the goods.
     * 
     */
    @JsonProperty("CarrierParty")
    public void setCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
    }

    public Despatch withCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
        return this;
    }

    /**
     * Despatch. Notify_ Party. Party
     * <p>
     * A party to be notified of this despatch (pickup).
     * 
     */
    @JsonProperty("NotifyParty")
    public List<Party> getNotifyParty() {
        return notifyParty;
    }

    /**
     * Despatch. Notify_ Party. Party
     * <p>
     * A party to be notified of this despatch (pickup).
     * 
     */
    @JsonProperty("NotifyParty")
    public void setNotifyParty(List<Party> notifyParty) {
        this.notifyParty = notifyParty;
    }

    public Despatch withNotifyParty(List<Party> notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }

    /**
     * Despatch. Contact
     * <p>
     * The primary contact for this despatch (pickup).
     * 
     */
    @JsonProperty("Contact")
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * Despatch. Contact
     * <p>
     * The primary contact for this despatch (pickup).
     * 
     */
    @JsonProperty("Contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Despatch withContact(List<Contact> contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Despatch. Estimated Despatch_ Period. Period
     * <p>
     * The period estimated for the despatch (pickup) of goods.
     * 
     */
    @JsonProperty("EstimatedDespatchPeriod")
    public List<Period> getEstimatedDespatchPeriod() {
        return estimatedDespatchPeriod;
    }

    /**
     * Despatch. Estimated Despatch_ Period. Period
     * <p>
     * The period estimated for the despatch (pickup) of goods.
     * 
     */
    @JsonProperty("EstimatedDespatchPeriod")
    public void setEstimatedDespatchPeriod(List<Period> estimatedDespatchPeriod) {
        this.estimatedDespatchPeriod = estimatedDespatchPeriod;
    }

    public Despatch withEstimatedDespatchPeriod(List<Period> estimatedDespatchPeriod) {
        this.estimatedDespatchPeriod = estimatedDespatchPeriod;
        return this;
    }

    /**
     * Despatch. Requested Despatch_ Period. Period
     * <p>
     * The period requested for the despatch (pickup) of goods.
     * 
     */
    @JsonProperty("RequestedDespatchPeriod")
    public List<Period> getRequestedDespatchPeriod() {
        return requestedDespatchPeriod;
    }

    /**
     * Despatch. Requested Despatch_ Period. Period
     * <p>
     * The period requested for the despatch (pickup) of goods.
     * 
     */
    @JsonProperty("RequestedDespatchPeriod")
    public void setRequestedDespatchPeriod(List<Period> requestedDespatchPeriod) {
        this.requestedDespatchPeriod = requestedDespatchPeriod;
    }

    public Despatch withRequestedDespatchPeriod(List<Period> requestedDespatchPeriod) {
        this.requestedDespatchPeriod = requestedDespatchPeriod;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Despatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("requestedDespatchDate");
        sb.append('=');
        sb.append(((this.requestedDespatchDate == null)?"<null>":this.requestedDespatchDate));
        sb.append(',');
        sb.append("requestedDespatchTime");
        sb.append('=');
        sb.append(((this.requestedDespatchTime == null)?"<null>":this.requestedDespatchTime));
        sb.append(',');
        sb.append("estimatedDespatchDate");
        sb.append('=');
        sb.append(((this.estimatedDespatchDate == null)?"<null>":this.estimatedDespatchDate));
        sb.append(',');
        sb.append("estimatedDespatchTime");
        sb.append('=');
        sb.append(((this.estimatedDespatchTime == null)?"<null>":this.estimatedDespatchTime));
        sb.append(',');
        sb.append("actualDespatchDate");
        sb.append('=');
        sb.append(((this.actualDespatchDate == null)?"<null>":this.actualDespatchDate));
        sb.append(',');
        sb.append("actualDespatchTime");
        sb.append('=');
        sb.append(((this.actualDespatchTime == null)?"<null>":this.actualDespatchTime));
        sb.append(',');
        sb.append("guaranteedDespatchDate");
        sb.append('=');
        sb.append(((this.guaranteedDespatchDate == null)?"<null>":this.guaranteedDespatchDate));
        sb.append(',');
        sb.append("guaranteedDespatchTime");
        sb.append('=');
        sb.append(((this.guaranteedDespatchTime == null)?"<null>":this.guaranteedDespatchTime));
        sb.append(',');
        sb.append("releaseID");
        sb.append('=');
        sb.append(((this.releaseID == null)?"<null>":this.releaseID));
        sb.append(',');
        sb.append("instructions");
        sb.append('=');
        sb.append(((this.instructions == null)?"<null>":this.instructions));
        sb.append(',');
        sb.append("despatchAddress");
        sb.append('=');
        sb.append(((this.despatchAddress == null)?"<null>":this.despatchAddress));
        sb.append(',');
        sb.append("despatchLocation");
        sb.append('=');
        sb.append(((this.despatchLocation == null)?"<null>":this.despatchLocation));
        sb.append(',');
        sb.append("despatchParty");
        sb.append('=');
        sb.append(((this.despatchParty == null)?"<null>":this.despatchParty));
        sb.append(',');
        sb.append("carrierParty");
        sb.append('=');
        sb.append(((this.carrierParty == null)?"<null>":this.carrierParty));
        sb.append(',');
        sb.append("notifyParty");
        sb.append('=');
        sb.append(((this.notifyParty == null)?"<null>":this.notifyParty));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("estimatedDespatchPeriod");
        sb.append('=');
        sb.append(((this.estimatedDespatchPeriod == null)?"<null>":this.estimatedDespatchPeriod));
        sb.append(',');
        sb.append("requestedDespatchPeriod");
        sb.append('=');
        sb.append(((this.requestedDespatchPeriod == null)?"<null>":this.requestedDespatchPeriod));
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
        result = ((result* 31)+((this.instructions == null)? 0 :this.instructions.hashCode()));
        result = ((result* 31)+((this.estimatedDespatchPeriod == null)? 0 :this.estimatedDespatchPeriod.hashCode()));
        result = ((result* 31)+((this.despatchAddress == null)? 0 :this.despatchAddress.hashCode()));
        result = ((result* 31)+((this.requestedDespatchPeriod == null)? 0 :this.requestedDespatchPeriod.hashCode()));
        result = ((result* 31)+((this.despatchLocation == null)? 0 :this.despatchLocation.hashCode()));
        result = ((result* 31)+((this.estimatedDespatchTime == null)? 0 :this.estimatedDespatchTime.hashCode()));
        result = ((result* 31)+((this.actualDespatchTime == null)? 0 :this.actualDespatchTime.hashCode()));
        result = ((result* 31)+((this.guaranteedDespatchDate == null)? 0 :this.guaranteedDespatchDate.hashCode()));
        result = ((result* 31)+((this.guaranteedDespatchTime == null)? 0 :this.guaranteedDespatchTime.hashCode()));
        result = ((result* 31)+((this.estimatedDespatchDate == null)? 0 :this.estimatedDespatchDate.hashCode()));
        result = ((result* 31)+((this.requestedDespatchDate == null)? 0 :this.requestedDespatchDate.hashCode()));
        result = ((result* 31)+((this.releaseID == null)? 0 :this.releaseID.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.carrierParty == null)? 0 :this.carrierParty.hashCode()));
        result = ((result* 31)+((this.notifyParty == null)? 0 :this.notifyParty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.requestedDespatchTime == null)? 0 :this.requestedDespatchTime.hashCode()));
        result = ((result* 31)+((this.actualDespatchDate == null)? 0 :this.actualDespatchDate.hashCode()));
        result = ((result* 31)+((this.despatchParty == null)? 0 :this.despatchParty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Despatch) == false) {
            return false;
        }
        Despatch rhs = ((Despatch) other);
        return (((((((((((((((((((((this.instructions == rhs.instructions)||((this.instructions!= null)&&this.instructions.equals(rhs.instructions)))&&((this.estimatedDespatchPeriod == rhs.estimatedDespatchPeriod)||((this.estimatedDespatchPeriod!= null)&&this.estimatedDespatchPeriod.equals(rhs.estimatedDespatchPeriod))))&&((this.despatchAddress == rhs.despatchAddress)||((this.despatchAddress!= null)&&this.despatchAddress.equals(rhs.despatchAddress))))&&((this.requestedDespatchPeriod == rhs.requestedDespatchPeriod)||((this.requestedDespatchPeriod!= null)&&this.requestedDespatchPeriod.equals(rhs.requestedDespatchPeriod))))&&((this.despatchLocation == rhs.despatchLocation)||((this.despatchLocation!= null)&&this.despatchLocation.equals(rhs.despatchLocation))))&&((this.estimatedDespatchTime == rhs.estimatedDespatchTime)||((this.estimatedDespatchTime!= null)&&this.estimatedDespatchTime.equals(rhs.estimatedDespatchTime))))&&((this.actualDespatchTime == rhs.actualDespatchTime)||((this.actualDespatchTime!= null)&&this.actualDespatchTime.equals(rhs.actualDespatchTime))))&&((this.guaranteedDespatchDate == rhs.guaranteedDespatchDate)||((this.guaranteedDespatchDate!= null)&&this.guaranteedDespatchDate.equals(rhs.guaranteedDespatchDate))))&&((this.guaranteedDespatchTime == rhs.guaranteedDespatchTime)||((this.guaranteedDespatchTime!= null)&&this.guaranteedDespatchTime.equals(rhs.guaranteedDespatchTime))))&&((this.estimatedDespatchDate == rhs.estimatedDespatchDate)||((this.estimatedDespatchDate!= null)&&this.estimatedDespatchDate.equals(rhs.estimatedDespatchDate))))&&((this.requestedDespatchDate == rhs.requestedDespatchDate)||((this.requestedDespatchDate!= null)&&this.requestedDespatchDate.equals(rhs.requestedDespatchDate))))&&((this.releaseID == rhs.releaseID)||((this.releaseID!= null)&&this.releaseID.equals(rhs.releaseID))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.carrierParty == rhs.carrierParty)||((this.carrierParty!= null)&&this.carrierParty.equals(rhs.carrierParty))))&&((this.notifyParty == rhs.notifyParty)||((this.notifyParty!= null)&&this.notifyParty.equals(rhs.notifyParty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.requestedDespatchTime == rhs.requestedDespatchTime)||((this.requestedDespatchTime!= null)&&this.requestedDespatchTime.equals(rhs.requestedDespatchTime))))&&((this.actualDespatchDate == rhs.actualDespatchDate)||((this.actualDespatchDate!= null)&&this.actualDespatchDate.equals(rhs.actualDespatchDate))))&&((this.despatchParty == rhs.despatchParty)||((this.despatchParty!= null)&&this.despatchParty.equals(rhs.despatchParty))));
    }

}
