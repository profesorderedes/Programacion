package ejemplo18;

public class Media {

	public static void main(String[] args) {

		float num1 = Float.parseFloat(args[0]);
		float num2 = Float.parseFloat(args[1]);
		float num3 = Float.parseFloat(args[2]);

		float media = (num1 + num2 + num3) / args.length;

		System.out.println("La media es " + media);
		System.out.println("¡¡Tachaaaan!!");

	}

}