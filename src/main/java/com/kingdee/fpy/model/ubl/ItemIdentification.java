
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
 * Item Identification. Details
 * <p>
 * A class for assigning identifying information to an item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "ExtendedID",
    "BarcodeSymbologyID",
    "PhysicalAttribute",
    "MeasurementDimension",
    "IssuerParty"
})
@Generated("jsonschema2pojo")
public class ItemIdentification {

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
     * Item Identification. Identifier
     * <p>
     * An identifier for the item.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for the item.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Item Identification. Extended_ Identifier. Identifier
     * <p>
     * An extended identifier for the item that identifies the item with specific properties, e.g., Item 123 = Chair / Item 123 Ext 45 = brown chair. Two chairs can have the same item number, but one is brown. The other is white.
     * 
     */
    @JsonProperty("ExtendedID")
    @JsonPropertyDescription("An extended identifier for the item that identifies the item with specific properties, e.g., Item 123 = Chair / Item 123 Ext 45 = brown chair. Two chairs can have the same item number, but one is brown. The other is white.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> extendedID = new ArrayList<IdentifierType>();
    /**
     * Item Identification. Barcode_ Symbology Identifier. Identifier
     * <p>
     * An identifier for a system of barcodes.
     * 
     */
    @JsonProperty("BarcodeSymbologyID")
    @JsonPropertyDescription("An identifier for a system of barcodes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> barcodeSymbologyID = new ArrayList<IdentifierType>();
    /**
     * Item Identification. Physical Attribute
     * <p>
     * A physical attribute of the item.
     * 
     */
    @JsonProperty("PhysicalAttribute")
    @JsonPropertyDescription("A physical attribute of the item.")
    @Size(min = 1)
    @Valid
    private List<PhysicalAttribute> physicalAttribute = new ArrayList<PhysicalAttribute>();
    /**
     * Item Identification. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of the item.
     * 
     */
    @JsonProperty("MeasurementDimension")
    @JsonPropertyDescription("A measurable dimension (length, mass, weight, or volume) of the item.")
    @Size(min = 1)
    @Valid
    private List<Dimension> measurementDimension = new ArrayList<Dimension>();
    /**
     * Item Identification. Issuer_ Party. Party
     * <p>
     * The party that issued this item identification.
     * 
     */
    @JsonProperty("IssuerParty")
    @JsonPropertyDescription("The party that issued this item identification.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> issuerParty = new ArrayList<Party>();

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

    public ItemIdentification withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item Identification. Identifier
     * <p>
     * An identifier for the item.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Item Identification. Identifier
     * <p>
     * An identifier for the item.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ItemIdentification withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Item Identification. Extended_ Identifier. Identifier
     * <p>
     * An extended identifier for the item that identifies the item with specific properties, e.g., Item 123 = Chair / Item 123 Ext 45 = brown chair. Two chairs can have the same item number, but one is brown. The other is white.
     * 
     */
    @JsonProperty("ExtendedID")
    public List<IdentifierType> getExtendedID() {
        return extendedID;
    }

    /**
     * Item Identification. Extended_ Identifier. Identifier
     * <p>
     * An extended identifier for the item that identifies the item with specific properties, e.g., Item 123 = Chair / Item 123 Ext 45 = brown chair. Two chairs can have the same item number, but one is brown. The other is white.
     * 
     */
    @JsonProperty("ExtendedID")
    public void setExtendedID(List<IdentifierType> extendedID) {
        this.extendedID = extendedID;
    }

    public ItemIdentification withExtendedID(List<IdentifierType> extendedID) {
        this.extendedID = extendedID;
        return this;
    }

    /**
     * Item Identification. Barcode_ Symbology Identifier. Identifier
     * <p>
     * An identifier for a system of barcodes.
     * 
     */
    @JsonProperty("BarcodeSymbologyID")
    public List<IdentifierType> getBarcodeSymbologyID() {
        return barcodeSymbologyID;
    }

    /**
     * Item Identification. Barcode_ Symbology Identifier. Identifier
     * <p>
     * An identifier for a system of barcodes.
     * 
     */
    @JsonProperty("BarcodeSymbologyID")
    public void setBarcodeSymbologyID(List<IdentifierType> barcodeSymbologyID) {
        this.barcodeSymbologyID = barcodeSymbologyID;
    }

    public ItemIdentification withBarcodeSymbologyID(List<IdentifierType> barcodeSymbologyID) {
        this.barcodeSymbologyID = barcodeSymbologyID;
        return this;
    }

    /**
     * Item Identification. Physical Attribute
     * <p>
     * A physical attribute of the item.
     * 
     */
    @JsonProperty("PhysicalAttribute")
    public List<PhysicalAttribute> getPhysicalAttribute() {
        return physicalAttribute;
    }

    /**
     * Item Identification. Physical Attribute
     * <p>
     * A physical attribute of the item.
     * 
     */
    @JsonProperty("PhysicalAttribute")
    public void setPhysicalAttribute(List<PhysicalAttribute> physicalAttribute) {
        this.physicalAttribute = physicalAttribute;
    }

    public ItemIdentification withPhysicalAttribute(List<PhysicalAttribute> physicalAttribute) {
        this.physicalAttribute = physicalAttribute;
        return this;
    }

    /**
     * Item Identification. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of the item.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public List<Dimension> getMeasurementDimension() {
        return measurementDimension;
    }

    /**
     * Item Identification. Measurement_ Dimension. Dimension
     * <p>
     * A measurable dimension (length, mass, weight, or volume) of the item.
     * 
     */
    @JsonProperty("MeasurementDimension")
    public void setMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    public ItemIdentification withMeasurementDimension(List<Dimension> measurementDimension) {
        this.measurementDimension = measurementDimension;
        return this;
    }

    /**
     * Item Identification. Issuer_ Party. Party
     * <p>
     * The party that issued this item identification.
     * 
     */
    @JsonProperty("IssuerParty")
    public List<Party> getIssuerParty() {
        return issuerParty;
    }

    /**
     * Item Identification. Issuer_ Party. Party
     * <p>
     * The party that issued this item identification.
     * 
     */
    @JsonProperty("IssuerParty")
    public void setIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
    }

    public ItemIdentification withIssuerParty(List<Party> issuerParty) {
        this.issuerParty = issuerParty;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemIdentification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("extendedID");
        sb.append('=');
        sb.append(((this.extendedID == null)?"<null>":this.extendedID));
        sb.append(',');
        sb.append("barcodeSymbologyID");
        sb.append('=');
        sb.append(((this.barcodeSymbologyID == null)?"<null>":this.barcodeSymbologyID));
        sb.append(',');
        sb.append("physicalAttribute");
        sb.append('=');
        sb.append(((this.physicalAttribute == null)?"<null>":this.physicalAttribute));
        sb.append(',');
        sb.append("measurementDimension");
        sb.append('=');
        sb.append(((this.measurementDimension == null)?"<null>":this.measurementDimension));
        sb.append(',');
        sb.append("issuerParty");
        sb.append('=');
        sb.append(((this.issuerParty == null)?"<null>":this.issuerParty));
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
        result = ((result* 31)+((this.physicalAttribute == null)? 0 :this.physicalAttribute.hashCode()));
        result = ((result* 31)+((this.extendedID == null)? 0 :this.extendedID.hashCode()));
        result = ((result* 31)+((this.barcodeSymbologyID == null)? 0 :this.barcodeSymbologyID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.issuerParty == null)? 0 :this.issuerParty.hashCode()));
        result = ((result* 31)+((this.measurementDimension == null)? 0 :this.measurementDimension.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemIdentification) == false) {
            return false;
        }
        ItemIdentification rhs = ((ItemIdentification) other);
        return ((((((((this.physicalAttribute == rhs.physicalAttribute)||((this.physicalAttribute!= null)&&this.physicalAttribute.equals(rhs.physicalAttribute)))&&((this.extendedID == rhs.extendedID)||((this.extendedID!= null)&&this.extendedID.equals(rhs.extendedID))))&&((this.barcodeSymbologyID == rhs.barcodeSymbologyID)||((this.barcodeSymbologyID!= null)&&this.barcodeSymbologyID.equals(rhs.barcodeSymbologyID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.issuerParty == rhs.issuerParty)||((this.issuerParty!= null)&&this.issuerParty.equals(rhs.issuerParty))))&&((this.measurementDimension == rhs.measurementDimension)||((this.measurementDimension!= null)&&this.measurementDimension.equals(rhs.measurementDimension))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
