package condicoesCompostas;

import java.util.Random;
import java.util.Scanner;

public class exercicio_32 {

	public static void main(String[] args) {

		/* 32) [DESAFIO] Crie um jogo onde o computador
		 * vai sortear um n�mero entre 1 e 5
		 * o jogador vai tentar descobrir qual foi o valor sorteado.
		 */

		
		int numJogador, numSorteado, op;
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("=== Descubra o N�mero Sorteado ===");
		System.out.println("\nNeste jogo voc� ter� que adivinhar o n�mero que iremos sortear! \n");
		System.out.println("Acabamos de sortear o n�mero.\nAgora � com voc�!\n");
		System.out.print("Digite aqui o seu n�mero de 1 a 5: ");
		numJogador = scan.nextInt();
		numSorteado = random.nextInt(4)+1;
		System.out.println("\nNosso n�mero sorteado foi: " + numSorteado);
		System.out.println("Voc� escolheu o n�mero: " + numJogador);
		
		if(numJogador == numSorteado) {
		System.out.println("\nQue legal! Voc� acertou!");
		}
		else {
			System.out.println("\nInfelizmente voc� errou. Tente novamente!");
		}
		
	}

}
