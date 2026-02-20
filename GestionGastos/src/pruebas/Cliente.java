package pruebas;

public class Cliente {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Cliente(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	// Devuelve una cadena mostrando apellidos nombre edad
	// Usando 20 15 2 caracteres respectivamente.
	@Override
	public String toString() {
		return String.format("%-20s %-15s %2s", apellidos, nombre, edad);
	}
	
	

}
