package condicoesBasicas;

import java.util.Scanner;

public class exercicio_19 {

	public static void main(String[] args) {
		
		/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno,
		 * calcule a sua média e mostre na tela. No final, analise a média
		 * e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0)
		 */
		
		String nome;
		double nota1, nota2, media;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual é o seu nome? ");
		nome = scan.next();
		System.out.println("Qual foi sua primeira nota? ");
		nota1 = scan.nextDouble();
		System.out.println("Qual foi sua segunda nota? ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 7.0) {
			System.out.println(nome + ", você teve um bom aproveitamento. Parabéns!\nSua média foi "+ media);
		}
		
		else {
			System.out.println(nome + ", infelizmente você não teve um bom aproveitamento.\nSua média foi "+ media);
		}
	}

}
