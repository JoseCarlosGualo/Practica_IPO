package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Actividad;
import Dominio.Empleado;

import java.awt.Color;
import java.awt.GridLayout;

/**
 * The Class pnlContenedorActividades.
 */
public class pnlContenedorActividades extends JPanel {

	/** The actividades. */
	private ArrayList<Actividad> actividades;
	
	/** The lista actividades. */
	private ArrayList<pnlVActividad> listaActividades;
	
	/** The pnl form actividades. */
	private pnlFormActividades pnlFormActividades;

	/**
	 * Create the panel.
	 *
	 * @param actividades the actividades
	 * @param pnlFormActividades the pnl form actividades
	 */
	public pnlContenedorActividades(ArrayList<Actividad> actividades, pnlFormActividades pnlFormActividades) {
		this.actividades = actividades;
		this.pnlFormActividades = pnlFormActividades;
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
		Actividad actividad = new Actividad();
		actividad.readAll();
		this.actividades = new ArrayList<Actividad>(actividad.getActividadDAO().getListaActividades());
		this.listaActividades = new ArrayList<pnlVActividad>();
		this.clean();
		for (Actividad a : actividades) {
			pnlVActividad pnlActividad = new pnlVActividad(a, pnlFormActividades);
			add(pnlActividad);
			listaActividades.add(pnlActividad);
			repaint();
			revalidate();
		}

	}

	/**
	 * Filtra actividad.
	 *
	 * @param nombre the nombre
	 */
	public void filtraActividad(String nombre) {
		this.clean();
		for (Actividad actividad : actividades) {
			if (actividad.getNombre().startsWith(nombre)) {
				pnlVActividad pnlActividad = new pnlVActividad(actividad, pnlFormActividades);
				add(pnlActividad);
				repaint();
				revalidate();
			}
		}
	}

	/**
	 * Sets the pnl form actividades.
	 *
	 * @param pnlFormActividades the new pnl form actividades
	 */
	public void setPnlFormActividades(pnlFormActividades pnlFormActividades) {
		this.pnlFormActividades = pnlFormActividades;
	}

	/**
	 * Gets the actividad seleccionada.
	 *
	 * @return the actividad seleccionada
	 */
	public Actividad getActividadSeleccionada() {
		Actividad actividad = null;
		for (pnlVActividad pnl : listaActividades) {
			if (pnl.isSeleccionado()) {
				actividad = pnl.getActividad();
			}
		}
		return actividad;
	}

}
