
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
 * Receipt Line. Details
 * <p>
 * A class to define a line in a Receipt Advice.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "UUID",
    "Note",
    "ReceivedQuantity",
    "ShortQuantity",
    "ShortageActionCode",
    "RejectedQuantity",
    "RejectReasonCode",
    "RejectReason",
    "RejectActionCode",
    "QuantityDiscrepancyCode",
    "OversupplyQuantity",
    "ReceivedDate",
    "TimingComplaintCode",
    "TimingComplaint",
    "OrderLineReference",
    "DespatchLineReference",
    "DocumentReference",
    "Item",
    "Shipment"
})
@Generated("jsonschema2pojo")
public class ReceiptLine {

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
     * Receipt Line. Identifier
     * <p>
     * An identifier for this receipt line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this receipt line.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Receipt Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this receipt line.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this receipt line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Receipt Line. Note. Text
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
     * Receipt Line. Received_ Quantity. Quantity
     * <p>
     * The quantity received.
     * 
     */
    @JsonProperty("ReceivedQuantity")
    @JsonPropertyDescription("The quantity received.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> receivedQuantity = new ArrayList<QuantityType>();
    /**
     * Receipt Line. Short_ Quantity. Quantity
     * <p>
     * The quantity received short; the difference between the quantity reported despatched and the quantity actually received.
     * 
     */
    @JsonProperty("ShortQuantity")
    @JsonPropertyDescription("The quantity received short; the difference between the quantity reported despatched and the quantity actually received.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> shortQuantity = new ArrayList<QuantityType>();
    /**
     * Receipt Line. Shortage Action Code. Code
     * <p>
     * A code signifying the action that the delivery party wishes the despatch party to take as the result of a shortage.
     * 
     */
    @JsonProperty("ShortageActionCode")
    @JsonPropertyDescription("A code signifying the action that the delivery party wishes the despatch party to take as the result of a shortage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> shortageActionCode = new ArrayList<CodeType>();
    /**
     * Receipt Line. Rejected_ Quantity. Quantity
     * <p>
     * The quantity rejected.
     * 
     */
    @JsonProperty("RejectedQuantity")
    @JsonPropertyDescription("The quantity rejected.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> rejectedQuantity = new ArrayList<QuantityType>();
    /**
     * Receipt Line. Reject Reason Code. Code
     * <p>
     * The reason for a rejection, expressed as a code.
     * 
     */
    @JsonProperty("RejectReasonCode")
    @JsonPropertyDescription("The reason for a rejection, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> rejectReasonCode = new ArrayList<CodeType>();
    /**
     * Receipt Line. Reject_ Reason. Text
     * <p>
     * The reason for a rejection, expressed as text.
     * 
     */
    @JsonProperty("RejectReason")
    @JsonPropertyDescription("The reason for a rejection, expressed as text.")
    @Size(min = 1)
    @Valid
    private List<TextType> rejectReason = new ArrayList<TextType>();
    /**
     * Receipt Line. Reject Action Code. Code
     * <p>
     * A code signifying the action that the delivery party wishes the despatch party to take as the result of a rejection.
     * 
     */
    @JsonProperty("RejectActionCode")
    @JsonPropertyDescription("A code signifying the action that the delivery party wishes the despatch party to take as the result of a rejection.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> rejectActionCode = new ArrayList<CodeType>();
    /**
     * Receipt Line. Quantity Discrepancy Code. Code
     * <p>
     * A code signifying the type of a discrepancy in quantity.
     * 
     */
    @JsonProperty("QuantityDiscrepancyCode")
    @JsonPropertyDescription("A code signifying the type of a discrepancy in quantity.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> quantityDiscrepancyCode = new ArrayList<CodeType>();
    /**
     * Receipt Line. Oversupply_ Quantity. Quantity
     * <p>
     * The quantity over-supplied, i.e., the quantity over and above the quantity ordered.
     * 
     */
    @JsonProperty("OversupplyQuantity")
    @JsonPropertyDescription("The quantity over-supplied, i.e., the quantity over and above the quantity ordered.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> oversupplyQuantity = new ArrayList<QuantityType>();
    /**
     * Receipt Line. Received_ Date. Date
     * <p>
     * The date on which the goods or services were received.
     * 
     */
    @JsonProperty("ReceivedDate")
    @JsonPropertyDescription("The date on which the goods or services were received.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> receivedDate = new ArrayList<DateType>();
    /**
     * Receipt Line. Timing Complaint Code. Code
     * <p>
     * A complaint about the timing of delivery, expressed as a code.
     * 
     */
    @JsonProperty("TimingComplaintCode")
    @JsonPropertyDescription("A complaint about the timing of delivery, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> timingComplaintCode = new ArrayList<CodeType>();
    /**
     * Receipt Line. Timing Complaint. Text
     * <p>
     * A complaint about the timing of delivery, expressed as text.
     * 
     */
    @JsonProperty("TimingComplaint")
    @JsonPropertyDescription("A complaint about the timing of delivery, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> timingComplaint = new ArrayList<TextType>();
    /**
     * Receipt Line. Order Line Reference
     * <p>
     * A reference to the order line associated with this receipt line.
     * 
     */
    @JsonProperty("OrderLineReference")
    @JsonPropertyDescription("A reference to the order line associated with this receipt line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<OrderLineReference> orderLineReference = new ArrayList<OrderLineReference>();
    /**
     * Receipt Line. Despatch_ Line Reference. Line Reference
     * <p>
     * A reference to a despatch line associated with this receipt line.
     * 
     */
    @JsonProperty("DespatchLineReference")
    @JsonPropertyDescription("A reference to a despatch line associated with this receipt line.")
    @Size(min = 1)
    @Valid
    private List<LineReference> despatchLineReference = new ArrayList<LineReference>();
    /**
     * Receipt Line. Document Reference
     * <p>
     * A reference to a document associated with this receipt line.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A reference to a document associated with this receipt line.")
    @Size(min = 1)
    @Valid
    private List<DocumentReference> documentReference = new ArrayList<DocumentReference>();
    /**
     * Receipt Line. Item
     * <p>
     * An item associated with this receipt line.
     * 
     */
    @JsonProperty("Item")
    @JsonPropertyDescription("An item associated with this receipt line.")
    @Size(min = 1)
    @Valid
    private List<Item> item = new ArrayList<Item>();
    /**
     * Receipt Line. Shipment
     * <p>
     * A shipment associated with this receipt line.
     * 
     */
    @JsonProperty("Shipment")
    @JsonPropertyDescription("A shipment associated with this receipt line.")
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

    public ReceiptLine withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Receipt Line. Identifier
     * <p>
     * An identifier for this receipt line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Receipt Line. Identifier
     * <p>
     * An identifier for this receipt line.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ReceiptLine withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Receipt Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this receipt line.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Receipt Line. UUID. Identifier
     * <p>
     * A universally unique identifier for this receipt line.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public ReceiptLine withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Receipt Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Receipt Line. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures.
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public ReceiptLine withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Receipt Line. Received_ Quantity. Quantity
     * <p>
     * The quantity received.
     * 
     */
    @JsonProperty("ReceivedQuantity")
    public List<QuantityType> getReceivedQuantity() {
        return receivedQuantity;
    }

    /**
     * Receipt Line. Received_ Quantity. Quantity
     * <p>
     * The quantity received.
     * 
     */
    @JsonProperty("ReceivedQuantity")
    public void setReceivedQuantity(List<QuantityType> receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
    }

    public ReceiptLine withReceivedQuantity(List<QuantityType> receivedQuantity) {
        this.receivedQuantity = receivedQuantity;
        return this;
    }

    /**
     * Receipt Line. Short_ Quantity. Quantity
     * <p>
     * The quantity received short; the difference between the quantity reported despatched and the quantity actually received.
     * 
     */
    @JsonProperty("ShortQuantity")
    public List<QuantityType> getShortQuantity() {
        return shortQuantity;
    }

    /**
     * Receipt Line. Short_ Quantity. Quantity
     * <p>
     * The quantity received short; the difference between the quantity reported despatched and the quantity actually received.
     * 
     */
    @JsonProperty("ShortQuantity")
    public void setShortQuantity(List<QuantityType> shortQuantity) {
        this.shortQuantity = shortQuantity;
    }

    public ReceiptLine withShortQuantity(List<QuantityType> shortQuantity) {
        this.shortQuantity = shortQuantity;
        return this;
    }

    /**
     * Receipt Line. Shortage Action Code. Code
     * <p>
     * A code signifying the action that the delivery party wishes the despatch party to take as the result of a shortage.
     * 
     */
    @JsonProperty("ShortageActionCode")
    public List<CodeType> getShortageActionCode() {
        return shortageActionCode;
    }

    /**
     * Receipt Line. Shortage Action Code. Code
     * <p>
     * A code signifying the action that the delivery party wishes the despatch party to take as the result of a shortage.
     * 
     */
    @JsonProperty("ShortageActionCode")
    public void setShortageActionCode(List<CodeType> shortageActionCode) {
        this.shortageActionCode = shortageActionCode;
    }

    public ReceiptLine withShortageActionCode(List<CodeType> shortageActionCode) {
        this.shortageActionCode = shortageActionCode;
        return this;
    }

    /**
     * Receipt Line. Rejected_ Quantity. Quantity
     * <p>
     * The quantity rejected.
     * 
     */
    @JsonProperty("RejectedQuantity")
    public List<QuantityType> getRejectedQuantity() {
        return rejectedQuantity;
    }

    /**
     * Receipt Line. Rejected_ Quantity. Quantity
     * <p>
     * The quantity rejected.
     * 
     */
    @JsonProperty("RejectedQuantity")
    public void setRejectedQuantity(List<QuantityType> rejectedQuantity) {
        this.rejectedQuantity = rejectedQuantity;
    }

    public ReceiptLine withRejectedQuantity(List<QuantityType> rejectedQuantity) {
        this.rejectedQuantity = rejectedQuantity;
        return this;
    }

    /**
     * Receipt Line. Reject Reason Code. Code
     * <p>
     * The reason for a rejection, expressed as a code.
     * 
     */
    @JsonProperty("RejectReasonCode")
    public List<CodeType> getRejectReasonCode() {
        return rejectReasonCode;
    }

    /**
     * Receipt Line. Reject Reason Code. Code
     * <p>
     * The reason for a rejection, expressed as a code.
     * 
     */
    @JsonProperty("RejectReasonCode")
    public void setRejectReasonCode(List<CodeType> rejectReasonCode) {
        this.rejectReasonCode = rejectReasonCode;
    }

    public ReceiptLine withRejectReasonCode(List<CodeType> rejectReasonCode) {
        this.rejectReasonCode = rejectReasonCode;
        return this;
    }

    /**
     * Receipt Line. Reject_ Reason. Text
     * <p>
     * The reason for a rejection, expressed as text.
     * 
     */
    @JsonProperty("RejectReason")
    public List<TextType> getRejectReason() {
        return rejectReason;
    }

    /**
     * Receipt Line. Reject_ Reason. Text
     * <p>
     * The reason for a rejection, expressed as text.
     * 
     */
    @JsonProperty("RejectReason")
    public void setRejectReason(List<TextType> rejectReason) {
        this.rejectReason = rejectReason;
    }

    public ReceiptLine withRejectReason(List<TextType> rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }

    /**
     * Receipt Line. Reject Action Code. Code
     * <p>
     * A code signifying the action that the delivery party wishes the despatch party to take as the result of a rejection.
     * 
     */
    @JsonProperty("RejectActionCode")
    public List<CodeType> getRejectActionCode() {
        return rejectActionCode;
    }

    /**
     * Receipt Line. Reject Action Code. Code
     * <p>
     * A code signifying the action that the delivery party wishes the despatch party to take as the result of a rejection.
     * 
     */
    @JsonProperty("RejectActionCode")
    public void setRejectActionCode(List<CodeType> rejectActionCode) {
        this.rejectActionCode = rejectActionCode;
    }

    public ReceiptLine withRejectActionCode(List<CodeType> rejectActionCode) {
        this.rejectActionCode = rejectActionCode;
        return this;
    }

    /**
     * Receipt Line. Quantity Discrepancy Code. Code
     * <p>
     * A code signifying the type of a discrepancy in quantity.
     * 
     */
    @JsonProperty("QuantityDiscrepancyCode")
    public List<CodeType> getQuantityDiscrepancyCode() {
        return quantityDiscrepancyCode;
    }

    /**
     * Receipt Line. Quantity Discrepancy Code. Code
     * <p>
     * A code signifying the type of a discrepancy in quantity.
     * 
     */
    @JsonProperty("QuantityDiscrepancyCode")
    public void setQuantityDiscrepancyCode(List<CodeType> quantityDiscrepancyCode) {
        this.quantityDiscrepancyCode = quantityDiscrepancyCode;
    }

    public ReceiptLine withQuantityDiscrepancyCode(List<CodeType> quantityDiscrepancyCode) {
        this.quantityDiscrepancyCode = quantityDiscrepancyCode;
        return this;
    }

    /**
     * Receipt Line. Oversupply_ Quantity. Quantity
     * <p>
     * The quantity over-supplied, i.e., the quantity over and above the quantity ordered.
     * 
     */
    @JsonProperty("OversupplyQuantity")
    public List<QuantityType> getOversupplyQuantity() {
        return oversupplyQuantity;
    }

    /**
     * Receipt Line. Oversupply_ Quantity. Quantity
     * <p>
     * The quantity over-supplied, i.e., the quantity over and above the quantity ordered.
     * 
     */
    @JsonProperty("OversupplyQuantity")
    public void setOversupplyQuantity(List<QuantityType> oversupplyQuantity) {
        this.oversupplyQuantity = oversupplyQuantity;
    }

    public ReceiptLine withOversupplyQuantity(List<QuantityType> oversupplyQuantity) {
        this.oversupplyQuantity = oversupplyQuantity;
        return this;
    }

    /**
     * Receipt Line. Received_ Date. Date
     * <p>
     * The date on which the goods or services were received.
     * 
     */
    @JsonProperty("ReceivedDate")
    public List<DateType> getReceivedDate() {
        return receivedDate;
    }

    /**
     * Receipt Line. Received_ Date. Date
     * <p>
     * The date on which the goods or services were received.
     * 
     */
    @JsonProperty("ReceivedDate")
    public void setReceivedDate(List<DateType> receivedDate) {
        this.receivedDate = receivedDate;
    }

    public ReceiptLine withReceivedDate(List<DateType> receivedDate) {
        this.receivedDate = receivedDate;
        return this;
    }

    /**
     * Receipt Line. Timing Complaint Code. Code
     * <p>
     * A complaint about the timing of delivery, expressed as a code.
     * 
     */
    @JsonProperty("TimingComplaintCode")
    public List<CodeType> getTimingComplaintCode() {
        return timingComplaintCode;
    }

    /**
     * Receipt Line. Timing Complaint Code. Code
     * <p>
     * A complaint about the timing of delivery, expressed as a code.
     * 
     */
    @JsonProperty("TimingComplaintCode")
    public void setTimingComplaintCode(List<CodeType> timingComplaintCode) {
        this.timingComplaintCode = timingComplaintCode;
    }

    public ReceiptLine withTimingComplaintCode(List<CodeType> timingComplaintCode) {
        this.timingComplaintCode = timingComplaintCode;
        return this;
    }

    /**
     * Receipt Line. Timing Complaint. Text
     * <p>
     * A complaint about the timing of delivery, expressed as text.
     * 
     */
    @JsonProperty("TimingComplaint")
    public List<TextType> getTimingComplaint() {
        return timingComplaint;
    }

    /**
     * Receipt Line. Timing Complaint. Text
     * <p>
     * A complaint about the timing of delivery, expressed as text.
     * 
     */
    @JsonProperty("TimingComplaint")
    public void setTimingComplaint(List<TextType> timingComplaint) {
        this.timingComplaint = timingComplaint;
    }

    public ReceiptLine withTimingComplaint(List<TextType> timingComplaint) {
        this.timingComplaint = timingComplaint;
        return this;
    }

    /**
     * Receipt Line. Order Line Reference
     * <p>
     * A reference to the order line associated with this receipt line.
     * 
     */
    @JsonProperty("OrderLineReference")
    public List<OrderLineReference> getOrderLineReference() {
        return orderLineReference;
    }

    /**
     * Receipt Line. Order Line Reference
     * <p>
     * A reference to the order line associated with this receipt line.
     * 
     */
    @JsonProperty("OrderLineReference")
    public void setOrderLineReference(List<OrderLineReference> orderLineReference) {
        this.orderLineReference = orderLineReference;
    }

    public ReceiptLine withOrderLineReference(List<OrderLineReference> orderLineReference) {
        this.orderLineReference = orderLineReference;
        return this;
    }

    /**
     * Receipt Line. Despatch_ Line Reference. Line Reference
     * <p>
     * A reference to a despatch line associated with this receipt line.
     * 
     */
    @JsonProperty("DespatchLineReference")
    public List<LineReference> getDespatchLineReference() {
        return despatchLineReference;
    }

    /**
     * Receipt Line. Despatch_ Line Reference. Line Reference
     * <p>
     * A reference to a despatch line associated with this receipt line.
     * 
     */
    @JsonProperty("DespatchLineReference")
    public void setDespatchLineReference(List<LineReference> despatchLineReference) {
        this.despatchLineReference = despatchLineReference;
    }

    public ReceiptLine withDespatchLineReference(List<LineReference> despatchLineReference) {
        this.despatchLineReference = despatchLineReference;
        return this;
    }

    /**
     * Receipt Line. Document Reference
     * <p>
     * A reference to a document associated with this receipt line.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Receipt Line. Document Reference
     * <p>
     * A reference to a document associated with this receipt line.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public ReceiptLine withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    /**
     * Receipt Line. Item
     * <p>
     * An item associated with this receipt line.
     * 
     */
    @JsonProperty("Item")
    public List<Item> getItem() {
        return item;
    }

    /**
     * Receipt Line. Item
     * <p>
     * An item associated with this receipt line.
     * 
     */
    @JsonProperty("Item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    public ReceiptLine withItem(List<Item> item) {
        this.item = item;
        return this;
    }

    /**
     * Receipt Line. Shipment
     * <p>
     * A shipment associated with this receipt line.
     * 
     */
    @JsonProperty("Shipment")
    public List<Shipment> getShipment() {
        return shipment;
    }

    /**
     * Receipt Line. Shipment
     * <p>
     * A shipment associated with this receipt line.
     * 
     */
    @JsonProperty("Shipment")
    public void setShipment(List<Shipment> shipment) {
        this.shipment = shipment;
    }

    public ReceiptLine withShipment(List<Shipment> shipment) {
        this.shipment = shipment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReceiptLine.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("receivedQuantity");
        sb.append('=');
        sb.append(((this.receivedQuantity == null)?"<null>":this.receivedQuantity));
        sb.append(',');
        sb.append("shortQuantity");
        sb.append('=');
        sb.append(((this.shortQuantity == null)?"<null>":this.shortQuantity));
        sb.append(',');
        sb.append("shortageActionCode");
        sb.append('=');
        sb.append(((this.shortageActionCode == null)?"<null>":this.shortageActionCode));
        sb.append(',');
        sb.append("rejectedQuantity");
        sb.append('=');
        sb.append(((this.rejectedQuantity == null)?"<null>":this.rejectedQuantity));
        sb.append(',');
        sb.append("rejectReasonCode");
        sb.append('=');
        sb.append(((this.rejectReasonCode == null)?"<null>":this.rejectReasonCode));
        sb.append(',');
        sb.append("rejectReason");
        sb.append('=');
        sb.append(((this.rejectReason == null)?"<null>":this.rejectReason));
        sb.append(',');
        sb.append("rejectActionCode");
        sb.append('=');
        sb.append(((this.rejectActionCode == null)?"<null>":this.rejectActionCode));
        sb.append(',');
        sb.append("quantityDiscrepancyCode");
        sb.append('=');
        sb.append(((this.quantityDiscrepancyCode == null)?"<null>":this.quantityDiscrepancyCode));
        sb.append(',');
        sb.append("oversupplyQuantity");
        sb.append('=');
        sb.append(((this.oversupplyQuantity == null)?"<null>":this.oversupplyQuantity));
        sb.append(',');
        sb.append("receivedDate");
        sb.append('=');
        sb.append(((this.receivedDate == null)?"<null>":this.receivedDate));
        sb.append(',');
        sb.append("timingComplaintCode");
        sb.append('=');
        sb.append(((this.timingComplaintCode == null)?"<null>":this.timingComplaintCode));
        sb.append(',');
        sb.append("timingComplaint");
        sb.append('=');
        sb.append(((this.timingComplaint == null)?"<null>":this.timingComplaint));
        sb.append(',');
        sb.append("orderLineReference");
        sb.append('=');
        sb.append(((this.orderLineReference == null)?"<null>":this.orderLineReference));
        sb.append(',');
        sb.append("despatchLineReference");
        sb.append('=');
        sb.append(((this.despatchLineReference == null)?"<null>":this.despatchLineReference));
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
        result = ((result* 31)+((this.item == null)? 0 :this.item.hashCode()));
        result = ((result* 31)+((this.shipment == null)? 0 :this.shipment.hashCode()));
        result = ((result* 31)+((this.shortageActionCode == null)? 0 :this.shortageActionCode.hashCode()));
        result = ((result* 31)+((this.orderLineReference == null)? 0 :this.orderLineReference.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.shortQuantity == null)? 0 :this.shortQuantity.hashCode()));
        result = ((result* 31)+((this.rejectReasonCode == null)? 0 :this.rejectReasonCode.hashCode()));
        result = ((result* 31)+((this.timingComplaint == null)? 0 :this.timingComplaint.hashCode()));
        result = ((result* 31)+((this.rejectActionCode == null)? 0 :this.rejectActionCode.hashCode()));
        result = ((result* 31)+((this.despatchLineReference == null)? 0 :this.despatchLineReference.hashCode()));
        result = ((result* 31)+((this.rejectedQuantity == null)? 0 :this.rejectedQuantity.hashCode()));
        result = ((result* 31)+((this.timingComplaintCode == null)? 0 :this.timingComplaintCode.hashCode()));
        result = ((result* 31)+((this.quantityDiscrepancyCode == null)? 0 :this.quantityDiscrepancyCode.hashCode()));
        result = ((result* 31)+((this.rejectReason == null)? 0 :this.rejectReason.hashCode()));
        result = ((result* 31)+((this.receivedQuantity == null)? 0 :this.receivedQuantity.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.receivedDate == null)? 0 :this.receivedDate.hashCode()));
        result = ((result* 31)+((this.oversupplyQuantity == null)? 0 :this.oversupplyQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptLine) == false) {
            return false;
        }
        ReceiptLine rhs = ((ReceiptLine) other);
        return ((((((((((((((((((((((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note)))&&((this.item == rhs.item)||((this.item!= null)&&this.item.equals(rhs.item))))&&((this.shipment == rhs.shipment)||((this.shipment!= null)&&this.shipment.equals(rhs.shipment))))&&((this.shortageActionCode == rhs.shortageActionCode)||((this.shortageActionCode!= null)&&this.shortageActionCode.equals(rhs.shortageActionCode))))&&((this.orderLineReference == rhs.orderLineReference)||((this.orderLineReference!= null)&&this.orderLineReference.equals(rhs.orderLineReference))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.shortQuantity == rhs.shortQuantity)||((this.shortQuantity!= null)&&this.shortQuantity.equals(rhs.shortQuantity))))&&((this.rejectReasonCode == rhs.rejectReasonCode)||((this.rejectReasonCode!= null)&&this.rejectReasonCode.equals(rhs.rejectReasonCode))))&&((this.timingComplaint == rhs.timingComplaint)||((this.timingComplaint!= null)&&this.timingComplaint.equals(rhs.timingComplaint))))&&((this.rejectActionCode == rhs.rejectActionCode)||((this.rejectActionCode!= null)&&this.rejectActionCode.equals(rhs.rejectActionCode))))&&((this.despatchLineReference == rhs.despatchLineReference)||((this.despatchLineReference!= null)&&this.despatchLineReference.equals(rhs.despatchLineReference))))&&((this.rejectedQuantity == rhs.rejectedQuantity)||((this.rejectedQuantity!= null)&&this.rejectedQuantity.equals(rhs.rejectedQuantity))))&&((this.timingComplaintCode == rhs.timingComplaintCode)||((this.timingComplaintCode!= null)&&this.timingComplaintCode.equals(rhs.timingComplaintCode))))&&((this.quantityDiscrepancyCode == rhs.quantityDiscrepancyCode)||((this.quantityDiscrepancyCode!= null)&&this.quantityDiscrepancyCode.equals(rhs.quantityDiscrepancyCode))))&&((this.rejectReason == rhs.rejectReason)||((this.rejectReason!= null)&&this.rejectReason.equals(rhs.rejectReason))))&&((this.receivedQuantity == rhs.receivedQuantity)||((this.receivedQuantity!= null)&&this.receivedQuantity.equals(rhs.receivedQuantity))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.receivedDate == rhs.receivedDate)||((this.receivedDate!= null)&&this.receivedDate.equals(rhs.receivedDate))))&&((this.oversupplyQuantity == rhs.oversupplyQuantity)||((this.oversupplyQuantity!= null)&&this.oversupplyQuantity.equals(rhs.oversupplyQuantity))));
    }

}
