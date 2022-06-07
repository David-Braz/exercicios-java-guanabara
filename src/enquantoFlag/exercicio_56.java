package enquantoFlag;

import java.util.Scanner;

public class exercicio_56 {

	public static void main(String[] args) {

		/* 56) Crie um programa que leia vários números pelo teclado
		 * e mostre no final somatório entre eles.
		 * 
		 * Obs: O programa será interrompido quando o número 1111 for digitado
		 */
		
		int num, soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um número inteiro: ");
			num = scan.nextInt();
			
			if(num != 1111) {
				
				soma += num;
			}
			
		} while(num != 1111);
		
		System.out.print("\nA soma dos valores acima é: " + soma);
	}

}
