
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
 * Order Reference. Details
 * <p>
 * A class to define a reference to an Order.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "SalesOrderID",
    "CopyIndicator",
    "UUID",
    "IssueDate",
    "IssueTime",
    "CustomerReference",
    "OrderTypeCode",
    "DocumentReference"
})
@Generated("jsonschema2pojo")
public class OrderReference {

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
     * Order Reference. Identifier
     * <p>
     * An identifier for this order reference, assigned by the buyer.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this order reference, assigned by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Order Reference. Sales_ Order Identifier. Identifier
     * <p>
     * An identifier for this order reference, assigned by the seller.
     * 
     */
    @JsonProperty("SalesOrderID")
    @JsonPropertyDescription("An identifier for this order reference, assigned by the seller.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> salesOrderID = new ArrayList<IdentifierType>();
    /**
     * Order Reference. Copy_ Indicator. Indicator
     * <p>
     * Indicates whether the referenced Order is a copy (true) or the original (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    @JsonPropertyDescription("Indicates whether the referenced Order is a copy (true) or the original (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> copyIndicator = new ArrayList<IndicatorType>();
    /**
     * Order Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this order reference.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this order reference.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Order Reference. Issue Date. Date
     * <p>
     * The date on which the referenced Order was issued.
     * 
     */
    @JsonProperty("IssueDate")
    @JsonPropertyDescription("The date on which the referenced Order was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> issueDate = new ArrayList<DateType>();
    /**
     * Order Reference. Issue Time. Time
     * <p>
     * The time at which the referenced Order was issued.
     * 
     */
    @JsonProperty("IssueTime")
    @JsonPropertyDescription("The time at which the referenced Order was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> issueTime = new ArrayList<TimeType>();
    /**
     * Order Reference. Customer_ Reference. Text
     * <p>
     * Text used for tagging purchasing card transactions.
     * 
     */
    @JsonProperty("CustomerReference")
    @JsonPropertyDescription("Text used for tagging purchasing card transactions.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> customerReference = new ArrayList<TextType>();
    /**
     * Order Reference. Order Type Code. Code
     * <p>
     * A code signifying the type of the referenced Order.
     * 
     */
    @JsonProperty("OrderTypeCode")
    @JsonPropertyDescription("A code signifying the type of the referenced Order.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> orderTypeCode = new ArrayList<CodeType>();
    /**
     * Order Reference. Document Reference
     * <p>
     * A document associated with this reference to an Order.
     * 
     */
    @JsonProperty("DocumentReference")
    @JsonPropertyDescription("A document associated with this reference to an Order.")
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

    public OrderReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Order Reference. Identifier
     * <p>
     * An identifier for this order reference, assigned by the buyer.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Order Reference. Identifier
     * <p>
     * An identifier for this order reference, assigned by the buyer.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public OrderReference withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Order Reference. Sales_ Order Identifier. Identifier
     * <p>
     * An identifier for this order reference, assigned by the seller.
     * 
     */
    @JsonProperty("SalesOrderID")
    public List<IdentifierType> getSalesOrderID() {
        return salesOrderID;
    }

    /**
     * Order Reference. Sales_ Order Identifier. Identifier
     * <p>
     * An identifier for this order reference, assigned by the seller.
     * 
     */
    @JsonProperty("SalesOrderID")
    public void setSalesOrderID(List<IdentifierType> salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public OrderReference withSalesOrderID(List<IdentifierType> salesOrderID) {
        this.salesOrderID = salesOrderID;
        return this;
    }

    /**
     * Order Reference. Copy_ Indicator. Indicator
     * <p>
     * Indicates whether the referenced Order is a copy (true) or the original (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    public List<IndicatorType> getCopyIndicator() {
        return copyIndicator;
    }

    /**
     * Order Reference. Copy_ Indicator. Indicator
     * <p>
     * Indicates whether the referenced Order is a copy (true) or the original (false).
     * 
     */
    @JsonProperty("CopyIndicator")
    public void setCopyIndicator(List<IndicatorType> copyIndicator) {
        this.copyIndicator = copyIndicator;
    }

    public OrderReference withCopyIndicator(List<IndicatorType> copyIndicator) {
        this.copyIndicator = copyIndicator;
        return this;
    }

    /**
     * Order Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this order reference.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Order Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this order reference.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public OrderReference withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Order Reference. Issue Date. Date
     * <p>
     * The date on which the referenced Order was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public List<DateType> getIssueDate() {
        return issueDate;
    }

    /**
     * Order Reference. Issue Date. Date
     * <p>
     * The date on which the referenced Order was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public void setIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
    }

    public OrderReference withIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Order Reference. Issue Time. Time
     * <p>
     * The time at which the referenced Order was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public List<TimeType> getIssueTime() {
        return issueTime;
    }

    /**
     * Order Reference. Issue Time. Time
     * <p>
     * The time at which the referenced Order was issued.
     * 
     */
    @JsonProperty("IssueTime")
    public void setIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
    }

    public OrderReference withIssueTime(List<TimeType> issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    /**
     * Order Reference. Customer_ Reference. Text
     * <p>
     * Text used for tagging purchasing card transactions.
     * 
     */
    @JsonProperty("CustomerReference")
    public List<TextType> getCustomerReference() {
        return customerReference;
    }

    /**
     * Order Reference. Customer_ Reference. Text
     * <p>
     * Text used for tagging purchasing card transactions.
     * 
     */
    @JsonProperty("CustomerReference")
    public void setCustomerReference(List<TextType> customerReference) {
        this.customerReference = customerReference;
    }

    public OrderReference withCustomerReference(List<TextType> customerReference) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * Order Reference. Order Type Code. Code
     * <p>
     * A code signifying the type of the referenced Order.
     * 
     */
    @JsonProperty("OrderTypeCode")
    public List<CodeType> getOrderTypeCode() {
        return orderTypeCode;
    }

    /**
     * Order Reference. Order Type Code. Code
     * <p>
     * A code signifying the type of the referenced Order.
     * 
     */
    @JsonProperty("OrderTypeCode")
    public void setOrderTypeCode(List<CodeType> orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
    }

    public OrderReference withOrderTypeCode(List<CodeType> orderTypeCode) {
        this.orderTypeCode = orderTypeCode;
        return this;
    }

    /**
     * Order Reference. Document Reference
     * <p>
     * A document associated with this reference to an Order.
     * 
     */
    @JsonProperty("DocumentReference")
    public List<DocumentReference> getDocumentReference() {
        return documentReference;
    }

    /**
     * Order Reference. Document Reference
     * <p>
     * A document associated with this reference to an Order.
     * 
     */
    @JsonProperty("DocumentReference")
    public void setDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
    }

    public OrderReference withDocumentReference(List<DocumentReference> documentReference) {
        this.documentReference = documentReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrderReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("salesOrderID");
        sb.append('=');
        sb.append(((this.salesOrderID == null)?"<null>":this.salesOrderID));
        sb.append(',');
        sb.append("copyIndicator");
        sb.append('=');
        sb.append(((this.copyIndicator == null)?"<null>":this.copyIndicator));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("issueTime");
        sb.append('=');
        sb.append(((this.issueTime == null)?"<null>":this.issueTime));
        sb.append(',');
        sb.append("customerReference");
        sb.append('=');
        sb.append(((this.customerReference == null)?"<null>":this.customerReference));
        sb.append(',');
        sb.append("orderTypeCode");
        sb.append('=');
        sb.append(((this.orderTypeCode == null)?"<null>":this.orderTypeCode));
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
        result = ((result* 31)+((this.salesOrderID == null)? 0 :this.salesOrderID.hashCode()));
        result = ((result* 31)+((this.copyIndicator == null)? 0 :this.copyIndicator.hashCode()));
        result = ((result* 31)+((this.orderTypeCode == null)? 0 :this.orderTypeCode.hashCode()));
        result = ((result* 31)+((this.issueTime == null)? 0 :this.issueTime.hashCode()));
        result = ((result* 31)+((this.customerReference == null)? 0 :this.customerReference.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.documentReference == null)? 0 :this.documentReference.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderReference) == false) {
            return false;
        }
        OrderReference rhs = ((OrderReference) other);
        return (((((((((((this.salesOrderID == rhs.salesOrderID)||((this.salesOrderID!= null)&&this.salesOrderID.equals(rhs.salesOrderID)))&&((this.copyIndicator == rhs.copyIndicator)||((this.copyIndicator!= null)&&this.copyIndicator.equals(rhs.copyIndicator))))&&((this.orderTypeCode == rhs.orderTypeCode)||((this.orderTypeCode!= null)&&this.orderTypeCode.equals(rhs.orderTypeCode))))&&((this.issueTime == rhs.issueTime)||((this.issueTime!= null)&&this.issueTime.equals(rhs.issueTime))))&&((this.customerReference == rhs.customerReference)||((this.customerReference!= null)&&this.customerReference.equals(rhs.customerReference))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.documentReference == rhs.documentReference)||((this.documentReference!= null)&&this.documentReference.equals(rhs.documentReference))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))));
    }

}
