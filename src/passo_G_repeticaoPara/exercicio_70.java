package passo_G_repeticaoPara;

public class exercicio_70 {

	public static void main(String[] args) {

		/* 70) [DESAFIO] Faça um programa que mostre os 10 primeiros
		 * elementos da Sequência de Fibonacci:
		 * 
		 * 1 1 2 3 5 8 13 21...
		 */
		
		int x, f1 = 0, f2 = 1, fx = 0;
		
		for(x = 0; x <= 10; x++) {
			
			if(fx == 0) {
				fx = f1 + f2;
				System.out.print(fx + " ");
			}
			
			else {
				
				fx = f1 + f2;
				f1 = f2;
				f2 = fx;
				System.out.print(fx + " ");
				
			}

		}
		
	}

}
