package passo_H_vetores;

import java.util.Scanner;

public class exercicio_84 {

	public static void main(String[] args) {

		/* 84) Crie um programa que leia o nome e a idade de 9 pessoas
		 * e guarde esses valores em dois vetores, em posições relacionadas.
		 * No final, mostre uma listagem contendo apenas os dados das pessoas menores de idade.
		 */
		
		String[] nome = new String[9];
		int[] idade = new int[9];
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 0; x < 9; x++) {
			
			System.out.print("Digite agora o nome: ");
			nome[x] = scan.next();
			System.out.print("Digite a idade da pessoa " + (x+1) + ": ");
			idade[x] = scan.nextInt();

		}
		
		for(x = 0; x < 9; x++) {
			
			if(idade[x] < 18) {
				
				System.out.println(nome[x] + " - " + idade[x] + " anos");
			}
		}
	}

}
