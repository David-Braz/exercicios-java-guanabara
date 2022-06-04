package repeticoesEnquanto;

import java.util.Scanner;

public class exercicio_45 {

	public static void main(String[] args) {
		
		/* Crie um algoritmo que leia o valor inicial da contagem,
		 * o valor final e o incremento, mostrando em seguida todos os valores no intervalo:
		 * 
		 * Ex: Digite o primeiro Valor: 3
		 * Digite o último Valor: 10
		 * Digite o incremento: 2
		 * 
		 * Contagem: 3 5 7 9 Acabou!		 * 
		 * 
		 * 45) O programa acima vai ter um problema quando digitarmos
		 * o primeiro valor maior que o último.
		 * 
		 * Resolva esse problema com um código que funcione em qualquer situação.
		 */
		
		int x, y, z, cont;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
		y = scan.nextInt();
		System.out.print("Digite o valor final: ");
		z = scan.nextInt();
		System.out.print("Digite o valor do incremento: ");
		cont = scan.nextInt();
		
		if(y > z) {
		
			for(x = y; x <= z; x = x + cont) {
				
				System.out.print(x + " ");
			}
			
		}
		
		else if(y < z) {
			
			for(x = y; x >= z; x = x - cont) {
				
				System.out.print(x + " ");
				
			}	
			
		}
		
	}

}
