import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
        
public class Producto {
    
    public static List<Integer> Tipos(List<Integer>tipos){
        List<Integer> tipo = new ArrayList<>();
        for(int i =0 ;i<tipos.size(); i++ ){
        if(!tipo.contains(tipos.get(i))){
            tipo.add(tipos.get(i));
                 }
        }
        return tipo;
    }
    
    public static List<Integer> MeFaltanProductosTipo(List<Integer>productos, List<Integer>tipos, Integer tipo){
        List<Integer> lista3 = new ArrayList<>();
       for (int i = 0; i < productos.size(); i++) {
           int postProductos = productos.get(i);
           int dato = tipos.get(postProductos);
            if (dato == tipo) {
                lista3.add(postProductos);
            }
        }
       return lista3;
       }
    
    public static ArrayList<Integer> NoTengoProductos (ArrayList<Integer>otros, ArrayList<Integer>productos){
          ArrayList<Integer> lista3 = new ArrayList<Integer>();
          for(int i =0 ;i<otros.size(); i++ ){
              int dato = otros.get(i);
              if(!productos.contains(dato)){
                  lista3.add(dato);
                          }
          }
         return lista3;
    }
    
    public static int CuantosItemsCambio (List<Integer>otros, List<Integer>productos){
       /** int contador =0;
        for(int i =0 ;i<productos.size(); i++ ){
            int dato = productos.get(i);
            if(otros.contains(dato)){
                System.out.println(dato);
                contador++;
            }
          }
                 
        return contador;
                */
         int cantidad1 = NoTengoProductos(otros, productos).size();
       int cantidad2 = NoTengoProductos(productos, otros).sise();
       return Math.min(cantidad2, cantidad2);
    }
 }
 