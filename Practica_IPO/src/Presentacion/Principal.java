package Presentacion;

import java.awt.EventQueue;
import Presentacion.*;
import Presentacion.RenderTablaNuevoPedido.panelTablaNuevoPedido;
import Presentacion.RenderTablaPedido.JCheckBoxHeader;
import Presentacion.RenderTablaPedido.BtnImprimirCellEditor;
import Presentacion.RenderTablaPedido.BtnCellRenderer;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

import Dominio.Cliente;
import Dominio.Oferta;
import Dominio.Pedido;
import Dominio.Producto;
import Dominio.ProductoCantidad;
import Dominio.Usuario;

import java.awt.Component;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFormattedTextField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;

import javax.swing.border.MatteBorder;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.SystemColor;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Cursor;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.event.TreeSelectionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Rectangle;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextPane;
import com.toedter.calendar.JDateChooser;
import java.awt.ComponentOrientation;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;

public class Principal {

	private JFrame frmTpvRestaurante;
	private JPanel panelAplicacion;
	private JPanel panelLogin;
	private JPanel panelInfo;
	private JPanel panelPestanias;
	private JPanel panelBtnOcultar;
	private panelUsuario panelDatosUser;
	private JPanel panelBtnSalir;
	private JButton btSalir;
	private JButton btnCerrarSesion;
	private JPanel pnlDatos;
	private JPanel panelIniciarSesion;
	private JTextField txtUser;
	private JPasswordField pwdContrasea;
	private JButton btnEntrar;
	private JLabel lblIconUser;
	private JTabbedPane tabbedPane;
	private JPanel panelPedidos;
	private JPanel panelClientes;
	private JPanel panelProductos;
	private JPanel panelOfertas;
	private panelEnvioDomicilio panelEntregasADomicilio;
	private JTextField tfDNI;
	private MaskFormatter formatoDNI;
	private SimpleDateFormat formatoFecha;
	private JLabel lblBsquedaPorDni;
	private JPanel pnlListadoClientes;
	private JScrollPane scrollPaneListadoClientes;
	private panelFormularioCliente pnlDatosClientes;
	private JPanel panelBotonesProductos;
	private JPanel PanelContenedorProductos;
	private panelContenedorProdMin panelProductosMiniatura;
	private panelContenedorProdDetll panelProductoDetalles;
	private JPanel panelArbol;
	private JScrollPane scrollPaneArbol;
	private JTree tree;
	private JButton btnAnadirProducto;
	private JButton btnVistaDetalles;
	private JButton btnVistaMiniatura;
	private JButton btnEditarProducto;
	private JButton btnBorrarProducto;

	private Color colorDefectoBotones;
	private final Color colorBotonSeleccionado = new Color(0, 160, 250);
	private String nodoSeleccionado;

	private final String SO = System.getProperty("os.name").substring(0, 1);
	private JLabel lblInicioSesion;
	private JLabel lblIconPass;
	private JCheckBox chckbxRecordarPass;
	private JLabel lblOlvidadoPass;
	private JLabel lblErrorLogin;
	private JPanel panelUser;
	private JPanel panelPass;
	private panelContenedorClientes panelContenedorClientes;
	private JPanel pnlBotonesCliente;
	private JPanel pnlAniadirEditarEliminar;
	private JPanel pnlGuardarCancelar;
	private JButton btnAniadirCliente;
	private JButton btnEditarCliente;
	private JButton btnEliminarCliente;
	private JButton btnGuardarCliente;
	private JButton btnCancelarCliente;
	private JPanel panelElimitarAnadirOferta;
	private panelContenedorOfertas panelContenedorOferta;
	private JButton btnEliminarOferta;
	private JLabel lblTipoDescuento;
	private JLabel lblProducto;
	private JLabel lblPromocionValida;
	private JTextField tfFechaOferta;
	private JComboBox cbTipoDescuento;
	private JComboBox cbProductoOferta;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JPanel pnlNuevaOferta;
	private JButton btnVerPass;
	private boolean verPass;
	private JPanel pnlVistaPedidos;
	private JPanel pnlNuevoPedido;
	private JButton btnNuevoPedido;
	private JButton btnEliminarPedido;
	private JButton btnEditarPedido;
	private JTextField tfBuscarPedido;
	private JLabel lbliconoBuscar;
	private JPanel pnlBusquedaPedido;
	private JButton btnConfirmarPedido;
	private JButton btnCancelarPedido;
	private JPanel pnlTecladoPedido;
	private panelTablaNuevoPedido pnlProductosNuevoPedido;
	private JPanel pnlFormPedido;
	private JPanel pnlFormaPago;
	private JPanel pnlTipoEntrega;
	private JPanel pnlSeleccionProductos;
	private JTextField tfBuscarProducto;
	private panelContenedorProductosPedidos pnlContenedorProductos;
	private JPanel pnlBuscarProducto;
	private JLabel lblLupa;
	private JPanel pnl_InfoEntrega;
	private JRadioButton rdbtnRecogidaTienda;
	private JRadioButton rdbtnEnvioDomicilio;
	private JPanel pnlDatosRecogida;
	private JPanel pnlDatosEntrega;
	private JPanel pnlDatosCliente;
	private JRadioButton rdbtnEfectivo;
	private JRadioButton rdbtnCanjearPuntos;
	private JRadioButton rdbtnTarjetaCredito;
	private JLabel lblCodigoPostal;
	private JLabel lblCalle;
	private JLabel lblNmero;
	private JLabel lblPiso;
	private JLabel lblPuerta;
	private JTextField tfPuerta;
	private JTextField tfPiso;
	private JTextField tfNumero;
	private JTextField tfCalle;
	private JTextField tfCodigoPostal;
	private JScrollPane scrollPane_tablaPedidos;
	private JTable tablePedidos;
	private int editar_guardar_user;
	private Usuario usuario;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btn_teclado7;
	private JButton btnOcultar;
	private JPanel pnlCancelarGuardar;

