
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
 * Hazardous Item. Details
 * <p>
 * A class to describe a hazardous item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "PlacardNotation",
    "PlacardEndorsement",
    "AdditionalInformation",
    "UNDGCode",
    "EmergencyProceduresCode",
    "MedicalFirstAidGuideCode",
    "TechnicalName",
    "CategoryName",
    "HazardousCategoryCode",
    "UpperOrangeHazardPlacardID",
    "LowerOrangeHazardPlacardID",
    "MarkingID",
    "HazardClassID",
    "NetWeightMeasure",
    "NetVolumeMeasure",
    "Quantity",
    "ContactParty",
    "SecondaryHazard",
    "HazardousGoodsTransit",
    "EmergencyTemperature",
    "FlashpointTemperature",
    "AdditionalTemperature"
})
@Generated("jsonschema2pojo")
public class HazardousItem {

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
     * Hazardous Item. Identifier
     * <p>
     * An identifier for this hazardous item.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this hazardous item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Hazardous Item. Placard Notation. Text
     * <p>
     * Text of the placard notation corresponding to the hazard class of this hazardous item. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardNotation")
    @JsonPropertyDescription("Text of the placard notation corresponding to the hazard class of this hazardous item. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> placardNotation = new ArrayList<TextType>();
    /**
     * Hazardous Item. Placard Endorsement. Text
     * <p>
     * Text of the placard endorsement that is to be shown on the shipping papers for this hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardEndorsement")
    @JsonPropertyDescription("Text of the placard endorsement that is to be shown on the shipping papers for this hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> placardEndorsement = new ArrayList<TextType>();
    /**
     * Hazardous Item. Additional_ Information. Text
     * <p>
     * Text providing further information about the hazardous substance.
     * 
     */
    @JsonProperty("AdditionalInformation")
    @JsonPropertyDescription("Text providing further information about the hazardous substance.")
    @Size(min = 1)
    @Valid
    private List<TextType> additionalInformation = new ArrayList<TextType>();
    /**
     * Hazardous Item. UNDG Code. Code
     * <p>
     * The UN code for this kind of hazardous item.
     * 
     */
    @JsonProperty("UNDGCode")
    @JsonPropertyDescription("The UN code for this kind of hazardous item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> uNDGCode = new ArrayList<CodeType>();
    /**
     * Hazardous Item. Emergency Procedures Code. Code
     * <p>
     * A code signifying the emergency procedures for this hazardous item.
     * 
     */
    @JsonProperty("EmergencyProceduresCode")
    @JsonPropertyDescription("A code signifying the emergency procedures for this hazardous item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> emergencyProceduresCode = new ArrayList<CodeType>();
    /**
     * Hazardous Item. Medical First Aid Guide Code. Code
     * <p>
     * A code signifying a medical first aid guide appropriate to this hazardous item.
     * 
     */
    @JsonProperty("MedicalFirstAidGuideCode")
    @JsonPropertyDescription("A code signifying a medical first aid guide appropriate to this hazardous item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> medicalFirstAidGuideCode = new ArrayList<CodeType>();
    /**
     * Hazardous Item. Technical_ Name. Name
     * <p>
     * The full technical name of a specific hazardous substance contained in this goods item.
     * 
     */
    @JsonProperty("TechnicalName")
    @JsonPropertyDescription("The full technical name of a specific hazardous substance contained in this goods item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> technicalName = new ArrayList<TextType>();
    /**
     * Hazardous Item. Category. Name
     * <p>
     * The name of the category of hazard that applies to the Item.
     * 
     */
    @JsonProperty("CategoryName")
    @JsonPropertyDescription("The name of the category of hazard that applies to the Item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> categoryName = new ArrayList<TextType>();
    /**
     * Hazardous Item. Hazardous Category Code. Code
     * <p>
     * A code signifying a kind of hazard for a material.
     * 
     */
    @JsonProperty("HazardousCategoryCode")
    @JsonPropertyDescription("A code signifying a kind of hazard for a material.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> hazardousCategoryCode = new ArrayList<CodeType>();
    /**
     * Hazardous Item. Upper_ Orange Hazard Placard Identifier. Identifier
     * <p>
     * The number for the upper part of the orange hazard placard required on the means of transport.
     * 
     */
    @JsonProperty("UpperOrangeHazardPlacardID")
    @JsonPropertyDescription("The number for the upper part of the orange hazard placard required on the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> upperOrangeHazardPlacardID = new ArrayList<IdentifierType>();
    /**
     * Hazardous Item. Lower_ Orange Hazard Placard Identifier. Identifier
     * <p>
     * The number for the lower part of the orange hazard placard required on the means of transport.
     * 
     */
    @JsonProperty("LowerOrangeHazardPlacardID")
    @JsonPropertyDescription("The number for the lower part of the orange hazard placard required on the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> lowerOrangeHazardPlacardID = new ArrayList<IdentifierType>();
    /**
     * Hazardous Item. Marking Identifier. Identifier
     * <p>
     * An identifier to the marking of the Hazardous Item
     * 
     */
    @JsonProperty("MarkingID")
    @JsonPropertyDescription("An identifier to the marking of the Hazardous Item")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> markingID = new ArrayList<IdentifierType>();
    /**
     * Hazardous Item. Hazard Class Identifier. Identifier
     * <p>
     * An identifier for the hazard class applicable to this hazardous item as defined by the relevant regulation authority (e.g., the IMDG Class Number of the SOLAS Convention of IMO and the ADR/RID Class Number for the road/rail environment).
     * 
     */
    @JsonProperty("HazardClassID")
    @JsonPropertyDescription("An identifier for the hazard class applicable to this hazardous item as defined by the relevant regulation authority (e.g., the IMDG Class Number of the SOLAS Convention of IMO and the ADR/RID Class Number for the road/rail environment).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> hazardClassID = new ArrayList<IdentifierType>();
    /**
     * Hazardous Item. Net_ Weight. Measure
     * <p>
     * The net weight of this hazardous item, excluding packaging.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    @JsonPropertyDescription("The net weight of this hazardous item, excluding packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netWeightMeasure = new ArrayList<MeasureType>();
    /**
     * Hazardous Item. Net_ Volume. Measure
     * <p>
     * The volume of this hazardous item, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    @JsonPropertyDescription("The volume of this hazardous item, excluding packaging and transport equipment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<MeasureType> netVolumeMeasure = new ArrayList<MeasureType>();
    /**
     * Hazardous Item. Quantity
     * <p>
     * The quantity of goods items in this hazardous item that are hazardous.
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("The quantity of goods items in this hazardous item that are hazardous.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> quantity = new ArrayList<QuantityType>();
    /**
     * Hazardous Item. Contact_ Party. Party
     * <p>
     * The individual, group, or body to be contacted in case of a hazardous incident associated with this item.
     * 
     */
    @JsonProperty("ContactParty")
    @JsonPropertyDescription("The individual, group, or body to be contacted in case of a hazardous incident associated with this item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> contactParty = new ArrayList<Party>();
    /**
     * Hazardous Item. Secondary Hazard
     * <p>
     * A secondary hazard associated with this hazardous item.
     * 
     */
    @JsonProperty("SecondaryHazard")
    @JsonPropertyDescription("A secondary hazard associated with this hazardous item.")
    @Size(min = 1)
    @Valid
    private List<SecondaryHazard> secondaryHazard = new ArrayList<SecondaryHazard>();
    /**
     * Hazardous Item. Hazardous Goods Transit
     * <p>
     * Information related to the transit of this kind of hazardous goods.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    @JsonPropertyDescription("Information related to the transit of this kind of hazardous goods.")
    @Size(min = 1)
    @Valid
    private List<HazardousGoodsTransit> hazardousGoodsTransit = new ArrayList<HazardousGoodsTransit>();
    /**
     * Hazardous Item. Emergency_ Temperature. Temperature
     * <p>
     * The threshold temperature at which emergency procedures apply in the handling of temperature-controlled goods.
     * 
     */
    @JsonProperty("EmergencyTemperature")
    @JsonPropertyDescription("The threshold temperature at which emergency procedures apply in the handling of temperature-controlled goods.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> emergencyTemperature = new ArrayList<Temperature>();
    /**
     * Hazardous Item. Flashpoint_ Temperature. Temperature
     * <p>
     * The flashpoint temperature of this hazardous item; i.e., the lowest temperature at which vapors above a volatile combustible substance ignite in air when exposed to flame.
     * 
     */
    @JsonProperty("FlashpointTemperature")
    @JsonPropertyDescription("The flashpoint temperature of this hazardous item; i.e., the lowest temperature at which vapors above a volatile combustible substance ignite in air when exposed to flame.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Temperature> flashpointTemperature = new ArrayList<Temperature>();
    /**
     * Hazardous Item. Additional_ Temperature. Temperature
     * <p>
     * Another temperature relevant to the handling of this hazardous item.
     * 
     */
    @JsonProperty("AdditionalTemperature")
    @JsonPropertyDescription("Another temperature relevant to the handling of this hazardous item.")
    @Size(min = 1)
    @Valid
    private List<Temperature> additionalTemperature = new ArrayList<Temperature>();

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

    public HazardousItem withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Hazardous Item. Identifier
     * <p>
     * An identifier for this hazardous item.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Hazardous Item. Identifier
     * <p>
     * An identifier for this hazardous item.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public HazardousItem withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Hazardous Item. Placard Notation. Text
     * <p>
     * Text of the placard notation corresponding to the hazard class of this hazardous item. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardNotation")
    public List<TextType> getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Hazardous Item. Placard Notation. Text
     * <p>
     * Text of the placard notation corresponding to the hazard class of this hazardous item. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardNotation")
    public void setPlacardNotation(List<TextType> placardNotation) {
        this.placardNotation = placardNotation;
    }

    public HazardousItem withPlacardNotation(List<TextType> placardNotation) {
        this.placardNotation = placardNotation;
        return this;
    }

    /**
     * Hazardous Item. Placard Endorsement. Text
     * <p>
     * Text of the placard endorsement that is to be shown on the shipping papers for this hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardEndorsement")
    public List<TextType> getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Hazardous Item. Placard Endorsement. Text
     * <p>
     * Text of the placard endorsement that is to be shown on the shipping papers for this hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardEndorsement")
    public void setPlacardEndorsement(List<TextType> placardEndorsement) {
        this.placardEndorsement = placardEndorsement;
    }

    public HazardousItem withPlacardEndorsement(List<TextType> placardEndorsement) {
        this.placardEndorsement = placardEndorsement;
        return this;
    }

    /**
     * Hazardous Item. Additional_ Information. Text
     * <p>
     * Text providing further information about the hazardous substance.
     * 
     */
    @JsonProperty("AdditionalInformation")
    public List<TextType> getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Hazardous Item. Additional_ Information. Text
     * <p>
     * Text providing further information about the hazardous substance.
     * 
     */
    @JsonProperty("AdditionalInformation")
    public void setAdditionalInformation(List<TextType> additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public HazardousItem withAdditionalInformation(List<TextType> additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Hazardous Item. UNDG Code. Code
     * <p>
     * The UN code for this kind of hazardous item.
     * 
     */
    @JsonProperty("UNDGCode")
    public List<CodeType> getUNDGCode() {
        return uNDGCode;
    }

    /**
     * Hazardous Item. UNDG Code. Code
     * <p>
     * The UN code for this kind of hazardous item.
     * 
     */
    @JsonProperty("UNDGCode")
    public void setUNDGCode(List<CodeType> uNDGCode) {
        this.uNDGCode = uNDGCode;
    }

    public HazardousItem withUNDGCode(List<CodeType> uNDGCode) {
        this.uNDGCode = uNDGCode;
        return this;
    }

    /**
     * Hazardous Item. Emergency Procedures Code. Code
     * <p>
     * A code signifying the emergency procedures for this hazardous item.
     * 
     */
    @JsonProperty("EmergencyProceduresCode")
    public List<CodeType> getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Hazardous Item. Emergency Procedures Code. Code
     * <p>
     * A code signifying the emergency procedures for this hazardous item.
     * 
     */
    @JsonProperty("EmergencyProceduresCode")
    public void setEmergencyProceduresCode(List<CodeType> emergencyProceduresCode) {
        this.emergencyProceduresCode = emergencyProceduresCode;
    }

    public HazardousItem withEmergencyProceduresCode(List<CodeType> emergencyProceduresCode) {
        this.emergencyProceduresCode = emergencyProceduresCode;
        return this;
    }

    /**
     * Hazardous Item. Medical First Aid Guide Code. Code
     * <p>
     * A code signifying a medical first aid guide appropriate to this hazardous item.
     * 
     */
    @JsonProperty("MedicalFirstAidGuideCode")
    public List<CodeType> getMedicalFirstAidGuideCode() {
        return medicalFirstAidGuideCode;
    }

    /**
     * Hazardous Item. Medical First Aid Guide Code. Code
     * <p>
     * A code signifying a medical first aid guide appropriate to this hazardous item.
     * 
     */
    @JsonProperty("MedicalFirstAidGuideCode")
    public void setMedicalFirstAidGuideCode(List<CodeType> medicalFirstAidGuideCode) {
        this.medicalFirstAidGuideCode = medicalFirstAidGuideCode;
    }

    public HazardousItem withMedicalFirstAidGuideCode(List<CodeType> medicalFirstAidGuideCode) {
        this.medicalFirstAidGuideCode = medicalFirstAidGuideCode;
        return this;
    }

    /**
     * Hazardous Item. Technical_ Name. Name
     * <p>
     * The full technical name of a specific hazardous substance contained in this goods item.
     * 
     */
    @JsonProperty("TechnicalName")
    public List<TextType> getTechnicalName() {
        return technicalName;
    }

    /**
     * Hazardous Item. Technical_ Name. Name
     * <p>
     * The full technical name of a specific hazardous substance contained in this goods item.
     * 
     */
    @JsonProperty("TechnicalName")
    public void setTechnicalName(List<TextType> technicalName) {
        this.technicalName = technicalName;
    }

    public HazardousItem withTechnicalName(List<TextType> technicalName) {
        this.technicalName = technicalName;
        return this;
    }

    /**
     * Hazardous Item. Category. Name
     * <p>
     * The name of the category of hazard that applies to the Item.
     * 
     */
    @JsonProperty("CategoryName")
    public List<TextType> getCategoryName() {
        return categoryName;
    }

    /**
     * Hazardous Item. Category. Name
     * <p>
     * The name of the category of hazard that applies to the Item.
     * 
     */
    @JsonProperty("CategoryName")
    public void setCategoryName(List<TextType> categoryName) {
        this.categoryName = categoryName;
    }

    public HazardousItem withCategoryName(List<TextType> categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     * Hazardous Item. Hazardous Category Code. Code
     * <p>
     * A code signifying a kind of hazard for a material.
     * 
     */
    @JsonProperty("HazardousCategoryCode")
    public List<CodeType> getHazardousCategoryCode() {
        return hazardousCategoryCode;
    }

    /**
     * Hazardous Item. Hazardous Category Code. Code
     * <p>
     * A code signifying a kind of hazard for a material.
     * 
     */
    @JsonProperty("HazardousCategoryCode")
    public void setHazardousCategoryCode(List<CodeType> hazardousCategoryCode) {
        this.hazardousCategoryCode = hazardousCategoryCode;
    }

    public HazardousItem withHazardousCategoryCode(List<CodeType> hazardousCategoryCode) {
        this.hazardousCategoryCode = hazardousCategoryCode;
        return this;
    }

    /**
     * Hazardous Item. Upper_ Orange Hazard Placard Identifier. Identifier
     * <p>
     * The number for the upper part of the orange hazard placard required on the means of transport.
     * 
     */
    @JsonProperty("UpperOrangeHazardPlacardID")
    public List<IdentifierType> getUpperOrangeHazardPlacardID() {
        return upperOrangeHazardPlacardID;
    }

    /**
     * Hazardous Item. Upper_ Orange Hazard Placard Identifier. Identifier
     * <p>
     * The number for the upper part of the orange hazard placard required on the means of transport.
     * 
     */
    @JsonProperty("UpperOrangeHazardPlacardID")
    public void setUpperOrangeHazardPlacardID(List<IdentifierType> upperOrangeHazardPlacardID) {
        this.upperOrangeHazardPlacardID = upperOrangeHazardPlacardID;
    }

    public HazardousItem withUpperOrangeHazardPlacardID(List<IdentifierType> upperOrangeHazardPlacardID) {
        this.upperOrangeHazardPlacardID = upperOrangeHazardPlacardID;
        return this;
    }

    /**
     * Hazardous Item. Lower_ Orange Hazard Placard Identifier. Identifier
     * <p>
     * The number for the lower part of the orange hazard placard required on the means of transport.
     * 
     */
    @JsonProperty("LowerOrangeHazardPlacardID")
    public List<IdentifierType> getLowerOrangeHazardPlacardID() {
        return lowerOrangeHazardPlacardID;
    }

    /**
     * Hazardous Item. Lower_ Orange Hazard Placard Identifier. Identifier
     * <p>
     * The number for the lower part of the orange hazard placard required on the means of transport.
     * 
     */
    @JsonProperty("LowerOrangeHazardPlacardID")
    public void setLowerOrangeHazardPlacardID(List<IdentifierType> lowerOrangeHazardPlacardID) {
        this.lowerOrangeHazardPlacardID = lowerOrangeHazardPlacardID;
    }

    public HazardousItem withLowerOrangeHazardPlacardID(List<IdentifierType> lowerOrangeHazardPlacardID) {
        this.lowerOrangeHazardPlacardID = lowerOrangeHazardPlacardID;
        return this;
    }

    /**
     * Hazardous Item. Marking Identifier. Identifier
     * <p>
     * An identifier to the marking of the Hazardous Item
     * 
     */
    @JsonProperty("MarkingID")
    public List<IdentifierType> getMarkingID() {
        return markingID;
    }

    /**
     * Hazardous Item. Marking Identifier. Identifier
     * <p>
     * An identifier to the marking of the Hazardous Item
     * 
     */
    @JsonProperty("MarkingID")
    public void setMarkingID(List<IdentifierType> markingID) {
        this.markingID = markingID;
    }

    public HazardousItem withMarkingID(List<IdentifierType> markingID) {
        this.markingID = markingID;
        return this;
    }

    /**
     * Hazardous Item. Hazard Class Identifier. Identifier
     * <p>
     * An identifier for the hazard class applicable to this hazardous item as defined by the relevant regulation authority (e.g., the IMDG Class Number of the SOLAS Convention of IMO and the ADR/RID Class Number for the road/rail environment).
     * 
     */
    @JsonProperty("HazardClassID")
    public List<IdentifierType> getHazardClassID() {
        return hazardClassID;
    }

    /**
     * Hazardous Item. Hazard Class Identifier. Identifier
     * <p>
     * An identifier for the hazard class applicable to this hazardous item as defined by the relevant regulation authority (e.g., the IMDG Class Number of the SOLAS Convention of IMO and the ADR/RID Class Number for the road/rail environment).
     * 
     */
    @JsonProperty("HazardClassID")
    public void setHazardClassID(List<IdentifierType> hazardClassID) {
        this.hazardClassID = hazardClassID;
    }

    public HazardousItem withHazardClassID(List<IdentifierType> hazardClassID) {
        this.hazardClassID = hazardClassID;
        return this;
    }

    /**
     * Hazardous Item. Net_ Weight. Measure
     * <p>
     * The net weight of this hazardous item, excluding packaging.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public List<MeasureType> getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Hazardous Item. Net_ Weight. Measure
     * <p>
     * The net weight of this hazardous item, excluding packaging.
     * 
     */
    @JsonProperty("NetWeightMeasure")
    public void setNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
    }

    public HazardousItem withNetWeightMeasure(List<MeasureType> netWeightMeasure) {
        this.netWeightMeasure = netWeightMeasure;
        return this;
    }

    /**
     * Hazardous Item. Net_ Volume. Measure
     * <p>
     * The volume of this hazardous item, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public List<MeasureType> getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Hazardous Item. Net_ Volume. Measure
     * <p>
     * The volume of this hazardous item, excluding packaging and transport equipment.
     * 
     */
    @JsonProperty("NetVolumeMeasure")
    public void setNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
    }

    public HazardousItem withNetVolumeMeasure(List<MeasureType> netVolumeMeasure) {
        this.netVolumeMeasure = netVolumeMeasure;
        return this;
    }

    /**
     * Hazardous Item. Quantity
     * <p>
     * The quantity of goods items in this hazardous item that are hazardous.
     * 
     */
    @JsonProperty("Quantity")
    public List<QuantityType> getQuantity() {
        return quantity;
    }

    /**
     * Hazardous Item. Quantity
     * <p>
     * The quantity of goods items in this hazardous item that are hazardous.
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
    }

    public HazardousItem withQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Hazardous Item. Contact_ Party. Party
     * <p>
     * The individual, group, or body to be contacted in case of a hazardous incident associated with this item.
     * 
     */
    @JsonProperty("ContactParty")
    public List<Party> getContactParty() {
        return contactParty;
    }

    /**
     * Hazardous Item. Contact_ Party. Party
     * <p>
     * The individual, group, or body to be contacted in case of a hazardous incident associated with this item.
     * 
     */
    @JsonProperty("ContactParty")
    public void setContactParty(List<Party> contactParty) {
        this.contactParty = contactParty;
    }

    public HazardousItem withContactParty(List<Party> contactParty) {
        this.contactParty = contactParty;
        return this;
    }

    /**
     * Hazardous Item. Secondary Hazard
     * <p>
     * A secondary hazard associated with this hazardous item.
     * 
     */
    @JsonProperty("SecondaryHazard")
    public List<SecondaryHazard> getSecondaryHazard() {
        return secondaryHazard;
    }

    /**
     * Hazardous Item. Secondary Hazard
     * <p>
     * A secondary hazard associated with this hazardous item.
     * 
     */
    @JsonProperty("SecondaryHazard")
    public void setSecondaryHazard(List<SecondaryHazard> secondaryHazard) {
        this.secondaryHazard = secondaryHazard;
    }

    public HazardousItem withSecondaryHazard(List<SecondaryHazard> secondaryHazard) {
        this.secondaryHazard = secondaryHazard;
        return this;
    }

    /**
     * Hazardous Item. Hazardous Goods Transit
     * <p>
     * Information related to the transit of this kind of hazardous goods.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    public List<HazardousGoodsTransit> getHazardousGoodsTransit() {
        return hazardousGoodsTransit;
    }

    /**
     * Hazardous Item. Hazardous Goods Transit
     * <p>
     * Information related to the transit of this kind of hazardous goods.
     * 
     */
    @JsonProperty("HazardousGoodsTransit")
    public void setHazardousGoodsTransit(List<HazardousGoodsTransit> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
    }

    public HazardousItem withHazardousGoodsTransit(List<HazardousGoodsTransit> hazardousGoodsTransit) {
        this.hazardousGoodsTransit = hazardousGoodsTransit;
        return this;
    }

    /**
     * Hazardous Item. Emergency_ Temperature. Temperature
     * <p>
     * The threshold temperature at which emergency procedures apply in the handling of temperature-controlled goods.
     * 
     */
    @JsonProperty("EmergencyTemperature")
    public List<Temperature> getEmergencyTemperature() {
        return emergencyTemperature;
    }

    /**
     * Hazardous Item. Emergency_ Temperature. Temperature
     * <p>
     * The threshold temperature at which emergency procedures apply in the handling of temperature-controlled goods.
     * 
     */
    @JsonProperty("EmergencyTemperature")
    public void setEmergencyTemperature(List<Temperature> emergencyTemperature) {
        this.emergencyTemperature = emergencyTemperature;
    }

    public HazardousItem withEmergencyTemperature(List<Temperature> emergencyTemperature) {
        this.emergencyTemperature = emergencyTemperature;
        return this;
    }

    /**
     * Hazardous Item. Flashpoint_ Temperature. Temperature
     * <p>
     * The flashpoint temperature of this hazardous item; i.e., the lowest temperature at which vapors above a volatile combustible substance ignite in air when exposed to flame.
     * 
     */
    @JsonProperty("FlashpointTemperature")
    public List<Temperature> getFlashpointTemperature() {
        return flashpointTemperature;
    }

    /**
     * Hazardous Item. Flashpoint_ Temperature. Temperature
     * <p>
     * The flashpoint temperature of this hazardous item; i.e., the lowest temperature at which vapors above a volatile combustible substance ignite in air when exposed to flame.
     * 
     */
    @JsonProperty("FlashpointTemperature")
    public void setFlashpointTemperature(List<Temperature> flashpointTemperature) {
        this.flashpointTemperature = flashpointTemperature;
    }

    public HazardousItem withFlashpointTemperature(List<Temperature> flashpointTemperature) {
        this.flashpointTemperature = flashpointTemperature;
        return this;
    }

    /**
     * Hazardous Item. Additional_ Temperature. Temperature
     * <p>
     * Another temperature relevant to the handling of this hazardous item.
     * 
     */
    @JsonProperty("AdditionalTemperature")
    public List<Temperature> getAdditionalTemperature() {
        return additionalTemperature;
    }

    /**
     * Hazardous Item. Additional_ Temperature. Temperature
     * <p>
     * Another temperature relevant to the handling of this hazardous item.
     * 
     */
    @JsonProperty("AdditionalTemperature")
    public void setAdditionalTemperature(List<Temperature> additionalTemperature) {
        this.additionalTemperature = additionalTemperature;
    }

    public HazardousItem withAdditionalTemperature(List<Temperature> additionalTemperature) {
        this.additionalTemperature = additionalTemperature;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HazardousItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("placardNotation");
        sb.append('=');
        sb.append(((this.placardNotation == null)?"<null>":this.placardNotation));
        sb.append(',');
        sb.append("placardEndorsement");
        sb.append('=');
        sb.append(((this.placardEndorsement == null)?"<null>":this.placardEndorsement));
        sb.append(',');
        sb.append("additionalInformation");
        sb.append('=');
        sb.append(((this.additionalInformation == null)?"<null>":this.additionalInformation));
        sb.append(',');
        sb.append("uNDGCode");
        sb.append('=');
        sb.append(((this.uNDGCode == null)?"<null>":this.uNDGCode));
        sb.append(',');
        sb.append("emergencyProceduresCode");
        sb.append('=');
        sb.append(((this.emergencyProceduresCode == null)?"<null>":this.emergencyProceduresCode));
        sb.append(',');
        sb.append("medicalFirstAidGuideCode");
        sb.append('=');
        sb.append(((this.medicalFirstAidGuideCode == null)?"<null>":this.medicalFirstAidGuideCode));
        sb.append(',');
        sb.append("technicalName");
        sb.append('=');
        sb.append(((this.technicalName == null)?"<null>":this.technicalName));
        sb.append(',');
        sb.append("categoryName");
        sb.append('=');
        sb.append(((this.categoryName == null)?"<null>":this.categoryName));
        sb.append(',');
        sb.append("hazardousCategoryCode");
        sb.append('=');
        sb.append(((this.hazardousCategoryCode == null)?"<null>":this.hazardousCategoryCode));
        sb.append(',');
        sb.append("upperOrangeHazardPlacardID");
        sb.append('=');
        sb.append(((this.upperOrangeHazardPlacardID == null)?"<null>":this.upperOrangeHazardPlacardID));
        sb.append(',');
        sb.append("lowerOrangeHazardPlacardID");
        sb.append('=');
        sb.append(((this.lowerOrangeHazardPlacardID == null)?"<null>":this.lowerOrangeHazardPlacardID));
        sb.append(',');
        sb.append("markingID");
        sb.append('=');
        sb.append(((this.markingID == null)?"<null>":this.markingID));
        sb.append(',');
        sb.append("hazardClassID");
        sb.append('=');
        sb.append(((this.hazardClassID == null)?"<null>":this.hazardClassID));
        sb.append(',');
        sb.append("netWeightMeasure");
        sb.append('=');
        sb.append(((this.netWeightMeasure == null)?"<null>":this.netWeightMeasure));
        sb.append(',');
        sb.append("netVolumeMeasure");
        sb.append('=');
        sb.append(((this.netVolumeMeasure == null)?"<null>":this.netVolumeMeasure));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("contactParty");
        sb.append('=');
        sb.append(((this.contactParty == null)?"<null>":this.contactParty));
        sb.append(',');
        sb.append("secondaryHazard");
        sb.append('=');
        sb.append(((this.secondaryHazard == null)?"<null>":this.secondaryHazard));
        sb.append(',');
        sb.append("hazardousGoodsTransit");
        sb.append('=');
        sb.append(((this.hazardousGoodsTransit == null)?"<null>":this.hazardousGoodsTransit));
        sb.append(',');
        sb.append("emergencyTemperature");
        sb.append('=');
        sb.append(((this.emergencyTemperature == null)?"<null>":this.emergencyTemperature));
        sb.append(',');
        sb.append("flashpointTemperature");
        sb.append('=');
        sb.append(((this.flashpointTemperature == null)?"<null>":this.flashpointTemperature));
        sb.append(',');
        sb.append("additionalTemperature");
        sb.append('=');
        sb.append(((this.additionalTemperature == null)?"<null>":this.additionalTemperature));
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
        result = ((result* 31)+((this.placardEndorsement == null)? 0 :this.placardEndorsement.hashCode()));
        result = ((result* 31)+((this.upperOrangeHazardPlacardID == null)? 0 :this.upperOrangeHazardPlacardID.hashCode()));
        result = ((result* 31)+((this.hazardClassID == null)? 0 :this.hazardClassID.hashCode()));
        result = ((result* 31)+((this.hazardousGoodsTransit == null)? 0 :this.hazardousGoodsTransit.hashCode()));
        result = ((result* 31)+((this.emergencyProceduresCode == null)? 0 :this.emergencyProceduresCode.hashCode()));
        result = ((result* 31)+((this.medicalFirstAidGuideCode == null)? 0 :this.medicalFirstAidGuideCode.hashCode()));
        result = ((result* 31)+((this.categoryName == null)? 0 :this.categoryName.hashCode()));
        result = ((result* 31)+((this.lowerOrangeHazardPlacardID == null)? 0 :this.lowerOrangeHazardPlacardID.hashCode()));
        result = ((result* 31)+((this.secondaryHazard == null)? 0 :this.secondaryHazard.hashCode()));
        result = ((result* 31)+((this.flashpointTemperature == null)? 0 :this.flashpointTemperature.hashCode()));
        result = ((result* 31)+((this.netWeightMeasure == null)? 0 :this.netWeightMeasure.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.markingID == null)? 0 :this.markingID.hashCode()));
        result = ((result* 31)+((this.additionalInformation == null)? 0 :this.additionalInformation.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.uNDGCode == null)? 0 :this.uNDGCode.hashCode()));
        result = ((result* 31)+((this.contactParty == null)? 0 :this.contactParty.hashCode()));
        result = ((result* 31)+((this.technicalName == null)? 0 :this.technicalName.hashCode()));
        result = ((result* 31)+((this.hazardousCategoryCode == null)? 0 :this.hazardousCategoryCode.hashCode()));
        result = ((result* 31)+((this.netVolumeMeasure == null)? 0 :this.netVolumeMeasure.hashCode()));
        result = ((result* 31)+((this.additionalTemperature == null)? 0 :this.additionalTemperature.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.placardNotation == null)? 0 :this.placardNotation.hashCode()));
        result = ((result* 31)+((this.emergencyTemperature == null)? 0 :this.emergencyTemperature.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HazardousItem) == false) {
            return false;
        }
        HazardousItem rhs = ((HazardousItem) other);
        return (((((((((((((((((((((((((this.placardEndorsement == rhs.placardEndorsement)||((this.placardEndorsement!= null)&&this.placardEndorsement.equals(rhs.placardEndorsement)))&&((this.upperOrangeHazardPlacardID == rhs.upperOrangeHazardPlacardID)||((this.upperOrangeHazardPlacardID!= null)&&this.upperOrangeHazardPlacardID.equals(rhs.upperOrangeHazardPlacardID))))&&((this.hazardClassID == rhs.hazardClassID)||((this.hazardClassID!= null)&&this.hazardClassID.equals(rhs.hazardClassID))))&&((this.hazardousGoodsTransit == rhs.hazardousGoodsTransit)||((this.hazardousGoodsTransit!= null)&&this.hazardousGoodsTransit.equals(rhs.hazardousGoodsTransit))))&&((this.emergencyProceduresCode == rhs.emergencyProceduresCode)||((this.emergencyProceduresCode!= null)&&this.emergencyProceduresCode.equals(rhs.emergencyProceduresCode))))&&((this.medicalFirstAidGuideCode == rhs.medicalFirstAidGuideCode)||((this.medicalFirstAidGuideCode!= null)&&this.medicalFirstAidGuideCode.equals(rhs.medicalFirstAidGuideCode))))&&((this.categoryName == rhs.categoryName)||((this.categoryName!= null)&&this.categoryName.equals(rhs.categoryName))))&&((this.lowerOrangeHazardPlacardID == rhs.lowerOrangeHazardPlacardID)||((this.lowerOrangeHazardPlacardID!= null)&&this.lowerOrangeHazardPlacardID.equals(rhs.lowerOrangeHazardPlacardID))))&&((this.secondaryHazard == rhs.secondaryHazard)||((this.secondaryHazard!= null)&&this.secondaryHazard.equals(rhs.secondaryHazard))))&&((this.flashpointTemperature == rhs.flashpointTemperature)||((this.flashpointTemperature!= null)&&this.flashpointTemperature.equals(rhs.flashpointTemperature))))&&((this.netWeightMeasure == rhs.netWeightMeasure)||((this.netWeightMeasure!= null)&&this.netWeightMeasure.equals(rhs.netWeightMeasure))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.markingID == rhs.markingID)||((this.markingID!= null)&&this.markingID.equals(rhs.markingID))))&&((this.additionalInformation == rhs.additionalInformation)||((this.additionalInformation!= null)&&this.additionalInformation.equals(rhs.additionalInformation))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.uNDGCode == rhs.uNDGCode)||((this.uNDGCode!= null)&&this.uNDGCode.equals(rhs.uNDGCode))))&&((this.contactParty == rhs.contactParty)||((this.contactParty!= null)&&this.contactParty.equals(rhs.contactParty))))&&((this.technicalName == rhs.technicalName)||((this.technicalName!= null)&&this.technicalName.equals(rhs.technicalName))))&&((this.hazardousCategoryCode == rhs.hazardousCategoryCode)||((this.hazardousCategoryCode!= null)&&this.hazardousCategoryCode.equals(rhs.hazardousCategoryCode))))&&((this.netVolumeMeasure == rhs.netVolumeMeasure)||((this.netVolumeMeasure!= null)&&this.netVolumeMeasure.equals(rhs.netVolumeMeasure))))&&((this.additionalTemperature == rhs.additionalTemperature)||((this.additionalTemperature!= null)&&this.additionalTemperature.equals(rhs.additionalTemperature))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.placardNotation == rhs.placardNotation)||((this.placardNotation!= null)&&this.placardNotation.equals(rhs.placardNotation))))&&((this.emergencyTemperature == rhs.emergencyTemperature)||((this.emergencyTemperature!= null)&&this.emergencyTemperature.equals(rhs.emergencyTemperature))));
    }

}
