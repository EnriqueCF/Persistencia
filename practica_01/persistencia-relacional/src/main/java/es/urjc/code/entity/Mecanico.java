package es.urjc.code.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Mecanico extends Empleado{
	
	private String empresa;
	private Integer incorpracion;
	private String formacion;
	
	@OneToMany
	private List<Revision> revisiones;

	/**
	 * @param codigo
	 * @param nombre
	 * @param apellidos
	 * @param empresa
	 * @param incorpracion
	 * @param formacion
	 */
	public Mecanico(String codigo, String nombre, String apellidos, String empresa, Integer incorpracion,
			String formacion) {
		super(codigo, nombre, apellidos);
		this.empresa = empresa;
		this.incorpracion = incorpracion;
		this.formacion = formacion;
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @return the incorpracion
	 */
	public Integer getIncorpracion() {
		return incorpracion;
	}

	/**
	 * @return the formacion
	 */
	public String getFormacion() {
		return formacion;
	}

	/**
	 * @return the revisiones
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * @param incorpracion the incorpracion to set
	 */
	public void setIncorpracion(Integer incorpracion) {
		this.incorpracion = incorpracion;
	}

	/**
	 * @param formacion the formacion to set
	 */
	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	/**
	 * @param revisiones the revisiones to set
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}



	/**
	 * @param codigo
	 * @param nombre
	 * @param apellidos
	 */
	public Mecanico(String codigo, String nombre, String apellidos) {
		super(codigo, nombre, apellidos);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mecanico [empresa=" + empresa + ", incorpracion=" + incorpracion + ", formacion=" + formacion + "]";
	}
	
	
}
