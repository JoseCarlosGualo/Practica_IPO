package Presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Dominio.Reserva;

import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.JSpinner;
import com.toedter.components.JSpinField;
import javax.swing.ImageIcon;
import javax.swing.SpinnerNumberModel;

/**
 * The Class pnlFormReserva.
 */
public class pnlFormReserva extends JPanel {

	/** The borde mal. */
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	
	/** The borde bien. */
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	
	/** The frame principal. */
	private JFrame framePrincipal;
	
	/** The lbl datos personales. */
	private JLabel lblDatosPersonales;
	
	/** The lbl nombre. */
	private JLabel lblNombre;
	
	/** The lbl dni. */
	private JLabel lblDni;
	
	/** The lbl telfono. */
	private JLabel lblTelfono;
	
	/** The lbl email. */
	private JLabel lblEmail;
	
	/** The lbl hora de entrada. */
	private JLabel lblHoraDeEntrada;
	
	/** The lbl fecha de salida. */
	private JLabel lblFechaDeSalida;
	
	/** The lbl hora de salida. */
	private JLabel lblHoraDeSalida;
	
	/** The lbl nmero de ocupantes. */
	private JLabel lblNmeroDeOcupantes;
	
	/** The lbl peticiones especiales. */
	private JLabel lblPeticionesEspeciales;
	
	/** The text peticiones especiales. */
	private JTextArea textPeticionesEspeciales;
	
	/** The d C fecha salida. */
	private JDateChooser dCFechaSalida;
	
	/** The d C fecha entrada. */
	private JDateChooser dCFechaEntrada;
	
	/** The spinner ocupantes. */
	private JSpinner spinnerOcupantes;
	
	/** The lbl fecha de entrada. */
	private JLabel lblFechaDeEntrada;
	
	/** The spin field. */
	private JSpinField spinField;
	
	/** The tf nombre res. */
	private JTextField tfNombreRes;
	
	/** The tf dni res. */
	private JTextField tfDniRes;
	
	/** The tf tlf res. */
	private JTextField tfTlfRes;
	
	/** The tf email res. */
	private JTextField tfEmailRes;
	
	/** The tf hora entrada. */
	private JTextField tfHoraEntrada;
	
	/** The tf hora salida. */
	private JTextField tfHoraSalida;
	
	/** The lbl datos reserva. */
	private JLabel lblDatosReserva;

