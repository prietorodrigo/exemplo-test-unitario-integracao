/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package matematica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class NumerosTest {
    
    private Numeros x;
    
    public NumerosTest() {
        x = new Numeros();
    }
    
    @Test
    public void testNumeroPar() {
        assertEquals(true, x.numeroPar(8));
    }

    @Test
    public void testAreaQuadrado() {
        assertEquals(100, x.areaQuadrado(10));
    }

    @Test
    public void testNumeroDivisivel() {
        assertEquals(true, x.numeroDivisivel(4, 2));
    }
    
}
