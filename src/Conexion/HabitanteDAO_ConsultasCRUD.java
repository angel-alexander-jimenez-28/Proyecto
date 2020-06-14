package Conexion;
import static Conexion.Conexion.con;
import static Conexion.Conexion.getConexion;
import static Conexion.Conexion.pstm;
import static Conexion.Conexion.rs;
import Modelo.HabitanteVO;
import java.sql.SQLException;

/**
 *
 * @author Angel Alexander Jimenez
 * 
 */
public class HabitanteDAO_ConsultasCRUD extends Conexion{
    
    
    private static boolean Existe(HabitanteVO habitante) throws SQLException {
        String sql = "SELECT * FROM habitante WHERE id_cedula_h=? ";
        pstm = con.prepareStatement(sql);
        pstm.setString(1, habitante.getCedula());
        rs = ExecuteSearch(pstm);
        if(rs.next()) return true;
        else return false;
    }
    
    public static boolean Registrar(HabitanteVO habitante) {
        con = getConexion();
        String sql="INSERT INTO habitante"
                 + "(id_cedula_h,"
                 +   "Primer_Nombre,Segundo_Nombre,"
                 +   "Primer_Apellido,Segundo_Apellido,"
                 +   "Fecha_Nacimiento,Edad)"
                 + "VALUES(?,?,?,?,?,?,?)";
        try {
            if(!Existe(habitante)){
                pstm = con.prepareStatement(sql);
                pstm.setString(1, habitante.getCedula());
                pstm.setString(2, habitante.getPrimerNombre());
                pstm.setString(3, habitante.getSegundoNombre());
                pstm.setString(4, habitante.getPrimerApellido());
                pstm.setString(5, habitante.getSegundoApellido());
                pstm.setString(6, habitante.getFechaNacimiento());
                pstm.setInt   (7, habitante.getEdad());
                ExecuteInsert(pstm);
                return true;
            }else return false;
        } catch (SQLException e) {
            System.err.println("en el insert "+e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
}
