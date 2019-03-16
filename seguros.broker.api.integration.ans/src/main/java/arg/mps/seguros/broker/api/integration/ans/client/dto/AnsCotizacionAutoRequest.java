package arg.mps.seguros.broker.api.integration.ans.client.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosDescuento;

public class AnsCotizacionAutoRequest {
	private String rut; 
	private int edad; 
	private int marca; 
	private int modelo;
	private int anio; 
	private float porcentajeDescuento; 
	private int tipoVehiculo;
	private List<DatosDescuento> datosMultiplesDescuentos;
	private int comuna;
	private int uso;
	private int sexo;
	private String mejoraVR; 
	private String RCexceso;
	private int propietario;
	
	public AnsCotizacionAutoRequest() {
		super();
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getMarca() {
		return marca;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public float getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(float porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public List<DatosDescuento> getDatosMultiplesDescuentos() {
		return datosMultiplesDescuentos;
	}

	public void setDatosMultiplesDescuentos(List<DatosDescuento> datosMultiplesDescuentos) {
		this.datosMultiplesDescuentos = datosMultiplesDescuentos;
	}

	public int getComuna() {
		return comuna;
	}

	public void setComuna(int comuna) {
		this.comuna = comuna;
	}

	public int getUso() {
		return uso;
	}

	public void setUso(int uso) {
		this.uso = uso;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getMejoraVR() {
		return mejoraVR;
	}

	public void setMejoraVR(String mejoraVR) {
		this.mejoraVR = mejoraVR;
	}

	public String getRCexceso() {
		return RCexceso;
	}

	public void setRCexceso(String rCexceso) {
		RCexceso = rCexceso;
	}

	public int getPropietario() {
		return propietario;
	}

	public void setPropietario(int propietario) {
		this.propietario = propietario;
	}
	
	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }	
}
