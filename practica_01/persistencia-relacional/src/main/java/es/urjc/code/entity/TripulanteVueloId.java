package es.urjc.code.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TripulanteVueloId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long tripulanteId;
	private Long vueloId;
	
	/**
	 * @param tripulanteId
	 * @param vueloId
	 */
	public TripulanteVueloId(Long tripulanteId, Long vueloId) {
		super();
		this.tripulanteId = tripulanteId;
		this.vueloId = vueloId;
	}
	/**
	 * @return the tripulanteId
	 */
	public Long getTripulanteId() {
		return tripulanteId;
	}
	/**
	 * @return the vueloId
	 */
	public Long getVueloId() {
		return vueloId;
	}
	/**
	 * @param tripulanteId the tripulanteId to set
	 */
	public void setTripulanteId(Long tripulanteId) {
		this.tripulanteId = tripulanteId;
	}
	/**
	 * @param vueloId the vueloId to set
	 */
	public void setVueloId(Long vueloId) {
		this.vueloId = vueloId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("TripulanteVueloId [tripulanteId=%s, vueloId=%s]", tripulanteId, vueloId);
	}
	
	
	
}
