package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Hoja2Ejer13 {

	public static void main(String[] args) {

		List<Medida> medidas = new ArrayList<>();

		medidas.add(new Medida(8.5, 1020, 40));
		medidas.add(new Medida(14.2, 1021, 35));
		medidas.add(new Medida(11, 1022, 45));
		medidas.add(new Medida(7, 1023, 50));
		
		System.out.println("Registros meteorológicos");
		System.out.println("========================");
		
		for(Medida medida : medidas) {
			System.out.println(medida.getTemperatura() 
					+ "\t" + medida.getPresion()
					+ "\t" + medida.getTemperatura());
			
		}

	}

}







