package repeticoesFacaEnquanto;

public class exercicio_61 {

	public static void main(String[] args) {

		/* 61) Crie um programa que mostre na tela a seguinte contagem,
		 * usando a estrutura “faça enquanto”:
		 * 
		 * 0 3 6 9 12 15 18 21 24 27 30 Acabou!
		 */
		
		int x = 0;
				 
		do {
			
			System.out.print(x + " ");
			x += 3;
			
		} while(x <= 30);
		
		System.out.println("Acabou!");
	}

}
