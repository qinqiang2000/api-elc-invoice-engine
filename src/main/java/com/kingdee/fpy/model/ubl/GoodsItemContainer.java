
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
 * Goods Item Container. Details
 * <p>
 * A class defining how goods items are split across transport equipment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Quantity",
    "TransportEquipment"
})
@Generated("jsonschema2pojo")
public class GoodsItemContainer {

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
     * Goods Item Container. Identifier
     * <p>
     * An identifier for this goods item container.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this goods item container.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Goods Item Container. Quantity
     * <p>
     * The number of goods items loaded into or onto one piece of transport equipment as a total consignment or part of a consignment.
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("The number of goods items loaded into or onto one piece of transport equipment as a total consignment or part of a consignment.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> quantity = new ArrayList<QuantityType>();
    /**
     * Goods Item Container. Transport Equipment
     * <p>
     * A piece of transport equipment used to contain a single goods item.
     * 
     */
    @JsonProperty("TransportEquipment")
    @JsonPropertyDescription("A piece of transport equipment used to contain a single goods item.")
    @Size(min = 1)
    @Valid
    private List<TransportEquipment> transportEquipment = new ArrayList<TransportEquipment>();

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

    public GoodsItemContainer withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Goods Item Container. Identifier
     * <p>
     * An identifier for this goods item container.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Goods Item Container. Identifier
     * <p>
     * An identifier for this goods item container.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public GoodsItemContainer withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Goods Item Container. Quantity
     * <p>
     * The number of goods items loaded into or onto one piece of transport equipment as a total consignment or part of a consignment.
     * 
     */
    @JsonProperty("Quantity")
    public List<QuantityType> getQuantity() {
        return quantity;
    }

    /**
     * Goods Item Container. Quantity
     * <p>
     * The number of goods items loaded into or onto one piece of transport equipment as a total consignment or part of a consignment.
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
    }

    public GoodsItemContainer withQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Goods Item Container. Transport Equipment
     * <p>
     * A piece of transport equipment used to contain a single goods item.
     * 
     */
    @JsonProperty("TransportEquipment")
    public List<TransportEquipment> getTransportEquipment() {
        return transportEquipment;
    }

    /**
     * Goods Item Container. Transport Equipment
     * <p>
     * A piece of transport equipment used to contain a single goods item.
     * 
     */
    @JsonProperty("TransportEquipment")
    public void setTransportEquipment(List<TransportEquipment> transportEquipment) {
        this.transportEquipment = transportEquipment;
    }

    public GoodsItemContainer withTransportEquipment(List<TransportEquipment> transportEquipment) {
        this.transportEquipment = transportEquipment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GoodsItemContainer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("transportEquipment");
        sb.append('=');
        sb.append(((this.transportEquipment == null)?"<null>":this.transportEquipment));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.transportEquipment == null)? 0 :this.transportEquipment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GoodsItemContainer) == false) {
            return false;
        }
        GoodsItemContainer rhs = ((GoodsItemContainer) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.transportEquipment == rhs.transportEquipment)||((this.transportEquipment!= null)&&this.transportEquipment.equals(rhs.transportEquipment))));
    }

}
