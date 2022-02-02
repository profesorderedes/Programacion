package ejemplo01;

public class Main {
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		
		persona1.apellidos = "López Rodríguez";
		persona1.nombre = "Manuel";
		persona1.edad = 30;
		
		System.out.println("\nDatos de la persona");
		System.out.println("=====================");
		
		System.out.println("Apellidos: " + persona1.apellidos);
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Edad: " + persona1.edad);
		
		
	}
	
}
