package repeticaoPara;

public class exercicio_64 {

	public static void main(String[] args) {

		/* 64) Desenvolva um programa usando a estrutura “para”
		 * que mostre na tela a seguinte contagem:
		 * 
		 * 0 5 10 15 20 25 30 35 40 Acabou!
		 */
		
		int x = 0;
		
		for(x = 0; x <= 40; x++) {
			
			System.out.print(x + " ");
			
			x += 4;
			
		}
		
		System.out.print("Acabou!");
	}

}
