package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.Disponibilidad;
import Dominio.Empleado;
import Dominio.Parcela;

/**
 * The Class EmpleadoDAO.
 */
public class EmpleadoDAO {
	
	/** The lista empleados. */
	private ArrayList<Empleado> listaEmpleados;

	/**
	 * Instantiates a new empleado DAO.
	 */
	public EmpleadoDAO() {
		this.listaEmpleados = new ArrayList<Empleado>();
	}

	/**
	 * Gets the lista empleados.
	 *
	 * @return the lista empleados
	 */
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	/**
	 * Insert.
	 *
	 * @param empleado the empleado
	 * @return true, if successful
	 */
	public boolean insert(Empleado empleado) {

		boolean correcto = false;

		try {
			String SQL = "INSERT INTO Empleado (dni, nombre, apellido, imagen, telefono, email, idiomas, formacion)"
					+ " VALUES (" + empleado.getDni() + ",'" + empleado.getNombre() + "','" + empleado.getApellidos()
					+ "','" + empleado.getImagen() + "','" + empleado.getTelefono() + "','" + empleado.getEmail()
					+ "','" + empleado.getIdiomas() + "','" + empleado.getFormacion() + "');";
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

	/**
	 * Update.
	 *
	 * @param empleado the empleado
	 * @return true, if successful
	 */
	public boolean update(Empleado empleado) {

		boolean correcto = false;

		try {
			String sql = "UPDATE Empleado SET nombre='" + empleado.getNombre() + "', apellido='"
					+ empleado.getApellidos() + "',imagen='" + empleado.getImagen() + "',telefono='"
					+ empleado.getTelefono() + "',email='" + empleado.getEmail() + "'," + "idiomas='"
					+ empleado.getIdiomas() + "',formacion='" + empleado.getFormacion() + "' WHERE dni='"
					+ empleado.getDni() + "';";
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

	/**
	 * Delete.
	 *
	 * @param empleado the empleado
	 * @return true, if successful
	 */
	public boolean delete(Empleado empleado) {

		boolean correcto = false;

		try {
			Agente.getAgente().modificar("DELETE FROM Empleado WHERE dni='" + empleado.getDni() + "';");
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	/**
	 * Read.
	 *
	 * @param empleado the empleado
	 * @return true, if successful
	 */
	public boolean read(Empleado empleado) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT dni, nombre, apellido, imagen, telefono, email, idiomas, formacion FROM Empleado WHERE dni='"
							+ empleado.getDni() + "';");
			while (resultado.next()) {
				empleado.setDni(resultado.getString(1));
				empleado.setNombre(resultado.getString(2));
				empleado.setApellidos(resultado.getString(3));
				empleado.setImagen(resultado.getString(4));
				empleado.setTelefono(resultado.getString(5));
				empleado.setEmail(resultado.getString(6));
				empleado.setIdiomas(resultado.getString(7));
				empleado.setFormacion(resultado.getString(8));
			}
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	/**
	 * Read from name.
	 *
	 * @param empleado the empleado
	 * @return true, if successful
	 */
	public boolean readFromName(Empleado empleado) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT dni, nombre, apellido, imagen, telefono, email, idiomas, formacion FROM Empleado WHERE nombre='"
							+ empleado.getNombre() + "';");
			while (resultado.next()) {
				empleado.setDni(resultado.getString(1));
				empleado.setNombre(resultado.getString(2));
				empleado.setApellidos(resultado.getString(3));
				empleado.setImagen(resultado.getString(4));
				empleado.setTelefono(resultado.getString(5));
				empleado.setEmail(resultado.getString(6));
				empleado.setIdiomas(resultado.getString(7));
				empleado.setFormacion(resultado.getString(8));
			}
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	/**
	 * Read all.
	 *
	 * @return true, if successful
	 */
	public boolean readAll() {

		boolean correcto = false;
		ResultSet resultado;
		Empleado empleado;
		try {
			resultado = Agente.getAgente().leer("SELECT * FROM Empleado;");

			while (resultado.next()) {

				empleado = new Empleado();
				empleado.setDni(resultado.getString(1));
				empleado.setNombre(resultado.getString(2));
				empleado.setApellidos(resultado.getString(3));
				empleado.setImagen(resultado.getString(4));
				empleado.setTelefono(resultado.getString(5));
				empleado.setEmail(resultado.getString(6));
				empleado.setIdiomas(resultado.getString(7));
				empleado.setFormacion(resultado.getString(8));
				listaEmpleados.add(empleado);

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
