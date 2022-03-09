
package hola.mundo;
import java.util.Scanner;
public class cadenas {
    // leer el valor de una cadena de texto ingresada
    /**public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declarar el objeto e inicializa
        String miCadena = sc.nextLine(); // lee una cadena que yo ingreso
        System.out.println(miCadena); // Imprime la cadena leida
    }*/
    
    // determinar si las cadenas str1 y str2 son iguales
    /**public static void main(String args[]) {
        String a = "hola";
        String b = "hola";
        String c = "HOLA";
        System.out.println(a.equals(b)); // comparamos a con b
        System.out.println(a.equals(c)); // comparamos a con c
        System.out.println(a.equalsIgnoreCase(c)); // comparamos a con c ignorando la sensibilidad a mayusculas o minusculas
       }*/
    
    // ingresar y leer dos cadenas y compararlas
    /**public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declarar el objeto e inicializa
        String cadena1=sc.nextLine(); // lee cadena 1
        String cadena2= sc.nextLine(); // lee cadena 2
        System.out.println(cadena1.equals(cadena2)); // Imprime true o false
    }*/
    
    //Contenencia: saber si una cadena esta dontro de otra
    /**public static void main(String args[]) {
        String a = "hola Jorge";
        String b = "hola";
        System.out.println(b.contains(a));
        System.out.println(a.contains(b));
       }*/
    
    //Concatenación: operacion mediante la cual se unen multiples subcadenas de texto para formar una sola.
    /**public static void main(String args[]) {
        String a = "Hola";
        String b = "Mundo";
        System.out.println("¡" + a + " " + b + "!");
    } */
    
    // La longitud de Cadenas la obtenemos gracias al metodo length() de la clase String
    /**public static void main(String args[]) {
        String a = "Hola";
        String b = "Mundo";
        System.out.println("¡" + a + " " + b + "!");
        System.out.println(a.length());
        System.out.println(b.charAt(3));//extraer un caracter
    }*/
    
    // extraer parte de una cadena utilizando el metodo substring(inicio, fin) de la clase String
   /** public static void main(String args[]) {
     String s = "Programar es genial!";
     System.out.println(s.substring(10, s.length()));
    }*/
    
    //dividir una cadena dado una subcaden utilizando split(str1) de la clase String
    //leer el nombre de una persona, la edad y la estatura separados por espacio.
    /**public static void main(String args[]) {
     String s = "Juan 30 1.68";
     String[] line = s.split(" ");
     String nombre = line[0];
     int edad = Integer.parseInt(line[1]);
     double estatura = Double.parseDouble(line[2]);
     System.out.println("nombre: " + nombre);
     System.out.println("edad: " + edad);
     System.out.println("estatura: " + estatura + "m");
    } */
    
    //leer una cadena de texto y procesarla.
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     String[] line = s.split("&");
     String nombre = line[0];
     int edad = Integer.parseInt(line[1]);
     double estatura = Double.parseDouble(line[2]);
     System.out.println("nombre: " + nombre);
     System.out.println("edad: " + edad);
     System.out.println("estatura: " + estatura + "m");
     // ingrasa Ana Maria&40&1.65
     }
    
}

