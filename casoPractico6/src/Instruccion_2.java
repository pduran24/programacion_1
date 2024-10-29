import java.util.Scanner;

public class Instruccion_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dia;

        System.out.println("Introducir un día de la semana: ");
        dia = sc.next();

        dia.toLowerCase();
        switch (dia) {
            case "lunes", "martes", "miercoles", "jueves", "viernes":
                System.out.println("Laborable.");
                break;
            case "sabado", "domingo":
                System.out.println("No laborable.");
                break;
        }

        sc.close();
    }
}
