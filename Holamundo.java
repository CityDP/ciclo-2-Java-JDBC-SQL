/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

public class Holamundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Mision tic 2022");
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        while (Xi > 0.0) {
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        System.out.println("Resultado: " + Xo);
}
}
