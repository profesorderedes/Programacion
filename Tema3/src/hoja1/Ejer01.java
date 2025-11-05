package hoja1;

public class Ejer01 {

	public static void main(String[] args) {

// 1.- Crea un array de Strings llamado estaciones cuyos valores sean los nombres de las cuatro
// estaciones del año. Haz que después se muestren todos los valores mediante un bucle for.

		String[] estaciones = { "Primavera", "Verano", "Otoño", "Invierno" };

		for (int i = 0; i < estaciones.length; i++) {

			System.out.println(estaciones[i]);

		}

	}

}