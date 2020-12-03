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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import Dominio.Usuario;

/*import Presentacion.Principal.BtnEntrarActionListener;
import Presentacion.Principal.BtnVerPassActionListener;
import Presentacion.Principal.FrameContentPaneComponentListener;
import Presentacion.Principal.FrmTpvRestauranteKeyListener;
import Presentacion.Principal.PanelIniciarSesionKeyListener;
import Presentacion.Principal.PanelLoginKeyListener;
import Presentacion.Principal.PwdContraseaFocusListener;
import Presentacion.Principal.PwdContraseaKeyListener;
*/
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
	private JTextField txtUsuario;

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
		// frmLogin.setIconImage(Toolkit.getDefaultToolkit()
		// .getImage(Principal.class.getResource("/Presentacion/Iconos/IconoRestaurante1.png")));
		frmLogin.setTitle("Principal.frmTpvRestaurante.title");
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
				pnlIniciarSesion.setBounds(365, 152, 451, 406);
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
					pnlUser.setToolTipText("Principal.panelUser.toolTipText"); //$NON-NLS-1$
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
						gbc_lblIconUser.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconUser.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconUser.gridx = 0;
						gbc_lblIconUser.gridy = 0;
						pnlUser.add(lblIconUser, gbc_lblIconUser);
						// lblIconUser.setIcon(
						// new
						// ImageIcon(Principal.class.getResource("/Presentacion/Iconos/userLogin.png")));
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
						gbc_lblIconPass.fill = GridBagConstraints.VERTICAL;
						gbc_lblIconPass.insets = new Insets(0, 0, 0, 5);
						gbc_lblIconPass.gridx = 0;
						gbc_lblIconPass.gridy = 0;
						pnlPass.add(lblIconPass, gbc_lblIconPass);
						// lblIconPass.setIcon(
						// new
						// ImageIcon(Principal.class.getResource("/Presentacion/Iconos/locked-padlock.png")));
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
							gbc_pwdContrasea.gridwidth = 2;
							gbc_pwdContrasea.fill = GridBagConstraints.VERTICAL;
							gbc_pwdContrasea.insets = new Insets(0, 0, 0, 5);
							gbc_pwdContrasea.gridx = 1;
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
				// Ocultar la contraseña
				pwdContrasea.setEchoChar('\u2022');
				// btnMostrarConsea.setIcon(new
				// ImageIcon(Principal.class.getResource("/Presentacion/Iconos/eye.png")));
				btnMostrarConsea.setToolTipText("Mostrar Constraseña");
				mostrarContrasea = false;
			} else {
				// Mostrar la contraseña
				pwdContrasea.setEchoChar((char) 0);
				// btnMostrarConsea.setIcon(
				// new
				// ImageIcon(Principal.class.getResource("/Presentacion/Iconos/eye_slashed24x24.png")));
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

	private void entrar() {

		String password = pwdContrasea.getText();
		String user = txtUsuario.getText();
		//usuario = new Usuario();
		//usuario.setDNI(user);
		//usuario.setPass(password);

		if (user.equals("12345678") && password.equals("hola")) {
			((CardLayout) frmLogin.getContentPane().getLayout()).show(frmLogin.getContentPane(),
					"panelAplicacion");
			//panelDatosUser.cargarDatos(usuario);
			//Date date = new Date();
			//DateFormat ultimoAcceso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
			//usuario.setUltimoAcceso(ultimoAcceso.format(date));
			//usuario.update();
			lblErrorLaContrasea.setVisible(false);

			if (!chckbxRecordarContrasea.isSelected()) {
				txtUsuario.setText("");
				pwdContrasea.setText("Contraseña");
			}

		} else {
			lblErrorLaContrasea.setVisible(true);
		}

	}

}
