package es.urjc.code.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class TripulanteVuelo {

	@EmbeddedId
	private TripulanteVueloId id;

	@ManyToOne
	@MapsId("tripulanteId")
	private Tripulante tripulante;

	@ManyToOne
	@MapsId("vueloId")
	private Vuelo vuelo;

	/**
	 * @return the id
	 */
	public TripulanteVueloId getId() {
		return id;
	}

	/**
	 * @return the tripulante
	 */
	public Tripulante getTripulante() {
		return tripulante;
	}

	/**
	 * @return the vuelo
	 */
	public Vuelo getVuelo() {
		return vuelo;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(TripulanteVueloId id) {
		this.id = id;
	}

	/**
	 * @param tripulante the tripulante to set
	 */
	public void setTripulante(Tripulante tripulante) {
		this.tripulante = tripulante;
	}

	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	/**
	 * @param tripulante
	 * @param vuelo
	 */
	public TripulanteVuelo(Tripulante tripulante, Vuelo vuelo) {
		this.id = new TripulanteVueloId(tripulante.getId(), vuelo.getId());
		this.tripulante = tripulante;
		this.vuelo = vuelo;
	}

}
