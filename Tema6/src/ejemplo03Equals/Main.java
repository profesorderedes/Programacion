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
		
		Vehiculo v1 = new Vehiculo("1992CDF", "Volkswagen", "Golf");
		Vehiculo v2 = new Vehiculo("1992CDF", "Volkswagen", "Golf");
		Vehiculo v3 = new Vehiculo("3142ASD", "Audi", "A3");
		
		System.out.println(v1.equals(v3));

	}

}




