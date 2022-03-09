
package hola.mundo;
import java.util.Scanner;
public class RetosCiclo2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int id_base_inicial= Integer.parseInt(sc.nextLine());
        int base_luke = (2*id_base_inicial)+4;
        int base_leia = (id_base_inicial+ base_luke)/5;
        System.out.print(+id_base_inicial + " ");
        System.out.print(+base_luke + " ");
        System.out.println(+base_leia);
        
        if ( base_leia >= 0 && base_leia <= 20){
            System.out.println("uno");
                    } else if ( base_leia >= 21 && base_leia <= 30){
            System.out.println("dos");
                    } else if ( base_leia >= 31 && base_leia <= 50){
            System.out.println("tres");
                    } else {
                        System.out.println("cuatro");
                    } 
    }
    }

