package vetores;

import java.util.Scanner;

public class exercicio_78 {

	public static void main(String[] args) {

		/* 78) Escreva um programa que leia 15 n�meros e guarde-os em um vetor.
		 * No final, mostre o vetor inteiro na tela e em seguida mostre em que posi��es
		 * foram digitados valores que s�o m�ltiplos de 10.
		 */
		
		int[] vetor = new int[15];
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 0; x <= 14; x++) {
			
			System.out.print("Digite um n�mero inteiro: ");
			vetor[x] = scan.nextInt();
			
		}
		
		System.out.println(" ");
		
		for(x = 0; x <= 14; x++) {
			
			System.out.println(vetor[x]);
		}
		
		System.out.println(" ");
		
		for(x = 0; x <= 14; x ++) {
			
			if(vetor[x] % 10 == 0) {
				
				System.out.println(x);
				
			}
			
		}
		
	}

}
