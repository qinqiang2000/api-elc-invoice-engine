
package com.kingdee.fpy.model.ubl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * Binary Object. Type
 * <p>
 * A set of finite-length sequences of binary octets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_",
    "characterSetCode",
    "encodingCode",
    "filename",
    "format",
    "mimeCode",
    "uri"
})
@Generated("jsonschema2pojo")
public class BinaryObjectType {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_")
    @NotNull
    private String __;
    @JsonProperty("characterSetCode")
    private String characterSetCode;
    @JsonProperty("encodingCode")
    private String encodingCode;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("format")
    private String format;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mimeCode")
    @NotNull
    private String mimeCode;
    @JsonProperty("uri")
    private String uri;

    @JsonProperty("_")
    public String get__() {
        return __;
    }

    @JsonProperty("_")
    public void set__(String __) {
        this.__ = __;
    }

    public BinaryObjectType with__(String __) {
        this.__ = __;
        return this;
    }

    @JsonProperty("characterSetCode")
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    @JsonProperty("characterSetCode")
    public void setCharacterSetCode(String characterSetCode) {
        this.characterSetCode = characterSetCode;
    }

    public BinaryObjectType withCharacterSetCode(String characterSetCode) {
        this.characterSetCode = characterSetCode;
        return this;
    }

    @JsonProperty("encodingCode")
    public String getEncodingCode() {
        return encodingCode;
    }

    @JsonProperty("encodingCode")
    public void setEncodingCode(String encodingCode) {
        this.encodingCode = encodingCode;
    }

    public BinaryObjectType withEncodingCode(String encodingCode) {
        this.encodingCode = encodingCode;
        return this;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public BinaryObjectType withFilename(String filename) {
        this.filename = filename;
        return this;
    }

    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public BinaryObjectType withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mimeCode")
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("mimeCode")
    public void setMimeCode(String mimeCode) {
        this.mimeCode = mimeCode;
    }

    public BinaryObjectType withMimeCode(String mimeCode) {
        this.mimeCode = mimeCode;
        return this;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    public BinaryObjectType withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BinaryObjectType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("__");
        sb.append('=');
        sb.append(((this.__ == null)?"<null>":this.__));
        sb.append(',');
        sb.append("characterSetCode");
        sb.append('=');
        sb.append(((this.characterSetCode == null)?"<null>":this.characterSetCode));
        sb.append(',');
        sb.append("encodingCode");
        sb.append('=');
        sb.append(((this.encodingCode == null)?"<null>":this.encodingCode));
        sb.append(',');
        sb.append("filename");
        sb.append('=');
        sb.append(((this.filename == null)?"<null>":this.filename));
        sb.append(',');
        sb.append("format");
        sb.append('=');
        sb.append(((this.format == null)?"<null>":this.format));
        sb.append(',');
        sb.append("mimeCode");
        sb.append('=');
        sb.append(((this.mimeCode == null)?"<null>":this.mimeCode));
        sb.append(',');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
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
        result = ((result* 31)+((this.encodingCode == null)? 0 :this.encodingCode.hashCode()));
        result = ((result* 31)+((this.filename == null)? 0 :this.filename.hashCode()));
        result = ((result* 31)+((this.format == null)? 0 :this.format.hashCode()));
        result = ((result* 31)+((this.characterSetCode == null)? 0 :this.characterSetCode.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.mimeCode == null)? 0 :this.mimeCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BinaryObjectType) == false) {
            return false;
        }
        BinaryObjectType rhs = ((BinaryObjectType) other);
        return ((((((((this.__ == rhs.__)||((this.__!= null)&&this.__.equals(rhs.__)))&&((this.encodingCode == rhs.encodingCode)||((this.encodingCode!= null)&&this.encodingCode.equals(rhs.encodingCode))))&&((this.filename == rhs.filename)||((this.filename!= null)&&this.filename.equals(rhs.filename))))&&((this.format == rhs.format)||((this.format!= null)&&this.format.equals(rhs.format))))&&((this.characterSetCode == rhs.characterSetCode)||((this.characterSetCode!= null)&&this.characterSetCode.equals(rhs.characterSetCode))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))))&&((this.mimeCode == rhs.mimeCode)||((this.mimeCode!= null)&&this.mimeCode.equals(rhs.mimeCode))));
    }

}
