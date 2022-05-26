package condicoesBasicas;

import java.util.Scanner;

public class exercicio_21 {

	public static void main(String[] args) {

		/* 21) Faça um algoritmo que leia um determinado ano
		 * e mostre se ele é ou não BISSEXTO.
		 */
		
		int ano;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um ano (YYYY): ");
		ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano digitado é bissexto!");
		}
		else {
			System.out.println("O ano digitado não é bissexto!");
		}
		
	}

}
