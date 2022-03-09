package hola.mundo;
import java.util.Scanner;
public class Matrices {
     //forma manual
    /**public static void main(String args[]) {  
        int matriz [][] ={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){ // numero de filas
            for (int j=0; j<3;j++){ // numero de columnas
            System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        } 
     } */

     //forma manual 2
   /** public static void main(String args[]) {  
        int numeros [][] = new int [2][2];
        
        numeros [0][0]=5;
        numeros [0][1]=2;
        numeros [1][0]=2;
        numeros [1][1]=5;
        
        System.out.print("["+numeros [0][0]+"]");
        System.out.println("["+numeros [0][1]+"]"); //ponemos elln paraqe de el salto de linea
        System.out.print("["+numeros [1][0]+"]");
        System.out.print("["+numeros [1][1]+"]");
        }*/
    
    // el usuario define la dimension de la mariz y el programa el llenado automatico
     // prueba: filas 3, columnas 3, contador 1
     public static void main(String args[]) { 
         int filas=0, columnas=0, contador=1;
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("¿Cuantas filas deseas?");
         filas = entrada.nextInt();
         System.out.println("¿Cuantas columnas deseas?");
         columnas = entrada.nextInt();
         
         int numeros [][]= new int[filas][columnas]; //creamos la matriz
         for(int j=0; j<filas; j++){
          for(int i=0; i<columnas; i++){
              numeros[j][i]= contador;//gurada la variable contador
              contador++; // inncremenet a variable en 1 y guarda
              System.out.print("["+numeros [j][i]+"]");
          }
          System.out.println("");
         }
         
     }
}
