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
		lista.remove(2);
		mostrar(lista);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private static void mostrar(List<String> lista) {
		System.out.println("\nLista completa:");
		for (String heroe : lista) {
			System.out.println(heroe);
		}
	}

}
