package ejercicios;

public class Ejer11 {
	
	public static void main(String[] args) {
		
		String[] planetas = { "Mercurio", "Venus", "Tierra", 
				"Marte", "Júpiter", "Saturno", "Urano", 
				"Neptuno","Plutón" };

		int pos = buscar(planetas, "Venus");
		if(pos != -1) {
			System.out.println("El planeta está en la "
					+ "posición " + pos);
		}else {
			System.out.println("La palabra no se encuentra "
					+ "en el array.");
		}
		
	}

	static int buscar(String array[], String planeta) {

		for (int i = 0; i < array.length; i++) {

			if (array[i].equals(planeta)) {
				return i;
			}

		}
		
		return -1;
		
	}

}