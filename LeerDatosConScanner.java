
package hola.mundo; // ejemplo de la ley de gravitación
import java.util.Scanner; //1.  importamos la clase Scanner
public class LeerDatosConScanner {  //2. es la funcion principal, donde se puden crear otras funciones
   public static void main (String[] args){ // 3. definimos la funcion principal main
    Scanner sc = new Scanner (System.in); // 2.creamos la instancia del objeto Scanner, para la lectura de datos
    System.out.println("ingrese m1, m2, r:"); // 3. el usuario ingresa los datos
    /**int n = sc.nextInt();
    int m = n * 2;
    System.out.println("resultado:" +m);*/
    float m1 = sc.nextFloat();  /** 4. leer los datos, en este caso tipo float*/
    float m2 = sc.nextFloat();
    float r = sc.nextFloat();
    float g = 6.67384e-11f;
    float F = g*m1*m2/(r*r);
    System.out.println("resultado:" +F); /** 5. definimos la funcion para imprimir los datos*/
   } 
}


 /**
     * public static void main(String args[]) { int numeros [] ={6,8,9,4,3,6,8};
     * for(int i=0;i<7;i++){ System.out.println(numeros[i]); } }
     */
/**
 *
 * @author User
 */