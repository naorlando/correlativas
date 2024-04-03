package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AlumnoTest {

    @Test
    public void testAlumno(){



        Alumno nahuel = new Alumno("Nahuel");
        Alumno juan = new Alumno("Juan");
        Alumno martin = new Alumno("Martin");

        Materia algoritmos = new Materia(1,"Algoritmos y Estructuras de Datos", new ArrayList<>());
        Materia paradigmas = new Materia(2,"Paradigmas de Programación", List.of(algoritmos));

        nahuel.agregarMateriaAprobada(algoritmos);
        nahuel.agregarMateriaAprobada(paradigmas);

        juan.agregarMateriaAprobada(algoritmos);

        //TESTEO MARTIN NO TIENE MATERIAS APROBADAS
        Assert.assertTrue(martin.getMateriasAprobadas().isEmpty());

        //TESTEO JUAN TIENE 1 MATERIA APROBADA
        Assert.assertEquals(1,juan.getMateriasAprobadas().size());

        //TESTEO NAHUEL TIENE 2 MATERIAS APROBADAS
        Assert.assertEquals(2,nahuel.getMateriasAprobadas().size());

    }
}
