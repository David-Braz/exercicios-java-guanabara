package condicoesBasicas;

import java.util.Scanner;

public class exercicio_20 {

	public static void main(String[] args) {

		/* 20) Desenvolva um programa que leia um n�mero inteiro
		 * e mostre se ele � PAR ou �MPAR.
		 */
		
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Este n�mero � par!");
		} else {
			System.out.println("Este n�mero � impar!");
		}

	}

}
