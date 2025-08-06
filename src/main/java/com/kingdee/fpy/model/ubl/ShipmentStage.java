
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
 * Shipment Stage. Details
 * <p>
 * A class to describe one stage of movement in a transport of goods.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "TransportModeCode",
    "TransportMeansTypeCode",
    "TransitDirectionCode",
    "PreCarriageIndicator",
    "OnCarriageIndicator",
    "EstimatedDeliveryDate",
    "EstimatedDeliveryTime",
    "RequiredDeliveryDate",
    "RequiredDeliveryTime",
    "LoadingSequenceID",
    "SuccessiveSequenceID",
    "Instructions",
    "DemurrageInstructions",
    "CrewQuantity",
    "PassengerQuantity",
    "TransitPeriod",
    "CarrierParty",
    "TransportMeans",
    "LoadingPortLocation",
    "UnloadingPortLocation",
    "TransshipPortLocation",
    "LoadingTransportEvent",
    "ExaminationTransportEvent",
    "AvailabilityTransportEvent",
    "ExportationTransportEvent",
    "DischargeTransportEvent",
    "WarehousingTransportEvent",
    "TakeoverTransportEvent",
    "OptionalTakeoverTransportEvent",
    "DropoffTransportEvent",
    "ActualPickupTransportEvent",
    "DeliveryTransportEvent",
    "ReceiptTransportEvent",
    "StorageTransportEvent",
    "AcceptanceTransportEvent",
    "TerminalOperatorParty",
    "CustomsAgentParty",
    "EstimatedTransitPeriod",
    "FreightAllowanceCharge",
    "FreightChargeLocation",
    "DetentionTransportEvent",
    "RequestedDepartureTransportEvent",
    "RequestedArrivalTransportEvent",
    "RequestedWaypointTransportEvent",
    "PlannedDepartureTransportEvent",
    "PlannedArrivalTransportEvent",
    "PlannedWaypointTransportEvent",
    "ActualDepartureTransportEvent",
    "ActualWaypointTransportEvent",
    "ActualArrivalTransportEvent",
    "TransportEvent",
    "EstimatedDepartureTransportEvent",
    "EstimatedArrivalTransportEvent",
    "PassengerPerson",
    "DriverPerson",
    "ReportingPerson",
    "CrewMemberPerson",
    "SecurityOfficerPerson",
    "MasterPerson",
    "ShipsSurgeonPerson"
})
@Generated("jsonschema2pojo")
public class ShipmentStage {

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
     * Shipment Stage. Identifier
     * <p>
     * An identifier for this shipment stage.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Shipment Stage. Transport Mode Code. Code
     * <p>
     * A code signifying the method of transport used for this shipment stage.
     * 
     */
    @JsonProperty("TransportModeCode")
    @JsonPropertyDescription("A code signifying the method of transport used for this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportModeCode = new ArrayList<CodeType>();
    /**
     * Shipment Stage. Transport Means Type Code. Code
     * <p>
     * A code signifying the kind of transport means (truck, vessel, etc.) used for this shipment stage.
     * 
     */
    @JsonProperty("TransportMeansTypeCode")
    @JsonPropertyDescription("A code signifying the kind of transport means (truck, vessel, etc.) used for this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportMeansTypeCode = new ArrayList<CodeType>();
    /**
     * Shipment Stage. Transit_ Direction Code. Code
     * <p>
     * A code signifying the direction of transit in this shipment stage.
     * 
     */
    @JsonProperty("TransitDirectionCode")
    @JsonPropertyDescription("A code signifying the direction of transit in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transitDirectionCode = new ArrayList<CodeType>();
    /**
     * Shipment Stage. Pre Carriage_ Indicator. Indicator
     * <p>
     * An indicator that this stage takes place before the main carriage of the shipment (true) or not (false).
     * 
     */
    @JsonProperty("PreCarriageIndicator")
    @JsonPropertyDescription("An indicator that this stage takes place before the main carriage of the shipment (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> preCarriageIndicator = new ArrayList<IndicatorType>();
    /**
     * Shipment Stage. On Carriage_ Indicator. Indicator
     * <p>
     * An indicator that this stage takes place after the main carriage of the shipment (true) or not (false).
     * 
     */
    @JsonProperty("OnCarriageIndicator")
    @JsonPropertyDescription("An indicator that this stage takes place after the main carriage of the shipment (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> onCarriageIndicator = new ArrayList<IndicatorType>();
    /**
     * Shipment Stage. Estimated_ Delivery Date. Date
     * <p>
     * The estimated date of delivery in this shipment stage.
     * 
     */
    @JsonProperty("EstimatedDeliveryDate")
    @JsonPropertyDescription("The estimated date of delivery in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> estimatedDeliveryDate = new ArrayList<DateType>();
    /**
     * Shipment Stage. Estimated_ Delivery Time. Time
     * <p>
     * The estimated time of delivery in this shipment stage.
     * 
     */
    @JsonProperty("EstimatedDeliveryTime")
    @JsonPropertyDescription("The estimated time of delivery in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> estimatedDeliveryTime = new ArrayList<TimeType>();
    /**
     * Shipment Stage. Required_ Delivery Date. Date
     * <p>
     * The delivery date required by the buyer in this shipment stage.
     * 
     */
    @JsonProperty("RequiredDeliveryDate")
    @JsonPropertyDescription("The delivery date required by the buyer in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> requiredDeliveryDate = new ArrayList<DateType>();
    /**
     * Shipment Stage. Required_ Delivery Time. Time
     * <p>
     * The delivery time required by the buyer in this shipment stage.
     * 
     */
    @JsonProperty("RequiredDeliveryTime")
    @JsonPropertyDescription("The delivery time required by the buyer in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> requiredDeliveryTime = new ArrayList<TimeType>();
    /**
     * Shipment Stage. Loading_ Sequence Identifier. Identifier
     * <p>
     * An identifier for the loading sequence (of consignments) associated with this shipment stage.
     * 
     */
    @JsonProperty("LoadingSequenceID")
    @JsonPropertyDescription("An identifier for the loading sequence (of consignments) associated with this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> loadingSequenceID = new ArrayList<IdentifierType>();
    /**
     * Shipment Stage. Successive_ Sequence Identifier. Identifier
     * <p>
     * Identifies the successive loading sequence (of consignments) associated with a shipment stage.
     * 
     */
    @JsonProperty("SuccessiveSequenceID")
    @JsonPropertyDescription("Identifies the successive loading sequence (of consignments) associated with a shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> successiveSequenceID = new ArrayList<IdentifierType>();
    /**
     * Shipment Stage. Instructions. Text
     * <p>
     * Text of instructions applicable to a shipment stage.
     * 
     */
    @JsonProperty("Instructions")
    @JsonPropertyDescription("Text of instructions applicable to a shipment stage.")
    @Size(min = 1)
    @Valid
    private List<TextType> instructions = new ArrayList<TextType>();
    /**
     * Shipment Stage. Demurrage_ Instructions. Text
     * <p>
     * Text of instructions relating to demurrage (the case in which a vessel is prevented from loading or discharging cargo within the stipulated laytime).
     * 
     */
    @JsonProperty("DemurrageInstructions")
    @JsonPropertyDescription("Text of instructions relating to demurrage (the case in which a vessel is prevented from loading or discharging cargo within the stipulated laytime).")
    @Size(min = 1)
    @Valid
    private List<TextType> demurrageInstructions = new ArrayList<TextType>();
    /**
     * Shipment Stage. Crew Quantity. Quantity
     * <p>
     * The total number of crew aboard a transport means.
     * 
     */
    @JsonProperty("CrewQuantity")
    @JsonPropertyDescription("The total number of crew aboard a transport means.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> crewQuantity = new ArrayList<QuantityType>();
    /**
     * Shipment Stage. Passenger Quantity. Quantity
     * <p>
     * The total number of passengers aboard a transport means.
     * 
     */
    @JsonProperty("PassengerQuantity")
    @JsonPropertyDescription("The total number of passengers aboard a transport means.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> passengerQuantity = new ArrayList<QuantityType>();
    /**
     * Shipment Stage. Transit_ Period. Period
     * <p>
     * The period during which this shipment stage actually took place.
     * 
     */
    @JsonProperty("TransitPeriod")
    @JsonPropertyDescription("The period during which this shipment stage actually took place.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> transitPeriod = new ArrayList<Period>();
    /**
     * Shipment Stage. Carrier_ Party. Party
     * <p>
     * A carrier party responsible for this shipment stage.
     * 
     */
    @JsonProperty("CarrierParty")
    @JsonPropertyDescription("A carrier party responsible for this shipment stage.")
    @Size(min = 1)
    @Valid
    private List<Party> carrierParty = new ArrayList<Party>();
    /**
     * Shipment Stage. Transport Means
     * <p>
     * The means of transport used in this shipment stage.
     * 
     */
    @JsonProperty("TransportMeans")
    @JsonPropertyDescription("The means of transport used in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportMeans> transportMeans = new ArrayList<TransportMeans>();
    /**
     * Shipment Stage. Loading Port_ Location. Location
     * <p>
     * The location of loading for a shipment stage.
     * 
     */
    @JsonProperty("LoadingPortLocation")
    @JsonPropertyDescription("The location of loading for a shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> loadingPortLocation = new ArrayList<Location>();
    /**
     * Shipment Stage. Unloading Port_ Location. Location
     * <p>
     * The location of unloading for a shipment stage.
     * 
     */
    @JsonProperty("UnloadingPortLocation")
    @JsonPropertyDescription("The location of unloading for a shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> unloadingPortLocation = new ArrayList<Location>();
    /**
     * Shipment Stage. Transship Port_ Location. Location
     * <p>
     * The location of transshipment relating to a shipment stage.
     * 
     */
    @JsonProperty("TransshipPortLocation")
    @JsonPropertyDescription("The location of transshipment relating to a shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> transshipPortLocation = new ArrayList<Location>();
    /**
     * Shipment Stage. Loading_ Transport Event. Transport Event
     * <p>
     * The loading of goods in this shipment stage.
     * 
     */
    @JsonProperty("LoadingTransportEvent")
    @JsonPropertyDescription("The loading of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> loadingTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Examination_ Transport Event. Transport Event
     * <p>
     * The examination of shipments in this shipment stage.
     * 
     */
    @JsonProperty("ExaminationTransportEvent")
    @JsonPropertyDescription("The examination of shipments in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> examinationTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Availability_ Transport Event. Transport Event
     * <p>
     * The making available of shipments in this shipment stage.
     * 
     */
    @JsonProperty("AvailabilityTransportEvent")
    @JsonPropertyDescription("The making available of shipments in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> availabilityTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Exportation_ Transport Event. Transport Event
     * <p>
     * The export event associated with this shipment stage.
     * 
     */
    @JsonProperty("ExportationTransportEvent")
    @JsonPropertyDescription("The export event associated with this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> exportationTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Discharge_ Transport Event. Transport Event
     * <p>
     * The discharge event associated with this shipment stage.
     * 
     */
    @JsonProperty("DischargeTransportEvent")
    @JsonPropertyDescription("The discharge event associated with this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> dischargeTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Warehousing_ Transport Event. Transport Event
     * <p>
     * The warehousing event associated with this shipment stage.
     * 
     */
    @JsonProperty("WarehousingTransportEvent")
    @JsonPropertyDescription("The warehousing event associated with this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> warehousingTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Takeover_ Transport Event. Transport Event
     * <p>
     * The receiver's takeover of the goods in this shipment stage.
     * 
     */
    @JsonProperty("TakeoverTransportEvent")
    @JsonPropertyDescription("The receiver's takeover of the goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> takeoverTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Optional Takeover_ Transport Event. Transport Event
     * <p>
     * The optional takeover of the goods in this shipment stage.
     * 
     */
    @JsonProperty("OptionalTakeoverTransportEvent")
    @JsonPropertyDescription("The optional takeover of the goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> optionalTakeoverTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Dropoff_ Transport Event. Transport Event
     * <p>
     * The dropping off of goods in this shipment stage.
     * 
     */
    @JsonProperty("DropoffTransportEvent")
    @JsonPropertyDescription("The dropping off of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> dropoffTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Actual Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of goods in this shipment stage.
     * 
     */
    @JsonProperty("ActualPickupTransportEvent")
    @JsonPropertyDescription("The pickup of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> actualPickupTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of goods in this shipment stage.
     * 
     */
    @JsonProperty("DeliveryTransportEvent")
    @JsonPropertyDescription("The delivery of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> deliveryTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Receipt_ Transport Event. Transport Event
     * <p>
     * The receipt of goods in this shipment stage.
     * 
     */
    @JsonProperty("ReceiptTransportEvent")
    @JsonPropertyDescription("The receipt of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> receiptTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Storage_ Transport Event. Transport Event
     * <p>
     * The storage of goods in this shipment stage.
     * 
     */
    @JsonProperty("StorageTransportEvent")
    @JsonPropertyDescription("The storage of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> storageTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Acceptance_ Transport Event. Transport Event
     * <p>
     * The acceptance of goods in this shipment stage.
     * 
     */
    @JsonProperty("AcceptanceTransportEvent")
    @JsonPropertyDescription("The acceptance of goods in this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> acceptanceTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Terminal Operator_ Party. Party
     * <p>
     * A terminal operator associated with this shipment stage.
     * 
     */
    @JsonProperty("TerminalOperatorParty")
    @JsonPropertyDescription("A terminal operator associated with this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> terminalOperatorParty = new ArrayList<Party>();
    /**
     * Shipment Stage. Customs Agent_ Party. Party
     * <p>
     * A customs agent associated with this shipment stage.
     * 
     */
    @JsonProperty("CustomsAgentParty")
    @JsonPropertyDescription("A customs agent associated with this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> customsAgentParty = new ArrayList<Party>();
    /**
     * Shipment Stage. Estimated Transit_ Period. Period
     * <p>
     * The estimated transit period of this shipment stage.
     * 
     */
    @JsonProperty("EstimatedTransitPeriod")
    @JsonPropertyDescription("The estimated transit period of this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> estimatedTransitPeriod = new ArrayList<Period>();
    /**
     * Shipment Stage. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A freight allowance charge for this shipment stage.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    @JsonPropertyDescription("A freight allowance charge for this shipment stage.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> freightAllowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Shipment Stage. Freight Charge_ Location. Location
     * <p>
     * The location associated with a freight charge related to this shipment stage.
     * 
     */
    @JsonProperty("FreightChargeLocation")
    @JsonPropertyDescription("The location associated with a freight charge related to this shipment stage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> freightChargeLocation = new ArrayList<Location>();
    /**
     * Shipment Stage. Detention_ Transport Event. Transport Event
     * <p>
     * The detention of a transport means during loading and unloading operations.
     * 
     */
    @JsonProperty("DetentionTransportEvent")
    @JsonPropertyDescription("The detention of a transport means during loading and unloading operations.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> detentionTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Requested Departure_ Transport Event. Transport Event
     * <p>
     * The departure requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedDepartureTransportEvent")
    @JsonPropertyDescription("The departure requested by the party requesting a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> requestedDepartureTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Requested Arrival_ Transport Event. Transport Event
     * <p>
     * The arrival requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedArrivalTransportEvent")
    @JsonPropertyDescription("The arrival requested by the party requesting a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> requestedArrivalTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Requested Waypoint_ Transport Event. Transport Event
     * <p>
     * A waypoint requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedWaypointTransportEvent")
    @JsonPropertyDescription("A waypoint requested by the party requesting a transportation service.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> requestedWaypointTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Planned Departure_ Transport Event. Transport Event
     * <p>
     * The departure planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedDepartureTransportEvent")
    @JsonPropertyDescription("The departure planned by the party providing a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> plannedDepartureTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Planned Arrival_ Transport Event. Transport Event
     * <p>
     * The arrival planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedArrivalTransportEvent")
    @JsonPropertyDescription("The arrival planned by the party providing a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> plannedArrivalTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Planned Waypoint_ Transport Event. Transport Event
     * <p>
     * A waypoint planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedWaypointTransportEvent")
    @JsonPropertyDescription("A waypoint planned by the party providing a transportation service.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> plannedWaypointTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Actual Departure_ Transport Event. Transport Event
     * <p>
     * The actual departure from a specific location during a transportation service.
     * 
     */
    @JsonProperty("ActualDepartureTransportEvent")
    @JsonPropertyDescription("The actual departure from a specific location during a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> actualDepartureTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Actual Waypoint_ Transport Event. Transport Event
     * <p>
     * The location of an actual waypoint during a transportation service.
     * 
     */
    @JsonProperty("ActualWaypointTransportEvent")
    @JsonPropertyDescription("The location of an actual waypoint during a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> actualWaypointTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Actual Arrival_ Transport Event. Transport Event
     * <p>
     * The actual arrival at a specific location during a transportation service.
     * 
     */
    @JsonProperty("ActualArrivalTransportEvent")
    @JsonPropertyDescription("The actual arrival at a specific location during a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> actualArrivalTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Transport Event
     * <p>
     * A significant occurrence in the course of this shipment of goods.
     * 
     */
    @JsonProperty("TransportEvent")
    @JsonPropertyDescription("A significant occurrence in the course of this shipment of goods.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> transportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Estimated Departure_ Transport Event. Transport Event
     * <p>
     * Describes an estimated departure at a location during a transport service.
     * 
     */
    @JsonProperty("EstimatedDepartureTransportEvent")
    @JsonPropertyDescription("Describes an estimated departure at a location during a transport service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> estimatedDepartureTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Estimated Arrival_ Transport Event. Transport Event
     * <p>
     * Describes an estimated arrival at a location during a transport service.
     * 
     */
    @JsonProperty("EstimatedArrivalTransportEvent")
    @JsonPropertyDescription("Describes an estimated arrival at a location during a transport service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> estimatedArrivalTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Shipment Stage. Passenger_ Person. Person
     * <p>
     * A person who travels in a conveyance without participating in its operation.
     * 
     */
    @JsonProperty("PassengerPerson")
    @JsonPropertyDescription("A person who travels in a conveyance without participating in its operation.")
    @Size(min = 1)
    @Valid
    private List<Person> passengerPerson = new ArrayList<Person>();
    /**
     * Shipment Stage. Driver_ Person. Person
     * <p>
     * Describes a person responsible for driving the transport means.
     * 
     */
    @JsonProperty("DriverPerson")
    @JsonPropertyDescription("Describes a person responsible for driving the transport means.")
    @Size(min = 1)
    @Valid
    private List<Person> driverPerson = new ArrayList<Person>();
    /**
     * Shipment Stage. Reporting_ Person. Person
     * <p>
     * Describes a person being responsible for providing the required administrative reporting relating to a transport.
     * 
     */
    @JsonProperty("ReportingPerson")
    @JsonPropertyDescription("Describes a person being responsible for providing the required administrative reporting relating to a transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Person> reportingPerson = new ArrayList<Person>();
    /**
     * Shipment Stage. Crew Member_ Person. Person
     * <p>
     * A person operating or serving aboard a transport means.
     * 
     */
    @JsonProperty("CrewMemberPerson")
    @JsonPropertyDescription("A person operating or serving aboard a transport means.")
    @Size(min = 1)
    @Valid
    private List<Person> crewMemberPerson = new ArrayList<Person>();
    /**
     * Shipment Stage. Security Officer_ Person. Person
     * <p>
     * The person on board the vessel, accountable to the master, designated by the company as responsible for the security of the ship, including implementation and maintenance of the ship security plan and for the liaison with the company security officer and the port facility security officers.
     * 
     */
    @JsonProperty("SecurityOfficerPerson")
    @JsonPropertyDescription("The person on board the vessel, accountable to the master, designated by the company as responsible for the security of the ship, including implementation and maintenance of the ship security plan and for the liaison with the company security officer and the port facility security officers.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Person> securityOfficerPerson = new ArrayList<Person>();
    /**
     * Shipment Stage. Master_ Person. Person
     * <p>
     * The person responsible for the ship's safe and efficient operation, including cargo operations, navigation, crew management and for ensuring that the vessel complies with local and international laws, as well as company and flag state policies.
     * 
     */
    @JsonProperty("MasterPerson")
    @JsonPropertyDescription("The person responsible for the ship's safe and efficient operation, including cargo operations, navigation, crew management and for ensuring that the vessel complies with local and international laws, as well as company and flag state policies.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Person> masterPerson = new ArrayList<Person>();
    /**
     * Shipment Stage. Ships Surgeon_ Person. Person
     * <p>
     * The person responsible for the health of the people aboard a ship at sea.
     * 
     */
    @JsonProperty("ShipsSurgeonPerson")
    @JsonPropertyDescription("The person responsible for the health of the people aboard a ship at sea.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Person> shipsSurgeonPerson = new ArrayList<Person>();

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

    public ShipmentStage withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Shipment Stage. Identifier
     * <p>
     * An identifier for this shipment stage.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Shipment Stage. Identifier
     * <p>
     * An identifier for this shipment stage.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ShipmentStage withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Shipment Stage. Transport Mode Code. Code
     * <p>
     * A code signifying the method of transport used for this shipment stage.
     * 
     */
    @JsonProperty("TransportModeCode")
    public List<CodeType> getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Shipment Stage. Transport Mode Code. Code
     * <p>
     * A code signifying the method of transport used for this shipment stage.
     * 
     */
    @JsonProperty("TransportModeCode")
    public void setTransportModeCode(List<CodeType> transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    public ShipmentStage withTransportModeCode(List<CodeType> transportModeCode) {
        this.transportModeCode = transportModeCode;
        return this;
    }

    /**
     * Shipment Stage. Transport Means Type Code. Code
     * <p>
     * A code signifying the kind of transport means (truck, vessel, etc.) used for this shipment stage.
     * 
     */
    @JsonProperty("TransportMeansTypeCode")
    public List<CodeType> getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Shipment Stage. Transport Means Type Code. Code
     * <p>
     * A code signifying the kind of transport means (truck, vessel, etc.) used for this shipment stage.
     * 
     */
    @JsonProperty("TransportMeansTypeCode")
    public void setTransportMeansTypeCode(List<CodeType> transportMeansTypeCode) {
        this.transportMeansTypeCode = transportMeansTypeCode;
    }

    public ShipmentStage withTransportMeansTypeCode(List<CodeType> transportMeansTypeCode) {
        this.transportMeansTypeCode = transportMeansTypeCode;
        return this;
    }

    /**
     * Shipment Stage. Transit_ Direction Code. Code
     * <p>
     * A code signifying the direction of transit in this shipment stage.
     * 
     */
    @JsonProperty("TransitDirectionCode")
    public List<CodeType> getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /**
     * Shipment Stage. Transit_ Direction Code. Code
     * <p>
     * A code signifying the direction of transit in this shipment stage.
     * 
     */
    @JsonProperty("TransitDirectionCode")
    public void setTransitDirectionCode(List<CodeType> transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

    public ShipmentStage withTransitDirectionCode(List<CodeType> transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
        return this;
    }

    /**
     * Shipment Stage. Pre Carriage_ Indicator. Indicator
     * <p>
     * An indicator that this stage takes place before the main carriage of the shipment (true) or not (false).
     * 
     */
    @JsonProperty("PreCarriageIndicator")
    public List<IndicatorType> getPreCarriageIndicator() {
        return preCarriageIndicator;
    }

    /**
     * Shipment Stage. Pre Carriage_ Indicator. Indicator
     * <p>
     * An indicator that this stage takes place before the main carriage of the shipment (true) or not (false).
     * 
     */
    @JsonProperty("PreCarriageIndicator")
    public void setPreCarriageIndicator(List<IndicatorType> preCarriageIndicator) {
        this.preCarriageIndicator = preCarriageIndicator;
    }

    public ShipmentStage withPreCarriageIndicator(List<IndicatorType> preCarriageIndicator) {
        this.preCarriageIndicator = preCarriageIndicator;
        return this;
    }

    /**
     * Shipment Stage. On Carriage_ Indicator. Indicator
     * <p>
     * An indicator that this stage takes place after the main carriage of the shipment (true) or not (false).
     * 
     */
    @JsonProperty("OnCarriageIndicator")
    public List<IndicatorType> getOnCarriageIndicator() {
        return onCarriageIndicator;
    }

    /**
     * Shipment Stage. On Carriage_ Indicator. Indicator
     * <p>
     * An indicator that this stage takes place after the main carriage of the shipment (true) or not (false).
     * 
     */
    @JsonProperty("OnCarriageIndicator")
    public void setOnCarriageIndicator(List<IndicatorType> onCarriageIndicator) {
        this.onCarriageIndicator = onCarriageIndicator;
    }

    public ShipmentStage withOnCarriageIndicator(List<IndicatorType> onCarriageIndicator) {
        this.onCarriageIndicator = onCarriageIndicator;
        return this;
    }

    /**
     * Shipment Stage. Estimated_ Delivery Date. Date
     * <p>
     * The estimated date of delivery in this shipment stage.
     * 
     */
    @JsonProperty("EstimatedDeliveryDate")
    public List<DateType> getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * Shipment Stage. Estimated_ Delivery Date. Date
     * <p>
     * The estimated date of delivery in this shipment stage.
     * 
     */
    @JsonProperty("EstimatedDeliveryDate")
    public void setEstimatedDeliveryDate(List<DateType> estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public ShipmentStage withEstimatedDeliveryDate(List<DateType> estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
        return this;
    }

    /**
     * Shipment Stage. Estimated_ Delivery Time. Time
     * <p>
     * The estimated time of delivery in this shipment stage.
     * 
     */
    @JsonProperty("EstimatedDeliveryTime")
    public List<TimeType> getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    /**
     * Shipment Stage. Estimated_ Delivery Time. Time
     * <p>
     * The estimated time of delivery in this shipment stage.
     * 
     */
    @JsonProperty("EstimatedDeliveryTime")
    public void setEstimatedDeliveryTime(List<TimeType> estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public ShipmentStage withEstimatedDeliveryTime(List<TimeType> estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        return this;
    }

    /**
     * Shipment Stage. Required_ Delivery Date. Date
     * <p>
     * The delivery date required by the buyer in this shipment stage.
     * 
     */
    @JsonProperty("RequiredDeliveryDate")
    public List<DateType> getRequiredDeliveryDate() {
        return requiredDeliveryDate;
    }

    /**
     * Shipment Stage. Required_ Delivery Date. Date
     * <p>
     * The delivery date required by the buyer in this shipment stage.
     * 
     */
    @JsonProperty("RequiredDeliveryDate")
    public void setRequiredDeliveryDate(List<DateType> requiredDeliveryDate) {
        this.requiredDeliveryDate = requiredDeliveryDate;
    }

    public ShipmentStage withRequiredDeliveryDate(List<DateType> requiredDeliveryDate) {
        this.requiredDeliveryDate = requiredDeliveryDate;
        return this;
    }

    /**
     * Shipment Stage. Required_ Delivery Time. Time
     * <p>
     * The delivery time required by the buyer in this shipment stage.
     * 
     */
    @JsonProperty("RequiredDeliveryTime")
    public List<TimeType> getRequiredDeliveryTime() {
        return requiredDeliveryTime;
    }

    /**
     * Shipment Stage. Required_ Delivery Time. Time
     * <p>
     * The delivery time required by the buyer in this shipment stage.
     * 
     */
    @JsonProperty("RequiredDeliveryTime")
    public void setRequiredDeliveryTime(List<TimeType> requiredDeliveryTime) {
        this.requiredDeliveryTime = requiredDeliveryTime;
    }

    public ShipmentStage withRequiredDeliveryTime(List<TimeType> requiredDeliveryTime) {
        this.requiredDeliveryTime = requiredDeliveryTime;
        return this;
    }

    /**
     * Shipment Stage. Loading_ Sequence Identifier. Identifier
     * <p>
     * An identifier for the loading sequence (of consignments) associated with this shipment stage.
     * 
     */
    @JsonProperty("LoadingSequenceID")
    public List<IdentifierType> getLoadingSequenceID() {
        return loadingSequenceID;
    }

    /**
     * Shipment Stage. Loading_ Sequence Identifier. Identifier
     * <p>
     * An identifier for the loading sequence (of consignments) associated with this shipment stage.
     * 
     */
    @JsonProperty("LoadingSequenceID")
    public void setLoadingSequenceID(List<IdentifierType> loadingSequenceID) {
        this.loadingSequenceID = loadingSequenceID;
    }

    public ShipmentStage withLoadingSequenceID(List<IdentifierType> loadingSequenceID) {
        this.loadingSequenceID = loadingSequenceID;
        return this;
    }

    /**
     * Shipment Stage. Successive_ Sequence Identifier. Identifier
     * <p>
     * Identifies the successive loading sequence (of consignments) associated with a shipment stage.
     * 
     */
    @JsonProperty("SuccessiveSequenceID")
    public List<IdentifierType> getSuccessiveSequenceID() {
        return successiveSequenceID;
    }

    /**
     * Shipment Stage. Successive_ Sequence Identifier. Identifier
     * <p>
     * Identifies the successive loading sequence (of consignments) associated with a shipment stage.
     * 
     */
    @JsonProperty("SuccessiveSequenceID")
    public void setSuccessiveSequenceID(List<IdentifierType> successiveSequenceID) {
        this.successiveSequenceID = successiveSequenceID;
    }

    public ShipmentStage withSuccessiveSequenceID(List<IdentifierType> successiveSequenceID) {
        this.successiveSequenceID = successiveSequenceID;
        return this;
    }

    /**
     * Shipment Stage. Instructions. Text
     * <p>
     * Text of instructions applicable to a shipment stage.
     * 
     */
    @JsonProperty("Instructions")
    public List<TextType> getInstructions() {
        return instructions;
    }

    /**
     * Shipment Stage. Instructions. Text
     * <p>
     * Text of instructions applicable to a shipment stage.
     * 
     */
    @JsonProperty("Instructions")
    public void setInstructions(List<TextType> instructions) {
        this.instructions = instructions;
    }

    public ShipmentStage withInstructions(List<TextType> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Shipment Stage. Demurrage_ Instructions. Text
     * <p>
     * Text of instructions relating to demurrage (the case in which a vessel is prevented from loading or discharging cargo within the stipulated laytime).
     * 
     */
    @JsonProperty("DemurrageInstructions")
    public List<TextType> getDemurrageInstructions() {
        return demurrageInstructions;
    }

    /**
     * Shipment Stage. Demurrage_ Instructions. Text
     * <p>
     * Text of instructions relating to demurrage (the case in which a vessel is prevented from loading or discharging cargo within the stipulated laytime).
     * 
     */
    @JsonProperty("DemurrageInstructions")
    public void setDemurrageInstructions(List<TextType> demurrageInstructions) {
        this.demurrageInstructions = demurrageInstructions;
    }

    public ShipmentStage withDemurrageInstructions(List<TextType> demurrageInstructions) {
        this.demurrageInstructions = demurrageInstructions;
        return this;
    }

    /**
     * Shipment Stage. Crew Quantity. Quantity
     * <p>
     * The total number of crew aboard a transport means.
     * 
     */
    @JsonProperty("CrewQuantity")
    public List<QuantityType> getCrewQuantity() {
        return crewQuantity;
    }

    /**
     * Shipment Stage. Crew Quantity. Quantity
     * <p>
     * The total number of crew aboard a transport means.
     * 
     */
    @JsonProperty("CrewQuantity")
    public void setCrewQuantity(List<QuantityType> crewQuantity) {
        this.crewQuantity = crewQuantity;
    }

    public ShipmentStage withCrewQuantity(List<QuantityType> crewQuantity) {
        this.crewQuantity = crewQuantity;
        return this;
    }

    /**
     * Shipment Stage. Passenger Quantity. Quantity
     * <p>
     * The total number of passengers aboard a transport means.
     * 
     */
    @JsonProperty("PassengerQuantity")
    public List<QuantityType> getPassengerQuantity() {
        return passengerQuantity;
    }

    /**
     * Shipment Stage. Passenger Quantity. Quantity
     * <p>
     * The total number of passengers aboard a transport means.
     * 
     */
    @JsonProperty("PassengerQuantity")
    public void setPassengerQuantity(List<QuantityType> passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    public ShipmentStage withPassengerQuantity(List<QuantityType> passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
        return this;
    }

    /**
     * Shipment Stage. Transit_ Period. Period
     * <p>
     * The period during which this shipment stage actually took place.
     * 
     */
    @JsonProperty("TransitPeriod")
    public List<Period> getTransitPeriod() {
        return transitPeriod;
    }

    /**
     * Shipment Stage. Transit_ Period. Period
     * <p>
     * The period during which this shipment stage actually took place.
     * 
     */
    @JsonProperty("TransitPeriod")
    public void setTransitPeriod(List<Period> transitPeriod) {
        this.transitPeriod = transitPeriod;
    }

    public ShipmentStage withTransitPeriod(List<Period> transitPeriod) {
        this.transitPeriod = transitPeriod;
        return this;
    }

    /**
     * Shipment Stage. Carrier_ Party. Party
     * <p>
     * A carrier party responsible for this shipment stage.
     * 
     */
    @JsonProperty("CarrierParty")
    public List<Party> getCarrierParty() {
        return carrierParty;
    }

    /**
     * Shipment Stage. Carrier_ Party. Party
     * <p>
     * A carrier party responsible for this shipment stage.
     * 
     */
    @JsonProperty("CarrierParty")
    public void setCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
    }

    public ShipmentStage withCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
        return this;
    }

    /**
     * Shipment Stage. Transport Means
     * <p>
     * The means of transport used in this shipment stage.
     * 
     */
    @JsonProperty("TransportMeans")
    public List<TransportMeans> getTransportMeans() {
        return transportMeans;
    }

    /**
     * Shipment Stage. Transport Means
     * <p>
     * The means of transport used in this shipment stage.
     * 
     */
    @JsonProperty("TransportMeans")
    public void setTransportMeans(List<TransportMeans> transportMeans) {
        this.transportMeans = transportMeans;
    }

    public ShipmentStage withTransportMeans(List<TransportMeans> transportMeans) {
        this.transportMeans = transportMeans;
        return this;
    }

    /**
     * Shipment Stage. Loading Port_ Location. Location
     * <p>
     * The location of loading for a shipment stage.
     * 
     */
    @JsonProperty("LoadingPortLocation")
    public List<Location> getLoadingPortLocation() {
        return loadingPortLocation;
    }

    /**
     * Shipment Stage. Loading Port_ Location. Location
     * <p>
     * The location of loading for a shipment stage.
     * 
     */
    @JsonProperty("LoadingPortLocation")
    public void setLoadingPortLocation(List<Location> loadingPortLocation) {
        this.loadingPortLocation = loadingPortLocation;
    }

    public ShipmentStage withLoadingPortLocation(List<Location> loadingPortLocation) {
        this.loadingPortLocation = loadingPortLocation;
        return this;
    }

    /**
     * Shipment Stage. Unloading Port_ Location. Location
     * <p>
     * The location of unloading for a shipment stage.
     * 
     */
    @JsonProperty("UnloadingPortLocation")
    public List<Location> getUnloadingPortLocation() {
        return unloadingPortLocation;
    }

    /**
     * Shipment Stage. Unloading Port_ Location. Location
     * <p>
     * The location of unloading for a shipment stage.
     * 
     */
    @JsonProperty("UnloadingPortLocation")
    public void setUnloadingPortLocation(List<Location> unloadingPortLocation) {
        this.unloadingPortLocation = unloadingPortLocation;
    }

    public ShipmentStage withUnloadingPortLocation(List<Location> unloadingPortLocation) {
        this.unloadingPortLocation = unloadingPortLocation;
        return this;
    }

    /**
     * Shipment Stage. Transship Port_ Location. Location
     * <p>
     * The location of transshipment relating to a shipment stage.
     * 
     */
    @JsonProperty("TransshipPortLocation")
    public List<Location> getTransshipPortLocation() {
        return transshipPortLocation;
    }

    /**
     * Shipment Stage. Transship Port_ Location. Location
     * <p>
     * The location of transshipment relating to a shipment stage.
     * 
     */
    @JsonProperty("TransshipPortLocation")
    public void setTransshipPortLocation(List<Location> transshipPortLocation) {
        this.transshipPortLocation = transshipPortLocation;
    }

    public ShipmentStage withTransshipPortLocation(List<Location> transshipPortLocation) {
        this.transshipPortLocation = transshipPortLocation;
        return this;
    }

    /**
     * Shipment Stage. Loading_ Transport Event. Transport Event
     * <p>
     * The loading of goods in this shipment stage.
     * 
     */
    @JsonProperty("LoadingTransportEvent")
    public List<TransportEvent> getLoadingTransportEvent() {
        return loadingTransportEvent;
    }

    /**
     * Shipment Stage. Loading_ Transport Event. Transport Event
     * <p>
     * The loading of goods in this shipment stage.
     * 
     */
    @JsonProperty("LoadingTransportEvent")
    public void setLoadingTransportEvent(List<TransportEvent> loadingTransportEvent) {
        this.loadingTransportEvent = loadingTransportEvent;
    }

    public ShipmentStage withLoadingTransportEvent(List<TransportEvent> loadingTransportEvent) {
        this.loadingTransportEvent = loadingTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Examination_ Transport Event. Transport Event
     * <p>
     * The examination of shipments in this shipment stage.
     * 
     */
    @JsonProperty("ExaminationTransportEvent")
    public List<TransportEvent> getExaminationTransportEvent() {
        return examinationTransportEvent;
    }

    /**
     * Shipment Stage. Examination_ Transport Event. Transport Event
     * <p>
     * The examination of shipments in this shipment stage.
     * 
     */
    @JsonProperty("ExaminationTransportEvent")
    public void setExaminationTransportEvent(List<TransportEvent> examinationTransportEvent) {
        this.examinationTransportEvent = examinationTransportEvent;
    }

    public ShipmentStage withExaminationTransportEvent(List<TransportEvent> examinationTransportEvent) {
        this.examinationTransportEvent = examinationTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Availability_ Transport Event. Transport Event
     * <p>
     * The making available of shipments in this shipment stage.
     * 
     */
    @JsonProperty("AvailabilityTransportEvent")
    public List<TransportEvent> getAvailabilityTransportEvent() {
        return availabilityTransportEvent;
    }

    /**
     * Shipment Stage. Availability_ Transport Event. Transport Event
     * <p>
     * The making available of shipments in this shipment stage.
     * 
     */
    @JsonProperty("AvailabilityTransportEvent")
    public void setAvailabilityTransportEvent(List<TransportEvent> availabilityTransportEvent) {
        this.availabilityTransportEvent = availabilityTransportEvent;
    }

    public ShipmentStage withAvailabilityTransportEvent(List<TransportEvent> availabilityTransportEvent) {
        this.availabilityTransportEvent = availabilityTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Exportation_ Transport Event. Transport Event
     * <p>
     * The export event associated with this shipment stage.
     * 
     */
    @JsonProperty("ExportationTransportEvent")
    public List<TransportEvent> getExportationTransportEvent() {
        return exportationTransportEvent;
    }

    /**
     * Shipment Stage. Exportation_ Transport Event. Transport Event
     * <p>
     * The export event associated with this shipment stage.
     * 
     */
    @JsonProperty("ExportationTransportEvent")
    public void setExportationTransportEvent(List<TransportEvent> exportationTransportEvent) {
        this.exportationTransportEvent = exportationTransportEvent;
    }

    public ShipmentStage withExportationTransportEvent(List<TransportEvent> exportationTransportEvent) {
        this.exportationTransportEvent = exportationTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Discharge_ Transport Event. Transport Event
     * <p>
     * The discharge event associated with this shipment stage.
     * 
     */
    @JsonProperty("DischargeTransportEvent")
    public List<TransportEvent> getDischargeTransportEvent() {
        return dischargeTransportEvent;
    }

    /**
     * Shipment Stage. Discharge_ Transport Event. Transport Event
     * <p>
     * The discharge event associated with this shipment stage.
     * 
     */
    @JsonProperty("DischargeTransportEvent")
    public void setDischargeTransportEvent(List<TransportEvent> dischargeTransportEvent) {
        this.dischargeTransportEvent = dischargeTransportEvent;
    }

    public ShipmentStage withDischargeTransportEvent(List<TransportEvent> dischargeTransportEvent) {
        this.dischargeTransportEvent = dischargeTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Warehousing_ Transport Event. Transport Event
     * <p>
     * The warehousing event associated with this shipment stage.
     * 
     */
    @JsonProperty("WarehousingTransportEvent")
    public List<TransportEvent> getWarehousingTransportEvent() {
        return warehousingTransportEvent;
    }

    /**
     * Shipment Stage. Warehousing_ Transport Event. Transport Event
     * <p>
     * The warehousing event associated with this shipment stage.
     * 
     */
    @JsonProperty("WarehousingTransportEvent")
    public void setWarehousingTransportEvent(List<TransportEvent> warehousingTransportEvent) {
        this.warehousingTransportEvent = warehousingTransportEvent;
    }

    public ShipmentStage withWarehousingTransportEvent(List<TransportEvent> warehousingTransportEvent) {
        this.warehousingTransportEvent = warehousingTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Takeover_ Transport Event. Transport Event
     * <p>
     * The receiver's takeover of the goods in this shipment stage.
     * 
     */
    @JsonProperty("TakeoverTransportEvent")
    public List<TransportEvent> getTakeoverTransportEvent() {
        return takeoverTransportEvent;
    }

    /**
     * Shipment Stage. Takeover_ Transport Event. Transport Event
     * <p>
     * The receiver's takeover of the goods in this shipment stage.
     * 
     */
    @JsonProperty("TakeoverTransportEvent")
    public void setTakeoverTransportEvent(List<TransportEvent> takeoverTransportEvent) {
        this.takeoverTransportEvent = takeoverTransportEvent;
    }

    public ShipmentStage withTakeoverTransportEvent(List<TransportEvent> takeoverTransportEvent) {
        this.takeoverTransportEvent = takeoverTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Optional Takeover_ Transport Event. Transport Event
     * <p>
     * The optional takeover of the goods in this shipment stage.
     * 
     */
    @JsonProperty("OptionalTakeoverTransportEvent")
    public List<TransportEvent> getOptionalTakeoverTransportEvent() {
        return optionalTakeoverTransportEvent;
    }

    /**
     * Shipment Stage. Optional Takeover_ Transport Event. Transport Event
     * <p>
     * The optional takeover of the goods in this shipment stage.
     * 
     */
    @JsonProperty("OptionalTakeoverTransportEvent")
    public void setOptionalTakeoverTransportEvent(List<TransportEvent> optionalTakeoverTransportEvent) {
        this.optionalTakeoverTransportEvent = optionalTakeoverTransportEvent;
    }

    public ShipmentStage withOptionalTakeoverTransportEvent(List<TransportEvent> optionalTakeoverTransportEvent) {
        this.optionalTakeoverTransportEvent = optionalTakeoverTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Dropoff_ Transport Event. Transport Event
     * <p>
     * The dropping off of goods in this shipment stage.
     * 
     */
    @JsonProperty("DropoffTransportEvent")
    public List<TransportEvent> getDropoffTransportEvent() {
        return dropoffTransportEvent;
    }

    /**
     * Shipment Stage. Dropoff_ Transport Event. Transport Event
     * <p>
     * The dropping off of goods in this shipment stage.
     * 
     */
    @JsonProperty("DropoffTransportEvent")
    public void setDropoffTransportEvent(List<TransportEvent> dropoffTransportEvent) {
        this.dropoffTransportEvent = dropoffTransportEvent;
    }

    public ShipmentStage withDropoffTransportEvent(List<TransportEvent> dropoffTransportEvent) {
        this.dropoffTransportEvent = dropoffTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Actual Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of goods in this shipment stage.
     * 
     */
    @JsonProperty("ActualPickupTransportEvent")
    public List<TransportEvent> getActualPickupTransportEvent() {
        return actualPickupTransportEvent;
    }

    /**
     * Shipment Stage. Actual Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of goods in this shipment stage.
     * 
     */
    @JsonProperty("ActualPickupTransportEvent")
    public void setActualPickupTransportEvent(List<TransportEvent> actualPickupTransportEvent) {
        this.actualPickupTransportEvent = actualPickupTransportEvent;
    }

    public ShipmentStage withActualPickupTransportEvent(List<TransportEvent> actualPickupTransportEvent) {
        this.actualPickupTransportEvent = actualPickupTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of goods in this shipment stage.
     * 
     */
    @JsonProperty("DeliveryTransportEvent")
    public List<TransportEvent> getDeliveryTransportEvent() {
        return deliveryTransportEvent;
    }

    /**
     * Shipment Stage. Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of goods in this shipment stage.
     * 
     */
    @JsonProperty("DeliveryTransportEvent")
    public void setDeliveryTransportEvent(List<TransportEvent> deliveryTransportEvent) {
        this.deliveryTransportEvent = deliveryTransportEvent;
    }

    public ShipmentStage withDeliveryTransportEvent(List<TransportEvent> deliveryTransportEvent) {
        this.deliveryTransportEvent = deliveryTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Receipt_ Transport Event. Transport Event
     * <p>
     * The receipt of goods in this shipment stage.
     * 
     */
    @JsonProperty("ReceiptTransportEvent")
    public List<TransportEvent> getReceiptTransportEvent() {
        return receiptTransportEvent;
    }

    /**
     * Shipment Stage. Receipt_ Transport Event. Transport Event
     * <p>
     * The receipt of goods in this shipment stage.
     * 
     */
    @JsonProperty("ReceiptTransportEvent")
    public void setReceiptTransportEvent(List<TransportEvent> receiptTransportEvent) {
        this.receiptTransportEvent = receiptTransportEvent;
    }

    public ShipmentStage withReceiptTransportEvent(List<TransportEvent> receiptTransportEvent) {
        this.receiptTransportEvent = receiptTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Storage_ Transport Event. Transport Event
     * <p>
     * The storage of goods in this shipment stage.
     * 
     */
    @JsonProperty("StorageTransportEvent")
    public List<TransportEvent> getStorageTransportEvent() {
        return storageTransportEvent;
    }

    /**
     * Shipment Stage. Storage_ Transport Event. Transport Event
     * <p>
     * The storage of goods in this shipment stage.
     * 
     */
    @JsonProperty("StorageTransportEvent")
    public void setStorageTransportEvent(List<TransportEvent> storageTransportEvent) {
        this.storageTransportEvent = storageTransportEvent;
    }

    public ShipmentStage withStorageTransportEvent(List<TransportEvent> storageTransportEvent) {
        this.storageTransportEvent = storageTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Acceptance_ Transport Event. Transport Event
     * <p>
     * The acceptance of goods in this shipment stage.
     * 
     */
    @JsonProperty("AcceptanceTransportEvent")
    public List<TransportEvent> getAcceptanceTransportEvent() {
        return acceptanceTransportEvent;
    }

    /**
     * Shipment Stage. Acceptance_ Transport Event. Transport Event
     * <p>
     * The acceptance of goods in this shipment stage.
     * 
     */
    @JsonProperty("AcceptanceTransportEvent")
    public void setAcceptanceTransportEvent(List<TransportEvent> acceptanceTransportEvent) {
        this.acceptanceTransportEvent = acceptanceTransportEvent;
    }

    public ShipmentStage withAcceptanceTransportEvent(List<TransportEvent> acceptanceTransportEvent) {
        this.acceptanceTransportEvent = acceptanceTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Terminal Operator_ Party. Party
     * <p>
     * A terminal operator associated with this shipment stage.
     * 
     */
    @JsonProperty("TerminalOperatorParty")
    public List<Party> getTerminalOperatorParty() {
        return terminalOperatorParty;
    }

    /**
     * Shipment Stage. Terminal Operator_ Party. Party
     * <p>
     * A terminal operator associated with this shipment stage.
     * 
     */
    @JsonProperty("TerminalOperatorParty")
    public void setTerminalOperatorParty(List<Party> terminalOperatorParty) {
        this.terminalOperatorParty = terminalOperatorParty;
    }

    public ShipmentStage withTerminalOperatorParty(List<Party> terminalOperatorParty) {
        this.terminalOperatorParty = terminalOperatorParty;
        return this;
    }

    /**
     * Shipment Stage. Customs Agent_ Party. Party
     * <p>
     * A customs agent associated with this shipment stage.
     * 
     */
    @JsonProperty("CustomsAgentParty")
    public List<Party> getCustomsAgentParty() {
        return customsAgentParty;
    }

    /**
     * Shipment Stage. Customs Agent_ Party. Party
     * <p>
     * A customs agent associated with this shipment stage.
     * 
     */
    @JsonProperty("CustomsAgentParty")
    public void setCustomsAgentParty(List<Party> customsAgentParty) {
        this.customsAgentParty = customsAgentParty;
    }

    public ShipmentStage withCustomsAgentParty(List<Party> customsAgentParty) {
        this.customsAgentParty = customsAgentParty;
        return this;
    }

    /**
     * Shipment Stage. Estimated Transit_ Period. Period
     * <p>
     * The estimated transit period of this shipment stage.
     * 
     */
    @JsonProperty("EstimatedTransitPeriod")
    public List<Period> getEstimatedTransitPeriod() {
        return estimatedTransitPeriod;
    }

    /**
     * Shipment Stage. Estimated Transit_ Period. Period
     * <p>
     * The estimated transit period of this shipment stage.
     * 
     */
    @JsonProperty("EstimatedTransitPeriod")
    public void setEstimatedTransitPeriod(List<Period> estimatedTransitPeriod) {
        this.estimatedTransitPeriod = estimatedTransitPeriod;
    }

    public ShipmentStage withEstimatedTransitPeriod(List<Period> estimatedTransitPeriod) {
        this.estimatedTransitPeriod = estimatedTransitPeriod;
        return this;
    }

    /**
     * Shipment Stage. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A freight allowance charge for this shipment stage.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public List<AllowanceCharge> getFreightAllowanceCharge() {
        return freightAllowanceCharge;
    }

    /**
     * Shipment Stage. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A freight allowance charge for this shipment stage.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public void setFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
    }

    public ShipmentStage withFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
        return this;
    }

    /**
     * Shipment Stage. Freight Charge_ Location. Location
     * <p>
     * The location associated with a freight charge related to this shipment stage.
     * 
     */
    @JsonProperty("FreightChargeLocation")
    public List<Location> getFreightChargeLocation() {
        return freightChargeLocation;
    }

    /**
     * Shipment Stage. Freight Charge_ Location. Location
     * <p>
     * The location associated with a freight charge related to this shipment stage.
     * 
     */
    @JsonProperty("FreightChargeLocation")
    public void setFreightChargeLocation(List<Location> freightChargeLocation) {
        this.freightChargeLocation = freightChargeLocation;
    }

    public ShipmentStage withFreightChargeLocation(List<Location> freightChargeLocation) {
        this.freightChargeLocation = freightChargeLocation;
        return this;
    }

    /**
     * Shipment Stage. Detention_ Transport Event. Transport Event
     * <p>
     * The detention of a transport means during loading and unloading operations.
     * 
     */
    @JsonProperty("DetentionTransportEvent")
    public List<TransportEvent> getDetentionTransportEvent() {
        return detentionTransportEvent;
    }

    /**
     * Shipment Stage. Detention_ Transport Event. Transport Event
     * <p>
     * The detention of a transport means during loading and unloading operations.
     * 
     */
    @JsonProperty("DetentionTransportEvent")
    public void setDetentionTransportEvent(List<TransportEvent> detentionTransportEvent) {
        this.detentionTransportEvent = detentionTransportEvent;
    }

    public ShipmentStage withDetentionTransportEvent(List<TransportEvent> detentionTransportEvent) {
        this.detentionTransportEvent = detentionTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Requested Departure_ Transport Event. Transport Event
     * <p>
     * The departure requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedDepartureTransportEvent")
    public List<TransportEvent> getRequestedDepartureTransportEvent() {
        return requestedDepartureTransportEvent;
    }

    /**
     * Shipment Stage. Requested Departure_ Transport Event. Transport Event
     * <p>
     * The departure requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedDepartureTransportEvent")
    public void setRequestedDepartureTransportEvent(List<TransportEvent> requestedDepartureTransportEvent) {
        this.requestedDepartureTransportEvent = requestedDepartureTransportEvent;
    }

    public ShipmentStage withRequestedDepartureTransportEvent(List<TransportEvent> requestedDepartureTransportEvent) {
        this.requestedDepartureTransportEvent = requestedDepartureTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Requested Arrival_ Transport Event. Transport Event
     * <p>
     * The arrival requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedArrivalTransportEvent")
    public List<TransportEvent> getRequestedArrivalTransportEvent() {
        return requestedArrivalTransportEvent;
    }

    /**
     * Shipment Stage. Requested Arrival_ Transport Event. Transport Event
     * <p>
     * The arrival requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedArrivalTransportEvent")
    public void setRequestedArrivalTransportEvent(List<TransportEvent> requestedArrivalTransportEvent) {
        this.requestedArrivalTransportEvent = requestedArrivalTransportEvent;
    }

    public ShipmentStage withRequestedArrivalTransportEvent(List<TransportEvent> requestedArrivalTransportEvent) {
        this.requestedArrivalTransportEvent = requestedArrivalTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Requested Waypoint_ Transport Event. Transport Event
     * <p>
     * A waypoint requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedWaypointTransportEvent")
    public List<TransportEvent> getRequestedWaypointTransportEvent() {
        return requestedWaypointTransportEvent;
    }

    /**
     * Shipment Stage. Requested Waypoint_ Transport Event. Transport Event
     * <p>
     * A waypoint requested by the party requesting a transportation service.
     * 
     */
    @JsonProperty("RequestedWaypointTransportEvent")
    public void setRequestedWaypointTransportEvent(List<TransportEvent> requestedWaypointTransportEvent) {
        this.requestedWaypointTransportEvent = requestedWaypointTransportEvent;
    }

    public ShipmentStage withRequestedWaypointTransportEvent(List<TransportEvent> requestedWaypointTransportEvent) {
        this.requestedWaypointTransportEvent = requestedWaypointTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Planned Departure_ Transport Event. Transport Event
     * <p>
     * The departure planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedDepartureTransportEvent")
    public List<TransportEvent> getPlannedDepartureTransportEvent() {
        return plannedDepartureTransportEvent;
    }

    /**
     * Shipment Stage. Planned Departure_ Transport Event. Transport Event
     * <p>
     * The departure planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedDepartureTransportEvent")
    public void setPlannedDepartureTransportEvent(List<TransportEvent> plannedDepartureTransportEvent) {
        this.plannedDepartureTransportEvent = plannedDepartureTransportEvent;
    }

    public ShipmentStage withPlannedDepartureTransportEvent(List<TransportEvent> plannedDepartureTransportEvent) {
        this.plannedDepartureTransportEvent = plannedDepartureTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Planned Arrival_ Transport Event. Transport Event
     * <p>
     * The arrival planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedArrivalTransportEvent")
    public List<TransportEvent> getPlannedArrivalTransportEvent() {
        return plannedArrivalTransportEvent;
    }

    /**
     * Shipment Stage. Planned Arrival_ Transport Event. Transport Event
     * <p>
     * The arrival planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedArrivalTransportEvent")
    public void setPlannedArrivalTransportEvent(List<TransportEvent> plannedArrivalTransportEvent) {
        this.plannedArrivalTransportEvent = plannedArrivalTransportEvent;
    }

    public ShipmentStage withPlannedArrivalTransportEvent(List<TransportEvent> plannedArrivalTransportEvent) {
        this.plannedArrivalTransportEvent = plannedArrivalTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Planned Waypoint_ Transport Event. Transport Event
     * <p>
     * A waypoint planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedWaypointTransportEvent")
    public List<TransportEvent> getPlannedWaypointTransportEvent() {
        return plannedWaypointTransportEvent;
    }

    /**
     * Shipment Stage. Planned Waypoint_ Transport Event. Transport Event
     * <p>
     * A waypoint planned by the party providing a transportation service.
     * 
     */
    @JsonProperty("PlannedWaypointTransportEvent")
    public void setPlannedWaypointTransportEvent(List<TransportEvent> plannedWaypointTransportEvent) {
        this.plannedWaypointTransportEvent = plannedWaypointTransportEvent;
    }

    public ShipmentStage withPlannedWaypointTransportEvent(List<TransportEvent> plannedWaypointTransportEvent) {
        this.plannedWaypointTransportEvent = plannedWaypointTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Actual Departure_ Transport Event. Transport Event
     * <p>
     * The actual departure from a specific location during a transportation service.
     * 
     */
    @JsonProperty("ActualDepartureTransportEvent")
    public List<TransportEvent> getActualDepartureTransportEvent() {
        return actualDepartureTransportEvent;
    }

    /**
     * Shipment Stage. Actual Departure_ Transport Event. Transport Event
     * <p>
     * The actual departure from a specific location during a transportation service.
     * 
     */
    @JsonProperty("ActualDepartureTransportEvent")
    public void setActualDepartureTransportEvent(List<TransportEvent> actualDepartureTransportEvent) {
        this.actualDepartureTransportEvent = actualDepartureTransportEvent;
    }

    public ShipmentStage withActualDepartureTransportEvent(List<TransportEvent> actualDepartureTransportEvent) {
        this.actualDepartureTransportEvent = actualDepartureTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Actual Waypoint_ Transport Event. Transport Event
     * <p>
     * The location of an actual waypoint during a transportation service.
     * 
     */
    @JsonProperty("ActualWaypointTransportEvent")
    public List<TransportEvent> getActualWaypointTransportEvent() {
        return actualWaypointTransportEvent;
    }

    /**
     * Shipment Stage. Actual Waypoint_ Transport Event. Transport Event
     * <p>
     * The location of an actual waypoint during a transportation service.
     * 
     */
    @JsonProperty("ActualWaypointTransportEvent")
    public void setActualWaypointTransportEvent(List<TransportEvent> actualWaypointTransportEvent) {
        this.actualWaypointTransportEvent = actualWaypointTransportEvent;
    }

    public ShipmentStage withActualWaypointTransportEvent(List<TransportEvent> actualWaypointTransportEvent) {
        this.actualWaypointTransportEvent = actualWaypointTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Actual Arrival_ Transport Event. Transport Event
     * <p>
     * The actual arrival at a specific location during a transportation service.
     * 
     */
    @JsonProperty("ActualArrivalTransportEvent")
    public List<TransportEvent> getActualArrivalTransportEvent() {
        return actualArrivalTransportEvent;
    }

    /**
     * Shipment Stage. Actual Arrival_ Transport Event. Transport Event
     * <p>
     * The actual arrival at a specific location during a transportation service.
     * 
     */
    @JsonProperty("ActualArrivalTransportEvent")
    public void setActualArrivalTransportEvent(List<TransportEvent> actualArrivalTransportEvent) {
        this.actualArrivalTransportEvent = actualArrivalTransportEvent;
    }

    public ShipmentStage withActualArrivalTransportEvent(List<TransportEvent> actualArrivalTransportEvent) {
        this.actualArrivalTransportEvent = actualArrivalTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Transport Event
     * <p>
     * A significant occurrence in the course of this shipment of goods.
     * 
     */
    @JsonProperty("TransportEvent")
    public List<TransportEvent> getTransportEvent() {
        return transportEvent;
    }

    /**
     * Shipment Stage. Transport Event
     * <p>
     * A significant occurrence in the course of this shipment of goods.
     * 
     */
    @JsonProperty("TransportEvent")
    public void setTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
    }

    public ShipmentStage withTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
        return this;
    }

    /**
     * Shipment Stage. Estimated Departure_ Transport Event. Transport Event
     * <p>
     * Describes an estimated departure at a location during a transport service.
     * 
     */
    @JsonProperty("EstimatedDepartureTransportEvent")
    public List<TransportEvent> getEstimatedDepartureTransportEvent() {
        return estimatedDepartureTransportEvent;
    }

    /**
     * Shipment Stage. Estimated Departure_ Transport Event. Transport Event
     * <p>
     * Describes an estimated departure at a location during a transport service.
     * 
     */
    @JsonProperty("EstimatedDepartureTransportEvent")
    public void setEstimatedDepartureTransportEvent(List<TransportEvent> estimatedDepartureTransportEvent) {
        this.estimatedDepartureTransportEvent = estimatedDepartureTransportEvent;
    }

    public ShipmentStage withEstimatedDepartureTransportEvent(List<TransportEvent> estimatedDepartureTransportEvent) {
        this.estimatedDepartureTransportEvent = estimatedDepartureTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Estimated Arrival_ Transport Event. Transport Event
     * <p>
     * Describes an estimated arrival at a location during a transport service.
     * 
     */
    @JsonProperty("EstimatedArrivalTransportEvent")
    public List<TransportEvent> getEstimatedArrivalTransportEvent() {
        return estimatedArrivalTransportEvent;
    }

    /**
     * Shipment Stage. Estimated Arrival_ Transport Event. Transport Event
     * <p>
     * Describes an estimated arrival at a location during a transport service.
     * 
     */
    @JsonProperty("EstimatedArrivalTransportEvent")
    public void setEstimatedArrivalTransportEvent(List<TransportEvent> estimatedArrivalTransportEvent) {
        this.estimatedArrivalTransportEvent = estimatedArrivalTransportEvent;
    }

    public ShipmentStage withEstimatedArrivalTransportEvent(List<TransportEvent> estimatedArrivalTransportEvent) {
        this.estimatedArrivalTransportEvent = estimatedArrivalTransportEvent;
        return this;
    }

    /**
     * Shipment Stage. Passenger_ Person. Person
     * <p>
     * A person who travels in a conveyance without participating in its operation.
     * 
     */
    @JsonProperty("PassengerPerson")
    public List<Person> getPassengerPerson() {
        return passengerPerson;
    }

    /**
     * Shipment Stage. Passenger_ Person. Person
     * <p>
     * A person who travels in a conveyance without participating in its operation.
     * 
     */
    @JsonProperty("PassengerPerson")
    public void setPassengerPerson(List<Person> passengerPerson) {
        this.passengerPerson = passengerPerson;
    }

    public ShipmentStage withPassengerPerson(List<Person> passengerPerson) {
        this.passengerPerson = passengerPerson;
        return this;
    }

    /**
     * Shipment Stage. Driver_ Person. Person
     * <p>
     * Describes a person responsible for driving the transport means.
     * 
     */
    @JsonProperty("DriverPerson")
    public List<Person> getDriverPerson() {
        return driverPerson;
    }

    /**
     * Shipment Stage. Driver_ Person. Person
     * <p>
     * Describes a person responsible for driving the transport means.
     * 
     */
    @JsonProperty("DriverPerson")
    public void setDriverPerson(List<Person> driverPerson) {
        this.driverPerson = driverPerson;
    }

    public ShipmentStage withDriverPerson(List<Person> driverPerson) {
        this.driverPerson = driverPerson;
        return this;
    }

    /**
     * Shipment Stage. Reporting_ Person. Person
     * <p>
     * Describes a person being responsible for providing the required administrative reporting relating to a transport.
     * 
     */
    @JsonProperty("ReportingPerson")
    public List<Person> getReportingPerson() {
        return reportingPerson;
    }

    /**
     * Shipment Stage. Reporting_ Person. Person
     * <p>
     * Describes a person being responsible for providing the required administrative reporting relating to a transport.
     * 
     */
    @JsonProperty("ReportingPerson")
    public void setReportingPerson(List<Person> reportingPerson) {
        this.reportingPerson = reportingPerson;
    }

    public ShipmentStage withReportingPerson(List<Person> reportingPerson) {
        this.reportingPerson = reportingPerson;
        return this;
    }

    /**
     * Shipment Stage. Crew Member_ Person. Person
     * <p>
     * A person operating or serving aboard a transport means.
     * 
     */
    @JsonProperty("CrewMemberPerson")
    public List<Person> getCrewMemberPerson() {
        return crewMemberPerson;
    }

    /**
     * Shipment Stage. Crew Member_ Person. Person
     * <p>
     * A person operating or serving aboard a transport means.
     * 
     */
    @JsonProperty("CrewMemberPerson")
    public void setCrewMemberPerson(List<Person> crewMemberPerson) {
        this.crewMemberPerson = crewMemberPerson;
    }

    public ShipmentStage withCrewMemberPerson(List<Person> crewMemberPerson) {
        this.crewMemberPerson = crewMemberPerson;
        return this;
    }

    /**
     * Shipment Stage. Security Officer_ Person. Person
     * <p>
     * The person on board the vessel, accountable to the master, designated by the company as responsible for the security of the ship, including implementation and maintenance of the ship security plan and for the liaison with the company security officer and the port facility security officers.
     * 
     */
    @JsonProperty("SecurityOfficerPerson")
    public List<Person> getSecurityOfficerPerson() {
        return securityOfficerPerson;
    }

    /**
     * Shipment Stage. Security Officer_ Person. Person
     * <p>
     * The person on board the vessel, accountable to the master, designated by the company as responsible for the security of the ship, including implementation and maintenance of the ship security plan and for the liaison with the company security officer and the port facility security officers.
     * 
     */
    @JsonProperty("SecurityOfficerPerson")
    public void setSecurityOfficerPerson(List<Person> securityOfficerPerson) {
        this.securityOfficerPerson = securityOfficerPerson;
    }

    public ShipmentStage withSecurityOfficerPerson(List<Person> securityOfficerPerson) {
        this.securityOfficerPerson = securityOfficerPerson;
        return this;
    }

    /**
     * Shipment Stage. Master_ Person. Person
     * <p>
     * The person responsible for the ship's safe and efficient operation, including cargo operations, navigation, crew management and for ensuring that the vessel complies with local and international laws, as well as company and flag state policies.
     * 
     */
    @JsonProperty("MasterPerson")
    public List<Person> getMasterPerson() {
        return masterPerson;
    }

    /**
     * Shipment Stage. Master_ Person. Person
     * <p>
     * The person responsible for the ship's safe and efficient operation, including cargo operations, navigation, crew management and for ensuring that the vessel complies with local and international laws, as well as company and flag state policies.
     * 
     */
    @JsonProperty("MasterPerson")
    public void setMasterPerson(List<Person> masterPerson) {
        this.masterPerson = masterPerson;
    }

    public ShipmentStage withMasterPerson(List<Person> masterPerson) {
        this.masterPerson = masterPerson;
        return this;
    }

    /**
     * Shipment Stage. Ships Surgeon_ Person. Person
     * <p>
     * The person responsible for the health of the people aboard a ship at sea.
     * 
     */
    @JsonProperty("ShipsSurgeonPerson")
    public List<Person> getShipsSurgeonPerson() {
        return shipsSurgeonPerson;
    }

    /**
     * Shipment Stage. Ships Surgeon_ Person. Person
     * <p>
     * The person responsible for the health of the people aboard a ship at sea.
     * 
     */
    @JsonProperty("ShipsSurgeonPerson")
    public void setShipsSurgeonPerson(List<Person> shipsSurgeonPerson) {
        this.shipsSurgeonPerson = shipsSurgeonPerson;
    }

    public ShipmentStage withShipsSurgeonPerson(List<Person> shipsSurgeonPerson) {
        this.shipsSurgeonPerson = shipsSurgeonPerson;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShipmentStage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("transportModeCode");
        sb.append('=');
        sb.append(((this.transportModeCode == null)?"<null>":this.transportModeCode));
        sb.append(',');
        sb.append("transportMeansTypeCode");
        sb.append('=');
        sb.append(((this.transportMeansTypeCode == null)?"<null>":this.transportMeansTypeCode));
        sb.append(',');
        sb.append("transitDirectionCode");
        sb.append('=');
        sb.append(((this.transitDirectionCode == null)?"<null>":this.transitDirectionCode));
        sb.append(',');
        sb.append("preCarriageIndicator");
        sb.append('=');
        sb.append(((this.preCarriageIndicator == null)?"<null>":this.preCarriageIndicator));
        sb.append(',');
        sb.append("onCarriageIndicator");
        sb.append('=');
        sb.append(((this.onCarriageIndicator == null)?"<null>":this.onCarriageIndicator));
        sb.append(',');
        sb.append("estimatedDeliveryDate");
        sb.append('=');
        sb.append(((this.estimatedDeliveryDate == null)?"<null>":this.estimatedDeliveryDate));
        sb.append(',');
        sb.append("estimatedDeliveryTime");
        sb.append('=');
        sb.append(((this.estimatedDeliveryTime == null)?"<null>":this.estimatedDeliveryTime));
        sb.append(',');
        sb.append("requiredDeliveryDate");
        sb.append('=');
        sb.append(((this.requiredDeliveryDate == null)?"<null>":this.requiredDeliveryDate));
        sb.append(',');
        sb.append("requiredDeliveryTime");
        sb.append('=');
        sb.append(((this.requiredDeliveryTime == null)?"<null>":this.requiredDeliveryTime));
        sb.append(',');
        sb.append("loadingSequenceID");
        sb.append('=');
        sb.append(((this.loadingSequenceID == null)?"<null>":this.loadingSequenceID));
        sb.append(',');
        sb.append("successiveSequenceID");
        sb.append('=');
        sb.append(((this.successiveSequenceID == null)?"<null>":this.successiveSequenceID));
        sb.append(',');
        sb.append("instructions");
        sb.append('=');
        sb.append(((this.instructions == null)?"<null>":this.instructions));
        sb.append(',');
        sb.append("demurrageInstructions");
        sb.append('=');
        sb.append(((this.demurrageInstructions == null)?"<null>":this.demurrageInstructions));
        sb.append(',');
        sb.append("crewQuantity");
        sb.append('=');
        sb.append(((this.crewQuantity == null)?"<null>":this.crewQuantity));
        sb.append(',');
        sb.append("passengerQuantity");
        sb.append('=');
        sb.append(((this.passengerQuantity == null)?"<null>":this.passengerQuantity));
        sb.append(',');
        sb.append("transitPeriod");
        sb.append('=');
        sb.append(((this.transitPeriod == null)?"<null>":this.transitPeriod));
        sb.append(',');
        sb.append("carrierParty");
        sb.append('=');
        sb.append(((this.carrierParty == null)?"<null>":this.carrierParty));
        sb.append(',');
        sb.append("transportMeans");
        sb.append('=');
        sb.append(((this.transportMeans == null)?"<null>":this.transportMeans));
        sb.append(',');
        sb.append("loadingPortLocation");
        sb.append('=');
        sb.append(((this.loadingPortLocation == null)?"<null>":this.loadingPortLocation));
        sb.append(',');
        sb.append("unloadingPortLocation");
        sb.append('=');
        sb.append(((this.unloadingPortLocation == null)?"<null>":this.unloadingPortLocation));
        sb.append(',');
        sb.append("transshipPortLocation");
        sb.append('=');
        sb.append(((this.transshipPortLocation == null)?"<null>":this.transshipPortLocation));
        sb.append(',');
        sb.append("loadingTransportEvent");
        sb.append('=');
        sb.append(((this.loadingTransportEvent == null)?"<null>":this.loadingTransportEvent));
        sb.append(',');
        sb.append("examinationTransportEvent");
        sb.append('=');
        sb.append(((this.examinationTransportEvent == null)?"<null>":this.examinationTransportEvent));
        sb.append(',');
        sb.append("availabilityTransportEvent");
        sb.append('=');
        sb.append(((this.availabilityTransportEvent == null)?"<null>":this.availabilityTransportEvent));
        sb.append(',');
        sb.append("exportationTransportEvent");
        sb.append('=');
        sb.append(((this.exportationTransportEvent == null)?"<null>":this.exportationTransportEvent));
        sb.append(',');
        sb.append("dischargeTransportEvent");
        sb.append('=');
        sb.append(((this.dischargeTransportEvent == null)?"<null>":this.dischargeTransportEvent));
        sb.append(',');
        sb.append("warehousingTransportEvent");
        sb.append('=');
        sb.append(((this.warehousingTransportEvent == null)?"<null>":this.warehousingTransportEvent));
        sb.append(',');
        sb.append("takeoverTransportEvent");
        sb.append('=');
        sb.append(((this.takeoverTransportEvent == null)?"<null>":this.takeoverTransportEvent));
        sb.append(',');
        sb.append("optionalTakeoverTransportEvent");
        sb.append('=');
        sb.append(((this.optionalTakeoverTransportEvent == null)?"<null>":this.optionalTakeoverTransportEvent));
        sb.append(',');
        sb.append("dropoffTransportEvent");
        sb.append('=');
        sb.append(((this.dropoffTransportEvent == null)?"<null>":this.dropoffTransportEvent));
        sb.append(',');
        sb.append("actualPickupTransportEvent");
        sb.append('=');
        sb.append(((this.actualPickupTransportEvent == null)?"<null>":this.actualPickupTransportEvent));
        sb.append(',');
        sb.append("deliveryTransportEvent");
        sb.append('=');
        sb.append(((this.deliveryTransportEvent == null)?"<null>":this.deliveryTransportEvent));
        sb.append(',');
        sb.append("receiptTransportEvent");
        sb.append('=');
        sb.append(((this.receiptTransportEvent == null)?"<null>":this.receiptTransportEvent));
        sb.append(',');
        sb.append("storageTransportEvent");
        sb.append('=');
        sb.append(((this.storageTransportEvent == null)?"<null>":this.storageTransportEvent));
        sb.append(',');
        sb.append("acceptanceTransportEvent");
        sb.append('=');
        sb.append(((this.acceptanceTransportEvent == null)?"<null>":this.acceptanceTransportEvent));
        sb.append(',');
        sb.append("terminalOperatorParty");
        sb.append('=');
        sb.append(((this.terminalOperatorParty == null)?"<null>":this.terminalOperatorParty));
        sb.append(',');
        sb.append("customsAgentParty");
        sb.append('=');
        sb.append(((this.customsAgentParty == null)?"<null>":this.customsAgentParty));
        sb.append(',');
        sb.append("estimatedTransitPeriod");
        sb.append('=');
        sb.append(((this.estimatedTransitPeriod == null)?"<null>":this.estimatedTransitPeriod));
        sb.append(',');
        sb.append("freightAllowanceCharge");
        sb.append('=');
        sb.append(((this.freightAllowanceCharge == null)?"<null>":this.freightAllowanceCharge));
        sb.append(',');
        sb.append("freightChargeLocation");
        sb.append('=');
        sb.append(((this.freightChargeLocation == null)?"<null>":this.freightChargeLocation));
        sb.append(',');
        sb.append("detentionTransportEvent");
        sb.append('=');
        sb.append(((this.detentionTransportEvent == null)?"<null>":this.detentionTransportEvent));
        sb.append(',');
        sb.append("requestedDepartureTransportEvent");
        sb.append('=');
        sb.append(((this.requestedDepartureTransportEvent == null)?"<null>":this.requestedDepartureTransportEvent));
        sb.append(',');
        sb.append("requestedArrivalTransportEvent");
        sb.append('=');
        sb.append(((this.requestedArrivalTransportEvent == null)?"<null>":this.requestedArrivalTransportEvent));
        sb.append(',');
        sb.append("requestedWaypointTransportEvent");
        sb.append('=');
        sb.append(((this.requestedWaypointTransportEvent == null)?"<null>":this.requestedWaypointTransportEvent));
        sb.append(',');
        sb.append("plannedDepartureTransportEvent");
        sb.append('=');
        sb.append(((this.plannedDepartureTransportEvent == null)?"<null>":this.plannedDepartureTransportEvent));
        sb.append(',');
        sb.append("plannedArrivalTransportEvent");
        sb.append('=');
        sb.append(((this.plannedArrivalTransportEvent == null)?"<null>":this.plannedArrivalTransportEvent));
        sb.append(',');
        sb.append("plannedWaypointTransportEvent");
        sb.append('=');
        sb.append(((this.plannedWaypointTransportEvent == null)?"<null>":this.plannedWaypointTransportEvent));
        sb.append(',');
        sb.append("actualDepartureTransportEvent");
        sb.append('=');
        sb.append(((this.actualDepartureTransportEvent == null)?"<null>":this.actualDepartureTransportEvent));
        sb.append(',');
        sb.append("actualWaypointTransportEvent");
        sb.append('=');
        sb.append(((this.actualWaypointTransportEvent == null)?"<null>":this.actualWaypointTransportEvent));
        sb.append(',');
        sb.append("actualArrivalTransportEvent");
        sb.append('=');
        sb.append(((this.actualArrivalTransportEvent == null)?"<null>":this.actualArrivalTransportEvent));
        sb.append(',');
        sb.append("transportEvent");
        sb.append('=');
        sb.append(((this.transportEvent == null)?"<null>":this.transportEvent));
        sb.append(',');
        sb.append("estimatedDepartureTransportEvent");
        sb.append('=');
        sb.append(((this.estimatedDepartureTransportEvent == null)?"<null>":this.estimatedDepartureTransportEvent));
        sb.append(',');
        sb.append("estimatedArrivalTransportEvent");
        sb.append('=');
        sb.append(((this.estimatedArrivalTransportEvent == null)?"<null>":this.estimatedArrivalTransportEvent));
        sb.append(',');
        sb.append("passengerPerson");
        sb.append('=');
        sb.append(((this.passengerPerson == null)?"<null>":this.passengerPerson));
        sb.append(',');
        sb.append("driverPerson");
        sb.append('=');
        sb.append(((this.driverPerson == null)?"<null>":this.driverPerson));
        sb.append(',');
        sb.append("reportingPerson");
        sb.append('=');
        sb.append(((this.reportingPerson == null)?"<null>":this.reportingPerson));
        sb.append(',');
        sb.append("crewMemberPerson");
        sb.append('=');
        sb.append(((this.crewMemberPerson == null)?"<null>":this.crewMemberPerson));
        sb.append(',');
        sb.append("securityOfficerPerson");
        sb.append('=');
        sb.append(((this.securityOfficerPerson == null)?"<null>":this.securityOfficerPerson));
        sb.append(',');
        sb.append("masterPerson");
        sb.append('=');
        sb.append(((this.masterPerson == null)?"<null>":this.masterPerson));
        sb.append(',');
        sb.append("shipsSurgeonPerson");
        sb.append('=');
        sb.append(((this.shipsSurgeonPerson == null)?"<null>":this.shipsSurgeonPerson));
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
        result = ((result* 31)+((this.preCarriageIndicator == null)? 0 :this.preCarriageIndicator.hashCode()));
        result = ((result* 31)+((this.unloadingPortLocation == null)? 0 :this.unloadingPortLocation.hashCode()));
        result = ((result* 31)+((this.estimatedDeliveryTime == null)? 0 :this.estimatedDeliveryTime.hashCode()));
        result = ((result* 31)+((this.transitDirectionCode == null)? 0 :this.transitDirectionCode.hashCode()));
        result = ((result* 31)+((this.plannedWaypointTransportEvent == null)? 0 :this.plannedWaypointTransportEvent.hashCode()));
        result = ((result* 31)+((this.transportEvent == null)? 0 :this.transportEvent.hashCode()));
        result = ((result* 31)+((this.storageTransportEvent == null)? 0 :this.storageTransportEvent.hashCode()));
        result = ((result* 31)+((this.transportMeansTypeCode == null)? 0 :this.transportMeansTypeCode.hashCode()));
        result = ((result* 31)+((this.freightChargeLocation == null)? 0 :this.freightChargeLocation.hashCode()));
        result = ((result* 31)+((this.transitPeriod == null)? 0 :this.transitPeriod.hashCode()));
        result = ((result* 31)+((this.driverPerson == null)? 0 :this.driverPerson.hashCode()));
        result = ((result* 31)+((this.requestedDepartureTransportEvent == null)? 0 :this.requestedDepartureTransportEvent.hashCode()));
        result = ((result* 31)+((this.exportationTransportEvent == null)? 0 :this.exportationTransportEvent.hashCode()));
        result = ((result* 31)+((this.carrierParty == null)? 0 :this.carrierParty.hashCode()));
        result = ((result* 31)+((this.crewQuantity == null)? 0 :this.crewQuantity.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.freightAllowanceCharge == null)? 0 :this.freightAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.optionalTakeoverTransportEvent == null)? 0 :this.optionalTakeoverTransportEvent.hashCode()));
        result = ((result* 31)+((this.securityOfficerPerson == null)? 0 :this.securityOfficerPerson.hashCode()));
        result = ((result* 31)+((this.estimatedDepartureTransportEvent == null)? 0 :this.estimatedDepartureTransportEvent.hashCode()));
        result = ((result* 31)+((this.passengerPerson == null)? 0 :this.passengerPerson.hashCode()));
        result = ((result* 31)+((this.masterPerson == null)? 0 :this.masterPerson.hashCode()));
        result = ((result* 31)+((this.requestedWaypointTransportEvent == null)? 0 :this.requestedWaypointTransportEvent.hashCode()));
        result = ((result* 31)+((this.examinationTransportEvent == null)? 0 :this.examinationTransportEvent.hashCode()));
        result = ((result* 31)+((this.availabilityTransportEvent == null)? 0 :this.availabilityTransportEvent.hashCode()));
        result = ((result* 31)+((this.estimatedDeliveryDate == null)? 0 :this.estimatedDeliveryDate.hashCode()));
        result = ((result* 31)+((this.warehousingTransportEvent == null)? 0 :this.warehousingTransportEvent.hashCode()));
        result = ((result* 31)+((this.shipsSurgeonPerson == null)? 0 :this.shipsSurgeonPerson.hashCode()));
        result = ((result* 31)+((this.detentionTransportEvent == null)? 0 :this.detentionTransportEvent.hashCode()));
        result = ((result* 31)+((this.loadingSequenceID == null)? 0 :this.loadingSequenceID.hashCode()));
        result = ((result* 31)+((this.transshipPortLocation == null)? 0 :this.transshipPortLocation.hashCode()));
        result = ((result* 31)+((this.terminalOperatorParty == null)? 0 :this.terminalOperatorParty.hashCode()));
        result = ((result* 31)+((this.customsAgentParty == null)? 0 :this.customsAgentParty.hashCode()));
        result = ((result* 31)+((this.successiveSequenceID == null)? 0 :this.successiveSequenceID.hashCode()));
        result = ((result* 31)+((this.loadingPortLocation == null)? 0 :this.loadingPortLocation.hashCode()));
        result = ((result* 31)+((this.actualDepartureTransportEvent == null)? 0 :this.actualDepartureTransportEvent.hashCode()));
        result = ((result* 31)+((this.estimatedArrivalTransportEvent == null)? 0 :this.estimatedArrivalTransportEvent.hashCode()));
        result = ((result* 31)+((this.plannedDepartureTransportEvent == null)? 0 :this.plannedDepartureTransportEvent.hashCode()));
        result = ((result* 31)+((this.dropoffTransportEvent == null)? 0 :this.dropoffTransportEvent.hashCode()));
        result = ((result* 31)+((this.transportMeans == null)? 0 :this.transportMeans.hashCode()));
        result = ((result* 31)+((this.reportingPerson == null)? 0 :this.reportingPerson.hashCode()));
        result = ((result* 31)+((this.transportModeCode == null)? 0 :this.transportModeCode.hashCode()));
        result = ((result* 31)+((this.passengerQuantity == null)? 0 :this.passengerQuantity.hashCode()));
        result = ((result* 31)+((this.actualArrivalTransportEvent == null)? 0 :this.actualArrivalTransportEvent.hashCode()));
        result = ((result* 31)+((this.requestedArrivalTransportEvent == null)? 0 :this.requestedArrivalTransportEvent.hashCode()));
        result = ((result* 31)+((this.actualWaypointTransportEvent == null)? 0 :this.actualWaypointTransportEvent.hashCode()));
        result = ((result* 31)+((this.takeoverTransportEvent == null)? 0 :this.takeoverTransportEvent.hashCode()));
        result = ((result* 31)+((this.demurrageInstructions == null)? 0 :this.demurrageInstructions.hashCode()));
        result = ((result* 31)+((this.requiredDeliveryTime == null)? 0 :this.requiredDeliveryTime.hashCode()));
        result = ((result* 31)+((this.actualPickupTransportEvent == null)? 0 :this.actualPickupTransportEvent.hashCode()));
        result = ((result* 31)+((this.receiptTransportEvent == null)? 0 :this.receiptTransportEvent.hashCode()));
        result = ((result* 31)+((this.crewMemberPerson == null)? 0 :this.crewMemberPerson.hashCode()));
        result = ((result* 31)+((this.plannedArrivalTransportEvent == null)? 0 :this.plannedArrivalTransportEvent.hashCode()));
        result = ((result* 31)+((this.estimatedTransitPeriod == null)? 0 :this.estimatedTransitPeriod.hashCode()));
        result = ((result* 31)+((this.loadingTransportEvent == null)? 0 :this.loadingTransportEvent.hashCode()));
        result = ((result* 31)+((this.deliveryTransportEvent == null)? 0 :this.deliveryTransportEvent.hashCode()));
        result = ((result* 31)+((this.requiredDeliveryDate == null)? 0 :this.requiredDeliveryDate.hashCode()));
        result = ((result* 31)+((this.onCarriageIndicator == null)? 0 :this.onCarriageIndicator.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.dischargeTransportEvent == null)? 0 :this.dischargeTransportEvent.hashCode()));
        result = ((result* 31)+((this.acceptanceTransportEvent == null)? 0 :this.acceptanceTransportEvent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShipmentStage) == false) {
            return false;
        }
        ShipmentStage rhs = ((ShipmentStage) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.instructions == rhs.instructions)||((this.instructions!= null)&&this.instructions.equals(rhs.instructions)))&&((this.preCarriageIndicator == rhs.preCarriageIndicator)||((this.preCarriageIndicator!= null)&&this.preCarriageIndicator.equals(rhs.preCarriageIndicator))))&&((this.unloadingPortLocation == rhs.unloadingPortLocation)||((this.unloadingPortLocation!= null)&&this.unloadingPortLocation.equals(rhs.unloadingPortLocation))))&&((this.estimatedDeliveryTime == rhs.estimatedDeliveryTime)||((this.estimatedDeliveryTime!= null)&&this.estimatedDeliveryTime.equals(rhs.estimatedDeliveryTime))))&&((this.transitDirectionCode == rhs.transitDirectionCode)||((this.transitDirectionCode!= null)&&this.transitDirectionCode.equals(rhs.transitDirectionCode))))&&((this.plannedWaypointTransportEvent == rhs.plannedWaypointTransportEvent)||((this.plannedWaypointTransportEvent!= null)&&this.plannedWaypointTransportEvent.equals(rhs.plannedWaypointTransportEvent))))&&((this.transportEvent == rhs.transportEvent)||((this.transportEvent!= null)&&this.transportEvent.equals(rhs.transportEvent))))&&((this.storageTransportEvent == rhs.storageTransportEvent)||((this.storageTransportEvent!= null)&&this.storageTransportEvent.equals(rhs.storageTransportEvent))))&&((this.transportMeansTypeCode == rhs.transportMeansTypeCode)||((this.transportMeansTypeCode!= null)&&this.transportMeansTypeCode.equals(rhs.transportMeansTypeCode))))&&((this.freightChargeLocation == rhs.freightChargeLocation)||((this.freightChargeLocation!= null)&&this.freightChargeLocation.equals(rhs.freightChargeLocation))))&&((this.transitPeriod == rhs.transitPeriod)||((this.transitPeriod!= null)&&this.transitPeriod.equals(rhs.transitPeriod))))&&((this.driverPerson == rhs.driverPerson)||((this.driverPerson!= null)&&this.driverPerson.equals(rhs.driverPerson))))&&((this.requestedDepartureTransportEvent == rhs.requestedDepartureTransportEvent)||((this.requestedDepartureTransportEvent!= null)&&this.requestedDepartureTransportEvent.equals(rhs.requestedDepartureTransportEvent))))&&((this.exportationTransportEvent == rhs.exportationTransportEvent)||((this.exportationTransportEvent!= null)&&this.exportationTransportEvent.equals(rhs.exportationTransportEvent))))&&((this.carrierParty == rhs.carrierParty)||((this.carrierParty!= null)&&this.carrierParty.equals(rhs.carrierParty))))&&((this.crewQuantity == rhs.crewQuantity)||((this.crewQuantity!= null)&&this.crewQuantity.equals(rhs.crewQuantity))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.freightAllowanceCharge == rhs.freightAllowanceCharge)||((this.freightAllowanceCharge!= null)&&this.freightAllowanceCharge.equals(rhs.freightAllowanceCharge))))&&((this.optionalTakeoverTransportEvent == rhs.optionalTakeoverTransportEvent)||((this.optionalTakeoverTransportEvent!= null)&&this.optionalTakeoverTransportEvent.equals(rhs.optionalTakeoverTransportEvent))))&&((this.securityOfficerPerson == rhs.securityOfficerPerson)||((this.securityOfficerPerson!= null)&&this.securityOfficerPerson.equals(rhs.securityOfficerPerson))))&&((this.estimatedDepartureTransportEvent == rhs.estimatedDepartureTransportEvent)||((this.estimatedDepartureTransportEvent!= null)&&this.estimatedDepartureTransportEvent.equals(rhs.estimatedDepartureTransportEvent))))&&((this.passengerPerson == rhs.passengerPerson)||((this.passengerPerson!= null)&&this.passengerPerson.equals(rhs.passengerPerson))))&&((this.masterPerson == rhs.masterPerson)||((this.masterPerson!= null)&&this.masterPerson.equals(rhs.masterPerson))))&&((this.requestedWaypointTransportEvent == rhs.requestedWaypointTransportEvent)||((this.requestedWaypointTransportEvent!= null)&&this.requestedWaypointTransportEvent.equals(rhs.requestedWaypointTransportEvent))))&&((this.examinationTransportEvent == rhs.examinationTransportEvent)||((this.examinationTransportEvent!= null)&&this.examinationTransportEvent.equals(rhs.examinationTransportEvent))))&&((this.availabilityTransportEvent == rhs.availabilityTransportEvent)||((this.availabilityTransportEvent!= null)&&this.availabilityTransportEvent.equals(rhs.availabilityTransportEvent))))&&((this.estimatedDeliveryDate == rhs.estimatedDeliveryDate)||((this.estimatedDeliveryDate!= null)&&this.estimatedDeliveryDate.equals(rhs.estimatedDeliveryDate))))&&((this.warehousingTransportEvent == rhs.warehousingTransportEvent)||((this.warehousingTransportEvent!= null)&&this.warehousingTransportEvent.equals(rhs.warehousingTransportEvent))))&&((this.shipsSurgeonPerson == rhs.shipsSurgeonPerson)||((this.shipsSurgeonPerson!= null)&&this.shipsSurgeonPerson.equals(rhs.shipsSurgeonPerson))))&&((this.detentionTransportEvent == rhs.detentionTransportEvent)||((this.detentionTransportEvent!= null)&&this.detentionTransportEvent.equals(rhs.detentionTransportEvent))))&&((this.loadingSequenceID == rhs.loadingSequenceID)||((this.loadingSequenceID!= null)&&this.loadingSequenceID.equals(rhs.loadingSequenceID))))&&((this.transshipPortLocation == rhs.transshipPortLocation)||((this.transshipPortLocation!= null)&&this.transshipPortLocation.equals(rhs.transshipPortLocation))))&&((this.terminalOperatorParty == rhs.terminalOperatorParty)||((this.terminalOperatorParty!= null)&&this.terminalOperatorParty.equals(rhs.terminalOperatorParty))))&&((this.customsAgentParty == rhs.customsAgentParty)||((this.customsAgentParty!= null)&&this.customsAgentParty.equals(rhs.customsAgentParty))))&&((this.successiveSequenceID == rhs.successiveSequenceID)||((this.successiveSequenceID!= null)&&this.successiveSequenceID.equals(rhs.successiveSequenceID))))&&((this.loadingPortLocation == rhs.loadingPortLocation)||((this.loadingPortLocation!= null)&&this.loadingPortLocation.equals(rhs.loadingPortLocation))))&&((this.actualDepartureTransportEvent == rhs.actualDepartureTransportEvent)||((this.actualDepartureTransportEvent!= null)&&this.actualDepartureTransportEvent.equals(rhs.actualDepartureTransportEvent))))&&((this.estimatedArrivalTransportEvent == rhs.estimatedArrivalTransportEvent)||((this.estimatedArrivalTransportEvent!= null)&&this.estimatedArrivalTransportEvent.equals(rhs.estimatedArrivalTransportEvent))))&&((this.plannedDepartureTransportEvent == rhs.plannedDepartureTransportEvent)||((this.plannedDepartureTransportEvent!= null)&&this.plannedDepartureTransportEvent.equals(rhs.plannedDepartureTransportEvent))))&&((this.dropoffTransportEvent == rhs.dropoffTransportEvent)||((this.dropoffTransportEvent!= null)&&this.dropoffTransportEvent.equals(rhs.dropoffTransportEvent))))&&((this.transportMeans == rhs.transportMeans)||((this.transportMeans!= null)&&this.transportMeans.equals(rhs.transportMeans))))&&((this.reportingPerson == rhs.reportingPerson)||((this.reportingPerson!= null)&&this.reportingPerson.equals(rhs.reportingPerson))))&&((this.transportModeCode == rhs.transportModeCode)||((this.transportModeCode!= null)&&this.transportModeCode.equals(rhs.transportModeCode))))&&((this.passengerQuantity == rhs.passengerQuantity)||((this.passengerQuantity!= null)&&this.passengerQuantity.equals(rhs.passengerQuantity))))&&((this.actualArrivalTransportEvent == rhs.actualArrivalTransportEvent)||((this.actualArrivalTransportEvent!= null)&&this.actualArrivalTransportEvent.equals(rhs.actualArrivalTransportEvent))))&&((this.requestedArrivalTransportEvent == rhs.requestedArrivalTransportEvent)||((this.requestedArrivalTransportEvent!= null)&&this.requestedArrivalTransportEvent.equals(rhs.requestedArrivalTransportEvent))))&&((this.actualWaypointTransportEvent == rhs.actualWaypointTransportEvent)||((this.actualWaypointTransportEvent!= null)&&this.actualWaypointTransportEvent.equals(rhs.actualWaypointTransportEvent))))&&((this.takeoverTransportEvent == rhs.takeoverTransportEvent)||((this.takeoverTransportEvent!= null)&&this.takeoverTransportEvent.equals(rhs.takeoverTransportEvent))))&&((this.demurrageInstructions == rhs.demurrageInstructions)||((this.demurrageInstructions!= null)&&this.demurrageInstructions.equals(rhs.demurrageInstructions))))&&((this.requiredDeliveryTime == rhs.requiredDeliveryTime)||((this.requiredDeliveryTime!= null)&&this.requiredDeliveryTime.equals(rhs.requiredDeliveryTime))))&&((this.actualPickupTransportEvent == rhs.actualPickupTransportEvent)||((this.actualPickupTransportEvent!= null)&&this.actualPickupTransportEvent.equals(rhs.actualPickupTransportEvent))))&&((this.receiptTransportEvent == rhs.receiptTransportEvent)||((this.receiptTransportEvent!= null)&&this.receiptTransportEvent.equals(rhs.receiptTransportEvent))))&&((this.crewMemberPerson == rhs.crewMemberPerson)||((this.crewMemberPerson!= null)&&this.crewMemberPerson.equals(rhs.crewMemberPerson))))&&((this.plannedArrivalTransportEvent == rhs.plannedArrivalTransportEvent)||((this.plannedArrivalTransportEvent!= null)&&this.plannedArrivalTransportEvent.equals(rhs.plannedArrivalTransportEvent))))&&((this.estimatedTransitPeriod == rhs.estimatedTransitPeriod)||((this.estimatedTransitPeriod!= null)&&this.estimatedTransitPeriod.equals(rhs.estimatedTransitPeriod))))&&((this.loadingTransportEvent == rhs.loadingTransportEvent)||((this.loadingTransportEvent!= null)&&this.loadingTransportEvent.equals(rhs.loadingTransportEvent))))&&((this.deliveryTransportEvent == rhs.deliveryTransportEvent)||((this.deliveryTransportEvent!= null)&&this.deliveryTransportEvent.equals(rhs.deliveryTransportEvent))))&&((this.requiredDeliveryDate == rhs.requiredDeliveryDate)||((this.requiredDeliveryDate!= null)&&this.requiredDeliveryDate.equals(rhs.requiredDeliveryDate))))&&((this.onCarriageIndicator == rhs.onCarriageIndicator)||((this.onCarriageIndicator!= null)&&this.onCarriageIndicator.equals(rhs.onCarriageIndicator))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.dischargeTransportEvent == rhs.dischargeTransportEvent)||((this.dischargeTransportEvent!= null)&&this.dischargeTransportEvent.equals(rhs.dischargeTransportEvent))))&&((this.acceptanceTransportEvent == rhs.acceptanceTransportEvent)||((this.acceptanceTransportEvent!= null)&&this.acceptanceTransportEvent.equals(rhs.acceptanceTransportEvent))));
    }

}
