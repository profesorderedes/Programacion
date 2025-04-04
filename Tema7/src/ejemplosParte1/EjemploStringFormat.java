package ejemplosParte1;

// Ejemplo de cómo conseguir que un método devuelva una cadena formateada
// al estilo de cuando mostramos datos con printf().
public class EjemploStringFormat {

	public static void main(String[] args) {

		System.out.println(aString());

	}

	// Devuelve una cadena con los cuatro datos (id, apellidos, etc) formateados
	// como antes (4 caracteres para el id, 20 caracteres para los apellidos,
	// etc.).
	public static String aString() {

		int id = 1; // 4 caracteres
		String apellidos = "Martínez Pérez"; // 20 caracteres
		String nombre = "Raúl"; // 15 caracteres
		String tel = "555 19 19 19"; // 14 caracteres

		String linea = String.format("%-4s %-20s %-15s %-14s", id, apellidos, nombre, tel);
		// System.out.printf("%-4s %-20s %-15s %-14s", id, apellidos, nombre, tel);
		return linea;
	}

}
