
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
 * Consignment. Details
 * <p>
 * A class to describe an identifiable collection of one or more goods items to be transported between the consignor and the consignee. This information may be defined within a transport contract. A consignment may comprise more than one shipment (e.g., when consolidated by a freight forwarder).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "CarrierAssignedID",
    "ConsigneeAssignedID",
    "ConsignorAssignedID",
    "FreightForwarderAssignedID",
    "BrokerAssignedID",
    "ContractedCarrierAssignedID",
    "PerformingCarrierAssignedID",
    "SummaryDescription",
    "TotalInvoiceAmount",
    "DeclaredCustomsValueAmount",
    "TariffDescription",
    "TariffCode",
    "InsurancePremiumAmount",
    "GrossWeightMeasure",
    "NetWeightMeasure",
    "NetNetWeightMeasure",
    "ChargeableWeightMeasure",
    "GrossVolumeMeasure",
    "NetVolumeMeasure",
    "LoadingLengthMeasure",
    "Remarks",
    "HazardousRiskIndicator",
    "AnimalFoodIndicator",
    "HumanFoodIndicator",
    "LivestockIndicator",
    "BulkCargoIndicator",
    "ContainerizedIndicator",
    "GeneralCargoIndicator",
    "SpecialSecurityIndicator",
    "ThirdPartyPayerIndicator",
    "CarrierServiceInstructions",
    "CustomsClearanceServiceInstructions",
    "ForwarderServiceInstructions",
    "SpecialServiceInstructions",
    "SequenceID",
    "ShippingPriorityLevelCode",
    "HandlingCode",
    "HandlingInstructions",
    "Information",
    "TotalGoodsItemQuantity",
    "TotalTransportHandlingUnitQuantity",
    "InsuranceValueAmount",
    "DeclaredForCarriageValueAmount",
    "DeclaredStatisticsValueAmount",
    "FreeOnBoardValueAmount",
    "SpecialInstructions",
    "SplitConsignmentIndicator",
    "DeliveryInstructions",
    "ConsignmentQuantity",
    "ConsolidatableIndicator",
    "HaulageInstructions",
    "LoadingSequenceID",
    "ChildConsignmentQuantity",
    "TotalPackagesQuantity",
    "ConsolidatedShipment",
    "CustomsDeclaration",
    "RequestedPickupTransportEvent",
    "RequestedDeliveryTransportEvent",
    "PlannedPickupTransportEvent",
    "PlannedDeliveryTransportEvent",
    "Status",
    "ChildConsignment",
    "ConsigneeParty",
    "ExporterParty",
    "ConsignorParty",
    "ImporterParty",
    "CarrierParty",
    "FreightForwarderParty",
    "NotifyParty",
    "OriginalDespatchParty",
    "FinalDeliveryParty",
    "PerformingCarrierParty",
    "SubstituteCarrierParty",
    "LogisticsOperatorParty",
    "TransportAdvisorParty",
    "HazardousItemNotificationParty",
    "InsuranceParty",
    "MortgageHolderParty",
    "BillOfLadingHolderParty",
    "OriginalDepartureCountry",
    "FinalDestinationCountry",
    "TransitCountry",
    "TransportContract",
    "TransportEvent",
    "OriginalDespatchTransportationService",
    "FinalDeliveryTransportationService",
    "DeliveryTerms",
    "PaymentTerms",
    "CollectPaymentTerms",
    "DisbursementPaymentTerms",
    "PrepaidPaymentTerms",
    "FreightAllowanceCharge",
    "ExtraAllowanceCharge",
    "MainCarriageShipmentStage",
    "PreCarriageShipmentStage",
    "OnCarriageShipmentStage",
    "TransportHandlingUnit",
    "FirstArrivalPortLocation",
    "LastExitPortLocation"
})
@Generated("jsonschema2pojo")
public class Consignment {

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
     * Consignment. Identifier
     * <p>
     * An identifier assigned to a collection of goods for both import and export.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier assigned to a collection of goods for both import and export.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Consignment. Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the carrier.
     * 
     */
    @JsonProperty("CarrierAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the carrier.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> carrierAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Consignee Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the consignee.
     * 
     */
    @JsonProperty("ConsigneeAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the consignee.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> consigneeAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Consignor Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the consignor.
     * 
     */
    @JsonProperty("ConsignorAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the consignor.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> consignorAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Freight Forwarder Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the freight forwarder.
     * 
     */
    @JsonProperty("FreightForwarderAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the freight forwarder.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> freightForwarderAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Broker Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the broker.
     * 
     */
    @JsonProperty("BrokerAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the broker.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> brokerAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Contracted Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the contracted carrier.
     * 
     */
    @JsonProperty("ContractedCarrierAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the contracted carrier.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> contractedCarrierAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Performing Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the performing carrier.
     * 
     */
    @JsonProperty("PerformingCarrierAssignedID")
    @JsonPropertyDescription("An identifier for this consignment, assigned by the performing carrier.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> performingCarrierAssignedID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Summary_ Description. Text
     * <p>
     * A textual summary description of the consignment.
     * 
     */
    @JsonProperty("SummaryDescription")
    @JsonPropertyDescription("A textual summary description of the consignment.")
    @Size(min = 1)
    @Valid
    private List<TextType> summaryDescription = new ArrayList<TextType>();
    /**
     * Consignment. Total_ Invoice Amount. Amount
     * <p>
     * The total of all invoice amounts declared in this consignment.
     * 
     */
    @JsonProperty("TotalInvoiceAmount")
    @JsonPropertyDescription("The total of all invoice amounts declared in this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> totalInvoiceAmount = new ArrayList<AmountType>();
    /**
     * Consignment. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of all the goods in this consignment, regardless of whether they are subject to the same customs procedure, tariff/statistical categorization, country information, or duty regime.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    @JsonPropertyDescription("The total declared value for customs purposes of all the goods in this consignment, regardless of whether they are subject to the same customs procedure, tariff/statistical categorization, country information, or duty regime.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredCustomsValueAmount = new ArrayList<AmountType>();
    /**
     * Consignment. Tariff Description. Text
     * <p>
     * Text describing the tariff applied to this consignment.
     * 
     */
    @JsonProperty("TariffDescription")
    @JsonPropertyDescription("Text describing the tariff applied to this consignment.")
    @Size(min = 1)
    @Valid
    private List<TextType> tariffDescription = new ArrayList<TextType>();
    /**
     * Consignment. Tariff Code. Code
     * <p>
     * A code signifying the tariff applied to this consignment.
     * 
     */
    @JsonProperty("TariffCode")
    @JsonPropertyDescription("A code signifying the tariff applied to this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> tariffCode = new ArrayList<CodeType>();
    /**
     * Consignment. Insurance Premium Amount. Amount
     * <p>
     * The amount of the premium payable to an insurance company for insuring the goods contained in this consignment.
     * 
     */
    @JsonProperty("InsurancePremiumAmount")
    @JsonPropertyDescription("The amount of the premium payable to an insurance company for insuring the goods contained in this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> insurancePremiumAmount = new ArrayList<AmountType>();
    /**
     * Consignment. Gross_ Weight. Measure
     * <p>
     * The total declared weight of the goods in this consignment, including packaging but excluding the carrier's equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    @JsonPropertyDescription("The total declared weight of the goods in this consignment, including packaging but excluding the carrier's equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Net_ Weight. Measure
     * <p>
     * The total net weight of all the goods items referred to as one consignment.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    @JsonPropertyDescription("The total net weight of all the goods items referred to as one consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Net Net_ Weight. Measure
     * <p>
     * The total net weight of the goods in this consignment, exclusive of packaging.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    @JsonPropertyDescription("The total net weight of the goods in this consignment, exclusive of packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netNetWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Chargeable_ Weight. Measure
     * <p>
     * The weight upon which a charge is to be based.
     * 
     */
    @JsonProperty("ChargeableWeightMeasure")
    @JsonPropertyDescription("The weight upon which a charge is to be based.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> chargeableWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Gross_ Volume. Measure
     * <p>
     * The total volume of the goods referred to as one consignment.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    @JsonPropertyDescription("The total volume of the goods referred to as one consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Net_ Volume. Measure
     * <p>
     * The total net volume of all goods items referred to as one consignment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    @JsonPropertyDescription("The total net volume of all goods items referred to as one consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Loading_ Length. Measure
     * <p>
     * The total length in a means of transport or a piece of transport equipment which, given the width and height of the transport means, will accommodate all of the consignments in a single consolidation.
     * 
     */
    @JsonProperty("LoadingLengthMeasure")
    @JsonPropertyDescription("The total length in a means of transport or a piece of transport equipment which, given the width and height of the transport means, will accommodate all of the consignments in a single consolidation.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> loadingLengthMeasure = new ArrayList<MeasureType>();
    /**
     * Consignment. Remarks. Text
     * <p>
     * Remarks concerning the complete consignment, to be printed on the transport document.
     * 
     */
    @JsonProperty("Remarks")
    @JsonPropertyDescription("Remarks concerning the complete consignment, to be printed on the transport document.")
    @Size(min = 1)
    @Valid
    private List<TextType> remarks = new ArrayList<TextType>();
    /**
     * Consignment. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> hazardousRiskIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Animal_ Food Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are animal foodstuffs (true) or not (false).
     * 
     */
    @JsonProperty("AnimalFoodIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment are animal foodstuffs (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> animalFoodIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Human_ Food Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are for human consumption (true) or not (false).
     * 
     */
    @JsonProperty("HumanFoodIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment are for human consumption (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> humanFoodIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Livestock_ Indicator. Indicator
     * <p>
     * An indication that the transported goods are livestock (true) or not (false).
     * 
     */
    @JsonProperty("LivestockIndicator")
    @JsonPropertyDescription("An indication that the transported goods are livestock (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> livestockIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Bulk Cargo_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are bulk cargoes (true) or not (false).
     * 
     */
    @JsonProperty("BulkCargoIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment are bulk cargoes (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> bulkCargoIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Containerized_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are containerized cargoes (true) or not (false).
     * 
     */
    @JsonProperty("ContainerizedIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment are containerized cargoes (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> containerizedIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. General Cargo_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are general cargoes (true) or not (false).
     * 
     */
    @JsonProperty("GeneralCargoIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment are general cargoes (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> generalCargoIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Special_ Security Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment require special security (true) or not (false).
     * 
     */
    @JsonProperty("SpecialSecurityIndicator")
    @JsonPropertyDescription("An indication that the transported goods in this consignment require special security (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> specialSecurityIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Third Party Payer_ Indicator. Indicator
     * <p>
     * An indication that this consignment will be paid for by a third party (true) or not (false).
     * 
     */
    @JsonProperty("ThirdPartyPayerIndicator")
    @JsonPropertyDescription("An indication that this consignment will be paid for by a third party (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> thirdPartyPayerIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Carrier Service_ Instructions. Text
     * <p>
     * Service instructions to the carrier, expressed as text.
     * 
     */
    @JsonProperty("CarrierServiceInstructions")
    @JsonPropertyDescription("Service instructions to the carrier, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> carrierServiceInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Customs Clearance Service_ Instructions. Text
     * <p>
     * Service instructions for customs clearance, expressed as text.
     * 
     */
    @JsonProperty("CustomsClearanceServiceInstructions")
    @JsonPropertyDescription("Service instructions for customs clearance, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> customsClearanceServiceInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Forwarder Service_ Instructions. Text
     * <p>
     * Service instructions for the forwarder, expressed as text.
     * 
     */
    @JsonProperty("ForwarderServiceInstructions")
    @JsonPropertyDescription("Service instructions for the forwarder, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> forwarderServiceInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Special Service_ Instructions. Text
     * <p>
     * Special service instructions, expressed as text.
     * 
     */
    @JsonProperty("SpecialServiceInstructions")
    @JsonPropertyDescription("Special service instructions, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> specialServiceInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Sequence Identifier. Identifier
     * <p>
     * A sequence identifier for this consignment.
     * 
     */
    @JsonProperty("SequenceID")
    @JsonPropertyDescription("A sequence identifier for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> sequenceID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Shipping Priority Level Code. Code
     * <p>
     * A code signifying the priority or level of service required for this consignment.
     * 
     */
    @JsonProperty("ShippingPriorityLevelCode")
    @JsonPropertyDescription("A code signifying the priority or level of service required for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> shippingPriorityLevelCode = new ArrayList<CodeType>();
    /**
     * Consignment. Handling Code. Code
     * <p>
     * The handling required for this consignment, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    @JsonPropertyDescription("The handling required for this consignment, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> handlingCode = new ArrayList<CodeType>();
    /**
     * Consignment. Handling_ Instructions. Text
     * <p>
     * The handling required for this consignment, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    @JsonPropertyDescription("The handling required for this consignment, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> handlingInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Information. Text
     * <p>
     * Free-form text pertinent to this consignment, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Information")
    @JsonPropertyDescription("Free-form text pertinent to this consignment, conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> information = new ArrayList<TextType>();
    /**
     * Consignment. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this consignment.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    @JsonPropertyDescription("The total number of goods items in this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalGoodsItemQuantity = new ArrayList<QuantityType>();
    /**
     * Consignment. Total_ Transport Handling Unit Quantity. Quantity
     * <p>
     * The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this consignment.
     * 
     */
    @JsonProperty("TotalTransportHandlingUnitQuantity")
    @JsonPropertyDescription("The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalTransportHandlingUnitQuantity = new ArrayList<QuantityType>();
    /**
     * Consignment. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this consignment.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    @JsonPropertyDescription("The amount covered by insurance for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> insuranceValueAmount = new ArrayList<AmountType>();
    /**
     * Consignment. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this consignment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    @JsonPropertyDescription("The value of this consignment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredForCarriageValueAmount = new ArrayList<AmountType>();
    /**
     * Consignment. Declared Statistics_ Value. Amount
     * <p>
     * The value, declared for statistical purposes, of those goods in this consignment that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    @JsonPropertyDescription("The value, declared for statistical purposes, of those goods in this consignment that have the same statistical heading.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AmountType> declaredStatisticsValueAmount = new ArrayList<AmountType>();
    /**
     * Consignment. Free On Board_ Value. Amount
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
     * Consignment. Special_ Instructions. Text
     * <p>
     * Special instructions relating to this consignment.
     * 
     */
    @JsonProperty("SpecialInstructions")
    @JsonPropertyDescription("Special instructions relating to this consignment.")
    @Size(min = 1)
    @Valid
    private List<TextType> specialInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Split Consignment_ Indicator. Indicator
     * <p>
     * An indicator that this consignment has been split in transit (true) or not (false).
     * 
     */
    @JsonProperty("SplitConsignmentIndicator")
    @JsonPropertyDescription("An indicator that this consignment has been split in transit (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> splitConsignmentIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Delivery_ Instructions. Text
     * <p>
     * A set of delivery instructions relating to this consignment.
     * 
     */
    @JsonProperty("DeliveryInstructions")
    @JsonPropertyDescription("A set of delivery instructions relating to this consignment.")
    @Size(min = 1)
    @Valid
    private List<TextType> deliveryInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Consignment_ Quantity. Quantity
     * <p>
     * The count in this consignment considering goods items, child consignments, shipments
     * 
     */
    @JsonProperty("ConsignmentQuantity")
    @JsonPropertyDescription("The count in this consignment considering goods items, child consignments, shipments")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> consignmentQuantity = new ArrayList<QuantityType>();
    /**
     * Consignment. Consolidatable_ Indicator. Indicator
     * <p>
     * An indicator that this consignment can be consolidated (true) or not (false).
     * 
     */
    @JsonProperty("ConsolidatableIndicator")
    @JsonPropertyDescription("An indicator that this consignment can be consolidated (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> consolidatableIndicator = new ArrayList<IndicatorType>();
    /**
     * Consignment. Haulage_ Instructions. Text
     * <p>
     * Instructions regarding haulage of this consignment, expressed as text.
     * 
     */
    @JsonProperty("HaulageInstructions")
    @JsonPropertyDescription("Instructions regarding haulage of this consignment, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> haulageInstructions = new ArrayList<TextType>();
    /**
     * Consignment. Loading_ Sequence Identifier. Identifier
     * <p>
     * An identifier for the loading sequence of this consignment.
     * 
     */
    @JsonProperty("LoadingSequenceID")
    @JsonPropertyDescription("An identifier for the loading sequence of this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> loadingSequenceID = new ArrayList<IdentifierType>();
    /**
     * Consignment. Child Consignment Quantity. Quantity
     * <p>
     * The quantity of (consolidated) child consignments
     * 
     */
    @JsonProperty("ChildConsignmentQuantity")
    @JsonPropertyDescription("The quantity of (consolidated) child consignments")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> childConsignmentQuantity = new ArrayList<QuantityType>();
    /**
     * Consignment. Total_ Packages Quantity. Quantity
     * <p>
     * The total number of packages associated with a Consignment.
     * 
     */
    @JsonProperty("TotalPackagesQuantity")
    @JsonPropertyDescription("The total number of packages associated with a Consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> totalPackagesQuantity = new ArrayList<QuantityType>();
    /**
     * Consignment. Consolidated_ Shipment. Shipment
     * <p>
     * A consolidated shipment (a shipment created by an act of consolidation).
     * 
     */
    @JsonProperty("ConsolidatedShipment")
    @JsonPropertyDescription("A consolidated shipment (a shipment created by an act of consolidation).")
    @Size(min = 1)
    @Valid
    private List<Shipment> consolidatedShipment = new ArrayList<Shipment>();
    /**
     * Consignment. Customs Declaration
     * <p>
     * A class describing identifiers or references relating to customs procedures.
     * 
     */
    @JsonProperty("CustomsDeclaration")
    @JsonPropertyDescription("A class describing identifiers or references relating to customs procedures.")
    @Size(min = 1)
    @Valid
    private List<CustomsDeclaration> customsDeclaration = new ArrayList<CustomsDeclaration>();
    /**
     * Consignment. Requested Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of this consignment requested by the party requesting a transportation service (the transport user).
     * 
     */
    @JsonProperty("RequestedPickupTransportEvent")
    @JsonPropertyDescription("The pickup of this consignment requested by the party requesting a transportation service (the transport user).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> requestedPickupTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Consignment. Requested Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of this consignment requested by the party requesting a transportation service (the transport user).
     * 
     */
    @JsonProperty("RequestedDeliveryTransportEvent")
    @JsonPropertyDescription("The delivery of this consignment requested by the party requesting a transportation service (the transport user).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> requestedDeliveryTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Consignment. Planned Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of this consignment planned by the party responsible for providing the transportation service (the transport service provider).
     * 
     */
    @JsonProperty("PlannedPickupTransportEvent")
    @JsonPropertyDescription("The pickup of this consignment planned by the party responsible for providing the transportation service (the transport service provider).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> plannedPickupTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Consignment. Planned Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of this consignment planned by the party responsible for providing the transportation service (the transport service provider).
     * 
     */
    @JsonProperty("PlannedDeliveryTransportEvent")
    @JsonPropertyDescription("The delivery of this consignment planned by the party responsible for providing the transportation service (the transport service provider).")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEvent> plannedDeliveryTransportEvent = new ArrayList<TransportEvent>();
    /**
     * Consignment. Status
     * <p>
     * The status of a particular condition associated with this consignment.
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("The status of a particular condition associated with this consignment.")
    @Size(min = 1)
    @Valid
    private List<Status> status = new ArrayList<Status>();
    /**
     * Consignment. Child_ Consignment. Consignment
     * <p>
     * One of the child consignments of which a consolidated consignment is composed.
     * 
     */
    @JsonProperty("ChildConsignment")
    @JsonPropertyDescription("One of the child consignments of which a consolidated consignment is composed.")
    @Size(min = 1)
    @Valid
    private List<Consignment> childConsignment = new ArrayList<Consignment>();
    /**
     * Consignment. Consignee_ Party. Party
     * <p>
     * A party to which goods are consigned.
     * 
     */
    @JsonProperty("ConsigneeParty")
    @JsonPropertyDescription("A party to which goods are consigned.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> consigneeParty = new ArrayList<Party>();
    /**
     * Consignment. Exporter_ Party. Party
     * <p>
     * The party that makes the export declaration, or on behalf of which the export declaration is made, and that is the owner of the goods in this consignment or has similar right of disposal over them at the time when the declaration is accepted.
     * 
     */
    @JsonProperty("ExporterParty")
    @JsonPropertyDescription("The party that makes the export declaration, or on behalf of which the export declaration is made, and that is the owner of the goods in this consignment or has similar right of disposal over them at the time when the declaration is accepted.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> exporterParty = new ArrayList<Party>();
    /**
     * Consignment. Consignor_ Party. Party
     * <p>
     * The party consigning goods, as stipulated in the transport contract by the party ordering transport.
     * 
     */
    @JsonProperty("ConsignorParty")
    @JsonPropertyDescription("The party consigning goods, as stipulated in the transport contract by the party ordering transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> consignorParty = new ArrayList<Party>();
    /**
     * Consignment. Importer_ Party. Party
     * <p>
     * The party that makes an import declaration regarding this consignment, or on behalf of which a customs clearing agent or other authorized person makes an import declaration regarding this consignment. This may include a person who has possession of the goods or to whom the goods are consigned.
     * 
     */
    @JsonProperty("ImporterParty")
    @JsonPropertyDescription("The party that makes an import declaration regarding this consignment, or on behalf of which a customs clearing agent or other authorized person makes an import declaration regarding this consignment. This may include a person who has possession of the goods or to whom the goods are consigned.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> importerParty = new ArrayList<Party>();
    /**
     * Consignment. Carrier_ Party. Party
     * <p>
     * The party providing the transport of goods in this consignment between named points.
     * 
     */
    @JsonProperty("CarrierParty")
    @JsonPropertyDescription("The party providing the transport of goods in this consignment between named points.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> carrierParty = new ArrayList<Party>();
    /**
     * Consignment. Freight Forwarder_ Party. Party
     * <p>
     * The party combining individual smaller consignments into a single larger shipment (the consolidated shipment), which is sent to a counterpart that mirrors the consolidator's activity by dividing the consolidated consignment into its original components.
     * 
     */
    @JsonProperty("FreightForwarderParty")
    @JsonPropertyDescription("The party combining individual smaller consignments into a single larger shipment (the consolidated shipment), which is sent to a counterpart that mirrors the consolidator's activity by dividing the consolidated consignment into its original components.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> freightForwarderParty = new ArrayList<Party>();
    /**
     * Consignment. Notify_ Party. Party
     * <p>
     * The party to be notified upon arrival of goods and when special occurrences (usually pre-defined) take place during a transportation service.
     * 
     */
    @JsonProperty("NotifyParty")
    @JsonPropertyDescription("The party to be notified upon arrival of goods and when special occurrences (usually pre-defined) take place during a transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> notifyParty = new ArrayList<Party>();
    /**
     * Consignment. Original Despatch_ Party. Party
     * <p>
     * The original despatch (sender) party for this consignment.
     * 
     */
    @JsonProperty("OriginalDespatchParty")
    @JsonPropertyDescription("The original despatch (sender) party for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> originalDespatchParty = new ArrayList<Party>();
    /**
     * Consignment. Final Delivery_ Party. Party
     * <p>
     * The final delivery party for this consignment.
     * 
     */
    @JsonProperty("FinalDeliveryParty")
    @JsonPropertyDescription("The final delivery party for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> finalDeliveryParty = new ArrayList<Party>();
    /**
     * Consignment. Performing Carrier_ Party. Party
     * <p>
     * The party performing the carriage of this consignment.
     * 
     */
    @JsonProperty("PerformingCarrierParty")
    @JsonPropertyDescription("The party performing the carriage of this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> performingCarrierParty = new ArrayList<Party>();
    /**
     * Consignment. Substitute Carrier_ Party. Party
     * <p>
     * A substitute party performing the carriage of this consignment.
     * 
     */
    @JsonProperty("SubstituteCarrierParty")
    @JsonPropertyDescription("A substitute party performing the carriage of this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> substituteCarrierParty = new ArrayList<Party>();
    /**
     * Consignment. Logistics Operator_ Party. Party
     * <p>
     * The logistics operator party for this consignment.
     * 
     */
    @JsonProperty("LogisticsOperatorParty")
    @JsonPropertyDescription("The logistics operator party for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> logisticsOperatorParty = new ArrayList<Party>();
    /**
     * Consignment. Transport Advisor_ Party. Party
     * <p>
     * The party providing transport advice this consignment.
     * 
     */
    @JsonProperty("TransportAdvisorParty")
    @JsonPropertyDescription("The party providing transport advice this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> transportAdvisorParty = new ArrayList<Party>();
    /**
     * Consignment. Hazardous Item Notification_ Party. Party
     * <p>
     * The party that would be notified of a hazardous item in this consignment.
     * 
     */
    @JsonProperty("HazardousItemNotificationParty")
    @JsonPropertyDescription("The party that would be notified of a hazardous item in this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> hazardousItemNotificationParty = new ArrayList<Party>();
    /**
     * Consignment. Insurance_ Party. Party
     * <p>
     * The party holding the insurance for this consignment.
     * 
     */
    @JsonProperty("InsuranceParty")
    @JsonPropertyDescription("The party holding the insurance for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> insuranceParty = new ArrayList<Party>();
    /**
     * Consignment. Mortgage Holder_ Party. Party
     * <p>
     * The party holding the mortgage for this consignment.
     * 
     */
    @JsonProperty("MortgageHolderParty")
    @JsonPropertyDescription("The party holding the mortgage for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> mortgageHolderParty = new ArrayList<Party>();
    /**
     * Consignment. Bill Of Lading Holder_ Party. Party
     * <p>
     * The party holding the bill of lading for this consignment.
     * 
     */
    @JsonProperty("BillOfLadingHolderParty")
    @JsonPropertyDescription("The party holding the bill of lading for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> billOfLadingHolderParty = new ArrayList<Party>();
    /**
     * Consignment. Original Departure_ Country. Country
     * <p>
     * The country from which the goods in this consignment were originally exported, without any commercial transaction taking place in intermediate countries.
     * 
     */
    @JsonProperty("OriginalDepartureCountry")
    @JsonPropertyDescription("The country from which the goods in this consignment were originally exported, without any commercial transaction taking place in intermediate countries.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Country> originalDepartureCountry = new ArrayList<Country>();
    /**
     * Consignment. Final Destination_ Country. Country
     * <p>
     * The country in which the goods in this consignment are to be delivered to the final consignee or buyer.
     * 
     */
    @JsonProperty("FinalDestinationCountry")
    @JsonPropertyDescription("The country in which the goods in this consignment are to be delivered to the final consignee or buyer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Country> finalDestinationCountry = new ArrayList<Country>();
    /**
     * Consignment. Transit_ Country. Country
     * <p>
     * One of the countries through which goods or passengers in this consignment are routed between the country of original departure and the country of final destination.
     * 
     */
    @JsonProperty("TransitCountry")
    @JsonPropertyDescription("One of the countries through which goods or passengers in this consignment are routed between the country of original departure and the country of final destination.")
    @Size(min = 1)
    @Valid
    private List<Country> transitCountry = new ArrayList<Country>();
    /**
     * Consignment. Transport_ Contract. Contract
     * <p>
     * A transport contract relating to this consignment.
     * 
     */
    @JsonProperty("TransportContract")
    @JsonPropertyDescription("A transport contract relating to this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Contract> transportContract = new ArrayList<Contract>();
    /**
     * Consignment. Transport Event
     * <p>
     * A class describing a significant occurrence or happening related to the transportation of goods.
     * 
     */
    @JsonProperty("TransportEvent")
    @JsonPropertyDescription("A class describing a significant occurrence or happening related to the transportation of goods.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> transportEvent = new ArrayList<TransportEvent>();
    /**
     * Consignment. Original Despatch_ Transportation Service. Transportation Service
     * <p>
     * The service for pickup from the consignor under the transport contract for this consignment.
     * 
     */
    @JsonProperty("OriginalDespatchTransportationService")
    @JsonPropertyDescription("The service for pickup from the consignor under the transport contract for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportationService> originalDespatchTransportationService = new ArrayList<TransportationService>();
    /**
     * Consignment. Final Delivery_ Transportation Service. Transportation Service
     * <p>
     * The service for delivery to the consignee under the transport contract for this consignment.
     * 
     */
    @JsonProperty("FinalDeliveryTransportationService")
    @JsonPropertyDescription("The service for delivery to the consignee under the transport contract for this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportationService> finalDeliveryTransportationService = new ArrayList<TransportationService>();
    /**
     * Consignment. Delivery Terms
     * <p>
     * The conditions agreed upon between a seller and a buyer with regard to the delivery of goods and/or services (e.g., CIF, FOB, or EXW from the INCOTERMS Terms of Delivery).
     * 
     */
    @JsonProperty("DeliveryTerms")
    @JsonPropertyDescription("The conditions agreed upon between a seller and a buyer with regard to the delivery of goods and/or services (e.g., CIF, FOB, or EXW from the INCOTERMS Terms of Delivery).")
    @Size(min = 1, max = 1)
    @Valid
    private List<DeliveryTerms> deliveryTerms = new ArrayList<DeliveryTerms>();
    /**
     * Consignment. Payment Terms
     * <p>
     * The terms of payment between the parties (such as logistics service client, logistics service provider) in a transaction.
     * 
     */
    @JsonProperty("PaymentTerms")
    @JsonPropertyDescription("The terms of payment between the parties (such as logistics service client, logistics service provider) in a transaction.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PaymentTerms> paymentTerms = new ArrayList<PaymentTerms>();
    /**
     * Consignment. Collect_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment that apply to the collection of this consignment.
     * 
     */
    @JsonProperty("CollectPaymentTerms")
    @JsonPropertyDescription("The terms of payment that apply to the collection of this consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PaymentTerms> collectPaymentTerms = new ArrayList<PaymentTerms>();
    /**
     * Consignment. Disbursement_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment for disbursement.
     * 
     */
    @JsonProperty("DisbursementPaymentTerms")
    @JsonPropertyDescription("The terms of payment for disbursement.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PaymentTerms> disbursementPaymentTerms = new ArrayList<PaymentTerms>();
    /**
     * Consignment. Prepaid_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment for prepayment.
     * 
     */
    @JsonProperty("PrepaidPaymentTerms")
    @JsonPropertyDescription("The terms of payment for prepayment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<PaymentTerms> prepaidPaymentTerms = new ArrayList<PaymentTerms>();
    /**
     * Consignment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage for this consignment. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    @JsonPropertyDescription("A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage for this consignment. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> freightAllowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Consignment. Extra_ Allowance Charge. Allowance Charge
     * <p>
     * A charge for extra allowance.
     * 
     */
    @JsonProperty("ExtraAllowanceCharge")
    @JsonPropertyDescription("A charge for extra allowance.")
    @Size(min = 1)
    @Valid
    private List<AllowanceCharge> extraAllowanceCharge = new ArrayList<AllowanceCharge>();
    /**
     * Consignment. Main Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during main carriage.
     * 
     */
    @JsonProperty("MainCarriageShipmentStage")
    @JsonPropertyDescription("A shipment stage during main carriage.")
    @Size(min = 1)
    @Valid
    private List<ShipmentStage> mainCarriageShipmentStage = new ArrayList<ShipmentStage>();
    /**
     * Consignment. Pre Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during precarriage (usually refers to movement activity that takes place prior to the container being loaded at a port of loading).
     * 
     */
    @JsonProperty("PreCarriageShipmentStage")
    @JsonPropertyDescription("A shipment stage during precarriage (usually refers to movement activity that takes place prior to the container being loaded at a port of loading).")
    @Size(min = 1)
    @Valid
    private List<ShipmentStage> preCarriageShipmentStage = new ArrayList<ShipmentStage>();
    /**
     * Consignment. On Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during on-carriage (usually refers to movement activity that takes place after the container is discharged at a port of discharge).
     * 
     */
    @JsonProperty("OnCarriageShipmentStage")
    @JsonPropertyDescription("A shipment stage during on-carriage (usually refers to movement activity that takes place after the container is discharged at a port of discharge).")
    @Size(min = 1)
    @Valid
    private List<ShipmentStage> onCarriageShipmentStage = new ArrayList<ShipmentStage>();
    /**
     * Consignment. Transport Handling Unit
     * <p>
     * A transport handling unit used for loose and containerized goods.
     * 
     */
    @JsonProperty("TransportHandlingUnit")
    @JsonPropertyDescription("A transport handling unit used for loose and containerized goods.")
    @Size(min = 1)
    @Valid
    private List<TransportHandlingUnit> transportHandlingUnit = new ArrayList<TransportHandlingUnit>();
    /**
     * Consignment. First Arrival Port_ Location. Location
     * <p>
     * The first arrival location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("FirstArrivalPortLocation")
    @JsonPropertyDescription("The first arrival location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> firstArrivalPortLocation = new ArrayList<Location>();
    /**
     * Consignment. Last Exit Port_ Location. Location
     * <p>
     * The final exporting location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("LastExitPortLocation")
    @JsonPropertyDescription("The final exporting location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> lastExitPortLocation = new ArrayList<Location>();

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

    public Consignment withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Consignment. Identifier
     * <p>
     * An identifier assigned to a collection of goods for both import and export.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Consignment. Identifier
     * <p>
     * An identifier assigned to a collection of goods for both import and export.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Consignment withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Consignment. Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the carrier.
     * 
     */
    @JsonProperty("CarrierAssignedID")
    public List<IdentifierType> getCarrierAssignedID() {
        return carrierAssignedID;
    }

    /**
     * Consignment. Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the carrier.
     * 
     */
    @JsonProperty("CarrierAssignedID")
    public void setCarrierAssignedID(List<IdentifierType> carrierAssignedID) {
        this.carrierAssignedID = carrierAssignedID;
    }

    public Consignment withCarrierAssignedID(List<IdentifierType> carrierAssignedID) {
        this.carrierAssignedID = carrierAssignedID;
        return this;
    }

    /**
     * Consignment. Consignee Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the consignee.
     * 
     */
    @JsonProperty("ConsigneeAssignedID")
    public List<IdentifierType> getConsigneeAssignedID() {
        return consigneeAssignedID;
    }

    /**
     * Consignment. Consignee Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the consignee.
     * 
     */
    @JsonProperty("ConsigneeAssignedID")
    public void setConsigneeAssignedID(List<IdentifierType> consigneeAssignedID) {
        this.consigneeAssignedID = consigneeAssignedID;
    }

    public Consignment withConsigneeAssignedID(List<IdentifierType> consigneeAssignedID) {
        this.consigneeAssignedID = consigneeAssignedID;
        return this;
    }

    /**
     * Consignment. Consignor Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the consignor.
     * 
     */
    @JsonProperty("ConsignorAssignedID")
    public List<IdentifierType> getConsignorAssignedID() {
        return consignorAssignedID;
    }

    /**
     * Consignment. Consignor Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the consignor.
     * 
     */
    @JsonProperty("ConsignorAssignedID")
    public void setConsignorAssignedID(List<IdentifierType> consignorAssignedID) {
        this.consignorAssignedID = consignorAssignedID;
    }

    public Consignment withConsignorAssignedID(List<IdentifierType> consignorAssignedID) {
        this.consignorAssignedID = consignorAssignedID;
        return this;
    }

    /**
     * Consignment. Freight Forwarder Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the freight forwarder.
     * 
     */
    @JsonProperty("FreightForwarderAssignedID")
    public List<IdentifierType> getFreightForwarderAssignedID() {
        return freightForwarderAssignedID;
    }

    /**
     * Consignment. Freight Forwarder Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the freight forwarder.
     * 
     */
    @JsonProperty("FreightForwarderAssignedID")
    public void setFreightForwarderAssignedID(List<IdentifierType> freightForwarderAssignedID) {
        this.freightForwarderAssignedID = freightForwarderAssignedID;
    }

    public Consignment withFreightForwarderAssignedID(List<IdentifierType> freightForwarderAssignedID) {
        this.freightForwarderAssignedID = freightForwarderAssignedID;
        return this;
    }

    /**
     * Consignment. Broker Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the broker.
     * 
     */
    @JsonProperty("BrokerAssignedID")
    public List<IdentifierType> getBrokerAssignedID() {
        return brokerAssignedID;
    }

    /**
     * Consignment. Broker Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the broker.
     * 
     */
    @JsonProperty("BrokerAssignedID")
    public void setBrokerAssignedID(List<IdentifierType> brokerAssignedID) {
        this.brokerAssignedID = brokerAssignedID;
    }

    public Consignment withBrokerAssignedID(List<IdentifierType> brokerAssignedID) {
        this.brokerAssignedID = brokerAssignedID;
        return this;
    }

    /**
     * Consignment. Contracted Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the contracted carrier.
     * 
     */
    @JsonProperty("ContractedCarrierAssignedID")
    public List<IdentifierType> getContractedCarrierAssignedID() {
        return contractedCarrierAssignedID;
    }

    /**
     * Consignment. Contracted Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the contracted carrier.
     * 
     */
    @JsonProperty("ContractedCarrierAssignedID")
    public void setContractedCarrierAssignedID(List<IdentifierType> contractedCarrierAssignedID) {
        this.contractedCarrierAssignedID = contractedCarrierAssignedID;
    }

    public Consignment withContractedCarrierAssignedID(List<IdentifierType> contractedCarrierAssignedID) {
        this.contractedCarrierAssignedID = contractedCarrierAssignedID;
        return this;
    }

    /**
     * Consignment. Performing Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the performing carrier.
     * 
     */
    @JsonProperty("PerformingCarrierAssignedID")
    public List<IdentifierType> getPerformingCarrierAssignedID() {
        return performingCarrierAssignedID;
    }

    /**
     * Consignment. Performing Carrier Assigned_ Identifier. Identifier
     * <p>
     * An identifier for this consignment, assigned by the performing carrier.
     * 
     */
    @JsonProperty("PerformingCarrierAssignedID")
    public void setPerformingCarrierAssignedID(List<IdentifierType> performingCarrierAssignedID) {
        this.performingCarrierAssignedID = performingCarrierAssignedID;
    }

    public Consignment withPerformingCarrierAssignedID(List<IdentifierType> performingCarrierAssignedID) {
        this.performingCarrierAssignedID = performingCarrierAssignedID;
        return this;
    }

    /**
     * Consignment. Summary_ Description. Text
     * <p>
     * A textual summary description of the consignment.
     * 
     */
    @JsonProperty("SummaryDescription")
    public List<TextType> getSummaryDescription() {
        return summaryDescription;
    }

    /**
     * Consignment. Summary_ Description. Text
     * <p>
     * A textual summary description of the consignment.
     * 
     */
    @JsonProperty("SummaryDescription")
    public void setSummaryDescription(List<TextType> summaryDescription) {
        this.summaryDescription = summaryDescription;
    }

    public Consignment withSummaryDescription(List<TextType> summaryDescription) {
        this.summaryDescription = summaryDescription;
        return this;
    }

    /**
     * Consignment. Total_ Invoice Amount. Amount
     * <p>
     * The total of all invoice amounts declared in this consignment.
     * 
     */
    @JsonProperty("TotalInvoiceAmount")
    public List<AmountType> getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Consignment. Total_ Invoice Amount. Amount
     * <p>
     * The total of all invoice amounts declared in this consignment.
     * 
     */
    @JsonProperty("TotalInvoiceAmount")
    public void setTotalInvoiceAmount(List<AmountType> totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
    }

    public Consignment withTotalInvoiceAmount(List<AmountType> totalInvoiceAmount) {
        this.totalInvoiceAmount = totalInvoiceAmount;
        return this;
    }

    /**
     * Consignment. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of all the goods in this consignment, regardless of whether they are subject to the same customs procedure, tariff/statistical categorization, country information, or duty regime.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    public List<AmountType> getDeclaredCustomsValueAmount() {
        return declaredCustomsValueAmount;
    }

    /**
     * Consignment. Declared Customs_ Value. Amount
     * <p>
     * The total declared value for customs purposes of all the goods in this consignment, regardless of whether they are subject to the same customs procedure, tariff/statistical categorization, country information, or duty regime.
     * 
     */
    @JsonProperty("DeclaredCustomsValueAmount")
    public void setDeclaredCustomsValueAmount(List<AmountType> declaredCustomsValueAmount) {
        this.declaredCustomsValueAmount = declaredCustomsValueAmount;
    }

    public Consignment withDeclaredCustomsValueAmount(List<AmountType> declaredCustomsValueAmount) {
        this.declaredCustomsValueAmount = declaredCustomsValueAmount;
        return this;
    }

    /**
     * Consignment. Tariff Description. Text
     * <p>
     * Text describing the tariff applied to this consignment.
     * 
     */
    @JsonProperty("TariffDescription")
    public List<TextType> getTariffDescription() {
        return tariffDescription;
    }

    /**
     * Consignment. Tariff Description. Text
     * <p>
     * Text describing the tariff applied to this consignment.
     * 
     */
    @JsonProperty("TariffDescription")
    public void setTariffDescription(List<TextType> tariffDescription) {
        this.tariffDescription = tariffDescription;
    }

    public Consignment withTariffDescription(List<TextType> tariffDescription) {
        this.tariffDescription = tariffDescription;
        return this;
    }

    /**
     * Consignment. Tariff Code. Code
     * <p>
     * A code signifying the tariff applied to this consignment.
     * 
     */
    @JsonProperty("TariffCode")
    public List<CodeType> getTariffCode() {
        return tariffCode;
    }

    /**
     * Consignment. Tariff Code. Code
     * <p>
     * A code signifying the tariff applied to this consignment.
     * 
     */
    @JsonProperty("TariffCode")
    public void setTariffCode(List<CodeType> tariffCode) {
        this.tariffCode = tariffCode;
    }

    public Consignment withTariffCode(List<CodeType> tariffCode) {
        this.tariffCode = tariffCode;
        return this;
    }

    /**
     * Consignment. Insurance Premium Amount. Amount
     * <p>
     * The amount of the premium payable to an insurance company for insuring the goods contained in this consignment.
     * 
     */
    @JsonProperty("InsurancePremiumAmount")
    public List<AmountType> getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    /**
     * Consignment. Insurance Premium Amount. Amount
     * <p>
     * The amount of the premium payable to an insurance company for insuring the goods contained in this consignment.
     * 
     */
    @JsonProperty("InsurancePremiumAmount")
    public void setInsurancePremiumAmount(List<AmountType> insurancePremiumAmount) {
        this.insurancePremiumAmount = insurancePremiumAmount;
    }

    public Consignment withInsurancePremiumAmount(List<AmountType> insurancePremiumAmount) {
        this.insurancePremiumAmount = insurancePremiumAmount;
        return this;
    }

    /**
     * Consignment. Gross_ Weight. Measure
     * <p>
     * The total declared weight of the goods in this consignment, including packaging but excluding the carrier's equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public List<MeasureType> getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Consignment. Gross_ Weight. Measure
     * <p>
     * The total declared weight of the goods in this consignment, including packaging but excluding the carrier's equipment.
     * 
     */
    @JsonProperty("GrossWeightMeasure")
    public void setGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
    }

    public Consignment withGrossWeightMeasure(List<MeasureType> grossWeightMeasure) {
        this.grossWeightMeasure = grossWeightMeasure;
        return this;
    }

    /**
     * Consignment. Net_ Weight. Measure
     * <p>
     * The total net weight of all the goods items referred to as one consignment.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public List<MeasureType> getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Consignment. Net_ Weight. Measure
     * <p>
     * The total net weight of all the goods items referred to as one consignment.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public void setNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
    }

    public Consignment withNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
        return this;
    }

    /**
     * Consignment. Net Net_ Weight. Measure
     * <p>
     * The total net weight of the goods in this consignment, exclusive of packaging.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    public List<MeasureType> getNetNetWeightMeasure() {
        return netNetWeightMeasure;
    }

    /**
     * Consignment. Net Net_ Weight. Measure
     * <p>
     * The total net weight of the goods in this consignment, exclusive of packaging.
     * 
     */
    @JsonProperty("NetNetWeightMeasure")
    public void setNetNetWeightMeasure(List<MeasureType> netNetWeightMeasure) {
        this.netNetWeightMeasure = netNetWeightMeasure;
    }

    public Consignment withNetNetWeightMeasure(List<MeasureType> netNetWeightMeasure) {
        this.netNetWeightMeasure = netNetWeightMeasure;
        return this;
    }

    /**
     * Consignment. Chargeable_ Weight. Measure
     * <p>
     * The weight upon which a charge is to be based.
     * 
     */
    @JsonProperty("ChargeableWeightMeasure")
    public List<MeasureType> getChargeableWeightMeasure() {
        return chargeableWeightMeasure;
    }

    /**
     * Consignment. Chargeable_ Weight. Measure
     * <p>
     * The weight upon which a charge is to be based.
     * 
     */
    @JsonProperty("ChargeableWeightMeasure")
    public void setChargeableWeightMeasure(List<MeasureType> chargeableWeightMeasure) {
        this.chargeableWeightMeasure = chargeableWeightMeasure;
    }

    public Consignment withChargeableWeightMeasure(List<MeasureType> chargeableWeightMeasure) {
        this.chargeableWeightMeasure = chargeableWeightMeasure;
        return this;
    }

    /**
     * Consignment. Gross_ Volume. Measure
     * <p>
     * The total volume of the goods referred to as one consignment.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public List<MeasureType> getGrossVolumeMeasure() {
        return grossVolumeMeasure;
    }

    /**
     * Consignment. Gross_ Volume. Measure
     * <p>
     * The total volume of the goods referred to as one consignment.
     * 
     */
    @JsonProperty("GrossVolumeMeasure")
    public void setGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
    }

    public Consignment withGrossVolumeMeasure(List<MeasureType> grossVolumeMeasure) {
        this.grossVolumeMeasure = grossVolumeMeasure;
        return this;
    }

    /**
     * Consignment. Net_ Volume. Measure
     * <p>
     * The total net volume of all goods items referred to as one consignment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public List<MeasureType> getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Consignment. Net_ Volume. Measure
     * <p>
     * The total net volume of all goods items referred to as one consignment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public void setNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
    }

    public Consignment withNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
        return this;
    }

    /**
     * Consignment. Loading_ Length. Measure
     * <p>
     * The total length in a means of transport or a piece of transport equipment which, given the width and height of the transport means, will accommodate all of the consignments in a single consolidation.
     * 
     */
    @JsonProperty("LoadingLengthMeasure")
    public List<MeasureType> getLoadingLengthMeasure() {
        return loadingLengthMeasure;
    }

    /**
     * Consignment. Loading_ Length. Measure
     * <p>
     * The total length in a means of transport or a piece of transport equipment which, given the width and height of the transport means, will accommodate all of the consignments in a single consolidation.
     * 
     */
    @JsonProperty("LoadingLengthMeasure")
    public void setLoadingLengthMeasure(List<MeasureType> loadingLengthMeasure) {
        this.loadingLengthMeasure = loadingLengthMeasure;
    }

    public Consignment withLoadingLengthMeasure(List<MeasureType> loadingLengthMeasure) {
        this.loadingLengthMeasure = loadingLengthMeasure;
        return this;
    }

    /**
     * Consignment. Remarks. Text
     * <p>
     * Remarks concerning the complete consignment, to be printed on the transport document.
     * 
     */
    @JsonProperty("Remarks")
    public List<TextType> getRemarks() {
        return remarks;
    }

    /**
     * Consignment. Remarks. Text
     * <p>
     * Remarks concerning the complete consignment, to be printed on the transport document.
     * 
     */
    @JsonProperty("Remarks")
    public void setRemarks(List<TextType> remarks) {
        this.remarks = remarks;
    }

    public Consignment withRemarks(List<TextType> remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Consignment. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public List<IndicatorType> getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Consignment. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public void setHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public Consignment withHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
        return this;
    }

    /**
     * Consignment. Animal_ Food Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are animal foodstuffs (true) or not (false).
     * 
     */
    @JsonProperty("AnimalFoodIndicator")
    public List<IndicatorType> getAnimalFoodIndicator() {
        return animalFoodIndicator;
    }

    /**
     * Consignment. Animal_ Food Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are animal foodstuffs (true) or not (false).
     * 
     */
    @JsonProperty("AnimalFoodIndicator")
    public void setAnimalFoodIndicator(List<IndicatorType> animalFoodIndicator) {
        this.animalFoodIndicator = animalFoodIndicator;
    }

    public Consignment withAnimalFoodIndicator(List<IndicatorType> animalFoodIndicator) {
        this.animalFoodIndicator = animalFoodIndicator;
        return this;
    }

    /**
     * Consignment. Human_ Food Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are for human consumption (true) or not (false).
     * 
     */
    @JsonProperty("HumanFoodIndicator")
    public List<IndicatorType> getHumanFoodIndicator() {
        return humanFoodIndicator;
    }

    /**
     * Consignment. Human_ Food Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are for human consumption (true) or not (false).
     * 
     */
    @JsonProperty("HumanFoodIndicator")
    public void setHumanFoodIndicator(List<IndicatorType> humanFoodIndicator) {
        this.humanFoodIndicator = humanFoodIndicator;
    }

    public Consignment withHumanFoodIndicator(List<IndicatorType> humanFoodIndicator) {
        this.humanFoodIndicator = humanFoodIndicator;
        return this;
    }

    /**
     * Consignment. Livestock_ Indicator. Indicator
     * <p>
     * An indication that the transported goods are livestock (true) or not (false).
     * 
     */
    @JsonProperty("LivestockIndicator")
    public List<IndicatorType> getLivestockIndicator() {
        return livestockIndicator;
    }

    /**
     * Consignment. Livestock_ Indicator. Indicator
     * <p>
     * An indication that the transported goods are livestock (true) or not (false).
     * 
     */
    @JsonProperty("LivestockIndicator")
    public void setLivestockIndicator(List<IndicatorType> livestockIndicator) {
        this.livestockIndicator = livestockIndicator;
    }

    public Consignment withLivestockIndicator(List<IndicatorType> livestockIndicator) {
        this.livestockIndicator = livestockIndicator;
        return this;
    }

    /**
     * Consignment. Bulk Cargo_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are bulk cargoes (true) or not (false).
     * 
     */
    @JsonProperty("BulkCargoIndicator")
    public List<IndicatorType> getBulkCargoIndicator() {
        return bulkCargoIndicator;
    }

    /**
     * Consignment. Bulk Cargo_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are bulk cargoes (true) or not (false).
     * 
     */
    @JsonProperty("BulkCargoIndicator")
    public void setBulkCargoIndicator(List<IndicatorType> bulkCargoIndicator) {
        this.bulkCargoIndicator = bulkCargoIndicator;
    }

    public Consignment withBulkCargoIndicator(List<IndicatorType> bulkCargoIndicator) {
        this.bulkCargoIndicator = bulkCargoIndicator;
        return this;
    }

    /**
     * Consignment. Containerized_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are containerized cargoes (true) or not (false).
     * 
     */
    @JsonProperty("ContainerizedIndicator")
    public List<IndicatorType> getContainerizedIndicator() {
        return containerizedIndicator;
    }

    /**
     * Consignment. Containerized_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are containerized cargoes (true) or not (false).
     * 
     */
    @JsonProperty("ContainerizedIndicator")
    public void setContainerizedIndicator(List<IndicatorType> containerizedIndicator) {
        this.containerizedIndicator = containerizedIndicator;
    }

    public Consignment withContainerizedIndicator(List<IndicatorType> containerizedIndicator) {
        this.containerizedIndicator = containerizedIndicator;
        return this;
    }

    /**
     * Consignment. General Cargo_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are general cargoes (true) or not (false).
     * 
     */
    @JsonProperty("GeneralCargoIndicator")
    public List<IndicatorType> getGeneralCargoIndicator() {
        return generalCargoIndicator;
    }

    /**
     * Consignment. General Cargo_ Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment are general cargoes (true) or not (false).
     * 
     */
    @JsonProperty("GeneralCargoIndicator")
    public void setGeneralCargoIndicator(List<IndicatorType> generalCargoIndicator) {
        this.generalCargoIndicator = generalCargoIndicator;
    }

    public Consignment withGeneralCargoIndicator(List<IndicatorType> generalCargoIndicator) {
        this.generalCargoIndicator = generalCargoIndicator;
        return this;
    }

    /**
     * Consignment. Special_ Security Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment require special security (true) or not (false).
     * 
     */
    @JsonProperty("SpecialSecurityIndicator")
    public List<IndicatorType> getSpecialSecurityIndicator() {
        return specialSecurityIndicator;
    }

    /**
     * Consignment. Special_ Security Indicator. Indicator
     * <p>
     * An indication that the transported goods in this consignment require special security (true) or not (false).
     * 
     */
    @JsonProperty("SpecialSecurityIndicator")
    public void setSpecialSecurityIndicator(List<IndicatorType> specialSecurityIndicator) {
        this.specialSecurityIndicator = specialSecurityIndicator;
    }

    public Consignment withSpecialSecurityIndicator(List<IndicatorType> specialSecurityIndicator) {
        this.specialSecurityIndicator = specialSecurityIndicator;
        return this;
    }

    /**
     * Consignment. Third Party Payer_ Indicator. Indicator
     * <p>
     * An indication that this consignment will be paid for by a third party (true) or not (false).
     * 
     */
    @JsonProperty("ThirdPartyPayerIndicator")
    public List<IndicatorType> getThirdPartyPayerIndicator() {
        return thirdPartyPayerIndicator;
    }

    /**
     * Consignment. Third Party Payer_ Indicator. Indicator
     * <p>
     * An indication that this consignment will be paid for by a third party (true) or not (false).
     * 
     */
    @JsonProperty("ThirdPartyPayerIndicator")
    public void setThirdPartyPayerIndicator(List<IndicatorType> thirdPartyPayerIndicator) {
        this.thirdPartyPayerIndicator = thirdPartyPayerIndicator;
    }

    public Consignment withThirdPartyPayerIndicator(List<IndicatorType> thirdPartyPayerIndicator) {
        this.thirdPartyPayerIndicator = thirdPartyPayerIndicator;
        return this;
    }

    /**
     * Consignment. Carrier Service_ Instructions. Text
     * <p>
     * Service instructions to the carrier, expressed as text.
     * 
     */
    @JsonProperty("CarrierServiceInstructions")
    public List<TextType> getCarrierServiceInstructions() {
        return carrierServiceInstructions;
    }

    /**
     * Consignment. Carrier Service_ Instructions. Text
     * <p>
     * Service instructions to the carrier, expressed as text.
     * 
     */
    @JsonProperty("CarrierServiceInstructions")
    public void setCarrierServiceInstructions(List<TextType> carrierServiceInstructions) {
        this.carrierServiceInstructions = carrierServiceInstructions;
    }

    public Consignment withCarrierServiceInstructions(List<TextType> carrierServiceInstructions) {
        this.carrierServiceInstructions = carrierServiceInstructions;
        return this;
    }

    /**
     * Consignment. Customs Clearance Service_ Instructions. Text
     * <p>
     * Service instructions for customs clearance, expressed as text.
     * 
     */
    @JsonProperty("CustomsClearanceServiceInstructions")
    public List<TextType> getCustomsClearanceServiceInstructions() {
        return customsClearanceServiceInstructions;
    }

    /**
     * Consignment. Customs Clearance Service_ Instructions. Text
     * <p>
     * Service instructions for customs clearance, expressed as text.
     * 
     */
    @JsonProperty("CustomsClearanceServiceInstructions")
    public void setCustomsClearanceServiceInstructions(List<TextType> customsClearanceServiceInstructions) {
        this.customsClearanceServiceInstructions = customsClearanceServiceInstructions;
    }

    public Consignment withCustomsClearanceServiceInstructions(List<TextType> customsClearanceServiceInstructions) {
        this.customsClearanceServiceInstructions = customsClearanceServiceInstructions;
        return this;
    }

    /**
     * Consignment. Forwarder Service_ Instructions. Text
     * <p>
     * Service instructions for the forwarder, expressed as text.
     * 
     */
    @JsonProperty("ForwarderServiceInstructions")
    public List<TextType> getForwarderServiceInstructions() {
        return forwarderServiceInstructions;
    }

    /**
     * Consignment. Forwarder Service_ Instructions. Text
     * <p>
     * Service instructions for the forwarder, expressed as text.
     * 
     */
    @JsonProperty("ForwarderServiceInstructions")
    public void setForwarderServiceInstructions(List<TextType> forwarderServiceInstructions) {
        this.forwarderServiceInstructions = forwarderServiceInstructions;
    }

    public Consignment withForwarderServiceInstructions(List<TextType> forwarderServiceInstructions) {
        this.forwarderServiceInstructions = forwarderServiceInstructions;
        return this;
    }

    /**
     * Consignment. Special Service_ Instructions. Text
     * <p>
     * Special service instructions, expressed as text.
     * 
     */
    @JsonProperty("SpecialServiceInstructions")
    public List<TextType> getSpecialServiceInstructions() {
        return specialServiceInstructions;
    }

    /**
     * Consignment. Special Service_ Instructions. Text
     * <p>
     * Special service instructions, expressed as text.
     * 
     */
    @JsonProperty("SpecialServiceInstructions")
    public void setSpecialServiceInstructions(List<TextType> specialServiceInstructions) {
        this.specialServiceInstructions = specialServiceInstructions;
    }

    public Consignment withSpecialServiceInstructions(List<TextType> specialServiceInstructions) {
        this.specialServiceInstructions = specialServiceInstructions;
        return this;
    }

    /**
     * Consignment. Sequence Identifier. Identifier
     * <p>
     * A sequence identifier for this consignment.
     * 
     */
    @JsonProperty("SequenceID")
    public List<IdentifierType> getSequenceID() {
        return sequenceID;
    }

    /**
     * Consignment. Sequence Identifier. Identifier
     * <p>
     * A sequence identifier for this consignment.
     * 
     */
    @JsonProperty("SequenceID")
    public void setSequenceID(List<IdentifierType> sequenceID) {
        this.sequenceID = sequenceID;
    }

    public Consignment withSequenceID(List<IdentifierType> sequenceID) {
        this.sequenceID = sequenceID;
        return this;
    }

    /**
     * Consignment. Shipping Priority Level Code. Code
     * <p>
     * A code signifying the priority or level of service required for this consignment.
     * 
     */
    @JsonProperty("ShippingPriorityLevelCode")
    public List<CodeType> getShippingPriorityLevelCode() {
        return shippingPriorityLevelCode;
    }

    /**
     * Consignment. Shipping Priority Level Code. Code
     * <p>
     * A code signifying the priority or level of service required for this consignment.
     * 
     */
    @JsonProperty("ShippingPriorityLevelCode")
    public void setShippingPriorityLevelCode(List<CodeType> shippingPriorityLevelCode) {
        this.shippingPriorityLevelCode = shippingPriorityLevelCode;
    }

    public Consignment withShippingPriorityLevelCode(List<CodeType> shippingPriorityLevelCode) {
        this.shippingPriorityLevelCode = shippingPriorityLevelCode;
        return this;
    }

    /**
     * Consignment. Handling Code. Code
     * <p>
     * The handling required for this consignment, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    public List<CodeType> getHandlingCode() {
        return handlingCode;
    }

    /**
     * Consignment. Handling Code. Code
     * <p>
     * The handling required for this consignment, expressed as a code.
     * 
     */
    @JsonProperty("HandlingCode")
    public void setHandlingCode(List<CodeType> handlingCode) {
        this.handlingCode = handlingCode;
    }

    public Consignment withHandlingCode(List<CodeType> handlingCode) {
        this.handlingCode = handlingCode;
        return this;
    }

    /**
     * Consignment. Handling_ Instructions. Text
     * <p>
     * The handling required for this consignment, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    public List<TextType> getHandlingInstructions() {
        return handlingInstructions;
    }

    /**
     * Consignment. Handling_ Instructions. Text
     * <p>
     * The handling required for this consignment, expressed as text.
     * 
     */
    @JsonProperty("HandlingInstructions")
    public void setHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    public Consignment withHandlingInstructions(List<TextType> handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
        return this;
    }

    /**
     * Consignment. Information. Text
     * <p>
     * Free-form text pertinent to this consignment, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Information")
    public List<TextType> getInformation() {
        return information;
    }

    /**
     * Consignment. Information. Text
     * <p>
     * Free-form text pertinent to this consignment, conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Information")
    public void setInformation(List<TextType> information) {
        this.information = information;
    }

    public Consignment withInformation(List<TextType> information) {
        this.information = information;
        return this;
    }

    /**
     * Consignment. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this consignment.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    public List<QuantityType> getTotalGoodsItemQuantity() {
        return totalGoodsItemQuantity;
    }

    /**
     * Consignment. Total_ Goods Item Quantity. Quantity
     * <p>
     * The total number of goods items in this consignment.
     * 
     */
    @JsonProperty("TotalGoodsItemQuantity")
    public void setTotalGoodsItemQuantity(List<QuantityType> totalGoodsItemQuantity) {
        this.totalGoodsItemQuantity = totalGoodsItemQuantity;
    }

    public Consignment withTotalGoodsItemQuantity(List<QuantityType> totalGoodsItemQuantity) {
        this.totalGoodsItemQuantity = totalGoodsItemQuantity;
        return this;
    }

    /**
     * Consignment. Total_ Transport Handling Unit Quantity. Quantity
     * <p>
     * The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this consignment.
     * 
     */
    @JsonProperty("TotalTransportHandlingUnitQuantity")
    public List<QuantityType> getTotalTransportHandlingUnitQuantity() {
        return totalTransportHandlingUnitQuantity;
    }

    /**
     * Consignment. Total_ Transport Handling Unit Quantity. Quantity
     * <p>
     * The number of pieces of transport handling equipment (pallets, boxes, cases, etc.) in this consignment.
     * 
     */
    @JsonProperty("TotalTransportHandlingUnitQuantity")
    public void setTotalTransportHandlingUnitQuantity(List<QuantityType> totalTransportHandlingUnitQuantity) {
        this.totalTransportHandlingUnitQuantity = totalTransportHandlingUnitQuantity;
    }

    public Consignment withTotalTransportHandlingUnitQuantity(List<QuantityType> totalTransportHandlingUnitQuantity) {
        this.totalTransportHandlingUnitQuantity = totalTransportHandlingUnitQuantity;
        return this;
    }

    /**
     * Consignment. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this consignment.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    public List<AmountType> getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Consignment. Insurance_ Value. Amount
     * <p>
     * The amount covered by insurance for this consignment.
     * 
     */
    @JsonProperty("InsuranceValueAmount")
    public void setInsuranceValueAmount(List<AmountType> insuranceValueAmount) {
        this.insuranceValueAmount = insuranceValueAmount;
    }

    public Consignment withInsuranceValueAmount(List<AmountType> insuranceValueAmount) {
        this.insuranceValueAmount = insuranceValueAmount;
        return this;
    }

    /**
     * Consignment. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this consignment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    public List<AmountType> getDeclaredForCarriageValueAmount() {
        return declaredForCarriageValueAmount;
    }

    /**
     * Consignment. Declared For Carriage_ Value. Amount
     * <p>
     * The value of this consignment, declared by the shipper or his agent solely for the purpose of varying the carrier's level of liability from that provided in the contract of carriage, in case of loss or damage to goods or delayed delivery.
     * 
     */
    @JsonProperty("DeclaredForCarriageValueAmount")
    public void setDeclaredForCarriageValueAmount(List<AmountType> declaredForCarriageValueAmount) {
        this.declaredForCarriageValueAmount = declaredForCarriageValueAmount;
    }

    public Consignment withDeclaredForCarriageValueAmount(List<AmountType> declaredForCarriageValueAmount) {
        this.declaredForCarriageValueAmount = declaredForCarriageValueAmount;
        return this;
    }

    /**
     * Consignment. Declared Statistics_ Value. Amount
     * <p>
     * The value, declared for statistical purposes, of those goods in this consignment that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    public List<AmountType> getDeclaredStatisticsValueAmount() {
        return declaredStatisticsValueAmount;
    }

    /**
     * Consignment. Declared Statistics_ Value. Amount
     * <p>
     * The value, declared for statistical purposes, of those goods in this consignment that have the same statistical heading.
     * 
     */
    @JsonProperty("DeclaredStatisticsValueAmount")
    public void setDeclaredStatisticsValueAmount(List<AmountType> declaredStatisticsValueAmount) {
        this.declaredStatisticsValueAmount = declaredStatisticsValueAmount;
    }

    public Consignment withDeclaredStatisticsValueAmount(List<AmountType> declaredStatisticsValueAmount) {
        this.declaredStatisticsValueAmount = declaredStatisticsValueAmount;
        return this;
    }

    /**
     * Consignment. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    public List<AmountType> getFreeOnBoardValueAmount() {
        return freeOnBoardValueAmount;
    }

    /**
     * Consignment. Free On Board_ Value. Amount
     * <p>
     * The monetary amount that has to be or has been paid as calculated under the applicable trade delivery.
     * 
     */
    @JsonProperty("FreeOnBoardValueAmount")
    public void setFreeOnBoardValueAmount(List<AmountType> freeOnBoardValueAmount) {
        this.freeOnBoardValueAmount = freeOnBoardValueAmount;
    }

    public Consignment withFreeOnBoardValueAmount(List<AmountType> freeOnBoardValueAmount) {
        this.freeOnBoardValueAmount = freeOnBoardValueAmount;
        return this;
    }

    /**
     * Consignment. Special_ Instructions. Text
     * <p>
     * Special instructions relating to this consignment.
     * 
     */
    @JsonProperty("SpecialInstructions")
    public List<TextType> getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Consignment. Special_ Instructions. Text
     * <p>
     * Special instructions relating to this consignment.
     * 
     */
    @JsonProperty("SpecialInstructions")
    public void setSpecialInstructions(List<TextType> specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Consignment withSpecialInstructions(List<TextType> specialInstructions) {
        this.specialInstructions = specialInstructions;
        return this;
    }

    /**
     * Consignment. Split Consignment_ Indicator. Indicator
     * <p>
     * An indicator that this consignment has been split in transit (true) or not (false).
     * 
     */
    @JsonProperty("SplitConsignmentIndicator")
    public List<IndicatorType> getSplitConsignmentIndicator() {
        return splitConsignmentIndicator;
    }

    /**
     * Consignment. Split Consignment_ Indicator. Indicator
     * <p>
     * An indicator that this consignment has been split in transit (true) or not (false).
     * 
     */
    @JsonProperty("SplitConsignmentIndicator")
    public void setSplitConsignmentIndicator(List<IndicatorType> splitConsignmentIndicator) {
        this.splitConsignmentIndicator = splitConsignmentIndicator;
    }

    public Consignment withSplitConsignmentIndicator(List<IndicatorType> splitConsignmentIndicator) {
        this.splitConsignmentIndicator = splitConsignmentIndicator;
        return this;
    }

    /**
     * Consignment. Delivery_ Instructions. Text
     * <p>
     * A set of delivery instructions relating to this consignment.
     * 
     */
    @JsonProperty("DeliveryInstructions")
    public List<TextType> getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Consignment. Delivery_ Instructions. Text
     * <p>
     * A set of delivery instructions relating to this consignment.
     * 
     */
    @JsonProperty("DeliveryInstructions")
    public void setDeliveryInstructions(List<TextType> deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public Consignment withDeliveryInstructions(List<TextType> deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
        return this;
    }

    /**
     * Consignment. Consignment_ Quantity. Quantity
     * <p>
     * The count in this consignment considering goods items, child consignments, shipments
     * 
     */
    @JsonProperty("ConsignmentQuantity")
    public List<QuantityType> getConsignmentQuantity() {
        return consignmentQuantity;
    }

    /**
     * Consignment. Consignment_ Quantity. Quantity
     * <p>
     * The count in this consignment considering goods items, child consignments, shipments
     * 
     */
    @JsonProperty("ConsignmentQuantity")
    public void setConsignmentQuantity(List<QuantityType> consignmentQuantity) {
        this.consignmentQuantity = consignmentQuantity;
    }

    public Consignment withConsignmentQuantity(List<QuantityType> consignmentQuantity) {
        this.consignmentQuantity = consignmentQuantity;
        return this;
    }

    /**
     * Consignment. Consolidatable_ Indicator. Indicator
     * <p>
     * An indicator that this consignment can be consolidated (true) or not (false).
     * 
     */
    @JsonProperty("ConsolidatableIndicator")
    public List<IndicatorType> getConsolidatableIndicator() {
        return consolidatableIndicator;
    }

    /**
     * Consignment. Consolidatable_ Indicator. Indicator
     * <p>
     * An indicator that this consignment can be consolidated (true) or not (false).
     * 
     */
    @JsonProperty("ConsolidatableIndicator")
    public void setConsolidatableIndicator(List<IndicatorType> consolidatableIndicator) {
        this.consolidatableIndicator = consolidatableIndicator;
    }

    public Consignment withConsolidatableIndicator(List<IndicatorType> consolidatableIndicator) {
        this.consolidatableIndicator = consolidatableIndicator;
        return this;
    }

    /**
     * Consignment. Haulage_ Instructions. Text
     * <p>
     * Instructions regarding haulage of this consignment, expressed as text.
     * 
     */
    @JsonProperty("HaulageInstructions")
    public List<TextType> getHaulageInstructions() {
        return haulageInstructions;
    }

    /**
     * Consignment. Haulage_ Instructions. Text
     * <p>
     * Instructions regarding haulage of this consignment, expressed as text.
     * 
     */
    @JsonProperty("HaulageInstructions")
    public void setHaulageInstructions(List<TextType> haulageInstructions) {
        this.haulageInstructions = haulageInstructions;
    }

    public Consignment withHaulageInstructions(List<TextType> haulageInstructions) {
        this.haulageInstructions = haulageInstructions;
        return this;
    }

    /**
     * Consignment. Loading_ Sequence Identifier. Identifier
     * <p>
     * An identifier for the loading sequence of this consignment.
     * 
     */
    @JsonProperty("LoadingSequenceID")
    public List<IdentifierType> getLoadingSequenceID() {
        return loadingSequenceID;
    }

    /**
     * Consignment. Loading_ Sequence Identifier. Identifier
     * <p>
     * An identifier for the loading sequence of this consignment.
     * 
     */
    @JsonProperty("LoadingSequenceID")
    public void setLoadingSequenceID(List<IdentifierType> loadingSequenceID) {
        this.loadingSequenceID = loadingSequenceID;
    }

    public Consignment withLoadingSequenceID(List<IdentifierType> loadingSequenceID) {
        this.loadingSequenceID = loadingSequenceID;
        return this;
    }

    /**
     * Consignment. Child Consignment Quantity. Quantity
     * <p>
     * The quantity of (consolidated) child consignments
     * 
     */
    @JsonProperty("ChildConsignmentQuantity")
    public List<QuantityType> getChildConsignmentQuantity() {
        return childConsignmentQuantity;
    }

    /**
     * Consignment. Child Consignment Quantity. Quantity
     * <p>
     * The quantity of (consolidated) child consignments
     * 
     */
    @JsonProperty("ChildConsignmentQuantity")
    public void setChildConsignmentQuantity(List<QuantityType> childConsignmentQuantity) {
        this.childConsignmentQuantity = childConsignmentQuantity;
    }

    public Consignment withChildConsignmentQuantity(List<QuantityType> childConsignmentQuantity) {
        this.childConsignmentQuantity = childConsignmentQuantity;
        return this;
    }

    /**
     * Consignment. Total_ Packages Quantity. Quantity
     * <p>
     * The total number of packages associated with a Consignment.
     * 
     */
    @JsonProperty("TotalPackagesQuantity")
    public List<QuantityType> getTotalPackagesQuantity() {
        return totalPackagesQuantity;
    }

    /**
     * Consignment. Total_ Packages Quantity. Quantity
     * <p>
     * The total number of packages associated with a Consignment.
     * 
     */
    @JsonProperty("TotalPackagesQuantity")
    public void setTotalPackagesQuantity(List<QuantityType> totalPackagesQuantity) {
        this.totalPackagesQuantity = totalPackagesQuantity;
    }

    public Consignment withTotalPackagesQuantity(List<QuantityType> totalPackagesQuantity) {
        this.totalPackagesQuantity = totalPackagesQuantity;
        return this;
    }

    /**
     * Consignment. Consolidated_ Shipment. Shipment
     * <p>
     * A consolidated shipment (a shipment created by an act of consolidation).
     * 
     */
    @JsonProperty("ConsolidatedShipment")
    public List<Shipment> getConsolidatedShipment() {
        return consolidatedShipment;
    }

    /**
     * Consignment. Consolidated_ Shipment. Shipment
     * <p>
     * A consolidated shipment (a shipment created by an act of consolidation).
     * 
     */
    @JsonProperty("ConsolidatedShipment")
    public void setConsolidatedShipment(List<Shipment> consolidatedShipment) {
        this.consolidatedShipment = consolidatedShipment;
    }

    public Consignment withConsolidatedShipment(List<Shipment> consolidatedShipment) {
        this.consolidatedShipment = consolidatedShipment;
        return this;
    }

    /**
     * Consignment. Customs Declaration
     * <p>
     * A class describing identifiers or references relating to customs procedures.
     * 
     */
    @JsonProperty("CustomsDeclaration")
    public List<CustomsDeclaration> getCustomsDeclaration() {
        return customsDeclaration;
    }

    /**
     * Consignment. Customs Declaration
     * <p>
     * A class describing identifiers or references relating to customs procedures.
     * 
     */
    @JsonProperty("CustomsDeclaration")
    public void setCustomsDeclaration(List<CustomsDeclaration> customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
    }

    public Consignment withCustomsDeclaration(List<CustomsDeclaration> customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
        return this;
    }

    /**
     * Consignment. Requested Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of this consignment requested by the party requesting a transportation service (the transport user).
     * 
     */
    @JsonProperty("RequestedPickupTransportEvent")
    public List<TransportEvent> getRequestedPickupTransportEvent() {
        return requestedPickupTransportEvent;
    }

    /**
     * Consignment. Requested Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of this consignment requested by the party requesting a transportation service (the transport user).
     * 
     */
    @JsonProperty("RequestedPickupTransportEvent")
    public void setRequestedPickupTransportEvent(List<TransportEvent> requestedPickupTransportEvent) {
        this.requestedPickupTransportEvent = requestedPickupTransportEvent;
    }

    public Consignment withRequestedPickupTransportEvent(List<TransportEvent> requestedPickupTransportEvent) {
        this.requestedPickupTransportEvent = requestedPickupTransportEvent;
        return this;
    }

    /**
     * Consignment. Requested Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of this consignment requested by the party requesting a transportation service (the transport user).
     * 
     */
    @JsonProperty("RequestedDeliveryTransportEvent")
    public List<TransportEvent> getRequestedDeliveryTransportEvent() {
        return requestedDeliveryTransportEvent;
    }

    /**
     * Consignment. Requested Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of this consignment requested by the party requesting a transportation service (the transport user).
     * 
     */
    @JsonProperty("RequestedDeliveryTransportEvent")
    public void setRequestedDeliveryTransportEvent(List<TransportEvent> requestedDeliveryTransportEvent) {
        this.requestedDeliveryTransportEvent = requestedDeliveryTransportEvent;
    }

    public Consignment withRequestedDeliveryTransportEvent(List<TransportEvent> requestedDeliveryTransportEvent) {
        this.requestedDeliveryTransportEvent = requestedDeliveryTransportEvent;
        return this;
    }

    /**
     * Consignment. Planned Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of this consignment planned by the party responsible for providing the transportation service (the transport service provider).
     * 
     */
    @JsonProperty("PlannedPickupTransportEvent")
    public List<TransportEvent> getPlannedPickupTransportEvent() {
        return plannedPickupTransportEvent;
    }

    /**
     * Consignment. Planned Pickup_ Transport Event. Transport Event
     * <p>
     * The pickup of this consignment planned by the party responsible for providing the transportation service (the transport service provider).
     * 
     */
    @JsonProperty("PlannedPickupTransportEvent")
    public void setPlannedPickupTransportEvent(List<TransportEvent> plannedPickupTransportEvent) {
        this.plannedPickupTransportEvent = plannedPickupTransportEvent;
    }

    public Consignment withPlannedPickupTransportEvent(List<TransportEvent> plannedPickupTransportEvent) {
        this.plannedPickupTransportEvent = plannedPickupTransportEvent;
        return this;
    }

    /**
     * Consignment. Planned Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of this consignment planned by the party responsible for providing the transportation service (the transport service provider).
     * 
     */
    @JsonProperty("PlannedDeliveryTransportEvent")
    public List<TransportEvent> getPlannedDeliveryTransportEvent() {
        return plannedDeliveryTransportEvent;
    }

    /**
     * Consignment. Planned Delivery_ Transport Event. Transport Event
     * <p>
     * The delivery of this consignment planned by the party responsible for providing the transportation service (the transport service provider).
     * 
     */
    @JsonProperty("PlannedDeliveryTransportEvent")
    public void setPlannedDeliveryTransportEvent(List<TransportEvent> plannedDeliveryTransportEvent) {
        this.plannedDeliveryTransportEvent = plannedDeliveryTransportEvent;
    }

    public Consignment withPlannedDeliveryTransportEvent(List<TransportEvent> plannedDeliveryTransportEvent) {
        this.plannedDeliveryTransportEvent = plannedDeliveryTransportEvent;
        return this;
    }

    /**
     * Consignment. Status
     * <p>
     * The status of a particular condition associated with this consignment.
     * 
     */
    @JsonProperty("Status")
    public List<Status> getStatus() {
        return status;
    }

    /**
     * Consignment. Status
     * <p>
     * The status of a particular condition associated with this consignment.
     * 
     */
    @JsonProperty("Status")
    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public Consignment withStatus(List<Status> status) {
        this.status = status;
        return this;
    }

    /**
     * Consignment. Child_ Consignment. Consignment
     * <p>
     * One of the child consignments of which a consolidated consignment is composed.
     * 
     */
    @JsonProperty("ChildConsignment")
    public List<Consignment> getChildConsignment() {
        return childConsignment;
    }

    /**
     * Consignment. Child_ Consignment. Consignment
     * <p>
     * One of the child consignments of which a consolidated consignment is composed.
     * 
     */
    @JsonProperty("ChildConsignment")
    public void setChildConsignment(List<Consignment> childConsignment) {
        this.childConsignment = childConsignment;
    }

    public Consignment withChildConsignment(List<Consignment> childConsignment) {
        this.childConsignment = childConsignment;
        return this;
    }

    /**
     * Consignment. Consignee_ Party. Party
     * <p>
     * A party to which goods are consigned.
     * 
     */
    @JsonProperty("ConsigneeParty")
    public List<Party> getConsigneeParty() {
        return consigneeParty;
    }

    /**
     * Consignment. Consignee_ Party. Party
     * <p>
     * A party to which goods are consigned.
     * 
     */
    @JsonProperty("ConsigneeParty")
    public void setConsigneeParty(List<Party> consigneeParty) {
        this.consigneeParty = consigneeParty;
    }

    public Consignment withConsigneeParty(List<Party> consigneeParty) {
        this.consigneeParty = consigneeParty;
        return this;
    }

    /**
     * Consignment. Exporter_ Party. Party
     * <p>
     * The party that makes the export declaration, or on behalf of which the export declaration is made, and that is the owner of the goods in this consignment or has similar right of disposal over them at the time when the declaration is accepted.
     * 
     */
    @JsonProperty("ExporterParty")
    public List<Party> getExporterParty() {
        return exporterParty;
    }

    /**
     * Consignment. Exporter_ Party. Party
     * <p>
     * The party that makes the export declaration, or on behalf of which the export declaration is made, and that is the owner of the goods in this consignment or has similar right of disposal over them at the time when the declaration is accepted.
     * 
     */
    @JsonProperty("ExporterParty")
    public void setExporterParty(List<Party> exporterParty) {
        this.exporterParty = exporterParty;
    }

    public Consignment withExporterParty(List<Party> exporterParty) {
        this.exporterParty = exporterParty;
        return this;
    }

    /**
     * Consignment. Consignor_ Party. Party
     * <p>
     * The party consigning goods, as stipulated in the transport contract by the party ordering transport.
     * 
     */
    @JsonProperty("ConsignorParty")
    public List<Party> getConsignorParty() {
        return consignorParty;
    }

    /**
     * Consignment. Consignor_ Party. Party
     * <p>
     * The party consigning goods, as stipulated in the transport contract by the party ordering transport.
     * 
     */
    @JsonProperty("ConsignorParty")
    public void setConsignorParty(List<Party> consignorParty) {
        this.consignorParty = consignorParty;
    }

    public Consignment withConsignorParty(List<Party> consignorParty) {
        this.consignorParty = consignorParty;
        return this;
    }

    /**
     * Consignment. Importer_ Party. Party
     * <p>
     * The party that makes an import declaration regarding this consignment, or on behalf of which a customs clearing agent or other authorized person makes an import declaration regarding this consignment. This may include a person who has possession of the goods or to whom the goods are consigned.
     * 
     */
    @JsonProperty("ImporterParty")
    public List<Party> getImporterParty() {
        return importerParty;
    }

    /**
     * Consignment. Importer_ Party. Party
     * <p>
     * The party that makes an import declaration regarding this consignment, or on behalf of which a customs clearing agent or other authorized person makes an import declaration regarding this consignment. This may include a person who has possession of the goods or to whom the goods are consigned.
     * 
     */
    @JsonProperty("ImporterParty")
    public void setImporterParty(List<Party> importerParty) {
        this.importerParty = importerParty;
    }

    public Consignment withImporterParty(List<Party> importerParty) {
        this.importerParty = importerParty;
        return this;
    }

    /**
     * Consignment. Carrier_ Party. Party
     * <p>
     * The party providing the transport of goods in this consignment between named points.
     * 
     */
    @JsonProperty("CarrierParty")
    public List<Party> getCarrierParty() {
        return carrierParty;
    }

    /**
     * Consignment. Carrier_ Party. Party
     * <p>
     * The party providing the transport of goods in this consignment between named points.
     * 
     */
    @JsonProperty("CarrierParty")
    public void setCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
    }

    public Consignment withCarrierParty(List<Party> carrierParty) {
        this.carrierParty = carrierParty;
        return this;
    }

    /**
     * Consignment. Freight Forwarder_ Party. Party
     * <p>
     * The party combining individual smaller consignments into a single larger shipment (the consolidated shipment), which is sent to a counterpart that mirrors the consolidator's activity by dividing the consolidated consignment into its original components.
     * 
     */
    @JsonProperty("FreightForwarderParty")
    public List<Party> getFreightForwarderParty() {
        return freightForwarderParty;
    }

    /**
     * Consignment. Freight Forwarder_ Party. Party
     * <p>
     * The party combining individual smaller consignments into a single larger shipment (the consolidated shipment), which is sent to a counterpart that mirrors the consolidator's activity by dividing the consolidated consignment into its original components.
     * 
     */
    @JsonProperty("FreightForwarderParty")
    public void setFreightForwarderParty(List<Party> freightForwarderParty) {
        this.freightForwarderParty = freightForwarderParty;
    }

    public Consignment withFreightForwarderParty(List<Party> freightForwarderParty) {
        this.freightForwarderParty = freightForwarderParty;
        return this;
    }

    /**
     * Consignment. Notify_ Party. Party
     * <p>
     * The party to be notified upon arrival of goods and when special occurrences (usually pre-defined) take place during a transportation service.
     * 
     */
    @JsonProperty("NotifyParty")
    public List<Party> getNotifyParty() {
        return notifyParty;
    }

    /**
     * Consignment. Notify_ Party. Party
     * <p>
     * The party to be notified upon arrival of goods and when special occurrences (usually pre-defined) take place during a transportation service.
     * 
     */
    @JsonProperty("NotifyParty")
    public void setNotifyParty(List<Party> notifyParty) {
        this.notifyParty = notifyParty;
    }

    public Consignment withNotifyParty(List<Party> notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }

    /**
     * Consignment. Original Despatch_ Party. Party
     * <p>
     * The original despatch (sender) party for this consignment.
     * 
     */
    @JsonProperty("OriginalDespatchParty")
    public List<Party> getOriginalDespatchParty() {
        return originalDespatchParty;
    }

    /**
     * Consignment. Original Despatch_ Party. Party
     * <p>
     * The original despatch (sender) party for this consignment.
     * 
     */
    @JsonProperty("OriginalDespatchParty")
    public void setOriginalDespatchParty(List<Party> originalDespatchParty) {
        this.originalDespatchParty = originalDespatchParty;
    }

    public Consignment withOriginalDespatchParty(List<Party> originalDespatchParty) {
        this.originalDespatchParty = originalDespatchParty;
        return this;
    }

    /**
     * Consignment. Final Delivery_ Party. Party
     * <p>
     * The final delivery party for this consignment.
     * 
     */
    @JsonProperty("FinalDeliveryParty")
    public List<Party> getFinalDeliveryParty() {
        return finalDeliveryParty;
    }

    /**
     * Consignment. Final Delivery_ Party. Party
     * <p>
     * The final delivery party for this consignment.
     * 
     */
    @JsonProperty("FinalDeliveryParty")
    public void setFinalDeliveryParty(List<Party> finalDeliveryParty) {
        this.finalDeliveryParty = finalDeliveryParty;
    }

    public Consignment withFinalDeliveryParty(List<Party> finalDeliveryParty) {
        this.finalDeliveryParty = finalDeliveryParty;
        return this;
    }

    /**
     * Consignment. Performing Carrier_ Party. Party
     * <p>
     * The party performing the carriage of this consignment.
     * 
     */
    @JsonProperty("PerformingCarrierParty")
    public List<Party> getPerformingCarrierParty() {
        return performingCarrierParty;
    }

    /**
     * Consignment. Performing Carrier_ Party. Party
     * <p>
     * The party performing the carriage of this consignment.
     * 
     */
    @JsonProperty("PerformingCarrierParty")
    public void setPerformingCarrierParty(List<Party> performingCarrierParty) {
        this.performingCarrierParty = performingCarrierParty;
    }

    public Consignment withPerformingCarrierParty(List<Party> performingCarrierParty) {
        this.performingCarrierParty = performingCarrierParty;
        return this;
    }

    /**
     * Consignment. Substitute Carrier_ Party. Party
     * <p>
     * A substitute party performing the carriage of this consignment.
     * 
     */
    @JsonProperty("SubstituteCarrierParty")
    public List<Party> getSubstituteCarrierParty() {
        return substituteCarrierParty;
    }

    /**
     * Consignment. Substitute Carrier_ Party. Party
     * <p>
     * A substitute party performing the carriage of this consignment.
     * 
     */
    @JsonProperty("SubstituteCarrierParty")
    public void setSubstituteCarrierParty(List<Party> substituteCarrierParty) {
        this.substituteCarrierParty = substituteCarrierParty;
    }

    public Consignment withSubstituteCarrierParty(List<Party> substituteCarrierParty) {
        this.substituteCarrierParty = substituteCarrierParty;
        return this;
    }

    /**
     * Consignment. Logistics Operator_ Party. Party
     * <p>
     * The logistics operator party for this consignment.
     * 
     */
    @JsonProperty("LogisticsOperatorParty")
    public List<Party> getLogisticsOperatorParty() {
        return logisticsOperatorParty;
    }

    /**
     * Consignment. Logistics Operator_ Party. Party
     * <p>
     * The logistics operator party for this consignment.
     * 
     */
    @JsonProperty("LogisticsOperatorParty")
    public void setLogisticsOperatorParty(List<Party> logisticsOperatorParty) {
        this.logisticsOperatorParty = logisticsOperatorParty;
    }

    public Consignment withLogisticsOperatorParty(List<Party> logisticsOperatorParty) {
        this.logisticsOperatorParty = logisticsOperatorParty;
        return this;
    }

    /**
     * Consignment. Transport Advisor_ Party. Party
     * <p>
     * The party providing transport advice this consignment.
     * 
     */
    @JsonProperty("TransportAdvisorParty")
    public List<Party> getTransportAdvisorParty() {
        return transportAdvisorParty;
    }

    /**
     * Consignment. Transport Advisor_ Party. Party
     * <p>
     * The party providing transport advice this consignment.
     * 
     */
    @JsonProperty("TransportAdvisorParty")
    public void setTransportAdvisorParty(List<Party> transportAdvisorParty) {
        this.transportAdvisorParty = transportAdvisorParty;
    }

    public Consignment withTransportAdvisorParty(List<Party> transportAdvisorParty) {
        this.transportAdvisorParty = transportAdvisorParty;
        return this;
    }

    /**
     * Consignment. Hazardous Item Notification_ Party. Party
     * <p>
     * The party that would be notified of a hazardous item in this consignment.
     * 
     */
    @JsonProperty("HazardousItemNotificationParty")
    public List<Party> getHazardousItemNotificationParty() {
        return hazardousItemNotificationParty;
    }

    /**
     * Consignment. Hazardous Item Notification_ Party. Party
     * <p>
     * The party that would be notified of a hazardous item in this consignment.
     * 
     */
    @JsonProperty("HazardousItemNotificationParty")
    public void setHazardousItemNotificationParty(List<Party> hazardousItemNotificationParty) {
        this.hazardousItemNotificationParty = hazardousItemNotificationParty;
    }

    public Consignment withHazardousItemNotificationParty(List<Party> hazardousItemNotificationParty) {
        this.hazardousItemNotificationParty = hazardousItemNotificationParty;
        return this;
    }

    /**
     * Consignment. Insurance_ Party. Party
     * <p>
     * The party holding the insurance for this consignment.
     * 
     */
    @JsonProperty("InsuranceParty")
    public List<Party> getInsuranceParty() {
        return insuranceParty;
    }

    /**
     * Consignment. Insurance_ Party. Party
     * <p>
     * The party holding the insurance for this consignment.
     * 
     */
    @JsonProperty("InsuranceParty")
    public void setInsuranceParty(List<Party> insuranceParty) {
        this.insuranceParty = insuranceParty;
    }

    public Consignment withInsuranceParty(List<Party> insuranceParty) {
        this.insuranceParty = insuranceParty;
        return this;
    }

    /**
     * Consignment. Mortgage Holder_ Party. Party
     * <p>
     * The party holding the mortgage for this consignment.
     * 
     */
    @JsonProperty("MortgageHolderParty")
    public List<Party> getMortgageHolderParty() {
        return mortgageHolderParty;
    }

    /**
     * Consignment. Mortgage Holder_ Party. Party
     * <p>
     * The party holding the mortgage for this consignment.
     * 
     */
    @JsonProperty("MortgageHolderParty")
    public void setMortgageHolderParty(List<Party> mortgageHolderParty) {
        this.mortgageHolderParty = mortgageHolderParty;
    }

    public Consignment withMortgageHolderParty(List<Party> mortgageHolderParty) {
        this.mortgageHolderParty = mortgageHolderParty;
        return this;
    }

    /**
     * Consignment. Bill Of Lading Holder_ Party. Party
     * <p>
     * The party holding the bill of lading for this consignment.
     * 
     */
    @JsonProperty("BillOfLadingHolderParty")
    public List<Party> getBillOfLadingHolderParty() {
        return billOfLadingHolderParty;
    }

    /**
     * Consignment. Bill Of Lading Holder_ Party. Party
     * <p>
     * The party holding the bill of lading for this consignment.
     * 
     */
    @JsonProperty("BillOfLadingHolderParty")
    public void setBillOfLadingHolderParty(List<Party> billOfLadingHolderParty) {
        this.billOfLadingHolderParty = billOfLadingHolderParty;
    }

    public Consignment withBillOfLadingHolderParty(List<Party> billOfLadingHolderParty) {
        this.billOfLadingHolderParty = billOfLadingHolderParty;
        return this;
    }

    /**
     * Consignment. Original Departure_ Country. Country
     * <p>
     * The country from which the goods in this consignment were originally exported, without any commercial transaction taking place in intermediate countries.
     * 
     */
    @JsonProperty("OriginalDepartureCountry")
    public List<Country> getOriginalDepartureCountry() {
        return originalDepartureCountry;
    }

    /**
     * Consignment. Original Departure_ Country. Country
     * <p>
     * The country from which the goods in this consignment were originally exported, without any commercial transaction taking place in intermediate countries.
     * 
     */
    @JsonProperty("OriginalDepartureCountry")
    public void setOriginalDepartureCountry(List<Country> originalDepartureCountry) {
        this.originalDepartureCountry = originalDepartureCountry;
    }

    public Consignment withOriginalDepartureCountry(List<Country> originalDepartureCountry) {
        this.originalDepartureCountry = originalDepartureCountry;
        return this;
    }

    /**
     * Consignment. Final Destination_ Country. Country
     * <p>
     * The country in which the goods in this consignment are to be delivered to the final consignee or buyer.
     * 
     */
    @JsonProperty("FinalDestinationCountry")
    public List<Country> getFinalDestinationCountry() {
        return finalDestinationCountry;
    }

    /**
     * Consignment. Final Destination_ Country. Country
     * <p>
     * The country in which the goods in this consignment are to be delivered to the final consignee or buyer.
     * 
     */
    @JsonProperty("FinalDestinationCountry")
    public void setFinalDestinationCountry(List<Country> finalDestinationCountry) {
        this.finalDestinationCountry = finalDestinationCountry;
    }

    public Consignment withFinalDestinationCountry(List<Country> finalDestinationCountry) {
        this.finalDestinationCountry = finalDestinationCountry;
        return this;
    }

    /**
     * Consignment. Transit_ Country. Country
     * <p>
     * One of the countries through which goods or passengers in this consignment are routed between the country of original departure and the country of final destination.
     * 
     */
    @JsonProperty("TransitCountry")
    public List<Country> getTransitCountry() {
        return transitCountry;
    }

    /**
     * Consignment. Transit_ Country. Country
     * <p>
     * One of the countries through which goods or passengers in this consignment are routed between the country of original departure and the country of final destination.
     * 
     */
    @JsonProperty("TransitCountry")
    public void setTransitCountry(List<Country> transitCountry) {
        this.transitCountry = transitCountry;
    }

    public Consignment withTransitCountry(List<Country> transitCountry) {
        this.transitCountry = transitCountry;
        return this;
    }

    /**
     * Consignment. Transport_ Contract. Contract
     * <p>
     * A transport contract relating to this consignment.
     * 
     */
    @JsonProperty("TransportContract")
    public List<Contract> getTransportContract() {
        return transportContract;
    }

    /**
     * Consignment. Transport_ Contract. Contract
     * <p>
     * A transport contract relating to this consignment.
     * 
     */
    @JsonProperty("TransportContract")
    public void setTransportContract(List<Contract> transportContract) {
        this.transportContract = transportContract;
    }

    public Consignment withTransportContract(List<Contract> transportContract) {
        this.transportContract = transportContract;
        return this;
    }

    /**
     * Consignment. Transport Event
     * <p>
     * A class describing a significant occurrence or happening related to the transportation of goods.
     * 
     */
    @JsonProperty("TransportEvent")
    public List<TransportEvent> getTransportEvent() {
        return transportEvent;
    }

    /**
     * Consignment. Transport Event
     * <p>
     * A class describing a significant occurrence or happening related to the transportation of goods.
     * 
     */
    @JsonProperty("TransportEvent")
    public void setTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
    }

    public Consignment withTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
        return this;
    }

    /**
     * Consignment. Original Despatch_ Transportation Service. Transportation Service
     * <p>
     * The service for pickup from the consignor under the transport contract for this consignment.
     * 
     */
    @JsonProperty("OriginalDespatchTransportationService")
    public List<TransportationService> getOriginalDespatchTransportationService() {
        return originalDespatchTransportationService;
    }

    /**
     * Consignment. Original Despatch_ Transportation Service. Transportation Service
     * <p>
     * The service for pickup from the consignor under the transport contract for this consignment.
     * 
     */
    @JsonProperty("OriginalDespatchTransportationService")
    public void setOriginalDespatchTransportationService(List<TransportationService> originalDespatchTransportationService) {
        this.originalDespatchTransportationService = originalDespatchTransportationService;
    }

    public Consignment withOriginalDespatchTransportationService(List<TransportationService> originalDespatchTransportationService) {
        this.originalDespatchTransportationService = originalDespatchTransportationService;
        return this;
    }

    /**
     * Consignment. Final Delivery_ Transportation Service. Transportation Service
     * <p>
     * The service for delivery to the consignee under the transport contract for this consignment.
     * 
     */
    @JsonProperty("FinalDeliveryTransportationService")
    public List<TransportationService> getFinalDeliveryTransportationService() {
        return finalDeliveryTransportationService;
    }

    /**
     * Consignment. Final Delivery_ Transportation Service. Transportation Service
     * <p>
     * The service for delivery to the consignee under the transport contract for this consignment.
     * 
     */
    @JsonProperty("FinalDeliveryTransportationService")
    public void setFinalDeliveryTransportationService(List<TransportationService> finalDeliveryTransportationService) {
        this.finalDeliveryTransportationService = finalDeliveryTransportationService;
    }

    public Consignment withFinalDeliveryTransportationService(List<TransportationService> finalDeliveryTransportationService) {
        this.finalDeliveryTransportationService = finalDeliveryTransportationService;
        return this;
    }

    /**
     * Consignment. Delivery Terms
     * <p>
     * The conditions agreed upon between a seller and a buyer with regard to the delivery of goods and/or services (e.g., CIF, FOB, or EXW from the INCOTERMS Terms of Delivery).
     * 
     */
    @JsonProperty("DeliveryTerms")
    public List<DeliveryTerms> getDeliveryTerms() {
        return deliveryTerms;
    }

    /**
     * Consignment. Delivery Terms
     * <p>
     * The conditions agreed upon between a seller and a buyer with regard to the delivery of goods and/or services (e.g., CIF, FOB, or EXW from the INCOTERMS Terms of Delivery).
     * 
     */
    @JsonProperty("DeliveryTerms")
    public void setDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    public Consignment withDeliveryTerms(List<DeliveryTerms> deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }

    /**
     * Consignment. Payment Terms
     * <p>
     * The terms of payment between the parties (such as logistics service client, logistics service provider) in a transaction.
     * 
     */
    @JsonProperty("PaymentTerms")
    public List<PaymentTerms> getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Consignment. Payment Terms
     * <p>
     * The terms of payment between the parties (such as logistics service client, logistics service provider) in a transaction.
     * 
     */
    @JsonProperty("PaymentTerms")
    public void setPaymentTerms(List<PaymentTerms> paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public Consignment withPaymentTerms(List<PaymentTerms> paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }

    /**
     * Consignment. Collect_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment that apply to the collection of this consignment.
     * 
     */
    @JsonProperty("CollectPaymentTerms")
    public List<PaymentTerms> getCollectPaymentTerms() {
        return collectPaymentTerms;
    }

    /**
     * Consignment. Collect_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment that apply to the collection of this consignment.
     * 
     */
    @JsonProperty("CollectPaymentTerms")
    public void setCollectPaymentTerms(List<PaymentTerms> collectPaymentTerms) {
        this.collectPaymentTerms = collectPaymentTerms;
    }

    public Consignment withCollectPaymentTerms(List<PaymentTerms> collectPaymentTerms) {
        this.collectPaymentTerms = collectPaymentTerms;
        return this;
    }

    /**
     * Consignment. Disbursement_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment for disbursement.
     * 
     */
    @JsonProperty("DisbursementPaymentTerms")
    public List<PaymentTerms> getDisbursementPaymentTerms() {
        return disbursementPaymentTerms;
    }

    /**
     * Consignment. Disbursement_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment for disbursement.
     * 
     */
    @JsonProperty("DisbursementPaymentTerms")
    public void setDisbursementPaymentTerms(List<PaymentTerms> disbursementPaymentTerms) {
        this.disbursementPaymentTerms = disbursementPaymentTerms;
    }

    public Consignment withDisbursementPaymentTerms(List<PaymentTerms> disbursementPaymentTerms) {
        this.disbursementPaymentTerms = disbursementPaymentTerms;
        return this;
    }

    /**
     * Consignment. Prepaid_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment for prepayment.
     * 
     */
    @JsonProperty("PrepaidPaymentTerms")
    public List<PaymentTerms> getPrepaidPaymentTerms() {
        return prepaidPaymentTerms;
    }

    /**
     * Consignment. Prepaid_ Payment Terms. Payment Terms
     * <p>
     * The terms of payment for prepayment.
     * 
     */
    @JsonProperty("PrepaidPaymentTerms")
    public void setPrepaidPaymentTerms(List<PaymentTerms> prepaidPaymentTerms) {
        this.prepaidPaymentTerms = prepaidPaymentTerms;
    }

    public Consignment withPrepaidPaymentTerms(List<PaymentTerms> prepaidPaymentTerms) {
        this.prepaidPaymentTerms = prepaidPaymentTerms;
        return this;
    }

    /**
     * Consignment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage for this consignment. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public List<AllowanceCharge> getFreightAllowanceCharge() {
        return freightAllowanceCharge;
    }

    /**
     * Consignment. Freight_ Allowance Charge. Allowance Charge
     * <p>
     * A cost incurred by the shipper in moving goods, by whatever means, from one place to another under the terms of the contract of carriage for this consignment. In addition to transport costs, this may include such elements as packing, documentation, loading, unloading, and insurance to the extent that they relate to the freight costs.
     * 
     */
    @JsonProperty("FreightAllowanceCharge")
    public void setFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
    }

    public Consignment withFreightAllowanceCharge(List<AllowanceCharge> freightAllowanceCharge) {
        this.freightAllowanceCharge = freightAllowanceCharge;
        return this;
    }

    /**
     * Consignment. Extra_ Allowance Charge. Allowance Charge
     * <p>
     * A charge for extra allowance.
     * 
     */
    @JsonProperty("ExtraAllowanceCharge")
    public List<AllowanceCharge> getExtraAllowanceCharge() {
        return extraAllowanceCharge;
    }

    /**
     * Consignment. Extra_ Allowance Charge. Allowance Charge
     * <p>
     * A charge for extra allowance.
     * 
     */
    @JsonProperty("ExtraAllowanceCharge")
    public void setExtraAllowanceCharge(List<AllowanceCharge> extraAllowanceCharge) {
        this.extraAllowanceCharge = extraAllowanceCharge;
    }

    public Consignment withExtraAllowanceCharge(List<AllowanceCharge> extraAllowanceCharge) {
        this.extraAllowanceCharge = extraAllowanceCharge;
        return this;
    }

    /**
     * Consignment. Main Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during main carriage.
     * 
     */
    @JsonProperty("MainCarriageShipmentStage")
    public List<ShipmentStage> getMainCarriageShipmentStage() {
        return mainCarriageShipmentStage;
    }

    /**
     * Consignment. Main Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during main carriage.
     * 
     */
    @JsonProperty("MainCarriageShipmentStage")
    public void setMainCarriageShipmentStage(List<ShipmentStage> mainCarriageShipmentStage) {
        this.mainCarriageShipmentStage = mainCarriageShipmentStage;
    }

    public Consignment withMainCarriageShipmentStage(List<ShipmentStage> mainCarriageShipmentStage) {
        this.mainCarriageShipmentStage = mainCarriageShipmentStage;
        return this;
    }

    /**
     * Consignment. Pre Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during precarriage (usually refers to movement activity that takes place prior to the container being loaded at a port of loading).
     * 
     */
    @JsonProperty("PreCarriageShipmentStage")
    public List<ShipmentStage> getPreCarriageShipmentStage() {
        return preCarriageShipmentStage;
    }

    /**
     * Consignment. Pre Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during precarriage (usually refers to movement activity that takes place prior to the container being loaded at a port of loading).
     * 
     */
    @JsonProperty("PreCarriageShipmentStage")
    public void setPreCarriageShipmentStage(List<ShipmentStage> preCarriageShipmentStage) {
        this.preCarriageShipmentStage = preCarriageShipmentStage;
    }

    public Consignment withPreCarriageShipmentStage(List<ShipmentStage> preCarriageShipmentStage) {
        this.preCarriageShipmentStage = preCarriageShipmentStage;
        return this;
    }

    /**
     * Consignment. On Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during on-carriage (usually refers to movement activity that takes place after the container is discharged at a port of discharge).
     * 
     */
    @JsonProperty("OnCarriageShipmentStage")
    public List<ShipmentStage> getOnCarriageShipmentStage() {
        return onCarriageShipmentStage;
    }

    /**
     * Consignment. On Carriage_ Shipment Stage. Shipment Stage
     * <p>
     * A shipment stage during on-carriage (usually refers to movement activity that takes place after the container is discharged at a port of discharge).
     * 
     */
    @JsonProperty("OnCarriageShipmentStage")
    public void setOnCarriageShipmentStage(List<ShipmentStage> onCarriageShipmentStage) {
        this.onCarriageShipmentStage = onCarriageShipmentStage;
    }

    public Consignment withOnCarriageShipmentStage(List<ShipmentStage> onCarriageShipmentStage) {
        this.onCarriageShipmentStage = onCarriageShipmentStage;
        return this;
    }

    /**
     * Consignment. Transport Handling Unit
     * <p>
     * A transport handling unit used for loose and containerized goods.
     * 
     */
    @JsonProperty("TransportHandlingUnit")
    public List<TransportHandlingUnit> getTransportHandlingUnit() {
        return transportHandlingUnit;
    }

    /**
     * Consignment. Transport Handling Unit
     * <p>
     * A transport handling unit used for loose and containerized goods.
     * 
     */
    @JsonProperty("TransportHandlingUnit")
    public void setTransportHandlingUnit(List<TransportHandlingUnit> transportHandlingUnit) {
        this.transportHandlingUnit = transportHandlingUnit;
    }

    public Consignment withTransportHandlingUnit(List<TransportHandlingUnit> transportHandlingUnit) {
        this.transportHandlingUnit = transportHandlingUnit;
        return this;
    }

    /**
     * Consignment. First Arrival Port_ Location. Location
     * <p>
     * The first arrival location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("FirstArrivalPortLocation")
    public List<Location> getFirstArrivalPortLocation() {
        return firstArrivalPortLocation;
    }

    /**
     * Consignment. First Arrival Port_ Location. Location
     * <p>
     * The first arrival location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("FirstArrivalPortLocation")
    public void setFirstArrivalPortLocation(List<Location> firstArrivalPortLocation) {
        this.firstArrivalPortLocation = firstArrivalPortLocation;
    }

    public Consignment withFirstArrivalPortLocation(List<Location> firstArrivalPortLocation) {
        this.firstArrivalPortLocation = firstArrivalPortLocation;
        return this;
    }

    /**
     * Consignment. Last Exit Port_ Location. Location
     * <p>
     * The final exporting location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("LastExitPortLocation")
    public List<Location> getLastExitPortLocation() {
        return lastExitPortLocation;
    }

    /**
     * Consignment. Last Exit Port_ Location. Location
     * <p>
     * The final exporting location in a transport. This would be a port for sea, an airport for air, a terminal for rail, or a border post for land crossing.
     * 
     */
    @JsonProperty("LastExitPortLocation")
    public void setLastExitPortLocation(List<Location> lastExitPortLocation) {
        this.lastExitPortLocation = lastExitPortLocation;
    }

    public Consignment withLastExitPortLocation(List<Location> lastExitPortLocation) {
        this.lastExitPortLocation = lastExitPortLocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Consignment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("carrierAssignedID");
        sb.append('=');
        sb.append(((this.carrierAssignedID == null)?"<null>":this.carrierAssignedID));
        sb.append(',');
        sb.append("consigneeAssignedID");
        sb.append('=');
        sb.append(((this.consigneeAssignedID == null)?"<null>":this.consigneeAssignedID));
        sb.append(',');
        sb.append("consignorAssignedID");
        sb.append('=');
        sb.append(((this.consignorAssignedID == null)?"<null>":this.consignorAssignedID));
        sb.append(',');
        sb.append("freightForwarderAssignedID");
        sb.append('=');
        sb.append(((this.freightForwarderAssignedID == null)?"<null>":this.freightForwarderAssignedID));
        sb.append(',');
        sb.append("brokerAssignedID");
        sb.append('=');
        sb.append(((this.brokerAssignedID == null)?"<null>":this.brokerAssignedID));
        sb.append(',');
        sb.append("contractedCarrierAssignedID");
        sb.append('=');
        sb.append(((this.contractedCarrierAssignedID == null)?"<null>":this.contractedCarrierAssignedID));
        sb.append(',');
        sb.append("performingCarrierAssignedID");
        sb.append('=');
        sb.append(((this.performingCarrierAssignedID == null)?"<null>":this.performingCarrierAssignedID));
        sb.append(',');
        sb.append("summaryDescription");
        sb.append('=');
        sb.append(((this.summaryDescription == null)?"<null>":this.summaryDescription));
        sb.append(',');
        sb.append("totalInvoiceAmount");
        sb.append('=');
        sb.append(((this.totalInvoiceAmount == null)?"<null>":this.totalInvoiceAmount));
        sb.append(',');
        sb.append("declaredCustomsValueAmount");
        sb.append('=');
        sb.append(((this.declaredCustomsValueAmount == null)?"<null>":this.declaredCustomsValueAmount));
        sb.append(',');
        sb.append("tariffDescription");
        sb.append('=');
        sb.append(((this.tariffDescription == null)?"<null>":this.tariffDescription));
        sb.append(',');
        sb.append("tariffCode");
        sb.append('=');
        sb.append(((this.tariffCode == null)?"<null>":this.tariffCode));
        sb.append(',');
        sb.append("insurancePremiumAmount");
        sb.append('=');
        sb.append(((this.insurancePremiumAmount == null)?"<null>":this.insurancePremiumAmount));
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
        sb.append("loadingLengthMeasure");
        sb.append('=');
        sb.append(((this.loadingLengthMeasure == null)?"<null>":this.loadingLengthMeasure));
        sb.append(',');
        sb.append("remarks");
        sb.append('=');
        sb.append(((this.remarks == null)?"<null>":this.remarks));
        sb.append(',');
        sb.append("hazardousRiskIndicator");
        sb.append('=');
        sb.append(((this.hazardousRiskIndicator == null)?"<null>":this.hazardousRiskIndicator));
        sb.append(',');
        sb.append("animalFoodIndicator");
        sb.append('=');
        sb.append(((this.animalFoodIndicator == null)?"<null>":this.animalFoodIndicator));
        sb.append(',');
        sb.append("humanFoodIndicator");
        sb.append('=');
        sb.append(((this.humanFoodIndicator == null)?"<null>":this.humanFoodIndicator));
        sb.append(',');
        sb.append("livestockIndicator");
        sb.append('=');
        sb.append(((this.livestockIndicator == null)?"<null>":this.livestockIndicator));
        sb.append(',');
        sb.append("bulkCargoIndicator");
        sb.append('=');
        sb.append(((this.bulkCargoIndicator == null)?"<null>":this.bulkCargoIndicator));
        sb.append(',');
        sb.append("containerizedIndicator");
        sb.append('=');
        sb.append(((this.containerizedIndicator == null)?"<null>":this.containerizedIndicator));
        sb.append(',');
        sb.append("generalCargoIndicator");
        sb.append('=');
        sb.append(((this.generalCargoIndicator == null)?"<null>":this.generalCargoIndicator));
        sb.append(',');
        sb.append("specialSecurityIndicator");
        sb.append('=');
        sb.append(((this.specialSecurityIndicator == null)?"<null>":this.specialSecurityIndicator));
        sb.append(',');
        sb.append("thirdPartyPayerIndicator");
        sb.append('=');
        sb.append(((this.thirdPartyPayerIndicator == null)?"<null>":this.thirdPartyPayerIndicator));
        sb.append(',');
        sb.append("carrierServiceInstructions");
        sb.append('=');
        sb.append(((this.carrierServiceInstructions == null)?"<null>":this.carrierServiceInstructions));
        sb.append(',');
        sb.append("customsClearanceServiceInstructions");
        sb.append('=');
        sb.append(((this.customsClearanceServiceInstructions == null)?"<null>":this.customsClearanceServiceInstructions));
        sb.append(',');
        sb.append("forwarderServiceInstructions");
        sb.append('=');
        sb.append(((this.forwarderServiceInstructions == null)?"<null>":this.forwarderServiceInstructions));
        sb.append(',');
        sb.append("specialServiceInstructions");
        sb.append('=');
        sb.append(((this.specialServiceInstructions == null)?"<null>":this.specialServiceInstructions));
        sb.append(',');
        sb.append("sequenceID");
        sb.append('=');
        sb.append(((this.sequenceID == null)?"<null>":this.sequenceID));
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
        sb.append("splitConsignmentIndicator");
        sb.append('=');
        sb.append(((this.splitConsignmentIndicator == null)?"<null>":this.splitConsignmentIndicator));
        sb.append(',');
        sb.append("deliveryInstructions");
        sb.append('=');
        sb.append(((this.deliveryInstructions == null)?"<null>":this.deliveryInstructions));
        sb.append(',');
        sb.append("consignmentQuantity");
        sb.append('=');
        sb.append(((this.consignmentQuantity == null)?"<null>":this.consignmentQuantity));
        sb.append(',');
        sb.append("consolidatableIndicator");
        sb.append('=');
        sb.append(((this.consolidatableIndicator == null)?"<null>":this.consolidatableIndicator));
        sb.append(',');
        sb.append("haulageInstructions");
        sb.append('=');
        sb.append(((this.haulageInstructions == null)?"<null>":this.haulageInstructions));
        sb.append(',');
        sb.append("loadingSequenceID");
        sb.append('=');
        sb.append(((this.loadingSequenceID == null)?"<null>":this.loadingSequenceID));
        sb.append(',');
        sb.append("childConsignmentQuantity");
        sb.append('=');
        sb.append(((this.childConsignmentQuantity == null)?"<null>":this.childConsignmentQuantity));
        sb.append(',');
        sb.append("totalPackagesQuantity");
        sb.append('=');
        sb.append(((this.totalPackagesQuantity == null)?"<null>":this.totalPackagesQuantity));
        sb.append(',');
        sb.append("consolidatedShipment");
        sb.append('=');
        sb.append(((this.consolidatedShipment == null)?"<null>":this.consolidatedShipment));
        sb.append(',');
        sb.append("customsDeclaration");
        sb.append('=');
        sb.append(((this.customsDeclaration == null)?"<null>":this.customsDeclaration));
        sb.append(',');
        sb.append("requestedPickupTransportEvent");
        sb.append('=');
        sb.append(((this.requestedPickupTransportEvent == null)?"<null>":this.requestedPickupTransportEvent));
        sb.append(',');
        sb.append("requestedDeliveryTransportEvent");
        sb.append('=');
        sb.append(((this.requestedDeliveryTransportEvent == null)?"<null>":this.requestedDeliveryTransportEvent));
        sb.append(',');
        sb.append("plannedPickupTransportEvent");
        sb.append('=');
        sb.append(((this.plannedPickupTransportEvent == null)?"<null>":this.plannedPickupTransportEvent));
        sb.append(',');
        sb.append("plannedDeliveryTransportEvent");
        sb.append('=');
        sb.append(((this.plannedDeliveryTransportEvent == null)?"<null>":this.plannedDeliveryTransportEvent));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("childConsignment");
        sb.append('=');
        sb.append(((this.childConsignment == null)?"<null>":this.childConsignment));
        sb.append(',');
        sb.append("consigneeParty");
        sb.append('=');
        sb.append(((this.consigneeParty == null)?"<null>":this.consigneeParty));
        sb.append(',');
        sb.append("exporterParty");
        sb.append('=');
        sb.append(((this.exporterParty == null)?"<null>":this.exporterParty));
        sb.append(',');
        sb.append("consignorParty");
        sb.append('=');
        sb.append(((this.consignorParty == null)?"<null>":this.consignorParty));
        sb.append(',');
        sb.append("importerParty");
        sb.append('=');
        sb.append(((this.importerParty == null)?"<null>":this.importerParty));
        sb.append(',');
        sb.append("carrierParty");
        sb.append('=');
        sb.append(((this.carrierParty == null)?"<null>":this.carrierParty));
        sb.append(',');
        sb.append("freightForwarderParty");
        sb.append('=');
        sb.append(((this.freightForwarderParty == null)?"<null>":this.freightForwarderParty));
        sb.append(',');
        sb.append("notifyParty");
        sb.append('=');
        sb.append(((this.notifyParty == null)?"<null>":this.notifyParty));
        sb.append(',');
        sb.append("originalDespatchParty");
        sb.append('=');
        sb.append(((this.originalDespatchParty == null)?"<null>":this.originalDespatchParty));
        sb.append(',');
        sb.append("finalDeliveryParty");
        sb.append('=');
        sb.append(((this.finalDeliveryParty == null)?"<null>":this.finalDeliveryParty));
        sb.append(',');
        sb.append("performingCarrierParty");
        sb.append('=');
        sb.append(((this.performingCarrierParty == null)?"<null>":this.performingCarrierParty));
        sb.append(',');
        sb.append("substituteCarrierParty");
        sb.append('=');
        sb.append(((this.substituteCarrierParty == null)?"<null>":this.substituteCarrierParty));
        sb.append(',');
        sb.append("logisticsOperatorParty");
        sb.append('=');
        sb.append(((this.logisticsOperatorParty == null)?"<null>":this.logisticsOperatorParty));
        sb.append(',');
        sb.append("transportAdvisorParty");
        sb.append('=');
        sb.append(((this.transportAdvisorParty == null)?"<null>":this.transportAdvisorParty));
        sb.append(',');
        sb.append("hazardousItemNotificationParty");
        sb.append('=');
        sb.append(((this.hazardousItemNotificationParty == null)?"<null>":this.hazardousItemNotificationParty));
        sb.append(',');
        sb.append("insuranceParty");
        sb.append('=');
        sb.append(((this.insuranceParty == null)?"<null>":this.insuranceParty));
        sb.append(',');
        sb.append("mortgageHolderParty");
        sb.append('=');
        sb.append(((this.mortgageHolderParty == null)?"<null>":this.mortgageHolderParty));
        sb.append(',');
        sb.append("billOfLadingHolderParty");
        sb.append('=');
        sb.append(((this.billOfLadingHolderParty == null)?"<null>":this.billOfLadingHolderParty));
        sb.append(',');
        sb.append("originalDepartureCountry");
        sb.append('=');
        sb.append(((this.originalDepartureCountry == null)?"<null>":this.originalDepartureCountry));
        sb.append(',');
        sb.append("finalDestinationCountry");
        sb.append('=');
        sb.append(((this.finalDestinationCountry == null)?"<null>":this.finalDestinationCountry));
        sb.append(',');
        sb.append("transitCountry");
        sb.append('=');
        sb.append(((this.transitCountry == null)?"<null>":this.transitCountry));
        sb.append(',');
        sb.append("transportContract");
        sb.append('=');
        sb.append(((this.transportContract == null)?"<null>":this.transportContract));
        sb.append(',');
        sb.append("transportEvent");
        sb.append('=');
        sb.append(((this.transportEvent == null)?"<null>":this.transportEvent));
        sb.append(',');
        sb.append("originalDespatchTransportationService");
        sb.append('=');
        sb.append(((this.originalDespatchTransportationService == null)?"<null>":this.originalDespatchTransportationService));
        sb.append(',');
        sb.append("finalDeliveryTransportationService");
        sb.append('=');
        sb.append(((this.finalDeliveryTransportationService == null)?"<null>":this.finalDeliveryTransportationService));
        sb.append(',');
        sb.append("deliveryTerms");
        sb.append('=');
        sb.append(((this.deliveryTerms == null)?"<null>":this.deliveryTerms));
        sb.append(',');
        sb.append("paymentTerms");
        sb.append('=');
        sb.append(((this.paymentTerms == null)?"<null>":this.paymentTerms));
        sb.append(',');
        sb.append("collectPaymentTerms");
        sb.append('=');
        sb.append(((this.collectPaymentTerms == null)?"<null>":this.collectPaymentTerms));
        sb.append(',');
        sb.append("disbursementPaymentTerms");
        sb.append('=');
        sb.append(((this.disbursementPaymentTerms == null)?"<null>":this.disbursementPaymentTerms));
        sb.append(',');
        sb.append("prepaidPaymentTerms");
        sb.append('=');
        sb.append(((this.prepaidPaymentTerms == null)?"<null>":this.prepaidPaymentTerms));
        sb.append(',');
        sb.append("freightAllowanceCharge");
        sb.append('=');
        sb.append(((this.freightAllowanceCharge == null)?"<null>":this.freightAllowanceCharge));
        sb.append(',');
        sb.append("extraAllowanceCharge");
        sb.append('=');
        sb.append(((this.extraAllowanceCharge == null)?"<null>":this.extraAllowanceCharge));
        sb.append(',');
        sb.append("mainCarriageShipmentStage");
        sb.append('=');
        sb.append(((this.mainCarriageShipmentStage == null)?"<null>":this.mainCarriageShipmentStage));
        sb.append(',');
        sb.append("preCarriageShipmentStage");
        sb.append('=');
        sb.append(((this.preCarriageShipmentStage == null)?"<null>":this.preCarriageShipmentStage));
        sb.append(',');
        sb.append("onCarriageShipmentStage");
        sb.append('=');
        sb.append(((this.onCarriageShipmentStage == null)?"<null>":this.onCarriageShipmentStage));
        sb.append(',');
        sb.append("transportHandlingUnit");
        sb.append('=');
        sb.append(((this.transportHandlingUnit == null)?"<null>":this.transportHandlingUnit));
        sb.append(',');
        sb.append("firstArrivalPortLocation");
        sb.append('=');
        sb.append(((this.firstArrivalPortLocation == null)?"<null>":this.firstArrivalPortLocation));
        sb.append(',');
        sb.append("lastExitPortLocation");
        sb.append('=');
        sb.append(((this.lastExitPortLocation == null)?"<null>":this.lastExitPortLocation));
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
        result = ((result* 31)+((this.bulkCargoIndicator == null)? 0 :this.bulkCargoIndicator.hashCode()));
        result = ((result* 31)+((this.humanFoodIndicator == null)? 0 :this.humanFoodIndicator.hashCode()));
        result = ((result* 31)+((this.thirdPartyPayerIndicator == null)? 0 :this.thirdPartyPayerIndicator.hashCode()));
        result = ((result* 31)+((this.contractedCarrierAssignedID == null)? 0 :this.contractedCarrierAssignedID.hashCode()));
        result = ((result* 31)+((this.performingCarrierAssignedID == null)? 0 :this.performingCarrierAssignedID.hashCode()));
        result = ((result* 31)+((this.declaredCustomsValueAmount == null)? 0 :this.declaredCustomsValueAmount.hashCode()));
        result = ((result* 31)+((this.carrierParty == null)? 0 :this.carrierParty.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.freightAllowanceCharge == null)? 0 :this.freightAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.onCarriageShipmentStage == null)? 0 :this.onCarriageShipmentStage.hashCode()));
        result = ((result* 31)+((this.splitConsignmentIndicator == null)? 0 :this.splitConsignmentIndicator.hashCode()));
        result = ((result* 31)+((this.consignmentQuantity == null)? 0 :this.consignmentQuantity.hashCode()));
        result = ((result* 31)+((this.loadingLengthMeasure == null)? 0 :this.loadingLengthMeasure.hashCode()));
        result = ((result* 31)+((this.lastExitPortLocation == null)? 0 :this.lastExitPortLocation.hashCode()));
        result = ((result* 31)+((this.loadingSequenceID == null)? 0 :this.loadingSequenceID.hashCode()));
        result = ((result* 31)+((this.transportHandlingUnit == null)? 0 :this.transportHandlingUnit.hashCode()));
        result = ((result* 31)+((this.specialServiceInstructions == null)? 0 :this.specialServiceInstructions.hashCode()));
        result = ((result* 31)+((this.requestedPickupTransportEvent == null)? 0 :this.requestedPickupTransportEvent.hashCode()));
        result = ((result* 31)+((this.disbursementPaymentTerms == null)? 0 :this.disbursementPaymentTerms.hashCode()));
        result = ((result* 31)+((this.performingCarrierParty == null)? 0 :this.performingCarrierParty.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.brokerAssignedID == null)? 0 :this.brokerAssignedID.hashCode()));
        result = ((result* 31)+((this.preCarriageShipmentStage == null)? 0 :this.preCarriageShipmentStage.hashCode()));
        result = ((result* 31)+((this.declaredForCarriageValueAmount == null)? 0 :this.declaredForCarriageValueAmount.hashCode()));
        result = ((result* 31)+((this.plannedDeliveryTransportEvent == null)? 0 :this.plannedDeliveryTransportEvent.hashCode()));
        result = ((result* 31)+((this.plannedPickupTransportEvent == null)? 0 :this.plannedPickupTransportEvent.hashCode()));
        result = ((result* 31)+((this.importerParty == null)? 0 :this.importerParty.hashCode()));
        result = ((result* 31)+((this.totalGoodsItemQuantity == null)? 0 :this.totalGoodsItemQuantity.hashCode()));
        result = ((result* 31)+((this.exporterParty == null)? 0 :this.exporterParty.hashCode()));
        result = ((result* 31)+((this.notifyParty == null)? 0 :this.notifyParty.hashCode()));
        result = ((result* 31)+((this.grossWeightMeasure == null)? 0 :this.grossWeightMeasure.hashCode()));
        result = ((result* 31)+((this.firstArrivalPortLocation == null)? 0 :this.firstArrivalPortLocation.hashCode()));
        result = ((result* 31)+((this.haulageInstructions == null)? 0 :this.haulageInstructions.hashCode()));
        result = ((result* 31)+((this.declaredStatisticsValueAmount == null)? 0 :this.declaredStatisticsValueAmount.hashCode()));
        result = ((result* 31)+((this.consignorAssignedID == null)? 0 :this.consignorAssignedID.hashCode()));
        result = ((result* 31)+((this.freightForwarderAssignedID == null)? 0 :this.freightForwarderAssignedID.hashCode()));
        result = ((result* 31)+((this.originalDepartureCountry == null)? 0 :this.originalDepartureCountry.hashCode()));
        result = ((result* 31)+((this.originalDespatchParty == null)? 0 :this.originalDespatchParty.hashCode()));
        result = ((result* 31)+((this.containerizedIndicator == null)? 0 :this.containerizedIndicator.hashCode()));
        result = ((result* 31)+((this.hazardousRiskIndicator == null)? 0 :this.hazardousRiskIndicator.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.forwarderServiceInstructions == null)? 0 :this.forwarderServiceInstructions.hashCode()));
        result = ((result* 31)+((this.handlingCode == null)? 0 :this.handlingCode.hashCode()));
        result = ((result* 31)+((this.billOfLadingHolderParty == null)? 0 :this.billOfLadingHolderParty.hashCode()));
        result = ((result* 31)+((this.information == null)? 0 :this.information.hashCode()));
        result = ((result* 31)+((this.mainCarriageShipmentStage == null)? 0 :this.mainCarriageShipmentStage.hashCode()));
        result = ((result* 31)+((this.childConsignment == null)? 0 :this.childConsignment.hashCode()));
        result = ((result* 31)+((this.tariffCode == null)? 0 :this.tariffCode.hashCode()));
        result = ((result* 31)+((this.chargeableWeightMeasure == null)? 0 :this.chargeableWeightMeasure.hashCode()));
        result = ((result* 31)+((this.transportEvent == null)? 0 :this.transportEvent.hashCode()));
        result = ((result* 31)+((this.freeOnBoardValueAmount == null)? 0 :this.freeOnBoardValueAmount.hashCode()));
        result = ((result* 31)+((this.consolidatableIndicator == null)? 0 :this.consolidatableIndicator.hashCode()));
        result = ((result* 31)+((this.consigneeAssignedID == null)? 0 :this.consigneeAssignedID.hashCode()));
        result = ((result* 31)+((this.carrierServiceInstructions == null)? 0 :this.carrierServiceInstructions.hashCode()));
        result = ((result* 31)+((this.carrierAssignedID == null)? 0 :this.carrierAssignedID.hashCode()));
        result = ((result* 31)+((this.consolidatedShipment == null)? 0 :this.consolidatedShipment.hashCode()));
        result = ((result* 31)+((this.transitCountry == null)? 0 :this.transitCountry.hashCode()));
        result = ((result* 31)+((this.netWeightMeasure == null)? 0 :this.netWeightMeasure.hashCode()));
        result = ((result* 31)+((this.prepaidPaymentTerms == null)? 0 :this.prepaidPaymentTerms.hashCode()));
        result = ((result* 31)+((this.totalInvoiceAmount == null)? 0 :this.totalInvoiceAmount.hashCode()));
        result = ((result* 31)+((this.paymentTerms == null)? 0 :this.paymentTerms.hashCode()));
        result = ((result* 31)+((this.insuranceValueAmount == null)? 0 :this.insuranceValueAmount.hashCode()));
        result = ((result* 31)+((this.consignorParty == null)? 0 :this.consignorParty.hashCode()));
        result = ((result* 31)+((this.sequenceID == null)? 0 :this.sequenceID.hashCode()));
        result = ((result* 31)+((this.deliveryInstructions == null)? 0 :this.deliveryInstructions.hashCode()));
        result = ((result* 31)+((this.netVolumeMeasure == null)? 0 :this.netVolumeMeasure.hashCode()));
        result = ((result* 31)+((this.livestockIndicator == null)? 0 :this.livestockIndicator.hashCode()));
        result = ((result* 31)+((this.transportAdvisorParty == null)? 0 :this.transportAdvisorParty.hashCode()));
        result = ((result* 31)+((this.customsDeclaration == null)? 0 :this.customsDeclaration.hashCode()));
        result = ((result* 31)+((this.transportContract == null)? 0 :this.transportContract.hashCode()));
        result = ((result* 31)+((this.extraAllowanceCharge == null)? 0 :this.extraAllowanceCharge.hashCode()));
        result = ((result* 31)+((this.tariffDescription == null)? 0 :this.tariffDescription.hashCode()));
        result = ((result* 31)+((this.finalDeliveryTransportationService == null)? 0 :this.finalDeliveryTransportationService.hashCode()));
        result = ((result* 31)+((this.logisticsOperatorParty == null)? 0 :this.logisticsOperatorParty.hashCode()));
        result = ((result* 31)+((this.mortgageHolderParty == null)? 0 :this.mortgageHolderParty.hashCode()));
        result = ((result* 31)+((this.animalFoodIndicator == null)? 0 :this.animalFoodIndicator.hashCode()));
        result = ((result* 31)+((this.specialSecurityIndicator == null)? 0 :this.specialSecurityIndicator.hashCode()));
        result = ((result* 31)+((this.totalTransportHandlingUnitQuantity == null)? 0 :this.totalTransportHandlingUnitQuantity.hashCode()));
        result = ((result* 31)+((this.totalPackagesQuantity == null)? 0 :this.totalPackagesQuantity.hashCode()));
        result = ((result* 31)+((this.consigneeParty == null)? 0 :this.consigneeParty.hashCode()));
        result = ((result* 31)+((this.requestedDeliveryTransportEvent == null)? 0 :this.requestedDeliveryTransportEvent.hashCode()));
        result = ((result* 31)+((this.netNetWeightMeasure == null)? 0 :this.netNetWeightMeasure.hashCode()));
        result = ((result* 31)+((this.finalDeliveryParty == null)? 0 :this.finalDeliveryParty.hashCode()));
        result = ((result* 31)+((this.freightForwarderParty == null)? 0 :this.freightForwarderParty.hashCode()));
        result = ((result* 31)+((this.summaryDescription == null)? 0 :this.summaryDescription.hashCode()));
        result = ((result* 31)+((this.insuranceParty == null)? 0 :this.insuranceParty.hashCode()));
        result = ((result* 31)+((this.hazardousItemNotificationParty == null)? 0 :this.hazardousItemNotificationParty.hashCode()));
        result = ((result* 31)+((this.deliveryTerms == null)? 0 :this.deliveryTerms.hashCode()));
        result = ((result* 31)+((this.childConsignmentQuantity == null)? 0 :this.childConsignmentQuantity.hashCode()));
        result = ((result* 31)+((this.shippingPriorityLevelCode == null)? 0 :this.shippingPriorityLevelCode.hashCode()));
        result = ((result* 31)+((this.finalDestinationCountry == null)? 0 :this.finalDestinationCountry.hashCode()));
        result = ((result* 31)+((this.customsClearanceServiceInstructions == null)? 0 :this.customsClearanceServiceInstructions.hashCode()));
        result = ((result* 31)+((this.originalDespatchTransportationService == null)? 0 :this.originalDespatchTransportationService.hashCode()));
        result = ((result* 31)+((this.generalCargoIndicator == null)? 0 :this.generalCargoIndicator.hashCode()));
        result = ((result* 31)+((this.specialInstructions == null)? 0 :this.specialInstructions.hashCode()));
        result = ((result* 31)+((this.insurancePremiumAmount == null)? 0 :this.insurancePremiumAmount.hashCode()));
        result = ((result* 31)+((this.substituteCarrierParty == null)? 0 :this.substituteCarrierParty.hashCode()));
        result = ((result* 31)+((this.collectPaymentTerms == null)? 0 :this.collectPaymentTerms.hashCode()));
        result = ((result* 31)+((this.remarks == null)? 0 :this.remarks.hashCode()));
        result = ((result* 31)+((this.handlingInstructions == null)? 0 :this.handlingInstructions.hashCode()));
        result = ((result* 31)+((this.grossVolumeMeasure == null)? 0 :this.grossVolumeMeasure.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Consignment) == false) {
            return false;
        }
        Consignment rhs = ((Consignment) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.bulkCargoIndicator == rhs.bulkCargoIndicator)||((this.bulkCargoIndicator!= null)&&this.bulkCargoIndicator.equals(rhs.bulkCargoIndicator)))&&((this.humanFoodIndicator == rhs.humanFoodIndicator)||((this.humanFoodIndicator!= null)&&this.humanFoodIndicator.equals(rhs.humanFoodIndicator))))&&((this.thirdPartyPayerIndicator == rhs.thirdPartyPayerIndicator)||((this.thirdPartyPayerIndicator!= null)&&this.thirdPartyPayerIndicator.equals(rhs.thirdPartyPayerIndicator))))&&((this.contractedCarrierAssignedID == rhs.contractedCarrierAssignedID)||((this.contractedCarrierAssignedID!= null)&&this.contractedCarrierAssignedID.equals(rhs.contractedCarrierAssignedID))))&&((this.performingCarrierAssignedID == rhs.performingCarrierAssignedID)||((this.performingCarrierAssignedID!= null)&&this.performingCarrierAssignedID.equals(rhs.performingCarrierAssignedID))))&&((this.declaredCustomsValueAmount == rhs.declaredCustomsValueAmount)||((this.declaredCustomsValueAmount!= null)&&this.declaredCustomsValueAmount.equals(rhs.declaredCustomsValueAmount))))&&((this.carrierParty == rhs.carrierParty)||((this.carrierParty!= null)&&this.carrierParty.equals(rhs.carrierParty))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.freightAllowanceCharge == rhs.freightAllowanceCharge)||((this.freightAllowanceCharge!= null)&&this.freightAllowanceCharge.equals(rhs.freightAllowanceCharge))))&&((this.onCarriageShipmentStage == rhs.onCarriageShipmentStage)||((this.onCarriageShipmentStage!= null)&&this.onCarriageShipmentStage.equals(rhs.onCarriageShipmentStage))))&&((this.splitConsignmentIndicator == rhs.splitConsignmentIndicator)||((this.splitConsignmentIndicator!= null)&&this.splitConsignmentIndicator.equals(rhs.splitConsignmentIndicator))))&&((this.consignmentQuantity == rhs.consignmentQuantity)||((this.consignmentQuantity!= null)&&this.consignmentQuantity.equals(rhs.consignmentQuantity))))&&((this.loadingLengthMeasure == rhs.loadingLengthMeasure)||((this.loadingLengthMeasure!= null)&&this.loadingLengthMeasure.equals(rhs.loadingLengthMeasure))))&&((this.lastExitPortLocation == rhs.lastExitPortLocation)||((this.lastExitPortLocation!= null)&&this.lastExitPortLocation.equals(rhs.lastExitPortLocation))))&&((this.loadingSequenceID == rhs.loadingSequenceID)||((this.loadingSequenceID!= null)&&this.loadingSequenceID.equals(rhs.loadingSequenceID))))&&((this.transportHandlingUnit == rhs.transportHandlingUnit)||((this.transportHandlingUnit!= null)&&this.transportHandlingUnit.equals(rhs.transportHandlingUnit))))&&((this.specialServiceInstructions == rhs.specialServiceInstructions)||((this.specialServiceInstructions!= null)&&this.specialServiceInstructions.equals(rhs.specialServiceInstructions))))&&((this.requestedPickupTransportEvent == rhs.requestedPickupTransportEvent)||((this.requestedPickupTransportEvent!= null)&&this.requestedPickupTransportEvent.equals(rhs.requestedPickupTransportEvent))))&&((this.disbursementPaymentTerms == rhs.disbursementPaymentTerms)||((this.disbursementPaymentTerms!= null)&&this.disbursementPaymentTerms.equals(rhs.disbursementPaymentTerms))))&&((this.performingCarrierParty == rhs.performingCarrierParty)||((this.performingCarrierParty!= null)&&this.performingCarrierParty.equals(rhs.performingCarrierParty))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.brokerAssignedID == rhs.brokerAssignedID)||((this.brokerAssignedID!= null)&&this.brokerAssignedID.equals(rhs.brokerAssignedID))))&&((this.preCarriageShipmentStage == rhs.preCarriageShipmentStage)||((this.preCarriageShipmentStage!= null)&&this.preCarriageShipmentStage.equals(rhs.preCarriageShipmentStage))))&&((this.declaredForCarriageValueAmount == rhs.declaredForCarriageValueAmount)||((this.declaredForCarriageValueAmount!= null)&&this.declaredForCarriageValueAmount.equals(rhs.declaredForCarriageValueAmount))))&&((this.plannedDeliveryTransportEvent == rhs.plannedDeliveryTransportEvent)||((this.plannedDeliveryTransportEvent!= null)&&this.plannedDeliveryTransportEvent.equals(rhs.plannedDeliveryTransportEvent))))&&((this.plannedPickupTransportEvent == rhs.plannedPickupTransportEvent)||((this.plannedPickupTransportEvent!= null)&&this.plannedPickupTransportEvent.equals(rhs.plannedPickupTransportEvent))))&&((this.importerParty == rhs.importerParty)||((this.importerParty!= null)&&this.importerParty.equals(rhs.importerParty))))&&((this.totalGoodsItemQuantity == rhs.totalGoodsItemQuantity)||((this.totalGoodsItemQuantity!= null)&&this.totalGoodsItemQuantity.equals(rhs.totalGoodsItemQuantity))))&&((this.exporterParty == rhs.exporterParty)||((this.exporterParty!= null)&&this.exporterParty.equals(rhs.exporterParty))))&&((this.notifyParty == rhs.notifyParty)||((this.notifyParty!= null)&&this.notifyParty.equals(rhs.notifyParty))))&&((this.grossWeightMeasure == rhs.grossWeightMeasure)||((this.grossWeightMeasure!= null)&&this.grossWeightMeasure.equals(rhs.grossWeightMeasure))))&&((this.firstArrivalPortLocation == rhs.firstArrivalPortLocation)||((this.firstArrivalPortLocation!= null)&&this.firstArrivalPortLocation.equals(rhs.firstArrivalPortLocation))))&&((this.haulageInstructions == rhs.haulageInstructions)||((this.haulageInstructions!= null)&&this.haulageInstructions.equals(rhs.haulageInstructions))))&&((this.declaredStatisticsValueAmount == rhs.declaredStatisticsValueAmount)||((this.declaredStatisticsValueAmount!= null)&&this.declaredStatisticsValueAmount.equals(rhs.declaredStatisticsValueAmount))))&&((this.consignorAssignedID == rhs.consignorAssignedID)||((this.consignorAssignedID!= null)&&this.consignorAssignedID.equals(rhs.consignorAssignedID))))&&((this.freightForwarderAssignedID == rhs.freightForwarderAssignedID)||((this.freightForwarderAssignedID!= null)&&this.freightForwarderAssignedID.equals(rhs.freightForwarderAssignedID))))&&((this.originalDepartureCountry == rhs.originalDepartureCountry)||((this.originalDepartureCountry!= null)&&this.originalDepartureCountry.equals(rhs.originalDepartureCountry))))&&((this.originalDespatchParty == rhs.originalDespatchParty)||((this.originalDespatchParty!= null)&&this.originalDespatchParty.equals(rhs.originalDespatchParty))))&&((this.containerizedIndicator == rhs.containerizedIndicator)||((this.containerizedIndicator!= null)&&this.containerizedIndicator.equals(rhs.containerizedIndicator))))&&((this.hazardousRiskIndicator == rhs.hazardousRiskIndicator)||((this.hazardousRiskIndicator!= null)&&this.hazardousRiskIndicator.equals(rhs.hazardousRiskIndicator))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.forwarderServiceInstructions == rhs.forwarderServiceInstructions)||((this.forwarderServiceInstructions!= null)&&this.forwarderServiceInstructions.equals(rhs.forwarderServiceInstructions))))&&((this.handlingCode == rhs.handlingCode)||((this.handlingCode!= null)&&this.handlingCode.equals(rhs.handlingCode))))&&((this.billOfLadingHolderParty == rhs.billOfLadingHolderParty)||((this.billOfLadingHolderParty!= null)&&this.billOfLadingHolderParty.equals(rhs.billOfLadingHolderParty))))&&((this.information == rhs.information)||((this.information!= null)&&this.information.equals(rhs.information))))&&((this.mainCarriageShipmentStage == rhs.mainCarriageShipmentStage)||((this.mainCarriageShipmentStage!= null)&&this.mainCarriageShipmentStage.equals(rhs.mainCarriageShipmentStage))))&&((this.childConsignment == rhs.childConsignment)||((this.childConsignment!= null)&&this.childConsignment.equals(rhs.childConsignment))))&&((this.tariffCode == rhs.tariffCode)||((this.tariffCode!= null)&&this.tariffCode.equals(rhs.tariffCode))))&&((this.chargeableWeightMeasure == rhs.chargeableWeightMeasure)||((this.chargeableWeightMeasure!= null)&&this.chargeableWeightMeasure.equals(rhs.chargeableWeightMeasure))))&&((this.transportEvent == rhs.transportEvent)||((this.transportEvent!= null)&&this.transportEvent.equals(rhs.transportEvent))))&&((this.freeOnBoardValueAmount == rhs.freeOnBoardValueAmount)||((this.freeOnBoardValueAmount!= null)&&this.freeOnBoardValueAmount.equals(rhs.freeOnBoardValueAmount))))&&((this.consolidatableIndicator == rhs.consolidatableIndicator)||((this.consolidatableIndicator!= null)&&this.consolidatableIndicator.equals(rhs.consolidatableIndicator))))&&((this.consigneeAssignedID == rhs.consigneeAssignedID)||((this.consigneeAssignedID!= null)&&this.consigneeAssignedID.equals(rhs.consigneeAssignedID))))&&((this.carrierServiceInstructions == rhs.carrierServiceInstructions)||((this.carrierServiceInstructions!= null)&&this.carrierServiceInstructions.equals(rhs.carrierServiceInstructions))))&&((this.carrierAssignedID == rhs.carrierAssignedID)||((this.carrierAssignedID!= null)&&this.carrierAssignedID.equals(rhs.carrierAssignedID))))&&((this.consolidatedShipment == rhs.consolidatedShipment)||((this.consolidatedShipment!= null)&&this.consolidatedShipment.equals(rhs.consolidatedShipment))))&&((this.transitCountry == rhs.transitCountry)||((this.transitCountry!= null)&&this.transitCountry.equals(rhs.transitCountry))))&&((this.netWeightMeasure == rhs.netWeightMeasure)||((this.netWeightMeasure!= null)&&this.netWeightMeasure.equals(rhs.netWeightMeasure))))&&((this.prepaidPaymentTerms == rhs.prepaidPaymentTerms)||((this.prepaidPaymentTerms!= null)&&this.prepaidPaymentTerms.equals(rhs.prepaidPaymentTerms))))&&((this.totalInvoiceAmount == rhs.totalInvoiceAmount)||((this.totalInvoiceAmount!= null)&&this.totalInvoiceAmount.equals(rhs.totalInvoiceAmount))))&&((this.paymentTerms == rhs.paymentTerms)||((this.paymentTerms!= null)&&this.paymentTerms.equals(rhs.paymentTerms))))&&((this.insuranceValueAmount == rhs.insuranceValueAmount)||((this.insuranceValueAmount!= null)&&this.insuranceValueAmount.equals(rhs.insuranceValueAmount))))&&((this.consignorParty == rhs.consignorParty)||((this.consignorParty!= null)&&this.consignorParty.equals(rhs.consignorParty))))&&((this.sequenceID == rhs.sequenceID)||((this.sequenceID!= null)&&this.sequenceID.equals(rhs.sequenceID))))&&((this.deliveryInstructions == rhs.deliveryInstructions)||((this.deliveryInstructions!= null)&&this.deliveryInstructions.equals(rhs.deliveryInstructions))))&&((this.netVolumeMeasure == rhs.netVolumeMeasure)||((this.netVolumeMeasure!= null)&&this.netVolumeMeasure.equals(rhs.netVolumeMeasure))))&&((this.livestockIndicator == rhs.livestockIndicator)||((this.livestockIndicator!= null)&&this.livestockIndicator.equals(rhs.livestockIndicator))))&&((this.transportAdvisorParty == rhs.transportAdvisorParty)||((this.transportAdvisorParty!= null)&&this.transportAdvisorParty.equals(rhs.transportAdvisorParty))))&&((this.customsDeclaration == rhs.customsDeclaration)||((this.customsDeclaration!= null)&&this.customsDeclaration.equals(rhs.customsDeclaration))))&&((this.transportContract == rhs.transportContract)||((this.transportContract!= null)&&this.transportContract.equals(rhs.transportContract))))&&((this.extraAllowanceCharge == rhs.extraAllowanceCharge)||((this.extraAllowanceCharge!= null)&&this.extraAllowanceCharge.equals(rhs.extraAllowanceCharge))))&&((this.tariffDescription == rhs.tariffDescription)||((this.tariffDescription!= null)&&this.tariffDescription.equals(rhs.tariffDescription))))&&((this.finalDeliveryTransportationService == rhs.finalDeliveryTransportationService)||((this.finalDeliveryTransportationService!= null)&&this.finalDeliveryTransportationService.equals(rhs.finalDeliveryTransportationService))))&&((this.logisticsOperatorParty == rhs.logisticsOperatorParty)||((this.logisticsOperatorParty!= null)&&this.logisticsOperatorParty.equals(rhs.logisticsOperatorParty))))&&((this.mortgageHolderParty == rhs.mortgageHolderParty)||((this.mortgageHolderParty!= null)&&this.mortgageHolderParty.equals(rhs.mortgageHolderParty))))&&((this.animalFoodIndicator == rhs.animalFoodIndicator)||((this.animalFoodIndicator!= null)&&this.animalFoodIndicator.equals(rhs.animalFoodIndicator))))&&((this.specialSecurityIndicator == rhs.specialSecurityIndicator)||((this.specialSecurityIndicator!= null)&&this.specialSecurityIndicator.equals(rhs.specialSecurityIndicator))))&&((this.totalTransportHandlingUnitQuantity == rhs.totalTransportHandlingUnitQuantity)||((this.totalTransportHandlingUnitQuantity!= null)&&this.totalTransportHandlingUnitQuantity.equals(rhs.totalTransportHandlingUnitQuantity))))&&((this.totalPackagesQuantity == rhs.totalPackagesQuantity)||((this.totalPackagesQuantity!= null)&&this.totalPackagesQuantity.equals(rhs.totalPackagesQuantity))))&&((this.consigneeParty == rhs.consigneeParty)||((this.consigneeParty!= null)&&this.consigneeParty.equals(rhs.consigneeParty))))&&((this.requestedDeliveryTransportEvent == rhs.requestedDeliveryTransportEvent)||((this.requestedDeliveryTransportEvent!= null)&&this.requestedDeliveryTransportEvent.equals(rhs.requestedDeliveryTransportEvent))))&&((this.netNetWeightMeasure == rhs.netNetWeightMeasure)||((this.netNetWeightMeasure!= null)&&this.netNetWeightMeasure.equals(rhs.netNetWeightMeasure))))&&((this.finalDeliveryParty == rhs.finalDeliveryParty)||((this.finalDeliveryParty!= null)&&this.finalDeliveryParty.equals(rhs.finalDeliveryParty))))&&((this.freightForwarderParty == rhs.freightForwarderParty)||((this.freightForwarderParty!= null)&&this.freightForwarderParty.equals(rhs.freightForwarderParty))))&&((this.summaryDescription == rhs.summaryDescription)||((this.summaryDescription!= null)&&this.summaryDescription.equals(rhs.summaryDescription))))&&((this.insuranceParty == rhs.insuranceParty)||((this.insuranceParty!= null)&&this.insuranceParty.equals(rhs.insuranceParty))))&&((this.hazardousItemNotificationParty == rhs.hazardousItemNotificationParty)||((this.hazardousItemNotificationParty!= null)&&this.hazardousItemNotificationParty.equals(rhs.hazardousItemNotificationParty))))&&((this.deliveryTerms == rhs.deliveryTerms)||((this.deliveryTerms!= null)&&this.deliveryTerms.equals(rhs.deliveryTerms))))&&((this.childConsignmentQuantity == rhs.childConsignmentQuantity)||((this.childConsignmentQuantity!= null)&&this.childConsignmentQuantity.equals(rhs.childConsignmentQuantity))))&&((this.shippingPriorityLevelCode == rhs.shippingPriorityLevelCode)||((this.shippingPriorityLevelCode!= null)&&this.shippingPriorityLevelCode.equals(rhs.shippingPriorityLevelCode))))&&((this.finalDestinationCountry == rhs.finalDestinationCountry)||((this.finalDestinationCountry!= null)&&this.finalDestinationCountry.equals(rhs.finalDestinationCountry))))&&((this.customsClearanceServiceInstructions == rhs.customsClearanceServiceInstructions)||((this.customsClearanceServiceInstructions!= null)&&this.customsClearanceServiceInstructions.equals(rhs.customsClearanceServiceInstructions))))&&((this.originalDespatchTransportationService == rhs.originalDespatchTransportationService)||((this.originalDespatchTransportationService!= null)&&this.originalDespatchTransportationService.equals(rhs.originalDespatchTransportationService))))&&((this.generalCargoIndicator == rhs.generalCargoIndicator)||((this.generalCargoIndicator!= null)&&this.generalCargoIndicator.equals(rhs.generalCargoIndicator))))&&((this.specialInstructions == rhs.specialInstructions)||((this.specialInstructions!= null)&&this.specialInstructions.equals(rhs.specialInstructions))))&&((this.insurancePremiumAmount == rhs.insurancePremiumAmount)||((this.insurancePremiumAmount!= null)&&this.insurancePremiumAmount.equals(rhs.insurancePremiumAmount))))&&((this.substituteCarrierParty == rhs.substituteCarrierParty)||((this.substituteCarrierParty!= null)&&this.substituteCarrierParty.equals(rhs.substituteCarrierParty))))&&((this.collectPaymentTerms == rhs.collectPaymentTerms)||((this.collectPaymentTerms!= null)&&this.collectPaymentTerms.equals(rhs.collectPaymentTerms))))&&((this.remarks == rhs.remarks)||((this.remarks!= null)&&this.remarks.equals(rhs.remarks))))&&((this.handlingInstructions == rhs.handlingInstructions)||((this.handlingInstructions!= null)&&this.handlingInstructions.equals(rhs.handlingInstructions))))&&((this.grossVolumeMeasure == rhs.grossVolumeMeasure)||((this.grossVolumeMeasure!= null)&&this.grossVolumeMeasure.equals(rhs.grossVolumeMeasure))));
    }

}
