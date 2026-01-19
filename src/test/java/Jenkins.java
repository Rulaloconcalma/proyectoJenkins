/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import static com.mycompany.projectojenkins.ProjectoJenkins.dia_laboral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pacuc
 */
public class Jenkins {
    
    public Jenkins() {
    }
    @Test
    public void pruebalunes() {
        assertEquals(dia_laboral("Lunes"), true);
    }

    @Test
    public void pruebamartes() {
        assertEquals(dia_laboral("Martes"), true);
    }

    @Test
    public void pruebamiercoles() {
        assertEquals(dia_laboral("Miercoles"), true);
    }

    @Test
    public void pruebaJueves() {
        assertEquals(dia_laboral("Jueves"), true);
    }

    @Test
    public void pruebaViernes() {
        assertEquals(dia_laboral("Viernes"), true);
    }

    @Test
    public void pruebaSabado() {
        assertEquals(dia_laboral("Sabado"), false);
    }

    @Test
    public void pruebaDomingo() {
        assertEquals(dia_laboral("Domingo"), false);
    }

    @Test
    public void pruebaDefault() {
        assertEquals(dia_laboral("Junio"), false);
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    }
}
