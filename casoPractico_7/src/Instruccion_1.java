import java.util.Scanner;

public class Instruccion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int num;
        int pares = 0;
        int cont_pares = 0;
        double media_pares = 0;
        int mayor = 0;
        int menor = 0;

        System.out.print("Introducir un número x: ");
        x = sc.nextInt();

        for(int i=1;i<x+1;i++){
            System.out.print("Introducir el número "+(i)+": ");

            num = sc.nextInt();


            if(num%2==0){
                pares+=num;
                cont_pares++;
            }
            if (mayor<num) mayor = num;
            else if (menor>num) menor = num;
        }

        if(cont_pares==0 || media_pares==0) System.out.println("No hay ningún par.");
        else media_pares = pares/cont_pares;


        System.out.println("El menor de todos ellos es: "+menor);
        System.out.println("El mayor de todos ellos es: "+mayor);
        System.out.println("El promedio de los números pares es: "+media_pares);

    }
}
