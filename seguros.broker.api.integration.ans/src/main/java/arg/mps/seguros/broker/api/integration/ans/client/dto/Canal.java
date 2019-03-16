package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Canal {
	@JsonProperty("CanalID")
	private Integer canalID;
	@JsonProperty("Nombre")
	private String nombre;

	public Canal() {
		super();
	}

	public Canal(Integer canalID, String nombre) {
		this();
		this.canalID = canalID;
		this.nombre = nombre;
	}

	public Integer getCanalID() {
		return canalID;
	}

	public void setCanalID(Integer canalID) {
		this.canalID = canalID;
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
