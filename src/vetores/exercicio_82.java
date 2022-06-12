package vetores;

import java.util.Scanner;

public class exercicio_82 {

	public static void main(String[] args) {

		/* 82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em um vetor.
		 * No final, mostre:
		 * 
		 * a) Qual é a média da turma
		 * b) Quantos alunos estão acima da média da turma
		 * c) Qual foi a maior nota digitada
		 * d) Em que posições a maior nota aparece
		 */
		
		double[] vetor = new double[10];
		double media, soma = 0, acimaDaMedia = 0, maiorNota = 0, posicaoMaiorNota = 0, cont = 0;
		int x;

		Scanner scan = new Scanner(System.in);
		
		for(x = 0; x <= 9; x++) {
			
			System.out.print("Digite a nota: ");
			vetor[x] = scan.nextDouble();
			soma += vetor[x];
			cont++;
			
		}
		
		media = soma/cont;
		
		for(x = 0; x <= 9; x++) {
			
			if(vetor[x] > media) {
				
				acimaDaMedia++;
			}
			
			if(vetor[x] > maiorNota) {
				
				maiorNota = vetor[x];
				posicaoMaiorNota = x;
				
			}
			
		}
		
		System.out.print("A média da turma: " + media);
		
		System.out.println("\nQuantidade de alunos acima da média: " + Math.round(posicaoMaiorNota));
		
		System.out.println("A maior nota digitada foi: " + maiorNota);
		
		System.out.println("A maior nota aparece na posição: " + Math.round(posicaoMaiorNota));
	}
	
}
