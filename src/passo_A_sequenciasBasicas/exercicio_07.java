package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {

		/*7) Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a sua ter�a parte.
		 * Ex:
		 * Digite um n�mero: 3.5
		 * O dobro de 3.5 � 7.0
		 * A ter�a parte de 3.5 � 1.16666
		 * */
		
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextFloat();
		
		System.out.println("O dobro de " + numero + " � " + (numero*2));
		System.out.println("A ter�a parte de " + numero + " � " + (numero/3));
	}

}
