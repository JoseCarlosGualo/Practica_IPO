package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Bungalow;
import Dominio.Disponibilidad;

/**
 * The Class BungalowDAO.
 */
public class BungalowDAO {
	
	/** The lista bungalows. */
	private ArrayList<Bungalow> listaBungalows;

	/**
	 * Instantiates a new bungalow DAO.
	 */
	public BungalowDAO() {
		this.listaBungalows = new ArrayList<Bungalow>();
	}

	/**
	 * Gets the lista bungalows.
	 *
	 * @return the lista bungalows
	 */
	public ArrayList<Bungalow> getListaBungalows() {
		return listaBungalows;
	}

	/**
	 * Insert.
	 *
	 * @param bungalow the bungalow
	 * @return true, if successful
	 */
	public boolean insert(Bungalow bungalow) {

		boolean correcto = false;

		try {
			String SQL = "INSERT INTO Bungalow (id, tipo, precio_noche, tamano, disponibilidad, capacidad, estancia_minima, equipamiento, imagen, descripcion)"
					+ " VALUES (" + bungalow.getId() + ",'" + bungalow.getId() + "'," + bungalow.getPrecio_noche() + ","
					+ bungalow.getTamano() + ",'" + bungalow.getDisponibilidad() + "','"
					+ bungalow.getCapacidad_maxima() + "','" + bungalow.getEstancia_minima() + "','"
					+ bungalow.getEquipamiento() + "','" + bungalow.getImagen() + "','" + bungalow.getDescripcion()
					+ "');";
			System.out.println(SQL);
			Agente.getAgente().modificar(SQL);
			correcto = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return correcto;

	}

	/**
	 * Last ID.
	 *
	 * @param bungalow the bungalow
	 * @return true, if successful
	 */
	public boolean lastID(Bungalow bungalow) {
		ResultSet resultado;
		boolean correcto = false;
		try {

			resultado = Agente.getAgente().leer("SELECT MAX(id) FROM Bungalow;");

			while (resultado.next()) {
				correcto = true;
				bungalow.setId(resultado.getInt(1) + 1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion SQL");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Excepcion general");
			// e.printStackTrace();
		}
		return correcto;
	}

	/**
	 * Update.
	 *
	 * @param bungalow the bungalow
	 * @return true, if successful
	 */
	public boolean update(Bungalow bungalow) {

		boolean correcto = false;

		try {
			String sql = "UPDATE Productos SET tipo='" + bungalow.getTipo() + "', precio_noche="
					+ bungalow.getPrecio_noche() + "" + ",tamano=" + bungalow.getTamano() + ",disponibilidad='"
					+ bungalow.getDisponibilidad() + "',capacidad='" + bungalow.getCapacidad_maxima() + "',"
					+ "estancia_minima='" + bungalow.getEstancia_minima() + "',equipamiento='"
					+ bungalow.getEquipamiento() + "',imagen='" + bungalow.getImagen() + "',descripcion='"
					+ bungalow.getDescripcion() + "' WHERE id=" + bungalow.getId() + ";";
			System.out.println(sql);
			Agente.getAgente().modificar(sql);
			correcto = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return correcto;

	}

	/**
	 * Delete.
	 *
	 * @param bungalow the bungalow
	 * @return true, if successful
	 */
	public boolean delete(Bungalow bungalow) {

		boolean correcto = false;

		try {
			Agente.getAgente().modificar("DELETE FROM Bungalow WHERE id=" + bungalow.getId() + ";");
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
	 * @param bungalow the bungalow
	 * @return true, if successful
	 */
	public boolean read(Bungalow bungalow) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT id, tipo, precio_noche, tamano, disponibilidad, capacidad, estancia_minima, equipamiento, imagen, descripcion FROM Bungalow WHERE id="
							+ bungalow.getId() + ";");
			while (resultado.next()) {
				bungalow.setId(resultado.getInt(1));
				bungalow.setTipo(resultado.getString(2));
				bungalow.setPrecio_noche(resultado.getDouble(3));
				bungalow.setTamano(resultado.getInt(4));
				switch (resultado.getString(5)) {
				case "Ocupada":
					bungalow.setDisponibilidad(Disponibilidad.Ocupada);
					break;
				case "Libre":
					bungalow.setDisponibilidad(Disponibilidad.Libre);
					break;
				case "Reparacion":
					bungalow.setDisponibilidad(Disponibilidad.Reparacion);
					break;
				case "Limpieza":
					bungalow.setDisponibilidad(Disponibilidad.Limpieza);
					break;
				default:
					System.out.println("No existe ese tipo de disponibilidad");
					break;
				}

				bungalow.setCapacidad_maxima(Integer.parseInt(resultado.getString(6)));
				bungalow.setEstancia_minima(Integer.parseInt(resultado.getString(7)));
				bungalow.setEquipamiento(resultado.getString(8));
				bungalow.setImagen(resultado.getString(9));
				bungalow.setDescripcion(resultado.getString(10));

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
		Bungalow bungalow;
		try {
			resultado = Agente.getAgente().leer("SELECT * FROM Bungalow;");

			while (resultado.next()) {

				bungalow = new Bungalow();

				bungalow.setId(resultado.getInt(1));
				bungalow.setTipo(resultado.getString(2));
				bungalow.setPrecio_noche(resultado.getDouble(3));
				bungalow.setTamano(resultado.getInt(4));
				switch (resultado.getString(5)) {
				case "Ocupada":
					bungalow.setDisponibilidad(Disponibilidad.Ocupada);
					break;
				case "Libre":
					bungalow.setDisponibilidad(Disponibilidad.Libre);
					break;
				case "Reparacion":
					bungalow.setDisponibilidad(Disponibilidad.Reparacion);
					break;
				case "Limpieza":
					bungalow.setDisponibilidad(Disponibilidad.Limpieza);
					break;
				default:
					System.out.println("No existe ese tipo de disponibilidad");
					break;
				}

				bungalow.setCapacidad_maxima(Integer.parseInt(resultado.getString(6)));
				bungalow.setEstancia_minima(Integer.parseInt(resultado.getString(7)));
				bungalow.setEquipamiento(resultado.getString(8));
				bungalow.setImagen(resultado.getString(9));
				bungalow.setDescripcion(resultado.getString(10));

				listaBungalows.add(bungalow);
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
