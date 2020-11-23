package Dominio;

public class Estancia {
	enum Disponibilidad{
		Ocupada, Libre, Reparacion, Limpieza
	}
	private String tipo;
	private double precio_noche;
	private double tamano;
	private Disponibilidad disponibilidad;
	
	public Estancia(String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		this.tipo = tipo;
		this.precio_noche = precio_noche;
		this.tamano = tamano;
		this.disponibilidad = disponibilidad;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getPrecio_noche() {
		return precio_noche;
	}
	
	public void setPrecio_noche(double precio_noche) {
		this.precio_noche = precio_noche;
	}
	
	public double getTamano() {
		return tamano;
	}
	
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	
	public Disponibilidad getDisponibilidad() {
		return disponibilidad;
	}
	
	public void setDisponibilidad(Disponibilidad disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
