
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
 * External Reference. Details
 * <p>
 * A class to describe an external object, such as a document stored at a remote location.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "URI",
    "DocumentHash",
    "HashAlgorithmMethod",
    "ExpiryDate",
    "ExpiryTime",
    "MimeCode",
    "FormatCode",
    "EncodingCode",
    "CharacterSetCode",
    "FileName",
    "Description"
})
@Generated("jsonschema2pojo")
public class ExternalReference {

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
     * External Reference. URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) that identifies the external object as an Internet resource.
     * 
     */
    @JsonProperty("URI")
    @JsonPropertyDescription("The Uniform Resource Identifier (URI) that identifies the external object as an Internet resource.")
    @Size(min = 1, max = 1)
    @Valid
    private List<IdentifierType> uri = new ArrayList<IdentifierType>();
    /**
     * External Reference. Document Hash. Text
     * <p>
     * A hash value for the externally stored object.
     * 
     */
    @JsonProperty("DocumentHash")
    @JsonPropertyDescription("A hash value for the externally stored object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> documentHash = new ArrayList<TextType>();
    /**
     * External Reference. Hash Algorithm Method. Text
     * <p>
     * A hash algorithm used to calculate the hash value of the externally stored object.
     * 
     */
    @JsonProperty("HashAlgorithmMethod")
    @JsonPropertyDescription("A hash algorithm used to calculate the hash value of the externally stored object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> hashAlgorithmMethod = new ArrayList<TextType>();
    /**
     * External Reference. Expiry Date. Date
     * <p>
     * The date on which availability of the resource can no longer be relied upon.
     * 
     */
    @JsonProperty("ExpiryDate")
    @JsonPropertyDescription("The date on which availability of the resource can no longer be relied upon.")
    @Size(min = 1, max = 1)
    @Valid
    private List<DateType> expiryDate = new ArrayList<DateType>();
    /**
     * External Reference. Expiry Time. Time
     * <p>
     * The time after which availability of the resource can no longer be relied upon.
     * 
     */
    @JsonProperty("ExpiryTime")
    @JsonPropertyDescription("The time after which availability of the resource can no longer be relied upon.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TimeType> expiryTime = new ArrayList<TimeType>();
    /**
     * External Reference. Mime Code. Code
     * <p>
     * A code signifying the mime type of the external object.
     * 
     */
    @JsonProperty("MimeCode")
    @JsonPropertyDescription("A code signifying the mime type of the external object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> mimeCode = new ArrayList<CodeType>();
    /**
     * External Reference. Format Code. Code
     * <p>
     * A code signifying the format of the external object.
     * 
     */
    @JsonProperty("FormatCode")
    @JsonPropertyDescription("A code signifying the format of the external object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> formatCode = new ArrayList<CodeType>();
    /**
     * External Reference. Encoding Code. Code
     * <p>
     * A code signifying the encoding/decoding algorithm used with the external object.
     * 
     */
    @JsonProperty("EncodingCode")
    @JsonPropertyDescription("A code signifying the encoding/decoding algorithm used with the external object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> encodingCode = new ArrayList<CodeType>();
    /**
     * External Reference. Character Set Code. Code
     * <p>
     * A code signifying the character set of an external document.
     * 
     */
    @JsonProperty("CharacterSetCode")
    @JsonPropertyDescription("A code signifying the character set of an external document.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> characterSetCode = new ArrayList<CodeType>();
    /**
     * External Reference. File Name. Name
     * <p>
     * The file name of the external object.
     * 
     */
    @JsonProperty("FileName")
    @JsonPropertyDescription("The file name of the external object.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> fileName = new ArrayList<TextType>();
    /**
     * External Reference. Description. Text
     * <p>
     * Text describing the external object.
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("Text describing the external object.")
    @Size(min = 1)
    @Valid
    private List<TextType> description = new ArrayList<TextType>();

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

    public ExternalReference withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * External Reference. URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) that identifies the external object as an Internet resource.
     * 
     */
    @JsonProperty("URI")
    public List<IdentifierType> getUri() {
        return uri;
    }

    /**
     * External Reference. URI. Identifier
     * <p>
     * The Uniform Resource Identifier (URI) that identifies the external object as an Internet resource.
     * 
     */
    @JsonProperty("URI")
    public void setUri(List<IdentifierType> uri) {
        this.uri = uri;
    }

    public ExternalReference withUri(List<IdentifierType> uri) {
        this.uri = uri;
        return this;
    }

    /**
     * External Reference. Document Hash. Text
     * <p>
     * A hash value for the externally stored object.
     * 
     */
    @JsonProperty("DocumentHash")
    public List<TextType> getDocumentHash() {
        return documentHash;
    }

    /**
     * External Reference. Document Hash. Text
     * <p>
     * A hash value for the externally stored object.
     * 
     */
    @JsonProperty("DocumentHash")
    public void setDocumentHash(List<TextType> documentHash) {
        this.documentHash = documentHash;
    }

    public ExternalReference withDocumentHash(List<TextType> documentHash) {
        this.documentHash = documentHash;
        return this;
    }

    /**
     * External Reference. Hash Algorithm Method. Text
     * <p>
     * A hash algorithm used to calculate the hash value of the externally stored object.
     * 
     */
    @JsonProperty("HashAlgorithmMethod")
    public List<TextType> getHashAlgorithmMethod() {
        return hashAlgorithmMethod;
    }

    /**
     * External Reference. Hash Algorithm Method. Text
     * <p>
     * A hash algorithm used to calculate the hash value of the externally stored object.
     * 
     */
    @JsonProperty("HashAlgorithmMethod")
    public void setHashAlgorithmMethod(List<TextType> hashAlgorithmMethod) {
        this.hashAlgorithmMethod = hashAlgorithmMethod;
    }

    public ExternalReference withHashAlgorithmMethod(List<TextType> hashAlgorithmMethod) {
        this.hashAlgorithmMethod = hashAlgorithmMethod;
        return this;
    }

    /**
     * External Reference. Expiry Date. Date
     * <p>
     * The date on which availability of the resource can no longer be relied upon.
     * 
     */
    @JsonProperty("ExpiryDate")
    public List<DateType> getExpiryDate() {
        return expiryDate;
    }

    /**
     * External Reference. Expiry Date. Date
     * <p>
     * The date on which availability of the resource can no longer be relied upon.
     * 
     */
    @JsonProperty("ExpiryDate")
    public void setExpiryDate(List<DateType> expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ExternalReference withExpiryDate(List<DateType> expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * External Reference. Expiry Time. Time
     * <p>
     * The time after which availability of the resource can no longer be relied upon.
     * 
     */
    @JsonProperty("ExpiryTime")
    public List<TimeType> getExpiryTime() {
        return expiryTime;
    }

    /**
     * External Reference. Expiry Time. Time
     * <p>
     * The time after which availability of the resource can no longer be relied upon.
     * 
     */
    @JsonProperty("ExpiryTime")
    public void setExpiryTime(List<TimeType> expiryTime) {
        this.expiryTime = expiryTime;
    }

    public ExternalReference withExpiryTime(List<TimeType> expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * External Reference. Mime Code. Code
     * <p>
     * A code signifying the mime type of the external object.
     * 
     */
    @JsonProperty("MimeCode")
    public List<CodeType> getMimeCode() {
        return mimeCode;
    }

    /**
     * External Reference. Mime Code. Code
     * <p>
     * A code signifying the mime type of the external object.
     * 
     */
    @JsonProperty("MimeCode")
    public void setMimeCode(List<CodeType> mimeCode) {
        this.mimeCode = mimeCode;
    }

    public ExternalReference withMimeCode(List<CodeType> mimeCode) {
        this.mimeCode = mimeCode;
        return this;
    }

    /**
     * External Reference. Format Code. Code
     * <p>
     * A code signifying the format of the external object.
     * 
     */
    @JsonProperty("FormatCode")
    public List<CodeType> getFormatCode() {
        return formatCode;
    }

    /**
     * External Reference. Format Code. Code
     * <p>
     * A code signifying the format of the external object.
     * 
     */
    @JsonProperty("FormatCode")
    public void setFormatCode(List<CodeType> formatCode) {
        this.formatCode = formatCode;
    }

    public ExternalReference withFormatCode(List<CodeType> formatCode) {
        this.formatCode = formatCode;
        return this;
    }

    /**
     * External Reference. Encoding Code. Code
     * <p>
     * A code signifying the encoding/decoding algorithm used with the external object.
     * 
     */
    @JsonProperty("EncodingCode")
    public List<CodeType> getEncodingCode() {
        return encodingCode;
    }

    /**
     * External Reference. Encoding Code. Code
     * <p>
     * A code signifying the encoding/decoding algorithm used with the external object.
     * 
     */
    @JsonProperty("EncodingCode")
    public void setEncodingCode(List<CodeType> encodingCode) {
        this.encodingCode = encodingCode;
    }

    public ExternalReference withEncodingCode(List<CodeType> encodingCode) {
        this.encodingCode = encodingCode;
        return this;
    }

    /**
     * External Reference. Character Set Code. Code
     * <p>
     * A code signifying the character set of an external document.
     * 
     */
    @JsonProperty("CharacterSetCode")
    public List<CodeType> getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * External Reference. Character Set Code. Code
     * <p>
     * A code signifying the character set of an external document.
     * 
     */
    @JsonProperty("CharacterSetCode")
    public void setCharacterSetCode(List<CodeType> characterSetCode) {
        this.characterSetCode = characterSetCode;
    }

    public ExternalReference withCharacterSetCode(List<CodeType> characterSetCode) {
        this.characterSetCode = characterSetCode;
        return this;
    }

    /**
     * External Reference. File Name. Name
     * <p>
     * The file name of the external object.
     * 
     */
    @JsonProperty("FileName")
    public List<TextType> getFileName() {
        return fileName;
    }

    /**
     * External Reference. File Name. Name
     * <p>
     * The file name of the external object.
     * 
     */
    @JsonProperty("FileName")
    public void setFileName(List<TextType> fileName) {
        this.fileName = fileName;
    }

    public ExternalReference withFileName(List<TextType> fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * External Reference. Description. Text
     * <p>
     * Text describing the external object.
     * 
     */
    @JsonProperty("Description")
    public List<TextType> getDescription() {
        return description;
    }

    /**
     * External Reference. Description. Text
     * <p>
     * Text describing the external object.
     * 
     */
    @JsonProperty("Description")
    public void setDescription(List<TextType> description) {
        this.description = description;
    }

    public ExternalReference withDescription(List<TextType> description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExternalReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("documentHash");
        sb.append('=');
        sb.append(((this.documentHash == null)?"<null>":this.documentHash));
        sb.append(',');
        sb.append("hashAlgorithmMethod");
        sb.append('=');
        sb.append(((this.hashAlgorithmMethod == null)?"<null>":this.hashAlgorithmMethod));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("expiryTime");
        sb.append('=');
        sb.append(((this.expiryTime == null)?"<null>":this.expiryTime));
        sb.append(',');
        sb.append("mimeCode");
        sb.append('=');
        sb.append(((this.mimeCode == null)?"<null>":this.mimeCode));
        sb.append(',');
        sb.append("formatCode");
        sb.append('=');
        sb.append(((this.formatCode == null)?"<null>":this.formatCode));
        sb.append(',');
        sb.append("encodingCode");
        sb.append('=');
        sb.append(((this.encodingCode == null)?"<null>":this.encodingCode));
        sb.append(',');
        sb.append("characterSetCode");
        sb.append('=');
        sb.append(((this.characterSetCode == null)?"<null>":this.characterSetCode));
        sb.append(',');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null)?"<null>":this.fileName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.formatCode == null)? 0 :this.formatCode.hashCode()));
        result = ((result* 31)+((this.documentHash == null)? 0 :this.documentHash.hashCode()));
        result = ((result* 31)+((this.fileName == null)? 0 :this.fileName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.expiryDate == null)? 0 :this.expiryDate.hashCode()));
        result = ((result* 31)+((this.encodingCode == null)? 0 :this.encodingCode.hashCode()));
        result = ((result* 31)+((this.uBLExtensions == null)? 0 :this.uBLExtensions.hashCode()));
        result = ((result* 31)+((this.hashAlgorithmMethod == null)? 0 :this.hashAlgorithmMethod.hashCode()));
        result = ((result* 31)+((this.expiryTime == null)? 0 :this.expiryTime.hashCode()));
        result = ((result* 31)+((this.characterSetCode == null)? 0 :this.characterSetCode.hashCode()));
        result = ((result* 31)+((this.mimeCode == null)? 0 :this.mimeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalReference) == false) {
            return false;
        }
        ExternalReference rhs = ((ExternalReference) other);
        return (((((((((((((this.formatCode == rhs.formatCode)||((this.formatCode!= null)&&this.formatCode.equals(rhs.formatCode)))&&((this.documentHash == rhs.documentHash)||((this.documentHash!= null)&&this.documentHash.equals(rhs.documentHash))))&&((this.fileName == rhs.fileName)||((this.fileName!= null)&&this.fileName.equals(rhs.fileName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))))&&((this.expiryDate == rhs.expiryDate)||((this.expiryDate!= null)&&this.expiryDate.equals(rhs.expiryDate))))&&((this.encodingCode == rhs.encodingCode)||((this.encodingCode!= null)&&this.encodingCode.equals(rhs.encodingCode))))&&((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions))))&&((this.hashAlgorithmMethod == rhs.hashAlgorithmMethod)||((this.hashAlgorithmMethod!= null)&&this.hashAlgorithmMethod.equals(rhs.hashAlgorithmMethod))))&&((this.expiryTime == rhs.expiryTime)||((this.expiryTime!= null)&&this.expiryTime.equals(rhs.expiryTime))))&&((this.characterSetCode == rhs.characterSetCode)||((this.characterSetCode!= null)&&this.characterSetCode.equals(rhs.characterSetCode))))&&((this.mimeCode == rhs.mimeCode)||((this.mimeCode!= null)&&this.mimeCode.equals(rhs.mimeCode))));
    }

}
