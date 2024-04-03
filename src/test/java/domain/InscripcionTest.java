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



        Alumno nahuel = new Alumno("Nahuel");
        Alumno juan = new Alumno("Juan");

        nahuel.agregarMateriaAprobada(algoritmos);
        nahuel.agregarMateriaAprobada(paradigmas);
        juan.agregarMateriaAprobada(algoritmos);

        Inscripcion inscripcion = new Inscripcion(nahuel,disenoSist);
        Inscripcion inscripcion1 = new Inscripcion(juan,disenoSist);


        //TESTEO NAHUEL SI CUMPLE CON LAS CORRELATIVAS
        Assert.assertTrue(inscripcion.aprobada());

        //TESTEO JUAN NO CUMPLE CON LAS CORRELATIVAS
        Assert.assertFalse(inscripcion1.aprobada());

    }
}
