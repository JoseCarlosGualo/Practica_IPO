package Presentacion;

import javax.swing.JPanel;

import Dominio.Bungalow;

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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class pnlVBungalow extends JPanel {
	private JLabel lblNombrebungalow;
	private JLabel lblImagen;
	private JPanel pnlCaracteristicas;
	private JLabel lblCaractersticas;
	private JLabel lblTamao;
	private JLabel lblCapacidadMaxima;
	private JLabel lblEstanciaMnima;
	private JLabel lblEquipamiento;
	private JLabel lblDescripcin;
	private JLabel lblTamanoBun;
	private JLabel lblCapacidadMaximaBun;
	private JLabel lblEstanciaMinimaBun;
	private JLabel lblEquipamientobun;

	private Color noSeleccionado;
	private Color seleccionado = new Color(250, 250, 200);
	private boolean isSeleccionado = false;

	private Bungalow bungalow;
	private pnlContenedorBungalows pnlContenedorBungalows;
	private JPanel pnlPrecio;
	private JLabel lblPrecioBun;
	private JButton btnReservar;
	private JTextArea textAreaDescripcion;
	private JLabel lblDisponibilidadBun;

	/**
	 * Create the panel.
	 */
	public pnlVBungalow(Bungalow bungalow, pnlContenedorBungalows pnlContenedor) {
		setBorder(UIManager.getBorder("InternalFrame.border"));
		this.bungalow = bungalow;
		this.pnlContenedorBungalows = pnlContenedor;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 0, 20, 0, 0, 20, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblNombrebungalow = new JLabel(this.bungalow.getTipo());
			lblNombrebungalow.setFont(new Font("Tahoma", Font.BOLD, 23));
			GridBagConstraints gbc_lblNombrebungalow = new GridBagConstraints();
			gbc_lblNombrebungalow.fill = GridBagConstraints.VERTICAL;
			gbc_lblNombrebungalow.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombrebungalow.gridx = 1;
			gbc_lblNombrebungalow.gridy = 1;
			add(lblNombrebungalow, gbc_lblNombrebungalow);
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
			gbl_pnlCaracteristicas.columnWidths = new int[] { 0, 446, 0 };
			gbl_pnlCaracteristicas.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			gbl_pnlCaracteristicas.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlCaracteristicas.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
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
				lblTamanoBun = new JLabel(this.bungalow.getTamano() + " m\u00B2");
				GridBagConstraints gbc_lblTamanoBun = new GridBagConstraints();
				gbc_lblTamanoBun.anchor = GridBagConstraints.WEST;
				gbc_lblTamanoBun.insets = new Insets(0, 0, 5, 0);
				gbc_lblTamanoBun.gridx = 1;
				gbc_lblTamanoBun.gridy = 1;
				pnlCaracteristicas.add(lblTamanoBun, gbc_lblTamanoBun);
			}
			{
				lblCapacidadMaxima = new JLabel("Capacidad M\u00E1xima: ");
				GridBagConstraints gbc_lblCapacidadMaxima = new GridBagConstraints();
				gbc_lblCapacidadMaxima.anchor = GridBagConstraints.WEST;
				gbc_lblCapacidadMaxima.insets = new Insets(0, 0, 5, 5);
				gbc_lblCapacidadMaxima.gridx = 0;
				gbc_lblCapacidadMaxima.gridy = 3;
				pnlCaracteristicas.add(lblCapacidadMaxima, gbc_lblCapacidadMaxima);
			}
			{
				lblCapacidadMaximaBun = new JLabel(this.bungalow.getCapacidad_maxima() + " Personas");
				GridBagConstraints gbc_lblCapacidadMaximaBun = new GridBagConstraints();
				gbc_lblCapacidadMaximaBun.anchor = GridBagConstraints.WEST;
				gbc_lblCapacidadMaximaBun.insets = new Insets(0, 0, 5, 0);
				gbc_lblCapacidadMaximaBun.gridx = 1;
				gbc_lblCapacidadMaximaBun.gridy = 3;
				pnlCaracteristicas.add(lblCapacidadMaximaBun, gbc_lblCapacidadMaximaBun);
			}
			{
				lblEstanciaMnima = new JLabel("Estancia M\u00EDnima: ");
				GridBagConstraints gbc_lblEstanciaMnima = new GridBagConstraints();
				gbc_lblEstanciaMnima.anchor = GridBagConstraints.WEST;
				gbc_lblEstanciaMnima.insets = new Insets(0, 0, 5, 5);
				gbc_lblEstanciaMnima.gridx = 0;
				gbc_lblEstanciaMnima.gridy = 5;
				pnlCaracteristicas.add(lblEstanciaMnima, gbc_lblEstanciaMnima);
			}
			{
				lblEstanciaMinimaBun = new JLabel(this.bungalow.getEstancia_minima() + " d\u00EDas");
				GridBagConstraints gbc_lblEstanciaMinimaBun = new GridBagConstraints();
				gbc_lblEstanciaMinimaBun.anchor = GridBagConstraints.WEST;
				gbc_lblEstanciaMinimaBun.insets = new Insets(0, 0, 5, 0);
				gbc_lblEstanciaMinimaBun.gridx = 1;
				gbc_lblEstanciaMinimaBun.gridy = 5;
				pnlCaracteristicas.add(lblEstanciaMinimaBun, gbc_lblEstanciaMinimaBun);
			}
			{
				lblEquipamiento = new JLabel("Equipamiento:");
				GridBagConstraints gbc_lblEquipamiento = new GridBagConstraints();
				gbc_lblEquipamiento.anchor = GridBagConstraints.WEST;
				gbc_lblEquipamiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblEquipamiento.gridx = 0;
				gbc_lblEquipamiento.gridy = 7;
				pnlCaracteristicas.add(lblEquipamiento, gbc_lblEquipamiento);
			}
			{
				lblEquipamientobun = new JLabel(this.bungalow.getEquipamiento());
				GridBagConstraints gbc_lblEquipamientobun = new GridBagConstraints();
				gbc_lblEquipamientobun.anchor = GridBagConstraints.WEST;
				gbc_lblEquipamientobun.insets = new Insets(0, 0, 5, 0);
				gbc_lblEquipamientobun.gridx = 1;
				gbc_lblEquipamientobun.gridy = 7;
				pnlCaracteristicas.add(lblEquipamientobun, gbc_lblEquipamientobun);
			}
			{
				lblDescripcin = new JLabel("Descripci\u00F3n: ");
				GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
				gbc_lblDescripcin.anchor = GridBagConstraints.NORTHWEST;
				gbc_lblDescripcin.insets = new Insets(0, 0, 0, 5);
				gbc_lblDescripcin.gridx = 0;
				gbc_lblDescripcin.gridy = 9;
				pnlCaracteristicas.add(lblDescripcin, gbc_lblDescripcin);
			}
			{
				textAreaDescripcion = new JTextArea();
				textAreaDescripcion.setEditable(false);
				textAreaDescripcion.setText(this.bungalow.getDescripcion());
				textAreaDescripcion.setWrapStyleWord(true);
				textAreaDescripcion.setOpaque(false);
				textAreaDescripcion.setBackground(SystemColor.menu);
				textAreaDescripcion.setLineWrap(true);
				GridBagConstraints gbc_textAreaDescripcion = new GridBagConstraints();
				gbc_textAreaDescripcion.anchor = GridBagConstraints.NORTH;
				gbc_textAreaDescripcion.fill = GridBagConstraints.HORIZONTAL;
				gbc_textAreaDescripcion.gridx = 1;
				gbc_textAreaDescripcion.gridy = 9;
				pnlCaracteristicas.add(textAreaDescripcion, gbc_textAreaDescripcion);
			}
		}
		{
			lblImagen = new JLabel("");
			lblImagen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblImagen.setIcon(new ImageIcon(
					pnlVBungalow.class.getResource("/Presentacion/Imagenes/" + this.bungalow.getImagen() + ".jpg")));
			GridBagConstraints gbc_lblImagen = new GridBagConstraints();
			gbc_lblImagen.insets = new Insets(0, 0, 5, 5);
			gbc_lblImagen.gridx = 1;
			gbc_lblImagen.gridy = 3;
			add(lblImagen, gbc_lblImagen);
		}
		{
			pnlPrecio = new JPanel();
			GridBagConstraints gbc_pnlPrecio = new GridBagConstraints();
			gbc_pnlPrecio.insets = new Insets(0, 0, 0, 5);
			gbc_pnlPrecio.fill = GridBagConstraints.BOTH;
			gbc_pnlPrecio.gridx = 4;
			gbc_pnlPrecio.gridy = 5;
			add(pnlPrecio, gbc_pnlPrecio);
			GridBagLayout gbl_pnlPrecio = new GridBagLayout();
			gbl_pnlPrecio.columnWidths = new int[] { 0, 30, 0, 30, 0, 0 };
			gbl_pnlPrecio.rowHeights = new int[] { 0, 0 };
			gbl_pnlPrecio.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
			gbl_pnlPrecio.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
			pnlPrecio.setLayout(gbl_pnlPrecio);
			{
				lblPrecioBun = new JLabel(this.bungalow.getPrecio_noche() + " euros/noche");
				lblPrecioBun.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_lblPrecioBun = new GridBagConstraints();
				gbc_lblPrecioBun.insets = new Insets(0, 0, 0, 5);
				gbc_lblPrecioBun.anchor = GridBagConstraints.WEST;
				gbc_lblPrecioBun.gridx = 0;
				gbc_lblPrecioBun.gridy = 0;
				pnlPrecio.add(lblPrecioBun, gbc_lblPrecioBun);
			}
			{
				btnReservar = new JButton("RERSERVAR");
				btnReservar.addActionListener(new BtnReservarActionListener());
				btnReservar.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_btnReservar = new GridBagConstraints();
				gbc_btnReservar.insets = new Insets(0, 0, 0, 5);
				gbc_btnReservar.gridx = 2;
				gbc_btnReservar.gridy = 0;
				pnlPrecio.add(btnReservar, gbc_btnReservar);
			}
			{
				lblDisponibilidadBun = new JLabel(this.bungalow.getDisponibilidad().toString());
				lblDisponibilidadBun.setFont(new Font("Tahoma", Font.PLAIN, 18));
				GridBagConstraints gbc_lblDisponibilidadBun = new GridBagConstraints();
				gbc_lblDisponibilidadBun.gridx = 4;
				gbc_lblDisponibilidadBun.gridy = 0;
				pnlPrecio.add(lblDisponibilidadBun, gbc_lblDisponibilidadBun);
			}
		}

	}

	public void loadData(Bungalow bungalow) {
		lblCapacidadMaximaBun.setText(Integer.toString(bungalow.getCapacidad_maxima()));
		lblEquipamientobun.setText(bungalow.getEquipamiento());
		lblEstanciaMinimaBun.setText(Integer.toString(bungalow.getEstancia_minima()));
		lblNombrebungalow.setText(bungalow.getTipo());
		lblTamanoBun.setText(Double.toString(bungalow.getTamano()) + " metros cuadrados");
		lblPrecioBun.setText(Double.toString(bungalow.getPrecio_noche()) + " euros/noche");
		lblImagen.setIcon(new ImageIcon(pnlVBungalow.class
				.getResource("/Presentacion/Imagenes/" + String.valueOf(bungalow.getImagen()) + ".jpg")));
		textAreaDescripcion.setText(bungalow.getDescripcion());
		lblDisponibilidadBun.setText(bungalow.getDisponibilidad().toString());
	}

	public Bungalow getBungalow() {
		return bungalow;
	}

	public boolean isSeleccionado() {
		return isSeleccionado;
	}

	public void deseleccionar() {
		isSeleccionado = false;
		setBackground(noSeleccionado);
	}

	public void delete() {
		bungalow.delete();
	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {

			if (!pnlContenedorBungalows.isMoreThanOneSelectioned()) {
				if (!isSeleccionado) {
					isSeleccionado = true;
					setBackground(seleccionado);
					pnlCaracteristicas.setBackground(seleccionado);
					pnlPrecio.setBackground(seleccionado);
				} else {
					isSeleccionado = false;
					setBackground(noSeleccionado);
					pnlCaracteristicas.setBackground(noSeleccionado);
					pnlPrecio.setBackground(noSeleccionado);
				}
			} else {
				pnlContenedorBungalows.quitarTodasSelecciones();
			}

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(seleccionado);
				pnlCaracteristicas.setBackground(seleccionado);
				pnlPrecio.setBackground(seleccionado);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(noSeleccionado);
				pnlCaracteristicas.setBackground(noSeleccionado);
				pnlPrecio.setBackground(noSeleccionado);
			}
		}
	}

	private class BtnReservarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmRealizarReservaBungalow anadir = new frmRealizarReservaBungalow(pnlContenedorBungalows.getBounds(),
					pnlContenedorBungalows, 1, getBungalow());
			anadir.setVisible(true);
		}
	}
}
