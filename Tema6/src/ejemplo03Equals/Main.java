package ejemplo03Equals;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Martínez", "Jorge", "12000000F");

		// En esta llamada a equals, el parámetro obj es p1, y this es también p1.
		System.out.println(p1.equals(p1));

		// Si comparo p1, que es un objeto inicializado con null, debe darme false.
		System.out.println(p1.equals(null));

		Persona p2 = new Persona("López", "Pedro", "12000000F");

		System.out.println(p1.equals(p2));

	}

}
