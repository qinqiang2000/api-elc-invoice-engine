
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
 * Shipment. Details
 * <p>
 * A class defining an identifiable collection of one or more goods items to be transported between the seller party and the buyer party. This information may be defined within a commercial contract. A shipment can be transported in different consignments (e.g., split for logistical purposes).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ShippingPriorityLevelCode",
    "HandlingCode",
    "HandlingInstructions",
    "Information",
    "GrossWeightMeasure",
    "NetWeightMeasure",
    "NetNetWeightMeasure",
    "GrossVolumeMeasure",
    "NetVolumeMeasure",
    "TotalGoodsItemQuantity",
    "TotalTransportHandlingUnitQuantity",
    "InsuranceValueAmount",
    "DeclaredCustomsValueAmount",
    "DeclaredForCarriageValueAmount",
    "DeclaredStatisticsValueAmount",
    "FreeOnBoardValueAmount",
    "SpecialInstructions",
    "DeliveryInstructions",
    "SplitConsignmentIndicator",
    "ConsignmentQuantity",
    "Consignment",
    "GoodsItem",
    "ShipmentStage",
    "Delivery",
    "TransportHandlingUnit",
    "ReturnAddress",
    "OriginAddress",
    "FirstArrivalPortLocation",
    "LastExitPortLocation",
    "ExportCountry",
    "FreightAllowanceCharge"
})
@Generated("jsonschema2pojo")
public class Shipment {

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
     * Shipment. Identifier
     * <p>
     * An identifier for this shipment.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Shipment. Shipping Priority Level Code. Code
     * <p>
     * A code signifying the priority or level of service required for this shipment.
     * 
     */
    @JsonProperty("ShippingPriorityLevelCode")
    @JsonPropertyDescription("A code signifying the priority or level of service required for this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> shippingPriorityLevelCode = new ArrayList<CodeType>();
    /**
     * Shipment. Handling Code. Code
     * <p>
     * The handling required for this shipment, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    @JsonPropertyDescription("The handling required for this shipment, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> handlingCode = new ArrayList<CodeType>();
    /**
     * Shipment. Handling_ Instructions. Text
     * <p>
     * The handling required for this shipment, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    @JsonPropertyDescription("The handling required for this shipment, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> handlingInstructions = new ArrayList<TextType>();
    /**
     * Shipment. Information. Text
     * <p>
     * Free-form text pertinent to this shipment, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Information")
    @JsonPropertyDescription("Free-form text pertinent to this shipment, conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> information = new ArrayList<TextType>();
    /**
     * Shipment. Gross_ Weight. Measure
     * <p>
     * The total gross weight of a shipment; the weight of the goods plus packaging plus transport equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    @JsonPropertyDescription("The total gross weight of a shipment; the weight of the goods plus packaging plus transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Shipment. Net_ Weight. Measure
     * <p>
     * The net weight of this shipment, excluding packaging.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    @JsonPropertyDescription("The net weight of this shipment, excluding packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Shipment. Net Net_ Weight. Measure
     * <p>
     * The total net weight of this shipment, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    @JsonPropertyDescription("The total net weight of this shipment, excluding packaging and transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netNetWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Shipment. Gross_ Volume. Measure
     * <p>
     * The total volume of the goods in this shipment, including packaging.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    @JsonPropertyDescription("The total volume of the goods in this shipment, including packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Shipment. Net_ Volume. Measure
     * <p>
     * The total volume of the goods in this shipment, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    @JsonPropertyDescription("The total volume of the goods in this shipment, excluding packaging and transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Shipment. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this shipment.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    @JsonPropertyDescription("The total number of goods items in this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalGoodsItemQuantity = new ArrayList<QuantityType>();
    /**
     * Shipment. Total_ Transport Handling Unit Quantity. Quantity
     * <p>
     * The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this shipment.
     * 
     */
    @JsonProperty("TotalTransportHandlingUnitQuantity")
    @JsonPropertyDescription("The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalTransportHandlingUnitQuantity = new ArrayList<QuantityType>();
    /**
     * Shipment. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this shipment.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    @JsonPropertyDescription("The amount covered by insurance for this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> insuranceValueAmount = new ArrayList<AmountType>();
    /**
     * Shipment. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of those goods in this shipment that are subject to the same customs procedure and have the same tariff/statistical heading, country information, and duty regime.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    @JsonPropertyDescription("The total declared value for customs purposes of those goods in this shipment that are subject to the same customs procedure and have the same tariff/statistical heading, country information, and duty regime.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredCustomsValueAmount = new ArrayList<AmountType>();
    /**
     * Shipment. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this shipment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    @JsonPropertyDescription("The value of this shipment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredForCarriageValueAmount = new ArrayList<AmountType>();
    /**
     * Shipment. Declared Statistics_ Value. Amount
     * <p>
     * The value, declared for statistical purposes, of those goods in this shipment that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    @JsonPropertyDescription("The value, declared for statistical purposes, of those goods in this shipment that have the same statistical heading.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredStatisticsValueAmount = new ArrayList<AmountType>();
    /**
     * Shipment. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    @JsonPropertyDescription("The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> freeOnBoardValueAmount = new ArrayList<AmountType>();
    /**
     * Shipment. Special_ Instructions. Text
     * <p>
     * Special instructions relating to this shipment.
     * 
     */
    @JsonProperty("SpecialInstructions")
    @JsonPropertyDescription("Special instructions relating to this shipment.")
    @Size(min = 1)
    @Valid
    private List<TextType> specialInstructions = new ArrayList<TextType>();
    /**
     * Shipment. Delivery_ Instructions. Text
     * <p>
     * Delivery instructions relating to this shipment.
     * 
     */
    @JsonProperty("DeliveryInstructions")
    @JsonPropertyDescription("Delivery instructions relating to this shipment.")
    @Size(min = 1)
    @Valid
    private List<TextType> deliveryInstructions = new ArrayList<TextType>();
    /**
     * Shipment. Split Consignment_ Indicator. Indicator
     * <p>
     * An indicator that the consignment has been split in transit (true) or not (false).
     * 
     */
    @JsonProperty("SplitConsignmentIndicator")
    @JsonPropertyDescription("An indicator that the consignment has been split in transit (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> splitConsignmentIndicator = new ArrayList<IndicatorType>();
    /**
     * Shipment. Consignment_ Quantity. Quantity
     * <p>
     * The total number of consignments within this shipment.
     * 
     */
    @JsonProperty("ConsignmentQuantity")
    @JsonPropertyDescription("The total number of consignments within this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> consignmentQuantity = new ArrayList<QuantityType>();
    /**
     * Shipment. Consignment
     * <p>
     * A consignment covering this shipment.
     * 
     */
    @JsonProperty("Consignment")
    @JsonPropertyDescription("A consignment covering this shipment.")
    @Size(min = 1)
    @Valid
    private List<Consignment> consignment = new ArrayList<Consignment>();
    /**
     * Shipment. Goods Item
     * <p>
     * A goods item included in this shipment.
     * 
     */
    @JsonProperty("GoodsItem")
    @JsonPropertyDescription("A goods item included in this shipment.")
    @Size(min = 1)
    @Valid
    private List<GoodsItem> goodsItem = new ArrayList<GoodsItem>();
    /**
     * Shipment. Shipment Stage
     * <p>
     * A stage in the transport movement of this shipment.
     * 
     */
    @JsonProperty("ShipmentStage")
    @JsonPropertyDescription("A stage in the transport movement of this shipment.")
    @Size(min = 1)
    @Valid
    private List<ShipmentStage> shipmentStage = new ArrayList<ShipmentStage>();
    /**
     * Shipment. Delivery
     * <p>
     * The delivery of this shipment.
     * 
     */
    @JsonProperty("Delivery")
    @JsonPropertyDescription("The delivery of this shipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Delivery> delivery = new ArrayList<Delivery>();
    /**
     * Shipment. Transport Handling Unit
     * <p>
     * A transport handling unit associated with this shipment.
     * 
     */
    @JsonProperty("TransportHandlingUnit")
    @JsonPropertyDescription("A transport handling unit associated with this shipment.")
    @Size(min = 1)
    @Valid
    private List<TransportHandlingUnit> transportHandlingUnit = new ArrayList<TransportHandlingUnit>();
    /**
     * Shipment. Return_ Address. Address
     * <p>
     * The address to which a shipment should be returned.
     * 
     */
    @JsonProperty("ReturnAddress")
    @JsonPropertyDescription("The address to which a shipment should be returned.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> returnAddress = new ArrayList<Address>();
    /**
     * Shipment. Origin_ Address. Address
     * <p>
     * The region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the customs tariff, or of quantitative restrictions, or of any other measure related to trade.
     * 
     */
    @JsonProperty("OriginAddress")
    @JsonPropertyDescription("The region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the customs tariff, or of quantitative restrictions, or of any other measure related to trade.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Address> originAddress = new ArrayList<Address>();
    /**
     * Shipment. First Arrival Port_ Location. Location
     * <p>
     * The first arrival location of a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("FirstArrivalPortLocation")
    @JsonPropertyDescription("The first arrival location of a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> firstArrivalPortLocation = new ArrayList<Location>();
    /**
     * Shipment. Last Exit Port_ Location. Location
     * <p>
     * The final exporting location for a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("LastExitPortLocation")
    @JsonPropertyDescription("The final exporting location for a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> lastExitPortLocation = new ArrayList<Location>();
    /**
     * Shipment. Export_ Country. Country
     * <p>
     * The country from which the goods were originally exported, without any commercial transaction taking place in intermediate countries.
     * 
     */
    @JsonProperty("ExportCountry")
    @JsonPropertyDescription("The country from which the goods were originally exported, without any commercial transaction taking place in intermediate countries.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Country> exportCountry = new ArrayList<Country>();
    /**
     * Shipment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    @JsonPropertyDescription("A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> freightAllowanceCharge = new ArrayList<AllowanceCharge>();

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

    public Shipment withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Shipment. Identifier
     * <p>
     * An identifier for this shipment.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Shipment. Identifier
     * <p>
     * An identifier for this shipment.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Shipment withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Shipment. Shipping Priority Level Code. Code
     * <p>
     * A code signifying the priority or level of service required for this shipment.
     * 
     */
    @JsonProperty("ShippingPriorityLevelCode")
    public List<CodeType> getShippingPriorityLevelCode() {
        return shippingPriorityLevelCode;
    }

    /**
     * Shipment. Shipping Priority Level Code. Code
     * <p>
     * A code signifying the priority or level of service required for this shipment.
     * 
     */
    @JsonProperty("ShippingPriorityLevelCode")
    public void setShippingPriorityLevelCode(List<CodeType> shippingPriorityLevelCode) {
        this.shippingPriorityLevelCode = shippingPriorityLevelCode;
    }

    public Shipment withShippingPriorityLevelCode(List<CodeType> shippingPriorityLevelCode) {
        this.shippingPriorityLevelCode = shippingPriorityLevelCode;
        return this;
    }

    /**
     * Shipment. Handling Code. Code
     * <p>
     * The handling required for this shipment, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    public List<CodeType> getHandlingCode() {
        return handlingCode;
    }

    /**
     * Shipment. Handling Code. Code
     * <p>
     * The handling required for this shipment, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    public void setHandlingCode(List<CodeType> handlingCode) {
        this.handlingCode = handlingCode;
    }

    public Shipment withHandlingCode(List<CodeType> handlingCode) {
        this.handlingCode = handlingCode;
        return this;
    }

    /**
     * Shipment. Handling_ Instructions. Text
     * <p>
     * The handling required for this shipment, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    public List<TextType> getHandlingInstructions() {
        return handlingInstructions;
    }

    /**
     * Shipment. Handling_ Instructions. Text
     * <p>
     * The handling required for this shipment, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    public void setHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    public Shipment withHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
        return this;
    }

    /**
     * Shipment. Information. Text
     * <p>
     * Free-form text pertinent to this shipment, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Information")
    public List<TextType> getInformation() {
        return information;
    }

    /**
     * Shipment. Information. Text
     * <p>
     * Free-form text pertinent to this shipment, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Information")
    public void setInformation(List<TextType> information) {
        this.information = information;
    }

    public Shipment withInformation(List<TextType> information) {
        this.information = information;
        return this;
    }

    /**
     * Shipment. Gross_ Weight. Measure
     * <p>
     * The total gross weight of a shipment; the weight of the goods plus packaging plus transport equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public List<MeasureType> getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Shipment. Gross_ Weight. Measure
     * <p>
     * The total gross weight of a shipment; the weight of the goods plus packaging plus transport equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public void setGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
    }

    public Shipment withGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
        return this;
    }

    /**
     * Shipment. Net_ Weight. Measure
     * <p>
     * The net weight of this shipment, excluding packaging.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public List<MeasureType> getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Shipment. Net_ Weight. Measure
     * <p>
     * The net weight of this shipment, excluding packaging.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public void setNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
    }

    public Shipment withNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
        return this;
    }

    /**
     * Shipment. Net Net_ Weight. Measure
     * <p>
     * The total net weight of this shipment, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    public List<MeasureType> getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Shipment. Net Net_ Weight. Measure
     * <p>
     * The total net weight of this shipment, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    public void setNetNetWeightMeasure(List<MeasureType> netNetWeightMeasure) {
        this.netNetWeightMeasure = netNetWeightMeasure;
    }

    public Shipment withNetNetWeightMeasure(List<MeasureType> netNetWeightMeasure) {
        this.netNetWeightMeasure = netNetWeightMeasure;
        return this;
    }

    /**
     * Shipment. Gross_ Volume. Measure
     * <p>
     * The total volume of the goods in this shipment, including packaging.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public List<MeasureType> getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Shipment. Gross_ Volume. Measure
     * <p>
     * The total volume of the goods in this shipment, including packaging.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public void setGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
    }

    public Shipment withGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
        return this;
    }

    /**
     * Shipment. Net_ Volume. Measure
     * <p>
     * The total volume of the goods in this shipment, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public List<MeasureType> getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Shipment. Net_ Volume. Measure
     * <p>
     * The total volume of the goods in this shipment, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public void setNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
    }

    public Shipment withNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
        return this;
    }

    /**
     * Shipment. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this shipment.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    public List<QuantityType> getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Shipment. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this shipment.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    public void setTotalGoodsItemQuantity(List<QuantityType> totalGoodsItemQuantity) {
        this.totalGoodsItemQuantity = totalGoodsItemQuantity;
    }

    public Shipment withTotalGoodsItemQuantity(List<QuantityType> totalGoodsItemQuantity) {
        this.totalGoodsItemQuantity = totalGoodsItemQuantity;
        return this;
    }

    /**
     * Shipment. Total_ Transport Handling Unit Quantity. Quantity
     * <p>
     * The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this shipment.
     * 
     */
    @JsonProperty("TotalTransportHandlingUnitQuantity")
    public List<QuantityType> getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Shipment. Total_ Transport Handling Unit Quantity. Quantity
     * <p>
     * The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this shipment.
     * 
     */
    @JsonProperty("TotalTransportHandlingUnitQuantity")
    public void setTotalTransportHandlingUnitQuantity(List<QuantityType> totalTransportHandlingUnitQuantity) {
        this.totalTransportHandlingUnitQuantity = totalTransportHandlingUnitQuantity;
    }

    public Shipment withTotalTransportHandlingUnitQuantity(List<QuantityType> totalTransportHandlingUnitQuantity) {
        this.totalTransportHandlingUnitQuantity = totalTransportHandlingUnitQuantity;
        return this;
    }

    /**
     * Shipment. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this shipment.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    public List<AmountType> getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Shipment. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this shipment.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    public void setInsuranceValueAmount(List<AmountType> insuranceValueAmount) {
        this.insuranceValueAmount = insuranceValueAmount;
    }

    public Shipment withInsuranceValueAmount(List<AmountType> insuranceValueAmount) {
        this.insuranceValueAmount = insuranceValueAmount;
        return this;
    }

    /**
     * Shipment. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of those goods in this shipment that are subject to the same customs procedure and have the same tariff/statistical heading, country information, and duty regime.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    public List<AmountType> getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Shipment. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of those goods in this shipment that are subject to the same customs procedure and have the same tariff/statistical heading, country information, and duty regime.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    public void setDeclaredCustomsValueAmount(List<AmountType> declaredCustomsValueAmount) {
        this.declaredCustomsValueAmount = declaredCustomsValueAmount;
    }

    public Shipment withDeclaredCustomsValueAmount(List<AmountType> declaredCustomsValueAmount) {
        this.declaredCustomsValueAmount = declaredCustomsValueAmount;
        return this;
    }

    /**
     * Shipment. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this shipment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    public List<AmountType> getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Shipment. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this shipment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    public void setDeclaredForCarriageValueAmount(List<AmountType> declaredForCarriageValueAmount) {
        this.declaredForCarriageValueAmount = declaredForCarriageValueAmount;
    }

    public Shipment withDeclaredForCarriageValueAmount(List<AmountType> declaredForCarriageValueAmount) {
        this.declaredForCarriageValueAmount = declaredForCarriageValueAmount;
        return this;
    }

    /**
     * Shipment. Declared Statistics_ Value. Amount
     * <p>
     * The value, declared for statistical purposes, of those goods in this shipment that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    public List<AmountType> getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Shipment. Declared Statistics_ Value. Amount
     * <p>
     * The value, declared for statistical purposes, of those goods in this shipment that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    public void setDeclaredStatisticsValueAmount(List<AmountType> declaredStatisticsValueAmount) {
        this.declaredStatisticsValueAmount = declaredStatisticsValueAmount;
    }

    public Shipment withDeclaredStatisticsValueAmount(List<AmountType> declaredStatisticsValueAmount) {
        this.declaredStatisticsValueAmount = declaredStatisticsValueAmount;
        return this;
    }

    /**
     * Shipment. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    public List<AmountType> getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Shipment. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    public void setFreeOnBoardValueAmount(List<AmountType> freeOnBoardValueAmount) {
        this.freeOnBoardValueAmount = freeOnBoardValueAmount;
    }

    public Shipment withFreeOnBoardValueAmount(List<AmountType> freeOnBoardValueAmount) {
        this.freeOnBoardValueAmount = freeOnBoardValueAmount;
        return this;
    }

    /**
     * Shipment. Special_ Instructions. Text
     * <p>
     * Special instructions relating to this shipment.
     * 
     */
    @JsonProperty("SpecialInstructions")
    public List<TextType> getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Shipment. Special_ Instructions. Text
     * <p>
     * Special instructions relating to this shipment.
     * 
     */
    @JsonProperty("SpecialInstructions")
    public void setSpecialInstructions(List<TextType> specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Shipment withSpecialInstructions(List<TextType> specialInstructions) {
        this.specialInstructions = specialInstructions;
        return this;
    }

    /**
     * Shipment. Delivery_ Instructions. Text
     * <p>
     * Delivery instructions relating to this shipment.
     * 
     */
    @JsonProperty("DeliveryInstructions")
    public List<TextType> getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Shipment. Delivery_ Instructions. Text
     * <p>
     * Delivery instructions relating to this shipment.
     * 
     */
    @JsonProperty("DeliveryInstructions")
    public void setDeliveryInstructions(List<TextType> deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public Shipment withDeliveryInstructions(List<TextType> deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
        return this;
    }

    /**
     * Shipment. Split Consignment_ Indicator. Indicator
     * <p>
     * An indicator that the consignment has been split in transit (true) or not (false).
     * 
     */
    @JsonProperty("SplitConsignmentIndicator")
    public List<IndicatorType> getSplitConsignmentIndicator() {
        return splitConsignmentIndicator;
    }

    /**
     * Shipment. Split Consignment_ Indicator. Indicator
     * <p>
     * An indicator that the consignment has been split in transit (true) or not (false).
     * 
     */
    @JsonProperty("SplitConsignmentIndicator")
    public void setSplitConsignmentIndicator(List<IndicatorType> splitConsignmentIndicator) {
        this.splitConsignmentIndicator = splitConsignmentIndicator;
    }

    public Shipment withSplitConsignmentIndicator(List<IndicatorType> splitConsignmentIndicator) {
        this.splitConsignmentIndicator = splitConsignmentIndicator;
        return this;
    }

    /**
     * Shipment. Consignment_ Quantity. Quantity
     * <p>
     * The total number of consignments within this shipment.
     * 
     */
    @JsonProperty("ConsignmentQuantity")
    public List<QuantityType> getConsignmentQuantity() {
        return consignmentQuantity;
    }

    /**
     * Shipment. Consignment_ Quantity. Quantity
     * <p>
     * The total number of consignments within this shipment.
     * 
     */
    @JsonProperty("ConsignmentQuantity")
    public void setConsignmentQuantity(List<QuantityType> consignmentQuantity) {
        this.consignmentQuantity = consignmentQuantity;
    }

    public Shipment withConsignmentQuantity(List<QuantityType> consignmentQuantity) {
        this.consignmentQuantity = consignmentQuantity;
        return this;
    }

    /**
     * Shipment. Consignment
     * <p>
     * A consignment covering this shipment.
     * 
     */
    @JsonProperty("Consignment")
    public List<Consignment> getConsignment() {
        return consignment;
    }

    /**
     * Shipment. Consignment
     * <p>
     * A consignment covering this shipment.
     * 
     */
    @JsonProperty("Consignment")
    public void setConsignment(List<Consignment> consignment) {
        this.consignment = consignment;
    }

    public Shipment withConsignment(List<Consignment> consignment) {
        this.consignment = consignment;
        return this;
    }

    /**
     * Shipment. Goods Item
     * <p>
     * A goods item included in this shipment.
     * 
     */
    @JsonProperty("GoodsItem")
    public List<GoodsItem> getGoodsItem() {
        return goodsItem;
    }

    /**
     * Shipment. Goods Item
     * <p>
     * A goods item included in this shipment.
     * 
     */
    @JsonProperty("GoodsItem")
    public void setGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
    }

    public Shipment withGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
        return this;
    }

    /**
     * Shipment. Shipment Stage
     * <p>
     * A stage in the transport movement of this shipment.
     * 
     */
    @JsonProperty("ShipmentStage")
    public List<ShipmentStage> getShipmentStage() {
        return shipmentStage;
    }

    /**
     * Shipment. Shipment Stage
     * <p>
     * A stage in the transport movement of this shipment.
     * 
     */
    @JsonProperty("ShipmentStage")
    public void setShipmentStage(List<ShipmentStage> shipmentStage) {
        this.shipmentStage = shipmentStage;
    }

    public Shipment withShipmentStage(List<ShipmentStage> shipmentStage) {
        this.shipmentStage = shipmentStage;
        return this;
    }

    /**
     * Shipment. Delivery
     * <p>
     * The delivery of this shipment.
     * 
     */
    @JsonProperty("Delivery")
    public List<Delivery> getDelivery() {
        return delivery;
    }

    /**
     * Shipment. Delivery
     * <p>
     * The delivery of this shipment.
     * 
     */
    @JsonProperty("Delivery")
    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public Shipment withDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Shipment. Transport Handling Unit
     * <p>
     * A transport handling unit associated with this shipment.
     * 
     */
    @JsonProperty("TransportHandlingUnit")
    public List<TransportHandlingUnit> getTransportHandlingUnit() {
        return transportHandlingUnit;
    }

    /**
     * Shipment. Transport Handling Unit
     * <p>
     * A transport handling unit associated with this shipment.
     * 
     */
    @JsonProperty("TransportHandlingUnit")
    public void setTransportHandlingUnit(List<TransportHandlingUnit> transportHandlingUnit) {
        this.transportHandlingUnit = transportHandlingUnit;
    }

    public Shipment withTransportHandlingUnit(List<TransportHandlingUnit> transportHandlingUnit) {
        this.transportHandlingUnit = transportHandlingUnit;
        return this;
    }

    /**
     * Shipment. Return_ Address. Address
     * <p>
     * The address to which a shipment should be returned.
     * 
     */
    @JsonProperty("ReturnAddress")
    public List<Address> getReturnAddress() {
        return returnAddress;
    }

    /**
     * Shipment. Return_ Address. Address
     * <p>
     * The address to which a shipment should be returned.
     * 
     */
    @JsonProperty("ReturnAddress")
    public void setReturnAddress(List<Address> returnAddress) {
        this.returnAddress = returnAddress;
    }

    public Shipment withReturnAddress(List<Address> returnAddress) {
        this.returnAddress = returnAddress;
        return this;
    }

    /**
     * Shipment. Origin_ Address. Address
     * <p>
     * The region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the customs tariff, or of quantitative restrictions, or of any other measure related to trade.
     * 
     */
    @JsonProperty("OriginAddress")
    public List<Address> getOriginAddress() {
        return originAddress;
    }

    /**
     * Shipment. Origin_ Address. Address
     * <p>
     * The region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the customs tariff, or of quantitative restrictions, or of any other measure related to trade.
     * 
     */
    @JsonProperty("OriginAddress")
    public void setOriginAddress(List<Address> originAddress) {
        this.originAddress = originAddress;
    }

    public Shipment withOriginAddress(List<Address> originAddress) {
        this.originAddress = originAddress;
        return this;
    }

    /**
     * Shipment. First Arrival Port_ Location. Location
     * <p>
     * The first arrival location of a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("FirstArrivalPortLocation")
    public List<Location> getFirstArrivalPortLocation() {
        return firstArrivalPortLocation;
    }

    /**
     * Shipment. First Arrival Port_ Location. Location
     * <p>
     * The first arrival location of a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("FirstArrivalPortLocation")
    public void setFirstArrivalPortLocation(List<Location> firstArrivalPortLocation) {
        this.firstArrivalPortLocation = firstArrivalPortLocation;
    }

    public Shipment withFirstArrivalPortLocation(List<Location> firstArrivalPortLocation) {
        this.firstArrivalPortLocation = firstArrivalPortLocation;
        return this;
    }

    /**
     * Shipment. Last Exit Port_ Location. Location
     * <p>
     * The final exporting location for a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("LastExitPortLocation")
    public List<Location> getLastExitPortLocation() {
        return lastExitPortLocation;
    }

    /**
     * Shipment. Last Exit Port_ Location. Location
     * <p>
     * The final exporting location for a shipment. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("LastExitPortLocation")
    public void setLastExitPortLocation(List<Location> lastExitPortLocation) {
        this.lastExitPortLocation = lastExitPortLocation;
    }

    public Shipment withLastExitPortLocation(List<Location> lastExitPortLocation) {
        this.lastExitPortLocation = lastExitPortLocation;
        return this;
    }

    /**
     * Shipment. Export_ Country. Country
     * <p>
     * The country from which the goods were originally exported, without any commercial transaction taking place in intermediate countries.
     * 
     */
    @JsonProperty("ExportCountry")
    public List<Country> getExportCountry() {
        return exportCountry;
    }

    /**
     * Shipment. Export_ Country. Country
     * <p>
     * The country from which the goods were originally exported, without any commercial transaction taking place in intermediate countries.
     * 
     */
    @JsonProperty("ExportCountry")
    public void setExportCountry(List<Country> exportCountry) {
        this.exportCountry = exportCountry;
    }

    public Shipment withExportCountry(List<Country> exportCountry) {
        this.exportCountry = exportCountry;
        return this;
    }

    /**
     * Shipment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public List<AllowanceCharge> getFreightAllowanceCharge() {
        return freightAllowanceCharge;
    }

    /**
     * Shipment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public void setFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
    }

    public Shipment withFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shipment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("shippingPriorityLevelCode");
        sb.append('=');
        sb.append(((this.shippingPriorityLevelCode == null)?"<null>":this.shippingPriorityLevelCode));
        sb.append(',');
        sb.append("handlingCode");
        sb.append('=');
        sb.append(((this.handlingCode == null)?"<null>":this.handlingCode));
        sb.append(',');
        sb.append("handlingInstructions");
        sb.append('=');
        sb.append(((this.handlingInstructions == null)?"<null>":this.handlingInstructions));
        sb.append(',');
        sb.append("information");
        sb.append('=');
        sb.append(((this.information == null)?"<null>":this.information));
        sb.append(',');
        sb.append("grossWeightMeasure");
        sb.append('=');
        sb.append(((this.grossWeightMeasure == null)?"<null>":this.grossWeightMeasure));
        sb.append(',');
        sb.append("netWeightMeasure");
        sb.append('=');
        sb.append(((this.netWeightMeasure == null)?"<null>":this.netWeightMeasure));
        sb.append(',');
        sb.append("netNetWeightMeasure");
        sb.append('=');
        sb.append(((this.netNetWeightMeasure == null)?"<null>":this.netNetWeightMeasure));
        sb.append(',');
        sb.append("grossVolumeMeasure");
        sb.append('=');
        sb.append(((this.grossVolumeMeasure == null)?"<null>":this.grossVolumeMeasure));
        sb.append(',');
        sb.append("netVolumeMeasure");
        sb.append('=');
        sb.append(((this.netVolumeMeasure == null)?"<null>":this.netVolumeMeasure));
        sb.append(',');
        sb.append("totalGoodsItemQuantity");
        sb.append('=');
        sb.append(((this.totalGoodsItemQuantity == null)?"<null>":this.totalGoodsItemQuantity));
        sb.append(',');
        sb.append("totalTransportHandlingUnitQuantity");
        sb.append('=');
        sb.append(((this.totalTransportHandlingUnitQuantity == null)?"<null>":this.totalTransportHandlingUnitQuantity));
        sb.append(',');
        sb.append("insuranceValueAmount");
        sb.append('=');
        sb.append(((this.insuranceValueAmount == null)?"<null>":this.insuranceValueAmount));
        sb.append(',');
        sb.append("declaredCustomsValueAmount");
        sb.append('=');
        sb.append(((this.declaredCustomsValueAmount == null)?"<null>":this.declaredCustomsValueAmount));
        sb.append(',');
        sb.append("declaredForCarriageValueAmount");
        sb.append('=');
        sb.append(((this.declaredForCarriageValueAmount == null)?"<null>":this.declaredForCarriageValueAmount));
        sb.append(',');
        sb.append("declaredStatisticsValueAmount");
        sb.append('=');
        sb.append(((this.declaredStatisticsValueAmount == null)?"<null>":this.declaredStatisticsValueAmount));
        sb.append(',');
        sb.append("freeOnBoardValueAmount");
        sb.append('=');
        sb.append(((this.freeOnBoardValueAmount == null)?"<null>":this.freeOnBoardValueAmount));
        sb.append(',');
        sb.append("specialInstructions");
        sb.append('=');
        sb.append(((this.specialInstructions == null)?"<null>":this.specialInstructions));
        sb.append(',');
        sb.append("deliveryInstructions");
        sb.append('=');
        sb.append(((this.deliveryInstructions == null)?"<null>":this.deliveryInstructions));
        sb.append(',');
        sb.append("splitConsignmentIndicator");
        sb.append('=');
        sb.append(((this.splitConsignmentIndicator == null)?"<null>":this.splitConsignmentIndicator));
        sb.append(',');
        sb.append("consignmentQuantity");
        sb.append('=');
        sb.append(((this.consignmentQuantity == null)?"<null>":this.consignmentQuantity));
        sb.append(',');
        sb.append("consignment");
        sb.append('=');
        sb.append(((this.consignment == null)?"<null>":this.consignment));
        sb.append(',');
        sb.append("goodsItem");
        sb.append('=');
        sb.append(((this.goodsItem == null)?"<null>":this.goodsItem));
        sb.append(',');
        sb.append("shipmentStage");
        sb.append('=');
        sb.append(((this.shipmentStage == null)?"<null>":this.shipmentStage));
        sb.append(',');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("transportHandlingUnit");
        sb.append('=');
        sb.append(((this.transportHandlingUnit == null)?"<null>":this.transportHandlingUnit));
        sb.append(',');
        sb.append("returnAddress");
        sb.append('=');
        sb.append(((this.returnAddress == null)?"<null>":this.returnAddress));
        sb.append(',');
        sb.append("originAddress");
        sb.append('=');
        sb.append(((this.originAddress == null)?"<null>":this.originAddress));
        sb.append(',');
        sb.append("firstArrivalPortLocation");
        sb.append('=');
        sb.append(((this.firstArrivalPortLocation == null)?"<null>":this.firstArrivalPortLocation));
        sb.append(',');
        sb.append("lastExitPortLocation");
        sb.append('=');
        sb.append(((this.lastExitPortLocation == null)?"<null>":this.lastExitPortLocation));
        sb.append(',');
        sb.append("exportCountry");
        sb.append('=');
        sb.append(((this.exportCountry == null)?"<null>":this.exportCountry));
        sb.append(',');
        sb.append("freightAllowanceCharge");
        sb.append('=');
        sb.append(((this.freightAllowanceCharge == null)?"<null>":this.freightAllowanceCharge));
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
        result = ((result* 31)+((this.declaredForCarriageValueAmount == null)? 0 :this.declaredForCarriageValueAmount.hashCode()));
        result = ((result* 31)+((this.originAddress == null)? 0 :this.originAddress.hashCode()));
        result = ((result* 31)+((this.freeOnBoardValueAmount == null)? 0 :this.freeOnBoardValueAmount.hashCode()));
        result = ((result* 31)+((this.returnAddress == null)? 0 :this.returnAddress.hashCode()));
        result = ((result* 31)+((this.totalGoodsItemQuantity == null)? 0 :this.totalGoodsItemQuantity.hashCode()));
        result = ((result* 31)+((this.totalTransportHandlingUnitQuantity == null)? 0 :this.totalTransportHandlingUnitQuantity.hashCode()));
        result = ((result* 31)+((this.goodsItem == null)? 0 :this.goodsItem.hashCode()));
        result = ((result* 31)+((this.shipmentStage == null)? 0 :this.shipmentStage.hashCode()));
        result = ((result* 31)+((this.declaredCustomsValueAmount == null)? 0 :this.declaredCustomsValueAmount.hashCode()));
        result = ((result* 31)+((this.netNetWeightMeasure == null)? 0 :this.netNetWeightMeasure.hashCode()));
        result = ((result* 31)+((this.consignment == null)? 0 :this.consignment.hashCode()));
        result = ((result* 31)+((this.grossWeightMeasure == null)? 0 :this.grossWeightMeasure.hashCode()));
        result = ((result* 31)+((this.netWeightMeasure == null)? 0 :this.netWeightMeasure.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.freightAllowanceCharge == null)? 0 :this.freightAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.firstArrivalPortLocation == null)? 0 :this.firstArrivalPortLocation.hashCode()));
        result = ((result* 31)+((this.declaredStatisticsValueAmount == null)? 0 :this.declaredStatisticsValueAmount.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.insuranceValueAmount == null)? 0 :this.insuranceValueAmount.hashCode()));
        result = ((result* 31)+((this.shippingPriorityLevelCode == null)? 0 :this.shippingPriorityLevelCode.hashCode()));
        result = ((result* 31)+((this.splitConsignmentIndicator == null)? 0 :this.splitConsignmentIndicator.hashCode()));
        result = ((result* 31)+((this.consignmentQuantity == null)? 0 :this.consignmentQuantity.hashCode()));
        result = ((result* 31)+((this.exportCountry == null)? 0 :this.exportCountry.hashCode()));
        result = ((result* 31)+((this.deliveryInstructions == null)? 0 :this.deliveryInstructions.hashCode()));
        result = ((result* 31)+((this.lastExitPortLocation == null)? 0 :this.lastExitPortLocation.hashCode()));
        result = ((result* 31)+((this.transportHandlingUnit == null)? 0 :this.transportHandlingUnit.hashCode()));
        result = ((result* 31)+((this.netVolumeMeasure == null)? 0 :this.netVolumeMeasure.hashCode()));
        result = ((result* 31)+((this.specialInstructions == null)? 0 :this.specialInstructions.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.handlingCode == null)? 0 :this.handlingCode.hashCode()));
        result = ((result* 31)+((this.information == null)? 0 :this.information.hashCode()));
        result = ((result* 31)+((this.handlingInstructions == null)? 0 :this.handlingInstructions.hashCode()));
        result = ((result* 31)+((this.grossVolumeMeasure == null)? 0 :this.grossVolumeMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shipment) == false) {
            return false;
        }
        Shipment rhs = ((Shipment) other);
        return ((((((((((((((((((((((((((((((((((this.declaredForCarriageValueAmount == rhs.declaredForCarriageValueAmount)||((this.declaredForCarriageValueAmount!= null)&&this.declaredForCarriageValueAmount.equals(rhs.declaredForCarriageValueAmount)))&&((this.originAddress == rhs.originAddress)||((this.originAddress!= null)&&this.originAddress.equals(rhs.originAddress))))&&((this.freeOnBoardValueAmount == rhs.freeOnBoardValueAmount)||((this.freeOnBoardValueAmount!= null)&&this.freeOnBoardValueAmount.equals(rhs.freeOnBoardValueAmount))))&&((this.returnAddress == rhs.returnAddress)||((this.returnAddress!= null)&&this.returnAddress.equals(rhs.returnAddress))))&&((this.totalGoodsItemQuantity == rhs.totalGoodsItemQuantity)||((this.totalGoodsItemQuantity!= null)&&this.totalGoodsItemQuantity.equals(rhs.totalGoodsItemQuantity))))&&((this.totalTransportHandlingUnitQuantity == rhs.totalTransportHandlingUnitQuantity)||((this.totalTransportHandlingUnitQuantity!= null)&&this.totalTransportHandlingUnitQuantity.equals(rhs.totalTransportHandlingUnitQuantity))))&&((this.goodsItem == rhs.goodsItem)||((this.goodsItem!= null)&&this.goodsItem.equals(rhs.goodsItem))))&&((this.shipmentStage == rhs.shipmentStage)||((this.shipmentStage!= null)&&this.shipmentStage.equals(rhs.shipmentStage))))&&((this.declaredCustomsValueAmount == rhs.declaredCustomsValueAmount)||((this.declaredCustomsValueAmount!= null)&&this.declaredCustomsValueAmount.equals(rhs.declaredCustomsValueAmount))))&&((this.netNetWeightMeasure == rhs.netNetWeightMeasure)||((this.netNetWeightMeasure!= null)&&this.netNetWeightMeasure.equals(rhs.netNetWeightMeasure))))&&((this.consignment == rhs.consignment)||((this.consignment!= null)&&this.consignment.equals(rhs.consignment))))&&((this.grossWeightMeasure == rhs.grossWeightMeasure)||((this.grossWeightMeasure!= null)&&this.grossWeightMeasure.equals(rhs.grossWeightMeasure))))&&((this.netWeightMeasure == rhs.netWeightMeasure)||((this.netWeightMeasure!= null)&&this.netWeightMeasure.equals(rhs.netWeightMeasure))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.freightAllowanceCharge == rhs.freightAllowanceCharge)||((this.freightAllowanceCharge!= null)&&this.freightAllowanceCharge.equals(rhs.freightAllowanceCharge))))&&((this.firstArrivalPortLocation == rhs.firstArrivalPortLocation)||((this.firstArrivalPortLocation!= null)&&this.firstArrivalPortLocation.equals(rhs.firstArrivalPortLocation))))&&((this.declaredStatisticsValueAmount == rhs.declaredStatisticsValueAmount)||((this.declaredStatisticsValueAmount!= null)&&this.declaredStatisticsValueAmount.equals(rhs.declaredStatisticsValueAmount))))&&((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery))))&&((this.insuranceValueAmount == rhs.insuranceValueAmount)||((this.insuranceValueAmount!= null)&&this.insuranceValueAmount.equals(rhs.insuranceValueAmount))))&&((this.shippingPriorityLevelCode == rhs.shippingPriorityLevelCode)||((this.shippingPriorityLevelCode!= null)&&this.shippingPriorityLevelCode.equals(rhs.shippingPriorityLevelCode))))&&((this.splitConsignmentIndicator == rhs.splitConsignmentIndicator)||((this.splitConsignmentIndicator!= null)&&this.splitConsignmentIndicator.equals(rhs.splitConsignmentIndicator))))&&((this.consignmentQuantity == rhs.consignmentQuantity)||((this.consignmentQuantity!= null)&&this.consignmentQuantity.equals(rhs.consignmentQuantity))))&&((this.exportCountry == rhs.exportCountry)||((this.exportCountry!= null)&&this.exportCountry.equals(rhs.exportCountry))))&&((this.deliveryInstructions == rhs.deliveryInstructions)||((this.deliveryInstructions!= null)&&this.deliveryInstructions.equals(rhs.deliveryInstructions))))&&((this.lastExitPortLocation == rhs.lastExitPortLocation)||((this.lastExitPortLocation!= null)&&this.lastExitPortLocation.equals(rhs.lastExitPortLocation))))&&((this.transportHandlingUnit == rhs.transportHandlingUnit)||((this.transportHandlingUnit!= null)&&this.transportHandlingUnit.equals(rhs.transportHandlingUnit))))&&((this.netVolumeMeasure == rhs.netVolumeMeasure)||((this.netVolumeMeasure!= null)&&this.netVolumeMeasure.equals(rhs.netVolumeMeasure))))&&((this.specialInstructions == rhs.specialInstructions)||((this.specialInstructions!= null)&&this.specialInstructions.equals(rhs.specialInstructions))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.handlingCode == rhs.handlingCode)||((this.handlingCode!= null)&&this.handlingCode.equals(rhs.handlingCode))))&&((this.information == rhs.information)||((this.information!= null)&&this.information.equals(rhs.information))))&&((this.handlingInstructions == rhs.handlingInstructions)||((this.handlingInstructions!= null)&&this.handlingInstructions.equals(rhs.handlingInstructions))))&&((this.grossVolumeMeasure == rhs.grossVolumeMeasure)||((this.grossVolumeMeasure!= null)&&this.grossVolumeMeasure.equals(rhs.grossVolumeMeasure))));
    }

}
