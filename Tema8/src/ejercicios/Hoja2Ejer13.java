package ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hoja2Ejer13 {

	public static void main(String[] args) {

		List<Medida> medidas = new ArrayList<>();

		medidas.add(new Medida(8.5, 1020, 40));
		medidas.add(new Medida(14.2, 1021, 35));
		medidas.add(new Medida(11, 1022, 45));
		medidas.add(new Medida(7, 1023, 50));

		mostrar(medidas);

		// Ordenamos el ArrayList por temperaturas.
		medidas.sort(new Comparator<Medida>() {

			@Override
			public int compare(Medida m1, Medida m2) {

				if (m1.getTemperatura() < m2.getTemperatura()) {
					return -1;
				} else if (m1.getTemperatura() == m2.getTemperatura()) {
					return 0;
				} else {
					return 1;
				}

			}

		});
		
		mostrar(medidas);
		
		// Ordenamos el ArrayList por humedades.
		medidas.sort(new Comparator<Medida>() {

			@Override
			public int compare(Medida m1, Medida m2) {
				
				if(m1.getHumedad() < m2.getHumedad()) {
					return -1;
				}else if(m1.getHumedad() == m2.getHumedad()) {
					return 0;
				}else {
					return 1;
				}
				
			}
			
		});
		
		mostrar(medidas);

	}

	private static void mostrar(List<Medida> medidas) {

		System.out.println("\nRegistros meteorológicos");
		System.out.println("========================");

		for (Medida medida : medidas) {
			System.out.println(medida.getTemperatura() + "\t" 
					+ medida.getPresion() + "\t" 
					+ medida.getHumedad());
		}

	}

}
