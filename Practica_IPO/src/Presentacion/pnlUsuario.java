package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class pnlUsuario extends JPanel {
	private JPanel pnlImagen;
	private JLabel lblNombre;
	private JLabel lblNombreUsuario;
	private JLabel lblApellidos;
	private JLabel lblApellidosUsuario;
	private JLabel lblFechadenacimiento;
	private JLabel lblFechaNacimientoUsuario;
	private JLabel lblDni;
	private JLabel lblDniUsuario;
	private JLabel lblTelfono;
	private JLabel lblTelfonoUsuario;
	private JLabel lblEmail;
	private JLabel lblEmailUsuario;
	private JLabel lblUltimoAcceso;
	private JLabel lblUltimoAccesoUsuario;
	private JLabel lblImagen;

	/**
	 * Create the panel.
	 */
	public pnlUsuario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 229, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 61, 0, 0, 0, 0, 0, 0, 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			pnlImagen = new JPanel();
			GridBagConstraints gbc_pnlImagen = new GridBagConstraints();
			gbc_pnlImagen.insets = new Insets(0, 0, 5, 5);
			gbc_pnlImagen.gridx = 1;
			gbc_pnlImagen.gridy = 1;
			add(pnlImagen, gbc_pnlImagen);
			{
				lblImagen = new JLabel("");
				lblImagen.setIcon(new ImageIcon(pnlUsuario.class.getResource("/Presentacion/Juan_Visser_website.jpg")));
				pnlImagen.add(lblImagen);
			}
		}
		{
			lblNombre = new JLabel("Nombre:");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.WEST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 3;
			add(lblNombre, gbc_lblNombre);
		}
		{
			lblNombreUsuario = new JLabel("Juan");
			GridBagConstraints gbc_lblNombreUsuario = new GridBagConstraints();
			gbc_lblNombreUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblNombreUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreUsuario.gridx = 1;
			gbc_lblNombreUsuario.gridy = 4;
			add(lblNombreUsuario, gbc_lblNombreUsuario);
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.WEST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 1;
			gbc_lblApellidos.gridy = 6;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			lblApellidosUsuario = new JLabel("Fern\u00E1ndez Garc\u00EDa");
			GridBagConstraints gbc_lblApellidosUsuario = new GridBagConstraints();
			gbc_lblApellidosUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblApellidosUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidosUsuario.gridx = 1;
			gbc_lblApellidosUsuario.gridy = 7;
			add(lblApellidosUsuario, gbc_lblApellidosUsuario);
		}
		{
			lblDni = new JLabel("DNI:");
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.anchor = GridBagConstraints.WEST;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 1;
			gbc_lblDni.gridy = 9;
			add(lblDni, gbc_lblDni);
		}
		{
			lblDniUsuario = new JLabel("71361332Z");
			GridBagConstraints gbc_lblDniUsuario = new GridBagConstraints();
			gbc_lblDniUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblDniUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblDniUsuario.gridx = 1;
			gbc_lblDniUsuario.gridy = 10;
			add(lblDniUsuario, gbc_lblDniUsuario);
		}
		{
			lblFechadenacimiento = new JLabel("FechaDeNacimiento:");
			GridBagConstraints gbc_lblFechadenacimiento = new GridBagConstraints();
			gbc_lblFechadenacimiento.anchor = GridBagConstraints.WEST;
			gbc_lblFechadenacimiento.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechadenacimiento.gridx = 1;
			gbc_lblFechadenacimiento.gridy = 12;
			add(lblFechadenacimiento, gbc_lblFechadenacimiento);
		}
		{
			lblFechaNacimientoUsuario = new JLabel("10/04/1994");
			GridBagConstraints gbc_lblFechaNacimientoUsuario = new GridBagConstraints();
			gbc_lblFechaNacimientoUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblFechaNacimientoUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaNacimientoUsuario.gridx = 1;
			gbc_lblFechaNacimientoUsuario.gridy = 13;
			add(lblFechaNacimientoUsuario, gbc_lblFechaNacimientoUsuario);
		}
		{
			lblTelfono = new JLabel("Tel\u00E9fono:");
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.anchor = GridBagConstraints.WEST;
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 15;
			add(lblTelfono, gbc_lblTelfono);
		}
		{
			lblTelfonoUsuario = new JLabel("926321706");
			GridBagConstraints gbc_lblTelfonoUsuario = new GridBagConstraints();
			gbc_lblTelfonoUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblTelfonoUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfonoUsuario.gridx = 1;
			gbc_lblTelfonoUsuario.gridy = 16;
			add(lblTelfonoUsuario, gbc_lblTelfonoUsuario);
		}
		{
			lblEmail = new JLabel("Email:");
			GridBagConstraints gbc_lblEmail = new GridBagConstraints();
			gbc_lblEmail.anchor = GridBagConstraints.WEST;
			gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail.gridx = 1;
			gbc_lblEmail.gridy = 18;
			add(lblEmail, gbc_lblEmail);
		}
		{
			lblEmailUsuario = new JLabel("juanfernandez@gmail.com");
			GridBagConstraints gbc_lblEmailUsuario = new GridBagConstraints();
			gbc_lblEmailUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblEmailUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmailUsuario.gridx = 1;
			gbc_lblEmailUsuario.gridy = 19;
			add(lblEmailUsuario, gbc_lblEmailUsuario);
		}
		{
			lblUltimoAcceso = new JLabel("Ultimo Acceso:");
			GridBagConstraints gbc_lblUltimoAcceso = new GridBagConstraints();
			gbc_lblUltimoAcceso.anchor = GridBagConstraints.WEST;
			gbc_lblUltimoAcceso.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimoAcceso.gridx = 1;
			gbc_lblUltimoAcceso.gridy = 21;
			add(lblUltimoAcceso, gbc_lblUltimoAcceso);
		}
		{
			lblUltimoAccesoUsuario = new JLabel("07/12/2020   12:50");
			GridBagConstraints gbc_lblUltimoAccesoUsuario = new GridBagConstraints();
			gbc_lblUltimoAccesoUsuario.anchor = GridBagConstraints.WEST;
			gbc_lblUltimoAccesoUsuario.insets = new Insets(0, 0, 5, 5);
			gbc_lblUltimoAccesoUsuario.gridx = 1;
			gbc_lblUltimoAccesoUsuario.gridy = 22;
			add(lblUltimoAccesoUsuario, gbc_lblUltimoAccesoUsuario);
		}

	}

}
