
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
 * Line Reference. Details
 * <p>
 * A class to define a reference to a line in a document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LineID",
    "UUID",
    "LineStatusCode",
    "DocumentReference"
})
@Generated("jsonschema2pojo")
public class LineReference {

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
     * Line Reference. Line Identifier. Identifier
     * <p>
     * Identifies the referenced line in the document.
     * (Required)
     * 
     */
    @JsonProperty("LineID")
    @JsonPropertyDescription("Identifies the referenced line in the document.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> lineID = new ArrayList<IdentifierType>();
    /**
     * Line Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this line reference.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this line reference.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Line Reference. Line Status Code. Code
     * <p>
     * A code signifying the status of the referenced line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    @JsonPropertyDescription("A code signifying the status of the referenced line with respect to its original state.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> lineStatusCode = new ArrayList<CodeType>();
    /**
     * Line Reference. Document Reference
     * <p>
     * A reference to the document containing the referenced line.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A reference to the document containing the referenced line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> documentReference = new ArrayList<DocumentReference>();

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

    public LineReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Line Reference. Line Identifier. Identifier
     * <p>
     * Identifies the referenced line in the document.
     * (Required)
     * 
     */
    @JsonProperty("LineID")
    public List<IdentifierType> getLineID() {
        return lineID;
    }

    /**
     * Line Reference. Line Identifier. Identifier
     * <p>
     * Identifies the referenced line in the document.
     * (Required)
     * 
     */
    @JsonProperty("LineID")
    public void setLineID(List<IdentifierType> lineID) {
        this.lineID = lineID;
    }

    public LineReference withLineID(List<IdentifierType> lineID) {
        this.lineID = lineID;
        return this;
    }

    /**
     * Line Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this line reference.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Line Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this line reference.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public LineReference withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Line Reference. Line Status Code. Code
     * <p>
     * A code signifying the status of the referenced line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    public List<CodeType> getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Line Reference. Line Status Code. Code
     * <p>
     * A code signifying the status of the referenced line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    public void setLineStatusCode(List<CodeType> lineStatusCode) {
        this.lineStatusCode = lineStatusCode;
    }

    public LineReference withLineStatusCode(List<CodeType> lineStatusCode) {
        this.lineStatusCode = lineStatusCode;
        return this;
    }

    /**
     * Line Reference. Document Reference
     * <p>
     * A reference to the document containing the referenced line.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Line Reference. Document Reference
     * <p>
     * A reference to the document containing the referenced line.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public LineReference withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("lineID");
        sb.append('=');
        sb.append(((this.lineID == null)?"<null>":this.lineID));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("lineStatusCode");
        sb.append('=');
        sb.append(((this.lineStatusCode == null)?"<null>":this.lineStatusCode));
        sb.append(',');
        sb.append("documentReference");
        sb.append('=');
        sb.append(((this.documentReference == null)?"<null>":this.documentReference));
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
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.lineID == null)? 0 :this.lineID.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.lineStatusCode == null)? 0 :this.lineStatusCode.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineReference) == false) {
            return false;
        }
        LineReference rhs = ((LineReference) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.lineID == rhs.lineID)||((this.lineID!= null)&&this.lineID.equals(rhs.lineID))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.lineStatusCode == rhs.lineStatusCode)||((this.lineStatusCode!= null)&&this.lineStatusCode.equals(rhs.lineStatusCode))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))));
    }

}
