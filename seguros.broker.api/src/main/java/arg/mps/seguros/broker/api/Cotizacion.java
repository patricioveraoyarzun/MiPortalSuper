package arg.mps.seguros.broker.api;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Cotizacion {
	
	private int id;
	private int idEntidadProveedoraSrv;
	private List<OfertaCotizacion> ofertasCotizacion;

	public Cotizacion() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEntidadProveedoraSrv() {
		return idEntidadProveedoraSrv;
	}

	public void setIdEntidadProveedoraSrv(int idEntidadProveedoraSrv) {
		this.idEntidadProveedoraSrv = idEntidadProveedoraSrv;
	}

	public List<OfertaCotizacion> getOfertasCotizacion() {
		return ofertasCotizacion;
	}

	public void setOfertasCotizacion(List<OfertaCotizacion> ofertasCotizacion) {
		this.ofertasCotizacion = ofertasCotizacion;
	}
	
	@Override
    public String toString() {
	 return ReflectionToStringBuilder.toString(this, 
	            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }	
	
}
