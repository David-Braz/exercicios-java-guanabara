package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_10 {
	
	public static void main(String[] args) {
		
		/*10) Faça um algoritmo que leia a largura e altura de uma parede,
		 * calcule e mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
		 * sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
		 * */
		
		float largura, altura, area, quantidadeTintas;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a largura da parede? ");
		largura = scan.nextFloat();
		System.out.println("Qual a altura da parede? ");
		altura = scan.nextFloat();
		
		area = largura * altura;
		quantidadeTintas = area / 2;
		
		System.out.println("Você irá precisar de " + quantidadeTintas + "L de tinta.");

		
	}
}
