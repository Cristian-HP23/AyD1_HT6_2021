/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 *
 * @author cristianhp
 */
public class CristianHerreraUedi {
        @Mock
    private Carrera carrera;
    @Mock
    private RegistroAcademico registro;
    @Mock
    private AsignarHorario asignarH;
  
    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    // MOCK 1
    @Test
    public void Mockverdescripcion(){
        when(asignarH.VerDescripcion()).thenReturn("hola");
        assertEquals("hola", asignarH.VerDescripcion());
    }
    // MOCK 2
    @Test
    public void Mockcodigohorario() throws Exception{
        when(registro.cheequearCarnet()).thenReturn(true);
        when(carrera.procesarCarrera()).thenReturn(2);
        when(registro.getAnio()).thenReturn(2022);
        
        asignarH =new AsignarHorario();
        assertEquals(140, asignarH.generarHorario(carrera,registro).getCodigoHorario());
    }
}
