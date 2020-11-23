package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado {
	private String nombre;
	private String apellidos;
	private int imagen;
	private int telefono;
	private String email;
	private List idiomas = new ArrayList();
	private String formacion;
	private List<Date> restriccion_disponibilidad = new ArrayList<Date>();
	
	public Empleado(String nombre, String apellidos, int imagen, int telefono, String email, List idiomas,
			String formacion, List<Date> restriccion_disponibilidad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.imagen = imagen;
		this.telefono = telefono;
		this.email = email;
		this.idiomas = idiomas;
		this.formacion = formacion;
		this.restriccion_disponibilidad = restriccion_disponibilidad;
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

	public int getImagen() {
		return imagen;
	}

	public void setImagen(int imagen) {
		this.imagen = imagen;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List idiomas) {
		this.idiomas = idiomas;
	}

	public String getFormacion() {
		return formacion;
	}

	public void setFormacion(String formacion) {
		this.formacion = formacion;
	}

	public List<Date> getRestriccion_disponibilidad() {
		return restriccion_disponibilidad;
	}

	public void setRestriccion_disponibilidad(List<Date> restriccion_disponibilidad) {
		this.restriccion_disponibilidad = restriccion_disponibilidad;
	}
}
