package condicoesCompostas;

import java.util.Scanner;

public class exercicio_36 {

	public static void main(String[] args) {
		
		/* 36) Um programa de vida saudável quer dar pontos atividades físicas
		 * que podem ser trocados por dinheiro. O sistema funciona assim:
		 * 
		 * - Cada hora de atividade física no mês vale pontos
		 * - até 10h de atividade no mês: ganha 2 pontos por hora
		 * - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
		 * - acima de 20h de atividade no mês: ganha 10 pontos por hora
		 * - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
		 * 
		 * Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
		 * calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
		 */	
		
		double horas, pontos, faturamento;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a quantidade de horas de atividade física: ");
		horas = scan.nextDouble();
		
		faturamento = horas * 0.05;
		
		if(horas <= 10.0) {
			pontos = horas * 2.0;
			System.out.println("Você obteve " + Math.round(pontos) + " pontos");
			System.out.println("e conseguiu faturar  R$ " + faturamento + ".");	
		}
		else if(horas >= 10.0 && horas <= 20.0) {
			pontos = horas * 5.0;
			System.out.println("Você obteve " + Math.round(pontos) + " pontos");
			System.out.println("e conseguiu faturar  R$ " + faturamento + ".");	
		}
		else if(horas > 20.0) {
			pontos = horas * 10.0;
			System.out.println("Você obteve " + Math.round(pontos) + " pontos");
			System.out.println("e conseguiu faturar  R$ " + faturamento + ".");
		}
	}

}
