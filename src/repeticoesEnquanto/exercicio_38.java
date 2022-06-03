package repeticoesEnquanto;

public class exercicio_38 {

	public static void main(String[] args) {

		/* 38) Escreva um programa que mostre na tela a seguinte contagem 
		 * 
		 * 6 7 8 9 10 11 Acabou!
		 */
		
		int x;
		
		for(x = 6; x <= 11; x++) {
			
			System.out.print(x + " ");
			
			if(x == 11) {
				
				System.out.println("Acabou!");
			}
		}

	}

}
