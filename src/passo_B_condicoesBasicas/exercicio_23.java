package passo_B_condicoesBasicas;

import java.util.Scanner;

public class exercicio_23 {

	public static void main(String[] args) {

		/* 23) Numa promoção exclusiva para o Dia da Mulher,
		 * uma loja quer dar descontos para todos, mas especialmente para mulheres.
		 * 
		 * Faça um programa que leia nome, sexo e o valor das compras do cliente
		 * e calcule o preço com desconto. Sabendo que:
		 * 
		 * - Homens ganham 5% de desconto
		 * - Mulheres ganham 13% de descont
		 */
		
		
		String nome;
		int op;
		double valor, valorDesconto;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Qual seu nome? ");
		nome = scan.next();
		
		System.out.println("Qual o valor das compras? ");
		valor = scan.nextDouble();
		
		System.out.println("Qual genero você se identifica abaixo:\n\n1. Mulher\n2. Homem\n\nDigite o número escolhido: ");
		op = scan.nextInt();
		
		switch(op) {
		
		case 1:
			valorDesconto = valor-((13.0/100.0)*valor);
			System.out.println(nome + "! Você ganhou 13% de desconto!\nDe R$ " + valor + " por R$ " + valorDesconto);
			break;
		case 2:
			valorDesconto = valor-((5.0/100.0)*valor);
			System.out.println(nome +"! Você ganhou 5% de desconto!\nDe R$ " + valor + " por R$ " + valorDesconto);
			break;
		default:
			System.out.println("Não há essa opção no menu!");
			break;
		}		
		
	}

}
