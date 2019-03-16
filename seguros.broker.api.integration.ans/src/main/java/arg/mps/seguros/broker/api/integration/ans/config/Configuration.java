package arg.mps.seguros.broker.api.integration.ans.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	private static String CONFIG_FILE_NAME = "config.properties";
	
	private static String KEY_ANS_COTIZACION_SERVICE_URL = "ans.cotizacion.service.url";
	private static String KEY_ANS_COTIZACION_SERVICE_TIMEOUT = "ans.cotizacion.service.timeout";
	
	private static String KEY_ANS_EMISION_SERVICE_URL = "ans.emision.service.url";
	private static String KEY_ANS_EMISION_SERVICE_TIMEOUT = "ans.emision.service.timeout";
	
	private static String KEY_ANS_SERVICE_AUTHHEADER_USERNAME = "ans.service.authheader.username";
	private static String KEY_ANS_SERVICE_AUTHHEADER_PASSWORD = "ans.service.authheader.password";
	
	private static String KEY_ANS_REST_SERVICE_CORE_URL_BASE = "ans.rest.service.core.baseurl";
	
	private static Configuration instance = null;
	private Properties config;

	private Configuration() {
		config = new Properties();
		try {
			InputStream  inputStream = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE_NAME);
			if (inputStream != null) {
				config.load(inputStream);				
			}else {
				throw new FileNotFoundException("El archivo de propiedades '" + CONFIG_FILE_NAME + "' no fue encontrado en el classpath");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Configuration getInstance() {
		if (instance == null) {
			instance = new Configuration();
		}
		return instance;
	}

	public String getPropiedad(String clave) {
		return config.getProperty(clave);
	}
	
	public String getAnsCotizacionServiceUrl() {
		return config.getProperty(KEY_ANS_COTIZACION_SERVICE_URL);
	}
	
	public String getAnsCotizacionServiceTimeout() {
		return config.getProperty(KEY_ANS_COTIZACION_SERVICE_TIMEOUT);
	}
	
	public String getAnsEmisionServiceUrl() {
		return config.getProperty(KEY_ANS_EMISION_SERVICE_URL);
	}
	
	public String getAnsEmisionServiceTimeout() {
		return config.getProperty(KEY_ANS_EMISION_SERVICE_TIMEOUT);
	}
	
	public String getAnsServiceAuthHeaderUsername() {
		return config.getProperty(KEY_ANS_SERVICE_AUTHHEADER_USERNAME);
	}
	
	public String getAnsServiceAuthHeaderPassword() {
		return config.getProperty(KEY_ANS_SERVICE_AUTHHEADER_PASSWORD);
	}	
	
	public String getAnsRestServiceCoreUrlBase() {
		return config.getProperty(KEY_ANS_REST_SERVICE_CORE_URL_BASE);
	}	
}
