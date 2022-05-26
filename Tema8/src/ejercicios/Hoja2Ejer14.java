package ejercicios;

import java.util.*;

public class Hoja2Ejer14 {
	public static void main(String[] args) {
		
		List<Articulo> articulos = new ArrayList<>();

		articulos.add(new Articulo("Tablet Samsung", 120));
		articulos.add(new Articulo("Móvil Sony", 115));
		articulos.add(new Articulo("iPad Mini", 290));
		articulos.add(new Articulo("Móvil HTC", 95));

		double total = 0;
		
		System.out.println("Articulos");
		System.out.println("=====================");
		
		for (Articulo articulo : articulos) {
			System.out.println(articulo.getNombreProducto() 
					+ " | " + articulo.getPrecioProducto());
			total = total + articulo.getPrecioProducto();
		}
		
		System.out.println("Precio total: " + total + "€");
		
	}
}