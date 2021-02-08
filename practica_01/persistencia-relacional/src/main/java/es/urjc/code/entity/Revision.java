package es.urjc.code.entity;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Revision {
	private Avion avion;
	private Date inicio;
	private Date fin;
	private Integer horas;
	private Mecanico mecanicoEncargado;
	private String tipoRevision;
	private String descripcion;
	private Aeropuerto aeropuerto;
}
