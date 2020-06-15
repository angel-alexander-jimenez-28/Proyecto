package Conexion;
import static Conexion.Conexion.con;
import static Conexion.Conexion.getConexion;
import static Conexion.Conexion.pstm;
import static Conexion.Conexion.rs;
import Modelo.HabitanteVO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

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
    
    public static DefaultTableModel habitantesTabulados(){
        
        ArrayList<HabitanteVO> habitantes = new ArrayList<>();
        String[][] datosHabitantes; 
        try {
            String sql = "SELECT * FROM habitante";
            con = getConexion();
            pstm = con.prepareStatement(sql);
            rs = ExecuteSearch(pstm);
            while(rs.next()){
                habitantes.add(
                    new HabitanteVO(
                        rs.getString("id_cedula_h"),
                        rs.getString("Primer_Nombre"),
                        rs.getString("Segundo_Nombre"),
                        rs.getString("Primer_Apellido"),
                        rs.getString("Segundo_Apellido"),
                        rs.getString("Fecha_Nacimiento"),
                        rs.getInt("Edad"))
                );
            } datosHabitantes = new String[habitantes.size()][7];
            
            for(int i = 0;i < habitantes.size() ; i++){
                datosHabitantes[i][0] = habitantes.get(i).getCedula();
                datosHabitantes[i][1] = habitantes.get(i).getPrimerNombre();
                datosHabitantes[i][2] = habitantes.get(i).getSegundoNombre();
                datosHabitantes[i][3] = habitantes.get(i).getPrimerApellido();
                datosHabitantes[i][4] = habitantes.get(i).getSegundoApellido();
                datosHabitantes[i][5] = habitantes.get(i).getFechaNacimiento();
                datosHabitantes[i][6] = ""+habitantes.get(i).getEdad();
            }
            
            return new DefaultTableModel(
                    datosHabitantes,
                    new String[]{
                        "Cedula",
                        "1er Nombre","2do Nombre",
                        "1er Apellido","2do Apellido",
                        "F. Nacimiento","Edad"
                    }
                );
            
        } catch (SQLException ex) {
            Logger.getLogger(HabitanteDAO_ConsultasCRUD.class.getName()).log(Level.SEVERE, null, ex);
            return new DefaultTableModel(
                    new Object[][]{
                        
                    },new Object[]{
                        "algo","salio","muy","mal"
                });
        }
    }
}
