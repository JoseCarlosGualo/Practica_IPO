package Presentacion;

import java.io.Serializable;
import java.awt.Image;

public class ImagenDibujo extends ObjetoDibujo implements Serializable {
	private Image imagen;

	public ImagenDibujo(int x, int y, Image imagen) {
		super(x, y);
		this.imagen = imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public Image getImagen() {
		return imagen;
	}
}