package Presentacion;

import javax.swing.JPanel;

import Dominio.Parcela;

import java.awt.GridBagLayout;
import java.awt.Image;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * The Class pnlVParcela.
 */
public class pnlVParcela extends JPanel {
	
	/** The lbl nombre parcela. */
	private JLabel lblNombreParcela;
	
	/** The lbl imagen. */
	private JLabel lblImagen;
	
	/** The lbl caractersticas. */
	private JLabel lblCaractersticas;
	
	/** The lbl tamao. */
	private JLabel lblTamao;
	
	/** The lbl ubicacion. */
	private JLabel lblUbicacion;
	
	/** The lbl equipamiento. */
	private JLabel lblEquipamiento;
	
	/** The lbl tamano par. */
	private JLabel lblTamanoPar;
	
	/** The lbl ubicacion par. */
	private JLabel lblUbicacionPar;
	
	/** The lbl equipamientopar. */
	private JLabel lblEquipamientopar;

	/** The no seleccionado. */
	private Color noSeleccionado;
	
	/** The seleccionado. */
	private Color seleccionado = new Color(250, 250, 200);
	
	/** The is seleccionado. */
	private boolean isSeleccionado = false;

	/** The parcela. */
	private Parcela parcela;
	
	/** The pnl contenedor parcelas. */
	private pnlContenedorParcelas pnlContenedorParcelas;
	
	/** The btn reservar. */
	private JButton btnReservar;
	
	/** The lbl temporada. */
	private JLabel lblTemporada;
	
	/** The combo box. */
	private JComboBox comboBox;
	
	/** The pnl caracteristicas. */
	private JPanel pnlCaracteristicas;
	
	/** The pnl precio. */
	private JPanel pnlPrecio;
	
	/** The lbl disponibilidad par. */
	private JLabel lblDisponibilidadPar;
	
	/** The lbl precio par. */
	private JLabel lblPrecioPar;

	/**
	 * Create the panel.
	 *
	 * @param parcela the parcela
	 * @param pnlcontenedor the pnlcontenedor
	 */
	public pnlVParcela(Parcela parcela, pnlContenedorParcelas pnlcontenedor) {
		setBorder(UIManager.getBorder("InternalFrame.border"));
		this.parcela = parcela;
		this.pnlContenedorParcelas = pnlcontenedor;
		addMouseListener(new ThisMouseListener());
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 10, 0, 20, 0, 0, 20, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 8, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
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
				lblCaractersticas = new JLabel(MessagesLogin.getString("pnlVParcela.lblCaractersticas.text")); //$NON-NLS-1$
				lblCaractersticas.setFont(new Font("Tahoma", Font.BOLD, 18));
				GridBagConstraints gbc_lblCaractersticas = new GridBagConstraints();
				gbc_lblCaractersticas.insets = new Insets(0, 0, 5, 5);
				gbc_lblCaractersticas.gridx = 0;
				gbc_lblCaractersticas.gridy = 0;
				pnlCaracteristicas.add(lblCaractersticas, gbc_lblCaractersticas);
			}
			{
				lblTamao = new JLabel(MessagesLogin.getString("pnlVParcela.lblTamao.text")); //$NON-NLS-1$
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
				lblUbicacion = new JLabel(MessagesLogin.getString("pnlVParcela.lblUbicacion.text")); //$NON-NLS-1$
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
				lblEquipamiento = new JLabel(MessagesLogin.getString("pnlVParcela.lblEquipamiento.text")); //$NON-NLS-1$
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
				lblTemporada = new JLabel(MessagesLogin.getString("pnlVParcela.lblTemporada.text")); //$NON-NLS-1$
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
			lblImagen = new JLabel(); // $NON-NLS-1$
			lblImagen.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			lblImagen.setIcon(
					new ImageIcon(pnlVParcela.class.getResource("/Presentacion/Imagenes/" + parcela.getImagen())));
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
			gbc_pnlPrecio.insets = new Insets(0, 0, 5, 5);
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
				btnReservar = new JButton(MessagesLogin.getString("pnlVParcela.btnReservar.text")); //$NON-NLS-1$
				btnReservar.addActionListener(new BtnReservarActionListener());
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

	/**
	 * Load data.
	 *
	 * @param parcela the parcela
	 */
	public void loadData(Parcela parcela) {
		lblPrecioPar.setText(String.valueOf(parcela.getPrecio_noche()));
		lblUbicacionPar.setText(parcela.getUbicacion());
		lblEquipamientopar.setText(parcela.getServicios());
		lblNombreParcela.setText(parcela.getTipo());
		lblTamanoPar.setText(Double.toString(parcela.getTamano()) + " metros cuadrados");
		lblPrecioPar.setText(Double.toString(parcela.getPrecio_noche()) + " euros/noche");
		ImageIcon miniatura = null;

		try {
			miniatura = new ImageIcon(
					getClass().getClassLoader().getResource("Presentacion/Imagenes/" + parcela.getImagen()));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(250, 250, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblImagen.setIcon(miniatura);
			lblImagen.setToolTipText(parcela.getImagen());

		} catch (Exception e) {

			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/madera.jpg"));
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(128, 128, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblImagen.setIcon(miniatura);
			lblImagen.setToolTipText("foto_random.jpg");
			parcela.setImagen("foto_random.jpg");

		}
	}

	/**
	 * Gets the parcela.
	 *
	 * @return the parcela
	 */
	public Parcela getParcela() {
		return parcela;
	}

	/**
	 * Checks if is seleccionado.
	 *
	 * @return true, if is seleccionado
	 */
	public boolean isSeleccionado() {
		return isSeleccionado;
	}

	/**
	 * Deseleccionar.
	 */
	public void deseleccionar() {
		isSeleccionado = false;
		setBackground(noSeleccionado);
	}

	/**
	 * Delete.
	 */
	public void delete() {
		parcela.delete();
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

		/* (non-Javadoc)
		 * @see java.awt.event.MouseAdapter#mouseEntered(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseEntered(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(seleccionado);
				pnlCaracteristicas.setBackground(seleccionado);

			}
		}

		/* (non-Javadoc)
		 * @see java.awt.event.MouseAdapter#mouseExited(java.awt.event.MouseEvent)
		 */
		@Override
		public void mouseExited(MouseEvent e) {
			if (!isSeleccionado) {
				setBackground(noSeleccionado);
				pnlCaracteristicas.setBackground(noSeleccionado);
			}
		}
	}

	/**
	 * The listener interface for receiving comboBoxItem events.
	 * The class that is interested in processing a comboBoxItem
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addComboBoxItemListener<code> method. When
	 * the comboBoxItem event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see ComboBoxItemEvent
	 */
	private class ComboBoxItemListener implements ItemListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.ItemEvent)
		 */
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

	/**
	 * The listener interface for receiving btnReservarAction events.
	 * The class that is interested in processing a btnReservarAction
	 * event implements this interface, and the object created
	 * with that class is registered with a component using the
	 * component's <code>addBtnReservarActionListener<code> method. When
	 * the btnReservarAction event occurs, that object's appropriate
	 * method is invoked.
	 *
	 * @see BtnReservarActionEvent
	 */
	private class BtnReservarActionListener implements ActionListener {
		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			frmRealizarReservaParcela anadir = new frmRealizarReservaParcela(pnlContenedorParcelas.getBounds(),
					pnlContenedorParcelas, 1, getParcela());
			anadir.setVisible(true);
		}
	}
}
