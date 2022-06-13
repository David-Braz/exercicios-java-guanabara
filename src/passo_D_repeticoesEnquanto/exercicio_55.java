package passo_D_repeticoesEnquanto;

import java.util.Random;
import java.util.Scanner;

public class exercicio_55 {

	public static void main(String[] args) {

		/* 55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32.
		 * A partir de agora, o computador vai sortear um número entre 1 e 10
		 * e o jogador vai ter 4 tentativas para tentar acertar.
		 */
		
		int numJogador, numSorteado, i = 0;
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("=== Descubra o Número Sorteado ===");
		System.out.println("\nNeste jogo você terá que adivinhar o número que iremos sortear! \n");
		System.out.println("Acabamos de sortear o número.\nAgora é com você!\n");
		
		
		while (i <= 4) {
			
			System.out.print("\nDigite aqui o seu número de 1 a 10: ");
			
			numJogador = scan.nextInt();
			numSorteado = random.nextInt(9)+1;
			
			System.out.println("\nNosso número sorteado foi: " + numSorteado);
			System.out.println("Você escolheu o número: " + numJogador);
			System.out.println("\n==============================================\n");
			
			if(numJogador == numSorteado) {
			
				System.out.println("\nQue legal! Você acertou!");
				i += 6;
			}
			
			else {
				
				System.out.println("\nInfelizmente você errou.");
				i++;
			}
			
		}
		
		System.out.println("\nFim do jogo!");

	}

}
