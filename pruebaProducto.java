
import java.util.ArrayList;
import java.util.List;

public class pruebaProducto extends Producto {
    public static void main(String[] args) {
        // prueba metodo tipo
        int[] p1={1,2,5,5,5,1,2,5,5,5};
        List<Integer> lista = new ArrayList<>();
        for (int i=0; i<p1.length;i++){
        lista.add(p1[i]);
        }
        System.out.println (Tipos(lista)); 
        
        // prueba metodo MeFaltanProductosTipo
        int[] p2 = {1,3,6,8};
        int [] p3={1,2,5,5,5,1,2,5,5,5};
        int p4=5;
        
        List<Integer> lista2 = new ArrayList<>();
        for (int i=0; i<p2.length;i++){
        lista2.add(p2[i]);
        }
        
         List<Integer> lista3 = new ArrayList<>();
        for (int i=0; i<p3.length;i++){
        lista3.add(p3[0x1]);
        }
        System.out.println (MeFaltanProductosTipo(lista2, lista3,p4));
 
        // prueba metodo CuantosItemsCambio 
        int[] p5 = {3,5,7,10,15,16};
        int [] p6={4,10,5,8};
        
        List<Integer> lista5 = new ArrayList<>();
        for (int i=0; i<p5.length;i++){
        lista5.add(p5[i]);
        }
        
         List<Integer> lista6 = new ArrayList<>();
        for (int i=0; i<p6.length;i++){
        lista3.add(p6[i]);
        }
        System.out.println ( CuantosItemsCambio (lista5, lista6));
        
        // prueba metodo NoTengoProductos
        int[] p7 = {3,5,7,10,15,16};
        int [] p8={4,10,5,8};
        
        List<Integer> lista7 = new ArrayList<>();
        for (int i=0; i<p7.length;i++){
        lista7.add(p7[i]);
        }
        
         List<Integer> lista8 = new ArrayList<>();
        for (int i=0; i<p8.length;i++){
        lista8.add(p8[i]);
        }
        System.out.println ( NoTengoProductos(lista7, lista8)); 
    }
}
