package vetores;

public class exercicio_73 {

	public static void main(String[] args) {

		/* 73) Crie um programa que preencha automaticamente
		 * (usando lógica, não apena atribuindo diretamente)
		 * um vetor numérico com 10 posições, conforme abaixo:
		 * 
		 * | 9 | 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
		 *   0   1   2   3   4   5   6   7   8   9
		 */
		
		int[] vetor = new int[10];
		int x;
		
		for(x = 9; x >= 0; x--) {
			
			vetor[x] = x;
			System.out.println(vetor[x] + " ");
		}
		
	}

}
