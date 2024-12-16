package hoja3;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int[] tiemposEntrega = new int[15];

		for (int i = 0; i < tiemposEntrega.length; i++) {
			System.out.println("Introduce el tiempo de entrega del pedido " + (i + 1) + ": ");
			tiemposEntrega[i] = entrada.nextInt();
		}

		int pedidosFallidos = 0;
		for (int i = 0; i < tiemposEntrega.length; i++) {
			if (tiemposEntrega[i] > 30) {
				pedidosFallidos++;
			}
		}

		System.out.println("Número de pedidos fallidos: " + pedidosFallidos);

		double porcentaje = (double)pedidosFallidos / tiemposEntrega.length * 100;
		System.out.println("Porcentaje de pedidos fallidos: " + porcentaje + "%");

	}
}