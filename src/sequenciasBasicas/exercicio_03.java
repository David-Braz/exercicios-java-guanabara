package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_03 {
	public static void main(String[] args) {
	
		/*3) Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no final uma mensagem.
		 * Ex:
		 * Nome do Funcion�rio: Maria do Carmo
		 * Sal�rio: 1850,45
		 * O funcion�rio Maria do Carmo tem um sal�rio de R$ 1850,45 em Junho.
		 */

		String nome;
		double salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do Funcion�rio: ");
		nome = leia.next();
		System.out.print("Sal�rio: ");
		salario = leia.nextDouble();
		
		System.out.println("O funcion�rio " + nome + " tem um sal�rio de R$ " + salario + " em Junho.");
	}
}
