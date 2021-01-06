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

public class Login {

	private JFrame frmLogin;
	private JPanel pnlLogin;
	private JLabel lblIconPass;
	private JPanel pnlIniciarSesion;
	private JLabel lblIniciarSesin;
	private JCheckBox chckbxRecordarContrasea;
	private JButton btnEntrar;
	private JLabel lblIconUser;
	private JLabel lblteHasOlvidado;
	private JPanel pnlPass;
	private boolean mostrarContrasea;
	private JLabel lblContrasea;
	private MaskFormatter formatoDNI;
	private JPasswordField pwdContrasena;
	private JLabel lblErrorLaContrasea;
	private JPanel pnlUser;
	private JLabel lblUsuario;
	private pnlVBungalow panelVistaBungalows;
	private Usuario usuario;
	private JTextField txtUsuario;
	private JPanel pnlApp;
	private JPanel pnlUserData;
	private JPanel pnlOcultar;
	private JPanel pnlInformacion;
	private pnlUsuario pnlUsuario;
	private JButton btnOcultar;
	private JPanel pnlPestanas;
	private JTabbedPane pnlContenedorPestanas;
	private JPanel pnlBungalows;
	private JPanel pnlParcelas;
	private JPanel pnlEmpleados;
	private JPanel pnlActividades;
	private JMenuBar menuBar;
	private JButton btnAyuda;
	private JButton btnConfiguracin;
	private JPanel pnlBtnSalir;
	private JButton btnSalir;
	private JButton btnCerrarSesin;
	private JPanel pnlBusqueda;
	private JTextField tfBusquedaBungalow;
	private JPanel pnlBotones;
	private JButton btnAadir;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JPanel pnlContenedor;
	private JPanel pnlBusquedaPar;
	private JTextField textFieldBusquedaPar;
	private JPanel pnlBotonesPar;
	private JButton btnAadirPar;
	private pnlContenedorBungalows pnlContenedorBungalows;
	private JButton btnEliminarPar;
	private JButton btnModificar_1;
	private JPanel pnlContenedorPar;
	private pnlContenedorParcelas pnlContenedorParcelas;
	private JLabel lblBusquedaPorDni;
	private JTextField tfBusquedaDni;
	private JPanel pnlBotonesEmpleados;
	private JPanel pnlListadoEmpleados;
	private JScrollPane scrollPane;
	private pnlContenedorEmpleados pnlContenedorEmpleados;
	private pnlFormEmpleado pnlDatosEmpleado;
	private JLabel lblBsquedaPorNombre;
	private JTextField tfBusquedaNombreActividad;
	private JPanel pnlBotonesActividades;
	private JPanel pnlListadoActividades;
	private JScrollPane scrollPaneActividades;
	private pnlFormActividades pnlDatosActividad;
	private pnlContenedorActividades pnlContenedorActividades;
	private int editar_guardar_empleado;
	private int editar_guardar_actividad;
	private JPanel pnlPrincipales;
	private JPanel pnlEditar;
	private JButton btnEliminarEmpleado;
	private JButton btnModificarEmpleado;
	private JButton btnAddEmpleado;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JPanel pnlPrincipalesAct;
	private JPanel pnlEditarAct;
	private JButton btnAddActividad;
	private JButton ModificarActividad;
	private JButton btnEliminarActividad;
	private JButton btnGuardarActividad;
	private JButton btnCancelarActividad;
	private JLabel lblBusquedaPorNombre;
	private JLabel lblBusquedaPorNombre_P;
	private JButton btnVerPass;
	private boolean verPass;
	private JPanel pnlReservas;
	private JLabel lblBsquedaPorDni;
	private JTextField tfBusquedaReserva;
	private JPanel pnlBotonesReserva;
	private pnlFormReserva pnlDatosReserva;
	private JPanel pnlListadoReservas;
	private JScrollPane scrollPaneReservas;
	private pnlContenedorReservas pnlContenedorReserva;
	private JButton btnModificarReserva;
	private JButton btnEliminarReserva;
	private JButton btnRefrescar;
	private JPanel pnlRutasSenderistas;
	private JPanel pnlVistaRutas;
	private JLabel lblBsquedaPorNombre_1;
	private JTextField tfBusquedaNombreRuta;
	private JPanel pnlContenedorBotonesRuta;
	private JButton btnEditar;
	private JButton btnEliminarRuta;
	private pnlFormRutas pnlDatosRutasSenderistas;
	private JPanel pnlListaRutas;
	private JScrollPane scrollPaneRutas;
	private pnlContenedorRutas pnlContenedorRutas;
	private JPanel pnlDiseno;
	private JPanel pnlBotonBack;
	private JButton btnVolver;
	private pnlDibujarRuta pnlDibujo;
	private JButton btnDisearRuta;
	private JMenu mnIdioma_1;
	private JRadioButtonMenuItem rdbtnEspaniol;
	private JRadioButtonMenuItem rdbtnIngles;

