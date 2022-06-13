package passo_G_repeticaoPara;

import java.util.Scanner;

public class exercicio_66 {

	public static void main(String[] args) {

		/* 66) Escreva um programa que leia um número qualquer
		 * e mostre a tabuada desse número, usando a estrutura “para”.
		 * 
		 * Ex: Digite um valor: 5 5 x 1 = 5 5 x 2 = 10 5 x 3 = 15 ...
		 */
		
		int x, num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o denominador: ");
		num = scan.nextInt();
		
		for(x = 1; x <= 10; x++) {
			
		
			System.out.println("5 x " + x + " = " + (5*x));
			
		}
		
	}

}
