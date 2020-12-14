package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import Presentacion.*;
import Dominio.Usuario;
import Presentacion.Imagenes.*;
import Presentacion.Iconos.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class panelUsuario extends JPanel {
	private JLabel lblNombre;
	private JLabel lblNombreUser;
	private JLabel lblApellidos;
	private JLabel lblApellidosUser;
	private JLabel lblNacimiento;
	private JLabel lblNacimientoUser;
	private JLabel lblEmail;
	private JLabel lblEmailUser;
	private JLabel lblTelefono;
	private JLabel lblTelefonoUser;
	private JLabel lblUltimoAcceso;
	private JLabel lblUltimoAccesoUser;
	private JPanel pnlFoto;
	private JLabel lblFoto;

	/**
	 * Create the panel.
	 */
	public panelUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.columnWidths = new int[] { 25, 149, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 163, 16, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20 };
		// gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		// gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
		// 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
		// Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			pnlFoto = new JPanel();
			pnlFoto.setBorder(new LineBorder(new Color(0, 0, 0)));
			GridBagConstraints gbc_pnlFoto = new GridBagConstraints();
			gbc_pnlFoto.insets = new Insets(0, 0, 5, 5);
			gbc_pnlFoto.gridx = 1;
			gbc_pnlFoto.gridy = 1;
			add(pnlFoto, gbc_pnlFoto);
			pnlFoto.setLayout(new BorderLayout(0, 0));
			{
				lblFoto = new JLabel("New label");
				pnlFoto.add(lblFoto, BorderLayout.CENTER);
			}
		}
		{
			lblNombre = new JLabel(MessagesPrincipal.getString("panelUsuario.lblNombre.text")); //$NON-NLS-1$
			lblNombre.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.WEST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 3;
			add(lblNombre, gbc_lblNombre);
		}
		{
			lblNombreUser = new JLabel(MessagesPrincipal.getString("panelUsuario.lblNombreUser.text")); //$NON-NLS-1$
			lblNombreUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblNombreUser = new GridBagConstraints();
			gbc_lblNombreUser.anchor = GridBagConstraints.WEST;
			gbc_lblNombreUser.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreUser.gridx = 1;
			gbc_lblNombreUser.gridy = 4;
			add(lblNombreUser, gbc_lblNombreUser);
		}
		{
			lblApellidos = new JLabel(MessagesPrincipal.getString("panelUsuario.lblApellidos.text")); //$NON-NLS-1$
			lblApellidos.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.WEST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 1;
			gbc_lblApellidos.gridy = 6;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			lblApellidosUser = new JLabel(MessagesPrincipal.getString("panelUsuario.lblApellidosUser.text")); //$NON-NLS-1$
			lblApellidosUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblApellidosUser = new GridBagConstraints();
			gbc_lblApellidosUser.anchor = GridBagConstraints.WEST;
			gbc_lblApellidosUser.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidosUser.gridx = 1;
			gbc_lblApellidosUser.gridy = 7;
			add(lblApellidosUser, gbc_lblApellidosUser);
		}
		{
			lblNacimiento = new JLabel(MessagesPrincipal.getString("panelUsuario.lblNacimiento.text")); //$NON-NLS-1$
			lblNacimiento.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblNacimiento = new GridBagConstraints();
			gbc_lblNacimiento.anchor = GridBagConstraints.WEST;
			gbc_lblNacimiento.insets = new Insets(0, 0, 5, 5);
			gbc_lblNacimiento.gridx = 1;
			gbc_lblNacimiento.gridy = 9;
			add(lblNacimiento, gbc_lblNacimiento);
		}
		{
			lblNacimientoUser = new JLabel(MessagesPrincipal.getString("panelUsuario.lblNacimientoUser.text")); //$NON-NLS-1$
			lblNacimientoUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblNacimientoUser = new GridBagConstraints();
			gbc_lblNacimientoUser.anchor = GridBagConstraints.WEST;
			gbc_lblNacimientoUser.insets = new Insets(0, 0, 5, 5);
			gbc_lblNacimientoUser.gridx = 1;
			gbc_lblNacimientoUser.gridy = 10;
			add(lblNacimientoUser, gbc_lblNacimientoUser);
		}
		{
			lblEmail = new JLabel(MessagesPrincipal.getString("panelUsuario.lblEmail.text")); //$NON-NLS-1$
			lblEmail.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblEmail = new GridBagConstraints();
			gbc_lblEmail.anchor = GridBagConstraints.WEST;
			gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail.gridx = 1;
			gbc_lblEmail.gridy = 12;
			add(lblEmail, gbc_lblEmail);
		}
		{
			lblEmailUser = new JLabel(MessagesPrincipal.getString("panelUsuario.lblEmailUser.text")); //$NON-NLS-1$
			lblEmailUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblEmailUser = new GridBagConstraints();
			gbc_lblEmailUser.anchor = GridBagConstraints.WEST;
			gbc_lblEmailUser.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmailUser.gridx = 1;
			gbc_lblEmailUser.gridy = 13;
			add(lblEmailUser, gbc_lblEmailUser);
		}
		{
			lblTelefono = new JLabel(MessagesPrincipal.getString("panelUsuario.lblTelefono.text")); //$NON-NLS-1$
			lblTelefono.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
			gbc_lblTelefono.anchor = GridBagConstraints.WEST;
			gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelefono.gridx = 1;
			gbc_lblTelefono.gridy = 15;
			add(lblTelefono, gbc_lblTelefono);
		}
		{
			lblTelefonoUser = new JLabel(MessagesPrincipal.getString("panelUsuario.lblTelefonoUser.text")); //$NON-NLS-1$
			lblTelefonoUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblTelefonoUser = new GridBagConstraints();
			gbc_lblTelefonoUser.anchor = GridBagConstraints.WEST;
			gbc_lblTelefonoUser.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelefonoUser.gridx = 1;
			gbc_lblTelefonoUser.gridy = 16;
			add(lblTelefonoUser, gbc_lblTelefonoUser);
		}
		{
			lblUltimoAcceso = new JLabel(MessagesPrincipal.getString("panelUsuario.lblUltimoAcceso.text")); //$NON-NLS-1$
			lblUltimoAcceso.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
			gbc_lblUltimoAcceso.anchor = GridBagConstraints.WEST;
			gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimoAcceso.gridx = 1;
			gbc_lblUltimoAcceso.gridy = 18;
			add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		}
		{
			lblUltimoAccesoUser = new JLabel(MessagesPrincipal.getString("panelUsuario.lblUltimoAccesoUser.text")); //$NON-NLS-1$
			lblUltimoAccesoUser.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblUltimoAccesoUser = new GridBagConstraints();
			gbc_lblUltimoAccesoUser.anchor = GridBagConstraints.WEST;
			gbc_lblUltimoAccesoUser.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimoAccesoUser.gridx = 1;
			gbc_lblUltimoAccesoUser.gridy = 19;
			add(lblUltimoAccesoUser, gbc_lblUltimoAccesoUser);
		}

	}

	public void cargarDatos(Usuario usuario) {
		
		lblNombreUser.setText(usuario.getNombre());
		lblApellidosUser.setText(usuario.getApellidos());
		lblNacimientoUser.setText(usuario.getFechaNacimiento());
		lblEmailUser.setText(usuario.getEmail());
		lblTelefonoUser.setText(usuario.getTelefono());
		lblUltimoAccesoUser.setText(usuario.getUltimoAcceso());
		lblFoto.setText("");
		ImageIcon icono = null;
		try {
			icono = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/" + usuario.getFoto()));

		} catch (Exception e) {
			
			icono = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/imagenDefecto.png"));

		} finally {
			Image image = icono.getImage();
			Image newimg = image.getScaledInstance(140, 150, java.awt.Image.SCALE_SMOOTH);
			icono = new ImageIcon(newimg);
			lblFoto.setIcon(icono);
		}
		//System.out.println(lblNombre.getColorModel().toString());
	}

}
