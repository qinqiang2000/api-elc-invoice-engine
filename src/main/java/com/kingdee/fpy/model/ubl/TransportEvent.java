
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
 * Transport Event. Details
 * <p>
 * A class to describe a significant occurrence or happening related to the transportation of goods.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "IdentificationID",
    "OccurrenceDate",
    "OccurrenceTime",
    "TransportEventTypeCode",
    "Description",
    "CompletionIndicator",
    "ReportedShipment",
    "CurrentStatus",
    "Contact",
    "Location",
    "Signature",
    "Period"
})
@Generated("jsonschema2pojo")
public class TransportEvent {

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
     * Transport Event. Identification. Identifier
     * <p>
     * An identifier for this transport event within an agreed event identification scheme.
     * 
     */
    @JsonProperty("IdentificationID")
    @JsonPropertyDescription("An identifier for this transport event within an agreed event identification scheme.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> identificationID = new ArrayList<IdentifierType>();
    /**
     * Transport Event. Occurrence Date. Date
     * <p>
     * The date of this transport event.
     * 
     */
    @JsonProperty("OccurrenceDate")
    @JsonPropertyDescription("The date of this transport event.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> occurrenceDate = new ArrayList<DateType>();
    /**
     * Transport Event. Occurrence Time. Time
     * <p>
     * The time of this transport event.
     * 
     */
    @JsonProperty("OccurrenceTime")
    @JsonPropertyDescription("The time of this transport event.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> occurrenceTime = new ArrayList<TimeType>();
    /**
     * Transport Event. Transport Event Type Code. Code
     * <p>
     * A code signifying the type of this transport event.
     * 
     */
    @JsonProperty("TransportEventTypeCode")
    @JsonPropertyDescription("A code signifying the type of this transport event.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportEventTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Event. Description. Text
     * <p>
     * Text describing this transport event.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this transport event.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Transport Event. Completion_ Indicator. Indicator
     * <p>
     * An indicator that this transport event has been completed (true) or not (false).
     * 
     */
    @JsonProperty("CompletionIndicator")
    @JsonPropertyDescription("An indicator that this transport event has been completed (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> completionIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Event. Reported_ Shipment. Shipment
     * <p>
     * The shipment involved in this transport event.
     * 
     */
    @JsonProperty("ReportedShipment")
    @JsonPropertyDescription("The shipment involved in this transport event.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Shipment> reportedShipment = new ArrayList<Shipment>();
    /**
     * Transport Event. Current_ Status. Status
     * <p>
     * The current status of this transport event.
     * 
     */
    @JsonProperty("CurrentStatus")
    @JsonPropertyDescription("The current status of this transport event.")
    @Size(min = 1)
    @Valid
    private List<Status> currentStatus = new ArrayList<Status>();
    /**
     * Transport Event. Contact
     * <p>
     * A contact associated with this transport event.
     * 
     */
    @JsonProperty("Contact")
    @JsonPropertyDescription("A contact associated with this transport event.")
    @Size(min = 1)
    @Valid
    private List<Contact> contact = new ArrayList<Contact>();
    /**
     * Transport Event. Location
     * <p>
     * The location associated with this transport event.
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("The location associated with this transport event.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> location = new ArrayList<Location>();
    /**
     * Transport Event. Signature
     * <p>
     * A signature that can be used to sign for an entry or an exit at a transport location (e.g., port terminal).
     * 
     */
    @JsonProperty("Signature")
    @JsonPropertyDescription("A signature that can be used to sign for an entry or an exit at a transport location (e.g., port terminal).")
    @Size(min = 1, max = 1)
    @Valid
    private List<Signature> signature = new ArrayList<Signature>();
    /**
     * Transport Event. Period
     * <p>
     * A period of time associated with this transport event.
     * 
     */
    @JsonProperty("Period")
    @JsonPropertyDescription("A period of time associated with this transport event.")
    @Size(min = 1)
    @Valid
    private List<Period> period = new ArrayList<Period>();

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

    public TransportEvent withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transport Event. Identification. Identifier
     * <p>
     * An identifier for this transport event within an agreed event identification scheme.
     * 
     */
    @JsonProperty("IdentificationID")
    public List<IdentifierType> getIdentificationID() {
        return identificationID;
    }

    /**
     * Transport Event. Identification. Identifier
     * <p>
     * An identifier for this transport event within an agreed event identification scheme.
     * 
     */
    @JsonProperty("IdentificationID")
    public void setIdentificationID(List<IdentifierType> identificationID) {
        this.identificationID = identificationID;
    }

    public TransportEvent withIdentificationID(List<IdentifierType> identificationID) {
        this.identificationID = identificationID;
        return this;
    }

    /**
     * Transport Event. Occurrence Date. Date
     * <p>
     * The date of this transport event.
     * 
     */
    @JsonProperty("OccurrenceDate")
    public List<DateType> getOccurrenceDate() {
        return occurrenceDate;
    }

    /**
     * Transport Event. Occurrence Date. Date
     * <p>
     * The date of this transport event.
     * 
     */
    @JsonProperty("OccurrenceDate")
    public void setOccurrenceDate(List<DateType> occurrenceDate) {
        this.occurrenceDate = occurrenceDate;
    }

    public TransportEvent withOccurrenceDate(List<DateType> occurrenceDate) {
        this.occurrenceDate = occurrenceDate;
        return this;
    }

    /**
     * Transport Event. Occurrence Time. Time
     * <p>
     * The time of this transport event.
     * 
     */
    @JsonProperty("OccurrenceTime")
    public List<TimeType> getOccurrenceTime() {
        return occurrenceTime;
    }

    /**
     * Transport Event. Occurrence Time. Time
     * <p>
     * The time of this transport event.
     * 
     */
    @JsonProperty("OccurrenceTime")
    public void setOccurrenceTime(List<TimeType> occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }

    public TransportEvent withOccurrenceTime(List<TimeType> occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }

    /**
     * Transport Event. Transport Event Type Code. Code
     * <p>
     * A code signifying the type of this transport event.
     * 
     */
    @JsonProperty("TransportEventTypeCode")
    public List<CodeType> getTransportEventTypeCode() {
        return transportEventTypeCode;
    }

    /**
     * Transport Event. Transport Event Type Code. Code
     * <p>
     * A code signifying the type of this transport event.
     * 
     */
    @JsonProperty("TransportEventTypeCode")
    public void setTransportEventTypeCode(List<CodeType> transportEventTypeCode) {
        this.transportEventTypeCode = transportEventTypeCode;
    }

    public TransportEvent withTransportEventTypeCode(List<CodeType> transportEventTypeCode) {
        this.transportEventTypeCode = transportEventTypeCode;
        return this;
    }

    /**
     * Transport Event. Description. Text
     * <p>
     * Text describing this transport event.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Transport Event. Description. Text
     * <p>
     * Text describing this transport event.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public TransportEvent withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Transport Event. Completion_ Indicator. Indicator
     * <p>
     * An indicator that this transport event has been completed (true) or not (false).
     * 
     */
    @JsonProperty("CompletionIndicator")
    public List<IndicatorType> getCompletionIndicator() {
        return completionIndicator;
    }

    /**
     * Transport Event. Completion_ Indicator. Indicator
     * <p>
     * An indicator that this transport event has been completed (true) or not (false).
     * 
     */
    @JsonProperty("CompletionIndicator")
    public void setCompletionIndicator(List<IndicatorType> completionIndicator) {
        this.completionIndicator = completionIndicator;
    }

    public TransportEvent withCompletionIndicator(List<IndicatorType> completionIndicator) {
        this.completionIndicator = completionIndicator;
        return this;
    }

    /**
     * Transport Event. Reported_ Shipment. Shipment
     * <p>
     * The shipment involved in this transport event.
     * 
     */
    @JsonProperty("ReportedShipment")
    public List<Shipment> getReportedShipment() {
        return reportedShipment;
    }

    /**
     * Transport Event. Reported_ Shipment. Shipment
     * <p>
     * The shipment involved in this transport event.
     * 
     */
    @JsonProperty("ReportedShipment")
    public void setReportedShipment(List<Shipment> reportedShipment) {
        this.reportedShipment = reportedShipment;
    }

    public TransportEvent withReportedShipment(List<Shipment> reportedShipment) {
        this.reportedShipment = reportedShipment;
        return this;
    }

    /**
     * Transport Event. Current_ Status. Status
     * <p>
     * The current status of this transport event.
     * 
     */
    @JsonProperty("CurrentStatus")
    public List<Status> getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Transport Event. Current_ Status. Status
     * <p>
     * The current status of this transport event.
     * 
     */
    @JsonProperty("CurrentStatus")
    public void setCurrentStatus(List<Status> currentStatus) {
        this.currentStatus = currentStatus;
    }

    public TransportEvent withCurrentStatus(List<Status> currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    /**
     * Transport Event. Contact
     * <p>
     * A contact associated with this transport event.
     * 
     */
    @JsonProperty("Contact")
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * Transport Event. Contact
     * <p>
     * A contact associated with this transport event.
     * 
     */
    @JsonProperty("Contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public TransportEvent withContact(List<Contact> contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Transport Event. Location
     * <p>
     * The location associated with this transport event.
     * 
     */
    @JsonProperty("Location")
    public List<Location> getLocation() {
        return location;
    }

    /**
     * Transport Event. Location
     * <p>
     * The location associated with this transport event.
     * 
     */
    @JsonProperty("Location")
    public void setLocation(List<Location> location) {
        this.location = location;
    }

    public TransportEvent withLocation(List<Location> location) {
        this.location = location;
        return this;
    }

    /**
     * Transport Event. Signature
     * <p>
     * A signature that can be used to sign for an entry or an exit at a transport location (e.g., port terminal).
     * 
     */
    @JsonProperty("Signature")
    public List<Signature> getSignature() {
        return signature;
    }

    /**
     * Transport Event. Signature
     * <p>
     * A signature that can be used to sign for an entry or an exit at a transport location (e.g., port terminal).
     * 
     */
    @JsonProperty("Signature")
    public void setSignature(List<Signature> signature) {
        this.signature = signature;
    }

    public TransportEvent withSignature(List<Signature> signature) {
        this.signature = signature;
        return this;
    }

    /**
     * Transport Event. Period
     * <p>
     * A period of time associated with this transport event.
     * 
     */
    @JsonProperty("Period")
    public List<Period> getPeriod() {
        return period;
    }

    /**
     * Transport Event. Period
     * <p>
     * A period of time associated with this transport event.
     * 
     */
    @JsonProperty("Period")
    public void setPeriod(List<Period> period) {
        this.period = period;
    }

    public TransportEvent withPeriod(List<Period> period) {
        this.period = period;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("identificationID");
        sb.append('=');
        sb.append(((this.identificationID == null)?"<null>":this.identificationID));
        sb.append(',');
        sb.append("occurrenceDate");
        sb.append('=');
        sb.append(((this.occurrenceDate == null)?"<null>":this.occurrenceDate));
        sb.append(',');
        sb.append("occurrenceTime");
        sb.append('=');
        sb.append(((this.occurrenceTime == null)?"<null>":this.occurrenceTime));
        sb.append(',');
        sb.append("transportEventTypeCode");
        sb.append('=');
        sb.append(((this.transportEventTypeCode == null)?"<null>":this.transportEventTypeCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("completionIndicator");
        sb.append('=');
        sb.append(((this.completionIndicator == null)?"<null>":this.completionIndicator));
        sb.append(',');
        sb.append("reportedShipment");
        sb.append('=');
        sb.append(((this.reportedShipment == null)?"<null>":this.reportedShipment));
        sb.append(',');
        sb.append("currentStatus");
        sb.append('=');
        sb.append(((this.currentStatus == null)?"<null>":this.currentStatus));
        sb.append(',');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("signature");
        sb.append('=');
        sb.append(((this.signature == null)?"<null>":this.signature));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
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
        result = ((result* 31)+((this.occurrenceDate == null)? 0 :this.occurrenceDate.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.completionIndicator == null)? 0 :this.completionIndicator.hashCode()));
        result = ((result* 31)+((this.currentStatus == null)? 0 :this.currentStatus.hashCode()));
        result = ((result* 31)+((this.signature == null)? 0 :this.signature.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.reportedShipment == null)? 0 :this.reportedShipment.hashCode()));
        result = ((result* 31)+((this.transportEventTypeCode == null)? 0 :this.transportEventTypeCode.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.occurrenceTime == null)? 0 :this.occurrenceTime.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.identificationID == null)? 0 :this.identificationID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportEvent) == false) {
            return false;
        }
        TransportEvent rhs = ((TransportEvent) other);
        return ((((((((((((((this.occurrenceDate == rhs.occurrenceDate)||((this.occurrenceDate!= null)&&this.occurrenceDate.equals(rhs.occurrenceDate)))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.completionIndicator == rhs.completionIndicator)||((this.completionIndicator!= null)&&this.completionIndicator.equals(rhs.completionIndicator))))&&((this.currentStatus == rhs.currentStatus)||((this.currentStatus!= null)&&this.currentStatus.equals(rhs.currentStatus))))&&((this.signature == rhs.signature)||((this.signature!= null)&&this.signature.equals(rhs.signature))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.reportedShipment == rhs.reportedShipment)||((this.reportedShipment!= null)&&this.reportedShipment.equals(rhs.reportedShipment))))&&((this.transportEventTypeCode == rhs.transportEventTypeCode)||((this.transportEventTypeCode!= null)&&this.transportEventTypeCode.equals(rhs.transportEventTypeCode))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.occurrenceTime == rhs.occurrenceTime)||((this.occurrenceTime!= null)&&this.occurrenceTime.equals(rhs.occurrenceTime))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.identificationID == rhs.identificationID)||((this.identificationID!= null)&&this.identificationID.equals(rhs.identificationID))));
    }

}
