package vetores;

import java.util.Scanner;

public class exercicio_79 {

	public static void main(String[] args) {

		/* 79) Desenvolva um programa que leia 10 n�meros inteiros e guarde-os em um vetor.
		 * No final, mostre quais s�o os n�meros pares que foram digitados
		 * e em que posi��es eles est�o armazenados.
		 */

		int[] vetor = new int[10];
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 0; x <= 9; x++) {
			
			System.out.print("Digite um n�mero inteiro: ");
			vetor[x] = scan.nextInt();
			
		}
		
		System.out.println(" ");
		
		for(x = 0; x <= 9; x++) {
			
			if(vetor[x] % 2 == 0) {
				
				System.out.println(vetor[x] + " � par, est� na posi��o: " + x);
				
			}
			
		}
		
	}

}
