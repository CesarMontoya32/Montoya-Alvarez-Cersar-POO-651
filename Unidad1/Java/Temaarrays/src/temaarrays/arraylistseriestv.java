
package temaarrays;
import java.util.ArrayList;


public class arraylistseriestv {
    public static void main (String[]args){
    ArrayList<String> listaSeries = new ArrayList<>();
    listaSeries.add("Breaking bad");
    listaSeries.add("Friends");
    listaSeries.add("Vikingos");
     
        System.out.println(listaSeries);
        
        listaSeries.remove("Friends");
        System.out.println(listaSeries);
        
        
        boolean containFriends = listaSeries.contains("Friends");
        System.out.println("¿La lista contoene a friends? "+containFriends);
        
        
        int tamaño =listaSeries.size();
        System.out.println("El tamaño del ArrayList es: "+tamaño);
        
        
        //declarar diversos tipos de arrayList
        ArrayList<Integer>listaInteger=new ArrayList<>();
        ArrayList<Double>listaDouble=new ArrayList<>();
        ArrayList<Boolean>listaBooleanos=new ArrayList<>();
        
        
        
    }
}
