import java.util.Scanner;

public class Instruccion_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Conozco
        double saldo_anterior;
        double pago_anterior;
        double pendiente;
        double compras;
        double pago;

        //A calcular
        double pago_minimo;
        double no_intereses;
        double deuda;

        System.out.print("Introducir el saldo anterior del cliente: ");
        saldo_anterior = sc.nextDouble();

        System.out.print("Introducir el pago el mes anterior: ");
        pago_anterior = sc.nextDouble();

        System.out.print("Introducir la cantidad pendie nte de las compras: ");
        pendiente = sc.nextDouble();

        System.out.print("Introducir las compras realizadas: ");
        compras = sc.nextDouble();

        pago_minimo = 0.15 * (compras + pendiente);
        no_intereses = 0.85 * (compras + pendiente);

        System.out.println("El pago mínimo que debe realizar es de: "+pago_minimo+"€.");
        System.out.println("El pago mínimo que debe realizar para no generar intereses es de: "+no_intereses+"€.");

        System.out.print("Introduzca el pago que desea realizar: ");
        pago = sc.nextDouble();

        if (pago < no_intereses){
            deuda = 1.12 * (pendiente + compras - pago);
            if (pago < pago_minimo) deuda += 200;
        } else{
            deuda = (pendiente + compras ) - pago;
            if (deuda < 0) deuda = 0;
        }

        System.out.println("Una vez realizado el pago, su saldo actual será de: "+(saldo_anterior-pago-pago_anterior)+"€.");
        System.out.println("La cantidad pendiente de pago de sus compras es de: "+deuda+"€.");

    }
}
