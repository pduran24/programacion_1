public class Persona {

    private String nombre;
    private int edad;


    //Constructores:
        // Método especial
        // No devuelven nada
        // Inicializan (Crean) los objetos
        //Normalmente so public
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Sobreescribes
    @Override
    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

}