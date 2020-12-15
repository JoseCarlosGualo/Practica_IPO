package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Parcela extends Estancia {
	private double precio_tBaja;
	private double precio_tMedia;
	private double precio_tAlta;
	private String ubicacion;
	String servicios;

	public Parcela() {
	}

	public Parcela(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
	}

	public Parcela(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad,
			double precio_tBaja, double precio_tMedia, double precio_tAlta, String ubicacion, String servicios) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.precio_tBaja = precio_tBaja;
		this.precio_tMedia = precio_tMedia;
		this.precio_tAlta = precio_tAlta;
		this.ubicacion = ubicacion;
		this.servicios = servicios;
	}

	public double getPrecio_tBaja() {
		return precio_tBaja;
	}

	public void setPrecio_tBaja(double precio_tBaja) {
		this.precio_tBaja = precio_tBaja;
	}

	public double getPrecio_tMedia() {
		return precio_tMedia;
	}

	public void setPrecio_tMedia(double precio_tMedia) {
		this.precio_tMedia = precio_tMedia;
	}

	public double getPrecio_tAlta() {
		return precio_tAlta;
	}

	public void setPrecio_tAlta(double precio_tAlta) {
		this.precio_tAlta = precio_tAlta;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getServicios() {
		return servicios;
	}

	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

}
