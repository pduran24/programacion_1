import java.util.Scanner;

public class Instruccion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        double j=3;
        double suma_a_mayor = 0;
        double suma_iguales = 0;
        double suma_a_menor = 0;

        System.out.println("Introducir un número a: ");
        a = sc.nextInt();
        System.out.println("Introducir un número b: ");
        b = sc.nextInt();

        if (a>b){
            for(int i=100;i<1001;i++){
                if((i*(i+1)/5)%5==0){
                    suma_a_mayor+=i;
                }
            }
            System.out.println(suma_a_mayor);
        } else if (a==b) {
            for (double i=1;i<46;i+=4){
                suma_iguales += (i/a);
            }
            System.out.println(suma_iguales);
        } else{
            for (double i=2;i<21;i+=2){
                suma_a_menor = (b-a) * Math.pow(i,j);
                j+=3;
            }
            System.out.println(suma_a_menor);
        }

        sc.close();
    }
}
