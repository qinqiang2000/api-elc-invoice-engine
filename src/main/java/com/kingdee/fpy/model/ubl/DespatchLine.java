
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
 * Despatch Line. Details
 * <p>
 * A class to define a line in a Despatch Advice.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "UUID",
    "Note",
    "LineStatusCode",
    "DeliveredQuantity",
    "BackorderQuantity",
    "BackorderReason",
    "OutstandingQuantity",
    "OutstandingReason",
    "OversupplyQuantity",
    "OrderLineReference",
    "DocumentReference",
    "Item",
    "Shipment"
})
@Generated("jsonschema2pojo")
public class DespatchLine {

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
     * Despatch Line. Identifier
     * <p>
     * An identifier for this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this despatch line.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Despatch Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this despatch line.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this despatch line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Despatch Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Free-form text conveying information that is not contained explicitly in other structures.")
    @Size(min = 1)
    @Valid
    private List<TextType> note = new ArrayList<TextType>();
    /**
     * Despatch Line. Line Status Code. Code
     * <p>
     * A code signifying the status of this despatch line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    @JsonPropertyDescription("A code signifying the status of this despatch line with respect to its original state.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> lineStatusCode = new ArrayList<CodeType>();
    /**
     * Despatch Line. Delivered_ Quantity. Quantity
     * <p>
     * The quantity despatched (picked up).
     * 
     */
    @JsonProperty("DeliveredQuantity")
    @JsonPropertyDescription("The quantity despatched (picked up).")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> deliveredQuantity = new ArrayList<QuantityType>();
    /**
     * Despatch Line. Backorder_ Quantity. Quantity
     * <p>
     * The quantity on back order at the supplier.
     * 
     */
    @JsonProperty("BackorderQuantity")
    @JsonPropertyDescription("The quantity on back order at the supplier.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> backorderQuantity = new ArrayList<QuantityType>();
    /**
     * Despatch Line. Backorder_ Reason. Text
     * <p>
     * The reason for the back order.
     * 
     */
    @JsonProperty("BackorderReason")
    @JsonPropertyDescription("The reason for the back order.")
    @Size(min = 1)
    @Valid
    private List<TextType> backorderReason = new ArrayList<TextType>();
    /**
     * Despatch Line. Outstanding_ Quantity. Quantity
     * <p>
     * The quantity outstanding (which will follow in a later despatch).
     * 
     */
    @JsonProperty("OutstandingQuantity")
    @JsonPropertyDescription("The quantity outstanding (which will follow in a later despatch).")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> outstandingQuantity = new ArrayList<QuantityType>();
    /**
     * Despatch Line. Outstanding_ Reason. Text
     * <p>
     * The reason for the outstanding quantity.
     * 
     */
    @JsonProperty("OutstandingReason")
    @JsonPropertyDescription("The reason for the outstanding quantity.")
    @Size(min = 1)
    @Valid
    private List<TextType> outstandingReason = new ArrayList<TextType>();
    /**
     * Despatch Line. Oversupply_ Quantity. Quantity
     * <p>
     * The quantity over-supplied, i.e., the quantity over and above that ordered.
     * 
     */
    @JsonProperty("OversupplyQuantity")
    @JsonPropertyDescription("The quantity over-supplied, i.e., the quantity over and above that ordered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> oversupplyQuantity = new ArrayList<QuantityType>();
    /**
     * Despatch Line. Order Line Reference
     * <p>
     * A reference to an order line associated with this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("OrderLineReference")
    @JsonPropertyDescription("A reference to an order line associated with this despatch line.")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<OrderLineReference> orderLineReference = new ArrayList<OrderLineReference>();
    /**
     * Despatch Line. Document Reference
     * <p>
     * A reference to a document associated with this despatch line.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A reference to a document associated with this despatch line.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> documentReference = new ArrayList<DocumentReference>();
    /**
     * Despatch Line. Item
     * <p>
     * The item associated with this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("Item")
    @JsonPropertyDescription("The item associated with this despatch line.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<Item> item = new ArrayList<Item>();
    /**
     * Despatch Line. Shipment
     * <p>
     * A shipment associated with this despatch line.
     * 
     */
    @JsonProperty("Shipment")
    @JsonPropertyDescription("A shipment associated with this despatch line.")
    @Size(min = 1)
    @Valid
    private List<Shipment> shipment = new ArrayList<Shipment>();

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

    public DespatchLine withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Despatch Line. Identifier
     * <p>
     * An identifier for this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Despatch Line. Identifier
     * <p>
     * An identifier for this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public DespatchLine withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Despatch Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this despatch line.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Despatch Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this despatch line.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public DespatchLine withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Despatch Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Despatch Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public DespatchLine withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Despatch Line. Line Status Code. Code
     * <p>
     * A code signifying the status of this despatch line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    public List<CodeType> getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Despatch Line. Line Status Code. Code
     * <p>
     * A code signifying the status of this despatch line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    public void setLineStatusCode(List<CodeType> lineStatusCode) {
        this.lineStatusCode = lineStatusCode;
    }

    public DespatchLine withLineStatusCode(List<CodeType> lineStatusCode) {
        this.lineStatusCode = lineStatusCode;
        return this;
    }

    /**
     * Despatch Line. Delivered_ Quantity. Quantity
     * <p>
     * The quantity despatched (picked up).
     * 
     */
    @JsonProperty("DeliveredQuantity")
    public List<QuantityType> getDeliveredQuantity() {
        return deliveredQuantity;
    }

    /**
     * Despatch Line. Delivered_ Quantity. Quantity
     * <p>
     * The quantity despatched (picked up).
     * 
     */
    @JsonProperty("DeliveredQuantity")
    public void setDeliveredQuantity(List<QuantityType> deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public DespatchLine withDeliveredQuantity(List<QuantityType> deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
        return this;
    }

    /**
     * Despatch Line. Backorder_ Quantity. Quantity
     * <p>
     * The quantity on back order at the supplier.
     * 
     */
    @JsonProperty("BackorderQuantity")
    public List<QuantityType> getBackorderQuantity() {
        return backorderQuantity;
    }

    /**
     * Despatch Line. Backorder_ Quantity. Quantity
     * <p>
     * The quantity on back order at the supplier.
     * 
     */
    @JsonProperty("BackorderQuantity")
    public void setBackorderQuantity(List<QuantityType> backorderQuantity) {
        this.backorderQuantity = backorderQuantity;
    }

    public DespatchLine withBackorderQuantity(List<QuantityType> backorderQuantity) {
        this.backorderQuantity = backorderQuantity;
        return this;
    }

    /**
     * Despatch Line. Backorder_ Reason. Text
     * <p>
     * The reason for the back order.
     * 
     */
    @JsonProperty("BackorderReason")
    public List<TextType> getBackorderReason() {
        return backorderReason;
    }

    /**
     * Despatch Line. Backorder_ Reason. Text
     * <p>
     * The reason for the back order.
     * 
     */
    @JsonProperty("BackorderReason")
    public void setBackorderReason(List<TextType> backorderReason) {
        this.backorderReason = backorderReason;
    }

    public DespatchLine withBackorderReason(List<TextType> backorderReason) {
        this.backorderReason = backorderReason;
        return this;
    }

    /**
     * Despatch Line. Outstanding_ Quantity. Quantity
     * <p>
     * The quantity outstanding (which will follow in a later despatch).
     * 
     */
    @JsonProperty("OutstandingQuantity")
    public List<QuantityType> getOutstandingQuantity() {
        return outstandingQuantity;
    }

    /**
     * Despatch Line. Outstanding_ Quantity. Quantity
     * <p>
     * The quantity outstanding (which will follow in a later despatch).
     * 
     */
    @JsonProperty("OutstandingQuantity")
    public void setOutstandingQuantity(List<QuantityType> outstandingQuantity) {
        this.outstandingQuantity = outstandingQuantity;
    }

    public DespatchLine withOutstandingQuantity(List<QuantityType> outstandingQuantity) {
        this.outstandingQuantity = outstandingQuantity;
        return this;
    }

    /**
     * Despatch Line. Outstanding_ Reason. Text
     * <p>
     * The reason for the outstanding quantity.
     * 
     */
    @JsonProperty("OutstandingReason")
    public List<TextType> getOutstandingReason() {
        return outstandingReason;
    }

    /**
     * Despatch Line. Outstanding_ Reason. Text
     * <p>
     * The reason for the outstanding quantity.
     * 
     */
    @JsonProperty("OutstandingReason")
    public void setOutstandingReason(List<TextType> outstandingReason) {
        this.outstandingReason = outstandingReason;
    }

    public DespatchLine withOutstandingReason(List<TextType> outstandingReason) {
        this.outstandingReason = outstandingReason;
        return this;
    }

    /**
     * Despatch Line. Oversupply_ Quantity. Quantity
     * <p>
     * The quantity over-supplied, i.e., the quantity over and above that ordered.
     * 
     */
    @JsonProperty("OversupplyQuantity")
    public List<QuantityType> getOversupplyQuantity() {
        return oversupplyQuantity;
    }

    /**
     * Despatch Line. Oversupply_ Quantity. Quantity
     * <p>
     * The quantity over-supplied, i.e., the quantity over and above that ordered.
     * 
     */
    @JsonProperty("OversupplyQuantity")
    public void setOversupplyQuantity(List<QuantityType> oversupplyQuantity) {
        this.oversupplyQuantity = oversupplyQuantity;
    }

    public DespatchLine withOversupplyQuantity(List<QuantityType> oversupplyQuantity) {
        this.oversupplyQuantity = oversupplyQuantity;
        return this;
    }

    /**
     * Despatch Line. Order Line Reference
     * <p>
     * A reference to an order line associated with this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("OrderLineReference")
    public List<OrderLineReference> getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * Despatch Line. Order Line Reference
     * <p>
     * A reference to an order line associated with this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("OrderLineReference")
    public void setOrderLineReference(List<OrderLineReference> orderLineReference) {
        this.orderLineReference = orderLineReference;
    }

    public DespatchLine withOrderLineReference(List<OrderLineReference> orderLineReference) {
        this.orderLineReference = orderLineReference;
        return this;
    }

    /**
     * Despatch Line. Document Reference
     * <p>
     * A reference to a document associated with this despatch line.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Despatch Line. Document Reference
     * <p>
     * A reference to a document associated with this despatch line.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public DespatchLine withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    /**
     * Despatch Line. Item
     * <p>
     * The item associated with this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("Item")
    public List<Item> getItem() {
        return item;
    }

    /**
     * Despatch Line. Item
     * <p>
     * The item associated with this despatch line.
     * (Required)
     * 
     */
    @JsonProperty("Item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    public DespatchLine withItem(List<Item> item) {
        this.item = item;
        return this;
    }

    /**
     * Despatch Line. Shipment
     * <p>
     * A shipment associated with this despatch line.
     * 
     */
    @JsonProperty("Shipment")
    public List<Shipment> getShipment() {
        return shipment;
    }

    /**
     * Despatch Line. Shipment
     * <p>
     * A shipment associated with this despatch line.
     * 
     */
    @JsonProperty("Shipment")
    public void setShipment(List<Shipment> shipment) {
        this.shipment = shipment;
    }

    public DespatchLine withShipment(List<Shipment> shipment) {
        this.shipment = shipment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DespatchLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("lineStatusCode");
        sb.append('=');
        sb.append(((this.lineStatusCode == null)?"<null>":this.lineStatusCode));
        sb.append(',');
        sb.append("deliveredQuantity");
        sb.append('=');
        sb.append(((this.deliveredQuantity == null)?"<null>":this.deliveredQuantity));
        sb.append(',');
        sb.append("backorderQuantity");
        sb.append('=');
        sb.append(((this.backorderQuantity == null)?"<null>":this.backorderQuantity));
        sb.append(',');
        sb.append("backorderReason");
        sb.append('=');
        sb.append(((this.backorderReason == null)?"<null>":this.backorderReason));
        sb.append(',');
        sb.append("outstandingQuantity");
        sb.append('=');
        sb.append(((this.outstandingQuantity == null)?"<null>":this.outstandingQuantity));
        sb.append(',');
        sb.append("outstandingReason");
        sb.append('=');
        sb.append(((this.outstandingReason == null)?"<null>":this.outstandingReason));
        sb.append(',');
        sb.append("oversupplyQuantity");
        sb.append('=');
        sb.append(((this.oversupplyQuantity == null)?"<null>":this.oversupplyQuantity));
        sb.append(',');
        sb.append("orderLineReference");
        sb.append('=');
        sb.append(((this.orderLineReference == null)?"<null>":this.orderLineReference));
        sb.append(',');
        sb.append("documentReference");
        sb.append('=');
        sb.append(((this.documentReference == null)?"<null>":this.documentReference));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("shipment");
        sb.append('=');
        sb.append(((this.shipment == null)?"<null>":this.shipment));
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
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.backorderQuantity == null)? 0 :this.backorderQuantity.hashCode()));
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.lineStatusCode == null)? 0 :this.lineStatusCode.hashCode()));
        result = ((result* 31)+((this.shipment == null)? 0 :this.shipment.hashCode()));
        result = ((result* 31)+((this.orderLineReference == null)? 0 :this.orderLineReference.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.deliveredQuantity == null)? 0 :this.deliveredQuantity.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.outstandingReason == null)? 0 :this.outstandingReason.hashCode()));
        result = ((result* 31)+((this.oversupplyQuantity == null)? 0 :this.oversupplyQuantity.hashCode()));
        result = ((result* 31)+((this.backorderReason == null)? 0 :this.backorderReason.hashCode()));
        result = ((result* 31)+((this.outstandingQuantity == null)? 0 :this.outstandingQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DespatchLine) == false) {
            return false;
        }
        DespatchLine rhs = ((DespatchLine) other);
        return ((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.backorderQuantity == rhs.backorderQuantity)||((this.backorderQuantity!= null)&&this.backorderQuantity.equals(rhs.backorderQuantity))))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.lineStatusCode == rhs.lineStatusCode)||((this.lineStatusCode!= null)&&this.lineStatusCode.equals(rhs.lineStatusCode))))&&((this.shipment == rhs.shipment)||((this.shipment!= null)&&this.shipment.equals(rhs.shipment))))&&((this.orderLineReference == rhs.orderLineReference)||((this.orderLineReference!= null)&&this.orderLineReference.equals(rhs.orderLineReference))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.deliveredQuantity == rhs.deliveredQuantity)||((this.deliveredQuantity!= null)&&this.deliveredQuantity.equals(rhs.deliveredQuantity))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.outstandingReason == rhs.outstandingReason)||((this.outstandingReason!= null)&&this.outstandingReason.equals(rhs.outstandingReason))))&&((this.oversupplyQuantity == rhs.oversupplyQuantity)||((this.oversupplyQuantity!= null)&&this.oversupplyQuantity.equals(rhs.oversupplyQuantity))))&&((this.backorderReason == rhs.backorderReason)||((this.backorderReason!= null)&&this.backorderReason.equals(rhs.backorderReason))))&&((this.outstandingQuantity == rhs.outstandingQuantity)||((this.outstandingQuantity!= null)&&this.outstandingQuantity.equals(rhs.outstandingQuantity))));
    }

}
