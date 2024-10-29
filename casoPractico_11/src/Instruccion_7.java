import java.util.Scanner;

public class Instruccion_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s;
        int seg;
        int min;
        int h;
        int r;

        do {
            System.out.print("Introducir el número de segundos: ");
            s = sc.nextInt();
        } while (s<=0);
        sc.close();


        h = s/3600;
        r = s%3600;

        min = r/60;
        r %= 60;

        seg = r % 60;

        System.out.println("Equivale a "+h+" horas, "+min+" minutos, "+seg+" segundos.");




    }
}
