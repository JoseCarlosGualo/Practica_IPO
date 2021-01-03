package Presentacion;

import Presentacion.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;

public class frmRealizarReservaBungalow extends JFrame {

	private JPanel contentPane;
	private JPanel panelBotones;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private int estado;
	private JPanel panelDatosReserva;

	private pnlContenedorBungalows pnlContenedorBungalow;
	private int id;

	private final static int ALTO = 270;
	private final static int ANCHO = 700;
	private JLabel lblDatosPersonales;
	private JLabel lblNombre;
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRealizarReservaBungalow frame = new frmRealizarReservaBungalow(null, null, 0);
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
	public frmRealizarReservaBungalow(Rectangle limites, pnlContenedorBungalows panel, int estado) {
		this.estado = estado;
		setResizable(false);
		this.pnlContenedorBungalow = panel;
		setTitle("Formulario Añadir Reserva");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(frmRealizarReservaBungalow.class.getResource("/Presentacion/Iconos/menuComida.png")));
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
				btnGuardar = new JButton("Guardar");
				btnGuardar.setToolTipText("Guardar Reserva");
				// btnGuardar.addActionListener(new BtnGuardarActionListener());
				panelBotones.add(btnGuardar);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setToolTipText("Cancelar Reserva");
				btnCancelar.addActionListener(new BtnCancelarActionListener());
				panelBotones.add(btnCancelar);
			}
		}
		{
			panelDatosReserva = new JPanel();
			panelDatosReserva.setBorder(
					new TitledBorder(null, "Datos de la Reserva", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPane.add(panelDatosReserva, BorderLayout.CENTER);
			GridBagLayout gbl_panelDatosReserva = new GridBagLayout();
			gbl_panelDatosReserva.columnWidths = new int[] { 15, 0, 0, 100, 0, 0 };
			gbl_panelDatosReserva.rowHeights = new int[] { 10, 0, 10, 0, 0, 0, 0, 10, 0, 10, 0, 0, 0, 0, 10, 0, 0 };
			gbl_panelDatosReserva.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_panelDatosReserva.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			panelDatosReserva.setLayout(gbl_panelDatosReserva);
			{
				lblDatosPersonales = new JLabel("Datos Personales");
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
				lblNombre = new JLabel("Nombre: ");
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
				lblDni = new JLabel("DNI: ");
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
				lblTelfono = new JLabel("Tel\u00E9fono: ");
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
				lblEmail = new JLabel("E-mail: ");
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
				lblDatosReserva = new JLabel("Datos de la Reserva");
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
				lblFechaDeEntrada = new JLabel("Fecha de entrada:");
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
				lblHoraDeEntrada = new JLabel("Hora de Entrada: ");
				GridBagConstraints gbc_lblHoraDeEntrada = new GridBagConstraints();
				gbc_lblHoraDeEntrada.anchor = GridBagConstraints.EAST;
				gbc_lblHoraDeEntrada.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraDeEntrada.gridx = 2;
				gbc_lblHoraDeEntrada.gridy = 10;
				panelDatosReserva.add(lblHoraDeEntrada, gbc_lblHoraDeEntrada);
			}
			{
				tfHoraEntradaRes = new JTextField();
				tfHoraEntradaRes.setToolTipText("hh:mm:ss");
				tfHoraEntradaRes.setText("hh:mm:ss");
				GridBagConstraints gbc_tfHoraEntradaRes = new GridBagConstraints();
				gbc_tfHoraEntradaRes.insets = new Insets(0, 0, 5, 5);
				gbc_tfHoraEntradaRes.fill = GridBagConstraints.HORIZONTAL;
				gbc_tfHoraEntradaRes.gridx = 3;
				gbc_tfHoraEntradaRes.gridy = 10;
				panelDatosReserva.add(tfHoraEntradaRes, gbc_tfHoraEntradaRes);
				tfHoraEntradaRes.setColumns(10);
			}
			{
				lblFechaDeSalida = new JLabel("Fecha de Salida: ");
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
				lblHoraDeSalida = new JLabel("Hora de Salida: ");
				GridBagConstraints gbc_lblHoraDeSalida = new GridBagConstraints();
				gbc_lblHoraDeSalida.anchor = GridBagConstraints.EAST;
				gbc_lblHoraDeSalida.insets = new Insets(0, 0, 5, 5);
				gbc_lblHoraDeSalida.gridx = 2;
				gbc_lblHoraDeSalida.gridy = 12;
				panelDatosReserva.add(lblHoraDeSalida, gbc_lblHoraDeSalida);
			}
			{
				tfHoraSalida = new JTextField();
				tfHoraSalida.setToolTipText("hh:mm:ss");
				tfHoraSalida.setText("hh:mm:ss");
				GridBagConstraints gbc_tfHoraSalida = new GridBagConstraints();
				gbc_tfHoraSalida.insets = new Insets(0, 0, 5, 5);
				gbc_tfHoraSalida.fill = GridBagConstraints.BOTH;
				gbc_tfHoraSalida.gridx = 3;
				gbc_tfHoraSalida.gridy = 12;
				panelDatosReserva.add(tfHoraSalida, gbc_tfHoraSalida);
				tfHoraSalida.setColumns(10);
			}
			{
				lblNmeroDeOcupantes = new JLabel("N\u00FAmero de Ocupantes: ");
				GridBagConstraints gbc_lblNmeroDeOcupantes = new GridBagConstraints();
				gbc_lblNmeroDeOcupantes.insets = new Insets(0, 0, 5, 5);
				gbc_lblNmeroDeOcupantes.gridx = 2;
				gbc_lblNmeroDeOcupantes.gridy = 13;
				panelDatosReserva.add(lblNmeroDeOcupantes, gbc_lblNmeroDeOcupantes);
			}
			{
				spinnerOcupantes = new JSpinner();
				GridBagConstraints gbc_spinnerOcupantes = new GridBagConstraints();
				gbc_spinnerOcupantes.anchor = GridBagConstraints.WEST;
				gbc_spinnerOcupantes.insets = new Insets(0, 0, 5, 5);
				gbc_spinnerOcupantes.gridx = 3;
				gbc_spinnerOcupantes.gridy = 13;
				panelDatosReserva.add(spinnerOcupantes, gbc_spinnerOcupantes);
			}
			{
				{
					DefaultListModel<String> modelo = new DefaultListModel<String>();
				}
			}
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (JOptionPane.showConfirmDialog(null, "Cancelación de reserva", "Aviso",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				dispose();
			} else {

			}
		}
	}

	/*
	 * private class BtnGuardarActionListener implements ActionListener { public
	 * void actionPerformed(ActionEvent e) { if (JOptionPane.showConfirmDialog(null,
	 * MessagesPrincipal.getString("Principal.JOptionPaneAvisoSalirProducto"),
	 * MessagesPrincipal.getString("Principal.JOptionPaneAviso"),
	 * JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { String subTipo =
	 * (String) cbSubtipo.getSelectedItem(); System.out.println(subTipo); String
	 * alergenos = getAlergenos(); String categoria = (rdbtnComida.isSelected() ?
	 * "Comida" : "Bebida"); Producto p = new Producto(id, txtNombre.getText(),
	 * Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtKCal.getText()),
	 * alergenos, categoria, subTipo, foto); // System.out.println(p); if (estado ==
	 * 2) { p.update(); } else if (estado == 1) { p.insert(); }
	 * 
	 * Producto prod = new Producto(); prod.readAll();
	 * panel.cargarPaneles(prod.getProductoDAO().getListaProductos()); dispose(); }
	 * else { panel.desseleccioanrTodos(); dispose(); } } }
	 */
}
