package vetores;

public class exercicio_75 {

	public static void main(String[] args) {

		/* 75) Crie um programa que preencha automaticamente
		 * (usando lógica, não apenas atribuindo diretamente)
		 * um vetor numérico com 15 posições com os primeiros
		 * elementos da sequência de Fibonacci:
		 * 
		 * | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34 | 55 | 89 | 144 | 233 | 377 | 610 | 987 |
		 *   0   1   2   3   4   5   6    7    8    9    10    11    12    13    14    15
		 */
		
		int[] vetor = new int[16];
		int x, f1 = 0, f2 = 1;
		
		for(x = 0; x <= 15; x++) {
			
			if(vetor[0] == 0) {
				
				vetor[x] = f1 + f2;
				
				System.out.print(vetor[x] + " ");
				
			}
			
			else {
				
				vetor[x] = f1 + f2;
				
				System.out.print(vetor[x] + " ");
				
				f1 = f2;
				
				f2 = vetor[x];
			}
			
		}
		
	}

}
