public class Aritmetica {
// atributos de la clase
    int a;
    int b;
  
    /**  
// constructor vacio, usamos el puclic para poder acceder a el
    //no retorna nada por eso va directo al nombre que debe ser identico al de la clase
    public Aritmetica(){
        a = 5;
        b = 3;
        System.out.println(" Ejecutando constructor vacio ");
    }

    // constructor con argumentos
    public Aritmetica( int arg1, int arg2){
        a = arg1;
        b = arg2;
        System.out.println(" Ejecutando constructor con argumentos ");
    }

    // metodo
    //public int sumar ( int a , int b){ //1. hacemos la firma el metodo, definir la clase , nombre del metodo que empieza en minuscula, por ultimo los argumentos separados por coma
    // public int sumar (){ // metodo sin argumenos, por que ya se definieron en atributos
      //   int resultado = a+b;  //2. agregamos el cuerpoo del metodo
        //   return resultado;
      //}
      public int sumar (){ // metodo sin argumenos, por que ya se definieron en atributos
         return a+b;
      }
      public int restar (){ // metodo 2
         return a-b;
      }
      public int multiplicar (){ // metodo 3
         return a*b;
      }
      public int dividir (){ // metodo 4
         return a/b;
      }
   */
    
    // forma 2 usando this
    public Aritmetica(){
        System.out.println(" Ejecutando constructor vacio ");
    }

    // constructor con argumentos
    public Aritmetica( int a, int b){
        this.a = a;
        this.b = b;
        System.out.println(" Ejecutando constructor con argumentos ");
    }

    // metodo
          public int sumar (){ // metodo sin argumenos, por que ya se definieron en atributos
         return this.a+this.b;
      }
      public int restar (){ // metodo 2
         return this.a-this.b;
      }
      public int multiplicar (){ // metodo 3
         return this.a*this.b;
      }
      public int dividir (){ // metodo 4
         return this.a/this.b;
      }
}
