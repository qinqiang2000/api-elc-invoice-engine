
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
 * Item Instance. Details
 * <p>
 * A class to describe a specific, trackable instance of an item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ProductTraceID",
    "ManufactureDate",
    "ManufactureTime",
    "BestBeforeDate",
    "RegistrationID",
    "SerialID",
    "AdditionalItemProperty",
    "LotIdentification"
})
@Generated("jsonschema2pojo")
public class ItemInstance {

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
     * Item Instance. Product Trace_ Identifier. Identifier
     * <p>
     * An identifier used for tracing this item instance, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("ProductTraceID")
    @JsonPropertyDescription("An identifier used for tracing this item instance, such as the EPC number used in RFID.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> productTraceID = new ArrayList<IdentifierType>();
    /**
     * Item Instance. Manufacture Date. Date
     * <p>
     * The date on which this item instance was manufactured.
     * 
     */
    @JsonProperty("ManufactureDate")
    @JsonPropertyDescription("The date on which this item instance was manufactured.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> manufactureDate = new ArrayList<DateType>();
    /**
     * Item Instance. Manufacture Time. Time
     * <p>
     * The time at which this item instance was manufactured.
     * 
     */
    @JsonProperty("ManufactureTime")
    @JsonPropertyDescription("The time at which this item instance was manufactured.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> manufactureTime = new ArrayList<TimeType>();
    /**
     * Item Instance. Best Before Date. Date
     * <p>
     * The date before which it is best to use this item instance.
     * 
     */
    @JsonProperty("BestBeforeDate")
    @JsonPropertyDescription("The date before which it is best to use this item instance.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> bestBeforeDate = new ArrayList<DateType>();
    /**
     * Item Instance. Registration Identifier. Identifier
     * <p>
     * The registration identifier of this item instance.
     * 
     */
    @JsonProperty("RegistrationID")
    @JsonPropertyDescription("The registration identifier of this item instance.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> registrationID = new ArrayList<IdentifierType>();
    /**
     * Item Instance. Serial Identifier. Identifier
     * <p>
     * The serial number of this item instance.
     * 
     */
    @JsonProperty("SerialID")
    @JsonPropertyDescription("The serial number of this item instance.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> serialID = new ArrayList<IdentifierType>();
    /**
     * Item Instance. Additional_ Item Property. Item Property
     * <p>
     * An additional property of this item instance.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    @JsonPropertyDescription("An additional property of this item instance.")
    @Size(min = 1)
    @Valid
    private List<ItemProperty> additionalItemProperty = new ArrayList<ItemProperty>();
    /**
     * Item Instance. Lot Identification
     * <p>
     * The lot identifier of this item instance (the identifier that allows recall of the item if necessary).
     * 
     */
    @JsonProperty("LotIdentification")
    @JsonPropertyDescription("The lot identifier of this item instance (the identifier that allows recall of the item if necessary).")
    @Size(min = 1, max = 1)
    @Valid
    private List<LotIdentification> lotIdentification = new ArrayList<LotIdentification>();

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

    public ItemInstance withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item Instance. Product Trace_ Identifier. Identifier
     * <p>
     * An identifier used for tracing this item instance, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("ProductTraceID")
    public List<IdentifierType> getProductTraceID() {
        return productTraceID;
    }

    /**
     * Item Instance. Product Trace_ Identifier. Identifier
     * <p>
     * An identifier used for tracing this item instance, such as the EPC number used in RFID.
     * 
     */
    @JsonProperty("ProductTraceID")
    public void setProductTraceID(List<IdentifierType> productTraceID) {
        this.productTraceID = productTraceID;
    }

    public ItemInstance withProductTraceID(List<IdentifierType> productTraceID) {
        this.productTraceID = productTraceID;
        return this;
    }

    /**
     * Item Instance. Manufacture Date. Date
     * <p>
     * The date on which this item instance was manufactured.
     * 
     */
    @JsonProperty("ManufactureDate")
    public List<DateType> getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Item Instance. Manufacture Date. Date
     * <p>
     * The date on which this item instance was manufactured.
     * 
     */
    @JsonProperty("ManufactureDate")
    public void setManufactureDate(List<DateType> manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public ItemInstance withManufactureDate(List<DateType> manufactureDate) {
        this.manufactureDate = manufactureDate;
        return this;
    }

    /**
     * Item Instance. Manufacture Time. Time
     * <p>
     * The time at which this item instance was manufactured.
     * 
     */
    @JsonProperty("ManufactureTime")
    public List<TimeType> getManufactureTime() {
        return manufactureTime;
    }

    /**
     * Item Instance. Manufacture Time. Time
     * <p>
     * The time at which this item instance was manufactured.
     * 
     */
    @JsonProperty("ManufactureTime")
    public void setManufactureTime(List<TimeType> manufactureTime) {
        this.manufactureTime = manufactureTime;
    }

    public ItemInstance withManufactureTime(List<TimeType> manufactureTime) {
        this.manufactureTime = manufactureTime;
        return this;
    }

    /**
     * Item Instance. Best Before Date. Date
     * <p>
     * The date before which it is best to use this item instance.
     * 
     */
    @JsonProperty("BestBeforeDate")
    public List<DateType> getBestBeforeDate() {
        return bestBeforeDate;
    }

    /**
     * Item Instance. Best Before Date. Date
     * <p>
     * The date before which it is best to use this item instance.
     * 
     */
    @JsonProperty("BestBeforeDate")
    public void setBestBeforeDate(List<DateType> bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public ItemInstance withBestBeforeDate(List<DateType> bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
        return this;
    }

    /**
     * Item Instance. Registration Identifier. Identifier
     * <p>
     * The registration identifier of this item instance.
     * 
     */
    @JsonProperty("RegistrationID")
    public List<IdentifierType> getRegistrationID() {
        return registrationID;
    }

    /**
     * Item Instance. Registration Identifier. Identifier
     * <p>
     * The registration identifier of this item instance.
     * 
     */
    @JsonProperty("RegistrationID")
    public void setRegistrationID(List<IdentifierType> registrationID) {
        this.registrationID = registrationID;
    }

    public ItemInstance withRegistrationID(List<IdentifierType> registrationID) {
        this.registrationID = registrationID;
        return this;
    }

    /**
     * Item Instance. Serial Identifier. Identifier
     * <p>
     * The serial number of this item instance.
     * 
     */
    @JsonProperty("SerialID")
    public List<IdentifierType> getSerialID() {
        return serialID;
    }

    /**
     * Item Instance. Serial Identifier. Identifier
     * <p>
     * The serial number of this item instance.
     * 
     */
    @JsonProperty("SerialID")
    public void setSerialID(List<IdentifierType> serialID) {
        this.serialID = serialID;
    }

    public ItemInstance withSerialID(List<IdentifierType> serialID) {
        this.serialID = serialID;
        return this;
    }

    /**
     * Item Instance. Additional_ Item Property. Item Property
     * <p>
     * An additional property of this item instance.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    public List<ItemProperty> getAdditionalItemProperty() {
        return additionalItemProperty;
    }

    /**
     * Item Instance. Additional_ Item Property. Item Property
     * <p>
     * An additional property of this item instance.
     * 
     */
    @JsonProperty("AdditionalItemProperty")
    public void setAdditionalItemProperty(List<ItemProperty> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
    }

    public ItemInstance withAdditionalItemProperty(List<ItemProperty> additionalItemProperty) {
        this.additionalItemProperty = additionalItemProperty;
        return this;
    }

    /**
     * Item Instance. Lot Identification
     * <p>
     * The lot identifier of this item instance (the identifier that allows recall of the item if necessary).
     * 
     */
    @JsonProperty("LotIdentification")
    public List<LotIdentification> getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Item Instance. Lot Identification
     * <p>
     * The lot identifier of this item instance (the identifier that allows recall of the item if necessary).
     * 
     */
    @JsonProperty("LotIdentification")
    public void setLotIdentification(List<LotIdentification> lotIdentification) {
        this.lotIdentification = lotIdentification;
    }

    public ItemInstance withLotIdentification(List<LotIdentification> lotIdentification) {
        this.lotIdentification = lotIdentification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemInstance.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("productTraceID");
        sb.append('=');
        sb.append(((this.productTraceID == null)?"<null>":this.productTraceID));
        sb.append(',');
        sb.append("manufactureDate");
        sb.append('=');
        sb.append(((this.manufactureDate == null)?"<null>":this.manufactureDate));
        sb.append(',');
        sb.append("manufactureTime");
        sb.append('=');
        sb.append(((this.manufactureTime == null)?"<null>":this.manufactureTime));
        sb.append(',');
        sb.append("bestBeforeDate");
        sb.append('=');
        sb.append(((this.bestBeforeDate == null)?"<null>":this.bestBeforeDate));
        sb.append(',');
        sb.append("registrationID");
        sb.append('=');
        sb.append(((this.registrationID == null)?"<null>":this.registrationID));
        sb.append(',');
        sb.append("serialID");
        sb.append('=');
        sb.append(((this.serialID == null)?"<null>":this.serialID));
        sb.append(',');
        sb.append("additionalItemProperty");
        sb.append('=');
        sb.append(((this.additionalItemProperty == null)?"<null>":this.additionalItemProperty));
        sb.append(',');
        sb.append("lotIdentification");
        sb.append('=');
        sb.append(((this.lotIdentification == null)?"<null>":this.lotIdentification));
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
        result = ((result* 31)+((this.manufactureTime == null)? 0 :this.manufactureTime.hashCode()));
        result = ((result* 31)+((this.serialID == null)? 0 :this.serialID.hashCode()));
        result = ((result* 31)+((this.lotIdentification == null)? 0 :this.lotIdentification.hashCode()));
        result = ((result* 31)+((this.productTraceID == null)? 0 :this.productTraceID.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.bestBeforeDate == null)? 0 :this.bestBeforeDate.hashCode()));
        result = ((result* 31)+((this.registrationID == null)? 0 :this.registrationID.hashCode()));
        result = ((result* 31)+((this.manufactureDate == null)? 0 :this.manufactureDate.hashCode()));
        result = ((result* 31)+((this.additionalItemProperty == null)? 0 :this.additionalItemProperty.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemInstance) == false) {
            return false;
        }
        ItemInstance rhs = ((ItemInstance) other);
        return ((((((((((this.manufactureTime == rhs.manufactureTime)||((this.manufactureTime!= null)&&this.manufactureTime.equals(rhs.manufactureTime)))&&((this.serialID == rhs.serialID)||((this.serialID!= null)&&this.serialID.equals(rhs.serialID))))&&((this.lotIdentification == rhs.lotIdentification)||((this.lotIdentification!= null)&&this.lotIdentification.equals(rhs.lotIdentification))))&&((this.productTraceID == rhs.productTraceID)||((this.productTraceID!= null)&&this.productTraceID.equals(rhs.productTraceID))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.bestBeforeDate == rhs.bestBeforeDate)||((this.bestBeforeDate!= null)&&this.bestBeforeDate.equals(rhs.bestBeforeDate))))&&((this.registrationID == rhs.registrationID)||((this.registrationID!= null)&&this.registrationID.equals(rhs.registrationID))))&&((this.manufactureDate == rhs.manufactureDate)||((this.manufactureDate!= null)&&this.manufactureDate.equals(rhs.manufactureDate))))&&((this.additionalItemProperty == rhs.additionalItemProperty)||((this.additionalItemProperty!= null)&&this.additionalItemProperty.equals(rhs.additionalItemProperty))));
    }

}
