package passo_B_condicoesBasicas;

import java.util.Scanner;

public class exercicio_22 {

	public static void main(String[] args) {
		
		/* 22) Escreva um programa que leia o ano de nascimento de um rapaz
		 * e mostre a sua situa��o em rela��o ao alistamento militar.
		 * - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
		 * - Se j� tiver depois dos 18 anos, mostre quantos anos j� se passaram do alistamento.
		 */
		
		int ano, idade, anosRestantes, anosPassados;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano de nascimento: ");
		ano = scan.nextInt();
		
		idade = 2022 - ano;
		
		if(idade >= 18) {
			anosPassados = idade - 18;
			System.out.println("J� se passaram " + anosPassados + " anos desde o seu alistamento militar.");
		}
		else if(idade < 18) {
			anosRestantes = 18 - idade;
			System.out.println("Faltam " + anosRestantes + "anos restantes para o seu alistamento militar.");
		}
	}

}
