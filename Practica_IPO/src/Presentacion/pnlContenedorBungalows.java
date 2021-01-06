package Presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Dominio.Bungalow;
import Dominio.Parcela;
import Dominio.RutaSenderista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ScrollPaneConstants;

public class pnlContenedorBungalows extends JPanel {
	private JScrollPane scrollPane;
	private JPanel pnlContenedor;

	private ArrayList<pnlVBungalow> listaPnlBungalow;

	/**
	 * Create the panel.
	 */
	public pnlContenedorBungalows() {
		setLayout(new BorderLayout(0, 0));
		{
			scrollPane = new JScrollPane();
			add(scrollPane);
			{
				pnlContenedor = new JPanel();
				scrollPane.setViewportView(pnlContenedor);
				pnlContenedor.setLayout(new GridLayout(100, 1, 8, 8));
			}
		}

	}

	public void clean() {
		pnlContenedor.removeAll();
		pnlContenedor.repaint();
		pnlContenedor.revalidate();
	}

	public void loadPnlBungalows(ArrayList<Bungalow> bungalows) {
		clean();
		listaPnlBungalow = new ArrayList<pnlVBungalow>();
		for (Bungalow bungalow : bungalows) {
			pnlVBungalow pnlBungalow = new pnlVBungalow(bungalow, this);
			listaPnlBungalow.add(pnlBungalow);
			// pnlBungalow.loadData(bungalow);
			pnlContenedor.add(pnlBungalow);
			pnlContenedor.repaint();
			pnlContenedor.revalidate();
		}
	}

	public void reload() {
		Bungalow bungalow = new Bungalow();
		bungalow.readAll();
		loadPnlBungalows(bungalow.getBungalowDAO().getListaBungalows());
	}

	public void quitarTodasSelecciones() {
		if (isMoreThanOneSelectioned()) {
			for (pnlVBungalow bungalow : this.listaPnlBungalow) {
				if (bungalow.isSeleccionado()) {
					bungalow.deseleccionar();
				}
			}
		}
	}

	public boolean isMoreThanOneSelectioned() {
		int seleccionadas = 0;
		for (pnlVBungalow bungalow : this.listaPnlBungalow) {
			if (bungalow.isSeleccionado()) {
				seleccionadas++;
			}
		}

		if (seleccionadas < 1) {
			return false;
		} else {
			return true;
		}
	}

	public void borrarSeleccionada() {
		for (pnlVBungalow pnlBungalow : this.listaPnlBungalow) {
			if (pnlBungalow.isSeleccionado()) {
				pnlBungalow.delete();
			}
		}
		Bungalow b = new Bungalow();
		b.readAll();
		loadPnlBungalows(b.getBungalowDAO().getListaBungalows());
	}

	public void filtraBungalow(String nombre) {
		this.clean();
		for (pnlVBungalow bungalow : listaPnlBungalow) {
			if (bungalow.getBungalow().getTipo().startsWith(nombre)) {
				pnlVBungalow b = new pnlVBungalow(bungalow.getBungalow(), this);
				add(b);
				repaint();
				revalidate();
			}
		}
	}

}
