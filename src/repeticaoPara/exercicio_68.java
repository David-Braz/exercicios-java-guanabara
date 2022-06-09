package repeticaoPara;

import java.util.Scanner;

public class exercicio_68 {

	public static void main(String[] args) {

		/* 68) Crie um programa que leia sexo e peso de 8 pessoas,
		 * usando a estrutura “para”. No final, mostre na tela:
		 * 
		 * a) Quantas mulheres foram cadastradas
		 * b) Quantos homens pesam mais de 100Kg
		 * c) A média de peso entre as mulheres
		 * d) O maior peso entre os homens
		 */
		
		int x,contM = 0, contH = 0, soma = 0;
		double peso, maiorPesoH = 0.0, media;
		char sexo;
		
		Scanner scan = new Scanner(System.in);
		
		for(x = 1; x <= 8; x++) {
			
			System.out.print("Qual seu sexo? (H/M): ");
			sexo = scan.next().toUpperCase().charAt(0);
			
			if(sexo == 'H') {
				
				System.out.print("Agora digite seu peso: ");
				peso = scan.nextDouble();
				
				if(peso >= 100.0) {
					
					contH++;
					
				}
				
				if(peso > maiorPesoH) {
					
					maiorPesoH = peso;
				}
				
			}
			
			else {
				
				System.out.print("Agora digite seu peso: ");
				peso = scan.nextDouble();
				soma += peso;
				contM++;
			}
			
		}
		
		media = soma/contM;
		
		System.out.print("\n\nQuantidade de mulheres que foram cadastradas: " + contM);
		System.out.print("\nQuantidade de homens que pesam acima dos 100Kg: " + contH);
		System.out.print("\nA média de peso entre as mulheres: " + media);
		System.out.print("\nO maior peso entre os homens: " + maiorPesoH);
	}

}
