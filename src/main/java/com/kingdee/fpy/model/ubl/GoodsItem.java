
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
 * Goods Item. Details
 * <p>
 * A class to describe a separately identifiable quantity of goods of a single product type.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "SequenceNumberID",
    "Description",
    "HazardousRiskIndicator",
    "DeclaredCustomsValueAmount",
    "DeclaredForCarriageValueAmount",
    "DeclaredStatisticsValueAmount",
    "FreeOnBoardValueAmount",
    "InsuranceValueAmount",
    "ValueAmount",
    "GrossWeightMeasure",
    "NetWeightMeasure",
    "NetNetWeightMeasure",
    "ChargeableWeightMeasure",
    "GrossVolumeMeasure",
    "NetVolumeMeasure",
    "Quantity",
    "PreferenceCriterionCode",
    "RequiredCustomsID",
    "CustomsStatusCode",
    "CustomsTariffQuantity",
    "CustomsImportClassifiedIndicator",
    "ChargeableQuantity",
    "ReturnableQuantity",
    "TraceID",
    "Item",
    "GoodsItemContainer",
    "FreightAllowanceCharge",
    "InvoiceLine",
    "Temperature",
    "ContainedGoodsItem",
    "OriginAddress",
    "Delivery",
    "Pickup",
    "Despatch",
    "MeasurementDimension",
    "ContainingPackage",
    "ShipmentDocumentReference",
    "MinimumTemperature",
    "MaximumTemperature"
})
@Generated("jsonschema2pojo")
public class GoodsItem {

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
     * Goods Item. Identifier
     * <p>
     * An identifier for this goods item.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Goods Item. Sequence Number. Identifier
     * <p>
     * A sequence number differentiating a specific goods item within a consignment.
     * 
     */
    @JsonProperty("SequenceNumberID")
    @JsonPropertyDescription("A sequence number differentiating a specific goods item within a consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> sequenceNumberID = new ArrayList<IdentifierType>();
    /**
     * Goods Item. Description. Text
     * <p>
     * Text describing this goods item to identify it for customs, statistical, or transport purposes.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing this goods item to identify it for customs, statistical, or transport purposes.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Goods Item. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods item is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    @JsonPropertyDescription("An indication that the transported goods item is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> hazardousRiskIndicator = new ArrayList<IndicatorType>();
    /**
     * Goods Item. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of the goods item.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    @JsonPropertyDescription("The total declared value for customs purposes of the goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredCustomsValueAmount = new ArrayList<AmountType>();
    /**
     * Goods Item. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this goods item, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    @JsonPropertyDescription("The value of this goods item, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredForCarriageValueAmount = new ArrayList<AmountType>();
    /**
     * Goods Item. Declared Statistics_ Value. Amount
     * <p>
     * The total declared value of all the goods items in the same consignment with this goods item that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    @JsonPropertyDescription("The total declared value of all the goods items in the same consignment with this goods item that have the same statistical heading.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredStatisticsValueAmount = new ArrayList<AmountType>();
    /**
     * Goods Item. Free On Board_ Value. Amount
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
     * Goods Item. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this goods item.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    @JsonPropertyDescription("The amount covered by insurance for this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> insuranceValueAmount = new ArrayList<AmountType>();
    /**
     * Goods Item. Value. Amount
     * <p>
     * The amount on which a duty, tax, or fee will be assessed.
     * 
     */
    @JsonProperty("ValueAmount")
    @JsonPropertyDescription("The amount on which a duty, tax, or fee will be assessed.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> valueAmount = new ArrayList<AmountType>();
    /**
     * Goods Item. Gross_ Weight. Measure
     * <p>
     * The weight of this goods item, including packing and packaging but excluding the carrier's equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    @JsonPropertyDescription("The weight of this goods item, including packing and packaging but excluding the carrier's equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Goods Item. Net_ Weight. Measure
     * <p>
     * The weight of this goods item, excluding packing but including packaging that normally accompanies the goods.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    @JsonPropertyDescription("The weight of this goods item, excluding packing but including packaging that normally accompanies the goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Goods Item. Net Net_ Weight. Measure
     * <p>
     * The total weight of this goods item, excluding all packing and packaging.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    @JsonPropertyDescription("The total weight of this goods item, excluding all packing and packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netNetWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Goods Item. Chargeable_ Weight. Measure
     * <p>
     * The weight on which a charge is to be based.
     * 
     */
    @JsonProperty("ChargeableWeightMeasure")
    @JsonPropertyDescription("The weight on which a charge is to be based.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> chargeableWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Goods Item. Gross_ Volume. Measure
     * <p>
     * The volume of this goods item, normally calculated by multiplying its maximum length, width, and height.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    @JsonPropertyDescription("The volume of this goods item, normally calculated by multiplying its maximum length, width, and height.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Goods Item. Net_ Volume. Measure
     * <p>
     * The volume contained by a goods item, excluding the volume of any packaging material.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    @JsonPropertyDescription("The volume contained by a goods item, excluding the volume of any packaging material.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Goods Item. Quantity
     * <p>
     * The number of units making up this goods item.
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("The number of units making up this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> quantity = new ArrayList<QuantityType>();
    /**
     * Goods Item. Preference Criterion Code. Code
     * <p>
     * A code signifying the treatment preference for this goods item according to international trading agreements.
     * 
     */
    @JsonProperty("PreferenceCriterionCode")
    @JsonPropertyDescription("A code signifying the treatment preference for this goods item according to international trading agreements.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> preferenceCriterionCode = new ArrayList<CodeType>();
    /**
     * Goods Item. Required_ Customs Identifier. Identifier
     * <p>
     * An identifier for a set of tariff codes required to specify a type of goods for customs, transport, statistical, or other regulatory purposes.
     * 
     */
    @JsonProperty("RequiredCustomsID")
    @JsonPropertyDescription("An identifier for a set of tariff codes required to specify a type of goods for customs, transport, statistical, or other regulatory purposes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> requiredCustomsID = new ArrayList<IdentifierType>();
    /**
     * Goods Item. Customs Status Code. Code
     * <p>
     * A code assigned by customs to signify the status of this goods item.
     * 
     */
    @JsonProperty("CustomsStatusCode")
    @JsonPropertyDescription("A code assigned by customs to signify the status of this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> customsStatusCode = new ArrayList<CodeType>();
    /**
     * Goods Item. Customs Tariff Quantity. Quantity
     * <p>
     * Quantity of the units in this goods item as required by customs for tariff, statistical, or fiscal purposes.
     * 
     */
    @JsonProperty("CustomsTariffQuantity")
    @JsonPropertyDescription("Quantity of the units in this goods item as required by customs for tariff, statistical, or fiscal purposes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> customsTariffQuantity = new ArrayList<QuantityType>();
    /**
     * Goods Item. Customs Import_ Classified Indicator. Indicator
     * <p>
     * An indicator that this goods item has been classified for import by customs (true) or not (false).
     * 
     */
    @JsonProperty("CustomsImportClassifiedIndicator")
    @JsonPropertyDescription("An indicator that this goods item has been classified for import by customs (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> customsImportClassifiedIndicator = new ArrayList<IndicatorType>();
    /**
     * Goods Item. Chargeable_ Quantity. Quantity
     * <p>
     * The number of units in the goods item to which charges apply.
     * 
     */
    @JsonProperty("ChargeableQuantity")
    @JsonPropertyDescription("The number of units in the goods item to which charges apply.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> chargeableQuantity = new ArrayList<QuantityType>();
    /**
     * Goods Item. Returnable_ Quantity. Quantity
     * <p>
     * The number of units in the goods item that may be returned.
     * 
     */
    @JsonProperty("ReturnableQuantity")
    @JsonPropertyDescription("The number of units in the goods item that may be returned.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> returnableQuantity = new ArrayList<QuantityType>();
    /**
     * Goods Item. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this goods item, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    @JsonPropertyDescription("An identifier for use in tracing this goods item, such as the EPC number used in RFID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> traceID = new ArrayList<IdentifierType>();
    /**
     * Goods Item. Item
     * <p>
     * Product information relating to a goods item.
     * 
     */
    @JsonProperty("Item")
    @JsonPropertyDescription("Product information relating to a goods item.")
    @Size(min = 1)
    @Valid
    private List<Item> item = new ArrayList<Item>();
    /**
     * Goods Item. Goods Item Container
     * <p>
     * The transporting of a goods item in a unit of transport equipment (e.g., container).
     * 
     */
    @JsonProperty("GoodsItemContainer")
    @JsonPropertyDescription("The transporting of a goods item in a unit of transport equipment (e.g., container).")
    @Size(min = 1)
    @Valid
    private List<GoodsItemContainer> goodsItemContainer = new ArrayList<GoodsItemContainer>();
    /**
     * Goods Item. Freight_ Allowance Charge. Allowance Charge
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
     * Goods Item. Invoice Line
     * <p>
     * Information about an invoice line relating to this goods item.
     * 
     */
    @JsonProperty("InvoiceLine")
    @JsonPropertyDescription("Information about an invoice line relating to this goods item.")
    @Size(min = 1)
    @Valid
    private List<InvoiceLine> invoiceLine = new ArrayList<InvoiceLine>();
    /**
     * Goods Item. Temperature
     * <p>
     * The temperature of the goods item.
     * 
     */
    @JsonProperty("Temperature")
    @JsonPropertyDescription("The temperature of the goods item.")
    @Size(min = 1)
    @Valid
    private List<Temperature> temperature = new ArrayList<Temperature>();
    /**
     * Goods Item. Contained_ Goods Item. Goods Item
     * <p>
     * A goods item contained in this goods item.
     * 
     */
    @JsonProperty("ContainedGoodsItem")
    @JsonPropertyDescription("A goods item contained in this goods item.")
    @Size(min = 1)
    @Valid
    private List<GoodsItem> containedGoodsItem = new ArrayList<GoodsItem>();
    /**
     * Goods Item. Origin_ Address. Address
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
     * Goods Item. Delivery
     * <p>
     * The delivery of this goods item.
     * 
     */
    @JsonProperty("Delivery")
    @JsonPropertyDescription("The delivery of this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Delivery> delivery = new ArrayList<Delivery>();
    /**
     * Goods Item. Pickup
     * <p>
     * The pickup of this goods item.
     * 
     */
    @JsonProperty("Pickup")
    @JsonPropertyDescription("The pickup of this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Pickup> pickup = new ArrayList<Pickup>();
    /**
     * Goods Item. Despatch
     * <p>
     * The despatch of this goods item.
     * 
     */
    @JsonProperty("Despatch")
    @JsonPropertyDescription("The despatch of this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Despatch> despatch = new ArrayList<Despatch>();
    /**
     * Goods Item. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this goods item.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of this goods item.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();
    /**
     * Goods Item. Containing_ Package. Package
     * <p>
     * A package containing this goods item.
     * 
     */
    @JsonProperty("ContainingPackage")
    @JsonPropertyDescription("A package containing this goods item.")
    @Size(min = 1)
    @Valid
    private List<Package> containingPackage = new ArrayList<Package>();
    /**
     * Goods Item. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this goods item.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    @JsonPropertyDescription("A reference to a shipping document associated with this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> shipmentDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Goods Item. Minimum_ Temperature. Temperature
     * <p>
     * Information about minimum temperature.
     * 
     */
    @JsonProperty("MinimumTemperature")
    @JsonPropertyDescription("Information about minimum temperature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> minimumTemperature = new ArrayList<Temperature>();
    /**
     * Goods Item. Maximum_ Temperature. Temperature
     * <p>
     * Information about maximum temperature.
     * 
     */
    @JsonProperty("MaximumTemperature")
    @JsonPropertyDescription("Information about maximum temperature.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> maximumTemperature = new ArrayList<Temperature>();

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

    public GoodsItem withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Goods Item. Identifier
     * <p>
     * An identifier for this goods item.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Goods Item. Identifier
     * <p>
     * An identifier for this goods item.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public GoodsItem withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Goods Item. Sequence Number. Identifier
     * <p>
     * A sequence number differentiating a specific goods item within a consignment.
     * 
     */
    @JsonProperty("SequenceNumberID")
    public List<IdentifierType> getSequenceNumberID() {
        return sequenceNumberID;
    }

    /**
     * Goods Item. Sequence Number. Identifier
     * <p>
     * A sequence number differentiating a specific goods item within a consignment.
     * 
     */
    @JsonProperty("SequenceNumberID")
    public void setSequenceNumberID(List<IdentifierType> sequenceNumberID) {
        this.sequenceNumberID = sequenceNumberID;
    }

    public GoodsItem withSequenceNumberID(List<IdentifierType> sequenceNumberID) {
        this.sequenceNumberID = sequenceNumberID;
        return this;
    }

    /**
     * Goods Item. Description. Text
     * <p>
     * Text describing this goods item to identify it for customs, statistical, or transport purposes.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Goods Item. Description. Text
     * <p>
     * Text describing this goods item to identify it for customs, statistical, or transport purposes.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public GoodsItem withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Goods Item. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods item is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public List<IndicatorType> getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Goods Item. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods item is subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public void setHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public GoodsItem withHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
        return this;
    }

    /**
     * Goods Item. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of the goods item.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    public List<AmountType> getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Goods Item. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of the goods item.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    public void setDeclaredCustomsValueAmount(List<AmountType> declaredCustomsValueAmount) {
        this.declaredCustomsValueAmount = declaredCustomsValueAmount;
    }

    public GoodsItem withDeclaredCustomsValueAmount(List<AmountType> declaredCustomsValueAmount) {
        this.declaredCustomsValueAmount = declaredCustomsValueAmount;
        return this;
    }

    /**
     * Goods Item. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this goods item, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    public List<AmountType> getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Goods Item. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this goods item, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    public void setDeclaredForCarriageValueAmount(List<AmountType> declaredForCarriageValueAmount) {
        this.declaredForCarriageValueAmount = declaredForCarriageValueAmount;
    }

    public GoodsItem withDeclaredForCarriageValueAmount(List<AmountType> declaredForCarriageValueAmount) {
        this.declaredForCarriageValueAmount = declaredForCarriageValueAmount;
        return this;
    }

    /**
     * Goods Item. Declared Statistics_ Value. Amount
     * <p>
     * The total declared value of all the goods items in the same consignment with this goods item that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    public List<AmountType> getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Goods Item. Declared Statistics_ Value. Amount
     * <p>
     * The total declared value of all the goods items in the same consignment with this goods item that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    public void setDeclaredStatisticsValueAmount(List<AmountType> declaredStatisticsValueAmount) {
        this.declaredStatisticsValueAmount = declaredStatisticsValueAmount;
    }

    public GoodsItem withDeclaredStatisticsValueAmount(List<AmountType> declaredStatisticsValueAmount) {
        this.declaredStatisticsValueAmount = declaredStatisticsValueAmount;
        return this;
    }

    /**
     * Goods Item. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    public List<AmountType> getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Goods Item. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    public void setFreeOnBoardValueAmount(List<AmountType> freeOnBoardValueAmount) {
        this.freeOnBoardValueAmount = freeOnBoardValueAmount;
    }

    public GoodsItem withFreeOnBoardValueAmount(List<AmountType> freeOnBoardValueAmount) {
        this.freeOnBoardValueAmount = freeOnBoardValueAmount;
        return this;
    }

    /**
     * Goods Item. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this goods item.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    public List<AmountType> getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Goods Item. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this goods item.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    public void setInsuranceValueAmount(List<AmountType> insuranceValueAmount) {
        this.insuranceValueAmount = insuranceValueAmount;
    }

    public GoodsItem withInsuranceValueAmount(List<AmountType> insuranceValueAmount) {
        this.insuranceValueAmount = insuranceValueAmount;
        return this;
    }

    /**
     * Goods Item. Value. Amount
     * <p>
     * The amount on which a duty, tax, or fee will be assessed.
     * 
     */
    @JsonProperty("ValueAmount")
    public List<AmountType> getValueAmount() {
        return valueAmount;
    }

    /**
     * Goods Item. Value. Amount
     * <p>
     * The amount on which a duty, tax, or fee will be assessed.
     * 
     */
    @JsonProperty("ValueAmount")
    public void setValueAmount(List<AmountType> valueAmount) {
        this.valueAmount = valueAmount;
    }

    public GoodsItem withValueAmount(List<AmountType> valueAmount) {
        this.valueAmount = valueAmount;
        return this;
    }

    /**
     * Goods Item. Gross_ Weight. Measure
     * <p>
     * The weight of this goods item, including packing and packaging but excluding the carrier's equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public List<MeasureType> getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Goods Item. Gross_ Weight. Measure
     * <p>
     * The weight of this goods item, including packing and packaging but excluding the carrier's equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public void setGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
    }

    public GoodsItem withGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
        return this;
    }

    /**
     * Goods Item. Net_ Weight. Measure
     * <p>
     * The weight of this goods item, excluding packing but including packaging that normally accompanies the goods.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public List<MeasureType> getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Goods Item. Net_ Weight. Measure
     * <p>
     * The weight of this goods item, excluding packing but including packaging that normally accompanies the goods.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public void setNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
    }

    public GoodsItem withNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
        return this;
    }

    /**
     * Goods Item. Net Net_ Weight. Measure
     * <p>
     * The total weight of this goods item, excluding all packing and packaging.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    public List<MeasureType> getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Goods Item. Net Net_ Weight. Measure
     * <p>
     * The total weight of this goods item, excluding all packing and packaging.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    public void setNetNetWeightMeasure(List<MeasureType> netNetWeightMeasure) {
        this.netNetWeightMeasure = netNetWeightMeasure;
    }

    public GoodsItem withNetNetWeightMeasure(List<MeasureType> netNetWeightMeasure) {
        this.netNetWeightMeasure = netNetWeightMeasure;
        return this;
    }

    /**
     * Goods Item. Chargeable_ Weight. Measure
     * <p>
     * The weight on which a charge is to be based.
     * 
     */
    @JsonProperty("ChargeableWeightMeasure")
    public List<MeasureType> getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    /**
     * Goods Item. Chargeable_ Weight. Measure
     * <p>
     * The weight on which a charge is to be based.
     * 
     */
    @JsonProperty("ChargeableWeightMeasure")
    public void setChargeableWeightMeasure(List<MeasureType> chargeableWeightMeasure) {
        this.chargeableWeightMeasure = chargeableWeightMeasure;
    }

    public GoodsItem withChargeableWeightMeasure(List<MeasureType> chargeableWeightMeasure) {
        this.chargeableWeightMeasure = chargeableWeightMeasure;
        return this;
    }

    /**
     * Goods Item. Gross_ Volume. Measure
     * <p>
     * The volume of this goods item, normally calculated by multiplying its maximum length, width, and height.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public List<MeasureType> getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Goods Item. Gross_ Volume. Measure
     * <p>
     * The volume of this goods item, normally calculated by multiplying its maximum length, width, and height.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public void setGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
    }

    public GoodsItem withGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
        return this;
    }

    /**
     * Goods Item. Net_ Volume. Measure
     * <p>
     * The volume contained by a goods item, excluding the volume of any packaging material.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public List<MeasureType> getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Goods Item. Net_ Volume. Measure
     * <p>
     * The volume contained by a goods item, excluding the volume of any packaging material.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public void setNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
    }

    public GoodsItem withNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
        return this;
    }

    /**
     * Goods Item. Quantity
     * <p>
     * The number of units making up this goods item.
     * 
     */
    @JsonProperty("Quantity")
    public List<QuantityType> getQuantity() {
        return quantity;
    }

    /**
     * Goods Item. Quantity
     * <p>
     * The number of units making up this goods item.
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
    }

    public GoodsItem withQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Goods Item. Preference Criterion Code. Code
     * <p>
     * A code signifying the treatment preference for this goods item according to international trading agreements.
     * 
     */
    @JsonProperty("PreferenceCriterionCode")
    public List<CodeType> getPreferenceCriterionCode() {
        return preferenceCriterionCode;
    }

    /**
     * Goods Item. Preference Criterion Code. Code
     * <p>
     * A code signifying the treatment preference for this goods item according to international trading agreements.
     * 
     */
    @JsonProperty("PreferenceCriterionCode")
    public void setPreferenceCriterionCode(List<CodeType> preferenceCriterionCode) {
        this.preferenceCriterionCode = preferenceCriterionCode;
    }

    public GoodsItem withPreferenceCriterionCode(List<CodeType> preferenceCriterionCode) {
        this.preferenceCriterionCode = preferenceCriterionCode;
        return this;
    }

    /**
     * Goods Item. Required_ Customs Identifier. Identifier
     * <p>
     * An identifier for a set of tariff codes required to specify a type of goods for customs, transport, statistical, or other regulatory purposes.
     * 
     */
    @JsonProperty("RequiredCustomsID")
    public List<IdentifierType> getRequiredCustomsID() {
        return requiredCustomsID;
    }

    /**
     * Goods Item. Required_ Customs Identifier. Identifier
     * <p>
     * An identifier for a set of tariff codes required to specify a type of goods for customs, transport, statistical, or other regulatory purposes.
     * 
     */
    @JsonProperty("RequiredCustomsID")
    public void setRequiredCustomsID(List<IdentifierType> requiredCustomsID) {
        this.requiredCustomsID = requiredCustomsID;
    }

    public GoodsItem withRequiredCustomsID(List<IdentifierType> requiredCustomsID) {
        this.requiredCustomsID = requiredCustomsID;
        return this;
    }

    /**
     * Goods Item. Customs Status Code. Code
     * <p>
     * A code assigned by customs to signify the status of this goods item.
     * 
     */
    @JsonProperty("CustomsStatusCode")
    public List<CodeType> getCustomsStatusCode() {
        return customsStatusCode;
    }

    /**
     * Goods Item. Customs Status Code. Code
     * <p>
     * A code assigned by customs to signify the status of this goods item.
     * 
     */
    @JsonProperty("CustomsStatusCode")
    public void setCustomsStatusCode(List<CodeType> customsStatusCode) {
        this.customsStatusCode = customsStatusCode;
    }

    public GoodsItem withCustomsStatusCode(List<CodeType> customsStatusCode) {
        this.customsStatusCode = customsStatusCode;
        return this;
    }

    /**
     * Goods Item. Customs Tariff Quantity. Quantity
     * <p>
     * Quantity of the units in this goods item as required by customs for tariff, statistical, or fiscal purposes.
     * 
     */
    @JsonProperty("CustomsTariffQuantity")
    public List<QuantityType> getCustomsTariffQuantity() {
        return customsTariffQuantity;
    }

    /**
     * Goods Item. Customs Tariff Quantity. Quantity
     * <p>
     * Quantity of the units in this goods item as required by customs for tariff, statistical, or fiscal purposes.
     * 
     */
    @JsonProperty("CustomsTariffQuantity")
    public void setCustomsTariffQuantity(List<QuantityType> customsTariffQuantity) {
        this.customsTariffQuantity = customsTariffQuantity;
    }

    public GoodsItem withCustomsTariffQuantity(List<QuantityType> customsTariffQuantity) {
        this.customsTariffQuantity = customsTariffQuantity;
        return this;
    }

    /**
     * Goods Item. Customs Import_ Classified Indicator. Indicator
     * <p>
     * An indicator that this goods item has been classified for import by customs (true) or not (false).
     * 
     */
    @JsonProperty("CustomsImportClassifiedIndicator")
    public List<IndicatorType> getCustomsImportClassifiedIndicator() {
        return customsImportClassifiedIndicator;
    }

    /**
     * Goods Item. Customs Import_ Classified Indicator. Indicator
     * <p>
     * An indicator that this goods item has been classified for import by customs (true) or not (false).
     * 
     */
    @JsonProperty("CustomsImportClassifiedIndicator")
    public void setCustomsImportClassifiedIndicator(List<IndicatorType> customsImportClassifiedIndicator) {
        this.customsImportClassifiedIndicator = customsImportClassifiedIndicator;
    }

    public GoodsItem withCustomsImportClassifiedIndicator(List<IndicatorType> customsImportClassifiedIndicator) {
        this.customsImportClassifiedIndicator = customsImportClassifiedIndicator;
        return this;
    }

    /**
     * Goods Item. Chargeable_ Quantity. Quantity
     * <p>
     * The number of units in the goods item to which charges apply.
     * 
     */
    @JsonProperty("ChargeableQuantity")
    public List<QuantityType> getChargeableQuantity() {
        return chargeableQuantity;
    }

    /**
     * Goods Item. Chargeable_ Quantity. Quantity
     * <p>
     * The number of units in the goods item to which charges apply.
     * 
     */
    @JsonProperty("ChargeableQuantity")
    public void setChargeableQuantity(List<QuantityType> chargeableQuantity) {
        this.chargeableQuantity = chargeableQuantity;
    }

    public GoodsItem withChargeableQuantity(List<QuantityType> chargeableQuantity) {
        this.chargeableQuantity = chargeableQuantity;
        return this;
    }

    /**
     * Goods Item. Returnable_ Quantity. Quantity
     * <p>
     * The number of units in the goods item that may be returned.
     * 
     */
    @JsonProperty("ReturnableQuantity")
    public List<QuantityType> getReturnableQuantity() {
        return returnableQuantity;
    }

    /**
     * Goods Item. Returnable_ Quantity. Quantity
     * <p>
     * The number of units in the goods item that may be returned.
     * 
     */
    @JsonProperty("ReturnableQuantity")
    public void setReturnableQuantity(List<QuantityType> returnableQuantity) {
        this.returnableQuantity = returnableQuantity;
    }

    public GoodsItem withReturnableQuantity(List<QuantityType> returnableQuantity) {
        this.returnableQuantity = returnableQuantity;
        return this;
    }

    /**
     * Goods Item. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this goods item, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public List<IdentifierType> getTraceID() {
        return traceID;
    }

    /**
     * Goods Item. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this goods item, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public void setTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
    }

    public GoodsItem withTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
        return this;
    }

    /**
     * Goods Item. Item
     * <p>
     * Product information relating to a goods item.
     * 
     */
    @JsonProperty("Item")
    public List<Item> getItem() {
        return item;
    }

    /**
     * Goods Item. Item
     * <p>
     * Product information relating to a goods item.
     * 
     */
    @JsonProperty("Item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    public GoodsItem withItem(List<Item> item) {
        this.item = item;
        return this;
    }

    /**
     * Goods Item. Goods Item Container
     * <p>
     * The transporting of a goods item in a unit of transport equipment (e.g., container).
     * 
     */
    @JsonProperty("GoodsItemContainer")
    public List<GoodsItemContainer> getGoodsItemContainer() {
        return goodsItemContainer;
    }

    /**
     * Goods Item. Goods Item Container
     * <p>
     * The transporting of a goods item in a unit of transport equipment (e.g., container).
     * 
     */
    @JsonProperty("GoodsItemContainer")
    public void setGoodsItemContainer(List<GoodsItemContainer> goodsItemContainer) {
        this.goodsItemContainer = goodsItemContainer;
    }

    public GoodsItem withGoodsItemContainer(List<GoodsItemContainer> goodsItemContainer) {
        this.goodsItemContainer = goodsItemContainer;
        return this;
    }

    /**
     * Goods Item. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public List<AllowanceCharge> getFreightAllowanceCharge() {
        return freightAllowanceCharge;
    }

    /**
     * Goods Item. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public void setFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
    }

    public GoodsItem withFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
        return this;
    }

    /**
     * Goods Item. Invoice Line
     * <p>
     * Information about an invoice line relating to this goods item.
     * 
     */
    @JsonProperty("InvoiceLine")
    public List<InvoiceLine> getInvoiceLine() {
        return invoiceLine;
    }

    /**
     * Goods Item. Invoice Line
     * <p>
     * Information about an invoice line relating to this goods item.
     * 
     */
    @JsonProperty("InvoiceLine")
    public void setInvoiceLine(List<InvoiceLine> invoiceLine) {
        this.invoiceLine = invoiceLine;
    }

    public GoodsItem withInvoiceLine(List<InvoiceLine> invoiceLine) {
        this.invoiceLine = invoiceLine;
        return this;
    }

    /**
     * Goods Item. Temperature
     * <p>
     * The temperature of the goods item.
     * 
     */
    @JsonProperty("Temperature")
    public List<Temperature> getTemperature() {
        return temperature;
    }

    /**
     * Goods Item. Temperature
     * <p>
     * The temperature of the goods item.
     * 
     */
    @JsonProperty("Temperature")
    public void setTemperature(List<Temperature> temperature) {
        this.temperature = temperature;
    }

    public GoodsItem withTemperature(List<Temperature> temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * Goods Item. Contained_ Goods Item. Goods Item
     * <p>
     * A goods item contained in this goods item.
     * 
     */
    @JsonProperty("ContainedGoodsItem")
    public List<GoodsItem> getContainedGoodsItem() {
        return containedGoodsItem;
    }

    /**
     * Goods Item. Contained_ Goods Item. Goods Item
     * <p>
     * A goods item contained in this goods item.
     * 
     */
    @JsonProperty("ContainedGoodsItem")
    public void setContainedGoodsItem(List<GoodsItem> containedGoodsItem) {
        this.containedGoodsItem = containedGoodsItem;
    }

    public GoodsItem withContainedGoodsItem(List<GoodsItem> containedGoodsItem) {
        this.containedGoodsItem = containedGoodsItem;
        return this;
    }

    /**
     * Goods Item. Origin_ Address. Address
     * <p>
     * The region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the customs tariff, or of quantitative restrictions, or of any other measure related to trade.
     * 
     */
    @JsonProperty("OriginAddress")
    public List<Address> getOriginAddress() {
        return originAddress;
    }

    /**
     * Goods Item. Origin_ Address. Address
     * <p>
     * The region in which the goods have been produced or manufactured, according to criteria laid down for the purposes of application of the customs tariff, or of quantitative restrictions, or of any other measure related to trade.
     * 
     */
    @JsonProperty("OriginAddress")
    public void setOriginAddress(List<Address> originAddress) {
        this.originAddress = originAddress;
    }

    public GoodsItem withOriginAddress(List<Address> originAddress) {
        this.originAddress = originAddress;
        return this;
    }

    /**
     * Goods Item. Delivery
     * <p>
     * The delivery of this goods item.
     * 
     */
    @JsonProperty("Delivery")
    public List<Delivery> getDelivery() {
        return delivery;
    }

    /**
     * Goods Item. Delivery
     * <p>
     * The delivery of this goods item.
     * 
     */
    @JsonProperty("Delivery")
    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public GoodsItem withDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Goods Item. Pickup
     * <p>
     * The pickup of this goods item.
     * 
     */
    @JsonProperty("Pickup")
    public List<Pickup> getPickup() {
        return pickup;
    }

    /**
     * Goods Item. Pickup
     * <p>
     * The pickup of this goods item.
     * 
     */
    @JsonProperty("Pickup")
    public void setPickup(List<Pickup> pickup) {
        this.pickup = pickup;
    }

    public GoodsItem withPickup(List<Pickup> pickup) {
        this.pickup = pickup;
        return this;
    }

    /**
     * Goods Item. Despatch
     * <p>
     * The despatch of this goods item.
     * 
     */
    @JsonProperty("Despatch")
    public List<Despatch> getDespatch() {
        return despatch;
    }

    /**
     * Goods Item. Despatch
     * <p>
     * The despatch of this goods item.
     * 
     */
    @JsonProperty("Despatch")
    public void setDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
    }

    public GoodsItem withDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
        return this;
    }

    /**
     * Goods Item. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this goods item.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Goods Item. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this goods item.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public GoodsItem withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    /**
     * Goods Item. Containing_ Package. Package
     * <p>
     * A package containing this goods item.
     * 
     */
    @JsonProperty("ContainingPackage")
    public List<Package> getContainingPackage() {
        return containingPackage;
    }

    /**
     * Goods Item. Containing_ Package. Package
     * <p>
     * A package containing this goods item.
     * 
     */
    @JsonProperty("ContainingPackage")
    public void setContainingPackage(List<Package> containingPackage) {
        this.containingPackage = containingPackage;
    }

    public GoodsItem withContainingPackage(List<Package> containingPackage) {
        this.containingPackage = containingPackage;
        return this;
    }

    /**
     * Goods Item. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this goods item.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    public List<DocumentReference> getShipmentDocumentReference() {
        return shipmentDocumentReference;
    }

    /**
     * Goods Item. Shipment_ Document Reference. Document Reference
     * <p>
     * A reference to a shipping document associated with this goods item.
     * 
     */
    @JsonProperty("ShipmentDocumentReference")
    public void setShipmentDocumentReference(List<DocumentReference> shipmentDocumentReference) {
        this.shipmentDocumentReference = shipmentDocumentReference;
    }

    public GoodsItem withShipmentDocumentReference(List<DocumentReference> shipmentDocumentReference) {
        this.shipmentDocumentReference = shipmentDocumentReference;
        return this;
    }

    /**
     * Goods Item. Minimum_ Temperature. Temperature
     * <p>
     * Information about minimum temperature.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public List<Temperature> getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Goods Item. Minimum_ Temperature. Temperature
     * <p>
     * Information about minimum temperature.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public void setMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public GoodsItem withMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
        return this;
    }

    /**
     * Goods Item. Maximum_ Temperature. Temperature
     * <p>
     * Information about maximum temperature.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public List<Temperature> getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Goods Item. Maximum_ Temperature. Temperature
     * <p>
     * Information about maximum temperature.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public void setMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public GoodsItem withMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GoodsItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("sequenceNumberID");
        sb.append('=');
        sb.append(((this.sequenceNumberID == null)?"<null>":this.sequenceNumberID));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("hazardousRiskIndicator");
        sb.append('=');
        sb.append(((this.hazardousRiskIndicator == null)?"<null>":this.hazardousRiskIndicator));
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
        sb.append("insuranceValueAmount");
        sb.append('=');
        sb.append(((this.insuranceValueAmount == null)?"<null>":this.insuranceValueAmount));
        sb.append(',');
        sb.append("valueAmount");
        sb.append('=');
        sb.append(((this.valueAmount == null)?"<null>":this.valueAmount));
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
        sb.append("chargeableWeightMeasure");
        sb.append('=');
        sb.append(((this.chargeableWeightMeasure == null)?"<null>":this.chargeableWeightMeasure));
        sb.append(',');
        sb.append("grossVolumeMeasure");
        sb.append('=');
        sb.append(((this.grossVolumeMeasure == null)?"<null>":this.grossVolumeMeasure));
        sb.append(',');
        sb.append("netVolumeMeasure");
        sb.append('=');
        sb.append(((this.netVolumeMeasure == null)?"<null>":this.netVolumeMeasure));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("preferenceCriterionCode");
        sb.append('=');
        sb.append(((this.preferenceCriterionCode == null)?"<null>":this.preferenceCriterionCode));
        sb.append(',');
        sb.append("requiredCustomsID");
        sb.append('=');
        sb.append(((this.requiredCustomsID == null)?"<null>":this.requiredCustomsID));
        sb.append(',');
        sb.append("customsStatusCode");
        sb.append('=');
        sb.append(((this.customsStatusCode == null)?"<null>":this.customsStatusCode));
        sb.append(',');
        sb.append("customsTariffQuantity");
        sb.append('=');
        sb.append(((this.customsTariffQuantity == null)?"<null>":this.customsTariffQuantity));
        sb.append(',');
        sb.append("customsImportClassifiedIndicator");
        sb.append('=');
        sb.append(((this.customsImportClassifiedIndicator == null)?"<null>":this.customsImportClassifiedIndicator));
        sb.append(',');
        sb.append("chargeableQuantity");
        sb.append('=');
        sb.append(((this.chargeableQuantity == null)?"<null>":this.chargeableQuantity));
        sb.append(',');
        sb.append("returnableQuantity");
        sb.append('=');
        sb.append(((this.returnableQuantity == null)?"<null>":this.returnableQuantity));
        sb.append(',');
        sb.append("traceID");
        sb.append('=');
        sb.append(((this.traceID == null)?"<null>":this.traceID));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("goodsItemContainer");
        sb.append('=');
        sb.append(((this.goodsItemContainer == null)?"<null>":this.goodsItemContainer));
        sb.append(',');
        sb.append("freightAllowanceCharge");
        sb.append('=');
        sb.append(((this.freightAllowanceCharge == null)?"<null>":this.freightAllowanceCharge));
        sb.append(',');
        sb.append("invoiceLine");
        sb.append('=');
        sb.append(((this.invoiceLine == null)?"<null>":this.invoiceLine));
        sb.append(',');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("containedGoodsItem");
        sb.append('=');
        sb.append(((this.containedGoodsItem == null)?"<null>":this.containedGoodsItem));
        sb.append(',');
        sb.append("originAddress");
        sb.append('=');
        sb.append(((this.originAddress == null)?"<null>":this.originAddress));
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
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
        sb.append(',');
        sb.append("containingPackage");
        sb.append('=');
        sb.append(((this.containingPackage == null)?"<null>":this.containingPackage));
        sb.append(',');
        sb.append("shipmentDocumentReference");
        sb.append('=');
        sb.append(((this.shipmentDocumentReference == null)?"<null>":this.shipmentDocumentReference));
        sb.append(',');
        sb.append("minimumTemperature");
        sb.append('=');
        sb.append(((this.minimumTemperature == null)?"<null>":this.minimumTemperature));
        sb.append(',');
        sb.append("maximumTemperature");
        sb.append('=');
        sb.append(((this.maximumTemperature == null)?"<null>":this.maximumTemperature));
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
        result = ((result* 31)+((this.chargeableWeightMeasure == null)? 0 :this.chargeableWeightMeasure.hashCode()));
        result = ((result* 31)+((this.preferenceCriterionCode == null)? 0 :this.preferenceCriterionCode.hashCode()));
        result = ((result* 31)+((this.declaredForCarriageValueAmount == null)? 0 :this.declaredForCarriageValueAmount.hashCode()));
        result = ((result* 31)+((this.goodsItemContainer == null)? 0 :this.goodsItemContainer.hashCode()));
        result = ((result* 31)+((this.originAddress == null)? 0 :this.originAddress.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.freeOnBoardValueAmount == null)? 0 :this.freeOnBoardValueAmount.hashCode()));
        result = ((result* 31)+((this.sequenceNumberID == null)? 0 :this.sequenceNumberID.hashCode()));
        result = ((result* 31)+((this.valueAmount == null)? 0 :this.valueAmount.hashCode()));
        result = ((result* 31)+((this.declaredCustomsValueAmount == null)? 0 :this.declaredCustomsValueAmount.hashCode()));
        result = ((result* 31)+((this.chargeableQuantity == null)? 0 :this.chargeableQuantity.hashCode()));
        result = ((result* 31)+((this.despatch == null)? 0 :this.despatch.hashCode()));
        result = ((result* 31)+((this.netNetWeightMeasure == null)? 0 :this.netNetWeightMeasure.hashCode()));
        result = ((result* 31)+((this.maximumTemperature == null)? 0 :this.maximumTemperature.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.grossWeightMeasure == null)? 0 :this.grossWeightMeasure.hashCode()));
        result = ((result* 31)+((this.netWeightMeasure == null)? 0 :this.netWeightMeasure.hashCode()));
        result = ((result* 31)+((this.invoiceLine == null)? 0 :this.invoiceLine.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.freightAllowanceCharge == null)? 0 :this.freightAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.customsImportClassifiedIndicator == null)? 0 :this.customsImportClassifiedIndicator.hashCode()));
        result = ((result* 31)+((this.declaredStatisticsValueAmount == null)? 0 :this.declaredStatisticsValueAmount.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.insuranceValueAmount == null)? 0 :this.insuranceValueAmount.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.containingPackage == null)? 0 :this.containingPackage.hashCode()));
        result = ((result* 31)+((this.customsTariffQuantity == null)? 0 :this.customsTariffQuantity.hashCode()));
        result = ((result* 31)+((this.containedGoodsItem == null)? 0 :this.containedGoodsItem.hashCode()));
        result = ((result* 31)+((this.pickup == null)? 0 :this.pickup.hashCode()));
        result = ((result* 31)+((this.customsStatusCode == null)? 0 :this.customsStatusCode.hashCode()));
        result = ((result* 31)+((this.shipmentDocumentReference == null)? 0 :this.shipmentDocumentReference.hashCode()));
        result = ((result* 31)+((this.hazardousRiskIndicator == null)? 0 :this.hazardousRiskIndicator.hashCode()));
        result = ((result* 31)+((this.netVolumeMeasure == null)? 0 :this.netVolumeMeasure.hashCode()));
        result = ((result* 31)+((this.requiredCustomsID == null)? 0 :this.requiredCustomsID.hashCode()));
        result = ((result* 31)+((this.returnableQuantity == null)? 0 :this.returnableQuantity.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.minimumTemperature == null)? 0 :this.minimumTemperature.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        result = ((result* 31)+((this.grossVolumeMeasure == null)? 0 :this.grossVolumeMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GoodsItem) == false) {
            return false;
        }
        GoodsItem rhs = ((GoodsItem) other);
        return ((((((((((((((((((((((((((((((((((((((((((this.traceID == rhs.traceID)||((this.traceID!= null)&&this.traceID.equals(rhs.traceID)))&&((this.chargeableWeightMeasure == rhs.chargeableWeightMeasure)||((this.chargeableWeightMeasure!= null)&&this.chargeableWeightMeasure.equals(rhs.chargeableWeightMeasure))))&&((this.preferenceCriterionCode == rhs.preferenceCriterionCode)||((this.preferenceCriterionCode!= null)&&this.preferenceCriterionCode.equals(rhs.preferenceCriterionCode))))&&((this.declaredForCarriageValueAmount == rhs.declaredForCarriageValueAmount)||((this.declaredForCarriageValueAmount!= null)&&this.declaredForCarriageValueAmount.equals(rhs.declaredForCarriageValueAmount))))&&((this.goodsItemContainer == rhs.goodsItemContainer)||((this.goodsItemContainer!= null)&&this.goodsItemContainer.equals(rhs.goodsItemContainer))))&&((this.originAddress == rhs.originAddress)||((this.originAddress!= null)&&this.originAddress.equals(rhs.originAddress))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.freeOnBoardValueAmount == rhs.freeOnBoardValueAmount)||((this.freeOnBoardValueAmount!= null)&&this.freeOnBoardValueAmount.equals(rhs.freeOnBoardValueAmount))))&&((this.sequenceNumberID == rhs.sequenceNumberID)||((this.sequenceNumberID!= null)&&this.sequenceNumberID.equals(rhs.sequenceNumberID))))&&((this.valueAmount == rhs.valueAmount)||((this.valueAmount!= null)&&this.valueAmount.equals(rhs.valueAmount))))&&((this.declaredCustomsValueAmount == rhs.declaredCustomsValueAmount)||((this.declaredCustomsValueAmount!= null)&&this.declaredCustomsValueAmount.equals(rhs.declaredCustomsValueAmount))))&&((this.chargeableQuantity == rhs.chargeableQuantity)||((this.chargeableQuantity!= null)&&this.chargeableQuantity.equals(rhs.chargeableQuantity))))&&((this.despatch == rhs.despatch)||((this.despatch!= null)&&this.despatch.equals(rhs.despatch))))&&((this.netNetWeightMeasure == rhs.netNetWeightMeasure)||((this.netNetWeightMeasure!= null)&&this.netNetWeightMeasure.equals(rhs.netNetWeightMeasure))))&&((this.maximumTemperature == rhs.maximumTemperature)||((this.maximumTemperature!= null)&&this.maximumTemperature.equals(rhs.maximumTemperature))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.grossWeightMeasure == rhs.grossWeightMeasure)||((this.grossWeightMeasure!= null)&&this.grossWeightMeasure.equals(rhs.grossWeightMeasure))))&&((this.netWeightMeasure == rhs.netWeightMeasure)||((this.netWeightMeasure!= null)&&this.netWeightMeasure.equals(rhs.netWeightMeasure))))&&((this.invoiceLine == rhs.invoiceLine)||((this.invoiceLine!= null)&&this.invoiceLine.equals(rhs.invoiceLine))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.freightAllowanceCharge == rhs.freightAllowanceCharge)||((this.freightAllowanceCharge!= null)&&this.freightAllowanceCharge.equals(rhs.freightAllowanceCharge))))&&((this.customsImportClassifiedIndicator == rhs.customsImportClassifiedIndicator)||((this.customsImportClassifiedIndicator!= null)&&this.customsImportClassifiedIndicator.equals(rhs.customsImportClassifiedIndicator))))&&((this.declaredStatisticsValueAmount == rhs.declaredStatisticsValueAmount)||((this.declaredStatisticsValueAmount!= null)&&this.declaredStatisticsValueAmount.equals(rhs.declaredStatisticsValueAmount))))&&((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery))))&&((this.insuranceValueAmount == rhs.insuranceValueAmount)||((this.insuranceValueAmount!= null)&&this.insuranceValueAmount.equals(rhs.insuranceValueAmount))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.containingPackage == rhs.containingPackage)||((this.containingPackage!= null)&&this.containingPackage.equals(rhs.containingPackage))))&&((this.customsTariffQuantity == rhs.customsTariffQuantity)||((this.customsTariffQuantity!= null)&&this.customsTariffQuantity.equals(rhs.customsTariffQuantity))))&&((this.containedGoodsItem == rhs.containedGoodsItem)||((this.containedGoodsItem!= null)&&this.containedGoodsItem.equals(rhs.containedGoodsItem))))&&((this.pickup == rhs.pickup)||((this.pickup!= null)&&this.pickup.equals(rhs.pickup))))&&((this.customsStatusCode == rhs.customsStatusCode)||((this.customsStatusCode!= null)&&this.customsStatusCode.equals(rhs.customsStatusCode))))&&((this.shipmentDocumentReference == rhs.shipmentDocumentReference)||((this.shipmentDocumentReference!= null)&&this.shipmentDocumentReference.equals(rhs.shipmentDocumentReference))))&&((this.hazardousRiskIndicator == rhs.hazardousRiskIndicator)||((this.hazardousRiskIndicator!= null)&&this.hazardousRiskIndicator.equals(rhs.hazardousRiskIndicator))))&&((this.netVolumeMeasure == rhs.netVolumeMeasure)||((this.netVolumeMeasure!= null)&&this.netVolumeMeasure.equals(rhs.netVolumeMeasure))))&&((this.requiredCustomsID == rhs.requiredCustomsID)||((this.requiredCustomsID!= null)&&this.requiredCustomsID.equals(rhs.requiredCustomsID))))&&((this.returnableQuantity == rhs.returnableQuantity)||((this.returnableQuantity!= null)&&this.returnableQuantity.equals(rhs.returnableQuantity))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.minimumTemperature == rhs.minimumTemperature)||((this.minimumTemperature!= null)&&this.minimumTemperature.equals(rhs.minimumTemperature))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))))&&((this.grossVolumeMeasure == rhs.grossVolumeMeasure)||((this.grossVolumeMeasure!= null)&&this.grossVolumeMeasure.equals(rhs.grossVolumeMeasure))));
    }

}
