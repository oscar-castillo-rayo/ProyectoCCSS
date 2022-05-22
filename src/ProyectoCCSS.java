import java.sql.SQLException;

public class ProyectoCCSS {
    public static void main(String[] args) throws SQLException {
        Usuario usuario1 = new Usuario(1,"Oscar",28,"Horquetas");
        Usuario usuario2 = new Usuario(2,"Elvin",24,"Ticari");
        Usuario usuario3 = new Usuario(3,"Jason",29,"Las Chaves");
        Usuario usuario4 = new Usuario(4,"Gilberto",35,"la rambla");

        ConectorBD usuarioBD = new ConectorBD();
        //usuarioBD.insertarUsuario(usuario1);
        //usuarioBD.eliminarUsuario(usuario1);
        usuarioBD.verUsuarios();


    }

}
