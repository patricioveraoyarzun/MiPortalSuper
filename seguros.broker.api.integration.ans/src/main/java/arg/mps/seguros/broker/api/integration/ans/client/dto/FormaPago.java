package arg.mps.seguros.broker.api.integration.ans.client.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FormaPago {
	@JsonProperty("FormaPagoID")
	private Integer formaPagoID;
	@JsonProperty("Nombre")
	private String nombre;
	@JsonProperty("Bancos")
	private List<Banco> bancos = null;
	@JsonProperty("TarjetasDeCreditos")
	private List<TarjetasDeCredito> tarjetasDeCreditos = null;
	@JsonProperty("DiaVencimiento")
	private List<DiaVencimiento> diaVencimiento = null;
	@JsonProperty("Cuotas")
	private Integer cuotas;
	@JsonProperty("PagoElectronico")
	private Boolean pagoElectronico;

	public FormaPago() {
		super();
	}

	public FormaPago(Integer formaPagoID, String nombre, List<Banco> bancos, List<TarjetasDeCredito> tarjetasDeCreditos,
			List<DiaVencimiento> diaVencimiento, Integer cuotas, Boolean pagoElectronico) {
		this();
		this.formaPagoID = formaPagoID;
		this.nombre = nombre;
		this.bancos = bancos;
		this.tarjetasDeCreditos = tarjetasDeCreditos;
		this.diaVencimiento = diaVencimiento;
		this.cuotas = cuotas;
		this.pagoElectronico = pagoElectronico;
	}

	public Integer getFormaPagoID() {
		return formaPagoID;
	}

	public void setFormaPagoID(Integer formaPagoID) {
		this.formaPagoID = formaPagoID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Banco> getBancos() {
		return bancos;
	}

	public void setBancos(List<Banco> bancos) {
		this.bancos = bancos;
	}

	public List<TarjetasDeCredito> getTarjetasDeCreditos() {
		return tarjetasDeCreditos;
	}

	public void setTarjetasDeCreditos(List<TarjetasDeCredito> tarjetasDeCreditos) {
		this.tarjetasDeCreditos = tarjetasDeCreditos;
	}

	public List<DiaVencimiento> getDiaVencimiento() {
		return diaVencimiento;
	}

	public void setDiaVencimiento(List<DiaVencimiento> diaVencimiento) {
		this.diaVencimiento = diaVencimiento;
	}

	public Integer getCuotas() {
		return cuotas;
	}

	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}

	public Boolean getPagoElectronico() {
		return pagoElectronico;
	}

	public void setPagoElectronico(Boolean pagoElectronico) {
		this.pagoElectronico = pagoElectronico;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}	
}
