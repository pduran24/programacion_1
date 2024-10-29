import java.util.Random;
import java.util.Scanner;

public class Instruccion_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rango;
        int aleatorio;
        Random r = new Random();
        int intento = 0;
        int intentos;
        int numero;
        boolean acierto = false;

        System.out.print("Introducir el rango (Irá de 1-rango): ");
        rango = sc.nextInt();
        aleatorio = r.nextInt(rango) + 1;

        System.out.print("Introducir un límite de intentos: ");
        intentos = sc.nextInt();

        while (!acierto){
            System.out.println("Adivina el número: ");
            numero = sc.nextInt();

            if (numero == aleatorio) {
                System.out.println("Intento "+(intento)+". Número Acertado!!!");
                acierto = true;
            }

            else if (numero > aleatorio) {
                System.out.println("Intento "+(intento+1)+". El número secreto es menor.");
                intento+=1;
                if (intento == intentos){
                    System.out.println("Número de intentos máximo alcanzado.");
                    System.out.println("El número era: "+aleatorio);
                    System.out.println("Perdiste bobo.");
                    acierto = true;
                }
            }

            else {
                System.out.println("Intento "+(intento+1)+". El número secreto es mayor.");
                intento+=1;
                if (intento == intentos){
                    System.out.println("Número de intentos máximo alcanzado.");
                    System.out.println("El número era: "+aleatorio);
                    System.out.println("Perdiste bobo.");
                    acierto = true;
                }
            }
        }

        sc.close();
    }
}
