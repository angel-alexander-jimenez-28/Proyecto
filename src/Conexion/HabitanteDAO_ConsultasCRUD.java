/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import static Conexion.Conexion.con;
import static Conexion.Conexion.getConexion;
import static Conexion.Conexion.pstm;
import static Conexion.Conexion.rs;
import Modelo.UsuarioVO;
import java.sql.SQLException;

/**
 *
 * @author Angel Alexander Jimenez
 * 
 */
public class HabitanteDAO_ConsultasCRUD extends Conexion{
    
    
    private static boolean Existe(UsuarioVO usuario) throws SQLException {
        String sql = "SELECT * FROM habitante WHERE id_cedula_h=? ";
        pstm = con.prepareStatement(sql);
        pstm.setString(1, usuario.getCedula());
        rs = ExecuteSearch(pstm);
        if(rs.next()) return true;
        else return false;
    }
    
    public static boolean Registrar(UsuarioVO usuario) {
        con = getConexion();
        String sql="INSERT INTO usuario"
                 + "(id_Usuario_Cedula,"
                 +   "Primer_Nombre,Segundo_Nombre,"
                 +   "Primer_Apellido,Segundo_Apellido,"
                 +   "Correo,Nombre_Acceso,Clave_Acceso)"
                 + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            if(!Existe(usuario)){
                pstm = con.prepareStatement(sql);
                pstm.setString(1, usuario.getCedula());
                pstm.setString(2, usuario.getNombre1());
                pstm.setString(3, usuario.getNombre2());
                pstm.setString(4, usuario.getApellido1());
                pstm.setString(5, usuario.getApellido2());
                pstm.setString(6, usuario.getCorreo());
                pstm.setString(7, usuario.getNombreUsuario());
                pstm.setString(8, usuario.getClaveUsuario());
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
