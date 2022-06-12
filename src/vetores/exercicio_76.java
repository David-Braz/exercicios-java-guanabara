package vetores;

import java.util.Random;

public class exercicio_76 {

	public static void main(String[] args) {

		/* 76) Crie um programa que preencha automaticamente
		 * um vetor numérico com 7 números gerados aleatoriamente
		 * pelo computador e depois mostre os valores gerados na tela.
		 */
		
		int[] vetor = new int[7];
		int x;
		
		Random random = new Random();
		
		for(x = 0; x <= 6; x++) {
			
			vetor[x] = random.nextInt(10);
			
			System.out.println(vetor[x]);
			
		}

	}

}
