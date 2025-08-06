
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
 * Hazardous Goods Transit. Details
 * <p>
 * A class to describe hazardous goods in transit.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "TransportEmergencyCardCode",
    "PackingCriteriaCode",
    "HazardousRegulationCode",
    "InhalationToxicityZoneCode",
    "TransportAuthorizationCode",
    "MaximumTemperature",
    "MinimumTemperature"
})
@Generated("jsonschema2pojo")
public class HazardousGoodsTransit {

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
     * Hazardous Goods Transit. Transport Emergency Card Code. Code
     * <p>
     * An identifier for a transport emergency card describing the actions to be taken in an emergency in transporting the hazardous goods. It may be the identity number of a hazardous emergency response plan assigned by the appropriate authority.
     * 
     */
    @JsonProperty("TransportEmergencyCardCode")
    @JsonPropertyDescription("An identifier for a transport emergency card describing the actions to be taken in an emergency in transporting the hazardous goods. It may be the identity number of a hazardous emergency response plan assigned by the appropriate authority.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportEmergencyCardCode = new ArrayList<CodeType>();
    /**
     * Hazardous Goods Transit. Packing Criteria Code. Code
     * <p>
     * A code signifying the packaging requirement for transportation of the hazardous goods as assigned by IATA, IMDB, ADR, RID etc.
     * 
     */
    @JsonProperty("PackingCriteriaCode")
    @JsonPropertyDescription("A code signifying the packaging requirement for transportation of the hazardous goods as assigned by IATA, IMDB, ADR, RID etc.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> packingCriteriaCode = new ArrayList<CodeType>();
    /**
     * Hazardous Goods Transit. Hazardous Regulation Code. Code
     * <p>
     * A code signifying the set of legal regulations governing the transportation of the hazardous goods.
     * 
     */
    @JsonProperty("HazardousRegulationCode")
    @JsonPropertyDescription("A code signifying the set of legal regulations governing the transportation of the hazardous goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> hazardousRegulationCode = new ArrayList<CodeType>();
    /**
     * Hazardous Goods Transit. Inhalation Toxicity Zone Code. Code
     * <p>
     * A code signifying the Inhalation Toxicity Hazard Zone for the hazardous goods, as defined by the US Department of Transportation.
     * 
     */
    @JsonProperty("InhalationToxicityZoneCode")
    @JsonPropertyDescription("A code signifying the Inhalation Toxicity Hazard Zone for the hazardous goods, as defined by the US Department of Transportation.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> inhalationToxicityZoneCode = new ArrayList<CodeType>();
    /**
     * Hazardous Goods Transit. Transport Authorization Code. Code
     * <p>
     * A code signifying authorization for the transportation of hazardous cargo.
     * 
     */
    @JsonProperty("TransportAuthorizationCode")
    @JsonPropertyDescription("A code signifying authorization for the transportation of hazardous cargo.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> transportAuthorizationCode = new ArrayList<CodeType>();
    /**
     * Hazardous Goods Transit. Maximum_ Temperature. Temperature
     * <p>
     * The maximum temperature at which the hazardous goods can safely be transported.
     * 
     */
    @JsonProperty("MaximumTemperature")
    @JsonPropertyDescription("The maximum temperature at which the hazardous goods can safely be transported.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> maximumTemperature = new ArrayList<Temperature>();
    /**
     * Hazardous Goods Transit. Minimum_ Temperature. Temperature
     * <p>
     * The minimum temperature at which the hazardous goods can safely be transported.
     * 
     */
    @JsonProperty("MinimumTemperature")
    @JsonPropertyDescription("The minimum temperature at which the hazardous goods can safely be transported.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> minimumTemperature = new ArrayList<Temperature>();

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

    public HazardousGoodsTransit withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Hazardous Goods Transit. Transport Emergency Card Code. Code
     * <p>
     * An identifier for a transport emergency card describing the actions to be taken in an emergency in transporting the hazardous goods. It may be the identity number of a hazardous emergency response plan assigned by the appropriate authority.
     * 
     */
    @JsonProperty("TransportEmergencyCardCode")
    public List<CodeType> getTransportEmergencyCardCode() {
        return transportEmergencyCardCode;
    }

    /**
     * Hazardous Goods Transit. Transport Emergency Card Code. Code
     * <p>
     * An identifier for a transport emergency card describing the actions to be taken in an emergency in transporting the hazardous goods. It may be the identity number of a hazardous emergency response plan assigned by the appropriate authority.
     * 
     */
    @JsonProperty("TransportEmergencyCardCode")
    public void setTransportEmergencyCardCode(List<CodeType> transportEmergencyCardCode) {
        this.transportEmergencyCardCode = transportEmergencyCardCode;
    }

    public HazardousGoodsTransit withTransportEmergencyCardCode(List<CodeType> transportEmergencyCardCode) {
        this.transportEmergencyCardCode = transportEmergencyCardCode;
        return this;
    }

    /**
     * Hazardous Goods Transit. Packing Criteria Code. Code
     * <p>
     * A code signifying the packaging requirement for transportation of the hazardous goods as assigned by IATA, IMDB, ADR, RID etc.
     * 
     */
    @JsonProperty("PackingCriteriaCode")
    public List<CodeType> getPackingCriteriaCode() {
        return packingCriteriaCode;
    }

    /**
     * Hazardous Goods Transit. Packing Criteria Code. Code
     * <p>
     * A code signifying the packaging requirement for transportation of the hazardous goods as assigned by IATA, IMDB, ADR, RID etc.
     * 
     */
    @JsonProperty("PackingCriteriaCode")
    public void setPackingCriteriaCode(List<CodeType> packingCriteriaCode) {
        this.packingCriteriaCode = packingCriteriaCode;
    }

    public HazardousGoodsTransit withPackingCriteriaCode(List<CodeType> packingCriteriaCode) {
        this.packingCriteriaCode = packingCriteriaCode;
        return this;
    }

    /**
     * Hazardous Goods Transit. Hazardous Regulation Code. Code
     * <p>
     * A code signifying the set of legal regulations governing the transportation of the hazardous goods.
     * 
     */
    @JsonProperty("HazardousRegulationCode")
    public List<CodeType> getHazardousRegulationCode() {
        return hazardousRegulationCode;
    }

    /**
     * Hazardous Goods Transit. Hazardous Regulation Code. Code
     * <p>
     * A code signifying the set of legal regulations governing the transportation of the hazardous goods.
     * 
     */
    @JsonProperty("HazardousRegulationCode")
    public void setHazardousRegulationCode(List<CodeType> hazardousRegulationCode) {
        this.hazardousRegulationCode = hazardousRegulationCode;
    }

    public HazardousGoodsTransit withHazardousRegulationCode(List<CodeType> hazardousRegulationCode) {
        this.hazardousRegulationCode = hazardousRegulationCode;
        return this;
    }

    /**
     * Hazardous Goods Transit. Inhalation Toxicity Zone Code. Code
     * <p>
     * A code signifying the Inhalation Toxicity Hazard Zone for the hazardous goods, as defined by the US Department of Transportation.
     * 
     */
    @JsonProperty("InhalationToxicityZoneCode")
    public List<CodeType> getInhalationToxicityZoneCode() {
        return inhalationToxicityZoneCode;
    }

    /**
     * Hazardous Goods Transit. Inhalation Toxicity Zone Code. Code
     * <p>
     * A code signifying the Inhalation Toxicity Hazard Zone for the hazardous goods, as defined by the US Department of Transportation.
     * 
     */
    @JsonProperty("InhalationToxicityZoneCode")
    public void setInhalationToxicityZoneCode(List<CodeType> inhalationToxicityZoneCode) {
        this.inhalationToxicityZoneCode = inhalationToxicityZoneCode;
    }

    public HazardousGoodsTransit withInhalationToxicityZoneCode(List<CodeType> inhalationToxicityZoneCode) {
        this.inhalationToxicityZoneCode = inhalationToxicityZoneCode;
        return this;
    }

    /**
     * Hazardous Goods Transit. Transport Authorization Code. Code
     * <p>
     * A code signifying authorization for the transportation of hazardous cargo.
     * 
     */
    @JsonProperty("TransportAuthorizationCode")
    public List<CodeType> getTransportAuthorizationCode() {
        return transportAuthorizationCode;
    }

    /**
     * Hazardous Goods Transit. Transport Authorization Code. Code
     * <p>
     * A code signifying authorization for the transportation of hazardous cargo.
     * 
     */
    @JsonProperty("TransportAuthorizationCode")
    public void setTransportAuthorizationCode(List<CodeType> transportAuthorizationCode) {
        this.transportAuthorizationCode = transportAuthorizationCode;
    }

    public HazardousGoodsTransit withTransportAuthorizationCode(List<CodeType> transportAuthorizationCode) {
        this.transportAuthorizationCode = transportAuthorizationCode;
        return this;
    }

    /**
     * Hazardous Goods Transit. Maximum_ Temperature. Temperature
     * <p>
     * The maximum temperature at which the hazardous goods can safely be transported.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public List<Temperature> getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Hazardous Goods Transit. Maximum_ Temperature. Temperature
     * <p>
     * The maximum temperature at which the hazardous goods can safely be transported.
     * 
     */
    @JsonProperty("MaximumTemperature")
    public void setMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public HazardousGoodsTransit withMaximumTemperature(List<Temperature> maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
        return this;
    }

    /**
     * Hazardous Goods Transit. Minimum_ Temperature. Temperature
     * <p>
     * The minimum temperature at which the hazardous goods can safely be transported.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public List<Temperature> getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Hazardous Goods Transit. Minimum_ Temperature. Temperature
     * <p>
     * The minimum temperature at which the hazardous goods can safely be transported.
     * 
     */
    @JsonProperty("MinimumTemperature")
    public void setMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public HazardousGoodsTransit withMinimumTemperature(List<Temperature> minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HazardousGoodsTransit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("transportEmergencyCardCode");
        sb.append('=');
        sb.append(((this.transportEmergencyCardCode == null)?"<null>":this.transportEmergencyCardCode));
        sb.append(',');
        sb.append("packingCriteriaCode");
        sb.append('=');
        sb.append(((this.packingCriteriaCode == null)?"<null>":this.packingCriteriaCode));
        sb.append(',');
        sb.append("hazardousRegulationCode");
        sb.append('=');
        sb.append(((this.hazardousRegulationCode == null)?"<null>":this.hazardousRegulationCode));
        sb.append(',');
        sb.append("inhalationToxicityZoneCode");
        sb.append('=');
        sb.append(((this.inhalationToxicityZoneCode == null)?"<null>":this.inhalationToxicityZoneCode));
        sb.append(',');
        sb.append("transportAuthorizationCode");
        sb.append('=');
        sb.append(((this.transportAuthorizationCode == null)?"<null>":this.transportAuthorizationCode));
        sb.append(',');
        sb.append("maximumTemperature");
        sb.append('=');
        sb.append(((this.maximumTemperature == null)?"<null>":this.maximumTemperature));
        sb.append(',');
        sb.append("minimumTemperature");
        sb.append('=');
        sb.append(((this.minimumTemperature == null)?"<null>":this.minimumTemperature));
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
        result = ((result* 31)+((this.packingCriteriaCode == null)? 0 :this.packingCriteriaCode.hashCode()));
        result = ((result* 31)+((this.transportEmergencyCardCode == null)? 0 :this.transportEmergencyCardCode.hashCode()));
        result = ((result* 31)+((this.transportAuthorizationCode == null)? 0 :this.transportAuthorizationCode.hashCode()));
        result = ((result* 31)+((this.maximumTemperature == null)? 0 :this.maximumTemperature.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.hazardousRegulationCode == null)? 0 :this.hazardousRegulationCode.hashCode()));
        result = ((result* 31)+((this.minimumTemperature == null)? 0 :this.minimumTemperature.hashCode()));
        result = ((result* 31)+((this.inhalationToxicityZoneCode == null)? 0 :this.inhalationToxicityZoneCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HazardousGoodsTransit) == false) {
            return false;
        }
        HazardousGoodsTransit rhs = ((HazardousGoodsTransit) other);
        return (((((((((this.packingCriteriaCode == rhs.packingCriteriaCode)||((this.packingCriteriaCode!= null)&&this.packingCriteriaCode.equals(rhs.packingCriteriaCode)))&&((this.transportEmergencyCardCode == rhs.transportEmergencyCardCode)||((this.transportEmergencyCardCode!= null)&&this.transportEmergencyCardCode.equals(rhs.transportEmergencyCardCode))))&&((this.transportAuthorizationCode == rhs.transportAuthorizationCode)||((this.transportAuthorizationCode!= null)&&this.transportAuthorizationCode.equals(rhs.transportAuthorizationCode))))&&((this.maximumTemperature == rhs.maximumTemperature)||((this.maximumTemperature!= null)&&this.maximumTemperature.equals(rhs.maximumTemperature))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.hazardousRegulationCode == rhs.hazardousRegulationCode)||((this.hazardousRegulationCode!= null)&&this.hazardousRegulationCode.equals(rhs.hazardousRegulationCode))))&&((this.minimumTemperature == rhs.minimumTemperature)||((this.minimumTemperature!= null)&&this.minimumTemperature.equals(rhs.minimumTemperature))))&&((this.inhalationToxicityZoneCode == rhs.inhalationToxicityZoneCode)||((this.inhalationToxicityZoneCode!= null)&&this.inhalationToxicityZoneCode.equals(rhs.inhalationToxicityZoneCode))));
    }

}
