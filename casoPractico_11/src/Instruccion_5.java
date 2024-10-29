import java.util.Scanner;

public class Instruccion_5 {
    public static void main(String[] args) {


        double c;

        for (double f=0; f<=100; f+=5){
            c = (f - 32) * 5*1.0/9;

            System.out.printf(f+"F -> "+c+"C\n");

        }

    }
}
