package Dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RutaSenderista {
	private Date dia;
	private Calendar hora_inicio;
	private Calendar hora_fin;
	private List<Empleado> monitores = new ArrayList<Empleado>();
	private String pto_encuentro;
	private int personas_min;
	private int personas_max;
	private String grado_dificultad;
	private String descripcion; 
	private List<String> equipamiento = new ArrayList<String>();
	private int mapa;
	
	public RutaSenderista(Date dia, Calendar hora_inicio, Calendar hora_fin, List<Empleado> monitores,
			String pto_encuentro, int personas_min, int personas_max, String grado_dificultad, String descripcion,
			List<String> equipamiento, int mapa) {
		this.dia = dia;
		this.hora_inicio = hora_inicio;
		this.hora_fin = hora_fin;
		this.monitores = monitores;
		this.pto_encuentro = pto_encuentro;
		this.personas_min = personas_min;
		this.personas_max = personas_max;
		this.grado_dificultad = grado_dificultad;
		this.descripcion = descripcion;
		this.equipamiento = equipamiento;
		this.mapa = mapa;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Calendar getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(Calendar hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public Calendar getHora_fin() {
		return hora_fin;
	}

	public void setHora_fin(Calendar hora_fin) {
		this.hora_fin = hora_fin;
	}

	public List<Empleado> getMonitores() {
		return monitores;
	}

	public void setMonitores(List<Empleado> monitores) {
		this.monitores = monitores;
	}

	public String getPto_encuentro() {
		return pto_encuentro;
	}

	public void setPto_encuentro(String pto_encuentro) {
		this.pto_encuentro = pto_encuentro;
	}

	public int getPersonas_min() {
		return personas_min;
	}

	public void setPersonas_min(int personas_min) {
		this.personas_min = personas_min;
	}

	public int getPersonas_max() {
		return personas_max;
	}

	public void setPersonas_max(int personas_max) {
		this.personas_max = personas_max;
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

	public List<String> getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(List<String> equipamiento) {
		this.equipamiento = equipamiento;
	}

	public int getMapa() {
		return mapa;
	}

	public void setMapa(int mapa) {
		this.mapa = mapa;
	}

	
}
