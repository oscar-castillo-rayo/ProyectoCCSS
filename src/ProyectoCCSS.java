public class ProyectoCCSS {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Oscar",1099309373,28,"Horquetas");
        Usuario usuario2 = new Usuario("Elvin",305540448,24,"Ticari");
        Usuario usuario3 = new Usuario("Jason",103550888,29,"Las Chaves");
        Cita cita1 = new Cita(usuario1,"11");
        Cita cita2 = new Cita(usuario2,"12");
        Cita cita3 = new Cita(usuario3,"1:30");
        ServicioClinica servClin = new ServicioClinica();
        //servClin.setCitas(cita1);
        servClin.AgregarCita(cita1);
        servClin.AgregarCita(cita2);
        servClin.AgregarCita(cita3);
        servClin.mostrarUsuario();

    }

}
