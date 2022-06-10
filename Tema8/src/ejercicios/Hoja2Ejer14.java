package ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
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

		for (Articulo producto : productos) {
			precioTotal += producto.getPrecio();
		}

		System.out.println("\nTotal: " + precioTotal + " €");

		// ¿Cuantos artículos hay guardados?

		System.out.println("\nHay " + productos.size() + " productos en la lista.");

		// Borrar el artículo en la posición 2.

		productos.remove(2);

		mostrarArticulos(productos);

		// Borrar el artículo "Tablet Samsung".
		Articulo articulo = new Articulo("Tablet Samsung", 120);
		productos.remove(articulo);

		mostrarArticulos(productos);

		// ¿En qué posición aparece el móvil HTC de 95 €?

		articulo = new Articulo("Móvil HTC", 95);

		System.out.println(
				"\nEl móvil HTC aparece por primera" + " vez en la posición " + productos.indexOf(articulo) + ".");

		// ¿El móvil Sony de 115 euros aparece en la lista?

		articulo = new Articulo("Móvil Sony", 115);

		System.out.println("\n¿Aparece el móvil Sony en la lista? " + productos.contains(articulo));

		// Añadimos el producto "Móvil Samsung" de 200 € en la
		// posición 1 del ArrayList.

		productos.add(1, new Articulo("Móvil Samsung", 200));

		mostrarArticulos(productos);

		// Borramos la lista completa.
		// productos.clear();

		mostrarArticulos(productos);

		// Ordenamos el ArrayList por precio.

		productos.sort(new Comparator<Articulo>() {

			@Override
			public int compare(Articulo a1, Articulo a2) {
				if (a1.getPrecio() < a2.getPrecio()) {
					return -1;
				} else if (a1.getPrecio() == a2.getPrecio()) {
					return 0;
				} else {
					return 1;
				}
			}

		});

		mostrarArticulos(productos);

		// Ordenamos el ArrayList por nombre del artículo.

		productos.sort(new Comparator<Articulo>() {

			@Override
			public int compare(Articulo a1, Articulo a2) {

				if (a1.getNombre().compareTo(a2.getNombre()) < 0) {
					return -1;
				} else if (a1.getNombre().equals(a2.getNombre())) {
					return 0;
				} else {
					return 1;
				}

			}

		});

		mostrarArticulos(productos);

	}

	// Método mostrar el contenido del arrayList
	private static void mostrarArticulos(List<Articulo> productos) {

		System.out.println("\nArtículos\n=====================");

		for (Articulo producto : productos) {

			System.out.println(producto.getNombre() + "\t" + producto.getPrecio());

		}

	}

}
