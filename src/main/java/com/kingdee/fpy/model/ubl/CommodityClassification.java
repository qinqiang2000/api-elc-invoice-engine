
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
 * Commodity Classification. Details
 * <p>
 * A class to describe the classification of a commodity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "NatureCode",
    "CargoTypeCode",
    "CommodityCode",
    "ItemClassificationCode"
})
@Generated("jsonschema2pojo")
public class CommodityClassification {

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
     * Commodity Classification. Nature Code. Code
     * <p>
     * A code defined by a specific maintenance agency signifying the high-level nature of the commodity.
     * 
     */
    @JsonProperty("NatureCode")
    @JsonPropertyDescription("A code defined by a specific maintenance agency signifying the high-level nature of the commodity.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> natureCode = new ArrayList<CodeType>();
    /**
     * Commodity Classification. Cargo Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of cargo for purposes of commodity classification.
     * 
     */
    @JsonProperty("CargoTypeCode")
    @JsonPropertyDescription("A mutually agreed code signifying the type of cargo for purposes of commodity classification.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> cargoTypeCode = new ArrayList<CodeType>();
    /**
     * Commodity Classification. Commodity Code. Code
     * <p>
     * The harmonized international commodity code for cross border and regulatory (customs and trade statistics) purposes.
     * 
     */
    @JsonProperty("CommodityCode")
    @JsonPropertyDescription("The harmonized international commodity code for cross border and regulatory (customs and trade statistics) purposes.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> commodityCode = new ArrayList<CodeType>();
    /**
     * Commodity Classification. Item Classification Code. Code
     * <p>
     * A code signifying the trade classification of the commodity.
     * 
     */
    @JsonProperty("ItemClassificationCode")
    @JsonPropertyDescription("A code signifying the trade classification of the commodity.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> itemClassificationCode = new ArrayList<CodeType>();

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

    public CommodityClassification withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Commodity Classification. Nature Code. Code
     * <p>
     * A code defined by a specific maintenance agency signifying the high-level nature of the commodity.
     * 
     */
    @JsonProperty("NatureCode")
    public List<CodeType> getNatureCode() {
        return natureCode;
    }

    /**
     * Commodity Classification. Nature Code. Code
     * <p>
     * A code defined by a specific maintenance agency signifying the high-level nature of the commodity.
     * 
     */
    @JsonProperty("NatureCode")
    public void setNatureCode(List<CodeType> natureCode) {
        this.natureCode = natureCode;
    }

    public CommodityClassification withNatureCode(List<CodeType> natureCode) {
        this.natureCode = natureCode;
        return this;
    }

    /**
     * Commodity Classification. Cargo Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of cargo for purposes of commodity classification.
     * 
     */
    @JsonProperty("CargoTypeCode")
    public List<CodeType> getCargoTypeCode() {
        return cargoTypeCode;
    }

    /**
     * Commodity Classification. Cargo Type Code. Code
     * <p>
     * A mutually agreed code signifying the type of cargo for purposes of commodity classification.
     * 
     */
    @JsonProperty("CargoTypeCode")
    public void setCargoTypeCode(List<CodeType> cargoTypeCode) {
        this.cargoTypeCode = cargoTypeCode;
    }

    public CommodityClassification withCargoTypeCode(List<CodeType> cargoTypeCode) {
        this.cargoTypeCode = cargoTypeCode;
        return this;
    }

    /**
     * Commodity Classification. Commodity Code. Code
     * <p>
     * The harmonized international commodity code for cross border and regulatory (customs and trade statistics) purposes.
     * 
     */
    @JsonProperty("CommodityCode")
    public List<CodeType> getCommodityCode() {
        return commodityCode;
    }

    /**
     * Commodity Classification. Commodity Code. Code
     * <p>
     * The harmonized international commodity code for cross border and regulatory (customs and trade statistics) purposes.
     * 
     */
    @JsonProperty("CommodityCode")
    public void setCommodityCode(List<CodeType> commodityCode) {
        this.commodityCode = commodityCode;
    }

    public CommodityClassification withCommodityCode(List<CodeType> commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Commodity Classification. Item Classification Code. Code
     * <p>
     * A code signifying the trade classification of the commodity.
     * 
     */
    @JsonProperty("ItemClassificationCode")
    public List<CodeType> getItemClassificationCode() {
        return itemClassificationCode;
    }

    /**
     * Commodity Classification. Item Classification Code. Code
     * <p>
     * A code signifying the trade classification of the commodity.
     * 
     */
    @JsonProperty("ItemClassificationCode")
    public void setItemClassificationCode(List<CodeType> itemClassificationCode) {
        this.itemClassificationCode = itemClassificationCode;
    }

    public CommodityClassification withItemClassificationCode(List<CodeType> itemClassificationCode) {
        this.itemClassificationCode = itemClassificationCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommodityClassification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("natureCode");
        sb.append('=');
        sb.append(((this.natureCode == null)?"<null>":this.natureCode));
        sb.append(',');
        sb.append("cargoTypeCode");
        sb.append('=');
        sb.append(((this.cargoTypeCode == null)?"<null>":this.cargoTypeCode));
        sb.append(',');
        sb.append("commodityCode");
        sb.append('=');
        sb.append(((this.commodityCode == null)?"<null>":this.commodityCode));
        sb.append(',');
        sb.append("itemClassificationCode");
        sb.append('=');
        sb.append(((this.itemClassificationCode == null)?"<null>":this.itemClassificationCode));
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
        result = ((result* 31)+((this.commodityCode == null)? 0 :this.commodityCode.hashCode()));
        result = ((result* 31)+((this.natureCode == null)? 0 :this.natureCode.hashCode()));
        result = ((result* 31)+((this.cargoTypeCode == null)? 0 :this.cargoTypeCode.hashCode()));
        result = ((result* 31)+((this.itemClassificationCode == null)? 0 :this.itemClassificationCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommodityClassification) == false) {
            return false;
        }
        CommodityClassification rhs = ((CommodityClassification) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.commodityCode == rhs.commodityCode)||((this.commodityCode!= null)&&this.commodityCode.equals(rhs.commodityCode))))&&((this.natureCode == rhs.natureCode)||((this.natureCode!= null)&&this.natureCode.equals(rhs.natureCode))))&&((this.cargoTypeCode == rhs.cargoTypeCode)||((this.cargoTypeCode!= null)&&this.cargoTypeCode.equals(rhs.cargoTypeCode))))&&((this.itemClassificationCode == rhs.itemClassificationCode)||((this.itemClassificationCode!= null)&&this.itemClassificationCode.equals(rhs.itemClassificationCode))));
    }

}
