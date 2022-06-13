package passo_G_repeticaoPara;

import java.util.Scanner;

public class exercicio_67 {

	public static void main(String[] args) {

		/* 67) Faça um programa usando a estrutura “para” que leia um número inteiro positivo
		 * e mostre na tela uma contagem de 0 até o valor digitado:
		 * 
		 * Ex: Digite um valor: 9 Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int x, num;
		
		System.out.print("Digite um valor: ");
		num = scan.nextInt();
		
		for(x = 0; x <= num; x++) {
			
			System.out.print(x + " ");
		}
		
		System.out.println("FIM!");
		
	}

}
