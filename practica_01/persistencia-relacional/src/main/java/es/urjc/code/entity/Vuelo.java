package es.urjc.code.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String codigo;
	private String compania;

	@ManyToOne
	private Avion avion;
	@ManyToOne
	private Aeropuerto origen;
	@ManyToOne
	private Aeropuerto destino;

	@Temporal(TemporalType.TIMESTAMP)
	private Date salida;
	private Double duracion;

	@OneToMany(mappedBy = "vuelo", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<TripulanteVuelo> tripulacion;

	/**
	 * @param codigo
	 * @param compania
	 * @param avion
	 * @param origen
	 * @param destino
	 * @param salida
	 * @param duracion
	 */
	public Vuelo(String codigo, String compania, Avion avion, Aeropuerto origen, Aeropuerto destino, Date salida,
			Double duracion) {
		super();
		this.codigo = codigo;
		this.compania = compania;
		this.avion = avion;
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.duracion = duracion;
	}

	/**
	 * 
	 */
	public Vuelo() {
		super();
	}

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
	 * @return the compania
	 */
	public String getCompania() {
		return compania;
	}

	/**
	 * @return the avion
	 */
	public Avion getAvion() {
		return avion;
	}

	/**
	 * @return the origen
	 */
	public Aeropuerto getOrigen() {
		return origen;
	}

	/**
	 * @return the destino
	 */
	public Aeropuerto getDestino() {
		return destino;
	}

	/**
	 * @return the salida
	 */
	public Date getSalida() {
		return salida;
	}

	/**
	 * @return the duracion
	 */
	public Double getDuracion() {
		return duracion;
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
	 * @param compania the compania to set
	 */
	public void setCompania(String compania) {
		this.compania = compania;
	}

	/**
	 * @param avion the avion to set
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}

	/**
	 * @param salida the salida to set
	 */
	public void setSalida(Date salida) {
		this.salida = salida;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the tripulacion
	 */
	public List<TripulanteVuelo> getTripulacion() {
		return tripulacion;
	}

	/**
	 * @param tripulacion the tripulacion to set
	 */
	public void setTripulacion(List<TripulanteVuelo> tripulacion) {
		this.tripulacion = tripulacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", codigo=" + codigo + ", compania=" + compania + ", matricula avion=" + avion.getMatricula() + ", origen="
				+ origen.getCodigo() + ", destino=" + destino.getCodigo() + ", salida=" + salida + ", duracion=" + duracion + "]";
	}

	
}
