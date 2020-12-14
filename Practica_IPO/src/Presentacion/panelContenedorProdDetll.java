package Presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

import Dominio.Producto;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.Color;

public class panelContenedorProdDetll extends JPanel {
	private JScrollPane scrollPane;
	private JPanel panelContenedor;
	
	private ArrayList<panelProductoDetalle> listaPaneles;

	/**
	 * Create the panel.
	 */
	public panelContenedorProdDetll() {
		setLayout(new BorderLayout(0, 0));
		{
			scrollPane = new JScrollPane();
			add(scrollPane, BorderLayout.CENTER);
			{
				panelContenedor = new JPanel();
				panelContenedor.setBackground(Color.WHITE);
				scrollPane.setViewportView(panelContenedor);
				panelContenedor.setLayout(new GridLayout(100, 1, 8, 8));
			}
		}

	}
	public void clean() {
		panelContenedor.removeAll();
		panelContenedor.repaint();
		panelContenedor.revalidate();
	}
	
	public Producto getProductoSelected() {
		Producto producto = null;
		for(panelProductoDetalle panel : listaPaneles) {
			if(panel.isSelecionado()) {
				producto = panel.getProducto();
			}
		}
		return producto;
	}
	
	public void desseleccioanrTodos() {
		for(panelProductoDetalle panel:listaPaneles) {
			panel.deseleccionar();
		}
	}
	
	public void cargarPaneles(ArrayList<Producto> productos) {
		clean();
		listaPaneles=new ArrayList<panelProductoDetalle>();
		for(Producto producto: productos) {
			panelProductoDetalle panel = new panelProductoDetalle();
			listaPaneles.add(panel);
			panel.cargarDatos(producto);
			panelContenedor.add(panel);
			panelContenedor.repaint();
			panelContenedor.revalidate();
		}
	}
	public void borrarSelecionados() {
		for(panelProductoDetalle panel:listaPaneles) {
			if(panel.isSelecionado()) {
				panel.borrar();
			}
		}
		Producto p = new Producto();
		p.readAll();
		cargarPaneles(p.getProductoDAO().getListaProductos());
		
	}

}
