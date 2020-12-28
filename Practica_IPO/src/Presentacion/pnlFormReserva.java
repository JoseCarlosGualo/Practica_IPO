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
	private JPanel pnlDatosPersonales;
	private JLabel lblDatosPersonales;
	private JLabel lblNombre;
	private JLabel lblDni;
	private JLabel lblTelfono;
	private JLabel lblEmail;
	private JTextField tfNombreClRes;
	private JTextField tfDniRes;
	private JTextField tfTlfRes;
	private JTextField tfEmailRes;
	private JPanel pnlDatosReserva;
	private JPanel pnlPeticiones;
	private JLabel lblDatosDeLa;
	private JLabel lblPeticionesEspeciales;
	private JLabel lblFechaDeEntrada;
	private JLabel lblFechaDeSalida;
	private JLabel lblOcupantes;
	private JTextField tfFechaEntrada;
	private JTextField tfFechaSalida;
	private JTextField tfOcupantes;
	private JLabel lblHoraDeEntrada;
	private JLabel lblHoraDeSalida;
	private JTextField tfHoraEntrada;
	private JTextField tfHoraSalida;
	private JTextArea textAreaPeticiones;

	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private JFrame framePrincipal;

	/**
	 * Create the panel.
	 */
	public pnlFormReserva(JFrame framePrincipal) {
		this.framePrincipal = framePrincipal;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 15, 0, 0, 15, 0, 101, 15, 0 };
		gridBagLayout.rowHeights = new int[] { 15, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			pnlDatosPersonales = new JPanel();
			GridBagConstraints gbc_pnlDatosPersonales = new GridBagConstraints();
			gbc_pnlDatosPersonales.gridwidth = 5;
			gbc_pnlDatosPersonales.gridheight = 2;
			gbc_pnlDatosPersonales.insets = new Insets(0, 0, 5, 5);
			gbc_pnlDatosPersonales.fill = GridBagConstraints.BOTH;
			gbc_pnlDatosPersonales.gridx = 1;
			gbc_pnlDatosPersonales.gridy = 1;
			add(pnlDatosPersonales, gbc_pnlDatosPersonales);
			GridBagLayout gbl_pnlDatosPersonales = new GridBagLayout();
			gbl_pnlDatosPersonales.columnWidths = new int[] { 0, 240, 0, 0 };
			gbl_pnlDatosPersonales.rowHeights = new int[] { 0, 10, 0, 15, 0, 15, 0, 15, 0, 5, 0 };
			gbl_pnlDatosPersonales.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlDatosPersonales.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					Double.MIN_VALUE };
			pnlDatosPersonales.setLayout(gbl_pnlDatosPersonales);
			{
				lblDatosPersonales = new JLabel("Datos Personales");
				lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 15));
				GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
				gbc_lblDatosPersonales.anchor = GridBagConstraints.WEST;
				gbc_lblDatosPersonales.gridwidth = 2;
				gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosPersonales.gridx = 0;
				gbc_lblDatosPersonales.gridy = 0;
				pnlDatosPersonales.add(lblDatosPersonales, gbc_lblDatosPersonales);
			}
			{
				lblNombre = new JLabel("Nombre: ");
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 0;
				gbc_lblNombre.gridy = 2;
				pnlDatosPersonales.add(lblNombre, gbc_lblNombre);
			}
			{
				tfNombreClRes = new JTextField();
				tfNombreClRes.setEditable(false);
				tfNombreClRes.setColumns(10);
				GridBagConstraints gbc_tfNombreClRes = new GridBagConstraints();
				gbc_tfNombreClRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfNombreClRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNombreClRes.gridx = 1;
				gbc_tfNombreClRes.gridy = 2;
				pnlDatosPersonales.add(tfNombreClRes, gbc_tfNombreClRes);
			}
			{
				lblDni = new JLabel("DNI: ");
				GridBagConstraints gbc_lblDni = new GridBagConstraints();
				gbc_lblDni.anchor = GridBagConstraints.EAST;
				gbc_lblDni.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni.gridx = 0;
				gbc_lblDni.gridy = 4;
				pnlDatosPersonales.add(lblDni, gbc_lblDni);
			}
			{
				tfDniRes = new JTextField();
				tfDniRes.setEditable(false);
				tfDniRes.setColumns(10);
				GridBagConstraints gbc_tfDniRes = new GridBagConstraints();
				gbc_tfDniRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfDniRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfDniRes.gridx = 1;
				gbc_tfDniRes.gridy = 4;
				pnlDatosPersonales.add(tfDniRes, gbc_tfDniRes);
			}
			{
				lblTelfono = new JLabel("Tel\u00E9fono: ");
				GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
				gbc_lblTelfono.anchor = GridBagConstraints.EAST;
				gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfono.gridx = 0;
				gbc_lblTelfono.gridy = 6;
				pnlDatosPersonales.add(lblTelfono, gbc_lblTelfono);
			}
			{
				tfTlfRes = new JTextField();
				tfTlfRes.setEditable(false);
				tfTlfRes.setColumns(10);
				GridBagConstraints gbc_tfTlfRes = new GridBagConstraints();
				gbc_tfTlfRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfTlfRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfTlfRes.gridx = 1;
				gbc_tfTlfRes.gridy = 6;
				pnlDatosPersonales.add(tfTlfRes, gbc_tfTlfRes);
			}
			{
				lblEmail = new JLabel("E-mail: ");
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.anchor = GridBagConstraints.EAST;
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 0;
				gbc_lblEmail.gridy = 8;
				pnlDatosPersonales.add(lblEmail, gbc_lblEmail);
			}
			{
				tfEmailRes = new JTextField();
				tfEmailRes.setEditable(false);
				tfEmailRes.setColumns(10);
				GridBagConstraints gbc_tfEmailRes = new GridBagConstraints();
				gbc_tfEmailRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfEmailRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEmailRes.gridx = 1;
				gbc_tfEmailRes.gridy = 8;
				pnlDatosPersonales.add(tfEmailRes, gbc_tfEmailRes);
			}
		}
		{
			pnlDatosReserva = new JPanel();
			GridBagConstraints gbc_pnlDatosReserva = new GridBagConstraints();
			gbc_pnlDatosReserva.gridheight = 2;
			gbc_pnlDatosReserva.gridwidth = 2;
			gbc_pnlDatosReserva.insets = new Insets(0, 0, 5, 5);
			gbc_pnlDatosReserva.fill = GridBagConstraints.BOTH;
			gbc_pnlDatosReserva.gridx = 1;
			gbc_pnlDatosReserva.gridy = 4;
			add(pnlDatosReserva, gbc_pnlDatosReserva);
			GridBagLayout gbl_pnlDatosReserva = new GridBagLayout();
			gbl_pnlDatosReserva.columnWidths = new int[] { 0, 0, 15, 0 };
			gbl_pnlDatosReserva.rowHeights = new int[] { 0, 10, 0, 15, 0, 15, 0, 15, 0, 15, 0, 0 };
			gbl_pnlDatosReserva.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
			gbl_pnlDatosReserva.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					Double.MIN_VALUE };
			pnlDatosReserva.setLayout(gbl_pnlDatosReserva);
			{
				lblDatosDeLa = new JLabel("Datos de la Reserva");
				lblDatosDeLa.setFont(new Font("Tahoma", Font.BOLD, 15));
				GridBagConstraints gbc_lblDatosDeLa = new GridBagConstraints();
				gbc_lblDatosDeLa.anchor = GridBagConstraints.WEST;
				gbc_lblDatosDeLa.gridwidth = 2;
				gbc_lblDatosDeLa.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosDeLa.gridx = 0;
				gbc_lblDatosDeLa.gridy = 0;
				pnlDatosReserva.add(lblDatosDeLa, gbc_lblDatosDeLa);
			}
			{
				lblFechaDeEntrada = new JLabel("Fecha de entrada: ");
				GridBagConstraints gbc_lblFechaDeEntrada = new GridBagConstraints();
				gbc_lblFechaDeEntrada.anchor = GridBagConstraints.EAST;
				gbc_lblFechaDeEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaDeEntrada.gridx = 0;
				gbc_lblFechaDeEntrada.gridy = 2;
				pnlDatosReserva.add(lblFechaDeEntrada, gbc_lblFechaDeEntrada);
			}
			{
				tfFechaEntrada = new JTextField();
				tfFechaEntrada.setEditable(false);
				tfFechaEntrada.setColumns(10);
				GridBagConstraints gbc_tfFechaEntrada = new GridBagConstraints();
				gbc_tfFechaEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_tfFechaEntrada.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfFechaEntrada.gridx = 1;
				gbc_tfFechaEntrada.gridy = 2;
				pnlDatosReserva.add(tfFechaEntrada, gbc_tfFechaEntrada);
			}
			{
				lblFechaDeSalida = new JLabel("Fecha de salida: ");
				GridBagConstraints gbc_lblFechaDeSalida = new GridBagConstraints();
				gbc_lblFechaDeSalida.anchor = GridBagConstraints.EAST;
				gbc_lblFechaDeSalida.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaDeSalida.gridx = 0;
				gbc_lblFechaDeSalida.gridy = 4;
				pnlDatosReserva.add(lblFechaDeSalida, gbc_lblFechaDeSalida);
			}
			{
				tfFechaSalida = new JTextField();
				tfFechaSalida.setEditable(false);
				tfFechaSalida.setColumns(10);
				GridBagConstraints gbc_tfFechaSalida = new GridBagConstraints();
				gbc_tfFechaSalida.insets = new Insets(0, 0, 5, 5);
				gbc_tfFechaSalida.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfFechaSalida.gridx = 1;
				gbc_tfFechaSalida.gridy = 4;
				pnlDatosReserva.add(tfFechaSalida, gbc_tfFechaSalida);
			}
			{
				lblHoraDeEntrada = new JLabel("Hora de entrada: ");
				GridBagConstraints gbc_lblHoraDeEntrada = new GridBagConstraints();
				gbc_lblHoraDeEntrada.anchor = GridBagConstraints.EAST;
				gbc_lblHoraDeEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraDeEntrada.gridx = 0;
				gbc_lblHoraDeEntrada.gridy = 6;
				pnlDatosReserva.add(lblHoraDeEntrada, gbc_lblHoraDeEntrada);
			}
			{
				tfHoraEntrada = new JTextField();
				tfHoraEntrada.setEditable(false);
				tfHoraEntrada.setColumns(10);
				GridBagConstraints gbc_tfHoraEntrada = new GridBagConstraints();
				gbc_tfHoraEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_tfHoraEntrada.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfHoraEntrada.gridx = 1;
				gbc_tfHoraEntrada.gridy = 6;
				pnlDatosReserva.add(tfHoraEntrada, gbc_tfHoraEntrada);
			}
			{
				lblHoraDeSalida = new JLabel("Hora de salida: ");
				GridBagConstraints gbc_lblHoraDeSalida = new GridBagConstraints();
				gbc_lblHoraDeSalida.anchor = GridBagConstraints.EAST;
				gbc_lblHoraDeSalida.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraDeSalida.gridx = 0;
				gbc_lblHoraDeSalida.gridy = 8;
				pnlDatosReserva.add(lblHoraDeSalida, gbc_lblHoraDeSalida);
			}
			{
				tfHoraSalida = new JTextField();
				tfHoraSalida.setEditable(false);
				tfHoraSalida.setColumns(10);
				GridBagConstraints gbc_tfHoraSalida = new GridBagConstraints();
				gbc_tfHoraSalida.insets = new Insets(0, 0, 5, 5);
				gbc_tfHoraSalida.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfHoraSalida.gridx = 1;
				gbc_tfHoraSalida.gridy = 8;
				pnlDatosReserva.add(tfHoraSalida, gbc_tfHoraSalida);
			}
			{
				lblOcupantes = new JLabel("Ocupantes: ");
				GridBagConstraints gbc_lblOcupantes = new GridBagConstraints();
				gbc_lblOcupantes.anchor = GridBagConstraints.EAST;
				gbc_lblOcupantes.insets = new Insets(0, 0, 0, 5);
				gbc_lblOcupantes.gridx = 0;
				gbc_lblOcupantes.gridy = 10;
				pnlDatosReserva.add(lblOcupantes, gbc_lblOcupantes);
			}
			{
				tfOcupantes = new JTextField();
				tfOcupantes.setEditable(false);
				tfOcupantes.setColumns(10);
				GridBagConstraints gbc_tfOcupantes = new GridBagConstraints();
				gbc_tfOcupantes.insets = new Insets(0, 0, 0, 5);
				gbc_tfOcupantes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfOcupantes.gridx = 1;
				gbc_tfOcupantes.gridy = 10;
				pnlDatosReserva.add(tfOcupantes, gbc_tfOcupantes);
			}
		}
		{
			pnlPeticiones = new JPanel();
			GridBagConstraints gbc_pnlPeticiones = new GridBagConstraints();
			gbc_pnlPeticiones.gridheight = 2;
			gbc_pnlPeticiones.gridwidth = 2;
			gbc_pnlPeticiones.insets = new Insets(0, 0, 5, 5);
			gbc_pnlPeticiones.fill = GridBagConstraints.BOTH;
			gbc_pnlPeticiones.gridx = 4;
			gbc_pnlPeticiones.gridy = 4;
			add(pnlPeticiones, gbc_pnlPeticiones);
			GridBagLayout gbl_pnlPeticiones = new GridBagLayout();
			gbl_pnlPeticiones.columnWidths = new int[] { 0, 0, 0, 0 };
			gbl_pnlPeticiones.rowHeights = new int[] { 0, 10, 0, 0, 0, 0 };
			gbl_pnlPeticiones.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlPeticiones.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
			pnlPeticiones.setLayout(gbl_pnlPeticiones);
			{
				lblPeticionesEspeciales = new JLabel("Peticiones Especiales");
				lblPeticionesEspeciales.setFont(new Font("Tahoma", Font.BOLD, 15));
				GridBagConstraints gbc_lblPeticionesEspeciales = new GridBagConstraints();
				gbc_lblPeticionesEspeciales.anchor = GridBagConstraints.WEST;
				gbc_lblPeticionesEspeciales.gridwidth = 2;
				gbc_lblPeticionesEspeciales.insets = new Insets(0, 0, 5, 5);
				gbc_lblPeticionesEspeciales.gridx = 0;
				gbc_lblPeticionesEspeciales.gridy = 0;
				pnlPeticiones.add(lblPeticionesEspeciales, gbc_lblPeticionesEspeciales);
			}
			{
				textAreaPeticiones = new JTextArea();
				textAreaPeticiones.setWrapStyleWord(true);
				textAreaPeticiones.setText((String) null);
				textAreaPeticiones.setOpaque(false);
				textAreaPeticiones.setLineWrap(true);
				textAreaPeticiones.setEditable(false);
				textAreaPeticiones.setBackground(SystemColor.menu);
				GridBagConstraints gbc_textAreaPeticiones = new GridBagConstraints();
				gbc_textAreaPeticiones.gridheight = 3;
				gbc_textAreaPeticiones.insets = new Insets(0, 0, 5, 5);
				gbc_textAreaPeticiones.fill = GridBagConstraints.BOTH;
				gbc_textAreaPeticiones.gridx = 1;
				gbc_textAreaPeticiones.gridy = 2;
				pnlPeticiones.add(textAreaPeticiones, gbc_textAreaPeticiones);
			}

		}

	}

	public void loadReserva(Reserva reserva) {
		tfDniRes.setText(reserva.getDni());
		tfEmailRes.setText(reserva.getEmail());
		tfFechaEntrada.setText(reserva.getFecha_entrada());
		tfFechaSalida.setText(reserva.getFecha_salida());
		tfHoraEntrada.setText(reserva.getHora_entrada());
		tfHoraSalida.setText(reserva.getHora_salida());
		tfNombreClRes.setText(reserva.getNombre());
		tfOcupantes.setText(String.valueOf(reserva.getN_ocupantes()));
		tfTlfRes.setText(reserva.getTelefono());
		textAreaPeticiones.setText(reserva.getSolicitudes_especiales());
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
		tfNombreClRes.setText(null);
		tfOcupantes.setText(null);
		tfTlfRes.setText(null);
		textAreaPeticiones.setText(null);
	}

}
