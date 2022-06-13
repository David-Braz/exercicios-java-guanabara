package passo_D_repeticoesEnquanto;

public class exercicio_39 {

	public static void main(String[] args) {
		
		/* 39) Faça um algoritmo que mostre na tela a seguinte contagem:
		 * 
		 * 10 9 8 7 6 5 4 3 Acabou!
		 */
		
		int x;
		
		for(x = 10; x >= 3; x--) {
			
			System.out.print(x + " ");
		
			if(x == 3) {
				
				System.out.print("Acabou!");
				
			}
		}
		
	}

}
