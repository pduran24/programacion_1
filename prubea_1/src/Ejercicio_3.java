import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introducir un número positivo: ");
            num = sc.nextInt();
        }while(num<=0);
        sc.close();
        System.out.println("");
        System.out.println("El número es positivo.");
        System.out.println("---------------------------");
    }
}
