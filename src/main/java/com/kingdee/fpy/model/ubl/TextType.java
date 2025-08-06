
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Text. Type
 * <p>
 * A character string (i.e. a finite set of characters) generally in the form of words of a language.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "languageID",
    "languageLocaleID"
})
@Generated("jsonschema2pojo")
public class TextType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private String __;
    @JsonProperty("languageID")
    private String languageID;
    @JsonProperty("languageLocaleID")
    private String languageLocaleID;

    @JsonProperty("_")
    public String get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(String __) {
        this.__ = __;
    }

    public TextType with__(String __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("languageID")
    public String getLanguageID() {
        return languageID;
    }

    @JsonProperty("languageID")
    public void setLanguageID(String languageID) {
        this.languageID = languageID;
    }

    public TextType withLanguageID(String languageID) {
        this.languageID = languageID;
        return this;
    }

    @JsonProperty("languageLocaleID")
    public String getLanguageLocaleID() {
        return languageLocaleID;
    }

    @JsonProperty("languageLocaleID")
    public void setLanguageLocaleID(String languageLocaleID) {
        this.languageLocaleID = languageLocaleID;
    }

    public TextType withLanguageLocaleID(String languageLocaleID) {
        this.languageLocaleID = languageLocaleID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("languageID");
        sb.append('=');
        sb.append(((this.languageID == null)?"<null>":this.languageID));
        sb.append(',');
        sb.append("languageLocaleID");
        sb.append('=');
        sb.append(((this.languageLocaleID == null)?"<null>":this.languageLocaleID));
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
        result = ((result* 31)+((this.__ == null)? 0 :this.__.hashCode()));
        result = ((result* 31)+((this.languageID == null)? 0 :this.languageID.hashCode()));
        result = ((result* 31)+((this.languageLocaleID == null)? 0 :this.languageLocaleID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TextType) == false) {
            return false;
        }
        TextType rhs = ((TextType) other);
        return ((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.languageID == rhs.languageID)||((this.languageID!= null)&&this.languageID.equals(rhs.languageID))))&&((this.languageLocaleID == rhs.languageLocaleID)||((this.languageLocaleID!= null)&&this.languageLocaleID.equals(rhs.languageLocaleID))));
    }

}
