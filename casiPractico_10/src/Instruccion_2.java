import java.util.Scanner;

public class Instruccion_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String turno;
        String dia;
        double sueldo;

        int horas;


        boolean aceptar_turno = false;
        boolean aceptar_dia = false;


        do {
            System.out.print("Introducir el turno (Diurno/Nocturno): ");
            turno = sc.next();

            if (turno.equalsIgnoreCase("diurno") || turno.equalsIgnoreCase("nocturno")) aceptar_turno = true;

        } while (!aceptar_turno);

        do {
            System.out.print("Introducir el número de horas: ");
            horas = sc.nextInt();
        } while (horas <= 0);

        do {
            System.out.print("Introducir el tipo de día (Laborable/Festivo): ");
            dia = sc.next();

            if (dia.equalsIgnoreCase("laborable") || dia.equalsIgnoreCase("festivo")) aceptar_dia = true;

        } while (!aceptar_dia);

        if (turno.equalsIgnoreCase("diurno")){
            if (dia.equalsIgnoreCase("laborable")){
                sueldo = horas * 10;
            } else sueldo = horas * 10 * 1.1;
        } else {
            if (dia.equalsIgnoreCase("laborable")){
                sueldo = horas * 13.5;
            } else sueldo = horas * 13.5 * 1.15;
        }

        System.out.println("Número de horas: "+horas);
        System.out.println("Turno: "+turno);
        System.out.println("Tipo de día: "+dia);
        System.out.println("El sueldo a cobrar es: "+sueldo);

        sc.close();
    }
}
