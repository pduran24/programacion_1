import java.util.Scanner;

public class Instruccion_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alumnos;
        int costo = 0;
        int costo_total;


        System.out.println("Introducir el número de alumnos: ");
        alumnos = sc.nextInt();

        if(alumnos>=100){
            costo = 65;
            costo_total=costo*alumnos;
        } else if (alumnos>=50 && alumnos<99) {
            costo = 70;
            costo_total=costo*alumnos;
        } else if (alumnos>=30 && alumnos<49) {
            costo = 95;
            costo_total=costo*alumnos;
        } else costo_total = 3000;

        if (alumnos>0)
            System.out.println("El costo por alumno es "+costo+" euros y el coste total será "+costo_total+" euros.");

        else System.out.println("La excursión no se realizará.");


        sc.close();
    }
}
