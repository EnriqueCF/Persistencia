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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tripulante [puesto=" + puesto + ", compania=" + compania + ", " + super.toString() + "]";
	}
	
	
}
