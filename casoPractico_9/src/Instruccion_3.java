import java.util.Scanner;

public class Instruccion_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables:
        int cita;
        int precio_cita;
        int precio_total = 0;

        boolean precios = true;

        do {
            System.out.println("Introducir el número de cita: ");
            cita = sc.nextInt();        //Determino el número de la cita introducida por el cliente.
        } while (cita <= 0);

        if (cita <= 3) precio_cita = 150;
        else if (cita <= 5) precio_cita = 100;
        else if (cita <= 8) precio_cita = 90;
        else precio_cita = 50;

        for (int i = 1; i < cita; i++) {
            if (i <= 3) {
                precio_total += 150;
            } else if (cita <= 5) {
                precio_total += 100;
            } else if (cita <= 8) {
                precio_total += 90;
            }
            else {
                precio_total += 50;
            }
        }

        System.out.println("El pago de la cita es "+precio_cita+" euros y su pago total en citas es de "+precio_total+" euros (sin incluir la última).");

        sc.close();

    }

}
