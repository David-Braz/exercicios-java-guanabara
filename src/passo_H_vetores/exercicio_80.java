package passo_H_vetores;

import java.util.Random;

public class exercicio_80 {

	public static void main(String[] args) {

		/* 80) Fa�a um algoritmo que preencha um vetor de 30 posi��es
		 * com n�meros entre 1 e 15 sorteados pelo computador.
		 * Depois disso, pe�a para o usu�rio digitar um n�mero (chave)
		 * e seu programa deve mostrar em que posi��es essa chave foi encontrada.
		 * Mostre tamb�m quantas vezes a chave foi sorteada.
		 */
		
		int[] vetor = new int[30];
		int x, chave;
		
		Random rand = new Random();
		
		for(x = 0; x <= 29; x++) {
			
			vetor[x] = rand.nextInt(15) + 1;
			
		}
		
		
		
		
	}

}
