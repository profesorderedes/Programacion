import java.util.ArrayList;
import java.util.Iterator;

/*
 * Marcas de coches.
 */
public class Ejemplo02 {
	
	public static void main(String[] args) {
		
		// Lista de marcas de coches
		ArrayList<String> marcas = new ArrayList<>();
		
		// Añadimos elementos
		marcas.add("Seat");
		marcas.add("Nissan");
		marcas.add("Honda");
		marcas.add("Toyota");
		marcas.add("Mazda");
		
		// Recorremos toda la lista mostrando sus elementos
		for(String marca : marcas) {
			System.out.println(marca);
		}
		
		System.out.println();
		for(int i = 0; i < marcas.size(); i++) {
			System.out.println(marcas.get(i));
		}
	}

}





