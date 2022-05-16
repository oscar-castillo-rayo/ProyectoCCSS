public class ProyectoCCSS {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Oscar",1099309373,28,"Horquetas");
        Usuario usuario2 = new Usuario("Elvin",305540448,24,"Ticari");
        Cita cita1 = new Cita(usuario1,"11");
        Cita cita2 = new Cita(usuario2,"12");
        ServicioClinica servClin = new ServicioClinica();
        //servClin.setCitas(cita1);
        servClin.AgregarCita(cita1);
        servClin.AgregarCita(cita2);
        servClin.mostrarUsuario();

    }

}
