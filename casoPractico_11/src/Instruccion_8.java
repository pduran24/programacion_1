import java.util.Random;
import java.util.Scanner;

public class Instruccion_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int intentos;
        int suma = 0;
        int error = 0;
        boolean acierto = false;

        do {
            System.out.print("Introducir el número de intentos que desee tener: ");
            intentos = sc.nextInt();
        } while (intentos <= 0);


        for (int i=0; i<1; i++){
            int n1 = r.nextInt(6)+1;
            int n2 = r.nextInt(6)+1;
            suma = n1 + n2;
        }

        while (!acierto){

            System.out.print("Introducir el número que cree que es: ");
            int prueba = sc.nextInt();
            error++;

            if (prueba == suma) {
                acierto = true;
                System.out.println("-----------");
                System.out.println("ACERTASTE!!");
            }
            else if (error == intentos) {
                acierto = true;
                System.out.println("--------------");
                System.out.println("Perdiste BOBO.");
                System.out.println("El número era el "+suma);
            }
            else System.out.println("Error. Le quedan "+(intentos-error)+" intentos.");
        }

        sc.close();
    }
}
