package passo_D_repeticoesEnquanto;

public class exercicio_46 {

	public static void main(String[] args) {

		/* 46) Crie um programa que calcule e mostre na tela
		 * o resultado da soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
		 */
		
		int x, soma = 0;
		
		for(x = 6; x <= 100; x = x + 2) {
			
			soma += x;
			
			System.out.print(x + " ");
		
			if(x == 100) {
				
				System.out.println("\nA soma dos valores acima é de: " + soma);
				
			}
		}
		
	}

}
