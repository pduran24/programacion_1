import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        int[] numeros = new int[3];

        for (int i=0;i<3;i++){
            System.out.println("Introducir un numero: ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];

        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        */

        int m = 9, n = 1, x = 0;
        while (m>n){
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);


        //System.out.println("El mayor número es: "+mayor);

        //System.out.println(++a + b++ * c);

    }
}
