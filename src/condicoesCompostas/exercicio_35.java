package condicoesCompostas;

import java.util.Scanner;

public class exercicio_35 {

	public static void main(String[] args) {
		
		/* 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços.
		 * O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo.
		 * Além disso, o cliente paga por Km percorrido.
		 * 
		 * Faça um programa que leia o tipo de carro alugado (popular ou luxo),
		 * quantos dias de aluguel e quantos Km foram percorridos.
		 * 
		 * No final mostre o preço a ser pago de acordo com a tabela a seguir:
		 * - Carros populares (aluguel de R$90 por dia)
		 * - Até 100Km percorridos: R$0,20 por Km
		 * - Acima de 100Km percorridos: R$0,10 por Km
		 * 
		 * - Carros de luxo (aluguel de R$150 por dia)
		 * - Até 200Km percorridos: R$0,30 por Km
		 * - Acima de 200Km percorridos: R$0,25 por Km
		 */
		
		

		double diasAlugado, kmPercorrido, dividaKm, dividaAluguel;
		int op;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Selecione o tipo de carro alugado:\n ");
		System.out.println("1. Carro popular\n2. Carro luxuoso\n");
		System.out.print("Digite o número da opção: ");
		
		op = scan.nextInt();
		
		System.out.print("Digite quantos dias ele foi alugado: ");
		diasAlugado = scan.nextDouble();
		
		System.out.print("Digite a quantidade de km percorrido: ");
		kmPercorrido = scan.nextDouble();
		
		switch(op) {
		
		case 1:
			System.out.println("=== Carro Popular ===");
			if(kmPercorrido <= 100.0) {
				dividaKm = kmPercorrido * 0.20;
				dividaAluguel = diasAlugado * 90.0;
				System.out.println("Valor total a pagar: " + (dividaKm + dividaAluguel));
			}
			else if(kmPercorrido > 100.0) {
				dividaKm = kmPercorrido * 0.10;
				dividaAluguel = diasAlugado * 90.0;
				System.out.println("Valor total a pagar: " + (dividaKm + dividaAluguel));
			}
			 break;
		case 2:
			System.out.println("\n=== Carro Luxuoso ===\n");
			if(kmPercorrido <= 200.0) {
				dividaKm = kmPercorrido * 0.30;
				dividaAluguel = diasAlugado * 150.0;
				System.out.println("Valor total a pagar: " + (dividaKm + dividaAluguel));
			}
			else if(kmPercorrido > 200.0) {
				dividaKm = kmPercorrido * 0.25;
				dividaAluguel = diasAlugado * 150.0;
				System.out.println("Valor total a pagar: R$" + (dividaKm + dividaAluguel));
			}
			 break;
		default:
			System.out.println("Opção inválida!");
		}
		
	}

}
