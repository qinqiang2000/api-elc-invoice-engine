
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Code. Type
 * <p>
 * A character string (letters, figures, or symbols) that for brevity and/or languange independence may be used to represent or replace a definitive value or text of an attribute together with relevant supplementary information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "listID",
    "listAgencyID",
    "listAgencyName",
    "listName",
    "listVersionID",
    "name",
    "languageID",
    "listURI",
    "listSchemeURI"
})
@Generated("jsonschema2pojo")
public class CodeType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private String __;
    @JsonProperty("listID")
    private String listID;
    @JsonProperty("listAgencyID")
    private String listAgencyID;
    @JsonProperty("listAgencyName")
    private String listAgencyName;
    @JsonProperty("listName")
    private String listName;
    @JsonProperty("listVersionID")
    private String listVersionID;
    @JsonProperty("name")
    private String name;
    @JsonProperty("languageID")
    private String languageID;
    @JsonProperty("listURI")
    private String listURI;
    @JsonProperty("listSchemeURI")
    private String listSchemeURI;

    @JsonProperty("_")
    public String get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(String __) {
        this.__ = __;
    }

    public CodeType with__(String __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("listID")
    public String getListID() {
        return listID;
    }

    @JsonProperty("listID")
    public void setListID(String listID) {
        this.listID = listID;
    }

    public CodeType withListID(String listID) {
        this.listID = listID;
        return this;
    }

    @JsonProperty("listAgencyID")
    public String getListAgencyID() {
        return listAgencyID;
    }

    @JsonProperty("listAgencyID")
    public void setListAgencyID(String listAgencyID) {
        this.listAgencyID = listAgencyID;
    }

    public CodeType withListAgencyID(String listAgencyID) {
        this.listAgencyID = listAgencyID;
        return this;
    }

    @JsonProperty("listAgencyName")
    public String getListAgencyName() {
        return listAgencyName;
    }

    @JsonProperty("listAgencyName")
    public void setListAgencyName(String listAgencyName) {
        this.listAgencyName = listAgencyName;
    }

    public CodeType withListAgencyName(String listAgencyName) {
        this.listAgencyName = listAgencyName;
        return this;
    }

    @JsonProperty("listName")
    public String getListName() {
        return listName;
    }

    @JsonProperty("listName")
    public void setListName(String listName) {
        this.listName = listName;
    }

    public CodeType withListName(String listName) {
        this.listName = listName;
        return this;
    }

    @JsonProperty("listVersionID")
    public String getListVersionID() {
        return listVersionID;
    }

    @JsonProperty("listVersionID")
    public void setListVersionID(String listVersionID) {
        this.listVersionID = listVersionID;
    }

    public CodeType withListVersionID(String listVersionID) {
        this.listVersionID = listVersionID;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CodeType withName(String name) {
        this.name = name;
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

    public CodeType withLanguageID(String languageID) {
        this.languageID = languageID;
        return this;
    }

    @JsonProperty("listURI")
    public String getListURI() {
        return listURI;
    }

    @JsonProperty("listURI")
    public void setListURI(String listURI) {
        this.listURI = listURI;
    }

    public CodeType withListURI(String listURI) {
        this.listURI = listURI;
        return this;
    }

    @JsonProperty("listSchemeURI")
    public String getListSchemeURI() {
        return listSchemeURI;
    }

    @JsonProperty("listSchemeURI")
    public void setListSchemeURI(String listSchemeURI) {
        this.listSchemeURI = listSchemeURI;
    }

    public CodeType withListSchemeURI(String listSchemeURI) {
        this.listSchemeURI = listSchemeURI;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CodeType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("listID");
        sb.append('=');
        sb.append(((this.listID == null)?"<null>":this.listID));
        sb.append(',');
        sb.append("listAgencyID");
        sb.append('=');
        sb.append(((this.listAgencyID == null)?"<null>":this.listAgencyID));
        sb.append(',');
        sb.append("listAgencyName");
        sb.append('=');
        sb.append(((this.listAgencyName == null)?"<null>":this.listAgencyName));
        sb.append(',');
        sb.append("listName");
        sb.append('=');
        sb.append(((this.listName == null)?"<null>":this.listName));
        sb.append(',');
        sb.append("listVersionID");
        sb.append('=');
        sb.append(((this.listVersionID == null)?"<null>":this.listVersionID));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("languageID");
        sb.append('=');
        sb.append(((this.languageID == null)?"<null>":this.languageID));
        sb.append(',');
        sb.append("listURI");
        sb.append('=');
        sb.append(((this.listURI == null)?"<null>":this.listURI));
        sb.append(',');
        sb.append("listSchemeURI");
        sb.append('=');
        sb.append(((this.listSchemeURI == null)?"<null>":this.listSchemeURI));
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
        result = ((result* 31)+((this.listID == null)? 0 :this.listID.hashCode()));
        result = ((result* 31)+((this.listAgencyName == null)? 0 :this.listAgencyName.hashCode()));
        result = ((result* 31)+((this.listSchemeURI == null)? 0 :this.listSchemeURI.hashCode()));
        result = ((result* 31)+((this.listURI == null)? 0 :this.listURI.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.languageID == null)? 0 :this.languageID.hashCode()));
        result = ((result* 31)+((this.listName == null)? 0 :this.listName.hashCode()));
        result = ((result* 31)+((this.listAgencyID == null)? 0 :this.listAgencyID.hashCode()));
        result = ((result* 31)+((this.listVersionID == null)? 0 :this.listVersionID.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeType) == false) {
            return false;
        }
        CodeType rhs = ((CodeType) other);
        return (((((((((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.listID == rhs.listID)||((this.listID!= null)&&this.listID.equals(rhs.listID))))&&((this.listAgencyName == rhs.listAgencyName)||((this.listAgencyName!= null)&&this.listAgencyName.equals(rhs.listAgencyName))))&&((this.listSchemeURI == rhs.listSchemeURI)||((this.listSchemeURI!= null)&&this.listSchemeURI.equals(rhs.listSchemeURI))))&&((this.listURI == rhs.listURI)||((this.listURI!= null)&&this.listURI.equals(rhs.listURI))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.languageID == rhs.languageID)||((this.languageID!= null)&&this.languageID.equals(rhs.languageID))))&&((this.listName == rhs.listName)||((this.listName!= null)&&this.listName.equals(rhs.listName))))&&((this.listAgencyID == rhs.listAgencyID)||((this.listAgencyID!= null)&&this.listAgencyID.equals(rhs.listAgencyID))))&&((this.listVersionID == rhs.listVersionID)||((this.listVersionID!= null)&&this.listVersionID.equals(rhs.listVersionID))));
    }

}
