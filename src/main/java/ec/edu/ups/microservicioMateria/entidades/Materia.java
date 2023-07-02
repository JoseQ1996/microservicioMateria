package ec.edu.ups.microservicioMateria.entidades;
import jakarta.persistence.*;

import java.util.Date;

/**
 *
 * @author Jose Guillermo Quinde
 */
@Entity
@Table(name = "materia")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMateria;

    private String nombre;

    private String descripcion;

    private int horas;

    private int cupoMaximo;

    private String profesor;

    private int level;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, String descripcion, int horas, int cupoMaximo, String profesor, int level) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.cupoMaximo = cupoMaximo;
        this.profesor = profesor;
        this.level = level;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "idMateria=" + idMateria +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", horas=" + horas +
                ", cupoMaximo=" + cupoMaximo +
                ", profesor='" + profesor + '\'' +
                ", level=" + level +
                '}';
    }
}
