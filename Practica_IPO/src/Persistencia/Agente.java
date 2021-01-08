package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class Agente.
 */
public class Agente {

	/** The m instancia. */
	protected static Agente mInstancia = null;
	
	/** The m BD. */
	protected static Connection mBD;
	
	/** The url. */
	private static String url = "jdbc:ucanaccess://ipoBBDD.accdb";
	
	/** The driver. */
	private static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";

	/**
	 * Instantiates a new agente.
	 *
	 * @throws Exception the exception
	 */
	private Agente() throws Exception {
		conectar();
	}

	/**
	 * Gets the agente.
	 *
	 * @return the agente
	 * @throws Exception the exception
	 */
	public static Agente getAgente() throws Exception {
		if (mInstancia == null) {
			mInstancia = new Agente();
		}
		return mInstancia;
	}

	/**
	 * Conectar.
	 *
	 * @throws Exception the exception
	 */
	private void conectar() throws Exception {
		Class.forName(driver);
		mBD = DriverManager.getConnection(url, "", "");
	}

	/**
	 * Desconectar.
	 *
	 * @throws Exception the exception
	 */
	public void desconectar() throws Exception {
		mBD.close();
	}

	/**
	 * Modificar.
	 *
	 * @param SQL the sql
	 * @return the int
	 * @throws SQLException the SQL exception
	 * @throws Exception the exception
	 */
	public int modificar(String SQL) throws SQLException, Exception {
		Statement st = mBD.createStatement();
		int res = st.executeUpdate(SQL);
		return res;
	}

	/**
	 * Leer.
	 *
	 * @param SQL the sql
	 * @return the result set
	 * @throws SQLException the SQL exception
	 * @throws Exception the exception
	 */
	public ResultSet leer(String SQL) throws SQLException, Exception {

		Statement st = mBD.createStatement();
		ResultSet resultado = st.executeQuery(SQL);
		return resultado;
	}
}