package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

		// Declarar una variable de tipo Persona.
		Persona perso1;

		// Inicializar la variable anterior.
		perso1 = new Persona();

		// Asignar valores a los atributos de perso1.
		perso1.nombre = "Miguel";
		perso1.apellidos = "Ovalle";
		perso1.edad = 27;
		perso1.dni = "27800100Y";

		// Creamos otro objeto Persona:
		Persona perso2 = new Persona();

		// Asignar valores a los atributos de perso2.
		perso2.nombre = "Óliver";
		perso2.apellidos = "Isern";
		perso2.edad = 21;
		perso2.dni = "12000200T";

		// Mostramos el nombre y apellidos de la primera persona:
		System.out.println(perso1.nombre + " " + perso1.apellidos);

		// Mostramos nombre y edad de la segunda persona:
		System.out.println(perso2.nombre + " con " + perso2.edad + " años.");

		// Llamamos al método mostrar() de perso1:
		perso1.mostrar();

		// Llamamos al método mostrar() de perso2:
		perso2.mostrar();

	}

}
