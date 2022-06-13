package passo_H_vetores;

public class exercicio_74 {

	public static void main(String[] args) {

		/* 74) Crie um programa que preencha automaticamente
		 * (usando lógica, não apenas atribuindo diretamente)
		 * um vetor numérico com 10 posições, conforme abaixo:
		 * 
		 * | 5 | 3 | 5 | 3 | 5 | 3 | 5 | 3 | 5 | 3 |
		 *   0   1   2   3   4   5   6   7   8   9
		 */
		
		int[] vetor = new int[10];
		int x;
		
		for(x = 0; x <= 9; x++) {
			
			if(vetor[0] == 0) {
				
				vetor[0] = 5;
			}
			
			else if(vetor[x - 1] == 5) {
				
				vetor[x] = 3;
			}
			
			else {
				
				vetor[x] = 5;
			}
			
			System.out.print(vetor[x] + " ");
		}
		
	}

}
