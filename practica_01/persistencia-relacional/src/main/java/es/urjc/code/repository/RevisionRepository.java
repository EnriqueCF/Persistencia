package es.urjc.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.urjc.code.entity.Revision;

@Repository
public interface RevisionRepository extends JpaRepository<Revision, Long>{

}
