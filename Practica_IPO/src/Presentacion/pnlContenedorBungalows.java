package Presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Dominio.Bungalow;

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
			pnlVBungalow pnlBungalow = new pnlVBungalow();
			listaPnlBungalow.add(pnlBungalow);
			pnlBungalow.loadData(bungalow);
			pnlContenedor.add(pnlBungalow);
			pnlContenedor.repaint();
			pnlContenedor.revalidate();
		}
	}

}
