
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
 * Transport Means. Details
 * <p>
 * A class to describe a particular vehicle or vessel used for the conveyance of goods or persons.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "JourneyID",
    "RegistrationNationalityID",
    "RegistrationNationality",
    "DirectionCode",
    "TransportMeansTypeCode",
    "TradeServiceCode",
    "Stowage",
    "AirTransport",
    "RoadTransport",
    "RailTransport",
    "MaritimeTransport",
    "OwnerParty",
    "MeasurementDimension"
})
@Generated("jsonschema2pojo")
public class TransportMeans {

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
     * Transport Means. Journey Identifier. Identifier
     * <p>
     * An identifier for the regular service schedule of this means of transport.
     * 
     */
    @JsonProperty("JourneyID")
    @JsonPropertyDescription("An identifier for the regular service schedule of this means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> journeyID = new ArrayList<IdentifierType>();
    /**
     * Transport Means. Registration_ Nationality Identifier. Identifier
     * <p>
     * An identifier for the country in which this means of transport is registered.
     * 
     */
    @JsonProperty("RegistrationNationalityID")
    @JsonPropertyDescription("An identifier for the country in which this means of transport is registered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> registrationNationalityID = new ArrayList<IdentifierType>();
    /**
     * Transport Means. Registration_ Nationality. Text
     * <p>
     * Text describing the country in which this means of transport is registered.
     * 
     */
    @JsonProperty("RegistrationNationality")
    @JsonPropertyDescription("Text describing the country in which this means of transport is registered.")
    @Size(min = 1)
    @Valid
    private List<TextType> registrationNationality = new ArrayList<TextType>();
    /**
     * Transport Means. Direction Code. Code
     * <p>
     * A code signifying the direction of this means of transport.
     * 
     */
    @JsonProperty("DirectionCode")
    @JsonPropertyDescription("A code signifying the direction of this means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> directionCode = new ArrayList<CodeType>();
    /**
     * Transport Means. Transport Means Type Code. Code
     * <p>
     * A code signifying the type of this means of transport (truck, vessel, etc.).
     * 
     */
    @JsonProperty("TransportMeansTypeCode")
    @JsonPropertyDescription("A code signifying the type of this means of transport (truck, vessel, etc.).")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportMeansTypeCode = new ArrayList<CodeType>();
    /**
     * Transport Means. Trade Service Code. Code
     * <p>
     * A code signifying the service regularly provided by the carrier operating this means of transport.
     * 
     */
    @JsonProperty("TradeServiceCode")
    @JsonPropertyDescription("A code signifying the service regularly provided by the carrier operating this means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> tradeServiceCode = new ArrayList<CodeType>();
    /**
     * Transport Means. Stowage
     * <p>
     * The location within the means of transport where goods are to be or have been stowed.
     * 
     */
    @JsonProperty("Stowage")
    @JsonPropertyDescription("The location within the means of transport where goods are to be or have been stowed.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Stowage> stowage = new ArrayList<Stowage>();
    /**
     * Transport Means. Air Transport
     * <p>
     * An aircraft used for transport.
     * 
     */
    @JsonProperty("AirTransport")
    @JsonPropertyDescription("An aircraft used for transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<AirTransport> airTransport = new ArrayList<AirTransport>();
    /**
     * Transport Means. Road Transport
     * <p>
     * A vehicle used for road transport.
     * 
     */
    @JsonProperty("RoadTransport")
    @JsonPropertyDescription("A vehicle used for road transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<RoadTransport> roadTransport = new ArrayList<RoadTransport>();
    /**
     * Transport Means. Rail Transport
     * <p>
     * Equipment used for rail transport.
     * 
     */
    @JsonProperty("RailTransport")
    @JsonPropertyDescription("Equipment used for rail transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<RailTransport> railTransport = new ArrayList<RailTransport>();
    /**
     * Transport Means. Maritime Transport
     * <p>
     * A vessel used for transport by water (not only by sea).
     * 
     */
    @JsonProperty("MaritimeTransport")
    @JsonPropertyDescription("A vessel used for transport by water (not only by sea).")
    @Size(min = 1, max = 1)
    @Valid
    private List<MaritimeTransport> maritimeTransport = new ArrayList<MaritimeTransport>();
    /**
     * Transport Means. Owner_ Party. Party
     * <p>
     * The party that owns this means of transport.
     * 
     */
    @JsonProperty("OwnerParty")
    @JsonPropertyDescription("The party that owns this means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> ownerParty = new ArrayList<Party>();
    /**
     * Transport Means. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this means of transport.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of this means of transport.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();

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

    public TransportMeans withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transport Means. Journey Identifier. Identifier
     * <p>
     * An identifier for the regular service schedule of this means of transport.
     * 
     */
    @JsonProperty("JourneyID")
    public List<IdentifierType> getJourneyID() {
        return journeyID;
    }

    /**
     * Transport Means. Journey Identifier. Identifier
     * <p>
     * An identifier for the regular service schedule of this means of transport.
     * 
     */
    @JsonProperty("JourneyID")
    public void setJourneyID(List<IdentifierType> journeyID) {
        this.journeyID = journeyID;
    }

    public TransportMeans withJourneyID(List<IdentifierType> journeyID) {
        this.journeyID = journeyID;
        return this;
    }

    /**
     * Transport Means. Registration_ Nationality Identifier. Identifier
     * <p>
     * An identifier for the country in which this means of transport is registered.
     * 
     */
    @JsonProperty("RegistrationNationalityID")
    public List<IdentifierType> getRegistrationNationalityID() {
        return registrationNationalityID;
    }

    /**
     * Transport Means. Registration_ Nationality Identifier. Identifier
     * <p>
     * An identifier for the country in which this means of transport is registered.
     * 
     */
    @JsonProperty("RegistrationNationalityID")
    public void setRegistrationNationalityID(List<IdentifierType> registrationNationalityID) {
        this.registrationNationalityID = registrationNationalityID;
    }

    public TransportMeans withRegistrationNationalityID(List<IdentifierType> registrationNationalityID) {
        this.registrationNationalityID = registrationNationalityID;
        return this;
    }

    /**
     * Transport Means. Registration_ Nationality. Text
     * <p>
     * Text describing the country in which this means of transport is registered.
     * 
     */
    @JsonProperty("RegistrationNationality")
    public List<TextType> getRegistrationNationality() {
        return registrationNationality;
    }

    /**
     * Transport Means. Registration_ Nationality. Text
     * <p>
     * Text describing the country in which this means of transport is registered.
     * 
     */
    @JsonProperty("RegistrationNationality")
    public void setRegistrationNationality(List<TextType> registrationNationality) {
        this.registrationNationality = registrationNationality;
    }

    public TransportMeans withRegistrationNationality(List<TextType> registrationNationality) {
        this.registrationNationality = registrationNationality;
        return this;
    }

    /**
     * Transport Means. Direction Code. Code
     * <p>
     * A code signifying the direction of this means of transport.
     * 
     */
    @JsonProperty("DirectionCode")
    public List<CodeType> getDirectionCode() {
        return directionCode;
    }

    /**
     * Transport Means. Direction Code. Code
     * <p>
     * A code signifying the direction of this means of transport.
     * 
     */
    @JsonProperty("DirectionCode")
    public void setDirectionCode(List<CodeType> directionCode) {
        this.directionCode = directionCode;
    }

    public TransportMeans withDirectionCode(List<CodeType> directionCode) {
        this.directionCode = directionCode;
        return this;
    }

    /**
     * Transport Means. Transport Means Type Code. Code
     * <p>
     * A code signifying the type of this means of transport (truck, vessel, etc.).
     * 
     */
    @JsonProperty("TransportMeansTypeCode")
    public List<CodeType> getTransportMeansTypeCode() {
        return transportMeansTypeCode;
    }

    /**
     * Transport Means. Transport Means Type Code. Code
     * <p>
     * A code signifying the type of this means of transport (truck, vessel, etc.).
     * 
     */
    @JsonProperty("TransportMeansTypeCode")
    public void setTransportMeansTypeCode(List<CodeType> transportMeansTypeCode) {
        this.transportMeansTypeCode = transportMeansTypeCode;
    }

    public TransportMeans withTransportMeansTypeCode(List<CodeType> transportMeansTypeCode) {
        this.transportMeansTypeCode = transportMeansTypeCode;
        return this;
    }

    /**
     * Transport Means. Trade Service Code. Code
     * <p>
     * A code signifying the service regularly provided by the carrier operating this means of transport.
     * 
     */
    @JsonProperty("TradeServiceCode")
    public List<CodeType> getTradeServiceCode() {
        return tradeServiceCode;
    }

    /**
     * Transport Means. Trade Service Code. Code
     * <p>
     * A code signifying the service regularly provided by the carrier operating this means of transport.
     * 
     */
    @JsonProperty("TradeServiceCode")
    public void setTradeServiceCode(List<CodeType> tradeServiceCode) {
        this.tradeServiceCode = tradeServiceCode;
    }

    public TransportMeans withTradeServiceCode(List<CodeType> tradeServiceCode) {
        this.tradeServiceCode = tradeServiceCode;
        return this;
    }

    /**
     * Transport Means. Stowage
     * <p>
     * The location within the means of transport where goods are to be or have been stowed.
     * 
     */
    @JsonProperty("Stowage")
    public List<Stowage> getStowage() {
        return stowage;
    }

    /**
     * Transport Means. Stowage
     * <p>
     * The location within the means of transport where goods are to be or have been stowed.
     * 
     */
    @JsonProperty("Stowage")
    public void setStowage(List<Stowage> stowage) {
        this.stowage = stowage;
    }

    public TransportMeans withStowage(List<Stowage> stowage) {
        this.stowage = stowage;
        return this;
    }

    /**
     * Transport Means. Air Transport
     * <p>
     * An aircraft used for transport.
     * 
     */
    @JsonProperty("AirTransport")
    public List<AirTransport> getAirTransport() {
        return airTransport;
    }

    /**
     * Transport Means. Air Transport
     * <p>
     * An aircraft used for transport.
     * 
     */
    @JsonProperty("AirTransport")
    public void setAirTransport(List<AirTransport> airTransport) {
        this.airTransport = airTransport;
    }

    public TransportMeans withAirTransport(List<AirTransport> airTransport) {
        this.airTransport = airTransport;
        return this;
    }

    /**
     * Transport Means. Road Transport
     * <p>
     * A vehicle used for road transport.
     * 
     */
    @JsonProperty("RoadTransport")
    public List<RoadTransport> getRoadTransport() {
        return roadTransport;
    }

    /**
     * Transport Means. Road Transport
     * <p>
     * A vehicle used for road transport.
     * 
     */
    @JsonProperty("RoadTransport")
    public void setRoadTransport(List<RoadTransport> roadTransport) {
        this.roadTransport = roadTransport;
    }

    public TransportMeans withRoadTransport(List<RoadTransport> roadTransport) {
        this.roadTransport = roadTransport;
        return this;
    }

    /**
     * Transport Means. Rail Transport
     * <p>
     * Equipment used for rail transport.
     * 
     */
    @JsonProperty("RailTransport")
    public List<RailTransport> getRailTransport() {
        return railTransport;
    }

    /**
     * Transport Means. Rail Transport
     * <p>
     * Equipment used for rail transport.
     * 
     */
    @JsonProperty("RailTransport")
    public void setRailTransport(List<RailTransport> railTransport) {
        this.railTransport = railTransport;
    }

    public TransportMeans withRailTransport(List<RailTransport> railTransport) {
        this.railTransport = railTransport;
        return this;
    }

    /**
     * Transport Means. Maritime Transport
     * <p>
     * A vessel used for transport by water (not only by sea).
     * 
     */
    @JsonProperty("MaritimeTransport")
    public List<MaritimeTransport> getMaritimeTransport() {
        return maritimeTransport;
    }

    /**
     * Transport Means. Maritime Transport
     * <p>
     * A vessel used for transport by water (not only by sea).
     * 
     */
    @JsonProperty("MaritimeTransport")
    public void setMaritimeTransport(List<MaritimeTransport> maritimeTransport) {
        this.maritimeTransport = maritimeTransport;
    }

    public TransportMeans withMaritimeTransport(List<MaritimeTransport> maritimeTransport) {
        this.maritimeTransport = maritimeTransport;
        return this;
    }

    /**
     * Transport Means. Owner_ Party. Party
     * <p>
     * The party that owns this means of transport.
     * 
     */
    @JsonProperty("OwnerParty")
    public List<Party> getOwnerParty() {
        return ownerParty;
    }

    /**
     * Transport Means. Owner_ Party. Party
     * <p>
     * The party that owns this means of transport.
     * 
     */
    @JsonProperty("OwnerParty")
    public void setOwnerParty(List<Party> ownerParty) {
        this.ownerParty = ownerParty;
    }

    public TransportMeans withOwnerParty(List<Party> ownerParty) {
        this.ownerParty = ownerParty;
        return this;
    }

    /**
     * Transport Means. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this means of transport.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Transport Means. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this means of transport.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public TransportMeans withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransportMeans.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("journeyID");
        sb.append('=');
        sb.append(((this.journeyID == null)?"<null>":this.journeyID));
        sb.append(',');
        sb.append("registrationNationalityID");
        sb.append('=');
        sb.append(((this.registrationNationalityID == null)?"<null>":this.registrationNationalityID));
        sb.append(',');
        sb.append("registrationNationality");
        sb.append('=');
        sb.append(((this.registrationNationality == null)?"<null>":this.registrationNationality));
        sb.append(',');
        sb.append("directionCode");
        sb.append('=');
        sb.append(((this.directionCode == null)?"<null>":this.directionCode));
        sb.append(',');
        sb.append("transportMeansTypeCode");
        sb.append('=');
        sb.append(((this.transportMeansTypeCode == null)?"<null>":this.transportMeansTypeCode));
        sb.append(',');
        sb.append("tradeServiceCode");
        sb.append('=');
        sb.append(((this.tradeServiceCode == null)?"<null>":this.tradeServiceCode));
        sb.append(',');
        sb.append("stowage");
        sb.append('=');
        sb.append(((this.stowage == null)?"<null>":this.stowage));
        sb.append(',');
        sb.append("airTransport");
        sb.append('=');
        sb.append(((this.airTransport == null)?"<null>":this.airTransport));
        sb.append(',');
        sb.append("roadTransport");
        sb.append('=');
        sb.append(((this.roadTransport == null)?"<null>":this.roadTransport));
        sb.append(',');
        sb.append("railTransport");
        sb.append('=');
        sb.append(((this.railTransport == null)?"<null>":this.railTransport));
        sb.append(',');
        sb.append("maritimeTransport");
        sb.append('=');
        sb.append(((this.maritimeTransport == null)?"<null>":this.maritimeTransport));
        sb.append(',');
        sb.append("ownerParty");
        sb.append('=');
        sb.append(((this.ownerParty == null)?"<null>":this.ownerParty));
        sb.append(',');
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
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
        result = ((result* 31)+((this.maritimeTransport == null)? 0 :this.maritimeTransport.hashCode()));
        result = ((result* 31)+((this.stowage == null)? 0 :this.stowage.hashCode()));
        result = ((result* 31)+((this.roadTransport == null)? 0 :this.roadTransport.hashCode()));
        result = ((result* 31)+((this.ownerParty == null)? 0 :this.ownerParty.hashCode()));
        result = ((result* 31)+((this.journeyID == null)? 0 :this.journeyID.hashCode()));
        result = ((result* 31)+((this.registrationNationality == null)? 0 :this.registrationNationality.hashCode()));
        result = ((result* 31)+((this.directionCode == null)? 0 :this.directionCode.hashCode()));
        result = ((result* 31)+((this.transportMeansTypeCode == null)? 0 :this.transportMeansTypeCode.hashCode()));
        result = ((result* 31)+((this.railTransport == null)? 0 :this.railTransport.hashCode()));
        result = ((result* 31)+((this.tradeServiceCode == null)? 0 :this.tradeServiceCode.hashCode()));
        result = ((result* 31)+((this.registrationNationalityID == null)? 0 :this.registrationNationalityID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.airTransport == null)? 0 :this.airTransport.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransportMeans) == false) {
            return false;
        }
        TransportMeans rhs = ((TransportMeans) other);
        return (((((((((((((((this.maritimeTransport == rhs.maritimeTransport)||((this.maritimeTransport!= null)&&this.maritimeTransport.equals(rhs.maritimeTransport)))&&((this.stowage == rhs.stowage)||((this.stowage!= null)&&this.stowage.equals(rhs.stowage))))&&((this.roadTransport == rhs.roadTransport)||((this.roadTransport!= null)&&this.roadTransport.equals(rhs.roadTransport))))&&((this.ownerParty == rhs.ownerParty)||((this.ownerParty!= null)&&this.ownerParty.equals(rhs.ownerParty))))&&((this.journeyID == rhs.journeyID)||((this.journeyID!= null)&&this.journeyID.equals(rhs.journeyID))))&&((this.registrationNationality == rhs.registrationNationality)||((this.registrationNationality!= null)&&this.registrationNationality.equals(rhs.registrationNationality))))&&((this.directionCode == rhs.directionCode)||((this.directionCode!= null)&&this.directionCode.equals(rhs.directionCode))))&&((this.transportMeansTypeCode == rhs.transportMeansTypeCode)||((this.transportMeansTypeCode!= null)&&this.transportMeansTypeCode.equals(rhs.transportMeansTypeCode))))&&((this.railTransport == rhs.railTransport)||((this.railTransport!= null)&&this.railTransport.equals(rhs.railTransport))))&&((this.tradeServiceCode == rhs.tradeServiceCode)||((this.tradeServiceCode!= null)&&this.tradeServiceCode.equals(rhs.tradeServiceCode))))&&((this.registrationNationalityID == rhs.registrationNationalityID)||((this.registrationNationalityID!= null)&&this.registrationNationalityID.equals(rhs.registrationNationalityID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.airTransport == rhs.airTransport)||((this.airTransport!= null)&&this.airTransport.equals(rhs.airTransport))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))));
    }

}
