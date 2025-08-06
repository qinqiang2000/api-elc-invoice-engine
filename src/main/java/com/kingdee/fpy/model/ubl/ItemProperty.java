
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
 * Item Property. Details
 * <p>
 * A class to describe a specific property of an item.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "NameCode",
    "TestMethod",
    "Value",
    "ValueQuantity",
    "ValueQualifier",
    "ImportanceCode",
    "ListValue",
    "UsabilityPeriod",
    "ItemPropertyGroup",
    "RangeDimension",
    "ItemPropertyRange"
})
@Generated("jsonschema2pojo")
public class ItemProperty {

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
     * Item Property. Identifier
     * <p>
     * An identifier for this property of an item.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this property of an item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Item Property. Name
     * <p>
     * The name of this item property.
     * (Required)
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this item property.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Item Property. Name Code. Code
     * <p>
     * The name of this item property, expressed as a code.
     * 
     */
    @JsonProperty("NameCode")
    @JsonPropertyDescription("The name of this item property, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> nameCode = new ArrayList<CodeType>();
    /**
     * Item Property. Test Method. Text
     * <p>
     * The method of testing the value of this item property.
     * 
     */
    @JsonProperty("TestMethod")
    @JsonPropertyDescription("The method of testing the value of this item property.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> testMethod = new ArrayList<TextType>();
    /**
     * Item Property. Value. Text
     * <p>
     * The value of this item property, expressed as text.
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("The value of this item property, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> value = new ArrayList<TextType>();
    /**
     * Item Property. Value_ Quantity. Quantity
     * <p>
     * The value of this item property, expressed as a quantity.
     * 
     */
    @JsonProperty("ValueQuantity")
    @JsonPropertyDescription("The value of this item property, expressed as a quantity.")
    @Size(min = 1, max = 1)
    @Valid
    private List<QuantityType> valueQuantity = new ArrayList<QuantityType>();
    /**
     * Item Property. Value Qualifier. Text
     * <p>
     * Text qualifying the value of the property.
     * 
     */
    @JsonProperty("ValueQualifier")
    @JsonPropertyDescription("Text qualifying the value of the property.")
    @Size(min = 1)
    @Valid
    private List<TextType> valueQualifier = new ArrayList<TextType>();
    /**
     * Item Property. Importance Code. Code
     * <p>
     * A code signifying the importance of this property in using it to describe a related Item.
     * 
     */
    @JsonProperty("ImportanceCode")
    @JsonPropertyDescription("A code signifying the importance of this property in using it to describe a related Item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> importanceCode = new ArrayList<CodeType>();
    /**
     * Item Property. List Value. Text
     * <p>
     * The value expressed as a text in case the property is a value in a list. For example, a colour.
     * 
     */
    @JsonProperty("ListValue")
    @JsonPropertyDescription("The value expressed as a text in case the property is a value in a list. For example, a colour.")
    @Size(min = 1)
    @Valid
    private List<TextType> listValue = new ArrayList<TextType>();
    /**
     * Item Property. Usability_ Period. Period
     * <p>
     * The period during which this item property is valid.
     * 
     */
    @JsonProperty("UsabilityPeriod")
    @JsonPropertyDescription("The period during which this item property is valid.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Period> usabilityPeriod = new ArrayList<Period>();
    /**
     * Item Property. Item Property Group
     * <p>
     * A description of the property group to which this item property belongs.
     * 
     */
    @JsonProperty("ItemPropertyGroup")
    @JsonPropertyDescription("A description of the property group to which this item property belongs.")
    @Size(min = 1)
    @Valid
    private List<ItemPropertyGroup> itemPropertyGroup = new ArrayList<ItemPropertyGroup>();
    /**
     * Item Property. Range_ Dimension. Dimension
     * <p>
     * The range of values for the dimensions of this property.
     * 
     */
    @JsonProperty("RangeDimension")
    @JsonPropertyDescription("The range of values for the dimensions of this property.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Dimension> rangeDimension = new ArrayList<Dimension>();
    /**
     * Item Property. Item Property Range
     * <p>
     * A range of values for this item property.
     * 
     */
    @JsonProperty("ItemPropertyRange")
    @JsonPropertyDescription("A range of values for this item property.")
    @Size(min = 1, max = 1)
    @Valid
    private List<ItemPropertyRange> itemPropertyRange = new ArrayList<ItemPropertyRange>();

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

    public ItemProperty withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item Property. Identifier
     * <p>
     * An identifier for this property of an item.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Item Property. Identifier
     * <p>
     * An identifier for this property of an item.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ItemProperty withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Item Property. Name
     * <p>
     * The name of this item property.
     * (Required)
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Item Property. Name
     * <p>
     * The name of this item property.
     * (Required)
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public ItemProperty withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Item Property. Name Code. Code
     * <p>
     * The name of this item property, expressed as a code.
     * 
     */
    @JsonProperty("NameCode")
    public List<CodeType> getNameCode() {
        return nameCode;
    }

    /**
     * Item Property. Name Code. Code
     * <p>
     * The name of this item property, expressed as a code.
     * 
     */
    @JsonProperty("NameCode")
    public void setNameCode(List<CodeType> nameCode) {
        this.nameCode = nameCode;
    }

    public ItemProperty withNameCode(List<CodeType> nameCode) {
        this.nameCode = nameCode;
        return this;
    }

    /**
     * Item Property. Test Method. Text
     * <p>
     * The method of testing the value of this item property.
     * 
     */
    @JsonProperty("TestMethod")
    public List<TextType> getTestMethod() {
        return testMethod;
    }

    /**
     * Item Property. Test Method. Text
     * <p>
     * The method of testing the value of this item property.
     * 
     */
    @JsonProperty("TestMethod")
    public void setTestMethod(List<TextType> testMethod) {
        this.testMethod = testMethod;
    }

    public ItemProperty withTestMethod(List<TextType> testMethod) {
        this.testMethod = testMethod;
        return this;
    }

    /**
     * Item Property. Value. Text
     * <p>
     * The value of this item property, expressed as text.
     * 
     */
    @JsonProperty("Value")
    public List<TextType> getValue() {
        return value;
    }

    /**
     * Item Property. Value. Text
     * <p>
     * The value of this item property, expressed as text.
     * 
     */
    @JsonProperty("Value")
    public void setValue(List<TextType> value) {
        this.value = value;
    }

    public ItemProperty withValue(List<TextType> value) {
        this.value = value;
        return this;
    }

    /**
     * Item Property. Value_ Quantity. Quantity
     * <p>
     * The value of this item property, expressed as a quantity.
     * 
     */
    @JsonProperty("ValueQuantity")
    public List<QuantityType> getValueQuantity() {
        return valueQuantity;
    }

    /**
     * Item Property. Value_ Quantity. Quantity
     * <p>
     * The value of this item property, expressed as a quantity.
     * 
     */
    @JsonProperty("ValueQuantity")
    public void setValueQuantity(List<QuantityType> valueQuantity) {
        this.valueQuantity = valueQuantity;
    }

    public ItemProperty withValueQuantity(List<QuantityType> valueQuantity) {
        this.valueQuantity = valueQuantity;
        return this;
    }

    /**
     * Item Property. Value Qualifier. Text
     * <p>
     * Text qualifying the value of the property.
     * 
     */
    @JsonProperty("ValueQualifier")
    public List<TextType> getValueQualifier() {
        return valueQualifier;
    }

    /**
     * Item Property. Value Qualifier. Text
     * <p>
     * Text qualifying the value of the property.
     * 
     */
    @JsonProperty("ValueQualifier")
    public void setValueQualifier(List<TextType> valueQualifier) {
        this.valueQualifier = valueQualifier;
    }

    public ItemProperty withValueQualifier(List<TextType> valueQualifier) {
        this.valueQualifier = valueQualifier;
        return this;
    }

    /**
     * Item Property. Importance Code. Code
     * <p>
     * A code signifying the importance of this property in using it to describe a related Item.
     * 
     */
    @JsonProperty("ImportanceCode")
    public List<CodeType> getImportanceCode() {
        return importanceCode;
    }

    /**
     * Item Property. Importance Code. Code
     * <p>
     * A code signifying the importance of this property in using it to describe a related Item.
     * 
     */
    @JsonProperty("ImportanceCode")
    public void setImportanceCode(List<CodeType> importanceCode) {
        this.importanceCode = importanceCode;
    }

    public ItemProperty withImportanceCode(List<CodeType> importanceCode) {
        this.importanceCode = importanceCode;
        return this;
    }

    /**
     * Item Property. List Value. Text
     * <p>
     * The value expressed as a text in case the property is a value in a list. For example, a colour.
     * 
     */
    @JsonProperty("ListValue")
    public List<TextType> getListValue() {
        return listValue;
    }

    /**
     * Item Property. List Value. Text
     * <p>
     * The value expressed as a text in case the property is a value in a list. For example, a colour.
     * 
     */
    @JsonProperty("ListValue")
    public void setListValue(List<TextType> listValue) {
        this.listValue = listValue;
    }

    public ItemProperty withListValue(List<TextType> listValue) {
        this.listValue = listValue;
        return this;
    }

    /**
     * Item Property. Usability_ Period. Period
     * <p>
     * The period during which this item property is valid.
     * 
     */
    @JsonProperty("UsabilityPeriod")
    public List<Period> getUsabilityPeriod() {
        return usabilityPeriod;
    }

    /**
     * Item Property. Usability_ Period. Period
     * <p>
     * The period during which this item property is valid.
     * 
     */
    @JsonProperty("UsabilityPeriod")
    public void setUsabilityPeriod(List<Period> usabilityPeriod) {
        this.usabilityPeriod = usabilityPeriod;
    }

    public ItemProperty withUsabilityPeriod(List<Period> usabilityPeriod) {
        this.usabilityPeriod = usabilityPeriod;
        return this;
    }

    /**
     * Item Property. Item Property Group
     * <p>
     * A description of the property group to which this item property belongs.
     * 
     */
    @JsonProperty("ItemPropertyGroup")
    public List<ItemPropertyGroup> getItemPropertyGroup() {
        return itemPropertyGroup;
    }

    /**
     * Item Property. Item Property Group
     * <p>
     * A description of the property group to which this item property belongs.
     * 
     */
    @JsonProperty("ItemPropertyGroup")
    public void setItemPropertyGroup(List<ItemPropertyGroup> itemPropertyGroup) {
        this.itemPropertyGroup = itemPropertyGroup;
    }

    public ItemProperty withItemPropertyGroup(List<ItemPropertyGroup> itemPropertyGroup) {
        this.itemPropertyGroup = itemPropertyGroup;
        return this;
    }

    /**
     * Item Property. Range_ Dimension. Dimension
     * <p>
     * The range of values for the dimensions of this property.
     * 
     */
    @JsonProperty("RangeDimension")
    public List<Dimension> getRangeDimension() {
        return rangeDimension;
    }

    /**
     * Item Property. Range_ Dimension. Dimension
     * <p>
     * The range of values for the dimensions of this property.
     * 
     */
    @JsonProperty("RangeDimension")
    public void setRangeDimension(List<Dimension> rangeDimension) {
        this.rangeDimension = rangeDimension;
    }

    public ItemProperty withRangeDimension(List<Dimension> rangeDimension) {
        this.rangeDimension = rangeDimension;
        return this;
    }

    /**
     * Item Property. Item Property Range
     * <p>
     * A range of values for this item property.
     * 
     */
    @JsonProperty("ItemPropertyRange")
    public List<ItemPropertyRange> getItemPropertyRange() {
        return itemPropertyRange;
    }

    /**
     * Item Property. Item Property Range
     * <p>
     * A range of values for this item property.
     * 
     */
    @JsonProperty("ItemPropertyRange")
    public void setItemPropertyRange(List<ItemPropertyRange> itemPropertyRange) {
        this.itemPropertyRange = itemPropertyRange;
    }

    public ItemProperty withItemPropertyRange(List<ItemPropertyRange> itemPropertyRange) {
        this.itemPropertyRange = itemPropertyRange;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemProperty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameCode");
        sb.append('=');
        sb.append(((this.nameCode == null)?"<null>":this.nameCode));
        sb.append(',');
        sb.append("testMethod");
        sb.append('=');
        sb.append(((this.testMethod == null)?"<null>":this.testMethod));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("valueQuantity");
        sb.append('=');
        sb.append(((this.valueQuantity == null)?"<null>":this.valueQuantity));
        sb.append(',');
        sb.append("valueQualifier");
        sb.append('=');
        sb.append(((this.valueQualifier == null)?"<null>":this.valueQualifier));
        sb.append(',');
        sb.append("importanceCode");
        sb.append('=');
        sb.append(((this.importanceCode == null)?"<null>":this.importanceCode));
        sb.append(',');
        sb.append("listValue");
        sb.append('=');
        sb.append(((this.listValue == null)?"<null>":this.listValue));
        sb.append(',');
        sb.append("usabilityPeriod");
        sb.append('=');
        sb.append(((this.usabilityPeriod == null)?"<null>":this.usabilityPeriod));
        sb.append(',');
        sb.append("itemPropertyGroup");
        sb.append('=');
        sb.append(((this.itemPropertyGroup == null)?"<null>":this.itemPropertyGroup));
        sb.append(',');
        sb.append("rangeDimension");
        sb.append('=');
        sb.append(((this.rangeDimension == null)?"<null>":this.rangeDimension));
        sb.append(',');
        sb.append("itemPropertyRange");
        sb.append('=');
        sb.append(((this.itemPropertyRange == null)?"<null>":this.itemPropertyRange));
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
        result = ((result* 31)+((this.usabilityPeriod == null)? 0 :this.usabilityPeriod.hashCode()));
        result = ((result* 31)+((this.rangeDimension == null)? 0 :this.rangeDimension.hashCode()));
        result = ((result* 31)+((this.listValue == null)? 0 :this.listValue.hashCode()));
        result = ((result* 31)+((this.itemPropertyRange == null)? 0 :this.itemPropertyRange.hashCode()));
        result = ((result* 31)+((this.nameCode == null)? 0 :this.nameCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.testMethod == null)? 0 :this.testMethod.hashCode()));
        result = ((result* 31)+((this.valueQualifier == null)? 0 :this.valueQualifier.hashCode()));
        result = ((result* 31)+((this.importanceCode == null)? 0 :this.importanceCode.hashCode()));
        result = ((result* 31)+((this.itemPropertyGroup == null)? 0 :this.itemPropertyGroup.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.valueQuantity == null)? 0 :this.valueQuantity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemProperty) == false) {
            return false;
        }
        ItemProperty rhs = ((ItemProperty) other);
        return (((((((((((((((this.usabilityPeriod == rhs.usabilityPeriod)||((this.usabilityPeriod!= null)&&this.usabilityPeriod.equals(rhs.usabilityPeriod)))&&((this.rangeDimension == rhs.rangeDimension)||((this.rangeDimension!= null)&&this.rangeDimension.equals(rhs.rangeDimension))))&&((this.listValue == rhs.listValue)||((this.listValue!= null)&&this.listValue.equals(rhs.listValue))))&&((this.itemPropertyRange == rhs.itemPropertyRange)||((this.itemPropertyRange!= null)&&this.itemPropertyRange.equals(rhs.itemPropertyRange))))&&((this.nameCode == rhs.nameCode)||((this.nameCode!= null)&&this.nameCode.equals(rhs.nameCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.testMethod == rhs.testMethod)||((this.testMethod!= null)&&this.testMethod.equals(rhs.testMethod))))&&((this.valueQualifier == rhs.valueQualifier)||((this.valueQualifier!= null)&&this.valueQualifier.equals(rhs.valueQualifier))))&&((this.importanceCode == rhs.importanceCode)||((this.importanceCode!= null)&&this.importanceCode.equals(rhs.importanceCode))))&&((this.itemPropertyGroup == rhs.itemPropertyGroup)||((this.itemPropertyGroup!= null)&&this.itemPropertyGroup.equals(rhs.itemPropertyGroup))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.valueQuantity == rhs.valueQuantity)||((this.valueQuantity!= null)&&this.valueQuantity.equals(rhs.valueQuantity))));
    }

}
