package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
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
import Presentacion.ImageFilter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;

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
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private Border bordeOriginal;
	private JPanel pnlFoto;
	private JLabel lblFoto;
	private JButton btnAadirFoto;
	private JButton btnEliminarFoto;

	private JFrame framePrincipal;
	private JPanel pnlBtnsAyEFoto;
	private JTextArea textFormacionEm;

	/**
	 * Create the panel.
	 */
	public pnlFormEmpleado(JFrame framePrincipal) {
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 146, 318, 0, 10, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 10, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
		}
		{
			pnlFoto = new JPanel();
			GridBagConstraints gbc_pnlFoto = new GridBagConstraints();
			gbc_pnlFoto.gridheight = 2;
			gbc_pnlFoto.gridwidth = 3;
			gbc_pnlFoto.insets = new Insets(0, 0, 5, 5);
			gbc_pnlFoto.fill = GridBagConstraints.BOTH;
			gbc_pnlFoto.gridx = 1;
			gbc_pnlFoto.gridy = 1;
			add(pnlFoto, gbc_pnlFoto);
			GridBagLayout gbl_pnlFoto = new GridBagLayout();
			gbl_pnlFoto.columnWidths = new int[] { 0, 0, 0, 0, 0 };
			gbl_pnlFoto.rowHeights = new int[] { 0, 0, 0, 15, 0 };
			gbl_pnlFoto.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
			gbl_pnlFoto.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			pnlFoto.setLayout(gbl_pnlFoto);
			{
				lblFoto = new JLabel("");
				lblFoto.setIcon(
						new ImageIcon(pnlFormEmpleado.class.getResource("/Presentacion/Imagenes/foto_random.jpg")));
				GridBagConstraints gbc_lblFoto = new GridBagConstraints();
				gbc_lblFoto.gridheight = 2;
				gbc_lblFoto.gridwidth = 2;
				gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
				gbc_lblFoto.gridx = 1;
				gbc_lblFoto.gridy = 1;
				pnlFoto.add(lblFoto, gbc_lblFoto);
			}
		}
		{
			pnlBtnsAyEFoto = new JPanel();
			GridBagConstraints gbc_pnlBtnsAyEFoto = new GridBagConstraints();
			gbc_pnlBtnsAyEFoto.gridwidth = 3;
			gbc_pnlBtnsAyEFoto.insets = new Insets(0, 0, 5, 5);
			gbc_pnlBtnsAyEFoto.fill = GridBagConstraints.BOTH;
			gbc_pnlBtnsAyEFoto.gridx = 1;
			gbc_pnlBtnsAyEFoto.gridy = 3;
			add(pnlBtnsAyEFoto, gbc_pnlBtnsAyEFoto);
			{
				btnEliminarFoto = new JButton("Eliminar Foto");
				btnEliminarFoto.setVisible(false);
				btnEliminarFoto.addActionListener(new BtnEliminarFotoActionListener());
				pnlBtnsAyEFoto.add(btnEliminarFoto);
			}
			{
				btnAadirFoto = new JButton("A\u00F1adir Foto");
				btnAadirFoto.setVisible(false);
				pnlBtnsAyEFoto.add(btnAadirFoto);
				btnAadirFoto.addActionListener(new BtnAadirFotoActionListener());
			}
		}
		{
			lblNombre = new JLabel("Nombre: ");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 5;
			add(lblNombre, gbc_lblNombre);
		}
		{
			tfNombreEm = new JTextField();
			tfNombreEm.setEditable(false);
			GridBagConstraints gbc_tfNombreEm = new GridBagConstraints();
			gbc_tfNombreEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNombreEm.anchor = GridBagConstraints.NORTH;
			gbc_tfNombreEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfNombreEm.gridx = 2;
			gbc_tfNombreEm.gridy = 5;
			add(tfNombreEm, gbc_tfNombreEm);
			tfNombreEm.setColumns(10);
		}
		{
			lblApellidos = new JLabel("Apellidos:");
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.EAST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 1;
			gbc_lblApellidos.gridy = 7;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			tfApellidosEm = new JTextField();
			tfApellidosEm.setEditable(false);
			GridBagConstraints gbc_tfApellidosEm = new GridBagConstraints();
			gbc_tfApellidosEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfApellidosEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfApellidosEm.gridx = 2;
			gbc_tfApellidosEm.gridy = 7;
			add(tfApellidosEm, gbc_tfApellidosEm);
			tfApellidosEm.setColumns(10);
		}
		{
			lblDni = new JLabel("DNI: ");
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.anchor = GridBagConstraints.EAST;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 1;
			gbc_lblDni.gridy = 9;
			add(lblDni, gbc_lblDni);
		}
		{
			tfDniEm = new JTextField();
			tfDniEm.setEditable(false);
			GridBagConstraints gbc_tfDniEm = new GridBagConstraints();
			gbc_tfDniEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDniEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfDniEm.gridx = 2;
			gbc_tfDniEm.gridy = 9;
			add(tfDniEm, gbc_tfDniEm);
			tfDniEm.setColumns(10);
		}
		{
			lblTelfono = new JLabel("Tel\u00E9fono: ");
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.anchor = GridBagConstraints.EAST;
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 11;
			add(lblTelfono, gbc_lblTelfono);
		}
		{
			tfTelefonoEm = new JTextField();
			tfTelefonoEm.setEditable(false);
			GridBagConstraints gbc_tfTelefonoEm = new GridBagConstraints();
			gbc_tfTelefonoEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTelefonoEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfTelefonoEm.gridx = 2;
			gbc_tfTelefonoEm.gridy = 11;
			add(tfTelefonoEm, gbc_tfTelefonoEm);
			tfTelefonoEm.setColumns(10);
		}
		{
			lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico: ");
			GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
			gbc_lblCorreoElectrnico.anchor = GridBagConstraints.EAST;
			gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
			gbc_lblCorreoElectrnico.gridx = 1;
			gbc_lblCorreoElectrnico.gridy = 13;
			add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		}
		{
			tfCorreoEm = new JTextField();
			tfCorreoEm.setEditable(false);
			GridBagConstraints gbc_tfCorreoEm = new GridBagConstraints();
			gbc_tfCorreoEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfCorreoEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfCorreoEm.gridx = 2;
			gbc_tfCorreoEm.gridy = 13;
			add(tfCorreoEm, gbc_tfCorreoEm);
			tfCorreoEm.setColumns(10);
		}
		{
			lblIdiomas = new JLabel("Idiomas: ");
			GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
			gbc_lblIdiomas.anchor = GridBagConstraints.EAST;
			gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
			gbc_lblIdiomas.gridx = 1;
			gbc_lblIdiomas.gridy = 15;
			add(lblIdiomas, gbc_lblIdiomas);
		}
		{
			tfIdiomasEm = new JTextField();
			tfIdiomasEm.setEditable(false);
			GridBagConstraints gbc_tfIdiomasEm = new GridBagConstraints();
			gbc_tfIdiomasEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfIdiomasEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfIdiomasEm.gridx = 2;
			gbc_tfIdiomasEm.gridy = 15;
			add(tfIdiomasEm, gbc_tfIdiomasEm);
			tfIdiomasEm.setColumns(10);
		}
		{
			lblFormacin = new JLabel("Formaci\u00F3n: ");
			GridBagConstraints gbc_lblFormacin = new GridBagConstraints();
			gbc_lblFormacin.anchor = GridBagConstraints.NORTHEAST;
			gbc_lblFormacin.insets = new Insets(0, 0, 5, 5);
			gbc_lblFormacin.gridx = 1;
			gbc_lblFormacin.gridy = 17;
			add(lblFormacin, gbc_lblFormacin);
		}
		{
			textFormacionEm = new JTextArea();
			textFormacionEm.setWrapStyleWord(true);
			textFormacionEm.setText((String) null);
			textFormacionEm.setOpaque(false);
			textFormacionEm.setLineWrap(true);
			textFormacionEm.setEditable(false);
			textFormacionEm.setBackground(SystemColor.menu);
			GridBagConstraints gbc_textFormacionEm = new GridBagConstraints();
			gbc_textFormacionEm.insets = new Insets(0, 0, 5, 5);
			gbc_textFormacionEm.fill = GridBagConstraints.BOTH;
			gbc_textFormacionEm.gridx = 2;
			gbc_textFormacionEm.gridy = 17;
			add(textFormacionEm, gbc_textFormacionEm);
		}

	}

	public void clean() {
		tfNombreEm.setText("");
		tfApellidosEm.setText("");
		tfDniEm.setText("");
		tfTelefonoEm.setText("");
		tfCorreoEm.setText("");
		tfIdiomasEm.setText("");
		textFormacionEm.setText("");
		lblFoto.setIcon(null);

		Component[] jtexts = this.getComponents();
		for (int i = 0; i < jtexts.length; i++) {

			if (jtexts[i] instanceof JTextField) {
				((JTextField) jtexts[i]).setBorder(bordeOriginal);

			}

		}
	}

	public boolean comprobarTextFields() {
		Component[] textFields = this.getComponents();
		boolean correcto = true;
		Empleado e = new Empleado();
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

		try {
			e = this.getDatosEmpleado();
		} catch (Exception e2) {
			e2.printStackTrace();
		}

		if (e.getImagen().equals(null)) {
			correcto = false;
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
		tfDniEm.setEditable(editable);
		textFormacionEm.setEditable(editable);
		btnEliminarFoto.setVisible(editable);
		btnAadirFoto.setVisible(editable);
		textFormacionEm.setOpaque(editable);
		if (editable) {
			textFormacionEm.setBackground(Color.WHITE);
		} else {
			textFormacionEm.setBackground(getBackground());
		}

	}

	public Empleado getDatosEmpleado() throws IOException {
		Empleado empleado = new Empleado();
		empleado.setDni(tfDniEm.getText());
		empleado.read();

		return empleado;
	}

	public Empleado getDatosEmpleadoFromUser() throws IOException {
		Empleado empleado = new Empleado();

		empleado.setNombre(tfNombreEm.getText());
		empleado.setDni(tfDniEm.getText());
		empleado.setApellidos(tfApellidosEm.getText());
		empleado.setTelefono(tfTelefonoEm.getText());
		empleado.setEmail(tfCorreoEm.getText());
		empleado.setIdiomas(tfIdiomasEm.getText());
		empleado.setFormacion(textFormacionEm.getText());
		empleado.setImagen(lblFoto.getToolTipText().toString());

		return empleado;

	}

	public void loadEmpleado(Empleado empleado) {
		tfNombreEm.setText(empleado.getNombre());
		tfApellidosEm.setText(empleado.getApellidos());
		tfDniEm.setText(empleado.getDni());
		tfTelefonoEm.setText(empleado.getTelefono());
		tfCorreoEm.setText(empleado.getEmail());
		tfIdiomasEm.setText(empleado.getIdiomas());
		textFormacionEm.setText(empleado.getFormacion());

		ImageIcon miniatura = null;
		lblFoto.setText("");
		try {
			miniatura = new ImageIcon(
					getClass().getClassLoader().getResource("Presentacion/Imagenes/" + empleado.getImagen()));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFoto.setIcon(miniatura);
			lblFoto.setToolTipText(empleado.getImagen());

		} catch (Exception e) {

			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/foto_random.jpg"));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFoto.setIcon(miniatura);
			lblFoto.setToolTipText("foto_random.jpg");
			empleado.setImagen("foto_random.jpg");

		}
	}

	private class BtnAadirFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			String imagen = "";
			int valorDevuelto = fcAbrir.showOpenDialog(framePrincipal);
			// Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				System.out.println(file.getAbsolutePath());
				ImageIcon miniatura = null;
				lblFoto.setText("");
				try {
					miniatura = new ImageIcon(file.getAbsolutePath());

					imagen = file.getName();

					Image image = miniatura.getImage();
					Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
					miniatura = new ImageIcon(newimg);
					lblFoto.setIcon(miniatura);

					lblFoto.setToolTipText(imagen);
					System.out.println(imagen);
				} catch (Exception e) {

					miniatura = new ImageIcon(
							getClass().getClassLoader().getResource("Presentacion/Imagenes/foto_random.jpg"));
					lblFoto.setToolTipText("foto_random.jpg");

					Image image = miniatura.getImage();
					Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
					miniatura = new ImageIcon(newimg);
					lblFoto.setIcon(miniatura);

					lblFoto.setToolTipText("foto_random.jpg");
					System.out.println(imagen);

				}

			}

		}
	}

	private class BtnEliminarFotoActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblFoto.setIcon(null);
		}
	}
}
