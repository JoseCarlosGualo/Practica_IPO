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
import java.io.IOException;

public class pnlFormActividades extends JPanel {
	private JFrame framePrincipal;
	private JLabel lblNombreActividad;
	private JLabel lblMonitor;
	private JTextField tfMonitorAc;
	private JLabel lblCupoMnimo;
	private JTextField tfCupoMinimoAc;
	private JLabel lblCupoMximo;
	private JTextField tfCupoMaximoAc;
	private JLabel lblPrecioPorHora;
	private JTextField tfPrecioHoraAc;
	private JLabel lblreaDelCamping;
	private JTextField tfAreaCampingAc;
	private JLabel lblMaterialesNecesarios;
	private JLabel lblDescripcin;
	private JTextArea textAreaDescripcion;

	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private JTextArea textAreaMaterialesNecesariosAc;
	private JLabel lblDestinatarios;
	private JTextField tfDestinatarioAc;

	public pnlFormActividades(JFrame framePrincipal) {
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 15, 0, 240, 15, 0 };
		gridBagLayout.rowHeights = new int[] { 15, 0, 25, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblNombreActividad = new JLabel("Nombre Actividad");
			lblNombreActividad.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblNombreActividad = new GridBagConstraints();
			gbc_lblNombreActividad.anchor = GridBagConstraints.WEST;
			gbc_lblNombreActividad.gridwidth = 2;
			gbc_lblNombreActividad.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreActividad.gridx = 1;
			gbc_lblNombreActividad.gridy = 1;
			add(lblNombreActividad, gbc_lblNombreActividad);
		}
		{
			lblMonitor = new JLabel("Monitor: ");
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
			lblCupoMnimo = new JLabel("Cupo m\u00EDnimo: ");
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
			lblCupoMximo = new JLabel("Cupo m\u00E1ximo: ");
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
			lblPrecioPorHora = new JLabel("Precio por hora: ");
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
			lblDestinatarios = new JLabel("Destinatarios: ");
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
			lblreaDelCamping = new JLabel("\u00C1rea del Camping: ");
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
			lblMaterialesNecesarios = new JLabel("Materiales necesarios: ");
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
			textAreaMaterialesNecesariosAc.setOpaque(false);
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
			lblDescripcin = new JLabel("Descripci\u00F3n: ");
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
			textAreaDescripcion.setOpaque(false);
			textAreaDescripcion.setLineWrap(true);
			textAreaDescripcion.setEditable(false);
			textAreaDescripcion.setBackground(SystemColor.menu);
			GridBagConstraints gbc_textAreaDescripcion = new GridBagConstraints();
			gbc_textAreaDescripcion.insets = new Insets(0, 0, 5, 5);
			gbc_textAreaDescripcion.fill = GridBagConstraints.BOTH;
			gbc_textAreaDescripcion.gridx = 2;
			gbc_textAreaDescripcion.gridy = 17;
			add(textAreaDescripcion, gbc_textAreaDescripcion);
		}
	}

	public void clean() {
		lblNombreActividad.setText(null);
		tfMonitorAc.setText(null);
		tfCupoMinimoAc.setText(null);
		tfCupoMaximoAc.setText(null);
		tfAreaCampingAc.setText(null);
		tfPrecioHoraAc.setText(null + " euros/hora");
		textAreaMaterialesNecesariosAc.setText(null);
		textAreaDescripcion.setText(null);

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
	
	public Actividad getDatosActividad() throws IOException {
		Actividad actividad = new Actividad();
		actividad.setNombre(lblNombreActividad.getText());
		actividad.readFromName();

		return actividad;
	}

	public void loadActividad(Actividad actividad) {
		lblNombreActividad.setText(actividad.getNombre());
		tfMonitorAc.setText(actividad.getEmpleado().getNombre() + " " + actividad.getEmpleado().getApellidos());
		tfCupoMinimoAc.setText(String.valueOf(actividad.getCupo_minimo()));
		tfCupoMaximoAc.setText(String.valueOf(actividad.getCupo_maximo()));
		tfAreaCampingAc.setText(actividad.getZona_camping());
		tfDestinatarioAc.setText(actividad.getDestinatario());
		tfPrecioHoraAc.setText(String.valueOf(actividad.getPrecio_hora() + " euros/hora"));
		textAreaMaterialesNecesariosAc.setText(actividad.getEquipamiento());
		textAreaDescripcion.setText(actividad.getDescripcion());
	}
	
	public Empleado getDatosActividadFromUser() throws IOException {
		Empleado empleado = new Empleado();
		Actividad actividad = new Actividad();
		empleado.readFromName();
		actividad.setEmpleado(empleado);
		actividad.setCupo_minimo(Integer.parseInt(tfCupoMinimoAc.getText()));
		actividad.setCupo_maximo(Integer.parseInt(tfCupoMaximoAc.getText()));
		actividad.setZona_camping(tfAreaCampingAc.getText());
		actividad.setDestinatario(tfDestinatarioAc.getText());
		actividad.setPrecio_hora(Double.parseDouble(tfPrecioHoraAc.getText()));
		actividad.setEquipamiento(textAreaMaterialesNecesariosAc.getText());
		actividad.setDescripcion(textAreaDescripcion.getText());
		return empleado;
	}
	
	public void setComponentsEditables(boolean editable) {
		tfMonitorAc.setEditable(editable);
		tfCupoMinimoAc.setEditable(editable);
		tfCupoMaximoAc.setEditable(editable);
		tfAreaCampingAc.setEditable(editable);
		tfDestinatarioAc.setEditable(editable);
		tfPrecioHoraAc.setEditable(editable);
		textAreaMaterialesNecesariosAc.setEditable(editable);
		textAreaDescripcion.setEditable(editable);
	}

}
