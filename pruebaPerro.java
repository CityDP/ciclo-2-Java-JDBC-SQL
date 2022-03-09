package hola.mundo;

public class pruebaPerro {

    public static void main(String[] args) {
        Perro miPerro1 = new Perro(5, "Toby", "Azul");
        Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
        Perro miPerro3 = new Perro(5, "Bony", "Amarillo");
        System.out.println(miPerro1.edad); // opcion 1 llamar al atributo
        System.out.println(miPerro2.edad);
        miPerro1.saludar(); // opcion2 llamar al metodo
        miPerro1.quienEsMayor(miPerro2);
        miPerro1.saludarOtroPerro(miPerro3);
    }
}
