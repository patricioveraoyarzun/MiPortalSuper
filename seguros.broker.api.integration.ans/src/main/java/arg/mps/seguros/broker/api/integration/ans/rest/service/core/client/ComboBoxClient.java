package arg.mps.seguros.broker.api.integration.ans.rest.service.core.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import arg.mps.seguros.broker.api.integration.ans.client.dto.DatoParametricoResponse;

@Component
public class ComboBoxClient {
	
	private static String SERVICE_COMBOBOX_PATH = "ComboBox";
	private static String SERVICE_COMBOBOX_PARAMETER = "listadoParametrico";

	public DatoParametricoResponse getMarcasAuto() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("Marca");
	}
	
	public DatoParametricoResponse getModelosAuto() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("Modelo");
	}	
	
	public DatoParametricoResponse getRegiones() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("Region");
	}
	
	public DatoParametricoResponse getCiudades() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("Ciudad");
	}
	
	public DatoParametricoResponse getComunas() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("Comuna");
	}
	
	public DatoParametricoResponse getVehiculoTipoUso() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("VehiculoTipoUso");
	}	
	
	public DatoParametricoResponse getCompaniasDeSeguros() throws URISyntaxException, ClientProtocolException, IOException {
		return execute("CompaniasDeSeguros");
	}
	
	private DatoParametricoResponse execute(String parametrica) throws URISyntaxException, ClientProtocolException, IOException {
			
		URI uri = new AnsServiciosCoreUriBuilder()
				.withServicePath(SERVICE_COMBOBOX_PATH)
				.addParameter(SERVICE_COMBOBOX_PARAMETER, parametrica)
				.build();
				
		HttpPost request = new HttpPost(uri);

		System.out.println("URI servicio parametrico ANS: " + uri);
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(request);
		
		int statusCode = response.getStatusLine().getStatusCode();

		System.out.println("Código de estado de la respuesta: " + statusCode);
		
		HttpEntity entity = response.getEntity();
		String json = EntityUtils.toString(entity, "UTF-8");
			
		return getResponse(json);		
	}
	
	private DatoParametricoResponse getResponse(String jsonResponse) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();	
		DatoParametricoResponse response = mapper.readValue(jsonResponse, DatoParametricoResponse.class);
		
		return response;
	}

}
