package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {

    @Test
    public void inscripcionSinCorrelativas(){

        Materia algoritmos = new Materia(1,"Algoritmos y Estructuras de Datos", new ArrayList<>());
        Materia paradigmas = new Materia(2,"Paradigmas de Programación", List.of(algoritmos));
        Materia disenoSist = new Materia(3,"Diseño de Sistemas", List.of(paradigmas));
        Materia analisis1 = new Materia(4,"Analisis Matematico 1",new ArrayList<>());
        Materia analisis2 = new Materia(5,"Analisis Matematico 2", List.of(analisis1));



        Alumno nahuel = new Alumno("Nahuel");
        Alumno juan = new Alumno("Juan");

        nahuel.agregarMateriaAprobada(algoritmos);
        nahuel.agregarMateriaAprobada(paradigmas);
        nahuel.agregarMateriaAprobada(analisis1);

        juan.agregarMateriaAprobada(analisis1);
        juan.agregarMateriaAprobada(algoritmos);

        Inscripcion inscripcion = new Inscripcion(nahuel);

        inscripcion.agregarMateria(disenoSist);
        inscripcion.agregarMateria(analisis2);

        Inscripcion inscripcion1 = new Inscripcion(juan);

        inscripcion1.agregarMateria(analisis2);
        inscripcion1.agregarMateria(disenoSist);


        //TESTEO NAHUEL SI CUMPLE CON LAS CORRELATIVAS
        Assert.assertTrue(inscripcion.aprobada());

        //TESTEO QUE JUAN NO CUMPLE CON LAS CORRELATIVAS
        Assert.assertFalse(inscripcion1.aprobada());



    }
}
