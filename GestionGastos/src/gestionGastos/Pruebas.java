package gestionGastos;

import java.time.LocalDate;

public class Pruebas {

	public static void main(String[] args) {

		// Algunos asientos de febrero.
		Asiento asiento1 = new Asiento(LocalDate.parse("2026-02-05"), "Supermercado", -40.75);
		Asiento asiento2 = new Asiento(LocalDate.parse("2026-02-12"), "Gasolina", -50);
		Asiento asiento3 = new Asiento(LocalDate.parse("2026-02-20"), "Tintorería", -20);
		Asiento asiento4 = new Asiento(LocalDate.parse("2026-02-28"), "Salario", 1800);

		// Algunos asientos de marzo.
		Asiento asiento5 = new Asiento(LocalDate.parse("2026-03-02"), "Cena", -18.50);
		Asiento asiento6 = new Asiento(LocalDate.parse("2026-03-10"), "Supermercado", -43);
		Asiento asiento7 = new Asiento(LocalDate.parse("2026-03-18"), "Papelería", -7.55);
		Asiento asiento8 = new Asiento(LocalDate.parse("2026-03-31"), "Salario", 1800);

		// Nuevo Libro
		Libro libro = new Libro();

		libro.nuevoAsiento(asiento1);
		libro.nuevoAsiento(asiento2);
		libro.nuevoAsiento(asiento3);
		libro.nuevoAsiento(asiento4);
		libro.nuevoAsiento(asiento5);
		libro.nuevoAsiento(asiento6);
		libro.nuevoAsiento(asiento7);
		libro.nuevoAsiento(asiento8);

		// Balance de tres meses.
		libro.mostrarBalanceMes(LocalDate.parse("2026-01-01")); // Vacío
		libro.mostrarBalanceMes(LocalDate.parse("2026-02-01"));
		libro.mostrarBalanceMes(LocalDate.parse("2026-03-01"));

	}

}