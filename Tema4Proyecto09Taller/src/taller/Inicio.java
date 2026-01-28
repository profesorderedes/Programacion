package taller;

public class Inicio {

	public static void main(String[] args) {

		// Pruebas de la clase Motor
		Motor m1 = new Motor(1, "Mitsubishi", "V3");
		Motor m2 = new Motor(2, "Samsung", "A1");
		Motor m3 = new Motor(3, "Hyundai", "X");

		System.out.println(m1.toString());

		// Pruebas de la clase Lavadora.
		Lavadora l1 = new Lavadora(201, m1, "Balay", 420);
		Lavadora l2 = new Lavadora(202, m2, "Samsung", 380);
		Lavadora l3 = new Lavadora(203, m3, "Bosch", 450);

		System.out.println(l1.toString());
		System.out.println(l2.toString());

		// Pruebas de la clase Taller.

		Taller miTaller = new Taller();

		miTaller.addLavadora(l1);
		miTaller.addLavadora(l2);
		miTaller.addLavadora(l3);

		System.out.println("");
		miTaller.listaLavadoras();

		System.out.println("");
		System.out.println("Posición de la lavadora con código 202: " + miTaller.buscaLavadora(202));
		System.out.println("Posición de la lavadora con código 5: " + miTaller.buscaLavadora(5));

		System.out.println();
		miTaller.borraLavadora(202);
		miTaller.listaLavadoras();

		System.out.println();
		miTaller.borraLavadora(201);
		miTaller.listaLavadoras();

		System.out.println();
		miTaller.borraLavadora(203);
		miTaller.listaLavadoras();

	}
}
