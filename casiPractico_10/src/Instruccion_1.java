import java.sql.SQLOutput;
import java.util.Scanner;

public class Instruccion_1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int lado;

        do {
            System.out.print("Introducir el lado del cuadrado: ");
            lado = sc.nextInt();
        } while(lado <= 1);

/*
        for (int i=0; i<lado; i++){
            System.out.println();
            for (int j=0; j<lado; j++){
                if (i==0 || i==lado-1) System.out.print("*");
                else if (j==0 || j==lado-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
*/
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < lado - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < lado - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }

        sc.close();
    }
}

