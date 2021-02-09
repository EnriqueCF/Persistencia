package es.urjc.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Avion;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Long>{

}
