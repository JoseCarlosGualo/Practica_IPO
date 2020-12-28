package Dominio;

import Persistencia.ActividadDAO;

public class Actividad {
	private int id;
	private String nombre;
	private Empleado empleado;
	private String horario;
	private int cupo_minimo;
	private int cupo_maximo;
	private String destinatario;
	private double precio_hora;
	private String zona_camping;
	private String descripcion;
	private String equipamiento;
	private String imagen;

	private ActividadDAO actividadDAO;

	public Actividad() {
		this.actividadDAO = new ActividadDAO();
	}

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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCupo_minimo() {
		return cupo_minimo;
	}

	public void setCupo_minimo(int cupo_minimo) {
		this.cupo_minimo = cupo_minimo;
	}

	public int getCupo_maximo() {
		return cupo_maximo;
	}

	public void setCupo_maximo(int cupo_maximo) {
		this.cupo_maximo = cupo_maximo;
	}

	public ActividadDAO getActividadDAO() {
		return actividadDAO;
	}

	public void setActividadDAO(ActividadDAO actividadDAO) {
		this.actividadDAO = actividadDAO;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public double getPrecio_hora() {
		return precio_hora;
	}

	public void setPrecio_hora(double precio_hora) {
		this.precio_hora = precio_hora;
	}

	public String getZona_camping() {
		return zona_camping;
	}

	public void setZona_camping(String zona_camping) {
		this.zona_camping = zona_camping;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean insert() {
		return this.actividadDAO.insert(this);
	}

	public boolean update() {
		return actividadDAO.update(this);
	}

	public boolean delete() {
		return actividadDAO.delete(this);
	}

	public boolean read() {
		return actividadDAO.read(this);
	}

	public boolean readAll() {
		return actividadDAO.readAll();
	}
}
