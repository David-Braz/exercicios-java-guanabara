package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {

		/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
		 * Ex:
		 * Digite um número: 9
		 * O antecessor de 9 é 8
		 * O sucessor de 9 é 10 
		 */
		
		int x;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um número: ");
		x = leia.nextInt();
		
		System.out.println("O antecessor de " + x + " é " + (x-1));
		System.out.println("O sucessor de " + x + " é " + (x+1));
		
	}

}
