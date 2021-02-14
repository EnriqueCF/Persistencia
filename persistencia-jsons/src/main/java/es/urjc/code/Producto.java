package es.urjc.code;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // El objeto JSON se maneja como String en la entidad
    private String datos;


    public Producto() {
    }

    public Producto(String datos) {
        this.datos = datos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", datos='" + datos + '\'' +
                '}';
    }
}
