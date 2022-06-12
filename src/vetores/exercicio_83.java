package vetores;

import java.util.Random;

public class exercicio_83 {

	public static void main(String[] args) {

		/* 83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números aleatórios
		 * (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os números gerados
		 * e depois coloque o vetor em ordem crescente, mostrando no final os valores ordenados.
		 */

		
		int[] vetor = new int[20];
		int x, aux = 0;
		
		Random rand = new Random();
		
		for(x = 0; x < vetor.length; x++) {
			
			vetor[x] = rand.nextInt(99);
			System.out.println(vetor[x]);
			
		}
		
		System.out.println("==============================");
		
		for(int i = 0; i < vetor.length; i++) {
			
			for(int j = 0; j < vetor.length; j++) {
				
				if(vetor[i] < vetor[j]) {
						
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
					
				}
				
			}
			
		}
		
		for(x = 0; x < vetor.length; x++) {
			
			System.out.println(vetor[x]);
		}
		
	}

}
