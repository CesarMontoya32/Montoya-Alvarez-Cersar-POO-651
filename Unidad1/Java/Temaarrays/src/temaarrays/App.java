
package temaarrays;


public class App {

    public static void main(String[] args) {
       
        //problema escribir un programa para insertar el numero de episodios de una serie "Dr. House " y que nos devuelva la duracion 
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Serie de Dr. House ***");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        int[] episodiosserie = new int[5];
        
        episodiosserie[0]=30;
        episodiosserie[1]=50;
        episodiosserie[2]=25;
        episodiosserie[3]=60;
        episodiosserie[4]=45;
        //numero de episodios 
        int duracion= episodiosserie.length;
        System.out.println("Duracion total de la serie Dr House: "+duracion);
            
        
        int acumulador=0;
        for (int i = 0; i < episodiosserie.length; i++) {
          acumulador=acumulador +episodiosserie[i] ;  
          
        }
        System.out.println("Duracion total de la serie Dr House: "+acumulador);
      
        
        for (int i = 0; i < episodiosserie.length; i++) {
            if(episodiosserie[i]>40){
                System.out.println("capitulo "+(i+1)+" : "+episodiosserie[i]+ " minutos");
                
            }
        }
        
    }
}