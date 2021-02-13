package es.urjc.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Tripulante;

@Repository
public interface TripulanteRepository extends JpaRepository<Tripulante, Long>{

}
