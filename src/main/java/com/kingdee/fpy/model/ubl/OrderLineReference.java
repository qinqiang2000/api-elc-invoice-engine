
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
 * Order Line Reference. Details
 * <p>
 * A class to define a reference to an order line.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "LineID",
    "SalesOrderLineID",
    "UUID",
    "LineStatusCode",
    "OrderReference"
})
@Generated("jsonschema2pojo")
public class OrderLineReference {

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
     * Order Line Reference. Line Identifier. Identifier
     * <p>
     * An identifier for the referenced order line, assigned by the buyer.
     * (Required)
     * 
     */
    @JsonProperty("LineID")
    @JsonPropertyDescription("An identifier for the referenced order line, assigned by the buyer.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> lineID = new ArrayList<IdentifierType>();
    /**
     * Order Line Reference. Sales Order_ Line Identifier. Identifier
     * <p>
     * An identifier for the referenced order line, assigned by the seller.
     * 
     */
    @JsonProperty("SalesOrderLineID")
    @JsonPropertyDescription("An identifier for the referenced order line, assigned by the seller.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> salesOrderLineID = new ArrayList<IdentifierType>();
    /**
     * Order Line Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this order line reference.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for this order line reference.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Order Line Reference. Line Status Code. Code
     * <p>
     * A code signifying the status of the referenced order line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    @JsonPropertyDescription("A code signifying the status of the referenced order line with respect to its original state.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> lineStatusCode = new ArrayList<CodeType>();
    /**
     * Order Line Reference. Order Reference
     * <p>
     * A reference to the Order containing the referenced order line.
     * 
     */
    @JsonProperty("OrderReference")
    @JsonPropertyDescription("A reference to the Order containing the referenced order line.")
    @Size(min = 1, max = 1)
    @Valid
    private List<OrderReference> orderReference = new ArrayList<OrderReference>();

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

    public OrderLineReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Order Line Reference. Line Identifier. Identifier
     * <p>
     * An identifier for the referenced order line, assigned by the buyer.
     * (Required)
     * 
     */
    @JsonProperty("LineID")
    public List<IdentifierType> getLineID() {
        return lineID;
    }

    /**
     * Order Line Reference. Line Identifier. Identifier
     * <p>
     * An identifier for the referenced order line, assigned by the buyer.
     * (Required)
     * 
     */
    @JsonProperty("LineID")
    public void setLineID(List<IdentifierType> lineID) {
        this.lineID = lineID;
    }

    public OrderLineReference withLineID(List<IdentifierType> lineID) {
        this.lineID = lineID;
        return this;
    }

    /**
     * Order Line Reference. Sales Order_ Line Identifier. Identifier
     * <p>
     * An identifier for the referenced order line, assigned by the seller.
     * 
     */
    @JsonProperty("SalesOrderLineID")
    public List<IdentifierType> getSalesOrderLineID() {
        return salesOrderLineID;
    }

    /**
     * Order Line Reference. Sales Order_ Line Identifier. Identifier
     * <p>
     * An identifier for the referenced order line, assigned by the seller.
     * 
     */
    @JsonProperty("SalesOrderLineID")
    public void setSalesOrderLineID(List<IdentifierType> salesOrderLineID) {
        this.salesOrderLineID = salesOrderLineID;
    }

    public OrderLineReference withSalesOrderLineID(List<IdentifierType> salesOrderLineID) {
        this.salesOrderLineID = salesOrderLineID;
        return this;
    }

    /**
     * Order Line Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this order line reference.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Order Line Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for this order line reference.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public OrderLineReference withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Order Line Reference. Line Status Code. Code
     * <p>
     * A code signifying the status of the referenced order line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    public List<CodeType> getLineStatusCode() {
        return lineStatusCode;
    }

    /**
     * Order Line Reference. Line Status Code. Code
     * <p>
     * A code signifying the status of the referenced order line with respect to its original state.
     * 
     */
    @JsonProperty("LineStatusCode")
    public void setLineStatusCode(List<CodeType> lineStatusCode) {
        this.lineStatusCode = lineStatusCode;
    }

    public OrderLineReference withLineStatusCode(List<CodeType> lineStatusCode) {
        this.lineStatusCode = lineStatusCode;
        return this;
    }

    /**
     * Order Line Reference. Order Reference
     * <p>
     * A reference to the Order containing the referenced order line.
     * 
     */
    @JsonProperty("OrderReference")
    public List<OrderReference> getOrderReference() {
        return orderReference;
    }

    /**
     * Order Line Reference. Order Reference
     * <p>
     * A reference to the Order containing the referenced order line.
     * 
     */
    @JsonProperty("OrderReference")
    public void setOrderReference(List<OrderReference> orderReference) {
        this.orderReference = orderReference;
    }

    public OrderLineReference withOrderReference(List<OrderReference> orderReference) {
        this.orderReference = orderReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OrderLineReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("lineID");
        sb.append('=');
        sb.append(((this.lineID == null)?"<null>":this.lineID));
        sb.append(',');
        sb.append("salesOrderLineID");
        sb.append('=');
        sb.append(((this.salesOrderLineID == null)?"<null>":this.salesOrderLineID));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("lineStatusCode");
        sb.append('=');
        sb.append(((this.lineStatusCode == null)?"<null>":this.lineStatusCode));
        sb.append(',');
        sb.append("orderReference");
        sb.append('=');
        sb.append(((this.orderReference == null)?"<null>":this.orderReference));
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
        result = ((result* 31)+((this.lineStatusCode == null)? 0 :this.lineStatusCode.hashCode()));
        result = ((result* 31)+((this.salesOrderLineID == null)? 0 :this.salesOrderLineID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.lineID == null)? 0 :this.lineID.hashCode()));
        result = ((result* 31)+((this.orderReference == null)? 0 :this.orderReference.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderLineReference) == false) {
            return false;
        }
        OrderLineReference rhs = ((OrderLineReference) other);
        return (((((((this.lineStatusCode == rhs.lineStatusCode)||((this.lineStatusCode!= null)&&this.lineStatusCode.equals(rhs.lineStatusCode)))&&((this.salesOrderLineID == rhs.salesOrderLineID)||((this.salesOrderLineID!= null)&&this.salesOrderLineID.equals(rhs.salesOrderLineID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.lineID == rhs.lineID)||((this.lineID!= null)&&this.lineID.equals(rhs.lineID))))&&((this.orderReference == rhs.orderReference)||((this.orderReference!= null)&&this.orderReference.equals(rhs.orderReference))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))));
    }

}
