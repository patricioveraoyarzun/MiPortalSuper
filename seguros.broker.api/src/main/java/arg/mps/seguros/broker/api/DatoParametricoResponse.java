package arg.mps.seguros.broker.api;

import java.util.ArrayList;
import java.util.List;

public class DatoParametricoResponse<T> extends MPSEvent{
	private List<T> datos = new ArrayList<>();

	public DatoParametricoResponse() {
		super();
	}

	public List<T> getDatos() {
		return datos;
	}

	public void setDatos(List<T> datos) {
		this.datos = datos;
	} 	
}
