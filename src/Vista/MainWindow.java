package Vista;

/**
 *
 * @author Angel Alexander Jimenez
 */

/**
 * Esta clase es generada por el netbeans Form Editor Code Wizard
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        System.out.println("MainWindow generado por netbeans");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        BtnAcerca = new javax.swing.JButton();
        BtnUsuario = new javax.swing.JButton();
        BtnConfiguracion = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        PanelMensajes = new javax.swing.JLabel();
        PanelVentanas = new javax.swing.JPanel();
        PanelUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnPanelIngresarUsuario = new javax.swing.JButton();
        BtnPanelNuevoUsuario = new javax.swing.JButton();
        SinFuncion = new javax.swing.JPanel();
        PanelNuevoUsuario = new javax.swing.JPanel();
        BtnSiguiente = new javax.swing.JButton();
        BtnAnterior = new javax.swing.JButton();
        BtnGuardarNuevoUsuario = new javax.swing.JButton();
        PanelSliderNuevoUsuario = new javax.swing.JPanel();
        PanelNombres = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtUnombreUno = new javax.swing.JTextField();
        TxtUnombreDos = new javax.swing.JTextField();
        PanelApellidos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtUApellidoUno = new javax.swing.JTextField();
        TxtUApellidoDos = new javax.swing.JTextField();
        PanelCedulaCorreo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtUCedula = new javax.swing.JTextField();
        TxtUCorreo = new javax.swing.JFormattedTextField();
        PanelNombreU_ClaveU = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtNombreNuevoUsuario = new javax.swing.JTextField();
        TxtClaveNuevoUsuario = new javax.swing.JPasswordField();
        TxtConfClaveNuevoUsuario = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        LabelPasos = new javax.swing.JLabel();
        PanelIngresarUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtNombreUsuario = new javax.swing.JTextField();
        TxtClaveUsuario = new javax.swing.JPasswordField();
        BtnLimpiarUsuarioYClave = new javax.swing.JButton();
        BtnConfirmarUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelConfiguracion = new javax.swing.JPanel();
        PanelReportes = new javax.swing.JPanel();
        PanelAcerca = new javax.swing.JPanel();
        PanelBarraMenu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Automatizado");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(760, 400));
        setResizable(false);

        PanelPrincipal.setMaximumSize(new java.awt.Dimension(760, 400));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(760, 400));
        PanelPrincipal.setName("PanelInterno"); // NOI18N
        PanelPrincipal.setLayout(null);

        BtnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/acerca.png"))); // NOI18N
        BtnAcerca.setBorder(null);
        BtnAcerca.setBorderPainted(false);
        BtnAcerca.setContentAreaFilled(false);
        BtnAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAcerca.setDefaultCapable(false);
        BtnAcerca.setFocusPainted(false);
        BtnAcerca.setName("BtnAcerca"); // NOI18N
        BtnAcerca.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/acerca_selected.png"))); // NOI18N
        PanelPrincipal.add(BtnAcerca);
        BtnAcerca.setBounds(-176, 220, 230, 60);

        BtnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/usuarios.png"))); // NOI18N
        BtnUsuario.setBorder(null);
        BtnUsuario.setBorderPainted(false);
        BtnUsuario.setContentAreaFilled(false);
        BtnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUsuario.setDefaultCapable(false);
        BtnUsuario.setFocusPainted(false);
        BtnUsuario.setName("BtnUsuario"); // NOI18N
        BtnUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/usuario_selected.png"))); // NOI18N
        PanelPrincipal.add(BtnUsuario);
        BtnUsuario.setBounds(-176, 10, 230, 60);

        BtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/configurar.png"))); // NOI18N
        BtnConfiguracion.setBorder(null);
        BtnConfiguracion.setBorderPainted(false);
        BtnConfiguracion.setContentAreaFilled(false);
        BtnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnConfiguracion.setDefaultCapable(false);
        BtnConfiguracion.setFocusPainted(false);
        BtnConfiguracion.setName("BtnConfiguracion"); // NOI18N
        BtnConfiguracion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/configurar_selected.png"))); // NOI18N
        PanelPrincipal.add(BtnConfiguracion);
        BtnConfiguracion.setBounds(-176, 80, 230, 60);

        BtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/reportes.png"))); // NOI18N
        BtnReportes.setBorder(null);
        BtnReportes.setBorderPainted(false);
        BtnReportes.setContentAreaFilled(false);
        BtnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnReportes.setDefaultCapable(false);
        BtnReportes.setFocusPainted(false);
        BtnReportes.setName("BtnReportes"); // NOI18N
        BtnReportes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/reportes_selected.png"))); // NOI18N
        PanelPrincipal.add(BtnReportes);
        BtnReportes.setBounds(-176, 150, 230, 60);

        PanelMensajes.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        PanelMensajes.setForeground(new java.awt.Color(255, 255, 255));
        PanelMensajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-mail.png"))); // NOI18N
        PanelMensajes.setText("Mensajes informativos");
        PanelMensajes.setMaximumSize(new java.awt.Dimension(380, 70));
        PanelMensajes.setMinimumSize(new java.awt.Dimension(380, 70));
        PanelMensajes.setName(""); // NOI18N
        PanelMensajes.setPreferredSize(new java.awt.Dimension(380, 70));
        PanelPrincipal.add(PanelMensajes);
        PanelMensajes.setBounds(70, -80, 380, 70);

        PanelVentanas.setBackground(new java.awt.Color(51, 51, 51));
        PanelVentanas.setMaximumSize(new java.awt.Dimension(700, 400));
        PanelVentanas.setMinimumSize(new java.awt.Dimension(700, 400));
        PanelVentanas.setPreferredSize(new java.awt.Dimension(700, 400));
        PanelVentanas.setLayout(null);

        PanelUsuarios.setBackground(new java.awt.Color(102, 102, 102));
        PanelUsuarios.setMaximumSize(new java.awt.Dimension(700, 300));
        PanelUsuarios.setMinimumSize(new java.awt.Dimension(700, 300));
        PanelUsuarios.setPreferredSize(new java.awt.Dimension(700, 400));
        PanelUsuarios.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x128-lock_azul.png"))); // NOI18N
        PanelUsuarios.add(jLabel1);
        jLabel1.setBounds(60, 50, 130, 130);

        BtnPanelIngresarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-entrar.png"))); // NOI18N
        BtnPanelIngresarUsuario.setBorder(null);
        BtnPanelIngresarUsuario.setBorderPainted(false);
        BtnPanelIngresarUsuario.setContentAreaFilled(false);
        BtnPanelIngresarUsuario.setDefaultCapable(false);
        BtnPanelIngresarUsuario.setFocusPainted(false);
        BtnPanelIngresarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-entrar_Pressed.png"))); // NOI18N
        PanelUsuarios.add(BtnPanelIngresarUsuario);
        BtnPanelIngresarUsuario.setBounds(145, 206, 64, 64);

        BtnPanelNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-addUser.png"))); // NOI18N
        BtnPanelNuevoUsuario.setBorder(null);
        BtnPanelNuevoUsuario.setBorderPainted(false);
        BtnPanelNuevoUsuario.setContentAreaFilled(false);
        BtnPanelNuevoUsuario.setDefaultCapable(false);
        BtnPanelNuevoUsuario.setFocusPainted(false);
        BtnPanelNuevoUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-addUser_Pressed.png"))); // NOI18N
        PanelUsuarios.add(BtnPanelNuevoUsuario);
        BtnPanelNuevoUsuario.setBounds(32, 206, 64, 64);

        SinFuncion.setBackground(new java.awt.Color(153, 153, 153));
        SinFuncion.setMaximumSize(new java.awt.Dimension(450, 400));
        SinFuncion.setMinimumSize(new java.awt.Dimension(450, 400));
        SinFuncion.setPreferredSize(new java.awt.Dimension(450, 400));
        SinFuncion.setLayout(null);

        PanelNuevoUsuario.setBackground(new java.awt.Color(0, 0, 27));
        PanelNuevoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        PanelNuevoUsuario.setMaximumSize(new java.awt.Dimension(450, 400));
        PanelNuevoUsuario.setMinimumSize(new java.awt.Dimension(450, 400));
        PanelNuevoUsuario.setLayout(null);

        BtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-adelante.png"))); // NOI18N
        BtnSiguiente.setBorder(null);
        BtnSiguiente.setBorderPainted(false);
        BtnSiguiente.setContentAreaFilled(false);
        BtnSiguiente.setFocusPainted(false);
        BtnSiguiente.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnSiguiente.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnSiguiente.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnSiguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-adelante_azul.png"))); // NOI18N
        PanelNuevoUsuario.add(BtnSiguiente);
        BtnSiguiente.setBounds(325, 205, 70, 70);

        BtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-atras.png"))); // NOI18N
        BtnAnterior.setBorder(null);
        BtnAnterior.setBorderPainted(false);
        BtnAnterior.setContentAreaFilled(false);
        BtnAnterior.setFocusPainted(false);
        BtnAnterior.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnAnterior.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnAnterior.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnAnterior.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-atras_azul.png"))); // NOI18N
        PanelNuevoUsuario.add(BtnAnterior);
        BtnAnterior.setBounds(250, 205, 70, 70);

        BtnGuardarNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-aceptar.png"))); // NOI18N
        BtnGuardarNuevoUsuario.setBorder(null);
        BtnGuardarNuevoUsuario.setBorderPainted(false);
        BtnGuardarNuevoUsuario.setContentAreaFilled(false);
        BtnGuardarNuevoUsuario.setEnabled(false);
        BtnGuardarNuevoUsuario.setFocusPainted(false);
        BtnGuardarNuevoUsuario.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnGuardarNuevoUsuario.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnGuardarNuevoUsuario.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnGuardarNuevoUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-aceptar_azul.png"))); // NOI18N
        PanelNuevoUsuario.add(BtnGuardarNuevoUsuario);
        BtnGuardarNuevoUsuario.setBounds(175, 205, 70, 70);

        PanelSliderNuevoUsuario.setBackground(new java.awt.Color(0, 12, 25));
        PanelSliderNuevoUsuario.setMaximumSize(new java.awt.Dimension(450, 200));
        PanelSliderNuevoUsuario.setMinimumSize(new java.awt.Dimension(450, 200));
        PanelSliderNuevoUsuario.setLayout(null);

        PanelNombres.setBackground(new java.awt.Color(0, 12, 25));
        PanelNombres.setMaximumSize(new java.awt.Dimension(450, 200));
        PanelNombres.setMinimumSize(new java.awt.Dimension(450, 200));
        PanelNombres.setLayout(null);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre 1");
        jLabel3.setFocusable(false);
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelNombres.add(jLabel3);
        jLabel3.setBounds(40, 40, 90, 50);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nombre 2");
        jLabel4.setFocusable(false);
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelNombres.add(jLabel4);
        jLabel4.setBounds(40, 110, 90, 50);

        TxtUnombreUno.setBackground(new java.awt.Color(0, 12, 25));
        TxtUnombreUno.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtUnombreUno.setForeground(new java.awt.Color(255, 255, 255));
        TxtUnombreUno.setToolTipText("");
        TxtUnombreUno.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtUnombreUno.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtUnombreUno.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelNombres.add(TxtUnombreUno);
        TxtUnombreUno.setBounds(150, 40, 250, 50);

        TxtUnombreDos.setBackground(new java.awt.Color(0, 12, 25));
        TxtUnombreDos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtUnombreDos.setForeground(new java.awt.Color(255, 255, 255));
        TxtUnombreDos.setToolTipText("");
        TxtUnombreDos.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtUnombreDos.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtUnombreDos.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelNombres.add(TxtUnombreDos);
        TxtUnombreDos.setBounds(150, 110, 250, 50);

        PanelSliderNuevoUsuario.add(PanelNombres);
        PanelNombres.setBounds(450, 0, 450, 200);

        PanelApellidos.setBackground(new java.awt.Color(0, 12, 25));
        PanelApellidos.setMaximumSize(new java.awt.Dimension(450, 200));
        PanelApellidos.setMinimumSize(new java.awt.Dimension(450, 200));
        PanelApellidos.setLayout(null);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Apellido 1");
        jLabel5.setFocusable(false);
        jLabel5.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelApellidos.add(jLabel5);
        jLabel5.setBounds(40, 40, 90, 50);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido 2");
        jLabel6.setFocusable(false);
        jLabel6.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelApellidos.add(jLabel6);
        jLabel6.setBounds(40, 110, 90, 50);

        TxtUApellidoUno.setBackground(new java.awt.Color(0, 12, 25));
        TxtUApellidoUno.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtUApellidoUno.setForeground(new java.awt.Color(255, 255, 255));
        TxtUApellidoUno.setToolTipText("");
        TxtUApellidoUno.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtUApellidoUno.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtUApellidoUno.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelApellidos.add(TxtUApellidoUno);
        TxtUApellidoUno.setBounds(150, 40, 250, 50);

        TxtUApellidoDos.setBackground(new java.awt.Color(0, 12, 25));
        TxtUApellidoDos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtUApellidoDos.setForeground(new java.awt.Color(255, 255, 255));
        TxtUApellidoDos.setToolTipText("");
        TxtUApellidoDos.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtUApellidoDos.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtUApellidoDos.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelApellidos.add(TxtUApellidoDos);
        TxtUApellidoDos.setBounds(150, 110, 250, 50);

        PanelSliderNuevoUsuario.add(PanelApellidos);
        PanelApellidos.setBounds(450, 0, 450, 200);

        PanelCedulaCorreo.setBackground(new java.awt.Color(0, 12, 25));
        PanelCedulaCorreo.setMaximumSize(new java.awt.Dimension(450, 200));
        PanelCedulaCorreo.setMinimumSize(new java.awt.Dimension(450, 200));
        PanelCedulaCorreo.setLayout(null);

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cedula");
        jLabel9.setFocusable(false);
        jLabel9.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel9.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel9.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelCedulaCorreo.add(jLabel9);
        jLabel9.setBounds(40, 40, 90, 50);

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Correo");
        jLabel10.setFocusable(false);
        jLabel10.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel10.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel10.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelCedulaCorreo.add(jLabel10);
        jLabel10.setBounds(40, 110, 90, 50);

        TxtUCedula.setBackground(new java.awt.Color(0, 12, 25));
        TxtUCedula.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtUCedula.setForeground(new java.awt.Color(255, 255, 255));
        TxtUCedula.setToolTipText("");
        TxtUCedula.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtUCedula.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtUCedula.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelCedulaCorreo.add(TxtUCedula);
        TxtUCedula.setBounds(150, 40, 250, 50);

        TxtUCorreo.setBackground(new java.awt.Color(0, 12, 25));
        TxtUCorreo.setForeground(new java.awt.Color(255, 255, 255));
        TxtUCorreo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtUCorreo.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtUCorreo.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtUCorreo.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelCedulaCorreo.add(TxtUCorreo);
        TxtUCorreo.setBounds(150, 110, 250, 50);

        PanelSliderNuevoUsuario.add(PanelCedulaCorreo);
        PanelCedulaCorreo.setBounds(450, 0, 450, 200);

        PanelNombreU_ClaveU.setBackground(new java.awt.Color(0, 12, 25));
        PanelNombreU_ClaveU.setMaximumSize(new java.awt.Dimension(450, 200));
        PanelNombreU_ClaveU.setMinimumSize(new java.awt.Dimension(450, 200));
        PanelNombreU_ClaveU.setLayout(null);

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("N. Usuario");
        jLabel11.setFocusable(false);
        jLabel11.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel11.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel11.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelNombreU_ClaveU.add(jLabel11);
        jLabel11.setBounds(50, 10, 90, 50);

        jLabel12.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Clave");
        jLabel12.setFocusable(false);
        jLabel12.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel12.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel12.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelNombreU_ClaveU.add(jLabel12);
        jLabel12.setBounds(50, 70, 90, 50);

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Conf. Clave");
        jLabel13.setFocusable(false);
        jLabel13.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel13.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelNombreU_ClaveU.add(jLabel13);
        jLabel13.setBounds(20, 130, 120, 50);

        TxtNombreNuevoUsuario.setBackground(new java.awt.Color(0, 12, 25));
        TxtNombreNuevoUsuario.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtNombreNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombreNuevoUsuario.setToolTipText("");
        TxtNombreNuevoUsuario.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtNombreNuevoUsuario.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtNombreNuevoUsuario.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelNombreU_ClaveU.add(TxtNombreNuevoUsuario);
        TxtNombreNuevoUsuario.setBounds(160, 10, 250, 50);

        TxtClaveNuevoUsuario.setBackground(new java.awt.Color(0, 12, 25));
        TxtClaveNuevoUsuario.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtClaveNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtClaveNuevoUsuario.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtClaveNuevoUsuario.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtClaveNuevoUsuario.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelNombreU_ClaveU.add(TxtClaveNuevoUsuario);
        TxtClaveNuevoUsuario.setBounds(160, 70, 250, 50);

        TxtConfClaveNuevoUsuario.setBackground(new java.awt.Color(0, 12, 25));
        TxtConfClaveNuevoUsuario.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtConfClaveNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtConfClaveNuevoUsuario.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtConfClaveNuevoUsuario.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtConfClaveNuevoUsuario.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelNombreU_ClaveU.add(TxtConfClaveNuevoUsuario);
        TxtConfClaveNuevoUsuario.setBounds(160, 130, 250, 50);

        PanelSliderNuevoUsuario.add(PanelNombreU_ClaveU);
        PanelNombreU_ClaveU.setBounds(450, 0, 450, 200);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 12, 25));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("       Para ingresar un nuevo usuario \n       al nuestro sistemas debe llenar\n       cada uno de los campos que se\n       mostraran a continuacion, cada\n       campo es obligatorio, por favor\n       asegurese de ingresar todos \n       sus datos de forma correcta.!!");
        jTextArea2.setBorder(null);
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea2.setEnabled(false);
        jTextArea2.setFocusable(false);
        jTextArea2.setMaximumSize(new java.awt.Dimension(340, 168));
        jTextArea2.setMinimumSize(new java.awt.Dimension(340, 168));
        jScrollPane2.setViewportView(jTextArea2);

        PanelSliderNuevoUsuario.add(jScrollPane2);
        jScrollPane2.setBounds(50, 10, 350, 190);

        PanelNuevoUsuario.add(PanelSliderNuevoUsuario);
        PanelSliderNuevoUsuario.setBounds(0, 0, 450, 200);

        LabelPasos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        LabelPasos.setForeground(new java.awt.Color(255, 255, 255));
        LabelPasos.setText("Sig. Nombres");
        LabelPasos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelNuevoUsuario.add(LabelPasos);
        LabelPasos.setBounds(20, 216, 150, 50);

        SinFuncion.add(PanelNuevoUsuario);
        PanelNuevoUsuario.setBounds(450, 0, 450, 400);

        PanelIngresarUsuario.setBackground(new java.awt.Color(0, 51, 102));
        PanelIngresarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        PanelIngresarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelIngresarUsuario.setFocusable(false);
        PanelIngresarUsuario.setMaximumSize(new java.awt.Dimension(450, 400));
        PanelIngresarUsuario.setMinimumSize(new java.awt.Dimension(450, 400));
        PanelIngresarUsuario.setLayout(null);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos Para Ingresar Al Sistema");
        PanelIngresarUsuario.add(jLabel2);
        jLabel2.setBounds(6, 6, 440, 40);

        TxtNombreUsuario.setBackground(new java.awt.Color(0, 12, 25));
        TxtNombreUsuario.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombreUsuario.setToolTipText("");
        TxtNombreUsuario.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtNombreUsuario.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtNombreUsuario.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelIngresarUsuario.add(TxtNombreUsuario);
        TxtNombreUsuario.setBounds(150, 60, 250, 50);

        TxtClaveUsuario.setBackground(new java.awt.Color(0, 12, 25));
        TxtClaveUsuario.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        TxtClaveUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtClaveUsuario.setMaximumSize(new java.awt.Dimension(250, 50));
        TxtClaveUsuario.setMinimumSize(new java.awt.Dimension(250, 50));
        TxtClaveUsuario.setPreferredSize(new java.awt.Dimension(250, 50));
        PanelIngresarUsuario.add(TxtClaveUsuario);
        TxtClaveUsuario.setBounds(150, 130, 250, 50);

        BtnLimpiarUsuarioYClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-limpiar.png"))); // NOI18N
        BtnLimpiarUsuarioYClave.setBorder(null);
        BtnLimpiarUsuarioYClave.setBorderPainted(false);
        BtnLimpiarUsuarioYClave.setContentAreaFilled(false);
        BtnLimpiarUsuarioYClave.setFocusPainted(false);
        BtnLimpiarUsuarioYClave.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-limpiar_azul.png"))); // NOI18N
        PanelIngresarUsuario.add(BtnLimpiarUsuarioYClave);
        BtnLimpiarUsuarioYClave.setBounds(330, 205, 70, 70);

        BtnConfirmarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-aceptar.png"))); // NOI18N
        BtnConfirmarUsuario.setBorder(null);
        BtnConfirmarUsuario.setBorderPainted(false);
        BtnConfirmarUsuario.setContentAreaFilled(false);
        BtnConfirmarUsuario.setFocusPainted(false);
        BtnConfirmarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ProjectAssets/x64-aceptar_azul.png"))); // NOI18N
        PanelIngresarUsuario.add(BtnConfirmarUsuario);
        BtnConfirmarUsuario.setBounds(240, 205, 70, 70);

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Usuario");
        jLabel7.setFocusable(false);
        jLabel7.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel7.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel7.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelIngresarUsuario.add(jLabel7);
        jLabel7.setBounds(40, 60, 90, 50);

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Clave");
        jLabel8.setFocusable(false);
        jLabel8.setMaximumSize(new java.awt.Dimension(120, 40));
        jLabel8.setMinimumSize(new java.awt.Dimension(120, 40));
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 50));
        PanelIngresarUsuario.add(jLabel8);
        jLabel8.setBounds(40, 130, 90, 50);

        SinFuncion.add(PanelIngresarUsuario);
        PanelIngresarUsuario.setBounds(0, 0, 450, 300);

        PanelUsuarios.add(SinFuncion);
        SinFuncion.setBounds(250, 0, 450, 400);

        PanelVentanas.add(PanelUsuarios);
        PanelUsuarios.setBounds(0, 400, 700, 400);

        PanelConfiguracion.setBackground(new java.awt.Color(102, 102, 102));
        PanelConfiguracion.setMaximumSize(new java.awt.Dimension(700, 400));
        PanelConfiguracion.setMinimumSize(new java.awt.Dimension(700, 400));
        PanelConfiguracion.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout PanelConfiguracionLayout = new javax.swing.GroupLayout(PanelConfiguracion);
        PanelConfiguracion.setLayout(PanelConfiguracionLayout);
        PanelConfiguracionLayout.setHorizontalGroup(
            PanelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        PanelConfiguracionLayout.setVerticalGroup(
            PanelConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        PanelVentanas.add(PanelConfiguracion);
        PanelConfiguracion.setBounds(0, 400, 700, 400);

        PanelReportes.setBackground(new java.awt.Color(102, 102, 102));
        PanelReportes.setMaximumSize(new java.awt.Dimension(700, 400));
        PanelReportes.setMinimumSize(new java.awt.Dimension(700, 400));
        PanelReportes.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout PanelReportesLayout = new javax.swing.GroupLayout(PanelReportes);
        PanelReportes.setLayout(PanelReportesLayout);
        PanelReportesLayout.setHorizontalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        PanelReportesLayout.setVerticalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        PanelVentanas.add(PanelReportes);
        PanelReportes.setBounds(0, 400, 700, 400);

        PanelAcerca.setBackground(new java.awt.Color(102, 102, 102));
        PanelAcerca.setMaximumSize(new java.awt.Dimension(700, 400));
        PanelAcerca.setMinimumSize(new java.awt.Dimension(700, 400));
        PanelAcerca.setPreferredSize(new java.awt.Dimension(700, 400));

        javax.swing.GroupLayout PanelAcercaLayout = new javax.swing.GroupLayout(PanelAcerca);
        PanelAcerca.setLayout(PanelAcercaLayout);
        PanelAcercaLayout.setHorizontalGroup(
            PanelAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        PanelAcercaLayout.setVerticalGroup(
            PanelAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        PanelVentanas.add(PanelAcerca);
        PanelAcerca.setBounds(0, 400, 700, 400);

        PanelPrincipal.add(PanelVentanas);
        PanelVentanas.setBounds(60, 0, 700, 400);

        PanelBarraMenu.setBackground(new java.awt.Color(0, 0, 25));
        PanelBarraMenu.setMaximumSize(new java.awt.Dimension(60, 400));
        PanelBarraMenu.setMinimumSize(new java.awt.Dimension(60, 400));

        javax.swing.GroupLayout PanelBarraMenuLayout = new javax.swing.GroupLayout(PanelBarraMenu);
        PanelBarraMenu.setLayout(PanelBarraMenuLayout);
        PanelBarraMenuLayout.setHorizontalGroup(
            PanelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PanelBarraMenuLayout.setVerticalGroup(
            PanelBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PanelBarraMenu);
        PanelBarraMenu.setBounds(0, 0, 60, 400);

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAcerca;
    public javax.swing.JButton BtnAnterior;
    public javax.swing.JButton BtnConfiguracion;
    public javax.swing.JButton BtnConfirmarUsuario;
    public javax.swing.JButton BtnGuardarNuevoUsuario;
    private javax.swing.JButton BtnLimpiarUsuarioYClave;
    public javax.swing.JButton BtnPanelIngresarUsuario;
    public javax.swing.JButton BtnPanelNuevoUsuario;
    public javax.swing.JButton BtnReportes;
    public javax.swing.JButton BtnSiguiente;
    public javax.swing.JButton BtnUsuario;
    public javax.swing.JLabel LabelPasos;
    public javax.swing.JPanel PanelAcerca;
    public javax.swing.JPanel PanelApellidos;
    private javax.swing.JPanel PanelBarraMenu;
    public javax.swing.JPanel PanelCedulaCorreo;
    public javax.swing.JPanel PanelConfiguracion;
    public javax.swing.JPanel PanelIngresarUsuario;
    public javax.swing.JLabel PanelMensajes;
    public javax.swing.JPanel PanelNombreU_ClaveU;
    public javax.swing.JPanel PanelNombres;
    public javax.swing.JPanel PanelNuevoUsuario;
    public javax.swing.JPanel PanelPrincipal;
    public javax.swing.JPanel PanelReportes;
    private javax.swing.JPanel PanelSliderNuevoUsuario;
    public javax.swing.JPanel PanelUsuarios;
    public javax.swing.JPanel PanelVentanas;
    private javax.swing.JPanel SinFuncion;
    public javax.swing.JPasswordField TxtClaveNuevoUsuario;
    public javax.swing.JPasswordField TxtClaveUsuario;
    public javax.swing.JPasswordField TxtConfClaveNuevoUsuario;
    public javax.swing.JTextField TxtNombreNuevoUsuario;
    public javax.swing.JTextField TxtNombreUsuario;
    public javax.swing.JTextField TxtUApellidoDos;
    public javax.swing.JTextField TxtUApellidoUno;
    public javax.swing.JTextField TxtUCedula;
    public javax.swing.JFormattedTextField TxtUCorreo;
    public javax.swing.JTextField TxtUnombreDos;
    public javax.swing.JTextField TxtUnombreUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
