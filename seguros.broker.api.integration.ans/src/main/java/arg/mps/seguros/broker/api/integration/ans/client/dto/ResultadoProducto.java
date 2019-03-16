package arg.mps.seguros.broker.api.integration.ans.client.dto;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoProducto {
	@JsonProperty("ProductoID")
	private String productoID;
	@JsonProperty("Version")
	private Integer version;
	@JsonProperty("Nombre")
	private String nombre;
	@JsonProperty("AgrupacionID")
	private Integer agrupacionID;
	@JsonProperty("Agrupacion")
	private Agrupacion agrupacion;
	@JsonProperty("SubAgrupacionID")
	private Integer subAgrupacionID;
	@JsonProperty("SubAgrupacion")
	private SubAgrupacion subAgrupacion;
	@JsonProperty("Orden")
	private Integer orden;
	@JsonProperty("CanalID")
	private Integer canalID;
	@JsonProperty("Canal")
	private Canal canal;
	@JsonProperty("Deducibles")
	private List<Deducible> deducibles = null;
	@JsonProperty("Companias")
	private List<Compania> companias = null;

	public ResultadoProducto() {
		super();
	}

	public ResultadoProducto(String productoID, Integer version, String nombre, Integer agrupacionID,
			Agrupacion agrupacion, Integer subAgrupacionID, SubAgrupacion subAgrupacion, Integer orden, Integer canalID,
			Canal canal, List<Deducible> deducibles, List<Compania> companias) {
		this();
		this.productoID = productoID;
		this.version = version;
		this.nombre = nombre;
		this.agrupacionID = agrupacionID;
		this.agrupacion = agrupacion;
		this.subAgrupacionID = subAgrupacionID;
		this.subAgrupacion = subAgrupacion;
		this.orden = orden;
		this.canalID = canalID;
		this.canal = canal;
		this.deducibles = deducibles;
		this.companias = companias;
	}

	public String getProductoID() {
		return productoID;
	}

	public void setProductoID(String productoID) {
		this.productoID = productoID;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAgrupacionID() {
		return agrupacionID;
	}

	public void setAgrupacionID(Integer agrupacionID) {
		this.agrupacionID = agrupacionID;
	}

	public Agrupacion getAgrupacion() {
		return agrupacion;
	}

	public void setAgrupacion(Agrupacion agrupacion) {
		this.agrupacion = agrupacion;
	}

	public Integer getSubAgrupacionID() {
		return subAgrupacionID;
	}

	public void setSubAgrupacionID(Integer subAgrupacionID) {
		this.subAgrupacionID = subAgrupacionID;
	}

	public SubAgrupacion getSubAgrupacion() {
		return subAgrupacion;
	}

	public void setSubAgrupacion(SubAgrupacion subAgrupacion) {
		this.subAgrupacion = subAgrupacion;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public Integer getCanalID() {
		return canalID;
	}

	public void setCanalID(Integer canalID) {
		this.canalID = canalID;
	}

	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public List<Deducible> getDeducibles() {
		return deducibles;
	}

	public void setDeducibles(List<Deducible> deducibles) {
		this.deducibles = deducibles;
	}

	public List<Compania> getCompanias() {
		return companias;
	}

	public void setCompanias(List<Compania> companias) {
		this.companias = companias;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}	
}
