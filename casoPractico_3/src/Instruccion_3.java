import java.util.Scanner;

public class Instruccion_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double sueldo_base;
        double sueldo_liquido;

        System.out.print("Introducir su nombre: ");
        nombre = sc.nextLine();
        do {
            System.out.print("Introducir su sueldo: ");
            sueldo_base = sc.nextDouble();
        }while(sueldo_base<0);

        sueldo_liquido = 0.8*sueldo_base;

        System.out.println("Nombre: "+nombre+"Sueldo: "+sueldo_liquido+" euros.");


        sc.close();
    }
}
