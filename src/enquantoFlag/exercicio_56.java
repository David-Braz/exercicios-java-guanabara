package enquantoFlag;

import java.util.Scanner;

public class exercicio_56 {

	public static void main(String[] args) {

		/* 56) Crie um programa que leia v�rios n�meros pelo teclado
		 * e mostre no final somat�rio entre eles.
		 * 
		 * Obs: O programa ser� interrompido quando o n�mero 1111 for digitado
		 */
		
		int num, soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.print("Digite um n�mero inteiro: ");
			num = scan.nextInt();
			
			if(num != 1111) {
				
				soma += num;
			}
			
		} while(num != 1111);
		
		System.out.print("\nA soma dos valores acima �: " + soma);
	}

}
