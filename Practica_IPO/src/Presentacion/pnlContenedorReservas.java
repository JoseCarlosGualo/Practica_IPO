package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Empleado;
import Dominio.Reserva;

import java.awt.Color;
import java.awt.GridLayout;

public class pnlContenedorReservas extends JPanel {

	private ArrayList<Reserva> reservas;
	private ArrayList<pnlVReserva> listaReservas;
	private pnlFormReserva pnlFormReserva;

	/**
	 * Create the panel.
	 */
	public pnlContenedorReservas(ArrayList<Reserva> reserva, pnlFormReserva pnlFormReserva) {
		this.reservas = reserva;
		this.pnlFormReserva = pnlFormReserva;
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

	public void setPnlFormResrva(pnlFormReserva pnlFormReserva) {
		this.pnlFormReserva = pnlFormReserva;
	}

	public Reserva getReservaSeleccionada() {
		Reserva reserva = null;
		for (pnlVReserva pnl : listaReservas) {
			if (pnl.isSeleccionado()) {
				reserva = pnl.getReserva();
			}
		}
		return reserva;
	}

}
