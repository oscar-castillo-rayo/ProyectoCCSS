import java.util.ArrayList;

public class ServicioClinica {
    private ArrayList<Cita> citas = new ArrayList<>();


    public void AgregarCita(Cita citaUsuario) {
        this.citas.add(citaUsuario);
    }

    public void mostrarUsuario() {
        for (int i = 0; i < this.citas.size(); i++) {

            System.out.println("Nombre: " + this.citas.get(i).getUsuario().getNombre());
            System.out.println("Numero CCSS: " + this.citas.get(i).getUsuario().getNumeroCCSS());
            System.out.println("Edad: " + this.citas.get(i).getUsuario().getEdad());
            System.out.println("Direccion: " + this.citas.get(i).getUsuario().getDireccion());
            System.out.println("Hora: " + this.citas.get(i).getHora());
        }
    }

}
