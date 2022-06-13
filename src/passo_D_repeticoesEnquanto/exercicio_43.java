package passo_D_repeticoesEnquanto;

public class exercicio_43 {

	public static void main(String[] args) {

		/* 43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
		 * marcando os números que forem divisíveis por 4,
		 * exatamente como mostrado abaixo:
		 * 
		 * 30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
		 */
		
		int x;
		
		for(x = 30; x >= 1; x--) {
			
			if(x % 4 == 0) {
				
				System.out.print("[" + x + "] ");
				
			}
			
			else {
			
			System.out.print(x + " ");
			
			}
			
		}
		
	}

}
