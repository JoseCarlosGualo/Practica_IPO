package Presentacion;

import javax.swing.JPanel;

import Dominio.Bungalow;
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

	private Parcela parcela = new Parcela();
	private JLabel lblPrecioPar;
	private JButton btnReservar;
	private JLabel lblTemporada;
	private JComboBox comboBox;
	private JPanel pnlCaracteristicas;

	/**
	 * Create the panel.
	 */
	public pnlVParcela() {
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 0, 20, 0, 0, 20, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblNombreParcela = new JLabel("Bungalow Familiar");
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
			gbl_pnlCaracteristicas.columnWidths = new int[] { 0, 0, 0 };
			gbl_pnlCaracteristicas.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			gbl_pnlCaracteristicas.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
			gbl_pnlCaracteristicas.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
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
				lblTamanoPar = new JLabel("250 m\u00B2");
				GridBagConstraints gbc_lblTamanoPar = new GridBagConstraints();
				gbc_lblTamanoPar.anchor = GridBagConstraints.WEST;
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
				lblUbicacionPar = new JLabel("");
				GridBagConstraints gbc_lblUbicacionPar = new GridBagConstraints();
				gbc_lblUbicacionPar.anchor = GridBagConstraints.WEST;
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
				lblEquipamientopar = new JLabel("EquipamientoBun");
				GridBagConstraints gbc_lblEquipamientopar = new GridBagConstraints();
				gbc_lblEquipamientopar.anchor = GridBagConstraints.WEST;
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
				comboBox.setModel(new DefaultComboBoxModel(new String[] { "Baja", "Media", "Alta" }));
				GridBagConstraints gbc_comboBox = new GridBagConstraints();
				gbc_comboBox.insets = new Insets(0, 0, 5, 0);
				gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBox.gridx = 1;
				gbc_comboBox.gridy = 7;
				pnlCaracteristicas.add(comboBox, gbc_comboBox);
			}
			{
				lblPrecioPar = new JLabel("");
				GridBagConstraints gbc_lblPrecioPar = new GridBagConstraints();
				gbc_lblPrecioPar.insets = new Insets(0, 0, 0, 5);
				gbc_lblPrecioPar.gridx = 0;
				gbc_lblPrecioPar.gridy = 9;
				pnlCaracteristicas.add(lblPrecioPar, gbc_lblPrecioPar);
				lblPrecioPar.setFont(new Font("Tahoma", Font.PLAIN, 18));
			}
			{
				btnReservar = new JButton("RERSERVAR");
				btnReservar.setBorder(UIManager.getBorder("Button.border"));
				GridBagConstraints gbc_btnReservar = new GridBagConstraints();
				gbc_btnReservar.gridx = 1;
				gbc_btnReservar.gridy = 9;
				pnlCaracteristicas.add(btnReservar, gbc_btnReservar);
				btnReservar.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
		}
		{
			lblImagen = new JLabel("");
			lblImagen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblImagen.setIcon(new ImageIcon(pnlVParcela.class.getResource("/Presentacion/Imágenes/parcela.jpg")));
			GridBagConstraints gbc_lblImagen = new GridBagConstraints();
			gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
			gbc_lblImagen.gridx = 1;
			gbc_lblImagen.gridy = 3;
			add(lblImagen, gbc_lblImagen);
		}

	}

	public void loadData(Parcela parcela) {
		lblUbicacionPar.setText(parcela.getUbicacion());
		lblEquipamientopar.setText(parcela.getServicios());
		lblNombreParcela.setText(parcela.getTipo());
		lblTamanoPar.setText(Double.toString(parcela.getTamano()) + "m2");
		lblPrecioPar.setText(Double.toString(parcela.getPrecio_noche()) + "€/noche");
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

	/*
	 * public void delete() { bungalow.delete(); }
	 */

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!isSeleccionado) {
				isSeleccionado = true;
				setBackground(seleccionado);
				pnlCaracteristicas.setBackground(seleccionado);
			} else {
				isSeleccionado = false;
				setBackground(noSeleccionado);
				pnlCaracteristicas.setBackground(noSeleccionado);
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
}
