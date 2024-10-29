import java.util.Random;
import java.util.Scanner;

public class Instruccion_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int n;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;



        do {
            System.out.println("Cuántas veces se lanza el dado: ");
            n = sc.nextInt();
        } while(n<=0);

        sc.close();

        for (int i=0; i<n; i++){
            int cara = r.nextInt(6)+1;
            if (cara == 1) c1++;
            else if (cara == 2) c2++;
            else if (cara == 3) c3++;
            else if (cara == 4) c4++;
            else if (cara == 5) c5++;
            else c6++;
        }

        System.out.println("Ha salido el 1 "+c1+" veces.");
        System.out.println("Ha salido el 2 "+c2+" veces.");
        System.out.println("Ha salido el 3 "+c3+" veces.");
        System.out.println("Ha salido el 4 "+c4+" veces.");
        System.out.println("Ha salido el 5 "+c5+" veces.");
        System.out.println("Ha salido el 6 "+c6+" veces.");


    }
}
