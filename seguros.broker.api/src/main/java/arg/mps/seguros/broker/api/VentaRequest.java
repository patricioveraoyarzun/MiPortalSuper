package arg.mps.seguros.broker.api;

public class VentaRequest extends MPSEvent {
	
	private Aseguradora seguro;

	public Aseguradora getSeguro() {
		return seguro;
	}

	public void setSeguro(Aseguradora seguro) {
		this.seguro = seguro;
	}
	
	
}
