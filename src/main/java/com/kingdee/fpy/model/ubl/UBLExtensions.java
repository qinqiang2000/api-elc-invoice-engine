
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
 * A container for all extensions present in the document.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtension"
})
@Generated("jsonschema2pojo")
public class UBLExtensions {

    /**
     * A single extension for private use.
     * (Required)
     * 
     */
    @JsonProperty("UBLExtension")
    @JsonPropertyDescription("A single extension for private use.")
    @Size(min = 1)
    @Valid
    @NotNull
    private List<UBLExtension> uBLExtension = new ArrayList<UBLExtension>();

    /**
     * A single extension for private use.
     * 
     */
    @JsonProperty("UBLExtension")
    public List<UBLExtension> getUBLExtension() {
        return uBLExtension;
    }

    /**
     * A single extension for private use.
     * 
     */
    @JsonProperty("UBLExtension")
    public void setUBLExtension(List<UBLExtension> uBLExtension) {
        this.uBLExtension = uBLExtension;
    }

    public UBLExtensions withUBLExtension(List<UBLExtension> uBLExtension) {
        this.uBLExtension = uBLExtension;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UBLExtensions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtension");
        sb.append('=');
        sb.append(((this.uBLExtension == null)?"<null>":this.uBLExtension));
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
        result = ((result* 31)+((this.uBLExtension == null)? 0 :this.uBLExtension.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UBLExtensions) == false) {
            return false;
        }
        UBLExtensions rhs = ((UBLExtensions) other);
        return ((this.uBLExtension == rhs.uBLExtension)||((this.uBLExtension!= null)&&this.uBLExtension.equals(rhs.uBLExtension)));
    }

}
