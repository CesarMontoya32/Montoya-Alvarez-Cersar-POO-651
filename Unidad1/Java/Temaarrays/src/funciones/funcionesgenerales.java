
package funciones;
public class funcionesgenerales {
    
public String removerAcentos(String palabraorigen){
        String palabraRetorna = palabraorigen.toLowerCase();
                
        String conacentos="áéíóú";
        String sinacentos="aeiou";
        
        int ejemplares =conacentos.length();
        
        for (int i=0; i<ejemplares;i++) {
         palabraRetorna=palabraRetorna.replace(conacentos.charAt(i), sinacentos.charAt(i));
        }
        
        
        return palabraRetorna;
    }
   public static void main (String args[]){}         
}
