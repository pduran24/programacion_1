import java.util.Scanner;

public class Instruccion_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anio;
        int edad;
        do {
            System.out.println("Introducir el año de nacimiento: ");
            anio = sc.nextInt();

        }while(anio<1900);

        edad = 2024-anio;

        System.out.println("Año: "+anio+", Edad: "+edad+"años.");


        sc.close();
    }
}
