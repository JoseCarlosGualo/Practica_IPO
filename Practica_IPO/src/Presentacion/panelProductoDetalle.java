package Presentacion;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.border.LineBorder;

import Dominio.Producto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class panelProductoDetalle extends JPanel {
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JLabel lblCategoria;
	private JLabel lblTipo;
	private JLabel lblNombreproducto;
	private JLabel lblCategoriaproducto;
	private JLabel lblTipoproducto;
	private JLabel lblPrecio;
	private JLabel lblKcal;
	private JLabel lblKcalpruducto;
	private JLabel lblPrecioproducto;
	private JPanel panel;
	private JLabel lblLbltituloalergenos;
	private JList<String> list;
	private JLabel lblIdentificador;
	
	private Color colorNoSeleccionado;
	private Color colorSeleccionado = new Color(250,250,200);
	private boolean seleccionado = false;
	
	private Producto p=new Producto();

	/**
	 * Create the panel.
	 */
	public panelProductoDetalle() {
		addMouseListener(new ThisMouseListener());
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 0, 0, 20, 87, 160, 60, 130, 0, 0, 15, 0};
		gridBagLayout.rowHeights = new int[]{10, 20, 0, 0, 0, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		{
			lblFoto = new JLabel("New label");
			lblFoto.setBorder(new LineBorder(new Color(0, 0, 0)));
			GridBagConstraints gbc_lblFoto = new GridBagConstraints();
			gbc_lblFoto.fill = GridBagConstraints.BOTH;
			gbc_lblFoto.gridheight = 5;
			gbc_lblFoto.gridwidth = 3;
			gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
			gbc_lblFoto.gridx = 1;
			gbc_lblFoto.gridy = 1;
			add(lblFoto, gbc_lblFoto);
		}
		{
			lblNombre = new JLabel(MessagesPrincipal.getString("panelProductoDetalle.lblNombre.text")); //$NON-NLS-1$
			lblNombre.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblNombre = new GridBagConstraints();
			gbc_lblNombre.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre.gridx = 5;
			gbc_lblNombre.gridy = 1;
			add(lblNombre, gbc_lblNombre);
		}
		{
			lblNombreproducto = new JLabel("nombre_producto");
			GridBagConstraints gbc_lblNombreproducto = new GridBagConstraints();
			gbc_lblNombreproducto.anchor = GridBagConstraints.WEST;
			gbc_lblNombreproducto.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombreproducto.gridx = 6;
			gbc_lblNombreproducto.gridy = 1;
			add(lblNombreproducto, gbc_lblNombreproducto);
		}
		{
			panel = new JPanel();
			panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.gridheight = 5;
			gbc_panel.gridwidth = 3;
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 8;
			gbc_panel.gridy = 1;
			add(panel, gbc_panel);
			panel.setLayout(new BorderLayout(0, 0));
			{
				lblLbltituloalergenos = new JLabel(MessagesPrincipal.getString("panelProductoDetalle.lblLbltituloalergenos.text")); //$NON-NLS-1$
				lblLbltituloalergenos.setBackground(Color.GRAY);
				lblLbltituloalergenos.setOpaque(true);
				lblLbltituloalergenos.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel.add(lblLbltituloalergenos, BorderLayout.NORTH);
			}
			{
				list = new JList<String>();
				panel.add(list, BorderLayout.CENTER);
			}
		}
		{
			lblCategoria = new JLabel(MessagesPrincipal.getString("panelProductoDetalle.lblCategoria.text")); //$NON-NLS-1$
			lblCategoria.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblCategoria = new GridBagConstraints();
			gbc_lblCategoria.anchor = GridBagConstraints.WEST;
			gbc_lblCategoria.insets = new Insets(0, 0, 5, 5);
			gbc_lblCategoria.gridx = 5;
			gbc_lblCategoria.gridy = 2;
			add(lblCategoria, gbc_lblCategoria);
		}
		{
			lblCategoriaproducto = new JLabel("categoria_producto");
			GridBagConstraints gbc_lblCategoriaproducto = new GridBagConstraints();
			gbc_lblCategoriaproducto.anchor = GridBagConstraints.WEST;
			gbc_lblCategoriaproducto.insets = new Insets(0, 0, 5, 5);
			gbc_lblCategoriaproducto.gridx = 6;
			gbc_lblCategoriaproducto.gridy = 2;
			add(lblCategoriaproducto, gbc_lblCategoriaproducto);
		}
		{
			lblTipo = new JLabel(MessagesPrincipal.getString("panelProductoDetalle.lblTipo.text")); //$NON-NLS-1$
			lblTipo.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblTipo = new GridBagConstraints();
			gbc_lblTipo.anchor = GridBagConstraints.WEST;
			gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
			gbc_lblTipo.gridx = 5;
			gbc_lblTipo.gridy = 3;
			add(lblTipo, gbc_lblTipo);
		}
		{
			lblTipoproducto = new JLabel("tipo_producto");
			GridBagConstraints gbc_lblTipoproducto = new GridBagConstraints();
			gbc_lblTipoproducto.anchor = GridBagConstraints.WEST;
			gbc_lblTipoproducto.insets = new Insets(0, 0, 5, 5);
			gbc_lblTipoproducto.gridx = 6;
			gbc_lblTipoproducto.gridy = 3;
			add(lblTipoproducto, gbc_lblTipoproducto);
		}
		{
			lblPrecio = new JLabel(MessagesPrincipal.getString("panelProductoDetalle.lblPrecio.text")); //$NON-NLS-1$
			lblPrecio.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
			gbc_lblPrecio.anchor = GridBagConstraints.WEST;
			gbc_lblPrecio.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrecio.gridx = 5;
			gbc_lblPrecio.gridy = 4;
			add(lblPrecio, gbc_lblPrecio);
		}
		{
			lblPrecioproducto = new JLabel("precio_producto");
			GridBagConstraints gbc_lblPrecioproducto = new GridBagConstraints();
			gbc_lblPrecioproducto.anchor = GridBagConstraints.WEST;
			gbc_lblPrecioproducto.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrecioproducto.gridx = 6;
			gbc_lblPrecioproducto.gridy = 4;
			add(lblPrecioproducto, gbc_lblPrecioproducto);
		}
		{
			lblKcal = new JLabel("Kcal:");
			lblKcal.setFont(new Font("Lucida Grande", Font.BOLD, 13));
			GridBagConstraints gbc_lblKcal = new GridBagConstraints();
			gbc_lblKcal.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblKcal.insets = new Insets(0, 0, 5, 5);
			gbc_lblKcal.gridx = 5;
			gbc_lblKcal.gridy = 5;
			add(lblKcal, gbc_lblKcal);
		}
		{
			lblKcalpruducto = new JLabel("kcal_pruducto");
			GridBagConstraints gbc_lblKcalpruducto = new GridBagConstraints();
			gbc_lblKcalpruducto.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblKcalpruducto.insets = new Insets(0, 0, 5, 5);
			gbc_lblKcalpruducto.gridx = 6;
			gbc_lblKcalpruducto.gridy = 5;
			add(lblKcalpruducto, gbc_lblKcalpruducto);
		}
		{
			lblIdentificador = new JLabel("");
			lblIdentificador.setVisible(false);
			GridBagConstraints gbc_lblIdentificador = new GridBagConstraints();
			gbc_lblIdentificador.insets = new Insets(0, 0, 5, 5);
			gbc_lblIdentificador.gridx = 7;
			gbc_lblIdentificador.gridy = 5;
			add(lblIdentificador, gbc_lblIdentificador);
		}

		colorNoSeleccionado = getBackground();
	}
	

	public void cargarDatos(Producto producto) {
		p=producto;
		lblNombreproducto.setText(producto.getNombre());
		lblCategoriaproducto.setText(producto.getCategoria());
		lblPrecioproducto.setText(String.format("%.2f€", producto.getPrecio()));
		lblKcalpruducto.setText(Integer.toString(producto.getKcal()));
		lblTipoproducto.setText(producto.getSubTipo());
		lblIdentificador.setText(Integer.toString(producto.getId()));
		
		String [] alergenos = producto.getAlergenos().split(",");
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		for(String alergeno : alergenos) {
			modelo.addElement(alergeno);
		}
		list.setModel(modelo);
		
		lblFoto.setText("");
		ImageIcon miniatura = null;
		try {
			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/FotosComida/" + producto.getFoto()));

		} catch (Exception e) {
			
			miniatura = new ImageIcon(getClass().getClassLoader().getResource("Presentacion/Imagenes/imagenDefecto.png"));

		} finally {
			Image image = miniatura.getImage();
			Image newimg = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
			miniatura = new ImageIcon(newimg);
			lblFoto.setIcon(miniatura);
		}
		repaint();
	}
	
	public boolean isSelecionado() {
		return seleccionado;
	}

	
	public Producto getProducto() {
		return p;
	}
	
	public void deseleccionar() {
		seleccionado=false;
		setBackground(colorNoSeleccionado);
	}
	
	private class ThisMouseListener extends MouseAdapter {
		@Override
		public void mouseEntered(MouseEvent e) {
			if(!seleccionado) {
			setBackground(colorSeleccionado);
			}
		}
		@Override
		public void mouseExited(MouseEvent e) {
			if (!seleccionado) {
			setBackground(colorNoSeleccionado);
			}
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			
			if(!seleccionado) {
			seleccionado=true;
			setBackground(new Color(250,200,250));
			}
			else {
				seleccionado=false;
				setBackground(colorSeleccionado);
			}
		}
	}

	public void borrar() {
		p.delete();
		
	}
}
