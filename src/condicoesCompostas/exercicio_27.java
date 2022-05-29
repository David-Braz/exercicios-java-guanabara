package condicoesCompostas;

import java.util.Scanner;

public class exercicio_27 {

	public static void main(String[] args) {

		/* 27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
		 * mostrando uma mensagem no final, de acordo com a média atingida:
		 * - Média até 4.9: REPROVADO
		 * - Média entre 5.0 e 6.9: RECUPERAÇÃO
		 * - Média 7.0 ou superior: APROVADO
		 */
		
		double notaA, notaB, media;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe sua primeira nota: ");
		notaA = scan.nextDouble();
		System.out.println("Informe sua segunda nota: ");
		notaB = scan.nextDouble();
		
		media = (notaA + notaB) / 2;
		
		if(media <= 4.9) {
			System.out.println("REPROVADO");
		}
		else if(media >= 5.0 && media <= 6.9) {
			System.out.println("RECUPERAÇÃO");
		}
		else if(media >= 7.0) {
			System.out.println("APROVADO");
		}
			
	}

}
