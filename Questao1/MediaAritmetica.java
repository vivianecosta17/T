package Questao1;

import java.util.Scanner;

public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double nota3 = entrada.nextDouble();

		System.out.print("Digite a quarta nota: ");
		double nota4 = entrada.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

		System.out.printf("Média aritmética: %.2f\n", media);

		if (media >= 7.0) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}
}