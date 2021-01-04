package Presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Insets;
import java.io.IOException;

import java.text.*;
import java.util.*;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import Dominio.RutaSenderista;

import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.border.Border;

public class pnlFormRutas extends JPanel {
	private JLabel lblNombreRuta;
	private JLabel lblMonitor;
	private JLabel lblMnimo;
	private JLabel lblMximo;
	private JLabel lblGradoDeDificultad;
	private JLabel lblDa;
	private JLabel lblInicio;
	private JLabel lblFin;
	private JLabel lblEquipamiento;
	private JLabel lblDescripcin;
	private JLabel lblFotoDelItinerario;
	private JTextField tfMonitor;
	private JTextField tfDificultad;
	private JDateChooser chDia;
	private JSpinner spMin;
	private JSpinner spMax;
	private JTextField tfHoraInicio;
	private JTextField tfHoraFin;
	private JTextPane tfEquipamiento;
	private JTextPane tfDescripcion;
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private Border bordeOriginal;
	private JLabel lblFoto;

	/**
	 * Create the panel.
	 */
	public pnlFormRutas() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblNombreRuta = new JLabel("Nombre Ruta");
		lblNombreRuta.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 1;
		gbc_lblNombreRuta.gridy = 1;
		add(lblNombreRuta, gbc_lblNombreRuta);

		lblMonitor = new JLabel("Monitor:");
		GridBagConstraints gbc_lblMonitor = new GridBagConstraints();
		gbc_lblMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonitor.anchor = GridBagConstraints.EAST;
		gbc_lblMonitor.gridx = 1;
		gbc_lblMonitor.gridy = 3;
		add(lblMonitor, gbc_lblMonitor);

		tfMonitor = new JTextField();
		tfMonitor.setEditable(false);
		GridBagConstraints gbc_tfMonitor = new GridBagConstraints();
		gbc_tfMonitor.gridwidth = 9;
		gbc_tfMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_tfMonitor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMonitor.gridx = 2;
		gbc_tfMonitor.gridy = 3;
		add(tfMonitor, gbc_tfMonitor);
		tfMonitor.setColumns(10);

		lblMnimo = new JLabel("M�nimo:");
		GridBagConstraints gbc_lblMnimo = new GridBagConstraints();
		gbc_lblMnimo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMnimo.anchor = GridBagConstraints.EAST;
		gbc_lblMnimo.gridx = 1;
		gbc_lblMnimo.gridy = 5;
		add(lblMnimo, gbc_lblMnimo);

		spMin = new JSpinner();
		GridBagConstraints gbc_spMin = new GridBagConstraints();
		gbc_spMin.gridwidth = 3;
		gbc_spMin.anchor = GridBagConstraints.WEST;
		gbc_spMin.insets = new Insets(0, 0, 5, 5);
		gbc_spMin.gridx = 2;
		gbc_spMin.gridy = 5;
		add(spMin, gbc_spMin);

		lblMximo = new JLabel("M�ximo:");
		GridBagConstraints gbc_lblMximo = new GridBagConstraints();
		gbc_lblMximo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMximo.anchor = GridBagConstraints.EAST;
		gbc_lblMximo.gridx = 7;
		gbc_lblMximo.gridy = 5;
		add(lblMximo, gbc_lblMximo);

		spMax = new JSpinner();
		GridBagConstraints gbc_spMax = new GridBagConstraints();
		gbc_spMax.anchor = GridBagConstraints.WEST;
		gbc_spMax.insets = new Insets(0, 0, 5, 5);
		gbc_spMax.gridx = 8;
		gbc_spMax.gridy = 5;
		add(spMax, gbc_spMax);

		lblGradoDeDificultad = new JLabel("Grado de dificultad");
		GridBagConstraints gbc_lblGradoDeDificultad = new GridBagConstraints();
		gbc_lblGradoDeDificultad.anchor = GridBagConstraints.EAST;
		gbc_lblGradoDeDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_lblGradoDeDificultad.gridx = 1;
		gbc_lblGradoDeDificultad.gridy = 7;
		add(lblGradoDeDificultad, gbc_lblGradoDeDificultad);

