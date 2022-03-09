package hola.mundo;

import java.util.Scanner;

public class condicionales {

    /**forma 1 - varios bloques 
     * public static void main (String [] args){
     * Scanner sc = new Scanner (System.in); System.out.println(" ingrese el
     * numero:"); double numero = Double.parseDouble(sc.nextLine());
     * if(numero<0){ numero=-numero; }else{ numero= numero;}
     * System.out.println("el resultado es:" +numero);}
     */
    /**
     * forma 2 - sin usar el else public static void main (String [] args){
     * Scanner sc = new Scanner (System.in); System.out.println(" ingrese el
     * numero:"); double numero = Double.parseDouble(sc.nextLine());
     * if(numero<0){ numero=-numero; } System.out.println("el resultado es:"
     * +numero);}
     */
    /**
     * forma 3 usar el if, pero con el operador condicional ternario que es
     * representado por el simbolode pregunta ?
     */
    
    /* public static void main (String [] args){ 
      Scanner sc = new Scanner (System.in); 
      System.out.println(" ingrese el numero:"); 
      double numero = Double.parseDouble(sc.nextLine()); 
      numero = numero<0?-numero:numero; // pregunta si el numero es menos que 0, si si lo multiplica por - para volverlo positivo, si no lo muestra como es 
      System.out.println("el resultado es:" +numero);}
     */

    /**public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        } else {
            valor = -x;
        }
        return valor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.print("Ingrese un numero x: ");
        x = sc.nextDouble();
        System.out.println("El valor absoluto de "
                + x + " es " + valorAbsoluto(x));
    }*/
    
    public static void main (String[] args){
    /** // mayor entre dos numeros
    double a = 5;
    double b =14 ;
    if (a>b){
        System.out.println(" el numero mayor es:" +a );
    }else{
        System.out.println(" el numero mayor es:" +b );
    }*/
    /** // mayor entre dos numeros con lectura de datos
    Scanner sc = new Scanner (System.in);
    System.out.println("Ingrese el numero 1:");
    double numero1 = Double.parseDouble(sc.nextLine());
    System.out.println("ingrese el numero 2");
    double numero2 = Double.parseDouble(sc.nextLine());
    if (numero1>numero2){
        System.out.println(" el numero mayor es:" +numero1 );
    }else{
        System.out.println(" el numero mayor es:" +numero2 );
    } */
    
    }
}
