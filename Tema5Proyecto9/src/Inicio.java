
public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(100, "Samsung", "A1");

		Lavadora lava1 = new Lavadora(1, motor1, "Balay", 500);

		System.out.println(lava1.toString());
		
		Taller taller = new Taller();
		
		taller.addLavadora(lava1);

	}

}
