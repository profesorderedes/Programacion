package ejemplo15Mates;

public class Main {

	public static void main(String[] args) {

		// Podemos acceder a los atributos PI y E sin
		// crear un objeto de la clase Mates, ya que son
		// estáticos.
		System.out.println("El número pi es " + Mates.PI);
		System.out.println("El número e vale " + Mates.E);

		// Si creamos objetos de la clase Mates, veremos
		// que el atributo num, por ser estático, vale
		// lo mismo en cualquiera de ellos.
		Mates mat = new Mates();
		mat.num = 20;

		Mates mat2 = new Mates();
		mat2.num = 30;

		System.out.println("mat = " + mat.num);
		
		System.out.println(Mates.pow(2, 5));

	}

}




