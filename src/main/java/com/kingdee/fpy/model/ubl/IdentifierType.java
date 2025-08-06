
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Identifier. Type
 * <p>
 * A character string to identify and distinguish uniquely, one instance of an object in an identification scheme from all other objects in the same scheme together with relevant supplementary information.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "schemeID",
    "schemeName",
    "schemeAgencyID",
    "schemeAgencyName",
    "schemeVersionID",
    "schemeDataURI",
    "schemeURI"
})
@Generated("jsonschema2pojo")
public class IdentifierType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private String __;
    @JsonProperty("schemeID")
    private String schemeID;
    @JsonProperty("schemeName")
    private String schemeName;
    @JsonProperty("schemeAgencyID")
    private String schemeAgencyID;
    @JsonProperty("schemeAgencyName")
    private String schemeAgencyName;
    @JsonProperty("schemeVersionID")
    private String schemeVersionID;
    @JsonProperty("schemeDataURI")
    private String schemeDataURI;
    @JsonProperty("schemeURI")
    private String schemeURI;

    @JsonProperty("_")
    public String get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(String __) {
        this.__ = __;
    }

    public IdentifierType with__(String __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("schemeID")
    public String getSchemeID() {
        return schemeID;
    }

    @JsonProperty("schemeID")
    public void setSchemeID(String schemeID) {
        this.schemeID = schemeID;
    }

    public IdentifierType withSchemeID(String schemeID) {
        this.schemeID = schemeID;
        return this;
    }

    @JsonProperty("schemeName")
    public String getSchemeName() {
        return schemeName;
    }

    @JsonProperty("schemeName")
    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public IdentifierType withSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    @JsonProperty("schemeAgencyID")
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    @JsonProperty("schemeAgencyID")
    public void setSchemeAgencyID(String schemeAgencyID) {
        this.schemeAgencyID = schemeAgencyID;
    }

    public IdentifierType withSchemeAgencyID(String schemeAgencyID) {
        this.schemeAgencyID = schemeAgencyID;
        return this;
    }

    @JsonProperty("schemeAgencyName")
    public String getSchemeAgencyName() {
        return schemeAgencyName;
    }

    @JsonProperty("schemeAgencyName")
    public void setSchemeAgencyName(String schemeAgencyName) {
        this.schemeAgencyName = schemeAgencyName;
    }

    public IdentifierType withSchemeAgencyName(String schemeAgencyName) {
        this.schemeAgencyName = schemeAgencyName;
        return this;
    }

    @JsonProperty("schemeVersionID")
    public String getSchemeVersionID() {
        return schemeVersionID;
    }

    @JsonProperty("schemeVersionID")
    public void setSchemeVersionID(String schemeVersionID) {
        this.schemeVersionID = schemeVersionID;
    }

    public IdentifierType withSchemeVersionID(String schemeVersionID) {
        this.schemeVersionID = schemeVersionID;
        return this;
    }

    @JsonProperty("schemeDataURI")
    public String getSchemeDataURI() {
        return schemeDataURI;
    }

    @JsonProperty("schemeDataURI")
    public void setSchemeDataURI(String schemeDataURI) {
        this.schemeDataURI = schemeDataURI;
    }

    public IdentifierType withSchemeDataURI(String schemeDataURI) {
        this.schemeDataURI = schemeDataURI;
        return this;
    }

    @JsonProperty("schemeURI")
    public String getSchemeURI() {
        return schemeURI;
    }

    @JsonProperty("schemeURI")
    public void setSchemeURI(String schemeURI) {
        this.schemeURI = schemeURI;
    }

    public IdentifierType withSchemeURI(String schemeURI) {
        this.schemeURI = schemeURI;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IdentifierType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("schemeID");
        sb.append('=');
        sb.append(((this.schemeID == null)?"<null>":this.schemeID));
        sb.append(',');
        sb.append("schemeName");
        sb.append('=');
        sb.append(((this.schemeName == null)?"<null>":this.schemeName));
        sb.append(',');
        sb.append("schemeAgencyID");
        sb.append('=');
        sb.append(((this.schemeAgencyID == null)?"<null>":this.schemeAgencyID));
        sb.append(',');
        sb.append("schemeAgencyName");
        sb.append('=');
        sb.append(((this.schemeAgencyName == null)?"<null>":this.schemeAgencyName));
        sb.append(',');
        sb.append("schemeVersionID");
        sb.append('=');
        sb.append(((this.schemeVersionID == null)?"<null>":this.schemeVersionID));
        sb.append(',');
        sb.append("schemeDataURI");
        sb.append('=');
        sb.append(((this.schemeDataURI == null)?"<null>":this.schemeDataURI));
        sb.append(',');
        sb.append("schemeURI");
        sb.append('=');
        sb.append(((this.schemeURI == null)?"<null>":this.schemeURI));
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
        result = ((result* 31)+((this.schemeDataURI == null)? 0 :this.schemeDataURI.hashCode()));
        result = ((result* 31)+((this.schemeURI == null)? 0 :this.schemeURI.hashCode()));
        result = ((result* 31)+((this.schemeName == null)? 0 :this.schemeName.hashCode()));
        result = ((result* 31)+((this.schemeAgencyID == null)? 0 :this.schemeAgencyID.hashCode()));
        result = ((result* 31)+((this.schemeID == null)? 0 :this.schemeID.hashCode()));
        result = ((result* 31)+((this.schemeVersionID == null)? 0 :this.schemeVersionID.hashCode()));
        result = ((result* 31)+((this.schemeAgencyName == null)? 0 :this.schemeAgencyName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentifierType) == false) {
            return false;
        }
        IdentifierType rhs = ((IdentifierType) other);
        return (((((((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.schemeDataURI == rhs.schemeDataURI)||((this.schemeDataURI!= null)&&this.schemeDataURI.equals(rhs.schemeDataURI))))&&((this.schemeURI == rhs.schemeURI)||((this.schemeURI!= null)&&this.schemeURI.equals(rhs.schemeURI))))&&((this.schemeName == rhs.schemeName)||((this.schemeName!= null)&&this.schemeName.equals(rhs.schemeName))))&&((this.schemeAgencyID == rhs.schemeAgencyID)||((this.schemeAgencyID!= null)&&this.schemeAgencyID.equals(rhs.schemeAgencyID))))&&((this.schemeID == rhs.schemeID)||((this.schemeID!= null)&&this.schemeID.equals(rhs.schemeID))))&&((this.schemeVersionID == rhs.schemeVersionID)||((this.schemeVersionID!= null)&&this.schemeVersionID.equals(rhs.schemeVersionID))))&&((this.schemeAgencyName == rhs.schemeAgencyName)||((this.schemeAgencyName!= null)&&this.schemeAgencyName.equals(rhs.schemeAgencyName))));
    }

}
