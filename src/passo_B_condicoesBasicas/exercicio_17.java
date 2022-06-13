package passo_B_condicoesBasicas;

import java.util.Scanner;

public class exercicio_17 {

	public static void main(String[] args) {
		
		/*17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 80Km/h,
		 * exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba o valor da multa,
		 * cobrando R$5 por cada Km acima da velocidade permitida.
		 */
		
		double velocidade, valorMulta;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a velocidade do carro? ");
		velocidade = scan.nextDouble();
		
		
		
		if(velocidade > 80.0) {
			
			valorMulta = ((velocidade - 80.0) * 5);
			System.out.println("Você foi multado!\nValor da multa: R$ " + valorMulta);
		}
		
	}

}
