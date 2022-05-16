public class Cita {
    private Usuario usuario;
    private String hora;

    //Contructor recibe el usuario y la hora que apartará
    public Cita(Usuario usuario, String hora) {
        this.usuario = usuario;
        this.hora = hora;
    }

    //setters and getters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
