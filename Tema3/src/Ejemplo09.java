
/*
 * Cómo tabular datos correctamente
 */
public class Ejemplo09 {

	public static void main(String[] args) {

		String nombre = "Carlos";
		String apellidos = "Sánchez";
		int edad = 20;

		System.out.println(nombre + " " + apellidos 
				+ " tiene " + edad + " años.");

		System.out.printf("%-10s %-15s tiene %5d años.", 
				nombre, apellidos, edad);
		

	}
}
