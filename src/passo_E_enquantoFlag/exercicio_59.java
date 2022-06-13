package passo_E_enquantoFlag;

import java.util.Scanner;

public class exercicio_59 {

	public static void main(String[] args) {

		/* 59) Crie um programa que leia o sexo e a idade de várias pessoas.
		 * O programa vai perguntar se o usuário quer continuar ou não a cada pessoa.
		 * No final, mostre:
		 * 
		 * a) qual é a maior idade lida
		 * b) quantos homens foram cadastrados
		 * c) qual é a idade da mulher mais jovem
		 * d) qual é a média de idade entre os homens
		 */
		
		int idade, x = 0, media, somaH = 0, menorIdadeM = 0, contH = 0, maiorIdade, maiorIdadeM = 0, maiorIdadeH = 0;
		char op, flag;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===== P R O G R A M A - I N I C I A L I Z A D O =====");
		
		do {
			
			System.out.print("\nEscolha o gênero:\n\nH = Homen\nM = Mulher\n\nDigite aqui: ");
			op = scan.next().toUpperCase().charAt(0);
			
			switch(op) {
			
			case 'H':
				
				System.out.print("Digite a idade: ");
				idade = scan.nextInt();
				somaH += idade;
				
				if(idade > maiorIdadeH) {
					
					maiorIdadeH = idade;
					
				}
				
				contH++;
				break;
				
			case 'M':
				
				System.out.print("Digite a idade: ");
				idade = scan.nextInt();
				
				if(idade > maiorIdadeM) {
					
					maiorIdadeM = idade;
					
				}
				
				if(idade < menorIdadeM && idade != 0 || menorIdadeM == 0) {
					
					menorIdadeM = idade;
							
				}
					
				break;
				
			default:
				
				System.out.println("Opção inválida!");
				
			}

			System.out.print("Você deseja continuar? (S/N):");
			flag = scan.next().toUpperCase().charAt(0);
			
		} while(flag != 'N');
		
		
		if(maiorIdadeH > maiorIdadeM) {
			
			maiorIdade = maiorIdadeH;
		}
		
		else {
			
			maiorIdade = maiorIdadeM;
			
		}
		
		media = somaH/contH;
		
		System.out.println("\n===== R E S U L T A D O =====\n\n");
		System.out.print("A maior idade lida foi: " + maiorIdade);
		System.out.print("\nForam cadastrados " + contH + " homens");
		System.out.print("\nA idade da mulher mais jovem é: " + menorIdadeM);
		System.out.print("\nA média de idade entre homens é de: " + media);

	}

}
