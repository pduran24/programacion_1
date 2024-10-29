import java.util.Scanner;

public class Instruccion_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;

        System.out.println("Introducir un número entero: ");
        num1 = sc.nextInt();
        System.out.println("Introducir un segundo número entero: ");
        num2 = sc.nextInt();

        if (num1==num2){
            resultado = num1*num2;
        } else if(num1>num2){
            resultado = num1-num2;
        }else{
            resultado = num1+num2;
        }

        System.out.println("--------------------------------------");
        System.out.println(resultado);


        sc.close();
    }
}
