import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double mayor;
        double menor;
        double division;

        do {
            System.out.print("Introducir un número: ");
            num1 = sc.nextDouble();
            System.out.print("Introducir otro número: ");
            num2 = sc.nextDouble();
        }while(num1==0 || num2==0);

        if(num1>num2){
            mayor=num1;
            menor=num2;
        }else{
            mayor=num2;
            menor=num1;
        }

        division = mayor/menor;

        System.out.println("El resultado es: "+division);
    }
}
