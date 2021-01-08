package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.RutaSenderista;

import java.awt.Color;
import java.awt.GridLayout;

/**
 * The Class pnlContenedorRutas.
 */
public class pnlContenedorRutas extends JPanel {

	/** The rutas. */
	private ArrayList<RutaSenderista> rutas;
	
	/** The lista rutas. */
	private ArrayList<pnlVRuta> listaRutas;
	
	/** The pnl form rutas. */
	private pnlFormRutas pnlFormRutas;

	/**
	 * Create the panel.
	 *
	 * @param rutas the rutas
	 * @param pnlFormRutas the pnl form rutas
	 */
	public pnlContenedorRutas(ArrayList<RutaSenderista> rutas, pnlFormRutas pnlFormRutas) {
		this.rutas = rutas;
		this.pnlFormRutas = pnlFormRutas;
		setBackground(Color.WHITE);
		setLayout(new GridLayout(10, 1, 10, 10));
		this.loadPanels();
	}

	/**
	 * Clean.
	 */
	public void clean() {
		removeAll();
		repaint();
		revalidate();
	}

	/**
	 * Load panels.
	 */
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

	/**
	 * Filtra ruta.
	 *
	 * @param nombre the nombre
	 */
	public void filtraRuta(String nombre) {
		this.clean();
		for (RutaSenderista ruta : rutas) {
			if (ruta.getNombre().startsWith(nombre)) {
				pnlVRuta pnlEmpleado = new pnlVRuta(ruta, pnlFormRutas);
				add(pnlEmpleado);
				repaint();
				revalidate();
			}
		}
	}

	/**
	 * Sets the pnl form empleado.
	 *
	 * @param pnlFormRuta the new pnl form empleado
	 */
	public void setPnlFormEmpleado(pnlFormRutas pnlFormRuta) {
		this.pnlFormRutas = pnlFormRuta;
	}

	/**
	 * Gets the empleado seleccionado.
	 *
	 * @return the empleado seleccionado
	 */
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