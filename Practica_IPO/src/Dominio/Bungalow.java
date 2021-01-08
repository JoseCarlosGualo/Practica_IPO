package Dominio;

import java.util.ArrayList;
import java.util.List;

import Dominio.Disponibilidad;
import Persistencia.BungalowDAO;

/**
 * The Class Bungalow.
 */
public class Bungalow extends Estancia {
	
	/** The capacidad maxima. */
	private int capacidad_maxima;
	
	/** The estancia minima. */
	private int estancia_minima;
	
	/** The equipamiento. */
	private String equipamiento;
	
	/** The descripcion. */
	private String descripcion;
	
	/** The imagen. */
	private String imagen;

	/** The bungalow DAO. */
	private BungalowDAO bungalowDAO;

	/**
	 * Instantiates a new bungalow.
	 *
	 * @param id the id
	 */
	public Bungalow(int id) {
		super(id);
		this.bungalowDAO = new BungalowDAO();
	}

	/**
	 * Instantiates a new bungalow.
	 */
	public Bungalow() {
		this.bungalowDAO = new BungalowDAO();
	}

	/**
	 * Instantiates a new bungalow.
	 *
	 * @param id the id
	 * @param tipo the tipo
	 * @param precio_noche the precio noche
	 * @param tamano the tamano
	 * @param disponibilidad the disponibilidad
	 */
	public Bungalow(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.bungalowDAO = new BungalowDAO();
	}

	/**
	 * Instantiates a new bungalow.
	 *
	 * @param id the id
	 * @param tipo the tipo
	 * @param precio_noche the precio noche
	 * @param tamano the tamano
	 * @param disponibilidad the disponibilidad
	 * @param capacidad_maxima the capacidad maxima
	 * @param estancia_minima the estancia minima
	 * @param equipamiento the equipamiento
	 * @param descripcion the descripcion
	 * @param imagen the imagen
	 */
	public Bungalow(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad,
			int capacidad_maxima, int estancia_minima, String equipamiento, String descripcion, String imagen) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.capacidad_maxima = capacidad_maxima;
		this.estancia_minima = estancia_minima;
		this.equipamiento = equipamiento;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.bungalowDAO = new BungalowDAO();
	}

	/**
	 * Gets the capacidad maxima.
	 *
	 * @return the capacidad maxima
	 */
	public int getCapacidad_maxima() {
		return capacidad_maxima;
	}

	/**
	 * Sets the capacidad maxima.
	 *
	 * @param capacidad_maxima the new capacidad maxima
	 */
	public void setCapacidad_maxima(int capacidad_maxima) {
		this.capacidad_maxima = capacidad_maxima;
	}

	/**
	 * Gets the estancia minima.
	 *
	 * @return the estancia minima
	 */
	public int getEstancia_minima() {
		return estancia_minima;
	}

	/**
	 * Sets the estancia minima.
	 *
	 * @param estancia_minima the new estancia minima
	 */
	public void setEstancia_minima(int estancia_minima) {
		this.estancia_minima = estancia_minima;
	}

	/**
	 * Gets the equipamiento.
	 *
	 * @return the equipamiento
	 */
	public String getEquipamiento() {
		return equipamiento;
	}

	/**
	 * Sets the equipamiento.
	 *
	 * @param equipamiento the new equipamiento
	 */
	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
	 * Gets the bungalow DAO.
	 *
	 * @return the bungalow DAO
	 */
	public BungalowDAO getBungalowDAO() {
		return bungalowDAO;
	}

	/**
	 * Sets the bungalow DAO.
	 *
	 * @param bungalowDAO the new bungalow DAO
	 */
	public void setBungalowDAO(BungalowDAO bungalowDAO) {
		this.bungalowDAO = bungalowDAO;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.bungalowDAO.insert(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return bungalowDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		return bungalowDAO.delete(this);
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return bungalowDAO.read(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return bungalowDAO.readAll();
	}
}
