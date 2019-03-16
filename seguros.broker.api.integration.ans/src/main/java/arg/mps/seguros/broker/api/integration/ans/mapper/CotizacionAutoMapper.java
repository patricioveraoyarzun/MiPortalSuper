package arg.mps.seguros.broker.api.integration.ans.mapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import arg.mps.seguros.broker.api.Asegurado;
import arg.mps.seguros.broker.api.Aseguradora;
import arg.mps.seguros.broker.api.CotizacionAutoRequest;
import arg.mps.seguros.broker.api.OfertaCotizacion;
import arg.mps.seguros.broker.api.Producto;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.Ofertas;
import arg.mps.seguros.broker.api.integration.ans.client.cotizacion.RetornoCotizacion;
import arg.mps.seguros.broker.api.integration.ans.client.dto.AnsCotizacionAutoRequest;
import arg.mps.seguros.broker.api.integration.ans.client.dto.ComboBoxList;
import arg.mps.seguros.broker.api.integration.ans.client.dto.Deducible;
import arg.mps.seguros.broker.api.integration.ans.rest.service.core.client.ProductoClient;
import arg.mps.seguros.broker.utils.DateUtil;
import arg.mps.seguros.broker.utils.NumberUtil;
import arg.mps.seguros.broker.utils.StringUtil;

public class CotizacionAutoMapper {
	
	private static final Logger logger = LoggerFactory.getLogger(CotizacionAutoMapper.class);	
    private static final Map<Integer, String> pahtImgAseguradorasMap;
    static {
    	pahtImgAseguradorasMap = new HashMap<Integer, String>();
    	pahtImgAseguradorasMap.put(3, "assets/images/seguro_chilena_consolidada.png");
    	pahtImgAseguradorasMap.put(8, "assets/images/seguro_mapfre.png");
    	pahtImgAseguradorasMap.put(12, "assets/images/segurosSURA.jpeg");
    	pahtImgAseguradorasMap.put(18, "assets/images/seguro_renta_nacional.png");
    	pahtImgAseguradorasMap.put(46, "assets/images/seguro_renta_nacional.png");
    	pahtImgAseguradorasMap.put(16, "assets/images/seguro_bci.png");
    	pahtImgAseguradorasMap.put(17, "assets/images/seguro_consorcio.png");
    	pahtImgAseguradorasMap.put(56, "assets/images/seguro_zenit.png");
    }
    
	public static AnsCotizacionAutoRequest cotizacionAutoRequestToAnsCotizacionAutoRequest(CotizacionAutoRequest request) {
	
		if(request != null) {
		
			Asegurado objAsegurado = request.getAsegurado();
			
			AnsCotizacionAutoRequest objAnsCotizacionAutoRequest = new AnsCotizacionAutoRequest();			
			objAnsCotizacionAutoRequest.setRut(String.valueOf(objAsegurado.getRut()) + objAsegurado.getDv());
			objAnsCotizacionAutoRequest.setEdad(DateUtil.calcularAnios(objAsegurado.getFechaNacimiento()));
			objAnsCotizacionAutoRequest.setMarca(request.getIdMarca());
			objAnsCotizacionAutoRequest.setModelo(request.getIdModelo());
			objAnsCotizacionAutoRequest.setAnio(request.getAnio());
			objAnsCotizacionAutoRequest.setPorcentajeDescuento(0);
			objAnsCotizacionAutoRequest.setTipoVehiculo(0);
			objAnsCotizacionAutoRequest.setComuna(objAsegurado.getIdComuna());
			objAnsCotizacionAutoRequest.setUso(request.getTipoUso());
			objAnsCotizacionAutoRequest.setSexo(objAsegurado.getIdSexo());
			objAnsCotizacionAutoRequest.setMejoraVR("");
			objAnsCotizacionAutoRequest.setRCexceso("");
			objAnsCotizacionAutoRequest.setPropietario(objAsegurado.isEsPropietario()?1:0);
			
			return objAnsCotizacionAutoRequest;
		}
				
		return null;
	}
	
