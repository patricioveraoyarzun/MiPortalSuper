package arg.mps.seguros.broker.api;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Prima {
	private double afecta;
	private double excenta;
	private double iva;
	private double bruta;
	
	
	public Prima() {
		super();
	}


	public double getAfecta() {
		return afecta;
	}


	public void setAfecta(double afecta) {
		this.afecta = afecta;
	}


	public double getExcenta() {
		return excenta;
	}


	public void setExcenta(double excenta) {
		this.excenta = excenta;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	public double getBruta() {
		return bruta;
	}


	public void setBruta(double bruta) {
		this.bruta = bruta;
	}
	
	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }

}
