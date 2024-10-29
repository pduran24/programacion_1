import java.util.Scanner;

public class Potencias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int cont = 0;

        System.out.print("Introducir un número: ");
        num1 = sc.nextInt();


        do {



            num1%=2;
            cont++;

        } while(num1 % 2 == 0);

        System.out.println(cont);








    }
}
