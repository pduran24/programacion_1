import java.util.Scanner;

public class Instruccion_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int saldo;


        System.out.println("Introducir el saldo disponile: ");
        saldo = sc.nextInt();

        if (saldo <= 0) System.out.println("Ponte a trabajar.");
        else if (saldo <= 10) System.out.println("Regalo disponibles: Tarjeta regalo.");
        else if (saldo <= 20) System.out.println("Regalos disponibles: Tarjeta regalo / Bombones.");
        else if (saldo <= 50) System.out.println("Regalos disponibles: Tarjeta regalo / Bombones / Flores.");
        else System.out.println("Regalos disponibles: Tarjeta regalo / Bombones / Flores / Anillo.");

    }
}
