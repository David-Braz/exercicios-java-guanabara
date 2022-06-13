package passo_D_repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_54 {

	public static void main(String[] args) {

		/* 54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
		 * 
		 * a) Qual foi a média de altura do grupo
		 * b) Quantas pessoas pesam mais de 90Kg
		 * c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
		 * d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
		 */
		
		double peso, altura, mediaAltura, totalAltura = 0.0;
		int contPesoAcimaNoventa = 0, contPesoMenosCinquenta = 0, contPesoAcimaCem = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int x = 0; x <= 6; x++) {
			
			System.out.println("Pessoa " + (x+1));
			System.out.print("\n\nQual é o seu Peso?\nDigite aqui: ");
			peso = scan.nextDouble();
			System.out.print("\nQual sua Altura?\nDigite aqui: ");
			altura = scan.nextDouble();
			System.out.println("\n===============================\n");
			totalAltura += altura;
			
			if(peso > 90.0) {
				
				contPesoAcimaNoventa++;
				
				if(altura > 190.0 && peso > 100.0) {
					
					contPesoAcimaCem++;
				}
				
			}
			
			else if(peso < 50.0 && altura < 190.0) {
				
				contPesoMenosCinquenta++;
			}
			
		}
		
		mediaAltura = totalAltura/7;
		System.out.println("\n========== R E S U L T A D O =========\n");
		System.out.println("Altura média do grupo: " + mediaAltura + "m");
		System.out.println("Quantidade de pessoas que pesam mais de 90Kg: " + contPesoAcimaNoventa);
		System.out.println("Quantidade de pessoas que pesam menos de 50Kg e tem menos de 1.60m: " + contPesoMenosCinquenta);
		System.out.println("Quantidade de pessoas que medem mais de 1.90m e pesam mais de 100Kg: " + contPesoAcimaCem);
		
	}

}
