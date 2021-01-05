package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Actividad;
import Dominio.Disponibilidad;
import Dominio.Empleado;
import Dominio.Parcela;

public class ActividadDAO {
	private ArrayList<Actividad> listaActividades;

	public ActividadDAO() {
		this.listaActividades = new ArrayList<Actividad>();
	}

	public ArrayList<Actividad> getListaActividades() {
		return listaActividades;
	}

	public boolean insert(Actividad actividad) {

		boolean correcto = false;

		try {
			String SQL = "INSERT INTO Actividad (id, nombre, empleado, horario, cupo_minimo, cupo_maximo, destinatario, precio_hora, zona_camping, descripcion, equipamiento, imagen)"
					+ " VALUES ('" + actividad.getId() + "','" + actividad.getNombre() + "','"
					+ actividad.getEmpleado().getDni() + "','" + actividad.getHorario() + "','"
					+ actividad.getCupo_minimo() + "','" + actividad.getCupo_maximo() + "','"
					+ actividad.getDestinatario() + "','" + actividad.getZona_camping() + "','"
					+ actividad.getDescripcion() + "','" + actividad.getEquipamiento() + "','" + actividad.getImagen()
					+ "');";
			System.out.println(SQL);
			Agente.getAgente().modificar(SQL);
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean update(Actividad actividad) {

		boolean correcto = false;

		try {
			String sql = "UPDATE Actividad SET nombre='" + actividad.getNombre() + "', empleado='"
					+ actividad.getEmpleado().getDni() + "'" + ",horario='" + actividad.getHorario() + "',cupo_minimo='"
					+ actividad.getCupo_minimo() + "',cupo_maximo='" + actividad.getCupo_maximo() + "',"
					+ "destinatario='" + actividad.getDestinatario() + "',precio_hora='" + actividad.getPrecio_hora()
					+ "',zona_camping='" + actividad.getZona_camping() + "',descripcion='" + actividad.getDescripcion()
					+ "',equipamiento='" + actividad.getEquipamiento() + "',imagen='" + actividad.getImagen()
					+ "' WHERE id='" + actividad.getId() + "';";
			System.out.println(sql);
			Agente.getAgente().modificar(sql);
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean delete(Actividad actividad) {

		boolean correcto = false;

		try {
			Agente.getAgente().modificar("DELETE FROM Actividad WHERE id=" + actividad.getId() + ";");
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean read(Actividad actividad) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT id, nombre, empleado, horario, cupo_minimo, cupo_maximo, destinatario, precio_hora, zona_camping, descripcion, equipamiento, imagen FROM Actividad WHERE id="
							+ actividad.getId() + ";");
			while (resultado.next()) {
				actividad.setId(resultado.getInt(1));
				actividad.setNombre(resultado.getString(2));
				Empleado empleado = new Empleado();
				empleado.setDni(resultado.getString(3));
				empleado.read();
				actividad.setEmpleado(empleado);
				actividad.setHorario(resultado.getString(4));
				actividad.setCupo_minimo(resultado.getInt(5));
				actividad.setCupo_maximo(resultado.getInt(6));
				actividad.setDestinatario(resultado.getString(7));
				actividad.setPrecio_hora((resultado.getDouble(8)));
				actividad.setZona_camping(resultado.getString(9));
				actividad.setDescripcion(resultado.getString(10));
				actividad.setEquipamiento(resultado.getString(11));
				actividad.setImagen(resultado.getString(12));
			}
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean readFromName(Actividad actividad) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT id, nombre, empleado, horario, cupo_minimo, cupo_maximo, destinatario, precio_hora, zona_camping, descripcion, equipamiento, imagen FROM Actividad WHERE nombre="
							+ actividad.getNombre() + ";");
			while (resultado.next()) {
				actividad.setId(resultado.getInt(1));
				actividad.setNombre(resultado.getString(2));
				Empleado empleado = new Empleado();
				empleado.setDni(resultado.getString(3));
				empleado.read();
				actividad.setEmpleado(empleado);
				actividad.setHorario(resultado.getString(4));
				actividad.setCupo_minimo(resultado.getInt(5));
				actividad.setCupo_maximo(resultado.getInt(6));
				actividad.setDestinatario(resultado.getString(7));
				actividad.setPrecio_hora((resultado.getDouble(8)));
				actividad.setZona_camping(resultado.getString(9));
				actividad.setDescripcion(resultado.getString(10));
				actividad.setEquipamiento(resultado.getString(11));
				actividad.setImagen(resultado.getString(12));
			}
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean readAll() {

		boolean correcto = false;
		ResultSet resultado;
		Actividad actividad;
		try {
			resultado = Agente.getAgente().leer("SELECT * FROM Actividad;");

			while (resultado.next()) {

				actividad = new Actividad();
				actividad.setId(resultado.getInt(1));
				actividad.setNombre(resultado.getString(2));
				Empleado empleado = new Empleado();
				empleado.setDni(resultado.getString(3));
				empleado.read();
				actividad.setEmpleado(empleado);
				actividad.setHorario(resultado.getString(4));
				actividad.setCupo_minimo(resultado.getInt(5));
				actividad.setCupo_maximo(resultado.getInt(6));
				actividad.setDestinatario(resultado.getString(7));
				actividad.setPrecio_hora((resultado.getDouble(8)));
				actividad.setZona_camping(resultado.getString(9));
				actividad.setDescripcion(resultado.getString(10));
				actividad.setEquipamiento(resultado.getString(11));
				actividad.setImagen(resultado.getString(12));
				listaActividades.add(actividad);

			}
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

}
