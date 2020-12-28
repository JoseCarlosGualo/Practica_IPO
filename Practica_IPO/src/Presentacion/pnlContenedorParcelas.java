package Presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Dominio.Parcela;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ScrollPaneConstants;

public class pnlContenedorParcelas extends JPanel {
	private JScrollPane scrollPane;
	private JPanel pnlContenedorP;

	private ArrayList<pnlVParcela> listaPnlParcelas;

	/**
	 * Create the panel.
	 */
	public pnlContenedorParcelas() {
		setLayout(new BorderLayout(0, 0));
		{
			scrollPane = new JScrollPane();
			add(scrollPane);
			{
				pnlContenedorP = new JPanel();
				scrollPane.setViewportView(pnlContenedorP);
				pnlContenedorP.setLayout(new GridLayout(100, 1, 8, 8));
			}
		}

	}

	public void clean() {
		pnlContenedorP.removeAll();
		pnlContenedorP.repaint();
		pnlContenedorP.revalidate();
	}

	public void loadPnlParcelas(ArrayList<Parcela> parcelas) {
		clean();
		listaPnlParcelas = new ArrayList<pnlVParcela>();
		for (Parcela parcela : parcelas) {
			pnlVParcela pnlParcela = new pnlVParcela(parcela, this);
			listaPnlParcelas.add(pnlParcela);
			pnlParcela.loadData(parcela);
			pnlContenedorP.add(pnlParcela);
			pnlContenedorP.repaint();
			pnlContenedorP.revalidate();
		}
	}

	public void reload() {
		Parcela parcela = new Parcela();
		parcela.readAll();
		loadPnlParcelas(parcela.getParcelaDAO().getListaParcelas());
	}

	public void quitarTodasSelecciones() {
		if (isMoreThanOneSelectioned()) {
			for (pnlVParcela parcela : this.listaPnlParcelas) {
				if (parcela.isSeleccionado()) {
					parcela.deseleccionar();
				}
			}
		}
	}

	public boolean isMoreThanOneSelectioned() {
		int seleccionadas = 0;
		for (pnlVParcela parcela : this.listaPnlParcelas) {
			if (parcela.isSeleccionado()) {
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
		for (pnlVParcela pnlParcela : this.listaPnlParcelas) {
			if (pnlParcela.isSeleccionado()) {
				pnlParcela.delete();
			}
		}
		Parcela p = new Parcela();
		p.readAll();
		loadPnlParcelas(p.getParcelaDAO().getListaParcelas());
	}

}
