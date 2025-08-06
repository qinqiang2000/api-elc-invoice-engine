
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
 * Language. Details
 * <p>
 * A class to describe a language.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "LocaleCode"
})
@Generated("jsonschema2pojo")
public class Language {

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
     * Language. Identifier
     * <p>
     * An identifier for this language.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this language.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Language. Name
     * <p>
     * The name of this language.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this language.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Language. Locale Code. Code
     * <p>
     * A code signifying the locale in which this language is used.
     * 
     */
    @JsonProperty("LocaleCode")
    @JsonPropertyDescription("A code signifying the locale in which this language is used.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> localeCode = new ArrayList<CodeType>();

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

    public Language withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Language. Identifier
     * <p>
     * An identifier for this language.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Language. Identifier
     * <p>
     * An identifier for this language.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Language withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Language. Name
     * <p>
     * The name of this language.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Language. Name
     * <p>
     * The name of this language.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public Language withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Language. Locale Code. Code
     * <p>
     * A code signifying the locale in which this language is used.
     * 
     */
    @JsonProperty("LocaleCode")
    public List<CodeType> getLocaleCode() {
        return localeCode;
    }

    /**
     * Language. Locale Code. Code
     * <p>
     * A code signifying the locale in which this language is used.
     * 
     */
    @JsonProperty("LocaleCode")
    public void setLocaleCode(List<CodeType> localeCode) {
        this.localeCode = localeCode;
    }

    public Language withLocaleCode(List<CodeType> localeCode) {
        this.localeCode = localeCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Language.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("localeCode");
        sb.append('=');
        sb.append(((this.localeCode == null)?"<null>":this.localeCode));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.localeCode == null)? 0 :this.localeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Language) == false) {
            return false;
        }
        Language rhs = ((Language) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.localeCode == rhs.localeCode)||((this.localeCode!= null)&&this.localeCode.equals(rhs.localeCode))));
    }

}
