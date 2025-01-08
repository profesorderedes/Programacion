package ejemplos;

public class Ejemplo02 {

	public static void main(String[] args) {

		System.out.println("Vamos a llamar al método saludar:");
		saludar("Lucas");
		saludar("José Luis");
		System.out.println("¿Qué te parece?");

		despedir("Óscar");

	}

	static void saludar(String nombre) {

		System.out.println("Buenas tardes, ¿cómo estás, " + nombre + "?");

	}

	static void despedir(String nombre) {

		System.out.println("Hasta mañana, " + nombre + ".");

	}
	
	// Deberes: métodos felicitar(nombre), mostrarEdad(edad), 
	// mostrarApellidos(apellidos), mostrarPrecio(precio),
	// rebajarPrecio(precio) -> Muestra el precio rebajado un 15%.
	
}






