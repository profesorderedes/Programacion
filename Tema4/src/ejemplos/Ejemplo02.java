package ejemplos;

public class Ejemplo02 {

	public static void main(String[] args) {

		System.out.println("Vamos a llamar al método saludar:");
		saludar("Lucas");
		saludar("José Luis");
		System.out.println("¿Qué te parece?");

		despedir("Óscar");
		
		felicitar("David");
		
		mostrarEdad(40);
		
		mostrarPrecio(30.15);
		
		rebajarPrecio(30);

	}

	static void saludar(String nombre) {

		System.out.println("Buenas tardes, ¿cómo estás, " + nombre + "?");

	}

	static void despedir(String nombre) {

		System.out.println("Hasta mañana, " + nombre + ".");

	}
	
	static void felicitar(String nombre) {
		
		System.out.println("¡Felicidades, " + nombre + ", disfruta mucho!");
		
	}
	
	static void mostrarEdad(int edad) {
		
		System.out.println("Tienes " + edad + " años.");
		
	}
	
	static void mostrarPrecio(double precio) {
		
		System.out.println("El precio de la compra ha sido " + precio + " euros.");
		
	}
	
	static void rebajarPrecio (double precio) {
		
		double rebaja = precio * 15 /100;
		double precioRebajado = precio - rebaja;
		
		System.out.println("El precio de la compra ha sido " + precio + " euros. Y, rebajado, " + precioRebajado + " euros.");
		
	}
	
	// rebajarPrecio(precio) -> Muestra el precio rebajado un 15%.
	
}






