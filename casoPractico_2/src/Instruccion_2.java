import java.util.Scanner;

public class Instruccion_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //declaro las variables
        double base;
        double altura;
        double area;
        //Imprimo y compruebo. Lo hago separado para que aparezca el mensaje de error.
        System.out.println("Introduzca la base: ");
        base = sc.nextDouble();
        if (base<0){
            System.out.println("Base negativa. Error");
            do {
                System.out.print("Introduzca la base nuevamente: ");
                base = sc.nextDouble();
            }while(base<0);
        }

        System.out.println("Introduzca la altura: ");
        altura = sc.nextDouble();

        if (altura<0){
            System.out.println("Altura negativa. Error");
            do {
                System.out.print("Introduzca la altura nuevamente: ");
                altura = sc.nextInt();
            }while(altura<0);
        }

        area = (base*altura)/2;
        System.out.println("El área del triángulo es: "+area+" metros cuadrados");

        sc.close();
    }
}
