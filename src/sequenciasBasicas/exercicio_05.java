package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {

		/*5) Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre na tela a sua m�dia na disciplina.
		 * Ex:
		 * Nota 1: 4.5
		 * Nota 2: 8.5
		 * A m�dia entre 4.5 e 8.5 � igual a 6.5
		 */
		
		float nota1, nota2, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.print("Nota 2: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("A m�dia entre " + nota1 + " e " + nota2 + " � igual a " + media);
		
	}

}
