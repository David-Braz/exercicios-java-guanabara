package condicoesBasicas;

import java.util.Scanner;

public class exercicio_21 {

	public static void main(String[] args) {

		/* 21) Fa�a um algoritmo que leia um determinado ano
		 * e mostre se ele � ou n�o BISSEXTO.
		 */
		
		int ano;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano (YYYY): ");
		ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano digitado � bissexto!");
		}
		else {
			System.out.println("O ano digitado n�o � bissexto!");
		}
		
	}

}
