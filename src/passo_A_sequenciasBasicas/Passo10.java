package passo_A_sequenciasBasicas;

import java.util.Scanner;

public class Passo10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double largura,altura,result,tinta;
        System.out.print("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.print("Digite a Altura: ");
        altura = sc.nextDouble();
        result = largura *  altura;
        tinta = result / 2;
        System.out.print("A Aréa é: " + result + "\n");
        System.out.print("Você vai precisar de: "+tinta + " Litros de tinta para pintar essa aréa!");

    }
}