	public static List<OfertaCotizacion> ansRetornoCotizacionToOfertasCotizacionMps(RetornoCotizacion ansResponse, ComboBoxList[] companiasDeSeguro) throws ClientProtocolException, URISyntaxException, IOException {
		
		List<OfertaCotizacion> listaOfertasMps = new ArrayList<OfertaCotizacion>();
			
		Object[] ofertaAns = ansResponse.getOfertas();		
		
		int ofertasLength = ofertaAns!=null?ofertaAns.length:0;
		Ofertas objOfertasItem = null;
		
		List<ComboBoxList> companiasDeSeguroList = Arrays.asList(companiasDeSeguro);
		OfertaCotizacion ofertaCotizacionAns = null;
		Aseguradora objAseguradora = null;
		Producto objProducto = null;

		for(int i=0; i<ofertasLength; i++) {
			objOfertasItem = (Ofertas)ofertaAns[i];
			
			if(objOfertasItem.getCompaniaID() != -1) {
				final String comapiaId = String.valueOf(objOfertasItem.getCompaniaID());
				
				ComboBoxList objComboBoxList = companiasDeSeguroList
				.stream()
				.filter(compania -> compania.getValue().equals(comapiaId))
				.findFirst()
				.orElse(null);
				
				if(objComboBoxList != null) {
					String idAseguradoraAns = objComboBoxList.getValue();
					String nombreComaniaOfertaAns = objComboBoxList.getText();
					
					int idSeguradoraAns = Integer.parseInt(idAseguradoraAns);
					objAseguradora = new Aseguradora();
					objAseguradora.setId(idSeguradoraAns);
					objAseguradora.setNombre(nombreComaniaOfertaAns);
					objAseguradora.setImagenRuta(getPathImageAseguradora(idSeguradoraAns));				
				}
				
				objProducto = new Producto();
				objProducto.setId((i+1)*2);
				objProducto.setNombre(objOfertasItem.getProducto());
								
				ofertaCotizacionAns = new OfertaCotizacion();
				ofertaCotizacionAns.setNroCuotas(objOfertasItem.getNumeroCuotas());
				ofertaCotizacionAns.setValorCuota(NumberUtil.getFloatAsDouble(objOfertasItem.getValorCuota()));
				ofertaCotizacionAns.setProducto(objProducto);
				ofertaCotizacionAns.setAseguradora(objAseguradora);
				ofertaCotizacionAns.setPrimaAfecta(NumberUtil.getFloatAsDouble(objOfertasItem.getPrimaAfecta()));
				ofertaCotizacionAns.setPrimaExcenta(NumberUtil.getFloatAsDouble(objOfertasItem.getPrimaExenta()));
				ofertaCotizacionAns.setPrimaBruta(NumberUtil.getFloatAsDouble(objOfertasItem.getPrimaBruta()));
				ofertaCotizacionAns.setIva(NumberUtil.getFloatAsDouble(objOfertasItem.getIva()));
				
				String productoId = objOfertasItem.getProductoID();
				productoId = productoId.replace("{", "").replace("}", "");
				
				int deducibleNombre = getNombreDeduciblePorProductoANS(productoId, objOfertasItem.getDeducible());
				ofertaCotizacionAns.setIdDeducible(deducibleNombre);
				
				listaOfertasMps.add(ofertaCotizacionAns);
			}
		}
		
		return listaOfertasMps;
	}
	
	private static int getNombreDeduciblePorProductoANS(String idProducto, int idDeducible) throws ClientProtocolException, URISyntaxException, IOException {
		ProductoClient client = new ProductoClient();
		List<Deducible> deduciblesProducto = client.getDeduciblesPorProducto(idProducto);
		
		if(deduciblesProducto != null && deduciblesProducto.size() > 0) {
			Deducible deducible = deduciblesProducto
					.stream()
					.filter(d -> d.getDeducibleID() == idDeducible)
					.findFirst()
					.orElse(null);
			
			if(deducible != null && StringUtil.isNumber(deducible.getNombre())) {
				return Integer.parseInt(deducible.getNombre());
			}
		}
		
		return 0;
	}
	
	private static String getPathImageAseguradora(int idSeguradoraAns) {
		String img = pahtImgAseguradorasMap.get(idSeguradoraAns);
		if(!StringUtil.isNullOrEmpty(img)) {
			return img;
		}		
		return null;
	}
}
