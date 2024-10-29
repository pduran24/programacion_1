import java.util.Scanner;

public class Instruccion_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int numero;
        int numero2;
        int veces;
        String romano ="";

        do {
            System.out.println("Introducir un número menor o igual que 1000: ");
            numero2 = sc.nextInt();
            if(numero2>1000){
                System.out.println("Error. Número mayor que 1000");
            }
        }while(numero2>1000);

        numero = numero2;

        if(numero==1000){
            romano+="M";
        }


        if(numero>=900 && numero<1000){
            romano+="CM";
            numero-=900;
        }


        if (numero>=500 && numero<900){
            romano+="D";
            numero-=500;
        }


        if (numero>=400 && numero<500){
            romano+="CD";
            numero -=400;
        }


        if (numero >= 100 && numero<400){
            veces = numero/100;
            for (int i=0;i<veces;i++){
                romano+="C";
                numero-=100;
            }
        }


        if (numero>=90 && numero<100){
            romano+="L";
            numero-=90;
        }

        if (numero>=50 && numero<90){
            romano+="L";
            numero-=50;
        }

        if (numero>=40 && numero<50){
            romano+="XL";
            numero-=40;
        }

        if (numero>=10 && numero<40){
            while(numero>=10){
                romano+="X";
                numero-=10;
            }
        }

        if (numero>=5 && numero<10){
            romano = "V";
            numero-=5;
        }

        if (numero>=1 && numero<5){
            veces = numero;
            if (numero<=3){
                for (int i=0;i<numero;i++){
                    romano+="I";

                }
            }
        }


        System.out.println("El número "+numero2+" en números romanos es: "+romano);
    }
}
