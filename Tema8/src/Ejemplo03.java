import java.util.ArrayList;
import java.util.List;

public class Ejemplo03 {
	
	public static void main(String[] args) {
		
		List<Libro> libros = new ArrayList<>();
		
		libros.add(new Libro("Las recetas de Arguiñano",
				"Karlos Arguiñano"));
		libros.add(new Libro("El señor de los anillos",
				"J.R.R. Tolkien"));
		libros.add(new Libro("Harry Potter y la piedra filosofal",
				"J.K. Rowling"));
		libros.add(new Libro("El lazarillo de Tormes",
				"Anónimo"));
		
		// Queremos borrar el libro de Arguiñano.
		Libro libroKarlos = new Libro("Las recetas de Arguiñano",
				"Karlos Arguiñano");
		libros.remove(libroKarlos);
		
		// Vemos si se ha borrado.
		for(Libro libro : libros) {
			System.out.println(libro.getTitulo());
		}
		
		
	}

}
