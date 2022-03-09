public class PruebaPersona {
    public static void main (String[] args){
      // creacion de un objeto de tipo persona
        
        //1. Definición de la variable tipo persona
        Persona persona1;
        
        //2. Intanciando (creando)un objeto de la clase persona
        persona1 = new Persona(); //persona1 es una variable y new persona es el objeto
        
        //3. Accedemos al objeto persona y llamamos al metodo deplegarNombres
        persona1.deplegarNombres();
        
        //4. Modificamos los valores de los atributos del objeto persona
        persona1.nombre ="Pepito";
        persona1.apellido ="Pepote";
        
        //5. volvemos a imprimir los valores 
        System.out.println("");
        persona1.deplegarNombres();
        
        //creamos un segundo objeto.
        Persona persona2 = new Persona();
        persona2.nombre ="Pepa";
        persona2.apellido="Redonda";
        System.out.println("");
        persona2.deplegarNombres();
    }

}
