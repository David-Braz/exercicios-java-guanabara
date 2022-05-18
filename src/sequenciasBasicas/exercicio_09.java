package sequenciasBasicas;

import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
		
		/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
		 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
		 */
		
		double dolar = 3.45, real, valorTroca ;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor que você tem na carteira: ");
		real = scan.nextDouble();
		
		valorTroca = real * dolar;
		
		System.out.println("Você pode trocar por US$" + valorTroca + " com o valor que tem em sua carteira.");

	}

}
