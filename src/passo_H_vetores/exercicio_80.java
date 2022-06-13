package passo_H_vetores;

import java.util.Random;

public class exercicio_80 {

	public static void main(String[] args) {

		/* 80) Faça um algoritmo que preencha um vetor de 30 posições
		 * com números entre 1 e 15 sorteados pelo computador.
		 * Depois disso, peça para o usuário digitar um número (chave)
		 * e seu programa deve mostrar em que posições essa chave foi encontrada.
		 * Mostre também quantas vezes a chave foi sorteada.
		 */
		
		int[] vetor = new int[30];
		int x, chave;
		
		Random rand = new Random();
		
		for(x = 0; x <= 29; x++) {
			
			vetor[x] = rand.nextInt(15) + 1;
			
		}
		
		
		
		
	}

}
