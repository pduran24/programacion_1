import java.util.Scanner;

public class Instruccion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introducir un número N: ");
        numero = sc.nextInt();

        for (int i=1;i<=numero;i++){
            System.out.println();
            for (int j=numero-i;j>0;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }

        }







    }
}
