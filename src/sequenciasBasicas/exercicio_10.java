package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_10 {
	
	public static void main(String[] args) {
		
		/*10) Fa�a um algoritmo que leia a largura e altura de uma parede,
		 * calcule e mostre a �rea a ser pintada e a quantidade de tinta necess�ria para o servi�o,
		 * sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados.
		 * */
		
		float largura, altura, area, quantidadeTintas;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a largura da parede? ");
		largura = scan.nextFloat();
		System.out.println("Qual a altura da parede? ");
		altura = scan.nextFloat();
		
		area = largura * altura;
		quantidadeTintas = area / 2;
		
		System.out.println("Voc� ir� precisar de " + quantidadeTintas + "L de tinta.");

		
	}
}
