package Conexion;
import java.sql.*;
/**
 *
 * @author Angel Alexander Jimenez
 */


/**
 * Esta clase esta encargada de la conexion con la base de datos 
 * 
 */
public class Conexion {
    
    private static final String SET_SSL = "?autoReconnect=true&useSSL=false";
    private static final String DB = "consejo_comunal_db" + SET_SSL;
    private static final String USUARIO = "root";
    private static final String CLAVE = "alexander";
    private static final String URL = "jdbc:mysql://localhost:3306/" + DB;
    public static Connection con = null;
    public static PreparedStatement pstm = null;
    public static ResultSet rs = null;
    
    /**
     * este metodo realiza la conexion con la base de datos 
     * @return un objeto de tipo conexion el cual sera usado en las 
     * que hereden de esta para hacer uso de los metodos necesarios para
     * que el sistema en si gestione planificadamenta la base de datos
     */
    public static Connection getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL,USUARIO,CLAVE);
            System.out.println("Conexion ON");
        } catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {}
      return con;  
    }
    
    /**
     * este metodo tiene como funcion cerrar la base de datos por cada consulta
     * que realicen las clases hijas de esta
     */
    public static void CloseConexion(){
        try {
            con.close();
            System.out.println("Conexion OFF");
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
    /**
     * Este metodo se encargara de ejecutar las consulta de tipo
     * INSERT,UPDATE y DELETE y recibe un objeto para realizar consultas
     * preparadas y evitar inyecciones SQL maliciosas
     * 
     * @param pstm un objeto PreparedStatement
     * @throws java.sql.SQLException por si algo fue mas con la consulta 
     */
    public static void ExecuteInsert(PreparedStatement pstm)throws SQLException{
        pstm.execute();
    }
    
    /**
    * Este metodo se encargara de ejecutar las consulta de tipo
     * SELECT y recibe un objeto para realizar consultas
     * preparadas y evitar inyecciones SQL maliciosas
     * @return Un objeto tipo resulset con los datos provenientes de la base de
     * datos
     * @param pstm pstm un objeto PreparedStatement
     * @throws java.sql.SQLException por si algo fue mas con la consulta 
     */
    public static ResultSet ExecuteSearch(PreparedStatement pstm)throws SQLException{
         return pstm.executeQuery();
    }
}