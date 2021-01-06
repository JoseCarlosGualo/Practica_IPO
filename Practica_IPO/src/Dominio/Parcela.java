package Dominio;

import java.util.ArrayList;
import java.util.List;

import Persistencia.ParcelaDAO;

public class Parcela extends Estancia {
	private double precio_tBaja;
	private double precio_tMedia;
	private double precio_tAlta;
	private String ubicacion;
	private String servicios;
	private String imagen;

	private ParcelaDAO parcelaDAO;

	public Parcela(int id) {
		super(id);
		this.parcelaDAO = new ParcelaDAO();
	}

	public Parcela() {
		this.parcelaDAO = new ParcelaDAO();
	}

	public Parcela(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.parcelaDAO = new ParcelaDAO();
	}

	public Parcela(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad,
			double precio_tBaja, double precio_tMedia, double precio_tAlta, String ubicacion, String servicios,
			String imagen) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.precio_tBaja = precio_tBaja;
		this.precio_tMedia = precio_tMedia;
		this.precio_tAlta = precio_tAlta;
		this.ubicacion = ubicacion;
		this.servicios = servicios;
		this.imagen = imagen;
		this.parcelaDAO = new ParcelaDAO();
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public ParcelaDAO getParcelaDAO() {
		return parcelaDAO;
	}

	public void setParcelaDAO(ParcelaDAO parcelaDAO) {
		this.parcelaDAO = parcelaDAO;
	}

	public boolean insert() {
		return this.parcelaDAO.insert(this);
	}

	public boolean update() {
		return parcelaDAO.update(this);
	}

	public boolean delete() {
		return parcelaDAO.delete(this);
	}

	public boolean read() {
		return parcelaDAO.read(this);
	}

	public boolean readAll() {
		return parcelaDAO.readAll();
	}

}
