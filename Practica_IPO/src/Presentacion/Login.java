package Presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import Dominio.Actividad;
import Dominio.Bungalow;
import Dominio.Empleado;
import Dominio.Disponibilidad;
import Dominio.Parcela;
import Dominio.Reserva;
import Dominio.RutaSenderista;
import Presentacion.pnlContenedorReservas;
import Dominio.Usuario;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

/**
 * The Class Login.
 */
public class Login {

	/** The frm login. */
	private JFrame frmLogin;
	
	/** The pnl login. */
	private JPanel pnlLogin;
	
	/** The lbl icon pass. */
	private JLabel lblIconPass;
	
	/** The pnl iniciar sesion. */
	private JPanel pnlIniciarSesion;
	
	/** The lbl iniciar sesin. */
	private JLabel lblIniciarSesin;
	
	/** The chckbx recordar contrasea. */
	private JCheckBox chckbxRecordarContrasea;
	
	/** The btn entrar. */
	private JButton btnEntrar;
	
	/** The lbl icon user. */
	private JLabel lblIconUser;
	
	/** The lblte has olvidado. */
	private JLabel lblteHasOlvidado;
	
	/** The pnl pass. */
	private JPanel pnlPass;
	
	/** The mostrar contrasea. */
	private boolean mostrarContrasea;
	
	/** The lbl contrasea. */
	private JLabel lblContrasea;
	
	/** The formato DNI. */
	private MaskFormatter formatoDNI;
	
	/** The pwd contrasena. */
	private JPasswordField pwdContrasena;
	
	/** The lbl error la contrasea. */
	private JLabel lblErrorLaContrasea;
	
	/** The pnl user. */
	private JPanel pnlUser;
	
	/** The lbl usuario. */
	private JLabel lblUsuario;
	
	/** The panel vista bungalows. */
	private pnlVBungalow panelVistaBungalows;
	
	/** The usuario. */
	private Usuario usuario;
	
	/** The txt usuario. */
	private JTextField txtUsuario;
	
	/** The pnl app. */
	private JPanel pnlApp;
	
	/** The pnl user data. */
	private JPanel pnlUserData;
	
	/** The pnl ocultar. */
	private JPanel pnlOcultar;
	
	/** The pnl informacion. */
	private JPanel pnlInformacion;
	
	/** The pnl usuario. */
	private pnlUsuario pnlUsuario;
	
	/** The btn ocultar. */
	private JButton btnOcultar;
	
	/** The pnl pestanas. */
	private JPanel pnlPestanas;
	
	/** The pnl contenedor pestanas. */
	private JTabbedPane pnlContenedorPestanas;
	
	/** The pnl bungalows. */
	private JPanel pnlBungalows;
	
	/** The pnl parcelas. */
	private JPanel pnlParcelas;
	
	/** The pnl empleados. */
	private JPanel pnlEmpleados;
	
	/** The pnl actividades. */
	private JPanel pnlActividades;
	
	/** The menu bar. */
	private JMenuBar menuBar;
	
	/** The btn ayuda. */
	private JButton btnAyuda;
	
	/** The btn configuracin. */
	private JButton btnConfiguracin;
	
	/** The pnl btn salir. */
	private JPanel pnlBtnSalir;
	
	/** The btn salir. */
	private JButton btnSalir;
	
	/** The btn cerrar sesin. */
	private JButton btnCerrarSesin;
	
	/** The pnl busqueda. */
	private JPanel pnlBusqueda;
	
	/** The tf busqueda bungalow. */
	private JTextField tfBusquedaBungalow;
	
	/** The pnl botones. */
	private JPanel pnlBotones;
	
	/** The btn aadir. */
	private JButton btnAadir;
	
	/** The btn eliminar. */
	private JButton btnEliminar;
	
	/** The btn modificar. */
	private JButton btnModificar;
	
	/** The pnl contenedor. */
	private JPanel pnlContenedor;
	
	/** The pnl busqueda par. */
	private JPanel pnlBusquedaPar;
	
	/** The text field busqueda par. */
	private JTextField textFieldBusquedaPar;
	
	/** The pnl botones par. */
	private JPanel pnlBotonesPar;
	
	/** The btn aadir par. */
	private JButton btnAadirPar;
	
	/** The pnl contenedor bungalows. */
	private pnlContenedorBungalows pnlContenedorBungalows;
	
	/** The btn eliminar par. */
	private JButton btnEliminarPar;
	
	/** The btn modificar 1. */
	private JButton btnModificar_1;
	
	/** The pnl contenedor par. */
	private JPanel pnlContenedorPar;
	
	/** The pnl contenedor parcelas. */
	private pnlContenedorParcelas pnlContenedorParcelas;
	
	/** The lbl busqueda por dni. */
	private JLabel lblBusquedaPorDni;
	
	/** The tf busqueda dni. */
	private JTextField tfBusquedaDni;
	
	/** The pnl botones empleados. */
	private JPanel pnlBotonesEmpleados;
	
	/** The pnl listado empleados. */
	private JPanel pnlListadoEmpleados;
	
	/** The scroll pane. */
	private JScrollPane scrollPane;
	
	/** The pnl contenedor empleados. */
	private pnlContenedorEmpleados pnlContenedorEmpleados;
	
	/** The pnl datos empleado. */
	private pnlFormEmpleado pnlDatosEmpleado;
	
	/** The lbl bsqueda por nombre. */
	private JLabel lblBsquedaPorNombre;
	
	/** The tf busqueda nombre actividad. */
	private JTextField tfBusquedaNombreActividad;
	
	/** The pnl botones actividades. */
	private JPanel pnlBotonesActividades;
	
	/** The pnl listado actividades. */
	private JPanel pnlListadoActividades;
	
	/** The scroll pane actividades. */
	private JScrollPane scrollPaneActividades;
	
	/** The pnl datos actividad. */
	private pnlFormActividades pnlDatosActividad;
	
	/** The pnl contenedor actividades. */
	private pnlContenedorActividades pnlContenedorActividades;
	
	/** The editar guardar empleado. */
	private int editar_guardar_empleado;
	
	/** The editar guardar actividad. */
	private int editar_guardar_actividad;
	
	/** The pnl principales. */
	private JPanel pnlPrincipales;
	
	/** The pnl editar. */
	private JPanel pnlEditar;
	
	/** The btn eliminar empleado. */
	private JButton btnEliminarEmpleado;
	
	/** The btn modificar empleado. */
	private JButton btnModificarEmpleado;
	
	/** The btn add empleado. */
	private JButton btnAddEmpleado;
	
	/** The btn guardar. */
	private JButton btnGuardar;
	
	/** The btn cancelar. */
	private JButton btnCancelar;
	
	/** The pnl principales act. */
	private JPanel pnlPrincipalesAct;
	
	/** The pnl editar act. */
	private JPanel pnlEditarAct;
	
	/** The btn add actividad. */
	private JButton btnAddActividad;
	
	/** The Modificar actividad. */
	private JButton ModificarActividad;
	
	/** The btn eliminar actividad. */
	private JButton btnEliminarActividad;
	
	/** The btn guardar actividad. */
	private JButton btnGuardarActividad;
	
	/** The btn cancelar actividad. */
	private JButton btnCancelarActividad;
	
	/** The lbl busqueda por nombre. */
	private JLabel lblBusquedaPorNombre;
	
	/** The lbl busqueda por nombre P. */
	private JLabel lblBusquedaPorNombre_P;
	
	/** The btn ver pass. */
	private JButton btnVerPass;
	
	/** The ver pass. */
	private boolean verPass;
	
	/** The pnl reservas. */
	private JPanel pnlReservas;
	
	/** The lbl bsqueda por nombre reserva. */
	private JLabel lblBsquedaPorNombreReserva;
	
	/** The tf busqueda reserva. */
	private JTextField tfBusquedaReserva;
	
	/** The pnl botones reserva. */
	private JPanel pnlBotonesReserva;
	
	/** The pnl datos reserva. */
	private pnlFormReserva pnlDatosReserva;
	
	/** The pnl listado reservas. */
	private JPanel pnlListadoReservas;
	
	/** The scroll pane reservas. */
	private JScrollPane scrollPaneReservas;
	
	/** The pnl contenedor reserva. */
	private pnlContenedorReservas pnlContenedorReserva;
	
	/** The btn modificar reserva. */
	private JButton btnModificarReserva;
	
	/** The btn eliminar reserva. */
	private JButton btnEliminarReserva;
	
	/** The btn refrescar. */
	private JButton btnRefrescar;
	
	/** The pnl rutas senderistas. */
	private JPanel pnlRutasSenderistas;
	
	/** The pnl vista rutas. */
	private JPanel pnlVistaRutas;
	
	/** The lbl bsqueda por nombre 1. */
	private JLabel lblBsquedaPorNombre_1;
	
	/** The tf busqueda nombre ruta. */
	private JTextField tfBusquedaNombreRuta;
	
	/** The pnl contenedor botones ruta. */
	private JPanel pnlContenedorBotonesRuta;
	
	/** The btn editar. */
	private JButton btnEditar;
	
	/** The btn eliminar ruta. */
	private JButton btnEliminarRuta;
	
	/** The pnl datos rutas senderistas. */
	private pnlFormRutas pnlDatosRutasSenderistas;
	
	/** The pnl lista rutas. */
	private JPanel pnlListaRutas;
	
	/** The scroll pane rutas. */
	private JScrollPane scrollPaneRutas;
	
	/** The pnl contenedor rutas. */
	private pnlContenedorRutas pnlContenedorRutas;
	
	/** The pnl diseno. */
	private JPanel pnlDiseno;
	
	/** The pnl boton back. */
	private JPanel pnlBotonBack;
	
	/** The btn volver. */
	private JButton btnVolver;
	
	/** The pnl dibujo. */
	private pnlDibujarRuta pnlDibujo;
	
	/** The btn disear ruta. */
	private JButton btnDisearRuta;
	
	/** The mn idioma. */
	private JMenu mnIdioma;
	
	/** The rdbtn espaniol. */
	private JRadioButtonMenuItem rdbtnEspaniol;
	
	/** The rdbtn ingles. */
	private JRadioButtonMenuItem rdbtnIngles;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Presentacion/Imagenes/camping.jpg")));
		frmLogin.addKeyListener(new PnlLoginKeyListener());
		frmLogin.setTitle(MessagesLogin.getString("Login.frmLogin.title")); //$NON-NLS-1$
		frmLogin.getContentPane().addComponentListener(new FrameContentPaneComponentListener());
		frmLogin.setBounds(100, 20, 1605, 796);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(new CardLayout(0, 0));

