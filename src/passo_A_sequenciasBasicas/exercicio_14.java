package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {

		/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
		 * um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
		 * quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
		 * sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
		 * */
		
		double km, dias, precoTotal, kmRodado = 0.20, diaria = 90.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de Km percorrida pelo carro alugado? ");
		km = scan.nextDouble();
		System.out.println("Qual a quantidade de dias alugado? ");
		dias = scan.nextDouble();
		
		precoTotal = (km*kmRodado) + (dias*diaria);
		
		System.out.println("O valor que você terá que pagar é: R$ " + precoTotal);
	}

}
