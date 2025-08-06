
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
 * Secondary Hazard. Details
 * <p>
 * A class to describe a secondary hazard associated with a hazardous item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "PlacardNotation",
    "PlacardEndorsement",
    "EmergencyProceduresCode",
    "Extension"
})
@Generated("jsonschema2pojo")
public class SecondaryHazard {

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
     * Secondary Hazard. Identifier
     * <p>
     * An identifier for this secondary hazard.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this secondary hazard.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Secondary Hazard. Placard Notation. Text
     * <p>
     * Text of the placard notation corresponding to the hazard class of this secondary hazard. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardNotation")
    @JsonPropertyDescription("Text of the placard notation corresponding to the hazard class of this secondary hazard. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> placardNotation = new ArrayList<TextType>();
    /**
     * Secondary Hazard. Placard Endorsement. Text
     * <p>
     * Text of the placard endorsement for this secondary hazard that is to be shown on the shipping papers for a hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardEndorsement")
    @JsonPropertyDescription("Text of the placard endorsement for this secondary hazard that is to be shown on the shipping papers for a hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> placardEndorsement = new ArrayList<TextType>();
    /**
     * Secondary Hazard. Emergency Procedures Code. Code
     * <p>
     * A code signifying the emergency procedures for this secondary hazard.
     * 
     */
    @JsonProperty("EmergencyProceduresCode")
    @JsonPropertyDescription("A code signifying the emergency procedures for this secondary hazard.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> emergencyProceduresCode = new ArrayList<CodeType>();
    /**
     * Secondary Hazard. Extension. Text
     * <p>
     * Additional information about the hazardous substance, which can be used (for example) to specify the type of regulatory requirements that apply to this secondary hazard.
     * 
     */
    @JsonProperty("Extension")
    @JsonPropertyDescription("Additional information about the hazardous substance, which can be used (for example) to specify the type of regulatory requirements that apply to this secondary hazard.")
    @Size(min = 1)
    @Valid
    private List<TextType> extension = new ArrayList<TextType>();

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

    public SecondaryHazard withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Secondary Hazard. Identifier
     * <p>
     * An identifier for this secondary hazard.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Secondary Hazard. Identifier
     * <p>
     * An identifier for this secondary hazard.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public SecondaryHazard withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Secondary Hazard. Placard Notation. Text
     * <p>
     * Text of the placard notation corresponding to the hazard class of this secondary hazard. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardNotation")
    public List<TextType> getPlacardNotation() {
        return placardNotation;
    }

    /**
     * Secondary Hazard. Placard Notation. Text
     * <p>
     * Text of the placard notation corresponding to the hazard class of this secondary hazard. Can also be the hazard identification number of the orange placard (upper part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardNotation")
    public void setPlacardNotation(List<TextType> placardNotation) {
        this.placardNotation = placardNotation;
    }

    public SecondaryHazard withPlacardNotation(List<TextType> placardNotation) {
        this.placardNotation = placardNotation;
        return this;
    }

    /**
     * Secondary Hazard. Placard Endorsement. Text
     * <p>
     * Text of the placard endorsement for this secondary hazard that is to be shown on the shipping papers for a hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardEndorsement")
    public List<TextType> getPlacardEndorsement() {
        return placardEndorsement;
    }

    /**
     * Secondary Hazard. Placard Endorsement. Text
     * <p>
     * Text of the placard endorsement for this secondary hazard that is to be shown on the shipping papers for a hazardous item. Can also be used for the number of the orange placard (lower part) required on the means of transport.
     * 
     */
    @JsonProperty("PlacardEndorsement")
    public void setPlacardEndorsement(List<TextType> placardEndorsement) {
        this.placardEndorsement = placardEndorsement;
    }

    public SecondaryHazard withPlacardEndorsement(List<TextType> placardEndorsement) {
        this.placardEndorsement = placardEndorsement;
        return this;
    }

    /**
     * Secondary Hazard. Emergency Procedures Code. Code
     * <p>
     * A code signifying the emergency procedures for this secondary hazard.
     * 
     */
    @JsonProperty("EmergencyProceduresCode")
    public List<CodeType> getEmergencyProceduresCode() {
        return emergencyProceduresCode;
    }

    /**
     * Secondary Hazard. Emergency Procedures Code. Code
     * <p>
     * A code signifying the emergency procedures for this secondary hazard.
     * 
     */
    @JsonProperty("EmergencyProceduresCode")
    public void setEmergencyProceduresCode(List<CodeType> emergencyProceduresCode) {
        this.emergencyProceduresCode = emergencyProceduresCode;
    }

    public SecondaryHazard withEmergencyProceduresCode(List<CodeType> emergencyProceduresCode) {
        this.emergencyProceduresCode = emergencyProceduresCode;
        return this;
    }

    /**
     * Secondary Hazard. Extension. Text
     * <p>
     * Additional information about the hazardous substance, which can be used (for example) to specify the type of regulatory requirements that apply to this secondary hazard.
     * 
     */
    @JsonProperty("Extension")
    public List<TextType> getExtension() {
        return extension;
    }

    /**
     * Secondary Hazard. Extension. Text
     * <p>
     * Additional information about the hazardous substance, which can be used (for example) to specify the type of regulatory requirements that apply to this secondary hazard.
     * 
     */
    @JsonProperty("Extension")
    public void setExtension(List<TextType> extension) {
        this.extension = extension;
    }

    public SecondaryHazard withExtension(List<TextType> extension) {
        this.extension = extension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecondaryHazard.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("emergencyProceduresCode");
        sb.append('=');
        sb.append(((this.emergencyProceduresCode == null)?"<null>":this.emergencyProceduresCode));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.placardNotation == null)? 0 :this.placardNotation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.emergencyProceduresCode == null)? 0 :this.emergencyProceduresCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecondaryHazard) == false) {
            return false;
        }
        SecondaryHazard rhs = ((SecondaryHazard) other);
        return (((((((this.placardEndorsement == rhs.placardEndorsement)||((this.placardEndorsement!= null)&&this.placardEndorsement.equals(rhs.placardEndorsement)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.placardNotation == rhs.placardNotation)||((this.placardNotation!= null)&&this.placardNotation.equals(rhs.placardNotation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.emergencyProceduresCode == rhs.emergencyProceduresCode)||((this.emergencyProceduresCode!= null)&&this.emergencyProceduresCode.equals(rhs.emergencyProceduresCode))));
    }

}
