package ec.edu.ups.microservicioMateria.entidades.peticiones;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrarMateria {

    @JsonProperty
    private String nombre;

    @JsonProperty
    private String descripcion;

    @JsonProperty
    private int horas;

    @JsonProperty
    private int cupoMaximo;

    @JsonProperty
    private String profesor;

    @JsonProperty
    private int level;

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
}
