package Presentacion;

import javax.swing.JPanel;

import Dominio.Empleado;

import java.awt.GridBagLayout;
import java.awt.Image;

import Dominio.Actividad;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class pnlVActividad extends JPanel {
	private JLabel lblFoto;
	private JLabel lblHorarioAc;
	private JLabel lblNombreAc;

	private Color noSeleccionado = this.getBackground();
	private Color seleccionado = new Color(250, 250, 200);
	private Color original = this.getBackground();
	private Actividad actividad;
	private boolean isSeleccionado = false;
	private pnlFormActividades pnlActividad;
	private JLabel lblHorario;

	/**
	 * Create the panel.
	 */
	public pnlVActividad(Actividad actividad, pnlFormActividades pnlActividad) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		this.actividad = actividad;
		this.pnlActividad = pnlActividad;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 98, 20, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 32, 32, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblFoto = new JLabel();
			GridBagConstraints gbc_lblFoto = new GridBagConstraints();
			gbc_lblFoto.gridheight = 2;
			gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
			gbc_lblFoto.gridx = 1;
			gbc_lblFoto.gridy = 1;
			add(lblFoto, gbc_lblFoto);
			ImageIcon miniatura = null;
			try {
				miniatura = new ImageIcon(
						getClass().getClassLoader().getResource("Presentacion/Imagenes/" + actividad.getImagen()));

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
			lblNombreAc = new JLabel(actividad.getNombre());
			lblNombreAc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblNombreAc = new GridBagConstraints();
			gbc_lblNombreAc.gridwidth = 2;
			gbc_lblNombreAc.anchor = GridBagConstraints.WEST;
			gbc_lblNombreAc.insets = new Insets(0, 0, 5, 0);
			gbc_lblNombreAc.gridx = 3;
			gbc_lblNombreAc.gridy = 1;
			add(lblNombreAc, gbc_lblNombreAc);
		}
		{
			lblHorario = new JLabel("Horario: ");
			lblHorario.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblHorario = new GridBagConstraints();
			gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
			gbc_lblHorario.gridx = 3;
			gbc_lblHorario.gridy = 2;
			add(lblHorario, gbc_lblHorario);
		}
		{
			lblHorarioAc = new JLabel(actividad.getHorario());
			GridBagConstraints gbc_lblHorarioAc = new GridBagConstraints();
			gbc_lblHorarioAc.anchor = GridBagConstraints.WEST;
			gbc_lblHorarioAc.insets = new Insets(0, 0, 5, 0);
			gbc_lblHorarioAc.gridx = 4;
			gbc_lblHorarioAc.gridy = 2;
			add(lblHorarioAc, gbc_lblHorarioAc);
		}

	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!isSeleccionado) {
				isSeleccionado = true;
				setBackground(seleccionado);
				pnlActividad.loadActividad(actividad);
				isSeleccionado = false;
			} else {
				isSeleccionado = true;
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

	public Actividad getActividad() {
		return this.actividad;
	}

	public boolean isSeleccionado() {
		return this.isSeleccionado;
	}
}