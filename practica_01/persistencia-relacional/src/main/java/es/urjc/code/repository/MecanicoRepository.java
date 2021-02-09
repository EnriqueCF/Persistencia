package es.urjc.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Mecanico;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanico, Long>{

}
