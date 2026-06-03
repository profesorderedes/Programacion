package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import auxiliar.TituloEstreno;
import auxiliar.TituloLanzamiento;

public class Database {

	private final String USER = "netflix";
	private final String PASSWORD = "Ageofempires2";
	private final String URL = "jdbc:mysql://localhost/netflix_final";

	private Connection con;
	private PreparedStatement stmt;

	public Database() throws SQLException {

		con = DriverManager.getConnection(URL, USER, PASSWORD);

	}

	public void desconectar() throws SQLException, NullPointerException {
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

	public List<TituloLanzamiento> consulta2Director(String director) throws SQLException {

		String sql = "SELECT s.title, s.release_year, s.description "
				+ "FROM netflix_final.show s JOIN show_director sd ON sd.id_show = s.id "
				+ "JOIN director d ON sd.id_director = d.id WHERE d.name = ? ORDER BY s.title";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, director);

		List<TituloLanzamiento> listado = new ArrayList<>();

		ResultSet resultado = stmt.executeQuery();

		while (resultado.next()) {

			String titulo = resultado.getString("title");
			int lanzamiento = resultado.getInt("release_year");
			String descripcion = resultado.getString("description");

			listado.add(new TituloLanzamiento(titulo, lanzamiento, descripcion));

		}

		return listado;

	}

}
