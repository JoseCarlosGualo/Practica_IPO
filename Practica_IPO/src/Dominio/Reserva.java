package Dominio;

import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

import Persistencia.ReservaDAO;

/**
 * The Class Reserva.
 */
public class Reserva {
	
	/** The estancia. */
	private Estancia estancia;
	
	/** The id reserva. */
	private int id_reserva;
	
	/** The tipo. */
	private String tipo;
	
	/** The fecha entrada. */
	private String fecha_entrada;
	
	/** The fecha salida. */
	private String fecha_salida;
	
	/** The nombre. */
	private String nombre;
	
	/** The telefono. */
	private String telefono;
	
	/** The email. */
	private String email;
	
	/** The n ocupantes. */
	private int n_ocupantes;
	
	/** The solicitudes especiales. */
	private String solicitudes_especiales;
	
	/** The hora entrada. */
	private String hora_entrada;
	
	/** The hora salida. */
	private String hora_salida;
	
	/** The dni. */
	private String dni;

	/** The reserva DAO. */
	private ReservaDAO reservaDAO;

	/**
	 * Instantiates a new reserva.
	 */
	public Reserva() {
		this.reservaDAO = new ReservaDAO();
	}

	/**
	 * Instantiates a new reserva.
	 *
	 * @param estancia the estancia
	 * @param id_reserva the id reserva
	 * @param tipo the tipo
	 * @param fecha_entrada the fecha entrada
	 * @param fecha_salida the fecha salida
	 * @param nombre the nombre
	 * @param telefono the telefono
	 * @param email the email
	 * @param n_ocupantes the n ocupantes
	 * @param solicitudes_especiales the solicitudes especiales
	 * @param hora_entrada the hora entrada
	 * @param hora_salida the hora salida
	 * @param dni the dni
	 */
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

	/**
	 * Gets the estancia.
	 *
	 * @return the estancia
	 */
	public Estancia getEstancia() {
		return estancia;
	}

	/**
	 * Sets the estancia.
	 *
	 * @param estancia the new estancia
	 */
	public void setEstancia(Estancia estancia) {
		this.estancia = estancia;
	}

	/**
	 * Gets the fecha entrada.
	 *
	 * @return the fecha entrada
	 */
	public String getFecha_entrada() {
		return fecha_entrada;
	}

	/**
	 * Sets the fecha entrada.
	 *
	 * @param fecha_entrada the new fecha entrada
	 */
	public void setFecha_entrada(String fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	/**
	 * Gets the fecha salida.
	 *
	 * @return the fecha salida
	 */
	public String getFecha_salida() {
		return fecha_salida;
	}

	/**
	 * Sets the fecha salida.
	 *
	 * @param fecha_salida the new fecha salida
	 */
	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
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
	 * Gets the n ocupantes.
	 *
	 * @return the n ocupantes
	 */
	public int getN_ocupantes() {
		return n_ocupantes;
	}

	/**
	 * Sets the n ocupantes.
	 *
	 * @param n_ocupantes the new n ocupantes
	 */
	public void setN_ocupantes(int n_ocupantes) {
		this.n_ocupantes = n_ocupantes;
	}

	/**
	 * Gets the solicitudes especiales.
	 *
	 * @return the solicitudes especiales
	 */
	public String getSolicitudes_especiales() {
		return solicitudes_especiales;
	}

	/**
	 * Sets the solicitudes especiales.
	 *
	 * @param solicitudes_especiales the new solicitudes especiales
	 */
	public void setSolicitudes_especiales(String solicitudes_especiales) {
		this.solicitudes_especiales = solicitudes_especiales;
	}

	/**
	 * Gets the hora entrada.
	 *
	 * @return the hora entrada
	 */
	public String getHora_entrada() {
		return hora_entrada;
	}

	/**
	 * Sets the hora entrada.
	 *
	 * @param hora_entrada the new hora entrada
	 */
	public void setHora_entrada(String hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	/**
	 * Gets the hora salida.
	 *
	 * @return the hora salida
	 */
	public String getHora_salida() {
		return hora_salida;
	}

	/**
	 * Sets the hora salida.
	 *
	 * @param hora_salida the new hora salida
	 */
	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}

	/**
	 * Gets the reserva DAO.
	 *
	 * @return the reserva DAO
	 */
	public ReservaDAO getReservaDAO() {
		return reservaDAO;
	}

	/**
	 * Sets the reserva DAO.
	 *
	 * @param reservaDAO the new reserva DAO
	 */
	public void setReservaDAO(ReservaDAO reservaDAO) {
		this.reservaDAO = reservaDAO;
	}

	/**
	 * Gets the id reserva.
	 *
	 * @return the id reserva
	 */
	public int getId_reserva() {
		return id_reserva;
	}

	/**
	 * Sets the id reserva.
	 *
	 * @param id_reserva the new id reserva
	 */
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	/**
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Insert.
	 *
	 * @return true, if successful
	 */
	public boolean insert() {
		return this.reservaDAO.insert(this);
	}

	/**
	 * Update.
	 *
	 * @return true, if successful
	 */
	public boolean update() {
		return reservaDAO.update(this);
	}

	/**
	 * Delete.
	 *
	 * @return true, if successful
	 */
	public boolean delete() {
		return reservaDAO.delete(this);
	}

	/**
	 * Read.
	 *
	 * @return true, if successful
	 */
	public boolean read() {
		return reservaDAO.read(this);
	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {
		return reservaDAO.readAll();
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

}
