import java.util.Scanner;

public class Instruccion_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Constantes
        double tela_A = 1.5;
        double tela_B = 1.8;
        int pantalones;
        double costo_tela;


        //Variables
        String tipo;
        int talla;
        double cargo;
        double ganancia;
        double cargo_pedido;
        double ganancia_pedido;


        //Control
        boolean aceptar_tipo = false;
        boolean aceptar_talla = false;

        do {
            System.out.println("Introducir el número de pantalones (número mayor a 0): ");
            pantalones = sc.nextInt();

        } while (pantalones <= 0);

        do {
            System.out.println("Introducir el costo de la tela (número mayor a 0): ");
            costo_tela = sc.nextDouble();

        } while (costo_tela <= 0);

        do {
            System.out.print("Introducir el tipo de pantalon (A/B): ");
            tipo = sc.next();

            if (tipo.equalsIgnoreCase("A") || tipo.equalsIgnoreCase("B")) aceptar_tipo = true;

        } while (!aceptar_tipo);

        do {

            System.out.print("Introducir la talla del pantalón (30/32/36): ");
            talla = sc.nextInt();

            if (talla==30 || talla==32 || talla==36) aceptar_talla = true;

        } while (!aceptar_talla);

        if (talla == 32 || talla == 36){
            cargo = 1.04 * costo_tela;
        }

        if (tipo.equalsIgnoreCase("A")){
            cargo = 1.8 * costo_tela * tela_A * 1.30;
            ganancia = cargo / 1.3;
            cargo_pedido = 1.8 * costo_tela * tela_A * 1.30 * pantalones;
            ganancia_pedido = cargo_pedido-((cargo / 1.3) * pantalones);
        } else {
            cargo = 1.95 * costo_tela * tela_B * 1.30 * pantalones;
            ganancia = cargo / 1.3;
            cargo_pedido = 1.8 * costo_tela * tela_A * 1.30 * pantalones;
            ganancia_pedido = cargo_pedido-((cargo / 1.3) * pantalones);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("El cargo total de cada pantalón es de: "+cargo+" euros.");
        System.out.println("La ganancia por cada pantalón es de: "+ganancia+" euros.");
        System.out.println("El cargo total del pedido es de: "+cargo_pedido+" euros.");
        System.out.println("La ganancia total del pedido es de: "+ganancia_pedido+" euros.");


        sc.close();
    }
}
