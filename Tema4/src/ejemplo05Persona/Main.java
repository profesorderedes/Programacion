package ejemplo05Persona;

public class Main {

	public static void main(String[] args) {

		// Creamos un objeto Persona:
		Persona perso1 = new Persona("Óliver", "Isern", 21, "12000200T");

		// Llamamos al método mostrar() de perso2:
		perso1.mostrar();

		// Creamos otro objeto Persona usando el constructor implícito.
		Persona perso2 = new Persona();

		perso2.mostrar();

		Persona perso3 = new Persona("Rafa", "Crespí");
		perso3.mostrar();

	}

}
