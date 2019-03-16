package arg.mps.seguros.broker.api;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Aseguradora {

	private int id;
	private String nombre;
	private String imagenRuta;

	public Aseguradora() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagenRuta() {
		return imagenRuta;
	}

	public void setImagenRuta(String imagenRuta) {
		this.imagenRuta = imagenRuta;
	}
	
	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }
}
