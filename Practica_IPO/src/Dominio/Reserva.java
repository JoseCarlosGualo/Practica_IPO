package Dominio;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

import Persistencia.ReservaDAO;

public class Reserva {
	private Estancia estancia;
	private int id_reserva;
	private String tipo;
	private String fecha_entrada;
	private String fecha_salida;
	private String nombre;
	private String telefono;
	private String email;
	private int n_ocupantes;
	private String solicitudes_especiales;
	private String hora_entrada;
	private String hora_salida;
	private String dni;

	private ReservaDAO reservaDAO;

	public Reserva() {
		this.reservaDAO = new ReservaDAO();
	}

	public Reserva(Estancia estancia, int id_reserva, String tipo, String fecha_entrada, String fecha_salida,
			String nombre, String telefono, String email, int n_ocupantes, String solicitudes_especiales,
			String hora_entrada, String hora_salida, String dni) {
		this.estancia = estancia;
		this.id_reserva = id_reserva;
		this.tipo = tipo;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.n_ocupantes = n_ocupantes;
		this.solicitudes_especiales = solicitudes_especiales;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
		this.dni = dni;

		this.reservaDAO = new ReservaDAO();
	}

	public Estancia getEstancia() {
		return estancia;
	}

	public void setEstancia(Estancia estancia) {
		this.estancia = estancia;
	}

	public String getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(String fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public String getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(String fecha_salida) {
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

	public String getSolicitudes_especiales() {
		return solicitudes_especiales;
	}

	public void setSolicitudes_especiales(String solicitudes_especiales) {
		this.solicitudes_especiales = solicitudes_especiales;
	}

	public String getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public String getHora_salida() {
		return hora_salida;
	}

	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}

	public ReservaDAO getReservaDAO() {
		return reservaDAO;
	}

	public void setReservaDAO(ReservaDAO reservaDAO) {
		this.reservaDAO = reservaDAO;
	}

	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean insert() {
		return this.reservaDAO.insert(this);
	}

	public boolean update() {
		return reservaDAO.update(this);
	}

	public boolean delete() {
		return reservaDAO.delete(this);
	}

	public boolean read() {
		return reservaDAO.read(this);
	}

	public boolean readAll() {
		return reservaDAO.readAll();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
