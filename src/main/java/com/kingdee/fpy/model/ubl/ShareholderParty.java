
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
 * Shareholder Party. Details
 * <p>
 * A class to describe a shareholder party.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "PartecipationPercent",
    "Party"
})
@Generated("jsonschema2pojo")
public class ShareholderParty {

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
     * Shareholder Party. Partecipation. Percent
     * <p>
     * The shareholder participation, expressed as a percentage.
     * 
     */
    @JsonProperty("PartecipationPercent")
    @JsonPropertyDescription("The shareholder participation, expressed as a percentage.")
    @Size(min = 1, max = 1)
    @Valid
    private List<NumericType> partecipationPercent = new ArrayList<NumericType>();
    /**
     * Shareholder Party. Party
     * <p>
     * The shareholder party.
     * 
     */
    @JsonProperty("Party")
    @JsonPropertyDescription("The shareholder party.")
    @Size(min = 1, max = 1)
    @Valid
    private List<Party> party = new ArrayList<Party>();

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

    public ShareholderParty withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Shareholder Party. Partecipation. Percent
     * <p>
     * The shareholder participation, expressed as a percentage.
     * 
     */
    @JsonProperty("PartecipationPercent")
    public List<NumericType> getPartecipationPercent() {
        return partecipationPercent;
    }

    /**
     * Shareholder Party. Partecipation. Percent
     * <p>
     * The shareholder participation, expressed as a percentage.
     * 
     */
    @JsonProperty("PartecipationPercent")
    public void setPartecipationPercent(List<NumericType> partecipationPercent) {
        this.partecipationPercent = partecipationPercent;
    }

    public ShareholderParty withPartecipationPercent(List<NumericType> partecipationPercent) {
        this.partecipationPercent = partecipationPercent;
        return this;
    }

    /**
     * Shareholder Party. Party
     * <p>
     * The shareholder party.
     * 
     */
    @JsonProperty("Party")
    public List<Party> getParty() {
        return party;
    }

    /**
     * Shareholder Party. Party
     * <p>
     * The shareholder party.
     * 
     */
    @JsonProperty("Party")
    public void setParty(List<Party> party) {
        this.party = party;
    }

    public ShareholderParty withParty(List<Party> party) {
        this.party = party;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShareholderParty.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("partecipationPercent");
        sb.append('=');
        sb.append(((this.partecipationPercent == null)?"<null>":this.partecipationPercent));
        sb.append(',');
        sb.append("party");
        sb.append('=');
        sb.append(((this.party == null)?"<null>":this.party));
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
        result = ((result* 31)+((this.partecipationPercent == null)? 0 :this.partecipationPercent.hashCode()));
        result = ((result* 31)+((this.party == null)? 0 :this.party.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShareholderParty) == false) {
            return false;
        }
        ShareholderParty rhs = ((ShareholderParty) other);
        return ((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.partecipationPercent == rhs.partecipationPercent)||((this.partecipationPercent!= null)&&this.partecipationPercent.equals(rhs.partecipationPercent))))&&((this.party == rhs.party)||((this.party!= null)&&this.party.equals(rhs.party))));
    }

}
