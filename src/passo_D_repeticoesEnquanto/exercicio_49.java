package passo_D_repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_49 {

	public static void main(String[] args) {

		/* 49) Crie um programa que leia 6 n�meros inteiros
		 * e no final mostre quantos deles s�o pares e quantos s�o �mpares.
		 */
		
		int x, num, pares = 0, impares = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 1; x <= 6; x++) {
			
			System.out.print("Digite um n�mero inteiro: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				
				pares++;
				
			}
			
			else if(num % 2 != 0) {
				
				impares++;
			}
			
		}
		
		System.out.println(pares + " s�o pares.\n" + impares + " s�o �mpares.");
		
	}

}
