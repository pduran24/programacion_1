import java.util.Scanner;

public class Instruccion_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int dig = 1;
        int suma = 0;
        boolean digitos = false;

        do {
            System.out.println("Introducir el número a determinar: ");
            num = sc.nextInt();
        } while (num<=0);



        //Determino los dígitos, para saber la potencia:
        while (!digitos){

            int aux = 10;

            if (num/aux > 0) {
                dig++;
                aux  = aux * 10;
            }
            else digitos = true;

        }

        System.out.println(dig);

        //Recorro el número para calcular la suma:
        for (int i=1; i<=dig; i++){
            int aux = 10;
            int resto = num%aux;

            suma = (int) (suma + (Math.pow(resto,dig) ));

            aux *= 10;
        }

        if (suma == num) System.out.println("El número "+num+" es narcisista");
        else System.out.println("No es narcisista.");



    }
}
