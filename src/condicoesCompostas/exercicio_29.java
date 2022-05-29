package condicoesCompostas;

import java.util.Scanner;

public class exercicio_29 {

	public static void main(String[] args) {
		
		/* 29) Desenvolva um programa que leia o nome de um funcionário,
		 * seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário,
		 * reajustado de acordo com a tabela a seguir:
		 * - Até 3 anos de empresa: aumento de 3%
		 * - entre 3 e 10 anos: aumento de 12.5%
		 * - 10 anos ou mais: aumento de 20%
		 */
		
		String nome;
		double salario, novoSalario;
		int anosEmpresa;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome do funcionário: ");
		nome = scan.next();
		System.out.println("Digite o salário: ");
		salario = scan.nextDouble();
		System.out.println("Digite quantos anos de experiência: ");
		anosEmpresa = scan.nextInt();
		
		if(anosEmpresa <= 3) {
			novoSalario = salario + ((3.0/100.0)*salario);
			System.out.println(nome +". Você teve um aumento de 3% no salário.\nSeu novo salário é: R$ " + novoSalario);
		}
		else if(anosEmpresa >= 3 && anosEmpresa <= 10) {
			novoSalario = salario + ((12.5/100.0)*salario);
			System.out.println(nome +". Você teve um aumento de 12.5% no salário.\nSeu novo salário é: R$ " + novoSalario);

		}
		else if(anosEmpresa >= 10) {
			novoSalario = salario + ((20.0/100.0)*salario);
			System.out.println(nome +". Você teve um aumento de 20% no salário.\nSeu novo salário é: R$ " + novoSalario);

		}
		
	}

}
