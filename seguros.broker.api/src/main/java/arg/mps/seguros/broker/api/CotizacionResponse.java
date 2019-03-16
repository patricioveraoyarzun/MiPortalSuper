package arg.mps.seguros.broker.api;

import java.util.ArrayList;
import java.util.List;

public class CotizacionResponse extends MPSEvent {
	
	private List<Cotizacion> cotizaciones = new ArrayList<>();

	
	public CotizacionResponse() {
		super();
	}
	

	public List<Cotizacion> getCotizaciones() {
		return cotizaciones;
	}


	public void setCotizaciones(List<Cotizacion> cotizaciones) {
		this.cotizaciones = cotizaciones;
	}


	public void addCotizacion(Cotizacion cotizacion) {
		this.cotizaciones.add(cotizacion);
	}	
}
