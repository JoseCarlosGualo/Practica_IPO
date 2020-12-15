package Presentacion;

import java.util.ArrayList;

import javax.swing.JPanel;

import Dominio.Empleado;
import java.awt.GridLayout;

public class pnlContenedorEmpleados extends JPanel {

	private ArrayList<Empleado> empleados;
	private ArrayList<pnlVEmpleado> listaEmpleados;
	private pnlFormEmpleado pnlFormEmpleado;

	/**
	 * Create the panel.
	 */
	public pnlContenedorEmpleados(ArrayList<Empleado> empleado, pnlFormEmpleado pnlFormEmpleado) {
		this.empleados = empleado;
		this.pnlFormEmpleado = pnlFormEmpleado;
		setLayout(new GridLayout(1, 0, 0, 0));
	}

	public void clean() {
		removeAll();
		repaint();
		revalidate();
	}

	public void loadPanels() {
		Empleado empleado = new Empleado();
		// empleado.readAll();
		this.empleados = new ArrayList<Empleado>(listaEmpleados());
		this.listaEmpleados = new ArrayList<pnlVEmpleado>();
		this.clean();
		for (Empleado e : empleados) {
			pnlVEmpleado pnlEmpleado = new pnlVEmpleado(empleado, pnlFormEmpleado);
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

	public ArrayList<Empleado> listaEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado = new Empleado("Jose", "Gualo", "imagen", "608143766", "josecarlos.gualo@alu.uclm.es",
				"Ingles, Español", "Grado en Ingenieria Informatica", "71361332Z");
		for (int i = 0; i < 10; i++) {
			empleados.add(empleado);
		}

		return empleados;
	}

}
