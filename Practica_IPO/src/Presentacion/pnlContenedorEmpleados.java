package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Empleado;

import java.awt.Color;
import java.awt.GridLayout;

public class pnlContenedorEmpleados extends JPanel {

	private ArrayList<Empleado> empleados;
	private ArrayList<pnlVEmpleado> listaEmpleados;
	private pnlFormEmpleado pnlFormEmpleado;

	/**
	 * Create the panel.
	 */
	public pnlContenedorEmpleados(ArrayList<Empleado> empleados, pnlFormEmpleado pnlFormEmpleado) {
		this.empleados = empleados;
		this.pnlFormEmpleado = pnlFormEmpleado;
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

	public void setPnlFormEmpleado(pnlFormEmpleado pnlFormEmpleado) {
		this.pnlFormEmpleado = pnlFormEmpleado;
	}
	
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
