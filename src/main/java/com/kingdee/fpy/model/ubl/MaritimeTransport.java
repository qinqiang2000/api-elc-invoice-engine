
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
 * Maritime Transport. Details
 * <p>
 * A class to describe a vessel used for transport by water (including sea, river, and canal).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "VesselID",
    "VesselName",
    "RadioCallSignID",
    "ShipsRequirements",
    "GrossTonnageMeasure",
    "NetTonnageMeasure",
    "RegistryCertificateDocumentReference",
    "RegistryPortLocation"
})
@Generated("jsonschema2pojo")
public class MaritimeTransport {

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
     * Maritime Transport. Vessel Identifier. Identifier
     * <p>
     * An identifier for a specific vessel.
     * 
     */
    @JsonProperty("VesselID")
    @JsonPropertyDescription("An identifier for a specific vessel.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> vesselID = new ArrayList<IdentifierType>();
    /**
     * Maritime Transport. Vessel Name. Name
     * <p>
     * The name of the vessel.
     * 
     */
    @JsonProperty("VesselName")
    @JsonPropertyDescription("The name of the vessel.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> vesselName = new ArrayList<TextType>();
    /**
     * Maritime Transport. Radio Call Sign Identifier. Identifier
     * <p>
     * The radio call sign of the vessel.
     * 
     */
    @JsonProperty("RadioCallSignID")
    @JsonPropertyDescription("The radio call sign of the vessel.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> radioCallSignID = new ArrayList<IdentifierType>();
    /**
     * Maritime Transport. Ships Requirements. Text
     * <p>
     * Information about what services a vessel will require when it arrives at a port, such as refueling, maintenance, waste disposal etc.
     * 
     */
    @JsonProperty("ShipsRequirements")
    @JsonPropertyDescription("Information about what services a vessel will require when it arrives at a port, such as refueling, maintenance, waste disposal etc.")
    @Size(min = 1)
    @Valid
    private List<TextType> shipsRequirements = new ArrayList<TextType>();
    /**
     * Maritime Transport. Gross Tonnage. Measure
     * <p>
     * Gross tonnage is calculated by measuring a ship's volume (from keel to funnel, to the outside of the hull framing) and applying a mathematical formula and is used to determine things such as a ship's manning regulations, safety rules, registration fees and port dues.
     * 
     */
    @JsonProperty("GrossTonnageMeasure")
    @JsonPropertyDescription("Gross tonnage is calculated by measuring a ship's volume (from keel to funnel, to the outside of the hull framing) and applying a mathematical formula and is used to determine things such as a ship's manning regulations, safety rules, registration fees and port dues.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> grossTonnageMeasure = new ArrayList<MeasureType>();
    /**
     * Maritime Transport. Net Tonnage. Measure
     * <p>
     * Net tonnage is calculated by measuring a ship's internal volume and applying a mathematical formula and is used to calculate the port duties.
     * 
     */
    @JsonProperty("NetTonnageMeasure")
    @JsonPropertyDescription("Net tonnage is calculated by measuring a ship's internal volume and applying a mathematical formula and is used to calculate the port duties.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netTonnageMeasure = new ArrayList<MeasureType>();
    /**
     * Maritime Transport. Registry Certificate_ Document Reference. Document Reference
     * <p>
     * The certificate issued to the ship by the ships registry in a given flag state.
     * 
     */
    @JsonProperty("RegistryCertificateDocumentReference")
    @JsonPropertyDescription("The certificate issued to the ship by the ships registry in a given flag state.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> registryCertificateDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Maritime Transport. Registry Port_ Location. Location
     * <p>
     * The port in which a vessel is registered or permanently based.
     * 
     */
    @JsonProperty("RegistryPortLocation")
    @JsonPropertyDescription("The port in which a vessel is registered or permanently based.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Location> registryPortLocation = new ArrayList<Location>();

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

    public MaritimeTransport withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Maritime Transport. Vessel Identifier. Identifier
     * <p>
     * An identifier for a specific vessel.
     * 
     */
    @JsonProperty("VesselID")
    public List<IdentifierType> getVesselID() {
        return vesselID;
    }

    /**
     * Maritime Transport. Vessel Identifier. Identifier
     * <p>
     * An identifier for a specific vessel.
     * 
     */
    @JsonProperty("VesselID")
    public void setVesselID(List<IdentifierType> vesselID) {
        this.vesselID = vesselID;
    }

    public MaritimeTransport withVesselID(List<IdentifierType> vesselID) {
        this.vesselID = vesselID;
        return this;
    }

    /**
     * Maritime Transport. Vessel Name. Name
     * <p>
     * The name of the vessel.
     * 
     */
    @JsonProperty("VesselName")
    public List<TextType> getVesselName() {
        return vesselName;
    }

    /**
     * Maritime Transport. Vessel Name. Name
     * <p>
     * The name of the vessel.
     * 
     */
    @JsonProperty("VesselName")
    public void setVesselName(List<TextType> vesselName) {
        this.vesselName = vesselName;
    }

    public MaritimeTransport withVesselName(List<TextType> vesselName) {
        this.vesselName = vesselName;
        return this;
    }

    /**
     * Maritime Transport. Radio Call Sign Identifier. Identifier
     * <p>
     * The radio call sign of the vessel.
     * 
     */
    @JsonProperty("RadioCallSignID")
    public List<IdentifierType> getRadioCallSignID() {
        return radioCallSignID;
    }

    /**
     * Maritime Transport. Radio Call Sign Identifier. Identifier
     * <p>
     * The radio call sign of the vessel.
     * 
     */
    @JsonProperty("RadioCallSignID")
    public void setRadioCallSignID(List<IdentifierType> radioCallSignID) {
        this.radioCallSignID = radioCallSignID;
    }

    public MaritimeTransport withRadioCallSignID(List<IdentifierType> radioCallSignID) {
        this.radioCallSignID = radioCallSignID;
        return this;
    }

    /**
     * Maritime Transport. Ships Requirements. Text
     * <p>
     * Information about what services a vessel will require when it arrives at a port, such as refueling, maintenance, waste disposal etc.
     * 
     */
    @JsonProperty("ShipsRequirements")
    public List<TextType> getShipsRequirements() {
        return shipsRequirements;
    }

    /**
     * Maritime Transport. Ships Requirements. Text
     * <p>
     * Information about what services a vessel will require when it arrives at a port, such as refueling, maintenance, waste disposal etc.
     * 
     */
    @JsonProperty("ShipsRequirements")
    public void setShipsRequirements(List<TextType> shipsRequirements) {
        this.shipsRequirements = shipsRequirements;
    }

    public MaritimeTransport withShipsRequirements(List<TextType> shipsRequirements) {
        this.shipsRequirements = shipsRequirements;
        return this;
    }

    /**
     * Maritime Transport. Gross Tonnage. Measure
     * <p>
     * Gross tonnage is calculated by measuring a ship's volume (from keel to funnel, to the outside of the hull framing) and applying a mathematical formula and is used to determine things such as a ship's manning regulations, safety rules, registration fees and port dues.
     * 
     */
    @JsonProperty("GrossTonnageMeasure")
    public List<MeasureType> getGrossTonnageMeasure() {
        return grossTonnageMeasure;
    }

    /**
     * Maritime Transport. Gross Tonnage. Measure
     * <p>
     * Gross tonnage is calculated by measuring a ship's volume (from keel to funnel, to the outside of the hull framing) and applying a mathematical formula and is used to determine things such as a ship's manning regulations, safety rules, registration fees and port dues.
     * 
     */
    @JsonProperty("GrossTonnageMeasure")
    public void setGrossTonnageMeasure(List<MeasureType> grossTonnageMeasure) {
        this.grossTonnageMeasure = grossTonnageMeasure;
    }

    public MaritimeTransport withGrossTonnageMeasure(List<MeasureType> grossTonnageMeasure) {
        this.grossTonnageMeasure = grossTonnageMeasure;
        return this;
    }

    /**
     * Maritime Transport. Net Tonnage. Measure
     * <p>
     * Net tonnage is calculated by measuring a ship's internal volume and applying a mathematical formula and is used to calculate the port duties.
     * 
     */
    @JsonProperty("NetTonnageMeasure")
    public List<MeasureType> getNetTonnageMeasure() {
        return netTonnageMeasure;
    }

    /**
     * Maritime Transport. Net Tonnage. Measure
     * <p>
     * Net tonnage is calculated by measuring a ship's internal volume and applying a mathematical formula and is used to calculate the port duties.
     * 
     */
    @JsonProperty("NetTonnageMeasure")
    public void setNetTonnageMeasure(List<MeasureType> netTonnageMeasure) {
        this.netTonnageMeasure = netTonnageMeasure;
    }

    public MaritimeTransport withNetTonnageMeasure(List<MeasureType> netTonnageMeasure) {
        this.netTonnageMeasure = netTonnageMeasure;
        return this;
    }

    /**
     * Maritime Transport. Registry Certificate_ Document Reference. Document Reference
     * <p>
     * The certificate issued to the ship by the ships registry in a given flag state.
     * 
     */
    @JsonProperty("RegistryCertificateDocumentReference")
    public List<DocumentReference> getRegistryCertificateDocumentReference() {
        return registryCertificateDocumentReference;
    }

    /**
     * Maritime Transport. Registry Certificate_ Document Reference. Document Reference
     * <p>
     * The certificate issued to the ship by the ships registry in a given flag state.
     * 
     */
    @JsonProperty("RegistryCertificateDocumentReference")
    public void setRegistryCertificateDocumentReference(List<DocumentReference> registryCertificateDocumentReference) {
        this.registryCertificateDocumentReference = registryCertificateDocumentReference;
    }

    public MaritimeTransport withRegistryCertificateDocumentReference(List<DocumentReference> registryCertificateDocumentReference) {
        this.registryCertificateDocumentReference = registryCertificateDocumentReference;
        return this;
    }

    /**
     * Maritime Transport. Registry Port_ Location. Location
     * <p>
     * The port in which a vessel is registered or permanently based.
     * 
     */
    @JsonProperty("RegistryPortLocation")
    public List<Location> getRegistryPortLocation() {
        return registryPortLocation;
    }

    /**
     * Maritime Transport. Registry Port_ Location. Location
     * <p>
     * The port in which a vessel is registered or permanently based.
     * 
     */
    @JsonProperty("RegistryPortLocation")
    public void setRegistryPortLocation(List<Location> registryPortLocation) {
        this.registryPortLocation = registryPortLocation;
    }

    public MaritimeTransport withRegistryPortLocation(List<Location> registryPortLocation) {
        this.registryPortLocation = registryPortLocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MaritimeTransport.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("vesselID");
        sb.append('=');
        sb.append(((this.vesselID == null)?"<null>":this.vesselID));
        sb.append(',');
        sb.append("vesselName");
        sb.append('=');
        sb.append(((this.vesselName == null)?"<null>":this.vesselName));
        sb.append(',');
        sb.append("radioCallSignID");
        sb.append('=');
        sb.append(((this.radioCallSignID == null)?"<null>":this.radioCallSignID));
        sb.append(',');
        sb.append("shipsRequirements");
        sb.append('=');
        sb.append(((this.shipsRequirements == null)?"<null>":this.shipsRequirements));
        sb.append(',');
        sb.append("grossTonnageMeasure");
        sb.append('=');
        sb.append(((this.grossTonnageMeasure == null)?"<null>":this.grossTonnageMeasure));
        sb.append(',');
        sb.append("netTonnageMeasure");
        sb.append('=');
        sb.append(((this.netTonnageMeasure == null)?"<null>":this.netTonnageMeasure));
        sb.append(',');
        sb.append("registryCertificateDocumentReference");
        sb.append('=');
        sb.append(((this.registryCertificateDocumentReference == null)?"<null>":this.registryCertificateDocumentReference));
        sb.append(',');
        sb.append("registryPortLocation");
        sb.append('=');
        sb.append(((this.registryPortLocation == null)?"<null>":this.registryPortLocation));
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
        result = ((result* 31)+((this.vesselID == null)? 0 :this.vesselID.hashCode()));
        result = ((result* 31)+((this.registryCertificateDocumentReference == null)? 0 :this.registryCertificateDocumentReference.hashCode()));
        result = ((result* 31)+((this.radioCallSignID == null)? 0 :this.radioCallSignID.hashCode()));
        result = ((result* 31)+((this.grossTonnageMeasure == null)? 0 :this.grossTonnageMeasure.hashCode()));
        result = ((result* 31)+((this.shipsRequirements == null)? 0 :this.shipsRequirements.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.netTonnageMeasure == null)? 0 :this.netTonnageMeasure.hashCode()));
        result = ((result* 31)+((this.registryPortLocation == null)? 0 :this.registryPortLocation.hashCode()));
        result = ((result* 31)+((this.vesselName == null)? 0 :this.vesselName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MaritimeTransport) == false) {
            return false;
        }
        MaritimeTransport rhs = ((MaritimeTransport) other);
        return ((((((((((this.vesselID == rhs.vesselID)||((this.vesselID!= null)&&this.vesselID.equals(rhs.vesselID)))&&((this.registryCertificateDocumentReference == rhs.registryCertificateDocumentReference)||((this.registryCertificateDocumentReference!= null)&&this.registryCertificateDocumentReference.equals(rhs.registryCertificateDocumentReference))))&&((this.radioCallSignID == rhs.radioCallSignID)||((this.radioCallSignID!= null)&&this.radioCallSignID.equals(rhs.radioCallSignID))))&&((this.grossTonnageMeasure == rhs.grossTonnageMeasure)||((this.grossTonnageMeasure!= null)&&this.grossTonnageMeasure.equals(rhs.grossTonnageMeasure))))&&((this.shipsRequirements == rhs.shipsRequirements)||((this.shipsRequirements!= null)&&this.shipsRequirements.equals(rhs.shipsRequirements))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.netTonnageMeasure == rhs.netTonnageMeasure)||((this.netTonnageMeasure!= null)&&this.netTonnageMeasure.equals(rhs.netTonnageMeasure))))&&((this.registryPortLocation == rhs.registryPortLocation)||((this.registryPortLocation!= null)&&this.registryPortLocation.equals(rhs.registryPortLocation))))&&((this.vesselName == rhs.vesselName)||((this.vesselName!= null)&&this.vesselName.equals(rhs.vesselName))));
    }

}
