import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float calif;
        do {
            System.out.print("Introducir la calificación entre 0 y 10: ");
            calif = sc.nextFloat();
        }while(calif<0 || calif>10);

        if (0<=calif && calif<4){
            System.out.println("Insuficiente");
        }else if (4<=calif && calif<6){
            System.out.println("Regular");
        }else if (6<=calif && calif<7){
            System.out.println("Bien");
        }else if (7<=calif && calif<9){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }
        //SIEMPRE CERRAR EL SCANNER
        sc.close();
    }
}
