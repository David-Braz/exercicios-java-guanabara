package passo_H_vetores;

public class exercicio_71 {

	public static void main(String[] args) {

		/* 71) Faça um programa que preencha automaticamente um vetor numérico com 8 posições,
		 * conforme abaixo:
		 * 
		 * | 999 | 999 | 999 | 999 | 999 | 999 | 999 | 999 |
		 *    0     1     2     3     4     5     6     7
		 */
		
		int[] vetor = new int[8];
		int x;
		
		for(x = 0; x <=7; x++) {
			
			vetor[x] = 999;
			System.out.println(vetor[x]);
		}
		
	}

}
