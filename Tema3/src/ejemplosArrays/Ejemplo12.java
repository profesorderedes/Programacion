package ejemplosArrays;

public class Ejemplo12 {
	public static void main(String[] args) {
		
		// Tabla con temperaturas y presiones.
		double[][] clima = {
				{15, 1020},
				{14, 1020},
				{12, 1022},
				{11.5, 1023},
				{11, 1025}
		};
		
		System.out.println("Datos climáticos");
		System.out.println("===============================");
		
		for(int fila = 0; fila < clima.length; fila++) {
			
			for(int col = 0; col < clima[0].length; col++) {
				System.out.print(clima[fila][col] + "\t");
			}
			System.out.println();
			
		}
		
	}
}
