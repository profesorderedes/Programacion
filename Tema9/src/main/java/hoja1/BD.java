package hoja1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

	private static String usuario = "root";
	private static String password = "Ageofempires2";
	private static String url = "jdbc:mysql://localhost";

	public static void main(String[] args) {

		crear();

	}

	public static void crear() {

		try (Connection con = DriverManager.getConnection(url, usuario, password);
				Statement stmt = con.createStatement();
				BufferedReader buffer = new BufferedReader(new FileReader("scriptBaseDatos.sql"))) {

			String linea = buffer.readLine();

			while (linea != null) {

				stmt.execute(linea);

				linea = buffer.readLine();

			}

			System.out.println("Script ejecutado correctamente.");

		} catch (SQLException e) {
			System.out.println("Error en la conexión a la base de datos.");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e1) {
			System.out.println("Error de I/O con el archivo sql.");
		}

	}

}


