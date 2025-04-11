public class Main {

	public static void main(String[] args) {

		Contacto c1 = new Contacto("Sánchez Castejón", "Pedro", "555 10 20 30");
		Contacto c2 = new Contacto("Núñez Feijoo", "Alberto", "555 22 22 22");
		Contacto c3 = new Contacto("Díaz Pérez", "Yolanda", "555 89 10 10");
		Contacto c4 = new Contacto("García", "Mónica", "555 78 70 71");

		Agenda miAgenda = new Agenda(3);

		System.out.println("Mostrando el listado de contactos cuando no hay contactos:");
		miAgenda.listarContactos();

		System.out.println("\nAñadido contacto 1: " + miAgenda.anyadirContacto(c1));
		System.out.println("Añadido contacto 2: " + miAgenda.anyadirContacto(c2));
		System.out.println("Añadido contacto 3: " + miAgenda.anyadirContacto(c3));
		System.out.println("Añadido contacto 4: " + miAgenda.anyadirContacto(c4));

		System.out.println("\nListado de contactos:\n");
		miAgenda.listarContactos();

		System.out.println("\nEl contacto con id 2 está en la posición: " + miAgenda.buscarContacto(2));
		System.out.println("El contacto con id 50 está en la posición: " + miAgenda.buscarContacto(50));

	}

}
