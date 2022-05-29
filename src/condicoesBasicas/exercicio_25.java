package condicoesBasicas;

import java.util.Scanner;

public class exercicio_25 {

	public static void main(String[] args) {
		
		/* 25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
		 * Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
		 * Matematicamente, para três segmentos formarem um triângulo,
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
			System.out.println("Com os valores mencionados, dá pra fazer o triângulo.");
		} 
		else {
			System.out.println("Infelizmente, com os valores mencionados, não dá pra fazer o triângulo.");
		}
	}

}