	private JButton[] botonesTeclado = new JButton[12];
	private JLabel lblDNI;
	private JLabel lblObservaciones;
	private JTextField tfDNI_ClientePedido;
	private JScrollPane scrollPane;
	private JTextPane tpObservaciones;
	private JDateChooser dateChooser;
	private JMenuBar menuBar;
	private JMenu mnIdioma;
	private JRadioButtonMenuItem rdbtnEspaniol;
	private JButton btnConfiguracion;
	private JButton btnAyuda;
	private JRadioButtonMenuItem rdbtnIngles;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmTpvRestaurante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}
	
	public JFrame getFrame() {
		return frmTpvRestaurante;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private ArrayList<Cliente> cargarClientes() {

		Cliente cliente = new Cliente();
		boolean correcto = false;

		correcto = cliente.readAll();

		if (correcto) {
			return (cliente.getClienteDAO().getListaClientes());
		} else {
			return null;
		}
	}

	private void initialize() {
		frmTpvRestaurante = new JFrame();
		frmTpvRestaurante.addKeyListener(new FrmTpvRestauranteKeyListener());
		frmTpvRestaurante.setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Principal.class.getResource("/Presentacion/Iconos/IconoRestaurante1.png")));
		frmTpvRestaurante.setTitle(MessagesPrincipal.getString("Principal.frmTpvRestaurante.title")); //$NON-NLS-1$
		frmTpvRestaurante.getContentPane().addComponentListener(new FrameContentPaneComponentListener());
		frmTpvRestaurante.setBounds(100, 20, 1100, 700);
		frmTpvRestaurante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpvRestaurante.getContentPane().setLayout(new CardLayout(0, 0));

		{
			panelLogin = new JPanel();
			panelLogin.addKeyListener(new PanelLoginKeyListener());
			panelLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
			panelLogin.setBorder(null);
			frmTpvRestaurante.getContentPane().add(panelLogin, "panelLogin");
			panelLogin.setLayout(null);
			{
				panelIniciarSesion = new JPanel();
				panelIniciarSesion.addKeyListener(new PanelIniciarSesionKeyListener());
				panelIniciarSesion.setBackground(SystemColor.controlLtHighlight);
				panelIniciarSesion.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
				panelIniciarSesion.setBounds(365, 152, 370, 374);
				panelLogin.add(panelIniciarSesion);
				GridBagLayout gbl_panelIniciarSesion = new GridBagLayout();
				gbl_panelIniciarSesion.columnWidths = new int[] { 50, 43, 160, 35, 14, 0 };
				gbl_panelIniciarSesion.rowHeights = new int[] { 81, 20, 26, 41, 21, 41, 20, 34, 20, 24, 0 };
				gbl_panelIniciarSesion.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panelIniciarSesion.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panelIniciarSesion.setLayout(gbl_panelIniciarSesion);
				{
					lblInicioSesion = new JLabel(MessagesPrincipal.getString("Principal.lblInicioSesion.text")); //$NON-NLS-1$
					lblInicioSesion.setBorder(new EmptyBorder(0, 10, 0, 0));
					lblInicioSesion.setForeground(SystemColor.text);
					lblInicioSesion.setBackground(SystemColor.textInactiveText);
					lblInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 24));
					lblInicioSesion.setOpaque(true);
					GridBagConstraints gbc_lblInicioSesion = new GridBagConstraints();
					gbc_lblInicioSesion.fill = GridBagConstraints.BOTH;
					gbc_lblInicioSesion.gridwidth = 5;
					gbc_lblInicioSesion.insets = new Insets(0, 0, 5, 0);
					gbc_lblInicioSesion.gridx = 0;
					gbc_lblInicioSesion.gridy = 0;
					panelIniciarSesion.add(lblInicioSesion, gbc_lblInicioSesion);
				}
				{
					lblErrorLogin = new JLabel(MessagesPrincipal.getString("Principal.lblErrorLogin.text")); //$NON-NLS-1$
					lblErrorLogin.setBorder(new LineBorder(new Color(178, 34, 34), 1, true));
					lblErrorLogin.setHorizontalAlignment(SwingConstants.CENTER);
					lblErrorLogin.setOpaque(true);
					lblErrorLogin.setBackground(new Color(255, 99, 71));
					lblErrorLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
					lblErrorLogin.setForeground(Color.BLACK);
					lblErrorLogin.setVisible(false);
					GridBagConstraints gbc_lblErrorLogin = new GridBagConstraints();
					gbc_lblErrorLogin.fill = GridBagConstraints.BOTH;
					gbc_lblErrorLogin.gridwidth = 2;
					gbc_lblErrorLogin.insets = new Insets(0, 0, 5, 5);
					gbc_lblErrorLogin.gridx = 1;
					gbc_lblErrorLogin.gridy = 2;
					panelIniciarSesion.add(lblErrorLogin, gbc_lblErrorLogin);
				}
				{
					panelUser = new JPanel();
					panelUser.setToolTipText(MessagesPrincipal.getString("Principal.panelUser.toolTipText")); //$NON-NLS-1$
					panelUser.setBorder(null);
					GridBagConstraints gbc_panelUser = new GridBagConstraints();
					gbc_panelUser.fill = GridBagConstraints.BOTH;
					gbc_panelUser.gridwidth = 2;
					gbc_panelUser.insets = new Insets(0, 0, 5, 5);
					gbc_panelUser.gridx = 1;
					gbc_panelUser.gridy = 3;
					panelIniciarSesion.add(panelUser, gbc_panelUser);
					GridBagLayout gbl_panelUser = new GridBagLayout();
					gbl_panelUser.columnWidths = new int[] { 43, 53, 160, 0, 0 };
					gbl_panelUser.rowHeights = new int[] { 39, 0 };
					gbl_panelUser.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
					gbl_panelUser.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
					panelUser.setLayout(gbl_panelUser);
					{
						lblIconUser = new JLabel("");
						GridBagConstraints gbc_lblIconUser = new GridBagConstraints();
						gbc_lblIconUser.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconUser.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconUser.gridx = 0;
						gbc_lblIconUser.gridy = 0;
						panelUser.add(lblIconUser, gbc_lblIconUser);
						lblIconUser.setIcon(
								new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/userLogin.png")));
					}
					{

						txtUser = new JTextField();
						try {
							formatoDNI = new MaskFormatter("########");
							formatoDNI.setPlaceholderCharacter('X');
							txtUser = new JFormattedTextField(formatoDNI);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						txtUser.setFont(new Font("Tahoma", Font.BOLD, 12));
						txtUser.setBackground(UIManager.getColor("CheckBox.background"));
						GridBagConstraints gbc_txtUser = new GridBagConstraints();
						gbc_txtUser.fill = GridBagConstraints.BOTH;
						gbc_txtUser.gridwidth = 3;
						gbc_txtUser.insets = new Insets(0, 0, 0, 5);
						gbc_txtUser.gridx = 1;
						gbc_txtUser.gridy = 0;
						panelUser.add(txtUser, gbc_txtUser);
						txtUser.setBorder(null);
						txtUser.setColumns(10);
					}
				}
				{
					panelPass = new JPanel();
					GridBagConstraints gbc_panelPass = new GridBagConstraints();
					gbc_panelPass.fill = GridBagConstraints.BOTH;
					gbc_panelPass.gridwidth = 2;
					gbc_panelPass.insets = new Insets(0, 0, 5, 5);
					gbc_panelPass.gridx = 1;
					gbc_panelPass.gridy = 5;
					panelIniciarSesion.add(panelPass, gbc_panelPass);
					GridBagLayout gbl_panelPass = new GridBagLayout();
					gbl_panelPass.columnWidths = new int[] { 43, 53, 160, 32, 0 };
					gbl_panelPass.rowHeights = new int[] { 37, 0 };
					gbl_panelPass.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
					gbl_panelPass.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
					panelPass.setLayout(gbl_panelPass);
					{
						lblIconPass = new JLabel("");
						lblIconPass.setHorizontalTextPosition(SwingConstants.LEADING);
						lblIconPass.setHorizontalAlignment(SwingConstants.TRAILING);
						GridBagConstraints gbc_lblIconPass = new GridBagConstraints();
						gbc_lblIconPass.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconPass.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconPass.gridx = 0;
						gbc_lblIconPass.gridy = 0;
						panelPass.add(lblIconPass, gbc_lblIconPass);
						lblIconPass.setIcon(
								new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/locked-padlock.png")));
					}
					{
						pwdContrasea = new JPasswordField();
						pwdContrasea.addFocusListener(new PwdContraseaFocusListener());
						pwdContrasea.addKeyListener(new PwdContraseaKeyListener());
						pwdContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
						pwdContrasea.setText(MessagesPrincipal.getString("Principal.pwdContrasea.text")); //$NON-NLS-1$
						pwdContrasea.setBackground(UIManager.getColor("CheckBox.background"));
						GridBagConstraints gbc_pwdContrasea = new GridBagConstraints();
						gbc_pwdContrasea.fill = GridBagConstraints.BOTH;
						gbc_pwdContrasea.gridwidth = 2;
						gbc_pwdContrasea.insets = new Insets(0, 0, 0, 5);
						gbc_pwdContrasea.gridx = 1;
						gbc_pwdContrasea.gridy = 0;
						panelPass.add(pwdContrasea, gbc_pwdContrasea);
						pwdContrasea.setBorder(null);
					}
					{
						btnVerPass = new JButton("");
						verPass = false;
						btnVerPass.setToolTipText(MessagesPrincipal.getString("Principal.btnVerPass.toolTipText")); //$NON-NLS-1$
						btnVerPass.addActionListener(new BtnVerPassActionListener());
						btnVerPass.setOpaque(true);
						btnVerPass.setContentAreaFilled(false);
						btnVerPass.setBackground(UIManager.getColor("CheckBox.background"));
						btnVerPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnVerPass.setBorder(null);
						btnVerPass.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/eye.png")));
						GridBagConstraints gbc_btnVerPass = new GridBagConstraints();
						gbc_btnVerPass.anchor = GridBagConstraints.WEST;
						gbc_btnVerPass.gridx = 3;
						gbc_btnVerPass.gridy = 0;
						panelPass.add(btnVerPass, gbc_btnVerPass);
					}
				}
				{
					btnEntrar = new JButton(MessagesPrincipal.getString("Principal.btnEntrar.text")); //$NON-NLS-1$
					btnEntrar.setMnemonic(KeyEvent.VK_ENTER);
					btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					btnEntrar.addActionListener(new BtnEntrarActionListener());
					{
						chckbxRecordarPass = new JCheckBox(MessagesPrincipal.getString("Principal.chckbxRecordarPass.text")); //$NON-NLS-1$
						chckbxRecordarPass.setBackground(SystemColor.text);
						GridBagConstraints gbc_chckbxRecordarPass = new GridBagConstraints();
						gbc_chckbxRecordarPass.fill = GridBagConstraints.BOTH;
						gbc_chckbxRecordarPass.insets = new Insets(0, 0, 5, 5);
						gbc_chckbxRecordarPass.gridx = 1;
						gbc_chckbxRecordarPass.gridy = 7;
						panelIniciarSesion.add(chckbxRecordarPass, gbc_chckbxRecordarPass);
					}
					GridBagConstraints gbc_btnEntrar = new GridBagConstraints();
					gbc_btnEntrar.fill = GridBagConstraints.BOTH;
					gbc_btnEntrar.insets = new Insets(0, 0, 5, 5);
					gbc_btnEntrar.gridx = 2;
					gbc_btnEntrar.gridy = 7;
					panelIniciarSesion.add(btnEntrar, gbc_btnEntrar);
				}
				{
					lblOlvidadoPass = new JLabel(MessagesPrincipal.getString("Principal.lblOlvidadoPass.text")); //$NON-NLS-1$
					lblOlvidadoPass.setHorizontalAlignment(SwingConstants.CENTER);
					lblOlvidadoPass.setHorizontalTextPosition(SwingConstants.CENTER);
					lblOlvidadoPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
					lblOlvidadoPass.setForeground(SystemColor.textHighlight);
					lblOlvidadoPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					GridBagConstraints gbc_lblOlvidadoPass = new GridBagConstraints();
					gbc_lblOlvidadoPass.anchor = GridBagConstraints.NORTH;
					gbc_lblOlvidadoPass.fill = GridBagConstraints.HORIZONTAL;
					gbc_lblOlvidadoPass.insets = new Insets(0, 0, 0, 5);
					gbc_lblOlvidadoPass.gridwidth = 4;
					gbc_lblOlvidadoPass.gridx = 0;
					gbc_lblOlvidadoPass.gridy = 9;
					panelIniciarSesion.add(lblOlvidadoPass, gbc_lblOlvidadoPass);
				}
			}
		}
		{
			panelAplicacion = new JPanel();
			frmTpvRestaurante.getContentPane().add(panelAplicacion, "panelAplicacion");
			panelAplicacion.setLayout(new BorderLayout(0, 0));
			{
				panelInfo = new JPanel();
				panelAplicacion.add(panelInfo, BorderLayout.WEST);
				panelInfo.setLayout(new BorderLayout(0, 0));
				{
					panelBtnOcultar = new JPanel();
					panelInfo.add(panelBtnOcultar, BorderLayout.EAST);
					GridBagLayout gbl_panelBtnOcultar = new GridBagLayout();
					gbl_panelBtnOcultar.columnWidths = new int[] { 25, 0 };
					gbl_panelBtnOcultar.rowHeights = new int[] { 23, 0 };
					gbl_panelBtnOcultar.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
					gbl_panelBtnOcultar.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
					panelBtnOcultar.setLayout(gbl_panelBtnOcultar);
					{
						btnOcultar = new JButton("");
						btnOcultar.setToolTipText(MessagesPrincipal.getString("Principal.btnOcultar.toolTipText")); //$NON-NLS-1$
						colorDefectoBotones = btnOcultar.getBackground();
						btnOcultar.setIcon(
								new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/ocultar.png")));
						btnOcultar.setMinimumSize(new Dimension(10, 10));
						btnOcultar.setBackground(new Color(238, 238, 238));
						btnOcultar.addActionListener(new BtnOcultarActionListener());
						btnOcultar.setPreferredSize(new Dimension(15, 15));
						GridBagConstraints gbc_btnOcultar = new GridBagConstraints();
						gbc_btnOcultar.fill = GridBagConstraints.BOTH;
						gbc_btnOcultar.gridx = 0;
						gbc_btnOcultar.gridy = 0;
						panelBtnOcultar.add(btnOcultar, gbc_btnOcultar);
					}
				}
				{
					pnlDatos = new JPanel();
					panelInfo.add(pnlDatos, BorderLayout.CENTER);
					pnlDatos.setLayout(new BorderLayout(0, 0));
					{
						menuBar = new JMenuBar();
						pnlDatos.add(menuBar, BorderLayout.NORTH);
						{
							mnIdioma = new JMenu();
							mnIdioma.setToolTipText(MessagesPrincipal.getString("Principal.mnIdioma.toolTipText")); //$NON-NLS-1$
							mnIdioma.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/mundial.png")));
							menuBar.add(mnIdioma);
							{
								rdbtnEspaniol = new JRadioButtonMenuItem(MessagesPrincipal.getString("Principal.rdbtnmntmNewRadioItem.text")); //$NON-NLS-1$

								System.out.println(MessagesPrincipal.getIdioma());
								rdbtnEspaniol.setText("Spanish");
								rdbtnEspaniol.addActionListener(new RdbtnCambiarIdiomaActionListener());
								buttonGroup_2.add(rdbtnEspaniol);
								rdbtnEspaniol.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/spain16x16.png")));
								mnIdioma.add(rdbtnEspaniol);
							}
							{
								rdbtnIngles = new JRadioButtonMenuItem(MessagesPrincipal.getString("Principal.rdbtnmntmNewRadioItem.text")); //$NON-NLS-1$
								rdbtnIngles.addActionListener(new RdbtnCambiarIdiomaActionListener());
								buttonGroup_2.add(rdbtnIngles);
								if (MessagesPrincipal.getIdioma().equals("inglés")) {
									rdbtnIngles.setSelected(true);
								}
								else {
									rdbtnEspaniol.setSelected(true);
								}
								rdbtnIngles.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/united-kingdom16x16.png")));
								rdbtnIngles.setText("English");
								mnIdioma.add(rdbtnIngles);
							}
						}
						{
							btnConfiguracion = new JButton(); 
							btnConfiguracion.addActionListener(new BtnConfiguracionActionListener());
							btnConfiguracion.setToolTipText(MessagesPrincipal.getString("Principal.btnConfiguracion.toolTipText")); //$NON-NLS-1$
							btnConfiguracion.setContentAreaFilled(false);
							btnConfiguracion.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/settings-work-tool.png")));
							menuBar.add(btnConfiguracion);
						}
						{
							btnAyuda = new JButton();
							btnAyuda.setToolTipText(MessagesPrincipal.getString("Principal.btnAyuda.toolTipText")); //$NON-NLS-1$
							btnAyuda.setContentAreaFilled(false);
							btnAyuda.addActionListener(new ButtonActionListener());
							btnAyuda.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/question.png")));
							menuBar.add(btnAyuda);
						}
					}
					{
						panelBtnSalir = new JPanel();
						pnlDatos.add(panelBtnSalir, BorderLayout.SOUTH);
						{
							btSalir = new JButton(MessagesPrincipal.getString("Principal.btSalir.text")); //$NON-NLS-1$
							btSalir.setToolTipText(MessagesPrincipal.getString("Principal.btSalir.toolTipText")); //$NON-NLS-1$
							btSalir.addActionListener(new BtSalirActionListener());
							panelBtnSalir.add(btSalir);
						}
						{
							btnCerrarSesion = new JButton(MessagesPrincipal.getString("Principal.btnCerrarSesion.text")); //$NON-NLS-1$
							btnCerrarSesion.setToolTipText(
									MessagesPrincipal.getString("Principal.btnCerrarSesion.toolTipText")); //$NON-NLS-1$
							btnCerrarSesion.addActionListener(new BtnCerrarSesionActionListener());
							panelBtnSalir.add(btnCerrarSesion);
						}
					}
					{
						panelDatosUser = new panelUsuario();
						pnlDatos.add(panelDatosUser, BorderLayout.EAST);
					}
				}
			}
			{
				panelPestanias = new JPanel();
				panelPestanias.setBorder(null);
				panelAplicacion.add(panelPestanias, BorderLayout.CENTER);
				panelPestanias.setLayout(new BorderLayout(0, 0));
				{
					tabbedPane = new JTabbedPane(JTabbedPane.TOP);
					panelPestanias.add(tabbedPane, BorderLayout.CENTER);
					{
						panelPedidos = new JPanel();
						tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabbedPanePedidos.text"), null, panelPedidos, null);
						panelPedidos.setLayout(new CardLayout(0, 0));
						{
							pnlVistaPedidos = new JPanel();
							pnlVistaPedidos.setOpaque(false);
							panelPedidos.add(pnlVistaPedidos, "pnlVistaPedidos");
							GridBagLayout gbl_pnlVistaPedidos = new GridBagLayout();
							gbl_pnlVistaPedidos.columnWidths = new int[] { 35, 130, 20, 130, 20, 130, 20, 181, 20, 0 };
							gbl_pnlVistaPedidos.rowHeights = new int[] { 20, 32, 20, 0, 0 };
							gbl_pnlVistaPedidos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
									0.0, Double.MIN_VALUE };
							gbl_pnlVistaPedidos.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
							pnlVistaPedidos.setLayout(gbl_pnlVistaPedidos);
							{
								btnNuevoPedido = new JButton(MessagesPrincipal.getString("Principal.btnNuevoPedido.text")); //$NON-NLS-1$
								btnNuevoPedido.addActionListener(new BtnNuevoPedidoActionListener());
								btnNuevoPedido.setToolTipText(MessagesPrincipal.getString("Principal.btnNuevoPedido.toolTipText")); //$NON-NLS-1$
								btnNuevoPedido.setBackground(UIManager.getColor("Button.background"));
								btnNuevoPedido.setIconTextGap(9);
								btnNuevoPedido.setIcon(new ImageIcon(
										Principal.class.getResource("/Presentacion/Iconos/add-button16x16.png")));
								GridBagConstraints gbc_btnNuevoPedido = new GridBagConstraints();
								gbc_btnNuevoPedido.fill = GridBagConstraints.BOTH;
								gbc_btnNuevoPedido.insets = new Insets(0, 0, 5, 5);
								gbc_btnNuevoPedido.gridx = 1;
								gbc_btnNuevoPedido.gridy = 1;
								pnlVistaPedidos.add(btnNuevoPedido, gbc_btnNuevoPedido);
							}
							{
								btnEliminarPedido = new JButton(MessagesPrincipal.getString("Principal.btnEliminarPedido.text")); //$NON-NLS-1$
								btnEliminarPedido
										.addActionListener(new BtnEliminarPedidosSeleccionadosActionListener());
								btnEliminarPedido.setToolTipText(MessagesPrincipal.getString("Principal.btnEliminarPedido.toolTipText")); //$NON-NLS-1$
								btnEliminarPedido.setBackground(UIManager.getColor("Button.background"));
								btnEliminarPedido.setIcon(new ImageIcon(
										Principal.class.getResource("/Presentacion/Iconos/rubbish-bin.png")));
								GridBagConstraints gbc_btnEliminarPedido = new GridBagConstraints();
								gbc_btnEliminarPedido.fill = GridBagConstraints.BOTH;
								gbc_btnEliminarPedido.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminarPedido.gridx = 3;
								gbc_btnEliminarPedido.gridy = 1;
								pnlVistaPedidos.add(btnEliminarPedido, gbc_btnEliminarPedido);
							}
							{
								btnEditarPedido = new JButton(MessagesPrincipal.getString("Principal.btnEditarPedido.text")); //$NON-NLS-1$
								btnEditarPedido.addActionListener(new BtnEditarPedidoActionListener());
								btnEditarPedido.setToolTipText(MessagesPrincipal.getString("Principal.btnEditarPedido.toolTipText")); //$NON-NLS-1$
								btnEditarPedido.setIcon(new ImageIcon(
										Principal.class.getResource("/Presentacion/Iconos/pencil-edit-button.png")));
								GridBagConstraints gbc_btnEditarPedido = new GridBagConstraints();
								gbc_btnEditarPedido.fill = GridBagConstraints.BOTH;
								gbc_btnEditarPedido.insets = new Insets(0, 0, 5, 5);
								gbc_btnEditarPedido.gridx = 5;
								gbc_btnEditarPedido.gridy = 1;
								pnlVistaPedidos.add(btnEditarPedido, gbc_btnEditarPedido);
							}
							{
								pnlBusquedaPedido = new JPanel();
								pnlBusquedaPedido.setBorder(new LineBorder(new Color(0, 0, 0)));
								pnlBusquedaPedido.setBackground(UIManager.getColor("Button.background"));
								GridBagConstraints gbc_pnlBusquedaPedido = new GridBagConstraints();
								gbc_pnlBusquedaPedido.insets = new Insets(0, 0, 5, 5);
								gbc_pnlBusquedaPedido.fill = GridBagConstraints.BOTH;
								gbc_pnlBusquedaPedido.gridx = 7;
								gbc_pnlBusquedaPedido.gridy = 1;
								pnlVistaPedidos.add(pnlBusquedaPedido, gbc_pnlBusquedaPedido);
								GridBagLayout gbl_pnlBusquedaPedido = new GridBagLayout();
								gbl_pnlBusquedaPedido.columnWidths = new int[] { 181, 0, 33, 0 };
								gbl_pnlBusquedaPedido.rowHeights = new int[] { 32, 0 };
								gbl_pnlBusquedaPedido.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
								gbl_pnlBusquedaPedido.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
								pnlBusquedaPedido.setLayout(gbl_pnlBusquedaPedido);
								{
									tfBuscarPedido = new JTextField();
									tfBuscarPedido.setMargin(new Insets(2, 8, 2, 2));
									tfBuscarPedido.setFont(new Font("Tahoma", Font.BOLD, 11));
									tfBuscarPedido.setBackground(UIManager.getColor("Button.background"));
									tfBuscarPedido.setText(MessagesPrincipal.getString("Principal.tfBuscarPedido.text")); //$NON-NLS-1$
									tfBuscarPedido.setToolTipText(MessagesPrincipal.getString("Principal.tfBuscarPedido.toolTipText")); //$NON-NLS-1$
									GridBagConstraints gbc_tfBuscarPedido = new GridBagConstraints();
									gbc_tfBuscarPedido.fill = GridBagConstraints.BOTH;
									gbc_tfBuscarPedido.insets = new Insets(0, 0, 0, 5);
									gbc_tfBuscarPedido.gridx = 0;
									gbc_tfBuscarPedido.gridy = 0;
									pnlBusquedaPedido.add(tfBuscarPedido, gbc_tfBuscarPedido);
									tfBuscarPedido.setBorder(null);
									tfBuscarPedido.setColumns(10);
								}
								{
									lbliconoBuscar = new JLabel("");
									lbliconoBuscar.setOpaque(true);
									lbliconoBuscar.setBackground(UIManager.getColor("Button.background"));
									GridBagConstraints gbc_lbliconoBuscar = new GridBagConstraints();
									gbc_lbliconoBuscar.fill = GridBagConstraints.VERTICAL;
									gbc_lbliconoBuscar.gridx = 2;
									gbc_lbliconoBuscar.gridy = 0;
									pnlBusquedaPedido.add(lbliconoBuscar, gbc_lbliconoBuscar);
									lbliconoBuscar.setBorder(new CompoundBorder());
									lbliconoBuscar.setIcon(new ImageIcon(
											Principal.class.getResource("/Presentacion/Iconos/lupa16x16.png")));
								}
							}
							{
								scrollPane_tablaPedidos = new JScrollPane();
								GridBagConstraints gbc_scrollPane_tablaPedidos = new GridBagConstraints();
								gbc_scrollPane_tablaPedidos.gridwidth = 7;
								gbc_scrollPane_tablaPedidos.insets = new Insets(0, 0, 0, 5);
								gbc_scrollPane_tablaPedidos.fill = GridBagConstraints.BOTH;
								gbc_scrollPane_tablaPedidos.gridx = 1;
								gbc_scrollPane_tablaPedidos.gridy = 3;
								pnlVistaPedidos.add(scrollPane_tablaPedidos, gbc_scrollPane_tablaPedidos);
								{
									tablePedidos = new JTable();
									ModeloTablaPedidos modeloTablaPedidos = new ModeloTablaPedidos();
									tablePedidos.setModel(modeloTablaPedidos);
									tablePedidos.setRowHeight(40);
									tablePedidos.getTableHeader().setReorderingAllowed(false);

									scrollPane_tablaPedidos.setViewportView(tablePedidos);

									// Centrar columnas y definir tamaño
									DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
									modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
									tablePedidos.getColumnModel().getColumn(1).setPreferredWidth(75); // Num Pedido
									tablePedidos.getColumnModel().getColumn(1).setMaxWidth(75);
									tablePedidos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
									tablePedidos.getColumnModel().getColumn(2).setPreferredWidth(75); // Importe
									tablePedidos.getColumnModel().getColumn(2).setMaxWidth(75);
									tablePedidos.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
									tablePedidos.getColumnModel().getColumn(3).setPreferredWidth(120); // Estado
									tablePedidos.getColumnModel().getColumn(3).setMaxWidth(120);
									tablePedidos.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
									tablePedidos.getColumnModel().getColumn(4).setPreferredWidth(95); // Cliente
									tablePedidos.getColumnModel().getColumn(4).setMaxWidth(95);
									tablePedidos.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
									tablePedidos.getColumnModel().getColumn(5).setPreferredWidth(130); // Fecha y Hora
									tablePedidos.getColumnModel().getColumn(5).setMaxWidth(130);
									tablePedidos.getColumnModel().getColumn(5).setCellRenderer(modelocentrar);

									TableColumn columnaEstadoPedido = tablePedidos.getColumnModel().getColumn(3);
									JComboBox comboBox = new JComboBox();
									comboBox.addItem("En elaboración");
									comboBox.addItem("Entregado");
									comboBox.addItem("Recogido");
									comboBox.addItem("Pagado");
									comboBox.addItem("Pendiente pago");
									columnaEstadoPedido.setCellEditor(new DefaultCellEditor(comboBox));

									// Botón imprimir Ticket
									TableColumn botonTicketCell;
									botonTicketCell = tablePedidos.getColumnModel().getColumn(7);
									botonTicketCell.setCellEditor(new BtnImprimirCellEditor(tablePedidos));
									BtnCellRenderer btnTicketRenderer = new BtnCellRenderer(true,
											new ImageIcon(Principal.class
													.getResource("/Presentacion/Iconos/printing-tool16x16.png")),
											"Imprimir ticket");
									botonTicketCell.setCellRenderer(btnTicketRenderer);
									botonTicketCell.setPreferredWidth(40);
									botonTicketCell.setMaxWidth(40);
									botonTicketCell.setMinWidth(40);

									TableColumn checkboxHeader;
									checkboxHeader = tablePedidos.getColumnModel().getColumn(0);
									checkboxHeader.setCellEditor(tablePedidos.getDefaultEditor(Boolean.class));
									checkboxHeader.setCellRenderer(tablePedidos.getDefaultRenderer(Boolean.class));
									JCheckBoxHeader chkheader = new JCheckBoxHeader(tablePedidos);
									checkboxHeader.setHeaderRenderer(chkheader);
									checkboxHeader.setPreferredWidth(30);
									checkboxHeader.setMaxWidth(30);
									checkboxHeader.setMinWidth(30);
								}
							}
						}
						{
							pnlNuevoPedido = new JPanel();
							panelPedidos.add(pnlNuevoPedido, "pnlNuevoPedido");
							GridBagLayout gbl_pnlNuevoPedido = new GridBagLayout();
							gbl_pnlNuevoPedido.columnWidths = new int[] { 30, 307, 65, 449, 15, 0 };
							gbl_pnlNuevoPedido.rowHeights = new int[] { 20, 272, 65, 243, 0, 0, 0 };
							gbl_pnlNuevoPedido.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0,
									Double.MIN_VALUE };
							gbl_pnlNuevoPedido.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
									Double.MIN_VALUE };
							pnlNuevoPedido.setLayout(gbl_pnlNuevoPedido);
							{
							}
							{
								{
									pnlProductosNuevoPedido = new panelTablaNuevoPedido();
									pnlProductosNuevoPedido.setBorder(new LineBorder(new Color(0, 0, 0)));
									GridBagConstraints gbc_pnlProductosNuevoPedido = new GridBagConstraints();
									gbc_pnlProductosNuevoPedido.insets = new Insets(0, 0, 5, 5);
									gbc_pnlProductosNuevoPedido.fill = GridBagConstraints.BOTH;
									gbc_pnlProductosNuevoPedido.gridx = 1;
									gbc_pnlProductosNuevoPedido.gridy = 1;
									pnlNuevoPedido.add(pnlProductosNuevoPedido, gbc_pnlProductosNuevoPedido);
								}
								{
									pnlFormPedido = new JPanel();
									GridBagConstraints gbc_pnlFormPedido = new GridBagConstraints();
									gbc_pnlFormPedido.gridheight = 3;
									gbc_pnlFormPedido.insets = new Insets(0, 0, 5, 5);
									gbc_pnlFormPedido.fill = GridBagConstraints.BOTH;
									gbc_pnlFormPedido.gridx = 3;
									gbc_pnlFormPedido.gridy = 1;
									pnlNuevoPedido.add(pnlFormPedido, gbc_pnlFormPedido);
									GridBagLayout gbl_pnlFormPedido = new GridBagLayout();
									gbl_pnlFormPedido.columnWidths = new int[] { 493, 40, 0 };
									gbl_pnlFormPedido.rowHeights = new int[] { 271, 125, 152, 0 };
									gbl_pnlFormPedido.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
									gbl_pnlFormPedido.rowWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
									pnlFormPedido.setLayout(gbl_pnlFormPedido);
									{
										pnlSeleccionProductos = new JPanel();
										pnlSeleccionProductos.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlSeleccionProductos.borderTitle"), //$NON-NLS-1$
												TitledBorder.LEADING, TitledBorder.TOP, null, null));
										GridBagConstraints gbc_pnlSeleccionProductos = new GridBagConstraints();
										gbc_pnlSeleccionProductos.insets = new Insets(0, 0, 5, 5);
										gbc_pnlSeleccionProductos.fill = GridBagConstraints.BOTH;
										gbc_pnlSeleccionProductos.gridx = 0;
										gbc_pnlSeleccionProductos.gridy = 0;
										pnlFormPedido.add(pnlSeleccionProductos, gbc_pnlSeleccionProductos);
										pnlSeleccionProductos.setLayout(new BorderLayout(0, 0));
										{
											pnlBuscarProducto = new JPanel();
											pnlBuscarProducto.setBackground(Color.WHITE);
											pnlBuscarProducto.setBorder(new LineBorder(new Color(0, 0, 0)));
											pnlSeleccionProductos.add(pnlBuscarProducto, BorderLayout.NORTH);
											GridBagLayout gbl_pnlBuscarProducto = new GridBagLayout();
											gbl_pnlBuscarProducto.columnWidths = new int[] { 297, 41, 0 };
											gbl_pnlBuscarProducto.rowHeights = new int[] { 29, 0 };
											gbl_pnlBuscarProducto.columnWeights = new double[] { 1.0, 0.0,
													Double.MIN_VALUE };
											gbl_pnlBuscarProducto.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
											pnlBuscarProducto.setLayout(gbl_pnlBuscarProducto);
											{
												tfBuscarProducto = new JTextField();
												tfBuscarProducto.setBorder(null);
												GridBagConstraints gbc_tfBuscarProducto = new GridBagConstraints();
												gbc_tfBuscarProducto.insets = new Insets(0, 0, 0, 5);
												gbc_tfBuscarProducto.fill = GridBagConstraints.BOTH;
												gbc_tfBuscarProducto.gridx = 0;
												gbc_tfBuscarProducto.gridy = 0;
												pnlBuscarProducto.add(tfBuscarProducto, gbc_tfBuscarProducto);
												tfBuscarProducto.setColumns(10);
											}
											{
												lblLupa = new JLabel(); 
												lblLupa.setIcon(new ImageIcon(Principal.class
														.getResource("/Presentacion/Iconos/lupa16x16.png")));
												GridBagConstraints gbc_lblLupa = new GridBagConstraints();
												gbc_lblLupa.gridx = 1;
												gbc_lblLupa.gridy = 0;
												pnlBuscarProducto.add(lblLupa, gbc_lblLupa);
											}
										}
										{
											pnlContenedorProductos = new panelContenedorProductosPedidos();
											pnlSeleccionProductos.add(pnlContenedorProductos);
										}
									}
									{
										pnlTipoEntrega = new JPanel();
										pnlTipoEntrega.setBorder(new TitledBorder(
												UIManager.getBorder("TitledBorder.border"), MessagesPrincipal.getString("Principal.pnlTipoEntrega.borderTitle"), //$NON-NLS-2$
												TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
										GridBagConstraints gbc_pnlTipoEntrega = new GridBagConstraints();
										gbc_pnlTipoEntrega.insets = new Insets(0, 0, 5, 5);
										gbc_pnlTipoEntrega.fill = GridBagConstraints.BOTH;
										gbc_pnlTipoEntrega.gridx = 0;
										gbc_pnlTipoEntrega.gridy = 1;
										pnlFormPedido.add(pnlTipoEntrega, gbc_pnlTipoEntrega);
										GridBagLayout gbl_pnlTipoEntrega = new GridBagLayout();
										gbl_pnlTipoEntrega.columnWidths = new int[] { 0, 0, 0, 0, 10, 0 };
										gbl_pnlTipoEntrega.rowHeights = new int[] { 10, 0, 0, 0, 0 };
										gbl_pnlTipoEntrega.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0,
												Double.MIN_VALUE };
										gbl_pnlTipoEntrega.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0,
												Double.MIN_VALUE };
										pnlTipoEntrega.setLayout(gbl_pnlTipoEntrega);
										{
											pnl_InfoEntrega = new JPanel();
											GridBagConstraints gbc_pnl_InfoEntrega = new GridBagConstraints();
											gbc_pnl_InfoEntrega.insets = new Insets(0, 0, 5, 5);
											gbc_pnl_InfoEntrega.gridheight = 3;
											gbc_pnl_InfoEntrega.fill = GridBagConstraints.BOTH;
											gbc_pnl_InfoEntrega.gridx = 3;
											gbc_pnl_InfoEntrega.gridy = 0;
											pnlTipoEntrega.add(pnl_InfoEntrega, gbc_pnl_InfoEntrega);
											pnl_InfoEntrega.setLayout(new CardLayout(0, 0));
											{
												pnlDatosEntrega = new JPanel();
												pnlDatosEntrega.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlDatosEntrega.borderTitle"), //$NON-NLS-1$
														TitledBorder.LEADING, TitledBorder.TOP, null, null));
												pnl_InfoEntrega.add(pnlDatosEntrega, "pnlDatosEntrega");
												GridBagLayout gbl_pnlDatosEntrega = new GridBagLayout();
												gbl_pnlDatosEntrega.columnWidths = new int[] { 10, 55, 36, 41, 52, 48,
														39, 0 };
												gbl_pnlDatosEntrega.rowHeights = new int[] { 0, 0, 0, 0 };
												gbl_pnlDatosEntrega.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
														0.0, 0.0, 0.0, Double.MIN_VALUE };
												gbl_pnlDatosEntrega.rowWeights = new double[] { 0.0, 0.0, 0.0,
														Double.MIN_VALUE };
												pnlDatosEntrega.setLayout(gbl_pnlDatosEntrega);
												{
													lblCodigoPostal = new JLabel(MessagesPrincipal.getString("Principal.lblCodigoPostal.text")); //$NON-NLS-1$
													GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
													gbc_lblCodigoPostal.anchor = GridBagConstraints.WEST;
													gbc_lblCodigoPostal.gridwidth = 2;
													gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
													gbc_lblCodigoPostal.gridx = 1;
													gbc_lblCodigoPostal.gridy = 0;
													pnlDatosEntrega.add(lblCodigoPostal, gbc_lblCodigoPostal);
												}
												{
													tfCodigoPostal = new JTextField();
													tfCodigoPostal.setColumns(10);
													GridBagConstraints gbc_tfCodigoPostal = new GridBagConstraints();
													gbc_tfCodigoPostal.gridwidth = 2;
													gbc_tfCodigoPostal.insets = new Insets(0, 0, 5, 5);
													gbc_tfCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
													gbc_tfCodigoPostal.gridx = 3;
													gbc_tfCodigoPostal.gridy = 0;
													pnlDatosEntrega.add(tfCodigoPostal, gbc_tfCodigoPostal);
												}
												{
													lblCalle = new JLabel(MessagesPrincipal.getString("Principal.lblCalle.text")); //$NON-NLS-1$
													GridBagConstraints gbc_lblCalle = new GridBagConstraints();
													gbc_lblCalle.anchor = GridBagConstraints.WEST;
													gbc_lblCalle.insets = new Insets(0, 0, 5, 5);
													gbc_lblCalle.gridx = 1;
													gbc_lblCalle.gridy = 1;
													pnlDatosEntrega.add(lblCalle, gbc_lblCalle);
												}
												{
													tfCalle = new JTextField();
													GridBagConstraints gbc_tfCalle = new GridBagConstraints();
													gbc_tfCalle.gridwidth = 5;
													gbc_tfCalle.insets = new Insets(0, 0, 5, 0);
													gbc_tfCalle.fill = GridBagConstraints.HORIZONTAL;
													gbc_tfCalle.gridx = 2;
													gbc_tfCalle.gridy = 1;
													pnlDatosEntrega.add(tfCalle, gbc_tfCalle);
													tfCalle.setColumns(10);
												}
												{
													lblNmero = new JLabel(MessagesPrincipal.getString("Principal.lblNmero.text")); //$NON-NLS-1$
													GridBagConstraints gbc_lblNmero = new GridBagConstraints();
													gbc_lblNmero.anchor = GridBagConstraints.WEST;
													gbc_lblNmero.insets = new Insets(0, 0, 0, 5);
													gbc_lblNmero.gridx = 1;
													gbc_lblNmero.gridy = 2;
													pnlDatosEntrega.add(lblNmero, gbc_lblNmero);
												}
												{
													tfNumero = new JTextField();
													tfNumero.setColumns(10);
													GridBagConstraints gbc_tfNumero = new GridBagConstraints();
													gbc_tfNumero.insets = new Insets(0, 0, 0, 5);
													gbc_tfNumero.fill = GridBagConstraints.HORIZONTAL;
													gbc_tfNumero.gridx = 2;
													gbc_tfNumero.gridy = 2;
													pnlDatosEntrega.add(tfNumero, gbc_tfNumero);
												}
												{
													lblPiso = new JLabel(MessagesPrincipal.getString("Principal.lblPiso.text")); //$NON-NLS-1$
													GridBagConstraints gbc_lblPiso = new GridBagConstraints();
													gbc_lblPiso.anchor = GridBagConstraints.EAST;
													gbc_lblPiso.insets = new Insets(0, 0, 0, 5);
													gbc_lblPiso.gridx = 3;
													gbc_lblPiso.gridy = 2;
													pnlDatosEntrega.add(lblPiso, gbc_lblPiso);
												}
												{
													tfPiso = new JTextField();
													tfPiso.setColumns(10);
													GridBagConstraints gbc_tfPiso = new GridBagConstraints();
													gbc_tfPiso.insets = new Insets(0, 0, 0, 5);
													gbc_tfPiso.fill = GridBagConstraints.HORIZONTAL;
													gbc_tfPiso.gridx = 4;
													gbc_tfPiso.gridy = 2;
													pnlDatosEntrega.add(tfPiso, gbc_tfPiso);
												}
												{
													lblPuerta = new JLabel(MessagesPrincipal.getString("Principal.lblPuerta.text")); //$NON-NLS-1$
													GridBagConstraints gbc_lblPuerta = new GridBagConstraints();
													gbc_lblPuerta.anchor = GridBagConstraints.EAST;
													gbc_lblPuerta.insets = new Insets(0, 0, 0, 5);
													gbc_lblPuerta.gridx = 5;
													gbc_lblPuerta.gridy = 2;
													pnlDatosEntrega.add(lblPuerta, gbc_lblPuerta);
												}
												{
													tfPuerta = new JTextField();
													GridBagConstraints gbc_tfPuerta = new GridBagConstraints();
													gbc_tfPuerta.fill = GridBagConstraints.HORIZONTAL;
													gbc_tfPuerta.gridx = 6;
													gbc_tfPuerta.gridy = 2;
													pnlDatosEntrega.add(tfPuerta, gbc_tfPuerta);
													tfPuerta.setColumns(10);
												}
											}
											{
												pnlDatosRecogida = new JPanel();
												pnlDatosRecogida.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlDatosRecogida.borderTitle"), //$NON-NLS-1$
														TitledBorder.LEADING, TitledBorder.TOP, null, null));
												pnl_InfoEntrega.add(pnlDatosRecogida, "pnlDatosRecogida");
											}
										}
										{
											rdbtnRecogidaTienda = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnRecogidaTienda.text")); //$NON-NLS-1$
											rdbtnRecogidaTienda.addItemListener(new RdbtnRecogidaTiendaItemListener());
											buttonGroup.add(rdbtnRecogidaTienda);
											GridBagConstraints gbc_rdbtnRecogidaTienda = new GridBagConstraints();
											gbc_rdbtnRecogidaTienda.anchor = GridBagConstraints.WEST;
											gbc_rdbtnRecogidaTienda.insets = new Insets(0, 0, 5, 5);
											gbc_rdbtnRecogidaTienda.gridx = 1;
											gbc_rdbtnRecogidaTienda.gridy = 1;
											pnlTipoEntrega.add(rdbtnRecogidaTienda, gbc_rdbtnRecogidaTienda);
										}
										{
											rdbtnEnvioDomicilio = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnEnvioDomicilio.text")); //$NON-NLS-1$
											buttonGroup.add(rdbtnEnvioDomicilio);
											rdbtnEnvioDomicilio.setSelected(true);
											GridBagConstraints gbc_rdbtnEnvioDomicilio = new GridBagConstraints();
											gbc_rdbtnEnvioDomicilio.anchor = GridBagConstraints.WEST;
											gbc_rdbtnEnvioDomicilio.insets = new Insets(0, 0, 5, 5);
											gbc_rdbtnEnvioDomicilio.gridx = 1;
											gbc_rdbtnEnvioDomicilio.gridy = 2;
											pnlTipoEntrega.add(rdbtnEnvioDomicilio, gbc_rdbtnEnvioDomicilio);
										}
									}
									{
										pnlFormaPago = new JPanel();
										pnlFormaPago.setBorder(new TitledBorder(null, MessagesPrincipal.getString("Principal.pnlFormaPago.borderTitle"), //$NON-NLS-1$
												TitledBorder.LEADING, TitledBorder.TOP, null, null));
										GridBagConstraints gbc_pnlFormaPago = new GridBagConstraints();
										gbc_pnlFormaPago.insets = new Insets(0, 0, 0, 5);
										gbc_pnlFormaPago.fill = GridBagConstraints.BOTH;
										gbc_pnlFormaPago.gridx = 0;
										gbc_pnlFormaPago.gridy = 2;
										pnlFormPedido.add(pnlFormaPago, gbc_pnlFormaPago);
										GridBagLayout gbl_pnlFormaPago = new GridBagLayout();
										gbl_pnlFormaPago.columnWidths = new int[] { 0, 0, 10, 0, 10, 0 };
										gbl_pnlFormaPago.rowHeights = new int[] { 0, 0, 0, 0, 0 };
										gbl_pnlFormaPago.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0,
												Double.MIN_VALUE };
										gbl_pnlFormaPago.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0,
												Double.MIN_VALUE };
										pnlFormaPago.setLayout(gbl_pnlFormaPago);
										{
											rdbtnEfectivo = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnEfectivo.text")); //$NON-NLS-1$
											buttonGroup_1.add(rdbtnEfectivo);
											GridBagConstraints gbc_rdbtnEfectivo = new GridBagConstraints();
											gbc_rdbtnEfectivo.anchor = GridBagConstraints.WEST;
											gbc_rdbtnEfectivo.insets = new Insets(0, 0, 5, 5);
											gbc_rdbtnEfectivo.gridx = 1;
											gbc_rdbtnEfectivo.gridy = 1;
											pnlFormaPago.add(rdbtnEfectivo, gbc_rdbtnEfectivo);
										}
										{
											pnlDatosCliente = new JPanel();
											pnlDatosCliente.setBorder(new TitledBorder(
													UIManager.getBorder("TitledBorder.border"), MessagesPrincipal.getString("Principal.pnlDatosCliente.borderTitle"), //$NON-NLS-2$
													TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
											GridBagConstraints gbc_pnlDatosCliente = new GridBagConstraints();
											gbc_pnlDatosCliente.gridwidth = 2;
											gbc_pnlDatosCliente.gridheight = 4;
											gbc_pnlDatosCliente.insets = new Insets(0, 0, 0, 5);
											gbc_pnlDatosCliente.fill = GridBagConstraints.BOTH;
											gbc_pnlDatosCliente.gridx = 3;
											gbc_pnlDatosCliente.gridy = 0;
											pnlFormaPago.add(pnlDatosCliente, gbc_pnlDatosCliente);
											GridBagLayout gbl_pnlDatosCliente = new GridBagLayout();
											gbl_pnlDatosCliente.columnWidths = new int[] { 0, 67, 0, 0 };
											gbl_pnlDatosCliente.rowHeights = new int[] { 0, 0, 0, 10, 0 };
											gbl_pnlDatosCliente.columnWeights = new double[] { 0.0, 0.0, 1.0,
													Double.MIN_VALUE };
											gbl_pnlDatosCliente.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0,
													Double.MIN_VALUE };
											pnlDatosCliente.setLayout(gbl_pnlDatosCliente);
											{
												lblDNI = new JLabel(MessagesPrincipal.getString("Principal.lblDNI.text")); //$NON-NLS-1$
												GridBagConstraints gbc_lblDNI = new GridBagConstraints();
												gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
												gbc_lblDNI.anchor = GridBagConstraints.EAST;
												gbc_lblDNI.gridx = 0;
												gbc_lblDNI.gridy = 0;
												pnlDatosCliente.add(lblDNI, gbc_lblDNI);
											}
											{
												tfDNI_ClientePedido = new JTextField();
												GridBagConstraints gbc_tfDNI_ClientePedido = new GridBagConstraints();
												gbc_tfDNI_ClientePedido.insets = new Insets(0, 0, 5, 5);
												gbc_tfDNI_ClientePedido.fill = GridBagConstraints.HORIZONTAL;
												gbc_tfDNI_ClientePedido.gridx = 1;
												gbc_tfDNI_ClientePedido.gridy = 0;
												pnlDatosCliente.add(tfDNI_ClientePedido, gbc_tfDNI_ClientePedido);
												tfDNI_ClientePedido.setColumns(10);
											}
											{
												lblObservaciones = new JLabel(MessagesPrincipal.getString("Principal.lblObservaciones.text")); //$NON-NLS-1$
												GridBagConstraints gbc_lblObservaciones = new GridBagConstraints();
												gbc_lblObservaciones.gridwidth = 2;
												gbc_lblObservaciones.anchor = GridBagConstraints.WEST;
												gbc_lblObservaciones.insets = new Insets(0, 0, 5, 5);
												gbc_lblObservaciones.gridx = 0;
												gbc_lblObservaciones.gridy = 1;
												pnlDatosCliente.add(lblObservaciones, gbc_lblObservaciones);
											}
											{
												scrollPane = new JScrollPane();
												scrollPane.setHorizontalScrollBarPolicy(
														ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
												GridBagConstraints gbc_scrollPane = new GridBagConstraints();
												gbc_scrollPane.gridheight = 2;
												gbc_scrollPane.gridwidth = 3;
												gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
												gbc_scrollPane.fill = GridBagConstraints.BOTH;
												gbc_scrollPane.gridx = 0;
												gbc_scrollPane.gridy = 2;
												pnlDatosCliente.add(scrollPane, gbc_scrollPane);
												{
													tpObservaciones = new JTextPane();
													scrollPane.setViewportView(tpObservaciones);
												}
											}
										}
										{
											rdbtnCanjearPuntos = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnCanjearPuntos.text")); //$NON-NLS-1$
											buttonGroup_1.add(rdbtnCanjearPuntos);
											rdbtnCanjearPuntos.setSelected(true);
											GridBagConstraints gbc_rdbtnCanjearPuntos = new GridBagConstraints();
											gbc_rdbtnCanjearPuntos.anchor = GridBagConstraints.WEST;
											gbc_rdbtnCanjearPuntos.insets = new Insets(0, 0, 5, 5);
											gbc_rdbtnCanjearPuntos.gridx = 1;
											gbc_rdbtnCanjearPuntos.gridy = 2;
											pnlFormaPago.add(rdbtnCanjearPuntos, gbc_rdbtnCanjearPuntos);
										}
										{
											rdbtnTarjetaCredito = new JRadioButton(MessagesPrincipal.getString("Principal.rdbtnTarjetaCredito.text")); //$NON-NLS-1$
											buttonGroup_1.add(rdbtnTarjetaCredito);
											GridBagConstraints gbc_rdbtnTarjetaCredito = new GridBagConstraints();
											gbc_rdbtnTarjetaCredito.anchor = GridBagConstraints.NORTHWEST;
											gbc_rdbtnTarjetaCredito.insets = new Insets(0, 0, 0, 5);
											gbc_rdbtnTarjetaCredito.gridx = 1;
											gbc_rdbtnTarjetaCredito.gridy = 3;
											pnlFormaPago.add(rdbtnTarjetaCredito, gbc_rdbtnTarjetaCredito);
										}
									}
								}
								{
									pnlTecladoPedido = new JPanel();
									pnlTecladoPedido.setBorder(new LineBorder(new Color(0, 0, 0)));
									GridBagConstraints gbc_pnlTecladoPedido = new GridBagConstraints();
									gbc_pnlTecladoPedido.insets = new Insets(0, 0, 5, 5);
									gbc_pnlTecladoPedido.fill = GridBagConstraints.BOTH;
									gbc_pnlTecladoPedido.gridx = 1;
									gbc_pnlTecladoPedido.gridy = 3;
									pnlNuevoPedido.add(pnlTecladoPedido, gbc_pnlTecladoPedido);

									pnlTecladoPedido.setLayout(new GridLayout(3, 4, 0, 0));
									Font fuente = new Font("Verdana", Font.BOLD, 32);
									int cont = 0;
									for (int i = 0; i < 12; i++) {

										if (i == 3) {
											botonesTeclado[i] = new JButton("+");
										} else if (i == 7) {
											botonesTeclado[i] = new JButton("-");
										} else if (i == 11) {
											botonesTeclado[i] = new JButton("");
											botonesTeclado[i].setIcon(new ImageIcon(Principal.class
													.getResource("/Presentacion/Iconos/rubbish-bin32x32.png")));
										} else {
											botonesTeclado[i] = new JButton(String.valueOf(++cont));
										}
										pnlTecladoPedido.add(botonesTeclado[i]); // añadir cada componente al contenedor
										botonesTeclado[i].setFont(fuente);
										botonesTeclado[i].addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {

												// OBTENER PRODUCTO SELECCIONADO
												Producto productoSeleccionado = pnlContenedorProductos
														.getProductoSeleccionado();

												if (productoSeleccionado != null) {
													if (arg0.getActionCommand().equals("-")) {
														pnlProductosNuevoPedido.disminuirUno(productoSeleccionado);
													} else if (arg0.getActionCommand().equals("+")) {
														pnlProductosNuevoPedido.aumentarUno(productoSeleccionado);
													} else if (arg0.getActionCommand().equals("")) {
														pnlProductosNuevoPedido.insertarProducto(productoSeleccionado,
																0);
													} else {
														pnlProductosNuevoPedido.insertarProducto(productoSeleccionado,
																Integer.parseInt(arg0.getActionCommand()));
													}
													pnlContenedorProductos.borrarSelecionados();
												}

											}

										});
									}
								}
							}
							{
								pnlCancelarGuardar = new JPanel();
								pnlCancelarGuardar.setBorder(null);
								GridBagConstraints gbc_pnlCancelarGuardar = new GridBagConstraints();
								gbc_pnlCancelarGuardar.insets = new Insets(0, 0, 0, 5);
								gbc_pnlCancelarGuardar.fill = GridBagConstraints.BOTH;
								gbc_pnlCancelarGuardar.gridx = 3;
								gbc_pnlCancelarGuardar.gridy = 5;
								pnlNuevoPedido.add(pnlCancelarGuardar, gbc_pnlCancelarGuardar);
								GridBagLayout gbl_pnlCancelarGuardar = new GridBagLayout();
								gbl_pnlCancelarGuardar.columnWidths = new int[] { 0, 120, 120, 0 };
								gbl_pnlCancelarGuardar.rowHeights = new int[] { 25, 0 };
								gbl_pnlCancelarGuardar.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
								gbl_pnlCancelarGuardar.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
								pnlCancelarGuardar.setLayout(gbl_pnlCancelarGuardar);
								btnCancelarPedido = new JButton(MessagesPrincipal.getString("Principal.btnCancelarPedido.text")); //$NON-NLS-1$
								GridBagConstraints gbc_btnCancelarPedido = new GridBagConstraints();
								gbc_btnCancelarPedido.fill = GridBagConstraints.BOTH;
								gbc_btnCancelarPedido.insets = new Insets(0, 0, 0, 5);
								gbc_btnCancelarPedido.gridx = 1;
								gbc_btnCancelarPedido.gridy = 0;
								pnlCancelarGuardar.add(btnCancelarPedido, gbc_btnCancelarPedido);
								btnCancelarPedido.addActionListener(new BtnCancelarPedidoActionListener());
								btnCancelarPedido.setIcon(new ImageIcon(
										Principal.class.getResource("/Presentacion/Iconos/cancel16x16.png")));
								btnConfirmarPedido = new JButton(MessagesPrincipal.getString("Principal.btnConfirmarPedido.text")); //$NON-NLS-1$
								GridBagConstraints gbc_btnConfirmarPedido = new GridBagConstraints();
								gbc_btnConfirmarPedido.fill = GridBagConstraints.BOTH;
								gbc_btnConfirmarPedido.gridx = 2;
								gbc_btnConfirmarPedido.gridy = 0;
								pnlCancelarGuardar.add(btnConfirmarPedido, gbc_btnConfirmarPedido);
								btnConfirmarPedido.addActionListener(new BtnConfirmarPedidoActionListener());
								btnConfirmarPedido.setIcon(new ImageIcon(
										Principal.class.getResource("/Presentacion/Iconos/save16x16.png")));
							}
						}
					}
					{
						panelClientes = new JPanel();
						tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabbedPaneClientesVIP.text"), null, panelClientes, null);
						GridBagLayout gbl_panelClientes = new GridBagLayout();
						gbl_panelClientes.columnWidths = new int[] { 15, 104, 223, 30, 150, 151, 139, 0, 2 };
						gbl_panelClientes.rowHeights = new int[] { 54, 578, 15, 2 };
						gbl_panelClientes.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0,
								Double.MIN_VALUE };
						gbl_panelClientes.rowWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
						panelClientes.setLayout(gbl_panelClientes);
						{
							lblBsquedaPorDni = new JLabel(MessagesPrincipal.getString("Principal.lblBsquedaPorDni.text")); //$NON-NLS-1$
							lblBsquedaPorDni.setHorizontalTextPosition(SwingConstants.CENTER);
							lblBsquedaPorDni.setHorizontalAlignment(SwingConstants.CENTER);
							GridBagConstraints gbc_lblBsquedaPorDni = new GridBagConstraints();
							gbc_lblBsquedaPorDni.fill = GridBagConstraints.HORIZONTAL;
							gbc_lblBsquedaPorDni.insets = new Insets(0, 0, 5, 5);
							gbc_lblBsquedaPorDni.gridx = 1;
							gbc_lblBsquedaPorDni.gridy = 0;
							panelClientes.add(lblBsquedaPorDni, gbc_lblBsquedaPorDni);
						}
						{
							tfDNI = new JTextField();
							tfDNI.addKeyListener(new TfDNIKeyListener());

							GridBagConstraints gbc_tfDNI = new GridBagConstraints();
							gbc_tfDNI.insets = new Insets(0, 0, 5, 5);
							gbc_tfDNI.fill = GridBagConstraints.HORIZONTAL;
							gbc_tfDNI.gridx = 2;
							gbc_tfDNI.gridy = 0;
							panelClientes.add(tfDNI, gbc_tfDNI);
							tfDNI.setColumns(10);
						}
						{
							pnlBotonesCliente = new JPanel();
							GridBagConstraints gbc_pnlBotonesCliente = new GridBagConstraints();
							gbc_pnlBotonesCliente.gridwidth = 3;
							gbc_pnlBotonesCliente.insets = new Insets(0, 0, 5, 5);
							gbc_pnlBotonesCliente.fill = GridBagConstraints.BOTH;
							gbc_pnlBotonesCliente.gridx = 4;
							gbc_pnlBotonesCliente.gridy = 0;
							panelClientes.add(pnlBotonesCliente, gbc_pnlBotonesCliente);
							pnlBotonesCliente.setLayout(new CardLayout(0, 0));
							{
								pnlAniadirEditarEliminar = new JPanel();
								pnlBotonesCliente.add(pnlAniadirEditarEliminar, "pnlAniadirEditarEliminar");
								{
									btnAniadirCliente = new JButton(MessagesPrincipal.getString("Principal.btnAniadirCliente.text")); //$NON-NLS-1$
									btnAniadirCliente.setToolTipText(MessagesPrincipal.getString("Principal.btnAniadirCliente.toolTipText")); //$NON-NLS-1$
									btnAniadirCliente.setIcon(new ImageIcon(
											Principal.class.getResource("/Presentacion/Iconos/add-user-button.png")));
									btnAniadirCliente.addActionListener(new BtnAniadirClienteActionListener());
									pnlAniadirEditarEliminar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
									pnlAniadirEditarEliminar.add(btnAniadirCliente);
								}
								{
									btnEditarCliente = new JButton(MessagesPrincipal.getString("Principal.btnEditarCliente.text")); //$NON-NLS-1$
									btnEditarCliente.setToolTipText(MessagesPrincipal.getString("Principal.btnEditarCliente.toolTipText")); //$NON-NLS-1$
									btnEditarCliente.setIcon(new ImageIcon(Principal.class
											.getResource("/Presentacion/Iconos/pencil-edit-button.png")));
									btnEditarCliente.addActionListener(new BtnEditarClienteActionListener());
									pnlAniadirEditarEliminar.add(btnEditarCliente);
								}
								{
									btnEliminarCliente = new JButton(MessagesPrincipal.getString("Principal.btnEliminarCliente.text")); //$NON-NLS-1$
									btnEliminarCliente.setToolTipText(MessagesPrincipal.getString("Principal.btnEliminarCliente.toolTipText")); //$NON-NLS-1$
									btnEliminarCliente.setIcon(new ImageIcon(
											Principal.class.getResource("/Presentacion/Iconos/rubbish-bin.png")));
									btnEliminarCliente.addActionListener(new BtnEliminarClienteActionListener());
									pnlAniadirEditarEliminar.add(btnEliminarCliente);
								}
							}
							{
								pnlGuardarCancelar = new JPanel();
								pnlBotonesCliente.add(pnlGuardarCancelar, "pnlGuardarCancelar");
								pnlGuardarCancelar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
								{
									btnGuardarCliente = new JButton(MessagesPrincipal.getString("Principal.btnGuardarCliente.text")); //$NON-NLS-1$
									btnGuardarCliente.addActionListener(new BtnGuardarClienteActionListener());
									pnlGuardarCancelar.add(btnGuardarCliente);
								}
								{
									btnCancelarCliente = new JButton(MessagesPrincipal.getString("Principal.btnCancelarCliente.text")); //$NON-NLS-1$
									btnCancelarCliente.addActionListener(new BtnCancelarClienteActionListener());
									pnlGuardarCancelar.add(btnCancelarCliente);
								}
							}
						}

						{
							pnlDatosClientes = new panelFormularioCliente(frmTpvRestaurante);
							pnlDatosClientes.setComponentesEditables(false, true);
							pnlDatosClientes.setToolTipText(MessagesPrincipal.getString("Principal.pnlDatosClientes.toolTipText")); //$NON-NLS-1$
							pnlDatosClientes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
							GridBagConstraints gbc_pnlDatosClientes = new GridBagConstraints();
							gbc_pnlDatosClientes.gridwidth = 3;
							gbc_pnlDatosClientes.insets = new Insets(0, 0, 5, 5);
							gbc_pnlDatosClientes.fill = GridBagConstraints.VERTICAL;
							gbc_pnlDatosClientes.gridx = 4;
							gbc_pnlDatosClientes.gridy = 1;
							panelClientes.add(pnlDatosClientes, gbc_pnlDatosClientes);
						}

						{
							pnlListadoClientes = new JPanel();
							pnlListadoClientes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
							GridBagConstraints gbc_pnlListadoClientes = new GridBagConstraints();
							gbc_pnlListadoClientes.gridwidth = 2;
							gbc_pnlListadoClientes.insets = new Insets(0, 0, 5, 5);
							gbc_pnlListadoClientes.fill = GridBagConstraints.BOTH;
							gbc_pnlListadoClientes.gridx = 1;
							gbc_pnlListadoClientes.gridy = 1;
							panelClientes.add(pnlListadoClientes, gbc_pnlListadoClientes);
							pnlListadoClientes.setLayout(new BorderLayout(0, 0));
							{
								scrollPaneListadoClientes = new JScrollPane();
								scrollPaneListadoClientes
										.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
								scrollPaneListadoClientes
										.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
								pnlListadoClientes.add(scrollPaneListadoClientes);
								{
									panelContenedorClientes = new panelContenedorClientes(this.cargarClientes(),
											pnlDatosClientes);
									scrollPaneListadoClientes.setViewportView(panelContenedorClientes);
								}
							}
						}

					}
					{
						panelProductos = new JPanel();
						tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabbedPaneProductos.text"), null, panelProductos, null);
						panelProductos.setLayout(new BorderLayout(0, 0));
						{
							panelArbol = new JPanel();
							panelProductos.add(panelArbol, BorderLayout.EAST);
							panelArbol.setLayout(new BorderLayout(0, 0));
							{
								scrollPaneArbol = new JScrollPane();
								panelArbol.add(scrollPaneArbol, BorderLayout.CENTER);
								{
									tree = new JTree();
									tree.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
									tree.addTreeSelectionListener(new TreeTreeSelectionListener());
									tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Productos") {
										{
											DefaultMutableTreeNode node_1;
											node_1 = new DefaultMutableTreeNode("Comidas");
											node_1.add(new DefaultMutableTreeNode("Hamburguesas"));
											node_1.add(new DefaultMutableTreeNode("Pizzas"));
											node_1.add(new DefaultMutableTreeNode("Bocadillos"));
											node_1.add(new DefaultMutableTreeNode("Sandwiches"));
											node_1.add(new DefaultMutableTreeNode("Hot dogs"));
											node_1.add(new DefaultMutableTreeNode("Ensaladas"));
											node_1.add(new DefaultMutableTreeNode("Raciones"));
											add(node_1);
											node_1 = new DefaultMutableTreeNode("Bebidas");
											node_1.add(new DefaultMutableTreeNode("Agua"));
											node_1.add(new DefaultMutableTreeNode("Refrescos"));
											node_1.add(new DefaultMutableTreeNode("Batidos"));
											node_1.add(new DefaultMutableTreeNode("Cafes"));
											add(node_1);
										}
									}));
									tree.setPreferredSize(new Dimension(175, 76));
									tree.setMaximumSize(new Dimension(150, 76));
									tree.setCellRenderer(new RenderizadoArbol());
									scrollPaneArbol.setViewportView(tree);

								}
							}
						}
						{
							panelBotonesProductos = new JPanel();
							panelProductos.add(panelBotonesProductos, BorderLayout.NORTH);
							GridBagLayout gbl_panelBotonesProductos = new GridBagLayout();
							gbl_panelBotonesProductos.columnWidths = new int[] { 127, 92, 0, 0, 148, 0, 0, 0, 0 };
							gbl_panelBotonesProductos.rowHeights = new int[] { 29, 0 };
							gbl_panelBotonesProductos.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
									0.0, Double.MIN_VALUE };
							gbl_panelBotonesProductos.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
							panelBotonesProductos.setLayout(gbl_panelBotonesProductos);
							{
								btnAnadirProducto = new JButton(MessagesPrincipal.getString("Principal.btnAnadirProducto.text")); //$NON-NLS-1$
								btnAnadirProducto.setToolTipText(MessagesPrincipal.getString("Principal.btnAnadirProducto.toolTipText")); //$NON-NLS-1$
								btnAnadirProducto.addActionListener(new BtnAnadirProductoActionListener());
								GridBagConstraints gbc_btnAnadirProducto = new GridBagConstraints();
								gbc_btnAnadirProducto.insets = new Insets(0, 0, 0, 5);
								gbc_btnAnadirProducto.anchor = GridBagConstraints.NORTH;
								gbc_btnAnadirProducto.gridx = 1;
								gbc_btnAnadirProducto.gridy = 0;
								panelBotonesProductos.add(btnAnadirProducto, gbc_btnAnadirProducto);
							}
							{
								btnEditarProducto = new JButton(MessagesPrincipal.getString("Principal.btnEditarProducto.text")); //$NON-NLS-1$
								btnEditarProducto.setToolTipText(MessagesPrincipal.getString("Principal.btnEditarProducto.toolTipText")); //$NON-NLS-1$
								btnEditarProducto.addActionListener(new BtnEditarProductoActionListener());
								GridBagConstraints gbc_btnEditarProducto = new GridBagConstraints();
								gbc_btnEditarProducto.insets = new Insets(0, 0, 0, 5);
								gbc_btnEditarProducto.gridx = 2;
								gbc_btnEditarProducto.gridy = 0;
								panelBotonesProductos.add(btnEditarProducto, gbc_btnEditarProducto);
							}
							{
								btnBorrarProducto = new JButton(MessagesPrincipal.getString("Principal.btnBorrarProducto.text")); //$NON-NLS-1$
								btnBorrarProducto.addActionListener(new BtnBorrarProductoActionListener());
								btnBorrarProducto.setToolTipText(MessagesPrincipal.getString("Principal.btnBorrarProducto.toolTipText")); //$NON-NLS-1$
								GridBagConstraints gbc_btnBorrarProducto = new GridBagConstraints();
								gbc_btnBorrarProducto.insets = new Insets(0, 0, 0, 5);
								gbc_btnBorrarProducto.gridx = 3;
								gbc_btnBorrarProducto.gridy = 0;
								panelBotonesProductos.add(btnBorrarProducto, gbc_btnBorrarProducto);
							}
							{
								btnVistaMiniatura = new JButton(MessagesPrincipal.getString("Principal.btnVistaMiniatura.text")); //$NON-NLS-1$
								btnVistaMiniatura.setToolTipText(MessagesPrincipal.getString("Principal.btnVistaMiniatura.toolTipText")); //$NON-NLS-1$
								if (!SO.equals("W")) {
									btnVistaMiniatura.setOpaque(false);
									btnVistaMiniatura.setSelected(false);

								} else {
									btnVistaMiniatura.setOpaque(true);
									btnVistaMiniatura.setSelected(false);
									btnVistaMiniatura.setBackground(colorDefectoBotones);

								}
								btnVistaMiniatura.addActionListener(new BtnVistaMiniaturaActionListener());

								// btnVistaMiniatura.setForeground(Color.WHITE);
								GridBagConstraints gbc_btnVistaMiniatura = new GridBagConstraints();
								gbc_btnVistaMiniatura.insets = new Insets(0, 0, 0, 5);
								gbc_btnVistaMiniatura.gridx = 5;
								gbc_btnVistaMiniatura.gridy = 0;
								panelBotonesProductos.add(btnVistaMiniatura, gbc_btnVistaMiniatura);
							}
							{
								btnVistaDetalles = new JButton(MessagesPrincipal.getString("Principal.btnVistaDetalles.text")); //$NON-NLS-1$
								btnVistaDetalles.setToolTipText(MessagesPrincipal.getString("Principal.btnVistaDetalles.toolTipText")); //$NON-NLS-1$

								if (!SO.equals("W")) {
									btnVistaDetalles.setOpaque(false);
									btnVistaDetalles.setSelected(true);
								} else {
									btnVistaDetalles.setOpaque(true);
									btnVistaDetalles.setSelected(true);
									btnVistaDetalles.setBackground(colorBotonSeleccionado);
								}
								btnVistaDetalles.setForeground(Color.WHITE);
								btnVistaDetalles.addActionListener(new BtnVistaDetallesActionListener());
								GridBagConstraints gbc_btnVistaDetalles = new GridBagConstraints();
								gbc_btnVistaDetalles.insets = new Insets(0, 0, 0, 5);
								gbc_btnVistaDetalles.gridx = 6;
								gbc_btnVistaDetalles.gridy = 0;
								panelBotonesProductos.add(btnVistaDetalles, gbc_btnVistaDetalles);
							}
						}
						{
							PanelContenedorProductos = new JPanel();
							panelProductos.add(PanelContenedorProductos, BorderLayout.CENTER);
							PanelContenedorProductos.setLayout(new CardLayout(0, 0));
							{
								panelProductoDetalles = new panelContenedorProdDetll();
								PanelContenedorProductos.add(panelProductoDetalles, "panelProductosDetalle");
							}
							{
								panelProductosMiniatura = new panelContenedorProdMin();
								PanelContenedorProductos.add(panelProductosMiniatura, "panelProductosMiniatura");
							}

						}
					}
					{
						panelOfertas = new JPanel();
						tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabbedPaneOfertas.text"), null, panelOfertas, null);
						panelOfertas.setLayout(new BorderLayout(0, 0));
						{
							panelElimitarAnadirOferta = new JPanel();
							panelOfertas.add(panelElimitarAnadirOferta, BorderLayout.NORTH);
							GridBagLayout gbl_panelElimitarAnadirOferta = new GridBagLayout();
							gbl_panelElimitarAnadirOferta.columnWidths = new int[] { 15, 0, 15, 123, 15, 1 };
							gbl_panelElimitarAnadirOferta.rowHeights = new int[] { 15, 0, 0, 15, 5 };
							gbl_panelElimitarAnadirOferta.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0,
									Double.MIN_VALUE };
							gbl_panelElimitarAnadirOferta.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0,
									Double.MIN_VALUE };
							panelElimitarAnadirOferta.setLayout(gbl_panelElimitarAnadirOferta);
							{
								pnlNuevaOferta = new JPanel();
								pnlNuevaOferta.setBorder(
										new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesPrincipal.getString("Principal.pnlNuevaOferta.borderTitle"), //$NON-NLS-2$
												TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
								GridBagConstraints gbc_pnlNuevaOferta = new GridBagConstraints();
								gbc_pnlNuevaOferta.insets = new Insets(0, 0, 5, 5);
								gbc_pnlNuevaOferta.fill = GridBagConstraints.BOTH;
								gbc_pnlNuevaOferta.gridheight = 2;
								gbc_pnlNuevaOferta.gridx = 3;
								gbc_pnlNuevaOferta.gridy = 1;
								panelElimitarAnadirOferta.add(pnlNuevaOferta, gbc_pnlNuevaOferta);
								GridBagLayout gbl_pnlNuevaOferta = new GridBagLayout();
								gbl_pnlNuevaOferta.columnWidths = new int[] { 123, 191, 35, 0, 0, 0 };
								gbl_pnlNuevaOferta.rowHeights = new int[] { 0, 0, 0, 0, 0 };
								gbl_pnlNuevaOferta.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0,
										Double.MIN_VALUE };
								gbl_pnlNuevaOferta.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
								pnlNuevaOferta.setLayout(gbl_pnlNuevaOferta);
								{
									lblProducto = new JLabel(MessagesPrincipal.getString("Principal.lblProducto.text")); //$NON-NLS-1$
									GridBagConstraints gbc_lblProducto = new GridBagConstraints();
									gbc_lblProducto.anchor = GridBagConstraints.EAST;
									gbc_lblProducto.insets = new Insets(0, 0, 5, 5);
									gbc_lblProducto.gridx = 0;
									gbc_lblProducto.gridy = 0;
									pnlNuevaOferta.add(lblProducto, gbc_lblProducto);
								}
								{
									cbProductoOferta = new JComboBox();
									Producto pr = new Producto();
									pr.readAll();
									ArrayList<String> productos = new ArrayList<String>();
									for (Producto p : pr.getProductoDAO().getListaProductos()) {
										productos.add(p.getNombre());
									}
									String[] productosStr = new String[productos.size()];
									productosStr = productos.toArray(productosStr);
									cbProductoOferta.setModel(new DefaultComboBoxModel<String>(productosStr));

									GridBagConstraints gbc_cbProductoOferta = new GridBagConstraints();
									gbc_cbProductoOferta.fill = GridBagConstraints.HORIZONTAL;
									gbc_cbProductoOferta.insets = new Insets(0, 0, 5, 5);
									gbc_cbProductoOferta.gridx = 1;
									gbc_cbProductoOferta.gridy = 0;
									pnlNuevaOferta.add(cbProductoOferta, gbc_cbProductoOferta);
								}
								{
									lblTipoDescuento = new JLabel(MessagesPrincipal.getString("Principal.lblTipoDescuento.text")); //$NON-NLS-1$
									GridBagConstraints gbc_lblTipoDescuento = new GridBagConstraints();
									gbc_lblTipoDescuento.anchor = GridBagConstraints.EAST;
									gbc_lblTipoDescuento.insets = new Insets(0, 0, 5, 5);
									gbc_lblTipoDescuento.gridx = 0;
									gbc_lblTipoDescuento.gridy = 1;
									pnlNuevaOferta.add(lblTipoDescuento, gbc_lblTipoDescuento);
								}
								{
									cbTipoDescuento = new JComboBox();
									cbTipoDescuento.setModel(new DefaultComboBoxModel(new String[] {"10", "20", "25", "30", "40", "50"}));
									cbTipoDescuento.setBackground(Color.WHITE);
									GridBagConstraints gbc_cbTipoDescuento = new GridBagConstraints();
									gbc_cbTipoDescuento.fill = GridBagConstraints.HORIZONTAL;
									gbc_cbTipoDescuento.insets = new Insets(0, 0, 5, 5);
									gbc_cbTipoDescuento.gridx = 1;
									gbc_cbTipoDescuento.gridy = 1;
									pnlNuevaOferta.add(cbTipoDescuento, gbc_cbTipoDescuento);
								}
								{
									lblPromocionValida = new JLabel(MessagesPrincipal.getString("Principal.lblPromocionValida.text")); //$NON-NLS-1$
									GridBagConstraints gbc_lblPromocionValida = new GridBagConstraints();
									gbc_lblPromocionValida.anchor = GridBagConstraints.EAST;
									gbc_lblPromocionValida.insets = new Insets(0, 0, 5, 5);
									gbc_lblPromocionValida.gridx = 0;
									gbc_lblPromocionValida.gridy = 2;
									pnlNuevaOferta.add(lblPromocionValida, gbc_lblPromocionValida);
								}
								{
									tfFechaOferta = new JTextField();
									formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
								}
								{
									dateChooser = new JDateChooser();
									dateChooser.setBackground(Color.LIGHT_GRAY);
									dateChooser.setDateFormatString(MessagesPrincipal.getString("Principal.dateChooser.dateFormatString")); //$NON-NLS-1$
									dateChooser.getJCalendar().setMinSelectableDate(new Date());

									GridBagConstraints gbc_dateChooser = new GridBagConstraints();
									gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
									gbc_dateChooser.fill = GridBagConstraints.BOTH;
									gbc_dateChooser.gridx = 1;
									gbc_dateChooser.gridy = 2;
									pnlNuevaOferta.add(dateChooser, gbc_dateChooser);
								}
								{
									btnGuardar = new JButton(MessagesPrincipal.getString("Principal.btnGuardar.text")); //$NON-NLS-1$
									btnGuardar.addActionListener(new BtnGuardarActionListener());
									GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
									gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
									gbc_btnGuardar.gridx = 3;
									gbc_btnGuardar.gridy = 3;
									pnlNuevaOferta.add(btnGuardar, gbc_btnGuardar);
									btnGuardar.setIcon(new ImageIcon(
											Principal.class.getResource("/Presentacion/Iconos/save16x16.png")));
								}
								{
									btnCancelar = new JButton(MessagesPrincipal.getString("Principal.btnCancelar.text")); //$NON-NLS-1$
									GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
									gbc_btnCancelar.gridx = 4;
									gbc_btnCancelar.gridy = 3;
									pnlNuevaOferta.add(btnCancelar, gbc_btnCancelar);
									btnCancelar.setIcon(new ImageIcon(
											Principal.class.getResource("/Presentacion/Iconos/cancel16x16.png")));
								}
							}
							{
								btnEliminarOferta = new JButton(MessagesPrincipal.getString("Principal.btnEliminarOferta.text")); //$NON-NLS-1$
								btnEliminarOferta.addActionListener(new BtnEliminarOfertaActionListener());
								btnEliminarOferta.setIcon(new ImageIcon(
										Principal.class.getResource("/Presentacion/Iconos/rubbish-bin.png")));
								GridBagConstraints gbc_btnEliminarOferta = new GridBagConstraints();
								gbc_btnEliminarOferta.insets = new Insets(0, 0, 5, 5);
								gbc_btnEliminarOferta.gridx = 1;
								gbc_btnEliminarOferta.gridy = 2;
								panelElimitarAnadirOferta.add(btnEliminarOferta, gbc_btnEliminarOferta);
							}
						}
						{
							panelContenedorOferta = new panelContenedorOfertas();
							panelOfertas.add(panelContenedorOferta, BorderLayout.CENTER);
							Oferta oferta = new Oferta();
							oferta.readAll();
							panelContenedorOferta.cargarPaneles(oferta.getOfertaDAO().getListaOfertas());

						}
					}
					{
						panelEntregasADomicilio = new panelEnvioDomicilio();
						tabbedPane.addTab(MessagesPrincipal.getString("Principal.tabbedPaneEntrega.text"), null, panelEntregasADomicilio, null);
					}
				}
			}
		}

		cargarDatosTablaPedidos();

		Producto producto = new Producto();
		boolean correcto = producto.readAll();
		if (correcto) {
			panelProductosMiniatura.cargarPaneles(producto.getProductoDAO().getListaProductos());
			panelProductoDetalles.cargarPaneles(producto.getProductoDAO().getListaProductos());
		}
	}

	private class BtnEntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			entrar();
		}

	}

	private void entrar() {
		String password = pwdContrasea.getText();
		String user = txtUser.getText();
		usuario = new Usuario();
		usuario.setDNI(user);
		usuario.setPass(password);

		if (usuario.login()) {
			((CardLayout) frmTpvRestaurante.getContentPane().getLayout()).show(frmTpvRestaurante.getContentPane(),
					"panelAplicacion");
			panelDatosUser.cargarDatos(usuario);
			Date date = new Date();
			DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
			usuario.setUltimoAcceso(ultimoAcceso.format(date));
			usuario.update();
			lblErrorLogin.setVisible(false);

			if (!chckbxRecordarPass.isSelected()) {
				txtUser.setText("");
				pwdContrasea.setText("Contraseña");
			}

		} else {
			lblErrorLogin.setVisible(true);
		}
	}

	private class BtnVistaDetallesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnAnadirProducto.setEnabled(true);
			btnEditarProducto.setEnabled(true);
			btnBorrarProducto.setEnabled(true);
			if (btnVistaMiniatura.isSelected() || btnVistaMiniatura.getBackground().equals(colorBotonSeleccionado)) {
				if (SO.equals("W")) {
					btnVistaDetalles.setBackground(colorBotonSeleccionado);
					btnVistaMiniatura.setBackground(colorDefectoBotones);
				}

				btnVistaDetalles.setSelected(true);
				btnVistaMiniatura.setSelected(false);

				btnVistaDetalles.setForeground(Color.WHITE);
				btnVistaMiniatura.setForeground(Color.BLACK);

				
			}
			((CardLayout) PanelContenedorProductos.getLayout()).show(PanelContenedorProductos,
					"panelProductosDetalle");
		}
	}

	private class BtnVistaMiniaturaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btnAnadirProducto.setEnabled(false);
			btnEditarProducto.setEnabled(false);
			btnBorrarProducto.setEnabled(false);
			if (btnVistaDetalles.isSelected() || btnVistaDetalles.getForeground().equals(colorBotonSeleccionado)) {

				if (SO.equals("W")) {
					btnVistaMiniatura.setBackground(colorBotonSeleccionado);
					btnVistaDetalles.setBackground(colorDefectoBotones);
				}

				btnVistaMiniatura.setSelected(true);
				btnVistaDetalles.setSelected(false);

				btnVistaMiniatura.setForeground(Color.WHITE);
				btnVistaDetalles.setForeground(Color.BLACK);

				
			}
			((CardLayout) PanelContenedorProductos.getLayout()).show(PanelContenedorProductos,
					"panelProductosMiniatura");

		}
	}

	private class BtSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Date date = new Date();
			DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
			usuario.setUltimoAcceso(ultimoAcceso.format(date));
			// finaliza la ejecución de la aplicación
			System.exit(0);
		}
	}

	private class BtnCerrarSesionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			((CardLayout) frmTpvRestaurante.getContentPane().getLayout()).show(frmTpvRestaurante.getContentPane(),
					"panelLogin");
		}
	}

	private class FrameContentPaneComponentListener extends ComponentAdapter {
		@Override
		public void componentResized(ComponentEvent e) {
			int centroX = (int) panelLogin.getBounds().getCenterX();
			int centroY = (int) panelLogin.getBounds().getCenterY();
			int width = panelIniciarSesion.getWidth();
			int height = panelIniciarSesion.getHeight();

			panelIniciarSesion.setBounds(centroX - (width / 2), centroY - (height / 2), width, height);

		}
	}

	private class BtnAnadirProductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			FrameAnadirProducto anadir = new FrameAnadirProducto(panelPestanias.getBounds(), panelProductoDetalles, 1);
			anadir.setVisible(true);
		}
	}

	private class TreeTreeSelectionListener implements TreeSelectionListener {
		public void valueChanged(TreeSelectionEvent e) {

			nodoSeleccionado = (e.getPath().getLastPathComponent()).toString();
			Producto producto = new Producto();
			boolean correcto = false;
			try {

				panelProductosMiniatura.clean();
				panelProductoDetalles.clean();
				switch (nodoSeleccionado) {

				case "Productos":
					correcto = producto.readAll();
					break;

				case "Comidas":
				case "Bebidas":
					correcto = producto.readCategoria(nodoSeleccionado);
					break;

				default:
					correcto = producto.readSubtipo(nodoSeleccionado);
					break;

				}
				if (correcto) {
					panelProductosMiniatura.cargarPaneles(producto.getProductoDAO().getListaProductos());
					panelProductoDetalles.cargarPaneles(producto.getProductoDAO().getListaProductos());
				}
			} catch (Exception arg0) {
				System.out.println("Error");
				arg0.printStackTrace();

			}

		}
	}

	private class MiFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 250, 210));
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 250, 250));
		}
	}

	private class TfDNIKeyListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			panelContenedorClientes.filtradoClientes(tfDNI.getText());
		}
	}

	private class BtnAniadirClienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			pnlDatosClientes.borrarTodo();
			pnlDatosClientes.setComponentesEditables(true, true);
			((CardLayout) pnlBotonesCliente.getLayout()).show(pnlBotonesCliente, "pnlGuardarCancelar");
			editar_guardar_user = 1; // modo crear cliente

		}
	}

	private class BtnEditarClienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			pnlDatosClientes.setComponentesEditables(true, false);

			((CardLayout) pnlBotonesCliente.getLayout()).show(pnlBotonesCliente, "pnlGuardarCancelar");
			editar_guardar_user = 2; // modo editar cliente
		}
	}

	private class BtnEliminarClienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null,
					MessagesPrincipal.getString("Principal.JOptionPaneEliminarCliente.text"),
					MessagesPrincipal.getString("Principal.JOptionPaneConfirmarEliminacionCliente.text"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			// System.out.println(resp);
			if (resp == 0) {
				Cliente c;
				try {
					c = pnlDatosClientes.obtenerDatosCliente();
					c.delete();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				panelContenedorClientes.cargarPaneles();
				lblBsquedaPorDni.setText("");
				pnlDatosClientes.borrarTodo();
			}

		}
	}

	private class BtnGuardarClienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (pnlDatosClientes.comprobarCampos()) {

				Cliente c;
				try {
					c = pnlDatosClientes.obtenerDatosCliente();
					if (editar_guardar_user == 1) { // Modo crear nuevo usuario
						if (c.insert()) {

							JOptionPane.showMessageDialog(null, c.getDNI() + MessagesPrincipal.getString("Principal.JOptionPaneHaSidoAnadido"));
							pnlDatosClientes.setComponentesEditables(false, true);
							((CardLayout) pnlBotonesCliente.getLayout()).show(pnlBotonesCliente,
									"pnlAniadirEditarEliminar");
							editar_guardar_user = 0;
							panelContenedorClientes.cargarPaneles();
							lblBsquedaPorDni.setText("");

						} else {
							JOptionPane.showMessageDialog(null,
									MessagesPrincipal.getString("Principal.JOptionPaneErrorBaseDeDatos"), "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					} else if (editar_guardar_user == 2) { // Modo editar usuario
						if (c.update()) {
							JOptionPane.showMessageDialog(null,"Cliente " +c.getDNI() + MessagesPrincipal.getString("Principal.JOptionPaneActualizadoBien"));
							pnlDatosClientes.setComponentesEditables(false, true);
							pnlDatosClientes.setComponentesEditables(false, false);
							editar_guardar_user = 0;
							((CardLayout) pnlBotonesCliente.getLayout()).show(pnlBotonesCliente,
									"pnlAniadirEditarEliminar");
							panelContenedorClientes.clean();
							panelContenedorClientes.cargarPaneles();
							lblBsquedaPorDni.setText("");
						} else {
							JOptionPane.showMessageDialog(null,
									MessagesPrincipal.getString("Principal.JOptionPaneActualizadoMal"), "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} else {
				JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneTodosLosDatos"),
						"Aviso", JOptionPane.WARNING_MESSAGE);
			}
			panelContenedorClientes.cargarPaneles();
			pnlDatosClientes.borrarTodo();

		}
	}

	private class BtnCancelarClienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			pnlDatosClientes.setComponentesEditables(false, true);
			pnlDatosClientes.borrarTodo();
			((CardLayout) pnlBotonesCliente.getLayout()).show(pnlBotonesCliente, "pnlAniadirEditarEliminar");
		}
	}

	private class BtnEditarProductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				Producto producto = panelProductoDetalles.getProductoSelected();
				if (producto == null) {
					System.out.println("NULO");
					JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneNoSeleccionProducto"), "Error",
							JOptionPane.WARNING_MESSAGE, null);
				} else {
					FrameAnadirProducto editar = new FrameAnadirProducto(panelPestanias.getBounds(),
							panelProductoDetalles, 2);
					editar.cargarDatos(producto);
					editar.setVisible(true);

				}
			} catch (Exception arg0) {
				JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneNoSeleccionProducto"), "Error",
						JOptionPane.WARNING_MESSAGE, null);

			}

		}
	}

	private class FrmTpvRestauranteKeyListener extends KeyAdapter {
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

	private class PanelLoginKeyListener extends KeyAdapter {
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

	private class PanelIniciarSesionKeyListener extends KeyAdapter {
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

	private class PwdContraseaKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 10) {
				entrar();
			}
		}
	}

	private class BtnVerPassActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			if (verPass) {
				// Ocultar la contraseña
				pwdContrasea.setEchoChar('\u2022');
				btnVerPass.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/eye.png")));
				btnVerPass.setToolTipText("Mostrar Constraseña");
				verPass = false;
			} else {
				// Mostrar la contraseña
				pwdContrasea.setEchoChar((char) 0);
				btnVerPass.setIcon(
						new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/eye_slashed24x24.png")));
				btnVerPass.setToolTipText("Ocultar Constraseña");
				verPass = true;
			}
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

	private class BtnNuevoPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			pnlProductosNuevoPedido.borrarListado();
			((CardLayout) panelPedidos.getLayout()).show(panelPedidos, "pnlNuevoPedido");
		}
	}

	private class BtnCancelarPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneCancelarPedido"),
					MessagesPrincipal.getString("Principal.JOptionPanePerderanCambios"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				pnlProductosNuevoPedido.borrarListado();
				((CardLayout) panelPedidos.getLayout()).show(panelPedidos, "pnlVistaPedidos");
			}
		}
	}

	private class BtnConfirmarPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ArrayList<ProductoCantidad> listadoProductos = pnlProductosNuevoPedido.getListadoProductos();

			if (listadoProductos.size() < 1) {
				JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneNingunProducto"), MessagesPrincipal.getString("Principal.JOptionPaneInformacion"),
						JOptionPane.WARNING_MESSAGE);

			} else {
				Pedido nuevoPedido = new Pedido();
				nuevoPedido.setNumeroPedido(nuevoPedido.getGestorPedido().lastID());
				nuevoPedido.setPrecioTotal(pnlProductosNuevoPedido.getImporteTotal());
				nuevoPedido.setEstado("En elaboración");
				nuevoPedido.setDniCliente(tfDNI_ClientePedido.getText());
				nuevoPedido.setNombreVendedor(usuario.getNombre());
				// Fecha del pedido
				Date date = new Date();
				DateFormat fechaPedido = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				nuevoPedido.setFechaPedido(fechaPedido.format(date));
				nuevoPedido.setObservaciones(tpObservaciones.getText());
				nuevoPedido.setListadoProductos(listadoProductos);

				if (nuevoPedido.insert()) {
					JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPanePedidoCorrecto"));
					// Añadir a la tabla de pedidos
					ModeloTablaPedidos modeloTablaPedidos = (ModeloTablaPedidos) tablePedidos.getModel();
					modeloTablaPedidos.anadirFila(nuevoPedido);
					tablePedidos.repaint();
					tablePedidos.revalidate();
					((CardLayout) panelPedidos.getLayout()).show(panelPedidos, "pnlVistaPedidos");
				} else { // Error al insertar en BBDD
					JOptionPane.showMessageDialog(null,
							MessagesPrincipal.getString("Principal.JOptionPaneErrorBBDDsistema"), "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}

		}
	}

	private class RdbtnRecogidaTiendaItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent arg0) {
			if (arg0.getStateChange() == ItemEvent.SELECTED) {
				((CardLayout) pnl_InfoEntrega.getLayout()).show(pnl_InfoEntrega, "pnlDatosRecogida");

			} else {
				((CardLayout) pnl_InfoEntrega.getLayout()).show(pnl_InfoEntrega, "pnlDatosEntrega");
			}
		}
	}

	private class BtnEliminarPedidosSeleccionadosActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int borrados = 0; // numero de pedidos seleccionados

			int resp = JOptionPane.showConfirmDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneBorrarProductosSeleccionados"),
					MessagesPrincipal.getString("Principal.JOptionPaneConfirmarBorradoProducto"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (resp == 0) {
				for (int i = 0; i < tablePedidos.getRowCount(); i++) {
					if ((boolean) tablePedidos.getValueAt(i, 0)) {
						Pedido pedido = new Pedido();
						borrados++;
						long idPedido = (long) tablePedidos.getValueAt(i, 1);
						pedido.setNumeroPedido(idPedido);
						if (pedido.delete()) {
							ModeloTablaPedidos modeloTablaPedidos = (ModeloTablaPedidos) tablePedidos.getModel();
							modeloTablaPedidos.eliminaFila(i);
						}
					}
				}
				if (borrados < 1) {
					// custom title, warning icon
					JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneNoSelProductos"), MessagesPrincipal.getString("Principal.JOptionPaneInformacion"),
							JOptionPane.WARNING_MESSAGE);
				} else {

					JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneEliminadoCorrectamente") + borrados + " pedido(s)",
							MessagesPrincipal.getString("Principal.JOptionPaneInformacion"), JOptionPane.INFORMATION_MESSAGE);
					tablePedidos.repaint();
					tablePedidos.revalidate();

				}

			}

		}
	}

	private class BtnOcultarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (pnlDatos.isVisible()) {
				pnlDatos.setVisible(false);
				// btnOcultar.setText(">>");
				btnOcultar.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/mostrar.png")));

			} else {
				pnlDatos.setVisible(true);
				btnOcultar.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/ocultar.png")));
				// btnOcultar.setText("<<");
			}
		}
	}

	private class BtnEditarPedidoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ModeloTablaPedidos modeloTablaPedidos = (ModeloTablaPedidos) tablePedidos.getModel();
			if (modeloTablaPedidos.isModoEditar()) { // Si se estaba editando cambiar a modo normal
				boolean correcto = true;
				System.out.println(tablePedidos.getRowCount());
				for (int i = 0; (i < tablePedidos.getRowCount()); i++) {
					Pedido pedido = new Pedido();
					long idPedido = (long) tablePedidos.getValueAt(i, 1);
					pedido.setNumeroPedido(idPedido);
					if (pedido.read()) {
						pedido.setEstado((String) tablePedidos.getValueAt(i, 3));
						pedido.setDniCliente((String) tablePedidos.getValueAt(i, 4));
						pedido.setFechaPedido((String) tablePedidos.getValueAt(i, 5));
						pedido.setObservaciones((String) tablePedidos.getValueAt(i, 6));
						correcto = pedido.update();
						System.out.println(i + " " + idPedido + " " + correcto);
					}
				}
				if (correcto) {
					JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneCambiosCorrectos"), MessagesPrincipal.getString("Principal.JOptionPaneInformacion"),
							JOptionPane.INFORMATION_MESSAGE);

				} else {
					JOptionPane.showMessageDialog(pnlDatosCliente, MessagesPrincipal.getString("Principal.JOptionPaneActualizadoMal"), "Error",
							JOptionPane.ERROR_MESSAGE);

				}
				modeloTablaPedidos.setModoEditar(false);
				btnNuevoPedido.setEnabled(true);
				btnEliminarPedido.setEnabled(true);
				btnEditarPedido.setText("Editar Pedidos");
				btnEditarPedido.setIcon(
						new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/pencil-edit-button.png")));
				tablePedidos.repaint();
				tablePedidos.revalidate();

			} else { // Cuando se pulsa el botón editar
				modeloTablaPedidos.setModoEditar(true);
				btnNuevoPedido.setEnabled(false);
				btnEliminarPedido.setEnabled(false);
				btnEditarPedido.setText("Guardar Cambios");
				btnEditarPedido
						.setIcon(new ImageIcon(Principal.class.getResource("/Presentacion/Iconos/save16x16.png")));
			}
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int descuento = Integer.parseInt(cbTipoDescuento.getSelectedItem().toString());
			String fechaValidez = dateChooser.getDate().toGMTString();
			fechaValidez = fechaValidez.substring(0, fechaValidez.length()-13);
			Producto p = new Producto();
			p.setNombre(cbProductoOferta.getSelectedItem().toString());
			p.readByName();
			Oferta oferta = new Oferta();
			oferta.setDescuento(descuento);
			oferta.setFechaValidez(fechaValidez);
			oferta.setProducto(p);
			System.out.println(fechaValidez);
			oferta.insert();
			oferta.readAll();
			panelContenedorOferta.cargarPaneles(oferta.getOfertaDAO().getListaOfertas());
			
			//Oferta oferta = new Oferta(id, idProducto, descuento, fechaValidez)
			
			
		}
	}
	private class BtnEliminarOfertaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resp = JOptionPane.showConfirmDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneEliminarOfertasSelected"),
					MessagesPrincipal.getString("Principal.JOptionPaneConfirmarBorradoOfertas"), JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(resp==0) {
				panelContenedorOferta.borrarSeleccionadas();
			}
			
			
		}
	}
	private class BtnBorrarProductoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			panelProductoDetalles.borrarSelecionados();
		}
	}
	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
			
			if(java.awt.Desktop.isDesktopSupported()) {
				java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
				if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
					try {
						java.net.URI urlAyuda = new java.net.URI("https://www.youtube.com/watch?v=bcmgmqOxDJY");
						desktop.browse(urlAyuda);
					} catch (IOException | URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
	}
	private class BtnConfiguracionActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, MessagesPrincipal.getString("Principal.JOptionPaneFuncionalidadNoImp"),
					MessagesPrincipal.getString("Principal.JOptionPaneAviso"), JOptionPane.WARNING_MESSAGE);
			
		}
	}

	private class RdbtnCambiarIdiomaActionListener implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			
			if(rdbtnIngles.isSelected()) {
				MessagesPrincipal.setIdioma("inglés");
			}
			
			if(rdbtnEspaniol.isSelected()) {
				MessagesPrincipal.setIdioma("Español");			
			}

			Principal ventana = new Principal();
			ventana.getFrame().setVisible(true);
			
			frmTpvRestaurante.dispose();
			
		}
	}

	private void cargarDatosTablaPedidos() {
		Pedido p = new Pedido();
		if (p.readAll()) {
			for (Pedido pedido : p.getGestorPedido().getListaPedidos()) {
				((ModeloTablaPedidos) tablePedidos.getModel()).anadirFila(pedido);

			}
		} else {
			System.out.println("Error al cargar los pedidos");
		}

	}

}
