import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {

	public static void main(String[] args) {

		// ArrayList<String> lista = new ArrayList<>();
		List<String> lista = new ArrayList<>();

		// Añadimos datos al ArrayList.
		lista.add("Ironman");
		lista.add("Spiderman");
		lista.add("Hulk");
		lista.add("Thor");
		lista.add("Wanda");
		lista.add("Dr. Strange");

		// Vemos los datos guardados en el ArrayList.
		System.out.println(lista.get(0));
		System.out.println(lista.get(2));
		System.out.println(lista.get(4));

		// Vemos todos los datos guardados en el ArrayList.
		System.out.println("\nLista completa:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Vemos todos los datos guardados en el ArrayList,
		// usando el for mejorado (forEach).
		System.out.println("\nLista completa:");
		for (String heroe : lista) {
			System.out.println(heroe);
		}
		
		// Añadimos superhéroes en posiciones concretas.
		lista.add(0, "Lobezno");
		mostrar(lista);
		
		lista.add(2, "Aquaman");
		mostrar(lista);
		
		// Borramos superhéroes a partir de su posición.
		String borrado = lista.remove(2);
		System.out.println("\nBorrado a " + borrado);
		
		mostrar(lista);
		
		// Borramos superhéroes a partir del nombre.
		boolean thorBorrado = lista.remove("Thor");
		System.out.println("\n¿Thor borrado? " + thorBorrado);
		
		mostrar(lista);
		
		// Sustituimos un superhéroe por otro en la lista.
		borrado = lista.set(3, "Antman");
		System.out.println("\nBorrado " + borrado);
		
		mostrar(lista);
		
		// Vemos si Antman está en la lista.
		boolean contiene = lista.contains("Antman");
		System.out.println("\n¿Antman está dentro de la "
				+ "lista? " + contiene);
		
		// Miramos dónde aparece Ironman en primer lugar 
		// y en últim lugar.
		lista.add("Ironman");
		System.out.println("\nIronman aparece por primera vez"
				+ " en la posición " 
				+ lista.indexOf("Ironman"));
		System.out.println("\nIronman aparece por última vez"
				+ " en la posición " 
				+ lista.lastIndexOf("Ironman"));
		
		mostrar(lista);
		
		// Miramos si la lista está vacía.
		System.out.println("\n¿Lista vacía? " 
				+ lista.isEmpty());
		
		// Miramos cuántos elementos hay en la lista.
		System.out.println("\nHay " + lista.size() 
		        + " superhéroes guardados.");
		
		// Borramos la lista.
		System.out.println("\nBorrando la lista");
		lista.clear();
		mostrar(lista);
		
		
	}
	
	private static void mostrar(List<String> lista) {
		System.out.println("\nLista completa:");
		for (String heroe : lista) {
			System.out.println(heroe);
		}
	}

}
