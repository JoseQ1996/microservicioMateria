package ec.edu.ups.microservicioMateria.servicio;


import ec.edu.ups.microservicioMateria.entidades.Materia;
import ec.edu.ups.microservicioMateria.repositorio.MateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaServicio {

    @Autowired
    MateriaRepositorio materiaRepositorio;

    public void save(Materia materia){
        materiaRepositorio.save(materia);
    }

    public Optional<Materia> findbyCodigo(int codigo){
       return (Optional<Materia>) materiaRepositorio.findMateriaId(codigo);
    }


    public List<Materia> findAll(){
        return (List<Materia>) materiaRepositorio.findAll();
    }
}
