package hola.mundo;


import hola.mundo.Listas;


public class pruebaListas {
    public static void main(String [] areg){
    Listas lista1 =new Listas();
    lista1.leerListas();
    lista1.lista="1,2,3,4,5";
    System.out.println("");
    lista1.leerListas();
  
        
    Listas lista2 =new Listas();
    lista2.leerListas();
    lista2.lista= "a,b,c,d,e";
    System.out.println("");
    lista2.leerListas();
    }
}
