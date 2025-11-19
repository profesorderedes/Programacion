package ejemplos;

public class Ejemplo12ConvertirANumero {

	
	public static void main(String[] args) {
		
		String[][] cuentas = {
				{"Rodríguez Pérez, Ana"			, "15000"},
				{"Mas López, Luisa"				, "22000"},
				{"Martínez Gallardo, Roberto"	, "18000"},
				{"Ramírez Hernández, Manuel"	, "30000"}
		};
		
		// CÁLCULO DE LA SUMA DE LOS SALDOS DE LOS CLIENTES.
		
		int total = 0;
		
		for (int fila = 0; fila < cuentas.length; fila++) {
			
			// Sumamos a total la columna 1 de la fila "fila".
			total = total + Integer.parseInt(cuentas[fila][1]);
			
		}
		
		System.out.println("Total acumulado: " + total + "€.");
		System.out.println("Saldo medio: " + total/cuentas.length + "€.");
		
		
	}
}
