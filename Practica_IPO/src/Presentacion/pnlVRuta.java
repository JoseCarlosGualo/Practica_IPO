package Presentacion;

import javax.swing.JPanel;

import Dominio.RutaSenderista;

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
import java.text.ParseException;

import javax.swing.border.LineBorder;
import java.awt.Font;

/**
 * The Class pnlVRuta.
 */
public class pnlVRuta extends JPanel {
	
	/** The lbl foto. */
	private JLabel lblFoto;
	
	/** The lbl ruta. */
	private JLabel lblRuta;
	
	/** The lbl nombre ruta. */
	private JLabel lblNombreRuta;

	/** The no seleccionado. */
	private Color noSeleccionado = this.getBackground();
	
	/** The seleccionado. */
	private Color seleccionado = new Color(250, 250, 200);
	
	/** The original. */
	private Color original = this.getBackground();
	
	/** The ruta. */
	private RutaSenderista ruta;
	
	/** The is seleccionado. */
	private boolean isSeleccionado = false;
	
	/** The pnl rutas. */
	private pnlFormRutas pnlRutas;
	
	/** The lbl inicio. */
	private JLabel lblInicio;

	/**
	 * Create the panel.
	 *
	 * @param ruta the ruta
	 * @param pnlRutas the pnl rutas
	 */
	public pnlVRuta(RutaSenderista ruta, pnlFormRutas pnlRutas) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		this.ruta = ruta;
		this.pnlRutas = pnlRutas;
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
						getClass().getClassLoader().getResource("Presentacion/Imagenes/" + ruta.getFoto()));

			} catch (Exception e) {

				miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/mapa.jpg"));

			} finally {
				Image image = miniatura.getImage();
				Image newimg = image.getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH);
				miniatura = new ImageIcon(newimg);
				lblFoto.setIcon(miniatura);
			}
			repaint();
		}
		{
			lblNombreRuta = new JLabel(ruta.getNombre());
			lblNombreRuta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
			GridBagConstraints gbc_lblNombreRuta = new GridBagConstraints();
			gbc_lblNombreRuta.gridwidth = 2;
			gbc_lblNombreRuta.anchor = GridBagConstraints.WEST;
			gbc_lblNombreRuta.insets = new Insets(0, 0, 5, 0);
			gbc_lblNombreRuta.gridx = 3;
			gbc_lblNombreRuta.gridy = 1;
			add(lblNombreRuta, gbc_lblNombreRuta);
		}
		{
			lblInicio = new JLabel(MessagesLogin.getString("pnlVRuta.lblInicio.text")); //$NON-NLS-1$
			lblInicio.setFont(new Font("Tahoma", Font.BOLD, 14));
			GridBagConstraints gbc_lblInicio = new GridBagConstraints();
			gbc_lblInicio.insets = new Insets(0, 0, 5, 5);
			gbc_lblInicio.gridx = 3;
			gbc_lblInicio.gridy = 2;
			add(lblInicio, gbc_lblInicio);
		}
		{
			lblRuta = new JLabel(ruta.getDia());
			GridBagConstraints gbc_lblRuta = new GridBagConstraints();
			gbc_lblRuta.anchor = GridBagConstraints.WEST;
			gbc_lblRuta.insets = new Insets(0, 0, 5, 0);
			gbc_lblRuta.gridx = 4;
			gbc_lblRuta.gridy = 2;
			add(lblRuta, gbc_lblRuta);
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
				try {
					pnlRutas.loadRuta(ruta);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				isSeleccionado = false;
			} else {
				isSeleccionado = true;
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
	 * Gets the ruta.
	 *
	 * @return the ruta
	 */
	public RutaSenderista getRuta() {
		return this.ruta;
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