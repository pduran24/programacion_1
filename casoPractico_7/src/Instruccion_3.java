import java.util.Scanner;

public class Instruccion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introducir un número: ");
        numero = sc.nextInt();

        for (int i=0;i<numero;i++){
            System.out.println();
            for (int j=i+1;j>0;j--){
                System.out.print("*");
            }
        }

        sc.close();
    }
}
