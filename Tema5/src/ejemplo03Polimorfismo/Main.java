package ejemplo03Polimorfismo;

public class Main {

	public static void main(String[] args) {

		// Polimorfismo: a una variable de tipo Persona le podemos asignar
		// un Cliente, un Proveedor o un Empleado, porque son subtipos de persona.
		Persona per1 = new Cliente("Mario", "Domínguez", "10200200R", "1902-1000-2000-3000");

		Persona per2 = new Empleado("Ana", "Sánchez", "40100200E", "07-18281928-31");

		Persona per3 = new Proveedor("Luisa", "Martínez", "19200120A", "07180");

		// Observaciones de polimorfismo

		// Podemos ejecutar sobre per1 cualquier método que esté presente en Persona.
		// Además, el método que se ejecutará será el de Cliente, en este caso.
		per1.mostrar();

		per2.mostrar();

		per3.mostrar();

		// No podemos ejecutar un método, aunque exista en el objeto,
		// si no está también en la clase padre (Persona).
//		per1.cobrar();

		// Una manera de saltarnos esta restricción es hacer un cast de la variable.
		((Cliente) per1).cobrar();

		System.out.println(per1.toString());

	}

}
