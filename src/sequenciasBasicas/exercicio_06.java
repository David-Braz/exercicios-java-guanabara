package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {

		/*6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu sucessor.
		 * Ex:
		 * Digite um n�mero: 9
		 * O antecessor de 9 � 8
		 * O sucessor de 9 � 10 
		 */
		
		int x;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		x = leia.nextInt();
		
		System.out.println("O antecessor de " + x + " � " + (x-1));
		System.out.println("O sucessor de " + x + " � " + (x+1));
		
	}

}
