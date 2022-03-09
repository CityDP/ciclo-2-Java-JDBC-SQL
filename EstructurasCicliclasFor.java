
package hola.mundo;
import java.util.Scanner;
// estructura for (<inicia>; <cond>; <actualiza>) {<bloque>}
public class EstructurasCicliclasFor {
//calcular la suma de los primeros numeros naturales positivos
/**   public static int suma(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
        return s;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese el valor de n: ");
       int n = sc.nextInt();
       System.out.print("La suma de los primeros " + n + " numeros naturales es: ");
       System.out.print(suma(n));
       }*/
    //
    /**public static void main(String[] args){
        for(int i = 0, j = 10; i <= j; i++, j--){
            System.out.println(i + ", " + j);
        }
      }*/
    // finalizacion de un ciclo for
   /** public static void main(String[] args){
    for (int i = 0; i <= 30; i++) {
        if (i == 4) {
            break;
        }
        System.out.println(i);
    }
    }*/
    // Dado el arreglo ["Tomate de arbol", "Maracuya ", "Guayaba"]
    //un programa que permite imprimir todos sus elementos
   /** public static void main(String[] args){
        String[] frutas = new String[]{"Tomate de arbol", "Maracuya ", "Guayaba"};
        for(String f:frutas) { // para cada elemento f en la lista
            System.out.println(f);
        }
    }*/
    // Dada la lista de frutas ["Pera", "Maracuya ", "Guayaba", "Lulo", "Granadilla"]
    //imprimir sus elementos hasta encontrar la fruta "Lulo".
    /**public static void main(String[] args){
        String[] frutas = new String[]{"Pera", "Maracuya ", "Guayaba", "Lulo", "Granadilla"};
        for(String f:frutas) { // para cada elemento f en la lista de frutas
            System.out.println(f);
            if (f.equals("Lulo")){
                  break;
            }
                    }
    }*/
    
}



