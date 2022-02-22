package inicio;

import java.util.Scanner;

import electrodomesticos.Lavadora;
import electrodomesticos.Motor;
import electrodomesticos.Taller;

public class Inicio {

	public static void main(String[] args) {

		// Pedir los datos necesarios para crear un objeto
		// Lavadora y añadirlo al taller.

		Scanner entrada = new Scanner(System.in);

		System.out.println("DATOS DEL MOTOR:\n");

		System.out.print("Identificador del motor: ");
		int id = entrada.nextInt();

		entrada.nextLine();
		System.out.print("Nombre del fabricante: ");
		String fabricante = entrada.nextLine();

		System.out.print("Nombre del modelo: ");
		String modelo = entrada.nextLine();
		
		Motor motor = new Motor(id, fabricante, modelo);

		System.out.println("\nDATOS DE LA LAVADORA:\n");

		System.out.print("Identificador de la lavadora: ");
		int idLav = entrada.nextInt();

		entrada.nextLine();
		System.out.print("Nombre de la marca: ");
		String marca = entrada.nextLine();

		System.out.print("Precio: ");
		float precio = entrada.nextFloat();
		
		Lavadora lavadora = new Lavadora(idLav, motor, marca, 
				precio);
		
		System.out.println("¿De cuántas lavadoras quieres "
				+ "el taller?");
		int maxLavadoras = entrada.nextInt();
		
		Taller miTaller = new Taller(maxLavadoras);
		
		miTaller.addLavadora(lavadora);
		
		miTaller.listaLavadoras();
		

//		Motor motor1 = new Motor(21, "Mitsubishi", "V3");
//		Motor motor2 = new Motor(22, "Samsung", "A1");
//		
//		Lavadora lavadora1 = new Lavadora(201, motor1, 
//				"Balay", 450);
//		Lavadora lavadora2 = new Lavadora(202, motor2, 
//				"Edesa", 410);
//		Lavadora.setIva(21);
//		
//		System.out.println(lavadora1.toString());
//		
//		Taller taller1 = new Taller(20);
//
//		taller1.addLavadora(lavadora1);
//		taller1.addLavadora(lavadora2);
//
//		taller1.listaLavadoras();
//
//		System.out.println("\nLa posicion de la lavadora con "
//				+ "identificador 201 es " 
//				+ taller1.buscaLavadora(201));
//		System.out.println("\nLa posicion de la lavadora con "
//				+ "identificador 300 es " 
//				+ taller1.buscaLavadora(300));
//
//		taller1.borraLavadora(201);
//
//		taller1.listaLavadoras();

	}

}
