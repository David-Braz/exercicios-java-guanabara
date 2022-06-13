package passo_D_repeticoesEnquanto;

import java.util.Random;
import java.util.Scanner;

public class exercicio_55 {

	public static void main(String[] args) {

		/* 55) [DESAFIO] Vamos melhorar o jogo que fizemos no exerc�cio 32.
		 * A partir de agora, o computador vai sortear um n�mero entre 1 e 10
		 * e o jogador vai ter 4 tentativas para tentar acertar.
		 */
		
		int numJogador, numSorteado, i = 0;
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("=== Descubra o N�mero Sorteado ===");
		System.out.println("\nNeste jogo voc� ter� que adivinhar o n�mero que iremos sortear! \n");
		System.out.println("Acabamos de sortear o n�mero.\nAgora � com voc�!\n");
		
		
		while (i <= 4) {
			
			System.out.print("\nDigite aqui o seu n�mero de 1 a 10: ");
			
			numJogador = scan.nextInt();
			numSorteado = random.nextInt(9)+1;
			
			System.out.println("\nNosso n�mero sorteado foi: " + numSorteado);
			System.out.println("Voc� escolheu o n�mero: " + numJogador);
			System.out.println("\n==============================================\n");
			
			if(numJogador == numSorteado) {
			
				System.out.println("\nQue legal! Voc� acertou!");
				i += 6;
			}
			
			else {
				
				System.out.println("\nInfelizmente voc� errou.");
				i++;
			}
			
		}
		
		System.out.println("\nFim do jogo!");

	}

}
