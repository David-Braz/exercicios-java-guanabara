package enquantoFlag;

import java.util.Scanner;

public class exercicio_57 {

	public static void main(String[] args) {

		/* 57) Desenvolva um aplicativo que leia o sal�rio e o sexo de v�rios funcion�rios.
		 * No final, mostre o total de sal�rios pagos aos homens e o total pago �s mulheres.
		 * O programa vai perguntar ao usu�rio se ele quer continuar ou n�o sempre que ler os dados de um funcion�rio.
		 */
		
		double salario, totalH = 0.0, totalM = 0.0;
		char flag;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===== P R O G R A M A - I N I C I A L I Z A D O =====");

		do {
			
			System.out.print("\nSelecione o seu sexo:\n\nHomem ou Mulher (H/M): ");
			char op = scan.next().toUpperCase().charAt(0);
			
			switch(op) {
			
				case 'H':
					
					System.out.print("Digite o sal�rio: ");
					salario = scan.nextDouble();
					totalH += salario;
					break;
					
				case 'M':
					
					System.out.print("Digite o sal�rio: ");
					salario = scan.nextDouble();
					totalM += salario;
					break;
				
				default:
					
					System.out.println("Op��o inv�lida!");
					break;
			}
			
			System.out.print("Voc� deseja continuar? (S/N): ");
			flag = scan.next().toUpperCase().charAt(0);
		
			if(flag == 'S') {
				
				System.out.println("\n\n===== N O V O - C A D A S T R O =====\n");

			}
			
		} while(flag == 'S');
		
		System.out.println("\n\n===== R E S U L T A D O =====\n");
		System.out.println("Valor total da soma dos sal�rio dos Homens: R$ " + totalH);
		System.out.println("Valor total da soma dos sal�rio das Mulheres: R$ " + totalM);

	}

}
