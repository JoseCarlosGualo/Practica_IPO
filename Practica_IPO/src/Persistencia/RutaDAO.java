package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dominio.RutaSenderista;
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
			Agente.getAgente()
					.modificar("INSERT INTO rutas VALUES('" + ruta.getNombre() + "','" + ruta.getMonitor() + "',"
							+ ruta.getPersonas_min() + "'," + ruta.getPersonas_max() + "'," + ruta.getGrado_dificultad()
							+ "'," + ruta.getDia() + "'," + ruta.getHora_inicio() + "'," + ruta.getHora_fin() + "',"
							+ ruta.getEquipamiento() + "'," + ruta.getDescripcion() + "'," + ruta.getFoto() + "')");
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

	public boolean update(RutaSenderista ruta) {
		boolean correcto = false;
		try {
			Agente.getAgente()
					.modificar("UPDATE usuario SET nombre='" + ruta.getNombre() + "'," + "monitor='"
							+ ruta.getMonitor() + "',  min='" + ruta.getPersonas_min() + "',"
							+ "max='" + ruta.getPersonas_max() + "', dificultad='" + ruta.getGrado_dificultad() + "',"
							+ "dia = '" + ruta.getDia() + "', hora_inicio='" + ruta.getHora_inicio()+ "',"
							+ "hora_fin = '" + ruta.getHora_fin() + "',equipamiento = '" + ruta.getEquipamiento() + "',"
							+ "descripcion = '" + ruta.getDescripcion() + "',foto = '" + ruta.getFoto()
							+ "' WHERE id='" + ruta.getNombre() + "';");
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
			Agente.getAgente().modificar("DELETE FROM rutas WHERE nombre='" + ruta.getNombre() + "';");
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
			resultado = Agente.getAgente().leer("SELECT FROM rutas WHERE DNI='" + ruta.getNombre() + "';");
			while (resultado.next()) {
				ruta.setNombre(resultado.getString(1));
				Empleado e = new Empleado();
				e.setNombre(resultado.getString(2));
				ruta.setMonitor(e);
				ruta.setPersonas_min(resultado.getString(3));
				ruta.setPersonas_max(resultado.getString(4));
				ruta.setGrado_dificultad(resultado.getString(5));
				ruta.setDia(resultado.getString(6));
				ruta.setHora_inicio(resultado.getString(7));
				ruta.setHora_fin(resultado.getString(8));
				ruta.setEquipamiento(resultado.getString(9));
				ruta.setDescripcion(resultado.getString(10));
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
			resultado = Agente.getAgente().leer("SELECT * FROM usuarios;");

			while (resultado.next()) {
				RutaSenderista ruta = new RutaSenderista();
				ruta.setNombre(resultado.getString(1));
				Empleado e = new Empleado();
				e.setNombre(resultado.getString(2));
				ruta.setMonitor(e);
				ruta.setPersonas_min(resultado.getString(3));
				ruta.setPersonas_max(resultado.getString(4));
				ruta.setGrado_dificultad(resultado.getString(5));
				ruta.setDia(resultado.getString(6));
				ruta.setHora_inicio(resultado.getString(7));
				ruta.setHora_fin(resultado.getString(8));
				ruta.setEquipamiento(resultado.getString(9));
				ruta.setDescripcion(resultado.getString(10));

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
