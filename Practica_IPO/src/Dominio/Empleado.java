package Dominio;

import Persistencia.EmpleadoDAO;

/**
 * The Class Empleado.
 */
public class Empleado {
	
	/** The nombre. */
	private String nombre;
	
	/** The apellidos. */
	private String apellidos;
	
	/** The imagen. */
	private String imagen;
	
	/** The telefono. */
	private String telefono;
	
	/** The email. */
	private String email;
	
	/** The idiomas. */
	private String idiomas;
	
	/** The formacion. */
	private String formacion;
	
	/** The dni. */
	private String dni;

	/** The empleado DAO. */
	private EmpleadoDAO empleadoDAO;

	/**
	 * Instantiates a new empleado.
	 */
	public Empleado() {
		this.empleadoDAO = new EmpleadoDAO();
	}

	/**
	 * Instantiates a new empleado.
	 *
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param imagen the imagen
	 * @param telefono the telefono
	 * @param email the email
	 * @param idiomas the idiomas
	 * @param formacion the formacion
	 * @param dni the dni
	 */
	public Empleado(String nombre, String apellidos, String imagen, String telefono, String email, String idiomas,
			String formacion, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.imagen = imagen;
		this.telefono = telefono;
		this.email = email;
		this.idiomas = idiomas;
		this.formacion = formacion;
		this.dni = dni;

		this.empleadoDAO = new EmpleadoDAO();
	}

	/**
	 * Gets the empleado DAO.
	 *
	 * @return the empleado DAO
	 */
	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}

	/**
	 * Sets the empleado DAO.
	 *
	 * @param empleadoDAO the new empleado DAO
	 */
	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dni the new dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the idiomas.
	 *
	 * @return the idiomas
	 */
	public String getIdiomas() {
		return idiomas;
	}

	/**
	 * Sets the idiomas.
	 *
	 * @param idiomas the new idiomas
	 */
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	/**
	 * Gets the formacion.
	 *
	 * @return the formacion
	 */
	public String getFormacion() {
		return formacion;
	}

	/**
	 * Sets the formacion.
	 *
	 * @param formacion the new formacion
	 */
	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.empleadoDAO.insert(this);
	}

	/**
	 * Read from name.
	 *
	 * @return true, if successful
	 */
	public boolean readFromName() {
		return this.empleadoDAO.readFromName(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return this.empleadoDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		return this.empleadoDAO.delete(this);
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return this.empleadoDAO.read(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return this.empleadoDAO.readAll();
	}
}
