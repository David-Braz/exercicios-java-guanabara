package condicoesBasicas;

import java.util.Scanner;

public class exercicio_25 {

	public static void main(String[] args) {
		
		/* 25) [DESAFIO] Crie um programa que leia o tamanho de tr�s segmentos de reta.
		 * Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas retas.
		 * Matematicamente, para tr�s segmentos formarem um tri�ngulo,
		 * o comprimento de cada lado deve ser menor que a soma dos outros dois.
		 */
		
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do segmento A: ");
		a = scan.nextInt();
		System.out.println("Digite o tamanho do segmento B: ");
		b = scan.nextInt();
		System.out.println("Digite o tamanho do segmento C: ");
		c = scan.nextInt();
		
		if(a+b > c && b+c > a && a+c > b) {
			System.out.println("Com os valores mencionados, d� pra fazer o tri�ngulo.");
		} 
		else {
			System.out.println("Infelizmente, com os valores mencionados, n�o d� pra fazer o tri�ngulo.");
		}
	}

}
