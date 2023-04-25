package Questao3;

import java.util.Scanner;

public class MenorNumero {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();

		double menor;

		if (num1 < num2) {
			menor = num1;
		} else {
			menor = num2;
		}

		System.out.println("O menor número é: " + menor);

		entrada.close();
	}
}