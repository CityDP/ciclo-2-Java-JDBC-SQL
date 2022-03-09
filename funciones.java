package hola.mundo;

import java.util.Scanner;

public class funciones { // 1. es la funcion principal, donde se puden crear otras funciones
  /** ejemplo de cuadrados
    public static double f (double x){
           return x*x; 
    } 
    public static void main (String[] args){  // 2.funcion principal main, En esta parte se realiza la lectura de los datos y el llamado a las funciones
        System.out.println(f(3));
    } 
  */
    /** ejemplo de cuadrados con input en java es sc.nextLine()
     public static double cuadrados(double numero){
            return numero*numero;
    }
    public static void main (String [] args){
     Scanner sc = new Scanner (System.in);
     System.out.println(" ingrese el numero:");
     double numero = Double.parseDouble(sc.nextLine());
     double f = cuadrados(numero);  /** 3.. se invoca la función
     System.out.println("el resultado es:" +f);
     }*/
    /** ejemplo de cuadrados usando MAth.pow, el pow es para potencia(base, potencia) 
    public static double cuadrados(double numero){
            return Math.pow(numero,2);
    }
    public static void main (String [] args){
     Scanner sc = new Scanner (System.in);
     System.out.println(" ingrese el numero:");
     double numero = Double.parseDouble(sc.nextLine());
     double f = cuadrados(numero);
     System.out.println("el resultado es:" +f);
     } */  
    /** otra forma de usar MAth.pow
    public static double cuadrados(double numero){
        double resultado =  Math.pow(numero,2);   
        return resultado;
    }
    public static void main (String [] args){
     Scanner sc = new Scanner (System.in);
     System.out.println(" ingrese el numero:");
     double numero = Double.parseDouble(sc.nextLine());
     double f = cuadrados(numero);
     System.out.println("el resultado es:" +f);
     } */
    
    /**public static double suma (double numero1, double numero2){
     double resultado = numero1+numero2;
     return resultado;
    }
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el numero 1:");
    double numero1 = Double.parseDouble(sc.nextLine()); 
    System.out.println("Ingrese el numero 2:");
    double numero2 = Double.parseDouble(sc.nextLine());
    double f = suma(numero1, numero2);
    System.out.println("resultado" +f);
    }*/
    /**area de un triangulo*/ 
    public static double area(double base, double altura){
     double area = (base*altura)/2;
     return area;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese la base:");
    double base = Double.parseDouble(sc.nextLine());
    System.out.println("ingrese la altura:");
    double altura = Double.parseDouble(sc.nextLine());
    double f = area(base, altura);
    System.out.println("resultado" +f);
            }
    
   }
