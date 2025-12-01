package hoja3;

import java.util.Scanner;

public class Ejer07b {

	public static void main(String[] args) {

		/*
		 * En una pizzería quieren un programa para anotar el tiempo que tardan en hacer
		 * cada reparto de comida a domicilio.
		 *
		 * Escribe una aplicación que cree un array de 15 elementos y vaya leyendo de
		 * consola los tiempos de entrega (en minutos) que han tenido los últimos 15
		 * pedidos.
		 * 
		 * A continuación, recorrerá el array y contará cuántos de los pedidos han
		 * superado los 30 minutos.
		 *
		 * Este dato es importante porque la empresa no cobra la pizza si ha tardado más
		 * de media hora en entregarla.
		 *
		 * Por último, el programa mostrará este nº de pedidos fallidos, y lo indicará
		 * también como porcentaje del total de pedidos hechos
		 */

		/*
		 * Extra: modificar el ejercicio para que el número de pedidos a introducir sea
		 * hasta 15. Condición de parada: 0.
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		int pedidosFallidos = 0; 
		double[] pedidos = new double[5];

		// Indica el número de pedidos válidos.
		int numPedidos = 0;
		
		for (int i = 0; i < pedidos.length; i++) {

			System.out.println("Introduzca el tiempo de cada pedido: ");
			pedidos[i] = entrada.nextInt();
			
			// Miramos si el usuario ha escrito un 0 para parar.
			if (pedidos[i] == 0) {
				break;
			}
			
			numPedidos++;
			
			if (pedidos[i] > 30) {
				pedidosFallidos++;
			}

		}

		if(numPedidos == 0) {
			return;
		}
		
		System.out.println("Pedidos que superan los 30 minutos: " + pedidosFallidos);
		System.out.println("Porcentaje de pedidos fallidos: " 
				+ (pedidosFallidos * 100 / numPedidos) + "%");

	}

}