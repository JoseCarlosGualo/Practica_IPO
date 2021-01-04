package Dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import Persistencia.RutaDAO;

public class RutaSenderista {
	private String dia;
	private int id;
	private String hora_inicio;
	private String hora_fin;
	private Empleado monitor;
	private String equipamiento;
	private String pto_encuentro;
	private String personas_min;
	private String personas_max;
	private String grado_dificultad;
	private String descripcion;
	private String nombre;
	private RutaDAO rutaDAO;
	private String foto;

	public RutaSenderista(int id, String dia, String hora_inicio, String hora_fin, Empleado monitor,
			String pto_encuentro, String personas_min, String personas_max, String grado_dificultad, String descripcion,
			String equipamiento) {
		this.id = id;
		this.dia = dia;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.monitor = monitor;
		this.pto_encuentro = pto_encuentro;
		this.personas_min = personas_min;
		this.personas_max = personas_max;
		this.grado_dificultad = grado_dificultad;
		this.descripcion = descripcion;
		this.equipamiento = equipamiento;

		this.rutaDAO = new RutaDAO();
	}

	public RutaSenderista() {
		this.rutaDAO = new RutaDAO();
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(String hora_fin) {
		this.hora_fin = hora_fin;
	}

	public Empleado getMonitor() {
		return monitor;
	}

	public void setMonitor(Empleado monitor) {
		this.monitor = monitor;
	}

	public void setEquipamiento(String equipamiento) {
		this.equipamiento = equipamiento;
	}

	public String getEquipamiento() {
		return equipamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPto_encuentro() {
		return pto_encuentro;
	}

	public void setPto_encuentro(String pto_encuentro) {
		this.pto_encuentro = pto_encuentro;
	}

	public String getPersonas_min() {
		return personas_min;
	}

	public void setPersonas_min(String string) {
		this.personas_min = string;
	}

	public String getPersonas_max() {
		return personas_max;
	}

	public void setPersonas_max(String string) {
		this.personas_max = string;
	}

	public String getGrado_dificultad() {
		return grado_dificultad;
	}

	public void setGrado_dificultad(String grado_dificultad) {
		this.grado_dificultad = grado_dificultad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public boolean insert() {
		return this.rutaDAO.insert(this);
	}

	public boolean update() {
		return rutaDAO.update(this);
	}

	public boolean delete() {
		return rutaDAO.delete(this);
	}

	public RutaDAO getRutaDAO() {
		return rutaDAO;
	}

	public void setRutaDAO(RutaDAO rutaDAO) {
		this.rutaDAO = rutaDAO;
	}

	public boolean read() {
		return rutaDAO.read(this);
	}

	public boolean readAll() {
		return rutaDAO.readAll();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}