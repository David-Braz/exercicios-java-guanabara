package repeticoesEnquanto;

import java.util.Random;

public class exercicio_50 {

	public static void main(String[] args) {

		/* 50) Desenvolva um programa que fa�a o sorteio de 20
		 * n�meros entre 0 e 10 e mostre na tela:
		 * 
		 * a) Quais foram os n�meros sorteados
		 * b) Quantos n�meros est�o acima de 5
		 * c) Quantos n�meros s�o divis�veis por 3
		 */
		
		int x, r, acima5 = 0, div3 = 0;
		
		Random rand = new Random();
		
		System.out.println("Os n�meros sorteados foram: ");
		
		for(x = 0; x <= 20; x++) {
			
			
			r = rand.nextInt(10);
			
			System.out.print(r + " ");
			
			if(r > 5) {
				
				acima5++;
				
			}
			
			else if(r % 3 == 0) {
				
				div3++;
			}
		
		}
		
		System.out.println("\nN�meros acima de 5: " + acima5);
		System.out.println("N�meros divis�veis por 3: " + div3);
		
	}

}
