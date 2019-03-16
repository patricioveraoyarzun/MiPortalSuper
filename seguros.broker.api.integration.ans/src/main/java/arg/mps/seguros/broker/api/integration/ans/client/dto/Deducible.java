package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Deducible {
	@JsonProperty("DeducibleID")
	private Integer deducibleID;
	@JsonProperty("Nombre")
	private String nombre;

	public Deducible() {
		super();
	}

	public Deducible(Integer deducibleID, String nombre) {
		this();
		this.deducibleID = deducibleID;
		this.nombre = nombre;
	}

	@JsonProperty("DeducibleID")
	public Integer getDeducibleID() {
		return deducibleID;
	}

	@JsonProperty("DeducibleID")
	public void setDeducibleID(Integer deducibleID) {
		this.deducibleID = deducibleID;
	}

	@JsonProperty("Nombre")
	public String getNombre() {
		return nombre;
	}

	@JsonProperty("Nombre")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}
}
