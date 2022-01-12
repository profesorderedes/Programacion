package ejercicios2;

public class Actividad17_18 {
	
	public static void main(String[] args) {
		
		String notas[][] = {
				{"Jose Luis Martínez", "7"},
				{"Antonia Ruiz", "9"},
				{"Marcos Ramírez", "10"},
				{"Juana Herranz", "4"},
				{"Alberto López", "7"}
		};
		float total = 0;
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			for (int j = 0; j < notas[0].length; j++) {
				
				System.out.print(notas[i][j] + "\t");
				
			}
			System.out.println();
		}
		
		for (int fila = 1; fila < notas.length; fila++) {
			
			total = total + Float.parseFloat(notas[fila][1]);
			
			if (Float.parseFloat(notas[fila][1]) 
					< Float.parseFloat(notas[posMin][1])) {
				
				posMin = fila;
				
			} else if (Float.parseFloat(notas[fila][1]) 
					> Float.parseFloat(notas[posMax][1])) {
				
				posMax = fila;
				
			}

		}
		
		System.out.println("\nLa media es: " + total / notas.length);
		
		System.out.println("\nLa nota mas baja es de " 
				+ notas[posMin][0] + " con un " + notas[posMin][1]);
		System.out.println("\nLa nota mas alta es de " 
				+ notas[posMax][0] + " con un " + notas[posMax][1]);
		
	}

}