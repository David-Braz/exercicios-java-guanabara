package condicoesBasicas;

import java.util.Scanner;

public class exercicio_18 {

	public static void main(String[] args) {
		
		/*18) Fa�a um programa que leia o ano de nascimento de uma pessoa,
		 * calcule a idade dela e depois mostre se ela pode ou n�o votar.
		 */
		
		int anoNascimento, idade;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o ano que voc� nasceu? (AAAA)");
		anoNascimento = scan.nextInt();
		
		idade = 2022 - anoNascimento;
		
		if(idade >= 18) {
			System.out.println("Voc� pode votar!");
		} else {
			System.out.println("Infelizmente voc� n�o pode votar.");
		}

	}

}
