package passo_C_condicoesCompostas;

import java.util.Random;
import java.util.Scanner;

public class exercicio_31 {

	public static void main(String[] args) {

		
		// 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
		
		int maquina = 0, op;
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("=== Bora jogar JoKenPo? ===  ");
		System.out.println("Escolha uma das op��es abaixo:");
		System.out.println("\n1. Pedra\n2. Papel\n3. Tesoura\n");
		System.out.print("Qual voc� deseja escolher? Digite aqui: ");
		op = scan.nextInt();
		System.out.println("\n================================\n");
		
		switch(op) {
		
		case 1:
			maquina = random.nextInt(2) + 1;
			System.out.println("Hummmmmm, eu jogo " + maquina);
			if(maquina == 1) {
				System.out.println("Pedra com Pedra n�o d� em nada :/, vamos jogar novamente!");
			}
			else if(maquina == 2) {
				System.out.println("Papel enrola Pedra, sabia? GANHEI!");
			}
			else if(maquina == 3) {
				System.out.println("Pedra quebra tesoura! Voc� GANHOU!");
			}
			break;
		case 2:
			maquina = random.nextInt(2) + 1;
			System.out.println("Hummmmmm, eu jogo " + maquina);
			if(maquina == 2) {
				System.out.println("Nossa, voc� jogou o mesmo que eu?\nPapel com Papel n�o combina! Jogue novamente ...");
			}
			else if(maquina == 1) {
				System.out.println("Ah na�aao, seu Papel enrola minha Pedra! Voc� ganhou!");
			}
			else if(maquina == 3) {
				System.out.println("Eita, minha Tesoura corta seu Papel. GANHEI! Tente novamente ...");
			}
			break;
		case 3:
			maquina = random.nextInt(2) + 1;
			System.out.println("Hummmmmm, eu jogo " + maquina);
			if(maquina == 3) {
				System.out.println("Tesoura com Tesoura? N�o d� em nada! Tente novamente ...");
			}
			else if(maquina == 1) {
				System.out.println("Minha Pedra quebrou sua Tesoura! GANHEI! Tente novamente ...");
			}
			else if(maquina == 2) {
				System.out.println("Ah n�o, voc� cortou meu Papel com sua Tesoura! Voc� GANHOU!");
			}
			break;
		default:
			System.out.println("\nEssa op��o n�o existe,por favor, tente novamente com uma op��o existente.");
			break;
		}
		
	}

}
