import java.util.Scanner;

public class Instruccion_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int mayor = -1;

        do {
            System.out.println("Introducir un número positivo (0 termina la secuencia): ");
            numero = sc.nextInt();

            if(numero<0) {
                System.out.println("Número negativo.");
            }else{
                if(numero>mayor) mayor = numero;
            }
        } while(numero!=0);

        if (mayor == -1){
            mayor = 0;
        }

        System.out.println("0 introducido, secuencia terminada.");
        System.out.println("El número mayor es: "+mayor);

        sc.close();
    }
}
