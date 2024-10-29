import java.util.Scanner;

public class Instruccion_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ninios;
        int ninias;

        System.out.println("Introducir el número de niños: ");
        ninios = sc.nextInt();
        System.out.println("Introducir el número de niñas: ");
        ninias = sc.nextInt();

        System.out.println("El porcentaje de niños es: "+c_ninios(ninios,total(ninios,ninias)));
        System.out.println("El porcentaje de niñas es: "+c_ninias(ninias,total(ninios,ninias)));

        sc.close();
    }

    public static int total(int x, int y){
        int total = x + y;
        return total;
    }

    public static double c_ninios(int x,int t){
        double p_ninios;
        p_ninios = (x*100)/t;
        return p_ninios;
    }

    public static double c_ninias(int y, int t){
        double p_ninias;
        p_ninias = (y*100)/t;
        return p_ninias;
    }
}

