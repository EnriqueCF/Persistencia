package es.urjc.code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long>{

	@Query("SELECT v FROM Vuelo v"
			+ " where v.destino.ciudad = ?1 "
			+ " and function('date_format', v.salida, '%y-%m-%d') = function('date_format', ?2, '%y-%m-%d')"
			+ " order by v.salida")
	List<Vuelo> findAllByCiudadDestinoAndFecha(String ciudad, String date);
}

// https://dev.mysql.com/doc/refman/8.0/en/date-and-time-functions.html#function_date-format