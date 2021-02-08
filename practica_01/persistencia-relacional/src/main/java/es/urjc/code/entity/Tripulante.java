package es.urjc.code.entity;

import javax.persistence.Entity;

@Entity
public class Tripulante extends Empleado {
	private String puesto;
	private String compania;
}
