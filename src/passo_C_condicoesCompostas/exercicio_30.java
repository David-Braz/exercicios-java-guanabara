package passo_C_condicoesCompostas;

import java.util.Scanner;

public class exercicio_30 {

	public static void main(String[] args) {
		
		/* 30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso
		 * de mostrar que tipo de triângulo será formado:
		 * - EQUILÁTERO: todos os lados iguais
		 * - ISÓSCELES: dois lados iguais
		 * - ESCALENO: todos os lados diferentes
		 */
		
		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do segmento A: ");
		a = scan.nextInt();
		System.out.println("Digite o tamanho do segmento B: ");
		b = scan.nextInt();
		System.out.println("Digite o tamanho do segmento C: ");
		c = scan.nextInt();
		
		if(a == b && b == c) {
			System.out.println("EQUILÁTERO");
		}
		else if(a == b || b == c) {
			System.out.println("ISÓSCELES");
		}
		else if(a != b && b != c) {
			System.out.println("ESCALENO");
		}
	}

}
