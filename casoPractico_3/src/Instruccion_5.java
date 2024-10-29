import java.util.Scanner;

public class Instruccion_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de alumnos: ");
        int alumnos = sc.nextInt();
//      double[] calif = new double[alumnos];
        double suma;
        double suma2 = 0;
        double promedio;
/*
        for(int i=0;i<alumnos;i++){
            System.out.print("Introducir la calificación del alumno "+(i+1)+": ");
            calif[i] = sc.nextDouble();
            suma += calif[i];
        }

        promedio = suma/alumnos;

        System.out.println("El promedio es: "+promedio);
*/

        for (int i=0;i<alumnos;i++){
            System.out.print("Introducir la nota del alumno "+(i+1)+": ");
            suma = sc.nextDouble();
            suma2 += suma;
        }

        promedio = suma2/alumnos;
        System.out.println("El promedio es: "+promedio);

        sc.close();
    }
}
