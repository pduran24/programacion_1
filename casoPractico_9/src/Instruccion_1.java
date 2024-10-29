import java.util.Scanner;

public class Instruccion_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
    //    int cont = 0;
        int n = 2;

        boolean esprimo = true;

        do {
            System.out.print("Introducir un número positivo: ");
            numero = sc.nextInt();

            if (numero <= 0) System.out.println("Número no positivo.");

        } while (numero <= 0);
/*
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
*/
        while(esprimo && n < numero){

            if (numero % 2 == 0){
                esprimo = false;
            } else n++;

        }


/*
        if (cont == 2 || cont == 1) System.out.println(numero + " es primo.");
        else System.out.println(numero + " no es primo.");
*/
        if (esprimo = true) System.out.println("El número "+numero+" es primo.");
        else System.out.println("El número "+numero+" no es primo.");


        sc.close();
    }
}
