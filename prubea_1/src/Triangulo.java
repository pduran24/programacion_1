import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Introducir un número: ");
            num = sc.nextInt();
        }while(num<0);

        for(int i=1;i<=num;i++){
            System.out.println("");
            for(int j=i;j<=num;j++){
                System.out.print("*");
            }
        }
        sc.close();
    }
}
