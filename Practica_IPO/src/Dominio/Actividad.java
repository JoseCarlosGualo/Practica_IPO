package Dominio;

import Persistencia.ActividadDAO;


/**
 * The Class Actividad.
 */
public class Actividad {
	
	/** The id. */
	private int id;
	
	/** The nombre. */
	private String nombre;
	
	/** The empleado. */
	private Empleado empleado;
	
	/** The horario. */
	private String horario;
	
	/** The cupo minimo. */
	private int cupo_minimo;
	
	/** The cupo maximo. */
	private int cupo_maximo;
	
	/** The destinatario. */
	private String destinatario;
	
	/** The precio hora. */
	private double precio_hora;
	
	/** The zona camping. */
	private String zona_camping;
	
	/** The descripcion. */
	private String descripcion;
	
	/** The equipamiento. */
	private String equipamiento;
	
	/** The imagen. */
	private String imagen;

	/** The actividad DAO. */
	private ActividadDAO actividadDAO;

	/**
	 * Instantiates a new actividad.
	 */
	public Actividad() {
		this.actividadDAO = new ActividadDAO();
	}

	/**
	 * Instantiates a new actividad.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 * @param empleado the empleado
	 * @param horario the horario
	 * @param cupo_minimo the cupo minimo
	 * @param cupo_maximo the cupo maximo
	 * @param destinatario the destinatario
	 * @param precio_hora the precio hora
	 * @param zona_camping the zona camping
	 * @param descripcion the descripcion
	 * @param equipamiento the equipamiento
	 * @param imagen the imagen
	 */
	public Actividad(int id, String nombre, Empleado empleado, String horario, int cupo_minimo, int cupo_maximo,
			String destinatario, double precio_hora, String zona_camping, String descripcion, String equipamiento,
			String imagen) {
		this.id = id;
		this.nombre = nombre;
		this.empleado = empleado;
		this.horario = horario;
		this.cupo_minimo = cupo_minimo;
		this.cupo_maximo = cupo_maximo;
		this.destinatario = destinatario;
		this.precio_hora = precio_hora;
		this.zona_camping = zona_camping;
		this.descripcion = descripcion;
		this.equipamiento = equipamiento;
		this.imagen = imagen;

		this.actividadDAO = new ActividadDAO();
	}

	/**
	 * Gets the empleado.
	 *
	 * @return the empleado
	 */
	public Empleado getEmpleado() {
		return empleado;
	}

	/**
	 * Sets the empleado.
	 *
	 * @param empleado the new empleado
	 */
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	/**
	 * Gets the horario.
	 *
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * Sets the horario.
	 *
	 * @param horario the new horario
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * Gets the cupo minimo.
	 *
	 * @return the cupo minimo
	 */
	public int getCupo_minimo() {
		return cupo_minimo;
	}

	/**
	 * Sets the cupo minimo.
	 *
	 * @param cupo_minimo the new cupo minimo
	 */
	public void setCupo_minimo(int cupo_minimo) {
		this.cupo_minimo = cupo_minimo;
	}

	/**
	 * Gets the cupo maximo.
	 *
	 * @return the cupo maximo
	 */
	public int getCupo_maximo() {
		return cupo_maximo;
	}

	/**
	 * Sets the cupo maximo.
	 *
	 * @param cupo_maximo the new cupo maximo
	 */
	public void setCupo_maximo(int cupo_maximo) {
		this.cupo_maximo = cupo_maximo;
	}

	/**
	 * Gets the actividad DAO.
	 *
	 * @return the actividad DAO
	 */
	public ActividadDAO getActividadDAO() {
		return actividadDAO;
	}

	/**
	 * Sets the actividad DAO.
	 *
	 * @param actividadDAO the new actividad DAO
	 */
	public void setActividadDAO(ActividadDAO actividadDAO) {
		this.actividadDAO = actividadDAO;
	}
	
	/**
	 * Read from name.
	 *
	 * @return true, if successful
	 */
	public boolean readFromName() {
		return this.actividadDAO.readFromName(this);
	}

	/**
	 * Gets the destinatario.
	 *
	 * @return the destinatario
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * Sets the destinatario.
	 *
	 * @param destinatario the new destinatario
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * Gets the precio hora.
	 *
	 * @return the precio hora
	 */
	public double getPrecio_hora() {
		return precio_hora;
	}

	/**
	 * Sets the precio hora.
	 *
	 * @param precio_hora the new precio hora
	 */
	public void setPrecio_hora(double precio_hora) {
		this.precio_hora = precio_hora;
	}

	/**
	 * Gets the zona camping.
	 *
	 * @return the zona camping
	 */
	public String getZona_camping() {
		return zona_camping;
	}

	/**
	 * Sets the zona camping.
	 *
	 * @param zona_camping the new zona camping
	 */
	public void setZona_camping(String zona_camping) {
		this.zona_camping = zona_camping;
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
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
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
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.actividadDAO.insert(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return actividadDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		return actividadDAO.delete(this);
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return actividadDAO.read(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return actividadDAO.readAll();
	}
}
