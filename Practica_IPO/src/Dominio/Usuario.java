package Dominio;

import Persistencia.UsuarioDAO;

public class Usuario {

	private String DNI;
	private String pass;
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String email;
	private String telefono;
	private String ultimoAcceso;
	private String foto;

	private UsuarioDAO usuarioDAO;

	public Usuario() {
		this.usuarioDAO = new UsuarioDAO();
	}

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

	public UsuarioDAO getUsuarioDao() {
		return usuarioDAO;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUltimoAcceso() {
		return ultimoAcceso;
	}

	public void setUltimoAcceso(String ultimoAcesso) {
		this.ultimoAcceso = ultimoAcesso;
	}

	public boolean insert() {
		return this.usuarioDAO.insert(this);
	}

	public boolean update() {
		return usuarioDAO.update(this);
	}

	public boolean delete() {
		// TODO Auto-generated method stub
		return usuarioDAO.delete(this);
	}

	public boolean read() {
		return usuarioDAO.read(this);
	}

	public boolean login() {
		return usuarioDAO.login(this);
	}

	public boolean readAll() {
		return usuarioDAO.readAll();
	}

	public boolean Autenticado() {
		return usuarioDAO.login(this);
	}

}
