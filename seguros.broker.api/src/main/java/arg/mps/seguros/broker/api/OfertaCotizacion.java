package arg.mps.seguros.broker.api;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OfertaCotizacion {
	
	private Aseguradora aseguradora;
	private Producto producto;
	private int idDeducible;
	private double primaAfecta;
	private double primaExcenta;
	private double primaBruta;
	private double iva;
	private int nroCuotas;
	private double valorCuota;
			
	 public OfertaCotizacion() {
		super();
	}

	public Aseguradora getAseguradora() {
		return aseguradora;
	}

	public void setAseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getIdDeducible() {
		return idDeducible;
	}

	public void setIdDeducible(int idDeducible) {
		this.idDeducible = idDeducible;
	}
	
	public double getPrimaAfecta() {
		return primaAfecta;
	}

	public void setPrimaAfecta(double primaAfecta) {
		this.primaAfecta = primaAfecta;
	}

	public double getPrimaExcenta() {
		return primaExcenta;
	}

	public void setPrimaExcenta(double primaExcenta) {
		this.primaExcenta = primaExcenta;
	}

	public double getPrimaBruta() {
		return primaBruta;
	}

	public void setPrimaBruta(double primaBruta) {
		this.primaBruta = primaBruta;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getNroCuotas() {
		return nroCuotas;
	}

	public void setNroCuotas(int nroCuotas) {
		this.nroCuotas = nroCuotas;
	}

	public double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}

	@Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }	
}
