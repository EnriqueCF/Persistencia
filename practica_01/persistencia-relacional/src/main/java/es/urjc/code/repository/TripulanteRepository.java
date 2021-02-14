package es.urjc.code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Tripulante;

@Repository
public interface TripulanteRepository extends JpaRepository<Tripulante, Long>{

	@Query("select T from Tripulante T where T.codigo = ?1")
	Tripulante findByCodigo(String codigo);
	
	List<CiudadFechaDTO> despeguesFecha(Long id);
}
