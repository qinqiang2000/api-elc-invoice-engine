
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
 * Transport Handling Unit. Details
 * <p>
 * A class to describe a uniquely identifiable unit consisting of one or more packages, goods items, or pieces of transport equipment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "TransportHandlingUnitTypeCode",
    "HandlingCode",
    "HandlingInstructions",
    "HazardousRiskIndicator",
    "TotalGoodsItemQuantity",
    "TotalPackageQuantity",
    "DamageRemarks",
    "ShippingMarks",
    "TraceID",
    "HandlingUnitDespatchLine",
    "ActualPackage",
    "ReceivedHandlingUnitReceiptLine",
    "TransportEquipment",
    "TransportMeans",
    "HazardousGoodsTransit",
    "MeasurementDimension",
    "MinimumTemperature",
    "MaximumTemperature",
    "GoodsItem",
    "FloorSpaceMeasurementDimension",
    "PalletSpaceMeasurementDimension",
    "ShipmentDocumentReference",
    "Status",
    "CustomsDeclaration",
    "ReferencedShipment",
    "Package"
})
@Generated("jsonschema2pojo")
public class TransportHandlingUnit {

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
     * Transport Handling Unit. Identifier
     * <p>
     * An identifier for this transport handling unit.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Transport Handling Unit. Transport Handling Unit Type Code. Code
     * <p>
     * A code signifying the type of this transport handling unit.
     * 
     */
    @JsonProperty("TransportHandlingUnitTypeCode")
    @JsonPropertyDescription("A code signifying the type of this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportHandlingUnitTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Handling Unit. Handling Code. Code
     * <p>
     * The handling required for this transport handling unit, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    @JsonPropertyDescription("The handling required for this transport handling unit, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> handlingCode = new ArrayList<CodeType>();
    /**
     * Transport Handling Unit. Handling_ Instructions. Text
     * <p>
     * The handling required for this transport handling unit, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    @JsonPropertyDescription("The handling required for this transport handling unit, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> handlingInstructions = new ArrayList<TextType>();
    /**
     * Transport Handling Unit. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indicator that the materials contained in this transport handling unit are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    @JsonPropertyDescription("An indicator that the materials contained in this transport handling unit are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> hazardousRiskIndicator = new ArrayList<IndicatorType>();
    /**
     * Transport Handling Unit. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this transport handling unit.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    @JsonPropertyDescription("The total number of goods items in this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalGoodsItemQuantity = new ArrayList<QuantityType>();
    /**
     * Transport Handling Unit. Total_ Package Quantity. Quantity
     * <p>
     * The total number of packages in this transport handling unit.
     * 
     */
    @JsonProperty("TotalPackageQuantity")
    @JsonPropertyDescription("The total number of packages in this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalPackageQuantity = new ArrayList<QuantityType>();
    /**
     * Transport Handling Unit. Damage_ Remarks. Text
     * <p>
     * Text describing damage associated with this transport handling unit.
     * 
     */
    @JsonProperty("DamageRemarks")
    @JsonPropertyDescription("Text describing damage associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<TextType> damageRemarks = new ArrayList<TextType>();
    /**
     * Transport Handling Unit. Shipping_ Marks. Text
     * <p>
     * Text describing the marks and numbers on this transport handling unit.
     * 
     */
    @JsonProperty("ShippingMarks")
    @JsonPropertyDescription("Text describing the marks and numbers on this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<TextType> shippingMarks = new ArrayList<TextType>();
    /**
     * Transport Handling Unit. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this transport handling unit, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    @JsonPropertyDescription("An identifier for use in tracing this transport handling unit, such as the EPC number used in RFID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> traceID = new ArrayList<IdentifierType>();
    /**
     * Transport Handling Unit. Handling Unit_ Despatch Line. Despatch Line
     * <p>
     * A despatch line associated with this transport handling unit.
     * 
     */
    @JsonProperty("HandlingUnitDespatchLine")
    @JsonPropertyDescription("A despatch line associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<DespatchLine> handlingUnitDespatchLine = new ArrayList<DespatchLine>();
    /**
     * Transport Handling Unit. Actual_ Package. Package
     * <p>
     * A package contained in this transport handling unit.
     * 
     */
    @JsonProperty("ActualPackage")
    @JsonPropertyDescription("A package contained in this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<Package> actualPackage = new ArrayList<Package>();
    /**
     * Transport Handling Unit. Received Handling Unit_ Receipt Line. Receipt Line
     * <p>
     * A receipt line associated with this transport handling unit.
     * 
     */
    @JsonProperty("ReceivedHandlingUnitReceiptLine")
    @JsonPropertyDescription("A receipt line associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<ReceiptLine> receivedHandlingUnitReceiptLine = new ArrayList<ReceiptLine>();
    /**
     * Transport Handling Unit. Transport Equipment
     * <p>
     * A piece of transport equipment associated with this transport handling unit.
     * 
     */
    @JsonProperty("TransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> transportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Transport Handling Unit. Transport Means
     * <p>
     * A means of transport associated with this transport handling unit.
     * 
     */
    @JsonProperty("TransportMeans")
    @JsonPropertyDescription("A means of transport associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<TransportMeans> transportMeans = new ArrayList<TransportMeans>();
    /**
     * Transport Handling Unit. Hazardous Goods Transit
     * <p>
     * Transit-related information regarding a type of hazardous goods contained in this transport handling unit.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    @JsonPropertyDescription("Transit-related information regarding a type of hazardous goods contained in this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<HazardousGoodsTransit> hazardousGoodsTransit = new ArrayList<HazardousGoodsTransit>();
    /**
     * Transport Handling Unit. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this transport handling unit.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();
    /**
     * Transport Handling Unit. Minimum_ Temperature. Temperature
     * <p>
     * The minimum required operating temperature of this transport handling unit.
     * 
     */
    @JsonProperty("MinimumTemperature")
    @JsonPropertyDescription("The minimum required operating temperature of this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> minimumTemperature = new ArrayList<Temperature>();
    /**
     * Transport Handling Unit. Maximum_ Temperature. Temperature
     * <p>
     * The maximum allowable operating temperature of this transport handling unit.
     * 
     */
    @JsonProperty("MaximumTemperature")
    @JsonPropertyDescription("The maximum allowable operating temperature of this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> maximumTemperature = new ArrayList<Temperature>();
    /**
     * Transport Handling Unit. Goods Item
     * <p>
     * A goods item contained in this transport handling unit.
     * 
     */
    @JsonProperty("GoodsItem")
    @JsonPropertyDescription("A goods item contained in this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<GoodsItem> goodsItem = new ArrayList<GoodsItem>();
    /**
     * Transport Handling Unit. Floor Space Measurement_ Dimension. Dimension
     * <p>
     * The floor space measurement dimension associated with this transport handling unit.
     * 
     */
    @JsonProperty("FloorSpaceMeasurementDimension")
    @JsonPropertyDescription("The floor space measurement dimension associated with this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Dimension> floorSpaceMeasurementDimension = new ArrayList<Dimension>();
    /**
     * Transport Handling Unit. Pallet Space Measurement_ Dimension. Dimension
     * <p>
     * The pallet space measurement dimension associated to this transport handling unit.
     * 
     */
    @JsonProperty("PalletSpaceMeasurementDimension")
    @JsonPropertyDescription("The pallet space measurement dimension associated to this transport handling unit.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Dimension> palletSpaceMeasurementDimension = new ArrayList<Dimension>();
    /**
     * Transport Handling Unit. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this transport handling unit.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    @JsonPropertyDescription("A reference to a shipping document associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> shipmentDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Transport Handling Unit. Status
     * <p>
     * The status of this transport handling unit.
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("The status of this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<Status> status = new ArrayList<Status>();
    /**
     * Transport Handling Unit. Customs Declaration
     * <p>
     * Describes identifiers or references relating to customs procedures.
     * 
     */
    @JsonProperty("CustomsDeclaration")
    @JsonPropertyDescription("Describes identifiers or references relating to customs procedures.")
    @Size(min = 1)
    @Valid
    private List<CustomsDeclaration> customsDeclaration = new ArrayList<CustomsDeclaration>();
    /**
     * Transport Handling Unit. Referenced_ Shipment. Shipment
     * <p>
     * A shipment associated with this transport handling unit.
     * 
     */
    @JsonProperty("ReferencedShipment")
    @JsonPropertyDescription("A shipment associated with this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<Shipment> referencedShipment = new ArrayList<Shipment>();
    /**
     * Transport Handling Unit. Package
     * <p>
     * A package contained in this transport handling unit.
     * 
     */
    @JsonProperty("Package")
    @JsonPropertyDescription("A package contained in this transport handling unit.")
    @Size(min = 1)
    @Valid
    private List<Package> _package = new ArrayList<Package>();

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

    public TransportHandlingUnit withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transport Handling Unit. Identifier
     * <p>
     * An identifier for this transport handling unit.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Transport Handling Unit. Identifier
     * <p>
     * An identifier for this transport handling unit.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TransportHandlingUnit withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Transport Handling Unit. Transport Handling Unit Type Code. Code
     * <p>
     * A code signifying the type of this transport handling unit.
     * 
     */
    @JsonProperty("TransportHandlingUnitTypeCode")
    public List<CodeType> getTransportHandlingUnitTypeCode() {
        return transportHandlingUnitTypeCode;
    }

    /**
     * Transport Handling Unit. Transport Handling Unit Type Code. Code
     * <p>
     * A code signifying the type of this transport handling unit.
     * 
     */
    @JsonProperty("TransportHandlingUnitTypeCode")
    public void setTransportHandlingUnitTypeCode(List<CodeType> transportHandlingUnitTypeCode) {
        this.transportHandlingUnitTypeCode = transportHandlingUnitTypeCode;
    }

    public TransportHandlingUnit withTransportHandlingUnitTypeCode(List<CodeType> transportHandlingUnitTypeCode) {
        this.transportHandlingUnitTypeCode = transportHandlingUnitTypeCode;
        return this;
    }

    /**
     * Transport Handling Unit. Handling Code. Code
     * <p>
     * The handling required for this transport handling unit, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    public List<CodeType> getHandlingCode() {
        return handlingCode;
    }

    /**
     * Transport Handling Unit. Handling Code. Code
     * <p>
     * The handling required for this transport handling unit, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    public void setHandlingCode(List<CodeType> handlingCode) {
        this.handlingCode = handlingCode;
    }

    public TransportHandlingUnit withHandlingCode(List<CodeType> handlingCode) {
        this.handlingCode = handlingCode;
        return this;
    }

    /**
     * Transport Handling Unit. Handling_ Instructions. Text
     * <p>
     * The handling required for this transport handling unit, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    public List<TextType> getHandlingInstructions() {
        return handlingInstructions;
    }

    /**
     * Transport Handling Unit. Handling_ Instructions. Text
     * <p>
     * The handling required for this transport handling unit, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    public void setHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    public TransportHandlingUnit withHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
        return this;
    }

    /**
     * Transport Handling Unit. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indicator that the materials contained in this transport handling unit are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public List<IndicatorType> getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Transport Handling Unit. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indicator that the materials contained in this transport handling unit are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public void setHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public TransportHandlingUnit withHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
        return this;
    }

    /**
     * Transport Handling Unit. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this transport handling unit.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    public List<QuantityType> getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Transport Handling Unit. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this transport handling unit.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    public void setTotalGoodsItemQuantity(List<QuantityType> totalGoodsItemQuantity) {
        this.totalGoodsItemQuantity = totalGoodsItemQuantity;
    }

    public TransportHandlingUnit withTotalGoodsItemQuantity(List<QuantityType> totalGoodsItemQuantity) {
        this.totalGoodsItemQuantity = totalGoodsItemQuantity;
        return this;
    }

    /**
     * Transport Handling Unit. Total_ Package Quantity. Quantity
     * <p>
     * The total number of packages in this transport handling unit.
     * 
     */
    @JsonProperty("TotalPackageQuantity")
    public List<QuantityType> getTotalPackageQuantity() {
        return totalPackageQuantity;
    }

    /**
     * Transport Handling Unit. Total_ Package Quantity. Quantity
     * <p>
     * The total number of packages in this transport handling unit.
     * 
     */
    @JsonProperty("TotalPackageQuantity")
    public void setTotalPackageQuantity(List<QuantityType> totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
    }

    public TransportHandlingUnit withTotalPackageQuantity(List<QuantityType> totalPackageQuantity) {
        this.totalPackageQuantity = totalPackageQuantity;
        return this;
    }

    /**
     * Transport Handling Unit. Damage_ Remarks. Text
     * <p>
     * Text describing damage associated with this transport handling unit.
     * 
     */
    @JsonProperty("DamageRemarks")
    public List<TextType> getDamageRemarks() {
        return damageRemarks;
    }

    /**
     * Transport Handling Unit. Damage_ Remarks. Text
     * <p>
     * Text describing damage associated with this transport handling unit.
     * 
     */
    @JsonProperty("DamageRemarks")
    public void setDamageRemarks(List<TextType> damageRemarks) {
        this.damageRemarks = damageRemarks;
    }

    public TransportHandlingUnit withDamageRemarks(List<TextType> damageRemarks) {
        this.damageRemarks = damageRemarks;
        return this;
    }

    /**
     * Transport Handling Unit. Shipping_ Marks. Text
     * <p>
     * Text describing the marks and numbers on this transport handling unit.
     * 
     */
    @JsonProperty("ShippingMarks")
    public List<TextType> getShippingMarks() {
        return shippingMarks;
    }

    /**
     * Transport Handling Unit. Shipping_ Marks. Text
     * <p>
     * Text describing the marks and numbers on this transport handling unit.
     * 
     */
    @JsonProperty("ShippingMarks")
    public void setShippingMarks(List<TextType> shippingMarks) {
        this.shippingMarks = shippingMarks;
    }

    public TransportHandlingUnit withShippingMarks(List<TextType> shippingMarks) {
        this.shippingMarks = shippingMarks;
        return this;
    }

    /**
     * Transport Handling Unit. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this transport handling unit, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public List<IdentifierType> getTraceID() {
        return traceID;
    }

    /**
     * Transport Handling Unit. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this transport handling unit, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public void setTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
    }

    public TransportHandlingUnit withTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
        return this;
    }

    /**
     * Transport Handling Unit. Handling Unit_ Despatch Line. Despatch Line
     * <p>
     * A despatch line associated with this transport handling unit.
     * 
     */
    @JsonProperty("HandlingUnitDespatchLine")
    public List<DespatchLine> getHandlingUnitDespatchLine() {
        return handlingUnitDespatchLine;
    }

    /**
     * Transport Handling Unit. Handling Unit_ Despatch Line. Despatch Line
     * <p>
     * A despatch line associated with this transport handling unit.
     * 
     */
    @JsonProperty("HandlingUnitDespatchLine")
    public void setHandlingUnitDespatchLine(List<DespatchLine> handlingUnitDespatchLine) {
        this.handlingUnitDespatchLine = handlingUnitDespatchLine;
    }

    public TransportHandlingUnit withHandlingUnitDespatchLine(List<DespatchLine> handlingUnitDespatchLine) {
        this.handlingUnitDespatchLine = handlingUnitDespatchLine;
        return this;
    }

    /**
     * Transport Handling Unit. Actual_ Package. Package
     * <p>
     * A package contained in this transport handling unit.
     * 
     */
    @JsonProperty("ActualPackage")
    public List<Package> getActualPackage() {
        return actualPackage;
    }

    /**
     * Transport Handling Unit. Actual_ Package. Package
     * <p>
     * A package contained in this transport handling unit.
     * 
     */
    @JsonProperty("ActualPackage")
    public void setActualPackage(List<Package> actualPackage) {
        this.actualPackage = actualPackage;
    }

    public TransportHandlingUnit withActualPackage(List<Package> actualPackage) {
        this.actualPackage = actualPackage;
        return this;
    }

    /**
     * Transport Handling Unit. Received Handling Unit_ Receipt Line. Receipt Line
     * <p>
     * A receipt line associated with this transport handling unit.
     * 
     */
    @JsonProperty("ReceivedHandlingUnitReceiptLine")
    public List<ReceiptLine> getReceivedHandlingUnitReceiptLine() {
        return receivedHandlingUnitReceiptLine;
    }

    /**
     * Transport Handling Unit. Received Handling Unit_ Receipt Line. Receipt Line
     * <p>
     * A receipt line associated with this transport handling unit.
     * 
     */
    @JsonProperty("ReceivedHandlingUnitReceiptLine")
    public void setReceivedHandlingUnitReceiptLine(List<ReceiptLine> receivedHandlingUnitReceiptLine) {
        this.receivedHandlingUnitReceiptLine = receivedHandlingUnitReceiptLine;
    }

    public TransportHandlingUnit withReceivedHandlingUnitReceiptLine(List<ReceiptLine> receivedHandlingUnitReceiptLine) {
        this.receivedHandlingUnitReceiptLine = receivedHandlingUnitReceiptLine;
        return this;
    }

    /**
     * Transport Handling Unit. Transport Equipment
     * <p>
     * A piece of transport equipment associated with this transport handling unit.
     * 
     */
    @JsonProperty("TransportEquipment")
    public List<TransportEquipment> getTransportEquipment() {
        return transportEquipment;
    }

    /**
     * Transport Handling Unit. Transport Equipment
     * <p>
     * A piece of transport equipment associated with this transport handling unit.
     * 
     */
    @JsonProperty("TransportEquipment")
    public void setTransportEquipment(List<TransportEquipment> transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    public TransportHandlingUnit withTransportEquipment(List<TransportEquipment> transportEquipment) {
        this.transportEquipment = transportEquipment;
        return this;
    }

    /**
     * Transport Handling Unit. Transport Means
     * <p>
     * A means of transport associated with this transport handling unit.
     * 
     */
    @JsonProperty("TransportMeans")
    public List<TransportMeans> getTransportMeans() {
        return transportMeans;
    }

    /**
     * Transport Handling Unit. Transport Means
     * <p>
     * A means of transport associated with this transport handling unit.
     * 
     */
    @JsonProperty("TransportMeans")
    public void setTransportMeans(List<TransportMeans> transportMeans) {
        this.transportMeans = transportMeans;
    }

    public TransportHandlingUnit withTransportMeans(List<TransportMeans> transportMeans) {
        this.transportMeans = transportMeans;
        return this;
    }

    /**
     * Transport Handling Unit. Hazardous Goods Transit
     * <p>
     * Transit-related information regarding a type of hazardous goods contained in this transport handling unit.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    public List<HazardousGoodsTransit> getHazardousGoodsTransit() {
        return hazardousGoodsTransit;
    }

    /**
     * Transport Handling Unit. Hazardous Goods Transit
     * <p>
     * Transit-related information regarding a type of hazardous goods contained in this transport handling unit.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    public void setHazardousGoodsTransit(List<HazardousGoodsTransit> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
    }

    public TransportHandlingUnit withHazardousGoodsTransit(List<HazardousGoodsTransit> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
        return this;
    }

    /**
     * Transport Handling Unit. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this transport handling unit.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Transport Handling Unit. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this transport handling unit.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public TransportHandlingUnit withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    /**
     * Transport Handling Unit. Minimum_ Temperature. Temperature
     * <p>
     * The minimum required operating temperature of this transport handling unit.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public List<Temperature> getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Transport Handling Unit. Minimum_ Temperature. Temperature
     * <p>
     * The minimum required operating temperature of this transport handling unit.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public void setMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public TransportHandlingUnit withMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
        return this;
    }

    /**
     * Transport Handling Unit. Maximum_ Temperature. Temperature
     * <p>
     * The maximum allowable operating temperature of this transport handling unit.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public List<Temperature> getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Transport Handling Unit. Maximum_ Temperature. Temperature
     * <p>
     * The maximum allowable operating temperature of this transport handling unit.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public void setMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public TransportHandlingUnit withMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
        return this;
    }

    /**
     * Transport Handling Unit. Goods Item
     * <p>
     * A goods item contained in this transport handling unit.
     * 
     */
    @JsonProperty("GoodsItem")
    public List<GoodsItem> getGoodsItem() {
        return goodsItem;
    }

    /**
     * Transport Handling Unit. Goods Item
     * <p>
     * A goods item contained in this transport handling unit.
     * 
     */
    @JsonProperty("GoodsItem")
    public void setGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
    }

    public TransportHandlingUnit withGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
        return this;
    }

    /**
     * Transport Handling Unit. Floor Space Measurement_ Dimension. Dimension
     * <p>
     * The floor space measurement dimension associated with this transport handling unit.
     * 
     */
    @JsonProperty("FloorSpaceMeasurementDimension")
    public List<Dimension> getFloorSpaceMeasurementDimension() {
        return floorSpaceMeasurementDimension;
    }

    /**
     * Transport Handling Unit. Floor Space Measurement_ Dimension. Dimension
     * <p>
     * The floor space measurement dimension associated with this transport handling unit.
     * 
     */
    @JsonProperty("FloorSpaceMeasurementDimension")
    public void setFloorSpaceMeasurementDimension(List<Dimension> floorSpaceMeasurementDimension) {
        this.floorSpaceMeasurementDimension = floorSpaceMeasurementDimension;
    }

    public TransportHandlingUnit withFloorSpaceMeasurementDimension(List<Dimension> floorSpaceMeasurementDimension) {
        this.floorSpaceMeasurementDimension = floorSpaceMeasurementDimension;
        return this;
    }

    /**
     * Transport Handling Unit. Pallet Space Measurement_ Dimension. Dimension
     * <p>
     * The pallet space measurement dimension associated to this transport handling unit.
     * 
     */
    @JsonProperty("PalletSpaceMeasurementDimension")
    public List<Dimension> getPalletSpaceMeasurementDimension() {
        return palletSpaceMeasurementDimension;
    }

    /**
     * Transport Handling Unit. Pallet Space Measurement_ Dimension. Dimension
     * <p>
     * The pallet space measurement dimension associated to this transport handling unit.
     * 
     */
    @JsonProperty("PalletSpaceMeasurementDimension")
    public void setPalletSpaceMeasurementDimension(List<Dimension> palletSpaceMeasurementDimension) {
        this.palletSpaceMeasurementDimension = palletSpaceMeasurementDimension;
    }

    public TransportHandlingUnit withPalletSpaceMeasurementDimension(List<Dimension> palletSpaceMeasurementDimension) {
        this.palletSpaceMeasurementDimension = palletSpaceMeasurementDimension;
        return this;
    }

    /**
     * Transport Handling Unit. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this transport handling unit.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    public List<DocumentReference> getShipmentDocumentReference() {
        return shipmentDocumentReference;
    }

    /**
     * Transport Handling Unit. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this transport handling unit.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    public void setShipmentDocumentReference(List<DocumentReference> shipmentDocumentReference) {
        this.shipmentDocumentReference = shipmentDocumentReference;
    }

    public TransportHandlingUnit withShipmentDocumentReference(List<DocumentReference> shipmentDocumentReference) {
        this.shipmentDocumentReference = shipmentDocumentReference;
        return this;
    }

    /**
     * Transport Handling Unit. Status
     * <p>
     * The status of this transport handling unit.
     * 
     */
    @JsonProperty("Status")
    public List<Status> getStatus() {
        return status;
    }

    /**
     * Transport Handling Unit. Status
     * <p>
     * The status of this transport handling unit.
     * 
     */
    @JsonProperty("Status")
    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public TransportHandlingUnit withStatus(List<Status> status) {
        this.status = status;
        return this;
    }

    /**
     * Transport Handling Unit. Customs Declaration
     * <p>
     * Describes identifiers or references relating to customs procedures.
     * 
     */
    @JsonProperty("CustomsDeclaration")
    public List<CustomsDeclaration> getCustomsDeclaration() {
        return customsDeclaration;
    }

    /**
     * Transport Handling Unit. Customs Declaration
     * <p>
     * Describes identifiers or references relating to customs procedures.
     * 
     */
    @JsonProperty("CustomsDeclaration")
    public void setCustomsDeclaration(List<CustomsDeclaration> customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
    }

    public TransportHandlingUnit withCustomsDeclaration(List<CustomsDeclaration> customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
        return this;
    }

    /**
     * Transport Handling Unit. Referenced_ Shipment. Shipment
     * <p>
     * A shipment associated with this transport handling unit.
     * 
     */
    @JsonProperty("ReferencedShipment")
    public List<Shipment> getReferencedShipment() {
        return referencedShipment;
    }

    /**
     * Transport Handling Unit. Referenced_ Shipment. Shipment
     * <p>
     * A shipment associated with this transport handling unit.
     * 
     */
    @JsonProperty("ReferencedShipment")
    public void setReferencedShipment(List<Shipment> referencedShipment) {
        this.referencedShipment = referencedShipment;
    }

    public TransportHandlingUnit withReferencedShipment(List<Shipment> referencedShipment) {
        this.referencedShipment = referencedShipment;
        return this;
    }

    /**
     * Transport Handling Unit. Package
     * <p>
     * A package contained in this transport handling unit.
     * 
     */
    @JsonProperty("Package")
    public List<Package> getPackage() {
        return _package;
    }

    /**
     * Transport Handling Unit. Package
     * <p>
     * A package contained in this transport handling unit.
     * 
     */
    @JsonProperty("Package")
    public void setPackage(List<Package> _package) {
        this._package = _package;
    }

    public TransportHandlingUnit withPackage(List<Package> _package) {
        this._package = _package;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportHandlingUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("transportHandlingUnitTypeCode");
        sb.append('=');
        sb.append(((this.transportHandlingUnitTypeCode == null)?"<null>":this.transportHandlingUnitTypeCode));
        sb.append(',');
        sb.append("handlingCode");
        sb.append('=');
        sb.append(((this.handlingCode == null)?"<null>":this.handlingCode));
        sb.append(',');
        sb.append("handlingInstructions");
        sb.append('=');
        sb.append(((this.handlingInstructions == null)?"<null>":this.handlingInstructions));
        sb.append(',');
        sb.append("hazardousRiskIndicator");
        sb.append('=');
        sb.append(((this.hazardousRiskIndicator == null)?"<null>":this.hazardousRiskIndicator));
        sb.append(',');
        sb.append("totalGoodsItemQuantity");
        sb.append('=');
        sb.append(((this.totalGoodsItemQuantity == null)?"<null>":this.totalGoodsItemQuantity));
        sb.append(',');
        sb.append("totalPackageQuantity");
        sb.append('=');
        sb.append(((this.totalPackageQuantity == null)?"<null>":this.totalPackageQuantity));
        sb.append(',');
        sb.append("damageRemarks");
        sb.append('=');
        sb.append(((this.damageRemarks == null)?"<null>":this.damageRemarks));
        sb.append(',');
        sb.append("shippingMarks");
        sb.append('=');
        sb.append(((this.shippingMarks == null)?"<null>":this.shippingMarks));
        sb.append(',');
        sb.append("traceID");
        sb.append('=');
        sb.append(((this.traceID == null)?"<null>":this.traceID));
        sb.append(',');
        sb.append("handlingUnitDespatchLine");
        sb.append('=');
        sb.append(((this.handlingUnitDespatchLine == null)?"<null>":this.handlingUnitDespatchLine));
        sb.append(',');
        sb.append("actualPackage");
        sb.append('=');
        sb.append(((this.actualPackage == null)?"<null>":this.actualPackage));
        sb.append(',');
        sb.append("receivedHandlingUnitReceiptLine");
        sb.append('=');
        sb.append(((this.receivedHandlingUnitReceiptLine == null)?"<null>":this.receivedHandlingUnitReceiptLine));
        sb.append(',');
        sb.append("transportEquipment");
        sb.append('=');
        sb.append(((this.transportEquipment == null)?"<null>":this.transportEquipment));
        sb.append(',');
        sb.append("transportMeans");
        sb.append('=');
        sb.append(((this.transportMeans == null)?"<null>":this.transportMeans));
        sb.append(',');
        sb.append("hazardousGoodsTransit");
        sb.append('=');
        sb.append(((this.hazardousGoodsTransit == null)?"<null>":this.hazardousGoodsTransit));
        sb.append(',');
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
        sb.append(',');
        sb.append("minimumTemperature");
        sb.append('=');
        sb.append(((this.minimumTemperature == null)?"<null>":this.minimumTemperature));
        sb.append(',');
        sb.append("maximumTemperature");
        sb.append('=');
        sb.append(((this.maximumTemperature == null)?"<null>":this.maximumTemperature));
        sb.append(',');
        sb.append("goodsItem");
        sb.append('=');
        sb.append(((this.goodsItem == null)?"<null>":this.goodsItem));
        sb.append(',');
        sb.append("floorSpaceMeasurementDimension");
        sb.append('=');
        sb.append(((this.floorSpaceMeasurementDimension == null)?"<null>":this.floorSpaceMeasurementDimension));
        sb.append(',');
        sb.append("palletSpaceMeasurementDimension");
        sb.append('=');
        sb.append(((this.palletSpaceMeasurementDimension == null)?"<null>":this.palletSpaceMeasurementDimension));
        sb.append(',');
        sb.append("shipmentDocumentReference");
        sb.append('=');
        sb.append(((this.shipmentDocumentReference == null)?"<null>":this.shipmentDocumentReference));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("customsDeclaration");
        sb.append('=');
        sb.append(((this.customsDeclaration == null)?"<null>":this.customsDeclaration));
        sb.append(',');
        sb.append("referencedShipment");
        sb.append('=');
        sb.append(((this.referencedShipment == null)?"<null>":this.referencedShipment));
        sb.append(',');
        sb.append("_package");
        sb.append('=');
        sb.append(((this._package == null)?"<null>":this._package));
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
        result = ((result* 31)+((this.traceID == null)? 0 :this.traceID.hashCode()));
        result = ((result* 31)+((this.transportMeans == null)? 0 :this.transportMeans.hashCode()));
        result = ((result* 31)+((this.hazardousGoodsTransit == null)? 0 :this.hazardousGoodsTransit.hashCode()));
        result = ((result* 31)+((this.actualPackage == null)? 0 :this.actualPackage.hashCode()));
        result = ((result* 31)+((this.totalGoodsItemQuantity == null)? 0 :this.totalGoodsItemQuantity.hashCode()));
        result = ((result* 31)+((this.damageRemarks == null)? 0 :this.damageRemarks.hashCode()));
        result = ((result* 31)+((this.receivedHandlingUnitReceiptLine == null)? 0 :this.receivedHandlingUnitReceiptLine.hashCode()));
        result = ((result* 31)+((this.goodsItem == null)? 0 :this.goodsItem.hashCode()));
        result = ((result* 31)+((this.transportHandlingUnitTypeCode == null)? 0 :this.transportHandlingUnitTypeCode.hashCode()));
        result = ((result* 31)+((this.maximumTemperature == null)? 0 :this.maximumTemperature.hashCode()));
        result = ((result* 31)+((this.handlingUnitDespatchLine == null)? 0 :this.handlingUnitDespatchLine.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.referencedShipment == null)? 0 :this.referencedShipment.hashCode()));
        result = ((result* 31)+((this.shippingMarks == null)? 0 :this.shippingMarks.hashCode()));
        result = ((result* 31)+((this.transportEquipment == null)? 0 :this.transportEquipment.hashCode()));
        result = ((result* 31)+((this.shipmentDocumentReference == null)? 0 :this.shipmentDocumentReference.hashCode()));
        result = ((result* 31)+((this.hazardousRiskIndicator == null)? 0 :this.hazardousRiskIndicator.hashCode()));
        result = ((result* 31)+((this._package == null)? 0 :this._package.hashCode()));
        result = ((result* 31)+((this.palletSpaceMeasurementDimension == null)? 0 :this.palletSpaceMeasurementDimension.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.handlingCode == null)? 0 :this.handlingCode.hashCode()));
        result = ((result* 31)+((this.minimumTemperature == null)? 0 :this.minimumTemperature.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        result = ((result* 31)+((this.customsDeclaration == null)? 0 :this.customsDeclaration.hashCode()));
        result = ((result* 31)+((this.floorSpaceMeasurementDimension == null)? 0 :this.floorSpaceMeasurementDimension.hashCode()));
        result = ((result* 31)+((this.handlingInstructions == null)? 0 :this.handlingInstructions.hashCode()));
        result = ((result* 31)+((this.totalPackageQuantity == null)? 0 :this.totalPackageQuantity.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportHandlingUnit) == false) {
            return false;
        }
        TransportHandlingUnit rhs = ((TransportHandlingUnit) other);
        return (((((((((((((((((((((((((((((this.traceID == rhs.traceID)||((this.traceID!= null)&&this.traceID.equals(rhs.traceID)))&&((this.transportMeans == rhs.transportMeans)||((this.transportMeans!= null)&&this.transportMeans.equals(rhs.transportMeans))))&&((this.hazardousGoodsTransit == rhs.hazardousGoodsTransit)||((this.hazardousGoodsTransit!= null)&&this.hazardousGoodsTransit.equals(rhs.hazardousGoodsTransit))))&&((this.actualPackage == rhs.actualPackage)||((this.actualPackage!= null)&&this.actualPackage.equals(rhs.actualPackage))))&&((this.totalGoodsItemQuantity == rhs.totalGoodsItemQuantity)||((this.totalGoodsItemQuantity!= null)&&this.totalGoodsItemQuantity.equals(rhs.totalGoodsItemQuantity))))&&((this.damageRemarks == rhs.damageRemarks)||((this.damageRemarks!= null)&&this.damageRemarks.equals(rhs.damageRemarks))))&&((this.receivedHandlingUnitReceiptLine == rhs.receivedHandlingUnitReceiptLine)||((this.receivedHandlingUnitReceiptLine!= null)&&this.receivedHandlingUnitReceiptLine.equals(rhs.receivedHandlingUnitReceiptLine))))&&((this.goodsItem == rhs.goodsItem)||((this.goodsItem!= null)&&this.goodsItem.equals(rhs.goodsItem))))&&((this.transportHandlingUnitTypeCode == rhs.transportHandlingUnitTypeCode)||((this.transportHandlingUnitTypeCode!= null)&&this.transportHandlingUnitTypeCode.equals(rhs.transportHandlingUnitTypeCode))))&&((this.maximumTemperature == rhs.maximumTemperature)||((this.maximumTemperature!= null)&&this.maximumTemperature.equals(rhs.maximumTemperature))))&&((this.handlingUnitDespatchLine == rhs.handlingUnitDespatchLine)||((this.handlingUnitDespatchLine!= null)&&this.handlingUnitDespatchLine.equals(rhs.handlingUnitDespatchLine))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.referencedShipment == rhs.referencedShipment)||((this.referencedShipment!= null)&&this.referencedShipment.equals(rhs.referencedShipment))))&&((this.shippingMarks == rhs.shippingMarks)||((this.shippingMarks!= null)&&this.shippingMarks.equals(rhs.shippingMarks))))&&((this.transportEquipment == rhs.transportEquipment)||((this.transportEquipment!= null)&&this.transportEquipment.equals(rhs.transportEquipment))))&&((this.shipmentDocumentReference == rhs.shipmentDocumentReference)||((this.shipmentDocumentReference!= null)&&this.shipmentDocumentReference.equals(rhs.shipmentDocumentReference))))&&((this.hazardousRiskIndicator == rhs.hazardousRiskIndicator)||((this.hazardousRiskIndicator!= null)&&this.hazardousRiskIndicator.equals(rhs.hazardousRiskIndicator))))&&((this._package == rhs._package)||((this._package!= null)&&this._package.equals(rhs._package))))&&((this.palletSpaceMeasurementDimension == rhs.palletSpaceMeasurementDimension)||((this.palletSpaceMeasurementDimension!= null)&&this.palletSpaceMeasurementDimension.equals(rhs.palletSpaceMeasurementDimension))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.handlingCode == rhs.handlingCode)||((this.handlingCode!= null)&&this.handlingCode.equals(rhs.handlingCode))))&&((this.minimumTemperature == rhs.minimumTemperature)||((this.minimumTemperature!= null)&&this.minimumTemperature.equals(rhs.minimumTemperature))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))))&&((this.customsDeclaration == rhs.customsDeclaration)||((this.customsDeclaration!= null)&&this.customsDeclaration.equals(rhs.customsDeclaration))))&&((this.floorSpaceMeasurementDimension == rhs.floorSpaceMeasurementDimension)||((this.floorSpaceMeasurementDimension!= null)&&this.floorSpaceMeasurementDimension.equals(rhs.floorSpaceMeasurementDimension))))&&((this.handlingInstructions == rhs.handlingInstructions)||((this.handlingInstructions!= null)&&this.handlingInstructions.equals(rhs.handlingInstructions))))&&((this.totalPackageQuantity == rhs.totalPackageQuantity)||((this.totalPackageQuantity!= null)&&this.totalPackageQuantity.equals(rhs.totalPackageQuantity))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
