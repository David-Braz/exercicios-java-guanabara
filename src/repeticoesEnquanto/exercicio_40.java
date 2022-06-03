package repeticoesEnquanto;

public class exercicio_40 {

	public static void main(String[] args) {

		/* 40) Crie um aplicativo que mostre na tela a seguinte contagem:
		 * 
		 * 0 3 6 9 12 15 18 Acabou!
		 */

		int x = 0;
		
		for(x = 0; x <= 18; x=x+3) {
			
			System.out.print(x + " ");
			
			if(x == 18) {
				
				System.out.println("Acabou!");

			}
		}
		
	}

}
