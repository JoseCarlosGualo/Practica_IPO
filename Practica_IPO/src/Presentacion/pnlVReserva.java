package Presentacion;

import javax.swing.JPanel;

import Dominio.Bungalow;
import Dominio.Empleado;
import Dominio.Parcela;
import Dominio.Reserva;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class pnlVReserva extends JPanel {
	private JLabel lblFoto;
	private JLabel lblDniCliRes;
	private JLabel lblNombreRes;

	private Color noSeleccionado = this.getBackground();
	private Color seleccionado = new Color(250, 250, 200);
	private Color original = this.getBackground();
	private Reserva reserva;
	private boolean isSeleccionado = false;
	private pnlFormReserva pnlReserva;
	private JLabel lblEntradaRes;
	private JLabel lblDni;
	private JLabel lblFechaDeEntrada;

	/**
	 * Create the panel.
	 */
	public pnlVReserva(Reserva reserva, pnlFormReserva pnlReserva) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		this.reserva = reserva;
		this.pnlReserva = pnlReserva;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 98, 10, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 32, 32, 32, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblFoto = new JLabel();
			GridBagConstraints gbc_lblFoto = new GridBagConstraints();
			gbc_lblFoto.gridheight = 3;
			gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
			gbc_lblFoto.gridx = 1;
			gbc_lblFoto.gridy = 1;
			add(lblFoto, gbc_lblFoto);
			ImageIcon miniatura = null;
			try {

				if (reserva.getTipo().equalsIgnoreCase("Bungalow")) {
					Bungalow bungalow = new Bungalow(reserva.getEstancia().getId());
					bungalow.read();
					miniatura = new ImageIcon(
							getClass().getClassLoader().getResource("Presentacion/Imagenes/" + bungalow.getImagen()));
				} else {
					Parcela parcela = new Parcela(reserva.getEstancia().getId());
					parcela.read();
					miniatura = new ImageIcon(
							getClass().getClassLoader().getResource("Presentacion/Imagenes/" + parcela.getImagen()));
				}

			} catch (Exception e) {

				miniatura = new ImageIcon(
						getClass().getClassLoader().getResource("Presentacion/Imagenes/foto_random.jpg"));

			} finally {
				Image image = miniatura.getImage();
				Image newimg = image.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH);
				miniatura = new ImageIcon(newimg);
				lblFoto.setIcon(miniatura);
			}
			repaint();
		}
		{
			lblNombreRes = new JLabel(reserva.getEstancia().getTipo());
			lblNombreRes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblNombreRes = new GridBagConstraints();
			gbc_lblNombreRes.gridwidth = 2;
			gbc_lblNombreRes.anchor = GridBagConstraints.WEST;
			gbc_lblNombreRes.insets = new Insets(0, 0, 5, 0);
			gbc_lblNombreRes.gridx = 3;
			gbc_lblNombreRes.gridy = 1;
			add(lblNombreRes, gbc_lblNombreRes);
		}
		{
			lblDni = new JLabel(MessagesLogin.getString("pnlVReserva.lblDni.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.anchor = GridBagConstraints.EAST;
			gbc_lblDni.insets = new Insets(0, 0, 5, 5);
			gbc_lblDni.gridx = 3;
			gbc_lblDni.gridy = 2;
			add(lblDni, gbc_lblDni);
		}
		{
			lblDniCliRes = new JLabel(reserva.getDni());
			GridBagConstraints gbc_lblDniCliRes = new GridBagConstraints();
			gbc_lblDniCliRes.anchor = GridBagConstraints.WEST;
			gbc_lblDniCliRes.insets = new Insets(0, 0, 5, 0);
			gbc_lblDniCliRes.gridx = 4;
			gbc_lblDniCliRes.gridy = 2;
			add(lblDniCliRes, gbc_lblDniCliRes);
		}
		{
			lblFechaDeEntrada = new JLabel(MessagesLogin.getString("pnlVReserva.lblFechaDeEntrada.text")); //$NON-NLS-1$
			GridBagConstraints gbc_lblFechaDeEntrada = new GridBagConstraints();
			gbc_lblFechaDeEntrada.anchor = GridBagConstraints.EAST;
			gbc_lblFechaDeEntrada.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaDeEntrada.gridx = 3;
			gbc_lblFechaDeEntrada.gridy = 3;
			add(lblFechaDeEntrada, gbc_lblFechaDeEntrada);
		}
		{
			lblEntradaRes = new JLabel(reserva.getFecha_entrada());
			GridBagConstraints gbc_lblEntradaRes = new GridBagConstraints();
			gbc_lblEntradaRes.anchor = GridBagConstraints.WEST;
			gbc_lblEntradaRes.insets = new Insets(0, 0, 5, 0);
			gbc_lblEntradaRes.gridx = 4;
			gbc_lblEntradaRes.gridy = 3;
			add(lblEntradaRes, gbc_lblEntradaRes);
		}

	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!isSeleccionado) {
				isSeleccionado = true;
				setBackground(seleccionado);
				pnlReserva.loadReserva(reserva);
				isSeleccionado = false;
			} else {
				isSeleccionado = false;
				setBackground(original);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			setBackground(seleccionado);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(original);
			}
		}
	}

	public Reserva getReserva() {
		return this.reserva;
	}

	public boolean isSeleccionado() {
		return this.isSeleccionado;
	}
}
