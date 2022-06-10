package repeticaoPara;

import java.util.Scanner;

public class exercicio_69 {

	public static void main(String[] args) {

		/* 69) [DESAFIO] Desenvolva um programa que leia o primeiro termo
		 * e a razão de uma PA (Progressão Aritmética),
		 * mostrando na tela os 10 primeiros elementos da PA
		 * e a soma entre todos os valores da sequência.
		 */

		int x, a, r, soma = 0;	
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Digite o primeiro termo: ");
		a = scan.nextInt();
		
		System.out.println("Digite a razão: ");
		r = scan.nextInt();
		
		int pA = a;
		
		for(x = 0; x <= 10; x++) {
			
			if(pA == a) {
				
				System.out.print(pA + " ");
			}
			pA += r;
			soma += pA;
			System.out.print(pA + " ");
			
		}
		
		System.out.println("\nA soma é: " + (soma + r));
	}

}
