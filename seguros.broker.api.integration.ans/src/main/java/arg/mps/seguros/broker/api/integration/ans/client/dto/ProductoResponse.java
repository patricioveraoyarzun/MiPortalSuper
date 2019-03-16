package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductoResponse {
	@JsonProperty("Resultado")
	private ResultadoProducto resultado;
	@JsonProperty("Estado")
	private Integer estado;
	@JsonProperty("Mensaje")
	private Object mensaje;
	@JsonProperty("Detalle")
	private Object detalle;
	
	public ProductoResponse() {
		super();
	}	

	public ProductoResponse(ResultadoProducto resultado, Integer estado, Object mensaje, Object detalle) {
	this();
	this.resultado = resultado;
	this.estado = estado;
	this.mensaje = mensaje;
	this.detalle = detalle;
	}

	@JsonProperty("Resultado")
	public ResultadoProducto getResultado() {
	return resultado;
	}

	@JsonProperty("Resultado")
	public void setResultado(ResultadoProducto resultado) {
	this.resultado = resultado;
	}

	@JsonProperty("Estado")
	public Integer getEstado() {
	return estado;
	}

	@JsonProperty("Estado")
	public void setEstado(Integer estado) {
	this.estado = estado;
	}

	@JsonProperty("Mensaje")
	public Object getMensaje() {
	return mensaje;
	}

	@JsonProperty("Mensaje")
	public void setMensaje(Object mensaje) {
	this.mensaje = mensaje;
	}

	@JsonProperty("Detalle")
	public Object getDetalle() {
	return detalle;
	}

	@JsonProperty("Detalle")
	public void setDetalle(Object detalle) {
	this.detalle = detalle;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}	
}
