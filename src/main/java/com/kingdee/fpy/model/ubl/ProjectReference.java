
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
 * Project Reference. Details
 * <p>
 * A class to define a reference to a procurement project.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ID",
    "UUID",
    "IssueDate",
    "WorkPhaseReference"
})
@Generated("jsonschema2pojo")
public class ProjectReference {

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
     * Project Reference. Identifier
     * <p>
     * An identifier for the referenced project.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    @JsonPropertyDescription("An identifier for the referenced project.")
    @Size(min = 1, max = 1)
    @Valid
    @NotNull
    private List<IdentifierType> id = new ArrayList<IdentifierType>();
    /**
     * Project Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for the referenced project.
     * 
     */
    @JsonProperty("UUID")
    @JsonPropertyDescription("A universally unique identifier for the referenced project.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uuid = new ArrayList<IdentifierType>();
    /**
     * Project Reference. Issue Date. Date
     * <p>
     * The date on which the referenced project was issued.
     * 
     */
    @JsonProperty("IssueDate")
    @JsonPropertyDescription("The date on which the referenced project was issued.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> issueDate = new ArrayList<DateType>();
    /**
     * Project Reference. Work Phase Reference
     * <p>
     * A specific phase of work in the referenced project.
     * 
     */
    @JsonProperty("WorkPhaseReference")
    @JsonPropertyDescription("A specific phase of work in the referenced project.")
    @Size(min = 1)
    @Valid
    private List<WorkPhaseReference> workPhaseReference = new ArrayList<WorkPhaseReference>();

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

    public ProjectReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Project Reference. Identifier
     * <p>
     * An identifier for the referenced project.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public List<IdentifierType> getId() {
        return id;
    }

    /**
     * Project Reference. Identifier
     * <p>
     * An identifier for the referenced project.
     * (Required)
     * 
     */
    @JsonProperty("ID")
    public void setId(List<IdentifierType> id) {
        this.id = id;
    }

    public ProjectReference withId(List<IdentifierType> id) {
        this.id = id;
        return this;
    }

    /**
     * Project Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for the referenced project.
     * 
     */
    @JsonProperty("UUID")
    public List<IdentifierType> getUuid() {
        return uuid;
    }

    /**
     * Project Reference. UUID. Identifier
     * <p>
     * A universally unique identifier for the referenced project.
     * 
     */
    @JsonProperty("UUID")
    public void setUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
    }

    public ProjectReference withUuid(List<IdentifierType> uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Project Reference. Issue Date. Date
     * <p>
     * The date on which the referenced project was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public List<DateType> getIssueDate() {
        return issueDate;
    }

    /**
     * Project Reference. Issue Date. Date
     * <p>
     * The date on which the referenced project was issued.
     * 
     */
    @JsonProperty("IssueDate")
    public void setIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
    }

    public ProjectReference withIssueDate(List<DateType> issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * Project Reference. Work Phase Reference
     * <p>
     * A specific phase of work in the referenced project.
     * 
     */
    @JsonProperty("WorkPhaseReference")
    public List<WorkPhaseReference> getWorkPhaseReference() {
        return workPhaseReference;
    }

    /**
     * Project Reference. Work Phase Reference
     * <p>
     * A specific phase of work in the referenced project.
     * 
     */
    @JsonProperty("WorkPhaseReference")
    public void setWorkPhaseReference(List<WorkPhaseReference> workPhaseReference) {
        this.workPhaseReference = workPhaseReference;
    }

    public ProjectReference withWorkPhaseReference(List<WorkPhaseReference> workPhaseReference) {
        this.workPhaseReference = workPhaseReference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("uuid");
        sb.append('=');
        sb.append(((this.uuid == null)?"<null>":this.uuid));
        sb.append(',');
        sb.append("issueDate");
        sb.append('=');
        sb.append(((this.issueDate == null)?"<null>":this.issueDate));
        sb.append(',');
        sb.append("workPhaseReference");
        sb.append('=');
        sb.append(((this.workPhaseReference == null)?"<null>":this.workPhaseReference));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.issueDate == null)? 0 :this.issueDate.hashCode()));
        result = ((result* 31)+((this.uuid == null)? 0 :this.uuid.hashCode()));
        result = ((result* 31)+((this.workPhaseReference == null)? 0 :this.workPhaseReference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectReference) == false) {
            return false;
        }
        ProjectReference rhs = ((ProjectReference) other);
        return ((((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.issueDate == rhs.issueDate)||((this.issueDate!= null)&&this.issueDate.equals(rhs.issueDate))))&&((this.uuid == rhs.uuid)||((this.uuid!= null)&&this.uuid.equals(rhs.uuid))))&&((this.workPhaseReference == rhs.workPhaseReference)||((this.workPhaseReference!= null)&&this.workPhaseReference.equals(rhs.workPhaseReference))));
    }

}
