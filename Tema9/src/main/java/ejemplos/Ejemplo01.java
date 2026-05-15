package ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo01 {
	
	public static void main(String[] args) {
		
		// Credenciales de acceso a la base de datos.
		String usuario = "librero";
		String password = "Ageofempires2";
		String url = "jdbc:mysql://localhost/Libreria";
		
		
		try {
			// Creamos la conexión a la BD.
			Connection con = DriverManager.getConnection(url, usuario, password);
			
			// Creamos un objeto Statement que nos permitirá ejecutar consultas sql.
			Statement stmt = con.createStatement();
			
			// Consulta SQL que queremos ejecutar.
			String sql = "select * from libros";
			
			// Ejecutamos la consulta.
			ResultSet resultado =  stmt.executeQuery(sql);
			
			while(resultado.next()) {
				
				System.out.println("Título: " + resultado.getString("titulo"));
				// TODO Mostrar el resto de datos de cada libro
				
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
