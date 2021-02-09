package es.urjc.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long>{

}
