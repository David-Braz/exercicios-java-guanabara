package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		
		/*11) Desenvolva uma lógica que leia os valores de A, B e C
		 * de uma equação do segundo grau e mostre o valor de Delta.*/
		
		float a, b, c, delta;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		a = scan.nextFloat();
		System.out.print("Digite o valor de B: ");
		b = scan.nextFloat();
		System.out.print("Digite o valor de C: ");
		c = scan.nextFloat();
		
		delta = (float) (Math.pow(b,2)-(4*a*c));
		
		System.out.println("O valor de delta é: "+ delta);
	}

}
