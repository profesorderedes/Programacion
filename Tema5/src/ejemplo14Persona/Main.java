package ejemplo14Persona;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Rubén", "López Martín", 30);

		persona1.mostrar();

		// Queremos modificar el nombre.
		System.out.println("\nNombre original: " 
				+ persona1.getNombre());

		persona1.setNombre("Raúl");
		System.out.println("\nNombre nuevo: " 
				+ persona1.getNombre());

		// Modificamos los apellidos.
		System.out.println("\nApellidos originales: " 
				+ persona1.getApellidos());
		persona1.setApellidos("López Martínez");
		System.out.println("\nApellidos nuevos: " 
				+ persona1.getApellidos());

		// Modificamos la edad.
		System.out.println("\nEdad original: " 
				+ persona1.getEdad());
		persona1.setEdad(31);
		System.out.println("\nEdad nueva: " 
				+ persona1.getEdad());

	}

}









