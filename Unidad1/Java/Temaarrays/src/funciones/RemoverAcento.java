
package funciones;


import funciones.funcionesgenerales;

public class RemoverAcento {

    public static void main(String[] args) {
        
        funcionesgenerales palabra = new funcionesgenerales();
        String mipalabra;
        mipalabra = palabra.removerAcentos("Paralilepípedos");
        System.out.println(mipalabra);
    }

}
