
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
 * Transport Equipment. Details
 * <p>
 * A class to describe a piece of equipment used to transport goods.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ReferencedConsignmentID",
    "TransportEquipmentTypeCode",
    "ProviderTypeCode",
    "OwnerTypeCode",
    "SizeTypeCode",
    "DispositionCode",
    "FullnessIndicationCode",
    "RefrigerationOnIndicator",
    "Information",
    "ReturnabilityIndicator",
    "LegalStatusIndicator",
    "AirFlowPercent",
    "HumidityPercent",
    "AnimalFoodApprovedIndicator",
    "HumanFoodApprovedIndicator",
    "DangerousGoodsApprovedIndicator",
    "RefrigeratedIndicator",
    "Characteristics",
    "DamageRemarks",
    "Description",
    "SpecialTransportRequirements",
    "GrossWeightMeasure",
    "GrossVolumeMeasure",
    "TareWeightMeasure",
    "TrackingDeviceCode",
    "PowerIndicator",
    "TraceID",
    "MeasurementDimension",
    "TransportEquipmentSeal",
    "MinimumTemperature",
    "MaximumTemperature",
    "ProviderParty",
    "LoadingProofParty",
    "SupplierParty",
    "OwnerParty",
    "OperatingParty",
    "LoadingLocation",
    "UnloadingLocation",
    "StorageLocation",
    "PositioningTransportEvent",
    "QuarantineTransportEvent",
    "DeliveryTransportEvent",
    "PickupTransportEvent",
    "HandlingTransportEvent",
    "LoadingTransportEvent",
    "TransportEvent",
    "ApplicableTransportMeans",
    "HaulageTradingTerms",
    "HazardousGoodsTransit",
    "PackagedTransportHandlingUnit",
    "ServiceAllowanceCharge",
    "FreightAllowanceCharge",
    "AttachedTransportEquipment",
    "Delivery",
    "Pickup",
    "Despatch",
    "ShipmentDocumentReference",
    "ContainedInTransportEquipment",
    "Package",
    "GoodsItem"
})
@Generated("jsonschema2pojo")
public class TransportEquipment {

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
     * Transport Equipment. Identifier
     * <p>
     * An identifier for this piece of transport equipment.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Transport Equipment. Referenced_ Consignment Identifier. Identifier
     * <p>
     * An identifier for the consignment contained by this piece of transport equipment.
     * 
     */
    @JsonProperty("ReferencedConsignmentID")
    @JsonPropertyDescription("An identifier for the consignment contained by this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<IdentifierType> referencedConsignmentID = new ArrayList<IdentifierType>();
    /**
     * Transport Equipment. Transport Equipment Type Code. Code
     * <p>
     * A code signifying the type of this piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEquipmentTypeCode")
    @JsonPropertyDescription("A code signifying the type of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportEquipmentTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Provider Type Code. Code
     * <p>
     * A code signifying the type of provider of this piece of transport equipment.
     * 
     */
    @JsonProperty("ProviderTypeCode")
    @JsonPropertyDescription("A code signifying the type of provider of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> providerTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Owner Type Code. Code
     * <p>
     * A code signifying the type of owner of this piece of transport equipment.
     * 
     */
    @JsonProperty("OwnerTypeCode")
    @JsonPropertyDescription("A code signifying the type of owner of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> ownerTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Size Type Code. Code
     * <p>
     * A code signifying the size and type of this piece of piece of transport equipment. When the piece of transport equipment is a shipping container, it is recommended to use ContainerSizeTypeCode for validation.
     * 
     */
    @JsonProperty("SizeTypeCode")
    @JsonPropertyDescription("A code signifying the size and type of this piece of piece of transport equipment. When the piece of transport equipment is a shipping container, it is recommended to use ContainerSizeTypeCode for validation.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> sizeTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Disposition Code. Code
     * <p>
     * A code signifying the current disposition of this piece of transport equipment.
     * 
     */
    @JsonProperty("DispositionCode")
    @JsonPropertyDescription("A code signifying the current disposition of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> dispositionCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Fullness Indication Code. Code
     * <p>
     * A code signifying whether this piece of transport equipment is full, partially full, or empty.
     * 
     */
    @JsonProperty("FullnessIndicationCode")
    @JsonPropertyDescription("A code signifying whether this piece of transport equipment is full, partially full, or empty.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> fullnessIndicationCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Refrigeration On_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment's refrigeration is on (true) or off (false).
     * 
     */
    @JsonProperty("RefrigerationOnIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment's refrigeration is on (true) or off (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> refrigerationOnIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Information. Text
     * <p>
     * Additional information about this piece of transport equipment.
     * 
     */
    @JsonProperty("Information")
    @JsonPropertyDescription("Additional information about this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TextType> information = new ArrayList<TextType>();
    /**
     * Transport Equipment. Returnability_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is returnable (true) or not (false).
     * 
     */
    @JsonProperty("ReturnabilityIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment is returnable (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> returnabilityIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Legal Status_ Indicator. Indicator
     * <p>
     * An indication of the legal status of this piece of transport equipment with respect to the Container Convention Code.
     * 
     */
    @JsonProperty("LegalStatusIndicator")
    @JsonPropertyDescription("An indication of the legal status of this piece of transport equipment with respect to the Container Convention Code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> legalStatusIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Air Flow Percent. Percent
     * <p>
     * The percent of the airflow within this piece of transport equipment.
     * 
     */
    @JsonProperty("AirFlowPercent")
    @JsonPropertyDescription("The percent of the airflow within this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> airFlowPercent = new ArrayList<NumericType>();
    /**
     * Transport Equipment. Humidity Percent. Percent
     * <p>
     * The percent humidity within this piece of transport equipment.
     * 
     */
    @JsonProperty("HumidityPercent")
    @JsonPropertyDescription("The percent humidity within this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> humidityPercent = new ArrayList<NumericType>();
    /**
     * Transport Equipment. Animal Food_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for animal food (true) or not (false).
     * 
     */
    @JsonProperty("AnimalFoodApprovedIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment is approved for animal food (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> animalFoodApprovedIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Human Food_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for human food (true) or not (false).
     * 
     */
    @JsonProperty("HumanFoodApprovedIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment is approved for human food (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> humanFoodApprovedIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Dangerous Goods_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("DangerousGoodsApprovedIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment is approved for dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> dangerousGoodsApprovedIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Refrigerated_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is refrigerated (true) or not (false).
     * 
     */
    @JsonProperty("RefrigeratedIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment is refrigerated (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> refrigeratedIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Characteristics. Text
     * <p>
     * Characteristics of this piece of transport equipment.
     * 
     */
    @JsonProperty("Characteristics")
    @JsonPropertyDescription("Characteristics of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> characteristics = new ArrayList<TextType>();
    /**
     * Transport Equipment. Damage_ Remarks. Text
     * <p>
     * Damage associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("DamageRemarks")
    @JsonPropertyDescription("Damage associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TextType> damageRemarks = new ArrayList<TextType>();
    /**
     * Transport Equipment. Description. Text
     * <p>
     * Text describing this piece of transport equipment.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Transport Equipment. Special_ Transport Requirements. Text
     * <p>
     * Special transport requirements expressed as text.
     * 
     */
    @JsonProperty("SpecialTransportRequirements")
    @JsonPropertyDescription("Special transport requirements expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> specialTransportRequirements = new ArrayList<TextType>();
    /**
     * Transport Equipment. Gross_ Weight. Measure
     * <p>
     * The gross weight of this piece of transport equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    @JsonPropertyDescription("The gross weight of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Transport Equipment. Gross_ Volume. Measure
     * <p>
     * The gross volume of this piece of transport equipment.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    @JsonPropertyDescription("The gross volume of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Transport Equipment. Tare_ Weight. Measure
     * <p>
     * The weight of this piece of transport equipment when empty.
     * 
     */
    @JsonProperty("TareWeightMeasure")
    @JsonPropertyDescription("The weight of this piece of transport equipment when empty.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> tareWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Transport Equipment. Tracking Device Code. Code
     * <p>
     * A code signifying the tracking device for this piece of transport equipment.
     * 
     */
    @JsonProperty("TrackingDeviceCode")
    @JsonPropertyDescription("A code signifying the tracking device for this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> trackingDeviceCode = new ArrayList<CodeType>();
    /**
     * Transport Equipment. Power. Indicator
     * <p>
     * An indicator that this piece of transport equipment can supply power (true) or not (false).
     * 
     */
    @JsonProperty("PowerIndicator")
    @JsonPropertyDescription("An indicator that this piece of transport equipment can supply power (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> powerIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Equipment. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this piece of transport equipment, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    @JsonPropertyDescription("An identifier for use in tracing this piece of transport equipment, such as the EPC number used in RFID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> traceID = new ArrayList<IdentifierType>();
    /**
     * Transport Equipment. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this piece of transport equipment.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();
    /**
     * Transport Equipment. Transport Equipment Seal
     * <p>
     * A seal securing the door of a piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEquipmentSeal")
    @JsonPropertyDescription("A seal securing the door of a piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipmentSeal> transportEquipmentSeal = new ArrayList<TransportEquipmentSeal>();
    /**
     * Transport Equipment. Minimum_ Temperature. Temperature
     * <p>
     * In the case of a refrigeration unit, the minimum allowable operating temperature for this container.
     * 
     */
    @JsonProperty("MinimumTemperature")
    @JsonPropertyDescription("In the case of a refrigeration unit, the minimum allowable operating temperature for this container.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> minimumTemperature = new ArrayList<Temperature>();
    /**
     * Transport Equipment. Maximum_ Temperature. Temperature
     * <p>
     * In the case of a refrigeration unit, the maximum allowable operating temperature for this container.
     * 
     */
    @JsonProperty("MaximumTemperature")
    @JsonPropertyDescription("In the case of a refrigeration unit, the maximum allowable operating temperature for this container.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> maximumTemperature = new ArrayList<Temperature>();
    /**
     * Transport Equipment. Provider_ Party. Party
     * <p>
     * The party providing this piece of transport equipment.
     * 
     */
    @JsonProperty("ProviderParty")
    @JsonPropertyDescription("The party providing this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> providerParty = new ArrayList<Party>();
    /**
     * Transport Equipment. Loading Proof_ Party. Party
     * <p>
     * The authorized party responsible for certifying that the goods were loaded into this piece of transport equipment.
     * 
     */
    @JsonProperty("LoadingProofParty")
    @JsonPropertyDescription("The authorized party responsible for certifying that the goods were loaded into this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> loadingProofParty = new ArrayList<Party>();
    /**
     * Transport Equipment. Supplier Party
     * <p>
     * The party that supplies this piece of transport equipment.
     * 
     */
    @JsonProperty("SupplierParty")
    @JsonPropertyDescription("The party that supplies this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<SupplierParty> supplierParty = new ArrayList<SupplierParty>();
    /**
     * Transport Equipment. Owner_ Party. Party
     * <p>
     * The party that owns this piece of transport equipment.
     * 
     */
    @JsonProperty("OwnerParty")
    @JsonPropertyDescription("The party that owns this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> ownerParty = new ArrayList<Party>();
    /**
     * Transport Equipment. Operating_ Party. Party
     * <p>
     * The party that operates this piece of transport equipment.
     * 
     */
    @JsonProperty("OperatingParty")
    @JsonPropertyDescription("The party that operates this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> operatingParty = new ArrayList<Party>();
    /**
     * Transport Equipment. Loading_ Location. Location
     * <p>
     * The location where this piece of transport equipment is loaded.
     * 
     */
    @JsonProperty("LoadingLocation")
    @JsonPropertyDescription("The location where this piece of transport equipment is loaded.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> loadingLocation = new ArrayList<Location>();
    /**
     * Transport Equipment. Unloading_ Location. Location
     * <p>
     * The location where this piece of transport equipment is unloaded.
     * 
     */
    @JsonProperty("UnloadingLocation")
    @JsonPropertyDescription("The location where this piece of transport equipment is unloaded.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> unloadingLocation = new ArrayList<Location>();
    /**
     * Transport Equipment. Storage_ Location. Location
     * <p>
     * The location where this piece of transport equipment is being stored.
     * 
     */
    @JsonProperty("StorageLocation")
    @JsonPropertyDescription("The location where this piece of transport equipment is being stored.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> storageLocation = new ArrayList<Location>();
    /**
     * Transport Equipment. Positioning_ Transport Event. Transport Event
     * <p>
     * A positioning of this piece of transport equipment.
     * 
     */
    @JsonProperty("PositioningTransportEvent")
    @JsonPropertyDescription("A positioning of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> positioningTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Quarantine_ Transport Event. Transport Event
     * <p>
     * A quarantine of this piece of transport equipment.
     * 
     */
    @JsonProperty("QuarantineTransportEvent")
    @JsonPropertyDescription("A quarantine of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> quarantineTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Delivery_ Transport Event. Transport Event
     * <p>
     * A delivery of this piece of transport equipment.
     * 
     */
    @JsonProperty("DeliveryTransportEvent")
    @JsonPropertyDescription("A delivery of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> deliveryTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Pickup_ Transport Event. Transport Event
     * <p>
     * A pickup of this piece of transport equipment.
     * 
     */
    @JsonProperty("PickupTransportEvent")
    @JsonPropertyDescription("A pickup of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> pickupTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Handling_ Transport Event. Transport Event
     * <p>
     * A handling of this piece of transport equipment.
     * 
     */
    @JsonProperty("HandlingTransportEvent")
    @JsonPropertyDescription("A handling of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> handlingTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Loading_ Transport Event. Transport Event
     * <p>
     * A loading of this piece of transport equipment.
     * 
     */
    @JsonProperty("LoadingTransportEvent")
    @JsonPropertyDescription("A loading of this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> loadingTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Transport Event
     * <p>
     * A transport event associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEvent")
    @JsonPropertyDescription("A transport event associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> transportEvent = new ArrayList<TransportEvent>();
    /**
     * Transport Equipment. Applicable_ Transport Means. Transport Means
     * <p>
     * The applicable transport means associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ApplicableTransportMeans")
    @JsonPropertyDescription("The applicable transport means associated with this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportMeans> applicableTransportMeans = new ArrayList<TransportMeans>();
    /**
     * Transport Equipment. Haulage_ Trading Terms. Trading Terms
     * <p>
     * A set of haulage trading terms associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("HaulageTradingTerms")
    @JsonPropertyDescription("A set of haulage trading terms associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TradingTerms> haulageTradingTerms = new ArrayList<TradingTerms>();
    /**
     * Transport Equipment. Hazardous Goods Transit
     * <p>
     * Transit-related information regarding a type of hazardous goods contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    @JsonPropertyDescription("Transit-related information regarding a type of hazardous goods contained in this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<HazardousGoodsTransit> hazardousGoodsTransit = new ArrayList<HazardousGoodsTransit>();
    /**
     * Transport Equipment. Packaged_ Transport Handling Unit. Transport Handling Unit
     * <p>
     * A packaged transport handling unit associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("PackagedTransportHandlingUnit")
    @JsonPropertyDescription("A packaged transport handling unit associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportHandlingUnit> packagedTransportHandlingUnit = new ArrayList<TransportHandlingUnit>();
    /**
     * Transport Equipment. Service_ Allowance Charge. Allowance Charge
     * <p>
     * A service allowance charge associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ServiceAllowanceCharge")
    @JsonPropertyDescription("A service allowance charge associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> serviceAllowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Transport Equipment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A freight allowance charge associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    @JsonPropertyDescription("A freight allowance charge associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> freightAllowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Transport Equipment. Attached_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment attached to this piece of transport equipment.
     * 
     */
    @JsonProperty("AttachedTransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment attached to this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> attachedTransportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Transport Equipment. Delivery
     * <p>
     * The delivery of this piece of transport equipment.
     * 
     */
    @JsonProperty("Delivery")
    @JsonPropertyDescription("The delivery of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Delivery> delivery = new ArrayList<Delivery>();
    /**
     * Transport Equipment. Pickup
     * <p>
     * The pickup of this piece of transport equipment.
     * 
     */
    @JsonProperty("Pickup")
    @JsonPropertyDescription("The pickup of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Pickup> pickup = new ArrayList<Pickup>();
    /**
     * Transport Equipment. Despatch
     * <p>
     * The despatch of this piece of transport equipment.
     * 
     */
    @JsonProperty("Despatch")
    @JsonPropertyDescription("The despatch of this piece of transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Despatch> despatch = new ArrayList<Despatch>();
    /**
     * Transport Equipment. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    @JsonPropertyDescription("A reference to a shipping document associated with this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> shipmentDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Transport Equipment. Contained In_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("ContainedInTransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment contained in this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> containedInTransportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Transport Equipment. Package
     * <p>
     * A package contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("Package")
    @JsonPropertyDescription("A package contained in this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<Package> _package = new ArrayList<Package>();
    /**
     * Transport Equipment. Goods Item
     * <p>
     * A goods item contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("GoodsItem")
    @JsonPropertyDescription("A goods item contained in this piece of transport equipment.")
    @Size(min = 1)
    @Valid
    private List<GoodsItem> goodsItem = new ArrayList<GoodsItem>();

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

    public TransportEquipment withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transport Equipment. Identifier
     * <p>
     * An identifier for this piece of transport equipment.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Transport Equipment. Identifier
     * <p>
     * An identifier for this piece of transport equipment.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TransportEquipment withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Transport Equipment. Referenced_ Consignment Identifier. Identifier
     * <p>
     * An identifier for the consignment contained by this piece of transport equipment.
     * 
     */
    @JsonProperty("ReferencedConsignmentID")
    public List<IdentifierType> getReferencedConsignmentID() {
        return referencedConsignmentID;
    }

    /**
     * Transport Equipment. Referenced_ Consignment Identifier. Identifier
     * <p>
     * An identifier for the consignment contained by this piece of transport equipment.
     * 
     */
    @JsonProperty("ReferencedConsignmentID")
    public void setReferencedConsignmentID(List<IdentifierType> referencedConsignmentID) {
        this.referencedConsignmentID = referencedConsignmentID;
    }

    public TransportEquipment withReferencedConsignmentID(List<IdentifierType> referencedConsignmentID) {
        this.referencedConsignmentID = referencedConsignmentID;
        return this;
    }

    /**
     * Transport Equipment. Transport Equipment Type Code. Code
     * <p>
     * A code signifying the type of this piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEquipmentTypeCode")
    public List<CodeType> getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    /**
     * Transport Equipment. Transport Equipment Type Code. Code
     * <p>
     * A code signifying the type of this piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEquipmentTypeCode")
    public void setTransportEquipmentTypeCode(List<CodeType> transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
    }

    public TransportEquipment withTransportEquipmentTypeCode(List<CodeType> transportEquipmentTypeCode) {
        this.transportEquipmentTypeCode = transportEquipmentTypeCode;
        return this;
    }

    /**
     * Transport Equipment. Provider Type Code. Code
     * <p>
     * A code signifying the type of provider of this piece of transport equipment.
     * 
     */
    @JsonProperty("ProviderTypeCode")
    public List<CodeType> getProviderTypeCode() {
        return providerTypeCode;
    }

    /**
     * Transport Equipment. Provider Type Code. Code
     * <p>
     * A code signifying the type of provider of this piece of transport equipment.
     * 
     */
    @JsonProperty("ProviderTypeCode")
    public void setProviderTypeCode(List<CodeType> providerTypeCode) {
        this.providerTypeCode = providerTypeCode;
    }

    public TransportEquipment withProviderTypeCode(List<CodeType> providerTypeCode) {
        this.providerTypeCode = providerTypeCode;
        return this;
    }

    /**
     * Transport Equipment. Owner Type Code. Code
     * <p>
     * A code signifying the type of owner of this piece of transport equipment.
     * 
     */
    @JsonProperty("OwnerTypeCode")
    public List<CodeType> getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Transport Equipment. Owner Type Code. Code
     * <p>
     * A code signifying the type of owner of this piece of transport equipment.
     * 
     */
    @JsonProperty("OwnerTypeCode")
    public void setOwnerTypeCode(List<CodeType> ownerTypeCode) {
        this.ownerTypeCode = ownerTypeCode;
    }

    public TransportEquipment withOwnerTypeCode(List<CodeType> ownerTypeCode) {
        this.ownerTypeCode = ownerTypeCode;
        return this;
    }

    /**
     * Transport Equipment. Size Type Code. Code
     * <p>
     * A code signifying the size and type of this piece of piece of transport equipment. When the piece of transport equipment is a shipping container, it is recommended to use ContainerSizeTypeCode for validation.
     * 
     */
    @JsonProperty("SizeTypeCode")
    public List<CodeType> getSizeTypeCode() {
        return sizeTypeCode;
    }

    /**
     * Transport Equipment. Size Type Code. Code
     * <p>
     * A code signifying the size and type of this piece of piece of transport equipment. When the piece of transport equipment is a shipping container, it is recommended to use ContainerSizeTypeCode for validation.
     * 
     */
    @JsonProperty("SizeTypeCode")
    public void setSizeTypeCode(List<CodeType> sizeTypeCode) {
        this.sizeTypeCode = sizeTypeCode;
    }

    public TransportEquipment withSizeTypeCode(List<CodeType> sizeTypeCode) {
        this.sizeTypeCode = sizeTypeCode;
        return this;
    }

    /**
     * Transport Equipment. Disposition Code. Code
     * <p>
     * A code signifying the current disposition of this piece of transport equipment.
     * 
     */
    @JsonProperty("DispositionCode")
    public List<CodeType> getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Transport Equipment. Disposition Code. Code
     * <p>
     * A code signifying the current disposition of this piece of transport equipment.
     * 
     */
    @JsonProperty("DispositionCode")
    public void setDispositionCode(List<CodeType> dispositionCode) {
        this.dispositionCode = dispositionCode;
    }

    public TransportEquipment withDispositionCode(List<CodeType> dispositionCode) {
        this.dispositionCode = dispositionCode;
        return this;
    }

    /**
     * Transport Equipment. Fullness Indication Code. Code
     * <p>
     * A code signifying whether this piece of transport equipment is full, partially full, or empty.
     * 
     */
    @JsonProperty("FullnessIndicationCode")
    public List<CodeType> getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    /**
     * Transport Equipment. Fullness Indication Code. Code
     * <p>
     * A code signifying whether this piece of transport equipment is full, partially full, or empty.
     * 
     */
    @JsonProperty("FullnessIndicationCode")
    public void setFullnessIndicationCode(List<CodeType> fullnessIndicationCode) {
        this.fullnessIndicationCode = fullnessIndicationCode;
    }

    public TransportEquipment withFullnessIndicationCode(List<CodeType> fullnessIndicationCode) {
        this.fullnessIndicationCode = fullnessIndicationCode;
        return this;
    }

    /**
     * Transport Equipment. Refrigeration On_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment's refrigeration is on (true) or off (false).
     * 
     */
    @JsonProperty("RefrigerationOnIndicator")
    public List<IndicatorType> getRefrigerationOnIndicator() {
        return refrigerationOnIndicator;
    }

    /**
     * Transport Equipment. Refrigeration On_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment's refrigeration is on (true) or off (false).
     * 
     */
    @JsonProperty("RefrigerationOnIndicator")
    public void setRefrigerationOnIndicator(List<IndicatorType> refrigerationOnIndicator) {
        this.refrigerationOnIndicator = refrigerationOnIndicator;
    }

    public TransportEquipment withRefrigerationOnIndicator(List<IndicatorType> refrigerationOnIndicator) {
        this.refrigerationOnIndicator = refrigerationOnIndicator;
        return this;
    }

    /**
     * Transport Equipment. Information. Text
     * <p>
     * Additional information about this piece of transport equipment.
     * 
     */
    @JsonProperty("Information")
    public List<TextType> getInformation() {
        return information;
    }

    /**
     * Transport Equipment. Information. Text
     * <p>
     * Additional information about this piece of transport equipment.
     * 
     */
    @JsonProperty("Information")
    public void setInformation(List<TextType> information) {
        this.information = information;
    }

    public TransportEquipment withInformation(List<TextType> information) {
        this.information = information;
        return this;
    }

    /**
     * Transport Equipment. Returnability_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is returnable (true) or not (false).
     * 
     */
    @JsonProperty("ReturnabilityIndicator")
    public List<IndicatorType> getReturnabilityIndicator() {
        return returnabilityIndicator;
    }

    /**
     * Transport Equipment. Returnability_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is returnable (true) or not (false).
     * 
     */
    @JsonProperty("ReturnabilityIndicator")
    public void setReturnabilityIndicator(List<IndicatorType> returnabilityIndicator) {
        this.returnabilityIndicator = returnabilityIndicator;
    }

    public TransportEquipment withReturnabilityIndicator(List<IndicatorType> returnabilityIndicator) {
        this.returnabilityIndicator = returnabilityIndicator;
        return this;
    }

    /**
     * Transport Equipment. Legal Status_ Indicator. Indicator
     * <p>
     * An indication of the legal status of this piece of transport equipment with respect to the Container Convention Code.
     * 
     */
    @JsonProperty("LegalStatusIndicator")
    public List<IndicatorType> getLegalStatusIndicator() {
        return legalStatusIndicator;
    }

    /**
     * Transport Equipment. Legal Status_ Indicator. Indicator
     * <p>
     * An indication of the legal status of this piece of transport equipment with respect to the Container Convention Code.
     * 
     */
    @JsonProperty("LegalStatusIndicator")
    public void setLegalStatusIndicator(List<IndicatorType> legalStatusIndicator) {
        this.legalStatusIndicator = legalStatusIndicator;
    }

    public TransportEquipment withLegalStatusIndicator(List<IndicatorType> legalStatusIndicator) {
        this.legalStatusIndicator = legalStatusIndicator;
        return this;
    }

    /**
     * Transport Equipment. Air Flow Percent. Percent
     * <p>
     * The percent of the airflow within this piece of transport equipment.
     * 
     */
    @JsonProperty("AirFlowPercent")
    public List<NumericType> getAirFlowPercent() {
        return airFlowPercent;
    }

    /**
     * Transport Equipment. Air Flow Percent. Percent
     * <p>
     * The percent of the airflow within this piece of transport equipment.
     * 
     */
    @JsonProperty("AirFlowPercent")
    public void setAirFlowPercent(List<NumericType> airFlowPercent) {
        this.airFlowPercent = airFlowPercent;
    }

    public TransportEquipment withAirFlowPercent(List<NumericType> airFlowPercent) {
        this.airFlowPercent = airFlowPercent;
        return this;
    }

    /**
     * Transport Equipment. Humidity Percent. Percent
     * <p>
     * The percent humidity within this piece of transport equipment.
     * 
     */
    @JsonProperty("HumidityPercent")
    public List<NumericType> getHumidityPercent() {
        return humidityPercent;
    }

    /**
     * Transport Equipment. Humidity Percent. Percent
     * <p>
     * The percent humidity within this piece of transport equipment.
     * 
     */
    @JsonProperty("HumidityPercent")
    public void setHumidityPercent(List<NumericType> humidityPercent) {
        this.humidityPercent = humidityPercent;
    }

    public TransportEquipment withHumidityPercent(List<NumericType> humidityPercent) {
        this.humidityPercent = humidityPercent;
        return this;
    }

    /**
     * Transport Equipment. Animal Food_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for animal food (true) or not (false).
     * 
     */
    @JsonProperty("AnimalFoodApprovedIndicator")
    public List<IndicatorType> getAnimalFoodApprovedIndicator() {
        return animalFoodApprovedIndicator;
    }

    /**
     * Transport Equipment. Animal Food_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for animal food (true) or not (false).
     * 
     */
    @JsonProperty("AnimalFoodApprovedIndicator")
    public void setAnimalFoodApprovedIndicator(List<IndicatorType> animalFoodApprovedIndicator) {
        this.animalFoodApprovedIndicator = animalFoodApprovedIndicator;
    }

    public TransportEquipment withAnimalFoodApprovedIndicator(List<IndicatorType> animalFoodApprovedIndicator) {
        this.animalFoodApprovedIndicator = animalFoodApprovedIndicator;
        return this;
    }

    /**
     * Transport Equipment. Human Food_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for human food (true) or not (false).
     * 
     */
    @JsonProperty("HumanFoodApprovedIndicator")
    public List<IndicatorType> getHumanFoodApprovedIndicator() {
        return humanFoodApprovedIndicator;
    }

    /**
     * Transport Equipment. Human Food_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for human food (true) or not (false).
     * 
     */
    @JsonProperty("HumanFoodApprovedIndicator")
    public void setHumanFoodApprovedIndicator(List<IndicatorType> humanFoodApprovedIndicator) {
        this.humanFoodApprovedIndicator = humanFoodApprovedIndicator;
    }

    public TransportEquipment withHumanFoodApprovedIndicator(List<IndicatorType> humanFoodApprovedIndicator) {
        this.humanFoodApprovedIndicator = humanFoodApprovedIndicator;
        return this;
    }

    /**
     * Transport Equipment. Dangerous Goods_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("DangerousGoodsApprovedIndicator")
    public List<IndicatorType> getDangerousGoodsApprovedIndicator() {
        return dangerousGoodsApprovedIndicator;
    }

    /**
     * Transport Equipment. Dangerous Goods_ Approved Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is approved for dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("DangerousGoodsApprovedIndicator")
    public void setDangerousGoodsApprovedIndicator(List<IndicatorType> dangerousGoodsApprovedIndicator) {
        this.dangerousGoodsApprovedIndicator = dangerousGoodsApprovedIndicator;
    }

    public TransportEquipment withDangerousGoodsApprovedIndicator(List<IndicatorType> dangerousGoodsApprovedIndicator) {
        this.dangerousGoodsApprovedIndicator = dangerousGoodsApprovedIndicator;
        return this;
    }

    /**
     * Transport Equipment. Refrigerated_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is refrigerated (true) or not (false).
     * 
     */
    @JsonProperty("RefrigeratedIndicator")
    public List<IndicatorType> getRefrigeratedIndicator() {
        return refrigeratedIndicator;
    }

    /**
     * Transport Equipment. Refrigerated_ Indicator. Indicator
     * <p>
     * An indicator that this piece of transport equipment is refrigerated (true) or not (false).
     * 
     */
    @JsonProperty("RefrigeratedIndicator")
    public void setRefrigeratedIndicator(List<IndicatorType> refrigeratedIndicator) {
        this.refrigeratedIndicator = refrigeratedIndicator;
    }

    public TransportEquipment withRefrigeratedIndicator(List<IndicatorType> refrigeratedIndicator) {
        this.refrigeratedIndicator = refrigeratedIndicator;
        return this;
    }

    /**
     * Transport Equipment. Characteristics. Text
     * <p>
     * Characteristics of this piece of transport equipment.
     * 
     */
    @JsonProperty("Characteristics")
    public List<TextType> getCharacteristics() {
        return characteristics;
    }

    /**
     * Transport Equipment. Characteristics. Text
     * <p>
     * Characteristics of this piece of transport equipment.
     * 
     */
    @JsonProperty("Characteristics")
    public void setCharacteristics(List<TextType> characteristics) {
        this.characteristics = characteristics;
    }

    public TransportEquipment withCharacteristics(List<TextType> characteristics) {
        this.characteristics = characteristics;
        return this;
    }

    /**
     * Transport Equipment. Damage_ Remarks. Text
     * <p>
     * Damage associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("DamageRemarks")
    public List<TextType> getDamageRemarks() {
        return damageRemarks;
    }

    /**
     * Transport Equipment. Damage_ Remarks. Text
     * <p>
     * Damage associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("DamageRemarks")
    public void setDamageRemarks(List<TextType> damageRemarks) {
        this.damageRemarks = damageRemarks;
    }

    public TransportEquipment withDamageRemarks(List<TextType> damageRemarks) {
        this.damageRemarks = damageRemarks;
        return this;
    }

    /**
     * Transport Equipment. Description. Text
     * <p>
     * Text describing this piece of transport equipment.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Transport Equipment. Description. Text
     * <p>
     * Text describing this piece of transport equipment.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public TransportEquipment withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Transport Equipment. Special_ Transport Requirements. Text
     * <p>
     * Special transport requirements expressed as text.
     * 
     */
    @JsonProperty("SpecialTransportRequirements")
    public List<TextType> getSpecialTransportRequirements() {
        return specialTransportRequirements;
    }

    /**
     * Transport Equipment. Special_ Transport Requirements. Text
     * <p>
     * Special transport requirements expressed as text.
     * 
     */
    @JsonProperty("SpecialTransportRequirements")
    public void setSpecialTransportRequirements(List<TextType> specialTransportRequirements) {
        this.specialTransportRequirements = specialTransportRequirements;
    }

    public TransportEquipment withSpecialTransportRequirements(List<TextType> specialTransportRequirements) {
        this.specialTransportRequirements = specialTransportRequirements;
        return this;
    }

    /**
     * Transport Equipment. Gross_ Weight. Measure
     * <p>
     * The gross weight of this piece of transport equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public List<MeasureType> getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Transport Equipment. Gross_ Weight. Measure
     * <p>
     * The gross weight of this piece of transport equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public void setGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
    }

    public TransportEquipment withGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
        return this;
    }

    /**
     * Transport Equipment. Gross_ Volume. Measure
     * <p>
     * The gross volume of this piece of transport equipment.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public List<MeasureType> getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Transport Equipment. Gross_ Volume. Measure
     * <p>
     * The gross volume of this piece of transport equipment.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public void setGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
    }

    public TransportEquipment withGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
        return this;
    }

    /**
     * Transport Equipment. Tare_ Weight. Measure
     * <p>
     * The weight of this piece of transport equipment when empty.
     * 
     */
    @JsonProperty("TareWeightMeasure")
    public List<MeasureType> getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Transport Equipment. Tare_ Weight. Measure
     * <p>
     * The weight of this piece of transport equipment when empty.
     * 
     */
    @JsonProperty("TareWeightMeasure")
    public void setTareWeightMeasure(List<MeasureType> tareWeightMeasure) {
        this.tareWeightMeasure = tareWeightMeasure;
    }

    public TransportEquipment withTareWeightMeasure(List<MeasureType> tareWeightMeasure) {
        this.tareWeightMeasure = tareWeightMeasure;
        return this;
    }

    /**
     * Transport Equipment. Tracking Device Code. Code
     * <p>
     * A code signifying the tracking device for this piece of transport equipment.
     * 
     */
    @JsonProperty("TrackingDeviceCode")
    public List<CodeType> getTrackingDeviceCode() {
        return trackingDeviceCode;
    }

    /**
     * Transport Equipment. Tracking Device Code. Code
     * <p>
     * A code signifying the tracking device for this piece of transport equipment.
     * 
     */
    @JsonProperty("TrackingDeviceCode")
    public void setTrackingDeviceCode(List<CodeType> trackingDeviceCode) {
        this.trackingDeviceCode = trackingDeviceCode;
    }

    public TransportEquipment withTrackingDeviceCode(List<CodeType> trackingDeviceCode) {
        this.trackingDeviceCode = trackingDeviceCode;
        return this;
    }

    /**
     * Transport Equipment. Power. Indicator
     * <p>
     * An indicator that this piece of transport equipment can supply power (true) or not (false).
     * 
     */
    @JsonProperty("PowerIndicator")
    public List<IndicatorType> getPowerIndicator() {
        return powerIndicator;
    }

    /**
     * Transport Equipment. Power. Indicator
     * <p>
     * An indicator that this piece of transport equipment can supply power (true) or not (false).
     * 
     */
    @JsonProperty("PowerIndicator")
    public void setPowerIndicator(List<IndicatorType> powerIndicator) {
        this.powerIndicator = powerIndicator;
    }

    public TransportEquipment withPowerIndicator(List<IndicatorType> powerIndicator) {
        this.powerIndicator = powerIndicator;
        return this;
    }

    /**
     * Transport Equipment. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this piece of transport equipment, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public List<IdentifierType> getTraceID() {
        return traceID;
    }

    /**
     * Transport Equipment. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this piece of transport equipment, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public void setTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
    }

    public TransportEquipment withTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
        return this;
    }

    /**
     * Transport Equipment. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this piece of transport equipment.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Transport Equipment. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this piece of transport equipment.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public TransportEquipment withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    /**
     * Transport Equipment. Transport Equipment Seal
     * <p>
     * A seal securing the door of a piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEquipmentSeal")
    public List<TransportEquipmentSeal> getTransportEquipmentSeal() {
        return transportEquipmentSeal;
    }

    /**
     * Transport Equipment. Transport Equipment Seal
     * <p>
     * A seal securing the door of a piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEquipmentSeal")
    public void setTransportEquipmentSeal(List<TransportEquipmentSeal> transportEquipmentSeal) {
        this.transportEquipmentSeal = transportEquipmentSeal;
    }

    public TransportEquipment withTransportEquipmentSeal(List<TransportEquipmentSeal> transportEquipmentSeal) {
        this.transportEquipmentSeal = transportEquipmentSeal;
        return this;
    }

    /**
     * Transport Equipment. Minimum_ Temperature. Temperature
     * <p>
     * In the case of a refrigeration unit, the minimum allowable operating temperature for this container.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public List<Temperature> getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Transport Equipment. Minimum_ Temperature. Temperature
     * <p>
     * In the case of a refrigeration unit, the minimum allowable operating temperature for this container.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public void setMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public TransportEquipment withMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
        return this;
    }

    /**
     * Transport Equipment. Maximum_ Temperature. Temperature
     * <p>
     * In the case of a refrigeration unit, the maximum allowable operating temperature for this container.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public List<Temperature> getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Transport Equipment. Maximum_ Temperature. Temperature
     * <p>
     * In the case of a refrigeration unit, the maximum allowable operating temperature for this container.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public void setMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public TransportEquipment withMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
        return this;
    }

    /**
     * Transport Equipment. Provider_ Party. Party
     * <p>
     * The party providing this piece of transport equipment.
     * 
     */
    @JsonProperty("ProviderParty")
    public List<Party> getProviderParty() {
        return providerParty;
    }

    /**
     * Transport Equipment. Provider_ Party. Party
     * <p>
     * The party providing this piece of transport equipment.
     * 
     */
    @JsonProperty("ProviderParty")
    public void setProviderParty(List<Party> providerParty) {
        this.providerParty = providerParty;
    }

    public TransportEquipment withProviderParty(List<Party> providerParty) {
        this.providerParty = providerParty;
        return this;
    }

    /**
     * Transport Equipment. Loading Proof_ Party. Party
     * <p>
     * The authorized party responsible for certifying that the goods were loaded into this piece of transport equipment.
     * 
     */
    @JsonProperty("LoadingProofParty")
    public List<Party> getLoadingProofParty() {
        return loadingProofParty;
    }

    /**
     * Transport Equipment. Loading Proof_ Party. Party
     * <p>
     * The authorized party responsible for certifying that the goods were loaded into this piece of transport equipment.
     * 
     */
    @JsonProperty("LoadingProofParty")
    public void setLoadingProofParty(List<Party> loadingProofParty) {
        this.loadingProofParty = loadingProofParty;
    }

    public TransportEquipment withLoadingProofParty(List<Party> loadingProofParty) {
        this.loadingProofParty = loadingProofParty;
        return this;
    }

    /**
     * Transport Equipment. Supplier Party
     * <p>
     * The party that supplies this piece of transport equipment.
     * 
     */
    @JsonProperty("SupplierParty")
    public List<SupplierParty> getSupplierParty() {
        return supplierParty;
    }

    /**
     * Transport Equipment. Supplier Party
     * <p>
     * The party that supplies this piece of transport equipment.
     * 
     */
    @JsonProperty("SupplierParty")
    public void setSupplierParty(List<SupplierParty> supplierParty) {
        this.supplierParty = supplierParty;
    }

    public TransportEquipment withSupplierParty(List<SupplierParty> supplierParty) {
        this.supplierParty = supplierParty;
        return this;
    }

    /**
     * Transport Equipment. Owner_ Party. Party
     * <p>
     * The party that owns this piece of transport equipment.
     * 
     */
    @JsonProperty("OwnerParty")
    public List<Party> getOwnerParty() {
        return ownerParty;
    }

    /**
     * Transport Equipment. Owner_ Party. Party
     * <p>
     * The party that owns this piece of transport equipment.
     * 
     */
    @JsonProperty("OwnerParty")
    public void setOwnerParty(List<Party> ownerParty) {
        this.ownerParty = ownerParty;
    }

    public TransportEquipment withOwnerParty(List<Party> ownerParty) {
        this.ownerParty = ownerParty;
        return this;
    }

    /**
     * Transport Equipment. Operating_ Party. Party
     * <p>
     * The party that operates this piece of transport equipment.
     * 
     */
    @JsonProperty("OperatingParty")
    public List<Party> getOperatingParty() {
        return operatingParty;
    }

    /**
     * Transport Equipment. Operating_ Party. Party
     * <p>
     * The party that operates this piece of transport equipment.
     * 
     */
    @JsonProperty("OperatingParty")
    public void setOperatingParty(List<Party> operatingParty) {
        this.operatingParty = operatingParty;
    }

    public TransportEquipment withOperatingParty(List<Party> operatingParty) {
        this.operatingParty = operatingParty;
        return this;
    }

    /**
     * Transport Equipment. Loading_ Location. Location
     * <p>
     * The location where this piece of transport equipment is loaded.
     * 
     */
    @JsonProperty("LoadingLocation")
    public List<Location> getLoadingLocation() {
        return loadingLocation;
    }

    /**
     * Transport Equipment. Loading_ Location. Location
     * <p>
     * The location where this piece of transport equipment is loaded.
     * 
     */
    @JsonProperty("LoadingLocation")
    public void setLoadingLocation(List<Location> loadingLocation) {
        this.loadingLocation = loadingLocation;
    }

    public TransportEquipment withLoadingLocation(List<Location> loadingLocation) {
        this.loadingLocation = loadingLocation;
        return this;
    }

    /**
     * Transport Equipment. Unloading_ Location. Location
     * <p>
     * The location where this piece of transport equipment is unloaded.
     * 
     */
    @JsonProperty("UnloadingLocation")
    public List<Location> getUnloadingLocation() {
        return unloadingLocation;
    }

    /**
     * Transport Equipment. Unloading_ Location. Location
     * <p>
     * The location where this piece of transport equipment is unloaded.
     * 
     */
    @JsonProperty("UnloadingLocation")
    public void setUnloadingLocation(List<Location> unloadingLocation) {
        this.unloadingLocation = unloadingLocation;
    }

    public TransportEquipment withUnloadingLocation(List<Location> unloadingLocation) {
        this.unloadingLocation = unloadingLocation;
        return this;
    }

    /**
     * Transport Equipment. Storage_ Location. Location
     * <p>
     * The location where this piece of transport equipment is being stored.
     * 
     */
    @JsonProperty("StorageLocation")
    public List<Location> getStorageLocation() {
        return storageLocation;
    }

    /**
     * Transport Equipment. Storage_ Location. Location
     * <p>
     * The location where this piece of transport equipment is being stored.
     * 
     */
    @JsonProperty("StorageLocation")
    public void setStorageLocation(List<Location> storageLocation) {
        this.storageLocation = storageLocation;
    }

    public TransportEquipment withStorageLocation(List<Location> storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Transport Equipment. Positioning_ Transport Event. Transport Event
     * <p>
     * A positioning of this piece of transport equipment.
     * 
     */
    @JsonProperty("PositioningTransportEvent")
    public List<TransportEvent> getPositioningTransportEvent() {
        return positioningTransportEvent;
    }

    /**
     * Transport Equipment. Positioning_ Transport Event. Transport Event
     * <p>
     * A positioning of this piece of transport equipment.
     * 
     */
    @JsonProperty("PositioningTransportEvent")
    public void setPositioningTransportEvent(List<TransportEvent> positioningTransportEvent) {
        this.positioningTransportEvent = positioningTransportEvent;
    }

    public TransportEquipment withPositioningTransportEvent(List<TransportEvent> positioningTransportEvent) {
        this.positioningTransportEvent = positioningTransportEvent;
        return this;
    }

    /**
     * Transport Equipment. Quarantine_ Transport Event. Transport Event
     * <p>
     * A quarantine of this piece of transport equipment.
     * 
     */
    @JsonProperty("QuarantineTransportEvent")
    public List<TransportEvent> getQuarantineTransportEvent() {
        return quarantineTransportEvent;
    }

    /**
     * Transport Equipment. Quarantine_ Transport Event. Transport Event
     * <p>
     * A quarantine of this piece of transport equipment.
     * 
     */
    @JsonProperty("QuarantineTransportEvent")
    public void setQuarantineTransportEvent(List<TransportEvent> quarantineTransportEvent) {
        this.quarantineTransportEvent = quarantineTransportEvent;
    }

    public TransportEquipment withQuarantineTransportEvent(List<TransportEvent> quarantineTransportEvent) {
        this.quarantineTransportEvent = quarantineTransportEvent;
        return this;
    }

    /**
     * Transport Equipment. Delivery_ Transport Event. Transport Event
     * <p>
     * A delivery of this piece of transport equipment.
     * 
     */
    @JsonProperty("DeliveryTransportEvent")
    public List<TransportEvent> getDeliveryTransportEvent() {
        return deliveryTransportEvent;
    }

    /**
     * Transport Equipment. Delivery_ Transport Event. Transport Event
     * <p>
     * A delivery of this piece of transport equipment.
     * 
     */
    @JsonProperty("DeliveryTransportEvent")
    public void setDeliveryTransportEvent(List<TransportEvent> deliveryTransportEvent) {
        this.deliveryTransportEvent = deliveryTransportEvent;
    }

    public TransportEquipment withDeliveryTransportEvent(List<TransportEvent> deliveryTransportEvent) {
        this.deliveryTransportEvent = deliveryTransportEvent;
        return this;
    }

    /**
     * Transport Equipment. Pickup_ Transport Event. Transport Event
     * <p>
     * A pickup of this piece of transport equipment.
     * 
     */
    @JsonProperty("PickupTransportEvent")
    public List<TransportEvent> getPickupTransportEvent() {
        return pickupTransportEvent;
    }

    /**
     * Transport Equipment. Pickup_ Transport Event. Transport Event
     * <p>
     * A pickup of this piece of transport equipment.
     * 
     */
    @JsonProperty("PickupTransportEvent")
    public void setPickupTransportEvent(List<TransportEvent> pickupTransportEvent) {
        this.pickupTransportEvent = pickupTransportEvent;
    }

    public TransportEquipment withPickupTransportEvent(List<TransportEvent> pickupTransportEvent) {
        this.pickupTransportEvent = pickupTransportEvent;
        return this;
    }

    /**
     * Transport Equipment. Handling_ Transport Event. Transport Event
     * <p>
     * A handling of this piece of transport equipment.
     * 
     */
    @JsonProperty("HandlingTransportEvent")
    public List<TransportEvent> getHandlingTransportEvent() {
        return handlingTransportEvent;
    }

    /**
     * Transport Equipment. Handling_ Transport Event. Transport Event
     * <p>
     * A handling of this piece of transport equipment.
     * 
     */
    @JsonProperty("HandlingTransportEvent")
    public void setHandlingTransportEvent(List<TransportEvent> handlingTransportEvent) {
        this.handlingTransportEvent = handlingTransportEvent;
    }

    public TransportEquipment withHandlingTransportEvent(List<TransportEvent> handlingTransportEvent) {
        this.handlingTransportEvent = handlingTransportEvent;
        return this;
    }

    /**
     * Transport Equipment. Loading_ Transport Event. Transport Event
     * <p>
     * A loading of this piece of transport equipment.
     * 
     */
    @JsonProperty("LoadingTransportEvent")
    public List<TransportEvent> getLoadingTransportEvent() {
        return loadingTransportEvent;
    }

    /**
     * Transport Equipment. Loading_ Transport Event. Transport Event
     * <p>
     * A loading of this piece of transport equipment.
     * 
     */
    @JsonProperty("LoadingTransportEvent")
    public void setLoadingTransportEvent(List<TransportEvent> loadingTransportEvent) {
        this.loadingTransportEvent = loadingTransportEvent;
    }

    public TransportEquipment withLoadingTransportEvent(List<TransportEvent> loadingTransportEvent) {
        this.loadingTransportEvent = loadingTransportEvent;
        return this;
    }

    /**
     * Transport Equipment. Transport Event
     * <p>
     * A transport event associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEvent")
    public List<TransportEvent> getTransportEvent() {
        return transportEvent;
    }

    /**
     * Transport Equipment. Transport Event
     * <p>
     * A transport event associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("TransportEvent")
    public void setTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
    }

    public TransportEquipment withTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
        return this;
    }

    /**
     * Transport Equipment. Applicable_ Transport Means. Transport Means
     * <p>
     * The applicable transport means associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ApplicableTransportMeans")
    public List<TransportMeans> getApplicableTransportMeans() {
        return applicableTransportMeans;
    }

    /**
     * Transport Equipment. Applicable_ Transport Means. Transport Means
     * <p>
     * The applicable transport means associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ApplicableTransportMeans")
    public void setApplicableTransportMeans(List<TransportMeans> applicableTransportMeans) {
        this.applicableTransportMeans = applicableTransportMeans;
    }

    public TransportEquipment withApplicableTransportMeans(List<TransportMeans> applicableTransportMeans) {
        this.applicableTransportMeans = applicableTransportMeans;
        return this;
    }

    /**
     * Transport Equipment. Haulage_ Trading Terms. Trading Terms
     * <p>
     * A set of haulage trading terms associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("HaulageTradingTerms")
    public List<TradingTerms> getHaulageTradingTerms() {
        return haulageTradingTerms;
    }

    /**
     * Transport Equipment. Haulage_ Trading Terms. Trading Terms
     * <p>
     * A set of haulage trading terms associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("HaulageTradingTerms")
    public void setHaulageTradingTerms(List<TradingTerms> haulageTradingTerms) {
        this.haulageTradingTerms = haulageTradingTerms;
    }

    public TransportEquipment withHaulageTradingTerms(List<TradingTerms> haulageTradingTerms) {
        this.haulageTradingTerms = haulageTradingTerms;
        return this;
    }

    /**
     * Transport Equipment. Hazardous Goods Transit
     * <p>
     * Transit-related information regarding a type of hazardous goods contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    public List<HazardousGoodsTransit> getHazardousGoodsTransit() {
        return hazardousGoodsTransit;
    }

    /**
     * Transport Equipment. Hazardous Goods Transit
     * <p>
     * Transit-related information regarding a type of hazardous goods contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    public void setHazardousGoodsTransit(List<HazardousGoodsTransit> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
    }

    public TransportEquipment withHazardousGoodsTransit(List<HazardousGoodsTransit> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
        return this;
    }

    /**
     * Transport Equipment. Packaged_ Transport Handling Unit. Transport Handling Unit
     * <p>
     * A packaged transport handling unit associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("PackagedTransportHandlingUnit")
    public List<TransportHandlingUnit> getPackagedTransportHandlingUnit() {
        return packagedTransportHandlingUnit;
    }

    /**
     * Transport Equipment. Packaged_ Transport Handling Unit. Transport Handling Unit
     * <p>
     * A packaged transport handling unit associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("PackagedTransportHandlingUnit")
    public void setPackagedTransportHandlingUnit(List<TransportHandlingUnit> packagedTransportHandlingUnit) {
        this.packagedTransportHandlingUnit = packagedTransportHandlingUnit;
    }

    public TransportEquipment withPackagedTransportHandlingUnit(List<TransportHandlingUnit> packagedTransportHandlingUnit) {
        this.packagedTransportHandlingUnit = packagedTransportHandlingUnit;
        return this;
    }

    /**
     * Transport Equipment. Service_ Allowance Charge. Allowance Charge
     * <p>
     * A service allowance charge associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ServiceAllowanceCharge")
    public List<AllowanceCharge> getServiceAllowanceCharge() {
        return serviceAllowanceCharge;
    }

    /**
     * Transport Equipment. Service_ Allowance Charge. Allowance Charge
     * <p>
     * A service allowance charge associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ServiceAllowanceCharge")
    public void setServiceAllowanceCharge(List<AllowanceCharge> serviceAllowanceCharge) {
        this.serviceAllowanceCharge = serviceAllowanceCharge;
    }

    public TransportEquipment withServiceAllowanceCharge(List<AllowanceCharge> serviceAllowanceCharge) {
        this.serviceAllowanceCharge = serviceAllowanceCharge;
        return this;
    }

    /**
     * Transport Equipment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A freight allowance charge associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public List<AllowanceCharge> getFreightAllowanceCharge() {
        return freightAllowanceCharge;
    }

    /**
     * Transport Equipment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A freight allowance charge associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public void setFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
    }

    public TransportEquipment withFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
        return this;
    }

    /**
     * Transport Equipment. Attached_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment attached to this piece of transport equipment.
     * 
     */
    @JsonProperty("AttachedTransportEquipment")
    public List<TransportEquipment> getAttachedTransportEquipment() {
        return attachedTransportEquipment;
    }

    /**
     * Transport Equipment. Attached_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment attached to this piece of transport equipment.
     * 
     */
    @JsonProperty("AttachedTransportEquipment")
    public void setAttachedTransportEquipment(List<TransportEquipment> attachedTransportEquipment) {
        this.attachedTransportEquipment = attachedTransportEquipment;
    }

    public TransportEquipment withAttachedTransportEquipment(List<TransportEquipment> attachedTransportEquipment) {
        this.attachedTransportEquipment = attachedTransportEquipment;
        return this;
    }

    /**
     * Transport Equipment. Delivery
     * <p>
     * The delivery of this piece of transport equipment.
     * 
     */
    @JsonProperty("Delivery")
    public List<Delivery> getDelivery() {
        return delivery;
    }

    /**
     * Transport Equipment. Delivery
     * <p>
     * The delivery of this piece of transport equipment.
     * 
     */
    @JsonProperty("Delivery")
    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public TransportEquipment withDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Transport Equipment. Pickup
     * <p>
     * The pickup of this piece of transport equipment.
     * 
     */
    @JsonProperty("Pickup")
    public List<Pickup> getPickup() {
        return pickup;
    }

    /**
     * Transport Equipment. Pickup
     * <p>
     * The pickup of this piece of transport equipment.
     * 
     */
    @JsonProperty("Pickup")
    public void setPickup(List<Pickup> pickup) {
        this.pickup = pickup;
    }

    public TransportEquipment withPickup(List<Pickup> pickup) {
        this.pickup = pickup;
        return this;
    }

    /**
     * Transport Equipment. Despatch
     * <p>
     * The despatch of this piece of transport equipment.
     * 
     */
    @JsonProperty("Despatch")
    public List<Despatch> getDespatch() {
        return despatch;
    }

    /**
     * Transport Equipment. Despatch
     * <p>
     * The despatch of this piece of transport equipment.
     * 
     */
    @JsonProperty("Despatch")
    public void setDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
    }

    public TransportEquipment withDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
        return this;
    }

    /**
     * Transport Equipment. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    public List<DocumentReference> getShipmentDocumentReference() {
        return shipmentDocumentReference;
    }

    /**
     * Transport Equipment. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this piece of transport equipment.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    public void setShipmentDocumentReference(List<DocumentReference> shipmentDocumentReference) {
        this.shipmentDocumentReference = shipmentDocumentReference;
    }

    public TransportEquipment withShipmentDocumentReference(List<DocumentReference> shipmentDocumentReference) {
        this.shipmentDocumentReference = shipmentDocumentReference;
        return this;
    }

    /**
     * Transport Equipment. Contained In_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("ContainedInTransportEquipment")
    public List<TransportEquipment> getContainedInTransportEquipment() {
        return containedInTransportEquipment;
    }

    /**
     * Transport Equipment. Contained In_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("ContainedInTransportEquipment")
    public void setContainedInTransportEquipment(List<TransportEquipment> containedInTransportEquipment) {
        this.containedInTransportEquipment = containedInTransportEquipment;
    }

    public TransportEquipment withContainedInTransportEquipment(List<TransportEquipment> containedInTransportEquipment) {
        this.containedInTransportEquipment = containedInTransportEquipment;
        return this;
    }

    /**
     * Transport Equipment. Package
     * <p>
     * A package contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("Package")
    public List<Package> getPackage() {
        return _package;
    }

    /**
     * Transport Equipment. Package
     * <p>
     * A package contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("Package")
    public void setPackage(List<Package> _package) {
        this._package = _package;
    }

    public TransportEquipment withPackage(List<Package> _package) {
        this._package = _package;
        return this;
    }

    /**
     * Transport Equipment. Goods Item
     * <p>
     * A goods item contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("GoodsItem")
    public List<GoodsItem> getGoodsItem() {
        return goodsItem;
    }

    /**
     * Transport Equipment. Goods Item
     * <p>
     * A goods item contained in this piece of transport equipment.
     * 
     */
    @JsonProperty("GoodsItem")
    public void setGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
    }

    public TransportEquipment withGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportEquipment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("referencedConsignmentID");
        sb.append('=');
        sb.append(((this.referencedConsignmentID == null)?"<null>":this.referencedConsignmentID));
        sb.append(',');
        sb.append("transportEquipmentTypeCode");
        sb.append('=');
        sb.append(((this.transportEquipmentTypeCode == null)?"<null>":this.transportEquipmentTypeCode));
        sb.append(',');
        sb.append("providerTypeCode");
        sb.append('=');
        sb.append(((this.providerTypeCode == null)?"<null>":this.providerTypeCode));
        sb.append(',');
        sb.append("ownerTypeCode");
        sb.append('=');
        sb.append(((this.ownerTypeCode == null)?"<null>":this.ownerTypeCode));
        sb.append(',');
        sb.append("sizeTypeCode");
        sb.append('=');
        sb.append(((this.sizeTypeCode == null)?"<null>":this.sizeTypeCode));
        sb.append(',');
        sb.append("dispositionCode");
        sb.append('=');
        sb.append(((this.dispositionCode == null)?"<null>":this.dispositionCode));
        sb.append(',');
        sb.append("fullnessIndicationCode");
        sb.append('=');
        sb.append(((this.fullnessIndicationCode == null)?"<null>":this.fullnessIndicationCode));
        sb.append(',');
        sb.append("refrigerationOnIndicator");
        sb.append('=');
        sb.append(((this.refrigerationOnIndicator == null)?"<null>":this.refrigerationOnIndicator));
        sb.append(',');
        sb.append("information");
        sb.append('=');
        sb.append(((this.information == null)?"<null>":this.information));
        sb.append(',');
        sb.append("returnabilityIndicator");
        sb.append('=');
        sb.append(((this.returnabilityIndicator == null)?"<null>":this.returnabilityIndicator));
        sb.append(',');
        sb.append("legalStatusIndicator");
        sb.append('=');
        sb.append(((this.legalStatusIndicator == null)?"<null>":this.legalStatusIndicator));
        sb.append(',');
        sb.append("airFlowPercent");
        sb.append('=');
        sb.append(((this.airFlowPercent == null)?"<null>":this.airFlowPercent));
        sb.append(',');
        sb.append("humidityPercent");
        sb.append('=');
        sb.append(((this.humidityPercent == null)?"<null>":this.humidityPercent));
        sb.append(',');
        sb.append("animalFoodApprovedIndicator");
        sb.append('=');
        sb.append(((this.animalFoodApprovedIndicator == null)?"<null>":this.animalFoodApprovedIndicator));
        sb.append(',');
        sb.append("humanFoodApprovedIndicator");
        sb.append('=');
        sb.append(((this.humanFoodApprovedIndicator == null)?"<null>":this.humanFoodApprovedIndicator));
        sb.append(',');
        sb.append("dangerousGoodsApprovedIndicator");
        sb.append('=');
        sb.append(((this.dangerousGoodsApprovedIndicator == null)?"<null>":this.dangerousGoodsApprovedIndicator));
        sb.append(',');
        sb.append("refrigeratedIndicator");
        sb.append('=');
        sb.append(((this.refrigeratedIndicator == null)?"<null>":this.refrigeratedIndicator));
        sb.append(',');
        sb.append("characteristics");
        sb.append('=');
        sb.append(((this.characteristics == null)?"<null>":this.characteristics));
        sb.append(',');
        sb.append("damageRemarks");
        sb.append('=');
        sb.append(((this.damageRemarks == null)?"<null>":this.damageRemarks));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("specialTransportRequirements");
        sb.append('=');
        sb.append(((this.specialTransportRequirements == null)?"<null>":this.specialTransportRequirements));
        sb.append(',');
        sb.append("grossWeightMeasure");
        sb.append('=');
        sb.append(((this.grossWeightMeasure == null)?"<null>":this.grossWeightMeasure));
        sb.append(',');
        sb.append("grossVolumeMeasure");
        sb.append('=');
        sb.append(((this.grossVolumeMeasure == null)?"<null>":this.grossVolumeMeasure));
        sb.append(',');
        sb.append("tareWeightMeasure");
        sb.append('=');
        sb.append(((this.tareWeightMeasure == null)?"<null>":this.tareWeightMeasure));
        sb.append(',');
        sb.append("trackingDeviceCode");
        sb.append('=');
        sb.append(((this.trackingDeviceCode == null)?"<null>":this.trackingDeviceCode));
        sb.append(',');
        sb.append("powerIndicator");
        sb.append('=');
        sb.append(((this.powerIndicator == null)?"<null>":this.powerIndicator));
        sb.append(',');
        sb.append("traceID");
        sb.append('=');
        sb.append(((this.traceID == null)?"<null>":this.traceID));
        sb.append(',');
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
        sb.append(',');
        sb.append("transportEquipmentSeal");
        sb.append('=');
        sb.append(((this.transportEquipmentSeal == null)?"<null>":this.transportEquipmentSeal));
        sb.append(',');
        sb.append("minimumTemperature");
        sb.append('=');
        sb.append(((this.minimumTemperature == null)?"<null>":this.minimumTemperature));
        sb.append(',');
        sb.append("maximumTemperature");
        sb.append('=');
        sb.append(((this.maximumTemperature == null)?"<null>":this.maximumTemperature));
        sb.append(',');
        sb.append("providerParty");
        sb.append('=');
        sb.append(((this.providerParty == null)?"<null>":this.providerParty));
        sb.append(',');
        sb.append("loadingProofParty");
        sb.append('=');
        sb.append(((this.loadingProofParty == null)?"<null>":this.loadingProofParty));
        sb.append(',');
        sb.append("supplierParty");
        sb.append('=');
        sb.append(((this.supplierParty == null)?"<null>":this.supplierParty));
        sb.append(',');
        sb.append("ownerParty");
        sb.append('=');
        sb.append(((this.ownerParty == null)?"<null>":this.ownerParty));
        sb.append(',');
        sb.append("operatingParty");
        sb.append('=');
        sb.append(((this.operatingParty == null)?"<null>":this.operatingParty));
        sb.append(',');
        sb.append("loadingLocation");
        sb.append('=');
        sb.append(((this.loadingLocation == null)?"<null>":this.loadingLocation));
        sb.append(',');
        sb.append("unloadingLocation");
        sb.append('=');
        sb.append(((this.unloadingLocation == null)?"<null>":this.unloadingLocation));
        sb.append(',');
        sb.append("storageLocation");
        sb.append('=');
        sb.append(((this.storageLocation == null)?"<null>":this.storageLocation));
        sb.append(',');
        sb.append("positioningTransportEvent");
        sb.append('=');
        sb.append(((this.positioningTransportEvent == null)?"<null>":this.positioningTransportEvent));
        sb.append(',');
        sb.append("quarantineTransportEvent");
        sb.append('=');
        sb.append(((this.quarantineTransportEvent == null)?"<null>":this.quarantineTransportEvent));
        sb.append(',');
        sb.append("deliveryTransportEvent");
        sb.append('=');
        sb.append(((this.deliveryTransportEvent == null)?"<null>":this.deliveryTransportEvent));
        sb.append(',');
        sb.append("pickupTransportEvent");
        sb.append('=');
        sb.append(((this.pickupTransportEvent == null)?"<null>":this.pickupTransportEvent));
        sb.append(',');
        sb.append("handlingTransportEvent");
        sb.append('=');
        sb.append(((this.handlingTransportEvent == null)?"<null>":this.handlingTransportEvent));
        sb.append(',');
        sb.append("loadingTransportEvent");
        sb.append('=');
        sb.append(((this.loadingTransportEvent == null)?"<null>":this.loadingTransportEvent));
        sb.append(',');
        sb.append("transportEvent");
        sb.append('=');
        sb.append(((this.transportEvent == null)?"<null>":this.transportEvent));
        sb.append(',');
        sb.append("applicableTransportMeans");
        sb.append('=');
        sb.append(((this.applicableTransportMeans == null)?"<null>":this.applicableTransportMeans));
        sb.append(',');
        sb.append("haulageTradingTerms");
        sb.append('=');
        sb.append(((this.haulageTradingTerms == null)?"<null>":this.haulageTradingTerms));
        sb.append(',');
        sb.append("hazardousGoodsTransit");
        sb.append('=');
        sb.append(((this.hazardousGoodsTransit == null)?"<null>":this.hazardousGoodsTransit));
        sb.append(',');
        sb.append("packagedTransportHandlingUnit");
        sb.append('=');
        sb.append(((this.packagedTransportHandlingUnit == null)?"<null>":this.packagedTransportHandlingUnit));
        sb.append(',');
        sb.append("serviceAllowanceCharge");
        sb.append('=');
        sb.append(((this.serviceAllowanceCharge == null)?"<null>":this.serviceAllowanceCharge));
        sb.append(',');
        sb.append("freightAllowanceCharge");
        sb.append('=');
        sb.append(((this.freightAllowanceCharge == null)?"<null>":this.freightAllowanceCharge));
        sb.append(',');
        sb.append("attachedTransportEquipment");
        sb.append('=');
        sb.append(((this.attachedTransportEquipment == null)?"<null>":this.attachedTransportEquipment));
        sb.append(',');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("pickup");
        sb.append('=');
        sb.append(((this.pickup == null)?"<null>":this.pickup));
        sb.append(',');
        sb.append("despatch");
        sb.append('=');
        sb.append(((this.despatch == null)?"<null>":this.despatch));
        sb.append(',');
        sb.append("shipmentDocumentReference");
        sb.append('=');
        sb.append(((this.shipmentDocumentReference == null)?"<null>":this.shipmentDocumentReference));
        sb.append(',');
        sb.append("containedInTransportEquipment");
        sb.append('=');
        sb.append(((this.containedInTransportEquipment == null)?"<null>":this.containedInTransportEquipment));
        sb.append(',');
        sb.append("_package");
        sb.append('=');
        sb.append(((this._package == null)?"<null>":this._package));
        sb.append(',');
        sb.append("goodsItem");
        sb.append('=');
        sb.append(((this.goodsItem == null)?"<null>":this.goodsItem));
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
        result = ((result* 31)+((this.ownerTypeCode == null)? 0 :this.ownerTypeCode.hashCode()));
        result = ((result* 31)+((this.transportEvent == null)? 0 :this.transportEvent.hashCode()));
        result = ((result* 31)+((this.storageLocation == null)? 0 :this.storageLocation.hashCode()));
        result = ((result* 31)+((this.hazardousGoodsTransit == null)? 0 :this.hazardousGoodsTransit.hashCode()));
        result = ((result* 31)+((this.airFlowPercent == null)? 0 :this.airFlowPercent.hashCode()));
        result = ((result* 31)+((this.applicableTransportMeans == null)? 0 :this.applicableTransportMeans.hashCode()));
        result = ((result* 31)+((this.pickupTransportEvent == null)? 0 :this.pickupTransportEvent.hashCode()));
        result = ((result* 31)+((this.supplierParty == null)? 0 :this.supplierParty.hashCode()));
        result = ((result* 31)+((this.goodsItem == null)? 0 :this.goodsItem.hashCode()));
        result = ((result* 31)+((this.loadingProofParty == null)? 0 :this.loadingProofParty.hashCode()));
        result = ((result* 31)+((this.despatch == null)? 0 :this.despatch.hashCode()));
        result = ((result* 31)+((this.providerParty == null)? 0 :this.providerParty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.freightAllowanceCharge == null)? 0 :this.freightAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.legalStatusIndicator == null)? 0 :this.legalStatusIndicator.hashCode()));
        result = ((result* 31)+((this.tareWeightMeasure == null)? 0 :this.tareWeightMeasure.hashCode()));
        result = ((result* 31)+((this.ownerParty == null)? 0 :this.ownerParty.hashCode()));
        result = ((result* 31)+((this.serviceAllowanceCharge == null)? 0 :this.serviceAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.fullnessIndicationCode == null)? 0 :this.fullnessIndicationCode.hashCode()));
        result = ((result* 31)+((this.shipmentDocumentReference == null)? 0 :this.shipmentDocumentReference.hashCode()));
        result = ((result* 31)+((this.dangerousGoodsApprovedIndicator == null)? 0 :this.dangerousGoodsApprovedIndicator.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        result = ((result* 31)+((this.traceID == null)? 0 :this.traceID.hashCode()));
        result = ((result* 31)+((this.refrigeratedIndicator == null)? 0 :this.refrigeratedIndicator.hashCode()));
        result = ((result* 31)+((this.loadingLocation == null)? 0 :this.loadingLocation.hashCode()));
        result = ((result* 31)+((this.packagedTransportHandlingUnit == null)? 0 :this.packagedTransportHandlingUnit.hashCode()));
        result = ((result* 31)+((this.containedInTransportEquipment == null)? 0 :this.containedInTransportEquipment.hashCode()));
        result = ((result* 31)+((this.operatingParty == null)? 0 :this.operatingParty.hashCode()));
        result = ((result* 31)+((this.animalFoodApprovedIndicator == null)? 0 :this.animalFoodApprovedIndicator.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dispositionCode == null)? 0 :this.dispositionCode.hashCode()));
        result = ((result* 31)+((this.quarantineTransportEvent == null)? 0 :this.quarantineTransportEvent.hashCode()));
        result = ((result* 31)+((this.transportEquipmentSeal == null)? 0 :this.transportEquipmentSeal.hashCode()));
        result = ((result* 31)+((this.damageRemarks == null)? 0 :this.damageRemarks.hashCode()));
        result = ((result* 31)+((this.powerIndicator == null)? 0 :this.powerIndicator.hashCode()));
        result = ((result* 31)+((this.maximumTemperature == null)? 0 :this.maximumTemperature.hashCode()));
        result = ((result* 31)+((this.grossWeightMeasure == null)? 0 :this.grossWeightMeasure.hashCode()));
        result = ((result* 31)+((this.humanFoodApprovedIndicator == null)? 0 :this.humanFoodApprovedIndicator.hashCode()));
        result = ((result* 31)+((this.humidityPercent == null)? 0 :this.humidityPercent.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.characteristics == null)? 0 :this.characteristics.hashCode()));
        result = ((result* 31)+((this.referencedConsignmentID == null)? 0 :this.referencedConsignmentID.hashCode()));
        result = ((result* 31)+((this.providerTypeCode == null)? 0 :this.providerTypeCode.hashCode()));
        result = ((result* 31)+((this.specialTransportRequirements == null)? 0 :this.specialTransportRequirements.hashCode()));
        result = ((result* 31)+((this.attachedTransportEquipment == null)? 0 :this.attachedTransportEquipment.hashCode()));
        result = ((result* 31)+((this.pickup == null)? 0 :this.pickup.hashCode()));
        result = ((result* 31)+((this.loadingTransportEvent == null)? 0 :this.loadingTransportEvent.hashCode()));
        result = ((result* 31)+((this.deliveryTransportEvent == null)? 0 :this.deliveryTransportEvent.hashCode()));
        result = ((result* 31)+((this.haulageTradingTerms == null)? 0 :this.haulageTradingTerms.hashCode()));
        result = ((result* 31)+((this.returnabilityIndicator == null)? 0 :this.returnabilityIndicator.hashCode()));
        result = ((result* 31)+((this._package == null)? 0 :this._package.hashCode()));
        result = ((result* 31)+((this.sizeTypeCode == null)? 0 :this.sizeTypeCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.trackingDeviceCode == null)? 0 :this.trackingDeviceCode.hashCode()));
        result = ((result* 31)+((this.handlingTransportEvent == null)? 0 :this.handlingTransportEvent.hashCode()));
        result = ((result* 31)+((this.minimumTemperature == null)? 0 :this.minimumTemperature.hashCode()));
        result = ((result* 31)+((this.transportEquipmentTypeCode == null)? 0 :this.transportEquipmentTypeCode.hashCode()));
        result = ((result* 31)+((this.information == null)? 0 :this.information.hashCode()));
        result = ((result* 31)+((this.unloadingLocation == null)? 0 :this.unloadingLocation.hashCode()));
        result = ((result* 31)+((this.positioningTransportEvent == null)? 0 :this.positioningTransportEvent.hashCode()));
        result = ((result* 31)+((this.refrigerationOnIndicator == null)? 0 :this.refrigerationOnIndicator.hashCode()));
        result = ((result* 31)+((this.grossVolumeMeasure == null)? 0 :this.grossVolumeMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportEquipment) == false) {
            return false;
        }
        TransportEquipment rhs = ((TransportEquipment) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.ownerTypeCode == rhs.ownerTypeCode)||((this.ownerTypeCode!= null)&&this.ownerTypeCode.equals(rhs.ownerTypeCode)))&&((this.transportEvent == rhs.transportEvent)||((this.transportEvent!= null)&&this.transportEvent.equals(rhs.transportEvent))))&&((this.storageLocation == rhs.storageLocation)||((this.storageLocation!= null)&&this.storageLocation.equals(rhs.storageLocation))))&&((this.hazardousGoodsTransit == rhs.hazardousGoodsTransit)||((this.hazardousGoodsTransit!= null)&&this.hazardousGoodsTransit.equals(rhs.hazardousGoodsTransit))))&&((this.airFlowPercent == rhs.airFlowPercent)||((this.airFlowPercent!= null)&&this.airFlowPercent.equals(rhs.airFlowPercent))))&&((this.applicableTransportMeans == rhs.applicableTransportMeans)||((this.applicableTransportMeans!= null)&&this.applicableTransportMeans.equals(rhs.applicableTransportMeans))))&&((this.pickupTransportEvent == rhs.pickupTransportEvent)||((this.pickupTransportEvent!= null)&&this.pickupTransportEvent.equals(rhs.pickupTransportEvent))))&&((this.supplierParty == rhs.supplierParty)||((this.supplierParty!= null)&&this.supplierParty.equals(rhs.supplierParty))))&&((this.goodsItem == rhs.goodsItem)||((this.goodsItem!= null)&&this.goodsItem.equals(rhs.goodsItem))))&&((this.loadingProofParty == rhs.loadingProofParty)||((this.loadingProofParty!= null)&&this.loadingProofParty.equals(rhs.loadingProofParty))))&&((this.despatch == rhs.despatch)||((this.despatch!= null)&&this.despatch.equals(rhs.despatch))))&&((this.providerParty == rhs.providerParty)||((this.providerParty!= null)&&this.providerParty.equals(rhs.providerParty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.freightAllowanceCharge == rhs.freightAllowanceCharge)||((this.freightAllowanceCharge!= null)&&this.freightAllowanceCharge.equals(rhs.freightAllowanceCharge))))&&((this.legalStatusIndicator == rhs.legalStatusIndicator)||((this.legalStatusIndicator!= null)&&this.legalStatusIndicator.equals(rhs.legalStatusIndicator))))&&((this.tareWeightMeasure == rhs.tareWeightMeasure)||((this.tareWeightMeasure!= null)&&this.tareWeightMeasure.equals(rhs.tareWeightMeasure))))&&((this.ownerParty == rhs.ownerParty)||((this.ownerParty!= null)&&this.ownerParty.equals(rhs.ownerParty))))&&((this.serviceAllowanceCharge == rhs.serviceAllowanceCharge)||((this.serviceAllowanceCharge!= null)&&this.serviceAllowanceCharge.equals(rhs.serviceAllowanceCharge))))&&((this.fullnessIndicationCode == rhs.fullnessIndicationCode)||((this.fullnessIndicationCode!= null)&&this.fullnessIndicationCode.equals(rhs.fullnessIndicationCode))))&&((this.shipmentDocumentReference == rhs.shipmentDocumentReference)||((this.shipmentDocumentReference!= null)&&this.shipmentDocumentReference.equals(rhs.shipmentDocumentReference))))&&((this.dangerousGoodsApprovedIndicator == rhs.dangerousGoodsApprovedIndicator)||((this.dangerousGoodsApprovedIndicator!= null)&&this.dangerousGoodsApprovedIndicator.equals(rhs.dangerousGoodsApprovedIndicator))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))))&&((this.traceID == rhs.traceID)||((this.traceID!= null)&&this.traceID.equals(rhs.traceID))))&&((this.refrigeratedIndicator == rhs.refrigeratedIndicator)||((this.refrigeratedIndicator!= null)&&this.refrigeratedIndicator.equals(rhs.refrigeratedIndicator))))&&((this.loadingLocation == rhs.loadingLocation)||((this.loadingLocation!= null)&&this.loadingLocation.equals(rhs.loadingLocation))))&&((this.packagedTransportHandlingUnit == rhs.packagedTransportHandlingUnit)||((this.packagedTransportHandlingUnit!= null)&&this.packagedTransportHandlingUnit.equals(rhs.packagedTransportHandlingUnit))))&&((this.containedInTransportEquipment == rhs.containedInTransportEquipment)||((this.containedInTransportEquipment!= null)&&this.containedInTransportEquipment.equals(rhs.containedInTransportEquipment))))&&((this.operatingParty == rhs.operatingParty)||((this.operatingParty!= null)&&this.operatingParty.equals(rhs.operatingParty))))&&((this.animalFoodApprovedIndicator == rhs.animalFoodApprovedIndicator)||((this.animalFoodApprovedIndicator!= null)&&this.animalFoodApprovedIndicator.equals(rhs.animalFoodApprovedIndicator))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dispositionCode == rhs.dispositionCode)||((this.dispositionCode!= null)&&this.dispositionCode.equals(rhs.dispositionCode))))&&((this.quarantineTransportEvent == rhs.quarantineTransportEvent)||((this.quarantineTransportEvent!= null)&&this.quarantineTransportEvent.equals(rhs.quarantineTransportEvent))))&&((this.transportEquipmentSeal == rhs.transportEquipmentSeal)||((this.transportEquipmentSeal!= null)&&this.transportEquipmentSeal.equals(rhs.transportEquipmentSeal))))&&((this.damageRemarks == rhs.damageRemarks)||((this.damageRemarks!= null)&&this.damageRemarks.equals(rhs.damageRemarks))))&&((this.powerIndicator == rhs.powerIndicator)||((this.powerIndicator!= null)&&this.powerIndicator.equals(rhs.powerIndicator))))&&((this.maximumTemperature == rhs.maximumTemperature)||((this.maximumTemperature!= null)&&this.maximumTemperature.equals(rhs.maximumTemperature))))&&((this.grossWeightMeasure == rhs.grossWeightMeasure)||((this.grossWeightMeasure!= null)&&this.grossWeightMeasure.equals(rhs.grossWeightMeasure))))&&((this.humanFoodApprovedIndicator == rhs.humanFoodApprovedIndicator)||((this.humanFoodApprovedIndicator!= null)&&this.humanFoodApprovedIndicator.equals(rhs.humanFoodApprovedIndicator))))&&((this.humidityPercent == rhs.humidityPercent)||((this.humidityPercent!= null)&&this.humidityPercent.equals(rhs.humidityPercent))))&&((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery))))&&((this.characteristics == rhs.characteristics)||((this.characteristics!= null)&&this.characteristics.equals(rhs.characteristics))))&&((this.referencedConsignmentID == rhs.referencedConsignmentID)||((this.referencedConsignmentID!= null)&&this.referencedConsignmentID.equals(rhs.referencedConsignmentID))))&&((this.providerTypeCode == rhs.providerTypeCode)||((this.providerTypeCode!= null)&&this.providerTypeCode.equals(rhs.providerTypeCode))))&&((this.specialTransportRequirements == rhs.specialTransportRequirements)||((this.specialTransportRequirements!= null)&&this.specialTransportRequirements.equals(rhs.specialTransportRequirements))))&&((this.attachedTransportEquipment == rhs.attachedTransportEquipment)||((this.attachedTransportEquipment!= null)&&this.attachedTransportEquipment.equals(rhs.attachedTransportEquipment))))&&((this.pickup == rhs.pickup)||((this.pickup!= null)&&this.pickup.equals(rhs.pickup))))&&((this.loadingTransportEvent == rhs.loadingTransportEvent)||((this.loadingTransportEvent!= null)&&this.loadingTransportEvent.equals(rhs.loadingTransportEvent))))&&((this.deliveryTransportEvent == rhs.deliveryTransportEvent)||((this.deliveryTransportEvent!= null)&&this.deliveryTransportEvent.equals(rhs.deliveryTransportEvent))))&&((this.haulageTradingTerms == rhs.haulageTradingTerms)||((this.haulageTradingTerms!= null)&&this.haulageTradingTerms.equals(rhs.haulageTradingTerms))))&&((this.returnabilityIndicator == rhs.returnabilityIndicator)||((this.returnabilityIndicator!= null)&&this.returnabilityIndicator.equals(rhs.returnabilityIndicator))))&&((this._package == rhs._package)||((this._package!= null)&&this._package.equals(rhs._package))))&&((this.sizeTypeCode == rhs.sizeTypeCode)||((this.sizeTypeCode!= null)&&this.sizeTypeCode.equals(rhs.sizeTypeCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.trackingDeviceCode == rhs.trackingDeviceCode)||((this.trackingDeviceCode!= null)&&this.trackingDeviceCode.equals(rhs.trackingDeviceCode))))&&((this.handlingTransportEvent == rhs.handlingTransportEvent)||((this.handlingTransportEvent!= null)&&this.handlingTransportEvent.equals(rhs.handlingTransportEvent))))&&((this.minimumTemperature == rhs.minimumTemperature)||((this.minimumTemperature!= null)&&this.minimumTemperature.equals(rhs.minimumTemperature))))&&((this.transportEquipmentTypeCode == rhs.transportEquipmentTypeCode)||((this.transportEquipmentTypeCode!= null)&&this.transportEquipmentTypeCode.equals(rhs.transportEquipmentTypeCode))))&&((this.information == rhs.information)||((this.information!= null)&&this.information.equals(rhs.information))))&&((this.unloadingLocation == rhs.unloadingLocation)||((this.unloadingLocation!= null)&&this.unloadingLocation.equals(rhs.unloadingLocation))))&&((this.positioningTransportEvent == rhs.positioningTransportEvent)||((this.positioningTransportEvent!= null)&&this.positioningTransportEvent.equals(rhs.positioningTransportEvent))))&&((this.refrigerationOnIndicator == rhs.refrigerationOnIndicator)||((this.refrigerationOnIndicator!= null)&&this.refrigerationOnIndicator.equals(rhs.refrigerationOnIndicator))))&&((this.grossVolumeMeasure == rhs.grossVolumeMeasure)||((this.grossVolumeMeasure!= null)&&this.grossVolumeMeasure.equals(rhs.grossVolumeMeasure))));
    }

}
