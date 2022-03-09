public class PruebaAritmetica {
    public static void main(String [] areg){
        
       /**
        // 1.creamos el objeto de tipo aritmetica
        Aritmetica aritmetica  = new Aritmetica();//el new manda a llamar el constructor de la clase 
        
        int resultado =aritmetica.sumar(); // llamada al metodo
        System.out.println("resultado = " + resultado);
        
        //2. rcreamos un segundo objeto con argumentos
        Aritmetica aritmetica2 = new Aritmetica(4,2);
        System.out.println("resultado = " + aritmetica2.sumar());
       */
       
       //1. varioables locales: se llaman asi por que estan dentor dle metodo
       int operandoA = 6;
       int operandoB =2;
       
       //2. creamos un objeto de la clase aritmetica enviando argumentos
       Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
       
       //3. imprimir los valores de los operandos
       System.out.println(" operando A " + operandoA);
       System.out.println(" operando B " + operandoB);
       
       //4. imprimimos el resultado de la suma
       System.out.println("\nResultado suma " + objeto1.sumar());       
           //imprimimos el resultado de la resta, multiplicacion division
       System.out.println("\nResultado resta " + objeto1.restar());
       System.out.println("\nResultado multiplicacion " + objeto1.multiplicar());
       System.out.println("\nResultado division  " + objeto1.dividir());
    }  
}
