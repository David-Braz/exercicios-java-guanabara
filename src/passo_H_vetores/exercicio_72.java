package passo_H_vetores;

public class exercicio_72 {

	public static void main(String[] args) {

		/* 72) Crie um programa que preencha automaticamente
		 * (usando lógica, não apenas atribuindo diretamente)
		 * um vetor numérico com 10 posições, conforme abaixo:
		 * 
		 * | 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |
		 *   0    1    2    3   4     5    6    7    8    9
		 */
		
		int[] vetor = new int[10];
		int x;
		
		for(x = 0; x <= 9; x++) {
			
			if(vetor[x] == vetor[0]) {
				vetor[x] = 5;
				System.out.println(vetor[x]);
				
			}
			
			else {
				
				vetor[x] = vetor[x-1] + 5;
				System.out.println(vetor[x]);
				
			}

			
		}
	}

}
