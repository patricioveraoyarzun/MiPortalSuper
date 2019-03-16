package arg.mps.seguros.broker.api.integration.ans.adapter;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosMultiplesDescuentos;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.AuthHeader;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.CotizacionGeneralLocator;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.CotizacionGeneralSoap12Stub;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosDescuento;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion;
import arg.mps.seguros.broker.api.integration.ans.client.dto.AnsCotizacionAutoRequest;
import arg.mps.seguros.broker.api.integration.ans.config.Configuration;

public class AnsWsClientWrapper {
	
	private CotizacionGeneralSoap12Stub binding = null;
	
	private String username = null;
	private String password = null;
		
	public AnsWsClientWrapper() throws ServiceException, MalformedURLException{
		configureClient();
		
		username =  Configuration.getInstance().getAnsServiceAuthHeaderUsername();
		password =  Configuration.getInstance().getAnsServiceAuthHeaderPassword();
	}
	
	public RetornoCotizacion cotizaAuto(AnsCotizacionAutoRequest request) throws ServiceException, RemoteException {
		
        AuthHeader objAuthHeader = new AuthHeader();
        objAuthHeader.setUsername(username);
        objAuthHeader.setPassword(password);
        
        binding.setHeader("http://tempuri.org/encodedTypes", "AuthHeader", objAuthHeader);
		
		Object[] objDatosMultiplesDescuentos = null;
		
		List<DatosDescuento> datosMultiplesDescuentos = request.getDatosMultiplesDescuentos();
		
		if(datosMultiplesDescuentos != null && datosMultiplesDescuentos.size() > 0){
			objDatosMultiplesDescuentos = new Object[datosMultiplesDescuentos.size()];			
			for(int i=0; i<datosMultiplesDescuentos.size(); i++ ) {
				objDatosMultiplesDescuentos[i] = datosMultiplesDescuentos.get(i); 
			}
		}
		
        DatosMultiplesDescuentos objDatosMultiplesDescuentosClient = new DatosMultiplesDescuentos();
        objDatosMultiplesDescuentosClient.setODatosMultiplesDescuentos(objDatosMultiplesDescuentos);
        
        String rut = request.getRut();
    	int edad = request.getEdad();
    	int marca = request.getMarca();
    	int modelo = request.getModelo();
    	int ano = request.getAnio(); 
    	float porcentajeDescuento = request.getPorcentajeDescuento(); 
    	int tipoVehiculo = request.getTipoVehiculo();
    	int comuna = request.getComuna();
    	int uso = request.getUso();
    	int sexo = request.getSexo();
    	String mejoraVR = request.getMejoraVR(); 
    	String RCexceso = request.getRCexceso();
    	int propietario = request.getPropietario();
    	
		RetornoCotizacion value = binding.cotizaAuto(rut, edad, marca, modelo, ano, porcentajeDescuento, tipoVehiculo, objDatosMultiplesDescuentosClient, comuna, uso, sexo, mejoraVR, RCexceso, propietario);		
		
		return value;
	}
	
	private void configureClient() throws ServiceException, MalformedURLException {
						
		String urlService = Configuration.getInstance().getAnsCotizacionServiceUrl();
		String timeoutService = Configuration.getInstance().getAnsCotizacionServiceTimeout();
		
		URL portAddress = new URL(urlService);
		
		binding = (CotizacionGeneralSoap12Stub)new CotizacionGeneralLocator().getCotizacionGeneralSoap12(portAddress);
		binding.setTimeout(Integer.parseInt(timeoutService));	
	}
}
