
package remueveceros;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Remueveceros {
private static final String nombreArchivo = "numeros.txt";


    
    public static void main(String[] args) {
        int repetidos1=0,repetidos2=0,repetidos3=0,repetidos4=0,repetidos5=0,
            repetidos6=0,repetidos7=0,repetidos8=0,repetidos9=0;
        
        
        ArrayList<ArrayList<Integer>> arrayListNumeros = new ArrayList<ArrayList<Integer>>();
        File archivo = new File(nombreArchivo);
        Scanner s =null;
        try {
           s=new Scanner (archivo);
            while (s.hasNextLine()){
                String linea = s.nextLine();
                String [] cortarString = linea.split(" ");
                
           ArrayList<Integer> numeros = new ArrayList<Integer>();
                for (int i =0; i<cortarString.length; i++) {
                    numeros.add(Integer.parseInt(cortarString[i]));
               
                }
                arrayListNumeros.add(numeros);
                //numeros.forEach(System.out::print);
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        System.out.println(" Imprimir con un Iterator un ArrayList");
//       Iterator<ArrayList <Integer>> itArrayList = arrayListNumeros.iterator();
//       while (itArrayList.hasNext()){
//       ArrayList<Integer> numeros = itArrayList.next();
//       Iterator<Integer> itNumeros = numeros.iterator();
//       while(itNumeros.hasNext()){
//           int numero = itNumeros.next();
//           System.out.println(numero+" ");
//            
//       }
//           System.out.println("");
//       }
       
        Iterator<ArrayList <Integer>> itArrayList = arrayListNumeros.iterator();
       while (itArrayList.hasNext()){
       ArrayList<Integer> numeros = itArrayList.next();
          Iterator <Integer> itNumeros = numeros.iterator();
              while (itNumeros.hasNext()){
              int numero = itNumeros.next();
              if(numero==0){
                 itNumeros.remove();
              }
              if(numero==1){
                 repetidos1++;
              }
              else if(numero==2){
              repetidos2++;
              }
              else if(numero==3){
              repetidos3++;
              }
              else if(numero==4){
              repetidos4++;
              }
              else if(numero==5){
              repetidos5++;
              }
              else if(numero==6){
              repetidos6++;
              }
              else if(numero==7){
              repetidos7++;
              }
              else if(numero==8){
              repetidos8++;
              }
              else if(numero==9){
              repetidos9++;
              }
              
           }
             
                } 
      // arrayListNumeros.forEach(System.out::println);
       
       
        itArrayList=arrayListNumeros.iterator();
        while (itArrayList.hasNext()) {
     ArrayList<Integer>numeros=itArrayList.next();
     Iterator<Integer> itNumeros=numeros.iterator();
          if(numeros.isEmpty()){
          itArrayList.remove();
          }      
        }
        arrayListNumeros.forEach(System.out::println);
        
        System.out.println(" El total de numeros 1 que se repiten es : "+repetidos1);
        System.out.println(" El total de numeros 2 que se repiten es : "+repetidos2);
        System.out.println(" El total de numeros 3 que se repiten es : "+repetidos3);
        System.out.println(" El total de numeros 4 que se repiten es : "+repetidos4);
        System.out.println(" El total de numeros 5 que se repiten es : "+repetidos5);
        System.out.println(" El total de numeros 6 que se repiten es : "+repetidos6);
        System.out.println(" El total de numeros 7 que se repiten es : "+repetidos7);
        System.out.println(" El total de numeros 8 que se repiten es : "+repetidos8);
        System.out.println(" El total de numeros 9 que se repiten es : "+repetidos9);
               
           }
         
       }
         
    
