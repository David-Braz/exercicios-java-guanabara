package condicoesCompostas;

import java.util.Random;
import java.util.Scanner;

public class exercicio_32 {

	public static void main(String[] args) {

		/* 32) [DESAFIO] Crie um jogo onde o computador
		 * vai sortear um número entre 1 e 5
		 * o jogador vai tentar descobrir qual foi o valor sorteado.
		 */

		
		int numJogador, numSorteado, op;
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("=== Descubra o Número Sorteado ===");
		System.out.println("\nNeste jogo você terá que adivinhar o número que iremos sortear! \n");
		System.out.println("Acabamos de sortear o número.\nAgora é com você!\n");
		System.out.print("Digite aqui o seu número de 1 a 5: ");
		numJogador = scan.nextInt();
		numSorteado = random.nextInt(4)+1;
		System.out.println("\nNosso número sorteado foi: " + numSorteado);
		System.out.println("Você escolheu o número: " + numJogador);
		
		if(numJogador == numSorteado) {
		System.out.println("\nQue legal! Você acertou!");
		}
		else {
			System.out.println("\nInfelizmente você errou. Tente novamente!");
		}
		
	}

}
