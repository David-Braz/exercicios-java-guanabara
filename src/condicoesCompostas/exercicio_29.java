package condicoesCompostas;

import java.util.Scanner;

public class exercicio_29 {

	public static void main(String[] args) {
		
		/* 29) Desenvolva um programa que leia o nome de um funcion�rio,
		 * seu sal�rio, quantos anos ele trabalha na empresa e mostre seu novo sal�rio,
		 * reajustado de acordo com a tabela a seguir:
		 * - At� 3 anos de empresa: aumento de 3%
		 * - entre 3 e 10 anos: aumento de 12.5%
		 * - 10 anos ou mais: aumento de 20%
		 */
		
		String nome;
		double salario, novoSalario;
		int anosEmpresa;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome do funcion�rio: ");
		nome = scan.next();
		System.out.println("Digite o sal�rio: ");
		salario = scan.nextDouble();
		System.out.println("Digite quantos anos de experi�ncia: ");
		anosEmpresa = scan.nextInt();
		
		if(anosEmpresa <= 3) {
			novoSalario = salario + ((3.0/100.0)*salario);
			System.out.println(nome +". Voc� teve um aumento de 3% no sal�rio.\nSeu novo sal�rio �: R$ " + novoSalario);
		}
		else if(anosEmpresa >= 3 && anosEmpresa <= 10) {
			novoSalario = salario + ((12.5/100.0)*salario);
			System.out.println(nome +". Voc� teve um aumento de 12.5% no sal�rio.\nSeu novo sal�rio �: R$ " + novoSalario);

		}
		else if(anosEmpresa >= 10) {
			novoSalario = salario + ((20.0/100.0)*salario);
			System.out.println(nome +". Voc� teve um aumento de 20% no sal�rio.\nSeu novo sal�rio �: R$ " + novoSalario);

		}
		
	}

}
