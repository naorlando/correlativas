package domain;

public class Inscripcion {
    private Alumno alumno;
    private Materia materia;


    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada(){
        return alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas());
    }
}
