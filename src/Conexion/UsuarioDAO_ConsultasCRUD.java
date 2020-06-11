package Conexion;

import Modelo.UsuarioVO;
import java.sql.SQLException;

/**
 *
 * @author Angel Alexander Jimenez
 */


/**
 *  Esta clase hereda de la clase conxion por la tanto tiene la habilidad
 *  de conectar y modificar datos en la base de datos el Sufijo DAO se uso
 *  como estandar dentro de este proyecto para hacer referencia Modelo de 
 *  Datos del Objeto de la clase UsuarioVO. _ConsultasCRUD como su nombre
 *  bien nos dice esta clase solo realiza consultas de tipo INSERT,READ
 *  UPDATE, DELETE en terminos de sintaxis SQL pero CRUD hace referencia a
 *  CREATE,READ,UPDATE y DELETE - CRUD (4 operaciones elementales)
 *   SOLO  para objetos de creados de la clase UsuarioVO  SOLO 
 */
public class UsuarioDAO_ConsultasCRUD extends Conexion{
    
    
    /**
     * Este metodo solo se encarga de escribir los datos de un nuevo usuario
     * dentro de la base de datos
     * 
     * @param  usuario un objeto de la clase UsuarioVO
     * @return true en caso de que todo haya ido bien sino return false
     */
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
    
    /**
     * Este metodo solo se encarga de reescribir los datos de un usuario
     * existente dentro de la base de datos
     * 
     * @param  usuario un objeto de la clase UsuarioVO
     * @return true en caso de que todo haya ido bien sino return false
     */
    public static boolean Modificar(UsuarioVO usuario) {
        con = getConexion();
        String sql = "UPDATE tabla SET campos WHERE id=condicion ";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            CloseConexion();
        }
    }
    
    /**
     * Este metodo solo se encarga de eliminar los datos de un usuario
     * existente dentro de la base de datos
     * 
     * @param  usuario un objeto de la clase UsuarioVO
     * @return true en caso de que todo haya ido bien sino return false
     */
    public static boolean Eliminar(UsuarioVO usuario) {
        con = getConexion();
        String sql = "DELETE FROM producto WHERE id=? ";
        try {
            pstm = con.prepareStatement(sql);
            pstm.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            CloseConexion();
        }
    }
    
    /**
     * Este metodo solo se encarga verificar los datos de un usuario
     * existente dentro de la base de datos este metodo esta privado
     * ya que solo es usado dentro de la clase
     * 
     * @param  usuario un objeto de la clase UsuarioVO
     * @return true en caso de existir el usuario lo contrario return false
     */
    private static boolean Existe(UsuarioVO usuario) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE id_Usuario_Cedula=? ";
        pstm = con.prepareStatement(sql);
        pstm.setString(1, usuario.getCedula());
        rs = ExecuteSearch(pstm);
        if(rs.next()) return true;
        else return false;
    }
    
    /**
     * Este metodo solo se encarga verificar los datos de un usuario
     * existente dentro de la base de datos este metodo es publico
     * ya que es para hacer validaciones en clases externas
     * 
     * @param  usuario un String que hace referencia a un usuario
     * @param  clave un String que hace referencia a la clave de dicho usuario
     * @return true en caso de existir el usuario lo contrario return false
     */
    public static boolean ExisteUsuario(String usuario,String clave){
        String sql = "SELECT * FROM usuario WHERE Nombre_Acceso=? AND Clave_Acceso=? ";
        con = getConexion();
        try{
            pstm = con.prepareStatement(sql);
            pstm.setString(1, usuario);
            pstm.setString(2, clave);
            rs = ExecuteSearch(pstm);
            if(rs.next()) return true;
            else return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            CloseConexion();
        }
    }
}
