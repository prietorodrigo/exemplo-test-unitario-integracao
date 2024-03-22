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
public class TestNumeros2 {
    
    private Numeros x;
    public TestNumeros2() {
        x = new Numeros();
    }
    
    @Test
    public void testNumeroMaior() {
        assertEquals(true, x.numeroMaiorQue(5, 3));
    }
    
}
