package condicoesCompostas;

import java.util.Scanner;

public class exercicio_34 {

	public static void main(String[] args) {
		
		/* 34) O �ndice de Massa Corp�rea (IMC) � um valor calculado
		 * baseado na altura e no peso de uma pessoa.
		 * De acordo com o valor do IMC, podemos classificar
		 * o indiv�duo dentro de certas faixas.
		 * 
		 * - abaixo de 18.5: Abaixo do peso
		 * - entre 18.5 e 25: Peso ideal
		 * - entre 25 e 30: Sobrepeso
		 * - entre 30 e 40: Obesidade
		 * - acima de 40: Obseidade m�rbida
		 * 
		 * Obs: O IMC � calculado pela express�o peso/altura� (peso dividido pelo quadrado da altura)
		 */
		
		float peso, altura, imc, ftImc;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== CALCULADORA DE IMC ===");
		System.out.println("\nDigite sua altura: ");
		altura = scan.nextFloat();
		System.out.println("Digite seu peso: ");
		peso = scan.nextFloat();
		
		imc = (float) (peso/(Math.pow(altura, 2.0)));
		ftImc = (float) (Math.round(imc*100.0)/100.0);
		
		System.out.println("Seu IMC � de: " + ftImc );
		
		if(ftImc < 18.5) {
			System.out.println("Voc� est� abaixo do peso!");
		}
		else if(ftImc >= 18.5 && ftImc <= 25.0) {
			System.out.println("Este � seu peso ideal! Parab�ns!");
		}
		else if(ftImc >= 25.0 && ftImc <= 30.0) {
			System.out.println("Voc� est� com sobrepeso!");
		}
		else if(ftImc >= 30.0 && ftImc <= 40.0) {
			System.out.println("Voc� est� com obesidade!");
		}
		else if(ftImc > 40.0) {
			System.out.println("Voc~e est� com obesidade m�rbida!");
		}
	}

}
