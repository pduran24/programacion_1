import java.util.Scanner;

public class Instruccion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio;
        double area;

        System.out.print("Introduzca el radio: ");
        radio = sc.nextDouble();

        if (radio<0){
            System.out.println("Radio negativo. Error");
            do {
                System.out.print("Introduzca la altura nuevamente: ");
                radio = sc.nextDouble();
            }while(radio<0);
        }

        area = Math.round(Math.PI*radio*radio*1000)/1000;
        System.out.println("El área del triángulo es: "+area+" metros cuadrados");

        sc.close();
    }
}
