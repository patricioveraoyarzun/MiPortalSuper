package arg.mps.seguros.broker.api.integration;

import java.util.List;

import arg.mps.seguros.broker.api.CotizacionRequest;
import arg.mps.seguros.broker.api.OfertaCotizacion;
import arg.mps.seguros.broker.api.VentaRequest;
import arg.mps.seguros.broker.api.VentaResponse;

public interface BrokerService {
	
	public List<OfertaCotizacion> cotizar(CotizacionRequest request);
	public VentaResponse vender(VentaRequest request);
	
}
