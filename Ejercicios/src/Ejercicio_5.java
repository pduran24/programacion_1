import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mes;
        double importe;
        double pago;
        String octubre = "octubre";

        //Si quiero leeer primero el double antes que el String:
        //double importe = Double.parseDouble(sc.nextLine());

        System.out.print("Introducir un mes: ");
        mes = sc.next();
        //mes.toLowerCase(); Poniendo el IgnoreCase() no hará falta
        System.out.print("Introducir un importe: ");
        importe = sc.nextFloat();

        if(mes.equalsIgnoreCase(octubre)){
            pago = importe-(0.15*importe);
        }else{
            pago = importe;
        }

        System.out.println("El pago a realizar es de "+pago+" euros");

        sc.close();
    }
}
