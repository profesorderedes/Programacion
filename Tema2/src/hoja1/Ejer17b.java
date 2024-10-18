package hoja1;

import java.util.Scanner;

public class Ejer17b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el número de mes y te diré ćomo se llama:");
		int numMes = entrada.nextInt();

		String mes;
		switch (numMes) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		default:
			mes = "Error";
		}

		// Mostramos un mensaje distinto según si el número de mes es válido
		// o no.
		if (mes.equals("Error")) {
			System.out.println("El número de mes no es válido.");
		} else {
			System.out.println("El mes es " + mes + ".");
		}

	}

}
