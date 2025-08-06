
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
 * Delivery. Details
 * <p>
 * A class to describe a delivery.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Quantity",
    "MinimumQuantity",
    "MaximumQuantity",
    "ActualDeliveryDate",
    "ActualDeliveryTime",
    "LatestDeliveryDate",
    "LatestDeliveryTime",
    "ReleaseID",
    "TrackingID",
    "DeliveryAddress",
    "DeliveryLocation",
    "AlternativeDeliveryLocation",
    "RequestedDeliveryPeriod",
    "PromisedDeliveryPeriod",
    "EstimatedDeliveryPeriod",
    "CarrierParty",
    "DeliveryParty",
    "NotifyParty",
    "Despatch",
    "DeliveryTerms",
    "MinimumDeliveryUnit",
    "MaximumDeliveryUnit",
    "Shipment"
})
@Generated("jsonschema2pojo")
public class Delivery {

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
     * Delivery. Identifier
     * <p>
     * An identifier for this delivery.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Delivery. Quantity
     * <p>
     * The quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("The quantity of items, child consignments, shipments in this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> quantity = new ArrayList<QuantityType>();
    /**
     * Delivery. Minimum_ Quantity. Quantity
     * <p>
     * The minimum quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("MinimumQuantity")
    @JsonPropertyDescription("The minimum quantity of items, child consignments, shipments in this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> minimumQuantity = new ArrayList<QuantityType>();
    /**
     * Delivery. Maximum_ Quantity. Quantity
     * <p>
     * The maximum quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("MaximumQuantity")
    @JsonPropertyDescription("The maximum quantity of items, child consignments, shipments in this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> maximumQuantity = new ArrayList<QuantityType>();
    /**
     * Delivery. Actual_ Delivery Date. Date
     * <p>
     * The actual date of delivery.
     * 
     */
    @JsonProperty("ActualDeliveryDate")
    @JsonPropertyDescription("The actual date of delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> actualDeliveryDate = new ArrayList<DateType>();
    /**
     * Delivery. Actual_ Delivery Time. Time
     * <p>
     * The actual time of delivery.
     * 
     */
    @JsonProperty("ActualDeliveryTime")
    @JsonPropertyDescription("The actual time of delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> actualDeliveryTime = new ArrayList<TimeType>();
    /**
     * Delivery. Latest_ Delivery Date. Date
     * <p>
     * The latest date of delivery allowed by the buyer.
     * 
     */
    @JsonProperty("LatestDeliveryDate")
    @JsonPropertyDescription("The latest date of delivery allowed by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> latestDeliveryDate = new ArrayList<DateType>();
    /**
     * Delivery. Latest_ Delivery Time. Time
     * <p>
     * The latest time of delivery allowed by the buyer.
     * 
     */
    @JsonProperty("LatestDeliveryTime")
    @JsonPropertyDescription("The latest time of delivery allowed by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> latestDeliveryTime = new ArrayList<TimeType>();
    /**
     * Delivery. Release. Identifier
     * <p>
     * An identifier used for approval of access to delivery locations (e.g., port terminals).
     * 
     */
    @JsonProperty("ReleaseID")
    @JsonPropertyDescription("An identifier used for approval of access to delivery locations (e.g., port terminals).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> releaseID = new ArrayList<IdentifierType>();
    /**
     * Delivery. Tracking Identifier. Identifier
     * <p>
     * The delivery Tracking ID (for transport tracking).
     * 
     */
    @JsonProperty("TrackingID")
    @JsonPropertyDescription("The delivery Tracking ID (for transport tracking).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> trackingID = new ArrayList<IdentifierType>();
    /**
     * Delivery. Delivery_ Address. Address
     * <p>
     * The delivery address.
     * 
     */
    @JsonProperty("DeliveryAddress")
    @JsonPropertyDescription("The delivery address.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> deliveryAddress = new ArrayList<Address>();
    /**
     * Delivery. Delivery_ Location. Location
     * <p>
     * The delivery location.
     * 
     */
    @JsonProperty("DeliveryLocation")
    @JsonPropertyDescription("The delivery location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> deliveryLocation = new ArrayList<Location>();
    /**
     * Delivery. Alternative Delivery_ Location. Location
     * <p>
     * An alternative delivery location.
     * 
     */
    @JsonProperty("AlternativeDeliveryLocation")
    @JsonPropertyDescription("An alternative delivery location.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> alternativeDeliveryLocation = new ArrayList<Location>();
    /**
     * Delivery. Requested Delivery_ Period. Period
     * <p>
     * The period requested for delivery.
     * 
     */
    @JsonProperty("RequestedDeliveryPeriod")
    @JsonPropertyDescription("The period requested for delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> requestedDeliveryPeriod = new ArrayList<Period>();
    /**
     * Delivery. Promised Delivery_ Period. Period
     * <p>
     * The period promised for delivery.
     * 
     */
    @JsonProperty("PromisedDeliveryPeriod")
    @JsonPropertyDescription("The period promised for delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> promisedDeliveryPeriod = new ArrayList<Period>();
    /**
     * Delivery. Estimated Delivery_ Period. Period
     * <p>
     * The period estimated for delivery.
     * 
     */
    @JsonProperty("EstimatedDeliveryPeriod")
    @JsonPropertyDescription("The period estimated for delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> estimatedDeliveryPeriod = new ArrayList<Period>();
    /**
     * Delivery. Carrier_ Party. Party
     * <p>
     * The party responsible for delivering the goods.
     * 
     */
    @JsonProperty("CarrierParty")
    @JsonPropertyDescription("The party responsible for delivering the goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> carrierParty = new ArrayList<Party>();
    /**
     * Delivery. Delivery_ Party. Party
     * <p>
     * The party to whom the goods are delivered.
     * 
     */
    @JsonProperty("DeliveryParty")
    @JsonPropertyDescription("The party to whom the goods are delivered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> deliveryParty = new ArrayList<Party>();
    /**
     * Delivery. Notify_ Party. Party
     * <p>
     * A party to be notified of this delivery.
     * 
     */
    @JsonProperty("NotifyParty")
    @JsonPropertyDescription("A party to be notified of this delivery.")
    @Size(min = 1)
    @Valid
    private List<Party> notifyParty = new ArrayList<Party>();
    /**
     * Delivery. Despatch
     * <p>
     * The despatch (pickup) associated with this delivery.
     * 
     */
    @JsonProperty("Despatch")
    @JsonPropertyDescription("The despatch (pickup) associated with this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Despatch> despatch = new ArrayList<Despatch>();
    /**
     * Delivery. Delivery Terms
     * <p>
     * Terms and conditions relating to the delivery.
     * 
     */
    @JsonProperty("DeliveryTerms")
    @JsonPropertyDescription("Terms and conditions relating to the delivery.")
    @Size(min = 1)
    @Valid
    private List<DeliveryTerms> deliveryTerms = new ArrayList<DeliveryTerms>();
    /**
     * Delivery. Minimum_ Delivery Unit. Delivery Unit
     * <p>
     * The minimum delivery unit for this delivery.
     * 
     */
    @JsonProperty("MinimumDeliveryUnit")
    @JsonPropertyDescription("The minimum delivery unit for this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DeliveryUnit> minimumDeliveryUnit = new ArrayList<DeliveryUnit>();
    /**
     * Delivery. Maximum_ Delivery Unit. Delivery Unit
     * <p>
     * The maximum delivery unit for this delivery.
     * 
     */
    @JsonProperty("MaximumDeliveryUnit")
    @JsonPropertyDescription("The maximum delivery unit for this delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DeliveryUnit> maximumDeliveryUnit = new ArrayList<DeliveryUnit>();
    /**
     * Delivery. Shipment
     * <p>
     * The shipment being delivered.
     * 
     */
    @JsonProperty("Shipment")
    @JsonPropertyDescription("The shipment being delivered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Shipment> shipment = new ArrayList<Shipment>();

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

    public Delivery withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Delivery. Identifier
     * <p>
     * An identifier for this delivery.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Delivery. Identifier
     * <p>
     * An identifier for this delivery.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Delivery withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Delivery. Quantity
     * <p>
     * The quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("Quantity")
    public List<QuantityType> getQuantity() {
        return quantity;
    }

    /**
     * Delivery. Quantity
     * <p>
     * The quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
    }

    public Delivery withQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Delivery. Minimum_ Quantity. Quantity
     * <p>
     * The minimum quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("MinimumQuantity")
    public List<QuantityType> getMinimumQuantity() {
        return minimumQuantity;
    }

    /**
     * Delivery. Minimum_ Quantity. Quantity
     * <p>
     * The minimum quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("MinimumQuantity")
    public void setMinimumQuantity(List<QuantityType> minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public Delivery withMinimumQuantity(List<QuantityType> minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    /**
     * Delivery. Maximum_ Quantity. Quantity
     * <p>
     * The maximum quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("MaximumQuantity")
    public List<QuantityType> getMaximumQuantity() {
        return maximumQuantity;
    }

    /**
     * Delivery. Maximum_ Quantity. Quantity
     * <p>
     * The maximum quantity of items, child consignments, shipments in this delivery.
     * 
     */
    @JsonProperty("MaximumQuantity")
    public void setMaximumQuantity(List<QuantityType> maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public Delivery withMaximumQuantity(List<QuantityType> maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
        return this;
    }

    /**
     * Delivery. Actual_ Delivery Date. Date
     * <p>
     * The actual date of delivery.
     * 
     */
    @JsonProperty("ActualDeliveryDate")
    public List<DateType> getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * Delivery. Actual_ Delivery Date. Date
     * <p>
     * The actual date of delivery.
     * 
     */
    @JsonProperty("ActualDeliveryDate")
    public void setActualDeliveryDate(List<DateType> actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public Delivery withActualDeliveryDate(List<DateType> actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
        return this;
    }

    /**
     * Delivery. Actual_ Delivery Time. Time
     * <p>
     * The actual time of delivery.
     * 
     */
    @JsonProperty("ActualDeliveryTime")
    public List<TimeType> getActualDeliveryTime() {
        return actualDeliveryTime;
    }

    /**
     * Delivery. Actual_ Delivery Time. Time
     * <p>
     * The actual time of delivery.
     * 
     */
    @JsonProperty("ActualDeliveryTime")
    public void setActualDeliveryTime(List<TimeType> actualDeliveryTime) {
        this.actualDeliveryTime = actualDeliveryTime;
    }

    public Delivery withActualDeliveryTime(List<TimeType> actualDeliveryTime) {
        this.actualDeliveryTime = actualDeliveryTime;
        return this;
    }

    /**
     * Delivery. Latest_ Delivery Date. Date
     * <p>
     * The latest date of delivery allowed by the buyer.
     * 
     */
    @JsonProperty("LatestDeliveryDate")
    public List<DateType> getLatestDeliveryDate() {
        return latestDeliveryDate;
    }

    /**
     * Delivery. Latest_ Delivery Date. Date
     * <p>
     * The latest date of delivery allowed by the buyer.
     * 
     */
    @JsonProperty("LatestDeliveryDate")
    public void setLatestDeliveryDate(List<DateType> latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
    }

    public Delivery withLatestDeliveryDate(List<DateType> latestDeliveryDate) {
        this.latestDeliveryDate = latestDeliveryDate;
        return this;
    }

    /**
     * Delivery. Latest_ Delivery Time. Time
     * <p>
     * The latest time of delivery allowed by the buyer.
     * 
     */
    @JsonProperty("LatestDeliveryTime")
    public List<TimeType> getLatestDeliveryTime() {
        return latestDeliveryTime;
    }

    /**
     * Delivery. Latest_ Delivery Time. Time
     * <p>
     * The latest time of delivery allowed by the buyer.
     * 
     */
    @JsonProperty("LatestDeliveryTime")
    public void setLatestDeliveryTime(List<TimeType> latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
    }

    public Delivery withLatestDeliveryTime(List<TimeType> latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
        return this;
    }

    /**
     * Delivery. Release. Identifier
     * <p>
     * An identifier used for approval of access to delivery locations (e.g., port terminals).
     * 
     */
    @JsonProperty("ReleaseID")
    public List<IdentifierType> getReleaseID() {
        return releaseID;
    }

    /**
     * Delivery. Release. Identifier
     * <p>
     * An identifier used for approval of access to delivery locations (e.g., port terminals).
     * 
     */
    @JsonProperty("ReleaseID")
    public void setReleaseID(List<IdentifierType> releaseID) {
        this.releaseID = releaseID;
    }

    public Delivery withReleaseID(List<IdentifierType> releaseID) {
        this.releaseID = releaseID;
        return this;
    }

    /**
     * Delivery. Tracking Identifier. Identifier
     * <p>
     * The delivery Tracking ID (for transport tracking).
     * 
     */
    @JsonProperty("TrackingID")
    public List<IdentifierType> getTrackingID() {
        return trackingID;
    }

    /**
     * Delivery. Tracking Identifier. Identifier
     * <p>
     * The delivery Tracking ID (for transport tracking).
     * 
     */
    @JsonProperty("TrackingID")
    public void setTrackingID(List<IdentifierType> trackingID) {
        this.trackingID = trackingID;
    }

    public Delivery withTrackingID(List<IdentifierType> trackingID) {
        this.trackingID = trackingID;
        return this;
    }

    /**
     * Delivery. Delivery_ Address. Address
     * <p>
     * The delivery address.
     * 
     */
    @JsonProperty("DeliveryAddress")
    public List<Address> getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Delivery. Delivery_ Address. Address
     * <p>
     * The delivery address.
     * 
     */
    @JsonProperty("DeliveryAddress")
    public void setDeliveryAddress(List<Address> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Delivery withDeliveryAddress(List<Address> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }

    /**
     * Delivery. Delivery_ Location. Location
     * <p>
     * The delivery location.
     * 
     */
    @JsonProperty("DeliveryLocation")
    public List<Location> getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Delivery. Delivery_ Location. Location
     * <p>
     * The delivery location.
     * 
     */
    @JsonProperty("DeliveryLocation")
    public void setDeliveryLocation(List<Location> deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public Delivery withDeliveryLocation(List<Location> deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
        return this;
    }

    /**
     * Delivery. Alternative Delivery_ Location. Location
     * <p>
     * An alternative delivery location.
     * 
     */
    @JsonProperty("AlternativeDeliveryLocation")
    public List<Location> getAlternativeDeliveryLocation() {
        return alternativeDeliveryLocation;
    }

    /**
     * Delivery. Alternative Delivery_ Location. Location
     * <p>
     * An alternative delivery location.
     * 
     */
    @JsonProperty("AlternativeDeliveryLocation")
    public void setAlternativeDeliveryLocation(List<Location> alternativeDeliveryLocation) {
        this.alternativeDeliveryLocation = alternativeDeliveryLocation;
    }

    public Delivery withAlternativeDeliveryLocation(List<Location> alternativeDeliveryLocation) {
        this.alternativeDeliveryLocation = alternativeDeliveryLocation;
        return this;
    }

    /**
     * Delivery. Requested Delivery_ Period. Period
     * <p>
     * The period requested for delivery.
     * 
     */
    @JsonProperty("RequestedDeliveryPeriod")
    public List<Period> getRequestedDeliveryPeriod() {
        return requestedDeliveryPeriod;
    }

    /**
     * Delivery. Requested Delivery_ Period. Period
     * <p>
     * The period requested for delivery.
     * 
     */
    @JsonProperty("RequestedDeliveryPeriod")
    public void setRequestedDeliveryPeriod(List<Period> requestedDeliveryPeriod) {
        this.requestedDeliveryPeriod = requestedDeliveryPeriod;
    }

    public Delivery withRequestedDeliveryPeriod(List<Period> requestedDeliveryPeriod) {
        this.requestedDeliveryPeriod = requestedDeliveryPeriod;
        return this;
    }

    /**
     * Delivery. Promised Delivery_ Period. Period
     * <p>
     * The period promised for delivery.
     * 
     */
    @JsonProperty("PromisedDeliveryPeriod")
    public List<Period> getPromisedDeliveryPeriod() {
        return promisedDeliveryPeriod;
    }

    /**
     * Delivery. Promised Delivery_ Period. Period
     * <p>
     * The period promised for delivery.
     * 
     */
    @JsonProperty("PromisedDeliveryPeriod")
    public void setPromisedDeliveryPeriod(List<Period> promisedDeliveryPeriod) {
        this.promisedDeliveryPeriod = promisedDeliveryPeriod;
    }

    public Delivery withPromisedDeliveryPeriod(List<Period> promisedDeliveryPeriod) {
        this.promisedDeliveryPeriod = promisedDeliveryPeriod;
        return this;
    }

    /**
     * Delivery. Estimated Delivery_ Period. Period
     * <p>
     * The period estimated for delivery.
     * 
     */
    @JsonProperty("EstimatedDeliveryPeriod")
    public List<Period> getEstimatedDeliveryPeriod() {
        return estimatedDeliveryPeriod;
    }

    /**
     * Delivery. Estimated Delivery_ Period. Period
     * <p>
     * The period estimated for delivery.
     * 
     */
    @JsonProperty("EstimatedDeliveryPeriod")
    public void setEstimatedDeliveryPeriod(List<Period> estimatedDeliveryPeriod) {
        this.estimatedDeliveryPeriod = estimatedDeliveryPeriod;
    }

    public Delivery withEstimatedDeliveryPeriod(List<Period> estimatedDeliveryPeriod) {
        this.estimatedDeliveryPeriod = estimatedDeliveryPeriod;
        return this;
    }

    /**
     * Delivery. Carrier_ Party. Party
     * <p>
     * The party responsible for delivering the goods.
     * 
     */
    @JsonProperty("CarrierParty")
    public List<Party> getCarrierParty() {
        return carrierParty;
    }

    /**
     * Delivery. Carrier_ Party. Party
     * <p>
     * The party responsible for delivering the goods.
     * 
     */
    @JsonProperty("CarrierParty")
    public void setCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
    }

    public Delivery withCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
        return this;
    }

    /**
     * Delivery. Delivery_ Party. Party
     * <p>
     * The party to whom the goods are delivered.
     * 
     */
    @JsonProperty("DeliveryParty")
    public List<Party> getDeliveryParty() {
        return deliveryParty;
    }

    /**
     * Delivery. Delivery_ Party. Party
     * <p>
     * The party to whom the goods are delivered.
     * 
     */
    @JsonProperty("DeliveryParty")
    public void setDeliveryParty(List<Party> deliveryParty) {
        this.deliveryParty = deliveryParty;
    }

    public Delivery withDeliveryParty(List<Party> deliveryParty) {
        this.deliveryParty = deliveryParty;
        return this;
    }

    /**
     * Delivery. Notify_ Party. Party
     * <p>
     * A party to be notified of this delivery.
     * 
     */
    @JsonProperty("NotifyParty")
    public List<Party> getNotifyParty() {
        return notifyParty;
    }

    /**
     * Delivery. Notify_ Party. Party
     * <p>
     * A party to be notified of this delivery.
     * 
     */
    @JsonProperty("NotifyParty")
    public void setNotifyParty(List<Party> notifyParty) {
        this.notifyParty = notifyParty;
    }

    public Delivery withNotifyParty(List<Party> notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }

    /**
     * Delivery. Despatch
     * <p>
     * The despatch (pickup) associated with this delivery.
     * 
     */
    @JsonProperty("Despatch")
    public List<Despatch> getDespatch() {
        return despatch;
    }

    /**
     * Delivery. Despatch
     * <p>
     * The despatch (pickup) associated with this delivery.
     * 
     */
    @JsonProperty("Despatch")
    public void setDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
    }

    public Delivery withDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
        return this;
    }

    /**
     * Delivery. Delivery Terms
     * <p>
     * Terms and conditions relating to the delivery.
     * 
     */
    @JsonProperty("DeliveryTerms")
    public List<DeliveryTerms> getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Delivery. Delivery Terms
     * <p>
     * Terms and conditions relating to the delivery.
     * 
     */
    @JsonProperty("DeliveryTerms")
    public void setDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public Delivery withDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }

    /**
     * Delivery. Minimum_ Delivery Unit. Delivery Unit
     * <p>
     * The minimum delivery unit for this delivery.
     * 
     */
    @JsonProperty("MinimumDeliveryUnit")
    public List<DeliveryUnit> getMinimumDeliveryUnit() {
        return minimumDeliveryUnit;
    }

    /**
     * Delivery. Minimum_ Delivery Unit. Delivery Unit
     * <p>
     * The minimum delivery unit for this delivery.
     * 
     */
    @JsonProperty("MinimumDeliveryUnit")
    public void setMinimumDeliveryUnit(List<DeliveryUnit> minimumDeliveryUnit) {
        this.minimumDeliveryUnit = minimumDeliveryUnit;
    }

    public Delivery withMinimumDeliveryUnit(List<DeliveryUnit> minimumDeliveryUnit) {
        this.minimumDeliveryUnit = minimumDeliveryUnit;
        return this;
    }

    /**
     * Delivery. Maximum_ Delivery Unit. Delivery Unit
     * <p>
     * The maximum delivery unit for this delivery.
     * 
     */
    @JsonProperty("MaximumDeliveryUnit")
    public List<DeliveryUnit> getMaximumDeliveryUnit() {
        return maximumDeliveryUnit;
    }

    /**
     * Delivery. Maximum_ Delivery Unit. Delivery Unit
     * <p>
     * The maximum delivery unit for this delivery.
     * 
     */
    @JsonProperty("MaximumDeliveryUnit")
    public void setMaximumDeliveryUnit(List<DeliveryUnit> maximumDeliveryUnit) {
        this.maximumDeliveryUnit = maximumDeliveryUnit;
    }

    public Delivery withMaximumDeliveryUnit(List<DeliveryUnit> maximumDeliveryUnit) {
        this.maximumDeliveryUnit = maximumDeliveryUnit;
        return this;
    }

    /**
     * Delivery. Shipment
     * <p>
     * The shipment being delivered.
     * 
     */
    @JsonProperty("Shipment")
    public List<Shipment> getShipment() {
        return shipment;
    }

    /**
     * Delivery. Shipment
     * <p>
     * The shipment being delivered.
     * 
     */
    @JsonProperty("Shipment")
    public void setShipment(List<Shipment> shipment) {
        this.shipment = shipment;
    }

    public Delivery withShipment(List<Shipment> shipment) {
        this.shipment = shipment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Delivery.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("minimumQuantity");
        sb.append('=');
        sb.append(((this.minimumQuantity == null)?"<null>":this.minimumQuantity));
        sb.append(',');
        sb.append("maximumQuantity");
        sb.append('=');
        sb.append(((this.maximumQuantity == null)?"<null>":this.maximumQuantity));
        sb.append(',');
        sb.append("actualDeliveryDate");
        sb.append('=');
        sb.append(((this.actualDeliveryDate == null)?"<null>":this.actualDeliveryDate));
        sb.append(',');
        sb.append("actualDeliveryTime");
        sb.append('=');
        sb.append(((this.actualDeliveryTime == null)?"<null>":this.actualDeliveryTime));
        sb.append(',');
        sb.append("latestDeliveryDate");
        sb.append('=');
        sb.append(((this.latestDeliveryDate == null)?"<null>":this.latestDeliveryDate));
        sb.append(',');
        sb.append("latestDeliveryTime");
        sb.append('=');
        sb.append(((this.latestDeliveryTime == null)?"<null>":this.latestDeliveryTime));
        sb.append(',');
        sb.append("releaseID");
        sb.append('=');
        sb.append(((this.releaseID == null)?"<null>":this.releaseID));
        sb.append(',');
        sb.append("trackingID");
        sb.append('=');
        sb.append(((this.trackingID == null)?"<null>":this.trackingID));
        sb.append(',');
        sb.append("deliveryAddress");
        sb.append('=');
        sb.append(((this.deliveryAddress == null)?"<null>":this.deliveryAddress));
        sb.append(',');
        sb.append("deliveryLocation");
        sb.append('=');
        sb.append(((this.deliveryLocation == null)?"<null>":this.deliveryLocation));
        sb.append(',');
        sb.append("alternativeDeliveryLocation");
        sb.append('=');
        sb.append(((this.alternativeDeliveryLocation == null)?"<null>":this.alternativeDeliveryLocation));
        sb.append(',');
        sb.append("requestedDeliveryPeriod");
        sb.append('=');
        sb.append(((this.requestedDeliveryPeriod == null)?"<null>":this.requestedDeliveryPeriod));
        sb.append(',');
        sb.append("promisedDeliveryPeriod");
        sb.append('=');
        sb.append(((this.promisedDeliveryPeriod == null)?"<null>":this.promisedDeliveryPeriod));
        sb.append(',');
        sb.append("estimatedDeliveryPeriod");
        sb.append('=');
        sb.append(((this.estimatedDeliveryPeriod == null)?"<null>":this.estimatedDeliveryPeriod));
        sb.append(',');
        sb.append("carrierParty");
        sb.append('=');
        sb.append(((this.carrierParty == null)?"<null>":this.carrierParty));
        sb.append(',');
        sb.append("deliveryParty");
        sb.append('=');
        sb.append(((this.deliveryParty == null)?"<null>":this.deliveryParty));
        sb.append(',');
        sb.append("notifyParty");
        sb.append('=');
        sb.append(((this.notifyParty == null)?"<null>":this.notifyParty));
        sb.append(',');
        sb.append("despatch");
        sb.append('=');
        sb.append(((this.despatch == null)?"<null>":this.despatch));
        sb.append(',');
        sb.append("deliveryTerms");
        sb.append('=');
        sb.append(((this.deliveryTerms == null)?"<null>":this.deliveryTerms));
        sb.append(',');
        sb.append("minimumDeliveryUnit");
        sb.append('=');
        sb.append(((this.minimumDeliveryUnit == null)?"<null>":this.minimumDeliveryUnit));
        sb.append(',');
        sb.append("maximumDeliveryUnit");
        sb.append('=');
        sb.append(((this.maximumDeliveryUnit == null)?"<null>":this.maximumDeliveryUnit));
        sb.append(',');
        sb.append("shipment");
        sb.append('=');
        sb.append(((this.shipment == null)?"<null>":this.shipment));
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
        result = ((result* 31)+((this.alternativeDeliveryLocation == null)? 0 :this.alternativeDeliveryLocation.hashCode()));
        result = ((result* 31)+((this.estimatedDeliveryPeriod == null)? 0 :this.estimatedDeliveryPeriod.hashCode()));
        result = ((result* 31)+((this.deliveryParty == null)? 0 :this.deliveryParty.hashCode()));
        result = ((result* 31)+((this.requestedDeliveryPeriod == null)? 0 :this.requestedDeliveryPeriod.hashCode()));
        result = ((result* 31)+((this.latestDeliveryTime == null)? 0 :this.latestDeliveryTime.hashCode()));
        result = ((result* 31)+((this.promisedDeliveryPeriod == null)? 0 :this.promisedDeliveryPeriod.hashCode()));
        result = ((result* 31)+((this.maximumDeliveryUnit == null)? 0 :this.maximumDeliveryUnit.hashCode()));
        result = ((result* 31)+((this.latestDeliveryDate == null)? 0 :this.latestDeliveryDate.hashCode()));
        result = ((result* 31)+((this.deliveryAddress == null)? 0 :this.deliveryAddress.hashCode()));
        result = ((result* 31)+((this.despatch == null)? 0 :this.despatch.hashCode()));
        result = ((result* 31)+((this.actualDeliveryTime == null)? 0 :this.actualDeliveryTime.hashCode()));
        result = ((result* 31)+((this.carrierParty == null)? 0 :this.carrierParty.hashCode()));
        result = ((result* 31)+((this.notifyParty == null)? 0 :this.notifyParty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.minimumQuantity == null)? 0 :this.minimumQuantity.hashCode()));
        result = ((result* 31)+((this.maximumQuantity == null)? 0 :this.maximumQuantity.hashCode()));
        result = ((result* 31)+((this.actualDeliveryDate == null)? 0 :this.actualDeliveryDate.hashCode()));
        result = ((result* 31)+((this.deliveryTerms == null)? 0 :this.deliveryTerms.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.shipment == null)? 0 :this.shipment.hashCode()));
        result = ((result* 31)+((this.deliveryLocation == null)? 0 :this.deliveryLocation.hashCode()));
        result = ((result* 31)+((this.minimumDeliveryUnit == null)? 0 :this.minimumDeliveryUnit.hashCode()));
        result = ((result* 31)+((this.releaseID == null)? 0 :this.releaseID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.trackingID == null)? 0 :this.trackingID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delivery) == false) {
            return false;
        }
        Delivery rhs = ((Delivery) other);
        return ((((((((((((((((((((((((((this.alternativeDeliveryLocation == rhs.alternativeDeliveryLocation)||((this.alternativeDeliveryLocation!= null)&&this.alternativeDeliveryLocation.equals(rhs.alternativeDeliveryLocation)))&&((this.estimatedDeliveryPeriod == rhs.estimatedDeliveryPeriod)||((this.estimatedDeliveryPeriod!= null)&&this.estimatedDeliveryPeriod.equals(rhs.estimatedDeliveryPeriod))))&&((this.deliveryParty == rhs.deliveryParty)||((this.deliveryParty!= null)&&this.deliveryParty.equals(rhs.deliveryParty))))&&((this.requestedDeliveryPeriod == rhs.requestedDeliveryPeriod)||((this.requestedDeliveryPeriod!= null)&&this.requestedDeliveryPeriod.equals(rhs.requestedDeliveryPeriod))))&&((this.latestDeliveryTime == rhs.latestDeliveryTime)||((this.latestDeliveryTime!= null)&&this.latestDeliveryTime.equals(rhs.latestDeliveryTime))))&&((this.promisedDeliveryPeriod == rhs.promisedDeliveryPeriod)||((this.promisedDeliveryPeriod!= null)&&this.promisedDeliveryPeriod.equals(rhs.promisedDeliveryPeriod))))&&((this.maximumDeliveryUnit == rhs.maximumDeliveryUnit)||((this.maximumDeliveryUnit!= null)&&this.maximumDeliveryUnit.equals(rhs.maximumDeliveryUnit))))&&((this.latestDeliveryDate == rhs.latestDeliveryDate)||((this.latestDeliveryDate!= null)&&this.latestDeliveryDate.equals(rhs.latestDeliveryDate))))&&((this.deliveryAddress == rhs.deliveryAddress)||((this.deliveryAddress!= null)&&this.deliveryAddress.equals(rhs.deliveryAddress))))&&((this.despatch == rhs.despatch)||((this.despatch!= null)&&this.despatch.equals(rhs.despatch))))&&((this.actualDeliveryTime == rhs.actualDeliveryTime)||((this.actualDeliveryTime!= null)&&this.actualDeliveryTime.equals(rhs.actualDeliveryTime))))&&((this.carrierParty == rhs.carrierParty)||((this.carrierParty!= null)&&this.carrierParty.equals(rhs.carrierParty))))&&((this.notifyParty == rhs.notifyParty)||((this.notifyParty!= null)&&this.notifyParty.equals(rhs.notifyParty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.minimumQuantity == rhs.minimumQuantity)||((this.minimumQuantity!= null)&&this.minimumQuantity.equals(rhs.minimumQuantity))))&&((this.maximumQuantity == rhs.maximumQuantity)||((this.maximumQuantity!= null)&&this.maximumQuantity.equals(rhs.maximumQuantity))))&&((this.actualDeliveryDate == rhs.actualDeliveryDate)||((this.actualDeliveryDate!= null)&&this.actualDeliveryDate.equals(rhs.actualDeliveryDate))))&&((this.deliveryTerms == rhs.deliveryTerms)||((this.deliveryTerms!= null)&&this.deliveryTerms.equals(rhs.deliveryTerms))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.shipment == rhs.shipment)||((this.shipment!= null)&&this.shipment.equals(rhs.shipment))))&&((this.deliveryLocation == rhs.deliveryLocation)||((this.deliveryLocation!= null)&&this.deliveryLocation.equals(rhs.deliveryLocation))))&&((this.minimumDeliveryUnit == rhs.minimumDeliveryUnit)||((this.minimumDeliveryUnit!= null)&&this.minimumDeliveryUnit.equals(rhs.minimumDeliveryUnit))))&&((this.releaseID == rhs.releaseID)||((this.releaseID!= null)&&this.releaseID.equals(rhs.releaseID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.trackingID == rhs.trackingID)||((this.trackingID!= null)&&this.trackingID.equals(rhs.trackingID))));
    }

}
