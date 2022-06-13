package passo_D_repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_42 {

	public static void main(String[] args) {

		/* 42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
		 * qualquer e mostre uma contagem até esse valor:
		 * 
		 * Ex: Digite um valor: 35
		 * 
		 * Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
		 */
		
		int x, cont;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro e positivo: ");
		cont = scan.nextInt();
		
		for (x = 1; x <= cont; x++) {
			
			System.out.print(x + " ");
			
			if(x == cont) {
				
				System.out.println("Acabou!");
			}
			
		}
	}

}
