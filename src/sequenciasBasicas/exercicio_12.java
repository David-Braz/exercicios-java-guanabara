package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {

		/*12) Crie um programa que leia o pre�o de um produto,
		 * calcule e mostre o seu PRE�O PROMOCIONAL, com 5% de desconto.
		 */
		
		double preco, precoPromocional;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual o pre�o do produto? ");
		preco = scan.nextDouble();
		
		precoPromocional = preco-(preco*(5.0/100.0));
		
		System.out.println("O valor promocional � R$ " + precoPromocional);
		
	}

}
