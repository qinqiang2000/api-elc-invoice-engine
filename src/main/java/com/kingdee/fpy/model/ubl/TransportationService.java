
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
 * Transportation Service. Details
 * <p>
 * A class to describe a transportation service.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "TransportServiceCode",
    "TariffClassCode",
    "Priority",
    "FreightRateClassCode",
    "TransportationServiceDescription",
    "TransportationServiceDetailsURI",
    "NominationDate",
    "NominationTime",
    "Name",
    "SequenceNumeric",
    "TransportEquipment",
    "SupportedTransportEquipment",
    "UnsupportedTransportEquipment",
    "CommodityClassification",
    "SupportedCommodityClassification",
    "UnsupportedCommodityClassification",
    "TotalCapacityDimension",
    "ShipmentStage",
    "TransportEvent",
    "ResponsibleTransportServiceProviderParty",
    "EnvironmentalEmission",
    "EstimatedDurationPeriod",
    "ScheduledServiceFrequency"
})
@Generated("jsonschema2pojo")
public class TransportationService {

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
     * Transportation Service. Transport Service Code. Code
     * <p>
     * A code signifying the extent of this transportation service (e.g., door-to-door, port-to-port).
     * (Required)
     * 
     */
    @JsonProperty("TransportServiceCode")
    @JsonPropertyDescription("A code signifying the extent of this transportation service (e.g., door-to-door, port-to-port).")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<CodeType> transportServiceCode = new ArrayList<CodeType>();
    /**
     * Transportation Service. Tariff Class Code. Code
     * <p>
     * A code signifying the tariff class applicable to this transportation service.
     * 
     */
    @JsonProperty("TariffClassCode")
    @JsonPropertyDescription("A code signifying the tariff class applicable to this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> tariffClassCode = new ArrayList<CodeType>();
    /**
     * Transportation Service. Priority. Text
     * <p>
     * The priority of this transportation service.
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("The priority of this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> priority = new ArrayList<TextType>();
    /**
     * Transportation Service. Freight Rate Class Code. Code
     * <p>
     * A code signifying the rate class for freight in this transportation service.
     * 
     */
    @JsonProperty("FreightRateClassCode")
    @JsonPropertyDescription("A code signifying the rate class for freight in this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> freightRateClassCode = new ArrayList<CodeType>();
    /**
     * Transportation Service. Transportation Service Description. Text
     * <p>
     * Text describing this transportation service.
     * 
     */
    @JsonProperty("TransportationServiceDescription")
    @JsonPropertyDescription("Text describing this transportation service.")
    @Size(min = 1)
    @Valid
    private List<TextType> transportationServiceDescription = new ArrayList<TextType>();
    /**
     * Transportation Service. Transportation Service Details URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing additional details regarding this transportation service.
     * 
     */
    @JsonProperty("TransportationServiceDetailsURI")
    @JsonPropertyDescription("The Uniform Resource Identifier (URI) of a document providing additional details regarding this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> transportationServiceDetailsURI = new ArrayList<IdentifierType>();
    /**
     * Transportation Service. Nomination Date. Date
     * <p>
     * In a transport contract, the deadline date by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.
     * 
     */
    @JsonProperty("NominationDate")
    @JsonPropertyDescription("In a transport contract, the deadline date by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> nominationDate = new ArrayList<DateType>();
    /**
     * Transportation Service. Nomination Time. Time
     * <p>
     * In a transport contract, the deadline time by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.
     * 
     */
    @JsonProperty("NominationTime")
    @JsonPropertyDescription("In a transport contract, the deadline time by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> nominationTime = new ArrayList<TimeType>();
    /**
     * Transportation Service. Name
     * <p>
     * The name of this transportation service.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Transportation Service. Sequence. Numeric
     * <p>
     * A number indicating the order of this transportation service in a sequence of transportation services.
     * 
     */
    @JsonProperty("SequenceNumeric")
    @JsonPropertyDescription("A number indicating the order of this transportation service in a sequence of transportation services.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> sequenceNumeric = new ArrayList<NumericType>();
    /**
     * Transportation Service. Transport Equipment
     * <p>
     * A piece of transport equipment used in this transportation service.
     * 
     */
    @JsonProperty("TransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment used in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> transportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Transportation Service. Supported_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment supported in this transportation service.
     * 
     */
    @JsonProperty("SupportedTransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment supported in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> supportedTransportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Transportation Service. Unsupported_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment that is not supported in this transportation service.
     * 
     */
    @JsonProperty("UnsupportedTransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment that is not supported in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> unsupportedTransportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Transportation Service. Commodity Classification
     * <p>
     * A classification of this transportation service.
     * 
     */
    @JsonProperty("CommodityClassification")
    @JsonPropertyDescription("A classification of this transportation service.")
    @Size(min = 1)
    @Valid
    private List<CommodityClassification> commodityClassification = new ArrayList<CommodityClassification>();
    /**
     * Transportation Service. Supported_ Commodity Classification. Commodity Classification
     * <p>
     * A classification (e.g., general cargo) for commodities that can be handled in this transportation service.
     * 
     */
    @JsonProperty("SupportedCommodityClassification")
    @JsonPropertyDescription("A classification (e.g., general cargo) for commodities that can be handled in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<CommodityClassification> supportedCommodityClassification = new ArrayList<CommodityClassification>();
    /**
     * Transportation Service. Unsupported_ Commodity Classification. Commodity Classification
     * <p>
     * A classification for commodities that cannot be handled in this transportation service.
     * 
     */
    @JsonProperty("UnsupportedCommodityClassification")
    @JsonPropertyDescription("A classification for commodities that cannot be handled in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<CommodityClassification> unsupportedCommodityClassification = new ArrayList<CommodityClassification>();
    /**
     * Transportation Service. Total Capacity_ Dimension. Dimension
     * <p>
     * The total capacity or volume available in this transportation service.
     * 
     */
    @JsonProperty("TotalCapacityDimension")
    @JsonPropertyDescription("The total capacity or volume available in this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Dimension> totalCapacityDimension = new ArrayList<Dimension>();
    /**
     * Transportation Service. Shipment Stage
     * <p>
     * One of the stages of shipment in this transportation service.
     * 
     */
    @JsonProperty("ShipmentStage")
    @JsonPropertyDescription("One of the stages of shipment in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<ShipmentStage> shipmentStage = new ArrayList<ShipmentStage>();
    /**
     * Transportation Service. Transport Event
     * <p>
     * One of the transport events taking place in this transportation service.
     * 
     */
    @JsonProperty("TransportEvent")
    @JsonPropertyDescription("One of the transport events taking place in this transportation service.")
    @Size(min = 1)
    @Valid
    private List<TransportEvent> transportEvent = new ArrayList<TransportEvent>();
    /**
     * Transportation Service. Responsible Transport Service Provider_ Party. Party
     * <p>
     * The transport service provider responsible for this transportation service.
     * 
     */
    @JsonProperty("ResponsibleTransportServiceProviderParty")
    @JsonPropertyDescription("The transport service provider responsible for this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> responsibleTransportServiceProviderParty = new ArrayList<Party>();
    /**
     * Transportation Service. Environmental Emission
     * <p>
     * An environmental emission resulting from this transportation service.
     * 
     */
    @JsonProperty("EnvironmentalEmission")
    @JsonPropertyDescription("An environmental emission resulting from this transportation service.")
    @Size(min = 1)
    @Valid
    private List<EnvironmentalEmission> environmentalEmission = new ArrayList<EnvironmentalEmission>();
    /**
     * Transportation Service. Estimated Duration_ Period. Period
     * <p>
     * The estimated duration of this transportation service.
     * 
     */
    @JsonProperty("EstimatedDurationPeriod")
    @JsonPropertyDescription("The estimated duration of this transportation service.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> estimatedDurationPeriod = new ArrayList<Period>();
    /**
     * Transportation Service. Scheduled_ Service Frequency. Service Frequency
     * <p>
     * A class to specify which day of the week a transport service is operational.
     * 
     */
    @JsonProperty("ScheduledServiceFrequency")
    @JsonPropertyDescription("A class to specify which day of the week a transport service is operational.")
    @Size(min = 1)
    @Valid
    private List<ServiceFrequency> scheduledServiceFrequency = new ArrayList<ServiceFrequency>();

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

    public TransportationService withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transportation Service. Transport Service Code. Code
     * <p>
     * A code signifying the extent of this transportation service (e.g., door-to-door, port-to-port).
     * (Required)
     * 
     */
    @JsonProperty("TransportServiceCode")
    public List<CodeType> getTransportServiceCode() {
        return transportServiceCode;
    }

    /**
     * Transportation Service. Transport Service Code. Code
     * <p>
     * A code signifying the extent of this transportation service (e.g., door-to-door, port-to-port).
     * (Required)
     * 
     */
    @JsonProperty("TransportServiceCode")
    public void setTransportServiceCode(List<CodeType> transportServiceCode) {
        this.transportServiceCode = transportServiceCode;
    }

    public TransportationService withTransportServiceCode(List<CodeType> transportServiceCode) {
        this.transportServiceCode = transportServiceCode;
        return this;
    }

    /**
     * Transportation Service. Tariff Class Code. Code
     * <p>
     * A code signifying the tariff class applicable to this transportation service.
     * 
     */
    @JsonProperty("TariffClassCode")
    public List<CodeType> getTariffClassCode() {
        return tariffClassCode;
    }

    /**
     * Transportation Service. Tariff Class Code. Code
     * <p>
     * A code signifying the tariff class applicable to this transportation service.
     * 
     */
    @JsonProperty("TariffClassCode")
    public void setTariffClassCode(List<CodeType> tariffClassCode) {
        this.tariffClassCode = tariffClassCode;
    }

    public TransportationService withTariffClassCode(List<CodeType> tariffClassCode) {
        this.tariffClassCode = tariffClassCode;
        return this;
    }

    /**
     * Transportation Service. Priority. Text
     * <p>
     * The priority of this transportation service.
     * 
     */
    @JsonProperty("Priority")
    public List<TextType> getPriority() {
        return priority;
    }

    /**
     * Transportation Service. Priority. Text
     * <p>
     * The priority of this transportation service.
     * 
     */
    @JsonProperty("Priority")
    public void setPriority(List<TextType> priority) {
        this.priority = priority;
    }

    public TransportationService withPriority(List<TextType> priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Transportation Service. Freight Rate Class Code. Code
     * <p>
     * A code signifying the rate class for freight in this transportation service.
     * 
     */
    @JsonProperty("FreightRateClassCode")
    public List<CodeType> getFreightRateClassCode() {
        return freightRateClassCode;
    }

    /**
     * Transportation Service. Freight Rate Class Code. Code
     * <p>
     * A code signifying the rate class for freight in this transportation service.
     * 
     */
    @JsonProperty("FreightRateClassCode")
    public void setFreightRateClassCode(List<CodeType> freightRateClassCode) {
        this.freightRateClassCode = freightRateClassCode;
    }

    public TransportationService withFreightRateClassCode(List<CodeType> freightRateClassCode) {
        this.freightRateClassCode = freightRateClassCode;
        return this;
    }

    /**
     * Transportation Service. Transportation Service Description. Text
     * <p>
     * Text describing this transportation service.
     * 
     */
    @JsonProperty("TransportationServiceDescription")
    public List<TextType> getTransportationServiceDescription() {
        return transportationServiceDescription;
    }

    /**
     * Transportation Service. Transportation Service Description. Text
     * <p>
     * Text describing this transportation service.
     * 
     */
    @JsonProperty("TransportationServiceDescription")
    public void setTransportationServiceDescription(List<TextType> transportationServiceDescription) {
        this.transportationServiceDescription = transportationServiceDescription;
    }

    public TransportationService withTransportationServiceDescription(List<TextType> transportationServiceDescription) {
        this.transportationServiceDescription = transportationServiceDescription;
        return this;
    }

    /**
     * Transportation Service. Transportation Service Details URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing additional details regarding this transportation service.
     * 
     */
    @JsonProperty("TransportationServiceDetailsURI")
    public List<IdentifierType> getTransportationServiceDetailsURI() {
        return transportationServiceDetailsURI;
    }

    /**
     * Transportation Service. Transportation Service Details URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) of a document providing additional details regarding this transportation service.
     * 
     */
    @JsonProperty("TransportationServiceDetailsURI")
    public void setTransportationServiceDetailsURI(List<IdentifierType> transportationServiceDetailsURI) {
        this.transportationServiceDetailsURI = transportationServiceDetailsURI;
    }

    public TransportationService withTransportationServiceDetailsURI(List<IdentifierType> transportationServiceDetailsURI) {
        this.transportationServiceDetailsURI = transportationServiceDetailsURI;
        return this;
    }

    /**
     * Transportation Service. Nomination Date. Date
     * <p>
     * In a transport contract, the deadline date by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.
     * 
     */
    @JsonProperty("NominationDate")
    public List<DateType> getNominationDate() {
        return nominationDate;
    }

    /**
     * Transportation Service. Nomination Date. Date
     * <p>
     * In a transport contract, the deadline date by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011.
     * 
     */
    @JsonProperty("NominationDate")
    public void setNominationDate(List<DateType> nominationDate) {
        this.nominationDate = nominationDate;
    }

    public TransportationService withNominationDate(List<DateType> nominationDate) {
        this.nominationDate = nominationDate;
        return this;
    }

    /**
     * Transportation Service. Nomination Time. Time
     * <p>
     * In a transport contract, the deadline time by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.
     * 
     */
    @JsonProperty("NominationTime")
    public List<TimeType> getNominationTime() {
        return nominationTime;
    }

    /**
     * Transportation Service. Nomination Time. Time
     * <p>
     * In a transport contract, the deadline time by which this transportation service has to be booked. For example, if this service is scheduled for Wednesday 16 February 2011 at 10 a.m. CET, the nomination date might be Tuesday15 February 2011 and the nomination time 4 p.m. at the latest.
     * 
     */
    @JsonProperty("NominationTime")
    public void setNominationTime(List<TimeType> nominationTime) {
        this.nominationTime = nominationTime;
    }

    public TransportationService withNominationTime(List<TimeType> nominationTime) {
        this.nominationTime = nominationTime;
        return this;
    }

    /**
     * Transportation Service. Name
     * <p>
     * The name of this transportation service.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Transportation Service. Name
     * <p>
     * The name of this transportation service.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public TransportationService withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Transportation Service. Sequence. Numeric
     * <p>
     * A number indicating the order of this transportation service in a sequence of transportation services.
     * 
     */
    @JsonProperty("SequenceNumeric")
    public List<NumericType> getSequenceNumeric() {
        return sequenceNumeric;
    }

    /**
     * Transportation Service. Sequence. Numeric
     * <p>
     * A number indicating the order of this transportation service in a sequence of transportation services.
     * 
     */
    @JsonProperty("SequenceNumeric")
    public void setSequenceNumeric(List<NumericType> sequenceNumeric) {
        this.sequenceNumeric = sequenceNumeric;
    }

    public TransportationService withSequenceNumeric(List<NumericType> sequenceNumeric) {
        this.sequenceNumeric = sequenceNumeric;
        return this;
    }

    /**
     * Transportation Service. Transport Equipment
     * <p>
     * A piece of transport equipment used in this transportation service.
     * 
     */
    @JsonProperty("TransportEquipment")
    public List<TransportEquipment> getTransportEquipment() {
        return transportEquipment;
    }

    /**
     * Transportation Service. Transport Equipment
     * <p>
     * A piece of transport equipment used in this transportation service.
     * 
     */
    @JsonProperty("TransportEquipment")
    public void setTransportEquipment(List<TransportEquipment> transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    public TransportationService withTransportEquipment(List<TransportEquipment> transportEquipment) {
        this.transportEquipment = transportEquipment;
        return this;
    }

    /**
     * Transportation Service. Supported_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment supported in this transportation service.
     * 
     */
    @JsonProperty("SupportedTransportEquipment")
    public List<TransportEquipment> getSupportedTransportEquipment() {
        return supportedTransportEquipment;
    }

    /**
     * Transportation Service. Supported_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment supported in this transportation service.
     * 
     */
    @JsonProperty("SupportedTransportEquipment")
    public void setSupportedTransportEquipment(List<TransportEquipment> supportedTransportEquipment) {
        this.supportedTransportEquipment = supportedTransportEquipment;
    }

    public TransportationService withSupportedTransportEquipment(List<TransportEquipment> supportedTransportEquipment) {
        this.supportedTransportEquipment = supportedTransportEquipment;
        return this;
    }

    /**
     * Transportation Service. Unsupported_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment that is not supported in this transportation service.
     * 
     */
    @JsonProperty("UnsupportedTransportEquipment")
    public List<TransportEquipment> getUnsupportedTransportEquipment() {
        return unsupportedTransportEquipment;
    }

    /**
     * Transportation Service. Unsupported_ Transport Equipment. Transport Equipment
     * <p>
     * A piece of transport equipment that is not supported in this transportation service.
     * 
     */
    @JsonProperty("UnsupportedTransportEquipment")
    public void setUnsupportedTransportEquipment(List<TransportEquipment> unsupportedTransportEquipment) {
        this.unsupportedTransportEquipment = unsupportedTransportEquipment;
    }

    public TransportationService withUnsupportedTransportEquipment(List<TransportEquipment> unsupportedTransportEquipment) {
        this.unsupportedTransportEquipment = unsupportedTransportEquipment;
        return this;
    }

    /**
     * Transportation Service. Commodity Classification
     * <p>
     * A classification of this transportation service.
     * 
     */
    @JsonProperty("CommodityClassification")
    public List<CommodityClassification> getCommodityClassification() {
        return commodityClassification;
    }

    /**
     * Transportation Service. Commodity Classification
     * <p>
     * A classification of this transportation service.
     * 
     */
    @JsonProperty("CommodityClassification")
    public void setCommodityClassification(List<CommodityClassification> commodityClassification) {
        this.commodityClassification = commodityClassification;
    }

    public TransportationService withCommodityClassification(List<CommodityClassification> commodityClassification) {
        this.commodityClassification = commodityClassification;
        return this;
    }

    /**
     * Transportation Service. Supported_ Commodity Classification. Commodity Classification
     * <p>
     * A classification (e.g., general cargo) for commodities that can be handled in this transportation service.
     * 
     */
    @JsonProperty("SupportedCommodityClassification")
    public List<CommodityClassification> getSupportedCommodityClassification() {
        return supportedCommodityClassification;
    }

    /**
     * Transportation Service. Supported_ Commodity Classification. Commodity Classification
     * <p>
     * A classification (e.g., general cargo) for commodities that can be handled in this transportation service.
     * 
     */
    @JsonProperty("SupportedCommodityClassification")
    public void setSupportedCommodityClassification(List<CommodityClassification> supportedCommodityClassification) {
        this.supportedCommodityClassification = supportedCommodityClassification;
    }

    public TransportationService withSupportedCommodityClassification(List<CommodityClassification> supportedCommodityClassification) {
        this.supportedCommodityClassification = supportedCommodityClassification;
        return this;
    }

    /**
     * Transportation Service. Unsupported_ Commodity Classification. Commodity Classification
     * <p>
     * A classification for commodities that cannot be handled in this transportation service.
     * 
     */
    @JsonProperty("UnsupportedCommodityClassification")
    public List<CommodityClassification> getUnsupportedCommodityClassification() {
        return unsupportedCommodityClassification;
    }

    /**
     * Transportation Service. Unsupported_ Commodity Classification. Commodity Classification
     * <p>
     * A classification for commodities that cannot be handled in this transportation service.
     * 
     */
    @JsonProperty("UnsupportedCommodityClassification")
    public void setUnsupportedCommodityClassification(List<CommodityClassification> unsupportedCommodityClassification) {
        this.unsupportedCommodityClassification = unsupportedCommodityClassification;
    }

    public TransportationService withUnsupportedCommodityClassification(List<CommodityClassification> unsupportedCommodityClassification) {
        this.unsupportedCommodityClassification = unsupportedCommodityClassification;
        return this;
    }

    /**
     * Transportation Service. Total Capacity_ Dimension. Dimension
     * <p>
     * The total capacity or volume available in this transportation service.
     * 
     */
    @JsonProperty("TotalCapacityDimension")
    public List<Dimension> getTotalCapacityDimension() {
        return totalCapacityDimension;
    }

    /**
     * Transportation Service. Total Capacity_ Dimension. Dimension
     * <p>
     * The total capacity or volume available in this transportation service.
     * 
     */
    @JsonProperty("TotalCapacityDimension")
    public void setTotalCapacityDimension(List<Dimension> totalCapacityDimension) {
        this.totalCapacityDimension = totalCapacityDimension;
    }

    public TransportationService withTotalCapacityDimension(List<Dimension> totalCapacityDimension) {
        this.totalCapacityDimension = totalCapacityDimension;
        return this;
    }

    /**
     * Transportation Service. Shipment Stage
     * <p>
     * One of the stages of shipment in this transportation service.
     * 
     */
    @JsonProperty("ShipmentStage")
    public List<ShipmentStage> getShipmentStage() {
        return shipmentStage;
    }

    /**
     * Transportation Service. Shipment Stage
     * <p>
     * One of the stages of shipment in this transportation service.
     * 
     */
    @JsonProperty("ShipmentStage")
    public void setShipmentStage(List<ShipmentStage> shipmentStage) {
        this.shipmentStage = shipmentStage;
    }

    public TransportationService withShipmentStage(List<ShipmentStage> shipmentStage) {
        this.shipmentStage = shipmentStage;
        return this;
    }

    /**
     * Transportation Service. Transport Event
     * <p>
     * One of the transport events taking place in this transportation service.
     * 
     */
    @JsonProperty("TransportEvent")
    public List<TransportEvent> getTransportEvent() {
        return transportEvent;
    }

    /**
     * Transportation Service. Transport Event
     * <p>
     * One of the transport events taking place in this transportation service.
     * 
     */
    @JsonProperty("TransportEvent")
    public void setTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
    }

    public TransportationService withTransportEvent(List<TransportEvent> transportEvent) {
        this.transportEvent = transportEvent;
        return this;
    }

    /**
     * Transportation Service. Responsible Transport Service Provider_ Party. Party
     * <p>
     * The transport service provider responsible for this transportation service.
     * 
     */
    @JsonProperty("ResponsibleTransportServiceProviderParty")
    public List<Party> getResponsibleTransportServiceProviderParty() {
        return responsibleTransportServiceProviderParty;
    }

    /**
     * Transportation Service. Responsible Transport Service Provider_ Party. Party
     * <p>
     * The transport service provider responsible for this transportation service.
     * 
     */
    @JsonProperty("ResponsibleTransportServiceProviderParty")
    public void setResponsibleTransportServiceProviderParty(List<Party> responsibleTransportServiceProviderParty) {
        this.responsibleTransportServiceProviderParty = responsibleTransportServiceProviderParty;
    }

    public TransportationService withResponsibleTransportServiceProviderParty(List<Party> responsibleTransportServiceProviderParty) {
        this.responsibleTransportServiceProviderParty = responsibleTransportServiceProviderParty;
        return this;
    }

    /**
     * Transportation Service. Environmental Emission
     * <p>
     * An environmental emission resulting from this transportation service.
     * 
     */
    @JsonProperty("EnvironmentalEmission")
    public List<EnvironmentalEmission> getEnvironmentalEmission() {
        return environmentalEmission;
    }

    /**
     * Transportation Service. Environmental Emission
     * <p>
     * An environmental emission resulting from this transportation service.
     * 
     */
    @JsonProperty("EnvironmentalEmission")
    public void setEnvironmentalEmission(List<EnvironmentalEmission> environmentalEmission) {
        this.environmentalEmission = environmentalEmission;
    }

    public TransportationService withEnvironmentalEmission(List<EnvironmentalEmission> environmentalEmission) {
        this.environmentalEmission = environmentalEmission;
        return this;
    }

    /**
     * Transportation Service. Estimated Duration_ Period. Period
     * <p>
     * The estimated duration of this transportation service.
     * 
     */
    @JsonProperty("EstimatedDurationPeriod")
    public List<Period> getEstimatedDurationPeriod() {
        return estimatedDurationPeriod;
    }

    /**
     * Transportation Service. Estimated Duration_ Period. Period
     * <p>
     * The estimated duration of this transportation service.
     * 
     */
    @JsonProperty("EstimatedDurationPeriod")
    public void setEstimatedDurationPeriod(List<Period> estimatedDurationPeriod) {
        this.estimatedDurationPeriod = estimatedDurationPeriod;
    }

    public TransportationService withEstimatedDurationPeriod(List<Period> estimatedDurationPeriod) {
        this.estimatedDurationPeriod = estimatedDurationPeriod;
        return this;
    }

    /**
     * Transportation Service. Scheduled_ Service Frequency. Service Frequency
     * <p>
     * A class to specify which day of the week a transport service is operational.
     * 
     */
    @JsonProperty("ScheduledServiceFrequency")
    public List<ServiceFrequency> getScheduledServiceFrequency() {
        return scheduledServiceFrequency;
    }

    /**
     * Transportation Service. Scheduled_ Service Frequency. Service Frequency
     * <p>
     * A class to specify which day of the week a transport service is operational.
     * 
     */
    @JsonProperty("ScheduledServiceFrequency")
    public void setScheduledServiceFrequency(List<ServiceFrequency> scheduledServiceFrequency) {
        this.scheduledServiceFrequency = scheduledServiceFrequency;
    }

    public TransportationService withScheduledServiceFrequency(List<ServiceFrequency> scheduledServiceFrequency) {
        this.scheduledServiceFrequency = scheduledServiceFrequency;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportationService.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("transportServiceCode");
        sb.append('=');
        sb.append(((this.transportServiceCode == null)?"<null>":this.transportServiceCode));
        sb.append(',');
        sb.append("tariffClassCode");
        sb.append('=');
        sb.append(((this.tariffClassCode == null)?"<null>":this.tariffClassCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("freightRateClassCode");
        sb.append('=');
        sb.append(((this.freightRateClassCode == null)?"<null>":this.freightRateClassCode));
        sb.append(',');
        sb.append("transportationServiceDescription");
        sb.append('=');
        sb.append(((this.transportationServiceDescription == null)?"<null>":this.transportationServiceDescription));
        sb.append(',');
        sb.append("transportationServiceDetailsURI");
        sb.append('=');
        sb.append(((this.transportationServiceDetailsURI == null)?"<null>":this.transportationServiceDetailsURI));
        sb.append(',');
        sb.append("nominationDate");
        sb.append('=');
        sb.append(((this.nominationDate == null)?"<null>":this.nominationDate));
        sb.append(',');
        sb.append("nominationTime");
        sb.append('=');
        sb.append(((this.nominationTime == null)?"<null>":this.nominationTime));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("sequenceNumeric");
        sb.append('=');
        sb.append(((this.sequenceNumeric == null)?"<null>":this.sequenceNumeric));
        sb.append(',');
        sb.append("transportEquipment");
        sb.append('=');
        sb.append(((this.transportEquipment == null)?"<null>":this.transportEquipment));
        sb.append(',');
        sb.append("supportedTransportEquipment");
        sb.append('=');
        sb.append(((this.supportedTransportEquipment == null)?"<null>":this.supportedTransportEquipment));
        sb.append(',');
        sb.append("unsupportedTransportEquipment");
        sb.append('=');
        sb.append(((this.unsupportedTransportEquipment == null)?"<null>":this.unsupportedTransportEquipment));
        sb.append(',');
        sb.append("commodityClassification");
        sb.append('=');
        sb.append(((this.commodityClassification == null)?"<null>":this.commodityClassification));
        sb.append(',');
        sb.append("supportedCommodityClassification");
        sb.append('=');
        sb.append(((this.supportedCommodityClassification == null)?"<null>":this.supportedCommodityClassification));
        sb.append(',');
        sb.append("unsupportedCommodityClassification");
        sb.append('=');
        sb.append(((this.unsupportedCommodityClassification == null)?"<null>":this.unsupportedCommodityClassification));
        sb.append(',');
        sb.append("totalCapacityDimension");
        sb.append('=');
        sb.append(((this.totalCapacityDimension == null)?"<null>":this.totalCapacityDimension));
        sb.append(',');
        sb.append("shipmentStage");
        sb.append('=');
        sb.append(((this.shipmentStage == null)?"<null>":this.shipmentStage));
        sb.append(',');
        sb.append("transportEvent");
        sb.append('=');
        sb.append(((this.transportEvent == null)?"<null>":this.transportEvent));
        sb.append(',');
        sb.append("responsibleTransportServiceProviderParty");
        sb.append('=');
        sb.append(((this.responsibleTransportServiceProviderParty == null)?"<null>":this.responsibleTransportServiceProviderParty));
        sb.append(',');
        sb.append("environmentalEmission");
        sb.append('=');
        sb.append(((this.environmentalEmission == null)?"<null>":this.environmentalEmission));
        sb.append(',');
        sb.append("estimatedDurationPeriod");
        sb.append('=');
        sb.append(((this.estimatedDurationPeriod == null)?"<null>":this.estimatedDurationPeriod));
        sb.append(',');
        sb.append("scheduledServiceFrequency");
        sb.append('=');
        sb.append(((this.scheduledServiceFrequency == null)?"<null>":this.scheduledServiceFrequency));
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
        result = ((result* 31)+((this.transportationServiceDetailsURI == null)? 0 :this.transportationServiceDetailsURI.hashCode()));
        result = ((result* 31)+((this.totalCapacityDimension == null)? 0 :this.totalCapacityDimension.hashCode()));
        result = ((result* 31)+((this.environmentalEmission == null)? 0 :this.environmentalEmission.hashCode()));
        result = ((result* 31)+((this.transportEvent == null)? 0 :this.transportEvent.hashCode()));
        result = ((result* 31)+((this.transportationServiceDescription == null)? 0 :this.transportationServiceDescription.hashCode()));
        result = ((result* 31)+((this.unsupportedTransportEquipment == null)? 0 :this.unsupportedTransportEquipment.hashCode()));
        result = ((result* 31)+((this.shipmentStage == null)? 0 :this.shipmentStage.hashCode()));
        result = ((result* 31)+((this.responsibleTransportServiceProviderParty == null)? 0 :this.responsibleTransportServiceProviderParty.hashCode()));
        result = ((result* 31)+((this.tariffClassCode == null)? 0 :this.tariffClassCode.hashCode()));
        result = ((result* 31)+((this.freightRateClassCode == null)? 0 :this.freightRateClassCode.hashCode()));
        result = ((result* 31)+((this.supportedTransportEquipment == null)? 0 :this.supportedTransportEquipment.hashCode()));
        result = ((result* 31)+((this.transportEquipment == null)? 0 :this.transportEquipment.hashCode()));
        result = ((result* 31)+((this.sequenceNumeric == null)? 0 :this.sequenceNumeric.hashCode()));
        result = ((result* 31)+((this.transportServiceCode == null)? 0 :this.transportServiceCode.hashCode()));
        result = ((result* 31)+((this.commodityClassification == null)? 0 :this.commodityClassification.hashCode()));
        result = ((result* 31)+((this.nominationDate == null)? 0 :this.nominationDate.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.estimatedDurationPeriod == null)? 0 :this.estimatedDurationPeriod.hashCode()));
        result = ((result* 31)+((this.nominationTime == null)? 0 :this.nominationTime.hashCode()));
        result = ((result* 31)+((this.supportedCommodityClassification == null)? 0 :this.supportedCommodityClassification.hashCode()));
        result = ((result* 31)+((this.unsupportedCommodityClassification == null)? 0 :this.unsupportedCommodityClassification.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.scheduledServiceFrequency == null)? 0 :this.scheduledServiceFrequency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportationService) == false) {
            return false;
        }
        TransportationService rhs = ((TransportationService) other);
        return (((((((((((((((((((((((((this.transportationServiceDetailsURI == rhs.transportationServiceDetailsURI)||((this.transportationServiceDetailsURI!= null)&&this.transportationServiceDetailsURI.equals(rhs.transportationServiceDetailsURI)))&&((this.totalCapacityDimension == rhs.totalCapacityDimension)||((this.totalCapacityDimension!= null)&&this.totalCapacityDimension.equals(rhs.totalCapacityDimension))))&&((this.environmentalEmission == rhs.environmentalEmission)||((this.environmentalEmission!= null)&&this.environmentalEmission.equals(rhs.environmentalEmission))))&&((this.transportEvent == rhs.transportEvent)||((this.transportEvent!= null)&&this.transportEvent.equals(rhs.transportEvent))))&&((this.transportationServiceDescription == rhs.transportationServiceDescription)||((this.transportationServiceDescription!= null)&&this.transportationServiceDescription.equals(rhs.transportationServiceDescription))))&&((this.unsupportedTransportEquipment == rhs.unsupportedTransportEquipment)||((this.unsupportedTransportEquipment!= null)&&this.unsupportedTransportEquipment.equals(rhs.unsupportedTransportEquipment))))&&((this.shipmentStage == rhs.shipmentStage)||((this.shipmentStage!= null)&&this.shipmentStage.equals(rhs.shipmentStage))))&&((this.responsibleTransportServiceProviderParty == rhs.responsibleTransportServiceProviderParty)||((this.responsibleTransportServiceProviderParty!= null)&&this.responsibleTransportServiceProviderParty.equals(rhs.responsibleTransportServiceProviderParty))))&&((this.tariffClassCode == rhs.tariffClassCode)||((this.tariffClassCode!= null)&&this.tariffClassCode.equals(rhs.tariffClassCode))))&&((this.freightRateClassCode == rhs.freightRateClassCode)||((this.freightRateClassCode!= null)&&this.freightRateClassCode.equals(rhs.freightRateClassCode))))&&((this.supportedTransportEquipment == rhs.supportedTransportEquipment)||((this.supportedTransportEquipment!= null)&&this.supportedTransportEquipment.equals(rhs.supportedTransportEquipment))))&&((this.transportEquipment == rhs.transportEquipment)||((this.transportEquipment!= null)&&this.transportEquipment.equals(rhs.transportEquipment))))&&((this.sequenceNumeric == rhs.sequenceNumeric)||((this.sequenceNumeric!= null)&&this.sequenceNumeric.equals(rhs.sequenceNumeric))))&&((this.transportServiceCode == rhs.transportServiceCode)||((this.transportServiceCode!= null)&&this.transportServiceCode.equals(rhs.transportServiceCode))))&&((this.commodityClassification == rhs.commodityClassification)||((this.commodityClassification!= null)&&this.commodityClassification.equals(rhs.commodityClassification))))&&((this.nominationDate == rhs.nominationDate)||((this.nominationDate!= null)&&this.nominationDate.equals(rhs.nominationDate))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.estimatedDurationPeriod == rhs.estimatedDurationPeriod)||((this.estimatedDurationPeriod!= null)&&this.estimatedDurationPeriod.equals(rhs.estimatedDurationPeriod))))&&((this.nominationTime == rhs.nominationTime)||((this.nominationTime!= null)&&this.nominationTime.equals(rhs.nominationTime))))&&((this.supportedCommodityClassification == rhs.supportedCommodityClassification)||((this.supportedCommodityClassification!= null)&&this.supportedCommodityClassification.equals(rhs.supportedCommodityClassification))))&&((this.unsupportedCommodityClassification == rhs.unsupportedCommodityClassification)||((this.unsupportedCommodityClassification!= null)&&this.unsupportedCommodityClassification.equals(rhs.unsupportedCommodityClassification))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.scheduledServiceFrequency == rhs.scheduledServiceFrequency)||((this.scheduledServiceFrequency!= null)&&this.scheduledServiceFrequency.equals(rhs.scheduledServiceFrequency))));
    }

}
