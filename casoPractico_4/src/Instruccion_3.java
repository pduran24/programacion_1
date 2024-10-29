public class Instruccion_3 {

    public static void main(String[] args) {

        int suma = 0;
        int condicion;
        int se_cumple = 0;

        for (int i=20;i<3501;i++){
            condicion = (i*(i+1))/2;
            if (condicion%7==0){
                suma+=i;
                se_cumple++;
            }
        }

        System.out.println("Suma de números entre 20 y 3500 múltiplos de 7: "+suma);
        System.out.println("Número de números que cumplen la condición: "+se_cumple);

    }
}
