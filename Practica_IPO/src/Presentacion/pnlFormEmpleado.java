package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.filechooser.FileFilter;

import Dominio.Empleado;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.awt.event.ActionEvent;

public class pnlFormEmpleado extends JPanel {
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblDni;
	private JLabel lblTelfono;
	private JLabel lblCorreoElectrnico;
	private JLabel lblIdiomas;
	private JLabel lblFormacin;
	private JTextField tfNombreEm;
	private JTextField tfApellidosEm;
	private JTextField tfDniEm;
	private JTextField tfTelefonoEm;
	private JTextField tfCorreoEm;
	private JTextField tfIdiomasEm;
	private JTextField tfFormacionEm;
	private JFrame frame;
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private Border bordeOriginal;
	private JPanel pnlFoto;
	private JLabel lblFoto;
	private JButton btnAadirFoto;
	private JButton btnEliminarFoto;

	/**
	 * Create the panel.
	 */
	public pnlFormEmpleado() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 146, 134, 10, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 10, 0, 0, 0, 0, 0, 0, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
		}
		{
			pnlFoto = new JPanel();
			GridBagConstraints gbc_pnlFoto = new GridBagConstraints();
			gbc_pnlFoto.gridheight = 2;
			gbc_pnlFoto.gridwidth = 2;
			gbc_pnlFoto.insets = new Insets(0, 0, 5, 5);
			gbc_pnlFoto.fill = GridBagConstraints.BOTH;
			gbc_pnlFoto.gridx = 1;
			gbc_pnlFoto.gridy = 1;
			add(pnlFoto, gbc_pnlFoto);
			GridBagLayout gbl_pnlFoto = new GridBagLayout();
			gbl_pnlFoto.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
			gbl_pnlFoto.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
			gbl_pnlFoto.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlFoto.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			pnlFoto.setLayout(gbl_pnlFoto);
			{
				lblFoto = new JLabel("");
				lblFoto.setIcon(new ImageIcon(pnlFormEmpleado.class.getResource("/Presentacion/foto_random.jpg")));
				GridBagConstraints gbc_lblFoto = new GridBagConstraints();
				gbc_lblFoto.gridheight = 2;
				gbc_lblFoto.gridwidth = 3;
				gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
				gbc_lblFoto.gridx = 1;
				gbc_lblFoto.gridy = 1;
				pnlFoto.add(lblFoto, gbc_lblFoto);
			}
			{
				btnAadirFoto = new JButton("A\u00F1adir Foto");
				GridBagConstraints gbc_btnAadirFoto = new GridBagConstraints();
				gbc_btnAadirFoto.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnAadirFoto.insets = new Insets(0, 0, 5, 5);
				gbc_btnAadirFoto.gridx = 1;
				gbc_btnAadirFoto.gridy = 3;
				pnlFoto.add(btnAadirFoto, gbc_btnAadirFoto);
			}
			{
				btnEliminarFoto = new JButton("Eliminar Foto");
				GridBagConstraints gbc_btnEliminarFoto = new GridBagConstraints();
				gbc_btnEliminarFoto.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnEliminarFoto.insets = new Insets(0, 0, 5, 5);
				gbc_btnEliminarFoto.gridx = 2;
				gbc_btnEliminarFoto.gridy = 3;
				pnlFoto.add(btnEliminarFoto, gbc_btnEliminarFoto);
			}
		}
		{
			lblNombre = new JLabel("Nombre: ");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 3;
			add(lblNombre, gbc_lblNombre);
		}
		{
			tfNombreEm = new JTextField();
			GridBagConstraints gbc_tfNombreEm = new GridBagConstraints();
			gbc_tfNombreEm.anchor = GridBagConstraints.NORTH;
			gbc_tfNombreEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfNombreEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNombreEm.gridx = 2;
			gbc_tfNombreEm.gridy = 3;
			add(tfNombreEm, gbc_tfNombreEm);
			tfNombreEm.setColumns(10);
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 1;
			gbc_lblApellidos.gridy = 4;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			tfApellidosEm = new JTextField();
			GridBagConstraints gbc_tfApellidosEm = new GridBagConstraints();
			gbc_tfApellidosEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfApellidosEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfApellidosEm.gridx = 2;
			gbc_tfApellidosEm.gridy = 4;
			add(tfApellidosEm, gbc_tfApellidosEm);
			tfApellidosEm.setColumns(10);
		}
		{
			lblDni = new JLabel("DNI: ");
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 1;
			gbc_lblDni.gridy = 5;
			add(lblDni, gbc_lblDni);
		}
		{
			tfDniEm = new JTextField();
			GridBagConstraints gbc_tfDniEm = new GridBagConstraints();
			gbc_tfDniEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfDniEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDniEm.gridx = 2;
			gbc_tfDniEm.gridy = 5;
			add(tfDniEm, gbc_tfDniEm);
			tfDniEm.setColumns(10);
		}
		{
			lblTelfono = new JLabel("Tel\u00E9fono: ");
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 6;
			add(lblTelfono, gbc_lblTelfono);
		}
		{
			tfTelefonoEm = new JTextField();
			GridBagConstraints gbc_tfTelefonoEm = new GridBagConstraints();
			gbc_tfTelefonoEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfTelefonoEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTelefonoEm.gridx = 2;
			gbc_tfTelefonoEm.gridy = 6;
			add(tfTelefonoEm, gbc_tfTelefonoEm);
			tfTelefonoEm.setColumns(10);
		}
		{
			lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico: ");
			GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
			gbc_lblCorreoElectrnico.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
			gbc_lblCorreoElectrnico.gridx = 1;
			gbc_lblCorreoElectrnico.gridy = 7;
			add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		}
		{
			tfCorreoEm = new JTextField();
			GridBagConstraints gbc_tfCorreoEm = new GridBagConstraints();
			gbc_tfCorreoEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfCorreoEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfCorreoEm.gridx = 2;
			gbc_tfCorreoEm.gridy = 7;
			add(tfCorreoEm, gbc_tfCorreoEm);
			tfCorreoEm.setColumns(10);
		}
		{
			lblIdiomas = new JLabel("Idiomas: ");
			GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
			gbc_lblIdiomas.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
			gbc_lblIdiomas.gridx = 1;
			gbc_lblIdiomas.gridy = 8;
			add(lblIdiomas, gbc_lblIdiomas);
		}
		{
			tfIdiomasEm = new JTextField();
			GridBagConstraints gbc_tfIdiomasEm = new GridBagConstraints();
			gbc_tfIdiomasEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfIdiomasEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfIdiomasEm.gridx = 2;
			gbc_tfIdiomasEm.gridy = 8;
			add(tfIdiomasEm, gbc_tfIdiomasEm);
			tfIdiomasEm.setColumns(10);
		}
		{
			lblFormacin = new JLabel("Formaci\u00F3n: ");
			GridBagConstraints gbc_lblFormacin = new GridBagConstraints();
			gbc_lblFormacin.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblFormacin.insets = new Insets(0, 0, 5, 5);
			gbc_lblFormacin.gridx = 1;
			gbc_lblFormacin.gridy = 9;
			add(lblFormacin, gbc_lblFormacin);
		}
		{
			tfFormacionEm = new JTextField();
			GridBagConstraints gbc_tfFormacionEm = new GridBagConstraints();
			gbc_tfFormacionEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfFormacionEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfFormacionEm.gridx = 2;
			gbc_tfFormacionEm.gridy = 9;
			add(tfFormacionEm, gbc_tfFormacionEm);
			tfFormacionEm.setColumns(10);
		}

	}

	public void clean() {
		tfNombreEm.setText("");
		tfApellidosEm.setText("");
		tfDniEm.setText("");
		tfTelefonoEm.setText("");
		tfCorreoEm.setText("");
		tfIdiomasEm.setText("");
		tfFormacionEm.setText("");
	}

	public boolean comprobarTextFields() {
		Component[] textFields = this.getComponents();
		boolean correcto = true;
		for (int i = 0; i < textFields.length; i++) {
			if (textFields[i] instanceof JTextField) {
				if (((JTextField) textFields[i]).getText().equals("")) {
					((JTextField) textFields[i]).setBorder(bordeMal);
					correcto = false;
				} else {
					((JTextField) textFields[i]).setBorder(bordeBien);
				}
			}
		}
		return correcto;
	}

	public void setComponentsEditables(boolean cambiarDni, boolean editable) {
		if (cambiarDni) {
			tfDniEm.setEditable(editable);
		}

		tfNombreEm.setEditable(editable);
		tfApellidosEm.setEditable(editable);
		tfTelefonoEm.setEditable(editable);
		tfCorreoEm.setEditable(editable);
		tfIdiomasEm.setEditable(editable);
		tfFormacionEm.setEditable(editable);
	}

	public Empleado getDatosEmpelado() throws IOException {
		Empleado empleado = new Empleado();
		empleado.setApellidos(tfApellidosEm.getText());
		empleado.setEmail(tfCorreoEm.getText());
		empleado.setFormacion(tfFormacionEm.getText());
		empleado.setIdiomas(tfIdiomasEm.getText());
		// empleado.setImagen(imagen);
		empleado.setNombre(tfNombreEm.getText());
		empleado.setTelefono(tfTelefonoEm.getText());

		return empleado;
	}

	/*
	 * public void loadEmpleado(Empleado empleado) {
	 * tfNombreEm.setText(empleado.getNombre());
	 * tfApellidosEm.setText(empleado.getApellidos());
	 * tfDniEm.setText(empleado.getDni());
	 * tfTelefonoEm.setText(empleado.getTelefono());
	 * tfCorreoEm.setText(empleado.getEmail());
	 * tfIdiomasEm.setText(empleado.getIdiomas());
	 * tfFormacionEm.setText(empleado.getFormacion());
	 * 
	 * ImageIcon miniatura = null; lblFotoEmpleado.setText(""); try { miniatura =
	 * new ImageIcon(
	 * getClass().getClassLoader().getResource("Presentacion/FotosClientes/" +
	 * empleado.getImagen()));
	 * 
	 * } catch (Exception e) {
	 * 
	 * miniatura = new ImageIcon( getClass().getClassLoader().getResource(
	 * "Presentacion/Imagenes/imagenDefecto.png"));
	 * 
	 * } finally { Image image = miniatura.getImage(); Image newimg =
	 * image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH); miniatura =
	 * new ImageIcon(newimg); lblFotoEmpleado.setIcon(miniatura); } }
	 */
}
