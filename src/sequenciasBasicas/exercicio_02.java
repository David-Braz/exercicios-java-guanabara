package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_02 {
	
	public static void main(String[] args) {
		
		/* 2) Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
		 * Ex:
		 * Qual � o seu nome? Jo�o da Silva
		 * Ol� Jo�o da Silva, � um prazer te conhecer! */
		
		String nome;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual � o seu nome? ");
		nome = leia.next();
		
		System.out.println("Ol�, " + nome + ", � um prazer te conhecer!");
		
	}
}
