
public class Ejemplo14 {
	
	public static void main(String[] args) {
		
		String[][] descuentos = {
				{"Libreta", 		"10"},
				{"Bolígrafo", 		"0"},
				{"Periódico", 		"15"},
				{"Cartulina A3", 	"5"}
		};
		
		// Mínimo y máximo descuento en el array.
		
		// Empezamos suponiendo que el descuento mínimo está en la
		// posición 0.
		int posMin = 0;
		
		// Recorremos cada fila.
		for(int fila = 0; fila < descuentos.length; fila++) {
			
			// Si en la fila actual hay un descuento menor que
			// el de la posMin, actualizamos posMin.
			if(Integer.parseInt(descuentos[fila][1]) 
					< Integer.parseInt(descuentos[posMin][1])) {
				posMin = fila;
			}
			
		}
		
		System.out.println("Descuento menor: " + descuentos[posMin][1] + ", en el producto " + descuentos[posMin][0] + ".");
		
	}

}




