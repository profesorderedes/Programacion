package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import auxiliar.TituloEstreno;

public class Database {

	private final String USER = "netflix";
	private final String PASSWORD = "Ageofempires2";
	private final String URL = "jdbc:mysql://localhost/netflix_final";

	private Connection con;
	private PreparedStatement stmt;

	public Database() throws SQLException {

		con = DriverManager.getConnection(URL, USER, PASSWORD);

	}

	public void desconectar() throws SQLException {
		con.close();
		stmt.close();
	}

	public List<TituloEstreno> consulta1TipoShow(int tipoShow) throws SQLException {

		String sql = "SELECT id, title, release_year FROM netflix_final.show WHERE type = ? ORDER BY title";
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, tipoShow);

		List<TituloEstreno> listado = new ArrayList<>();

		ResultSet resultado = stmt.executeQuery();

		while (resultado.next()) {

			int id = resultado.getInt("id");
			String titulo = resultado.getString("title");
			int lanzamiento = resultado.getInt("release_year");

			listado.add(new TituloEstreno(id, titulo, lanzamiento));

		}

		return listado;

	}

	public List<TituloEstreno> consulta2Director(String nombreDirector) throws SQLException {
		return null;
	}
}








