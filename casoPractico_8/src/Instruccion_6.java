
import java.util.Scanner;
public class Instruccion_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introducir un número a convertir: ");
        num = sc.nextInt();
        System.out.println("El número "+num+" en binario es: "+binario(num));
        System.out.println("El número "+num+" en octal es: "+octal(num));
        System.out.println("El número "+num+" en hexadecimal es: "+hexadecimal(num));
        sc.close();
    }
    public static int binario (int b){
        int serie_restos = 0;
        int divisor = 2;
        int factor = 1;
        while (b>0){
            int resto = b % divisor;
            serie_restos += resto * factor;
            factor *= 10;
            b /= divisor;
        }
        return serie_restos;
    }
    public static int octal (int o){
        int serie_restos = 0;
        int divisor = 8;
        int factor = 1;
        while (o>0){
            int resto = o % divisor;
            serie_restos += resto * factor;
            factor *= 10;
            o/=divisor;
        }
        return serie_restos;
    }
    public static String hexadecimal (int h){
        String serie_restos = "";
        int divisor = 16;
        int factor = 1;
        int resto;

        String hex = "";
        while (h>0){
            resto = h % divisor;
            h /= 16;

            switch (resto){
                case 0,1,2,3,4,5,6,7,8,9 -> serie_restos = resto + serie_restos;
                case 10 -> serie_restos = "A" + serie_restos;
                case 11 -> serie_restos = "B" + serie_restos;
                case 12 -> serie_restos = "C" + serie_restos;
                case 13 -> serie_restos = "D" + serie_restos;
                case 14 -> serie_restos = "E" + serie_restos;
                case 15 -> serie_restos = "F" + serie_restos;

            }
        }

        return serie_restos;
    }

    /*public static int invertir(int inv){
        int invertido = 0;
        int digito;
        while (inv!=0){
        digito = inv%10;
        invertido = invertido*10 + digito;
        inv/=10;
        }
        return invertido;
        }*/
}






