package es.urjc.code.entity;

import javax.persistence.Entity;

@Entity
public class Mecanico extends Empleado{
	private String empresa;
	private Integer incorpracion;
	private String formacion;
}
