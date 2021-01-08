package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Empleado;
import Dominio.Reserva;

import java.awt.Color;
import java.awt.GridLayout;

/**
 * The Class pnlContenedorReservas.
 */
public class pnlContenedorReservas extends JPanel {

	/** The reservas. */
	private ArrayList<Reserva> reservas;
	
	/** The lista reservas. */
	private ArrayList<pnlVReserva> listaReservas;
	
	/** The pnl form reserva. */
	private pnlFormReserva pnlFormReserva;

	/**
	 * Create the panel.
	 *
	 * @param reserva the reserva
	 * @param pnlFormReserva the pnl form reserva
	 */
	public pnlContenedorReservas(ArrayList<Reserva> reserva, pnlFormReserva pnlFormReserva) {
		this.reservas = reserva;
		this.pnlFormReserva = pnlFormReserva;
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
		Reserva reserva = new Reserva();
		reserva.readAll();
		this.reservas = new ArrayList<Reserva>(reserva.getReservaDAO().getListaReservas());
		this.listaReservas = new ArrayList<pnlVReserva>();
		this.clean();
		for (Reserva v : reservas) {
			pnlVReserva pnlReserva = new pnlVReserva(v, pnlFormReserva);
			add(pnlReserva);
			listaReservas.add(pnlReserva);
			repaint();
			revalidate();
		}

	}

	/**
	 * Filtra reserva.
	 *
	 * @param nombreEstancia the nombre estancia
	 */
	public void filtraReserva(String nombreEstancia) {
		this.clean();
		for (Reserva reserva : reservas) {
			if (reserva.getEstancia().getTipo().startsWith(nombreEstancia)) {
				pnlVReserva pnlReserva = new pnlVReserva(reserva, pnlFormReserva);
				add(pnlReserva);
				repaint();
				revalidate();
			}
		}
	}

	/**
	 * Sets the pnl form resrva.
	 *
	 * @param pnlFormReserva the new pnl form resrva
	 */
	public void setPnlFormResrva(pnlFormReserva pnlFormReserva) {
		this.pnlFormReserva = pnlFormReserva;
	}

	/**
	 * Gets the reserva seleccionada.
	 *
	 * @return the reserva seleccionada
	 */
	public Reserva getReservaSeleccionada() {
		Reserva reserva = null;
		for (pnlVReserva pnl : listaReservas) {
			if (pnl.isSeleccionado()) {
				reserva = pnl.getReserva();
			}
		}
		return reserva;
	}

	/**
	 * Reload.
	 */
	public void reload() {
		loadPanels();
	}

}
