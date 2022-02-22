package inicio;

import electrodomesticos.Lavadora;
import electrodomesticos.Motor;
import electrodomesticos.Taller;

public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(21, "Mitsubishi", "V3");
		Motor motor2 = new Motor(22, "Samsung", "A1");
		
		Lavadora lavadora1 = new Lavadora(201, motor1, 
				"Balay", 450);
		Lavadora lavadora2 = new Lavadora(202, motor2, 
				"Edesa", 410);
		
		System.out.println(lavadora1.toString());


		
		Taller taller1 = new Taller(20);

		taller1.addLavadora(lavadora1);
		taller1.addLavadora(lavadora2);

		taller1.listaLavadoras();

		System.out.println("\nLa posicion de la lavadora con "
				+ "identificador 201 es " 
				+ taller1.buscaLavadora(201));
		System.out.println("\nLa posicion de la lavadora con "
				+ "identificador 300 es " 
				+ taller1.buscaLavadora(300));

		taller1.borraLavadora(201);

		taller1.listaLavadoras();

	}

}
