import java.util.Scanner;

public class Instruccion_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;
        double cuadrado;
        double cubo;

        System.out.println("Introducir un número: ");
        numero = sc.nextInt();

        for(int i=1;i<6;i++){
            cuadrado = Math.pow(numero,2);
            cubo = Math.pow(numero,3);
            System.out.println("Cuadrado de "+numero+": "+cuadrado+"    Cubo de "+numero+": "+cubo);
            numero++;
        }

        sc.close();
    }
}
