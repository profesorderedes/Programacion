package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
		
		if (con != null) {
			con.close();
		}

		if (stmt != null) {
			stmt.close();
		}

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

	public List<TituloLanzamiento> consulta3Actor(String actor) throws SQLException {

		String sql = "SELECT s.title, s.release_year, s.description "
				+ "FROM netflix_final.show s JOIN show_actor sa ON sa.id_show = s.id "
				+ "JOIN actor a ON sa.id_actor = a.id WHERE a.name = ? ORDER BY s.title";
		stmt = con.prepareStatement(sql);
		stmt.setString(1, actor);

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

	public List<String> consulta4Reparto(String produccion) throws SQLException {

		String sql = "SELECT a.name " + "FROM actor a " + "JOIN show_actor sa ON sa.id_actor = a.id "
				+ "JOIN netflix_final.show s ON sa.id_show = s.id " + "WHERE s.title = ? " + "ORDER BY a.name";

		stmt = con.prepareStatement(sql);
		stmt.setString(1, produccion);

		List<String> listado = new ArrayList<>();

		ResultSet resultado = stmt.executeQuery();

		while (resultado.next()) {
			listado.add(resultado.getString("name"));
		}

		return listado;

	}

	public void insertar1Actor(String nombre) throws SQLException {

		// Preparar inserts posibles (insertar en actor o director)

		String sqlActor = "INSERT INTO actor(name) VALUE(?)";

		// Mirar si es actor, director o los dos con atributos constantes.

		ejecutarInsert(sqlActor, nombre);

	}

	public void insertar1Director(String nombre) throws SQLException {

		// Preparar inserts posibles (insertar en actor o director)
		String sqlDirector = "INSERT INTO director(name) VALUE(?)";

		// Mirar si es actor, director o los dos con atributos constantes.

		ejecutarInsert(sqlDirector, nombre);

	}

	// Método auxiliar para mejorar insertar1Actor() e insertar1Director()

	private int ejecutarInsert(String sql, String nombre) throws SQLException {

		stmt = con.prepareStatement(sql);
		stmt.setString(1, nombre);

		return stmt.executeUpdate();

	}
}
