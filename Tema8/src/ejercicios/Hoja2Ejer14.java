package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Hoja2Ejer14 {

	public static void main(String[] args) {

		List<Articulo> productos = new ArrayList<>();
		double precioTotal = 0;

		productos.add(new Articulo("Tablet Samsung", 120));
		productos.add(new Articulo("Móvil Sony", 115));
		productos.add(new Articulo("Ipad Mini", 290));
		productos.add(new Articulo("Móvil HTC", 95));

		mostrarArticulos(productos);
		
		for(Articulo producto: productos) {
			precioTotal += producto.getPrecio();
		}

		System.out.println("\nTotal: " + precioTotal + " €");

		// ¿Cuantos artículos hay guardados?

		System.out.println("\nHay " + productos.size() 
			+ " productos en la lista.");

		// Borrar el artículo en la posición 2.

		productos.remove(2);

		mostrarArticulos(productos);
		
		// Borrar el artículo "Tablet Samsung".
		Articulo articulo = new Articulo("Tablet Samsung", 120);
		productos.remove(articulo);
		
		mostrarArticulos(productos);
		
		// ¿En qué posición aparece el móvil HTC de 95 €?
		
		// ¿El móvil Sony de 115 euros aparece en la lista?
		
		

	}

	// Método mostrar el contenido del arrayList
	private static void mostrarArticulos(
			List<Articulo> productos) {

		System.out.println("\nArtículos\n=====================");

		for (Articulo producto : productos) {

			System.out.println(producto.getNombre() 
					+ "\t" + producto.getPrecio());

		}

	}

}
