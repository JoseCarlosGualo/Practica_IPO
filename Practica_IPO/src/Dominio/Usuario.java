package Dominio;

import Persistencia.UsuarioDAO;

/**
 * The Class Usuario.
 */
public class Usuario {

	/** The dni. */
	private String DNI;
	
	/** The pass. */
	private String pass;
	
	/** The nombre. */
	private String nombre;
	
	/** The apellidos. */
	private String apellidos;
	
	/** The fecha nacimiento. */
	private String fechaNacimiento;
	
	/** The email. */
	private String email;
	
	/** The telefono. */
	private String telefono;
	
	/** The ultimo acceso. */
	private String ultimoAcceso;
	
	/** The foto. */
	private String foto;

	/** The usuario DAO. */
	private UsuarioDAO usuarioDAO;

	/**
	 * Instantiates a new usuario.
	 */
	public Usuario() {
		this.usuarioDAO = new UsuarioDAO();
	}

	/**
	 * Instantiates a new usuario.
	 *
	 * @param DNI the dni
	 * @param pass the pass
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param fechaNacimiento the fecha nacimiento
	 * @param email the email
	 * @param telefono the telefono
	 * @param ultimoAcceso the ultimo acceso
	 * @param foto the foto
	 */
	public Usuario(String DNI, String pass, String nombre, String apellidos, String fechaNacimiento, String email,
			String telefono, String ultimoAcceso, String foto) {
		this.DNI = DNI;
		this.pass = pass;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.telefono = telefono;
		this.ultimoAcceso = ultimoAcceso;
		this.foto = foto;

		this.usuarioDAO = new UsuarioDAO();
	}

	/**
	 * Gets the usuario dao.
	 *
	 * @return the usuario dao
	 */
	public UsuarioDAO getUsuarioDao() {
		return usuarioDAO;
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
	 * @param foto the new foto
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * Gets the dni.
	 *
	 * @return the dni
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Sets the dni.
	 *
	 * @param dNI the new dni
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * Gets the pass.
	 *
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Sets the pass.
	 *
	 * @param pass the new pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
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
	 * Gets the fecha nacimiento.
	 *
	 * @return the fecha nacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Sets the fecha nacimiento.
	 *
	 * @param fechaNacimiento the new fecha nacimiento
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	 * Gets the ultimo acceso.
	 *
	 * @return the ultimo acceso
	 */
	public String getUltimoAcceso() {
		return ultimoAcceso;
	}

	/**
	 * Sets the ultimo acceso.
	 *
	 * @param ultimoAcesso the new ultimo acceso
	 */
	public void setUltimoAcceso(String ultimoAcesso) {
		this.ultimoAcceso = ultimoAcesso;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.usuarioDAO.insert(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return usuarioDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		// TODO Auto-generated method stub
		return usuarioDAO.delete(this);
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return usuarioDAO.read(this);
	}

	/**
	 * Login.
	 *
	 * @return true, if successful
	 */
	public boolean login() {
		return usuarioDAO.login(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return usuarioDAO.readAll();
	}

	/**
	 * Autenticado.
	 *
	 * @return true, if successful
	 */
	public boolean Autenticado() {
		return usuarioDAO.login(this);
	}

}