	/**
	 * Launch the application.
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
		frmLogin.setTitle("Inicio de sesi\u00F3n Camping");
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
				gbl_panelIniciarSesion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				pnlIniciarSesion.setLayout(gbl_panelIniciarSesion);
				{
					lblIniciarSesin = new JLabel("Inicio de sesi\u00F3n");
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
					lblErrorLaContrasea = new JLabel("Error, el usuario o la contrase\u00F1a no son correctos.");
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
					pnlUser.setToolTipText("Principal.panelUser.toolTipText");
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
						lblIconUser = new JLabel("");
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
						lblIconPass = new JLabel("");
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
						pwdContrasena.setText("Contraseña");
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
						btnVerPass = new JButton("");
						verPass = false;
						btnVerPass.setToolTipText("Principal.btnVerPass.toolTipText");
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
					btnEntrar = new JButton("Entrar");
					btnEntrar.setMnemonic(KeyEvent.VK_ENTER);
					btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnEntrar.addActionListener(new BtnEntrarActionListener());
					{
						chckbxRecordarContrasea = new JCheckBox("Recordar contraseña");
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
					lblteHasOlvidado = new JLabel("\u00BFNo recuerdas la contrase\u00F1a?");
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
					pnlOcultar.setToolTipText("Ocultar datos del Usuario\r\n");
					pnlInformacion.add(pnlOcultar, BorderLayout.EAST);
					GridBagLayout gbl_pnlOcultar = new GridBagLayout();
					gbl_pnlOcultar.columnWidths = new int[] { 33, 0 };
					gbl_pnlOcultar.rowHeights = new int[] { 665, 0 };
					gbl_pnlOcultar.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
					gbl_pnlOcultar.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
					pnlOcultar.setLayout(gbl_pnlOcultar);
					{
						btnOcultar = new JButton("");
						btnOcultar.setToolTipText("Pulsar para ocultar o mostrar");
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
							btnAyuda = new JButton("Ayuda");
							btnAyuda.setToolTipText("Pulsa para ver un vÃ­deo explicativo");
							btnAyuda.setIcon(
									new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/informacion.png")));
							menuBar.add(btnAyuda);
						}
						{
							btnConfiguracin = new JButton("Configuraci\u00F3n");
							btnConfiguracin.addActionListener(new BtnConfiguracinActionListener());
							btnConfiguracin.setToolTipText("ConfiguraciÃ³n de la aplicaciÃ³n");
							btnConfiguracin.setIcon(new ImageIcon(
									Login.class.getResource("/Presentacion/Imagenes/configuraciones.png")));
							menuBar.add(btnConfiguracin);
						}
						{
							mnIdioma_1 = new JMenu();
							mnIdioma_1.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/mundial.png")));
							mnIdioma_1.setText("Idioma");
							mnIdioma_1.setToolTipText("Idioma");
							menuBar.add(mnIdioma_1);
							{
								rdbtnEspaniol = new JRadioButtonMenuItem("Spanish");
								rdbtnEspaniol.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/spain16x16.png")));
								mnIdioma_1.add(rdbtnEspaniol);
							}
							{
								rdbtnIngles = new JRadioButtonMenuItem("English");
								rdbtnIngles.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/united-kingdom16x16.png")));
								mnIdioma_1.add(rdbtnIngles);
							}
						}
					}
					{
						pnlBtnSalir = new JPanel();
						pnlUserData.add(pnlBtnSalir, BorderLayout.SOUTH);
						{
							btnSalir = new JButton("Salir");
							btnSalir.setToolTipText("Click para salir");
							btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							btnSalir.addActionListener(new BtnSalirActionListener());
							pnlBtnSalir.add(btnSalir);
						}
						{
							btnCerrarSesin = new JButton("Cerrar sesion");
							btnCerrarSesin.setToolTipText("Click para terminar sesiÃ³n");
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
								lblBusquedaPorNombre = new JLabel("Busqueda por nombre: ");
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
								btnAadir = new JButton("A\u00F1adir");
								btnAadir.addActionListener(new BtnAadirActionListener());
								btnAadir.setToolTipText("Bot\u00F3n para a\u00F1adir nuevo bungalow");
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
								btnEliminar = new JButton("Eliminar");
								btnEliminar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
								btnEliminar.setToolTipText("Bot\u00F3n para eliminar el bungalow seleccionado");
								btnEliminar.addActionListener(new BtnEliminarActionListener());
								GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
								gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminar.gridx = 3;
								gbc_btnEliminar.gridy = 1;
								pnlBotones.add(btnEliminar, gbc_btnEliminar);
							}
							{
								btnModificar = new JButton("Modificar");
								btnModificar.addActionListener(new BtnModificarActionListener());
								btnModificar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
								btnModificar.setToolTipText("Bot\u00F3n para modificar el bungalow seleccioando");
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
								lblBusquedaPorNombre_P = new JLabel("Busqueda por nombre: ");
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
								btnAadirPar = new JButton("A\u00F1adir");
								btnAadirPar.addActionListener(new BtnAadirParActionListener());
								btnAadirPar.setToolTipText("Bot\u00F3n para a\u00F1adir nueva parcela");
								btnAadirPar.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/add-button16x16.png")));
								GridBagConstraints gbc_btnAadirPar = new GridBagConstraints();
								gbc_btnAadirPar.insets = new Insets(0, 0, 5, 5);
								gbc_btnAadirPar.gridx = 1;
								gbc_btnAadirPar.gridy = 1;
								pnlBotonesPar.add(btnAadirPar, gbc_btnAadirPar);
							}
							{
								btnEliminarPar = new JButton("Eliminar");
								btnEliminarPar.setToolTipText("Bot\u00F3n para eliminar la parcela seleccionada");
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
								btnModificar_1 = new JButton("Modificar");
								btnModificar_1.addActionListener(new BtnModificar_1ActionListener());
								btnModificar_1.setToolTipText("Bot\u00F3n para modificar la parcela seleccionada");
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
							lblBusquedaPorDni = new JLabel("Busqueda por DNI: ");
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
									btnAddEmpleado = new JButton("A\u00F1adir");
									btnAddEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnAddEmpleado.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/add-user-button.png")));
									btnAddEmpleado.addActionListener(new BtnAadir_1ActionListener());
									btnAddEmpleado.setToolTipText("A\u00F1adir nuevo empleado");
									pnlPrincipales.add(btnAddEmpleado);
								}
								{
									btnModificarEmpleado = new JButton("Modificar");
									btnModificarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnModificarEmpleado.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
									btnModificarEmpleado
											.setToolTipText("Modificar los datos del empleado seleccionado");
									btnModificarEmpleado.addActionListener(new BtnNewButton_1ActionListener());
									pnlPrincipales.add(btnModificarEmpleado);
								}
								{
									btnEliminarEmpleado = new JButton("Eliminar");
									btnEliminarEmpleado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnEliminarEmpleado.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
									btnEliminarEmpleado.addActionListener(new BtnEliminar1ActionListener());
									btnEliminarEmpleado.setToolTipText("Eliminar el empleado seleccionado");
									pnlPrincipales.add(btnEliminarEmpleado);
								}
							}
							{
								pnlEditar = new JPanel();
								pnlBotonesEmpleados.add(pnlEditar, "pnlEditar");
								{
									btnGuardar = new JButton("Guardar");
									btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnGuardar.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/save16x16.png")));
									btnGuardar.addActionListener(new BtnGuardarActionListener());
									btnGuardar.setToolTipText("Guardar el nuevo empleado");
									pnlEditar.add(btnGuardar);
								}
								{
									btnCancelar = new JButton("Cancelar");
									btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnCancelar.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/cancel16x16.png")));
									btnCancelar.addActionListener(new BtnCancelarActionListener());
									btnCancelar.setToolTipText("Cancelar el modo editar");
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
							lblBsquedaPorNombre = new JLabel("B\u00FAsqueda por nombre: ");
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
									btnAddActividad = new JButton("A\u00F1adir");
									btnAddActividad.setToolTipText("A\u00F1adir una nueva actividad");
									btnAddActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnAddActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/add-button16x16.png")));
									btnAddActividad.addActionListener(new btnAddActividadActionListener());
									pnlPrincipalesAct.add(btnAddActividad);
								}
								{
									ModificarActividad = new JButton("Modificar");
									ModificarActividad.setToolTipText("Modificar una actividad");
									ModificarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									ModificarActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
									ModificarActividad.addActionListener(new ModificarActividadActionListener());
									pnlPrincipalesAct.add(ModificarActividad);
								}
								{
									btnEliminarActividad = new JButton("Eliminar");
									btnEliminarActividad.setToolTipText("Eliminar una actividad");
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
									btnGuardarActividad = new JButton("Guardar");
									btnGuardarActividad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
									btnGuardarActividad.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/save16x16.png")));
									btnGuardarActividad.addActionListener(new BtnGuardarActividadActionListener());
									pnlEditarAct.add(btnGuardarActividad);
								}
								{
									btnCancelarActividad = new JButton("Cancelar");
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
							lblBsquedaPorDni = new JLabel("B\u00FAsqueda por DNI del cliente: ");
							GridBagConstraints gbc_lblBsquedaPorDni = new GridBagConstraints();
							gbc_lblBsquedaPorDni.fill = GridBagConstraints.HORIZONTAL;
							gbc_lblBsquedaPorDni.insets = new Insets(0, 0, 5, 5);
							gbc_lblBsquedaPorDni.gridx = 1;
							gbc_lblBsquedaPorDni.gridy = 0;
							pnlReservas.add(lblBsquedaPorDni, gbc_lblBsquedaPorDni);
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
								btnModificarReserva = new JButton("Modificar");
								btnModificarReserva.addActionListener(new BtnModificarReservaActionListener());
								btnModificarReserva.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
								btnModificarReserva.setToolTipText("Bot\u00F3n para modificar la reserva");
								pnlBotonesReserva.add(btnModificarReserva);
							}
							{
								btnEliminarReserva = new JButton("Eliminar");
								btnEliminarReserva.addActionListener(new BtnEliminarReservaActionListener());
								btnEliminarReserva.setToolTipText("Bot\u00F3n para eliminar una reserva");
								btnEliminarReserva.setIcon(new ImageIcon(
										Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
								pnlBotonesReserva.add(btnEliminarReserva);
							}
							{
								btnRefrescar = new JButton("Refrescar");
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
								lblBsquedaPorNombre_1 = new JLabel("B\u00FAsqueda por nombre: ");
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
									btnEditar = new JButton("Modificar");
									btnEditar.addActionListener(new BtnEditarActionListener());
									btnEditar.setToolTipText("Modificar ruta");
									btnEditar.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/pencil-edit-button.png")));
									pnlContenedorBotonesRuta.add(btnEditar);
								}
								{
									btnEliminarRuta = new JButton("Eliminar");
									btnEliminarRuta.addActionListener(new BtnEliminarRutaActionListener());
									btnEliminarRuta.setToolTipText("Eliminar ruta");
									btnEliminarRuta.setIcon(new ImageIcon(
											Login.class.getResource("/Presentacion/Imagenes/deleteRed16x16.png")));
									pnlContenedorBotonesRuta.add(btnEliminarRuta);
								}
								{
									btnDisearRuta = new JButton("DISE\u00D1AR RUTAS");
									btnDisearRuta.setFont(new Font("Tahoma", Font.BOLD, 12));
									btnDisearRuta.setToolTipText("Dibujar una ruta nueva sobre el mapa");
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
									btnVolver = new JButton("Volver");
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

	private class FrameContentPaneComponentListener extends ComponentAdapter {
		@Override
		public void componentResized(ComponentEvent e) {
			int centroX = (int) pnlLogin.getBounds().getCenterX();
			int centroY = (int) pnlLogin.getBounds().getCenterY();
			int width = pnlIniciarSesion.getWidth();
			int height = pnlIniciarSesion.getHeight();

			pnlIniciarSesion.setBounds(centroX - (width / 2), centroY - (height / 2), width, height);

		}
	}

	private class FrmLoginKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

	}

	private class PnlLoginKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	private class PnlIniciarSesionKeyListener extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
	}

	private class PwdContraseaFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {

			pwdContrasena.setText("");
		}

		@Override
		public void focusLost(FocusEvent e) {

			if (pwdContrasena.getPassword().length == 0) {
				pwdContrasena.setText("ContraseÃ±a");
			}
		}
	}

	private class PwdContraseaKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 10) {
				entrar();
			}
		}
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			entrar();
		}

	}

	private class BtnOcultarActionListener implements ActionListener {
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

	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Date date = new Date();
			DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
			usuario.setUltimoAcceso(ultimoAcceso.format(date));
			System.exit(0);
		}
	}

	private class BtnCerrarSesinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout) frmLogin.getContentPane().getLayout()).show(frmLogin.getContentPane(), "panelLogin");
		}
	}

	private class BtnEliminarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este bungalow?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				pnlContenedorBungalows.borrarSeleccionada();
			}

		}
	}

	private class BtnEliminarParActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar esta parcela?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				pnlContenedorParcelas.borrarSeleccionada();
			}
		}
	}

	private class TfBusquedaDniKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorEmpleados.filtraEmpleado(tfBusquedaDni.getText());
		}
	}

	private class BtnNewButton_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosEmpleado.setComponentsEditables(true, true);
			((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlEditar");
			editar_guardar_empleado = 2; // modo editar
		}
	}

	private class BtnAadir_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosEmpleado.clean();
			pnlDatosEmpleado.setComponentsEditables(true, true);
			((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlEditar");
			editar_guardar_empleado = 1; // modo crear
		}
	}

	private class BtnEliminar1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int resp = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este empleado?",
					"Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				Empleado e;
				try {
					e = pnlDatosEmpleado.getDatosEmpleado();
					e.delete();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				pnlContenedorEmpleados.loadPanels();
				lblBusquedaPorDni.setText("");
				pnlDatosEmpleado.clean();
			}
		}
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (pnlDatosEmpleado.comprobarTextFields() && pnlDatosEmpleado.comprobarTextAreas()) {

				Empleado e;
				try {
					e = pnlDatosEmpleado.getDatosEmpleadoFromUser();
					if (editar_guardar_empleado == 1) { // Modo crear nuevo usuario
						if (e.insert()) {

							JOptionPane.showMessageDialog(null, e.getDni() + "Empleado añadido con éxito");
							pnlDatosEmpleado.setComponentsEditables(false, true);
							((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
							editar_guardar_empleado = 0;
							pnlContenedorEmpleados.loadPanels();
							lblBusquedaPorDni.setText("");

						} else {
							JOptionPane.showMessageDialog(null, "Error al añadir empleado.", "Error",
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
				JOptionPane.showMessageDialog(null, "Faltan campos por añadir.", "Aviso", JOptionPane.WARNING_MESSAGE);
				((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
				editar_guardar_empleado = 0;
				pnlDatosEmpleado.setComponentsEditables(false, false);
			}
			pnlContenedorEmpleados.loadPanels();
			pnlDatosEmpleado.setComponentsEditables(false, false);
			pnlDatosEmpleado.clean();
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosEmpleado.setComponentsEditables(false, false);
			pnlDatosEmpleado.clean();
			((CardLayout) pnlBotonesEmpleados.getLayout()).show(pnlBotonesEmpleados, "pnlPrincipales");
		}
	}

	private class btnAddActividadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosActividad.clean();
			pnlDatosActividad.setComponentsEditables(true);
			((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlEditarAct");
			editar_guardar_actividad = 1; // modo crear
		}
	}

	private class BtnEliminarActividadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, "¿Estás serguro de que quieres eliminar esta actividad?",
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

				pnlContenedorEmpleados.loadPanels();
				lblBusquedaPorDni.setText("");
				pnlDatosEmpleado.clean();
			}
		}
	}

	private class ModificarActividadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosActividad.setComponentsEditables(true);
			((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlEditarAct");
			editar_guardar_actividad = 2; // modo editar
		}
	}

	private class BtnCancelarActividadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosActividad.setComponentsEditables(false);
			pnlDatosActividad.clean();
			((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlPrincipalesAct");
		}
	}

	private class BtnVerpassActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (verPass) {
				// Ocultar la contraseÃ±a
				pwdContrasena.setEchoChar('\u2022');
				btnVerPass.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/eye.png")));
				btnVerPass.setToolTipText("Mostrar Constraseña");
				verPass = false;
			} else {
				// Mostrar la contraseÃ±a
				pwdContrasena.setEchoChar((char) 0);
				btnVerPass
						.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/Imagenes/eye_slashed24x24.png")));
				btnVerPass.setToolTipText("Ocultar Constraseña");
				verPass = true;
			}
		}
	}

	private class BtnGuardarActividadActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (pnlDatosActividad.comprobarTextFields() && pnlDatosActividad.comprobarTextAreas()) {
				Actividad a;
				try {
					a = pnlDatosActividad.getDatosActividadFromUser();
					if (editar_guardar_actividad == 1) { // Modo crear
						if (a.insert()) {
							JOptionPane.showMessageDialog(null, a.getNombre() + "Actividad añadido con éxito");
							pnlDatosActividad.setComponentsEditables(false);
							((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades,
									"pnlPrincipalesAct");
							editar_guardar_empleado = 0;
							pnlContenedorActividades.loadPanels();
							tfBusquedaNombreActividad.setText("");

						} else {
							JOptionPane.showMessageDialog(null, "Error al añadir actividad.", "Error",
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
				JOptionPane.showMessageDialog(null, "Faltan campos por añadir.", "Aviso", JOptionPane.WARNING_MESSAGE);
				((CardLayout) pnlBotonesActividades.getLayout()).show(pnlBotonesActividades, "pnlPrincipalesAct");
				editar_guardar_actividad = 0;
				pnlDatosActividad.setComponentsEditables(false);
			}
			pnlContenedorActividades.loadPanels();
			pnlDatosActividad.setComponentsEditables(false);
			pnlDatosActividad.clean();
		}
	}

	private class BtnRefrescarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlContenedorReserva.reload();
		}
	}

	private class BtnDisearRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout) pnlRutasSenderistas.getLayout()).show(pnlRutasSenderistas, "pnlDiseno");
		}
	}

	private class BtnVolverActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout) pnlRutasSenderistas.getLayout()).show(pnlRutasSenderistas, "pnlVistaRutas");
		}
	}

	private class BtnAadirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnModificarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnAadirParActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnModificar_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnConfiguracinActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnEliminarReservaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnModificarReservaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnEliminarRutaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class BtnEditarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Esta funcionalidad no esta implementada", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private class TfBusquedaNombreRutaKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorRutas.filtraRuta(tfBusquedaNombreRuta.getText());
		}
	}

	private class TfBusquedaReservaKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorReserva.filtraReserva(tfBusquedaReserva.getText());
		}
	}

	private class TfBusquedaNombreActividadKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorActividades.filtraActividad(tfBusquedaNombreActividad.getText());
		}
	}

	private class TfBusquedaBungalowKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			pnlContenedorBungalows.filtraBungalow(tfBusquedaBungalow.getText());
		}
	}

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
				pwdContrasena.setText("ContraseÃ±a");
			}

		} else {
			lblErrorLaContrasea.setVisible(true);
		}

	}

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

	private boolean isMonitor(Empleado empleado) {
		boolean isMonitor = false;
		for (Actividad a : this.cargarActividades()) {
			if (a.getEmpleado().getDni().equalsIgnoreCase(empleado.getDni())) {
				isMonitor = true;
				return isMonitor;
			}
		}

		return isMonitor;
	}

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
