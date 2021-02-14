package es.urjc.code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import es.urjc.code.dto.RevisionDTO;
import es.urjc.code.entity.Revision;

@Repository
public interface RevisionRepository extends JpaRepository<Revision, Long>{

	@Query("select new es.urjc.code.dto.RevisionDTO(R.avion.matricula, R.mecanicoEncargado.nombre, R.mecanicoEncargado.apellidos) "
			+ "from Revision R "
			+ "order by R.avion.matricula")
	List<RevisionDTO> findAllOrderByMecanicoAndAvion();

}
