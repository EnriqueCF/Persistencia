package es.urjc.code.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String codigo;
	private String nombre;
	private String apellidos;
}
