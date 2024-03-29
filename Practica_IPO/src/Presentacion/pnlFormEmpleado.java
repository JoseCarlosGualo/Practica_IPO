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
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

/**
 * The Class pnlFormEmpleado.
 */
public class pnlFormEmpleado extends JPanel {
	
	/** The lbl nombre. */
	private JLabel lblNombre;
	
	/** The lbl apellidos. */
	private JLabel lblApellidos;
	
	/** The lbl dni. */
	private JLabel lblDni;
	
	/** The lbl telfono. */
	private JLabel lblTelfono;
	
	/** The lbl correo electrnico. */
	private JLabel lblCorreoElectrnico;
	
	/** The lbl idiomas. */
	private JLabel lblIdiomas;
	
	/** The lbl formacin. */
	private JLabel lblFormacin;
	
	/** The tf nombre em. */
	private JTextField tfNombreEm;
	
	/** The tf apellidos em. */
	private JTextField tfApellidosEm;
	
	/** The tf dni em. */
	private JTextField tfDniEm;
	
	/** The tf telefono em. */
	private JTextField tfTelefonoEm;
	
	/** The tf correo em. */
	private JTextField tfCorreoEm;
	
	/** The tf idiomas em. */
	private JTextField tfIdiomasEm;
	
	/** The borde mal. */
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	
	/** The borde bien. */
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	
	/** The borde original. */
	private Border bordeOriginal;
	
	/** The pnl foto. */
	private JPanel pnlFoto;
	
	/** The lbl foto. */
	private JLabel lblFoto;
	
	/** The btn aadir foto. */
	private JButton btnAadirFoto;
	
	/** The btn eliminar foto. */
	private JButton btnEliminarFoto;

	/** The frame principal. */
	private JFrame framePrincipal;
	
	/** The pnl btns ay E foto. */
	private JPanel pnlBtnsAyEFoto;
	
	/** The text formacion em. */
	private JTextArea textFormacionEm;
	
	/** The lbl informacin del empleado. */
	private JLabel lblInformacinDelEmpleado;

