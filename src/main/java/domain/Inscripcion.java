package domain;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;


    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }

    public boolean aprobada() {
        for (Materia materia : materias) {
            if (!alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas())) {
                return false;
            }
        }
        return true;
    }
}
