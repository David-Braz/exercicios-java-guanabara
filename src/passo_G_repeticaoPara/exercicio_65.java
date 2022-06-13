package passo_G_repeticaoPara;

public class exercicio_65 {

	public static void main(String[] args) {

		/* 65) Desenvolva um programa usando a estrutura “para”
		 * que mostre na tela a seguinte contagem:
		 * 
		 * 100 90 80 70 60 50 40 30 20 10 0 Acabou!
		 */
		
		int x;
		
		for(x = 100; x >= 0; x -= 10) {
			
			System.out.print(x + " ");
			
		}
		
		System.out.print("Acabou!");
	}

}
