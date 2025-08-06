
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
 * Attachment. Details
 * <p>
 * A class to describe an attached document. An attachment can refer to an external document or be included with the document being exchanged.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "EmbeddedDocumentBinaryObject",
    "ExternalReference"
})
@Generated("jsonschema2pojo")
public class Attachment {

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
     * Attachment. Embedded_ Document. Binary Object
     * <p>
     * A binary large object containing an attached document.
     * 
     */
    @JsonProperty("EmbeddedDocumentBinaryObject")
    @JsonPropertyDescription("A binary large object containing an attached document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<BinaryObjectType> embeddedDocumentBinaryObject = new ArrayList<BinaryObjectType>();
    /**
     * Attachment. External Reference
     * <p>
     * A reference to an attached document that is external to the document(s) being exchanged.
     * 
     */
    @JsonProperty("ExternalReference")
    @JsonPropertyDescription("A reference to an attached document that is external to the document(s) being exchanged.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ExternalReference> externalReference = new ArrayList<ExternalReference>();

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

    public Attachment withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Attachment. Embedded_ Document. Binary Object
     * <p>
     * A binary large object containing an attached document.
     * 
     */
    @JsonProperty("EmbeddedDocumentBinaryObject")
    public List<BinaryObjectType> getEmbeddedDocumentBinaryObject() {
        return embeddedDocumentBinaryObject;
    }

    /**
     * Attachment. Embedded_ Document. Binary Object
     * <p>
     * A binary large object containing an attached document.
     * 
     */
    @JsonProperty("EmbeddedDocumentBinaryObject")
    public void setEmbeddedDocumentBinaryObject(List<BinaryObjectType> embeddedDocumentBinaryObject) {
        this.embeddedDocumentBinaryObject = embeddedDocumentBinaryObject;
    }

    public Attachment withEmbeddedDocumentBinaryObject(List<BinaryObjectType> embeddedDocumentBinaryObject) {
        this.embeddedDocumentBinaryObject = embeddedDocumentBinaryObject;
        return this;
    }

    /**
     * Attachment. External Reference
     * <p>
     * A reference to an attached document that is external to the document(s) being exchanged.
     * 
     */
    @JsonProperty("ExternalReference")
    public List<ExternalReference> getExternalReference() {
        return externalReference;
    }

    /**
     * Attachment. External Reference
     * <p>
     * A reference to an attached document that is external to the document(s) being exchanged.
     * 
     */
    @JsonProperty("ExternalReference")
    public void setExternalReference(List<ExternalReference> externalReference) {
        this.externalReference = externalReference;
    }

    public Attachment withExternalReference(List<ExternalReference> externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Attachment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("embeddedDocumentBinaryObject");
        sb.append('=');
        sb.append(((this.embeddedDocumentBinaryObject == null)?"<null>":this.embeddedDocumentBinaryObject));
        sb.append(',');
        sb.append("externalReference");
        sb.append('=');
        sb.append(((this.externalReference == null)?"<null>":this.externalReference));
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
        result = ((result* 31)+((this.externalReference == null)? 0 :this.externalReference.hashCode()));
        result = ((result* 31)+((this.embeddedDocumentBinaryObject == null)? 0 :this.embeddedDocumentBinaryObject.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attachment) == false) {
            return false;
        }
        Attachment rhs = ((Attachment) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.externalReference == rhs.externalReference)||((this.externalReference!= null)&&this.externalReference.equals(rhs.externalReference))))&&((this.embeddedDocumentBinaryObject == rhs.embeddedDocumentBinaryObject)||((this.embeddedDocumentBinaryObject!= null)&&this.embeddedDocumentBinaryObject.equals(rhs.embeddedDocumentBinaryObject))));
    }

}
