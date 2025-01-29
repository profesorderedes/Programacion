package ejemplo13Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("1010HTG", "Peugeot 208");
		Coche coche2 = new Coche("1011HTG", "Seat León");

		coche1.setDescuento(20);

		System.out.println(coche2.getDescuento());

//		Coche.iva = 16;
//		System.out.println(Coche.iva);

	}
}
