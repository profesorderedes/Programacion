package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contadorLineas = 0;
		int contadorPalabras = 0;

		System.out.println("Por favor introduzca el nombre de un archivo de texto plano");
		System.out.println("-----------------------------------------------------------------");
		String archivo = entrada.nextLine();

		System.out.println("Introduzca la palabra a encontrar y te diré cuántas veces aparece");
		System.out.println("-----------------------------------------------------------------");
		String palabraUsuario = entrada.nextLine();
		
		try {
			FileReader documento = new FileReader("ficheros/" + archivo);
			BufferedReader bufer = new BufferedReader(documento);

			String linea = bufer.readLine();

			while (linea != null) {
				
				contadorLineas++;

				String[] palabras = linea.split(" ");

				for (int i = 0; i < palabras.length; i++) {

					if (palabras[i].equals(palabraUsuario)) {
						contadorPalabras++;
					}
				}

				linea = bufer.readLine();

			}
			bufer.close();

		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
			e.printStackTrace();
		}

		System.out.println("En el documento hay " + contadorLineas + " líneas");
		System.out.println("Ha aparecido la palabra " + palabraUsuario + " " + contadorPalabras + " veces");
	}
}