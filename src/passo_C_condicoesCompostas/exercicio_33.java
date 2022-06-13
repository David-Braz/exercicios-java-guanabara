package passo_C_condicoesCompostas;

import java.util.Scanner;

public class exercicio_33 {

	public static void main(String[] args) {

		/* 33) Escreva um programa para aprovar ou n�o o empr�stimo banc�rio
		 * para a compra de uma casa. O programa vai perguntar o valor da casa,
		 * o sal�rio do comprador e em quantos anos ele vai pagar.
		 * 
		 * Calcule o valor da presta��o mensal,
		 * sabendo que ela n�o pode exceder 30% do sal�rio
		 * ou ent�o o empr�stimo ser� negado.
		 */
		
		double valorCasa, salario, anosPagar, prestacaoMensal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== TESTE DE LIBERA��O DE EMPR�STIMO ===");
		System.out.println("\nDigite o valor da casa: ");
		valorCasa = scan.nextDouble();
		System.out.println("Digite o valor do seu sal�rio: ");
		salario = scan.nextDouble();
		System.out.println("Digite a quantidade de anos que voc� ir� pagar: ");
		anosPagar = scan.nextDouble();
		
		prestacaoMensal = (valorCasa/(anosPagar*12.0));
		
		if(prestacaoMensal < ((30.0/100.0)*salario)) {
			System.out.println("Seu empr�stimo banc�rio foi liberado.");
		}
		else {
			System.out.println("N�o podemos liberar seu empr�stimo banc�rio.");
		}
		
		
	}

}
