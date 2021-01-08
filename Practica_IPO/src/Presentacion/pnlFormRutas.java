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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

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
	private JLabel lblInformacinDeLa;

	/**
	 * Create the panel.
	 */
	public pnlFormRutas() {
		setBorder(UIManager.getBorder("InternalFrame.border"));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 17, 173, 0, 0, 0, 0, 0, 0, 30, -17, 0, 33, 40, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 20, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		lblNombreRuta = new JLabel(MessagesLogin.getString("pnlFormRutas.lblNombreRuta.text")); //$NON-NLS-1$
		lblNombreRuta.setForeground(Color.BLUE);
		lblNombreRuta.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 22));
		GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
		gbc_lblNombreRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNombreRuta.gridwidth = 12;
		gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreRuta.gridx = 1;
		gbc_lblNombreRuta.gridy = 1;
		add(lblNombreRuta, gbc_lblNombreRuta);

		lblInformacinDeLa = new JLabel(MessagesLogin.getString("pnlFormRutas.lblInformacinDeLa.text")); //$NON-NLS-1$
		lblInformacinDeLa
				.setIcon(new ImageIcon(pnlFormRutas.class.getResource("/Presentacion/Imagenes/informacion.png")));
		lblInformacinDeLa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		GridBagConstraints gbc_lblInformacinDeLa = new GridBagConstraints();
		gbc_lblInformacinDeLa.gridwidth = 11;
		gbc_lblInformacinDeLa.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblInformacinDeLa.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacinDeLa.gridx = 1;
		gbc_lblInformacinDeLa.gridy = 3;
		add(lblInformacinDeLa, gbc_lblInformacinDeLa);

		lblMonitor = new JLabel(MessagesLogin.getString("pnlFormRutas.lblMonitor.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMonitor = new GridBagConstraints();
		gbc_lblMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonitor.anchor = GridBagConstraints.EAST;
		gbc_lblMonitor.gridx = 1;
		gbc_lblMonitor.gridy = 5;
		add(lblMonitor, gbc_lblMonitor);

		tfMonitor = new JTextField();
		tfMonitor.setEditable(false);
		GridBagConstraints gbc_tfMonitor = new GridBagConstraints();
		gbc_tfMonitor.gridwidth = 10;
		gbc_tfMonitor.insets = new Insets(0, 0, 5, 5);
		gbc_tfMonitor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMonitor.gridx = 2;
		gbc_tfMonitor.gridy = 5;
		add(tfMonitor, gbc_tfMonitor);
		tfMonitor.setColumns(10);

		lblMnimo = new JLabel(MessagesLogin.getString("pnlFormRutas.lblMnimo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMnimo = new GridBagConstraints();
		gbc_lblMnimo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMnimo.anchor = GridBagConstraints.EAST;
		gbc_lblMnimo.gridx = 1;
		gbc_lblMnimo.gridy = 7;
		add(lblMnimo, gbc_lblMnimo);

		spMin = new JSpinner();
		spMin.setEnabled(false);
		GridBagConstraints gbc_spMin = new GridBagConstraints();
		gbc_spMin.gridwidth = 3;
		gbc_spMin.anchor = GridBagConstraints.WEST;
		gbc_spMin.insets = new Insets(0, 0, 5, 5);
		gbc_spMin.gridx = 2;
		gbc_spMin.gridy = 7;
		add(spMin, gbc_spMin);

		lblMximo = new JLabel(MessagesLogin.getString("pnlFormRutas.lblMximo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblMximo = new GridBagConstraints();
		gbc_lblMximo.insets = new Insets(0, 0, 5, 5);
		gbc_lblMximo.anchor = GridBagConstraints.EAST;
		gbc_lblMximo.gridx = 7;
		gbc_lblMximo.gridy = 7;
		add(lblMximo, gbc_lblMximo);

		spMax = new JSpinner();
		spMax.setEnabled(false);
		GridBagConstraints gbc_spMax = new GridBagConstraints();
		gbc_spMax.anchor = GridBagConstraints.WEST;
		gbc_spMax.insets = new Insets(0, 0, 5, 5);
		gbc_spMax.gridx = 8;
		gbc_spMax.gridy = 7;
		add(spMax, gbc_spMax);

		lblGradoDeDificultad = new JLabel(MessagesLogin.getString("pnlFormRutas.lblGradoDeDificultad.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblGradoDeDificultad = new GridBagConstraints();
		gbc_lblGradoDeDificultad.anchor = GridBagConstraints.EAST;
		gbc_lblGradoDeDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_lblGradoDeDificultad.gridx = 1;
		gbc_lblGradoDeDificultad.gridy = 9;
		add(lblGradoDeDificultad, gbc_lblGradoDeDificultad);

		tfDificultad = new JTextField();
		tfDificultad.setEditable(false);
		GridBagConstraints gbc_tfDificultad = new GridBagConstraints();
		gbc_tfDificultad.gridwidth = 5;
		gbc_tfDificultad.insets = new Insets(0, 0, 5, 5);
		gbc_tfDificultad.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDificultad.gridx = 2;
		gbc_tfDificultad.gridy = 9;
		add(tfDificultad, gbc_tfDificultad);
		tfDificultad.setColumns(10);

		lblDa = new JLabel(MessagesLogin.getString("pnlFormRutas.lblDa.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDa = new GridBagConstraints();
		gbc_lblDa.anchor = GridBagConstraints.EAST;
		gbc_lblDa.insets = new Insets(0, 0, 5, 5);
		gbc_lblDa.gridx = 1;
		gbc_lblDa.gridy = 11;
		add(lblDa, gbc_lblDa);

		chDia = new JDateChooser();
		GridBagConstraints gbc_chDia = new GridBagConstraints();
		gbc_chDia.gridwidth = 5;
		gbc_chDia.insets = new Insets(0, 0, 5, 5);
		gbc_chDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_chDia.gridx = 2;
		gbc_chDia.gridy = 11;
		add(chDia, gbc_chDia);

		lblInicio = new JLabel(MessagesLogin.getString("pnlFormRutas.lblInicio.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblInicio = new GridBagConstraints();
		gbc_lblInicio.anchor = GridBagConstraints.EAST;
		gbc_lblInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblInicio.gridx = 7;
		gbc_lblInicio.gridy = 11;
		add(lblInicio, gbc_lblInicio);

		tfHoraInicio = new JTextField();
		tfHoraInicio.setEditable(false);
		GridBagConstraints gbc_tfHoraInicio = new GridBagConstraints();
		gbc_tfHoraInicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfHoraInicio.insets = new Insets(0, 0, 5, 5);
		gbc_tfHoraInicio.gridx = 8;
		gbc_tfHoraInicio.gridy = 11;
		add(tfHoraInicio, gbc_tfHoraInicio);
		tfHoraInicio.setColumns(10);

		lblFin = new JLabel(MessagesLogin.getString("pnlFormRutas.lblFin.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFin = new GridBagConstraints();
		gbc_lblFin.anchor = GridBagConstraints.EAST;
		gbc_lblFin.insets = new Insets(0, 0, 5, 5);
		gbc_lblFin.gridx = 10;
		gbc_lblFin.gridy = 11;
		add(lblFin, gbc_lblFin);

		tfHoraFin = new JTextField();
		tfHoraFin.setEditable(false);
		GridBagConstraints gbc_tfHoraFin = new GridBagConstraints();
		gbc_tfHoraFin.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfHoraFin.insets = new Insets(0, 0, 5, 5);
		gbc_tfHoraFin.gridx = 11;
		gbc_tfHoraFin.gridy = 11;
		add(tfHoraFin, gbc_tfHoraFin);
		tfHoraFin.setColumns(10);

		lblEquipamiento = new JLabel(MessagesLogin.getString("pnlFormRutas.lblEquipamiento.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
		gbc_lblEquipamiento.anchor = GridBagConstraints.EAST;
		gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipamiento.gridx = 1;
		gbc_lblEquipamiento.gridy = 13;
		add(lblEquipamiento, gbc_lblEquipamiento);

		tfEquipamiento = new JTextPane();
		tfEquipamiento.setBackground(SystemColor.menu);
		tfEquipamiento.setEditable(false);
		GridBagConstraints gbc_tfEquipamiento = new GridBagConstraints();
		gbc_tfEquipamiento.anchor = GridBagConstraints.NORTH;
		gbc_tfEquipamiento.gridwidth = 10;
		gbc_tfEquipamiento.gridheight = 3;
		gbc_tfEquipamiento.insets = new Insets(0, 0, 5, 5);
		gbc_tfEquipamiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEquipamiento.gridx = 2;
		gbc_tfEquipamiento.gridy = 13;
		add(tfEquipamiento, gbc_tfEquipamiento);

		lblDescripcin = new JLabel(MessagesLogin.getString("pnlFormRutas.lblDescripcin.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.anchor = GridBagConstraints.EAST;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcin.gridx = 1;
		gbc_lblDescripcin.gridy = 17;
		add(lblDescripcin, gbc_lblDescripcin);

		tfDescripcion = new JTextPane();
		tfDescripcion.setBackground(SystemColor.menu);
		tfDescripcion.setEditable(false);
		GridBagConstraints gbc_tfDescripcion = new GridBagConstraints();
		gbc_tfDescripcion.anchor = GridBagConstraints.NORTH;
		gbc_tfDescripcion.gridheight = 2;
		gbc_tfDescripcion.gridwidth = 10;
		gbc_tfDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_tfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDescripcion.gridx = 2;
		gbc_tfDescripcion.gridy = 17;
		add(tfDescripcion, gbc_tfDescripcion);

		lblFotoDelItinerario = new JLabel(MessagesLogin.getString("pnlFormRutas.lblFotoDelItinerario.text")); //$NON-NLS-1$
		lblFotoDelItinerario
				.setIcon(new ImageIcon(pnlFormRutas.class.getResource("/Presentacion/Imagenes/icono_foto.jpg")));
		lblFotoDelItinerario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		GridBagConstraints gbc_lblFotoDelItinerario = new GridBagConstraints();
		gbc_lblFotoDelItinerario.gridwidth = 2;
		gbc_lblFotoDelItinerario.anchor = GridBagConstraints.EAST;
		gbc_lblFotoDelItinerario.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoDelItinerario.gridx = 1;
		gbc_lblFotoDelItinerario.gridy = 20;
		add(lblFotoDelItinerario, gbc_lblFotoDelItinerario);

		lblFoto = new JLabel(); // $NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 10;
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.insets = new Insets(0, 0, 0, 5);
		gbc_lblFoto.gridx = 2;
		gbc_lblFoto.gridy = 21;
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

	public void loadRuta(RutaSenderista ruta) throws ParseException {
		lblNombreRuta.setText(ruta.getNombre());
		tfDescripcion.setText(ruta.getDescripcion());
		tfDificultad.setText(ruta.getGrado_dificultad());
		tfEquipamiento.setText(ruta.getEquipamiento());
		tfHoraFin.setText(ruta.getHora_fin());
		tfHoraInicio.setText(ruta.getHora_inicio());
		tfMonitor.setText(ruta.getMonitor().getNombre() + " " + ruta.getMonitor().getApellidos());
		spMax.setValue(ruta.getPersonas_max());
		spMin.setValue(ruta.getPersonas_min());

		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(ruta.getDia());
		chDia.setDate(date);
		chDia.setEnabled(false);

		ImageIcon miniatura = null;
		lblFoto.setText("");
		try {
			miniatura = new ImageIcon(
					getClass().getClassLoader().getResource("Presentacion/Imagenes/" + ruta.getFoto()));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH);
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