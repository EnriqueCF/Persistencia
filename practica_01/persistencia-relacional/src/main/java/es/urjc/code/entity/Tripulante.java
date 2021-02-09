package es.urjc.code.entity;

import javax.persistence.Entity;

@Entity
public class Tripulante extends Empleado {
	private String puesto;
	private String compania;
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
}
