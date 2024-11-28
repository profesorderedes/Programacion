
public class Ejemplo10 {

	public static void main(String[] args) {
		
		// String[][] salarios = new String[4][3];
		
		String[][] salarios = {
				{"Sánchez", "María", "1800"},
				{"Rodríguez", "Juan", "1700"},
				{"Pérez", "Nuria", "1750"},
				{"López", "Luis", "1800"}
			};
		
		System.out.println("Sueldo de María: " + salarios[0][2]);
		System.out.println("Apellido de María: " + salarios[0][0]);
		System.out.println("Sueldo de Nuria: " + salarios[2][2]);
		
		salarios[0][2] = "1850";
		System.out.println("\nSueldo de María: " + salarios[0][2]);
		
		System.out.println("\nDatos de la primera fila:");
		for(int col = 0; col < 3; col++) {
			System.out.print(salarios[0][col] + "\t");
		}
		
		System.out.println("\nDatos de la tercera fila:");
		for(int col = 0; col < 3; col++) {
			System.out.print(salarios[2][col] + "\t");
		}
		
		System.out.println("\nDatos de la primera columna:");
		for(int fila = 0; fila < 4; fila++) {
			System.out.println(salarios[fila][0]);
		}
		
	}
}









