package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {

		/*15) Crie um programa que leia o n�mero de dias trabalhados em um m�s
		 * e mostre o sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas
		 * por dia e ganha R$25 por hora trabalhada.
		 */
		
		double valorDia, diasTrabalhados, salario;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantos dias voc� trabalhou? ");
		diasTrabalhados = scan.nextDouble();
		
		valorDia = (8.0 * 25.0);
		salario = diasTrabalhados*valorDia;
		
		System.out.println("Seu sal�rio ser�: R$ " + salario);
		
	}

}
