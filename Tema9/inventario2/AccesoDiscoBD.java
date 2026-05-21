package inventario2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

				System.out.println("DEBUG leerInventario(): ADDING TO LIST - " + resultado.getString(1) + "/"
						+ resultado.getDouble(2));
			}

		} catch (SQLException e) {
			System.out.println("Error en la conexión al BD.");
			System.out.println(e.getMessage());
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

				System.out.println("DEBUG guardarInventario(): SAVING TO DATABASE - " + articulo.getNombre() + " / "
						+ articulo.getPrecio());

				stmt.executeUpdate();
			}

		} catch (SQLException e) {
			System.out.println("Error en la conexión al BD.");
			System.out.println(e.getMessage());
		}

	}

	private static void leerCredenciales() {

		File credentials = new File(System.getProperty("user.home") + "/credentialsInventario_sql");

		try (BufferedReader buffer = new BufferedReader(new FileReader(credentials))) {

			usuario = buffer.readLine();
			password = buffer.readLine();

		} catch (FileNotFoundException e) {
			System.out.println("Credenciales no encontrado.");

		} catch (IOException e) {
			System.out.println("Error leyendo credenciales.");
		}

	}

	public static void nuevoArticulo(Articulo articulo) {
		String sql = "INSERT INTO productos(nombre, precio) VALUES(?,?)";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, articulo.getNombre());
			stmt.setDouble(2, articulo.getPrecio());

			System.out.println("DEBUG nuevoArticulo(): SAVING TO DATABASE - " + articulo.getNombre() + " / "
					+ articulo.getPrecio());

			stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error en la conexión al BD.");
			System.out.println(e.getMessage());
		}
	}

	public static void borrarArticulo(Articulo articulo) {
		String sql = "DELETE FROM productos WHERE nombre = ? AND precio = ?";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			stmt.setString(1, articulo.getNombre());
			stmt.setDouble(2, articulo.getPrecio());

			System.out.println("DEBUG borrarArticulo(): DELETING FROM DATABASE - " + articulo.getNombre() + " / "
					+ articulo.getPrecio());

			stmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error en la conexión al BD.");
			System.out.println(e.getMessage());
		}
	}

	public static void clearArticulos() {
		String sql = "DELETE FROM productos";

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			System.out.println("DEBUG clearArticulos(): DELETING FROM DATABASE - EVERYTHING");

			int resultado = stmt.executeUpdate(sql);

			System.out.println("DEBUG clearArticulos(): TOTAL DELETED - " + resultado);

		} catch (SQLException e) {
			System.out.println("Error en la conexión al BD.");
			System.out.println(e.getMessage());
		}
	}

}

//@formatter:off


































//@formatter:on
