package arg.mps.seguros.broker.api;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ModeloAuto {
	private int id;
	private int idMarca;

	private String nombre;
	
	public ModeloAuto() {
		super();
	}
	
	public ModeloAuto(int id, int idMarca, String nombre) {
		this();
		this.id = id;
		this.idMarca = idMarca;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 @Override
	    public String toString() {
		 return ReflectionToStringBuilder.toString(this, 
		            ToStringStyle.MULTI_LINE_STYLE, true, true);
	 }	
}
