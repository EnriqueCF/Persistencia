package es.urjc.code.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Vuelo {
	private String codigo;
	private String compania;
	private Avion avion;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private Date salida;
	private float duracion;
	private List<Tripulante> tripulacion;
}