		tfDificultad = new JTextField();
		tfDificultad.setEditable(false);
		GridBagConstraints gbc_tfDificultad = new GridBagConstraints();
		gbc_tfDificultad.gridwidth = 2;
		gbc_tfDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_tfDificultad.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDificultad.gridx = 2;
		gbc_tfDificultad.gridy = 7;
		add(tfDificultad, gbc_tfDificultad);
		tfDificultad.setColumns(10);

		lblDa = new JLabel("D�a");
		GridBagConstraints gbc_lblDa = new GridBagConstraints();
		gbc_lblDa.anchor = GridBagConstraints.EAST;
		gbc_lblDa.insets = new Insets(0, 0, 5, 5);
		gbc_lblDa.gridx = 1;
		gbc_lblDa.gridy = 9;
		add(lblDa, gbc_lblDa);

		chDia = new JDateChooser();
		GridBagConstraints gbc_chDia = new GridBagConstraints();
		gbc_chDia.gridwidth = 4;
		gbc_chDia.insets = new Insets(0, 0, 5, 5);
		gbc_chDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_chDia.gridx = 2;
		gbc_chDia.gridy = 9;
		add(chDia, gbc_chDia);

		lblInicio = new JLabel("Inicio:");
		GridBagConstraints gbc_lblInicio = new GridBagConstraints();
		gbc_lblInicio.anchor = GridBagConstraints.EAST;
		gbc_lblInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblInicio.gridx = 8;
		gbc_lblInicio.gridy = 9;
		add(lblInicio, gbc_lblInicio);

		tfHoraInicio = new JTextField();
		tfHoraInicio.setEditable(false);
		GridBagConstraints gbc_tfHoraInicio = new GridBagConstraints();
		gbc_tfHoraInicio.gridwidth = 2;
		gbc_tfHoraInicio.insets = new Insets(0, 0, 5, 5);
		gbc_tfHoraInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfHoraInicio.gridx = 9;
		gbc_tfHoraInicio.gridy = 9;
		add(tfHoraInicio, gbc_tfHoraInicio);
		tfHoraInicio.setColumns(10);

		lblFin = new JLabel("Fin:");
		GridBagConstraints gbc_lblFin = new GridBagConstraints();
		gbc_lblFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFin.gridx = 12;
		gbc_lblFin.gridy = 9;
		add(lblFin, gbc_lblFin);

		tfHoraFin = new JTextField();
		tfHoraFin.setEditable(false);
		GridBagConstraints gbc_tfHoraFin = new GridBagConstraints();
		gbc_tfHoraFin.gridwidth = 2;
		gbc_tfHoraFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfHoraFin.insets = new Insets(0, 0, 5, 5);
		gbc_tfHoraFin.gridx = 13;
		gbc_tfHoraFin.gridy = 9;
		add(tfHoraFin, gbc_tfHoraFin);
		tfHoraFin.setColumns(10);

		lblEquipamiento = new JLabel("Equipamiento:");
		GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
		gbc_lblEquipamiento.anchor = GridBagConstraints.EAST;
		gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamiento.gridx = 1;
		gbc_lblEquipamiento.gridy = 11;
		add(lblEquipamiento, gbc_lblEquipamiento);

		tfEquipamiento = new JTextPane();
		tfEquipamiento.setEditable(false);
		GridBagConstraints gbc_tfEquipamiento = new GridBagConstraints();
		gbc_tfEquipamiento.gridwidth = 20;
		gbc_tfEquipamiento.gridheight = 3;
		gbc_tfEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_tfEquipamiento.fill = GridBagConstraints.BOTH;
		gbc_tfEquipamiento.gridx = 2;
		gbc_tfEquipamiento.gridy = 11;
		add(tfEquipamiento, gbc_tfEquipamiento);

		lblDescripcin = new JLabel("Descripci�n:");
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 15;
		add(lblDescripcin, gbc_lblDescripcin);

