package condicoesCompostas;

import java.util.Scanner;

public class exercicio_28 {

	public static void main(String[] args) {

		/* 28) Faça um programa que leia a largura e o comprimento de um terreno retangular,
		 * calculando e mostrando a sua área em m².O programa também devemostrar
		 * a classificação desse terreno, de acordo com a lista abaixo:
		 * - Abaixo de 100m² = TERRENO POPULAR
		 * - Entre 100m² e 500m² = TERRENO MASTER
		 * - Acima de 500m² = TERRENO VIP
		 */
		
		int largura, comprimento, area;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a largura do terreno: ");
		largura = scan.nextInt();
		System.out.println("Digite o comprimento do terreno: ");
		comprimento = scan.nextInt();
		
		area = largura * comprimento;
		
		if(area < 100) {
			System.out.println("TERRENO POPULAR");
		}
		else if(area >= 100 && area <= 500) {
			System.out.println("TERRENO MASTER");
		}
		else if(area > 500) {
			System.out.println("TERRENO VIP");
		}
	}

}
