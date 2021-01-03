package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.RutaSenderista;

import java.awt.Color;
import java.awt.GridLayout;

public class pnlContenedorRutas extends JPanel {

	private ArrayList<RutaSenderista> rutas;
	private ArrayList<pnlVRuta> listaRutas;
	private pnlFormRutas pnlFormRutas;

	/**
	 * Create the panel.
	 */
	public pnlContenedorRutas(ArrayList<RutaSenderista> rutas, pnlFormRutas pnlFormRutas) {
		this.rutas = rutas;
		this.pnlFormRutas = pnlFormRutas;
		setBackground(Color.WHITE);
		setLayout(new GridLayout(10, 1, 10, 10));
		this.loadPanels();
	}

	public void clean() {
		removeAll();
		repaint();
		revalidate();
	}

	public void loadPanels() {
		RutaSenderista ruta = new RutaSenderista();
		ruta.readAll();
		this.rutas = new ArrayList<RutaSenderista>(ruta.getRutaDAO().getListaRutas());
		this.listaRutas = new ArrayList<pnlVRuta>();
		this.clean();
		for (RutaSenderista e : rutas) {
			pnlVRuta pnlEmpleado = new pnlVRuta(e, pnlFormRutas);
			add(pnlEmpleado);
			listaRutas.add(pnlEmpleado);
			repaint();
			revalidate();
		}

	}

	public void filtraRuta(String dni) {
		this.clean();
		for (RutaSenderista ruta : rutas) {
			if (ruta.getNombre().startsWith(dni)) {
				pnlVRuta pnlEmpleado = new pnlVRuta(ruta, pnlFormRutas);
				add(pnlEmpleado);
				repaint();
				revalidate();
			}
		}
	}

	public void setPnlFormEmpleado(pnlFormRutas pnlFormRuta) {
		this.pnlFormRutas = pnlFormRuta;
	}
	
	public RutaSenderista getEmpleadoSeleccionado() {
		RutaSenderista ruta = null;
		for (pnlVRuta pnl : listaRutas) {
			if (pnl.isSeleccionado()) {
				ruta = pnl.getRuta();
			}
		}
		return ruta;
	}

}
