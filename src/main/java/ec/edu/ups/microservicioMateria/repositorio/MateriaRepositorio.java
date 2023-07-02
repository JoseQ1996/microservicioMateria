package ec.edu.ups.microservicioMateria.repositorio;

import ec.edu.ups.microservicioMateria.entidades.Materia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MateriaRepositorio extends CrudRepository<Materia,Integer> {

    @Query("select m from Materia m where m.idMateria = :codigo")
    Optional<Materia> findMateriaId(int codigo);
}
