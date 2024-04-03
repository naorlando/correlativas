package domain;

import java.util.List;

public class Materia {
    private Integer id_materia;
    private String nombre;
    private List<Materia> correlativas;


    public Materia(Integer id_materia, String nombre, List<Materia> correlativas) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
