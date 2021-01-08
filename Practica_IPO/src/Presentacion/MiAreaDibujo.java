package Presentacion;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.math.*;

import javax.swing.JLabel;

/**
 * The Class MiAreaDibujo.
 */
public class MiAreaDibujo extends JLabel {

	/** The objeto dibujo. */
	private ArrayList<ObjetoDibujo> objetoDibujo = new ArrayList<ObjetoDibujo>();

	/**
	 * Instantiates a new mi area dibujo.
	 */
	public MiAreaDibujo() {

	}

	/**
	 * Adds the objeto grafico.
	 *
	 * @param objg the objg
	 */
	void addObjetoGrafico(ObjetoDibujo objg) {
		objetoDibujo.add(objg);
	}

	/**
	 * Gets the ultimo objeto dibujo.
	 *
	 * @return the ultimo objeto dibujo
	 */
	public ObjetoDibujo getUltimoObjetoDibujo() {
		return objetoDibujo.get(objetoDibujo.size() - 1);
	}

	/* (non-Javadoc)
	 * @see java.awt.Container#removeAll()
	 */
	public void removeAll() {
		this.objetoDibujo = new ArrayList<ObjetoDibujo>();

	}

	/**
	 * Removes the objeto grafico.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void removeObjetoGrafico(int x, int y) {
		for (int i = objetoDibujo.size() - 1; i >= 0; i--) {
			ObjetoDibujo objg = objetoDibujo.get(i);
			if (objg instanceof ImagenDibujo) {

				if (Math.abs((x - objg.getX())) <= 15 && Math.abs((y - objg.getY())) <= 15) {
					objetoDibujo.remove(i);
					break;
				}
			} else if (objg instanceof LineaDibujo) {
				if ((Math.abs((x - objg.getX())) <= 15 && Math.abs((y - objg.getY())) <= 15)
						|| (Math.abs((x - ((LineaDibujo) objg).getX1())) <= 15
								&& Math.abs((y - ((LineaDibujo) objg).getY1())) <= 15)) {
					
					objetoDibujo.remove(i);
					break;
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	public void paint(Graphics g) {
		super.paint(g);
		for (int i = 0; i < objetoDibujo.size(); i++) {
			ObjetoDibujo objg = objetoDibujo.get(i);
			if (objg instanceof ImagenDibujo) {

				g.drawImage(((ImagenDibujo) objg).getImagen(), objg.getX(), objg.getY(), null);

			} else if (objg instanceof LineaDibujo) {
				g.setColor(((LineaDibujo) objg).getColor());
				int w = ((LineaDibujo) objg).getX1();
				int h = ((LineaDibujo) objg).getY1();
				((Graphics2D) g).setStroke(new BasicStroke(3));
				g.drawLine(objg.getX(), objg.getY(), w, h);

			}
		}
	}
}
