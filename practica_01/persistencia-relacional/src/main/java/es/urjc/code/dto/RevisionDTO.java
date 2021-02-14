package es.urjc.code.dto;

public class RevisionDTO {
	private String matricula;
	private String nombre;
	private String apellidos;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @param matricula
	 * @param nombre
	 * @param apellidos
	 */
	public RevisionDTO(String matricula, String nombre, String apellidos) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public RevisionDTO() {}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Revision [matricula=" + matricula + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
}
