package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class exercicio_04 {
	
	public static void main(String[] args) {
		
		/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
		 * Ex:
		 * Digite um valor: 8
		 * Digite outro valor: 5
		 * A soma entre 8 e 5 é igual a 13.
		 */
		
		int x, y, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		x = leia.nextInt();
		System.out.print("Digite outro valor: ");
		y = leia.nextInt();
		
		soma = x + y;
		
		System.out.println("A soma entre " + x + " e " + y + " é igual a " + soma + ".");
		
	}
}
