package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Empleado;

import java.awt.Color;
import java.awt.GridLayout;

/**
 * The Class pnlContenedorEmpleados.
 */
public class pnlContenedorEmpleados extends JPanel {

	/** The empleados. */
	private ArrayList<Empleado> empleados;
	
	/** The lista empleados. */
	private ArrayList<pnlVEmpleado> listaEmpleados;
	
	/** The pnl form empleado. */
	private pnlFormEmpleado pnlFormEmpleado;

	/**
	 * Create the panel.
	 *
	 * @param empleados the empleados
	 * @param pnlFormEmpleado the pnl form empleado
	 */
	public pnlContenedorEmpleados(ArrayList<Empleado> empleados, pnlFormEmpleado pnlFormEmpleado) {
		this.empleados = empleados;
		this.pnlFormEmpleado = pnlFormEmpleado;
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
		Empleado empleado = new Empleado();
		empleado.readAll();
		this.empleados = new ArrayList<Empleado>(empleado.getEmpleadoDAO().getListaEmpleados());
		this.listaEmpleados = new ArrayList<pnlVEmpleado>();
		this.clean();
		for (Empleado e : empleados) {
			pnlVEmpleado pnlEmpleado = new pnlVEmpleado(e, pnlFormEmpleado);
			add(pnlEmpleado);
			listaEmpleados.add(pnlEmpleado);
			repaint();
			revalidate();
		}

	}

	/**
	 * Filtra empleado.
	 *
	 * @param dni the dni
	 */
	public void filtraEmpleado(String dni) {
		this.clean();
		for (Empleado empleado : empleados) {
			if (empleado.getDni().startsWith(dni)) {
				pnlVEmpleado pnlEmpleado = new pnlVEmpleado(empleado, pnlFormEmpleado);
				add(pnlEmpleado);
				repaint();
				revalidate();
			}
		}
	}

	/**
	 * Sets the pnl form empleado.
	 *
	 * @param pnlFormEmpleado the new pnl form empleado
	 */
	public void setPnlFormEmpleado(pnlFormEmpleado pnlFormEmpleado) {
		this.pnlFormEmpleado = pnlFormEmpleado;
	}
	
	/**
	 * Gets the empleado seleccionado.
	 *
	 * @return the empleado seleccionado
	 */
	public Empleado getEmpleadoSeleccionado() {
		Empleado empleado = null;
		for (pnlVEmpleado pnl : listaEmpleados) {
			if (pnl.isSeleccionado()) {
				empleado = pnl.getEmpleado();
			}
		}
		return empleado;
	}

}
