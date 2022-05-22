import java.util.ArrayList;

public class ServicioClinica {//irán la funcionalidades de los clientes
    protected ArrayList<Cita> citas = new ArrayList<>();


    public void AgregarCita(Cita citaUsuario) {

       // if (validarUsuario(citaUsuario)) {
            this.citas.add(citaUsuario);
       // } else {
            System.out.println("El usuario ya se encuentra registrado");
       // }
    }

//    private boolean validarUsuario(Cita citaUsuario) {
//
//        try {
//            int indice;
//            while (this.citas.get(indice).getUsuario().getNumeroCCSS() == (citaUsuario.getUsuario().getNumeroCCSS())){
//
//            }
//            for (int i = 0; i <= this.citas.size(); i++) {
//                if (this.citas.size() == 0) {
//                    return true;
//                }
//                if () {
//                    return false;
//                }
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Error al agregar cita " + e.getMessage());
//
//        }
//        return false;
//    }

    public void buscarUsuario(int idCCSS) {

        for (int i = 0; i < this.citas.size(); i++) {
            if (idCCSS == this.citas.get(i).getUsuario().getNumeroCCSS()) {
                System.out.println("Nombre: " + this.citas.get(i).getUsuario().getNombre());
                System.out.println("Numero CCSS: " + this.citas.get(i).getUsuario().getNumeroCCSS());
                System.out.println("Edad: " + this.citas.get(i).getUsuario().getEdad());
                System.out.println("Direccion: " + this.citas.get(i).getUsuario().getDireccion());
                System.out.println("Hora: " + this.citas.get(i).getHora());
                break;
            } else {
                System.out.println("No hay resultados de su búsqueda");
            }
        }

    }

}
