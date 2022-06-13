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
		System.out.println("Escolha uma das opções abaixo:");
		System.out.println("\n1. Pedra\n2. Papel\n3. Tesoura\n");
		System.out.print("Qual você deseja escolher? Digite aqui: ");
		op = scan.nextInt();
		System.out.println("\n================================\n");
		
		switch(op) {
		
		case 1:
			maquina = random.nextInt(2) + 1;
			System.out.println("Hummmmmm, eu jogo " + maquina);
			if(maquina == 1) {
				System.out.println("Pedra com Pedra não dá em nada :/, vamos jogar novamente!");
			}
			else if(maquina == 2) {
				System.out.println("Papel enrola Pedra, sabia? GANHEI!");
			}
			else if(maquina == 3) {
				System.out.println("Pedra quebra tesoura! Você GANHOU!");
			}
			break;
		case 2:
			maquina = random.nextInt(2) + 1;
			System.out.println("Hummmmmm, eu jogo " + maquina);
			if(maquina == 2) {
				System.out.println("Nossa, você jogou o mesmo que eu?\nPapel com Papel não combina! Jogue novamente ...");
			}
			else if(maquina == 1) {
				System.out.println("Ah naãaao, seu Papel enrola minha Pedra! Você ganhou!");
			}
			else if(maquina == 3) {
				System.out.println("Eita, minha Tesoura corta seu Papel. GANHEI! Tente novamente ...");
			}
			break;
		case 3:
			maquina = random.nextInt(2) + 1;
			System.out.println("Hummmmmm, eu jogo " + maquina);
			if(maquina == 3) {
				System.out.println("Tesoura com Tesoura? Não dá em nada! Tente novamente ...");
			}
			else if(maquina == 1) {
				System.out.println("Minha Pedra quebrou sua Tesoura! GANHEI! Tente novamente ...");
			}
			else if(maquina == 2) {
				System.out.println("Ah não, você cortou meu Papel com sua Tesoura! Você GANHOU!");
			}
			break;
		default:
			System.out.println("\nEssa opção não existe,por favor, tente novamente com uma opção existente.");
			break;
		}
		
	}

}
