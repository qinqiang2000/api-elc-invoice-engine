
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
 * Transaction Conditions. Details
 * <p>
 * A class to describe purchasing, sales, or payment conditions.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ActionCode",
    "Description",
    "DocumentReference"
})
@Generated("jsonschema2pojo")
public class TransactionConditions {

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
     * Transaction Conditions. Identifier
     * <p>
     * An identifier for conditions of the transaction, typically purchase/sales conditions.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for conditions of the transaction, typically purchase/sales conditions.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Transaction Conditions. Action Code. Code
     * <p>
     * A code signifying a type of action relating to sales or payment conditions.
     * 
     */
    @JsonProperty("ActionCode")
    @JsonPropertyDescription("A code signifying a type of action relating to sales or payment conditions.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> actionCode = new ArrayList<CodeType>();
    /**
     * Transaction Conditions. Description. Text
     * <p>
     * Text describing the transaction conditions.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing the transaction conditions.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();
    /**
     * Transaction Conditions. Document Reference
     * <p>
     * A document associated with these transaction conditions.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A document associated with these transaction conditions.")
    @Size(min = 1)
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

    public TransactionConditions withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Transaction Conditions. Identifier
     * <p>
     * An identifier for conditions of the transaction, typically purchase/sales conditions.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Transaction Conditions. Identifier
     * <p>
     * An identifier for conditions of the transaction, typically purchase/sales conditions.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public TransactionConditions withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Transaction Conditions. Action Code. Code
     * <p>
     * A code signifying a type of action relating to sales or payment conditions.
     * 
     */
    @JsonProperty("ActionCode")
    public List<CodeType> getActionCode() {
        return actionCode;
    }

    /**
     * Transaction Conditions. Action Code. Code
     * <p>
     * A code signifying a type of action relating to sales or payment conditions.
     * 
     */
    @JsonProperty("ActionCode")
    public void setActionCode(List<CodeType> actionCode) {
        this.actionCode = actionCode;
    }

    public TransactionConditions withActionCode(List<CodeType> actionCode) {
        this.actionCode = actionCode;
        return this;
    }

    /**
     * Transaction Conditions. Description. Text
     * <p>
     * Text describing the transaction conditions.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * Transaction Conditions. Description. Text
     * <p>
     * Text describing the transaction conditions.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public TransactionConditions withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    /**
     * Transaction Conditions. Document Reference
     * <p>
     * A document associated with these transaction conditions.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Transaction Conditions. Document Reference
     * <p>
     * A document associated with these transaction conditions.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public TransactionConditions withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransactionConditions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actionCode");
        sb.append('=');
        sb.append(((this.actionCode == null)?"<null>":this.actionCode));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.actionCode == null)? 0 :this.actionCode.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransactionConditions) == false) {
            return false;
        }
        TransactionConditions rhs = ((TransactionConditions) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.actionCode == rhs.actionCode)||((this.actionCode!= null)&&this.actionCode.equals(rhs.actionCode))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
