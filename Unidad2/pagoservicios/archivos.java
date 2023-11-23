package pagoservicios;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class archivos {
    private static final String nombreArchivo = "ArchivoBasePagoServicios.txt";

    public static void main(String[] args) {
        ArrayList<InformacionPago> pagos = new ArrayList<>();
        File archivo = new File(nombreArchivo);
        Scanner s = null;

        try {
            s = new Scanner(archivo);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] cortarString = linea.split(" ");

                InformacionPago pago = new InformacionPago();
                pago.setId(cortarString[0]);
                pago.setNombre(cortarString[1]);
                pago.setApellido(cortarString[2]);
                pago.setMunicipio(cortarString[3]);
                String pagoConPesos = cortarString[4];
                pagoConPesos = pagoConPesos.replace("$", "");
                pago.setPago(pagoConPesos);
                pago.setNombreServicio(cortarString[5]);
                pago.setFecha(cortarString[6]);

                pagos.add(pago);
            }
        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }

        System.out.println("Impresión de objetos antes de procesar:");
        Iterator<InformacionPago> itPagos = pagos.iterator();
        while (itPagos.hasNext()) {
            InformacionPago pago = itPagos.next();
            System.out.println(
                pago.getId() + " " +
                pago.getNombre() + " " +
                pago.getApellido() + " " +
                pago.getMunicipio() + " " +
                pago.getPago() + " " + // Sin el signo de pesos ('$')
                pago.getNombreServicio() + " " +
                pago.getFecha()
            );
        }

        System.out.println("");
        System.out.println("Cálculo de totales:");

        // Acumuladores para los totales
        double totalCiudadA = 0;
        double totalCiudadB = 0;
        double totalCiudadC = 0;
        double totalElectricidad = 0;
        double totalAgua = 0;
        double totalInternet = 0;
        double totalGas = 0;

        itPagos = pagos.iterator();
        while (itPagos.hasNext()) {
            InformacionPago pago = itPagos.next();
            String ciudad = pago.getMunicipio();
            String servicio = pago.getNombreServicio();
            double monto = Double.parseDouble(pago.getPago());

            // Acumula los totales por ciudad
            if (ciudad.equals("CiudadA")) {
                totalCiudadA += monto;
            } else if (ciudad.equals("CiudadB")) {
                totalCiudadB += monto;
            } else if (ciudad.equals("CiudadC")) {
                totalCiudadC += monto;
            }

            // Acumula los totales por servicio
            if (servicio.equals("Electricidad")) {
                totalElectricidad += monto;
            } else if (servicio.equals("Agua")) {
                totalAgua += monto;
            } else if (servicio.equals("Internet")) {
                totalInternet += monto;
            } else if (servicio.equals("Gas")) {
                totalGas += monto;
            }
        }

       
        System.out.println("Totales por ciudad:");
        System.out.println("CiudadA: $" + totalCiudadA);
        System.out.println("CiudadB: $" + totalCiudadB);
        System.out.println("CiudadC: $" + totalCiudadC);

       
        System.out.println("Totales por servicio:");
        System.out.println("Electricidad: $" + totalElectricidad);
        System.out.println("Agua: $" + totalAgua);
        System.out.println("Internet: $" + totalInternet);
        System.out.println("Gas: $" + totalGas);
    }
}
