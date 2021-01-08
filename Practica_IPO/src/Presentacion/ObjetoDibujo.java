package Presentacion;

import java.io.Serializable;

/**
 * The Class ObjetoDibujo.
 */
public class ObjetoDibujo implements Serializable {
	
	/** The y. */
	private int x, y;

	/**
	 * Instantiates a new objeto dibujo.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public ObjetoDibujo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {
		return y;
	}
}
