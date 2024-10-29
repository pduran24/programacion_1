import java.util.Scanner;

public class Instruccion_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        int quinientos = 0;
        int dos = 0;

        System.out.println("Introducir la cantidad: ");
        cantidad = sc.nextInt();


        if (cantidad>=500){

            while(cantidad>500){
                quinientos++;
                cantidad-=500;
            }
            System.out.println("Billetes de 500: "+quinientos);
        }
        if (cantidad>=200 && cantidad<500){

            cantidad-=200;
            System.out.println("Billetes de 200: 1");
        }
        if (cantidad>=100 && cantidad<200){

            cantidad-=100;
            System.out.println("Billetes de 100: 1");
        }
        if (cantidad>=50 && cantidad<100){

            cantidad-=50;
            System.out.println("Billetes de 50: 1");
        }
        if (cantidad>=20 && cantidad<50){

            cantidad-=20;
            System.out.println("Billetes de 20: 1");
        }
        if (cantidad>=10 && cantidad<20){

            cantidad-=10;
            System.out.println("Billetes de 10: 1");
        }
        if (cantidad>=2 && cantidad<10){
            while(cantidad>2){
                dos++;
                cantidad-=2;
            }
            System.out.println("Monedas de 20: "+dos);
        }

        if (cantidad>=1 && cantidad<2){

            cantidad-=1;
            System.out.println("Monedas de 1: 1");
        }



    }
}
