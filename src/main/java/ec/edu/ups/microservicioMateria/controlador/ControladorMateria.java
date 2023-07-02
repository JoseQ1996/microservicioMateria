package ec.edu.ups.microservicioMateria.controlador;



import ec.edu.ups.microservicioMateria.entidades.Materia;
import ec.edu.ups.microservicioMateria.entidades.peticiones.ModificarMateria;
import ec.edu.ups.microservicioMateria.entidades.peticiones.RegistrarMateria;
import ec.edu.ups.microservicioMateria.servicio.MateriaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class ControladorMateria {


    private MateriaServicio materiaServicio;

    @Autowired
    public void setMateriaServicio(MateriaServicio materiaServicio) {
        this.materiaServicio = materiaServicio;
    }



    @PostMapping("/materia/registrar")
    public ResponseEntity<Materia> createMateria(@RequestBody RegistrarMateria registrarMateria){
            Materia mat=new Materia();
            mat.setNombre(registrarMateria.getNombre());
            mat.setDescripcion(registrarMateria.getDescripcion());
            mat.setHoras(registrarMateria.getHoras());
            mat.setCupoMaximo(registrarMateria.getCupoMaximo());
            mat.setProfesor(registrarMateria.getProfesor());
            mat.setLevel(registrarMateria.getLevel());

            System.out.println(mat);
           materiaServicio.save(mat);
            return new ResponseEntity<Materia>(mat, HttpStatus.OK);


    }
    @PutMapping("/materia/edit")
    public ResponseEntity <Materia> updatePersona(@RequestBody ModificarMateria modificarMateria) {
        Optional<Materia> materiaOptional = this.materiaServicio.findbyCodigo(modificarMateria.getIdMateria());
        if(materiaOptional.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        else {
            Materia mate=materiaOptional.get();
            mate.setNombre(modificarMateria.getNombre());
            mate.setDescripcion(modificarMateria.getDescripcion());
            mate.setHoras(modificarMateria.getHoras());
            mate.setCupoMaximo(modificarMateria.getCuposMaximos());
            mate.setProfesor(modificarMateria.getProfesor());
            mate.setLevel(modificarMateria.getLevel());
            this.materiaServicio.save(mate);
            return ResponseEntity.ok(mate);
        }
    }
    @GetMapping("/materias")
    public ResponseEntity<List<Materia>> getAllPersona(){

        List<Materia> listamaterias=materiaServicio.findAll();

        return new ResponseEntity<List<Materia>>(listamaterias, HttpStatus.OK);
    }

    @GetMapping("/materia/{id}")
    public ResponseEntity<Materia> getPersona(@PathVariable int id){

        Optional<Materia> usu=materiaServicio.findbyCodigo(id);

        return new ResponseEntity <Materia>(usu.get(), HttpStatus.OK);
    }

}
