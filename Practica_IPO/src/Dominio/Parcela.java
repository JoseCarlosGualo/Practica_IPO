package Dominio;

import java.util.ArrayList;
import java.util.List;

import Persistencia.ParcelaDAO;

/**
 * The Class Parcela.
 */
public class Parcela extends Estancia {
	
	/** The precio t baja. */
	private double precio_tBaja;
	
	/** The precio t media. */
	private double precio_tMedia;
	
	/** The precio t alta. */
	private double precio_tAlta;
	
	/** The ubicacion. */
	private String ubicacion;
	
	/** The servicios. */
	private String servicios;
	
	/** The imagen. */
	private String imagen;

	/** The parcela DAO. */
	private ParcelaDAO parcelaDAO;

	/**
	 * Instantiates a new parcela.
	 *
	 * @param id the id
	 */
	public Parcela(int id) {
		super(id);
		this.parcelaDAO = new ParcelaDAO();
	}

	/**
	 * Instantiates a new parcela.
	 */
	public Parcela() {
		this.parcelaDAO = new ParcelaDAO();
	}

	/**
	 * Instantiates a new parcela.
	 *
	 * @param id the id
	 * @param tipo the tipo
	 * @param precio_noche the precio noche
	 * @param tamano the tamano
	 * @param disponibilidad the disponibilidad
	 */
	public Parcela(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.parcelaDAO = new ParcelaDAO();
	}

	/**
	 * Instantiates a new parcela.
	 *
	 * @param id the id
	 * @param tipo the tipo
	 * @param precio_noche the precio noche
	 * @param tamano the tamano
	 * @param disponibilidad the disponibilidad
	 * @param precio_tBaja the precio t baja
	 * @param precio_tMedia the precio t media
	 * @param precio_tAlta the precio t alta
	 * @param ubicacion the ubicacion
	 * @param servicios the servicios
	 * @param imagen the imagen
	 */
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

	/**
	 * Gets the precio t baja.
	 *
	 * @return the precio t baja
	 */
	public double getPrecio_tBaja() {
		return precio_tBaja;
	}

	/**
	 * Sets the precio t baja.
	 *
	 * @param precio_tBaja the new precio t baja
	 */
	public void setPrecio_tBaja(double precio_tBaja) {
		this.precio_tBaja = precio_tBaja;
	}

	/**
	 * Gets the precio t media.
	 *
	 * @return the precio t media
	 */
	public double getPrecio_tMedia() {
		return precio_tMedia;
	}

	/**
	 * Sets the precio t media.
	 *
	 * @param precio_tMedia the new precio t media
	 */
	public void setPrecio_tMedia(double precio_tMedia) {
		this.precio_tMedia = precio_tMedia;
	}

	/**
	 * Gets the precio t alta.
	 *
	 * @return the precio t alta
	 */
	public double getPrecio_tAlta() {
		return precio_tAlta;
	}

	/**
	 * Sets the precio t alta.
	 *
	 * @param precio_tAlta the new precio t alta
	 */
	public void setPrecio_tAlta(double precio_tAlta) {
		this.precio_tAlta = precio_tAlta;
	}

	/**
	 * Gets the ubicacion.
	 *
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * Sets the ubicacion.
	 *
	 * @param ubicacion the new ubicacion
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * Gets the servicios.
	 *
	 * @return the servicios
	 */
	public String getServicios() {
		return servicios;
	}

	/**
	 * Sets the servicios.
	 *
	 * @param servicios the new servicios
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}

	/**
	 * Gets the imagen.
	 *
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * Sets the imagen.
	 *
	 * @param imagen the new imagen
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * Gets the parcela DAO.
	 *
	 * @return the parcela DAO
	 */
	public ParcelaDAO getParcelaDAO() {
		return parcelaDAO;
	}

	/**
	 * Sets the parcela DAO.
	 *
	 * @param parcelaDAO the new parcela DAO
	 */
	public void setParcelaDAO(ParcelaDAO parcelaDAO) {
		this.parcelaDAO = parcelaDAO;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.parcelaDAO.insert(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return parcelaDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		return parcelaDAO.delete(this);
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return parcelaDAO.read(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return parcelaDAO.readAll();
	}

}