		tfDescripcion = new JTextPane();
		tfDescripcion.setEditable(false);
		GridBagConstraints gbc_tfDescripcion = new GridBagConstraints();
		gbc_tfDescripcion.gridheight = 2;
		gbc_tfDescripcion.gridwidth = 20;
		gbc_tfDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_tfDescripcion.fill = GridBagConstraints.BOTH;
		gbc_tfDescripcion.gridx = 2;
		gbc_tfDescripcion.gridy = 15;
		add(tfDescripcion, gbc_tfDescripcion);

		lblFotoDelItinerario = new JLabel("Foto del itinerario:");
		lblFotoDelItinerario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblFotoDelItinerario = new GridBagConstraints();
		gbc_lblFotoDelItinerario.anchor = GridBagConstraints.EAST;
		gbc_lblFotoDelItinerario.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoDelItinerario.gridx = 1;
		gbc_lblFotoDelItinerario.gridy = 18;
		add(lblFotoDelItinerario, gbc_lblFotoDelItinerario);

		lblFoto = new JLabel("");
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridheight = 4;
		gbc_lblFoto.gridwidth = 19;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 2;
		gbc_lblFoto.gridy = 18;
		add(lblFoto, gbc_lblFoto);

	}

	public void clean() {
		tfDescripcion.setText("");
		tfDificultad.setText("");
		tfEquipamiento.setText("");
		tfHoraFin.setText("");
		tfHoraInicio.setText("");
		tfMonitor.setText("");
		chDia.cleanup();
		spMax.setValue(0);
		spMin.setValue(0);
		lblFoto.setIcon(null);

		Component[] jtexts = this.getComponents();
		for (int i = 0; i < jtexts.length; i++) {
			if (jtexts[i] instanceof JTextField || jtexts[i] instanceof JTextPane) {
				((JTextField) jtexts[i]).setBorder(bordeOriginal);
			}

		}
	}

	public void setComponentsEditables(boolean editable) {

		tfDescripcion.setEditable(editable);
		tfDificultad.setEditable(editable);
		tfEquipamiento.setEditable(editable);
		tfHoraFin.setEditable(editable);
		tfHoraInicio.setEditable(editable);
		tfMonitor.setEditable(editable);

	}

	public RutaSenderista getDatosRuta() throws IOException {
		RutaSenderista ruta = new RutaSenderista();
		ruta.setNombre(lblNombreRuta.getText());
		ruta.read();

		return ruta;
	}

	/*
	 * public RutaSenderista getDatosRutaFromUser() throws IOException {
	 * RutaSenderista ruta = new RutaSenderista();
	 * ruta.setNombre(tfNombreEm.getText()); ruta.setDni(tfDniEm.getText());
	 * ruta.setApellidos(tfApellidosEm.getText());
	 * ruta.setTelefono(tfTelefonoEm.getText());
	 * ruta.setEmail(tfCorreoEm.getText()); ruta.setIdiomas(tfIdiomasEm.getText());
	 * ruta.setFormacion(textFormacionEm.getText());
	 * ruta.setImagen(lblFoto.getToolTipText().toString()); return ruta; }
	 */

	public void loadRuta(RutaSenderista ruta) throws ParseException {
		tfDescripcion.setText(ruta.getDescripcion());
		tfDificultad.setText(ruta.getGrado_dificultad());
		tfEquipamiento.setText(ruta.getEquipamiento());
		tfHoraFin.setText(ruta.getHora_fin());
		tfHoraInicio.setText(ruta.getHora_inicio());
		tfMonitor.setText(ruta.getMonitor().getNombre() + " " + ruta.getMonitor().getApellidos());
		spMax.setValue(ruta.getPersonas_max());
		;
		spMin.setValue(ruta.getPersonas_min());
		;
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(ruta.getDia());
		chDia.setDate(date);

		ImageIcon miniatura = null;
		lblFoto.setText("");
		try {
			miniatura = new ImageIcon(
					getClass().getClassLoader().getResource("Presentacion/Imagenes/" + ruta.getFoto()));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFoto.setIcon(miniatura);
			lblFoto.setToolTipText(ruta.getFoto());

		} catch (Exception e) {

			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/mapa.jpg"));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFoto.setIcon(miniatura);
			lblFoto.setToolTipText("mapa.jpg");
			ruta.setFoto("mapa.jpg");

		}
	}

}