package inventario2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AccesoDiscoBD {

	private static String usuario;
	private static String password;
	private static String url = "jdbc:mysql://localhost/inventario";

	public static List<Articulo> leerInventario() {

		leerCredenciales();

		List<Articulo> articulos = new ArrayList<>();

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			String sql = "SELECT nombre, precio FROM productos";

			ResultSet resultado = stmt.executeQuery(sql);

			while (resultado.next()) {

				Articulo articulo = new Articulo(resultado.getString(1), resultado.getDouble(2));

				articulos.add(articulo);

			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(), "Inventario",
					JOptionPane.ERROR_MESSAGE);
			return null;
		}

		return articulos;

	}

	// Este no sirve en verdad. Se haría todo mediante operaciones CRUD en cada paso
	// en vez de al final.
	public static void guardarInventario(List<Articulo> articulos) {

		String sql = "INSERT INTO productos(nombre, precio) VALUES(?,?)";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			for (Articulo articulo : articulos) {
				stmt.setString(1, articulo.getNombre());
				stmt.setDouble(2, articulo.getPrecio());

				stmt.executeUpdate();
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(), "Inventario",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private static void leerCredenciales() {

		File credentials = new File(System.getProperty("user.home") + "/credentialsInventario_sql");

		try (BufferedReader buffer = new BufferedReader(new FileReader(credentials))) {

			usuario = buffer.readLine();
			password = buffer.readLine();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Credenciales no encontradas.", "Inventario",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error leyendo credenciales.", "Inventario", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

	}

	public static void nuevoArticulo(Articulo articulo) {
		String sql = "INSERT INTO productos(nombre, precio) VALUES(?,?)";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, articulo.getNombre());
			stmt.setDouble(2, articulo.getPrecio());

			stmt.executeUpdate();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(), "Inventario",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void borrarArticulo(Articulo articulo) {
		String sql = "DELETE FROM productos WHERE nombre = ? AND precio = ?";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, articulo.getNombre());
			stmt.setDouble(2, articulo.getPrecio());

			stmt.executeUpdate();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(), "Inventario",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void clearArticulos() {
		String sql = "DELETE FROM productos";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			int resultado = stmt.executeUpdate(sql);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la conexión a la BD.\n" + e.getMessage(), "Inventario",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}