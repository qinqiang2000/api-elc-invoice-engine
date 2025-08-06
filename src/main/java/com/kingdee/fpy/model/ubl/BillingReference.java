
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
 * Billing Reference. Details
 * <p>
 * A class to define a reference to a billing document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "InvoiceDocumentReference",
    "SelfBilledInvoiceDocumentReference",
    "CreditNoteDocumentReference",
    "SelfBilledCreditNoteDocumentReference",
    "DebitNoteDocumentReference",
    "ReminderDocumentReference",
    "AdditionalDocumentReference",
    "BillingReferenceLine"
})
@Generated("jsonschema2pojo")
public class BillingReference {

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
     * Billing Reference. Invoice_ Document Reference. Document Reference
     * <p>
     * A reference to an invoice.
     * 
     */
    @JsonProperty("InvoiceDocumentReference")
    @JsonPropertyDescription("A reference to an invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> invoiceDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Self Billed Invoice_ Document Reference. Document Reference
     * <p>
     * A reference to a self billed invoice.
     * 
     */
    @JsonProperty("SelfBilledInvoiceDocumentReference")
    @JsonPropertyDescription("A reference to a self billed invoice.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> selfBilledInvoiceDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Credit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a credit note.
     * 
     */
    @JsonProperty("CreditNoteDocumentReference")
    @JsonPropertyDescription("A reference to a credit note.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> creditNoteDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Self Billed Credit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a self billed credit note.
     * 
     */
    @JsonProperty("SelfBilledCreditNoteDocumentReference")
    @JsonPropertyDescription("A reference to a self billed credit note.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> selfBilledCreditNoteDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Debit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a debit note.
     * 
     */
    @JsonProperty("DebitNoteDocumentReference")
    @JsonPropertyDescription("A reference to a debit note.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> debitNoteDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Reminder_ Document Reference. Document Reference
     * <p>
     * A reference to a billing reminder.
     * 
     */
    @JsonProperty("ReminderDocumentReference")
    @JsonPropertyDescription("A reference to a billing reminder.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> reminderDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Additional_ Document Reference. Document Reference
     * <p>
     * A reference to an additional document.
     * 
     */
    @JsonProperty("AdditionalDocumentReference")
    @JsonPropertyDescription("A reference to an additional document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DocumentReference> additionalDocumentReference = new ArrayList<DocumentReference>();
    /**
     * Billing Reference. Billing Reference Line
     * <p>
     * A reference to a transaction line in the billing document.
     * 
     */
    @JsonProperty("BillingReferenceLine")
    @JsonPropertyDescription("A reference to a transaction line in the billing document.")
    @Size(min = 1)
    @Valid
    private List<BillingReferenceLine> billingReferenceLine = new ArrayList<BillingReferenceLine>();

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

    public BillingReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Billing Reference. Invoice_ Document Reference. Document Reference
     * <p>
     * A reference to an invoice.
     * 
     */
    @JsonProperty("InvoiceDocumentReference")
    public List<DocumentReference> getInvoiceDocumentReference() {
        return invoiceDocumentReference;
    }

    /**
     * Billing Reference. Invoice_ Document Reference. Document Reference
     * <p>
     * A reference to an invoice.
     * 
     */
    @JsonProperty("InvoiceDocumentReference")
    public void setInvoiceDocumentReference(List<DocumentReference> invoiceDocumentReference) {
        this.invoiceDocumentReference = invoiceDocumentReference;
    }

    public BillingReference withInvoiceDocumentReference(List<DocumentReference> invoiceDocumentReference) {
        this.invoiceDocumentReference = invoiceDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Self Billed Invoice_ Document Reference. Document Reference
     * <p>
     * A reference to a self billed invoice.
     * 
     */
    @JsonProperty("SelfBilledInvoiceDocumentReference")
    public List<DocumentReference> getSelfBilledInvoiceDocumentReference() {
        return selfBilledInvoiceDocumentReference;
    }

    /**
     * Billing Reference. Self Billed Invoice_ Document Reference. Document Reference
     * <p>
     * A reference to a self billed invoice.
     * 
     */
    @JsonProperty("SelfBilledInvoiceDocumentReference")
    public void setSelfBilledInvoiceDocumentReference(List<DocumentReference> selfBilledInvoiceDocumentReference) {
        this.selfBilledInvoiceDocumentReference = selfBilledInvoiceDocumentReference;
    }

    public BillingReference withSelfBilledInvoiceDocumentReference(List<DocumentReference> selfBilledInvoiceDocumentReference) {
        this.selfBilledInvoiceDocumentReference = selfBilledInvoiceDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Credit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a credit note.
     * 
     */
    @JsonProperty("CreditNoteDocumentReference")
    public List<DocumentReference> getCreditNoteDocumentReference() {
        return creditNoteDocumentReference;
    }

    /**
     * Billing Reference. Credit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a credit note.
     * 
     */
    @JsonProperty("CreditNoteDocumentReference")
    public void setCreditNoteDocumentReference(List<DocumentReference> creditNoteDocumentReference) {
        this.creditNoteDocumentReference = creditNoteDocumentReference;
    }

    public BillingReference withCreditNoteDocumentReference(List<DocumentReference> creditNoteDocumentReference) {
        this.creditNoteDocumentReference = creditNoteDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Self Billed Credit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a self billed credit note.
     * 
     */
    @JsonProperty("SelfBilledCreditNoteDocumentReference")
    public List<DocumentReference> getSelfBilledCreditNoteDocumentReference() {
        return selfBilledCreditNoteDocumentReference;
    }

    /**
     * Billing Reference. Self Billed Credit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a self billed credit note.
     * 
     */
    @JsonProperty("SelfBilledCreditNoteDocumentReference")
    public void setSelfBilledCreditNoteDocumentReference(List<DocumentReference> selfBilledCreditNoteDocumentReference) {
        this.selfBilledCreditNoteDocumentReference = selfBilledCreditNoteDocumentReference;
    }

    public BillingReference withSelfBilledCreditNoteDocumentReference(List<DocumentReference> selfBilledCreditNoteDocumentReference) {
        this.selfBilledCreditNoteDocumentReference = selfBilledCreditNoteDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Debit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a debit note.
     * 
     */
    @JsonProperty("DebitNoteDocumentReference")
    public List<DocumentReference> getDebitNoteDocumentReference() {
        return debitNoteDocumentReference;
    }

    /**
     * Billing Reference. Debit Note_ Document Reference. Document Reference
     * <p>
     * A reference to a debit note.
     * 
     */
    @JsonProperty("DebitNoteDocumentReference")
    public void setDebitNoteDocumentReference(List<DocumentReference> debitNoteDocumentReference) {
        this.debitNoteDocumentReference = debitNoteDocumentReference;
    }

    public BillingReference withDebitNoteDocumentReference(List<DocumentReference> debitNoteDocumentReference) {
        this.debitNoteDocumentReference = debitNoteDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Reminder_ Document Reference. Document Reference
     * <p>
     * A reference to a billing reminder.
     * 
     */
    @JsonProperty("ReminderDocumentReference")
    public List<DocumentReference> getReminderDocumentReference() {
        return reminderDocumentReference;
    }

    /**
     * Billing Reference. Reminder_ Document Reference. Document Reference
     * <p>
     * A reference to a billing reminder.
     * 
     */
    @JsonProperty("ReminderDocumentReference")
    public void setReminderDocumentReference(List<DocumentReference> reminderDocumentReference) {
        this.reminderDocumentReference = reminderDocumentReference;
    }

    public BillingReference withReminderDocumentReference(List<DocumentReference> reminderDocumentReference) {
        this.reminderDocumentReference = reminderDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Additional_ Document Reference. Document Reference
     * <p>
     * A reference to an additional document.
     * 
     */
    @JsonProperty("AdditionalDocumentReference")
    public List<DocumentReference> getAdditionalDocumentReference() {
        return additionalDocumentReference;
    }

    /**
     * Billing Reference. Additional_ Document Reference. Document Reference
     * <p>
     * A reference to an additional document.
     * 
     */
    @JsonProperty("AdditionalDocumentReference")
    public void setAdditionalDocumentReference(List<DocumentReference> additionalDocumentReference) {
        this.additionalDocumentReference = additionalDocumentReference;
    }

    public BillingReference withAdditionalDocumentReference(List<DocumentReference> additionalDocumentReference) {
        this.additionalDocumentReference = additionalDocumentReference;
        return this;
    }

    /**
     * Billing Reference. Billing Reference Line
     * <p>
     * A reference to a transaction line in the billing document.
     * 
     */
    @JsonProperty("BillingReferenceLine")
    public List<BillingReferenceLine> getBillingReferenceLine() {
        return billingReferenceLine;
    }

    /**
     * Billing Reference. Billing Reference Line
     * <p>
     * A reference to a transaction line in the billing document.
     * 
     */
    @JsonProperty("BillingReferenceLine")
    public void setBillingReferenceLine(List<BillingReferenceLine> billingReferenceLine) {
        this.billingReferenceLine = billingReferenceLine;
    }

    public BillingReference withBillingReferenceLine(List<BillingReferenceLine> billingReferenceLine) {
        this.billingReferenceLine = billingReferenceLine;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BillingReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("invoiceDocumentReference");
        sb.append('=');
        sb.append(((this.invoiceDocumentReference == null)?"<null>":this.invoiceDocumentReference));
        sb.append(',');
        sb.append("selfBilledInvoiceDocumentReference");
        sb.append('=');
        sb.append(((this.selfBilledInvoiceDocumentReference == null)?"<null>":this.selfBilledInvoiceDocumentReference));
        sb.append(',');
        sb.append("creditNoteDocumentReference");
        sb.append('=');
        sb.append(((this.creditNoteDocumentReference == null)?"<null>":this.creditNoteDocumentReference));
        sb.append(',');
        sb.append("selfBilledCreditNoteDocumentReference");
        sb.append('=');
        sb.append(((this.selfBilledCreditNoteDocumentReference == null)?"<null>":this.selfBilledCreditNoteDocumentReference));
        sb.append(',');
        sb.append("debitNoteDocumentReference");
        sb.append('=');
        sb.append(((this.debitNoteDocumentReference == null)?"<null>":this.debitNoteDocumentReference));
        sb.append(',');
        sb.append("reminderDocumentReference");
        sb.append('=');
        sb.append(((this.reminderDocumentReference == null)?"<null>":this.reminderDocumentReference));
        sb.append(',');
        sb.append("additionalDocumentReference");
        sb.append('=');
        sb.append(((this.additionalDocumentReference == null)?"<null>":this.additionalDocumentReference));
        sb.append(',');
        sb.append("billingReferenceLine");
        sb.append('=');
        sb.append(((this.billingReferenceLine == null)?"<null>":this.billingReferenceLine));
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
        result = ((result* 31)+((this.selfBilledCreditNoteDocumentReference == null)? 0 :this.selfBilledCreditNoteDocumentReference.hashCode()));
        result = ((result* 31)+((this.creditNoteDocumentReference == null)? 0 :this.creditNoteDocumentReference.hashCode()));
        result = ((result* 31)+((this.debitNoteDocumentReference == null)? 0 :this.debitNoteDocumentReference.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.invoiceDocumentReference == null)? 0 :this.invoiceDocumentReference.hashCode()));
        result = ((result* 31)+((this.selfBilledInvoiceDocumentReference == null)? 0 :this.selfBilledInvoiceDocumentReference.hashCode()));
        result = ((result* 31)+((this.reminderDocumentReference == null)? 0 :this.reminderDocumentReference.hashCode()));
        result = ((result* 31)+((this.billingReferenceLine == null)? 0 :this.billingReferenceLine.hashCode()));
        result = ((result* 31)+((this.additionalDocumentReference == null)? 0 :this.additionalDocumentReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingReference) == false) {
            return false;
        }
        BillingReference rhs = ((BillingReference) other);
        return ((((((((((this.selfBilledCreditNoteDocumentReference == rhs.selfBilledCreditNoteDocumentReference)||((this.selfBilledCreditNoteDocumentReference!= null)&&this.selfBilledCreditNoteDocumentReference.equals(rhs.selfBilledCreditNoteDocumentReference)))&&((this.creditNoteDocumentReference == rhs.creditNoteDocumentReference)||((this.creditNoteDocumentReference!= null)&&this.creditNoteDocumentReference.equals(rhs.creditNoteDocumentReference))))&&((this.debitNoteDocumentReference == rhs.debitNoteDocumentReference)||((this.debitNoteDocumentReference!= null)&&this.debitNoteDocumentReference.equals(rhs.debitNoteDocumentReference))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.invoiceDocumentReference == rhs.invoiceDocumentReference)||((this.invoiceDocumentReference!= null)&&this.invoiceDocumentReference.equals(rhs.invoiceDocumentReference))))&&((this.selfBilledInvoiceDocumentReference == rhs.selfBilledInvoiceDocumentReference)||((this.selfBilledInvoiceDocumentReference!= null)&&this.selfBilledInvoiceDocumentReference.equals(rhs.selfBilledInvoiceDocumentReference))))&&((this.reminderDocumentReference == rhs.reminderDocumentReference)||((this.reminderDocumentReference!= null)&&this.reminderDocumentReference.equals(rhs.reminderDocumentReference))))&&((this.billingReferenceLine == rhs.billingReferenceLine)||((this.billingReferenceLine!= null)&&this.billingReferenceLine.equals(rhs.billingReferenceLine))))&&((this.additionalDocumentReference == rhs.additionalDocumentReference)||((this.additionalDocumentReference!= null)&&this.additionalDocumentReference.equals(rhs.additionalDocumentReference))));
    }

}
