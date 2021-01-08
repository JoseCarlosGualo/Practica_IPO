package Presentacion;

import javax.swing.JPanel;

import Dominio.Empleado;

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

/**
 * The Class pnlVEmpleado.
 */
public class pnlVEmpleado extends JPanel {
	
	/** The lbl foto. */
	private JLabel lblFoto;
	
	/** The lbl dni. */
	private JLabel lblDni;
	
	/** The lbl nombre. */
	private JLabel lblNombre;

	/** The no seleccionado. */
	private Color noSeleccionado = this.getBackground();
	
	/** The seleccionado. */
	private Color seleccionado = new Color(250, 250, 200);
	
	/** The original. */
	private Color original = this.getBackground();
	
	/** The empleado. */
	private Empleado empleado;
	
	/** The is seleccionado. */
	private boolean isSeleccionado = false;
	
	/** The pnl empleado. */
	private pnlFormEmpleado pnlEmpleado;

	/**
	 * Create the panel.
	 *
	 * @param empleado the empleado
	 * @param pnlEmpleado the pnl empleado
	 */
	public pnlVEmpleado(Empleado empleado, pnlFormEmpleado pnlEmpleado) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		this.empleado = empleado;
		this.pnlEmpleado = pnlEmpleado;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 98, 10, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 10, 32, 32, 10, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
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
						getClass().getClassLoader().getResource("Presentacion/Imagenes/" + empleado.getImagen()));

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
			lblNombre = new JLabel(empleado.getNombre() + " " + empleado.getApellidos());
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.insets = new Insets(0, 0, 5, 0);
			gbc_lblNombre.gridx = 3;
			gbc_lblNombre.gridy = 1;
			add(lblNombre, gbc_lblNombre);
		}
		{
			lblDni = new JLabel(empleado.getDni());
			GridBagConstraints gbc_lblDni = new GridBagConstraints();
			gbc_lblDni.insets = new Insets(0, 0, 5, 0);
			gbc_lblDni.gridx = 3;
			gbc_lblDni.gridy = 2;
			add(lblDni, gbc_lblDni);
		}

	}

	/**
	 * The listener interface for receiving thisMouse events.
	 * The class that is interested in processing a thisMouse
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addThisMouseListener<code> method. When
	 * the thisMouse event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ThisMouseEvent
	 */
	private class ThisMouseListener extends MouseAdapter {
		
		/* (non-Javadoc)
		 * @see java.awt.event.MouseAdapter#mouseClicked(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			if (!isSeleccionado) {
				isSeleccionado = true;
				setBackground(seleccionado);
				pnlEmpleado.loadEmpleado(empleado);
				isSeleccionado = false;
			} else {
				isSeleccionado = false;
				setBackground(original);
			}
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseAdapter#mouseEntered(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseEntered(MouseEvent e) {
			setBackground(seleccionado);
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseExited(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(original);
			}
		}
	}

	/**
	 * Gets the empleado.
	 *
	 * @return the empleado
	 */
	public Empleado getEmpleado() {
		return this.empleado;
	}

	/**
	 * Checks if is seleccionado.
	 *
	 * @return true, if is seleccionado
	 */
	public boolean isSeleccionado() {
		return this.isSeleccionado;
	}
}
