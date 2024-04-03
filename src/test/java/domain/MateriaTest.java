package domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MateriaTest {

    @Test
    public void testeoMaterias(){

        Materia algoritmos = new Materia(1,"Algoritmos y Estructuras de Datos", new ArrayList<>());
        Materia paradigmas = new Materia(2,"Paradigmas de Programación", List.of(algoritmos));


        //CHEQUEO QUE PARADIGMAS SI TIENE CORRELATIVAS
        Assert.assertFalse(paradigmas.getCorrelativas().isEmpty());

        //CHEQUEO QUE ALGORITMOS NO TIENE
        Assert.assertTrue(algoritmos.getCorrelativas().isEmpty());
    }
}