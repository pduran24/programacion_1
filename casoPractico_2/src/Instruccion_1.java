import java.util.Scanner;

//Leer la edad y peso de una persona.

public class Instruccion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad;
        double peso;

        System.out.println("Introduzca su edad: ");
        edad = sc.nextInt();
        if (edad<0){
            System.out.println("Edad negativa. Error.");
            do {
                System.out.print("Introduzca la edad nuevamente: ");
                edad = sc.nextInt();
            }while(edad<0);
        }
        System.out.println("Introduzca su peso: ");
        peso = sc.nextInt();

        if (peso<0){
            System.out.println("Peso negativo. Error.");
            do {
                System.out.print("Introduzca el peso nuevamente: ");
                peso = sc.nextDouble();
            }while(peso<0);
        }

        System.out.println("Su edad es: "+edad+" y su peso es "+peso);
        sc.close();
    }
}
