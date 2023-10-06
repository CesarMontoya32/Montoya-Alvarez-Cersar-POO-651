
package temaarrays;


public class cadenas {
    
  public static void main(String[] args) {
        
        String cadenadetexto="Universidad Politecnica de valle de México";
        System.out.println("Cadena original: "+cadenadetexto);
        
        System.out.println("la logitud de la cadena es "+cadenadetexto.length());
        
        System.out.println("primera letra de la cadena "+cadenadetexto.charAt(0));
        
        //ultima letra de la cadena 
        int ultimaletra =(cadenadetexto.length())-1;
        System.out.println("ultima letra de la cadena "+cadenadetexto.charAt(ultimaletra));
        
         System.out.println("valor de la subcadena: "+cadenadetexto.substring(1,3)); //muestra dos letras
         
         String cadena1="Hola";
         String cadena2="Hola";
         String mayusculas1=cadena1.toUpperCase();
         String mayusculas2=cadena2.toUpperCase();
         System.out.println("la cadena uno es igual a la cadena dos? "+mayusculas1.equals(mayusculas2));
         
         
         
        
    }
}
