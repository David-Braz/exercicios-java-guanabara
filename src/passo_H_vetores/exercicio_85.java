package passo_H_vetores;

import java.util.Scanner;

public class exercicio_85 {

	public static void main(String[] args) {

		/* 85) Fa�a um algoritmo que leia o nome, o sexo e o sal�rio de 5 funcion�rios
		 * e guarde esses dados em tr�s vetores. No final, mostre uma listagem contendo
		 * apenas os dados das funcion�rias mulheres que ganham mais de R$5 mil.
		 */
		
		String[] nome = new String[5];
		char[] sexo = new char[5];
		double[] salario = new double[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int x = 0; x < 5; x++) {
			
			System.out.print("Digite o nome do funcion�rio: ");
			nome[x] = scan.next();
			System.out.print("Qual o sexo do funcion�rio? (H/M)");
			sexo[x] = scan.next().toUpperCase().charAt(0); 
			System.out.print("Digite o sal�rio do funcion�rio: ");
			salario[x] = scan.nextDouble();
			
		}
		
		for(int x = 0; x < 5; x++) {
			
			if(sexo[x] == 'M') {
				
				if(salario[x] > 5000) {
					
					System.out.println(nome[x] + " ganha R$ " + salario[x]);
				}
			}
		}
	}

}
