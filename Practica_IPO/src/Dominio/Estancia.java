package Dominio;

import Dominio.Disponibilidad;

/**
 * The Class Estancia.
 */
public class Estancia {

	/** The id. */
	private int id;
	
	/** The tipo. */
	private String tipo;
	
	/** The precio noche. */
	private double precio_noche;
	
	/** The tamano. */
	private double tamano;
	
	/** The disponibilidad. */
	private Disponibilidad disponibilidad;

	/**
	 * Instantiates a new estancia.
	 *
	 * @param id the id
	 */
	public Estancia(int id) {
		this.id = id;
	}

	/**
	 * Instantiates a new estancia.
	 */
	public Estancia() {
	}

	/**
	 * Instantiates a new estancia.
	 *
	 * @param id the id
	 * @param tipo the tipo
	 * @param precio_noche the precio noche
	 * @param tamano the tamano
	 * @param disponibilidad the disponibilidad
	 */
	public Estancia(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		this.id = id;
		this.tipo = tipo;
		this.precio_noche = precio_noche;
		this.tamano = tamano;
		this.disponibilidad = disponibilidad;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Gets the precio noche.
	 *
	 * @return the precio noche
	 */
	public double getPrecio_noche() {
		return precio_noche;
	}

	/**
	 * Sets the precio noche.
	 *
	 * @param precio_noche the new precio noche
	 */
	public void setPrecio_noche(double precio_noche) {
		this.precio_noche = precio_noche;
	}

	/**
	 * Gets the tamano.
	 *
	 * @return the tamano
	 */
	public double getTamano() {
		return tamano;
	}

	/**
	 * Sets the tamano.
	 *
	 * @param tamano the new tamano
	 */
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	/**
	 * Gets the disponibilidad.
	 *
	 * @return the disponibilidad
	 */
	public Disponibilidad getDisponibilidad() {
		return disponibilidad;
	}

	/**
	 * Sets the disponibilidad.
	 *
	 * @param disponibilidad the new disponibilidad
	 */
	public void setDisponibilidad(Disponibilidad disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
