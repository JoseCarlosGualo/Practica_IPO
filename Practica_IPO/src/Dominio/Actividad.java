package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Actividad {
	private Empleado empleado;
	private Date horario;
	private int cupo_minimo;
	private int cupo_maximo;
	private int destinatario; //0-niños, 1-adultos, 2-ambos
	private double precio_hora;
	private String zona_camping;
	private String descripcion;
	private List<String> equipamiento = new ArrayList<String>();
	
	public Actividad(Empleado empleado, Date horario, int cupo_minimo, int cupo_maximo, int destinatario,
			double precio_hora, String zona_camping, String descripcion, List<String> equipamiento) {
		this.empleado = empleado;
		this.horario = horario;
		this.cupo_minimo = cupo_minimo;
		this.cupo_maximo = cupo_maximo;
		this.destinatario = destinatario;
		this.precio_hora = precio_hora;
		this.zona_camping = zona_camping;
		this.descripcion = descripcion;
		this.equipamiento = equipamiento;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
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

	public int getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(int destinatario) {
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

	public List<String> getEquipamiento() {
		return equipamiento;
	}

	public void setEquipamiento(List<String> equipamiento) {
		this.equipamiento = equipamiento;
	}
	
		
	
}
