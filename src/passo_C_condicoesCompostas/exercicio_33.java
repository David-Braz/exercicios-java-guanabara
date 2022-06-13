package passo_C_condicoesCompostas;

import java.util.Scanner;

public class exercicio_33 {

	public static void main(String[] args) {

		/* 33) Escreva um programa para aprovar ou não o empréstimo bancário
		 * para a compra de uma casa. O programa vai perguntar o valor da casa,
		 * o salário do comprador e em quantos anos ele vai pagar.
		 * 
		 * Calcule o valor da prestação mensal,
		 * sabendo que ela não pode exceder 30% do salário
		 * ou então o empréstimo será negado.
		 */
		
		double valorCasa, salario, anosPagar, prestacaoMensal;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== TESTE DE LIBERAÇÃO DE EMPRÉSTIMO ===");
		System.out.println("\nDigite o valor da casa: ");
		valorCasa = scan.nextDouble();
		System.out.println("Digite o valor do seu salário: ");
		salario = scan.nextDouble();
		System.out.println("Digite a quantidade de anos que você irá pagar: ");
		anosPagar = scan.nextDouble();
		
		prestacaoMensal = (valorCasa/(anosPagar*12.0));
		
		if(prestacaoMensal < ((30.0/100.0)*salario)) {
			System.out.println("Seu empréstimo bancário foi liberado.");
		}
		else {
			System.out.println("Não podemos liberar seu empréstimo bancário.");
		}
		
		
	}

}
