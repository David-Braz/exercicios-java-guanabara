package passo_C_condicoesCompostas;

import java.util.Scanner;

public class exercicio_37 {

	public static void main(String[] args) {

		/*37) Uma empresa precisa reajustar o sal�rio dos seus funcion�rios,
		 * dando um	aumento de acordo com alguns fatores.
		 *
		 * Fa�a um programa que leia o sal�rio atual, o g�nero do funcion�rio
		 * e h� quantos anos esse funcion�rio trabalha na empresa.
		 * No final, mostre o seu novo sal�rio, baseado na tabela a seguir:
		 * 
		 * - Mulheres
		 * - menos de 15 anos de empresa: +5%
		 * - de 15 at� 20 anos de empresa: +12%
		 * - mais de 20 anos de empresa: +23%
		 *
		 * - Homens
		 * - menos de 20 anos de empresa: +3%
		 * - de 20 at� 30 anos de empresa: +13%
		 * - mais de 30 anos de empresa: +25%
		 */
		
		double salarioAtual, novoSalario, anosEmpregado;
		int op = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		salarioAtual = scan.nextDouble();
		
		System.out.println("H� quantos anos o funcion�rio trabalha na empresa: ");
		anosEmpregado = scan.nextDouble();
		
		System.out.print("Selecione o genero abaixo:\n\n1. Mulher\n2. Homem\n\nDigite aqui: ");
		op = scan.nextInt();
		
		switch (op) {
		
		case 1:
			
			if(anosEmpregado < 15.0) {
				novoSalario = salarioAtual + ((5.0/100.0) * salarioAtual);
				System.out.println("O sal�rio passar� de R$ " + salarioAtual + " para R$ " + novoSalario);
			}
			
			else if(anosEmpregado >= 15.0 && anosEmpregado <= 30.0) {
				novoSalario = salarioAtual + ((12.0/100.0) * salarioAtual);
				System.out.println("O sal�rio passar� de R$ " + salarioAtual + " para R$ " + novoSalario);
			}
			
			else if(anosEmpregado > 20.0) {
				novoSalario = salarioAtual + ((25.0/100.0) * salarioAtual);
				System.out.println("O sal�rio passar� de R$ " + salarioAtual + " para R$ " + novoSalario);
			}
			
			break;
		
		case 2:

			if(anosEmpregado < 20.0) {
				novoSalario = salarioAtual + ((3.0/100.0) * salarioAtual);
				System.out.println("O sal�rio passar� de R$ " + salarioAtual + " para R$ " + novoSalario);
			}
			
			else if(anosEmpregado >= 20.0 && anosEmpregado <= 30.0) {
				novoSalario = salarioAtual + ((13.0/100.0) * salarioAtual);
				System.out.println("O sal�rio passar� de R$ " + salarioAtual + " para R$ " + novoSalario);
			}
			
			else if(anosEmpregado > 30.0) {
				novoSalario = salarioAtual + ((25.0/100.0) * salarioAtual);
				System.out.println("O sal�rio passar� de R$ " + salarioAtual + " para R$ " + novoSalario);
			}
			
			break;
		}
	}

}
