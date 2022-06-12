package vetores;

import java.util.Scanner;

public class exercicio_82 {

	public static void main(String[] args) {

		/* 82) Fa�a um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em um vetor.
		 * No final, mostre:
		 * 
		 * a) Qual � a m�dia da turma
		 * b) Quantos alunos est�o acima da m�dia da turma
		 * c) Qual foi a maior nota digitada
		 * d) Em que posi��es a maior nota aparece
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
		
		System.out.print("A m�dia da turma: " + media);
		
		System.out.println("\nQuantidade de alunos acima da m�dia: " + Math.round(posicaoMaiorNota));
		
		System.out.println("A maior nota digitada foi: " + maiorNota);
		
		System.out.println("A maior nota aparece na posi��o: " + Math.round(posicaoMaiorNota));
	}
	
}
