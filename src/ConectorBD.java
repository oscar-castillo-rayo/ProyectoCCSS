import java.sql.*;

public class ConectorBD {
    private PreparedStatement comando_BaseDatos;
    private Statement declaracion;
    private Connection conecccion;

    public ConectorBD() throws SQLException {
        String direcionBD = "jdbc:mysql://localhost:3306/datos_ccss";
        String usuarioBD = "root";
        String contrasenia = "Omcr.251293";

        conecccion = DriverManager.getConnection(direcionBD, usuarioBD, contrasenia);
        declaracion = conecccion.createStatement();
    }

    public void insertarUsuario(Usuario usuario) {
        try {
            comando_BaseDatos = conecccion.prepareStatement("insert into usuarios (id_usuario,nombre,edad, direccion)values(?,?,?,?)");
            comando_BaseDatos.setInt(1, usuario.getNumeroCCSS());
            comando_BaseDatos.setString(2, usuario.getNombre());
            comando_BaseDatos.setInt(3, usuario.getEdad());
            comando_BaseDatos.setString(4, usuario.getDireccion());
            comando_BaseDatos.executeUpdate();
        } catch (Exception exception) {
            System.out.println("Error en base de datos " + exception.getMessage());
        }
    }

    public void verUsuarios(){
        try {
            comando_BaseDatos=conecccion.prepareStatement("select * from usuarios");
            comando_BaseDatos.executeQuery();
        }catch (Exception exception){
            System.out.println("Error al mostrar usuarios " + exception.getMessage());
        }
    }


    public void eliminarUsuario(Usuario usuario) {
        try{
            comando_BaseDatos = conecccion.prepareStatement("delete from usuarios where id_usuario = "+ usuario.getNumeroCCSS());
            comando_BaseDatos.executeUpdate();
        }catch(Exception exception){
            System.out.println("Error al eliminar datos " + exception.getMessage());
        }
    }




}
