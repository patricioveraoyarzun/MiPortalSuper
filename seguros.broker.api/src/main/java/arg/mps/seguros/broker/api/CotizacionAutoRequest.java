package arg.mps.seguros.broker.api;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CotizacionAutoRequest extends CotizacionRequest{
	
	private int idUsuario;
	private int idMarca;
	private int idModelo;
	private int anio;
	private int tipoUso;
	private Asegurado asegurado;

	public CotizacionAutoRequest() {
		super();
	}
	
	public CotizacionAutoRequest(String message) {
		super(message);
	}	
		
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdMarca() {
		return idMarca;
	}
	
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	public int getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(int idModelo) {
		this.idModelo = idModelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getTipoUso() {
		return tipoUso;
	}
	public void setTipoUso(int tipoUso) {
		this.tipoUso = tipoUso;
	}

	public Asegurado getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}
	
	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }
}
