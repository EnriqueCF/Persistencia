package es.urjc.code.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String matricula;
	private String fabricante;
	private String modelo;
	private Double horas;
	
	@OneToMany(mappedBy = "", cascade = CascadeType.ALL)
	private List<Revision> revisiones;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Vuelo> vuelos;

	/**
	 * @param matricula
	 * @param fabricante
	 * @param modelo
	 * @param horas
	 */
	public Avion(String matricula, String fabricante, String modelo, Double horas) {
		super();
		this.matricula = matricula;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.horas = horas;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the horas
	 */
	public Double getHoras() {
		return horas;
	}

	/**
	 * @return the revisiones
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}

	/**
	 * @return the vuelos
	 */
	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(Double horas) {
		this.horas = horas;
	}

	/**
	 * @param revisiones the revisiones to set
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Avion [id=" + id + ", matricula=" + matricula + ", fabricante=" + fabricante + ", modelo=" + modelo
				+ ", horas=" + horas + "]";
	}
	
	
}
