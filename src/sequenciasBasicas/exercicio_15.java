package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {

		/*15) Crie um programa que leia o número de dias trabalhados em um mês
		 * e mostre o salário de um funcionário, sabendo que ele trabalha 8 horas
		 * por dia e ganha R$25 por hora trabalhada.
		 */
		
		double valorDia, diasTrabalhados, salario;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos dias você trabalhou? ");
		diasTrabalhados = scan.nextDouble();
		
		valorDia = (8.0 * 25.0);
		salario = diasTrabalhados*valorDia;
		
		System.out.println("Seu salário será: R$ " + salario);
		
	}

}
