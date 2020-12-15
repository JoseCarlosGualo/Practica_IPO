package Presentacion;

import javax.swing.JPanel;

import Dominio.Empleado;

import java.awt.GridBagLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pnlVEmpleado extends JPanel {
	private JLabel lblFoto;
	private JLabel lblDni;
	private JLabel lblNombre;

	private Color noSeleccionado = this.getBackground();
	private Color seleccionado = new Color(250, 250, 200);
	private Color original = this.getBackground();
	private Empleado empleado;
	private boolean isSeleccionado = false;
	private pnlFormEmpleado pnlEmpleado;

	// formulariocliente
	/**
	 * Create the panel.
	 */
	public pnlVEmpleado(Empleado empleado, pnlFormEmpleado pnlEmpleado) {
		this.empleado = empleado;
		this.pnlEmpleado = pnlEmpleado;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 98, 10, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 0, 0, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		{
			lblFoto = new JLabel("");
			GridBagConstraints gbc_lblFoto = new GridBagConstraints();
			gbc_lblFoto.gridheight = 2;
			gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
			gbc_lblFoto.gridx = 1;
			gbc_lblFoto.gridy = 1;
			add(lblFoto, gbc_lblFoto);
		}
		{
			lblNombre = new JLabel("");
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.insets = new Insets(0, 0, 5, 0);
			gbc_lblNombre.gridx = 3;
			gbc_lblNombre.gridy = 1;
			add(lblNombre, gbc_lblNombre);
		}
		{
			lblDni = new JLabel("");
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.insets = new Insets(0, 0, 5, 0);
			gbc_lblDni.gridx = 3;
			gbc_lblDni.gridy = 2;
			add(lblDni, gbc_lblDni);
		}

	}

	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!isSeleccionado) {
				isSeleccionado = true;
				// pnlEmpleado.loadEmpleado(empleado);
				isSeleccionado = false;
			} else {
				isSeleccionado = true;
				setBackground(original);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			setBackground(noSeleccionado);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(original);
			}
		}
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public boolean isSeleccionado() {
		return this.isSeleccionado;
	}
}
