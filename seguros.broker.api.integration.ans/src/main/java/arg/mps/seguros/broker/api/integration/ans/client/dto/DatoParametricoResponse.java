package arg.mps.seguros.broker.api.integration.ans.client.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatoParametricoResponse {
	@JsonProperty("Mensaje")
    private String mensaje;
	
	@JsonProperty("Estado")
    private String estado;

	@JsonProperty("Detalle")
    private String detalle;

	@JsonProperty("Resultado")
    private ResultadoComboBox[] resultado;

    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public ResultadoComboBox[] getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoComboBox[] resultado) {
		this.resultado = resultado;
	}


	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }	
}
