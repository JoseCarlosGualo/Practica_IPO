package Presentacion;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.math.*;

import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel {

	private ArrayList<ObjetoDibujo> objetoDibujo = new ArrayList<ObjetoDibujo>();

	public MiAreaDibujo() {

	}

	void addObjetoGrafico(ObjetoDibujo objg) {
		objetoDibujo.add(objg);
	}

	public ObjetoDibujo getUltimoObjetoDibujo() {
		return objetoDibujo.get(objetoDibujo.size() - 1);
	}

	public void removeAll() {
		this.objetoDibujo = new ArrayList<ObjetoDibujo>();

	}

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