	/**
	 * Create the panel.
	 *
	 * @param framePrincipal the frame principal
	 */
	public pnlFormReserva(JFrame framePrincipal) {
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 146, 318, 0, 10, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 10, 0, 15, 0, 15, 10, 0, 10, 15, 0, 0, 0, 0, 15, 0, 15, 0, 15, 0,
				10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblDatosPersonales = new JLabel(MessagesLogin.getString("pnlFormReserva.lblDatosPersonales.text")); //$NON-NLS-1$
			lblDatosPersonales
					.setIcon(new ImageIcon(pnlFormReserva.class.getResource("/Presentacion/Imagenes/hombre.png")));
			lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
			gbc_lblDatosPersonales.gridwidth = 2;
			gbc_lblDatosPersonales.anchor = GridBagConstraints.WEST;
			gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
			gbc_lblDatosPersonales.gridx = 1;
			gbc_lblDatosPersonales.gridy = 1;
			add(lblDatosPersonales, gbc_lblDatosPersonales);
		}
		{
			lblNombre = new JLabel(MessagesLogin.getString("pnlFormReserva.lblNombre.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.EAST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 1;
			gbc_lblNombre.gridy = 3;
			add(lblNombre, gbc_lblNombre);
		}
		{
			tfNombreRes = new JTextField();
			tfNombreRes.setEditable(false);
			tfNombreRes.setColumns(10);
			GridBagConstraints gbc_tfNombreRes = new GridBagConstraints();
			gbc_tfNombreRes.insets = new Insets(0, 0, 5, 5);
			gbc_tfNombreRes.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNombreRes.gridx = 2;
			gbc_tfNombreRes.gridy = 3;
			add(tfNombreRes, gbc_tfNombreRes);
		}
		{
			lblDni = new JLabel(MessagesLogin.getString("pnlFormReserva.lblDni.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.anchor = GridBagConstraints.EAST;
			gbc_lblDni.gridx = 1;
			gbc_lblDni.gridy = 4;
			add(lblDni, gbc_lblDni);
		}
		{
			tfDniRes = new JTextField();
			tfDniRes.setEditable(false);
			tfDniRes.setColumns(10);
			GridBagConstraints gbc_tfDniRes = new GridBagConstraints();
			gbc_tfDniRes.insets = new Insets(0, 0, 5, 5);
			gbc_tfDniRes.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfDniRes.gridx = 2;
			gbc_tfDniRes.gridy = 4;
			add(tfDniRes, gbc_tfDniRes);
		}
		{
			lblTelfono = new JLabel(MessagesLogin.getString("pnlFormReserva.lblTelfono.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.anchor = GridBagConstraints.EAST;
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 5;
			add(lblTelfono, gbc_lblTelfono);
		}
		{
			tfTlfRes = new JTextField();
			tfTlfRes.setEditable(false);
			tfTlfRes.setColumns(10);
			GridBagConstraints gbc_tfTlfRes = new GridBagConstraints();
			gbc_tfTlfRes.insets = new Insets(0, 0, 5, 5);
			gbc_tfTlfRes.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTlfRes.gridx = 2;
			gbc_tfTlfRes.gridy = 5;
			add(tfTlfRes, gbc_tfTlfRes);
		}
		{
			lblEmail = new JLabel(MessagesLogin.getString("pnlFormReserva.lblEmail.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblEmail = new GridBagConstraints();
			gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail.anchor = GridBagConstraints.EAST;
			gbc_lblEmail.gridx = 1;
			gbc_lblEmail.gridy = 6;
			add(lblEmail, gbc_lblEmail);
		}
		{
			tfEmailRes = new JTextField();
			tfEmailRes.setEditable(false);
			tfEmailRes.setColumns(10);
			GridBagConstraints gbc_tfEmailRes = new GridBagConstraints();
			gbc_tfEmailRes.insets = new Insets(0, 0, 5, 5);
			gbc_tfEmailRes.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfEmailRes.gridx = 2;
			gbc_tfEmailRes.gridy = 6;
			add(tfEmailRes, gbc_tfEmailRes);
		}
		{
			lblDatosReserva = new JLabel(MessagesLogin.getString("pnlFormReserva.lblDatosReserva.text")); //$NON-NLS-1$
			lblDatosReserva.setIcon(
					new ImageIcon(pnlFormReserva.class.getResource("/Presentacion/Imagenes/calendar16x16.png")));
			lblDatosReserva.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblDatosReserva = new GridBagConstraints();
			gbc_lblDatosReserva.anchor = GridBagConstraints.WEST;
			gbc_lblDatosReserva.gridwidth = 2;
			gbc_lblDatosReserva.insets = new Insets(0, 0, 5, 5);
			gbc_lblDatosReserva.gridx = 1;
			gbc_lblDatosReserva.gridy = 8;
			add(lblDatosReserva, gbc_lblDatosReserva);
		}
		{
			lblFechaDeEntrada = new JLabel(MessagesLogin.getString("pnlFormReserva.lblFechaDeEntrada.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblFechaDeEntrada = new GridBagConstraints();
			gbc_lblFechaDeEntrada.anchor = GridBagConstraints.EAST;
			gbc_lblFechaDeEntrada.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaDeEntrada.gridx = 1;
			gbc_lblFechaDeEntrada.gridy = 10;
			add(lblFechaDeEntrada, gbc_lblFechaDeEntrada);
		}
		{
			dCFechaEntrada = new JDateChooser();
			GridBagConstraints gbc_dCFechaEntrada = new GridBagConstraints();
			gbc_dCFechaEntrada.fill = GridBagConstraints.HORIZONTAL;
			gbc_dCFechaEntrada.insets = new Insets(0, 0, 5, 5);
			gbc_dCFechaEntrada.gridx = 2;
			gbc_dCFechaEntrada.gridy = 10;
			add(dCFechaEntrada, gbc_dCFechaEntrada);
		}
		{
			lblHoraDeEntrada = new JLabel(MessagesLogin.getString("pnlFormReserva.lblHoraDeEntrada.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblHoraDeEntrada = new GridBagConstraints();
			gbc_lblHoraDeEntrada.anchor = GridBagConstraints.EAST;
			gbc_lblHoraDeEntrada.insets = new Insets(0, 0, 5, 5);
			gbc_lblHoraDeEntrada.gridx = 1;
			gbc_lblHoraDeEntrada.gridy = 11;
			add(lblHoraDeEntrada, gbc_lblHoraDeEntrada);
		}
		{
			tfHoraEntrada = new JTextField();
			tfHoraEntrada.setEditable(false);
			tfHoraEntrada.setColumns(10);
			GridBagConstraints gbc_tfHoraEntrada = new GridBagConstraints();
			gbc_tfHoraEntrada.insets = new Insets(0, 0, 5, 5);
			gbc_tfHoraEntrada.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfHoraEntrada.gridx = 2;
			gbc_tfHoraEntrada.gridy = 11;
			add(tfHoraEntrada, gbc_tfHoraEntrada);
		}
		{
			lblFechaDeSalida = new JLabel(MessagesLogin.getString("pnlFormReserva.lblFechaDeSalida.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblFechaDeSalida = new GridBagConstraints();
			gbc_lblFechaDeSalida.anchor = GridBagConstraints.EAST;
			gbc_lblFechaDeSalida.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaDeSalida.gridx = 1;
			gbc_lblFechaDeSalida.gridy = 12;
			add(lblFechaDeSalida, gbc_lblFechaDeSalida);
		}
		{
			dCFechaSalida = new JDateChooser();
			GridBagConstraints gbc_dCFechaSalida = new GridBagConstraints();
			gbc_dCFechaSalida.fill = GridBagConstraints.HORIZONTAL;
			gbc_dCFechaSalida.insets = new Insets(0, 0, 5, 5);
			gbc_dCFechaSalida.gridx = 2;
			gbc_dCFechaSalida.gridy = 12;
			add(dCFechaSalida, gbc_dCFechaSalida);
		}
		{
			lblHoraDeSalida = new JLabel(MessagesLogin.getString("pnlFormReserva.lblHoraDeSalida.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblHoraDeSalida = new GridBagConstraints();
			gbc_lblHoraDeSalida.anchor = GridBagConstraints.EAST;
			gbc_lblHoraDeSalida.insets = new Insets(0, 0, 5, 5);
			gbc_lblHoraDeSalida.gridx = 1;
			gbc_lblHoraDeSalida.gridy = 13;
			add(lblHoraDeSalida, gbc_lblHoraDeSalida);
		}
		{
			tfHoraSalida = new JTextField();
			tfHoraSalida.setEditable(false);
			tfHoraSalida.setColumns(10);
			GridBagConstraints gbc_tfHoraSalida = new GridBagConstraints();
			gbc_tfHoraSalida.insets = new Insets(0, 0, 5, 5);
			gbc_tfHoraSalida.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfHoraSalida.gridx = 2;
			gbc_tfHoraSalida.gridy = 13;
			add(tfHoraSalida, gbc_tfHoraSalida);
		}
		{
			lblNmeroDeOcupantes = new JLabel(MessagesLogin.getString("pnlFormReserva.lblNmeroDeOcupantes.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblNmeroDeOcupantes = new GridBagConstraints();
			gbc_lblNmeroDeOcupantes.anchor = GridBagConstraints.EAST;
			gbc_lblNmeroDeOcupantes.insets = new Insets(0, 0, 5, 5);
			gbc_lblNmeroDeOcupantes.gridx = 1;
			gbc_lblNmeroDeOcupantes.gridy = 14;
			add(lblNmeroDeOcupantes, gbc_lblNmeroDeOcupantes);
		}
		{
			spinnerOcupantes = new JSpinner();
			spinnerOcupantes.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spinnerOcupantes.setEnabled(false);
			GridBagConstraints gbc_spinnerOcupantes = new GridBagConstraints();
			gbc_spinnerOcupantes.anchor = GridBagConstraints.WEST;
			gbc_spinnerOcupantes.insets = new Insets(0, 0, 5, 5);
			gbc_spinnerOcupantes.gridx = 2;
			gbc_spinnerOcupantes.gridy = 14;
			add(spinnerOcupantes, gbc_spinnerOcupantes);
		}
		{
			lblPeticionesEspeciales = new JLabel(
					MessagesLogin.getString("pnlFormReserva.lblPeticionesEspeciales.text")); //$NON-NLS-1$
			lblPeticionesEspeciales
					.setIcon(new ImageIcon(pnlFormReserva.class.getResource("/Presentacion/Imagenes/pagar.png")));
			lblPeticionesEspeciales.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblPeticionesEspeciales = new GridBagConstraints();
			gbc_lblPeticionesEspeciales.anchor = GridBagConstraints.WEST;
			gbc_lblPeticionesEspeciales.insets = new Insets(0, 0, 5, 5);
			gbc_lblPeticionesEspeciales.gridx = 1;
			gbc_lblPeticionesEspeciales.gridy = 17;
			add(lblPeticionesEspeciales, gbc_lblPeticionesEspeciales);
		}
		{
			textPeticionesEspeciales = new JTextArea();
			textPeticionesEspeciales.setEditable(false);
			textPeticionesEspeciales.setWrapStyleWord(true);
			textPeticionesEspeciales.setText((String) null);
			textPeticionesEspeciales.setOpaque(false);
			textPeticionesEspeciales.setLineWrap(true);
			textPeticionesEspeciales.setBackground(Color.WHITE);
			GridBagConstraints gbc_textPeticionesEspeciales = new GridBagConstraints();
			gbc_textPeticionesEspeciales.fill = GridBagConstraints.BOTH;
			gbc_textPeticionesEspeciales.insets = new Insets(0, 0, 5, 0);
			gbc_textPeticionesEspeciales.gridheight = 3;
			gbc_textPeticionesEspeciales.gridwidth = 4;
			gbc_textPeticionesEspeciales.gridx = 1;
			gbc_textPeticionesEspeciales.gridy = 18;
			add(textPeticionesEspeciales, gbc_textPeticionesEspeciales);
		}

	}

	/**
	 * Load reserva.
	 *
	 * @param reserva the reserva
	 */
	public void loadReserva(Reserva reserva) {
		tfDniRes.setText(reserva.getDni());
		tfEmailRes.setText(reserva.getEmail());
		tfHoraEntrada.setText(reserva.getHora_entrada());
		tfHoraSalida.setText(reserva.getHora_salida());

		Calendar calEntrada = Calendar.getInstance();
		Calendar calSalida = Calendar.getInstance();
		SimpleDateFormat sdfSalida = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy");

		try {
			calSalida.setTime(sdfSalida.parse(reserva.getFecha_salida()));
			calEntrada.setTime(sdfEntrada.parse(reserva.getFecha_entrada()));
			dCFechaEntrada.setEnabled(false);
			dCFechaSalida.setEnabled(false);
			dCFechaEntrada.setCalendar(calEntrada);
			dCFechaSalida.setCalendar(calSalida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		spinnerOcupantes.setValue(reserva.getN_ocupantes());
		tfNombreRes.setText(reserva.getNombre());
		tfTlfRes.setText(reserva.getTelefono());
		textPeticionesEspeciales.setText(reserva.getSolicitudes_especiales());
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
	 * Clean.
	 */
	public void clean() {
		tfDniRes.setText(null);
		tfEmailRes.setText(null);
		tfHoraEntrada.setText(null);
		tfHoraSalida.setText(null);
		tfNombreRes.setText(null);
		tfTlfRes.setText(null);
		textPeticionesEspeciales.setText(null);
	}

}
