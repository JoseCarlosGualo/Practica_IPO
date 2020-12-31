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

public class pnlFormReserva extends JPanel {

	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private JFrame framePrincipal;
	private JLabel lblDatosPersonales;
	private JLabel lblNombre;
	private JTextField tfNombreRes;
	private JTextField tfDniRes;
	private JLabel lblDni;
	private JTextField tfTelefonoRes;
	private JLabel lblTelfono;
	private JTextField tfEmailRes;
	private JLabel lblEmail;
	private JLabel lblHoraDeEntrada;
	private JLabel lblFechaDeSalida;
	private JLabel lblHoraDeSalida;
	private JLabel lblNmeroDeOcupantes;
	private JTextField tfHoraEntrada;
	private JTextField tfFechaSalida;
	private JTextField tfHoraSalida;
	private JTextField tfNumeroOcupantes;
	private JLabel lblPeticionesEspeciales;
	private JTextArea textPeticionesEspeciales;

	/**
	 * Create the panel.
	 */
	public pnlFormReserva(JFrame framePrincipal) {
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 15, 0, 0, 15, 0 };
		gridBagLayout.rowHeights = new int[] { 15, 0, 15, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblDatosPersonales = new JLabel("Datos Personales");
			lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
			gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
			gbc_lblDatosPersonales.gridx = 1;
			gbc_lblDatosPersonales.gridy = 1;
			add(lblDatosPersonales, gbc_lblDatosPersonales);
		}
		{
			lblNombre = new JLabel("Nombre: ");
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
			lblDni = new JLabel("DNI:");
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
			lblTelfono = new JLabel("Tel\u00E9fono: ");
			GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
			gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfono.anchor = GridBagConstraints.EAST;
			gbc_lblTelfono.gridx = 1;
			gbc_lblTelfono.gridy = 5;
			add(lblTelfono, gbc_lblTelfono);
		}
		{
			tfTelefonoRes = new JTextField();
			tfTelefonoRes.setEditable(false);
			tfTelefonoRes.setColumns(10);
			GridBagConstraints gbc_tfTelefonoRes = new GridBagConstraints();
			gbc_tfTelefonoRes.insets = new Insets(0, 0, 5, 5);
			gbc_tfTelefonoRes.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfTelefonoRes.gridx = 2;
			gbc_tfTelefonoRes.gridy = 5;
			add(tfTelefonoRes, gbc_tfTelefonoRes);
		}
		{
			lblEmail = new JLabel("E-mail: ");
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
			lblHoraDeEntrada = new JLabel("Hora de Entrada: ");
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
			lblFechaDeSalida = new JLabel("Fecha de Salida: ");
			GridBagConstraints gbc_lblFechaDeSalida = new GridBagConstraints();
			gbc_lblFechaDeSalida.anchor = GridBagConstraints.EAST;
			gbc_lblFechaDeSalida.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaDeSalida.gridx = 1;
			gbc_lblFechaDeSalida.gridy = 12;
			add(lblFechaDeSalida, gbc_lblFechaDeSalida);
		}
		{
			tfFechaSalida = new JTextField();
			tfFechaSalida.setEditable(false);
			tfFechaSalida.setColumns(10);
			GridBagConstraints gbc_tfFechaSalida = new GridBagConstraints();
			gbc_tfFechaSalida.insets = new Insets(0, 0, 5, 5);
			gbc_tfFechaSalida.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfFechaSalida.gridx = 2;
			gbc_tfFechaSalida.gridy = 12;
			add(tfFechaSalida, gbc_tfFechaSalida);
		}
		{
			lblHoraDeSalida = new JLabel("Hora de Salida: ");
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
			lblNmeroDeOcupantes = new JLabel("N\u00FAmero de Ocupantes: ");
			GridBagConstraints gbc_lblNmeroDeOcupantes = new GridBagConstraints();
			gbc_lblNmeroDeOcupantes.anchor = GridBagConstraints.EAST;
			gbc_lblNmeroDeOcupantes.insets = new Insets(0, 0, 5, 5);
			gbc_lblNmeroDeOcupantes.gridx = 1;
			gbc_lblNmeroDeOcupantes.gridy = 14;
			add(lblNmeroDeOcupantes, gbc_lblNmeroDeOcupantes);
		}
		{
			tfNumeroOcupantes = new JTextField();
			tfNumeroOcupantes.setEditable(false);
			tfNumeroOcupantes.setColumns(10);
			GridBagConstraints gbc_tfNumeroOcupantes = new GridBagConstraints();
			gbc_tfNumeroOcupantes.insets = new Insets(0, 0, 5, 5);
			gbc_tfNumeroOcupantes.fill = GridBagConstraints.HORIZONTAL;
			gbc_tfNumeroOcupantes.gridx = 2;
			gbc_tfNumeroOcupantes.gridy = 14;
			add(tfNumeroOcupantes, gbc_tfNumeroOcupantes);
		}
		{
			lblPeticionesEspeciales = new JLabel("Peticiones Especiales");
			lblPeticionesEspeciales.setFont(new Font("Tahoma", Font.BOLD, 18));
			GridBagConstraints gbc_lblPeticionesEspeciales = new GridBagConstraints();
			gbc_lblPeticionesEspeciales.insets = new Insets(0, 0, 5, 5);
			gbc_lblPeticionesEspeciales.gridx = 1;
			gbc_lblPeticionesEspeciales.gridy = 16;
			add(lblPeticionesEspeciales, gbc_lblPeticionesEspeciales);
		}
		{
			textPeticionesEspeciales = new JTextArea();
			textPeticionesEspeciales.setWrapStyleWord(true);
			textPeticionesEspeciales.setText((String) null);
			textPeticionesEspeciales.setOpaque(false);
			textPeticionesEspeciales.setLineWrap(true);
			textPeticionesEspeciales.setEditable(false);
			textPeticionesEspeciales.setBackground(SystemColor.menu);
			GridBagConstraints gbc_textPeticionesEspeciales = new GridBagConstraints();
			gbc_textPeticionesEspeciales.gridwidth = 2;
			gbc_textPeticionesEspeciales.insets = new Insets(0, 0, 0, 5);
			gbc_textPeticionesEspeciales.fill = GridBagConstraints.BOTH;
			gbc_textPeticionesEspeciales.gridx = 1;
			gbc_textPeticionesEspeciales.gridy = 17;
			add(textPeticionesEspeciales, gbc_textPeticionesEspeciales);
		}

	}

	public void loadReserva(Reserva reserva) {
		tfDniRes.setText(reserva.getDni());
		tfEmailRes.setText(reserva.getEmail());
		tfFechaEntrada.setText(reserva.getFecha_entrada());
		tfFechaSalida.setText(reserva.getFecha_salida());
		tfHoraEntrada.setText(reserva.getHora_entrada());
		tfHoraSalida.setText(reserva.getHora_salida());
		tfNombreRes.setText(reserva.getNombre());
		tfNumeroOcupantes.setText(String.valueOf(reserva.getN_ocupantes()));
		tfTelefonoRes.setText(reserva.getTelefono());
		textPeticionesEspeciales.setText(reserva.getSolicitudes_especiales());
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

	public void clean() {
		tfDniRes.setText(null);
		tfEmailRes.setText(null);
		tfFechaEntrada.setText(null);
		tfFechaSalida.setText(null);
		tfHoraEntrada.setText(null);
		tfHoraSalida.setText(null);
		tfNombreRes.setText(null);
		tfNumeroOcupantes.setText(null);
		tfTelefonoRes.setText(null);
		textPeticionesEspeciales.setText(null);
	}

}
