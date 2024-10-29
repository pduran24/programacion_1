public class Ejercicio_5 {
    public static void main(String[] args) {

        int cont=0;
        int cont2=0;
        int cont3=0;

        for(int i=1;i<=100;i++){
            if (i%2==0 || i%3==0){
                cont+=1;
            }
            if(i%2==0){
                cont2+=1;
            }
            if(i%3==0){
                cont3+=1;
            }
        }
        System.out.println("Número de múltiplos de 2 o 3: "+cont);
        System.out.println("------------------------------------");
        System.out.println("Múltiplos de 2 "+cont2);
        System.out.println("Múltiplos de 3 "+cont3);
    }
}
