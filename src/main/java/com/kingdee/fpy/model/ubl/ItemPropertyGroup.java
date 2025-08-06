
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
 * Item Property Group. Details
 * <p>
 * A class to describe a property group or classification.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "ImportanceCode"
})
@Generated("jsonschema2pojo")
public class ItemPropertyGroup {

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
     * Item Property Group. Identifier
     * <p>
     * An identifier for this group of item properties.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this group of item properties.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Item Property Group. Name
     * <p>
     * The name of this item property group.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this item property group.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Item Property Group. Importance Code. Code
     * <p>
     * A code signifying the importance of this property group in using it to describe a required Item.
     * 
     */
    @JsonProperty("ImportanceCode")
    @JsonPropertyDescription("A code signifying the importance of this property group in using it to describe a required Item.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> importanceCode = new ArrayList<CodeType>();

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

    public ItemPropertyGroup withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Item Property Group. Identifier
     * <p>
     * An identifier for this group of item properties.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Item Property Group. Identifier
     * <p>
     * An identifier for this group of item properties.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ItemPropertyGroup withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Item Property Group. Name
     * <p>
     * The name of this item property group.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Item Property Group. Name
     * <p>
     * The name of this item property group.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public ItemPropertyGroup withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Item Property Group. Importance Code. Code
     * <p>
     * A code signifying the importance of this property group in using it to describe a required Item.
     * 
     */
    @JsonProperty("ImportanceCode")
    public List<CodeType> getImportanceCode() {
        return importanceCode;
    }

    /**
     * Item Property Group. Importance Code. Code
     * <p>
     * A code signifying the importance of this property group in using it to describe a required Item.
     * 
     */
    @JsonProperty("ImportanceCode")
    public void setImportanceCode(List<CodeType> importanceCode) {
        this.importanceCode = importanceCode;
    }

    public ItemPropertyGroup withImportanceCode(List<CodeType> importanceCode) {
        this.importanceCode = importanceCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ItemPropertyGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("importanceCode");
        sb.append('=');
        sb.append(((this.importanceCode == null)?"<null>":this.importanceCode));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.importanceCode == null)? 0 :this.importanceCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItemPropertyGroup) == false) {
            return false;
        }
        ItemPropertyGroup rhs = ((ItemPropertyGroup) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.importanceCode == rhs.importanceCode)||((this.importanceCode!= null)&&this.importanceCode.equals(rhs.importanceCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
