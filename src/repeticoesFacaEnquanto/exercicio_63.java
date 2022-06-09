package repeticoesFacaEnquanto;

import java.util.Scanner;

public class exercicio_63 {

	public static void main(String[] args) {

		/* 63) Crie um programa usando a estrutura “faça enquanto” que leia vários números.
		 * A cada laço, pergunte se o usuário quer continuar ou não.
		 * No final, mostre na tela:
		 * 
		 * a) O somatório entre todos os valores
		 * b) Qual foi o menor valor digitado
		 * c) A média entre todos os valores
		 * d) Quantos valores são pares
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0, menorValor = 0, media, valor, cont = 0, contPar = 0;
		char op;
		
		do {
			
			System.out.print("Digite um número: ");
			valor = scan.nextInt();
			
			soma += valor;
			cont++;
			
			if(valor % 2 == 0) {
				
				contPar++;
			}
			
			if(valor < menorValor || menorValor == 0) {
				
				if(valor != 0) {
					
					menorValor = valor;

				}
				
			}
			
			System.out.print("Você quer continuar? (S/N): ");
			op = scan.next().toUpperCase().charAt(0);
			
		} while(op == 'S');
		
		media = soma/cont;
		
		System.out.print("\n\nO somatório entre todos os valores: " + soma);
		System.out.print("\nO menor valor digitado: " + menorValor);
		System.out.print("\nA média entre todos os valores: " + media);
		System.out.print("\nQuantidade de valores que são pares: " + contPar);
	}

}
