
import java.util.Scanner;

public class Instruccion_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeros;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;


        for(int i=0;i<10;i++){
            do {
                System.out.println("Introducir el número "+(i+1)+" distinto de 0: ");
                numeros = sc.nextDouble();
            }while(numeros==0);

            if(numeros%2==0){
                pares++;
            }else{
                impares++;
            }
            if(numeros>0){
                positivos++;
            }else{
                negativos++;
            }
        }

        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);

        sc.close();
    }
}
