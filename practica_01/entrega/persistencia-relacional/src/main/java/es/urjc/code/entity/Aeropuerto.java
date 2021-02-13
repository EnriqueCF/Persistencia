package es.urjc.code.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aeropuerto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String codigo;
	private String nombre;
	private String ciudad;
	private String pais;
	
	@OneToMany(mappedBy = "origen")
	private List<Vuelo> salidas;
	@OneToMany(mappedBy = "destino")
	private List<Vuelo> llegadas;

	@OneToMany(mappedBy = "aeropuerto")
	private List<Revision> revisiones;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param ciudad
	 * @param pais
	 */
	public Aeropuerto(String codigo, String nombre, String ciudad, String pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
	}
	/**
	 * 
	 */
	public Aeropuerto() {
		super();
	}
	/**
	 * @return the salidas
	 */
	public List<Vuelo> getSalidas() {
		return salidas;
	}
	/**
	 * @return the llegadas
	 */
	public List<Vuelo> getLlegadas() {
		return llegadas;
	}
	/**
	 * @return the revisiones
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}
	/**
	 * @param salidas the salidas to set
	 */
	public void setSalidas(List<Vuelo> salidas) {
		this.salidas = salidas;
	}
	/**
	 * @param llegadas the llegadas to set
	 */
	public void setLlegadas(List<Vuelo> llegadas) {
		this.llegadas = llegadas;
	}
	/**
	 * @param revisiones the revisiones to set
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aeropuerto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", pais="
				+ pais + "]";
	}
	
	
}
