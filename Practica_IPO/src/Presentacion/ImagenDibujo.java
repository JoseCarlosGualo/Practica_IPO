package Presentacion;

import java.io.Serializable;
import java.awt.Image;

/**
 * The Class ImagenDibujo.
 */
public class ImagenDibujo extends ObjetoDibujo implements Serializable {
	
	/** The imagen. */
	private Image imagen;

	/**
	 * Instantiates a new imagen dibujo.
	 *
	 * @param x the x
	 * @param y the y
	 * @param imagen the imagen
	 */
	public ImagenDibujo(int x, int y, Image imagen) {
		super(x, y);
		this.imagen = imagen;
	}

	/**
	 * Sets the imagen.
	 *
	 * @param imagen the new imagen
	 */
	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	/**
	 * Gets the imagen.
	 *
	 * @return the imagen
	 */
	public Image getImagen() {
		return imagen;
	}
}