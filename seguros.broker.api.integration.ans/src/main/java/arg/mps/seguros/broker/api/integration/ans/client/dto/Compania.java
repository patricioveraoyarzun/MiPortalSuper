package arg.mps.seguros.broker.api.integration.ans.client.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Compania {
	@JsonProperty("CompaniaID")
	private Integer companiaID;
	@JsonProperty("Nombre")
	private String nombre;
	@JsonProperty("FormaPago")
	private List<FormaPago> formaPago = null;

	public Compania() {
	}

	public Compania(Integer companiaID, String nombre, List<FormaPago> formaPago) {
		super();
		this.companiaID = companiaID;
		this.nombre = nombre;
		this.formaPago = formaPago;
	}

	public Integer getCompaniaID() {
		return companiaID;
	}

	public void setCompaniaID(Integer companiaID) {
		this.companiaID = companiaID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<FormaPago> getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(List<FormaPago> formaPago) {
		this.formaPago = formaPago;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}	
}
