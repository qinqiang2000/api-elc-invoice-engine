
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
 * Delivery Unit. Details
 * <p>
 * A class to describe a delivery unit.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "BatchQuantity",
    "ConsumerUnitQuantity",
    "HazardousRiskIndicator"
})
@Generated("jsonschema2pojo")
public class DeliveryUnit {

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
     * Delivery Unit. Batch Quantity. Quantity
     * <p>
     * The quantity of ordered Items that constitutes a batch for delivery purposes.
     * (Required)
     * 
     */
    @JsonProperty("BatchQuantity")
    @JsonPropertyDescription("The quantity of ordered Items that constitutes a batch for delivery purposes.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<QuantityType> batchQuantity = new ArrayList<QuantityType>();
    /**
     * Delivery Unit. Consumer_ Unit. Quantity
     * <p>
     * The quantity of units in the Delivery Unit expressed in the units used by the consumer.
     * 
     */
    @JsonProperty("ConsumerUnitQuantity")
    @JsonPropertyDescription("The quantity of units in the Delivery Unit expressed in the units used by the consumer.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> consumerUnitQuantity = new ArrayList<QuantityType>();
    /**
     * Delivery Unit. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    @JsonPropertyDescription("An indication that the transported goods are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).")
    @Size(min = 1, max = 1)
    @Valid
    private List<IndicatorType> hazardousRiskIndicator = new ArrayList<IndicatorType>();

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

    public DeliveryUnit withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Delivery Unit. Batch Quantity. Quantity
     * <p>
     * The quantity of ordered Items that constitutes a batch for delivery purposes.
     * (Required)
     * 
     */
    @JsonProperty("BatchQuantity")
    public List<QuantityType> getBatchQuantity() {
        return batchQuantity;
    }

    /**
     * Delivery Unit. Batch Quantity. Quantity
     * <p>
     * The quantity of ordered Items that constitutes a batch for delivery purposes.
     * (Required)
     * 
     */
    @JsonProperty("BatchQuantity")
    public void setBatchQuantity(List<QuantityType> batchQuantity) {
        this.batchQuantity = batchQuantity;
    }

    public DeliveryUnit withBatchQuantity(List<QuantityType> batchQuantity) {
        this.batchQuantity = batchQuantity;
        return this;
    }

    /**
     * Delivery Unit. Consumer_ Unit. Quantity
     * <p>
     * The quantity of units in the Delivery Unit expressed in the units used by the consumer.
     * 
     */
    @JsonProperty("ConsumerUnitQuantity")
    public List<QuantityType> getConsumerUnitQuantity() {
        return consumerUnitQuantity;
    }

    /**
     * Delivery Unit. Consumer_ Unit. Quantity
     * <p>
     * The quantity of units in the Delivery Unit expressed in the units used by the consumer.
     * 
     */
    @JsonProperty("ConsumerUnitQuantity")
    public void setConsumerUnitQuantity(List<QuantityType> consumerUnitQuantity) {
        this.consumerUnitQuantity = consumerUnitQuantity;
    }

    public DeliveryUnit withConsumerUnitQuantity(List<QuantityType> consumerUnitQuantity) {
        this.consumerUnitQuantity = consumerUnitQuantity;
        return this;
    }

    /**
     * Delivery Unit. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public List<IndicatorType> getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Delivery Unit. Hazardous Risk_ Indicator. Indicator
     * <p>
     * An indication that the transported goods are subject to an international regulation concerning the carriage of dangerous goods (true) or not (false).
     * 
     */
    @JsonProperty("HazardousRiskIndicator")
    public void setHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
    }

    public DeliveryUnit withHazardousRiskIndicator(List<IndicatorType> hazardousRiskIndicator) {
        this.hazardousRiskIndicator = hazardousRiskIndicator;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DeliveryUnit.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("batchQuantity");
        sb.append('=');
        sb.append(((this.batchQuantity == null)?"<null>":this.batchQuantity));
        sb.append(',');
        sb.append("consumerUnitQuantity");
        sb.append('=');
        sb.append(((this.consumerUnitQuantity == null)?"<null>":this.consumerUnitQuantity));
        sb.append(',');
        sb.append("hazardousRiskIndicator");
        sb.append('=');
        sb.append(((this.hazardousRiskIndicator == null)?"<null>":this.hazardousRiskIndicator));
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
        result = ((result* 31)+((this.batchQuantity == null)? 0 :this.batchQuantity.hashCode()));
        result = ((result* 31)+((this.hazardousRiskIndicator == null)? 0 :this.hazardousRiskIndicator.hashCode()));
        result = ((result* 31)+((this.consumerUnitQuantity == null)? 0 :this.consumerUnitQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryUnit) == false) {
            return false;
        }
        DeliveryUnit rhs = ((DeliveryUnit) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.batchQuantity == rhs.batchQuantity)||((this.batchQuantity!= null)&&this.batchQuantity.equals(rhs.batchQuantity))))&&((this.hazardousRiskIndicator == rhs.hazardousRiskIndicator)||((this.hazardousRiskIndicator!= null)&&this.hazardousRiskIndicator.equals(rhs.hazardousRiskIndicator))))&&((this.consumerUnitQuantity == rhs.consumerUnitQuantity)||((this.consumerUnitQuantity!= null)&&this.consumerUnitQuantity.equals(rhs.consumerUnitQuantity))));
    }

}
