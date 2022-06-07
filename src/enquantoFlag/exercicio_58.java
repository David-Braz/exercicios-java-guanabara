package enquantoFlag;

import java.util.Scanner;

public class exercicio_58 {

	public static void main(String[] args) {

		/* 58) Faça um algoritmo que leia a idade de vários alunos de uma turma.
		 * O programa vai parar quando for digitada a idade 999.
		 * No final, mostre quantos alunos existem na turma e qual é a média de idade do grupo.
		 */
		
		int idade, soma = 0, media, x = 0, y = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			y++;
			System.out.println("Aluno " + y) ;
			System.out.print("Digite a idade do aluno: ");
			idade = scan.nextInt();
			
			
			if(idade != 999) {
				
				soma += idade;
				x++;

			}
			
		} while(idade != 999);
		
		media = soma/x;
		System.out.println("\nQuantidade de alunos existentes na turma: " + x);
		System.out.println("Média de idade do grupo: " + media);
		
	}

}
