package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado {
	private int id;
	private String nombre;
	private String apellidos;
	private String imagen;
	private String telefono;
	private String email;
	private String idiomas;
	private String formacion;
	private String dni;

	public Empleado() {
	}

	public Empleado(int id, String nombre, String apellidos, String imagen, String telefono, String email,
			String idiomas, String formacion, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.imagen = imagen;
		this.telefono = telefono;
		this.email = email;
		this.idiomas = idiomas;
		this.formacion = formacion;
		this.dni = dni;
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
}
