package condicoesBasicas;

import java.util.Scanner;

public class exercicio_20 {

	public static void main(String[] args) {

		/* 20) Desenvolva um programa que leia um número inteiro
		 * e mostre se ele é PAR ou ÍMPAR.
		 */
		
		int numero;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Este número é par!");
		} else {
			System.out.println("Este número é impar!");
		}

	}

}
