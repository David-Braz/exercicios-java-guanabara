package repeticoesEnquanto;

public class exercicio_41 {

	public static void main(String[] args) {
		
		/* 41) Desenvolva um programa que mostre na tela a seguinte contagem:
		 * 
		 * 100 95 90 85 80 ... 0 Acabou!
		 */
		
		int x;
		
		for(x = 100; x >= 0; x = x - 5) {
			
			System.out.print(x + " ");
			
			if(x == 0) {
				
				System.out.println("Acabou!");
				
			}
		}
		
	}

}
