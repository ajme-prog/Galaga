/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Alan
 */
public class ALANJOELMORATAYAESCOBAR_201700944 {

    @InjectMocks
    private AsignarHorario asignacionmock;
    @Mock
    private Carrera carreramock;
    @Mock
    private RegistroAcademico registromock;
    @Mock
    private Horario horariomock;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        asignacionmock = new AsignarHorario();
        registromock = new RegistroAcademico(2017, "00944");
        carreramock = new Carrera(1, "Medicina");
        horariomock = asignacionmock.generarHorario(carreramock, registromock);
    }

    /**
     * Test of generarHorario method, of class AsignarHorario.
     */
    @Test
    public void testgetdescripcion() throws Exception {
        System.out.println("En esta prueba se valida que la descripción no sea nula");
        String desc = null;
        assertNotSame(desc, horariomock.getDescripcion());
    }

    @Test
    public void testvalidarregistro() throws Exception {
        System.out.println("Se valida que el correalativo sea igual a 00944");
        String desc = "00944";
        assertEquals(desc, registromock.getCorrelativo());
    }

    @Test
    public void testvalidaranio() throws Exception {
        System.out.println("Se valida que el anio del registro academico sea diferente de 2014 ya que se seteo 2017");
        int anio = 2014;
        assertNotEquals(anio, registromock.getAnio());
    }
}
