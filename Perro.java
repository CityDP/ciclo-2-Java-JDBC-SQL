package hola.mundo;

/**
 * Clases y onjetos
 */
public class Perro {
    // Atributos

    public int edad;
    public String nombre;
    public String colorOjos;

    // Constructor
    Perro(int edad, String nombre, String colorOjos) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorOjos = colorOjos;
    }
    // Metodos

    public void ladrar() {
        System.out.println("Guau guau");
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void quienEsMayor(Perro otroPerro) {
        if (this.edad > otroPerro.edad) {
            System.out.println("Soy mayor que " + otroPerro.nombre);
        } else if (this.edad == otroPerro.edad) {
            System.out.println("Tenemos la misma edad");
        } else {
            System.out.println(otroPerro.nombre + " es mayor que yo");
        }
    }

    public void saludarOtroPerro(Perro otroPerro) {
        System.out.println("Hola " + otroPerro.nombre + ", yo soy "
                + this.nombre);
    }

    }
