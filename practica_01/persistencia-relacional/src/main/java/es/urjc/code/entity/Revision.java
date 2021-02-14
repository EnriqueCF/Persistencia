package es.urjc.code.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Revision {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Avion avion;
	private Date inicio;
	private Date fin;
	private Integer horas;
	@ManyToOne
	private Mecanico mecanicoEncargado;
	private String tipoRevision;
	private String descripcion;
	@ManyToOne
	private Aeropuerto aeropuerto;

	/**
	 * @param avion
	 * @param inicio
	 * @param fin
	 * @param horas
	 * @param mecanicoEncargado
	 * @param tipoRevision
	 * @param descripcion
	 * @param aeropuerto
	 */
	public Revision(Avion avion, Date inicio, Date fin, Integer horas, Mecanico mecanicoEncargado, String tipoRevision,
			String descripcion, Aeropuerto aeropuerto) {
		super();
		this.avion = avion;
		this.inicio = inicio;
		this.fin = fin;
		this.horas = horas;
		this.mecanicoEncargado = mecanicoEncargado;
		this.tipoRevision = tipoRevision;
		this.descripcion = descripcion;
		this.aeropuerto = aeropuerto;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the avion
	 */
	public Avion getAvion() {
		return avion;
	}

	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @return the horas
	 */
	public Integer getHoras() {
		return horas;
	}

	/**
	 * @return the mecanicoEncargado
	 */
	public Mecanico getMecanicoEncargado() {
		return mecanicoEncargado;
	}

	/**
	 * @return the tipoRevision
	 */
	public String getTipoRevision() {
		return tipoRevision;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return the aeropuerto
	 */
	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param avion the avion to set
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	/**
	 * @param mecanicoEncargado the mecanicoEncargado to set
	 */
	public void setMecanicoEncargado(Mecanico mecanicoEncargado) {
		this.mecanicoEncargado = mecanicoEncargado;
	}

	/**
	 * @param tipoRevision the tipoRevision to set
	 */
	public void setTipoRevision(String tipoRevision) {
		this.tipoRevision = tipoRevision;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param aeropuerto the aeropuerto to set
	 */
	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Revision [id=" + id + ", matricula avion=" + avion.getMatricula() + ", inicio=" + inicio + ", fin=" + fin + ", horas=" + horas
				+ ", mecanico encargado=" + mecanicoEncargado.getCodigo() + ", tipo revision=" + tipoRevision + ", descripcion="
				+ descripcion + ", código aeropuerto=" + aeropuerto.getCodigo() + "]";
	}

	/**
	 * 
	 */
	public Revision() {
		super();
	}
	
	
}
