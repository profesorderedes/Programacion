package ejemplo06Persona;

public class Main {

	public static void main(String[] args) {

		// El polimorfismo de Java nos permite crear una 
		// variable de tipo Persona y guardar dentro objetos 
		// de clases hijas.
		Persona persona1;

		persona1 = new Cliente("10299122J", "Carlos", "Pérez", "2910-1291-1215-5334");

		// Al llamar a un método que existe en las dos clases
		// (Persona y Cliente), se ejecutará el de la clase
		// hija (Cliente).
		persona1.mostrar();

		// Lo mismo sucede con Empleado.
		Persona persona2 = new Empleado("10011010Y", "María", "López", "2635eas");

		persona2.mostrar();

	}

}
