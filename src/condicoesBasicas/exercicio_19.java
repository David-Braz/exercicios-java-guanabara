package condicoesBasicas;

import java.util.Scanner;

public class exercicio_19 {

	public static void main(String[] args) {
		
		/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno,
		 * calcule a sua m�dia e mostre na tela. No final, analise a m�dia
		 * e mostre se o aluno teve ou n�o um bom aproveitamento (se ficou acima da m�dia 7.0)
		 */
		
		String nome;
		double nota1, nota2, media;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual � o seu nome? ");
		nome = scan.next();
		System.out.println("Qual foi sua primeira nota? ");
		nota1 = scan.nextDouble();
		System.out.println("Qual foi sua segunda nota? ");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 7.0) {
			System.out.println(nome + ", voc� teve um bom aproveitamento. Parab�ns!\nSua m�dia foi "+ media);
		}
		
		else {
			System.out.println(nome + ", infelizmente voc� n�o teve um bom aproveitamento.\nSua m�dia foi "+ media);
		}
	}

}
