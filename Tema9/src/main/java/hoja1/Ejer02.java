package hoja1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejer02 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/inversiones";
		String usuario = "java";
		String password = "Ageofempires2";

		addEmpresas(url, usuario, password);
		addAcciones(url, usuario, password);

//		listarEmpresas(url, usuario, password);
		informe(url, usuario, password);

	}

	private static void addEmpresas(String url, String usuario, String password) {

		String[][] empresas = { { "1", "Navantia", "2005" }, { "2", "Red Eléctrica Española", "1985" },
				{ "3", "Indra", "1992" } };

		String sql = "INSERT INTO empresas(nombre, fundacion) VALUES(?,?)";

		System.out.println("Insertando registros en la tabla Empresas...");

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			for (int i = 0; i < empresas.length; i++) {

				stmt.setString(1, empresas[i][1]);
				stmt.setString(2, empresas[i][2]);

				int resultado = stmt.executeUpdate();

				System.out.println(resultado + " registro(s) modificado(s).");
			}

		} catch (SQLException e) {
			System.out.println("Error en la base de datos.");
		}

	}

	private static void addAcciones(String url, String usuario, String password) {

		String[][] acciones = { { "1", "Carlos Pérez", "1", "100" }, { "2", "Lucía Martínez", "1", "55" },
				{ "3", "José López", "2", "70" }, { "4", "Marcos Jímenez", "3", "125" } };

		String sql = "INSERT INTO acciones(propietario, id_empresa, cantidad) VALUES(?,?,?)";

		System.out.println("Insertando registros en la tabla Acciones...");

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				PreparedStatement stmt = con.prepareStatement(sql)) {

			for (int i = 0; i < acciones.length; i++) {

				stmt.setString(1, acciones[i][1]);
				stmt.setInt(2, Integer.parseInt(acciones[i][2]));
				stmt.setInt(3, Integer.parseInt(acciones[i][3]));

				int resultado = stmt.executeUpdate();

				System.out.println(resultado + " registro(s) modificado(s).");
			}

		} catch (SQLException e) {
			System.out.println("Error en la base de datos.");
		}
	}

	private static void listarEmpresas(String url, String usuario, String password) {

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			String sql = "SELECT * FROM empresas";

			System.out.println("\nTabla Empresas");
			System.out.println("---------------------------------------------------------");
			System.out.printf("%-4s %-30s %-10s\n", "ID", "NOMBRE", "FUNDACIÓN");
			System.out.printf("%-4s %-30s %-10s\n", "==", "======", "=========");

			ResultSet resultado = stmt.executeQuery(sql);

			while (resultado.next()) {

				// Como ejemplo, en lugar de indicar el nombre de la columna en los métodos
				// get...,
				// podemos indicar la posición de la misma.
				System.out.printf("%-4d %-30s %-10s\n", resultado.getInt(1), resultado.getString(2),
						resultado.getString(3));

			}

		} catch (SQLException e) {
			System.out.println("Error en la base de datos.");
		}

	}

	private static void informe(String url, String usuario, String password) {

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement()) {

			String sql = "SELECT a.propietario, e.nombre, a.cantidad FROM acciones a JOIN empresas e ON e.id = a.id_empresa ORDER BY a.propietario";

			System.out.println("\nInforme de acciones");
			System.out.println("---------------------------------------------------------");
			System.out.printf("%-20s %-30s %-4s\n", "PROPIETARIO", "NOMBRE", "CANT");
			System.out.printf("%-20s %-30s %-4s\n", "===========", "======", "====");

			ResultSet resultado = stmt.executeQuery(sql);

			while (resultado.next()) {

				System.out.printf("%-20s %-30s %-4d\n", resultado.getString("propietario"),
						resultado.getString("nombre"), resultado.getInt("cantidad"));

			}

		} catch (SQLException e) {

			System.out.println("Error en la base de datos.");

		}

	}
}