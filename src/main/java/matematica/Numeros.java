/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematica;

/**
 *
 * @author user
 */
public class Numeros {
    public static boolean numeroPar (int n) {
        return n%2 == 0;
    }
    
    public static int areaQuadrado (int n) {
        return n * n;
    }
    
    public static boolean numeroDivisivel (int dividendo, int divisor) {
        return dividendo % divisor == 0;
    }
    
    public static boolean numeroMaiorQue (int x, int y) {
        return x > y;
    }
}
