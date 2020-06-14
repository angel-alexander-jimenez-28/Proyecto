package Control;
import Modelo.UsuarioVO;
import Conexion.*;
import Modelo.HabitanteVO;
import Vista.MainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Angel Alexander Jimenez
 */

/**
 * metodos sin implementar de la interface MouseListener
 * aqui es cuando el codigo tiene a embasurarse por que
 * al implementar interface debemos sobre escribir todos
 * los metodos de la interface de momento esto se podria
 * evitar con una clase adaptadora que java ya tiene o
 * una implementada por nosotros mismo pero esto nos 
 * podria causar problemas en el numero de herencia que 
 * requerimos como sabemos java no permite herencia multiple
 * esto no es malo solo es una limitante que solo nos obliga
 * a pensar un poco mas como debemos lograr dichos objetivos
 * por ahora tal como tenemos (en cuanto el codigo requerido
 * para los objetivos de diseño y animacion de UI) esta bien
 */
public class MainWindowController
        extends MainWindow
        implements MouseListener,ActionListener{
    
    private boolean bUsuario,
                    bConfig,
                    bReportes,
                    bAcerca,
                    bandera;
    
    private String PanelSlider;
            
    private boolean PanelIngresarUsuarioActivated,
                    PanelNuevoUsuarioActivated;
    
    public MainWindowController() {
        
        bUsuario=false;
        bConfig=false;
        bReportes=false;
        bAcerca=false;
        bandera=true;
        
        PanelIngresarUsuarioActivated = true;
        PanelNuevoUsuarioActivated = false;
        
        PanelSlider = "nombres";
        BtnAnterior.setEnabled(false);
        BtnSiguiente.setEnabled(true);
        
        addListenersToButtons();
        this.setLocationRelativeTo(null);//para centrar la ventana en le monitor
        
//        SoloLetras(TxtNombreUsuario);
//        SoloLetras(TxtNombreNuevoUsuario);
        SoloLetras(TxtUnombreUno);
        SoloLetras(TxtUnombreDos);
        SoloLetras(TxtUApellidoUno);
        SoloLetras(TxtUApellidoDos);
        SoloNumeros(TxtUCedula);
    }
    
    private void addListenersToButtons(){//Activamos las escuchas a eventos
                                         //para cada boton 
        
        //eventos del raton para simular los eventos hover de html
        BtnUsuario.addMouseListener(this);
        BtnConfiguracion.addMouseListener(this);
        BtnReportes.addMouseListener(this);
        BtnAcerca.addMouseListener(this);
        
        //evento de botones para gestionar cuando un boton es presionado
        BtnUsuario.addActionListener(this);
        BtnConfiguracion.addActionListener(this);
        BtnReportes.addActionListener(this);
        BtnAcerca.addActionListener(this);
        
        
        BtnPanelNuevoUsuario.addActionListener(this);
        BtnPanelIngresarUsuario.addActionListener(this);
        BtnConfirmarUsuario.addActionListener(this);
        
        BtnSiguiente.addActionListener(this);
        BtnAnterior.addActionListener(this);
        
        BtnGuardarNuevoUsuario.addActionListener(this);
        
        Btn_Registrar.addActionListener(this);
        
        PanelMensajes.addMouseListener(this);
    }

//------------------------------------------------------------------------------    
    
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    
    // metodos que necesitamos de la interface MouseListener

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource().equals(BtnUsuario)&&BtnUsuario.isEnabled()){
            if(!bUsuario){
                Animacion.Animacion.mover_derecha(-173, 0, 1, 2, BtnUsuario);
            }
        }else if(e.getSource().equals(BtnConfiguracion)&&BtnConfiguracion.isEnabled()){
            if(!bConfig){
                Animacion.Animacion.mover_derecha(-173, 0, 1, 2, BtnConfiguracion);
            }
        }else if(e.getSource().equals(BtnReportes)&&BtnReportes.isEnabled()){
            if(!bReportes){
                Animacion.Animacion.mover_derecha(-173, 0, 1, 2, BtnReportes);
            }
        }else if(e.getSource().equals(BtnAcerca)&&BtnAcerca.isEnabled()){
            if(!bAcerca){
                Animacion.Animacion.mover_derecha(-173, 0, 1, 2, BtnAcerca);
            }
        }
    }
