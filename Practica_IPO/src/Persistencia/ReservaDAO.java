package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.Bungalow;
import Dominio.Disponibilidad;
import Dominio.Empleado;
import Dominio.Parcela;
import Dominio.Reserva;

public class ReservaDAO {
	private ArrayList<Reserva> listaReservas;

	public ReservaDAO() {
		this.listaReservas = new ArrayList<Reserva>();
	}

	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}

	public boolean insert(Reserva reserva) {

		boolean correcto = false;

		try {

			if (reserva.getEstancia() instanceof Bungalow) {
				String SQL = "INSERT INTO Reserva (id_reserva, id_estancia, tipo, fecha_entrada, fecha_salida, nombre, teledono, email, n_ocupantes, solicitudes_especiales, hora_entrada, hora_salida, dni)"
						+ " VALUES (" + reserva.getId_reserva() + ",'" + reserva.getEstancia().getId() + "','Bungalow"
						+ "','" + reserva.getFecha_entrada() + "','" + reserva.getFecha_salida() + "','"
						+ reserva.getNombre() + "','" + reserva.getTelefono() + "','" + reserva.getEmail() + "','"
						+ reserva.getN_ocupantes() + "','" + reserva.getSolicitudes_especiales() + "','"
						+ reserva.getHora_entrada() + "','" + reserva.getHora_salida() + "','" + reserva.getDni()
						+ "');";
				System.out.println(SQL);
				Agente.getAgente().modificar(SQL);
				correcto = true;
			} else {
				String SQL = "INSERT INTO Reserva (id_reserva, id_estancia, tipo, fecha_entrada, fecha_salida, nombre, teledono, email, n_ocupantes, solicitudes_especiales, hora_entrada, hora_salida, dni)"
						+ " VALUES (" + reserva.getId_reserva() + ",'" + reserva.getEstancia().getId() + "',' Parcela"
						+ "','" + reserva.getFecha_entrada() + "','" + reserva.getFecha_salida() + "','"
						+ reserva.getNombre() + "','" + reserva.getTelefono() + "','" + reserva.getEmail() + "','"
						+ reserva.getN_ocupantes() + "','" + reserva.getSolicitudes_especiales() + "','"
						+ reserva.getHora_entrada() + "','" + reserva.getHora_salida() + "','" + reserva.getDni()
						+ "');";
				System.out.println(SQL);
				Agente.getAgente().modificar(SQL);
				correcto = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean update(Reserva reserva) {

		boolean correcto = false;

		try {

			String sql = "UPDATE Reserva SET fecha_entrada='" + reserva.getFecha_entrada() + "', fecha_salida="
					+ reserva.getFecha_salida() + "" + ",nombre=" + reserva.getNombre() + ",telefono='"
					+ reserva.getTelefono() + "',email='" + reserva.getEmail() + "'," + "n_ocupantes='"
					+ reserva.getN_ocupantes() + "',solicitudes_especiales='" + reserva.getSolicitudes_especiales()
					+ "',hora_entrada='" + reserva.getHora_entrada() + "',hora_salida='" + reserva.getHora_salida()
					+ "',dni='" + reserva.getDni() + "' WHERE id_reserva=" + reserva.getId_reserva()
					+ "AND id_estancia=" + reserva.getEstancia().getId() + "AND tipo=" + reserva.getTipo() + ";";
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

	public boolean delete(Reserva reserva) {

		boolean correcto = false;

		try {
			Agente.getAgente().modificar("DELETE FROM Reserva WHERE id_reserva='" + reserva.getId_reserva()
					+ "'AND id_estancia='" + reserva.getEstancia().getId() + "'AND tipo='" + reserva.getTipo() + "';");
			correcto = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correcto;

	}

	public boolean read(Reserva reserva) {

		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT id_reserva, id_estancia, tipo, fecha_entrada, fecha_salida, nombre, teledono, email, n_ocupantes, solicitudes_especiales, hora_entrada, hora_salida, dni FROM Reserva WHERE id_reserva='"
							+ reserva.getId_reserva() + "'AND id_estancia='" + reserva.getEstancia().getId()
							+ "'AND tipo='" + reserva.getTipo() + "';");
			while (resultado.next()) {
				reserva.setId_reserva(resultado.getInt(1));

				if (resultado.getString(3).equalsIgnoreCase("Bungalow")) {
					reserva.setTipo("Bungalow");
					Bungalow bungalow = new Bungalow(resultado.getInt(2));
					bungalow.read();
					reserva.setEstancia(bungalow);
				} else {
					reserva.setTipo("Parcela");
					Parcela parcela = new Parcela(resultado.getInt(2));
					parcela.read();
					reserva.setEstancia(parcela);
				}

				reserva.setFecha_entrada(resultado.getString(4));
				reserva.setFecha_salida(resultado.getString(5));
				reserva.setNombre(resultado.getString(6));
				reserva.setTelefono(resultado.getString(7));
				reserva.setEmail(resultado.getString(8));
				reserva.setN_ocupantes(resultado.getInt(9));
				reserva.setSolicitudes_especiales(resultado.getString(10));
				reserva.setHora_entrada(resultado.getString(11));
				reserva.setHora_salida(resultado.getString(12));
				reserva.setDni(resultado.getString(13));
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
		Reserva reserva;
		try {
			resultado = Agente.getAgente().leer("SELECT * FROM Reserva");

			while (resultado.next()) {

				reserva = new Reserva();
				reserva.setId_reserva(resultado.getInt(1));

				if (resultado.getString(3).equalsIgnoreCase("Bungalow")) {
					reserva.setTipo("Bungalow");
					Bungalow bungalow = new Bungalow(resultado.getInt(2));
					bungalow.read();
					reserva.setEstancia(bungalow);
				} else {
					reserva.setTipo("Parcela");
					Parcela parcela = new Parcela(resultado.getInt(2));
					parcela.read();
					reserva.setEstancia(parcela);
				}

				reserva.setFecha_entrada(resultado.getString(4));
				reserva.setFecha_salida(resultado.getString(5));
				reserva.setNombre(resultado.getString(6));
				reserva.setTelefono(resultado.getString(7));
				reserva.setEmail(resultado.getString(8));
				reserva.setN_ocupantes(resultado.getInt(9));
				reserva.setSolicitudes_especiales(resultado.getString(10));
				reserva.setHora_entrada(resultado.getString(11));
				reserva.setHora_salida(resultado.getString(12));
				reserva.setDni(resultado.getString(13));
				listaReservas.add(reserva);

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
