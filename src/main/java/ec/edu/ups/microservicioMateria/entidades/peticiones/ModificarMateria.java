package ec.edu.ups.microservicioMateria.entidades.peticiones;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModificarMateria {
    @JsonProperty
    private int idMateria;
    @JsonProperty
    private String nombre;

    @JsonProperty
    private String descripcion;

    @JsonProperty
    private int horas;

    @JsonProperty
    private int cuposMaximos;

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

    public int getCuposMaximos() {
        return cuposMaximos;
    }

    public void setCuposMaximos(int cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
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

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
}
