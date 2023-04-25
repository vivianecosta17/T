package Questao20;

import java.util.Scanner;

public class CategoriaNadador {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		int idade = entrada.nextInt();

		String categoria = "";

		if (idade >= 5 && idade <= 7) {
			categoria = "Infantil";
		} else if (idade >= 8 && idade <= 10) {
			categoria = "Juvenil";
		} else if (idade >= 11 && idade <= 15) {
			categoria = "Adolescente";
		} else if (idade >= 16 && idade <= 30) {
			categoria = "Adulto";
		} else {
			categoria = "Sênior";
		}

		System.out.printf("Categoria do nadador: %s\n", categoria);

		entrada.close();
	}
}