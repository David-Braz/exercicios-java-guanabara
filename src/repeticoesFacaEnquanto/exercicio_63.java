package repeticoesFacaEnquanto;

import java.util.Scanner;

public class exercicio_63 {

	public static void main(String[] args) {

		/* 63) Crie um programa usando a estrutura �fa�a enquanto� que leia v�rios n�meros.
		 * A cada la�o, pergunte se o usu�rio quer continuar ou n�o.
		 * No final, mostre na tela:
		 * 
		 * a) O somat�rio entre todos os valores
		 * b) Qual foi o menor valor digitado
		 * c) A m�dia entre todos os valores
		 * d) Quantos valores s�o pares
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0, menorValor = 0, media, valor, cont = 0, contPar = 0;
		char op;
		
		do {
			
			System.out.print("Digite um n�mero: ");
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
			
			System.out.print("Voc� quer continuar? (S/N): ");
			op = scan.next().toUpperCase().charAt(0);
			
		} while(op == 'S');
		
		media = soma/cont;
		
		System.out.print("\n\nO somat�rio entre todos os valores: " + soma);
		System.out.print("\nO menor valor digitado: " + menorValor);
		System.out.print("\nA m�dia entre todos os valores: " + media);
		System.out.print("\nQuantidade de valores que s�o pares: " + contPar);
	}

}
