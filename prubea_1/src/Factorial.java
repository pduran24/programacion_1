import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int factorial = 1;

        do {
            System.out.print("Introducir un número mayor que 0: ");
            num = sc.nextInt();
            if (num<=0){
                System.out.println("El número no cumple con las condiciones.");
                System.out.println("Introducir nuevamente el número.");
            }
        } while(num<=0);



        for(int i=1;i<=num;i++){
            factorial*=i;
        }

        System.out.println(num+"! = "+factorial);


    }
}
