package passo_D_repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_52 {

	public static void main(String[] args) {

		/* 52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
		 * 
		 * a) Qual � a m�dia de idade do grupo
		 * b) Quantas pessoas tem mais de 18 anos
		 * c) Quantas pessoas tem menos de 5 anos
		 * d) Qual foi a maior idade lida
		 */
		
		int[] idade = new int[10];
		int media, maiorIdade = 0, menorIdade = 0, soma = 0, maiorIdadeLida = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int x = 0; x <= 9; x++) {
			
			System.out.print("Digite uma idade: ");
			idade[x] = scan.nextInt();
			
			soma += idade[x];
			
			if(idade[x] > 18) {
				
				maiorIdade++;
	
			}
			
			else if(idade[x] < 5){
				
				menorIdade++;
			}
			
			if(idade[x] > maiorIdadeLida) {
				
				maiorIdadeLida = idade[x];
						
			}
		}
		
		media = soma/10;
		
		System.out.print("\nA m�dia de idade do grupo � de " + media + " anos;");
		System.out.print("\nH� " + maiorIdade + " pessoas acima dos 18 anos;");
		System.out.print("\nH� " + menorIdade + " pessoas menor que 5 anos;");
		System.out.print("\nA maior idade mencionada foi: " + maiorIdadeLida);
	
	}

}
