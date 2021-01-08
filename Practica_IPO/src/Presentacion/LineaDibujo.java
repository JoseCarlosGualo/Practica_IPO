package Presentacion;

import java.awt.Color;
import java.io.Serializable;

/**
 * The Class LineaDibujo.
 */
public class LineaDibujo extends ObjetoDibujo implements Serializable {
	
	/** The y 1. */
	private int x1, y1;
	
	/** The color. */
	private Color color;

	/**
	 * Instantiates a new linea dibujo.
	 *
	 * @param x the x
	 * @param y the y
	 * @param x1 the x 1
	 * @param y1 the y 1
	 * @param color the color
	 */
	public LineaDibujo(int x, int y, int x1, int y1, Color color) {
		super(x, y);
		this.x1 = x1;
		this.y1 = y1;
		this.color = color;
	}

	/**
	 * Sets the x1.
	 *
	 * @param x1 the new x1
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * Sets the y1.
	 *
	 * @param y1 the new y1
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Gets the x1.
	 *
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Gets the y1.
	 *
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
}
