
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
 * Package. Details
 * <p>
 * A class to describe a package.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Quantity",
    "ReturnableMaterialIndicator",
    "PackageLevelCode",
    "PackagingTypeCode",
    "PackingMaterial",
    "TraceID",
    "ContainedPackage",
    "ContainingTransportEquipment",
    "GoodsItem",
    "MeasurementDimension",
    "DeliveryUnit",
    "Delivery",
    "Pickup",
    "Despatch"
})
@Generated("jsonschema2pojo")
public class Package {

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
     * Package. Identifier
     * <p>
     * An identifier for this package.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this package.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Package. Quantity
     * <p>
     * The quantity of items contained in this package.
     * 
     */
    @JsonProperty("Quantity")
    @JsonPropertyDescription("The quantity of items contained in this package.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> quantity = new ArrayList<QuantityType>();
    /**
     * Package. Returnable Material_ Indicator. Indicator
     * <p>
     * An indicator that the packaging material is returnable (true) or not (false).
     * 
     */
    @JsonProperty("ReturnableMaterialIndicator")
    @JsonPropertyDescription("An indicator that the packaging material is returnable (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> returnableMaterialIndicator = new ArrayList<IndicatorType>();
    /**
     * Package. Package Level Code. Code
     * <p>
     * A code signifying a level of packaging.
     * 
     */
    @JsonProperty("PackageLevelCode")
    @JsonPropertyDescription("A code signifying a level of packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> packageLevelCode = new ArrayList<CodeType>();
    /**
     * Package. Packaging Type Code. Code
     * <p>
     * A code signifying a type of packaging.
     * 
     */
    @JsonProperty("PackagingTypeCode")
    @JsonPropertyDescription("A code signifying a type of packaging.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> packagingTypeCode = new ArrayList<CodeType>();
    /**
     * Package. Packing Material. Text
     * <p>
     * Text describing the packaging material.
     * 
     */
    @JsonProperty("PackingMaterial")
    @JsonPropertyDescription("Text describing the packaging material.")
    @Size(min = 1)
    @Valid
    private List<TextType> packingMaterial = new ArrayList<TextType>();
    /**
     * Package. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this package, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    @JsonPropertyDescription("An identifier for use in tracing this package, such as the EPC number used in RFID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> traceID = new ArrayList<IdentifierType>();
    /**
     * Package. Contained_ Package. Package
     * <p>
     * A package contained within this package.
     * 
     */
    @JsonProperty("ContainedPackage")
    @JsonPropertyDescription("A package contained within this package.")
    @Size(min = 1)
    @Valid
    private List<Package> containedPackage = new ArrayList<Package>();
    /**
     * Package. Containing_ Transport Equipment. Transport Equipment
     * <p>
     * The piece of transport equipment containing this package.
     * 
     */
    @JsonProperty("ContainingTransportEquipment")
    @JsonPropertyDescription("The piece of transport equipment containing this package.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TransportEquipment> containingTransportEquipment = new ArrayList<TransportEquipment>();
    /**
     * Package. Goods Item
     * <p>
     * A goods item included in this package.
     * 
     */
    @JsonProperty("GoodsItem")
    @JsonPropertyDescription("A goods item included in this package.")
    @Size(min = 1)
    @Valid
    private List<GoodsItem> goodsItem = new ArrayList<GoodsItem>();
    /**
     * Package. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this package.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of this package.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();
    /**
     * Package. Delivery Unit
     * <p>
     * A delivery unit within this package.
     * 
     */
    @JsonProperty("DeliveryUnit")
    @JsonPropertyDescription("A delivery unit within this package.")
    @Size(min = 1)
    @Valid
    private List<DeliveryUnit> deliveryUnit = new ArrayList<DeliveryUnit>();
    /**
     * Package. Delivery
     * <p>
     * The delivery of this package.
     * 
     */
    @JsonProperty("Delivery")
    @JsonPropertyDescription("The delivery of this package.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Delivery> delivery = new ArrayList<Delivery>();
    /**
     * Package. Pickup
     * <p>
     * The pickup of this package.
     * 
     */
    @JsonProperty("Pickup")
    @JsonPropertyDescription("The pickup of this package.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Pickup> pickup = new ArrayList<Pickup>();
    /**
     * Package. Despatch
     * <p>
     * The despatch of this package.
     * 
     */
    @JsonProperty("Despatch")
    @JsonPropertyDescription("The despatch of this package.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Despatch> despatch = new ArrayList<Despatch>();

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

    public Package withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Package. Identifier
     * <p>
     * An identifier for this package.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Package. Identifier
     * <p>
     * An identifier for this package.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Package withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Package. Quantity
     * <p>
     * The quantity of items contained in this package.
     * 
     */
    @JsonProperty("Quantity")
    public List<QuantityType> getQuantity() {
        return quantity;
    }

    /**
     * Package. Quantity
     * <p>
     * The quantity of items contained in this package.
     * 
     */
    @JsonProperty("Quantity")
    public void setQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
    }

    public Package withQuantity(List<QuantityType> quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Package. Returnable Material_ Indicator. Indicator
     * <p>
     * An indicator that the packaging material is returnable (true) or not (false).
     * 
     */
    @JsonProperty("ReturnableMaterialIndicator")
    public List<IndicatorType> getReturnableMaterialIndicator() {
        return returnableMaterialIndicator;
    }

    /**
     * Package. Returnable Material_ Indicator. Indicator
     * <p>
     * An indicator that the packaging material is returnable (true) or not (false).
     * 
     */
    @JsonProperty("ReturnableMaterialIndicator")
    public void setReturnableMaterialIndicator(List<IndicatorType> returnableMaterialIndicator) {
        this.returnableMaterialIndicator = returnableMaterialIndicator;
    }

    public Package withReturnableMaterialIndicator(List<IndicatorType> returnableMaterialIndicator) {
        this.returnableMaterialIndicator = returnableMaterialIndicator;
        return this;
    }

    /**
     * Package. Package Level Code. Code
     * <p>
     * A code signifying a level of packaging.
     * 
     */
    @JsonProperty("PackageLevelCode")
    public List<CodeType> getPackageLevelCode() {
        return packageLevelCode;
    }

    /**
     * Package. Package Level Code. Code
     * <p>
     * A code signifying a level of packaging.
     * 
     */
    @JsonProperty("PackageLevelCode")
    public void setPackageLevelCode(List<CodeType> packageLevelCode) {
        this.packageLevelCode = packageLevelCode;
    }

    public Package withPackageLevelCode(List<CodeType> packageLevelCode) {
        this.packageLevelCode = packageLevelCode;
        return this;
    }

    /**
     * Package. Packaging Type Code. Code
     * <p>
     * A code signifying a type of packaging.
     * 
     */
    @JsonProperty("PackagingTypeCode")
    public List<CodeType> getPackagingTypeCode() {
        return packagingTypeCode;
    }

    /**
     * Package. Packaging Type Code. Code
     * <p>
     * A code signifying a type of packaging.
     * 
     */
    @JsonProperty("PackagingTypeCode")
    public void setPackagingTypeCode(List<CodeType> packagingTypeCode) {
        this.packagingTypeCode = packagingTypeCode;
    }

    public Package withPackagingTypeCode(List<CodeType> packagingTypeCode) {
        this.packagingTypeCode = packagingTypeCode;
        return this;
    }

    /**
     * Package. Packing Material. Text
     * <p>
     * Text describing the packaging material.
     * 
     */
    @JsonProperty("PackingMaterial")
    public List<TextType> getPackingMaterial() {
        return packingMaterial;
    }

    /**
     * Package. Packing Material. Text
     * <p>
     * Text describing the packaging material.
     * 
     */
    @JsonProperty("PackingMaterial")
    public void setPackingMaterial(List<TextType> packingMaterial) {
        this.packingMaterial = packingMaterial;
    }

    public Package withPackingMaterial(List<TextType> packingMaterial) {
        this.packingMaterial = packingMaterial;
        return this;
    }

    /**
     * Package. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this package, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public List<IdentifierType> getTraceID() {
        return traceID;
    }

    /**
     * Package. Trace_ Identifier. Identifier
     * <p>
     * An identifier for use in tracing this package, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("TraceID")
    public void setTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
    }

    public Package withTraceID(List<IdentifierType> traceID) {
        this.traceID = traceID;
        return this;
    }

    /**
     * Package. Contained_ Package. Package
     * <p>
     * A package contained within this package.
     * 
     */
    @JsonProperty("ContainedPackage")
    public List<Package> getContainedPackage() {
        return containedPackage;
    }

    /**
     * Package. Contained_ Package. Package
     * <p>
     * A package contained within this package.
     * 
     */
    @JsonProperty("ContainedPackage")
    public void setContainedPackage(List<Package> containedPackage) {
        this.containedPackage = containedPackage;
    }

    public Package withContainedPackage(List<Package> containedPackage) {
        this.containedPackage = containedPackage;
        return this;
    }

    /**
     * Package. Containing_ Transport Equipment. Transport Equipment
     * <p>
     * The piece of transport equipment containing this package.
     * 
     */
    @JsonProperty("ContainingTransportEquipment")
    public List<TransportEquipment> getContainingTransportEquipment() {
        return containingTransportEquipment;
    }

    /**
     * Package. Containing_ Transport Equipment. Transport Equipment
     * <p>
     * The piece of transport equipment containing this package.
     * 
     */
    @JsonProperty("ContainingTransportEquipment")
    public void setContainingTransportEquipment(List<TransportEquipment> containingTransportEquipment) {
        this.containingTransportEquipment = containingTransportEquipment;
    }

    public Package withContainingTransportEquipment(List<TransportEquipment> containingTransportEquipment) {
        this.containingTransportEquipment = containingTransportEquipment;
        return this;
    }

    /**
     * Package. Goods Item
     * <p>
     * A goods item included in this package.
     * 
     */
    @JsonProperty("GoodsItem")
    public List<GoodsItem> getGoodsItem() {
        return goodsItem;
    }

    /**
     * Package. Goods Item
     * <p>
     * A goods item included in this package.
     * 
     */
    @JsonProperty("GoodsItem")
    public void setGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
    }

    public Package withGoodsItem(List<GoodsItem> goodsItem) {
        this.goodsItem = goodsItem;
        return this;
    }

    /**
     * Package. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this package.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Package. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of this package.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public Package withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    /**
     * Package. Delivery Unit
     * <p>
     * A delivery unit within this package.
     * 
     */
    @JsonProperty("DeliveryUnit")
    public List<DeliveryUnit> getDeliveryUnit() {
        return deliveryUnit;
    }

    /**
     * Package. Delivery Unit
     * <p>
     * A delivery unit within this package.
     * 
     */
    @JsonProperty("DeliveryUnit")
    public void setDeliveryUnit(List<DeliveryUnit> deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
    }

    public Package withDeliveryUnit(List<DeliveryUnit> deliveryUnit) {
        this.deliveryUnit = deliveryUnit;
        return this;
    }

    /**
     * Package. Delivery
     * <p>
     * The delivery of this package.
     * 
     */
    @JsonProperty("Delivery")
    public List<Delivery> getDelivery() {
        return delivery;
    }

    /**
     * Package. Delivery
     * <p>
     * The delivery of this package.
     * 
     */
    @JsonProperty("Delivery")
    public void setDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
    }

    public Package withDelivery(List<Delivery> delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Package. Pickup
     * <p>
     * The pickup of this package.
     * 
     */
    @JsonProperty("Pickup")
    public List<Pickup> getPickup() {
        return pickup;
    }

    /**
     * Package. Pickup
     * <p>
     * The pickup of this package.
     * 
     */
    @JsonProperty("Pickup")
    public void setPickup(List<Pickup> pickup) {
        this.pickup = pickup;
    }

    public Package withPickup(List<Pickup> pickup) {
        this.pickup = pickup;
        return this;
    }

    /**
     * Package. Despatch
     * <p>
     * The despatch of this package.
     * 
     */
    @JsonProperty("Despatch")
    public List<Despatch> getDespatch() {
        return despatch;
    }

    /**
     * Package. Despatch
     * <p>
     * The despatch of this package.
     * 
     */
    @JsonProperty("Despatch")
    public void setDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
    }

    public Package withDespatch(List<Despatch> despatch) {
        this.despatch = despatch;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Package.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("returnableMaterialIndicator");
        sb.append('=');
        sb.append(((this.returnableMaterialIndicator == null)?"<null>":this.returnableMaterialIndicator));
        sb.append(',');
        sb.append("packageLevelCode");
        sb.append('=');
        sb.append(((this.packageLevelCode == null)?"<null>":this.packageLevelCode));
        sb.append(',');
        sb.append("packagingTypeCode");
        sb.append('=');
        sb.append(((this.packagingTypeCode == null)?"<null>":this.packagingTypeCode));
        sb.append(',');
        sb.append("packingMaterial");
        sb.append('=');
        sb.append(((this.packingMaterial == null)?"<null>":this.packingMaterial));
        sb.append(',');
        sb.append("traceID");
        sb.append('=');
        sb.append(((this.traceID == null)?"<null>":this.traceID));
        sb.append(',');
        sb.append("containedPackage");
        sb.append('=');
        sb.append(((this.containedPackage == null)?"<null>":this.containedPackage));
        sb.append(',');
        sb.append("containingTransportEquipment");
        sb.append('=');
        sb.append(((this.containingTransportEquipment == null)?"<null>":this.containingTransportEquipment));
        sb.append(',');
        sb.append("goodsItem");
        sb.append('=');
        sb.append(((this.goodsItem == null)?"<null>":this.goodsItem));
        sb.append(',');
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
        sb.append(',');
        sb.append("deliveryUnit");
        sb.append('=');
        sb.append(((this.deliveryUnit == null)?"<null>":this.deliveryUnit));
        sb.append(',');
        sb.append("delivery");
        sb.append('=');
        sb.append(((this.delivery == null)?"<null>":this.delivery));
        sb.append(',');
        sb.append("pickup");
        sb.append('=');
        sb.append(((this.pickup == null)?"<null>":this.pickup));
        sb.append(',');
        sb.append("despatch");
        sb.append('=');
        sb.append(((this.despatch == null)?"<null>":this.despatch));
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
        result = ((result* 31)+((this.packagingTypeCode == null)? 0 :this.packagingTypeCode.hashCode()));
        result = ((result* 31)+((this.traceID == null)? 0 :this.traceID.hashCode()));
        result = ((result* 31)+((this.delivery == null)? 0 :this.delivery.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.containedPackage == null)? 0 :this.containedPackage.hashCode()));
        result = ((result* 31)+((this.returnableMaterialIndicator == null)? 0 :this.returnableMaterialIndicator.hashCode()));
        result = ((result* 31)+((this.pickup == null)? 0 :this.pickup.hashCode()));
        result = ((result* 31)+((this.containingTransportEquipment == null)? 0 :this.containingTransportEquipment.hashCode()));
        result = ((result* 31)+((this.goodsItem == null)? 0 :this.goodsItem.hashCode()));
        result = ((result* 31)+((this.packingMaterial == null)? 0 :this.packingMaterial.hashCode()));
        result = ((result* 31)+((this.despatch == null)? 0 :this.despatch.hashCode()));
        result = ((result* 31)+((this.packageLevelCode == null)? 0 :this.packageLevelCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.deliveryUnit == null)? 0 :this.deliveryUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Package) == false) {
            return false;
        }
        Package rhs = ((Package) other);
        return (((((((((((((((((this.packagingTypeCode == rhs.packagingTypeCode)||((this.packagingTypeCode!= null)&&this.packagingTypeCode.equals(rhs.packagingTypeCode)))&&((this.traceID == rhs.traceID)||((this.traceID!= null)&&this.traceID.equals(rhs.traceID))))&&((this.delivery == rhs.delivery)||((this.delivery!= null)&&this.delivery.equals(rhs.delivery))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.containedPackage == rhs.containedPackage)||((this.containedPackage!= null)&&this.containedPackage.equals(rhs.containedPackage))))&&((this.returnableMaterialIndicator == rhs.returnableMaterialIndicator)||((this.returnableMaterialIndicator!= null)&&this.returnableMaterialIndicator.equals(rhs.returnableMaterialIndicator))))&&((this.pickup == rhs.pickup)||((this.pickup!= null)&&this.pickup.equals(rhs.pickup))))&&((this.containingTransportEquipment == rhs.containingTransportEquipment)||((this.containingTransportEquipment!= null)&&this.containingTransportEquipment.equals(rhs.containingTransportEquipment))))&&((this.goodsItem == rhs.goodsItem)||((this.goodsItem!= null)&&this.goodsItem.equals(rhs.goodsItem))))&&((this.packingMaterial == rhs.packingMaterial)||((this.packingMaterial!= null)&&this.packingMaterial.equals(rhs.packingMaterial))))&&((this.despatch == rhs.despatch)||((this.despatch!= null)&&this.despatch.equals(rhs.despatch))))&&((this.packageLevelCode == rhs.packageLevelCode)||((this.packageLevelCode!= null)&&this.packageLevelCode.equals(rhs.packageLevelCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.deliveryUnit == rhs.deliveryUnit)||((this.deliveryUnit!= null)&&this.deliveryUnit.equals(rhs.deliveryUnit))));
    }

}
