package repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_48 {

	public static void main(String[] args) {
		
		/*48) Fa�a um programa que leia 7 n�meros inteiros
		 * e no final mostre o somat�rio entre eles.
		 */

		int x, num, soma = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 1; x <= 7; x++) {
			
			System.out.print("Digite um numero inteiro: ");
			num = scan.nextInt();
			
			soma += num;
		}
		
		System.out.println("A soma entre os n�meros acima � " + soma);
		
	}

}
