package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.Disponibilidad;
import Dominio.Parcela;

/**
 * The Class ParcelaDAO.
 */
public class ParcelaDAO {
	
	/** The lista parcelas. */
	private ArrayList<Parcela> listaParcelas;

	/**
	 * Instantiates a new parcela DAO.
	 */
	public ParcelaDAO() {
		this.listaParcelas = new ArrayList<Parcela>();
	}

	/**
	 * Gets the lista parcelas.
	 *
	 * @return the lista parcelas
	 */
	public ArrayList<Parcela> getListaParcelas() {
		return listaParcelas;
	}

	/**
	 * Insert.
	 *
	 * @param parcela the parcela
	 * @return true, if successful
	 */
	public boolean insert(Parcela parcela) {

		boolean correcto = false;

		try {
			String SQL = "INSERT INTO Parcela (id, tipo, precio_noche, tamano, disponibilidad, precio_baja, precio_media, precio_alta, servicios, imagen, ubicacion)"
					+ " VALUES (" + parcela.getId() + ",'" + parcela.getId() + "'," + parcela.getPrecio_noche() + ","
					+ parcela.getTamano() + ",'" + parcela.getDisponibilidad() + "','" + parcela.getPrecio_tBaja()
					+ "','" + parcela.getPrecio_tMedia() + "','" + parcela.getPrecio_tAlta() + "','"
					+ parcela.getServicios() + "','" + parcela.getImagen() + "','" + parcela.getUbicacion() + "');";
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
	 * @param parcela the parcela
	 * @return true, if successful
	 */
	public boolean lastID(Parcela parcela) {
		ResultSet resultado;
		boolean correcto = false;
		try {

			resultado = Agente.getAgente().leer("SELECT MAX(id) FROM Parcela;");

			while (resultado.next()) {
				correcto = true;
				parcela.setId(resultado.getInt(1) + 1);

			}
		} catch (SQLException e) {
			System.out.println("Excepcion SQL");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Excepcion general");
		}
		return correcto;
	}

	/**
	 * Update.
	 *
	 * @param parcela the parcela
	 * @return true, if successful
	 */
	public boolean update(Parcela parcela) {

		boolean correcto = false;

		try {
			String sql = "UPDATE Parcela SET tipo='" + parcela.getTipo() + "', precio_noche="
					+ parcela.getPrecio_noche() + "" + ",tamano=" + parcela.getTamano() + ",disponibilidad='"
					+ parcela.getDisponibilidad() + "',precio_baja='" + parcela.getPrecio_tBaja() + "',"
					+ "precio_media='" + parcela.getPrecio_tMedia() + "',precio_alta='" + parcela.getPrecio_tAlta()
					+ "',servicios='" + parcela.getServicios() + "',imagen='" + parcela.getImagen() + "',ubicacion='"
					+ parcela.getUbicacion() + "' WHERE id=" + parcela.getId() + ";";
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
	 * @param parcela the parcela
	 * @return true, if successful
	 */
	public boolean delete(Parcela parcela) {

		boolean correcto = false;

		try {
			Agente.getAgente().modificar("DELETE FROM Parcela WHERE id=" + parcela.getId() + ";");
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
	 * @param parcela the parcela
	 * @return true, if successful
	 */
	public boolean read(Parcela parcela) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT id, tipo, precio_noche, tamano, disponibilidad, precio_baja, precio_media, precio_alta, servicios, imagen, ubicacion FROM Parcela WHERE id="
							+ parcela.getId() + ";");
			while (resultado.next()) {
				parcela.setId(resultado.getInt(1));
				parcela.setTipo(resultado.getString(2));
				parcela.setPrecio_noche(resultado.getDouble(3));
				parcela.setTamano(resultado.getInt(4));
				switch (resultado.getString(5)) {
				case "Ocupada":
					parcela.setDisponibilidad(Disponibilidad.Ocupada);
					break;
				case "Libre":
					parcela.setDisponibilidad(Disponibilidad.Libre);
					break;
				case "Reparacion":
					parcela.setDisponibilidad(Disponibilidad.Reparacion);
					break;
				case "Limpieza":
					parcela.setDisponibilidad(Disponibilidad.Limpieza);
					break;
				default:
					System.out.println("No existe ese tipo de disponibilidad");
					break;
				}

				parcela.setPrecio_tBaja(resultado.getInt(6));
				parcela.setPrecio_tMedia(resultado.getInt(7));
				parcela.setPrecio_tAlta(resultado.getInt(8));
				parcela.setServicios(resultado.getString(9));
				parcela.setImagen(resultado.getString(10));
				parcela.setUbicacion(resultado.getString(11));

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
		Parcela parcela;
		try {
			resultado = Agente.getAgente().leer("SELECT * FROM Parcela;");

			while (resultado.next()) {

				parcela = new Parcela();

				parcela.setId(resultado.getInt(1));
				parcela.setTipo(resultado.getString(2));
				parcela.setPrecio_noche(resultado.getDouble(3));
				parcela.setTamano(resultado.getInt(4));
				switch (resultado.getString(5)) {
				case "Ocupada":
					parcela.setDisponibilidad(Disponibilidad.Ocupada);
					break;
				case "Libre":
					parcela.setDisponibilidad(Disponibilidad.Libre);
					break;
				case "Reparacion":
					parcela.setDisponibilidad(Disponibilidad.Reparacion);
					break;
				case "Limpieza":
					parcela.setDisponibilidad(Disponibilidad.Limpieza);
					break;
				default:
					System.out.println("No existe ese tipo de disponibilidad");
					break;
				}

				parcela.setPrecio_tBaja(resultado.getInt(6));
				parcela.setPrecio_tMedia(resultado.getInt(7));
				parcela.setPrecio_tAlta(resultado.getInt(8));
				parcela.setServicios(resultado.getString(9));
				parcela.setImagen(resultado.getString(10));
				parcela.setUbicacion(resultado.getString(11));

				listaParcelas.add(parcela);

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
