
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
 * Communication. Details
 * <p>
 * A class to describe a means of communication.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UBLExtensions",
    "ChannelCode",
    "Channel",
    "Value"
})
@Generated("jsonschema2pojo")
public class Communication {

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
     * Communication. Channel Code. Code
     * <p>
     * The method of communication, expressed as a code.
     * 
     */
    @JsonProperty("ChannelCode")
    @JsonPropertyDescription("The method of communication, expressed as a code.")
    @Size(min = 1, max = 1)
    @Valid
    private List<CodeType> channelCode = new ArrayList<CodeType>();
    /**
     * Communication. Channel. Text
     * <p>
     * The method of communication, expressed as text.
     * 
     */
    @JsonProperty("Channel")
    @JsonPropertyDescription("The method of communication, expressed as text.")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> channel = new ArrayList<TextType>();
    /**
     * Communication. Value. Text
     * <p>
     * An identifying value (phone number, email address, etc.) for this channel of communication
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("An identifying value (phone number, email address, etc.) for this channel of communication")
    @Size(min = 1, max = 1)
    @Valid
    private List<TextType> value = new ArrayList<TextType>();

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

    public Communication withUBLExtensions(List<UBLExtensions> uBLExtensions) {
        this.uBLExtensions = uBLExtensions;
        return this;
    }

    /**
     * Communication. Channel Code. Code
     * <p>
     * The method of communication, expressed as a code.
     * 
     */
    @JsonProperty("ChannelCode")
    public List<CodeType> getChannelCode() {
        return channelCode;
    }

    /**
     * Communication. Channel Code. Code
     * <p>
     * The method of communication, expressed as a code.
     * 
     */
    @JsonProperty("ChannelCode")
    public void setChannelCode(List<CodeType> channelCode) {
        this.channelCode = channelCode;
    }

    public Communication withChannelCode(List<CodeType> channelCode) {
        this.channelCode = channelCode;
        return this;
    }

    /**
     * Communication. Channel. Text
     * <p>
     * The method of communication, expressed as text.
     * 
     */
    @JsonProperty("Channel")
    public List<TextType> getChannel() {
        return channel;
    }

    /**
     * Communication. Channel. Text
     * <p>
     * The method of communication, expressed as text.
     * 
     */
    @JsonProperty("Channel")
    public void setChannel(List<TextType> channel) {
        this.channel = channel;
    }

    public Communication withChannel(List<TextType> channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Communication. Value. Text
     * <p>
     * An identifying value (phone number, email address, etc.) for this channel of communication
     * 
     */
    @JsonProperty("Value")
    public List<TextType> getValue() {
        return value;
    }

    /**
     * Communication. Value. Text
     * <p>
     * An identifying value (phone number, email address, etc.) for this channel of communication
     * 
     */
    @JsonProperty("Value")
    public void setValue(List<TextType> value) {
        this.value = value;
    }

    public Communication withValue(List<TextType> value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Communication.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uBLExtensions");
        sb.append('=');
        sb.append(((this.uBLExtensions == null)?"<null>":this.uBLExtensions));
        sb.append(',');
        sb.append("channelCode");
        sb.append('=');
        sb.append(((this.channelCode == null)?"<null>":this.channelCode));
        sb.append(',');
        sb.append("channel");
        sb.append('=');
        sb.append(((this.channel == null)?"<null>":this.channel));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.channel == null)? 0 :this.channel.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.channelCode == null)? 0 :this.channelCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Communication) == false) {
            return false;
        }
        Communication rhs = ((Communication) other);
        return (((((this.uBLExtensions == rhs.uBLExtensions)||((this.uBLExtensions!= null)&&this.uBLExtensions.equals(rhs.uBLExtensions)))&&((this.channel == rhs.channel)||((this.channel!= null)&&this.channel.equals(rhs.channel))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.channelCode == rhs.channelCode)||((this.channelCode!= null)&&this.channelCode.equals(rhs.channelCode))));
    }

}
