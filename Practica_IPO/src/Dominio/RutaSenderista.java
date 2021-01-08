package Dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import Persistencia.RutaDAO;

/**
 * The Class RutaSenderista.
 */
public class RutaSenderista {
	
	/** The dia. */
	private String dia;
	
	/** The id. */
	private int id;
	
	/** The hora inicio. */
	private String hora_inicio;
	
	/** The hora fin. */
	private String hora_fin;
	
	/** The monitor. */
	private Empleado monitor;
	
	/** The equipamiento. */
	private String equipamiento;
	
	/** The pto encuentro. */
	private String pto_encuentro;
	
	/** The personas min. */
	private int personas_min;
	
	/** The personas max. */
	private int personas_max;
	
	/** The grado dificultad. */
	private String grado_dificultad;
	
	/** The descripcion. */
	private String descripcion;
	
	/** The nombre. */
	private String nombre;
	
	/** The ruta DAO. */
	private RutaDAO rutaDAO;
	
	/** The foto. */
	private String foto;

	/**
	 * Instantiates a new ruta senderista.
	 *
	 * @param id the id
	 * @param dia the dia
	 * @param hora_inicio the hora inicio
	 * @param hora_fin the hora fin
	 * @param monitor the monitor
	 * @param pto_encuentro the pto encuentro
	 * @param personas_min the personas min
	 * @param personas_max the personas max
	 * @param grado_dificultad the grado dificultad
	 * @param descripcion the descripcion
	 * @param equipamiento the equipamiento
	 */
	public RutaSenderista(int id, String dia, String hora_inicio, String hora_fin, Empleado monitor,
			String pto_encuentro, int personas_min, int personas_max, String grado_dificultad, String descripcion,
			String equipamiento) {
		this.id = id;
		this.dia = dia;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.monitor = monitor;
		this.pto_encuentro = pto_encuentro;
		this.personas_min = personas_min;
		this.personas_max = personas_max;
		this.grado_dificultad = grado_dificultad;
		this.descripcion = descripcion;
		this.equipamiento = equipamiento;

		this.rutaDAO = new RutaDAO();
	}

	/**
	 * Instantiates a new ruta senderista.
	 */
	public RutaSenderista() {
		this.rutaDAO = new RutaDAO();
	}

	/**
	 * Gets the dia.
	 *
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * Sets the dia.
	 *
	 * @param dia the new dia
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Gets the hora inicio.
	 *
	 * @return the hora inicio
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}

	/**
	 * Sets the hora inicio.
	 *
	 * @param hora_inicio the new hora inicio
	 */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	/**
	 * Gets the hora fin.
	 *
	 * @return the hora fin
	 */
	public String getHora_fin() {
		return hora_fin;
	}

	/**
	 * Sets the hora fin.
	 *
	 * @param hora_fin the new hora fin
	 */
	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}

	/**
	 * Gets the monitor.
	 *
	 * @return the monitor
	 */
	public Empleado getMonitor() {
		return monitor;
	}

	/**
	 * Sets the monitor.
	 *
	 * @param monitor the new monitor
	 */
	public void setMonitor(Empleado monitor) {
		this.monitor = monitor;
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
	 * Gets the equipamiento.
	 *
	 * @return the equipamiento
	 */
	public String getEquipamiento() {
		return equipamiento;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the pto encuentro.
	 *
	 * @return the pto encuentro
	 */
	public String getPto_encuentro() {
		return pto_encuentro;
	}

	/**
	 * Sets the pto encuentro.
	 *
	 * @param pto_encuentro the new pto encuentro
	 */
	public void setPto_encuentro(String pto_encuentro) {
		this.pto_encuentro = pto_encuentro;
	}

	/**
	 * Gets the personas min.
	 *
	 * @return the personas min
	 */
	public int getPersonas_min() {
		return personas_min;
	}

	/**
	 * Sets the personas min.
	 *
	 * @param string the new personas min
	 */
	public void setPersonas_min(int string) {
		this.personas_min = string;
	}

	/**
	 * Gets the personas max.
	 *
	 * @return the personas max
	 */
	public int getPersonas_max() {
		return personas_max;
	}

	/**
	 * Sets the personas max.
	 *
	 * @param string the new personas max
	 */
	public void setPersonas_max(int string) {
		this.personas_max = string;
	}

	/**
	 * Gets the grado dificultad.
	 *
	 * @return the grado dificultad
	 */
	public String getGrado_dificultad() {
		return grado_dificultad;
	}

	/**
	 * Sets the grado dificultad.
	 *
	 * @param grado_dificultad the new grado dificultad
	 */
	public void setGrado_dificultad(String grado_dificultad) {
		this.grado_dificultad = grado_dificultad;
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
	 * Gets the foto.
	 *
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * Sets the foto.
	 *
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.rutaDAO.insert(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return rutaDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		return rutaDAO.delete(this);
	}

	/**
	 * Gets the ruta DAO.
	 *
	 * @return the ruta DAO
	 */
	public RutaDAO getRutaDAO() {
		return rutaDAO;
	}

	/**
	 * Sets the ruta DAO.
	 *
	 * @param rutaDAO the new ruta DAO
	 */
	public void setRutaDAO(RutaDAO rutaDAO) {
		this.rutaDAO = rutaDAO;
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return rutaDAO.read(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return rutaDAO.readAll();
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

}