	/**
	 * Create the panel.
	 *
	 * @param framePrincipal the frame principal
	 */
	public pnlFormEmpleado(JFrame framePrincipal) {
		setBorder(UIManager.getBorder("InternalFrame.border"));
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 146, 318, 0, 10, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 10, 0, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 10,
				0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
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
				lblFoto = new JLabel(); // $NON-NLS-1$
				lblFoto.setToolTipText(MessagesLogin.getString("pnlFormEmpleado.lblFoto.toolTipText")); //$NON-NLS-1$
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
				btnEliminarFoto = new JButton(MessagesLogin.getString("pnlFormEmpleado.btnEliminarFoto.text")); //$NON-NLS-1$
				btnEliminarFoto.setToolTipText(MessagesLogin.getString("pnlFormEmpleado.btnEliminarFoto.toolTipText")); //$NON-NLS-1$
				btnEliminarFoto.setIcon(new ImageIcon(
						pnlFormEmpleado.class.getResource("/Presentacion/Imagenes/camera-delete-icon.png")));
				btnEliminarFoto.setVisible(false);
				btnEliminarFoto.addActionListener(new BtnEliminarFotoActionListener());
				pnlBtnsAyEFoto.add(btnEliminarFoto);
			}
			{
				btnAadirFoto = new JButton(MessagesLogin.getString("pnlFormEmpleado.btnAadirFoto.text")); //$NON-NLS-1$
				btnAadirFoto.setToolTipText(MessagesLogin.getString("pnlFormEmpleado.btnAadirFoto.toolTipText")); //$NON-NLS-1$
				btnAadirFoto.setIcon(
						new ImageIcon(pnlFormEmpleado.class.getResource("/Presentacion/Imagenes/camera-add-icon.png")));
				btnAadirFoto.setVisible(false);
				pnlBtnsAyEFoto.add(btnAadirFoto);
				btnAadirFoto.addActionListener(new BtnAadirFotoActionListener());
			}
		}
		{
			lblInformacinDelEmpleado = new JLabel(
					MessagesLogin.getString("pnlFormEmpleado.lblInformacinDelEmpleado.text")); //$NON-NLS-1$
			lblInformacinDelEmpleado.setBorder(null);
			lblInformacinDelEmpleado
					.setIcon(new ImageIcon(pnlFormEmpleado.class.getResource("/Presentacion/Imagenes/hombre.png")));
			lblInformacinDelEmpleado.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblInformacinDelEmpleado = new GridBagConstraints();
			gbc_lblInformacinDelEmpleado.insets = new Insets(0, 0, 5, 5);
			gbc_lblInformacinDelEmpleado.gridx = 1;
			gbc_lblInformacinDelEmpleado.gridy = 4;
			add(lblInformacinDelEmpleado, gbc_lblInformacinDelEmpleado);
		}
		{
			lblNombre = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblNombre.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 6;
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
			gbc_tfNombreEm.gridy = 6;
			add(tfNombreEm, gbc_tfNombreEm);
			tfNombreEm.setColumns(10);
		}
		{
			lblApellidos = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblApellidos.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
			gbc_lblApellidos.anchor = GridBagConstraints.EAST;
			gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos.gridx = 1;
			gbc_lblApellidos.gridy = 8;
			add(lblApellidos, gbc_lblApellidos);
		}
		{
			tfApellidosEm = new JTextField();
			tfApellidosEm.setEditable(false);
			GridBagConstraints gbc_tfApellidosEm = new GridBagConstraints();
			gbc_tfApellidosEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfApellidosEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfApellidosEm.gridx = 2;
			gbc_tfApellidosEm.gridy = 8;
			add(tfApellidosEm, gbc_tfApellidosEm);
			tfApellidosEm.setColumns(10);
		}
		{
			lblDni = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblDni.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.anchor = GridBagConstraints.EAST;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 1;
			gbc_lblDni.gridy = 10;
			add(lblDni, gbc_lblDni);
		}
		{
			tfDniEm = new JTextField();
			tfDniEm.setEditable(false);
			GridBagConstraints gbc_tfDniEm = new GridBagConstraints();
			gbc_tfDniEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDniEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfDniEm.gridx = 2;
			gbc_tfDniEm.gridy = 10;
			add(tfDniEm, gbc_tfDniEm);
			tfDniEm.setColumns(10);
		}
		{
			lblTelfono = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblTelfono.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.anchor = GridBagConstraints.EAST;
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 12;
			add(lblTelfono, gbc_lblTelfono);
		}
		{
			tfTelefonoEm = new JTextField();
			tfTelefonoEm.setEditable(false);
			GridBagConstraints gbc_tfTelefonoEm = new GridBagConstraints();
			gbc_tfTelefonoEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTelefonoEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfTelefonoEm.gridx = 2;
			gbc_tfTelefonoEm.gridy = 12;
			add(tfTelefonoEm, gbc_tfTelefonoEm);
			tfTelefonoEm.setColumns(10);
		}
		{
			lblCorreoElectrnico = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblCorreoElectrnico.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
			gbc_lblCorreoElectrnico.anchor = GridBagConstraints.EAST;
			gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
			gbc_lblCorreoElectrnico.gridx = 1;
			gbc_lblCorreoElectrnico.gridy = 14;
			add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);
		}
		{
			tfCorreoEm = new JTextField();
			tfCorreoEm.setEditable(false);
			GridBagConstraints gbc_tfCorreoEm = new GridBagConstraints();
			gbc_tfCorreoEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfCorreoEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfCorreoEm.gridx = 2;
			gbc_tfCorreoEm.gridy = 14;
			add(tfCorreoEm, gbc_tfCorreoEm);
			tfCorreoEm.setColumns(10);
		}
		{
			lblIdiomas = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblIdiomas.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblIdiomas = new GridBagConstraints();
			gbc_lblIdiomas.anchor = GridBagConstraints.EAST;
			gbc_lblIdiomas.insets = new Insets(0, 0, 5, 5);
			gbc_lblIdiomas.gridx = 1;
			gbc_lblIdiomas.gridy = 16;
			add(lblIdiomas, gbc_lblIdiomas);
		}
		{
			tfIdiomasEm = new JTextField();
			tfIdiomasEm.setEditable(false);
			GridBagConstraints gbc_tfIdiomasEm = new GridBagConstraints();
			gbc_tfIdiomasEm.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfIdiomasEm.insets = new Insets(0, 0, 5, 5);
			gbc_tfIdiomasEm.gridx = 2;
			gbc_tfIdiomasEm.gridy = 16;
			add(tfIdiomasEm, gbc_tfIdiomasEm);
			tfIdiomasEm.setColumns(10);
		}
		{
			lblFormacin = new JLabel(MessagesLogin.getString("pnlFormEmpleado.lblFormacin.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblFormacin = new GridBagConstraints();
			gbc_lblFormacin.anchor = GridBagConstraints.NORTHEAST;
			gbc_lblFormacin.insets = new Insets(0, 0, 5, 5);
			gbc_lblFormacin.gridx = 1;
			gbc_lblFormacin.gridy = 18;
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
			gbc_textFormacionEm.gridy = 18;
			add(textFormacionEm, gbc_textFormacionEm);
		}

	}

	/**
	 * Clean.
	 */
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

			if (jtexts[i] instanceof JTextArea) {
				((JTextArea) jtexts[i]).setBorder(bordeOriginal);

			}

		}
	}

	/**
	 * Comprobar text fields.
	 *
	 * @return true, if successful
	 */
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

	/**
	 * Comprobar text areas.
	 *
	 * @return true, if successful
	 */
	public boolean comprobarTextAreas() {
		Component[] textFields = this.getComponents();
		boolean correcto = true;
		Empleado e = new Empleado();
		for (int i = 0; i < textFields.length; i++) {
			if (textFields[i] instanceof JTextArea) {
				if (((JTextArea) textFields[i]).getText().equals("")) {
					((JTextArea) textFields[i]).setBorder(bordeMal);
					correcto = false;
				} else {
					((JTextArea) textFields[i]).setBorder(bordeBien);
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

	/**
	 * Sets the components editables.
	 *
	 * @param cambiarDni the cambiar dni
	 * @param editable the editable
	 */
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

	/**
	 * Gets the datos empleado.
	 *
	 * @return the datos empleado
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public Empleado getDatosEmpleado() throws IOException {
		Empleado empleado = new Empleado();
		empleado.setDni(tfDniEm.getText());
		empleado.read();

		return empleado;
	}

	/**
	 * Gets the datos empleado from user.
	 *
	 * @return the datos empleado from user
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
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

	/**
	 * Load empleado.
	 *
	 * @param empleado the empleado
	 */
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

	/**
	 * The listener interface for receiving btnAadirFotoAction events.
	 * The class that is interested in processing a btnAadirFotoAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnAadirFotoActionListener<code> method. When
	 * the btnAadirFotoAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnAadirFotoActionEvent
	 */
	private class BtnAadirFotoActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
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

	/**
	 * The listener interface for receiving btnEliminarFotoAction events.
	 * The class that is interested in processing a btnEliminarFotoAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnEliminarFotoActionListener<code> method. When
	 * the btnEliminarFotoAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnEliminarFotoActionEvent
	 */
	private class BtnEliminarFotoActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			lblFoto.setIcon(null);
		}
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDNI() {
		return tfDniEm.getText();
	}
}
