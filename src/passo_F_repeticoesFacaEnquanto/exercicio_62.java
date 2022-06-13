package passo_F_repeticoesFacaEnquanto;

import java.util.Scanner;

public class exercicio_62 {

	public static void main(String[] args) {

		/* 62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de várias pessoas.
		 * A cada laço, você deverá perguntar para o usuário se ele quer ou não continuar a digitar dados.
		 * No final, quando o usuário decidir parar, mostre na tela:
		 * 
		 * a) Quantas idades foram digitadas
		 * b) Qual é a média entre as idades digitadas
		 * c) Quantas pessoas tem 21 anos ou mais.
		 */

		int idade, media, soma = 0, cont = 0, contIdadeAcima = 0, op = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite a idade: ");
			idade = scan.nextInt();
			
			soma += idade;
			cont++;
			
			if(idade >= 21) {
				
				contIdadeAcima++;
				
			}
			
			System.out.print("Deseja continuar digitando os dados? (S/N): ");
			op = scan.next().toUpperCase().charAt(0);
			
		} while(op == 'S');
		
		media = soma/cont;
		
		System.out.print("\n\nQuantidade de idades digitadas: " + cont);
		System.out.print("\nA média das idades digitadas: " + media);
		System.out.print("\nQuantidade de pessoas com 21 anos ou mais: " + contIdadeAcima);
	}

}
