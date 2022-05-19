package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		
		/*13) Faça um algoritmo que leia o salário de um funcionário,
		 * calcule e mostre o seu novo salário, com 15% de aumento.*/
		
		double salario, novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o salário do funcionário para receber o aumento: ");
		salario = scan.nextDouble();
		
		novoSalario = salario+((15.0/100.0)*salario);
		
		System.out.println("O seu novo salário é: R$ " + novoSalario);
		
	}
}
