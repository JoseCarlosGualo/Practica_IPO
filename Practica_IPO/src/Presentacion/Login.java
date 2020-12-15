package Presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

import Dominio.Bungalow;
import Dominio.Disponibilidad;
import Dominio.Empleado;
import Dominio.Parcela;
import Dominio.Usuario;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;

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
	private JPasswordField pwdContrasea;
	private JButton btnMostrarConsea;
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
	private JPanel pnlRutasSenderistas;
	private JPanel pnlReservas;
	private JMenuBar menuBar;
	private JMenu mnIdioma;
	private JRadioButtonMenuItem rdbtnmntmEspaol;
	private JRadioButtonMenuItem rdbtnmntmIngls;
	private JButton btnAyuda;
	private JButton btnConfiguracin;
	private JPanel pnlBtnSalir;
	private JButton btnSalir;
	private JButton btnCerrarSesin;
	private JPanel pnlBusqueda;
	private JTextField textField;
	private JLabel lblLupa;
	private JPanel pnlBotones;
	private JButton btnAadir;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JPanel pnlContenedor;
	private JPanel pnlBusquedaPar;
	private JTextField textFieldBusquedaPar;
	private JLabel lblLnlimagenlupa;
	private JPanel pnlBotonesPar;
	private JButton btnAadirPar;
	private pnlContenedorBungalows pnlContenedorBungalows;
	private JButton btnEliminarPar;
	private JButton btnModificar_1;
	private JPanel pnlContenedorPar;
	private pnlContenedorParcelas pnlVParcela;
	private JLabel lblBusquedaPorDni;
	private JTextField tfBusquedaDni;
	private JPanel pnlBotonesAEM;
	private JPanel pnlListadoEmpleados;
	private JScrollPane scrollPane;
	private JButton btnAadirEmpleado;
	private pnlContenedorEmpleados pnlContenedorEmpleados;
	private JButton btnEliminarEmpleado;
	private JButton btnModificarEmpleado;
	private pnlFormEmpleado pnlDatosEmpleado;

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
		frmLogin.addKeyListener(new PnlLoginKeyListener());
		frmLogin.setTitle("Inicio de sesi\u00F3n Camping");
		frmLogin.getContentPane().addComponentListener(new FrameContentPaneComponentListener());
		frmLogin.setBounds(100, 20, 1100, 700);
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
				gbl_panelIniciarSesion.rowHeights = new int[] { 81, 20, 26, 41, 21, 41, 20, 34, 20, 24, 0 };
				gbl_panelIniciarSesion.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panelIniciarSesion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
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
					gbc_panelUser.gridwidth = 3;
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
						lblIconUser = new JLabel("Usuario: ");
						GridBagConstraints gbc_lblIconUser = new GridBagConstraints();
						gbc_lblIconUser.gridwidth = 2;
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
						gbc_txtUser.fill = GridBagConstraints.BOTH;
						gbc_txtUser.insets = new Insets(0, 0, 0, 5);
						gbc_txtUser.gridx = 2;
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
					gbc_panelPass.gridwidth = 3;
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
						lblIconPass = new JLabel("Contrase\u00F1a: ");
						lblIconPass.setHorizontalTextPosition(SwingConstants.LEADING);
						lblIconPass.setHorizontalAlignment(SwingConstants.TRAILING);
						GridBagConstraints gbc_lblIconPass = new GridBagConstraints();
						gbc_lblIconPass.gridwidth = 2;
						gbc_lblIconPass.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconPass.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconPass.gridx = 0;
						gbc_lblIconPass.gridy = 0;
						pnlPass.add(lblIconPass, gbc_lblIconPass);
					}
					{
						btnMostrarConsea = new JButton("");
						mostrarContrasea = false;
						btnMostrarConsea.setToolTipText("Principal.btnVerPass.toolTipText");
						btnMostrarConsea.addActionListener(new BtnMostrarConseaActionListener());
						{
							pwdContrasea = new JPasswordField();
							pwdContrasea.addFocusListener(new PwdContraseaFocusListener());
							pwdContrasea.addKeyListener(new PwdContraseaKeyListener());
							pwdContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
							pwdContrasea.setText("Principal.pwdContrasea.text");
							pwdContrasea.setBackground(UIManager.getColor("CheckBox.background"));
							GridBagConstraints gbc_pwdContrasea = new GridBagConstraints();
							gbc_pwdContrasea.fill = GridBagConstraints.VERTICAL;
							gbc_pwdContrasea.insets = new Insets(0, 0, 0, 5);
							gbc_pwdContrasea.gridx = 2;
							gbc_pwdContrasea.gridy = 0;
							pnlPass.add(pwdContrasea, gbc_pwdContrasea);
							pwdContrasea.setBorder(null);
						}
						btnMostrarConsea.setOpaque(true);
						btnMostrarConsea.setContentAreaFilled(false);
						btnMostrarConsea.setBackground(UIManager.getColor("CheckBox.background"));
						btnMostrarConsea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnMostrarConsea.setBorder(null);
						// btnMostrarConsea
						// .setIcon(new
						// ImageIcon(Principal.class.getResource("/Presentacion/Iconos/eye.png")));
						GridBagConstraints gbc_btnVerPass = new GridBagConstraints();
						gbc_btnVerPass.anchor = GridBagConstraints.WEST;
						gbc_btnVerPass.gridx = 3;
						gbc_btnVerPass.gridy = 0;
						pnlPass.add(btnMostrarConsea, gbc_btnVerPass);
					}
				}
				{
					btnEntrar = new JButton("Entrar");
					btnEntrar.setMnemonic(KeyEvent.VK_ENTER);
					btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnEntrar.addActionListener(new BtnEntrarActionListener());
					{
						chckbxRecordarContrasea = new JCheckBox("Recordar contrase\u00F1a");
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
					gbc_lblOlvidadoPass.insets = new Insets(0, 0, 0, 5);
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
					gbl_pnlOcultar.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
					gbl_pnlOcultar.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
					pnlOcultar.setLayout(gbl_pnlOcultar);
					{
						btnOcultar = new JButton("");
						btnOcultar.addActionListener(new BtnOcultarActionListener());
						btnOcultar.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/mostrar.png")));
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
							mnIdioma = new JMenu("Idioma");
							menuBar.add(mnIdioma);
							{
								rdbtnmntmEspaol = new JRadioButtonMenuItem("Espa\u00F1ol");
								mnIdioma.add(rdbtnmntmEspaol);
							}
							{
								rdbtnmntmIngls = new JRadioButtonMenuItem("Ingl\u00E9s");
								mnIdioma.add(rdbtnmntmIngls);
							}
						}
						{
							btnAyuda = new JButton("Ayuda");
							btnAyuda.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/informacion.png")));
							menuBar.add(btnAyuda);
						}
						{
							btnConfiguracin = new JButton("Configuraci\u00F3n");
							btnConfiguracin.setIcon(
									new ImageIcon(Login.class.getResource("/Presentacion/configuraciones.png")));
							menuBar.add(btnConfiguracin);
						}
					}
					{
						pnlBtnSalir = new JPanel();
						pnlUserData.add(pnlBtnSalir, BorderLayout.SOUTH);
						{
							btnSalir = new JButton("Salir");
							btnSalir.addActionListener(new BtnSalirActionListener());
							pnlBtnSalir.add(btnSalir);
						}
						{
							btnCerrarSesin = new JButton("Cerrar sesion");
							btnCerrarSesin.addActionListener(new BtnCerrarSesinActionListener());
							btnCerrarSesin
									.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/cerrar-sesion.png")));
							pnlBtnSalir.add(btnCerrarSesin);
						}
					}
				}
			}
			{
				pnlPestanas = new JPanel();
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
							gbl_pnlBusqueda.columnWidths = new int[] { 25, 0, 0, 0, 0, 0, 118, 81, 32, 0, 0 };
							gbl_pnlBusqueda.rowHeights = new int[] { 25, 30, 25, 0 };
							gbl_pnlBusqueda.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, Double.MIN_VALUE };
							gbl_pnlBusqueda.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
							pnlBusqueda.setLayout(gbl_pnlBusqueda);
							{
								textField = new JTextField();
								GridBagConstraints gbc_textField = new GridBagConstraints();
								gbc_textField.gridwidth = 8;
								gbc_textField.insets = new Insets(0, 0, 5, 5);
								gbc_textField.fill = GridBagConstraints.HORIZONTAL;
								gbc_textField.gridx = 1;
								gbc_textField.gridy = 1;
								pnlBusqueda.add(textField, gbc_textField);
								textField.setColumns(10);
							}
							{
								lblLupa = new JLabel("");
								lblLupa.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/lupa.png")));
								GridBagConstraints gbc_lblLupa = new GridBagConstraints();
								gbc_lblLupa.insets = new Insets(0, 0, 5, 0);
								gbc_lblLupa.gridx = 9;
								gbc_lblLupa.gridy = 1;
								pnlBusqueda.add(lblLupa, gbc_lblLupa);
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
								GridBagConstraints gbc_btnAadir = new GridBagConstraints();
								gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
								gbc_btnAadir.gridx = 1;
								gbc_btnAadir.gridy = 1;
								pnlBotones.add(btnAadir, gbc_btnAadir);
							}
							{
								btnEliminar = new JButton("Eliminar");
								GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
								gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminar.gridx = 3;
								gbc_btnEliminar.gridy = 1;
								pnlBotones.add(btnEliminar, gbc_btnEliminar);
							}
							{
								btnModificar = new JButton("Modificar");
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
							gbl_pnlBusquedaPar.columnWidths = new int[] { 25, 0, 0, 0, 106, 50, 90, 0, 0, 0, 0 };
							gbl_pnlBusquedaPar.rowHeights = new int[] { 25, 0, 25, 0 };
							gbl_pnlBusquedaPar.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, 0.0, Double.MIN_VALUE };
							gbl_pnlBusquedaPar.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
							pnlBusquedaPar.setLayout(gbl_pnlBusquedaPar);
							{
								textFieldBusquedaPar = new JTextField();
								GridBagConstraints gbc_textFieldBusquedaPar = new GridBagConstraints();
								gbc_textFieldBusquedaPar.gridwidth = 8;
								gbc_textFieldBusquedaPar.insets = new Insets(0, 0, 5, 5);
								gbc_textFieldBusquedaPar.fill = GridBagConstraints.HORIZONTAL;
								gbc_textFieldBusquedaPar.gridx = 1;
								gbc_textFieldBusquedaPar.gridy = 1;
								pnlBusquedaPar.add(textFieldBusquedaPar, gbc_textFieldBusquedaPar);
								textFieldBusquedaPar.setColumns(10);
							}
							{
								lblLnlimagenlupa = new JLabel("");
								lblLnlimagenlupa
										.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/lupa.png")));
								GridBagConstraints gbc_lblLnlimagenlupa = new GridBagConstraints();
								gbc_lblLnlimagenlupa.insets = new Insets(0, 0, 5, 0);
								gbc_lblLnlimagenlupa.gridx = 9;
								gbc_lblLnlimagenlupa.gridy = 1;
								pnlBusquedaPar.add(lblLnlimagenlupa, gbc_lblLnlimagenlupa);
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
								GridBagConstraints gbc_btnAadirPar = new GridBagConstraints();
								gbc_btnAadirPar.insets = new Insets(0, 0, 5, 5);
								gbc_btnAadirPar.gridx = 1;
								gbc_btnAadirPar.gridy = 1;
								pnlBotonesPar.add(btnAadirPar, gbc_btnAadirPar);
							}
							{
								btnEliminarPar = new JButton("Eliminar");
								GridBagConstraints gbc_btnEliminarPar = new GridBagConstraints();
								gbc_btnEliminarPar.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminarPar.gridx = 3;
								gbc_btnEliminarPar.gridy = 1;
								pnlBotonesPar.add(btnEliminarPar, gbc_btnEliminarPar);
							}
							{
								btnModificar_1 = new JButton("Modificar");
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
								pnlVParcela = new pnlContenedorParcelas();
								pnlContenedorPar.add(pnlVParcela, "pnlParcela");
							}
						}
					}
					{
						pnlEmpleados = new JPanel();
						pnlContenedorPestanas.addTab("Empleados", null, pnlEmpleados, null);
						GridBagLayout gbl_pnlEmpleados = new GridBagLayout();
						gbl_pnlEmpleados.columnWidths = new int[] { 15, 0, 326, 30, 0, 0, 0, 0, 0 };
						gbl_pnlEmpleados.rowHeights = new int[] { 54, 0, 15, 0 };
						gbl_pnlEmpleados.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0,
								Double.MIN_VALUE };
						gbl_pnlEmpleados.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
						pnlEmpleados.setLayout(gbl_pnlEmpleados);
						{
							lblBusquedaPorDni = new JLabel("Busqueda por DNI: ");
							GridBagConstraints gbc_lblBusquedaPorDni = new GridBagConstraints();
							gbc_lblBusquedaPorDni.fill = GridBagConstraints.HORIZONTAL;
							gbc_lblBusquedaPorDni.insets = new Insets(0, 0, 5, 5);
							gbc_lblBusquedaPorDni.gridx = 1;
							gbc_lblBusquedaPorDni.gridy = 0;
							pnlEmpleados.add(lblBusquedaPorDni, gbc_lblBusquedaPorDni);
						}
						{
							tfBusquedaDni = new JTextField();
							GridBagConstraints gbc_tfBusquedaDni = new GridBagConstraints();
							gbc_tfBusquedaDni.insets = new Insets(0, 0, 5, 5);
							gbc_tfBusquedaDni.fill = GridBagConstraints.HORIZONTAL;
							gbc_tfBusquedaDni.gridx = 2;
							gbc_tfBusquedaDni.gridy = 0;
							pnlEmpleados.add(tfBusquedaDni, gbc_tfBusquedaDni);
							tfBusquedaDni.setColumns(10);
						}
						{
							pnlBotonesAEM = new JPanel();
							GridBagConstraints gbc_pnlBotonesAEM = new GridBagConstraints();
							gbc_pnlBotonesAEM.gridwidth = 3;
							gbc_pnlBotonesAEM.insets = new Insets(0, 0, 5, 5);
							gbc_pnlBotonesAEM.fill = GridBagConstraints.BOTH;
							gbc_pnlBotonesAEM.gridx = 4;
							gbc_pnlBotonesAEM.gridy = 0;
							pnlEmpleados.add(pnlBotonesAEM, gbc_pnlBotonesAEM);
							{
								btnAadirEmpleado = new JButton("A\u00F1adir");
								pnlBotonesAEM.add(btnAadirEmpleado);
							}
							{
								btnEliminarEmpleado = new JButton("Eliminar");
								pnlBotonesAEM.add(btnEliminarEmpleado);
							}
							{
								btnModificarEmpleado = new JButton("Modificar");
								pnlBotonesAEM.add(btnModificarEmpleado);
							}
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
								scrollPane
										.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
								scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
								pnlListadoEmpleados.add(scrollPane);
								{
									pnlDatosEmpleado = new pnlFormEmpleado();
									GridBagConstraints gbc_pnlDatosEmpleado = new GridBagConstraints();
									gbc_pnlDatosEmpleado.gridwidth = 3;
									gbc_pnlDatosEmpleado.insets = new Insets(0, 0, 5, 5);
									gbc_pnlDatosEmpleado.fill = GridBagConstraints.BOTH;
									gbc_pnlDatosEmpleado.gridx = 4;
									gbc_pnlDatosEmpleado.gridy = 1;
									pnlEmpleados.add(pnlDatosEmpleado, gbc_pnlDatosEmpleado);
								}
								{
									pnlContenedorEmpleados = new pnlContenedorEmpleados(this.listaEmpleados(),
											pnlDatosEmpleado);
									scrollPane.setViewportView(pnlContenedorEmpleados);
								}
							}
						}
					}
					{
						pnlActividades = new JPanel();
						pnlContenedorPestanas.addTab("Actividades", null, pnlActividades, null);
						pnlActividades.setLayout(new CardLayout(0, 0));
					}
					{
						pnlRutasSenderistas = new JPanel();
						pnlContenedorPestanas.addTab("Rutas Senderistas", null, pnlRutasSenderistas, null);
						pnlRutasSenderistas.setLayout(new CardLayout(0, 0));
					}
					{
						pnlReservas = new JPanel();
						pnlContenedorPestanas.addTab("Reservas", null, pnlReservas, null);
						pnlReservas.setLayout(new CardLayout(0, 0));
					}
				}
			}

			pnlContenedorBungalows.loadPnlBungalows(cargarBungalow());
			// Parcela parcela = new Parcela();
			// boolean correcto = bungalow.readAll();
			// if(correcto){}
			pnlVParcela.loadPnlParcelas(cargarParcela());
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

	private class BtnMostrarConseaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (mostrarContrasea) {
				pwdContrasea.setEchoChar('\u2022');
				btnMostrarConsea.setToolTipText("Mostrar Constraseña");
				mostrarContrasea = false;
			} else {
				pwdContrasea.setEchoChar((char) 0);
				btnMostrarConsea.setToolTipText("Ocultar Constraseña");
				mostrarContrasea = true;
			}
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

			pwdContrasea.setText("");
		}

		@Override
		public void focusLost(FocusEvent e) {

			if (pwdContrasea.getPassword().length == 0) {
				pwdContrasea.setText("Contraseña");
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
				btnOcultar.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/mostrar.png")));
			} else {
				pnlUserData.setVisible(true);
				btnOcultar.setIcon(new ImageIcon(Login.class.getResource("/Presentacion/ocultar.png")));
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

	private void entrar() {

		String password = pwdContrasea.getText();
		String user = txtUsuario.getText();
		usuario = new Usuario();
		usuario.setDNI(user);
		usuario.setPass(password);

		if (usuario.login()) {
			((CardLayout) frmLogin.getContentPane().getLayout()).show(frmLogin.getContentPane(), "pnlApp");
			pnlUsuario.loadUserData(usuario);
			Date fecha = new Date();
			DateFormat fecha_UltimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
			usuario.setUltimoAcceso(fecha_UltimoAcceso.format(fecha));
			usuario.update();
			lblErrorLaContrasea.setVisible(false);

			if (!chckbxRecordarContrasea.isSelected()) {
				txtUsuario.setText("");
				pwdContrasea.setText("Contraseña");
			}

		} else {
			lblErrorLaContrasea.setVisible(true);
		}

	}

	private ArrayList<Bungalow> cargarBungalow() {
		ArrayList<Bungalow> bungalows = new ArrayList<Bungalow>();
		for (int i = 0; i < 10; i++) {
			Bungalow bungalow1 = new Bungalow(i, "casa familiar", 300, 250, Disponibilidad.Libre, 6, 3,
					"Cuna, Agua, Luz", "Alojamiento perfecto para ir con tu familia", 2);
			bungalows.add(bungalow1);
		}
		return bungalows;
	}

	private ArrayList<Parcela> cargarParcela() {
		ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
		for (int i = 0; i < 10; i++) {
			Parcela parcela1 = new Parcela(i, "Parcela mediana", 200, 300, Disponibilidad.Reparacion, 150, 200, 300,
					"Cerca de la fuente de agua", "Agua con manguera, electricidad, veh�culo del camping");
			parcelas.add(parcela1);
		}
		return parcelas;
	}

	public ArrayList<Empleado> listaEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado = new Empleado("Jose", "Gualo", "imagen", "608143766", "josecarlos.gualo@alu.uclm.es",
				"Ingles, Espa�ol", "Grado en Ingenieria Informatica", "71361332Z");
		for (int i = 0; i < 10; i++) {
			empleados.add(empleado);
		}

		return empleados;
	}

	/*
	 * private ArrayList<Bungalow> cargarBungalow() {
	 * 
	 * Bungalow bungalow = new Bungalow(id, tipo, precio_noche, tamano,
	 * disponibilidad, capacidad_maxima, estancia_minima, equipamiento, descripcion,
	 * imagen) boolean correcto = false;
	 * 
	 * correcto = bungalow.readAll();
	 * 
	 * if (correcto) { return (bungalow.getClienteDAO().getListaClientes()); } else
	 * { return null; } }
	 */
}
