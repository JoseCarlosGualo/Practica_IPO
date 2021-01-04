package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.RutaSenderista;
import Dominio.Actividad;
import Dominio.Empleado;

public class RutaDAO {

	private ArrayList<RutaSenderista> listaRutas;

	public RutaDAO() {
		this.listaRutas = new ArrayList<RutaSenderista>();
	}

	public ArrayList<RutaSenderista> getListaRutas() {
		return this.listaRutas;
	}

	public boolean insert(RutaSenderista ruta) {

		boolean correcto = false;

		try {
			String SQL = "INSERT INTO Rutas (id, nombre, empleado, fecha, hora_inicio, hora_fin, equipamiento, pto_encuentro, personas_min, personas_max, grado_dificultad, descripcion, foto)"
					+ " VALUES (" + ruta.getId() + ",'" + ruta.getNombre() + "'," + ruta.getMonitor().getDni() + "','"
					+ ruta.getDia() + "','" + ruta.getHora_inicio() + "','" + ruta.getHora_fin() + "','"
					+ ruta.getEquipamiento() + "','" + ruta.getPto_encuentro() + "','" + ruta.getPersonas_min() + "','"
					+ ruta.getPersonas_max() + "','" + ruta.getGrado_dificultad() + "','" + ruta.getDescripcion()
					+ "','" + ruta.getFoto() + "');";
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

	public boolean update(RutaSenderista ruta) {
		boolean correcto = false;
		try {
			Agente.getAgente().modificar("UPDATE Rutas SET nombre='" + ruta.getNombre() + "'," + "empleado='"
					+ ruta.getMonitor() + "',  fecha='" + ruta.getDia() + "'," + "hora_inicio='" + ruta.getHora_inicio()
					+ "', hora_fin='" + ruta.getHora_fin() + "'," + "equipamiento = '" + ruta.getEquipamiento()
					+ "', pto_encuentro='" + ruta.getPto_encuentro() + "'," + "personas_min = '"
					+ ruta.getPersonas_min() + "',personas_max = '" + ruta.getPersonas_max() + "',"
					+ "grado_dificultad = '" + ruta.getGrado_dificultad() + "',descripcion = '" + ruta.getDescripcion()
					+ "',foto = '" + ruta.getFoto() + "' WHERE id='" + ruta.getId() + "';");
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

	public boolean delete(RutaSenderista ruta) {

		boolean correcto = false;

		try {
			Agente.getAgente().modificar("DELETE FROM Rutas WHERE id='" + ruta.getId() + "';");
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

	public boolean read(RutaSenderista ruta) {
		boolean correcto = false;
		ResultSet resultado;
		try {
			resultado = Agente.getAgente().leer(
					"SELECT id, nombre, empleado, fecha, hora_inicio, hora_fin, equipamiento, pto_encuentro, personas_min, personas_max, grado_dificultad, descripcion, foto FROM Rutas WHERE id='"
							+ ruta.getId() + "';");
			while (resultado.next()) {
				ruta.setId((resultado.getInt(1)));
				ruta.setNombre(resultado.getString(2));
				Empleado e = new Empleado();
				e.setDni((resultado.getString(2)));
				e.read();
				ruta.setMonitor(e);
				ruta.setPersonas_min(resultado.getString(9));
				ruta.setPersonas_max(resultado.getString(10));
				ruta.setGrado_dificultad(resultado.getString(11));
				ruta.setDia(resultado.getString(4));
				ruta.setHora_inicio(resultado.getString(5));
				ruta.setHora_fin(resultado.getString(6));
				ruta.setEquipamiento(resultado.getString(7));
				ruta.setDescripcion(resultado.getString(12));
				ruta.setPto_encuentro((resultado.getString(8)));
				ruta.setFoto((resultado.getString(13)));
			}
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

	public boolean readAll() {
		boolean correcto = false;
		ResultSet resultado;

		try {
			resultado = Agente.getAgente().leer("SELECT * FROM Rutas;");

			while (resultado.next()) {
				RutaSenderista ruta = new RutaSenderista();
				ruta.setId((resultado.getInt(1)));
				ruta.setNombre(resultado.getString(2));
				Empleado e = new Empleado();
				e.setDni((resultado.getString(2)));
				e.read();
				ruta.setMonitor(e);
				ruta.setPersonas_min(resultado.getString(9));
				ruta.setPersonas_max(resultado.getString(10));
				ruta.setGrado_dificultad(resultado.getString(11));
				ruta.setDia(resultado.getString(4));
				ruta.setHora_inicio(resultado.getString(5));
				ruta.setHora_fin(resultado.getString(6));
				ruta.setEquipamiento(resultado.getString(7));
				ruta.setDescripcion(resultado.getString(12));
				ruta.setPto_encuentro((resultado.getString(8)));
				ruta.setFoto((resultado.getString(13)));

				listaRutas.add(ruta);

			}
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

}