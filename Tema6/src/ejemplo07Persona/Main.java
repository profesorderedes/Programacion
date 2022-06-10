package ejemplo07Persona;

public class Main {

	public static void main(String[] args) {

		// En ocasiones es útil sobreescribir el método equals()
		// de una clase para ajustarlo a lo que nosotros
		// entendamos como que dos objetos son iguales.

		Cliente cliente1 = new Cliente("12000220T", "Juana", "Sánchez", "1902-1111-2222-3333");

		Cliente cliente2 = new Cliente("12000220T", "Juana", "Sánchez", "1902-1111-2222-3333");

		if (cliente1.equals(cliente2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}

	}

}
