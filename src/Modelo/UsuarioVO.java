package Modelo;
/**
 *
 * @author Angel Alexander Jimenez
 */

/**
 * Esta clase solo es la estructura de datos necesaria para el almacenamiento
 * de datos de usuarios en la base de datos la cual posee logicamente la misma
 * structura el sufijo VO - VALUES OBJECT hace referencia a dicho concepto
 * VALORES DE OBJETO que en este caso se condiciona para usuarios
 */
public class UsuarioVO {
    
    // datos generales de la persona 
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String cedula;
    private String correo;
    
    // datos como usuario
    
    private String nombreUsuario;
    private String claveUsuario;
    
    /**
     * constructor sin parametrizar por default
     */
    public UsuarioVO(){}

    /**
     * contructor parametrizado para rapida preparicion y manipulacion de 
     * de instancias con dato de los usuarios registrados.
     * 
     * @param nombre1 string con el valor de primer nombre del usuario
     * @param nombre2 string con el valor de segundo nombre del usuario
     * @param apellido1 string con el valor de primer apellido del usuario
     * @param apellido2 string con el valor de segundo apellido del usuario
     * @param cedula string con el valor de cedula del usuario
     * @param correo string con el valor de correo del usuario
     * @param nombreUsuario string con el valor de usuario del usuario
     * @param claveUsuario string con el valor de clave del usuario
     */
    public UsuarioVO(String nombre1,
                      String nombre2,
                      String apellido1,
                      String apellido2,
                      String cedula,
                      String correo,
                      String nombreUsuario,
                      String claveUsuario) {
        
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.claveUsuario = claveUsuario;
    }
    
    
    /**
     * Este Metodo nos devuelve el primer nombre de un usuario
     * @return String primer nombre del usuario
     */
    public String getNombre1() {
        return nombre1;
    }
    
    /**
     * Este metodo nos permite dar valor el primer nombre del usuario
     * @param nombre1 un string con el primer nombre del usuario
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * Este Metodo nos devuelve el segundo nombre de un usuario
     * @return String segundo nombre del usuario
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * Este metodo nos permite dar valor el segundo nombre del usuario
     * @param nombre2 un string con el segundo nombre del usuario
     */
    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    /**
     * Este Metodo nos devuelve el primer apellido de un usuario
     * @return String primer apellido del usuario
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Este metodo nos permite dar valor el primer apellido del usuario
     * @param apellido1 un string con el primer apellido del usuario
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * Este Metodo nos devuelve el segundo apellido de un usuario
     * @return String segundo apellido del usuario
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Este metodo nos permite dar valor el primer apellido del usuario
     * @param apellido2 un string con el segundo apellido del usuario
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Este Metodo nos devuelve el la cedula de un usuario
     * @return String cedula del usuario
     */
    public String getCedula() {
        return cedula;
    }

     /**
     * Este metodo nos permite dar valor a la cedula del usuario
     * @param cedula un string con cedula del usuario
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Este Metodo nos devuelve el correo un usuario
     * @return String correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

     /**
     * Este metodo nos permite dar valor al correo del usuario
     * @param correo un string con el correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Este Metodo nos devuelve el nombre de usuario de un usuario
     * @return String nombre de usuario de un usuario particular
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Este metodo nos permite dar valor nombre de Usuario de un usuario particular
     * @param nombreUsuario un string con el usuario del usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Este Metodo nos devuelve la clave de un usuario
     * @return String clave de un usuario
     */
    public String getClaveUsuario() {
        return claveUsuario;
    }

    /**
     * Este metodo nos permite dar valor la clave de Usuario del usuario
     * @param claveUsuario un string con la clave del usuario
     */
    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }
    
}
