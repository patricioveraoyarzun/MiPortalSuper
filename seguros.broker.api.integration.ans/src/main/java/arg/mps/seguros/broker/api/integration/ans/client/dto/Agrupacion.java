package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agrupacion {
	@JsonProperty("AgrupacionID")
	private Integer agrupacionID;
	@JsonProperty("Nombre")
	private String nombre;
	

	 public Agrupacion() {
	 }

	 public Agrupacion(Integer agrupacionID, String nombre) {
		 super();
		 this.agrupacionID = agrupacionID;
		 this.nombre = nombre;
	 }

	 public Integer getAgrupacionID() {
	 return agrupacionID;
	 }

	 public void setAgrupacionID(Integer agrupacionID) {
	 this.agrupacionID = agrupacionID;
	 }

	 public String getNombre() {
	 return nombre;
	 }

	 public void setNombre(String nombre) {
	 this.nombre = nombre;
	 }
	 
	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }		 
}
