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
import java.awt.Color;
import java.awt.Font;

public class pnlUsuario extends JPanel {
	private JLabel lblNombre;
	private JLabel lblNombreUsuario;
	private JLabel lblApellidos;
	private JLabel lblApellidosUsuario;
	private JLabel lblFechaNacimiento;
	private JLabel lblFechaNacimientoUsuario;
	private JLabel lblEmail;
	private JLabel lblEmailUsuario;
	private JLabel lblTelefono;
	private JLabel lblTelefonoUsuario;
	private JLabel lblUltimoAcceso;
	private JLabel lblUltimoAccesoUsuario;
	private JPanel pnlFoto;
	private JLabel lblImagen;
	private JLabel lblDni;
	private JLabel lblDniUsuario;

	/**
	 * Create the panel.
	 */
	public pnlUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		gridBagLayout.columnWidths = new int[] { 25, 149, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 163, 16, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20, 0, 0, 20 };
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
				lblImagen = new JLabel("");
				lblImagen.setIcon(new ImageIcon(pnlUsuario.class.getResource("/Presentacion/Imagenes/foto_random.jpg")));
				pnlFoto.add(lblImagen, BorderLayout.CENTER);
			}
		}
		{
			lblNombre = new JLabel("Nombre:");
			lblNombre.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.WEST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 3;
			add(lblNombre, gbc_lblNombre);
		}
		{
			lblNombreUsuario = new JLabel("Juan");
			lblNombreUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblNombreUsuario = new GridBagConstraints();
			gbc_lblNombreUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblNombreUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreUsuario.gridx = 1;
			gbc_lblNombreUsuario.gridy = 4;
			add(lblNombreUsuario, gbc_lblNombreUsuario);
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			lblApellidos.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.WEST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 1;
			gbc_lblApellidos.gridy = 6;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			lblApellidosUsuario = new JLabel("Fern\u00E1ndez Garc\u00EDa");
			lblApellidosUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblApellidosUsuario = new GridBagConstraints();
			gbc_lblApellidosUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblApellidosUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidosUsuario.gridx = 1;
			gbc_lblApellidosUsuario.gridy = 7;
			add(lblApellidosUsuario, gbc_lblApellidosUsuario);
		}
		{
			lblDni = new JLabel("DNI:");
			lblDni.setForeground(Color.GRAY);
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.anchor = GridBagConstraints.WEST;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 1;
			gbc_lblDni.gridy = 9;
			add(lblDni, gbc_lblDni);
		}
		{
			lblDniUsuario = new JLabel("71361332Z");
			lblDniUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblDniUsuario = new GridBagConstraints();
			gbc_lblDniUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblDniUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblDniUsuario.gridx = 1;
			gbc_lblDniUsuario.gridy = 10;
			add(lblDniUsuario, gbc_lblDniUsuario);
		}
		{
			lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
			lblFechaNacimiento.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
			gbc_lblFechaNacimiento.anchor = GridBagConstraints.WEST;
			gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaNacimiento.gridx = 1;
			gbc_lblFechaNacimiento.gridy = 12;
			add(lblFechaNacimiento, gbc_lblFechaNacimiento);
		}
		{
			lblFechaNacimientoUsuario = new JLabel("11/03/1992");
			lblFechaNacimientoUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblFechaNacimientoUsuario = new GridBagConstraints();
			gbc_lblFechaNacimientoUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblFechaNacimientoUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaNacimientoUsuario.gridx = 1;
			gbc_lblFechaNacimientoUsuario.gridy = 13;
			add(lblFechaNacimientoUsuario, gbc_lblFechaNacimientoUsuario);
		}
		{
			lblEmail = new JLabel("E-mail:");
			lblEmail.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblEmail = new GridBagConstraints();
			gbc_lblEmail.anchor = GridBagConstraints.WEST;
			gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail.gridx = 1;
			gbc_lblEmail.gridy = 15;
			add(lblEmail, gbc_lblEmail);
		}
		{
			lblEmailUsuario = new JLabel("juanfernandez@gmail.com");
			lblEmailUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblEmailUsuario = new GridBagConstraints();
			gbc_lblEmailUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblEmailUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmailUsuario.gridx = 1;
			gbc_lblEmailUsuario.gridy = 16;
			add(lblEmailUsuario, gbc_lblEmailUsuario);
		}
		{
			lblTelefono = new JLabel("Tel\u00E9fono:");
			lblTelefono.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
			gbc_lblTelefono.anchor = GridBagConstraints.WEST;
			gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelefono.gridx = 1;
			gbc_lblTelefono.gridy = 18;
			add(lblTelefono, gbc_lblTelefono);
		}
		{
			lblTelefonoUsuario = new JLabel("926133212");
			lblTelefonoUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblTelefonoUsuario = new GridBagConstraints();
			gbc_lblTelefonoUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblTelefonoUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelefonoUsuario.gridx = 1;
			gbc_lblTelefonoUsuario.gridy = 19;
			add(lblTelefonoUsuario, gbc_lblTelefonoUsuario);
		}
		{
			lblUltimoAcceso = new JLabel("\u00DAltimo acceso:");
			lblUltimoAcceso.setForeground(new Color(128, 128, 128));
			GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
			gbc_lblUltimoAcceso.anchor = GridBagConstraints.WEST;
			gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimoAcceso.gridx = 1;
			gbc_lblUltimoAcceso.gridy = 21;
			add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		}
		{
			lblUltimoAccesoUsuario = new JLabel("07/12/2020   12:50");
			lblUltimoAccesoUsuario.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblUltimoAccesoUsuario = new GridBagConstraints();
			gbc_lblUltimoAccesoUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblUltimoAccesoUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimoAccesoUsuario.gridx = 1;
			gbc_lblUltimoAccesoUsuario.gridy = 22;
			add(lblUltimoAccesoUsuario, gbc_lblUltimoAccesoUsuario);
		}

	}
	
	public void loadUserData(Usuario usuario) {
		
		lblNombreUsuario.setText(usuario.getNombre());
		lblApellidosUsuario.setText(usuario.getApellidos());
		lblFechaNacimientoUsuario.setText(usuario.getFechaNacimiento());
		lblDniUsuario.setText(usuario.getDNI());
		lblEmailUsuario.setText(usuario.getEmail());
		lblTelefonoUsuario.setText(usuario.getTelefono());
		lblUltimoAccesoUsuario.setText(usuario.getUltimoAcceso());
		ImageIcon icono = null;
		try {
			icono = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/" + usuario.getFoto()));

		} catch (Exception e) {
			
			icono = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/foto_random.jpg"));

		} finally {
			Image image = icono.getImage();
			Image newimg = image.getScaledInstance(140, 150, java.awt.Image.SCALE_SMOOTH);
			icono = new ImageIcon(newimg);
			lblImagen.setIcon(icono);
		}
		//System.out.println(lblNombre.getColorModel().toString());
	}

}
