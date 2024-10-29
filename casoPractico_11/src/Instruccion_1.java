import java.util.Scanner;

public class Instruccion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Introducir el lado a: ");
        a = sc.nextDouble();

        System.out.print("Introducir el lado b: ");
        b = sc.nextDouble();

        System.out.print("Introducir el lado c: ");
        c = sc.nextDouble();

        if (Math.pow(a,2)+Math.pow(b,2) == Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2) == Math.pow(b,2) || Math.pow(b,2)+Math.pow(c,2) == Math.pow(a,2)) System.out.println("El triángulo es rectángulo.");
        else if (a == b && a == c) System.out.println("El triángulo es equilátero.");
        else if (a == b || a == c || b == c) System.out.println("El triángulo es isósceles.");
        else System.out.println("El triángulo es escaleno.");

        sc.close();
    }
}