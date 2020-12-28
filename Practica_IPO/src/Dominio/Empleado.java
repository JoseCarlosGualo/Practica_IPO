package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Persistencia.EmpleadoDAO;

public class Empleado {
	private String nombre;
	private String apellidos;
	private String imagen;
	private String telefono;
	private String email;
	private String idiomas;
	private String formacion;
	private String dni;

	private EmpleadoDAO empleadoDAO;

	public Empleado() {
		this.empleadoDAO = new EmpleadoDAO();
	}

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

	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}

	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	public boolean insert() {
		return this.empleadoDAO.insert(this);
	}

	public boolean update() {
		return this.empleadoDAO.update(this);
	}

	public boolean delete() {
		return this.empleadoDAO.delete(this);
	}

	public boolean read() {
		return this.empleadoDAO.read(this);
	}

	public boolean readAll() {
		return this.empleadoDAO.readAll();
	}
}
