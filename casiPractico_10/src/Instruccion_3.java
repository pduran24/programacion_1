import java.util.Scanner;

public class Instruccion_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int articulos;
        int precio;
        double descuento;
        double costo;
        double costo_total = 0;

        do {
            System.out.print("Introducir el número de artículos que desea adquirir: ");
            articulos = sc.nextInt();
        }while (articulos <= 0);

        for (int i=1; i<=articulos; i++){
            System.out.print("Precio del artículo "+i+": ");
            precio = sc.nextInt();

            if (precio>=200) descuento = 0.85;
            else if (precio>100)  descuento = 0.88;
            else descuento = 0.9;

            costo = precio * descuento;
            costo_total += costo;

            System.out.println("El costo del artículo "+i+" es: "+costo+" € ya que su descuento es del "+(1-descuento)+".");

        }

        System.out.println("El costo total a pagar por los "+articulos+" artículo/s es de "+costo_total+" €.");


        sc.close();

    }
}
