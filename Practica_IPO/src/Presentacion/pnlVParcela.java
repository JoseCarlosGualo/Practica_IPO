package Presentacion;

import javax.swing.JPanel;

import Dominio.Parcela;

import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class pnlVParcela extends JPanel {
	private JLabel lblNombreParcela;
	private JLabel lblImagen;
	private JLabel lblCaractersticas;
	private JLabel lblTamao;
	private JLabel lblUbicacion;
	private JLabel lblEquipamiento;
	private JLabel lblTamanoPar;
	private JLabel lblUbicacionPar;
	private JLabel lblEquipamientopar;

	private Color noSeleccionado;
	private Color seleccionado = new Color(250, 250, 200);
	private boolean isSeleccionado = false;

	private Parcela parcela;
	private pnlContenedorParcelas pnlContenedorParcelas;
	private JButton btnReservar;
	private JLabel lblTemporada;
	private JComboBox comboBox;
	private JPanel pnlCaracteristicas;
	private JPanel pnlPrecio;
	private JLabel lblDisponibilidadPar;
	private JLabel lblPrecioPar;

	/**
	 * Create the panel.
	 */
	public pnlVParcela(Parcela parcela, pnlContenedorParcelas pnlcontenedor) {
		this.parcela = parcela;
		this.pnlContenedorParcelas = pnlcontenedor;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 0, 20, 0, 0, 20, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblNombreParcela = new JLabel(this.parcela.getTipo());
			lblNombreParcela.setFont(new Font("Tahoma", Font.BOLD, 23));
			GridBagConstraints gbc_lblNombreParcela = new GridBagConstraints();
			gbc_lblNombreParcela.gridwidth = 2;
			gbc_lblNombreParcela.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreParcela.gridx = 0;
			gbc_lblNombreParcela.gridy = 1;
			add(lblNombreParcela, gbc_lblNombreParcela);
		}
		{
			pnlCaracteristicas = new JPanel();
			GridBagConstraints gbc_pnlCaracteristicas = new GridBagConstraints();
			gbc_pnlCaracteristicas.insets = new Insets(0, 0, 5, 5);
			gbc_pnlCaracteristicas.gridwidth = 2;
			gbc_pnlCaracteristicas.gridheight = 3;
			gbc_pnlCaracteristicas.fill = GridBagConstraints.BOTH;
			gbc_pnlCaracteristicas.gridx = 3;
			gbc_pnlCaracteristicas.gridy = 2;
			add(pnlCaracteristicas, gbc_pnlCaracteristicas);
			GridBagLayout gbl_pnlCaracteristicas = new GridBagLayout();
			gbl_pnlCaracteristicas.columnWidths = new int[] { 0, 144, 0 };
			gbl_pnlCaracteristicas.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			gbl_pnlCaracteristicas.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlCaracteristicas.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
					Double.MIN_VALUE };
			pnlCaracteristicas.setLayout(gbl_pnlCaracteristicas);
			{
				lblCaractersticas = new JLabel("Caracter\u00EDsticas");
				lblCaractersticas.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblCaractersticas = new GridBagConstraints();
				gbc_lblCaractersticas.insets = new Insets(0, 0, 5, 5);
				gbc_lblCaractersticas.gridx = 0;
				gbc_lblCaractersticas.gridy = 0;
				pnlCaracteristicas.add(lblCaractersticas, gbc_lblCaractersticas);
			}
			{
				lblTamao = new JLabel("Tama\u00F1o: ");
				GridBagConstraints gbc_lblTamao = new GridBagConstraints();
				gbc_lblTamao.anchor = GridBagConstraints.WEST;
				gbc_lblTamao.insets = new Insets(0, 0, 5, 5);
				gbc_lblTamao.gridx = 0;
				gbc_lblTamao.gridy = 1;
				pnlCaracteristicas.add(lblTamao, gbc_lblTamao);
			}
			{
				lblTamanoPar = new JLabel(parcela.getTamano() + " metros cuadrados");
				GridBagConstraints gbc_lblTamanoPar = new GridBagConstraints();
				gbc_lblTamanoPar.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblTamanoPar.insets = new Insets(0, 0, 5, 0);
				gbc_lblTamanoPar.gridx = 1;
				gbc_lblTamanoPar.gridy = 1;
				pnlCaracteristicas.add(lblTamanoPar, gbc_lblTamanoPar);
			}
			{
				lblUbicacion = new JLabel("Ubicaci\u00F3n: ");
				GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
				gbc_lblUbicacion.anchor = GridBagConstraints.WEST;
				gbc_lblUbicacion.insets = new Insets(0, 0, 5, 5);
				gbc_lblUbicacion.gridx = 0;
				gbc_lblUbicacion.gridy = 3;
				pnlCaracteristicas.add(lblUbicacion, gbc_lblUbicacion);
			}
			{
				lblUbicacionPar = new JLabel(parcela.getUbicacion());
				GridBagConstraints gbc_lblUbicacionPar = new GridBagConstraints();
				gbc_lblUbicacionPar.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblUbicacionPar.insets = new Insets(0, 0, 5, 0);
				gbc_lblUbicacionPar.gridx = 1;
				gbc_lblUbicacionPar.gridy = 3;
				pnlCaracteristicas.add(lblUbicacionPar, gbc_lblUbicacionPar);
			}
			{
				lblEquipamiento = new JLabel("Equipamiento:");
				GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
				gbc_lblEquipamiento.anchor = GridBagConstraints.WEST;
				gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblEquipamiento.gridx = 0;
				gbc_lblEquipamiento.gridy = 5;
				pnlCaracteristicas.add(lblEquipamiento, gbc_lblEquipamiento);
			}
			{
				lblEquipamientopar = new JLabel(parcela.getServicios());
				GridBagConstraints gbc_lblEquipamientopar = new GridBagConstraints();
				gbc_lblEquipamientopar.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblEquipamientopar.insets = new Insets(0, 0, 5, 0);
				gbc_lblEquipamientopar.gridx = 1;
				gbc_lblEquipamientopar.gridy = 5;
				pnlCaracteristicas.add(lblEquipamientopar, gbc_lblEquipamientopar);
			}
			{
				lblTemporada = new JLabel("Temporada");
				GridBagConstraints gbc_lblTemporada = new GridBagConstraints();
				gbc_lblTemporada.anchor = GridBagConstraints.WEST;
				gbc_lblTemporada.insets = new Insets(0, 0, 5, 5);
				gbc_lblTemporada.gridx = 0;
				gbc_lblTemporada.gridy = 7;
				pnlCaracteristicas.add(lblTemporada, gbc_lblTemporada);
			}
			{
				comboBox = new JComboBox();
				comboBox.addItemListener(new ComboBoxItemListener());
				comboBox.setModel(new DefaultComboBoxModel(new String[] { "Baja", "Media", "Alta" }));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.insets = new Insets(0, 0, 5, 0);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 7;
				pnlCaracteristicas.add(comboBox, gbc_comboBox);
			}
		}
		{
			lblImagen = new JLabel("");
			lblImagen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblImagen.setIcon(new ImageIcon(pnlVParcela.class
					.getResource("/Presentacion/Imagenes/" + String.valueOf(parcela.getImagen()) + ".jpg")));
			GridBagConstraints gbc_lblImagen = new GridBagConstraints();
			gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
			gbc_lblImagen.gridx = 1;
			gbc_lblImagen.gridy = 3;
			add(lblImagen, gbc_lblImagen);
		}
		{
			pnlPrecio = new JPanel();
			pnlPrecio.setOpaque(false);
			GridBagConstraints gbc_pnlPrecio = new GridBagConstraints();
			gbc_pnlPrecio.gridwidth = 2;
			gbc_pnlPrecio.insets = new Insets(0, 0, 0, 5);
			gbc_pnlPrecio.fill = GridBagConstraints.BOTH;
			gbc_pnlPrecio.gridx = 3;
			gbc_pnlPrecio.gridy = 5;
			add(pnlPrecio, gbc_pnlPrecio);
			GridBagLayout gbl_pnlPrecio = new GridBagLayout();
			gbl_pnlPrecio.columnWidths = new int[] { 0, 30, 0, 30, 0, 0 };
			gbl_pnlPrecio.rowHeights = new int[] { 0, 0 };
			gbl_pnlPrecio.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlPrecio.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
			pnlPrecio.setLayout(gbl_pnlPrecio);
			{
				lblPrecioPar = new JLabel(String.valueOf(parcela.getPrecio_tBaja() + " euros/noche"));
				lblPrecioPar.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_lblPrecioPar = new GridBagConstraints();
				gbc_lblPrecioPar.insets = new Insets(0, 0, 0, 5);
				gbc_lblPrecioPar.gridx = 0;
				gbc_lblPrecioPar.gridy = 0;
				pnlPrecio.add(lblPrecioPar, gbc_lblPrecioPar);
			}
			{
				btnReservar = new JButton("RERSERVAR");
				GridBagConstraints gbc_btnReservar = new GridBagConstraints();
				gbc_btnReservar.insets = new Insets(0, 0, 0, 5);
				gbc_btnReservar.gridx = 2;
				gbc_btnReservar.gridy = 0;
				pnlPrecio.add(btnReservar, gbc_btnReservar);
				btnReservar.setBorder(UIManager.getBorder("Button.border"));
				btnReservar.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
			{
				lblDisponibilidadPar = new JLabel(parcela.getDisponibilidad().toString());
				lblDisponibilidadPar.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_lblDisponibilidadPar = new GridBagConstraints();
				gbc_lblDisponibilidadPar.gridx = 4;
				gbc_lblDisponibilidadPar.gridy = 0;
				pnlPrecio.add(lblDisponibilidadPar, gbc_lblDisponibilidadPar);
			}
		}

	}

	public void loadData(Parcela parcela) {
		lblPrecioPar.setText(String.valueOf(parcela.getPrecio_noche()));
		lblUbicacionPar.setText(parcela.getUbicacion());
		lblEquipamientopar.setText(parcela.getServicios());
		lblNombreParcela.setText(parcela.getTipo());
		lblTamanoPar.setText(Double.toString(parcela.getTamano()) + " metros cuadrados");
		lblPrecioPar.setText(Double.toString(parcela.getPrecio_noche()) + " euros/noche");
		lblImagen.setIcon(new ImageIcon(pnlVBungalow.class
				.getResource("/Presentacion/Imagenes/" + String.valueOf(parcela.getImagen()) + ".jpg")));
		lblDisponibilidadPar.setText(parcela.getDisponibilidad().toString());
	}

	public Parcela getParcela() {
		return parcela;
	}

	public boolean isSeleccionado() {
		return isSeleccionado;
	}

	public void deseleccionar() {
		isSeleccionado = false;
		setBackground(noSeleccionado);
	}

	public void delete() {
		parcela.delete();
	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {

			if (!pnlContenedorParcelas.isMoreThanOneSelectioned()) {
				if (!isSeleccionado) {
					isSeleccionado = true;
					setBackground(seleccionado);
					pnlCaracteristicas.setBackground(seleccionado);
				} else {
					isSeleccionado = false;
					setBackground(noSeleccionado);
					pnlCaracteristicas.setBackground(noSeleccionado);
				}
			} else {
				pnlContenedorParcelas.quitarTodasSelecciones();
			}

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(seleccionado);
				pnlCaracteristicas.setBackground(seleccionado);

			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(noSeleccionado);
				pnlCaracteristicas.setBackground(noSeleccionado);
			}
		}
	}

	private class ComboBoxItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			parcela.read();
			switch (comboBox.getSelectedItem().toString()) {
			case "Alta":
				lblPrecioPar.setText(String.valueOf(parcela.getPrecio_tAlta() + " euros/noche"));
				break;
			case "Baja":
				lblPrecioPar.setText(String.valueOf(parcela.getPrecio_tBaja() + " euros/noche"));
				break;
			case "Media":
				lblPrecioPar.setText(String.valueOf(parcela.getPrecio_tMedia() + " euros/noche"));
				break;
			default:
				break;
			}
		}
	}
}
