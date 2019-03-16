package arg.mps.seguros.broker.api.integration.ans.rest.service.core.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import arg.mps.seguros.broker.api.integration.ans.client.dto.Deducible;
import arg.mps.seguros.broker.api.integration.ans.client.dto.ProductoResponse;
import arg.mps.seguros.broker.api.integration.ans.client.dto.ResultadoProducto;

public class ProductoClient {
	private static String SERVICE_PRODUCTO_PATH = "Producto";
	private static String SERVICE_PRODUCTO_PARAMETER = "ProductoId";
	
	public ProductoResponse getProductoPorId(String idProducto) throws URISyntaxException, ClientProtocolException, IOException{
		URI uri = new AnsServiciosCoreUriBuilder()
				.withServicePath(SERVICE_PRODUCTO_PATH)
				.addParameter(SERVICE_PRODUCTO_PARAMETER, idProducto)
				.build();
				
		HttpPost request = new HttpPost(uri);

		System.out.println("URI servicio productro ANS: " + uri);
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(request);
		
		int statusCode = response.getStatusLine().getStatusCode();

		System.out.println("Código de estado de la respuesta: " + statusCode);
		
		HttpEntity entity = response.getEntity();
		String json = EntityUtils.toString(entity, "UTF-8");
				
		return getResponse(json);			
	}
	
	public List<Deducible> getDeduciblesPorProducto(String idProducto) throws ClientProtocolException, URISyntaxException, IOException{
		ProductoResponse response = getProductoPorId(idProducto);
		ResultadoProducto resultado = response.getResultado();
		return resultado.getDeducibles();
	}
	
	private ProductoResponse getResponse(String jsonResponse) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();	
		ProductoResponse response = mapper.readValue(jsonResponse, ProductoResponse.class);
		
		return response;
	}	
}
