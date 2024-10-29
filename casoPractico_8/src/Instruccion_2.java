import java.util.Scanner;

public class Instruccion_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.println("Introducir un año: ");
        anio = sc.nextInt();

        if (anio%4==0 && anio%100!=0 || anio%100==0 && anio%400==0){
            if (anio<2024) System.out.println("El año "+anio+" fue bisiesto.");
            else if (anio>2024) System.out.println("El año "+anio+" será bisiesto.");
            else System.out.println("El año "+anio+" es bisiesto.");
        }
        else{
            if (anio<2024) System.out.println("El año "+anio+" no fue bisiesto.");
            else if (anio>2024) System.out.println("El año "+anio+" no será bisiesto.");
            else System.out.println("El año "+anio+" no es bisiesto.");
        }




        sc.close();
    }
}
