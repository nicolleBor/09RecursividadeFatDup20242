package view;

import java.util.Scanner;

import controller.FatorialDuplo;

public class Principal {
	
	public static void main(String[] args) {

		FatorialDuplo fatd = new FatorialDuplo();
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		while (n %2 == 0) {
			System.out.println("Digite um número ímpar");
			n = entrada.nextInt();
		}
		int resposta = fatd.fatorialDuplo(n);
		System.out.println("O resultado do fatorial duplo de "+ n + " é de ==> " + resposta);
		entrada.close();

	}
}