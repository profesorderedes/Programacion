package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Hoja1Ejer15 {
	public static void main(String[] args) {

		List<Double> temperaturas = new ArrayList<>();
		double suma = 0;

		temperaturas.add(15.0);
		temperaturas.add(16.1);
		temperaturas.add(16.0);
		temperaturas.add(15.4);
		temperaturas.add(15.0);
		temperaturas.add(14.0);
		temperaturas.add(10.2);
		temperaturas.add(11.0);
		temperaturas.add(11.5);
		temperaturas.add(10.0);
		temperaturas.add(10.1);
		temperaturas.add(9.8);
		temperaturas.add(9.0);
		temperaturas.add(6.0);

		for (double grados : temperaturas) {
			suma += grados;
		}

		double media = suma / temperaturas.size();

		System.out.println(media);
	}
}