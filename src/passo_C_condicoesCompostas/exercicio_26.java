package passo_C_condicoesCompostas;

import java.util.Scanner;

public class exercicio_26 {

	public static void main(String[] args) {
		
		/* 26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os,
		 * mostrando na tela uma das mensagens abaixo:
		 * - O primeiro valor � o maior
		 * - O segundo valor � o maior
		 * - N�o existe valor maior, os dois s�o iguais
		 */
		
		int valorA, valorB;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor A: ");
		valorA = scan.nextInt();
		System.out.println("Digite o valor B: ");
		valorB = scan.nextInt();
		
		if(valorA > valorB) {
			System.out.println("O primeiro valor � maior.");
		}
		else if(valorB > valorA) {
			System.out.println("O segundo valor � o maior.");
		}
		else if(valorA == valorB) {
			System.out.println("N�o existe valor maior, os dois s�o iguais.");
		}
		

	}

}
