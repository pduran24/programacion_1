import java.util.Scanner;

public class Instruccion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int aux;

        System.out.println("Introducir un número A: ");
        num1 = sc.nextInt();
        System.out.println("Introducir un número B: ");
        num2 = sc.nextInt();

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("Después de intercambiar los valores: A vale "+num1+" B vale "+num2);

        sc.close();
    }
}
