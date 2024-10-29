import java.util.Scanner;

public class Adivinar_num {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 1000;
        int num2;
        boolean acierto = false;
        String pista;


        System.out.println("Piensa en un número entre 1 y 1000: ");

        while (!acierto) {

            do {
                System.out.println("El número es mayor de "+mitad(num1)+"? (si/no)");
                pista = sc.next();

                num2 = mitad(num1);

            } while(!(pista.equalsIgnoreCase("si") && pista.equalsIgnoreCase("no")));

            if (pista.equalsIgnoreCase("no")){
                do {
                    System.out.println("El número es mayor de "+mitad(num2)+"?");
                } while(!(pista.equalsIgnoreCase("si") && pista.equalsIgnoreCase("no")));
            }



        }






    }

    private static int mitad(int x){
        int num;
        num = x/2;

        return num;
    }




}
