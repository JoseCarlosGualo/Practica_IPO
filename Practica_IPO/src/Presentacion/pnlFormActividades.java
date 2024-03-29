package Presentacion;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Dominio.Actividad;
import Dominio.Empleado;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

/**
 * The Class pnlFormActividades.
 */
public class pnlFormActividades extends JPanel {
	
	/** The frame principal. */
	private JFrame framePrincipal;
	
	/** The lbl nombre actividad. */
	private JLabel lblNombreActividad;
	
	/** The lbl monitor. */
	private JLabel lblMonitor;
	
	/** The tf monitor ac. */
	private JTextField tfMonitorAc;
	
	/** The lbl cupo mnimo. */
	private JLabel lblCupoMnimo;
	
	/** The tf cupo minimo ac. */
	private JTextField tfCupoMinimoAc;
	
	/** The lbl cupo mximo. */
	private JLabel lblCupoMximo;
	
	/** The tf cupo maximo ac. */
	private JTextField tfCupoMaximoAc;
	
	/** The lbl precio por hora. */
	private JLabel lblPrecioPorHora;
	
	/** The tf precio hora ac. */
	private JTextField tfPrecioHoraAc;
	
	/** The lblrea del camping. */
	private JLabel lblreaDelCamping;
	
	/** The tf area camping ac. */
	private JTextField tfAreaCampingAc;
	
	/** The lbl materiales necesarios. */
	private JLabel lblMaterialesNecesarios;
	
	/** The lbl descripcin. */
	private JLabel lblDescripcin;
	
	/** The text area descripcion. */
	private JTextArea textAreaDescripcion;

	/** The borde mal. */
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	
	/** The borde bien. */
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	
	/** The borde original. */
	private Border bordeOriginal;
	
	/** The text area materiales necesarios ac. */
	private JTextArea textAreaMaterialesNecesariosAc;
	
	/** The lbl destinatarios. */
	private JLabel lblDestinatarios;
	
	/** The tf destinatario ac. */
	private JTextField tfDestinatarioAc;
	
	/** The txt nombre act. */
	private JTextField txtNombreAct;
	
	/** The txt horario. */
	private JTextField txtHorario;
	
	/** The lbl nombre act. */
	private JLabel lblNombreAct;
	
	/** The lbl horario act. */
	private JLabel lblHorarioAct;

	/** The color menu. */
	private Color color_menu = new Color(240, 240, 240);
	
	/** The bnt add foto. */
	private JButton bntAddFoto;
	
	/** The lbl foto actividad. */
	private JLabel lblFotoActividad;
	
	/** The lbl nombre Y horario. */
	private JLabel lblNombreYHorario;
	
	/** The lbl informacin de la. */
	private JLabel lblInformacinDeLa;
	
	/** The lbl id. */
	private JLabel lblId;
	
	/** The lbl id ac. */
	private JLabel lblIdAc;

