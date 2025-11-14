package hoja2;

public class Ejer08 {

	public static void main(String[] args) {

//		8.- La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a lo largo de las 24
//		horas de un día. Crea un programa capaz de recorrer este array e indicar cuáles han sido las
//		humedades máxima y mínima del día, y a qué horas se han producido.

		int[] porcentajes = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50,
				50, 45 };
		
		int posMin = 0, posMax = 0;

		for (int i = 1; i < porcentajes.length; i++) {
			if (porcentajes[i] < porcentajes[posMin]) {
				posMin = i;
			} else if (porcentajes[i] > porcentajes[posMax]) {
				posMax = i;
			}
		}
		
		System.out.println("La hora donde se encuentra el mínimo es a las " 
				+ posMin + "h.\nLa humedad es de " + porcentajes[posMin] + "%");
		System.out.println("\nLa hora donde se encuentra el máximo es a las " 
				+ posMax + "h.\nLa humedad es de " + porcentajes[posMax]+"%");

		

	}

}