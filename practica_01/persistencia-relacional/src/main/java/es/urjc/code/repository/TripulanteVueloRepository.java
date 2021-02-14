package es.urjc.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.TripulanteVuelo;

@Repository
public interface TripulanteVueloRepository extends JpaRepository<TripulanteVuelo, Long>{

}
