package hola.mundo;

import java.util.Scanner;

public class Arreglos {

    // forma 1: llenar un vector
    /**
     * public static void main(String args[]) { 
     * int[] numeros = new int[5];
     * numeros[0]=1; numeros[1]=2; numeros[2]=3; numeros[3]=4; numeros[4]=5;
     * System.out.println(numeros[3]);// lo usamos para arreglos pequeños //
     * usamo for para arregles grandes, el iterador debe iniciar en 0 // y debe
     * llegar a un valor antes d ela ultima posicion for(int i=0;i<5;i++){
     * System.out.println(numeros[i]); } }
     */
    // forma 2: poner todos los elementos dentro de llaves
    /**
     * public static void main(String args[]) { int numeros [] ={6,8,9,4,3,6,8};
     * for(int i=0;i<7;i++){ System.out.println(numeros[i]); } }
     */
    //bucle for each
    /**
     * public static void main(String args[]) { int numeros [] ={6,8,9,4,3,6,8};
     * for(int i: numeros){ System.out.println("numero:"+i); } }
     */
    
   //leer 5 numeros,guardarlso en una rregl y sacar la media delos numeros positivos
    //la media de los negativos y el numero de ceros
    /** public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     float numeros []= new float [5];
     float suma_positivos=0, suma_negativos=0, media_positivos, media_negativos;
     int conteo_positivos=0, conteo_negativos=0, conteo_ceros=0;
     
     System.out.println("guardando los numeros en el arreglo");
     for (int i=0; i<5; i++){
      System.out.println((i+1)+" digite el numero:");
      numeros[i]= sc.nextFloat();
     
     if (numeros[i] ==0){
         conteo_ceros++; 
     }
     else if (numeros[i] > 0){
         suma_positivos+=numeros[i];
         conteo_positivos ++;
     }
     else{
         suma_negativos+=numeros[i];
         conteo_negativos ++;
     }
     }
     
     if(conteo_positivos ==0){
         System.out.println("nose puede sacar la media d elos numeos positivos");
     }
     else{
         media_positivos= suma_positivos/conteo_positivos;
         System.out.println("La media de los numeros positivos es:" +media_positivos);
     }
     if(conteo_negativos ==0){
         System.out.println("nose puede sacar la media de los numeos negativos");
     }
     else{
         media_negativos= suma_negativos/conteo_negativos;
         System.out.println("La media de los numeros negativos es:" +media_negativos);
     }
     System.out.println("La cantidad de ceros es:" +conteo_ceros);
         } */
    
    // leer por teclado 2 tablas de 5 numeros y mezclarlas en una tercera de la forma a1,b1,a2,b2 etc
     public static void main (String[] args){ 
         Scanner sc = new Scanner (System.in);
         int a[],b[],c[];
         
         a = new int[5]; //arreglo de 5 elementos
         b= new int[5];  //arreglo de 5 elementos
         c= new int[20];  //arreglo de 10 elementos
         
         //pedimos el arreglo a
         System.out.println("digite el primer arreglo:");
         for(int i=0; i<5;i++){
             System.out.println((i+1)+"Digite el numero");
             a[i]=sc.nextInt();
         }
         
         //pedimos el arreglo b
         System.out.println("digite el primer arreglo:");
         for(int i=0; i<5;i++){
             System.out.println((i+1)+"Digite el numero");
             b[i]=sc.nextInt();
         }
         
         //mezclamos los dos arreglos en c
         //usaramos el iterador i para a y b, y j para C
         int j=0;
         for(int i=0; i<10; i++){
           c[j]=a[i];
           j++;
           c[j]=b[i];
           j++;
         }
         System.out.print("El tercer arreglo es:");
         for(int i=0; i<10; i++){
          System.out.println(c[i]+" ");
           }
     }    
     //System.out.println("ingrese m1, m2, r:");
}
