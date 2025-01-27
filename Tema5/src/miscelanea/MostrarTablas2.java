package miscelanea;

public class MostrarTablas2 {
	
	public static void main(String[] args) {
		
		String[][] empleados = {
				{"Manuel","Pérez","950"},
				{"Marta","López","1900"},
				{"Javier","Sánchez","1600"},
				{"Nuria","Martínez","1650"},
				{"Lucía","Fernández","1700"}
		};
		
		System.out.println("Empleados de la empresa");
		System.out.println("==================================");
		
		System.out.printf("", "NOMBRE", "APELLIDOS", "SUELDO");
		for (int fila = 0; fila < empleados.length; fila++) {
			System.out.printf("%-8s %-11s %4s\n", empleados[fila][0], 
					empleados[fila][1], 
					empleados[fila][2]);
		}
		
	}

}
