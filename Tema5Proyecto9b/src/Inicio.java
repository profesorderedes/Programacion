
public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(100, "Daewoo", "A1");
		Motor motor2 = new Motor(101, "Mitsubishi", "V2");
		Motor motor3 = new Motor(102, "Honda", "R51");

		Lavadora lava1 = new Lavadora(1, motor1, "Balay", 500);
		Lavadora lava2 = new Lavadora(2, motor1, "Samsung", 420);
		Lavadora lava3 = new Lavadora(3, motor2, "Samsung", 570);
		Lavadora lava4 = new Lavadora(4, motor3, "Balay", 610);

		System.out.println(lava1.toString());

		Taller taller = new Taller();

		taller.addLavadora(lava1);
		taller.addLavadora(lava2);
		taller.addLavadora(lava3);
		taller.addLavadora(lava4);

		taller.listaLavadoras();

//		System.out.println("\nLa lavadora con id 1 está en la posición " + taller.buscaLavadora(1) + ".");
//		System.out.println("\nLa lavadora con id 3 está en la posición " + taller.buscaLavadora(3) + ".");
//		System.out.println("\nLa lavadora con id 57 está en la posición " + taller.buscaLavadora(57) + ".");
//
//		taller.delLavadora(2);
//		taller.listaLavadoras();
//		taller.delLavadora(4);
//		taller.listaLavadoras();
//		taller.delLavadora(1);
//		taller.listaLavadoras();
//		taller.delLavadora(3);
//		taller.listaLavadoras();
//
//		taller.delLavadora(1);
//		taller.listaLavadoras();

		System.out.println("\nPrecio total de las lavadoras: " + taller.totalLavadoras() + " euros.");

		taller.descuentoLavadoras("Balay2", 10);
		taller.listaLavadoras();

		System.out.println(
				"\nUn producto de 100 euros, con un IVA del 21%, costará " + Taller.precioConIva(100, 21) + " euros.");

		System.out.println("\nHay " + taller.lavadorasRestantes() + " espacios vacíos en el array.");

		System.out.println("\nLavadoras de marca Samsung:");
		taller.marcaLavadora("Samsung");

		taller.ordenarPorPrecio();

		System.out.println("\nHay " + taller.contMarcas("Samsung") + " lavadoras de la marca Samsung.");

		taller.ordernarPorMarca();
		
		taller.ordenarPorMotor();
	}

}
