package passo_C_condicoesCompostas;

import java.util.Scanner;

public class exercicio_30 {

	public static void main(String[] args) {
		
		/* 30) [DESAFIO] Refa�a o algoritmo 25, acrescentando o recurso
		 * de mostrar que tipo de tri�ngulo ser� formado:
		 * - EQUIL�TERO: todos os lados iguais
		 * - IS�SCELES: dois lados iguais
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
			System.out.println("EQUIL�TERO");
		}
		else if(a == b || b == c) {
			System.out.println("IS�SCELES");
		}
		else if(a != b && b != c) {
			System.out.println("ESCALENO");
		}
	}

}
