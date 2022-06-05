package repeticoesEnquanto;

public class exercicio_47 {

	public static void main(String[] args) {

		/*47) Desenvolva um aplicativo que mostre na tela o resultado da expressão
		 * 
		 * 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
		 */
		
		int x, soma = 0;
		
		for(x = 500; x >= 0; x = x - 50) {
			
			soma += x;
			System.out.print(x + " ");
			
		}
		
		System.out.println("\nO resultado da soma acima é: " + soma);

	}

}
