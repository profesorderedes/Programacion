package juzgado;

public class Main {

	public static void main(String[] args) {

		Juez juez1 = new Juez("82717211F", "Castro", "José");
		Juez juez2 = new Juez("56625612J", "Romero", "Samantha");

		Sentencia sent1 = new Sentencia(101, "Caso NOOS", "Habiendo examinado las pruebas...", juez1);
		Sentencia sent2 = new Sentencia(102, "Caso Over", "Habiendo examinado las pruebas...", juez1);
		Sentencia sent3 = new Sentencia(103, "Caso Son Espases", "Habiendo examinado las pruebas...", juez2);
		Sentencia sent4 = new Sentencia(104, "Caso X", "Habiendo examinado las pruebas...", juez2);
		Sentencia sent5 = new Sentencia(105, "Caso Y", "Habiendo examinado las pruebas...", juez2);

		Juzgado juzgado = new Juzgado("Palma", 11);

		juzgado.addSentencia(sent1);
		juzgado.addSentencia(sent2);
		juzgado.addSentencia(sent3);
		juzgado.addSentencia(sent4);
		juzgado.addSentencia(sent5);

		juzgado.listaSentencias();

//		System.out.println("\nLa sentencia número 103 está en la posición " + juzgado.buscaSentencia(103));
//		
//		System.out.println("\nLa sentencia número 2000 está en la posición " + juzgado.buscaSentencia(2000));

		juzgado.delSentencia(101);
		juzgado.delSentencia(103);
		juzgado.delSentencia(2);
		juzgado.listaSentencias();

		System.out.println("\nSentencias de Samanta Romero:");
		juzgado.listaJuez("56625612J");

		System.out.println("\nSentencias de José Castro:");
		juzgado.listaJuez("82717211F");

	}

}
