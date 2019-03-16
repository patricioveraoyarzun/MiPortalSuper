package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubAgrupacion {
	@JsonProperty("SubAgrupacionID")
	private Integer subAgrupacionID;
	@JsonProperty("Nombre")
	private String nombre;

	public SubAgrupacion() {
		super();
	}

	public SubAgrupacion(Integer subAgrupacionID, String nombre) {
		this();
		this.subAgrupacionID = subAgrupacionID;
		this.nombre = nombre;
	}

	public Integer getSubAgrupacionID() {
		return subAgrupacionID;
	}

	public void setSubAgrupacionID(Integer subAgrupacionID) {
		this.subAgrupacionID = subAgrupacionID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}
}
