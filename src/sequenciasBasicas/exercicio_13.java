package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		
		/*13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio,
		 * calcule e mostre o seu novo sal�rio, com 15% de aumento.*/
		
		double salario, novoSalario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o sal�rio do funcion�rio para receber o aumento: ");
		salario = scan.nextDouble();
		
		novoSalario = salario+((15.0/100.0)*salario);
		
		System.out.println("O seu novo sal�rio �: R$ " + novoSalario);
		
	}
}
