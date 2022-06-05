package repeticoesEnquanto;

import java.util.Random;

public class exercicio_50 {

	public static void main(String[] args) {

		/* 50) Desenvolva um programa que faça o sorteio de 20
		 * números entre 0 e 10 e mostre na tela:
		 * 
		 * a) Quais foram os números sorteados
		 * b) Quantos números estão acima de 5
		 * c) Quantos números são divisíveis por 3
		 */
		
		int x, r, acima5 = 0, div3 = 0;
		
		Random rand = new Random();
		
		System.out.println("Os números sorteados foram: ");
		
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
		
		System.out.println("\nNúmeros acima de 5: " + acima5);
		System.out.println("Números divisíveis por 3: " + div3);
		
	}

}
