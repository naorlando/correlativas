package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }


    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

}


