package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_03 {
	public static void main(String[] args) {
	
		/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
		 * Ex:
		 * Nome do Funcionário: Maria do Carmo
		 * Salário: 1850,45
		 * O funcionário Maria do Carmo tem um salário de R$ 1850,45 em Junho.
		 */

		String nome;
		double salario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nome do Funcionário: ");
		nome = leia.next();
		System.out.print("Salário: ");
		salario = leia.nextDouble();
		
		System.out.println("O funcionário " + nome + " tem um salário de R$ " + salario + " em Junho.");
	}
}
