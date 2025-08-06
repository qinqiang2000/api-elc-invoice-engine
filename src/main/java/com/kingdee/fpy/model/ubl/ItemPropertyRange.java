
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
 * Item Property Range. Details
 * <p>
 * A class to describe a range of values for an item property.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "MinimumValue",
    "MaximumValue"
})
@Generated("jsonschema2pojo")
public class ItemPropertyRange {

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
     * Item Property Range. Minimum_ Value. Text
     * <p>
     * The minimum value in this range of values.
     * 
     */
    @JsonProperty("MinimumValue")
    @JsonPropertyDescription("The minimum value in this range of values.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> minimumValue = new ArrayList<TextType>();
    /**
     * Item Property Range. Maximum_ Value. Text
     * <p>
     * The maximum value in this range of values.
     * 
     */
    @JsonProperty("MaximumValue")
    @JsonPropertyDescription("The maximum value in this range of values.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> maximumValue = new ArrayList<TextType>();

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

    public ItemPropertyRange withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item Property Range. Minimum_ Value. Text
     * <p>
     * The minimum value in this range of values.
     * 
     */
    @JsonProperty("MinimumValue")
    public List<TextType> getMinimumValue() {
        return minimumValue;
    }

    /**
     * Item Property Range. Minimum_ Value. Text
     * <p>
     * The minimum value in this range of values.
     * 
     */
    @JsonProperty("MinimumValue")
    public void setMinimumValue(List<TextType> minimumValue) {
        this.minimumValue = minimumValue;
    }

    public ItemPropertyRange withMinimumValue(List<TextType> minimumValue) {
        this.minimumValue = minimumValue;
        return this;
    }

    /**
     * Item Property Range. Maximum_ Value. Text
     * <p>
     * The maximum value in this range of values.
     * 
     */
    @JsonProperty("MaximumValue")
    public List<TextType> getMaximumValue() {
        return maximumValue;
    }

    /**
     * Item Property Range. Maximum_ Value. Text
     * <p>
     * The maximum value in this range of values.
     * 
     */
    @JsonProperty("MaximumValue")
    public void setMaximumValue(List<TextType> maximumValue) {
        this.maximumValue = maximumValue;
    }

    public ItemPropertyRange withMaximumValue(List<TextType> maximumValue) {
        this.maximumValue = maximumValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemPropertyRange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("minimumValue");
        sb.append('=');
        sb.append(((this.minimumValue == null)?"<null>":this.minimumValue));
        sb.append(',');
        sb.append("maximumValue");
        sb.append('=');
        sb.append(((this.maximumValue == null)?"<null>":this.maximumValue));
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
        result = ((result* 31)+((this.minimumValue == null)? 0 :this.minimumValue.hashCode()));
        result = ((result* 31)+((this.maximumValue == null)? 0 :this.maximumValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemPropertyRange) == false) {
            return false;
        }
        ItemPropertyRange rhs = ((ItemPropertyRange) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.minimumValue == rhs.minimumValue)||((this.minimumValue!= null)&&this.minimumValue.equals(rhs.minimumValue))))&&((this.maximumValue == rhs.maximumValue)||((this.maximumValue!= null)&&this.maximumValue.equals(rhs.maximumValue))));
    }

}
