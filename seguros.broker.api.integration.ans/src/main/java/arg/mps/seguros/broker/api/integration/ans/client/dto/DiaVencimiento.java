package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiaVencimiento {
	@JsonProperty("Value")
	private String value;
	@JsonProperty("Text")
	private String text;
	@JsonProperty("ParentId")
	private String parentId;
	
	public DiaVencimiento() {
	}

	public DiaVencimiento(String value, String text, String parentId) {
	super();
	this.value = value;
	this.text = text;
	this.parentId = parentId;
	}

	public String getValue() {
	return value;
	}

	public void setValue(String value) {
	this.value = value;
	}

	public String getText() {
	return text;
	}

	public void setText(String text) {
	this.text = text;
	}

	public String getParentId() {
	return parentId;
	}

	public void setParentId(String parentId) {
	this.parentId = parentId;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}	
}
