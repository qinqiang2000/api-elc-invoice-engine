
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
 * A single extension for private use.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ID",
    "Name",
    "ExtensionAgencyID",
    "ExtensionAgencyName",
    "ExtensionVersionID",
    "ExtensionAgencyURI",
    "ExtensionURI",
    "ExtensionReasonCode",
    "ExtensionReason",
    "ExtensionContent"
})
@Generated("jsonschema2pojo")
public class UBLExtension {

    /**
     * An identifier for the Extension assigned by the creator of the extension.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for the Extension assigned by the creator of the extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * A name for the Extension assigned by the creator of the extension.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("A name for the Extension assigned by the creator of the extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * An agency that maintains one or more Extensions.
     * 
     */
    @JsonProperty("ExtensionAgencyID")
    @JsonPropertyDescription("An agency that maintains one or more Extensions.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> extensionAgencyID = new ArrayList<IdentifierType>();
    /**
     * The name of the agency that maintains the Extension.
     * 
     */
    @JsonProperty("ExtensionAgencyName")
    @JsonPropertyDescription("The name of the agency that maintains the Extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> extensionAgencyName = new ArrayList<TextType>();
    /**
     * The version of the Extension.
     * 
     */
    @JsonProperty("ExtensionVersionID")
    @JsonPropertyDescription("The version of the Extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> extensionVersionID = new ArrayList<IdentifierType>();
    /**
     * A URI for the Agency that maintains the Extension.
     * 
     */
    @JsonProperty("ExtensionAgencyURI")
    @JsonPropertyDescription("A URI for the Agency that maintains the Extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> extensionAgencyURI = new ArrayList<IdentifierType>();
    /**
     * A URI for the Extension.
     * 
     */
    @JsonProperty("ExtensionURI")
    @JsonPropertyDescription("A URI for the Extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> extensionURI = new ArrayList<IdentifierType>();
    /**
     * A code for reason the Extension is being included.
     * 
     */
    @JsonProperty("ExtensionReasonCode")
    @JsonPropertyDescription("A code for reason the Extension is being included.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> extensionReasonCode = new ArrayList<CodeType>();
    /**
     * A description of the reason for the Extension.
     * 
     */
    @JsonProperty("ExtensionReason")
    @JsonPropertyDescription("A description of the reason for the Extension.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> extensionReason = new ArrayList<TextType>();
    /**
     * The definition of the extension content.
     * (Required)
     * 
     */
    @JsonProperty("ExtensionContent")
    @JsonPropertyDescription("The definition of the extension content.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<ExtensionContent> extensionContent = new ArrayList<ExtensionContent>();

    /**
     * An identifier for the Extension assigned by the creator of the extension.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * An identifier for the Extension assigned by the creator of the extension.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public UBLExtension withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * A name for the Extension assigned by the creator of the extension.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * A name for the Extension assigned by the creator of the extension.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public UBLExtension withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * An agency that maintains one or more Extensions.
     * 
     */
    @JsonProperty("ExtensionAgencyID")
    public List<IdentifierType> getExtensionAgencyID() {
        return extensionAgencyID;
    }

    /**
     * An agency that maintains one or more Extensions.
     * 
     */
    @JsonProperty("ExtensionAgencyID")
    public void setExtensionAgencyID(List<IdentifierType> extensionAgencyID) {
        this.extensionAgencyID = extensionAgencyID;
    }

    public UBLExtension withExtensionAgencyID(List<IdentifierType> extensionAgencyID) {
        this.extensionAgencyID = extensionAgencyID;
        return this;
    }

    /**
     * The name of the agency that maintains the Extension.
     * 
     */
    @JsonProperty("ExtensionAgencyName")
    public List<TextType> getExtensionAgencyName() {
        return extensionAgencyName;
    }

    /**
     * The name of the agency that maintains the Extension.
     * 
     */
    @JsonProperty("ExtensionAgencyName")
    public void setExtensionAgencyName(List<TextType> extensionAgencyName) {
        this.extensionAgencyName = extensionAgencyName;
    }

    public UBLExtension withExtensionAgencyName(List<TextType> extensionAgencyName) {
        this.extensionAgencyName = extensionAgencyName;
        return this;
    }

    /**
     * The version of the Extension.
     * 
     */
    @JsonProperty("ExtensionVersionID")
    public List<IdentifierType> getExtensionVersionID() {
        return extensionVersionID;
    }

    /**
     * The version of the Extension.
     * 
     */
    @JsonProperty("ExtensionVersionID")
    public void setExtensionVersionID(List<IdentifierType> extensionVersionID) {
        this.extensionVersionID = extensionVersionID;
    }

    public UBLExtension withExtensionVersionID(List<IdentifierType> extensionVersionID) {
        this.extensionVersionID = extensionVersionID;
        return this;
    }

    /**
     * A URI for the Agency that maintains the Extension.
     * 
     */
    @JsonProperty("ExtensionAgencyURI")
    public List<IdentifierType> getExtensionAgencyURI() {
        return extensionAgencyURI;
    }

    /**
     * A URI for the Agency that maintains the Extension.
     * 
     */
    @JsonProperty("ExtensionAgencyURI")
    public void setExtensionAgencyURI(List<IdentifierType> extensionAgencyURI) {
        this.extensionAgencyURI = extensionAgencyURI;
    }

    public UBLExtension withExtensionAgencyURI(List<IdentifierType> extensionAgencyURI) {
        this.extensionAgencyURI = extensionAgencyURI;
        return this;
    }

    /**
     * A URI for the Extension.
     * 
     */
    @JsonProperty("ExtensionURI")
    public List<IdentifierType> getExtensionURI() {
        return extensionURI;
    }

    /**
     * A URI for the Extension.
     * 
     */
    @JsonProperty("ExtensionURI")
    public void setExtensionURI(List<IdentifierType> extensionURI) {
        this.extensionURI = extensionURI;
    }

    public UBLExtension withExtensionURI(List<IdentifierType> extensionURI) {
        this.extensionURI = extensionURI;
        return this;
    }

    /**
     * A code for reason the Extension is being included.
     * 
     */
    @JsonProperty("ExtensionReasonCode")
    public List<CodeType> getExtensionReasonCode() {
        return extensionReasonCode;
    }

    /**
     * A code for reason the Extension is being included.
     * 
     */
    @JsonProperty("ExtensionReasonCode")
    public void setExtensionReasonCode(List<CodeType> extensionReasonCode) {
        this.extensionReasonCode = extensionReasonCode;
    }

    public UBLExtension withExtensionReasonCode(List<CodeType> extensionReasonCode) {
        this.extensionReasonCode = extensionReasonCode;
        return this;
    }

    /**
     * A description of the reason for the Extension.
     * 
     */
    @JsonProperty("ExtensionReason")
    public List<TextType> getExtensionReason() {
        return extensionReason;
    }

    /**
     * A description of the reason for the Extension.
     * 
     */
    @JsonProperty("ExtensionReason")
    public void setExtensionReason(List<TextType> extensionReason) {
        this.extensionReason = extensionReason;
    }

    public UBLExtension withExtensionReason(List<TextType> extensionReason) {
        this.extensionReason = extensionReason;
        return this;
    }

    /**
     * The definition of the extension content.
     * (Required)
     * 
     */
    @JsonProperty("ExtensionContent")
    public List<ExtensionContent> getExtensionContent() {
        return extensionContent;
    }

    /**
     * The definition of the extension content.
     * (Required)
     * 
     */
    @JsonProperty("ExtensionContent")
    public void setExtensionContent(List<ExtensionContent> extensionContent) {
        this.extensionContent = extensionContent;
    }

    public UBLExtension withExtensionContent(List<ExtensionContent> extensionContent) {
        this.extensionContent = extensionContent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UBLExtension.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("extensionAgencyID");
        sb.append('=');
        sb.append(((this.extensionAgencyID == null)?"<null>":this.extensionAgencyID));
        sb.append(',');
        sb.append("extensionAgencyName");
        sb.append('=');
        sb.append(((this.extensionAgencyName == null)?"<null>":this.extensionAgencyName));
        sb.append(',');
        sb.append("extensionVersionID");
        sb.append('=');
        sb.append(((this.extensionVersionID == null)?"<null>":this.extensionVersionID));
        sb.append(',');
        sb.append("extensionAgencyURI");
        sb.append('=');
        sb.append(((this.extensionAgencyURI == null)?"<null>":this.extensionAgencyURI));
        sb.append(',');
        sb.append("extensionURI");
        sb.append('=');
        sb.append(((this.extensionURI == null)?"<null>":this.extensionURI));
        sb.append(',');
        sb.append("extensionReasonCode");
        sb.append('=');
        sb.append(((this.extensionReasonCode == null)?"<null>":this.extensionReasonCode));
        sb.append(',');
        sb.append("extensionReason");
        sb.append('=');
        sb.append(((this.extensionReason == null)?"<null>":this.extensionReason));
        sb.append(',');
        sb.append("extensionContent");
        sb.append('=');
        sb.append(((this.extensionContent == null)?"<null>":this.extensionContent));
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
        result = ((result* 31)+((this.extensionAgencyID == null)? 0 :this.extensionAgencyID.hashCode()));
        result = ((result* 31)+((this.extensionURI == null)? 0 :this.extensionURI.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.extensionReason == null)? 0 :this.extensionReason.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.extensionVersionID == null)? 0 :this.extensionVersionID.hashCode()));
        result = ((result* 31)+((this.extensionAgencyURI == null)? 0 :this.extensionAgencyURI.hashCode()));
        result = ((result* 31)+((this.extensionAgencyName == null)? 0 :this.extensionAgencyName.hashCode()));
        result = ((result* 31)+((this.extensionReasonCode == null)? 0 :this.extensionReasonCode.hashCode()));
        result = ((result* 31)+((this.extensionContent == null)? 0 :this.extensionContent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UBLExtension) == false) {
            return false;
        }
        UBLExtension rhs = ((UBLExtension) other);
        return (((((((((((this.extensionAgencyID == rhs.extensionAgencyID)||((this.extensionAgencyID!= null)&&this.extensionAgencyID.equals(rhs.extensionAgencyID)))&&((this.extensionURI == rhs.extensionURI)||((this.extensionURI!= null)&&this.extensionURI.equals(rhs.extensionURI))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.extensionReason == rhs.extensionReason)||((this.extensionReason!= null)&&this.extensionReason.equals(rhs.extensionReason))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.extensionVersionID == rhs.extensionVersionID)||((this.extensionVersionID!= null)&&this.extensionVersionID.equals(rhs.extensionVersionID))))&&((this.extensionAgencyURI == rhs.extensionAgencyURI)||((this.extensionAgencyURI!= null)&&this.extensionAgencyURI.equals(rhs.extensionAgencyURI))))&&((this.extensionAgencyName == rhs.extensionAgencyName)||((this.extensionAgencyName!= null)&&this.extensionAgencyName.equals(rhs.extensionAgencyName))))&&((this.extensionReasonCode == rhs.extensionReasonCode)||((this.extensionReasonCode!= null)&&this.extensionReasonCode.equals(rhs.extensionReasonCode))))&&((this.extensionContent == rhs.extensionContent)||((this.extensionContent!= null)&&this.extensionContent.equals(rhs.extensionContent))));
    }

}
