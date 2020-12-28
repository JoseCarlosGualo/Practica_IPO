package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Actividad;
import Dominio.Empleado;

import java.awt.Color;
import java.awt.GridLayout;

public class pnlContenedorActividades extends JPanel {

	private ArrayList<Actividad> actividades;
	private ArrayList<pnlVActividad> listaActividades;
	private pnlFormActividades pnlFormActividades;

	/**
	 * Create the panel.
	 */
	public pnlContenedorActividades(ArrayList<Actividad> actividades, pnlFormActividades pnlFormActividades) {
		this.actividades = actividades;
		this.pnlFormActividades = pnlFormActividades;
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

	public void setPnlFormActividades(pnlFormActividades pnlFormActividades) {
		this.pnlFormActividades = pnlFormActividades;
	}

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