//------------------------------------------------------------------------------
    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(BtnUsuario)&&BtnUsuario.isEnabled()){
            if(!bUsuario)
                Animacion.Animacion.mover_izquierda(0, -176, 1, 2, BtnUsuario);
        }else if(e.getSource().equals(BtnConfiguracion)&&BtnConfiguracion.isEnabled()){
            if(!bConfig)
                Animacion.Animacion.mover_izquierda(0, -176, 1, 2, BtnConfiguracion);
        }else if(e.getSource().equals(BtnReportes)&&BtnReportes.isEnabled()){
            if(!bReportes)
                Animacion.Animacion.mover_izquierda(0, -176, 1, 2, BtnReportes);
        }else if(e.getSource().equals(BtnAcerca)&&BtnAcerca.isEnabled()){
            if(!bAcerca)
                Animacion.Animacion.mover_izquierda(0, -176, 1, 2, BtnAcerca);
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(PanelMensajes)){ // se cierra info asi misma
            OcultarInformacion("hide-msg-green-icon");
        }
    }
//------------------------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(BtnUsuario)){
            if(bandera){
                
                //desactivacion de los demas botones
                BtnConfiguracion.setEnabled(false);
                BtnReportes.setEnabled(false);
                BtnAcerca.setEnabled(false);
                
                if(!bUsuario){
                    //animaciones para el boton de turno
                    Animacion.Animacion.mover_derecha(0,490, 1, 2, BtnUsuario);
                    Animacion.Animacion.subir(380, 80, 1, 2, PanelUsuarios);
                   
                    //animaciones para los demas botones
                    Animacion.Animacion.subir(80, 10, 1, 2, BtnConfiguracion);
                    Animacion.Animacion.subir(150, 80, 1, 2, BtnReportes);
                    Animacion.Animacion.subir(220, 150, 1, 2, BtnAcerca);
                    bUsuario=true;
                    bandera=false;
                }
            }else {
                //activicion de los demas botones
                BtnConfiguracion.setEnabled(true);
                BtnReportes.setEnabled(true);
                BtnAcerca.setEnabled(true);
                
                if(bUsuario){
                    //animacion para el panel asociado al boton 
                    Animacion.Animacion.bajar(80, 400, 1, 2, PanelUsuarios);
                    
                    //animaciones para devolver los botones a su posicion original
                    Animacion.Animacion.bajar(10, 80, 1, 2, BtnConfiguracion);
                    Animacion.Animacion.bajar(80, 150, 1, 2, BtnReportes);
                    Animacion.Animacion.bajar(150, 220, 1, 2, BtnAcerca);
                    bUsuario=false;
                    bandera=true;
                }
            }
        }else if(e.getSource().equals(BtnConfiguracion)){
            if(bandera){
                
                //desactivacion de los demas botones
                BtnUsuario.setEnabled(false);
                BtnReportes.setEnabled(false);
                BtnAcerca.setEnabled(false);
                
                if(!bConfig){
                    Animacion.Animacion.mover_derecha(0,490,1,2,BtnConfiguracion);
                    Animacion.Animacion.subir(80,10,1,1,BtnConfiguracion);
                    Animacion.Animacion.subir(400, 80, 1, 2, PanelConfiguracion);
                    
                    Animacion.Animacion.subir(150, 80, 1, 2, BtnReportes);
                    Animacion.Animacion.subir(220, 150, 1, 2, BtnAcerca);
                    bConfig=true;
                    bandera=false;
                }
            }else {
                
                //activicion de los demas botones
                BtnUsuario.setEnabled(true);
                BtnReportes.setEnabled(true);
                BtnAcerca.setEnabled(true);
                
                if(bConfig){
                    Animacion.Animacion.bajar(10,80,1,2,BtnConfiguracion);
                    Animacion.Animacion.bajar(80, 400, 1, 2, PanelConfiguracion);
                    
                    Animacion.Animacion.bajar(80, 150, 1, 2, BtnReportes);
                    Animacion.Animacion.bajar(150, 220, 1, 2, BtnAcerca);
                    bConfig=false;
                    bandera=true;
                }
            }
        }else if(e.getSource().equals(BtnReportes)){
            if(bandera){
                
                //desactivacion de los demas botones
                BtnConfiguracion.setEnabled(false);
                BtnUsuario.setEnabled(false);
                BtnAcerca.setEnabled(false);
                
                if(!bReportes){
                    Animacion.Animacion.mover_derecha(0,490,1,2,BtnReportes);
                    Animacion.Animacion.subir(150,10,1,1,BtnReportes);
                    Animacion.Animacion.subir(400, 80, 1, 2, PanelReportes);
                    
                    
                    Animacion.Animacion.subir(220, 150, 1, 2, BtnAcerca);
                    bReportes=true;
                    bandera=false;
                }
            }else {
                
                //activicion de los demas botones
                BtnConfiguracion.setEnabled(true);
                BtnUsuario.setEnabled(true);
                BtnAcerca.setEnabled(true);
                
                if(bReportes){
                    Animacion.Animacion.bajar(10,150,1,1, BtnReportes);
                    Animacion.Animacion.bajar(80, 400, 1, 2, PanelReportes);
                    
                    Animacion.Animacion.bajar(150, 220, 1, 2, BtnAcerca);
                    bReportes=false;
                    bandera=true;
                }
            }
        }else if(e.getSource().equals(BtnAcerca)){
            if(bandera){
                
                //desactivicion de los demas botones
                BtnConfiguracion.setEnabled(false);
                BtnUsuario.setEnabled(false);
                BtnReportes.setEnabled(false);
                
                if(!bAcerca){
                    Animacion.Animacion.mover_derecha(0,490,1,2,BtnAcerca);
                    Animacion.Animacion.subir(220,10,1,1,BtnAcerca);
                    Animacion.Animacion.subir(400, 80, 1, 2, PanelAcerca);
                    bAcerca=true;
                    bandera=false;
                }
            }else {
                
                //activicion de los demas botones
                BtnConfiguracion.setEnabled(true);
                BtnUsuario.setEnabled(true);
                BtnReportes.setEnabled(true);
                
                if(bAcerca){
                    Animacion.Animacion.bajar(10,220,1,1,BtnAcerca);
                    Animacion.Animacion.bajar(80, 400, 1, 2, PanelAcerca);
                    bAcerca=false;
                    bandera=true;
                }
            }
        }else
        
        if(e.getSource().equals(BtnPanelIngresarUsuario)){
            
            if(PanelIngresarUsuarioActivated){
                MostrarInformacion("Esta Activo","login-green-icon");
            }else{
                OcultarInformacion("hide-msg-green-icon");
                Animacion.Animacion.mover_derecha(0, 450, 1, 2, PanelNuevoUsuario);
                Animacion.Animacion.mover_derecha(-450, 0, 1, 2, PanelIngresarUsuario);
                PanelIngresarUsuarioActivated = true;
                PanelNuevoUsuarioActivated = false;
            } 
        }else if(e.getSource().equals(BtnConfirmarUsuario)){// ingresar al sistema
            
            if(algunCampoVacioEnIngresarUsuario()){
                System.out.println("campos vacios");
            }else{
                if(UsuarioDAO_ConsultasCRUD.ExisteUsuario(
                    TxtNombreUsuario.getText(),
                    TxtClaveUsuario.getText())){
                    MostrarInformacion("Usuario Confirmado", "confirmar-green-icon");  
                    limpiarCamposUyC();
                }else {
                    MostrarInformacion("Clave o Usuario Incorrecto.", "denegar-red-icon");
                    limpiarCamposUyC();
                }
            }
            
        }else if(e.getSource().equals(BtnPanelNuevoUsuario)){
            if(!PanelNuevoUsuarioActivated){
                OcultarInformacion("hide-msg-green-icon");
                Animacion.Animacion.mover_izquierda(450, 0, 1, 2, PanelNuevoUsuario);
                Animacion.Animacion.mover_izquierda(0, -450, 1, 2, PanelIngresarUsuario);
                PanelIngresarUsuarioActivated = false;
                PanelNuevoUsuarioActivated = true;
            }else{
                MostrarInformacion("Esta Activo","add-user-green-icon");
            }
            
        }else if(e.getSource().equals(BtnSiguiente)){ // animacion --> del carousel         
            switch (PanelSlider) {
                case "nombres":
                    LabelPasos.setText("Sig. Apellidos");
                    Animacion.Animacion.mover_izquierda(450, 0, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_izquierda(900, 450, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_izquierda(1350, 900, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_izquierda(1800, 1350, 1, 2, PanelNombreU_ClaveU);
                    PanelSlider="apellidos";
                    break;
                case "apellidos":
                    LabelPasos.setText("Sig. CI y Correo");
                    Animacion.Animacion.mover_izquierda(0, -450, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_izquierda(450, 0, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_izquierda(900, 450, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_izquierda(1350, 900, 1, 2, PanelNombreU_ClaveU);
                    PanelSlider="cedulacorreo";
                    break;
                case "cedulacorreo":
                    LabelPasos.setText("Sig. Usuario/Clave");
                    Animacion.Animacion.mover_izquierda(-450, -900, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_izquierda(0, -450, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_izquierda(450, 0, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_izquierda(900, 450, 1, 2, PanelNombreU_ClaveU);
                    PanelSlider="nUsuario_nClave";
                    break;
                case "nUsuario_nClave":
                    LabelPasos.setText("Listo!!");
                    Animacion.Animacion.mover_izquierda(-900, -1350, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_izquierda(-450, -900, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_izquierda(0, -450, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_izquierda(450, 0, 1, 2, PanelNombreU_ClaveU);
                    BtnSiguiente.setEnabled(false);
                    BtnAnterior.setEnabled(true);
                    BtnGuardarNuevoUsuario.setEnabled(true);
                    break;
                default:
                    break;
            }
            
        }else if(e.getSource().equals(BtnAnterior)){// animacion <-- del carousel   
            switch (PanelSlider) {
                case "nombres":
                    LabelPasos.setText("Sig. Nombres");
                    Animacion.Animacion.mover_derecha(0, 450, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_derecha(450, 900, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_derecha(900, 1350, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_derecha(1350, 900, 1, 2, PanelNombreU_ClaveU);
                    BtnSiguiente.setEnabled(true);
                    BtnAnterior.setEnabled(false);
                    break;
                case "apellidos":
                    LabelPasos.setText("Nombres");
                    Animacion.Animacion.mover_derecha(-450, 0, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_derecha(0, 450, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_derecha(450, 900, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_derecha(900, 450, 1, 2, PanelNombreU_ClaveU);
                    PanelSlider="nombres";
                    break;
                case "cedulacorreo":
                    LabelPasos.setText("Apellidos");
                    Animacion.Animacion.mover_derecha(-900, -450, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_derecha(-450, 0, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_derecha(0, 450, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_derecha(450, 0, 1, 2, PanelNombreU_ClaveU);
                    PanelSlider="apellidos";
                    break;
                case "nUsuario_nClave":
                    LabelPasos.setText("CI/Correo");
                    Animacion.Animacion.mover_derecha(-1350, -900, 1, 2, PanelNombres);
                    Animacion.Animacion.mover_derecha(-900, -450, 1, 2, PanelApellidos);
                    Animacion.Animacion.mover_derecha(-450, 0, 1, 2, PanelCedulaCorreo);
                    Animacion.Animacion.mover_derecha(0, 450, 1, 2, PanelNombreU_ClaveU);
                    PanelSlider="cedulacorreo";
                    BtnSiguiente.setEnabled(false);
                    BtnGuardarNuevoUsuario.setEnabled(false);
                    break;
                default:
                    break;
            }
        }else if(e.getSource().equals(BtnGuardarNuevoUsuario)){// guardar nuevo usuario
            if(algunCampoEstaVacioEnIngresarNuevoUsuario()){
                System.out.println("Campos Vacios");
            }else if(TxtClaveNuevoUsuario.getText() != TxtConfClaveNuevoUsuario.getText()){
                MostrarInformacion("Las claves no cohinciden", "denegar-red-icon");
            }else {
                
                System.out.println("Guardando Nuevo Usuario");
                String nombre_uno = TxtUnombreUno.getText();
                String nombre_dos = TxtUnombreDos.getText();
                String apellido_uno = TxtUApellidoUno.getText();
                String apellido_dos = TxtUApellidoDos.getText();
                String cedula = TxtUCedula.getText();
                String correo = TxtUCorreo.getText();
                String nombre_u = TxtNombreNuevoUsuario.getText();
                String clave_u = TxtClaveNuevoUsuario.getText();
                
                if(UsuarioDAO_ConsultasCRUD.Registrar(new UsuarioVO(nombre_uno,nombre_dos,
                                apellido_uno,apellido_dos,
                                cedula,correo,nombre_u,clave_u))){
                    
                    MostrarInformacion("Nuevo Usuario Registrado.",
                                       "confirmar-green-icon");
                    
                }else {
                    MostrarInformacion("El Usuario ya Existe.", "warning-yellow-icon");
                    limpiarCamposNuevoUsuario();
                }
            }
        }else if(e.getSource().equals(Btn_Registrar)){
            String nombre1,nombre2,apellido1,apellido2,fullfecha,cedula;
            int edad;
            try{
                tools.Dialog.MessageDialog("Acontinuacion se estaran pidiendo sus datos:\n"
                        + "cedula\nNombres\nApellidos\nFecha de Nacimiento\ny su edad");

                nombre1 = tools.Dialog.InputDialogForLettersOnly("Ingrese el primer nombre");
                nombre2 = tools.Dialog.InputDialogForLettersOnly("Ingrese el segundo nombre");
                apellido1 = tools.Dialog.InputDialogForLettersOnly("Ingrese el primer apellido");
                apellido2 = tools.Dialog.InputDialogForLettersOnly("Ingrese el segundo apellido");

                tools.Dialog.MessageDialog("Acontinuacion se estaran pidiendo la fecha\n"
                        + " en el formato AAAA-MM-DD (Año-mes-dia) ");

                String anio =  tools.Dialog.InputForShortNumbersOnly("ingrese su año de nacimiento:")+"-";
                String mes =  tools.Dialog.InputForShortNumbersOnly("ingrese su mes de nacimiento:")+"-";
                String dia =  tools.Dialog.InputForShortNumbersOnly("ingrese su dia de nacimiento:")+"";

                fullfecha = anio+mes+dia;

                edad = tools.Dialog.InputForShortNumbersOnly("ingrese su edad:");
                tools.Dialog.MessageDialog("muy bien ahora solo continue he ingrese su cedula");
                cedula = tools.Dialog.InputForNumbersOnlyToString("Cedula: ");
                
                if(HabitanteDAO_ConsultasCRUD.
                    Registrar(
                        new HabitanteVO(
                            cedula,nombre1,nombre2,apellido1,apellido2,fullfecha,edad
                        ))){
                    MostrarInformacion("Habitante Registrado.", "confirmar-green-icon");
                    TablaDatos.setModel(HabitanteDAO_ConsultasCRUD.habitantesTabulados());
                }else {
                    MostrarInformacion("Habitante ya registrado.", "denegar-red-icon");
                }
            }catch(NullPointerException npe){
                MostrarInformacion("Operacion Cancelada!", "warning-yellow-icon");
            }
        }
    }
    
//-------------------------------------------------------------metodos locos----
    
    private void limpiarCamposNuevoUsuario(){
        TxtUCedula.setText("");
        TxtUnombreUno.setText("");
        TxtUnombreDos.setText("");
        TxtUApellidoUno.setText("");
        TxtUApellidoDos.setText("");
        TxtNombreNuevoUsuario.setText("");
        TxtClaveNuevoUsuario.setText("");
        TxtConfClaveNuevoUsuario.setText("");
        TxtUCorreo.setText("");
    }
    
    private void limpiarCamposUyC(){
        TxtNombreUsuario.setText("");
        TxtClaveUsuario.setText("");
    }
    
    private boolean algunCampoEstaVacioEnIngresarNuevoUsuario(){
        if(
            TxtUCedula.getText().equalsIgnoreCase("")||
            TxtUnombreUno.getText().equalsIgnoreCase("")||
            TxtUnombreDos.getText().equalsIgnoreCase("")||
            TxtUApellidoUno.getText().equalsIgnoreCase("")||
            TxtUApellidoDos.getText().equalsIgnoreCase("")||
            TxtNombreNuevoUsuario.getText().equalsIgnoreCase("")||
            TxtClaveNuevoUsuario.getText().equalsIgnoreCase("")||
            TxtConfClaveNuevoUsuario.getText().equalsIgnoreCase("")||
            TxtUCorreo.getText().equalsIgnoreCase("")
        ){
            MostrarInformacion("Algun Campo esta Vacio.", "warning-yellow-icon");
            return true;
        } else return false;
    }
    
    private boolean algunCampoVacioEnIngresarUsuario(){
        if(
            TxtNombreUsuario.getText().equalsIgnoreCase("")||
            TxtClaveUsuario.getText().equalsIgnoreCase("")
        ){
            MostrarInformacion("Algun Campo esta Vacio.", "warning-yellow-icon");
            return true;
        } else return false;
    }
    
    private void MostrarInformacion(String info,String icon){
        //cambiamos el icono segun el tipo de mensaje
        PanelMensajes.setIcon(
            new ImageIcon(getClass().
            getResource("/ProjectAssets/"+icon+".png")
        ));
        PanelMensajes.setText(info);
        Animacion.Animacion.bajar(-80, 10, 8, 2, PanelMensajes);
    }
    
    private void OcultarInformacion(String icon){
        //cambiamos el icono segun el tipo de mensaje
        PanelMensajes.setIcon(
            new ImageIcon(getClass().
            getResource("/ProjectAssets/"+icon+".png")
        ));
        Animacion.Animacion.subir(10, -80, 5, 2, PanelMensajes);
        PanelMensajes.setText("");
    }
//---------------------------------------- Campos para numeros y texto ---------
    
    private void SoloNumeros(JTextField campos_de_texto) {
        campos_de_texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char C = e.getKeyChar();
                if (!Character.isDigit(C)) {
                    if(campos_de_texto.equals(TxtUCedula)){
                        MostrarInformacion("Cedula Admite Solo Num.", "denegar-red-icon");
                    }e.consume();
                }
            }
        });
    }

    private void SoloLetras(JTextField campos_de_texto) {
        campos_de_texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char C = e.getKeyChar();
                if (Character.isDigit(C)) {
//                    if(campos_de_texto.equals(TxtNombreUsuario)){
//                        MostrarInformacion("Usuario Admite Solo Letras", "denegar-red-icon");
//                    }else if(campos_de_texto.equals(TxtNombreNuevoUsuario)){
//                        MostrarInformacion("Nombre U. Admite Solo Letras", "denegar-red-icon");
//                    }else
                    if(campos_de_texto.equals(TxtUnombreUno)){
                        MostrarInformacion("Nombre 1 Admite Solo Letras", "denegar-red-icon");
                    }else if(campos_de_texto.equals(TxtUnombreDos)){
                        MostrarInformacion("Nombre 2 Admite Solo Letras", "denegar-red-icon");
                    }else if(campos_de_texto.equals(TxtUApellidoUno)){
                        MostrarInformacion("Apellido 1 Admite Solo Letras", "denegar-red-icon");
                    }else if(campos_de_texto.equals(TxtUApellidoDos)){
                        MostrarInformacion("Apellido 2 Admite Solo Letras", "denegar-red-icon");
                    }
                    e.consume();
                }
            }
        });
    }
}
