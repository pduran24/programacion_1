import java.util.Scanner;

public class Instruccion_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //constantes
        int sencilla = 5;
        int doble = 8;
        int triple = 12;
        double cargo = 1.05;

        //variables
        int burguers;
        String tipo;
        String pago;
        boolean aniadir_cargo = true;
        double factura;

        //control
        boolean burguer_aceptada = false;
        boolean pago_aceptado = false;

        do {
            System.out.print("Introducir el número de hamburguesas deseadas: ");
            burguers = sc.nextInt();
            if (burguers <= 0) System.out.println("Error.");
        } while (burguers<=0);

        do {
            System.out.print("Introducir el tipo de hamburguesa (sencilla/doble/triple): ");
            tipo = sc.next();
            if (tipo.toLowerCase().equals("sencilla") || tipo.toLowerCase().equals("doble") || tipo.toLowerCase().equals("triple")) burguer_aceptada = true;
            else System.out.println("Error.");
        } while (!burguer_aceptada);

        do {
            System.out.print("Tarjeta o efectivo (tarjeta/efectivo): ");
            pago = sc.next();
            if (pago.toLowerCase().equals("tarjeta") || pago.toLowerCase().equals("efectivo")) pago_aceptado = true;
            else System.out.println("Error.");
        } while (!pago_aceptado);

        if (pago.equals("efectivo")) aniadir_cargo = false;
        
        if (tipo.equals("sencilla")){
            if (aniadir_cargo) factura = burguers * sencilla * cargo;
            else factura = burguers * sencilla;
        }
        else if (tipo.equals("doble")) {
            if (aniadir_cargo) factura = burguers * doble * cargo;
            else factura = burguers * doble;
        }
        else {
            if (aniadir_cargo) factura = burguers * triple * cargo;
            else factura = burguers * triple;
        }

        System.out.println("El pedido de "+burguers+" hamburguesa/s de tipo "+tipo+" es de "+factura+" euros.");    sc.close();


        sc.close();

    }
}
