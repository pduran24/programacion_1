import java.util.Scanner;

public class Instruccion_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double kg;
        double precio_kg;
        String tipo;
        int tamanio;
        double total;

        do {
            System.out.print("Introducir el kg de uvas: ");
            kg = sc.nextDouble();
        } while (kg<=0);

        do {
            System.out.print("Determinar el precio del kg: ");
            precio_kg = sc.nextDouble();

        } while (precio_kg<=0);

        do {
            System.out.print("Introducir el tipo de Uva (a/b): ");
            tipo = sc.next();
        } while (!(tipo.equalsIgnoreCase("a") || tipo.equalsIgnoreCase("b")));

        do {
            System.out.print("Introducir el tamaño de la uva (1/2): ");
            tamanio = sc.nextInt();
        } while (tamanio != 1 && tamanio != 2);

        sc.close();

        if (tipo.equalsIgnoreCase("a")){
            if (tamanio == 1) precio_kg += 0.20;
            else precio_kg += 0.30;
        } else {
            if (tamanio == 1) precio_kg -= 0.30;
            else precio_kg -= 0.50;
        }

        total = precio_kg * kg;

        System.out.println("El precio total del pedido de "+kg+" kg de uvas es de "+(Math.round(total))+"€.");
        System.out.println("La ganancia por kg de uva es de "+precio_kg+"€.");

    }
}
