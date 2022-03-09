package hola.mundo;

import java.util.Scanner;

public class prueba {

    public static int[][] cuadrados_matriz(int[][] X) {
        int[][] Y = new int[X.length][X[0].length];
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                Y[i][j] = X[i][j] * X[i][j];
            }
        }
        return Y;
    }
}
