package Presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Dominio.Parcela;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ScrollPaneConstants;

/**
 * The Class pnlContenedorParcelas.
 */
public class pnlContenedorParcelas extends JPanel {
	
	/** The scroll pane. */
	private JScrollPane scrollPane;
	
	/** The pnl contenedor P. */
	private JPanel pnlContenedorP;

	/** The lista pnl parcelas. */
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

	/**
	 * Clean.
	 */
	public void clean() {
		pnlContenedorP.removeAll();
		pnlContenedorP.repaint();
		pnlContenedorP.revalidate();
	}

	/**
	 * Load pnl parcelas.
	 *
	 * @param parcelas the parcelas
	 */
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

	/**
	 * Reload.
	 */
	public void reload() {
		Parcela parcela = new Parcela();
		parcela.readAll();
		loadPnlParcelas(parcela.getParcelaDAO().getListaParcelas());
	}

	/**
	 * Quitar todas selecciones.
	 */
	public void quitarTodasSelecciones() {
		if (isMoreThanOneSelectioned()) {
			for (pnlVParcela parcela : this.listaPnlParcelas) {
				if (parcela.isSeleccionado()) {
					parcela.deseleccionar();
				}
			}
		}
	}

	/**
	 * Checks if is more than one selectioned.
	 *
	 * @return true, if is more than one selectioned
	 */
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

	/**
	 * Borrar seleccionada.
	 */
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
