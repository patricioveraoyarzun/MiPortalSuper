package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Banco {
	@JsonProperty("Value")
	private String value;
	@JsonProperty("Text")
	private String text;
	@JsonProperty("ParentId")
	private Object parentId;

	public Banco() {
		super();
	}

	public Banco(String value, String text, Object parentId) {
		this();
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

	public Object getParentId() {
		return parentId;
	}

	public void setParentId(Object parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}
}
