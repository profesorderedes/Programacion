package ejercicios2;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
		
		// 4 empleados y 3 datos para cada empleado
		String nominas[][] = new String[4][3];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int fila = 0; fila < nominas.length; fila++) {
			
			System.out.println("\nEmpleado nº " + fila);
			System.out.println("------------------------");
			
			System.out.print("Nombre: ");
			nominas[fila][0]= entrada.nextLine();
			
			System.out.print("Apellidos: ");
			nominas[fila][1]= entrada.nextLine();
			
			System.out.print("Sueldo: ");
			nominas[fila][2]= entrada.nextLine();
			
		}
		
		
	}
	
}
