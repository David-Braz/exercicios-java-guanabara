package passo_F_repeticoesFacaEnquanto;

import java.util.Scanner;

public class exercicio_62 {

	public static void main(String[] args) {

		/* 62) Fa�a um programa usando a estrutura �fa�a enquanto� que leia a idade de v�rias pessoas.
		 * A cada la�o, voc� dever� perguntar para o usu�rio se ele quer ou n�o continuar a digitar dados.
		 * No final, quando o usu�rio decidir parar, mostre na tela:
		 * 
		 * a) Quantas idades foram digitadas
		 * b) Qual � a m�dia entre as idades digitadas
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
		System.out.print("\nA m�dia das idades digitadas: " + media);
		System.out.print("\nQuantidade de pessoas com 21 anos ou mais: " + contIdadeAcima);
	}

}
