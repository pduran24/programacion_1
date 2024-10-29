import java.util.Scanner;

public class Instruccion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        double promedio;
        int pares = 0;
        int impares = 0;
        int n_imp = 0;
        int suma = 0;

        for (int i=0; i<11;i++){
            System.out.println("Introducir un número: ");
            numero = sc.nextInt();
            if(numero%2==0){
                pares++;
            }else{
                impares += numero;
                n_imp++;
            }
            suma +=numero;
        }
        promedio = impares*1.0/n_imp;
        System.out.println("Pares: "+pares);
        System.out.println("Suma: "+suma);
        System.out.println("Promedio: "+promedio);


        sc.close();
    }
}
