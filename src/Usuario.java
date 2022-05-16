public class Usuario {
    private String nombre;
    private int numeroCCSS;
    private int edad;
    private String direccion;
     //Constructor de los datos del usuario
    public Usuario(String nombre, int numeroCCSS, int edad, String direccion) {
        this.nombre = nombre;
        this.numeroCCSS = numeroCCSS;
        this.edad = edad;
        this.direccion = direccion;
    }

    //setters and getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCCSS() {
        return numeroCCSS;
    }

    public void setNumeroCCSS(int numeroCCSS) {
        this.numeroCCSS = numeroCCSS;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
