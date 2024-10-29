import java.util.Scanner;

public class Chatgpt_bucles_2 {
    /*3. Contar hasta N:
    Escribe un programa que cuente desde 1 hasta un número N que el usuario ingrese, pero que omita los números múltiplos de 3.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Ingresar un número: ");
        num = sc.nextInt();

        for (int i=1; i<=num;i++){
            if(i%3==0){
                System.out.print(" "+i);
            }
        }
    }
}