		{
			pnlLogin = new JPanel();
			pnlLogin.addKeyListener(new PnlLoginKeyListener());
			pnlLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			pnlLogin.setBorder(null);
			frmLogin.getContentPane().add(pnlLogin, "panelLogin");
			pnlLogin.setLayout(null);

			{
				pnlIniciarSesion = new JPanel();
				pnlIniciarSesion.addKeyListener(new PnlIniciarSesionKeyListener());
				pnlIniciarSesion.setBackground(SystemColor.controlLtHighlight);
				pnlIniciarSesion.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				pnlIniciarSesion.setBounds(360, 178, 451, 406);
				pnlLogin.add(pnlIniciarSesion);
				GridBagLayout gbl_panelIniciarSesion = new GridBagLayout();
				gbl_panelIniciarSesion.columnWidths = new int[] { 50, 43, 160, 35, 14, 0 };
				gbl_panelIniciarSesion.rowHeights = new int[] { 81, 20, 26, 41, 21, 41, 20, 34, 20, 24, 0, 0 };
				gbl_panelIniciarSesion.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panelIniciarSesion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						0.0, Double.MIN_VALUE };
				pnlIniciarSesion.setLayout(gbl_panelIniciarSesion);
				{
					lblIniciarSesin = new JLabel(MessagesLogin.getString("Login.lblIniciarSesin.text")); //$NON-NLS-1$
					lblIniciarSesin.setBorder(new EmptyBorder(0, 10, 0, 0));
					lblIniciarSesin.setForeground(SystemColor.text);
					lblIniciarSesin.setBackground(SystemColor.textInactiveText);
					lblIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 24));
					lblIniciarSesin.setOpaque(true);
					GridBagConstraints gbc_lblInicioSesion = new GridBagConstraints();
					gbc_lblInicioSesion.fill = GridBagConstraints.BOTH;
					gbc_lblInicioSesion.gridwidth = 5;
					gbc_lblInicioSesion.insets = new Insets(0, 0, 5, 0);
					gbc_lblInicioSesion.gridx = 0;
					gbc_lblInicioSesion.gridy = 0;
					pnlIniciarSesion.add(lblIniciarSesin, gbc_lblInicioSesion);
				}
				{
					lblErrorLaContrasea = new JLabel(MessagesLogin.getString("Login.lblErrorLaContrasea.text")); //$NON-NLS-1$
					lblErrorLaContrasea.setBorder(new LineBorder(new Color(178, 34, 34), 1, true));
					lblErrorLaContrasea.setHorizontalAlignment(SwingConstants.CENTER);
					lblErrorLaContrasea.setOpaque(true);
					lblErrorLaContrasea.setBackground(new Color(255, 99, 71));
					lblErrorLaContrasea.setFont(new Font("Tahoma", Font.BOLD, 11));
					lblErrorLaContrasea.setForeground(Color.BLACK);
					lblErrorLaContrasea.setVisible(false);
					GridBagConstraints gbc_lblErrorLogin = new GridBagConstraints();
					gbc_lblErrorLogin.fill = GridBagConstraints.BOTH;
					gbc_lblErrorLogin.gridwidth = 2;
					gbc_lblErrorLogin.insets = new Insets(0, 0, 5, 5);
					gbc_lblErrorLogin.gridx = 1;
					gbc_lblErrorLogin.gridy = 2;
					pnlIniciarSesion.add(lblErrorLaContrasea, gbc_lblErrorLogin);
				}
				{
					pnlUser = new JPanel();
					pnlUser.setToolTipText(MessagesLogin.getString("Login.pnlUser.toolTipText")); //$NON-NLS-1$
					pnlUser.setBorder(null);
					GridBagConstraints gbc_panelUser = new GridBagConstraints();
					gbc_panelUser.fill = GridBagConstraints.BOTH;
					gbc_panelUser.gridwidth = 2;
					gbc_panelUser.insets = new Insets(0, 0, 5, 5);
					gbc_panelUser.gridx = 1;
					gbc_panelUser.gridy = 3;
					pnlIniciarSesion.add(pnlUser, gbc_panelUser);
					GridBagLayout gbl_panelUser = new GridBagLayout();
					gbl_panelUser.columnWidths = new int[] { 43, 53, 160, 0, 0 };
					gbl_panelUser.rowHeights = new int[] { 39, 0 };
					gbl_panelUser.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
					gbl_panelUser.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
					pnlUser.setLayout(gbl_panelUser);
					{
						lblIconUser = new JLabel(); // $NON-NLS-1$
						lblIconUser.setIcon(
								new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/userLogin.png")));
						GridBagConstraints gbc_lblIconUser = new GridBagConstraints();
						gbc_lblIconUser.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconUser.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconUser.gridx = 0;
						gbc_lblIconUser.gridy = 0;
						pnlUser.add(lblIconUser, gbc_lblIconUser);
					}
					{

						txtUsuario = new JTextField();
						try {
							formatoDNI = new MaskFormatter("########");
							formatoDNI.setPlaceholderCharacter('X');
							txtUsuario = new JFormattedTextField(formatoDNI);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
						txtUsuario.setBackground(UIManager.getColor("CheckBox.background"));
						GridBagConstraints gbc_txtUser = new GridBagConstraints();
						gbc_txtUser.gridwidth = 2;
						gbc_txtUser.fill = GridBagConstraints.BOTH;
						gbc_txtUser.insets = new Insets(0, 0, 0, 5);
						gbc_txtUser.gridx = 1;
						gbc_txtUser.gridy = 0;
						pnlUser.add(txtUsuario, gbc_txtUser);
						txtUsuario.setBorder(null);
						txtUsuario.setColumns(10);
					}
				}
				{
					pnlPass = new JPanel();
					GridBagConstraints gbc_panelPass = new GridBagConstraints();
					gbc_panelPass.fill = GridBagConstraints.BOTH;
					gbc_panelPass.gridwidth = 2;
					gbc_panelPass.insets = new Insets(0, 0, 5, 5);
					gbc_panelPass.gridx = 1;
					gbc_panelPass.gridy = 5;
					pnlIniciarSesion.add(pnlPass, gbc_panelPass);
					GridBagLayout gbl_panelPass = new GridBagLayout();
					gbl_panelPass.columnWidths = new int[] { 43, 53, 160, 32, 0 };
					gbl_panelPass.rowHeights = new int[] { 37, 0 };
					gbl_panelPass.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
					gbl_panelPass.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
					pnlPass.setLayout(gbl_panelPass);
					{
						lblIconPass = new JLabel(); // $NON-NLS-1$
						lblIconPass.setIcon(
								new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/locked-padlock.png")));
						lblIconPass.setHorizontalTextPosition(SwingConstants.LEADING);
						lblIconPass.setHorizontalAlignment(SwingConstants.TRAILING);
						GridBagConstraints gbc_lblIconPass = new GridBagConstraints();
						gbc_lblIconPass.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconPass.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconPass.gridx = 0;
						gbc_lblIconPass.gridy = 0;
						pnlPass.add(lblIconPass, gbc_lblIconPass);
					}
					{
						pwdContrasena = new JPasswordField();
						pwdContrasena.addFocusListener(new PwdContraseaFocusListener());
						pwdContrasena.addKeyListener(new PwdContraseaKeyListener());
						pwdContrasena.setFont(new Font("Tahoma", Font.BOLD, 12));
						pwdContrasena.setText(MessagesLogin.getString("Login.pwdContrasena.text")); //$NON-NLS-1$
						pwdContrasena.setBackground(UIManager.getColor("CheckBox.background"));
						GridBagConstraints gbc_pwdContrasea = new GridBagConstraints();
						gbc_pwdContrasea.fill = GridBagConstraints.BOTH;
						gbc_pwdContrasea.gridwidth = 2;
						gbc_pwdContrasea.insets = new Insets(0, 0, 0, 5);
						gbc_pwdContrasea.gridx = 1;
						gbc_pwdContrasea.gridy = 0;
						pnlPass.add(pwdContrasena, gbc_pwdContrasea);
						pwdContrasena.setBorder(null);
					}
					{
						btnVerPass = new JButton(); // $NON-NLS-1$
						verPass = false;
						btnVerPass.setToolTipText(MessagesLogin.getString("")); //$NON-NLS-1$
						btnVerPass.addActionListener(new BtnVerpassActionListener());
						btnVerPass.setOpaque(true);
						btnVerPass.setContentAreaFilled(false);
						btnVerPass.setBackground(UIManager.getColor("CheckBox.background"));
						btnVerPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnVerPass.setBorder(null);
						btnVerPass.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/eye.png")));
						GridBagConstraints gbc_btnVerPass = new GridBagConstraints();
						gbc_btnVerPass.anchor = GridBagConstraints.WEST;
						gbc_btnVerPass.gridx = 3;
						gbc_btnVerPass.gridy = 0;
						pnlPass.add(btnVerPass, gbc_btnVerPass);
					}
				}
				{
					btnEntrar = new JButton(MessagesLogin.getString("Login.btnEntrar.text")); //$NON-NLS-1$
					btnEntrar.setMnemonic(KeyEvent.VK_ENTER);
					btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnEntrar.addActionListener(new BtnEntrarActionListener());
					{
						chckbxRecordarContrasea = new JCheckBox(
								MessagesLogin.getString("Login.chckbxRecordarContrasea.text")); //$NON-NLS-1$
						chckbxRecordarContrasea.setBackground(SystemColor.text);
						GridBagConstraints gbc_chckbxRecordarPass = new GridBagConstraints();
						gbc_chckbxRecordarPass.fill = GridBagConstraints.BOTH;
						gbc_chckbxRecordarPass.insets = new Insets(0, 0, 5, 5);
						gbc_chckbxRecordarPass.gridx = 1;
						gbc_chckbxRecordarPass.gridy = 7;
						pnlIniciarSesion.add(chckbxRecordarContrasea, gbc_chckbxRecordarPass);
					}
					GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
					gbc_btnEntrar.fill = GridBagConstraints.BOTH;
					gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
					gbc_btnEntrar.gridx = 2;
					gbc_btnEntrar.gridy = 7;
					pnlIniciarSesion.add(btnEntrar, gbc_btnEntrar);
				}
				{
					lblteHasOlvidado = new JLabel(MessagesLogin.getString("Login.lblteHasOlvidado.text")); //$NON-NLS-1$
					lblteHasOlvidado.setHorizontalAlignment(SwingConstants.CENTER);
					lblteHasOlvidado.setHorizontalTextPosition(SwingConstants.CENTER);
					lblteHasOlvidado.setFont(new Font("Tahoma", Font.PLAIN, 12));
					lblteHasOlvidado.setForeground(SystemColor.textHighlight);
					lblteHasOlvidado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					GridBagConstraints gbc_lblOlvidadoPass = new GridBagConstraints();
					gbc_lblOlvidadoPass.anchor = GridBagConstraints.NORTH;
					gbc_lblOlvidadoPass.fill = GridBagConstraints.HORIZONTAL;
					gbc_lblOlvidadoPass.insets = new Insets(0, 0, 5, 5);
					gbc_lblOlvidadoPass.gridwidth = 4;
					gbc_lblOlvidadoPass.gridx = 0;
					gbc_lblOlvidadoPass.gridy = 9;
					pnlIniciarSesion.add(lblteHasOlvidado, gbc_lblOlvidadoPass);
				}
			}
		}
		{
			pnlApp = new JPanel();
			pnlApp.setBorder(new EmptyBorder(3, 3, 3, 3));
			frmLogin.getContentPane().add(pnlApp, "pnlApp");
			pnlApp.setLayout(new BorderLayout(0, 0));
			{
				pnlInformacion = new JPanel();
				pnlApp.add(pnlInformacion, BorderLayout.WEST);
				pnlInformacion.setLayout(new BorderLayout(0, 0));
				{
					pnlOcultar = new JPanel();
					pnlOcultar.setBorder(new EmptyBorder(3, 3, 3, 3));
					pnlOcultar.setAlignmentX(Component.LEFT_ALIGNMENT);
					pnlOcultar.setToolTipText(MessagesLogin.getString("Login.pnlOcultar.toolTipText")); //$NON-NLS-1$
					pnlInformacion.add(pnlOcultar, BorderLayout.EAST);
					GridBagLayout gbl_pnlOcultar = new GridBagLayout();
					gbl_pnlOcultar.columnWidths = new int[] { 33, 0 };
					gbl_pnlOcultar.rowHeights = new int[] { 665, 0 };
					gbl_pnlOcultar.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
					gbl_pnlOcultar.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
					pnlOcultar.setLayout(gbl_pnlOcultar);
					{
						btnOcultar = new JButton();
						btnOcultar.setToolTipText(MessagesLogin.getString("Login.btnOcultar.toolTipText")); //$NON-NLS-1$
						btnOcultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnOcultar.addActionListener(new BtnOcultarActionListener());
						btnOcultar
								.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/mostrar.png")));
						btnOcultar.setPreferredSize(new Dimension(15, 15));
						btnOcultar.setMinimumSize(new Dimension(10, 10));
						GridBagConstraints gbc_btnOcultar = new GridBagConstraints();
						gbc_btnOcultar.fill = GridBagConstraints.BOTH;
						gbc_btnOcultar.gridx = 0;
						gbc_btnOcultar.gridy = 0;
						pnlOcultar.add(btnOcultar, gbc_btnOcultar);
					}
				}
				{
					pnlUserData = new JPanel();
					pnlInformacion.add(pnlUserData);
					pnlUserData.setLayout(new BorderLayout(0, 0));
					{
						pnlUsuario = new pnlUsuario();
						GridBagLayout gridBagLayout = (GridBagLayout) pnlUsuario.getLayout();
						gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0 };
						gridBagLayout.columnWidths = new int[] { 10, 0, 0, 0 };
						pnlUserData.add(pnlUsuario, BorderLayout.CENTER);
					}
					{
						menuBar = new JMenuBar();
						pnlUserData.add(menuBar, BorderLayout.NORTH);
						{
							btnAyuda = new JButton(MessagesLogin.getString("Login.btnAyuda.text")); //$NON-NLS-1$
							btnAyuda.addActionListener(new BtnAyudaActionListener());
							btnAyuda.setToolTipText(MessagesLogin.getString("Login.btnAyuda.toolTipText")); //$NON-NLS-1$
							btnAyuda.setIcon(
									new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/informacion.png")));
							menuBar.add(btnAyuda);
						}
						{
							btnConfiguracin = new JButton(MessagesLogin.getString("Login.btnConfiguracin.text")); //$NON-NLS-1$
							btnConfiguracin.addActionListener(new BtnConfiguracinActionListener());
							btnConfiguracin
									.setToolTipText(MessagesLogin.getString("Login.btnConfiguracin.toolTipText")); //$NON-NLS-1$
							btnConfiguracin.setIcon(new ImageIcon(
									Login.class.getResource("/Presentacion/Imagenes/configuraciones.png")));
							menuBar.add(btnConfiguracin);
						}
						{
							mnIdioma = new JMenu();
							mnIdioma.setIcon(
									new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/mundial.png")));
							mnIdioma.setText(MessagesLogin.getString("Login.mnIdioma_1.text")); //$NON-NLS-1$
							mnIdioma.setToolTipText(MessagesLogin.getString("Login.mnIdioma_1.toolTipText")); //$NON-NLS-1$
							menuBar.add(mnIdioma);
							{
								rdbtnEspaniol = new JRadioButtonMenuItem(
										MessagesLogin.getString("Login.rdbtnEspaniol.text")); //$NON-NLS-1$
								rdbtnEspaniol.addActionListener(new RdbtnCambiarIdiomaActionListener());
								rdbtnEspaniol.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/spain16x16.png")));
								mnIdioma.add(rdbtnEspaniol);
							}
							{
								rdbtnIngles = new JRadioButtonMenuItem(
										MessagesLogin.getString("Login.rdbtnIngles.text")); //$NON-NLS-1$
								rdbtnIngles.addActionListener(new RdbtnCambiarIdiomaActionListener());
								rdbtnIngles.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/united-kingdom16x16.png")));
								mnIdioma.add(rdbtnIngles);
							}
						}
					}
					{
						pnlBtnSalir = new JPanel();
						pnlUserData.add(pnlBtnSalir, BorderLayout.SOUTH);
						{
							btnSalir = new JButton(MessagesLogin.getString("Login.btnSalir.text")); //$NON-NLS-1$
							btnSalir.setToolTipText(MessagesLogin.getString("Login.btnSalir.toolTipText")); //$NON-NLS-1$
							btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnSalir.addActionListener(new BtnSalirActionListener());
							pnlBtnSalir.add(btnSalir);
						}
						{
							btnCerrarSesin = new JButton(MessagesLogin.getString("Login.btnCerrarSesin.text")); //$NON-NLS-1$
							btnCerrarSesin.setToolTipText(MessagesLogin.getString("Login.btnCerrarSesin.toolTipText")); //$NON-NLS-1$
							btnCerrarSesin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnCerrarSesin.addActionListener(new BtnCerrarSesinActionListener());
							btnCerrarSesin.setIcon(
									new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/cerrar-sesion.png")));
							pnlBtnSalir.add(btnCerrarSesin);
						}
					}
				}
			}
			{
				pnlPestanas = new JPanel();
				pnlPestanas.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
				pnlPestanas.setBorder(null);
				pnlApp.add(pnlPestanas, BorderLayout.CENTER);
				pnlPestanas.setLayout(new BorderLayout(0, 0));
				{
					pnlContenedorPestanas = new JTabbedPane(JTabbedPane.TOP);
					pnlPestanas.add(pnlContenedorPestanas);
					{
						pnlBungalows = new JPanel();
						pnlContenedorPestanas.addTab("Bungalows", null, pnlBungalows, null);
						pnlBungalows.setLayout(new BorderLayout(0, 0));
						{
							pnlBusqueda = new JPanel();
							pnlBungalows.add(pnlBusqueda, BorderLayout.NORTH);
							GridBagLayout gbl_pnlBusqueda = new GridBagLayout();
							gbl_pnlBusqueda.columnWidths = new int[] { 25, 0, 0, 0, 0, 0, 0, 118, 81, 32, 0, 0 };
							gbl_pnlBusqueda.rowHeights = new int[] { 25, 30, 25, 0 };
							gbl_pnlBusqueda.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, 0.0, Double.MIN_VALUE };
							gbl_pnlBusqueda.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
							pnlBusqueda.setLayout(gbl_pnlBusqueda);
							{
								lblBusquedaPorNombre = new JLabel(
										MessagesLogin.getString("Login.lblBusquedaPorNombre.text")); //$NON-NLS-1$
								lblBusquedaPorNombre.setIcon(
										new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/lupa.png")));
								GridBagConstraints gbc_lblBusquedaPorNombre = new GridBagConstraints();
								gbc_lblBusquedaPorNombre.insets = new Insets(0, 0, 5, 5);
								gbc_lblBusquedaPorNombre.anchor = GridBagConstraints.EAST;
								gbc_lblBusquedaPorNombre.gridx = 1;
								gbc_lblBusquedaPorNombre.gridy = 1;
								pnlBusqueda.add(lblBusquedaPorNombre, gbc_lblBusquedaPorNombre);
							}
							{
								tfBusquedaBungalow = new JTextField();
								tfBusquedaBungalow.addKeyListener(new TfBusquedaBungalowKeyListener());
								GridBagConstraints gbc_tfBusquedaBungalow = new GridBagConstraints();
								gbc_tfBusquedaBungalow.gridwidth = 8;
								gbc_tfBusquedaBungalow.insets = new Insets(0, 0, 5, 5);
								gbc_tfBusquedaBungalow.fill = GridBagConstraints.HORIZONTAL;
								gbc_tfBusquedaBungalow.gridx = 2;
								gbc_tfBusquedaBungalow.gridy = 1;
								pnlBusqueda.add(tfBusquedaBungalow, gbc_tfBusquedaBungalow);
								tfBusquedaBungalow.setColumns(10);
							}
						}
						{
							pnlBotones = new JPanel();
							pnlBungalows.add(pnlBotones, BorderLayout.SOUTH);
							GridBagLayout gbl_pnlBotones = new GridBagLayout();
							gbl_pnlBotones.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
							gbl_pnlBotones.rowHeights = new int[] { 20, 0, 20, 0 };
							gbl_pnlBotones.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0,
									Double.MIN_VALUE };
							gbl_pnlBotones.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
							pnlBotones.setLayout(gbl_pnlBotones);
							{
								btnAadir = new JButton(MessagesLogin.getString("Login.btnAadir.text")); //$NON-NLS-1$
								btnAadir.addActionListener(new BtnAadirActionListener());
								btnAadir.setToolTipText(MessagesLogin.getString("Login.btnAadir.toolTipText")); //$NON-NLS-1$
								btnAadir.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/add-button16x16.png")));
								btnAadir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								GridBagConstraints gbc_btnAadir = new GridBagConstraints();
								gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
								gbc_btnAadir.gridx = 1;
								gbc_btnAadir.gridy = 1;
								pnlBotones.add(btnAadir, gbc_btnAadir);
							}
							{
								btnEliminar = new JButton(MessagesLogin.getString("Login.btnEliminar.text")); //$NON-NLS-1$
								btnEliminar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
								btnEliminar.setToolTipText(MessagesLogin.getString("Login.btnEliminar.toolTipText")); //$NON-NLS-1$
								btnEliminar.addActionListener(new BtnEliminarActionListener());
								GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
								gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminar.gridx = 3;
								gbc_btnEliminar.gridy = 1;
								pnlBotones.add(btnEliminar, gbc_btnEliminar);
							}
							{
								btnModificar = new JButton(MessagesLogin.getString("Login.btnModificar.text")); //$NON-NLS-1$
								btnModificar.addActionListener(new BtnModificarActionListener());
								btnModificar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
								btnModificar.setToolTipText(MessagesLogin.getString("Login.btnModificar.toolTipText")); //$NON-NLS-1$
								GridBagConstraints gbc_btnModificar = new GridBagConstraints();
								gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
								gbc_btnModificar.gridx = 5;
								gbc_btnModificar.gridy = 1;
								pnlBotones.add(btnModificar, gbc_btnModificar);
							}
						}
						{
							pnlContenedor = new JPanel();
							pnlBungalows.add(pnlContenedor, BorderLayout.CENTER);
							pnlContenedor.setLayout(new CardLayout(0, 0));
							{
								pnlContenedorBungalows = new pnlContenedorBungalows();
								pnlContenedor.add(pnlContenedorBungalows, "pnlBungalows");
							}
						}
						{
							{
								{
								}
							}
						}
					}
					{
						pnlParcelas = new JPanel();
						pnlContenedorPestanas.addTab("Parcelas", null, pnlParcelas, null);
						pnlParcelas.setLayout(new BorderLayout(0, 0));
						{
							pnlBusquedaPar = new JPanel();
							pnlParcelas.add(pnlBusquedaPar, BorderLayout.NORTH);
							GridBagLayout gbl_pnlBusquedaPar = new GridBagLayout();
							gbl_pnlBusquedaPar.columnWidths = new int[] { 25, 0, 0, 0, 0, 106, 50, 90, 0, 0, 0, 0 };
							gbl_pnlBusquedaPar.rowHeights = new int[] { 25, 0, 25, 0 };
							gbl_pnlBusquedaPar.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, 0.0, 0.0, Double.MIN_VALUE };
							gbl_pnlBusquedaPar.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
							pnlBusquedaPar.setLayout(gbl_pnlBusquedaPar);
							{
								lblBusquedaPorNombre_P = new JLabel(
										MessagesLogin.getString("Login.lblBusquedaPorNombre_P.text")); //$NON-NLS-1$
								lblBusquedaPorNombre_P.setIcon(
										new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/lupa.png")));
								GridBagConstraints gbc_lblBusquedaPorNombre_P = new GridBagConstraints();
								gbc_lblBusquedaPorNombre_P.insets = new Insets(0, 0, 5, 5);
								gbc_lblBusquedaPorNombre_P.anchor = GridBagConstraints.EAST;
								gbc_lblBusquedaPorNombre_P.gridx = 1;
								gbc_lblBusquedaPorNombre_P.gridy = 1;
								pnlBusquedaPar.add(lblBusquedaPorNombre_P, gbc_lblBusquedaPorNombre_P);
							}
							{
								textFieldBusquedaPar = new JTextField();
								GridBagConstraints gbc_textFieldBusquedaPar = new GridBagConstraints();
								gbc_textFieldBusquedaPar.gridwidth = 8;
								gbc_textFieldBusquedaPar.insets = new Insets(0, 0, 5, 5);
								gbc_textFieldBusquedaPar.fill = GridBagConstraints.HORIZONTAL;
								gbc_textFieldBusquedaPar.gridx = 2;
								gbc_textFieldBusquedaPar.gridy = 1;
								pnlBusquedaPar.add(textFieldBusquedaPar, gbc_textFieldBusquedaPar);
								textFieldBusquedaPar.setColumns(10);
							}
						}
						{
							pnlBotonesPar = new JPanel();
							pnlParcelas.add(pnlBotonesPar, BorderLayout.SOUTH);
							GridBagLayout gbl_pnlBotonesPar = new GridBagLayout();
							gbl_pnlBotonesPar.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
							gbl_pnlBotonesPar.rowHeights = new int[] { 20, 0, 20, 0 };
							gbl_pnlBotonesPar.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0,
									Double.MIN_VALUE };
							gbl_pnlBotonesPar.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
							pnlBotonesPar.setLayout(gbl_pnlBotonesPar);
							{
								btnAadirPar = new JButton(MessagesLogin.getString("Login.btnAadirPar.text")); //$NON-NLS-1$
								btnAadirPar.addActionListener(new BtnAadirParActionListener());
								btnAadirPar.setToolTipText(MessagesLogin.getString("Login.btnAadirPar.toolTipText")); //$NON-NLS-1$
								btnAadirPar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/add-button16x16.png")));
								GridBagConstraints gbc_btnAadirPar = new GridBagConstraints();
								gbc_btnAadirPar.insets = new Insets(0, 0, 5, 5);
								gbc_btnAadirPar.gridx = 1;
								gbc_btnAadirPar.gridy = 1;
								pnlBotonesPar.add(btnAadirPar, gbc_btnAadirPar);
							}
							{
								btnEliminarPar = new JButton(MessagesLogin.getString("Login.btnEliminarPar.text")); //$NON-NLS-1$
								btnEliminarPar
										.setToolTipText(MessagesLogin.getString("Login.btnEliminarPar.toolTipText")); //$NON-NLS-1$
								btnEliminarPar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
								btnEliminarPar.addActionListener(new BtnEliminarParActionListener());
								GridBagConstraints gbc_btnEliminarPar = new GridBagConstraints();
								gbc_btnEliminarPar.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminarPar.gridx = 3;
								gbc_btnEliminarPar.gridy = 1;
								pnlBotonesPar.add(btnEliminarPar, gbc_btnEliminarPar);
							}
							{
								btnModificar_1 = new JButton(MessagesLogin.getString("Login.btnModificar_1.text")); //$NON-NLS-1$
								btnModificar_1.addActionListener(new BtnModificar_1ActionListener());
								btnModificar_1
										.setToolTipText(MessagesLogin.getString("Login.btnModificar_1.toolTipText")); //$NON-NLS-1$
								btnModificar_1.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
								GridBagConstraints gbc_btnModificar_1 = new GridBagConstraints();
								gbc_btnModificar_1.insets = new Insets(0, 0, 5, 5);
								gbc_btnModificar_1.gridx = 5;
								gbc_btnModificar_1.gridy = 1;
								pnlBotonesPar.add(btnModificar_1, gbc_btnModificar_1);
							}
						}
						{
							pnlContenedorPar = new JPanel();
							pnlParcelas.add(pnlContenedorPar, BorderLayout.CENTER);
							pnlContenedorPar.setLayout(new CardLayout(0, 0));
							{
								pnlContenedorParcelas = new pnlContenedorParcelas();
								pnlContenedorPar.add(pnlContenedorParcelas, "pnlParcela");
							}
						}
					}
					{
						pnlEmpleados = new JPanel();
						pnlContenedorPestanas.addTab("Empleados", null, pnlEmpleados, null);
						GridBagLayout gbl_pnlEmpleados = new GridBagLayout();
						gbl_pnlEmpleados.columnWidths = new int[] { 15, 0, 326, 30, 0, 0, 0, 0, 0 };
						gbl_pnlEmpleados.rowHeights = new int[] { 54, 0, 15, 0 };
						gbl_pnlEmpleados.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0,
								Double.MIN_VALUE };
						gbl_pnlEmpleados.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
						pnlEmpleados.setLayout(gbl_pnlEmpleados);
						{
							lblBusquedaPorDni = new JLabel(MessagesLogin.getString("Login.lblBusquedaPorDni.text")); //$NON-NLS-1$
							lblBusquedaPorDni
									.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/lupa.png")));
							GridBagConstraints gbc_lblBusquedaPorDni = new GridBagConstraints();
							gbc_lblBusquedaPorDni.fill = GridBagConstraints.BOTH;
							gbc_lblBusquedaPorDni.insets = new Insets(0, 0, 5, 5);
							gbc_lblBusquedaPorDni.gridx = 1;
							gbc_lblBusquedaPorDni.gridy = 0;
							pnlEmpleados.add(lblBusquedaPorDni, gbc_lblBusquedaPorDni);
						}
						{
							tfBusquedaDni = new JTextField();
							tfBusquedaDni.addKeyListener(new TfBusquedaDniKeyListener());
							GridBagConstraints gbc_tfBusquedaDni = new GridBagConstraints();
							gbc_tfBusquedaDni.insets = new Insets(0, 0, 5, 5);
							gbc_tfBusquedaDni.fill = GridBagConstraints.HORIZONTAL;
							gbc_tfBusquedaDni.gridx = 2;
							gbc_tfBusquedaDni.gridy = 0;
							pnlEmpleados.add(tfBusquedaDni, gbc_tfBusquedaDni);
							tfBusquedaDni.setColumns(10);
						}
						{
							pnlBotonesEmpleados = new JPanel();
							GridBagConstraints gbc_pnlBotonesEmpleados = new GridBagConstraints();
							gbc_pnlBotonesEmpleados.gridwidth = 3;
							gbc_pnlBotonesEmpleados.insets = new Insets(0, 0, 5, 5);
							gbc_pnlBotonesEmpleados.fill = GridBagConstraints.BOTH;
							gbc_pnlBotonesEmpleados.gridx = 4;
							gbc_pnlBotonesEmpleados.gridy = 0;
							pnlEmpleados.add(pnlBotonesEmpleados, gbc_pnlBotonesEmpleados);
							pnlBotonesEmpleados.setLayout(new CardLayout(0, 0));
							{
								pnlPrincipales = new JPanel();
								pnlBotonesEmpleados.add(pnlPrincipales, "pnlPrincipales");
								{
									btnAddEmpleado = new JButton(MessagesLogin.getString("Login.btnAddEmpleado.text")); //$NON-NLS-1$
									btnAddEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnAddEmpleado.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/add-user-button.png")));
									btnAddEmpleado.addActionListener(new BtnAadir_1ActionListener());
									btnAddEmpleado.setToolTipText(
											MessagesLogin.getString("Login.btnAddEmpleado.toolTipText")); //$NON-NLS-1$
									pnlPrincipales.add(btnAddEmpleado);
								}
								{
									btnModificarEmpleado = new JButton(
											MessagesLogin.getString("Login.btnModificarEmpleado.text")); //$NON-NLS-1$
									btnModificarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnModificarEmpleado.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
									btnModificarEmpleado.setToolTipText(
											MessagesLogin.getString("Login.btnModificarEmpleado.toolTipText")); //$NON-NLS-1$
									btnModificarEmpleado.addActionListener(new BtnNewButton_1ActionListener());
									pnlPrincipales.add(btnModificarEmpleado);
								}
								{
									btnEliminarEmpleado = new JButton(
											MessagesLogin.getString("Login.btnEliminarEmpleado.text")); //$NON-NLS-1$
									btnEliminarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnEliminarEmpleado.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
									btnEliminarEmpleado.addActionListener(new BtnEliminar1ActionListener());
									btnEliminarEmpleado.setToolTipText(
											MessagesLogin.getString("Login.btnEliminarEmpleado.toolTipText")); //$NON-NLS-1$
									pnlPrincipales.add(btnEliminarEmpleado);
								}
							}
							{
								pnlEditar = new JPanel();
								pnlBotonesEmpleados.add(pnlEditar, "pnlEditar");
								{
									btnGuardar = new JButton(MessagesLogin.getString("Login.btnGuardar.text")); //$NON-NLS-1$
									btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnGuardar.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/save16x16.png")));
									btnGuardar.addActionListener(new BtnGuardarActionListener());
									btnGuardar.setToolTipText(MessagesLogin.getString("Login.btnGuardar.toolTipText")); //$NON-NLS-1$
									pnlEditar.add(btnGuardar);
								}
								{
									btnCancelar = new JButton(MessagesLogin.getString("Login.btnCancelar.text")); //$NON-NLS-1$
									btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnCancelar.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/cancel16x16.png")));
									btnCancelar.addActionListener(new BtnCancelarActionListener());
									btnCancelar
											.setToolTipText(MessagesLogin.getString("Login.btnCancelar.toolTipText")); //$NON-NLS-1$
									pnlEditar.add(btnCancelar);
								}
							}
						}
						{
							pnlDatosEmpleado = new pnlFormEmpleado(frmLogin);
							GridBagConstraints gbc_pnlDatosEmpleado = new GridBagConstraints();
							gbc_pnlDatosEmpleado.gridwidth = 3;
							gbc_pnlDatosEmpleado.insets = new Insets(0, 0, 5, 5);
							gbc_pnlDatosEmpleado.fill = GridBagConstraints.BOTH;
							gbc_pnlDatosEmpleado.gridx = 4;
							gbc_pnlDatosEmpleado.gridy = 1;
							pnlEmpleados.add(pnlDatosEmpleado, gbc_pnlDatosEmpleado);

						}
						{
							pnlListadoEmpleados = new JPanel();
							GridBagConstraints gbc_pnlListadoEmpleados = new GridBagConstraints();
							gbc_pnlListadoEmpleados.gridwidth = 2;
							gbc_pnlListadoEmpleados.insets = new Insets(0, 0, 5, 5);
							gbc_pnlListadoEmpleados.fill = GridBagConstraints.BOTH;
							gbc_pnlListadoEmpleados.gridx = 1;
							gbc_pnlListadoEmpleados.gridy = 1;
							pnlEmpleados.add(pnlListadoEmpleados, gbc_pnlListadoEmpleados);
							pnlListadoEmpleados.setLayout(new BorderLayout(0, 0));
							{
								scrollPane = new JScrollPane();
								scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
								scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
								pnlListadoEmpleados.add(scrollPane);

								{
									pnlContenedorEmpleados = new pnlContenedorEmpleados(this.cargarEmpleados(),
											pnlDatosEmpleado);
									scrollPane.setViewportView(pnlContenedorEmpleados);

								}
							}
						}
					}
					{
						pnlActividades = new JPanel();
						pnlContenedorPestanas.addTab("Actividades", null, pnlActividades, null);
						GridBagLayout gbl_pnlActividades = new GridBagLayout();
						gbl_pnlActividades.columnWidths = new int[] { 15, 0, 326, 30, 0, 0, 0, 0, 0 };
						gbl_pnlActividades.rowHeights = new int[] { 54, 0, 15, 0 };
						gbl_pnlActividades.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0,
								Double.MIN_VALUE };
						gbl_pnlActividades.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
						pnlActividades.setLayout(gbl_pnlActividades);
						{
							lblBsquedaPorNombre = new JLabel(MessagesLogin.getString("Login.lblBsquedaPorNombre.text")); //$NON-NLS-1$
							lblBsquedaPorNombre
									.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/lupa.png")));
							GridBagConstraints gbc_lblBsquedaPorNombre = new GridBagConstraints();
							gbc_lblBsquedaPorNombre.anchor = GridBagConstraints.WEST;
							gbc_lblBsquedaPorNombre.insets = new Insets(0, 0, 5, 5);
							gbc_lblBsquedaPorNombre.gridx = 1;
							gbc_lblBsquedaPorNombre.gridy = 0;
							pnlActividades.add(lblBsquedaPorNombre, gbc_lblBsquedaPorNombre);
						}
						{
							tfBusquedaNombreActividad = new JTextField();
							tfBusquedaNombreActividad.addKeyListener(new TfBusquedaNombreActividadKeyListener());
							tfBusquedaNombreActividad.setColumns(10);
							GridBagConstraints gbc_tfBusquedaNombreActividad = new GridBagConstraints();
							gbc_tfBusquedaNombreActividad.fill = GridBagConstraints.HORIZONTAL;
							gbc_tfBusquedaNombreActividad.insets = new Insets(0, 0, 5, 5);
							gbc_tfBusquedaNombreActividad.gridx = 2;
							gbc_tfBusquedaNombreActividad.gridy = 0;
							pnlActividades.add(tfBusquedaNombreActividad, gbc_tfBusquedaNombreActividad);
						}
						{
							pnlBotonesActividades = new JPanel();
							GridBagConstraints gbc_pnlBotonesActividades = new GridBagConstraints();
							gbc_pnlBotonesActividades.gridwidth = 3;
							gbc_pnlBotonesActividades.insets = new Insets(0, 0, 5, 5);
							gbc_pnlBotonesActividades.fill = GridBagConstraints.BOTH;
							gbc_pnlBotonesActividades.gridx = 4;
							gbc_pnlBotonesActividades.gridy = 0;
							pnlActividades.add(pnlBotonesActividades, gbc_pnlBotonesActividades);
							pnlBotonesActividades.setLayout(new CardLayout(0, 0));
							{
								pnlPrincipalesAct = new JPanel();
								pnlPrincipalesAct.setBorder(null);
								pnlBotonesActividades.add(pnlPrincipalesAct, "pnlPrincipalesAct");
								{
									btnAddActividad = new JButton(
											MessagesLogin.getString("Login.btnAddActividad.text")); //$NON-NLS-1$
									btnAddActividad.setToolTipText(
											MessagesLogin.getString("Login.btnAddActividad.toolTipText")); //$NON-NLS-1$
									btnAddActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnAddActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/add-button16x16.png")));
									btnAddActividad.addActionListener(new btnAddActividadActionListener());
									pnlPrincipalesAct.add(btnAddActividad);
								}
								{
									ModificarActividad = new JButton(
											MessagesLogin.getString("Login.ModificarActividad.text")); //$NON-NLS-1$
									ModificarActividad.setToolTipText(
											MessagesLogin.getString("Login.ModificarActividad.toolTipText")); //$NON-NLS-1$
									ModificarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									ModificarActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
									ModificarActividad.addActionListener(new ModificarActividadActionListener());
									pnlPrincipalesAct.add(ModificarActividad);
								}
								{
									btnEliminarActividad = new JButton(
											MessagesLogin.getString("Login.btnEliminarActividad.text")); //$NON-NLS-1$
									btnEliminarActividad.setToolTipText(
											MessagesLogin.getString("Login.btnEliminarActividad.toolTipText")); //$NON-NLS-1$
									btnEliminarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnEliminarActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
									btnEliminarActividad.addActionListener(new BtnEliminarActividadActionListener());
									pnlPrincipalesAct.add(btnEliminarActividad);
								}
							}
							{
								pnlEditarAct = new JPanel();
								pnlBotonesActividades.add(pnlEditarAct, "pnlEditarAct");
								{
									btnGuardarActividad = new JButton(
											MessagesLogin.getString("Login.btnGuardarActividad.text")); //$NON-NLS-1$
									btnGuardarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnGuardarActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/save16x16.png")));
									btnGuardarActividad.addActionListener(new BtnGuardarActividadActionListener());
									pnlEditarAct.add(btnGuardarActividad);
								}
								{
									btnCancelarActividad = new JButton(
											MessagesLogin.getString("Login.btnCancelarActividad.text")); //$NON-NLS-1$
									btnCancelarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnCancelarActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/cancel16x16.png")));
									btnCancelarActividad.addActionListener(new BtnCancelarActividadActionListener());
									pnlEditarAct.add(btnCancelarActividad);
								}
							}
						}
						{
							pnlListadoActividades = new JPanel();
							GridBagConstraints gbc_pnlListadoActividades = new GridBagConstraints();
							gbc_pnlListadoActividades.gridwidth = 2;
							gbc_pnlListadoActividades.insets = new Insets(0, 0, 5, 5);
							gbc_pnlListadoActividades.fill = GridBagConstraints.BOTH;
							gbc_pnlListadoActividades.gridx = 1;
							gbc_pnlListadoActividades.gridy = 1;
							pnlActividades.add(pnlListadoActividades, gbc_pnlListadoActividades);
							pnlListadoActividades.setLayout(new BorderLayout(0, 0));
							{
								scrollPaneActividades = new JScrollPane();
								pnlListadoActividades.add(scrollPaneActividades, BorderLayout.CENTER);

								{
									pnlDatosActividad = new pnlFormActividades(frmLogin);
									GridBagConstraints gbc_pnlDatosActividad = new GridBagConstraints();
									gbc_pnlDatosActividad.gridwidth = 3;
									gbc_pnlDatosActividad.insets = new Insets(0, 0, 5, 5);
									gbc_pnlDatosActividad.fill = GridBagConstraints.BOTH;
									gbc_pnlDatosActividad.gridx = 4;
									gbc_pnlDatosActividad.gridy = 1;
									pnlActividades.add(pnlDatosActividad, gbc_pnlDatosActividad);
								}
								{
									pnlContenedorActividades = new pnlContenedorActividades(this.cargarActividades(),
											pnlDatosActividad);
									scrollPaneActividades.setViewportView(pnlContenedorActividades);
								}
							}

						}
					}
					{
						pnlReservas = new JPanel();
						pnlContenedorPestanas.addTab("Reservas", null, pnlReservas, null);
						GridBagLayout gbl_pnlReservas = new GridBagLayout();
						gbl_pnlReservas.columnWidths = new int[] { 15, 0, 326, 30, 0, 0, 0, 15, 0 };
						gbl_pnlReservas.rowHeights = new int[] { 15, 0, 15, 0 };
						gbl_pnlReservas.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0,
								Double.MIN_VALUE };
						gbl_pnlReservas.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
						pnlReservas.setLayout(gbl_pnlReservas);
						{
							lblBsquedaPorNombreReserva = new JLabel(
									MessagesLogin.getString("Login.lblBsquedaPorDni.text")); //$NON-NLS-1$
							GridBagConstraints gbc_lblBsquedaPorNombreReserva = new GridBagConstraints();
							gbc_lblBsquedaPorNombreReserva.fill = GridBagConstraints.HORIZONTAL;
							gbc_lblBsquedaPorNombreReserva.insets = new Insets(0, 0, 5, 5);
							gbc_lblBsquedaPorNombreReserva.gridx = 1;
							gbc_lblBsquedaPorNombreReserva.gridy = 0;
							pnlReservas.add(lblBsquedaPorNombreReserva, gbc_lblBsquedaPorNombreReserva);
						}
						{
							tfBusquedaReserva = new JTextField();
							tfBusquedaReserva.addKeyListener(new TfBusquedaReservaKeyListener());
							GridBagConstraints gbc_tfBusquedaReserva = new GridBagConstraints();
							gbc_tfBusquedaReserva.insets = new Insets(0, 0, 5, 5);
							gbc_tfBusquedaReserva.fill = GridBagConstraints.HORIZONTAL;
							gbc_tfBusquedaReserva.gridx = 2;
							gbc_tfBusquedaReserva.gridy = 0;
							pnlReservas.add(tfBusquedaReserva, gbc_tfBusquedaReserva);
							tfBusquedaReserva.setColumns(10);
						}
						{
							pnlBotonesReserva = new JPanel();
							GridBagConstraints gbc_pnlBotonesReserva = new GridBagConstraints();
							gbc_pnlBotonesReserva.gridwidth = 3;
							gbc_pnlBotonesReserva.insets = new Insets(0, 0, 5, 5);
							gbc_pnlBotonesReserva.fill = GridBagConstraints.BOTH;
							gbc_pnlBotonesReserva.gridx = 4;
							gbc_pnlBotonesReserva.gridy = 0;
							pnlReservas.add(pnlBotonesReserva, gbc_pnlBotonesReserva);
							{
								btnModificarReserva = new JButton(
										MessagesLogin.getString("Login.btnModificarReserva.text")); //$NON-NLS-1$
								btnModificarReserva.addActionListener(new BtnModificarReservaActionListener());
								btnModificarReserva.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
								btnModificarReserva.setToolTipText(
										MessagesLogin.getString("Login.btnModificarReserva.toolTipText")); //$NON-NLS-1$
								pnlBotonesReserva.add(btnModificarReserva);
							}
							{
								btnEliminarReserva = new JButton(
										MessagesLogin.getString("Login.btnEliminarReserva.text")); //$NON-NLS-1$
								btnEliminarReserva.addActionListener(new BtnEliminarReservaActionListener());
								btnEliminarReserva.setToolTipText(
										MessagesLogin.getString("Login.btnEliminarReserva.toolTipText")); //$NON-NLS-1$
								btnEliminarReserva.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
								pnlBotonesReserva.add(btnEliminarReserva);
							}
							{
								btnRefrescar = new JButton(MessagesLogin.getString("Login.btnRefrescar.text")); //$NON-NLS-1$
								btnRefrescar.addActionListener(new BtnRefrescarActionListener());
								pnlBotonesReserva.add(btnRefrescar);
							}
						}
						{
							pnlListadoReservas = new JPanel();
							GridBagConstraints gbc_pnlListadoReservas = new GridBagConstraints();
							gbc_pnlListadoReservas.gridwidth = 2;
							gbc_pnlListadoReservas.insets = new Insets(0, 0, 5, 5);
							gbc_pnlListadoReservas.fill = GridBagConstraints.BOTH;
							gbc_pnlListadoReservas.gridx = 1;
							gbc_pnlListadoReservas.gridy = 1;
							pnlReservas.add(pnlListadoReservas, gbc_pnlListadoReservas);
							pnlListadoReservas.setLayout(new BorderLayout(0, 0));
							{
								scrollPaneReservas = new JScrollPane();
								pnlListadoReservas.add(scrollPaneReservas, BorderLayout.CENTER);
								{
									pnlDatosReserva = new pnlFormReserva(frmLogin);
									GridBagConstraints gbc_pnlDatosReserva = new GridBagConstraints();
									gbc_pnlDatosReserva.gridwidth = 3;
									gbc_pnlDatosReserva.insets = new Insets(0, 0, 5, 5);
									gbc_pnlDatosReserva.fill = GridBagConstraints.BOTH;
									gbc_pnlDatosReserva.gridx = 4;
									gbc_pnlDatosReserva.gridy = 1;
									pnlReservas.add(pnlDatosReserva, gbc_pnlDatosReserva);
								}
								{
									pnlContenedorReserva = new pnlContenedorReservas(this.cargarReservas(),
											pnlDatosReserva);
									scrollPaneReservas.setViewportView(pnlContenedorReserva);
								}
							}
						}

					}
					{
						pnlRutasSenderistas = new JPanel();
						pnlContenedorPestanas.addTab("Rutas senderistas", null, pnlRutasSenderistas, null);
						pnlRutasSenderistas.setLayout(new CardLayout(0, 0));
						{
							pnlVistaRutas = new JPanel();
							pnlRutasSenderistas.add(pnlVistaRutas, "pnlVistaRutas");
							GridBagLayout gbl_pnlVistaRutas = new GridBagLayout();
							gbl_pnlVistaRutas.columnWidths = new int[] { 15, 0, 326, 30, 0, 0, 0, 15, 0 };
							gbl_pnlVistaRutas.rowHeights = new int[] { 54, 0, 15, 0 };
							gbl_pnlVistaRutas.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0,
									Double.MIN_VALUE };
							gbl_pnlVistaRutas.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
							pnlVistaRutas.setLayout(gbl_pnlVistaRutas);
							{
								lblBsquedaPorNombre_1 = new JLabel(
										MessagesLogin.getString("Login.lblBsquedaPorNombre_1.text")); //$NON-NLS-1$
								lblBsquedaPorNombre_1.setIcon(
										new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/lupa.png")));
								GridBagConstraints gbc_lblBsquedaPorNombre_1 = new GridBagConstraints();
								gbc_lblBsquedaPorNombre_1.anchor = GridBagConstraints.EAST;
								gbc_lblBsquedaPorNombre_1.insets = new Insets(0, 0, 5, 5);
								gbc_lblBsquedaPorNombre_1.gridx = 1;
								gbc_lblBsquedaPorNombre_1.gridy = 0;
								pnlVistaRutas.add(lblBsquedaPorNombre_1, gbc_lblBsquedaPorNombre_1);
							}
							{
								tfBusquedaNombreRuta = new JTextField();
								tfBusquedaNombreRuta.addKeyListener(new TfBusquedaNombreRutaKeyListener());
								GridBagConstraints gbc_tfBusquedaNombreRuta = new GridBagConstraints();
								gbc_tfBusquedaNombreRuta.insets = new Insets(0, 0, 5, 5);
								gbc_tfBusquedaNombreRuta.fill = GridBagConstraints.HORIZONTAL;
								gbc_tfBusquedaNombreRuta.gridx = 2;
								gbc_tfBusquedaNombreRuta.gridy = 0;
								pnlVistaRutas.add(tfBusquedaNombreRuta, gbc_tfBusquedaNombreRuta);
								tfBusquedaNombreRuta.setColumns(10);
							}
							{
								pnlContenedorBotonesRuta = new JPanel();
								GridBagConstraints gbc_pnlContenedorBotonesRuta = new GridBagConstraints();
								gbc_pnlContenedorBotonesRuta.gridwidth = 3;
								gbc_pnlContenedorBotonesRuta.insets = new Insets(0, 0, 5, 5);
								gbc_pnlContenedorBotonesRuta.fill = GridBagConstraints.BOTH;
								gbc_pnlContenedorBotonesRuta.gridx = 4;
								gbc_pnlContenedorBotonesRuta.gridy = 0;
								pnlVistaRutas.add(pnlContenedorBotonesRuta, gbc_pnlContenedorBotonesRuta);
								{
									btnEditar = new JButton(MessagesLogin.getString("Login.btnEditar.text")); //$NON-NLS-1$
									btnEditar.addActionListener(new BtnEditarActionListener());
									btnEditar.setToolTipText(MessagesLogin.getString("Login.btnEditar.toolTipText")); //$NON-NLS-1$
									btnEditar.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
									pnlContenedorBotonesRuta.add(btnEditar);
								}
								{
									btnEliminarRuta = new JButton(
											MessagesLogin.getString("Login.btnEliminarRuta.text")); //$NON-NLS-1$
									btnEliminarRuta.addActionListener(new BtnEliminarRutaActionListener());
									btnEliminarRuta.setToolTipText(
											MessagesLogin.getString("Login.btnEliminarRuta.toolTipText")); //$NON-NLS-1$
									btnEliminarRuta.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
									pnlContenedorBotonesRuta.add(btnEliminarRuta);
								}
								{
									btnDisearRuta = new JButton(MessagesLogin.getString("Login.btnDisearRuta.text")); //$NON-NLS-1$
									btnDisearRuta.setFont(new Font("Tahoma", Font.BOLD, 12));
									btnDisearRuta
											.setToolTipText(MessagesLogin.getString("Login.btnDisearRuta.toolTipText")); //$NON-NLS-1$
									btnDisearRuta.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/add-button16x16.png")));
									btnDisearRuta.addActionListener(new BtnDisearRutaActionListener());
									pnlContenedorBotonesRuta.add(btnDisearRuta);
								}
							}
							{
								pnlDatosRutasSenderistas = new pnlFormRutas();
								GridBagConstraints gbc_pnlDatosRutasSenderistas = new GridBagConstraints();
								gbc_pnlDatosRutasSenderistas.gridwidth = 3;
								gbc_pnlDatosRutasSenderistas.insets = new Insets(0, 0, 5, 5);
								gbc_pnlDatosRutasSenderistas.fill = GridBagConstraints.BOTH;
								gbc_pnlDatosRutasSenderistas.gridx = 4;
								gbc_pnlDatosRutasSenderistas.gridy = 1;
								pnlVistaRutas.add(pnlDatosRutasSenderistas, gbc_pnlDatosRutasSenderistas);
							}
							{
								pnlListaRutas = new JPanel();
								GridBagConstraints gbc_pnlListaRutas = new GridBagConstraints();
								gbc_pnlListaRutas.gridwidth = 2;
								gbc_pnlListaRutas.insets = new Insets(0, 0, 5, 5);
								gbc_pnlListaRutas.fill = GridBagConstraints.BOTH;
								gbc_pnlListaRutas.gridx = 1;
								gbc_pnlListaRutas.gridy = 1;
								pnlVistaRutas.add(pnlListaRutas, gbc_pnlListaRutas);
								pnlListaRutas.setLayout(new BorderLayout(0, 0));
								{
									scrollPaneRutas = new JScrollPane();
									pnlListaRutas.add(scrollPaneRutas, BorderLayout.CENTER);
									{
										pnlContenedorRutas = new pnlContenedorRutas(cargarRutas(),
												pnlDatosRutasSenderistas);
										scrollPaneRutas.setViewportView(pnlContenedorRutas);
									}
								}
							}

						}
						{
							pnlDiseno = new JPanel();
							pnlRutasSenderistas.add(pnlDiseno, "pnlDiseno");
							pnlDiseno.setLayout(new BorderLayout(0, 0));
							{
								pnlBotonBack = new JPanel();
								pnlDiseno.add(pnlBotonBack, BorderLayout.SOUTH);
								{
									btnVolver = new JButton(MessagesLogin.getString("Login.btnVolver.text")); //$NON-NLS-1$
									btnVolver.addActionListener(new BtnVolverActionListener());
									pnlBotonBack.add(btnVolver);
								}
							}
							{
								pnlDibujo = new pnlDibujarRuta();
								pnlDiseno.add(pnlDibujo, BorderLayout.CENTER);
							}
						}
					}
				}

				pnlContenedorBungalows.loadPnlBungalows(cargarBungalow());
				pnlContenedorParcelas.loadPnlParcelas(cargarParcela());
			}

		}
	}

	/**
	 * The listener interface for receiving frameContentPaneComponent events.
	 * The class that is interested in processing a frameContentPaneComponent
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addFrameContentPaneComponentListener<code> method. When
	 * the frameContentPaneComponent event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see FrameContentPaneComponentEvent
	 */
	private class FrameContentPaneComponentListener extends ComponentAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ComponentAdapter#componentResized(java.awt.event.ComponentEvent)
		 */
		@Override
		public void componentResized(ComponentEvent e) {
			int centroX = (int) pnlLogin.getBounds().getCenterX();
			int centroY = (int) pnlLogin.getBounds().getCenterY();
			int width = pnlIniciarSesion.getWidth();
			int height = pnlIniciarSesion.getHeight();

			pnlIniciarSesion.setBounds(centroX - (width / 2), centroY - (height / 2), width, height);

		}
	}

	/**
	 * The listener interface for receiving frmLoginKey events.
	 * The class that is interested in processing a frmLoginKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addFrmLoginKeyListener<code> method. When
	 * the frmLoginKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see FrmLoginKeyEvent
	 */
	private class FrmLoginKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyPressed(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyTyped(java.awt.event.KeyEvent)
		 */
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

	}

	/**
	 * The listener interface for receiving pnlLoginKey events.
	 * The class that is interested in processing a pnlLoginKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addPnlLoginKeyListener<code> method. When
	 * the pnlLoginKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see PnlLoginKeyEvent
	 */
	private class PnlLoginKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyTyped(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyPressed(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	/**
	 * The listener interface for receiving pnlIniciarSesionKey events.
	 * The class that is interested in processing a pnlIniciarSesionKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addPnlIniciarSesionKeyListener<code> method. When
	 * the pnlIniciarSesionKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see PnlIniciarSesionKeyEvent
	 */
	private class PnlIniciarSesionKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyTyped(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyPressed(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	/**
	 * The listener interface for receiving pwdContraseaFocus events.
	 * The class that is interested in processing a pwdContraseaFocus
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addPwdContraseaFocusListener<code> method. When
	 * the pwdContraseaFocus event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see PwdContraseaFocusEvent
	 */
	private class PwdContraseaFocusListener extends FocusAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.FocusAdapter#focusGained(java.awt.event.FocusEvent)
		 */
		@Override
		public void focusGained(FocusEvent arg0) {

			pwdContrasena.setText("");
		}

		/* (non-Javadoc)
		 * @see java.awt.event.FocusAdapter#focusLost(java.awt.event.FocusEvent)
		 */
		@Override
		public void focusLost(FocusEvent e) {

			if (pwdContrasena.getPassword().length == 0) {
				pwdContrasena.setText("Contraseña");
			}
		}
	}

	/**
	 * The listener interface for receiving pwdContraseaKey events.
	 * The class that is interested in processing a pwdContraseaKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addPwdContraseaKeyListener<code> method. When
	 * the pwdContraseaKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see PwdContraseaKeyEvent
	 */
	private class PwdContraseaKeyListener extends KeyAdapter {

		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyPressed(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 10) {
				entrar();
			}
		}
	}

	/**
	 * The listener interface for receiving btnEntrarAction events.
	 * The class that is interested in processing a btnEntrarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEntrarActionListener<code> method. When
	 * the btnEntrarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEntrarActionEvent
	 */
	private class BtnEntrarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {

			entrar();
		}

	}

	/**
	 * The listener interface for receiving btnOcultarAction events.
	 * The class that is interested in processing a btnOcultarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnOcultarActionListener<code> method. When
	 * the btnOcultarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnOcultarActionEvent
	 */
	private class BtnOcultarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			if (pnlUserData.isVisible()) {
				pnlUserData.setVisible(false);
				btnOcultar.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/mostrar.png")));
			} else {
				pnlUserData.setVisible(true);
				btnOcultar.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/ocultar.png")));
			}
		}
	}

	/**
	 * The listener interface for receiving btnSalirAction events.
	 * The class that is interested in processing a btnSalirAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnSalirActionListener<code> method. When
	 * the btnSalirAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnSalirActionEvent
	 */
	private class BtnSalirActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			Date date = new Date();
			DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
			usuario.setUltimoAcceso(ultimoAcceso.format(date));
			System.exit(0);
		}
	}

	/**
	 * The listener interface for receiving btnCerrarSesinAction events.
	 * The class that is interested in processing a btnCerrarSesinAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnCerrarSesinActionListener<code> method. When
	 * the btnCerrarSesinAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnCerrarSesinActionEvent
	 */
	private class BtnCerrarSesinActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			((CardLayout) frmLogin.getContentPane().getLayout()).show(frmLogin.getContentPane(), "panelLogin");
		}
	}

	/**
	 * The listener interface for receiving btnEliminarAction events.
	 * The class that is interested in processing a btnEliminarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminarActionListener<code> method. When
	 * the btnEliminarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminarActionEvent
	 */
	private class BtnEliminarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, "�Est�s seguro de que quieres eliminar este bungalow?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				pnlContenedorBungalows.borrarSeleccionada();
			}

		}
	}

	/**
	 * The listener interface for receiving btnEliminarParAction events.
	 * The class that is interested in processing a btnEliminarParAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminarParActionListener<code> method. When
	 * the btnEliminarParAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminarParActionEvent
	 */
	private class BtnEliminarParActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, "�Est�s seguro de que quieres eliminar esta parcela?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				pnlContenedorParcelas.borrarSeleccionada();
			}
		}
	}

	/**
	 * The listener interface for receiving tfBusquedaDniKey events.
	 * The class that is interested in processing a tfBusquedaDniKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTfBusquedaDniKeyListener<code> method. When
	 * the tfBusquedaDniKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TfBusquedaDniKeyEvent
	 */
	private class TfBusquedaDniKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorEmpleados.filtraEmpleado(tfBusquedaDni.getText());
		}
	}

	/**
	 * The listener interface for receiving btnNewButton_1Action events.
	 * The class that is interested in processing a btnNewButton_1Action
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnNewButton_1ActionListener<code> method. When
	 * the btnNewButton_1Action event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnNewButton_1ActionEvent
	 */
	private class BtnNewButton_1ActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlDatosEmpleado.setComponentsEditables(true, true);
			((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlEditar");
			editar_guardar_empleado = 2; // modo editar
		}
	}

	/**
	 * The listener interface for receiving btnAadir_1Action events.
	 * The class that is interested in processing a btnAadir_1Action
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnAadir_1ActionListener<code> method. When
	 * the btnAadir_1Action event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnAadir_1ActionEvent
	 */
	private class BtnAadir_1ActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlDatosEmpleado.clean();
			pnlDatosEmpleado.setComponentsEditables(true, true);
			((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlEditar");
			editar_guardar_empleado = 1; // modo crear
		}
	}

	/**
	 * The listener interface for receiving btnEliminar1Action events.
	 * The class that is interested in processing a btnEliminar1Action
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminar1ActionListener<code> method. When
	 * the btnEliminar1Action event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminar1ActionEvent
	 */
	private class BtnEliminar1ActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent arg0) {
			int resp = JOptionPane.showConfirmDialog(null, "�Est�s seguro de que quieres eliminar este empleado?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {

				if (!isMonitorAct(pnlDatosEmpleado.getDNI())) {
					try {
						Empleado e;
						e = pnlDatosEmpleado.getDatosEmpleado();
						e.delete();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null,
							"Este empleado pertenece a una actividad, primero hay que borrar la actividad", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				pnlContenedorEmpleados.loadPanels();
				lblBusquedaPorDni.setText("");
				pnlDatosEmpleado.clean();
			}
		}
	}

	/**
	 * The listener interface for receiving btnGuardarAction events.
	 * The class that is interested in processing a btnGuardarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnGuardarActionListener<code> method. When
	 * the btnGuardarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnGuardarActionEvent
	 */
	private class BtnGuardarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent arg0) {
			if (pnlDatosEmpleado.comprobarTextFields() && pnlDatosEmpleado.comprobarTextAreas()) {

				Empleado e;
				try {
					e = pnlDatosEmpleado.getDatosEmpleadoFromUser();
					if (editar_guardar_empleado == 1) { // Modo crear nuevo usuario
						if (e.insert()) {

							JOptionPane.showMessageDialog(null, e.getDni() + "Empleado a�adido con �xito");
							pnlDatosEmpleado.setComponentsEditables(false, true);
							((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
							editar_guardar_empleado = 0;
							pnlContenedorEmpleados.loadPanels();
							lblBusquedaPorDni.setText("");

						} else {
							JOptionPane.showMessageDialog(null, "Error al a�adir empleado.", "Error",
									JOptionPane.ERROR_MESSAGE);
							((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
							editar_guardar_empleado = 0;
							pnlDatosEmpleado.setComponentsEditables(false, false);
						}
					} else if (editar_guardar_empleado == 2) { // Modo editar usuario
						if (e.update()) {
							JOptionPane.showMessageDialog(null,
									"Cliente " + e.getDni() + " Actualizado correctamente.");
							pnlDatosEmpleado.setComponentsEditables(false, true);
							pnlDatosEmpleado.setComponentsEditables(false, false);
							editar_guardar_empleado = 0;
							((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
							pnlContenedorEmpleados.clean();
							pnlContenedorEmpleados.loadPanels();
							lblBusquedaPorDni.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Error al editar el empleado", "Error",
									JOptionPane.ERROR_MESSAGE);
							((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
							editar_guardar_empleado = 0;
							pnlDatosEmpleado.setComponentsEditables(false, false);
						}
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					pnlDatosEmpleado.setComponentsEditables(false, false);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Faltan campos por a�adir.", "Aviso", JOptionPane.WARNING_MESSAGE);
				((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
				editar_guardar_empleado = 0;
				pnlDatosEmpleado.setComponentsEditables(false, false);
			}
			pnlContenedorEmpleados.loadPanels();
			pnlDatosEmpleado.setComponentsEditables(false, false);
			pnlDatosEmpleado.clean();
		}
	}

	/**
	 * The listener interface for receiving btnCancelarAction events.
	 * The class that is interested in processing a btnCancelarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnCancelarActionListener<code> method. When
	 * the btnCancelarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnCancelarActionEvent
	 */
	private class BtnCancelarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlDatosEmpleado.setComponentsEditables(false, false);
			pnlDatosEmpleado.clean();
			((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
		}
	}

	/**
	 * The listener interface for receiving btnAddActividadAction events.
	 * The class that is interested in processing a btnAddActividadAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addbtnAddActividadActionListener<code> method. When
	 * the btnAddActividadAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see btnAddActividadActionEvent
	 */
	private class btnAddActividadActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlDatosActividad.clean();
			pnlDatosActividad.setComponentsEditables(true);
			((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlEditarAct");
			editar_guardar_actividad = 1; // modo crear
		}
	}

	/**
	 * The listener interface for receiving btnEliminarActividadAction events.
	 * The class that is interested in processing a btnEliminarActividadAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminarActividadActionListener<code> method. When
	 * the btnEliminarActividadAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminarActividadActionEvent
	 */
	private class BtnEliminarActividadActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, "�Est�s serguro de que quieres eliminar esta actividad?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				Actividad a;
				try {
					a = pnlDatosActividad.getDatosActividad();
					a.delete();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				pnlContenedorActividades.loadPanels();
				lblBusquedaPorNombre.setText("");
				pnlDatosActividad.clean();
			}
		}
	}

	/**
	 * The listener interface for receiving modificarActividadAction events.
	 * The class that is interested in processing a modificarActividadAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addModificarActividadActionListener<code> method. When
	 * the modificarActividadAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ModificarActividadActionEvent
	 */
	private class ModificarActividadActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlDatosActividad.setComponentsEditables(true);
			((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlEditarAct");
			editar_guardar_actividad = 2; // modo editar
		}
	}

	/**
	 * The listener interface for receiving btnCancelarActividadAction events.
	 * The class that is interested in processing a btnCancelarActividadAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnCancelarActividadActionListener<code> method. When
	 * the btnCancelarActividadAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnCancelarActividadActionEvent
	 */
	private class BtnCancelarActividadActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlDatosActividad.setComponentsEditables(false);
			pnlDatosActividad.clean();
			((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlPrincipalesAct");
		}
	}

	/**
	 * The listener interface for receiving btnVerpassAction events.
	 * The class that is interested in processing a btnVerpassAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnVerpassActionListener<code> method. When
	 * the btnVerpassAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnVerpassActionEvent
	 */
	private class BtnVerpassActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			if (verPass) {
				// Ocultar la contraseña
				pwdContrasena.setEchoChar('\u2022');
				btnVerPass.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/eye.png")));
				btnVerPass.setToolTipText("Mostrar Constrase�a");
				verPass = false;
			} else {
				// Mostrar la contraseña
				pwdContrasena.setEchoChar((char) 0);
				btnVerPass
						.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/eye_slashed24x24.png")));
				btnVerPass.setToolTipText("Ocultar Constrase�a");
				verPass = true;
			}
		}
	}

	/**
	 * The listener interface for receiving btnGuardarActividadAction events.
	 * The class that is interested in processing a btnGuardarActividadAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnGuardarActividadActionListener<code> method. When
	 * the btnGuardarActividadAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnGuardarActividadActionEvent
	 */
	private class BtnGuardarActividadActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent arg0) {
			if (pnlDatosActividad.comprobarTextFields() && pnlDatosActividad.comprobarTextAreas()) {
				Actividad a;
				try {
					a = pnlDatosActividad.getDatosActividadFromUser();
					if (editar_guardar_actividad == 1) { // Modo crear
						if (a.insert()) {
							JOptionPane.showMessageDialog(null, a.getNombre() + "Actividad a�adido con �xito");
							pnlDatosActividad.setComponentsEditables(false);
							((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades,
									"pnlPrincipalesAct");
							editar_guardar_empleado = 0;
							pnlContenedorActividades.loadPanels();
							tfBusquedaNombreActividad.setText("");

						} else {
							JOptionPane.showMessageDialog(null, "Error al a�adir actividad.", "Error",
									JOptionPane.ERROR_MESSAGE);
							((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades,
									"pnlPrincipalesAct");
							editar_guardar_empleado = 0;
							pnlDatosActividad.setComponentsEditables(false);
						}
					} else if (editar_guardar_actividad == 2) { // Modo editar usuario
						if (a.update()) {
							JOptionPane.showMessageDialog(null,
									"Actividad " + a.getNombre() + "Actualizada correctamente.");
							pnlDatosActividad.setComponentsEditables(false);
							editar_guardar_actividad = 0;
							((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades,
									"pnlPrincipalesAct");
							pnlContenedorActividades.clean();
							pnlContenedorActividades.loadPanels();
							tfBusquedaNombreActividad.setText("");
						} else {
							JOptionPane.showMessageDialog(null, "Error al editar la actividad", "Error",
									JOptionPane.ERROR_MESSAGE);
							((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades,
									"pnlPrincipalesAct");
							editar_guardar_actividad = 0;
							pnlDatosActividad.setComponentsEditables(false);
						}
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					pnlDatosActividad.setComponentsEditables(false);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Faltan campos por a�adir.", "Aviso", JOptionPane.WARNING_MESSAGE);
				((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlPrincipalesAct");
				editar_guardar_actividad = 0;
				pnlDatosActividad.setComponentsEditables(false);
			}
			pnlContenedorActividades.loadPanels();
			pnlDatosActividad.setComponentsEditables(false);
			pnlDatosActividad.clean();
		}
	}

	/**
	 * The listener interface for receiving btnRefrescarAction events.
	 * The class that is interested in processing a btnRefrescarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnRefrescarActionListener<code> method. When
	 * the btnRefrescarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnRefrescarActionEvent
	 */
	private class BtnRefrescarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			pnlContenedorReserva.reload();
		}
	}

	/**
	 * The listener interface for receiving btnDisearRutaAction events.
	 * The class that is interested in processing a btnDisearRutaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnDisearRutaActionListener<code> method. When
	 * the btnDisearRutaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnDisearRutaActionEvent
	 */
	private class BtnDisearRutaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			((CardLayout) pnlRutasSenderistas.getLayout()).show(pnlRutasSenderistas, "pnlDiseno");
		}
	}

	/**
	 * Gets the frame.
	 *
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frmLogin;
	}

	/**
	 * The listener interface for receiving btnVolverAction events.
	 * The class that is interested in processing a btnVolverAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnVolverActionListener<code> method. When
	 * the btnVolverAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnVolverActionEvent
	 */
	private class BtnVolverActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			((CardLayout) pnlRutasSenderistas.getLayout()).show(pnlRutasSenderistas, "pnlVistaRutas");
		}
	}

	/**
	 * The listener interface for receiving btnAadirAction events.
	 * The class that is interested in processing a btnAadirAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnAadirActionListener<code> method. When
	 * the btnAadirAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnAadirActionEvent
	 */
	private class BtnAadirActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnModificarAction events.
	 * The class that is interested in processing a btnModificarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnModificarActionListener<code> method. When
	 * the btnModificarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnModificarActionEvent
	 */
	private class BtnModificarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnAadirParAction events.
	 * The class that is interested in processing a btnAadirParAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnAadirParActionListener<code> method. When
	 * the btnAadirParAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnAadirParActionEvent
	 */
	private class BtnAadirParActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnModificar_1Action events.
	 * The class that is interested in processing a btnModificar_1Action
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnModificar_1ActionListener<code> method. When
	 * the btnModificar_1Action event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnModificar_1ActionEvent
	 */
	private class BtnModificar_1ActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnConfiguracinAction events.
	 * The class that is interested in processing a btnConfiguracinAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnConfiguracinActionListener<code> method. When
	 * the btnConfiguracinAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnConfiguracinActionEvent
	 */
	private class BtnConfiguracinActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnEliminarReservaAction events.
	 * The class that is interested in processing a btnEliminarReservaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminarReservaActionListener<code> method. When
	 * the btnEliminarReservaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminarReservaActionEvent
	 */
	private class BtnEliminarReservaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnModificarReservaAction events.
	 * The class that is interested in processing a btnModificarReservaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnModificarReservaActionListener<code> method. When
	 * the btnModificarReservaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnModificarReservaActionEvent
	 */
	private class BtnModificarReservaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnEliminarRutaAction events.
	 * The class that is interested in processing a btnEliminarRutaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminarRutaActionListener<code> method. When
	 * the btnEliminarRutaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminarRutaActionEvent
	 */
	private class BtnEliminarRutaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving btnEditarAction events.
	 * The class that is interested in processing a btnEditarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEditarActionListener<code> method. When
	 * the btnEditarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEditarActionEvent
	 */
	private class BtnEditarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * The listener interface for receiving tfBusquedaNombreRutaKey events.
	 * The class that is interested in processing a tfBusquedaNombreRutaKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTfBusquedaNombreRutaKeyListener<code> method. When
	 * the tfBusquedaNombreRutaKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TfBusquedaNombreRutaKeyEvent
	 */
	private class TfBusquedaNombreRutaKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorRutas.filtraRuta(tfBusquedaNombreRuta.getText());
		}
	}

	/**
	 * The listener interface for receiving tfBusquedaReservaKey events.
	 * The class that is interested in processing a tfBusquedaReservaKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTfBusquedaReservaKeyListener<code> method. When
	 * the tfBusquedaReservaKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TfBusquedaReservaKeyEvent
	 */
	private class TfBusquedaReservaKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorReserva.filtraReserva(tfBusquedaReserva.getText());
		}
	}

	/**
	 * The listener interface for receiving tfBusquedaNombreActividadKey events.
	 * The class that is interested in processing a tfBusquedaNombreActividadKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTfBusquedaNombreActividadKeyListener<code> method. When
	 * the tfBusquedaNombreActividadKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TfBusquedaNombreActividadKeyEvent
	 */
	private class TfBusquedaNombreActividadKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorActividades.filtraActividad(tfBusquedaNombreActividad.getText());
		}
	}

	/**
	 * The listener interface for receiving tfBusquedaBungalowKey events.
	 * The class that is interested in processing a tfBusquedaBungalowKey
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addTfBusquedaBungalowKeyListener<code> method. When
	 * the tfBusquedaBungalowKey event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see TfBusquedaBungalowKeyEvent
	 */
	private class TfBusquedaBungalowKeyListener extends KeyAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.KeyAdapter#keyReleased(java.awt.event.KeyEvent)
		 */
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorBungalows.filtraBungalow(tfBusquedaBungalow.getText());
		}
	}

	/**
	 * The listener interface for receiving rdbtnCambiarIdiomaAction events.
	 * The class that is interested in processing a rdbtnCambiarIdiomaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addRdbtnCambiarIdiomaActionListener<code> method. When
	 * the rdbtnCambiarIdiomaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see RdbtnCambiarIdiomaActionEvent
	 */
	private class RdbtnCambiarIdiomaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			if (rdbtnIngles.isSelected()) {
				MessagesLogin.setIdioma("inglés");
			}

			if (rdbtnEspaniol.isSelected()) {
				MessagesLogin.setIdioma("Español");
			}

			Login ventana = new Login();
			ventana.getFrame().setVisible(true);

			frmLogin.dispose();

		}
	}
	
	/**
	 * The listener interface for receiving btnAyudaAction events.
	 * The class that is interested in processing a btnAyudaAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnAyudaActionListener<code> method. When
	 * the btnAyudaAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnAyudaActionEvent
	 */
	private class BtnAyudaActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			if(java.awt.Desktop.isDesktopSupported()) {
				java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
				if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
					try {
						java.net.URI urlAyuda = new java.net.URI("https://youtu.be/gMvP6zX8lbU");
						desktop.browse(urlAyuda);
					} catch (IOException | URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * Entrar.
	 */
	private void entrar() {

		String password = pwdContrasena.getText();
		String user = txtUsuario.getText();
		usuario = new Usuario();
		usuario.setDNI(user);
		usuario.setPass(password);

		if (usuario.login()) {
			((CardLayout) frmLogin.getContentPane().getLayout()).show(frmLogin.getContentPane(), "pnlApp");
			pnlUsuario.loadUserData(usuario);
			Date fecha = new Date();
			DateFormat fecha_UltimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			usuario.setUltimoAcceso(fecha_UltimoAcceso.format(fecha));
			usuario.update();
			lblErrorLaContrasea.setVisible(false);

			if (!chckbxRecordarContrasea.isSelected()) {
				txtUsuario.setText("");
				pwdContrasena.setText("Contraseña");
			}

		} else {
			lblErrorLaContrasea.setVisible(true);
		}

	}

	/**
	 * Cargar parcela.
	 *
	 * @return the array list
	 */
	private ArrayList<Parcela> cargarParcela() {

		Parcela parcela = new Parcela();
		boolean correcto = false;

		correcto = parcela.readAll();

		if (correcto) {
			return (parcela.getParcelaDAO().getListaParcelas());
		} else {
			return null;
		}
	}

	/**
	 * Cargar bungalow.
	 *
	 * @return the array list
	 */
	private ArrayList<Bungalow> cargarBungalow() {

		Bungalow bungalow = new Bungalow();
		boolean correcto = false;

		correcto = bungalow.readAll();

		if (correcto) {
			return (bungalow.getBungalowDAO().getListaBungalows());
		} else {
			return null;
		}
	}

	/**
	 * Cargar empleados.
	 *
	 * @return the array list
	 */
	private ArrayList<Empleado> cargarEmpleados() {

		Empleado empleado = new Empleado();
		boolean correcto = false;

		correcto = empleado.readAll();

		if (correcto) {
			return (empleado.getEmpleadoDAO().getListaEmpleados());
		} else {
			return null;
		}
	}

	/**
	 * Cargar actividades.
	 *
	 * @return the array list
	 */
	private ArrayList<Actividad> cargarActividades() {

		Actividad actividad = new Actividad();
		boolean correcto = false;

		correcto = actividad.readAll();

		if (correcto) {
			return (actividad.getActividadDAO().getListaActividades());
		} else {
			return null;
		}
	}

	/**
	 * Checks if is monitor act.
	 *
	 * @param dni the dni
	 * @return true, if is monitor act
	 */
	private boolean isMonitorAct(String dni) {
		boolean isMonitor = false;
		for (Actividad a : this.cargarActividades()) {
			if (a.getEmpleado().getDni().equalsIgnoreCase(dni)) {
				isMonitor = true;
				return isMonitor;
			}
		}

		return isMonitor;
	}

	/**
	 * Checks if is monitor ruta.
	 *
	 * @param dni the dni
	 * @return true, if is monitor ruta
	 */
	private boolean isMonitorRuta(String dni) {
		boolean isMonitor = false;
		for (RutaSenderista a : this.cargarRutas()) {
			if (a.getMonitor().getDni().equalsIgnoreCase(dni)) {
				isMonitor = true;
				return isMonitor;
			}
		}

		return isMonitor;
	}

	/**
	 * Cargar reservas.
	 *
	 * @return the array list
	 */
	private ArrayList<Reserva> cargarReservas() {

		Reserva reserva = new Reserva();
		boolean correcto = false;

		correcto = reserva.readAll();

		if (correcto) {
			return (reserva.getReservaDAO().getListaReservas());
		} else {
			return null;
		}
	}

	/**
	 * Cargar rutas.
	 *
	 * @return the array list
	 */
	private ArrayList<RutaSenderista> cargarRutas() {
		RutaSenderista ruta = new RutaSenderista();
		boolean correcto = false;

		correcto = ruta.readAll();

		if (correcto) {
			return (ruta.getRutaDAO().getListaRutas());
		} else {
			return null;
		}
	}
}