	/**
	 * Instantiates a new pnl form actividades.
	 *
	 * @param framePrincipal the frame principal
	 */
	public pnlFormActividades(JFrame framePrincipal) {
		setBorder(UIManager.getBorder("InternalFrame.border"));
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 15, 0, 190, 100, 15, 0 };
		gridBagLayout.rowHeights = new int[] { 15, 0, 25, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblNombreActividad = new JLabel(MessagesLogin.getString("pnlFormActividades.lblNombreActividad.text")); //$NON-NLS-1$
			lblNombreActividad.setForeground(Color.BLUE);
			lblNombreActividad.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 22));
			GridBagConstraints gbc_lblNombreActividad = new GridBagConstraints();
			gbc_lblNombreActividad.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblNombreActividad.gridwidth = 2;
			gbc_lblNombreActividad.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreActividad.gridx = 1;
			gbc_lblNombreActividad.gridy = 1;
			add(lblNombreActividad, gbc_lblNombreActividad);
		}
		{
			lblInformacinDeLa = new JLabel(MessagesLogin.getString("pnlFormActividades.lblInformacinDeLa.text")); //$NON-NLS-1$
			lblInformacinDeLa.setIcon(
					new ImageIcon(pnlFormActividades.class.getResource("/Presentacion/Imagenes/informacion.png")));
			lblInformacinDeLa.setFont(new Font("Tahoma", Font.BOLD, 19));
			GridBagConstraints gbc_lblInformacinDeLa = new GridBagConstraints();
			gbc_lblInformacinDeLa.gridwidth = 2;
			gbc_lblInformacinDeLa.fill = GridBagConstraints.HORIZONTAL;
			gbc_lblInformacinDeLa.insets = new Insets(0, 0, 5, 5);
			gbc_lblInformacinDeLa.gridx = 1;
			gbc_lblInformacinDeLa.gridy = 2;
			add(lblInformacinDeLa, gbc_lblInformacinDeLa);
		}
		{
			lblId = new JLabel(MessagesLogin.getString("pnlFormActividades.lblId.text")); //$NON-NLS-1$
			lblId.setFont(new Font("Tahoma", Font.BOLD, 19));
			GridBagConstraints gbc_lblId = new GridBagConstraints();
			gbc_lblId.anchor = GridBagConstraints.EAST;
			gbc_lblId.insets = new Insets(0, 0, 5, 5);
			gbc_lblId.gridx = 3;
			gbc_lblId.gridy = 2;
			add(lblId, gbc_lblId);
			lblId.setVisible(false);
		}
		{
			lblIdAc = new JLabel(MessagesLogin.getString("pnlFormActividades.lblIdAc.text")); //$NON-NLS-1$
			lblIdAc.setFont(new Font("Tahoma", Font.ITALIC, 19));
			GridBagConstraints gbc_lblIdAc = new GridBagConstraints();
			gbc_lblIdAc.insets = new Insets(0, 0, 5, 0);
			gbc_lblIdAc.gridx = 4;
			gbc_lblIdAc.gridy = 2;
			add(lblIdAc, gbc_lblIdAc);
			lblIdAc.setVisible(false);
		}
		{
			lblMonitor = new JLabel(MessagesLogin.getString("pnlFormActividades.lblMonitor.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblMonitor = new GridBagConstraints();
			gbc_lblMonitor.anchor = GridBagConstraints.EAST;
			gbc_lblMonitor.insets = new Insets(0, 0, 5, 5);
			gbc_lblMonitor.gridx = 1;
			gbc_lblMonitor.gridy = 3;
			add(lblMonitor, gbc_lblMonitor);
		}
		{
			tfMonitorAc = new JTextField();
			tfMonitorAc.setEditable(false);
			GridBagConstraints gbc_tfMonitorAc = new GridBagConstraints();
			gbc_tfMonitorAc.insets = new Insets(0, 0, 5, 5);
			gbc_tfMonitorAc.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfMonitorAc.gridx = 2;
			gbc_tfMonitorAc.gridy = 3;
			add(tfMonitorAc, gbc_tfMonitorAc);
			tfMonitorAc.setColumns(10);
		}
		{
			lblCupoMnimo = new JLabel(MessagesLogin.getString("pnlFormActividades.lblCupoMnimo.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblCupoMnimo = new GridBagConstraints();
			gbc_lblCupoMnimo.anchor = GridBagConstraints.EAST;
			gbc_lblCupoMnimo.insets = new Insets(0, 0, 5, 5);
			gbc_lblCupoMnimo.gridx = 1;
			gbc_lblCupoMnimo.gridy = 5;
			add(lblCupoMnimo, gbc_lblCupoMnimo);
		}
		{
			tfCupoMinimoAc = new JTextField();
			tfCupoMinimoAc.setEditable(false);
			GridBagConstraints gbc_tfCupoMinimoAc = new GridBagConstraints();
			gbc_tfCupoMinimoAc.insets = new Insets(0, 0, 5, 5);
			gbc_tfCupoMinimoAc.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfCupoMinimoAc.gridx = 2;
			gbc_tfCupoMinimoAc.gridy = 5;
			add(tfCupoMinimoAc, gbc_tfCupoMinimoAc);
			tfCupoMinimoAc.setColumns(10);
		}
		{
			lblCupoMximo = new JLabel(MessagesLogin.getString("pnlFormActividades.lblCupoMximo.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblCupoMximo = new GridBagConstraints();
			gbc_lblCupoMximo.anchor = GridBagConstraints.EAST;
			gbc_lblCupoMximo.insets = new Insets(0, 0, 5, 5);
			gbc_lblCupoMximo.gridx = 1;
			gbc_lblCupoMximo.gridy = 7;
			add(lblCupoMximo, gbc_lblCupoMximo);
		}
		{
			tfCupoMaximoAc = new JTextField();
			tfCupoMaximoAc.setEditable(false);
			GridBagConstraints gbc_tfCupoMaximoAc = new GridBagConstraints();
			gbc_tfCupoMaximoAc.insets = new Insets(0, 0, 5, 5);
			gbc_tfCupoMaximoAc.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfCupoMaximoAc.gridx = 2;
			gbc_tfCupoMaximoAc.gridy = 7;
			add(tfCupoMaximoAc, gbc_tfCupoMaximoAc);
			tfCupoMaximoAc.setColumns(10);
		}
		{
			lblPrecioPorHora = new JLabel(MessagesLogin.getString("pnlFormActividades.lblPrecioPorHora.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblPrecioPorHora = new GridBagConstraints();
			gbc_lblPrecioPorHora.anchor = GridBagConstraints.EAST;
			gbc_lblPrecioPorHora.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrecioPorHora.gridx = 1;
			gbc_lblPrecioPorHora.gridy = 9;
			add(lblPrecioPorHora, gbc_lblPrecioPorHora);
		}
		{
			tfPrecioHoraAc = new JTextField();
			tfPrecioHoraAc.setEditable(false);
			GridBagConstraints gbc_tfPrecioHoraAc = new GridBagConstraints();
			gbc_tfPrecioHoraAc.insets = new Insets(0, 0, 5, 5);
			gbc_tfPrecioHoraAc.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfPrecioHoraAc.gridx = 2;
			gbc_tfPrecioHoraAc.gridy = 9;
			add(tfPrecioHoraAc, gbc_tfPrecioHoraAc);
			tfPrecioHoraAc.setColumns(10);
		}
		{
			lblDestinatarios = new JLabel(MessagesLogin.getString("pnlFormActividades.lblDestinatarios.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblDestinatarios = new GridBagConstraints();
			gbc_lblDestinatarios.anchor = GridBagConstraints.EAST;
			gbc_lblDestinatarios.insets = new Insets(0, 0, 5, 5);
			gbc_lblDestinatarios.gridx = 1;
			gbc_lblDestinatarios.gridy = 11;
			add(lblDestinatarios, gbc_lblDestinatarios);
		}
		{
			tfDestinatarioAc = new JTextField();
			tfDestinatarioAc.setEditable(false);
			tfDestinatarioAc.setColumns(10);
			GridBagConstraints gbc_tfDestinatarioAc = new GridBagConstraints();
			gbc_tfDestinatarioAc.insets = new Insets(0, 0, 5, 5);
			gbc_tfDestinatarioAc.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDestinatarioAc.gridx = 2;
			gbc_tfDestinatarioAc.gridy = 11;
			add(tfDestinatarioAc, gbc_tfDestinatarioAc);
		}
		{
			lblreaDelCamping = new JLabel(MessagesLogin.getString("pnlFormActividades.lblreaDelCamping.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblreaDelCamping = new GridBagConstraints();
			gbc_lblreaDelCamping.anchor = GridBagConstraints.EAST;
			gbc_lblreaDelCamping.insets = new Insets(0, 0, 5, 5);
			gbc_lblreaDelCamping.gridx = 1;
			gbc_lblreaDelCamping.gridy = 13;
			add(lblreaDelCamping, gbc_lblreaDelCamping);
		}
		{
			tfAreaCampingAc = new JTextField();
			tfAreaCampingAc.setEditable(false);
			GridBagConstraints gbc_tfAreaCampingAc = new GridBagConstraints();
			gbc_tfAreaCampingAc.anchor = GridBagConstraints.NORTH;
			gbc_tfAreaCampingAc.insets = new Insets(0, 0, 5, 5);
			gbc_tfAreaCampingAc.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfAreaCampingAc.gridx = 2;
			gbc_tfAreaCampingAc.gridy = 13;
			add(tfAreaCampingAc, gbc_tfAreaCampingAc);
			tfAreaCampingAc.setColumns(10);
		}
		{
			lblMaterialesNecesarios = new JLabel(MessagesLogin.getString("pnlFormActividades.lblMaterialesNecesarios.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblMaterialesNecesarios = new GridBagConstraints();
			gbc_lblMaterialesNecesarios.anchor = GridBagConstraints.NORTHEAST;
			gbc_lblMaterialesNecesarios.insets = new Insets(0, 0, 5, 5);
			gbc_lblMaterialesNecesarios.gridx = 1;
			gbc_lblMaterialesNecesarios.gridy = 15;
			add(lblMaterialesNecesarios, gbc_lblMaterialesNecesarios);
		}
		{
			textAreaMaterialesNecesariosAc = new JTextArea();
			textAreaMaterialesNecesariosAc.setWrapStyleWord(true);
			textAreaMaterialesNecesariosAc.setText((String) null);
			textAreaMaterialesNecesariosAc.setLineWrap(true);
			textAreaMaterialesNecesariosAc.setEditable(false);
			textAreaMaterialesNecesariosAc.setBackground(SystemColor.menu);
			GridBagConstraints gbc_textAreaMaterialesNecesariosAc = new GridBagConstraints();
			gbc_textAreaMaterialesNecesariosAc.insets = new Insets(0, 0, 5, 5);
			gbc_textAreaMaterialesNecesariosAc.fill = GridBagConstraints.BOTH;
			gbc_textAreaMaterialesNecesariosAc.gridx = 2;
			gbc_textAreaMaterialesNecesariosAc.gridy = 15;
			add(textAreaMaterialesNecesariosAc, gbc_textAreaMaterialesNecesariosAc);
		}
		{
			lblDescripcin = new JLabel(MessagesLogin.getString("pnlFormActividades.lblDescripcin.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
			gbc_lblDescripcin.anchor = GridBagConstraints.NORTHEAST;
			gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
			gbc_lblDescripcin.gridx = 1;
			gbc_lblDescripcin.gridy = 17;
			add(lblDescripcin, gbc_lblDescripcin);
		}
		{
			textAreaDescripcion = new JTextArea();
			textAreaDescripcion.setWrapStyleWord(true);
			textAreaDescripcion.setText((String) null);
			textAreaDescripcion.setEditable(false);
			textAreaDescripcion.setBackground(SystemColor.menu);
			GridBagConstraints gbc_textAreaDescripcion = new GridBagConstraints();
			gbc_textAreaDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_textAreaDescripcion.fill = GridBagConstraints.BOTH;
			gbc_textAreaDescripcion.gridx = 2;
			gbc_textAreaDescripcion.gridy = 17;
			add(textAreaDescripcion, gbc_textAreaDescripcion);
		}
		{
			lblFotoActividad = new JLabel(MessagesLogin.getString("pnlFormActividades.lblFotoActividad.text")); //$NON-NLS-1$
			lblFotoActividad.setVisible(false);
			{
				{
					{
						{
							{
								lblNombreYHorario = new JLabel(MessagesLogin.getString("pnlFormActividades.lblNombreYHorario.text")); //$NON-NLS-1$
								lblNombreYHorario.setIcon(new ImageIcon(pnlFormActividades.class
										.getResource("/Presentacion/Imagenes/calendar16x16.png")));
								lblNombreYHorario.setVisible(false);
								lblNombreYHorario.setFont(new Font("Tahoma", Font.BOLD, 19));
								GridBagConstraints gbc_lblNombreYHorario = new GridBagConstraints();
								gbc_lblNombreYHorario.insets = new Insets(0, 0, 5, 5);
								gbc_lblNombreYHorario.gridx = 1;
								gbc_lblNombreYHorario.gridy = 19;
								add(lblNombreYHorario, gbc_lblNombreYHorario);
							}
						}
						lblNombreAct = new JLabel(MessagesLogin.getString("pnlFormActividades.lblNombreAct.text")); //$NON-NLS-1$
						lblNombreAct.setVisible(false);
						lblNombreAct.setFont(new Font("Tahoma", Font.BOLD, 13));
						GridBagConstraints gbc_lblNombreAct = new GridBagConstraints();
						gbc_lblNombreAct.insets = new Insets(0, 0, 5, 5);
						gbc_lblNombreAct.anchor = GridBagConstraints.EAST;
						gbc_lblNombreAct.gridx = 1;
						gbc_lblNombreAct.gridy = 21;
						add(lblNombreAct, gbc_lblNombreAct);
					}
					txtNombreAct = new JTextField();
					txtNombreAct.setVisible(false);
					GridBagConstraints gbc_txtNombreAct = new GridBagConstraints();
					gbc_txtNombreAct.anchor = GridBagConstraints.NORTH;
					gbc_txtNombreAct.insets = new Insets(0, 0, 5, 5);
					gbc_txtNombreAct.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtNombreAct.gridx = 2;
					gbc_txtNombreAct.gridy = 21;
					add(txtNombreAct, gbc_txtNombreAct);
					txtNombreAct.setColumns(10);
				}
				lblHorarioAct = new JLabel(MessagesLogin.getString("pnlFormActividades.lblHorarioAct.text")); //$NON-NLS-1$
				lblHorarioAct.setVisible(false);
				lblHorarioAct.setFont(new Font("Tahoma", Font.BOLD, 13));
				GridBagConstraints gbc_lblHorarioAct = new GridBagConstraints();
				gbc_lblHorarioAct.insets = new Insets(0, 0, 5, 5);
				gbc_lblHorarioAct.anchor = GridBagConstraints.EAST;
				gbc_lblHorarioAct.gridx = 1;
				gbc_lblHorarioAct.gridy = 23;
				add(lblHorarioAct, gbc_lblHorarioAct);
			}
			txtHorario = new JTextField();
			txtHorario.setVisible(false);
			GridBagConstraints gbc_txtHorario = new GridBagConstraints();
			gbc_txtHorario.insets = new Insets(0, 0, 5, 5);
			gbc_txtHorario.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtHorario.gridx = 2;
			gbc_txtHorario.gridy = 23;
			add(txtHorario, gbc_txtHorario);
			txtHorario.setColumns(10);
			GridBagConstraints gbc_lblFotoActividad = new GridBagConstraints();
			gbc_lblFotoActividad.gridheight = 5;
			gbc_lblFotoActividad.fill = GridBagConstraints.VERTICAL;
			gbc_lblFotoActividad.insets = new Insets(0, 0, 0, 5);
			gbc_lblFotoActividad.gridx = 2;
			gbc_lblFotoActividad.gridy = 26;
			add(lblFotoActividad, gbc_lblFotoActividad);
		}
		{
			bntAddFoto = new JButton(MessagesLogin.getString("pnlFormActividades.bntAddFoto.text")); //$NON-NLS-1$
			bntAddFoto.setVisible(false);
			bntAddFoto.addActionListener(new BntAddFotoActionListener());
			bntAddFoto.setIcon(
					new ImageIcon(pnlFormActividades.class.getResource("/Presentacion/Imagenes/camera-add-icon.png")));
			GridBagConstraints gbc_bntAddFoto = new GridBagConstraints();
			gbc_bntAddFoto.insets = new Insets(0, 0, 5, 5);
			gbc_bntAddFoto.gridx = 1;
			gbc_bntAddFoto.gridy = 28;
			add(bntAddFoto, gbc_bntAddFoto);
		}
	}

	/**
	 * Clean.
	 */
	public void clean() {
		lblNombreActividad.setText(null);
		tfMonitorAc.setText(null);
		tfCupoMinimoAc.setText(null);
		tfCupoMaximoAc.setText(null);
		tfAreaCampingAc.setText(null);
		tfPrecioHoraAc.setText(null + " euros/hora");
		textAreaMaterialesNecesariosAc.setText(null);
		textAreaDescripcion.setText(null);
		txtNombreAct.setText(null);
		txtHorario.setText(null);

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

	/**
	 * Comprobar text areas.
	 *
	 * @return true, if successful
	 */
	public boolean comprobarTextAreas() {
		Component[] textFields = this.getComponents();
		boolean correcto = true;
		for (int i = 0; i < textFields.length; i++) {
			if (textFields[i] instanceof JTextArea) {
				if (((JTextArea) textFields[i]).getText().equals(null)) {
					((JTextArea) textFields[i]).setBorder(bordeMal);
					correcto = false;
				} else {
					((JTextArea) textFields[i]).setBorder(bordeBien);
				}
			}
		}

		return correcto;
	}

	/**
	 * Gets the datos actividad.
	 *
	 * @return the datos actividad
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public Actividad getDatosActividad() throws IOException {
		Actividad actividad = new Actividad();
		actividad.setNombre(lblNombreActividad.getText());
		actividad.readFromName();

		return actividad;
	}

	/**
	 * Load actividad.
	 *
	 * @param actividad the actividad
	 */
	public void loadActividad(Actividad actividad) {
		lblNombreActividad.setText(actividad.getNombre());
		lblIdAc.setText(Integer.toString(actividad.getId()));
		tfMonitorAc.setText(actividad.getEmpleado().getDni());
		tfCupoMinimoAc.setText(String.valueOf(actividad.getCupo_minimo()));
		tfCupoMaximoAc.setText(String.valueOf(actividad.getCupo_maximo()));
		tfAreaCampingAc.setText(actividad.getZona_camping());
		tfDestinatarioAc.setText(actividad.getDestinatario());
		tfPrecioHoraAc.setText(String.valueOf(actividad.getPrecio_hora()));
		textAreaMaterialesNecesariosAc.setText(actividad.getEquipamiento());
		textAreaDescripcion.setText(actividad.getDescripcion());
		txtNombreAct.setText(actividad.getNombre());
		txtHorario.setText(actividad.getHorario());
		lblFotoActividad.setText("");

		ImageIcon miniatura = null;
		try {
			miniatura = new ImageIcon(
					getClass().getClassLoader().getResource("Presentacion/Imagenes/" + actividad.getImagen()));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFotoActividad.setIcon(miniatura);
			lblFotoActividad.setToolTipText(actividad.getImagen());

		} catch (Exception e) {

			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/foto_random.jpg"));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFotoActividad.setIcon(miniatura);
			lblFotoActividad.setToolTipText("foto_random.jpg");
			actividad.setImagen("foto_random.jpg");

		}
	}

	/**
	 * Gets the datos actividad from user.
	 *
	 * @return the datos actividad from user
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public Actividad getDatosActividadFromUser() throws IOException {
		Empleado empleado = new Empleado();
		Actividad actividad = new Actividad();
		empleado.setDni(tfMonitorAc.getText().split(" ")[0].trim());
		empleado.read();
		actividad.setEmpleado(empleado);
		actividad.setId(Integer.parseInt(lblIdAc.getText()));
		actividad.setCupo_minimo(Integer.parseInt(tfCupoMinimoAc.getText()));
		actividad.setCupo_maximo(Integer.parseInt(tfCupoMaximoAc.getText()));
		actividad.setZona_camping(tfAreaCampingAc.getText());
		actividad.setDestinatario(tfDestinatarioAc.getText());
		actividad.setPrecio_hora(Double.parseDouble(tfPrecioHoraAc.getText()));
		actividad.setEquipamiento(textAreaMaterialesNecesariosAc.getText());
		actividad.setDescripcion(textAreaDescripcion.getText());
		actividad.setNombre(txtNombreAct.getText());
		actividad.setHorario(txtHorario.getText());
		actividad.setImagen(lblFotoActividad.getToolTipText().toString());

		return actividad;
	}

	/**
	 * Sets the components editables.
	 *
	 * @param editable the new components editables
	 */
	public void setComponentsEditables(boolean editable) {
		tfMonitorAc.setEditable(editable);
		tfCupoMinimoAc.setEditable(editable);
		tfCupoMaximoAc.setEditable(editable);
		tfAreaCampingAc.setEditable(editable);
		tfDestinatarioAc.setEditable(editable);
		tfPrecioHoraAc.setEditable(editable);
		textAreaMaterialesNecesariosAc.setEditable(editable);
		textAreaDescripcion.setEditable(editable);
		txtNombreAct.setVisible(editable);
		lblNombreAct.setVisible(editable);
		txtNombreAct.setEditable(editable);
		lblHorarioAct.setVisible(editable);
		txtHorario.setVisible(editable);
		txtHorario.setVisible(editable);
		bntAddFoto.setVisible(editable);
		lblFotoActividad.setVisible(editable);
		lblNombreActividad.setVisible(editable);

		if (editable) {
			textAreaDescripcion.setBackground(Color.WHITE);
			textAreaMaterialesNecesariosAc.setBackground(Color.WHITE);
		} else {
			textAreaMaterialesNecesariosAc.setBackground(color_menu);
			textAreaDescripcion.setBackground(color_menu);
			lblFotoActividad.setIcon(null);
			lblFotoActividad.setText("");
		}
	}

	/**
	 * The listener interface for receiving bntAddFotoAction events.
	 * The class that is interested in processing a bntAddFotoAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBntAddFotoActionListener<code> method. When
	 * the bntAddFotoAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BntAddFotoActionEvent
	 */
	private class BntAddFotoActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent arg0) {
			JFileChooser fcAbrir = new JFileChooser();
			fcAbrir.setFileFilter(new ImageFilter());
			int valorDevuelto = fcAbrir.showOpenDialog(framePrincipal);
			// Recoger el nombre del fichero seleccionado por el usuario
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();

				// Cargar Imagen del Cliente
				ImageIcon miniatura = null;
				lblFotoActividad.setText("");
				try {
					miniatura = new ImageIcon(file.getAbsolutePath());

				} catch (Exception e) {

					miniatura = new ImageIcon(
							getClass().getClassLoader().getResource("Presentacion/Imagenes/random_image.png"));

				} finally {
					Image image = miniatura.getImage();
					Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
					miniatura = new ImageIcon(newimg);
					lblFotoActividad.setIcon(miniatura);
					lblFotoActividad.setText(file.getAbsolutePath());
				}

			}
		}
	}
}
