package Dominio;

import java.util.ArrayList;
import java.util.List;

import Dominio.Disponibilidad;
import Persistencia.BungalowDAO;

public class Bungalow extends Estancia {
	private int capacidad_maxima;
	private int estancia_minima;
	private String equipamiento;
	private String descripcion;
	private String imagen;

	private BungalowDAO bungalowDAO;

	public Bungalow(int id) {
		super(id);
		this.bungalowDAO = new BungalowDAO();
	}

	public Bungalow() {
		this.bungalowDAO = new BungalowDAO();
	}

	public Bungalow(int id, String tipo, double precio_noche, double tamano, Disponibilidad disponibilidad) {
		super(id, tipo, precio_noche, tamano, disponibilidad);
		this.bungalowDAO = new BungalowDAO();
	}

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

	public String getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public BungalowDAO getBungalowDAO() {
		return bungalowDAO;
	}

	public void setBungalowDAO(BungalowDAO bungalowDAO) {
		this.bungalowDAO = bungalowDAO;
	}

	public boolean insert() {
		return this.bungalowDAO.insert(this);
	}

	public boolean update() {
		return bungalowDAO.update(this);
	}

	public boolean delete() {
		return bungalowDAO.delete(this);
	}

	public boolean read() {
		return bungalowDAO.read(this);
	}

	public boolean readAll() {
		return bungalowDAO.readAll();
	}
}
