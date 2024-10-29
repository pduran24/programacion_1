import java.util.Random;
import java.util.Scanner;

public class Instruccion_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arma_jugador;
        Random r = new Random();

        int punt_jug = 0;
        int punt_maq = 0;

        do {
            do {
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("Elige tu arma: \n 0-Piedra \n 1-Papel \n 2-Tijeras");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooo");
                arma_jugador = sc.nextInt();
                System.out.println("--------------------------------------------------");

            } while (arma_jugador != 0 && arma_jugador != 1 && arma_jugador != 2);

            int aleatorio = r.nextInt(3);
            System.out.println(aleatorio);

            if (aleatorio != arma_jugador){
                if (aleatorio == 0 ){
                    if (arma_jugador == 2) punt_jug+=1;
                    else punt_maq+=1;
                }
                else if (aleatorio == 1){
                    if (arma_jugador == 2) punt_jug+=1;
                    else punt_maq+=1;
                }
                else {
                    if (arma_jugador == 0) punt_jug+=1;
                    else punt_maq+=1;
                }

                System.out.println("Arma jugador: "+punt_jug+" | Arma máquina: "+punt_maq);
                System.out.println("----------------------------------------------------");
            }
            else{
                System.out.println("----EMPATE----");
                System.out.println("--------------------------------------------------");
            }

        } while (punt_maq<3 && punt_jug<3);

        if (punt_maq == 3) System.out.println("Gana la máquina.");
        else System.out.println("Tú ganas.");

    }
}
