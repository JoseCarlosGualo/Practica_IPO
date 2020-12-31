package Presentacion;

import java.io.Serializable;

public class ObjetoDibujo implements Serializable {
	private int x, y;

	public ObjetoDibujo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
