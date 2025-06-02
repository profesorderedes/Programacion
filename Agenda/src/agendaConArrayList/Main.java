package agendaConArrayList;

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

		System.out.println(
				"\n****************************************************************************************************************");

		// Pruebas de getContacto().

		Contacto contacto = miAgenda.getContacto(2);
		System.out.println("\nEl contacto en la posición 2 tiene estos datos: " + contacto.toString());

		contacto = miAgenda.getContacto(50);
		System.out.println("\nEl contacto en la posición 50 tiene estos datos: " + contacto);

		// Pruebas de setContacto().

		Contacto contactoNuevo = new Contacto("Pérez Fraile", "Marcos", "555 11 22 77");
		contactoNuevo.setId(10);

		miAgenda.setContacto(2, contactoNuevo);
		System.out.println("\nListado de contactos, tras cambiar el contacto en la posición 2:\n");
		miAgenda.listarContactos();

		System.out.println("\nListado de contactos, tras intentar cambiar un contacto en posiciones no válidas:\n");
		miAgenda.setContacto(50, contactoNuevo);
		miAgenda.setContacto(-1, contactoNuevo);

		miAgenda.listarContactos();

		// Pruebas de eliminarContacto().

		System.out.println("\nListado de contactos, tras eliminar el contacto con id 2:\n");
		System.out.println(miAgenda.eliminarContacto(2));
		miAgenda.listarContactos();

		System.out.println("\nListado de contactos, tras eliminar un contacto inexistente:\n");
		System.out.println(miAgenda.eliminarContacto(20));
		miAgenda.listarContactos();

	}

}
