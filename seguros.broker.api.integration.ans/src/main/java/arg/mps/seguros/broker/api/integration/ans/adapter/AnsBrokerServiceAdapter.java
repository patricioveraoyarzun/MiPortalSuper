package arg.mps.seguros.broker.api.integration.ans.adapter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import arg.mps.seguros.broker.api.CotizacionAutoRequest;
import arg.mps.seguros.broker.api.CotizacionRequest;
import arg.mps.seguros.broker.api.OfertaCotizacion;
import arg.mps.seguros.broker.api.VentaRequest;
import arg.mps.seguros.broker.api.VentaResponse;
import arg.mps.seguros.broker.api.integration.BrokerService;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosDescuento;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion;
import arg.mps.seguros.broker.api.integration.ans.client.dto.AnsCotizacionAutoRequest;
import arg.mps.seguros.broker.api.integration.ans.client.dto.ComboBoxList;
import arg.mps.seguros.broker.api.integration.ans.client.dto.DatoParametricoResponse;
import arg.mps.seguros.broker.api.integration.ans.client.dto.ResultadoComboBox;
import arg.mps.seguros.broker.api.integration.ans.mapper.CotizacionAutoMapper;
import arg.mps.seguros.broker.api.integration.ans.rest.service.core.client.ComboBoxClient;

@Component
public class AnsBrokerServiceAdapter implements BrokerService{
	private final Logger logger = LoggerFactory.getLogger(AnsBrokerServiceAdapter.class);

	@Override
	public List<OfertaCotizacion> cotizar(CotizacionRequest request) {
		logger.info("Auto Adapter -> Inicio Cotizacion..."); 		
		
		try {
			
			AnsWsClientWrapper client = new AnsWsClientWrapper();
			
			if(request instanceof CotizacionAutoRequest) {
				logger.info("Es una cotizacion de auto -> {}", request);
				
				CotizacionAutoRequest objCotizacionAutoRequest = (CotizacionAutoRequest) request;
				AnsCotizacionAutoRequest requestAns = CotizacionAutoMapper.cotizacionAutoRequestToAnsCotizacionAutoRequest(objCotizacionAutoRequest);				
				logger.info("Cotizacion Auto MPS Mapper -> {}", requestAns);
				
				RetornoCotizacion response = client.cotizaAuto(requestAns);

				logger.info("ANS Cotizacion Auto Response -> {}", response.getMensaje());
				
				java.lang.Object[] ofertas =  response.getOfertas();
				
				logger.info("ANS - Cantidad de cotizaciones de Auto retornadas: {}", ofertas.length);
				
				if(ofertas != null && ofertas.length > 0){
					
					ComboBoxClient objComboBoxClient = new ComboBoxClient();
					DatoParametricoResponse objDatoParametricoResponse = objComboBoxClient.getCompaniasDeSeguros();
										
					logger.info("Auto Adapter -> objDatoParametricoResponse={}", objDatoParametricoResponse);
					
					if(objDatoParametricoResponse.getEstado().equals("0")) {
						ResultadoComboBox[] objResultado = objDatoParametricoResponse.getResultado();
						ComboBoxList[] companiasDeSeguro = objResultado[0].getComboBoxList();
						
						 List<OfertaCotizacion>  ofertasMps = CotizacionAutoMapper.ansRetornoCotizacionToOfertasCotizacionMps(response, companiasDeSeguro);
						 
						 logger.info("Auto Adapter -> Cantidad de ofertas provenientes de ANS: {}", ofertasMps.size());
						 
						 return ofertasMps;
					}
				}
				
			}else {
				logger.info("Es una cotizacion de otro tipo");
			}
			
		} catch (MalformedURLException | ServiceException | RemoteException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		logger.info("Auto Adapter -> Fin Cotizacion...");
		
		return null;
	}

	@Override
	public VentaResponse vender(VentaRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unused")
	private AnsCotizacionAutoRequest getRequesdtDummy() {
		
		DatosDescuento objDatosDescuento = new DatosDescuento();
        objDatosDescuento.setCompaniaID(3);
        objDatosDescuento.setProductoID("00000000-0000-0000-0014-000000000100");
        objDatosDescuento.setValor1("-1");
        objDatosDescuento.setValor2("310");
        
        List<DatosDescuento> objDatosDescuentoList = new ArrayList<DatosDescuento>();
        objDatosDescuentoList.add(objDatosDescuento);
                
		AnsCotizacionAutoRequest request = new AnsCotizacionAutoRequest();
		request.setRut("156324957");
		request.setEdad(40);
		request.setMarca(150);
		request.setModelo(5260);
		request.setAnio(2017);
		request.setPorcentajeDescuento(0);
		request.setTipoVehiculo(0);
		request.setDatosMultiplesDescuentos(objDatosDescuentoList);
		request.setComuna(1311);
		request.setUso(100);
		request.setSexo(0);
		request.setMejoraVR("");
		request.setRCexceso("");
		request.setPropietario(0);
		
		return request;
	}
}
