
public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(100, "Daewoo", "A1");
		Motor motor2 = new Motor(101, "Mitsubishi", "V2");
		Motor motor3 = new Motor(102, "Honda", "R51");

		Lavadora lava1 = new Lavadora(2, motor1, "Balay", 500);
		Lavadora lava2 = new Lavadora(4, motor1, "Samsung", 420);
		Lavadora lava3 = new Lavadora(1, motor2, "Samsung", 570);
		Lavadora lava4 = new Lavadora(3, motor3, "Balay", 610);

		System.out.println(lava1.toString());

		Taller taller = new Taller();

		System.out.println(taller.addLavadora(lava1));
		System.out.println(taller.addLavadora(lava2));
		System.out.println(taller.addLavadora(lava3));
		System.out.println(taller.addLavadora(lava4));
		System.out.println(taller.addLavadora(lava4));

		taller.listaLavadoras();

	}

}
