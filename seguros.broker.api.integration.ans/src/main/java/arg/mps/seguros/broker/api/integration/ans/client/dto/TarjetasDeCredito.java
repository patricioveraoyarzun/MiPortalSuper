package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TarjetasDeCredito {
	@JsonProperty("Value")
	private String value;
	@JsonProperty("Text")
	private String text;
	@JsonProperty("ParentId")
	private String parentId;

	public TarjetasDeCredito() {
	}

	public TarjetasDeCredito(String value, String text, String parentId) {
		super();
		this.value = value;
		this.text = text;
		this.parentId = parentId;
	}

	@JsonProperty("Value")
	public String getValue() {
		return value;
	}

	@JsonProperty("Value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("Text")
	public String getText() {
		return text;
	}

	@JsonProperty("Text")
	public void setText(String text) {
		this.text = text;
	}

	@JsonProperty("ParentId")
	public String getParentId() {
		return parentId;
	}

	@JsonProperty("ParentId")
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}	
}
