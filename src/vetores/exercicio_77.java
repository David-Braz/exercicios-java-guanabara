package vetores;

import java.util.Scanner;

public class exercicio_77 {

	public static void main(String[] args) {

		/* 77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor.
		 * No final, mostre uma listagem com todos os nomes informados,
		 * na ordem inversa daquela em que eles foram informados.
		 */
		
		String[] vetor = new String[7];
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 0; x <= 6; x++) {
			
			System.out.print("Digite o nome: ");
			vetor[x] = scan.next();
			
		}
		
		for(x = 6; x >= 0; x--) {
			
			System.out.println(vetor[x]);
	
		}
		
		
		
	}

}
