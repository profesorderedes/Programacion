
public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(100, "Samsung", "A1");

		Lavadora lava1 = new Lavadora(1, motor1, "Balay", 500);
		Lavadora lava2 = new Lavadora(2, motor1, "Samsung", 420);
		Lavadora lava3 = new Lavadora(3, motor1, "Siemens", 570);
		Lavadora lava4 = new Lavadora(4, motor1, "Bosch", 610);

		System.out.println(lava1.toString());

		Taller taller = new Taller();

		taller.addLavadora(lava1);
		taller.addLavadora(lava2);
		taller.addLavadora(lava3);
		taller.addLavadora(lava4);

		taller.listaLavadoras();

		System.out.println("\nLa lavadora con id 1 está en la posición " + taller.buscaLavadora(1) + ".");
		System.out.println("\nLa lavadora con id 3 está en la posición " + taller.buscaLavadora(3) + ".");
		System.out.println("\nLa lavadora con id 57 está en la posición " + taller.buscaLavadora(57) + ".");

		taller.delLavadora(2);
		taller.listaLavadoras();
		taller.delLavadora(4);
		taller.listaLavadoras();
		taller.delLavadora(1);
		taller.listaLavadoras();
		taller.delLavadora(3);
		taller.listaLavadoras();

		taller.delLavadora(1);
		taller.listaLavadoras();

	}

}
