package repeticoesEnquanto;

import java.util.ArrayList;
import java.util.List;

public class testeArray {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Uva");
		lista.add("Laranja");
		lista.add("Morango");
		lista.set(1, "Orange");
		
		
		System.out.println(lista.get(2));
		System.out.println(lista.isEmpty());
		System.out.println(lista.size());

	}

}
