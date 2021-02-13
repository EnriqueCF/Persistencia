package es.urjc.code.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Tripulante extends Empleado {
	private String puesto;
	private String compania;
	
	@OneToMany(mappedBy="tripulante", cascade = CascadeType.ALL)
	private List<TripulanteVuelo> vuelos;
	
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"Tripulante [puesto=%s, compania=%s, getId()=%s, getCodigo()=%s, getNombre()=%s, getApellidos()=%s]",
				puesto, compania, getId(), getCodigo(), getNombre(), getApellidos());
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param apellidos
	 * @param puesto
	 * @param compania
	 */
	public Tripulante(String codigo, String nombre, String apellidos, String puesto, String compania) {
		super(codigo, nombre, apellidos);
		this.puesto = puesto;
		this.compania = compania;
	}
	/**
	 * @return the vuelos
	 */
	public List<TripulanteVuelo> getVuelos() {
		return vuelos;
	}
	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(List<TripulanteVuelo> vuelos) {
		this.vuelos = vuelos;
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param apellidos
	 */
	public Tripulante(String codigo, String nombre, String apellidos) {
		super(codigo, nombre, apellidos);
	}
	
	public Tripulante() {
		super();
	}
	
	
}
