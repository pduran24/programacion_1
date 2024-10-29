public class Test {

    public static void main(String[] args) {

        Persona p1 = new Persona("Aquiles", 25);
        Persona p2 = new Persona("Frodo", 45);

        System.out.println("Nombre: "+p1.getNombre()+" , Edad: "+p1.getEdad()+" años");

        p2.setEdad(29);

        System.out.println(p2.toString());

    }

}
