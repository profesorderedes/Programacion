package ejemplo10Persona;

public class Main {

	public static void main(String[] args) {

		// Creamos un objeto Persona:
		Persona perso1 = new Persona("Óliver", "Isern", 21, "12000200T");

		// Llamamos al método mostrar() de perso2:
		perso1.mostrar();

		// Queremos saber el nombre de perso1.
		System.out.println(perso1.getNombre());

		// Quiero modificar el nombre.
		perso1.setNombre("Óliver Jesús");

		System.out.println(perso1.getNombre());

		System.out.println("La edad de " + perso1.getNombre() + " es " + perso1.getEdad() + " años.");

	}

}
