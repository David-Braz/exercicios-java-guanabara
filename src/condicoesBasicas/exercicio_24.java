package condicoesBasicas;

import java.util.Scanner;

public class exercicio_24 {

	public static void main(String[] args) {

		/* 24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja percorrer em Km.
		 * Calcule o pre�o da passagem, cobrando R$0.50 por Km para viagens at� 200Km e R$0.45 para viagens mais longas.
		 */
		
		double km, precoPassagem;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a dist�ncia que voc� deseja percorrer? ");
		km = scan.nextDouble();
		
		if(km <= 200.0) {
			precoPassagem = km * 0.50;
			System.out.println("O pre�o da passagem: R$ " + precoPassagem);
		}
		else if(km > 200.0) {
			precoPassagem = km * 0.45;
			System.out.println("O pre�o da passagem: R$ " + precoPassagem);
		}
	}

}
