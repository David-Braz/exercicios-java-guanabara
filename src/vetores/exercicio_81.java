package vetores;

import java.util.Scanner;

public class exercicio_81 {

	public static void main(String[] args) {

		/* 81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor.
		 * No final, mostre:
		 * 
		 * a) Qual é a média de idade das pessoas cadastradas
		 * b) Em quais posições temos pessoas com mais de 25 anos
		 * c) Qual foi a maior idade digitada (podem haver repetições)
		 * d) Em que posições digitamos a maior idade
		 */
		
		int[] vetor = new int[8];
		int x, media, soma = 0, maiorIdade = 0, cont = 0, posicaoMaiorIdade = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 0; x <= 7; x++) {
			
			System.out.println("Digite a idade: ");
			vetor[x] = scan.nextInt();
			soma += vetor[x];
			cont++;
			
		}
		
		media = soma/cont;
		System.out.print("A média de idade das pessoas cadastradas: " + media);
		
		System.out.println("\n\nPosições de pessoas com mais de 25 anos: ");
		
		for(x = 0; x <= 7; x++) {
			
			if(vetor[x] > 25) {
				
				System.out.println(vetor[x] + " está na posição " + x);
				
			}
			
			if(vetor[x] > maiorIdade) {
			
				maiorIdade = vetor[x];
				posicaoMaiorIdade = x;
				
			}
			
		}
		
		System.out.print("\nA maior idade digitada foi: " + maiorIdade);
		System.out.print("\n\nA posição da maior idade: " + posicaoMaiorIdade);	
		
	}

}
