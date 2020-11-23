package Dominio;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private Estancia estancia;
	private Date fecha_entrada;
	private Date fecha_salida;
	private String nombre;
	private String telefono;
	private String email;
	private int n_ocupantes;
	private List solicitudes_especiales = new ArrayList();
	private Calendar hora_entrada;
	private Calendar hora_salida;
	
	public Reserva(Estancia estancia, Date fecha_entrada, Date fecha_salida, String nombre, String telefono,
			String email, int n_ocupantes, List solicitudes_especiales, Calendar hora_entrada, Calendar hora_salida) {
		this.estancia = estancia;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.n_ocupantes = n_ocupantes;
		this.solicitudes_especiales = solicitudes_especiales;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
	}

	public Estancia getEstancia() {
		return estancia;
	}

	public void setEstancia(Estancia estancia) {
		this.estancia = estancia;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public int getN_ocupantes() {
		return n_ocupantes;
	}

	public void setN_ocupantes(int n_ocupantes) {
		this.n_ocupantes = n_ocupantes;
	}

	public List getSolicitudes_especiales() {
		return solicitudes_especiales;
	}

	public void setSolicitudes_especiales(List solicitudes_especiales) {
		this.solicitudes_especiales = solicitudes_especiales;
	}

	public Calendar getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(Calendar hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public Calendar getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(Calendar hora_salida) {
		this.hora_salida = hora_salida;
	}
	
	
}
