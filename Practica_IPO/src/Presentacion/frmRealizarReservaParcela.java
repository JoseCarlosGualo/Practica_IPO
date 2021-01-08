package Presentacion;

import Presentacion.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;

import Dominio.Reserva;
import Dominio.Disponibilidad;
import Dominio.Empleado;
import Dominio.Parcela;
import Dominio.Reserva;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;

public class frmRealizarReservaParcela extends JFrame {

	private JPanel contentPane;
	private JPanel panelBotones;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private int estado;
	private JPanel panelDatosReserva;

	private pnlContenedorParcelas pnlContenedorParcelas;
	private int id;

	private final static int ALTO = 700;
	private final static int ANCHO = 550;
	private JLabel lblDatosPersonales;
	private JLabel lblNombre;
	private Border bordeMal = BorderFactory.createLineBorder(Color.RED);
	private Border bordeBien = BorderFactory.createLineBorder(Color.GREEN);
	private JLabel lblDni;
	private JLabel lblTelfono;
	private JLabel lblEmail;
	private JTextField tfNombreRes;
	private JTextField tfDniRes;
	private JTextField tfTlfnRes;
	private JTextField tfEmailRes;
	private JLabel lblDatosReserva;
	private JLabel lblFechaDeEntrada;
	private JLabel lblHoraDeEntrada;
	private JLabel lblFechaDeSalida;
	private JLabel lblHoraDeSalida;
	private JLabel lblNmeroDeOcupantes;
	private JSpinner spinnerOcupantes;
	private JDateChooser dCFechaEntrada;
	private JDateChooser dCFechaSalida;
	private JTextField tfHoraEntradaRes;
	private JTextField tfHoraSalida;
	private Parcela parcela;
	private JLabel lblPeticionesEspeciales;
	private JTextArea txaPeticionesEspeciales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRealizarReservaParcela frame = new frmRealizarReservaParcela(null, null, 0, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmRealizarReservaParcela(Rectangle limites, pnlContenedorParcelas panel, int estado, Parcela parcela) {
		this.estado = estado;
		this.parcela = parcela;
		setResizable(false);
		this.pnlContenedorParcelas = panel;
		setTitle(MessagesLogin.getString("frmRealizarReservaParcela.this.title")); //$NON-NLS-1$
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		if (limites.equals(null)) {
			setBounds(100, 100, ANCHO, ALTO);
		} else {
			int centroX = (int) limites.getCenterX();
			int centroY = (int) limites.getCenterY();
			setBounds(centroX - (506 / 2), centroY - (268 / 2), ANCHO, ALTO);
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		{
			panelBotones = new JPanel();
			contentPane.add(panelBotones, BorderLayout.SOUTH);
			{
				btnGuardar = new JButton(MessagesLogin.getString("frmRealizarReservaParcela.btnGuardar.text")); //$NON-NLS-1$
				btnGuardar.setToolTipText(MessagesLogin.getString("frmRealizarReservaParcela.btnGuardar.toolTipText")); //$NON-NLS-1$
				btnGuardar.addActionListener(new BtnGuardarActionListener());
				panelBotones.add(btnGuardar);
			}
			{
				btnCancelar = new JButton(MessagesLogin.getString("frmRealizarReservaParcela.btnCancelar.text")); //$NON-NLS-1$
				btnCancelar.setToolTipText(MessagesLogin.getString("frmRealizarReservaParcela.btnCancelar.toolTipText")); //$NON-NLS-1$
				btnCancelar.addActionListener(new BtnCancelarActionListener());
				panelBotones.add(btnCancelar);
			}
		}
		{
			panelDatosReserva = new JPanel();
			panelDatosReserva.setBorder(
					new TitledBorder(null, MessagesLogin.getString("frmRealizarReservaParcela.panelDatosReserva.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
			contentPane.add(panelDatosReserva, BorderLayout.CENTER);
			GridBagLayout gbl_panelDatosReserva = new GridBagLayout();
			gbl_panelDatosReserva.columnWidths = new int[] { 15, 0, 0, 100, 0, 0 };
			gbl_panelDatosReserva.rowHeights = new int[] { 10, 0, 10, 0, 0, 0, 0, 10, 0, 10, 0, 0, 0, 0, 10, 0, 0, 0 };
			gbl_panelDatosReserva.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_panelDatosReserva.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
			panelDatosReserva.setLayout(gbl_panelDatosReserva);
			{
				lblDatosPersonales = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblDatosPersonales.text")); //$NON-NLS-1$
				lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblDatosPersonales = new GridBagConstraints();
				gbc_lblDatosPersonales.anchor = GridBagConstraints.WEST;
				gbc_lblDatosPersonales.gridwidth = 2;
				gbc_lblDatosPersonales.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosPersonales.gridx = 1;
				gbc_lblDatosPersonales.gridy = 1;
				panelDatosReserva.add(lblDatosPersonales, gbc_lblDatosPersonales);
			}
			{
				lblNombre = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblNombre.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 2;
				gbc_lblNombre.gridy = 3;
				panelDatosReserva.add(lblNombre, gbc_lblNombre);
			}
			{
				tfNombreRes = new JTextField();
				GridBagConstraints gbc_tfNombreRes = new GridBagConstraints();
				gbc_tfNombreRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfNombreRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfNombreRes.gridx = 3;
				gbc_tfNombreRes.gridy = 3;
				panelDatosReserva.add(tfNombreRes, gbc_tfNombreRes);
				tfNombreRes.setColumns(10);
			}
			{
				lblDni = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblDni.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblDni = new GridBagConstraints();
				gbc_lblDni.anchor = GridBagConstraints.EAST;
				gbc_lblDni.insets = new Insets(0, 0, 5, 5);
				gbc_lblDni.gridx = 2;
				gbc_lblDni.gridy = 4;
				panelDatosReserva.add(lblDni, gbc_lblDni);
			}
			{
				tfDniRes = new JTextField();
				GridBagConstraints gbc_tfDniRes = new GridBagConstraints();
				gbc_tfDniRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfDniRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfDniRes.gridx = 3;
				gbc_tfDniRes.gridy = 4;
				panelDatosReserva.add(tfDniRes, gbc_tfDniRes);
				tfDniRes.setColumns(10);
			}
			{
				lblTelfono = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblTelfono.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblTelfono = new GridBagConstraints();
				gbc_lblTelfono.anchor = GridBagConstraints.EAST;
				gbc_lblTelfono.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfono.gridx = 2;
				gbc_lblTelfono.gridy = 5;
				panelDatosReserva.add(lblTelfono, gbc_lblTelfono);
			}
			{
				tfTlfnRes = new JTextField();
				GridBagConstraints gbc_tfTlfnRes = new GridBagConstraints();
				gbc_tfTlfnRes.anchor = GridBagConstraints.NORTH;
				gbc_tfTlfnRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfTlfnRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfTlfnRes.gridx = 3;
				gbc_tfTlfnRes.gridy = 5;
				panelDatosReserva.add(tfTlfnRes, gbc_tfTlfnRes);
				tfTlfnRes.setColumns(10);
			}
			{
				lblEmail = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblEmail.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.anchor = GridBagConstraints.EAST;
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 2;
				gbc_lblEmail.gridy = 6;
				panelDatosReserva.add(lblEmail, gbc_lblEmail);
			}
			{
				tfEmailRes = new JTextField();
				GridBagConstraints gbc_tfEmailRes = new GridBagConstraints();
				gbc_tfEmailRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfEmailRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfEmailRes.gridx = 3;
				gbc_tfEmailRes.gridy = 6;
				panelDatosReserva.add(tfEmailRes, gbc_tfEmailRes);
				tfEmailRes.setColumns(10);
			}
			{
				lblDatosReserva = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblDatosReserva.text")); //$NON-NLS-1$
				lblDatosReserva.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblDatosReserva = new GridBagConstraints();
				gbc_lblDatosReserva.anchor = GridBagConstraints.WEST;
				gbc_lblDatosReserva.gridwidth = 2;
				gbc_lblDatosReserva.insets = new Insets(0, 0, 5, 5);
				gbc_lblDatosReserva.gridx = 1;
				gbc_lblDatosReserva.gridy = 8;
				panelDatosReserva.add(lblDatosReserva, gbc_lblDatosReserva);
			}
			{
				lblFechaDeEntrada = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblFechaDeEntrada.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblFechaDeEntrada = new GridBagConstraints();
				gbc_lblFechaDeEntrada.anchor = GridBagConstraints.EAST;
				gbc_lblFechaDeEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaDeEntrada.gridx = 2;
				gbc_lblFechaDeEntrada.gridy = 9;
				panelDatosReserva.add(lblFechaDeEntrada, gbc_lblFechaDeEntrada);
			}
			{
				dCFechaEntrada = new JDateChooser();
				GridBagConstraints gbc_dCFechaEntrada = new GridBagConstraints();
				gbc_dCFechaEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_dCFechaEntrada.fill = GridBagConstraints.BOTH;
				gbc_dCFechaEntrada.gridx = 3;
				gbc_dCFechaEntrada.gridy = 9;
				panelDatosReserva.add(dCFechaEntrada, gbc_dCFechaEntrada);
			}
			{
				lblHoraDeEntrada = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblHoraDeEntrada.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblHoraDeEntrada = new GridBagConstraints();
				gbc_lblHoraDeEntrada.anchor = GridBagConstraints.EAST;
				gbc_lblHoraDeEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraDeEntrada.gridx = 2;
				gbc_lblHoraDeEntrada.gridy = 10;
				panelDatosReserva.add(lblHoraDeEntrada, gbc_lblHoraDeEntrada);
			}
			{
				tfHoraEntradaRes = new JTextField();
				tfHoraEntradaRes.setToolTipText(MessagesLogin.getString("frmRealizarReservaParcela.tfHoraEntradaRes.toolTipText")); //$NON-NLS-1$
				tfHoraEntradaRes.setText(MessagesLogin.getString("frmRealizarReservaParcela.tfHoraEntradaRes.text")); //$NON-NLS-1$
				GridBagConstraints gbc_tfHoraEntradaRes = new GridBagConstraints();
				gbc_tfHoraEntradaRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfHoraEntradaRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfHoraEntradaRes.gridx = 3;
				gbc_tfHoraEntradaRes.gridy = 10;
				panelDatosReserva.add(tfHoraEntradaRes, gbc_tfHoraEntradaRes);
				tfHoraEntradaRes.setColumns(10);
			}
			{
				lblFechaDeSalida = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblFechaDeSalida.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblFechaDeSalida = new GridBagConstraints();
				gbc_lblFechaDeSalida.anchor = GridBagConstraints.EAST;
				gbc_lblFechaDeSalida.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaDeSalida.gridx = 2;
				gbc_lblFechaDeSalida.gridy = 11;
				panelDatosReserva.add(lblFechaDeSalida, gbc_lblFechaDeSalida);
			}
			{
				dCFechaSalida = new JDateChooser();
				GridBagConstraints gbc_dCFechaSalida = new GridBagConstraints();
				gbc_dCFechaSalida.insets = new Insets(0, 0, 5, 5);
				gbc_dCFechaSalida.fill = GridBagConstraints.BOTH;
				gbc_dCFechaSalida.gridx = 3;
				gbc_dCFechaSalida.gridy = 11;
				panelDatosReserva.add(dCFechaSalida, gbc_dCFechaSalida);
			}
			{
				lblHoraDeSalida = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblHoraDeSalida.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblHoraDeSalida = new GridBagConstraints();
				gbc_lblHoraDeSalida.anchor = GridBagConstraints.EAST;
				gbc_lblHoraDeSalida.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraDeSalida.gridx = 2;
				gbc_lblHoraDeSalida.gridy = 12;
				panelDatosReserva.add(lblHoraDeSalida, gbc_lblHoraDeSalida);
			}
			{
				tfHoraSalida = new JTextField();
				tfHoraSalida.setToolTipText(MessagesLogin.getString("frmRealizarReservaParcela.tfHoraSalida.toolTipText")); //$NON-NLS-1$
				tfHoraSalida.setText(MessagesLogin.getString("frmRealizarReservaParcela.tfHoraSalida.text")); //$NON-NLS-1$
				GridBagConstraints gbc_tfHoraSalida = new GridBagConstraints();
				gbc_tfHoraSalida.insets = new Insets(0, 0, 5, 5);
				gbc_tfHoraSalida.fill = GridBagConstraints.BOTH;
				gbc_tfHoraSalida.gridx = 3;
				gbc_tfHoraSalida.gridy = 12;
				panelDatosReserva.add(tfHoraSalida, gbc_tfHoraSalida);
				tfHoraSalida.setColumns(10);
			}
			{
				lblNmeroDeOcupantes = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblNmeroDeOcupantes.text")); //$NON-NLS-1$
				GridBagConstraints gbc_lblNmeroDeOcupantes = new GridBagConstraints();
				gbc_lblNmeroDeOcupantes.insets = new Insets(0, 0, 5, 5);
				gbc_lblNmeroDeOcupantes.gridx = 2;
				gbc_lblNmeroDeOcupantes.gridy = 13;
				panelDatosReserva.add(lblNmeroDeOcupantes, gbc_lblNmeroDeOcupantes);
			}
			{
				spinnerOcupantes = new JSpinner();
				spinnerOcupantes.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
				GridBagConstraints gbc_spinnerOcupantes = new GridBagConstraints();
				gbc_spinnerOcupantes.anchor = GridBagConstraints.WEST;
				gbc_spinnerOcupantes.insets = new Insets(0, 0, 5, 5);
				gbc_spinnerOcupantes.gridx = 3;
				gbc_spinnerOcupantes.gridy = 13;
				panelDatosReserva.add(spinnerOcupantes, gbc_spinnerOcupantes);
			}
			{
				lblPeticionesEspeciales = new JLabel(MessagesLogin.getString("frmRealizarReservaParcela.lblPeticionesEspeciales.text")); //$NON-NLS-1$
				lblPeticionesEspeciales.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblPeticionesEspeciales = new GridBagConstraints();
				gbc_lblPeticionesEspeciales.anchor = GridBagConstraints.WEST;
				gbc_lblPeticionesEspeciales.gridwidth = 2;
				gbc_lblPeticionesEspeciales.insets = new Insets(0, 0, 5, 5);
				gbc_lblPeticionesEspeciales.gridx = 1;
				gbc_lblPeticionesEspeciales.gridy = 15;
				panelDatosReserva.add(lblPeticionesEspeciales, gbc_lblPeticionesEspeciales);
			}
			{
				txaPeticionesEspeciales = new JTextArea();
				GridBagConstraints gbc_txaPeticionesEspeciales = new GridBagConstraints();
				gbc_txaPeticionesEspeciales.gridwidth = 3;
				gbc_txaPeticionesEspeciales.insets = new Insets(0, 0, 0, 5);
				gbc_txaPeticionesEspeciales.fill = GridBagConstraints.BOTH;
				gbc_txaPeticionesEspeciales.gridx = 1;
				gbc_txaPeticionesEspeciales.gridy = 16;
				panelDatosReserva.add(txaPeticionesEspeciales, gbc_txaPeticionesEspeciales);
			}
			{
				{
					DefaultListModel<String> modelo = new DefaultListModel<String>();
				}
			}
		}
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

		if (dCFechaEntrada.getDate() == null || dCFechaSalida.getDate() == null) {
			correcto = false;
		}

		return correcto;
	}

	public boolean comprobarFechas() {
		boolean correcto = true;
		Date fecha_entrada = dCFechaEntrada.getDate();
		Date fecha_salida = dCFechaSalida.getDate();
		Date fecha_entrada_aux = new Date();
		Date fecha_salida_aux = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Reserva reserva = new Reserva();

		if (fecha_salida.before(fecha_entrada)) {
			correcto = false;
			return correcto;
		}

		if (fecha_entrada.before(new Date())) {
			correcto = false;
			return correcto;
		}

		for (Reserva r : reserva.getReservaDAO().getListaReservas()) {
			try {
				fecha_entrada_aux = sdf.parse(r.getFecha_entrada());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fecha_salida_aux = sdf.parse(r.getFecha_salida());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if ((!fecha_entrada_aux.after(fecha_entrada) && !fecha_salida_aux.before(fecha_entrada))
					|| (!fecha_entrada_aux.after(fecha_salida) && !fecha_salida_aux.before(fecha_salida))) {
				correcto = false;
				return correcto;
			}
		}

		return correcto;

	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(null, "¿Seguro que quieres cancelar la reserva?", "Aviso",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				dispose();
			} else {

			}
		}
	}

	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(null, "¿Desea añadir una Reserva con los campos introducidos?", "Aviso",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				if (comprobarTextFields()) {
					if (comprobarFechas()) {
						Reserva reserva = new Reserva();
						reserva.setDni(tfDniRes.getText());
						reserva.setEmail(tfEmailRes.getText());
						parcela.setDisponibilidad(Disponibilidad.Ocupada);
						reserva.setEstancia(parcela);
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						reserva.setFecha_entrada(sdf.format(dCFechaEntrada.getDate()));
						reserva.setFecha_salida(sdf.format(dCFechaSalida.getDate()));
						reserva.setHora_entrada(tfHoraEntradaRes.getText());
						reserva.setHora_salida(tfHoraSalida.getText());
						reserva.setTelefono(tfTlfnRes.getText());
						reserva.setN_ocupantes((Integer) spinnerOcupantes.getValue());
						reserva.setNombre(tfNombreRes.getText());
						reserva.setTipo("Parcela");
						reserva.setSolicitudes_especiales(txaPeticionesEspeciales.getText());

						try {
							reserva.insert();
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null, "Revisa los campos de fechas.", "Aviso",
								JOptionPane.WARNING_MESSAGE);
						return;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Faltan campos por rellenar.", "Aviso",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				pnlContenedorParcelas.reload();
				dispose();
			} else {
				dispose();
			}
		}
	}

}
