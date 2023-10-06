
package temaarrays;

import java.util.Scanner;

public class arrays {

    
    public static void main(String[] args) {
       /*Guaradar las ventas de 10 dias en un arreglo
        y determinar cúales son mayores a 2000 (inclusive)*/
       double ventas[]=new double [10];
       Scanner entrada = new Scanner(System.in);
        System.out.println("**************Ventas mayores a 2000********");
        System.out.println("");
        System.out.println("Ingrese las 10 ventas del mes");
    //lenar el arreglo
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Ingrese la venta " +(i+1)+" : ");
            ventas[i]=entrada.nextDouble();
            
        }
    //determinar cuales ventas en el arreglo son mayores o iguales a 2000
    
    //lo haremos ppr medio de un metodo
    ventasMayores2000(ventas);
    }
   public static void ventasMayores2000(double x[]){
   int j=0,total =0; 
           double acomuladorventas=0;
       System.out.println("Estas son las ventas mayores o iguales a 2000");
       //recorrer el arreglo
       while(j<10){
       if(x[j]>=2000){
           System.out.println("$ "+x[j]);
           
           total++;
           acomuladorventas=acomuladorventas+x[j];
       }
       j++;
       }
       System.out.println("El total de las ventas >= 2000 es: "+total);
       System.out.println("El acomulado total es: "+acomuladorventas);
   } 
}
