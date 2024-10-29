import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        long n1 = -1;
        long n2 = 1;

        /*
        do {
            System.out.println("Introducir la longitud de la cadena: ");
            num = sc.nextInt();

            if (num<=0) System.out.println("Por favor, introducir un número positivo.");
        } while (num<=0);
        */

        System.out.println("Introducir la longitud de la cadena: ");
        num = sc.nextInt();

        if (num<=0) {
            System.out.println("Por favor, introducir un número positivo.");
            return;
        }

        for (int i=0; i<num; i++){

            long next = n1 + n2;
            n1 = n2;
            n2 = next;

            System.out.print(n2+" ");

        }

        sc.close();
    }
}
