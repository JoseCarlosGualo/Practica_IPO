package Dominio;

import java.util.ArrayList;
import java.util.List;

import Dominio.Estancia.Disponibilidad;

public class Bungalow extends Estancia{
	private int capacidad_maxima;
	private int estancia_minima;
	private List equipamiento = new ArrayList();
	private String descripcion;
	private int imagen;
	
	public Bungalow(String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		super(tipo, precio_noche, tamano, disponibilidad);
	}
	
	public Bungalow(String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad, int capacidad_maxima, int estancia_minima, List equipamiento, String descripcion, int imagen) {
		super(tipo, precio_noche, tamano, disponibilidad);
		this.capacidad_maxima = capacidad_maxima;
		this.estancia_minima = estancia_minima;
		this.equipamiento = equipamiento;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	
	public int getCapacidad_maxima() {
		return capacidad_maxima;
	}

	public void setCapacidad_maxima(int capacidad_maxima) {
		this.capacidad_maxima = capacidad_maxima;
	}

	public int getEstancia_minima() {
		return estancia_minima;
	}

	public void setEstancia_minima(int estancia_minima) {
		this.estancia_minima = estancia_minima;
	}

	public List getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(List equipamiento) {
		this.equipamiento = equipamiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getImagen() {
		return imagen;
	}

	public void setImagen(int imagen) {
		this.imagen = imagen;
	}
	
	
}
