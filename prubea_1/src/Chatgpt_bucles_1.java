import java.util.Scanner;

public class Chatgpt_bucles_1 {

    public static void main(String[] args) {
        /*1. Suma de Números:
    Escribe un programa que pida al usuario un número entero positivo y luego calcule la suma de todos los números desde 1 hasta ese número utilizando un bucle for.
    */
        Scanner sc = new Scanner(System.in);

        //PEDIR NÚMERO:
        int num;
        int suma = 0;
        do {
            System.out.println("Introducir un número entero positivo: ");
            num = sc.nextInt();
        }while(num<=0);

        //SUMA NÚMEROS:
        for (int i=0;i<num+1;i++){
            suma += i;
        }

        System.out.println("La suma de todos los números hasta "+num+" es: "+suma+".");
    }
}
