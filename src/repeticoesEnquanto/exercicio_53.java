package repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_53 {

	public static void main(String[] args) {

		/* 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
		 * 
		 * a) Quantos homens foram cadastrados
		 * b) Quantas mulheres foram cadastradas
		 * c) A média de idade do grupo
		 * d) A média de idade dos homens
		 * e) Quantas mulheres tem mais de 20 anos
		 */
		
		int idadeHomens = 0, idadeMulheres = 0, mediaHomens;
		int contHomens = 0, contMulheres = 0, acimaVinte = 0, somaIdadeH = 0, somaIdadeM = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int x = 0; x <= 4; x++) {
			
			System.out.println("\n============================================================\n");
			System.out.println("Qual o seu gênero: \n\nDigite: H para Homem\nDigite: M para Mulher");
			System.out.print("\nDigite a sua opção aqui: ");
			char op = scan.next().toUpperCase().charAt(0);
			
			switch (op) {
			
			case 'H':
				
				contHomens++;
				System.out.print("\nAgora digite a idade: ");
				idadeHomens = scan.nextInt();
				somaIdadeH += idadeHomens;
				break;
				
			case 'M':
				
				contMulheres++;
				System.out.print("\nAgora digite a idade: ");
				idadeMulheres = scan.nextInt();
				somaIdadeM += idadeMulheres;
				
				if(idadeMulheres > 20) {
					
					acimaVinte++;
					
				}
				
				break;
				
			default:
				
				System.out.println("Opção inválida.");
				break;
				
			}

		}
		
		int mediaGrupo = 0;
		mediaGrupo =+ (somaIdadeH + somaIdadeM)/(contHomens + contMulheres);
		mediaHomens = somaIdadeH/contHomens;
		
		System.out.println("\n\n====================== R E S U L T A D O ======================\\n");
		System.out.println("\nQuantidade de homens cadastrados: " + contHomens);
		System.out.println("Quantidade de mulheres cadastradas: " + contMulheres);
		System.out.println("Média de idade do grupo: " + mediaGrupo);
		System.out.println("Média de idade dos homens: " + mediaHomens);
		System.out.println("Quantidade de mulheres acima dos 20 anos: " + acimaVinte);
	}
	

}
