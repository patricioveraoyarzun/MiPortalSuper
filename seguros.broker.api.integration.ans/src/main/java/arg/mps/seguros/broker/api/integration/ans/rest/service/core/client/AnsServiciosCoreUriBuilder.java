package arg.mps.seguros.broker.api.integration.ans.rest.service.core.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Component;

import arg.mps.seguros.broker.api.integration.ans.config.Configuration;

@Component
public class AnsServiciosCoreUriBuilder {

	private static String BASE_URL = Configuration.getInstance().getAnsRestServiceCoreUrlBase();
	private String servicePath;
	private List<NameValuePair> queryParams;
	
	public AnsServiciosCoreUriBuilder withServicePath(String servicePath) {
		this.servicePath = servicePath;
		return this;
	}
	
	public AnsServiciosCoreUriBuilder addParameter(final String param, final String value) {
        if (this.queryParams == null) {
            this.queryParams = new ArrayList<NameValuePair>();
        }
        this.queryParams.add(new BasicNameValuePair(param, value));
		
		return this;
	}
	
	public URI build() throws MalformedURLException, URISyntaxException {	
		URL ansURL = new URL(BASE_URL + servicePath);
		String protocol = ansURL.getProtocol();
		String host = ansURL.getHost();
		String path  = ansURL.getPath();	
		
		URIBuilder builder = new URIBuilder();
		builder
		.setScheme(protocol)
		.setHost(host)
		.setPath(path)
		.setParameters(queryParams);

		return builder.build();
	}
}
