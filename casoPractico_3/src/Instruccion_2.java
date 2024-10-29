import java.util.Scanner;

public class Instruccion_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaro variables.
        double factura;
        double total;

        //Compruebo que la factura sea real.
        do {
            System.out.print("Introducir una factura: ");
            factura = sc.nextDouble();
        } while(factura<0);

        total = factura + (0.21*factura);

        System.out.println("El total de la factura a pagar es: "+total+" euros.");

        sc.close();
    }
}
