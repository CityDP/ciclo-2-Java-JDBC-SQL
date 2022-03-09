
package hola.mundo;
import java.util.Scanner;
public class EstructuraCiclicas {
       public static void main (String[] args){
       //  ejemplo while, imprimir los # desde 0, mientras el # sea manor o igual a 6
       /**int i = 0;
       while (i<=6){
       System.out.println(i);
       i=i+1;}*/
       
       // imprimir todos los numeros, mientras i sea menor a j, iniciando i en 2 y j en 25
      /** int i = 2;
       int j =25;
       while (i<j){
         System.out.println(i + " , " + j);
         i = i * 2;
         j = j + 10;  
       }
       System.out.println("the end.");//nos muestra hasta donde se cumple la condición
       System.out.print(i + ", " + j);//nos mustra donde deja de cumplice la condició del while
         */
      
      // el minimo numero positivo de la maquina
     /**double Xo = 1.0;
        double Xi = Xo / 2.0;
        while (Xi > 0.0) {
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        System.out.println("Resultado: " + Xo);
        */
     
       // el minimo numero positivo de la maquina usando un ciclo hacer mientras  o do
       /**public static double minMaquina() {
           double Xo = 1.0;
           double Xi = Xo / 2;
           do {
            Xo = Xi;
            Xi = Xo / 2.0;
           } while (Xi > 0.0);
           return Xo;}  **/         
       
       //Desarrollar un programa que lea numeros enteros y los sume hasta que lea un cero (0).
       /**
        Scanner sc = new Scanner (System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un numero entero ");
            System.out.println("a sumar o 0 para salir: ");
            dato = Integer.parseInt(sc.nextLine());
            if (dato == 0) break;
            suma += dato;
        }
        System.out.println("La suma es: " + suma);*/
       
       //interrupcion de break 1
       /**
        Scanner sc = new Scanner (System.in);
        int dato = 0;
        int suma = 0;
        do {
            System.out.println("a sumar o 0 para salir: ");
            System.out.print("Ingrese un numero entero ");
            dato = Integer.parseInt(sc.nextLine());
            suma += dato;
        } while (dato != 0);
        System.out.println("La suma es: " + suma);
        */
       //interrupcion de break 2
       /**
       Scanner sc = new Scanner (System.in);
       int dato = 1;
       int suma = 0;
       while (dato != 0) {
           System.out.print("Ingrese un numero entero ");
           System.out.println("a sumar o 0 para salir: ");
           dato = Integer.parseInt(sc.nextLine());
           suma += dato;
       }
       System.out.println("La suma es: " + suma);*/
       
       
   }//corchete de main
}// corchete funcioon principal
