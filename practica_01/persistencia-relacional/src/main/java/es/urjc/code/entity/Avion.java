package es.urjc.code.entity;

import javax.persistence.Entity;

@Entity
public class Avion {
	private String matricula;
	private String fabricante;
	private String modelo;
	private Integer horas;
}
