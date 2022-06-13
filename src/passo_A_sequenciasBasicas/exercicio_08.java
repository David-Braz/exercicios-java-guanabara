package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class exercicio_08 {
	
	public static void main(String[] args) {
		
		/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores relativos em outras medidas.
		 * Ex:
		 * Digite uma distância em metros: 185.72
		 * A distância de 85.7m corresponde a:
		 * 0.18572Km
		 * 1.8572Hm
		 * 18.572Dam
		 * 1857.2dm
		 * 18572.0cm
		 * 185720.0mm 
		 */
		
		double m, km, hm, dam, dm, cm, mm ;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma distância em metros: ");
		m = leia.nextDouble();
		
		dam = m/10;
		hm = dam/10;
		km = hm/10;
		dm = m*10;
		cm = dm*10;
		mm = cm*10;
		
		System.out.println("A distância de " + m + "m, corresponde a: ");
		System.out.println(km + "Km\n" + hm + "Hm\n" + dam + "Dam\n" + dm + "dm\n" + cm + "cm\n" + mm + "mm");
		
	}
}
