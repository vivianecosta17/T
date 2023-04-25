package Questao8;

import java.util.Scanner;

public class SalarioReajustado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário atual do funcionário: ");
		double salario = entrada.nextDouble();

		double percentual;

		if (salario <= 300.0) {
			percentual = 0.35;
		} else {
			percentual = 0.15;
		}

		double aumento = salario * percentual;
		double novoSalario = salario + aumento;

		System.out.printf("O salário reajustado é: R$ %.2f\n", novoSalario);

		entrada.close();
	}
}