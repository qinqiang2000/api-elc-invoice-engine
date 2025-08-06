
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
 * Contact. Details
 * <p>
 * A class to describe a contactable person or department in an organization.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "Name",
    "Telephone",
    "Telefax",
    "ElectronicMail",
    "Note",
    "OtherCommunication"
})
@Generated("jsonschema2pojo")
public class Contact {

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
     * Contact. Identifier
     * <p>
     * An identifier for this contact.
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for this contact.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Contact. Name
     * <p>
     * The name of this contact. It is recommended that this be used for a functional name and not a personal name.
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("The name of this contact. It is recommended that this be used for a functional name and not a personal name.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> name = new ArrayList<TextType>();
    /**
     * Contact. Telephone. Text
     * <p>
     * The primary telephone number of this contact.
     * 
     */
    @JsonProperty("Telephone")
    @JsonPropertyDescription("The primary telephone number of this contact.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> telephone = new ArrayList<TextType>();
    /**
     * Contact. Telefax. Text
     * <p>
     * The primary fax number of this contact.
     * 
     */
    @JsonProperty("Telefax")
    @JsonPropertyDescription("The primary fax number of this contact.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> telefax = new ArrayList<TextType>();
    /**
     * Contact. Electronic_ Mail. Text
     * <p>
     * The primary email address of this contact.
     * 
     */
    @JsonProperty("ElectronicMail")
    @JsonPropertyDescription("The primary email address of this contact.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> electronicMail = new ArrayList<TextType>();
    /**
     * Contact. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures; in particular, a textual description of the circumstances under which this contact can be used (e.g., "emergency" or "after hours").
     * 
     */
    @JsonProperty("Note")
    @JsonPropertyDescription("Free-form text conveying information that is not contained explicitly in other structures; in particular, a textual description of the circumstances under which this contact can be used (e.g., \"emergency\" or \"after hours\").")
    @Size(min = 1)
    @Valid
    private List<TextType> note = new ArrayList<TextType>();
    /**
     * Contact. Other_ Communication. Communication
     * <p>
     * Another means of communication with this contact.
     * 
     */
    @JsonProperty("OtherCommunication")
    @JsonPropertyDescription("Another means of communication with this contact.")
    @Size(min = 1)
    @Valid
    private List<Communication> otherCommunication = new ArrayList<Communication>();

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

    public Contact withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Contact. Identifier
     * <p>
     * An identifier for this contact.
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Contact. Identifier
     * <p>
     * An identifier for this contact.
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public Contact withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Contact. Name
     * <p>
     * The name of this contact. It is recommended that this be used for a functional name and not a personal name.
     * 
     */
    @JsonProperty("Name")
    public List<TextType> getName() {
        return name;
    }

    /**
     * Contact. Name
     * <p>
     * The name of this contact. It is recommended that this be used for a functional name and not a personal name.
     * 
     */
    @JsonProperty("Name")
    public void setName(List<TextType> name) {
        this.name = name;
    }

    public Contact withName(List<TextType> name) {
        this.name = name;
        return this;
    }

    /**
     * Contact. Telephone. Text
     * <p>
     * The primary telephone number of this contact.
     * 
     */
    @JsonProperty("Telephone")
    public List<TextType> getTelephone() {
        return telephone;
    }

    /**
     * Contact. Telephone. Text
     * <p>
     * The primary telephone number of this contact.
     * 
     */
    @JsonProperty("Telephone")
    public void setTelephone(List<TextType> telephone) {
        this.telephone = telephone;
    }

    public Contact withTelephone(List<TextType> telephone) {
        this.telephone = telephone;
        return this;
    }

    /**
     * Contact. Telefax. Text
     * <p>
     * The primary fax number of this contact.
     * 
     */
    @JsonProperty("Telefax")
    public List<TextType> getTelefax() {
        return telefax;
    }

    /**
     * Contact. Telefax. Text
     * <p>
     * The primary fax number of this contact.
     * 
     */
    @JsonProperty("Telefax")
    public void setTelefax(List<TextType> telefax) {
        this.telefax = telefax;
    }

    public Contact withTelefax(List<TextType> telefax) {
        this.telefax = telefax;
        return this;
    }

    /**
     * Contact. Electronic_ Mail. Text
     * <p>
     * The primary email address of this contact.
     * 
     */
    @JsonProperty("ElectronicMail")
    public List<TextType> getElectronicMail() {
        return electronicMail;
    }

    /**
     * Contact. Electronic_ Mail. Text
     * <p>
     * The primary email address of this contact.
     * 
     */
    @JsonProperty("ElectronicMail")
    public void setElectronicMail(List<TextType> electronicMail) {
        this.electronicMail = electronicMail;
    }

    public Contact withElectronicMail(List<TextType> electronicMail) {
        this.electronicMail = electronicMail;
        return this;
    }

    /**
     * Contact. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures; in particular, a textual description of the circumstances under which this contact can be used (e.g., "emergency" or "after hours").
     * 
     */
    @JsonProperty("Note")
    public List<TextType> getNote() {
        return note;
    }

    /**
     * Contact. Note. Text
     * <p>
     * Free-form text conveying information that is not contained explicitly in other structures; in particular, a textual description of the circumstances under which this contact can be used (e.g., "emergency" or "after hours").
     * 
     */
    @JsonProperty("Note")
    public void setNote(List<TextType> note) {
        this.note = note;
    }

    public Contact withNote(List<TextType> note) {
        this.note = note;
        return this;
    }

    /**
     * Contact. Other_ Communication. Communication
     * <p>
     * Another means of communication with this contact.
     * 
     */
    @JsonProperty("OtherCommunication")
    public List<Communication> getOtherCommunication() {
        return otherCommunication;
    }

    /**
     * Contact. Other_ Communication. Communication
     * <p>
     * Another means of communication with this contact.
     * 
     */
    @JsonProperty("OtherCommunication")
    public void setOtherCommunication(List<Communication> otherCommunication) {
        this.otherCommunication = otherCommunication;
    }

    public Contact withOtherCommunication(List<Communication> otherCommunication) {
        this.otherCommunication = otherCommunication;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contact.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("telephone");
        sb.append('=');
        sb.append(((this.telephone == null)?"<null>":this.telephone));
        sb.append(',');
        sb.append("telefax");
        sb.append('=');
        sb.append(((this.telefax == null)?"<null>":this.telefax));
        sb.append(',');
        sb.append("electronicMail");
        sb.append('=');
        sb.append(((this.electronicMail == null)?"<null>":this.electronicMail));
        sb.append(',');
        sb.append("note");
        sb.append('=');
        sb.append(((this.note == null)?"<null>":this.note));
        sb.append(',');
        sb.append("otherCommunication");
        sb.append('=');
        sb.append(((this.otherCommunication == null)?"<null>":this.otherCommunication));
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
        result = ((result* 31)+((this.electronicMail == null)? 0 :this.electronicMail.hashCode()));
        result = ((result* 31)+((this.note == null)? 0 :this.note.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.telephone == null)? 0 :this.telephone.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.otherCommunication == null)? 0 :this.otherCommunication.hashCode()));
        result = ((result* 31)+((this.telefax == null)? 0 :this.telefax.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return (((((((((this.electronicMail == rhs.electronicMail)||((this.electronicMail!= null)&&this.electronicMail.equals(rhs.electronicMail)))&&((this.note == rhs.note)||((this.note!= null)&&this.note.equals(rhs.note))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.telephone == rhs.telephone)||((this.telephone!= null)&&this.telephone.equals(rhs.telephone))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.otherCommunication == rhs.otherCommunication)||((this.otherCommunication!= null)&&this.otherCommunication.equals(rhs.otherCommunication))))&&((this.telefax == rhs.telefax)||((this.telefax!= null)&&this.telefax.equals(rhs.telefax))));
    }

}
