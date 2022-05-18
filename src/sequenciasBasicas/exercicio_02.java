package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_02 {
	
	public static void main(String[] args) {
		
		/* 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
		 * Ex:
		 * Qual é o seu nome? João da Silva
		 * Olá João da Silva, é um prazer te conhecer! */
		
		String nome;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual é o seu nome? ");
		nome = leia.next();
		
		System.out.println("Olá, " + nome + ", é um prazer te conhecer!");
		
	}
}
